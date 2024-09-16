package net.lepidodendron.gui;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDNARecombinerCentrifuge;
import net.lepidodendron.block.BlockDNARecombinerForge;
import net.lepidodendron.item.ItemOligoPool;
import net.lepidodendron.item.ItemPlaceableLiving;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
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
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@ElementsLepidodendronMod.ModElement.Tag
public class GUIDNAForge extends ElementsLepidodendronMod.ModElement {
    public static int GUIID = LepidodendronMod.GUI_FORGE_ID;
    public static HashMap guistate = new HashMap();
    public GUIDNAForge(ElementsLepidodendronMod instance) {
        super(instance, 1);
    }

    public static class GUILepidodendronDNAForge extends Container implements Supplier<Map<Integer, Slot>> {
        private IInventory internal;
        private World world;
        private EntityPlayer entity;
        private int x, y, z;
        private Map<Integer, Slot> customSlots = new HashMap<>();

        public GUILepidodendronDNAForge(World world, int x, int y, int z, EntityPlayer player) {
            this.world = world;
            this.entity = player;
            this.x = x;
            this.y = y;
            this.z = z;
            this.internal = new InventoryBasic("", true, 7);
            TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
            if (ent instanceof IInventory)
                this.internal = (IInventory) ent;

            this.internal.openInventory(player);

            this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 82 - 3, 56) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return false;
                }
            }));
            this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 21 - 3, 21) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return (stack.getItem() == ItemOligoPool.block);
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }
            }));
            this.customSlots.put(2, this.addSlotToContainer(new Slot(internal, 2, 82 - 3, 34) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return false;
                }
            }));
            this.customSlots.put(3, this.addSlotToContainer(new Slot(internal, 3, 137 - 3, 30) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }

                @Override
                public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
                    if (thePlayer instanceof EntityPlayerMP && stack.getItem() == ItemPlaceableLiving.block) {
                        ModTriggers.REJUVENATE.trigger((EntityPlayerMP) thePlayer);
                    }
                    return super.onTake(thePlayer, stack);
                }
            }));
            this.customSlots.put(4, this.addSlotToContainer(new Slot(internal, 4, 155 - 3, 30) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }

                @Override
                public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
                    if (thePlayer instanceof EntityPlayerMP && stack.getItem() == ItemPlaceableLiving.block) {
                        ModTriggers.REJUVENATE.trigger((EntityPlayerMP) thePlayer);
                    }
                    return super.onTake(thePlayer, stack);
                }
            }));
            this.customSlots.put(5, this.addSlotToContainer(new Slot(internal, 5, 137 - 3, 48) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }

                @Override
                public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
                    if (thePlayer instanceof EntityPlayerMP && stack.getItem() == ItemPlaceableLiving.block) {
                        ModTriggers.REJUVENATE.trigger((EntityPlayerMP) thePlayer);
                    }
                    return super.onTake(thePlayer, stack);
                }
            }));
            this.customSlots.put(6, this.addSlotToContainer(new Slot(internal, 6, 155 - 3, 48) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }

                @Override
                public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
                    if (thePlayer instanceof EntityPlayerMP && stack.getItem() == ItemPlaceableLiving.block) {
                        ModTriggers.REJUVENATE.trigger((EntityPlayerMP) thePlayer);
                    }
                    return super.onTake(thePlayer, stack);
                }
            }));

            int si;
            int sj;
            for (si = 0; si < 3; ++si)
                for (sj = 0; sj < 9; ++sj)
                    this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
            for (si = 0; si < 9; ++si)
                this.addSlotToContainer(new Slot(player.inventory, si, 0 + 8 + si * 18, 0 + 142));

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
                if (index < 7) {
                    if (!this.mergeItemStack(itemstack1, 4, this.inventorySlots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                    slot.onSlotChange(itemstack1, itemstack);
                } else if (!this.mergeItemStack(itemstack1, 0, 7, false)) {
                    if (index < 7 + 27) {
                        if (!this.mergeItemStack(itemstack1, 7 + 27, this.inventorySlots.size(), true)) {
                            return ItemStack.EMPTY;
                        }
                    } else {
                        if (!this.mergeItemStack(itemstack1, 7, 7 + 27, false)) {
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
            super(new GUILepidodendronDNAForge(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.xSize = 182;
            this.ySize = 166;
        }
        private static final ResourceLocation texture = new ResourceLocation("lepidodendron:textures/gui/dna_forge_gui.png");
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
                    && mouseY >= l + 51 - 8 && mouseY <= l + 51 - 8 + 26)
            {
                DecimalFormat df = new DecimalFormat("###,###,###");
                this.drawHoveringText(df.format(this.getCurrentRF()) + " / " + df.format(this.getMaxRF()) + " RF", mouseX, mouseY);
            }
        }

        private int getCurrentRF() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
                    BlockPos RFStorage = new BlockPos(x, y, z);
                    RFStorage = RFStorage.offset(world.getBlockState(new BlockPos(x, y, z)).getValue(BlockDNARecombinerForge.BlockCustom.FACING).rotateY());
                    TileEntity tileEntity2 = world.getTileEntity(RFStorage);
                    if (tileEntity2 != null) {
                        if (tileEntity2 instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
                            BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity2;
                            //return (int)Math.round(te.progressFraction() * 70D);
                            return te.getEnergyStored();
                        }
                    }
                }
            }
            return 0;
        }

        private int getMaxRF() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
                    BlockPos RFStorage = new BlockPos(x, y, z);
                    RFStorage = RFStorage.offset(world.getBlockState(new BlockPos(x, y, z)).getValue(BlockDNARecombinerForge.BlockCustom.FACING).rotateY());
                    TileEntity tileEntity2 = world.getTileEntity(RFStorage);
                    if (tileEntity2 != null) {
                        if (tileEntity2 instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
                            BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity2;
                            //return (int)Math.round(te.progressFraction() * 70D);
                            return te.getMaxEnergyStored();
                        }
                    }
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
            this.drawTexturedModalRect(k + 68, l + 25, 19,166, this.getProgressBarLength(), 6);
            if (LepidodendronConfig.machinesRF) {
                this.drawTexturedModalRect(k + 20, l + 51 - 8, 0,166, 18, 26);
                this.drawTexturedModalRect(k + 21, l + 52 + (24 - this.getRFHeight()) - 8, 0, 192, 16, this.getRFHeight());
            }
        }

        private int getRFHeight() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
                    BlockPos RFStorage = new BlockPos(x, y, z);
                    RFStorage = RFStorage.offset(world.getBlockState(new BlockPos(x, y, z)).getValue(BlockDNARecombinerForge.BlockCustom.FACING).rotateY());
                    TileEntity tileEntity2 = world.getTileEntity(RFStorage);
                    if (tileEntity2 != null) {
                        if (tileEntity2 instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
                            BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity2;
                            //return (int)Math.round(te.progressFraction() * 70D);
                            double fraction = te.getEnergyFraction();
                            return (int) Math.round(fraction * 24D);
                        }
                    }
                }
            }
            return 0;
        }

        private int getProgressBarLength() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
                    BlockDNARecombinerForge.TileEntityDNARecombinerForge te = (BlockDNARecombinerForge.TileEntityDNARecombinerForge) tileEntity;
                    return (int)Math.round(te.progressFraction() * 46D);
                }
            }
            return 0;
        }

        @Override
        public void updateScreen() {
            super.updateScreen();
        }

        @Override
        protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
            super.mouseClicked(mouseX, mouseY, mouseButton);
        }

        @Override
        protected void keyTyped(char typedChar, int keyCode) throws IOException {
            super.keyTyped(typedChar, keyCode);
        }

        @Override
        protected void drawGuiContainerForegroundLayer(int par1, int par2) {
            this.fontRenderer.drawString("DNA Oligo-Forge", 53, 7, 4210752);
            this.fontRenderer.drawString("Inventory", 8, 72, 4210752);
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
}
