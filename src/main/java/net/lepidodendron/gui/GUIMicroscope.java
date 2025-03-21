package net.lepidodendron.gui;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockMicroscope;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.IDimensionRestricted;
import net.minecraft.block.Block;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@ElementsLepidodendronMod.ModElement.Tag
public class GUIMicroscope extends ElementsLepidodendronMod.ModElement {
    public static int GUIID = LepidodendronMod.GUI_MICROSCOPE_ID;
    public static HashMap guistate = new HashMap();
    public GUIMicroscope(ElementsLepidodendronMod instance) {
        super(instance, 1);
    }

    public static class GUILepidodendronMicroscope extends Container implements Supplier<Map<Integer, Slot>> {
        private IInventory internal;
        private World world;
        private EntityPlayer entity;
        private int x, y, z;
        private Map<Integer, Slot> customSlots = new HashMap<>();

        public GUILepidodendronMicroscope(World world, int x, int y, int z, EntityPlayer player) {
            this.world = world;
            this.entity = player;
            this.x = x;
            this.y = y;
            this.z = z;
            this.internal = new InventoryBasic("", true, 2);
            TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
            if (ent instanceof IInventory)
                this.internal = (IInventory) ent;

            this.internal.openInventory(player);

            this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 56, -16) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    if (ent instanceof BlockMicroscope.TileEntityMicroscope) {
                        BlockMicroscope.TileEntityMicroscope te = (BlockMicroscope.TileEntityMicroscope) ent;
                        return te.isItemValidForSlot(0, stack);
                    }
                    return false;
                }

