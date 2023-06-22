package net.lepidodendron.util;

import net.lepidodendron.block.BlockSorterFossil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.IHopper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import javax.annotation.Nullable;

public class FossilSorterHooks
{
    /**
     * Copied from TileEntityHopper#captureDroppedItems and added capability support
     * @return Null if we did nothing {no IItemHandler}, True if we moved an item, False if we moved no items
     */
    @Nullable
    public static Boolean extractHook(IHopper dest)
    {
        Pair<IItemHandler, Object> itemHandlerResult = getItemHandler(dest, EnumFacing.UP);
        if (itemHandlerResult == null)
            return null;

        IItemHandler handler = itemHandlerResult.getKey();

        for (int i = 0; i < handler.getSlots(); i++)
        {
            ItemStack extractItem = handler.extractItem(i, 1, true);
            if (!extractItem.isEmpty())
            {
                for (int j = 0; j < dest.getSizeInventory(); j++)
                {
                    ItemStack destStack = dest.getStackInSlot(j);
                    if (dest.isItemValidForSlot(j, extractItem) && (destStack.isEmpty() || destStack.getCount() < destStack.getMaxStackSize() && destStack.getCount() < dest.getInventoryStackLimit() && ItemHandlerHelper.canItemStacksStack(extractItem, destStack)))
                    {
                        extractItem = handler.extractItem(i, 1, false);
                        if (destStack.isEmpty())
                            dest.setInventorySlotContents(j, extractItem);
                        else
                        {
                            destStack.grow(1);
                            dest.setInventorySlotContents(j, destStack);
                        }
                        dest.markDirty();
                        return true;
                    }
                }
            }
        }

        return false;
    }


