package net.lepidodendron.gui;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
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
public class GUIPortalBlock extends ElementsLepidodendronMod.ModElement {
    public static int GUIID = LepidodendronMod.GUI_PORTAL_BLOCK_ID;
    public static HashMap guistate = new HashMap();
    public GUIPortalBlock(ElementsLepidodendronMod instance) {
        super(instance, 1);
    }

    public static class GUILepidodendronPortalBlock extends Container implements Supplier<Map<Integer, Slot>> {
        private IInventory internal;
        private World world;
        private EntityPlayer entity;
        private int x, y, z;
        private Map<Integer, Slot> customSlots = new HashMap<>();

        public GUILepidodendronPortalBlock(World world, int x, int y, int z, EntityPlayer player) {
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

            this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 56, -22) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    if (ent instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                        BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser te = (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) ent;
                        return te.isItemValidForSlot(0, stack);
                    }
                    return false;
                }

                @Override
                public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
                    if (ent instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                        ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser)ent).setPeriodLock(0, true);
                    }
                    return super.onTake(thePlayer, stack);
                }

                @Override
                public void onSlotChanged() {
                    if (ent instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                        ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser)ent).setPeriodLock(-1, true);
                    }
                    super.onSlotChanged();
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }
            }));
            this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 115, -22) {
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
                    this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 0 + 8 + sj * 18, 128 + si * 18));
            for (si = 0; si < 9; ++si)
                this.addSlotToContainer(new Slot(player.inventory, si, 0 + 8 + si * 18, 186));

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
            super(new GUILepidodendronPortalBlock(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.xSize = 176;
            this.ySize = 253;
        }
        private static final ResourceLocation texture = new ResourceLocation("lepidodendron:textures/gui/portal_block_gui.png");
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
                if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                    BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser te = (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity;
                    return te.getEnergyStored();
                }
            }
            return 0;
        }

        private int getMaxRF() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                    BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser te = (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity;
                    return te.getMaxEnergyStored();
                }
            }
            return 0;
        }

        private int getRFHeight() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                    BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser te = (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity;
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
            this.drawTexturedModalRect(k + 79, l + 21, 176, 14, getProgressBarLength(), 16);
            //Tagging options:
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                    ItemStack stack = ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).getStackInSlot(0);
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockOverworld.block) {
                        list.add(0);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockPrecambrian.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(1)) {
                        list.add(1);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockCambrian.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(2)) {
                        list.add(2);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockOrdovician.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(3)) {
                        list.add(3);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockSilurian.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(4)) {
                        list.add(4);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockDevonian.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(5)) {
                        list.add(5);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockCarboniferous.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(6)) {
                        list.add(6);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockPermian.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(7)) {
                        list.add(7);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockTriassic.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(8)) {
                        list.add(8);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockJurassic.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(9)) {
                        list.add(9);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockCretaceousEarly.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(10)) {
                        list.add(10);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockCretaceousLate.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(11)) {
                        list.add(11);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockPaleogene.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(12)) {
                        list.add(12);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockNeogene.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(13)) {
                        list.add(13);
                    }
                    if (Block.getBlockFromItem(stack.getItem()) != BlockPortalBlockPleistocene.block
                            && ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(14)) {
                        list.add(14);
                    }
                    showTags(list, k, l);
                }
                if (((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser)tileEntity).getPeriodLock() != -1) {
                    lockTags(((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser)tileEntity).getPeriodLock(), k, l);
                }
            }
        }

        void lockTags(int openTag, int k, int l) {
            if (openTag != 0) {
                this.drawTexturedModalRect(k + 152, l + 161 , 176, 90, 16, 6);
            }
            if (openTag != 1) {
                this.drawTexturedModalRect(k + 152, l + 49 , 176, 90, 16, 6);
            }
            if (openTag != 2) {
                this.drawTexturedModalRect(k + 152, l + 57 , 176, 90, 16, 6);
            }
            if (openTag != 3) {
                this.drawTexturedModalRect(k + 152, l + 65 , 176, 90, 16, 6);
            }
            if (openTag != 4) {
                this.drawTexturedModalRect(k + 152, l + 73 , 176, 90, 16, 6);
            }
            if (openTag != 5) {
                this.drawTexturedModalRect(k + 152, l + 81 , 176, 90, 16, 6);
            }
            if (openTag != 6) {
                this.drawTexturedModalRect(k + 152, l + 89 , 176, 90, 16, 6);
            }
            if (openTag != 7) {
                this.drawTexturedModalRect(k + 152, l + 97 , 176, 90, 16, 6);
            }
            if (openTag != 8) {
                this.drawTexturedModalRect(k + 152, l + 105 , 176, 90, 16, 6);
            }
            if (openTag != 9) {
                this.drawTexturedModalRect(k + 152, l + 113 , 176, 90, 16, 6);
            }
            if (openTag != 10) {
                this.drawTexturedModalRect(k + 152, l + 121 , 176, 90, 16, 6);
            }
            if (openTag != 11) {
                this.drawTexturedModalRect(k + 152, l + 129 , 176, 90, 16, 6);
            }
            if (openTag != 12) {
                this.drawTexturedModalRect(k + 152, l + 137 , 176, 90, 16, 6);
            }
            if (openTag != 13) {
                this.drawTexturedModalRect(k + 152, l + 145 , 176, 90, 16, 6);
            }
            if (openTag != 14) {
                this.drawTexturedModalRect(k + 152, l + 153 , 176, 90, 16, 6);
            }
        }

        void showTags(ArrayList<Integer> list, int k, int l) {
            if (list.contains(0)) {
                this.drawTexturedModalRect(k + 152, l + 161 , 176, 83, 16, 6);
            }
            if (list.contains(1)) {
                this.drawTexturedModalRect(k + 152, l + 49 , 176, 83, 16, 6);
            }
            if (list.contains(2)) {
                this.drawTexturedModalRect(k + 152, l + 57 , 176, 83, 16, 6);
            }
            if (list.contains(3)) {
                this.drawTexturedModalRect(k + 152, l + 65 , 176, 83, 16, 6);
            }
            if (list.contains(4)) {
                this.drawTexturedModalRect(k + 152, l + 73 , 176, 83, 16, 6);
            }
            if (list.contains(5)) {
                this.drawTexturedModalRect(k + 152, l + 81 , 176, 83, 16, 6);
            }
            if (list.contains(6)) {
                this.drawTexturedModalRect(k + 152, l + 89 , 176, 83, 16, 6);
            }
            if (list.contains(7)) {
                this.drawTexturedModalRect(k + 152, l + 97 , 176, 83, 16, 6);
            }
            if (list.contains(8)) {
                this.drawTexturedModalRect(k + 152, l + 105 , 176, 83, 16, 6);
            }
            if (list.contains(9)) {
                this.drawTexturedModalRect(k + 152, l + 113 , 176, 83, 16, 6);
            }
            if (list.contains(10)) {
                this.drawTexturedModalRect(k + 152, l + 121 , 176, 83, 16, 6);
            }
            if (list.contains(11)) {
                this.drawTexturedModalRect(k + 152, l + 129 , 176, 83, 16, 6);
            }
            if (list.contains(12)) {
                this.drawTexturedModalRect(k + 152, l + 137 , 176, 83, 16, 6);
            }
            if (list.contains(13)) {
                this.drawTexturedModalRect(k + 152, l + 145 , 176, 83, 16, 6);
            }
            if (list.contains(14)) {
                this.drawTexturedModalRect(k + 152, l + 153 , 176, 83, 16, 6);
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
                if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
//                    if (((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser)tileEntity).inputType(((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser)tileEntity).getStackInSlot(0)) != 2) {
//                        return;
//                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 49 && mouseY <= l + 56) {
                            clickPeriod(tileEntity, 1);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 57 && mouseY <= l + 64) {
                            clickPeriod(tileEntity, 2);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 65 && mouseY <= l + 72) {
                            clickPeriod(tileEntity, 3);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 73 && mouseY <= l + 80) {
                            clickPeriod(tileEntity, 4);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 81 && mouseY <= l + 88) {
                            clickPeriod(tileEntity, 5);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 89 && mouseY <= l + 96) {
                            clickPeriod(tileEntity, 6);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 97 && mouseY <= l + 104) {
                            clickPeriod(tileEntity, 7);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 105 && mouseY <= l + 112) {
                            clickPeriod(tileEntity, 8);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 113 && mouseY <= l + 120) {
                            clickPeriod(tileEntity, 9);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 121 && mouseY <= l + 128) {
                            clickPeriod(tileEntity, 10);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 129 && mouseY <= l + 136) {
                            clickPeriod(tileEntity, 11);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 137 && mouseY <= l + 144) {
                            clickPeriod(tileEntity, 12);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 145 && mouseY <= l + 152) {
                            clickPeriod(tileEntity, 13);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 153 && mouseY <= l + 160) {
                            clickPeriod(tileEntity, 14);
                        }
                    }
                    if (mouseButton == 0 || mouseButton == 1) {
                        if (mouseX >= k + 151 && mouseX <= k + 167
                                && mouseY >= l + 161 && mouseY <= l + 168) {
                            clickPeriod(tileEntity, 0);
                        }
                    }
                }
            }

        }

        private void clickPeriod(TileEntity tileEntity, int period) {
            boolean canSelect = false;
            if (((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).canSelectDimension(period)) {
                canSelect = true;
            }

            switch (period) {
                case 0:
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
                case 14:
                    if (((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).getPeriodLock() != period && canSelect) {
                        ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity).setPeriodLock(period, true);
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIPortalBlockTagSelectMessage(period, x, y, z));
                        this.mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
                    }
                    break;
            }
        }

        private int getProgressBarLength() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                    BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser te = (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity;
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
            this.fontRenderer.drawString("Portal Block Configuration", 26, -38, 4210752);
            this.fontRenderer.drawString("Precambrian", 88, 4, 4210752);
            this.fontRenderer.drawString("Cambrian", 106, 12, 4210752);
            this.fontRenderer.drawString("Ordovician", 98, 20, 4210752);
            this.fontRenderer.drawString("Silurian", 113, 28, 4210752);
            this.fontRenderer.drawString("Devonian", 106, 36, 4210752);
            this.fontRenderer.drawString("Carboniferous", 77, 44, 4210752);
            this.fontRenderer.drawString("Permian", 112, 52, 4210752);
            this.fontRenderer.drawString("Triassic", 110, 60, 4210752);
            this.fontRenderer.drawString("Jurassic", 106, 68, 4210752);
            this.fontRenderer.drawString("Early Cretaceous", 61, 76, 4210752);
            this.fontRenderer.drawString("Late Cretaceous", 66, 84, 4210752);
            this.fontRenderer.drawString("Paleogene", 99, 92, 4210752);
            this.fontRenderer.drawString("Neogene", 108, 100, 4210752);
            this.fontRenderer.drawString("Pleistocene", 93, 108, 4210752);
            this.fontRenderer.drawString("Overworld", 98, 116, 4210752);

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

    public static class GUIPortalBlockTagSelectMessageHandler implements IMessageHandler<GUIPortalBlock.GUIPortalBlockTagSelectMessage, IMessage> {
        @Override
        public IMessage onMessage(GUIPortalBlock.GUIPortalBlockTagSelectMessage message, MessageContext context) {

            EntityPlayerMP entity = context.getServerHandler().player;
            TileEntity te = entity.getServerWorld().getTileEntity(new BlockPos(message.x,message.y, message.z));
            if (te != null) {
                if (te instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
                    ((BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) te).setPeriodLock(message.value, true);
                    te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                    te.markDirty();
                }
            }
            return null;
        }
    }

    public static class GUIPortalBlockTagSelectMessage implements IMessage {
        int value;
        int x, y, z;
        public GUIPortalBlockTagSelectMessage() {
        }

        public GUIPortalBlockTagSelectMessage(int value, int x, int y, int z) {
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