                @Override
                public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
                    if (ent instanceof BlockMicroscope.TileEntityMicroscope) {
                        ((BlockMicroscope.TileEntityMicroscope)ent).setPeriodLock(0, true);
                    }
                    return super.onTake(thePlayer, stack);
                }

                @Override
                public void onSlotChanged() {
                    if (ent instanceof BlockMicroscope.TileEntityMicroscope) {
                        ((BlockMicroscope.TileEntityMicroscope)ent).setPeriodLock(0, true);
                    }
                    super.onSlotChanged();
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }
            }));
            this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 115, -16) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }
            }));

            int si;
            int sj;
            for (si = 0; si < 3; ++si)
                for (sj = 0; sj < 9; ++sj)
                    this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 0 + 8 + sj * 18, 127 + si * 18));
            for (si = 0; si < 9; ++si)
                this.addSlotToContainer(new Slot(player.inventory, si, 0 + 8 + si * 18, 185));

        }

        public Map<Integer, Slot> get() {
            return customSlots;
        }

        @Override
        public boolean canInteractWith(EntityPlayer player) {
            return internal.isUsableByPlayer(player);
        }

        public IInventory getLowerChestInventory()
        {
            return this.internal;
        }

        @Override
        public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
            ItemStack itemstack = ItemStack.EMPTY;
            Slot slot = (Slot) this.inventorySlots.get(index);
            if (slot != null && slot.getHasStack()) {
                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();
                if (index < 2) {
                    if (!this.mergeItemStack(itemstack1, 2, this.inventorySlots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                    slot.onSlotChange(itemstack1, itemstack);
                } else if (!this.mergeItemStack(itemstack1, 0, 2, false)) {
                    if (index < 2 + 27) {
                        if (!this.mergeItemStack(itemstack1, 2 + 27, this.inventorySlots.size(), true)) {
                            return ItemStack.EMPTY;
                        }
                    } else {
                        if (!this.mergeItemStack(itemstack1, 2, 2 + 27, false)) {
                            return ItemStack.EMPTY;
                        }
                    }
                    return ItemStack.EMPTY;
                }
                if (itemstack1.getCount() == 0) {
                    slot.putStack(ItemStack.EMPTY);
                } else {
                    slot.onSlotChanged();
                }
                if (itemstack1.getCount() == itemstack.getCount()) {
                    return ItemStack.EMPTY;
                }
                slot.onTake(playerIn, itemstack1);
            }
            return itemstack;
        }

        @Override /**
         * Merges provided ItemStack with the first avaliable one in the
         * container/player inventor between minIndex (included) and maxIndex
         * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
         * Container implementation do not check if the item is valid for the slot
         */
        protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
            boolean flag = false;
            int i = startIndex;
            if (reverseDirection) {
                i = endIndex - 1;
            }
            if (stack.isStackable()) {
                while (!stack.isEmpty()) {
                    if (reverseDirection) {
                        if (i < startIndex) {
                            break;
                        }
                    } else if (i >= endIndex) {
                        break;
                    }
                    Slot slot = this.inventorySlots.get(i);
                    ItemStack itemstack = slot.getStack();
                    if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && itemstack.getItem() == stack.getItem()
                            && (!stack.getHasSubtypes() || stack.getMetadata() == itemstack.getMetadata())
                            && ItemStack.areItemStackTagsEqual(stack, itemstack)) {
                        int j = itemstack.getCount() + stack.getCount();
                        int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
                        if (j <= maxSize) {
                            stack.setCount(0);
                            itemstack.setCount(j);
                            slot.putStack(itemstack);
                            flag = true;
                        } else if (itemstack.getCount() < maxSize) {
                            stack.shrink(maxSize - itemstack.getCount());
                            itemstack.setCount(maxSize);
                            slot.putStack(itemstack);
                            flag = true;
                        }
                    }
                    if (reverseDirection) {
                        --i;
                    } else {
                        ++i;
                    }
                }
            }
            if (!stack.isEmpty()) {
                if (reverseDirection) {
                    i = endIndex - 1;
                } else {
                    i = startIndex;
                }
                while (true) {
                    if (reverseDirection) {
                        if (i < startIndex) {
                            break;
                        }
                    } else if (i >= endIndex) {
                        break;
                    }
                    Slot slot1 = this.inventorySlots.get(i);
                    ItemStack itemstack1 = slot1.getStack();
                    if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
                        if (stack.getCount() > slot1.getSlotStackLimit()) {
                            slot1.putStack(stack.splitStack(slot1.getSlotStackLimit()));
                        } else {
                            slot1.putStack(stack.splitStack(stack.getCount()));
                        }
                        slot1.onSlotChanged();
                        flag = true;
                        break;
                    }
                    if (reverseDirection) {
                        --i;
                    } else {
                        ++i;
                    }
                }
            }
            return flag;
        }

        @Override
        public void onContainerClosed(EntityPlayer playerIn) {
            super.onContainerClosed(playerIn);
            if ((internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
                this.clearContainer(playerIn, playerIn.world, internal);
            }
            TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
            if (ent instanceof IInventory)
                this.internal = (IInventory) ent;

            this.internal.closeInventory(playerIn);
        }

        private void slotChanged(int slotid, int ctype, int meta) {
            if (this.world != null && this.world.isRemote) {
                LepidodendronMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
                handleSlotAction(entity, slotid, ctype, meta, x, y, z);
            }
        }
    }

    public static class GuiWindow extends GuiContainer {
        private World world;
        private int x, y, z;
        private EntityPlayer entity;
        public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
            super(new GUILepidodendronMicroscope(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.xSize = 176;
            this.ySize = 255;
        }
        private static final ResourceLocation texture = new ResourceLocation("lepidodendron:textures/gui/microscope_gui.png");
        @Override
        public void drawScreen(int mouseX, int mouseY, float partialTicks) {
            this.drawDefaultBackground();
            super.drawScreen(mouseX, mouseY, partialTicks);
            this.renderHoveredToolTip(mouseX, mouseY);
            if (LepidodendronConfig.machinesRF) {
                this.renderRF(mouseX, mouseY);
            }
        }

        protected void renderRF(int mouseX, int mouseY)
        {
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize) / 2;

            if (mouseX >= k + 20 && mouseX <= k + 20 + 18
                    && mouseY >= l + 51 - 28 && mouseY <= l + 51 - 28 + 26)
            {
                DecimalFormat df = new DecimalFormat("###,###,###");
                this.drawHoveringText(df.format(this.getCurrentRF()) + " / " + df.format(this.getMaxRF()) + " RF", mouseX, mouseY);
            }
        }

        private int getCurrentRF() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
                    BlockMicroscope.TileEntityMicroscope te = (BlockMicroscope.TileEntityMicroscope) tileEntity;
                    return te.getEnergyStored();
                }
            }
            return 0;
        }

        private int getMaxRF() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
                    BlockMicroscope.TileEntityMicroscope te = (BlockMicroscope.TileEntityMicroscope) tileEntity;
                    return te.getMaxEnergyStored();
                }
            }
            return 0;
        }

        private int getRFHeight() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
                    BlockMicroscope.TileEntityMicroscope te = (BlockMicroscope.TileEntityMicroscope) tileEntity;
                    //return (int)Math.round(te.progressFraction() * 70D);
                    double fraction = te.getEnergyFraction();
                    return (int) Math.round(fraction * 24D);
                }
            }
            return 0;
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.renderEngine.bindTexture(texture);
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize) / 2;
            this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
            zLevel = 100.0F;
            if (LepidodendronConfig.machinesRF) {
                this.drawTexturedModalRect(k + 20, l + 51 - 28, 176, 32, 18, 26);
                this.drawTexturedModalRect(k + 21, l + 52 + (24 - this.getRFHeight()) - 28, 176, 58, 16, this.getRFHeight());
            }
            //Arrow:
            this.drawTexturedModalRect(k + 79, l + 28 , 176, 14, getProgressBarLength(), 16);
            //Tagging options:
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
                    ItemStack stack = ((BlockMicroscope.TileEntityMicroscope)tileEntity).getStackInSlot(0);
                    if (stack.hasTagCompound()) {
                        if (!stack.getTagCompound().hasKey("period")) {
                            String resourcelocation = "";
                            if (stack.getTagCompound().hasKey("PFMob")) {
                                NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
                                resourcelocation = (blockNBT.getString("id"));
                            }
                            if (stack.getTagCompound().hasKey("PFStatic")) {
                                NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFStatic");
                                resourcelocation = (blockNBT.getString("id"));
                            }
                            if (stack.getTagCompound().hasKey("PFPlant")) {
                                NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFPlant");
                                resourcelocation = (blockNBT.getString("id"));
                            }
                            if (!resourcelocation.equalsIgnoreCase("")) {
                                ArrayList<Integer> list = Functions.dimAllowed(resourcelocation);
                                showTags(list, k, l);
                            }
                            if (stack.getItem() instanceof IDimensionRestricted) {
                                ArrayList<Integer> list = ((IDimensionRestricted)stack.getItem()).dimAllowed();
                                showTags(list, k, l);
                            }
                            if (Block.getBlockFromItem(stack.getItem()) instanceof IDimensionRestricted) {
                                ArrayList<Integer> list = ((IDimensionRestricted)Block.getBlockFromItem(stack.getItem())).dimAllowed();
                                showTags(list, k, l);
                            }
                            //Lock the slots if we're busy processing this:
                            if (((BlockMicroscope.TileEntityMicroscope)tileEntity).getPeriodLock() != 0) {
                                lockTags(((BlockMicroscope.TileEntityMicroscope)tileEntity).getPeriodLock(), k, l);
                            }
                        }
                    }
                    else {
                        if (stack.getItem() instanceof IDimensionRestricted) {
                            ArrayList<Integer> list = ((IDimensionRestricted)stack.getItem()).dimAllowed();
                            showTags(list, k, l);
                        }
                        if (Block.getBlockFromItem(stack.getItem()) instanceof IDimensionRestricted) {
                            ArrayList<Integer> list = ((IDimensionRestricted)Block.getBlockFromItem(stack.getItem())).dimAllowed();
                            showTags(list, k, l);
                        }
                        //Lock the slots if we're busy processing this:
                        if (((BlockMicroscope.TileEntityMicroscope)tileEntity).getPeriodLock() != 0) {
                            lockTags(((BlockMicroscope.TileEntityMicroscope)tileEntity).getPeriodLock(), k, l);
                        }
                    }
                }
            }
        }

        void lockTags(int openTag, int k, int l) {
            if (openTag != 1) {
                this.drawTexturedModalRect(k + 152, l + 59 , 176, 90, 16, 6);
            }
            if (openTag != 2) {
                this.drawTexturedModalRect(k + 152, l + 67 , 176, 90, 16, 6);
            }
            if (openTag != 3) {
                this.drawTexturedModalRect(k + 152, l + 75 , 176, 90, 16, 6);
            }
            if (openTag != 4) {
                this.drawTexturedModalRect(k + 152, l + 83 , 176, 90, 16, 6);
            }
            if (openTag != 5) {
                this.drawTexturedModalRect(k + 152, l + 91 , 176, 90, 16, 6);
            }
            if (openTag != 6) {
                this.drawTexturedModalRect(k + 152, l + 99 , 176, 90, 16, 6);
            }
            if (openTag != 7) {
                this.drawTexturedModalRect(k + 152, l + 107 , 176, 90, 16, 6);
            }
            if (openTag != 8) {
                this.drawTexturedModalRect(k + 152, l + 115 , 176, 90, 16, 6);
            }
            if (openTag != 9) {
                this.drawTexturedModalRect(k + 152, l + 123 , 176, 90, 16, 6);
            }
            if (openTag != 10) {
                this.drawTexturedModalRect(k + 152, l + 131 , 176, 90, 16, 6);
            }
            if (openTag != 11) {
                this.drawTexturedModalRect(k + 152, l + 139 , 176, 90, 16, 6);
            }
            if (openTag != 12) {
                this.drawTexturedModalRect(k + 152, l + 147 , 176, 90, 16, 6);
            }
            if (openTag != 13) {
                this.drawTexturedModalRect(k + 152, l + 155 , 176, 90, 16, 6);
            }
        }

        void showTags(ArrayList<Integer> list, int k, int l) {
            if (list.contains(1)) {
                this.drawTexturedModalRect(k + 152, l + 59 , 176, 83, 16, 6);
            }
            if (list.contains(2)) {
                this.drawTexturedModalRect(k + 152, l + 67 , 176, 83, 16, 6);
            }
            if (list.contains(3)) {
                this.drawTexturedModalRect(k + 152, l + 75 , 176, 83, 16, 6);
            }
            if (list.contains(4)) {
                this.drawTexturedModalRect(k + 152, l + 83 , 176, 83, 16, 6);
            }
            if (list.contains(5)) {
                this.drawTexturedModalRect(k + 152, l + 91 , 176, 83, 16, 6);
            }
            if (list.contains(6)) {
                this.drawTexturedModalRect(k + 152, l + 99 , 176, 83, 16, 6);
            }
            if (list.contains(7)) {
                this.drawTexturedModalRect(k + 152, l + 107 , 176, 83, 16, 6);
            }
            if (list.contains(8)) {
                this.drawTexturedModalRect(k + 152, l + 115 , 176, 83, 16, 6);
            }
            if (list.contains(9)) {
                this.drawTexturedModalRect(k + 152, l + 123 , 176, 83, 16, 6);
            }
            if (list.contains(10)) {
                this.drawTexturedModalRect(k + 152, l + 131 , 176, 83, 16, 6);
            }
            if (list.contains(11)) {
                this.drawTexturedModalRect(k + 152, l + 139 , 176, 83, 16, 6);
            }
            if (list.contains(12)) {
                this.drawTexturedModalRect(k + 152, l + 147 , 176, 83, 16, 6);
            }
            if (list.contains(13)) {
                this.drawTexturedModalRect(k + 152, l + 155 , 176, 83, 16, 6);
            }
        }

        @Override
        protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
            super.mouseClicked(mouseX, mouseY, mouseButton);

            //Toggle buttons:
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize) / 2;
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
                    if (((BlockMicroscope.TileEntityMicroscope)tileEntity).inputType(((BlockMicroscope.TileEntityMicroscope)tileEntity).getStackInSlot(0)) != 2) {
                        return;
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 59 && mouseY <= l + 66) {
                            clickPeriod(tileEntity, 1);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 67 && mouseY <= l + 74) {
                            clickPeriod(tileEntity, 2);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 75 && mouseY <= l + 82) {
                            clickPeriod(tileEntity, 3);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 83 && mouseY <= l + 90) {
                            clickPeriod(tileEntity, 4);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 91 && mouseY <= l + 98) {
                            clickPeriod(tileEntity, 5);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 99 && mouseY <= l + 106) {
                            clickPeriod(tileEntity, 6);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 107 && mouseY <= l + 114) {
                            clickPeriod(tileEntity, 7);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 115 && mouseY <= l + 122) {
                            clickPeriod(tileEntity, 8);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 123 && mouseY <= l + 130) {
                            clickPeriod(tileEntity, 9);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 131 && mouseY <= l + 138) {
                            clickPeriod(tileEntity, 10);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 139 && mouseY <= l + 146) {
                            clickPeriod(tileEntity, 11);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 147 && mouseY <= l + 154) {
                            clickPeriod(tileEntity, 12);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 155 && mouseY <= l + 162) {
                            clickPeriod(tileEntity, 13);
                        }
                    }
                }
            }

        }

        private void clickPeriod(TileEntity tileEntity, int period) {
            ItemStack stack = ((BlockMicroscope.TileEntityMicroscope)tileEntity).getStackInSlot(0);
            boolean canSelect = false;
            if (stack.hasTagCompound()) {
                if (!stack.getTagCompound().hasKey("period")) {
                    String resourcelocation = "";
                    if (stack.getTagCompound().hasKey("PFMob")) {
                        NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
                        resourcelocation = (blockNBT.getString("id"));
                    }
                    if (stack.getTagCompound().hasKey("PFStatic")) {
                        NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFStatic");
                        resourcelocation = (blockNBT.getString("id"));
                    }
                    if (stack.getTagCompound().hasKey("PFPlant")) {
                        NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFPlant");
                        resourcelocation = (blockNBT.getString("id"));
                    }
                    if (!resourcelocation.equalsIgnoreCase("")) {
                        if (Functions.dimAllowed(resourcelocation).contains(period)) {
                            canSelect = true;
                        }
                    }
                    if (stack.getItem() instanceof IDimensionRestricted) {
                        if (((IDimensionRestricted)stack.getItem()).dimAllowed().contains(period)) {
                            canSelect = true;
                        }
                    }
                    if (Block.getBlockFromItem(stack.getItem()) instanceof IDimensionRestricted) {
                        if (((IDimensionRestricted)Block.getBlockFromItem(stack.getItem())).dimAllowed().contains(period)) {
                            canSelect = true;
                        }
                    }
                }
            }
            else {
                if (stack.getItem() instanceof IDimensionRestricted) {
                    if (((IDimensionRestricted)stack.getItem()).dimAllowed().contains(period)) {
                        canSelect = true;
                    }
                }
                if (Block.getBlockFromItem(stack.getItem()) instanceof IDimensionRestricted) {
                    if (((IDimensionRestricted)Block.getBlockFromItem(stack.getItem())).dimAllowed().contains(period)) {
                        canSelect = true;
                    }
                }
            }

            switch (period) {
                case 0:
                default:
                    ((BlockMicroscope.TileEntityMicroscope) tileEntity).setPeriodLock(0, true);
                    LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIMicroscopeTagSelectMessage(0, x, y, z));
                    this.mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
                    break;

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    if (((BlockMicroscope.TileEntityMicroscope) tileEntity).getPeriodLock() == period) {
                        ((BlockMicroscope.TileEntityMicroscope) tileEntity).setPeriodLock(0, true);
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIMicroscopeTagSelectMessage(0, x, y, z));
                        this.mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
                    } else if (((BlockMicroscope.TileEntityMicroscope) tileEntity).getPeriodLock() != period && canSelect) {
                        ((BlockMicroscope.TileEntityMicroscope) tileEntity).setPeriodLock(period, true);
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIMicroscopeTagSelectMessage(period, x, y, z));
                        this.mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
                    }
                    break;
            }
        }

        private int getProgressBarLength() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
                    BlockMicroscope.TileEntityMicroscope te = (BlockMicroscope.TileEntityMicroscope) tileEntity;
                    return (int)Math.round(te.progressFraction() * 22D);
                }
            }
            return 0;
        }

        @Override
        public void updateScreen() {
            super.updateScreen();
        }

        @Override
        protected void keyTyped(char typedChar, int keyCode) throws IOException {
            super.keyTyped(typedChar, keyCode);
        }

        @Override
        protected void drawGuiContainerForegroundLayer(int par1, int par2) {
            this.fontRenderer.drawString("Microscope analysis", 41, -38, 4210752);
            this.fontRenderer.drawString("Tag as...", 8, 53, 4210752);
            this.fontRenderer.drawString("Precambrian", 88, 13, 4210752);
            this.fontRenderer.drawString("Cambrian", 106, 21, 4210752);
            this.fontRenderer.drawString("Ordovician", 98, 29, 4210752);
            this.fontRenderer.drawString("Silurian", 113, 37, 4210752);
            this.fontRenderer.drawString("Devonian", 106, 45, 4210752);
            this.fontRenderer.drawString("Carboniferous", 77, 53, 4210752);
            this.fontRenderer.drawString("Permian", 112, 61, 4210752);
            this.fontRenderer.drawString("Triassic", 110, 69, 4210752);
            this.fontRenderer.drawString("Jurassic", 106, 77, 4210752);
            this.fontRenderer.drawString("Cretaceous", 92, 85, 4210752);
            this.fontRenderer.drawString("Palaeogene", 99, 93, 4210752);
            this.fontRenderer.drawString("Neogene", 108, 101, 4210752);
            this.fontRenderer.drawString("Pleistocene", 93, 109, 4210752);

            this.fontRenderer.drawString("Inventory", 8, 116, 4210752);
        }

        @Override
        public void onGuiClosed() {
            super.onGuiClosed();
            Keyboard.enableRepeatEvents(false);
        }

        @Override
        public void initGui() {
            super.initGui();
            this.guiLeft = (this.width - 176) / 2;
            this.guiTop = (this.height - 166) / 2;
            Keyboard.enableRepeatEvents(true);
            this.buttonList.clear();
        }

        @Override
        protected void actionPerformed(GuiButton button) {
            LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.id, x, y, z));
            handleButtonAction(entity, button.id, x, y, z);
        }

        @Override
        public boolean doesGuiPauseGame() {
            return false;
        }
    }

    public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
        @Override
        public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().player;
            entity.getServerWorld().addScheduledTask(() -> {
                int buttonID = message.buttonID;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                handleButtonAction(entity, buttonID, x, y, z);
            });
            return null;
        }
    }

    public static class GUISlotChangedMessageHandler implements IMessageHandler<GUISlotChangedMessage, IMessage> {
        @Override
        public IMessage onMessage(GUISlotChangedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().player;
            entity.getServerWorld().addScheduledTask(() -> {
                int slotID = message.slotID;
                int changeType = message.changeType;
                int meta = message.meta;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                handleSlotAction(entity, slotID, changeType, meta, x, y, z);
            });
            return null;
        }
    }

    public static class GUIButtonPressedMessage implements IMessage {
        int buttonID, x, y, z;
        public GUIButtonPressedMessage() {
        }

        public GUIButtonPressedMessage(int buttonID, int x, int y, int z) {
            this.buttonID = buttonID;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public void toBytes(io.netty.buffer.ByteBuf buf) {
            buf.writeInt(buttonID);
            buf.writeInt(x);
            buf.writeInt(y);
            buf.writeInt(z);
        }

        @Override
        public void fromBytes(io.netty.buffer.ByteBuf buf) {
            buttonID = buf.readInt();
            x = buf.readInt();
            y = buf.readInt();
            z = buf.readInt();
        }
    }

    public static class GUISlotChangedMessage implements IMessage {
        int slotID, x, y, z, changeType, meta;
        public GUISlotChangedMessage() {
        }

        public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
            this.slotID = slotID;
            this.x = x;
            this.y = y;
            this.z = z;
            this.changeType = changeType;
            this.meta = meta;
        }

        @Override
        public void toBytes(io.netty.buffer.ByteBuf buf) {
            buf.writeInt(slotID);
            buf.writeInt(x);
            buf.writeInt(y);
            buf.writeInt(z);
            buf.writeInt(changeType);
            buf.writeInt(meta);
        }

        @Override
        public void fromBytes(io.netty.buffer.ByteBuf buf) {
            slotID = buf.readInt();
            x = buf.readInt();
            y = buf.readInt();
            z = buf.readInt();
            changeType = buf.readInt();
            meta = buf.readInt();
        }
    }

    private static void handleButtonAction(EntityPlayer entity, int buttonID, int x, int y, int z) {
        World world = entity.world;
        // security measure to prevent arbitrary chunk generation
        if (!world.isBlockLoaded(new BlockPos(x, y, z)))
            return;
    }

    private static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
        World world = entity.world;
        // security measure to prevent arbitrary chunk generation
        if (!world.isBlockLoaded(new BlockPos(x, y, z)))
            return;
    }

    public static class GUIMicroscopeTagSelectMessageHandler implements IMessageHandler<GUIMicroscope.GUIMicroscopeTagSelectMessage, IMessage> {
        @Override
        public IMessage onMessage(GUIMicroscope.GUIMicroscopeTagSelectMessage message, MessageContext context) {

            EntityPlayerMP entity = context.getServerHandler().player;
            TileEntity te = entity.getServerWorld().getTileEntity(new BlockPos(message.x,message.y, message.z));
            if (te != null) {
                if (te instanceof BlockMicroscope.TileEntityMicroscope) {
                    ((BlockMicroscope.TileEntityMicroscope) te).setPeriodLock(message.value, true);
                    te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                    te.markDirty();
                }
            }
            return null;
        }
    }

    public static class GUIMicroscopeTagSelectMessage implements IMessage {
        int value;
        int x, y, z;
        public GUIMicroscopeTagSelectMessage() {
        }

        public GUIMicroscopeTagSelectMessage(int value, int x, int y, int z) {
            this.value = value;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public void toBytes(io.netty.buffer.ByteBuf buf) {
            buf.writeInt(value);
            buf.writeInt(x);
            buf.writeInt(y);
            buf.writeInt(z);
        }

        @Override
        public void fromBytes(io.netty.buffer.ByteBuf buf) {
            value = buf.readInt();
            x = buf.readInt();
            y = buf.readInt();
            z = buf.readInt();
        }
    }
}
