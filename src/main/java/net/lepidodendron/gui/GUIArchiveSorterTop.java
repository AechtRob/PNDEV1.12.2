package net.lepidodendron.gui;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockArchiveSorterTop;
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
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@ElementsLepidodendronMod.ModElement.Tag
public class GUIArchiveSorterTop extends ElementsLepidodendronMod.ModElement {
    public static int GUIID = LepidodendronMod.GUI_ARCHIVE_SORTER_TOP_ID;
    public static HashMap guistate = new HashMap();
    public GUIArchiveSorterTop(ElementsLepidodendronMod instance) {
        super(instance, 1);
    }

    public static class GUILepidodendronArchiveSorterTop extends Container implements Supplier<Map<Integer, Slot>> {
        private IInventory internal;
        private World world;
        private EntityPlayer entity;
        private int x, y, z;
        private Map<Integer, Slot> customSlots = new HashMap<>();
        public GUILepidodendronArchiveSorterTop(World world, int x, int y, int z, EntityPlayer player) {
            this.world = world;
            this.entity = player;
            this.x = x;
            this.y = y;
            this.z = z;
            this.internal = new InventoryBasic("", true, 14);
            TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
            if (ent instanceof IInventory)
                this.internal = (IInventory) ent;
            this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 29, 0) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackPrecambrian && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(0, stack);
                }
            }));
            this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 29, 31) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackCambrian && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(1, stack);
                }
            }));
            this.customSlots.put(2, this.addSlotToContainer(new Slot(internal, 2, 29, 62) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackOrdovician && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(2, stack);
                }
            }));
            this.customSlots.put(3, this.addSlotToContainer(new Slot(internal, 3, 29, 93) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackSilurian && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(3, stack);
                }
            }));
            this.customSlots.put(4, this.addSlotToContainer(new Slot(internal, 4, 109, 0) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackDevonian && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(4, stack);
                }
            }));
            this.customSlots.put(5, this.addSlotToContainer(new Slot(internal, 5, 109, 31) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackCarboniferous && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(5, stack);
                }
            }));
            this.customSlots.put(6, this.addSlotToContainer(new Slot(internal, 6, 109, 62) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackPermian && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(6, stack);
                }
            }));
            this.customSlots.put(7, this.addSlotToContainer(new Slot(internal, 7, 109, 93) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackTriassic && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(7, stack);
                }
            }));
            this.customSlots.put(8, this.addSlotToContainer(new Slot(internal, 8, 189, 0) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackJurassic && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(8, stack);
                }
            }));
            this.customSlots.put(9, this.addSlotToContainer(new Slot(internal, 9, 189, 31) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackCretaceous && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(9, stack);
                }
            }));
            this.customSlots.put(10, this.addSlotToContainer(new Slot(internal, 10, 189, 62) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackPaleogene && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(10, stack);
                }
            }));
            this.customSlots.put(11, this.addSlotToContainer(new Slot(internal, 11, 189, 93) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackNeogene && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(11, stack);
                }
            }));
            this.customSlots.put(12, this.addSlotToContainer(new Slot(internal, 12, 189, 124) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackPleistocene && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(12, stack);
                }
            }));
            this.customSlots.put(13, this.addSlotToContainer(new Slot(internal, 13, 189, 156) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).stackOther && ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) ent).isItemValidForSlot(13, stack);
                }
            }));


            int si;
            int sj;
            for (si = 0; si < 3; ++si)
                for (sj = 0; sj < 9; ++sj)
                    this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 0 - 25 + sj * 18, 1 + 120 + si * 18));
            for (si = 0; si < 9; ++si)
                this.addSlotToContainer(new Slot(player.inventory, si, 0 - 25 + si * 18, 1 + 178));

        }

        public Map<Integer, Slot> get() {
            return customSlots;
        }

        @Override
        public boolean canInteractWith(EntityPlayer player) {
            return internal.isUsableByPlayer(player);
        }

        @Override
        public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
            ItemStack itemstack = ItemStack.EMPTY;
            Slot slot = (Slot) this.inventorySlots.get(index);
            if (slot != null && slot.getHasStack()) {
                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();
                if (index < 9) {
                    if (!this.mergeItemStack(itemstack1, 9, this.inventorySlots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                    slot.onSlotChange(itemstack1, itemstack);
                } else if (!this.mergeItemStack(itemstack1, 0, 9, false)) {
                    if (index < 9 + 27) {
                        if (!this.mergeItemStack(itemstack1, 9 + 27, this.inventorySlots.size(), true)) {
                            return ItemStack.EMPTY;
                        }
                    } else {
                        if (!this.mergeItemStack(itemstack1, 9, 9 + 27, false)) {
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
                //System.err.println("itemstack1 5 " + itemstack);
                slot.onTake(playerIn, itemstack);
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
            super(new GUILepidodendronArchiveSorterTop(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.xSize = 255;
            this.ySize = 239;
        }
        private static final ResourceLocation texture = new ResourceLocation("lepidodendron:textures/gui/archive_input_gui.png");
        @Override
        public void drawScreen(int mouseX, int mouseY, float partialTicks) {
            this.drawDefaultBackground();
            super.drawScreen(mouseX, mouseY, partialTicks);
            this.renderHoveredToolTip(mouseX, mouseY);
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.renderEngine.bindTexture(texture);
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize) / 2;
            this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
            zLevel = 100.0F;

            TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
            if (te != null) {
                if (te instanceof BlockArchiveSorterTop.TileEntityArchiveSorterTop){
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackPrecambrian) {
                        this.drawTexturedModalRect(k + 68, l + 28, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69, l + 37, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackCambrian) {
                        this.drawTexturedModalRect(k + 68, l + 59, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69, l + 68, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackOrdovician) {
                        this.drawTexturedModalRect(k + 68, l + 90, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69, l + 99, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackSilurian) {
                        this.drawTexturedModalRect(k + 68, l + 121, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69, l + 130, 21,239, 16, 16);
                    }

                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackDevonian) {
                        this.drawTexturedModalRect(k + 68 + 80, l + 28, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 80, l + 37, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackCarboniferous) {
                        this.drawTexturedModalRect(k + 68 + 80, l + 59, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 80, l + 68, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackPermian) {
                        this.drawTexturedModalRect(k + 68 + 80, l + 90, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 80, l + 99, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackTriassic) {
                        this.drawTexturedModalRect(k + 68 + 80, l + 121, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 80, l + 130, 21,239, 16, 16);
                    }

                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackJurassic) {
                        this.drawTexturedModalRect(k + 68 + 160, l + 28, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 160, l + 37, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackCretaceous) {
                        this.drawTexturedModalRect(k + 68 + 160, l + 59, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 160, l + 68, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackPaleogene) {
                        this.drawTexturedModalRect(k + 68 + 160, l + 90, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 160, l + 99, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackNeogene) {
                        this.drawTexturedModalRect(k + 68 + 160, l + 121, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 160, l + 130, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackPleistocene) {
                        this.drawTexturedModalRect(k + 68 + 160, l + 152, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 160, l + 161, 21,239, 16, 16);
                    }
                    if (((BlockArchiveSorterTop.TileEntityArchiveSorterTop)te).stackOther) {
                        this.drawTexturedModalRect(k + 68 + 160, l + 183, 0,240, 18, 8);
                        this.drawTexturedModalRect(k + 69 + 160, l + 192, 21,239, 16, 16);
                    }
                }
            }

        }

        @Override
        public void updateScreen() {
            super.updateScreen();
        }

        @Override
        protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
            super.mouseClicked(mouseX, mouseY, mouseButton);

            //Toggle buttons:
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize) / 2;

            if (mouseButton == 0 || mouseButton == 1) {
                if (mouseX >= k + 69 && mouseX <= k + 87
                        && mouseY >= l + 28 && mouseY <= l + 36)
                {
                    swapStackState(1);
                }
                else if (mouseX >= k + 69 && mouseX <= k + 87
                        && mouseY >= l + 59 && mouseY <= l + 67)
                {
                    swapStackState(2);
                }
                else if (mouseX >= k + 69 && mouseX <= k + 87
                        && mouseY >= l + 90 && mouseY <= l + 98)
                {
                    swapStackState(3);
                }
                else if (mouseX >= k + 69 && mouseX <= k + 87
                        && mouseY >= l + 121 && mouseY <= l + 129)
                {
                    swapStackState(4);
                }

                else if (mouseX >= k + 69 + 80 && mouseX <= k + 87 + 80
                        && mouseY >= l + 28 && mouseY <= l + 36)
                {
                    swapStackState(5);
                }
                else if (mouseX >= k + 69 + 80 && mouseX <= k + 87 + 80
                        && mouseY >= l + 59 && mouseY <= l + 67)
                {
                    swapStackState(6);
                }
                else if (mouseX >= k + 69 + 80 && mouseX <= k + 87 + 80
                        && mouseY >= l + 90 && mouseY <= l + 98)
                {
                    swapStackState(7);
                }
                else if (mouseX >= k + 69 + 80 && mouseX <= k + 87 + 80
                        && mouseY >= l + 121 && mouseY <= l + 129)
                {
                    swapStackState(8);
                }

                else if (mouseX >= k + 69 + 160 && mouseX <= k + 87 + 160
                        && mouseY >= l + 28 && mouseY <= l + 36)
                {
                    swapStackState(9);
                }
                else if (mouseX >= k + 69 + 160 && mouseX <= k + 87 + 160
                        && mouseY >= l + 59 && mouseY <= l + 67)
                {
                    swapStackState(10);
                }
                else if (mouseX >= k + 69 + 160 && mouseX <= k + 87 + 160
                        && mouseY >= l + 90 && mouseY <= l + 98)
                {
                    swapStackState(11);
                }
                else if (mouseX >= k + 69 + 160 && mouseX <= k + 87 + 160
                        && mouseY >= l + 121 && mouseY <= l + 129)
                {
                    swapStackState(12);
                }
                else if (mouseX >= k + 69 + 160 && mouseX <= k + 87 + 160
                        && mouseY >= l + 152 && mouseY <= l + 160)
                {
                    swapStackState(13);
                }
                else if (mouseX >= k + 69 + 160 && mouseX <= k + 87 + 160
                        && mouseY >= l + 183 && mouseY <= l + 191)
                {
                    swapStackState(14);
                }
            }

        }
        
        public void swapStackState(int period) {
            TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
            if (te == null) {
                return;
            }
            if (!(te instanceof BlockArchiveSorterTop.TileEntityArchiveSorterTop)) {
                return;
            }

            this.mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));

            BlockArchiveSorterTop.TileEntityArchiveSorterTop tileEntity = (BlockArchiveSorterTop.TileEntityArchiveSorterTop) te;
            switch (period) {
                case 0: default:
                    return;
                    
                case 1:
                    if (tileEntity.stackPrecambrian) {
                        tileEntity.stackPrecambrian = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(1, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackPrecambrian) {
                        tileEntity.stackPrecambrian = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(1, true, x, y, z));
                        return;
                    }

                case 2:
                    if (tileEntity.stackCambrian) {
                        tileEntity.stackCambrian = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(2, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackCambrian) {
                        tileEntity.stackCambrian = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(2, true, x, y, z));
                        return;
                    }

                case 3:
                    if (tileEntity.stackOrdovician) {
                        tileEntity.stackOrdovician = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(3, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackOrdovician) {
                        tileEntity.stackOrdovician = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(3, true, x, y, z));
                        return;
                    }

                case 4:
                    if (tileEntity.stackSilurian) {
                        tileEntity.stackSilurian = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(4, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackSilurian) {
                        tileEntity.stackSilurian = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(4, true, x, y, z));
                        return;
                    }

                case 5:
                    if (tileEntity.stackDevonian) {
                        tileEntity.stackDevonian = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(5, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackDevonian) {
                        tileEntity.stackDevonian = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(5, true, x, y, z));
                        return;
                    }

                case 6:
                    if (tileEntity.stackCarboniferous) {
                        tileEntity.stackCarboniferous = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(6, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackCarboniferous) {
                        tileEntity.stackCarboniferous = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(6, true, x, y, z));
                        return;
                    }

                case 7:
                    if (tileEntity.stackPermian) {
                        tileEntity.stackPermian = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(7, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackPermian) {
                        tileEntity.stackPermian = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(7, true, x, y, z));
                        return;
                    }

                case 8:
                    if (tileEntity.stackTriassic) {
                        tileEntity.stackTriassic = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(8, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackTriassic) {
                        tileEntity.stackTriassic = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(8, true, x, y, z));
                        return;
                    }

                case 9:
                    if (tileEntity.stackJurassic) {
                        tileEntity.stackJurassic = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(9, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackJurassic) {
                        tileEntity.stackJurassic = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(9, true, x, y, z));
                        return;
                    }

                case 10:
                    if (tileEntity.stackCretaceous) {
                        tileEntity.stackCretaceous = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(10, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackCretaceous) {
                        tileEntity.stackCretaceous = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(10, true, x, y, z));
                        return;
                    }

                case 11:
                    if (tileEntity.stackPaleogene) {
                        tileEntity.stackPaleogene = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(11, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackPaleogene) {
                        tileEntity.stackPaleogene = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(11, true, x, y, z));
                        return;
                    }

                case 12:
                    if (tileEntity.stackNeogene) {
                        tileEntity.stackNeogene = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(12, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackNeogene) {
                        tileEntity.stackNeogene = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(12, true, x, y, z));
                        return;
                    }

                case 13:
                    if (tileEntity.stackPleistocene) {
                        tileEntity.stackPleistocene = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(13, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackPleistocene) {
                        tileEntity.stackPleistocene = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(13, true, x, y, z));
                        return;
                    }

                case 14:
                    if (tileEntity.stackOther) {
                        tileEntity.stackOther = false;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(14, false, x, y, z));
                        return;
                    }
                    if (!tileEntity.stackOther) {
                        tileEntity.stackOther = true;
                        LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIArchiveSorterTop.GUIArchiveSorterTopMessage(14, true, x, y, z));
                        return;
                    }
                    
            }
        }

        @Override
        protected void keyTyped(char typedChar, int keyCode) throws IOException {
            super.keyTyped(typedChar, keyCode);
        }

        @Override
        protected void drawGuiContainerForegroundLayer(int par1, int par2) {
            this.fontRenderer.drawString("Archive Sorting Chamber", 35, -26, 4210752);
            this.fontRenderer.drawString("Inventory", -26, 110, 4210752);
//            this.fontRenderer.drawString("Slots can", 145, 156, 4210752);
//            this.fontRenderer.drawString("be locked", 145, 164, 4210752);
//            this.fontRenderer.drawString("or unlocked", 145, 172, 4210752);
//            this.fontRenderer.drawString("for use", 145, 180, 4210752);

            this.fontRenderer.drawString("Pre-", 2, 0, 4210752);
            this.fontRenderer.drawString("cambrian", -18, 8, 4210752);
            this.fontRenderer.drawString("Cambrian", -18, 34, 4210752);
            this.fontRenderer.drawString("Ordovician", -26, 65, 4210752);
            this.fontRenderer.drawString("Silurian", -11, 96, 4210752);

            this.fontRenderer.drawString("Devonian", 62, 3, 4210752);
            this.fontRenderer.drawString("Carbon-", 64, 30, 4210752);
            this.fontRenderer.drawString("iferous", 68, 38, 4210752);
            this.fontRenderer.drawString("Permian", 67, 65, 4210752);
            this.fontRenderer.drawString("Triassic", 66, 96, 4210752);

            this.fontRenderer.drawString("Jurassic", 142, 3, 4210752);
            this.fontRenderer.drawString("Cretaceous", 128, 34, 4210752);
            this.fontRenderer.drawString("Palaeogene", 136, 65, 4210752);
            this.fontRenderer.drawString("Neogene", 143, 96, 4210752);
            this.fontRenderer.drawString("Pleisto-", 147, 123, 4210752);
            this.fontRenderer.drawString("cene", 161, 131, 4210752);
            this.fontRenderer.drawString("OTHER", 143, 158, 4210752);
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

    public static class GUIArchiveSorterTopMessageHandler implements IMessageHandler<GUIArchiveSorterTop.GUIArchiveSorterTopMessage, IMessage> {
        @Override
        public IMessage onMessage(GUIArchiveSorterTop.GUIArchiveSorterTopMessage message, MessageContext context) {

            EntityPlayerMP entity = context.getServerHandler().player;
            TileEntity te = entity.getServerWorld().getTileEntity(new BlockPos(message.x,message.y, message.z));
            if (te != null) {
                if (te instanceof BlockArchiveSorterTop.TileEntityArchiveSorterTop) {
                    switch (message.slot) {
                        case 0: default:
                            break;

                        case 1:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackPrecambrian = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 2:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackCambrian = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 3:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackOrdovician = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 4:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackSilurian = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 5:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackDevonian = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 6:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackCarboniferous = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 7:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackPermian = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 8:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackTriassic = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 9:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackJurassic = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 10:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackCretaceous = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 11:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackPaleogene = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 12:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackNeogene = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 13:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackPleistocene = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;

                        case 14:
                            ((BlockArchiveSorterTop.TileEntityArchiveSorterTop) te).stackOther = message.value;
                            te.getWorld().notifyBlockUpdate(te.getPos(), te.getWorld().getBlockState(te.getPos()), te.getWorld().getBlockState(te.getPos()), 3);
                            te.markDirty();
                            break;
                    }
                }
            }
            return null;
        }
    }

    public static class GUIArchiveSorterTopMessage implements IMessage {
        int slot;
        boolean value;
        int x, y, z;
        public GUIArchiveSorterTopMessage() {
        }

        public GUIArchiveSorterTopMessage(int slot, boolean value, int x, int y, int z) {
            this.slot = slot;
            this.value = value;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public void toBytes(io.netty.buffer.ByteBuf buf) {
            buf.writeInt(slot);
            buf.writeBoolean(value);
            buf.writeInt(x);
            buf.writeInt(y);
            buf.writeInt(z);
        }

        @Override
        public void fromBytes(io.netty.buffer.ByteBuf buf) {
            slot = buf.readInt();
            value = buf.readBoolean();
            x = buf.readInt();
            y = buf.readInt();
            z = buf.readInt();
        }
    }
}