    /**
     * Copied from TileEntityHopper#transferItemsOut and added capability support
     */
    public static boolean insertHook(BlockSorterFossil.TileEntitySorterFossil hopper)
    {
        EnumFacing hopperFacing = BlockHopper.getFacing(hopper.getBlockMetadata());
        Pair<IItemHandler, Object> destinationResultFront = getItemHandler(hopper, hopperFacing);
        Pair<IItemHandler, Object> destinationResultBack = getItemHandler(hopper, hopperFacing.rotateY().rotateY());
        Pair<IItemHandler, Object> destinationResultLeft = getItemHandler(hopper, hopperFacing.getOpposite().rotateY());
        Pair<IItemHandler, Object> destinationResultRight = getItemHandler(hopper, hopperFacing.rotateY());
        Pair<IItemHandler, Object> destinationResultDown = getItemHandler(hopper, EnumFacing.DOWN);
        boolean frontStop = false;
        boolean backStop = false;
        boolean leftStop = false;
        boolean rightStop = false;
        boolean downStop = false;
        boolean returnResult = false;

        if (destinationResultFront != null){
            IItemHandler itemHandler = destinationResultFront.getKey();
            Object destination = destinationResultFront.getValue();
            if (isFull(itemHandler))
            {
                frontStop = true;
            }
            else
            {
                for (int i = 0; i < hopper.getSizeInventory() && !frontStop; ++i)
                {

                    if (!hopper.getStackInSlot(i).isEmpty() ) {
                        if (hopper.getStackInSlot(i).hasTagCompound()) {
                            if (hopper.getStackInSlot(i).getTagCompound().hasKey("PFMob")) {
                                NBTTagCompound blockNBT = (NBTTagCompound) hopper.getStackInSlot(i).getTagCompound().getTag("PFMob");
                                String resourcelocation = (blockNBT.getString("id"));
                                //Is this an arthropod though?
                                Class<? extends Entity> entityClass;
                                EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(resourcelocation));
                                EntityLiving entity = (EntityLiving) ee.newInstance(hopper.getWorld());
                                boolean isArthropod = entity.getCreatureAttribute() == EnumCreatureAttribute.ARTHROPOD;
                                if (entity != null) {
                                    entity.setDead();
                                }
                                if (!isArthropod) {
                                    ItemStack originalSlotContents = hopper.getStackInSlot(i).copy();
                                    ItemStack insertStack = hopper.decrStackSize(i, 1);
                                    ItemStack remainder = putStackInInventoryAllSlots(hopper, destination, itemHandler, insertStack);

                                    if (remainder.isEmpty()) {
                                        returnResult = true;
                                        frontStop = true;
                                    } else {
                                        hopper.setInventorySlotContents(i, originalSlotContents);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (destinationResultBack != null){
            IItemHandler itemHandler = destinationResultBack.getKey();
            Object destination = destinationResultBack.getValue();
            if (isFull(itemHandler))
            {
                backStop = true;
            }
            else
            {
                for (int i = 0; i < hopper.getSizeInventory() && !backStop; ++i)
                {

                    if (!hopper.getStackInSlot(i).isEmpty() ) {
                        if (hopper.getStackInSlot(i).hasTagCompound()) {
                            if (hopper.getStackInSlot(i).getTagCompound().hasKey("PFMob")) {
                                NBTTagCompound blockNBT = (NBTTagCompound) hopper.getStackInSlot(i).getTagCompound().getTag("PFMob");
                                String resourcelocation = (blockNBT.getString("id"));
                                //Is this an arthropod though?
                                Class<? extends Entity> entityClass;
                                EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(resourcelocation));
                                EntityLiving entity = (EntityLiving) ee.newInstance(hopper.getWorld());
                                boolean isArthropod = entity.getCreatureAttribute() == EnumCreatureAttribute.ARTHROPOD;
                                if (entity != null) {
                                    entity.setDead();
                                }
                                if (isArthropod) {
                                    ItemStack originalSlotContents = hopper.getStackInSlot(i).copy();
                                    ItemStack insertStack = hopper.decrStackSize(i, 1);
                                    ItemStack remainder = putStackInInventoryAllSlots(hopper, destination, itemHandler, insertStack);

                                    if (remainder.isEmpty()) {
                                        returnResult = true;
                                        backStop = true;
                                    } else {
                                        hopper.setInventorySlotContents(i, originalSlotContents);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (destinationResultLeft != null){
            IItemHandler itemHandler = destinationResultLeft.getKey();
            Object destination = destinationResultLeft.getValue();
            if (isFull(itemHandler))
            {
                leftStop = true;
            }
            else
            {
                for (int i = 0; i < hopper.getSizeInventory() && !leftStop; ++i)
                {
                    if (!hopper.getStackInSlot(i).isEmpty() ) {
                        if (hopper.getStackInSlot(i).hasTagCompound()) {
                            if (hopper.getStackInSlot(i).getTagCompound().hasKey("PFPlant")) {
                                ItemStack originalSlotContents = hopper.getStackInSlot(i).copy();
                                ItemStack insertStack = hopper.decrStackSize(i, 1);
                                ItemStack remainder = putStackInInventoryAllSlots(hopper, destination, itemHandler, insertStack);

                                if (remainder.isEmpty()) {
                                    returnResult = true;
                                    leftStop = true;
                                }
                                else {
                                    hopper.setInventorySlotContents(i, originalSlotContents);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (destinationResultRight != null){
            IItemHandler itemHandler = destinationResultRight.getKey();
            Object destination = destinationResultRight.getValue();
            if (isFull(itemHandler))
            {
                rightStop = true;
            }
            else
            {
                for (int i = 0; i < hopper.getSizeInventory() && !rightStop; ++i)
                {
                    if (!hopper.getStackInSlot(i).isEmpty() ) {
                        if (hopper.getStackInSlot(i).hasTagCompound()) {
                            if (hopper.getStackInSlot(i).getTagCompound().hasKey("PFStatic")) {
                                ItemStack originalSlotContents = hopper.getStackInSlot(i).copy();
                                ItemStack insertStack = hopper.decrStackSize(i, 1);
                                ItemStack remainder = putStackInInventoryAllSlots(hopper, destination, itemHandler, insertStack);

                                if (remainder.isEmpty()) {
                                    returnResult = true;
                                    rightStop = true;
                                }
                                else {
                                    hopper.setInventorySlotContents(i, originalSlotContents);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (destinationResultDown != null){
            IItemHandler itemHandler = destinationResultDown.getKey();
            Object destination = destinationResultDown.getValue();
            if (isFull(itemHandler))
            {
                downStop = true;
            }
            else
            {
                for (int i = 0; i < hopper.getSizeInventory() && !downStop; ++i)
                {
                    if (!hopper.getStackInSlot(i).isEmpty() ) {
                        if (hopper.getStackInSlot(i).hasTagCompound()) {
                            if ((!hopper.getStackInSlot(i).getTagCompound().hasKey("PFStatic"))
                                    && (!hopper.getStackInSlot(i).getTagCompound().hasKey("PFMob"))
                                    && (!hopper.getStackInSlot(i).getTagCompound().hasKey("PFPlant"))) {
                                ItemStack originalSlotContents = hopper.getStackInSlot(i).copy();
                                ItemStack insertStack = hopper.decrStackSize(i, 1);
                                ItemStack remainder = putStackInInventoryAllSlots(hopper, destination, itemHandler, insertStack);

                                if (remainder.isEmpty()) {
                                    returnResult = true;
                                    downStop = true;
                                }
                                else {
                                    hopper.setInventorySlotContents(i, originalSlotContents);
                                }
                            }
                        }
                        else {
                            ItemStack originalSlotContents = hopper.getStackInSlot(i).copy();
                            ItemStack insertStack = hopper.decrStackSize(i, 1);
                            ItemStack remainder = putStackInInventoryAllSlots(hopper, destination, itemHandler, insertStack);

                            if (remainder.isEmpty()) {
                                returnResult = true;
                                downStop = true;
                            }
                            else {
                                hopper.setInventorySlotContents(i, originalSlotContents);
                            }
                        }
                    }
                }
            }
        }
        return returnResult;
    }

    private static ItemStack putStackInInventoryAllSlots(TileEntity source, Object destination, IItemHandler destInventory, ItemStack stack)
    {
        for (int slot = 0; slot < destInventory.getSlots() && !stack.isEmpty(); slot++)
        {
            stack = insertStack(source, destination, destInventory, stack, slot);
        }
        return stack;
    }

    /**
     * Copied from TileEntityHopper#insertStack and added capability support
     */
    private static ItemStack insertStack(TileEntity source, Object destination, IItemHandler destInventory, ItemStack stack, int slot)
    {
        ItemStack itemstack = destInventory.getStackInSlot(slot);

        if ((destInventory.insertItem(slot, stack, true)).isEmpty())
        {
            boolean insertedItem = false;
            boolean inventoryWasEmpty = isEmpty(destInventory);

            if (itemstack.isEmpty())
            {
                destInventory.insertItem(slot, stack, false);
                stack = ItemStack.EMPTY;
                insertedItem = true;
            }
            else if (ItemHandlerHelper.canItemStacksStack(itemstack, stack))
            {
                int originalSize = stack.getCount();
                stack = destInventory.insertItem(slot, stack, false);
                insertedItem = originalSize < stack.getCount();
            }

            if (insertedItem)
            {
                if (inventoryWasEmpty && destination instanceof TileEntityHopper)
                {
                    TileEntityHopper destinationHopper = (TileEntityHopper)destination;

                    if (!destinationHopper.mayTransfer())
                    {
                        destinationHopper.setTransferCooldown(8);
                    }
                }
            }
        }

        return stack;
    }

    @Nullable
    private static Pair<IItemHandler, Object> getItemHandler(IHopper hopper, EnumFacing hopperFacing)
    {
        double x = hopper.getXPos() + (double) hopperFacing.getXOffset();
        double y = hopper.getYPos() + (double) hopperFacing.getYOffset();
        double z = hopper.getZPos() + (double) hopperFacing.getZOffset();
        return getItemHandler(hopper.getWorld(), x, y, z, hopperFacing.getOpposite());
    }

    private static boolean isFull(IItemHandler itemHandler)
    {
        for (int slot = 0; slot < itemHandler.getSlots(); slot++)
        {
            ItemStack stackInSlot = itemHandler.getStackInSlot(slot);
            if (stackInSlot.isEmpty() || stackInSlot.getCount() != stackInSlot.getMaxStackSize())
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isEmpty(IItemHandler itemHandler)
    {
        for (int slot = 0; slot < itemHandler.getSlots(); slot++)
        {
            ItemStack stackInSlot = itemHandler.getStackInSlot(slot);
            if (stackInSlot.getCount() > 0)
            {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static Pair<IItemHandler, Object> getItemHandler(World worldIn, double x, double y, double z, final EnumFacing side)
    {
        Pair<IItemHandler, Object> destination = null;
        int i = MathHelper.floor(x);
        int j = MathHelper.floor(y);
        int k = MathHelper.floor(z);
        BlockPos blockpos = new BlockPos(i, j, k);
        net.minecraft.block.state.IBlockState state = worldIn.getBlockState(blockpos);
        Block block = state.getBlock();

        if (block.hasTileEntity(state))
        {
            TileEntity tileentity = worldIn.getTileEntity(blockpos);
            if (tileentity != null)
            {
                if (tileentity.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, side))
                {
                    IItemHandler capability = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, side);
                    destination = ImmutablePair.<IItemHandler, Object>of(capability, tileentity);
                }
            }
        }

        return destination;
    }
}

