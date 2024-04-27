package net.lepidodendron.gui;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockTimeResearcher;
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
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@ElementsLepidodendronMod.ModElement.Tag
public class GUITimeResearcher extends ElementsLepidodendronMod.ModElement {
    public static int GUIID = LepidodendronMod.GUI_TIME_RESEARCHER_ID;
    public static HashMap guistate = new HashMap();
    public GUITimeResearcher(ElementsLepidodendronMod instance) {
        super(instance, 1);
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
        elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
    }

    public static class GUILepidodendronTimeResearcher extends Container implements Supplier<Map<Integer, Slot>> {
        private IInventory internal;
        private World world;
        private EntityPlayer entity;
        private int x, y, z;
        private Map<Integer, Slot> customSlots = new HashMap<>();

        public GUILepidodendronTimeResearcher(World world, int x, int y, int z, EntityPlayer player) {
            this.world = world;
            this.entity = player;
            this.x = x;
            this.y = y;
            this.z = z;
            this.internal = new InventoryBasic("", true, 1);
            TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
            if (ent instanceof IInventory)
                this.internal = (IInventory) ent;

            this.internal.openInventory(player);

            this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 59 - 3, 39) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    if (ent instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
                        BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) ent;
                        return te.isItemValidForSlot(0, stack);
                    }
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return false;
                }
            }));

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
            return itemstack;
        }

        @Override /**
         * Merges provided ItemStack with the first avaliable one in the
         * container/player inventor between minIndex (included) and maxIndex
         * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
         * Container implementation do not check if the item is valid for the slot
         */
        protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
            return false;
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
            super(new GUILepidodendronTimeResearcher(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.xSize = 256;
            this.ySize = 196;
        }
        private static final ResourceLocation texture = new ResourceLocation("lepidodendron:textures/gui/time_researcher_gui.png");
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
            //Arrow:
            this.drawTexturedModalRect(k + 79, l + 39, 176, 14, getProgressBarLength(), 16);
        }

        private int getProgressBarLength() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
                    BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
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
        protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
            super.mouseClicked(mouseX, mouseY, mouseButton);
        }

        @Override
        protected void keyTyped(char typedChar, int keyCode) throws IOException {
            super.keyTyped(typedChar, keyCode);
        }

        @Nullable
        private float getPercent(int dimIn) {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
                    BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
                    return te.getResearchPercent(dimIn);
                }
            }
            return 0;
        }
        
        @Override
        protected void drawGuiContainerForegroundLayer(int par1, int par2) {
            this.fontRenderer.drawString("Time Researcher", 46, -3, 4210752);
            this.fontRenderer.drawString("Precambrian", -30, 49, 4210752);
            this.fontRenderer.drawString("Cambrian", -30, 58, 4210752);
            this.fontRenderer.drawString("Ordovician", -30, 67, 4210752);
            this.fontRenderer.drawString("Silurian", -30, 76, 4210752);
            this.fontRenderer.drawString("Devonian", -30, 85, 4210752);
            this.fontRenderer.drawString("Carboniferous", -30, 94, 4210752);
            this.fontRenderer.drawString("Permian", -30, 103, 4210752);
            this.fontRenderer.drawString("Triassic", -30, 112, 4210752);
            this.fontRenderer.drawString("Jurassic", -30, 121, 4210752);
            this.fontRenderer.drawString("E. Cretaceous", -30, 130, 4210752);
            this.fontRenderer.drawString("L. Cretaceous", -30, 139, 4210752);
            this.fontRenderer.drawString("Paleogene", -30, 148, 4210752);
            this.fontRenderer.drawString("Neogene", -30, 157, 4210752);
            this.fontRenderer.drawString("Pleistocene", -30, 166, 4210752);

            DecimalFormat df = new DecimalFormat("#0.00%");
            this.fontRenderer.drawString(df.format(getPercent(1)), 175, 49, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(2)), 175, 58, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(3)), 175, 67, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(4)), 175, 76, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(5)), 175, 85, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(6)), 175, 94, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(7)), 175, 103, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(8)), 175, 112, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(9)), 175, 121, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(10)), 175, 130, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(11)), 175, 139, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(12)), 175, 148, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(13)), 175, 157, 4210752);
            this.fontRenderer.drawString(df.format(getPercent(14)), 175, 166, 4210752);
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
