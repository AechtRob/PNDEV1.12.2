package net.lepidodendron.gui;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockTrapWater;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.TrapSpawner;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
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

import javax.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

@ElementsLepidodendronMod.ModElement.Tag
public class GUITrapWater extends ElementsLepidodendronMod.ModElement {
    public static int GUIID = LepidodendronMod.GUI_TRAP_WATER_ID;
    public static HashMap guistate = new HashMap();
    public GUITrapWater(ElementsLepidodendronMod instance) {
        super(instance, 1);
    }
    private static final Class[] params = new Class[1];

    public static class GUILepidodendronTrapWater extends Container implements Supplier<Map<Integer, Slot>> {
        private IInventory internal;
        private World world;
        private EntityPlayer entity;
        private int x, y, z;
        private Map<Integer, Slot> customSlots = new HashMap<>();

        public GUILepidodendronTrapWater(World world, int x, int y, int z, EntityPlayer player) {
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

            this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 80, 81) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    if (ent instanceof BlockTrapWater.TileEntityTrapWater) {
                        BlockTrapWater.TileEntityTrapWater te = (BlockTrapWater.TileEntityTrapWater) ent;
                        return te.isItemValidForSlot(0, stack);
                    }
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
                    this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 0 + 8 + sj * 18, (0 + 84 + si * 18 + 35) - 18));
            for (si = 0; si < 9; ++si)
                this.addSlotToContainer(new Slot(player.inventory, si, 0 + 8 + si * 18, 0 + 142 + 17));

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
                if (index < 1) {
                    if (!this.mergeItemStack(itemstack1, 1, this.inventorySlots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                    slot.onSlotChange(itemstack1, itemstack);
                } else if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
                    if (index < 1 + 27) {
                        if (!this.mergeItemStack(itemstack1, 1 + 27, this.inventorySlots.size(), true)) {
                            return ItemStack.EMPTY;
                        }
                    } else {
                        if (!this.mergeItemStack(itemstack1, 1, 1 + 27, false)) {
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
            super(new GUILepidodendronTrapWater(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.xSize = 176;
            this.ySize = 166 + 35;
        }
        private static final ResourceLocation texture = new ResourceLocation("lepidodendron:textures/gui/trap_air_gui.png");
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
            //Entity render:
            if (getEntity() != null) {
                String PNVariant = null;
                float getScaler = 100;
                Class classEntity = getEntity().getClass();
                params[0] = String.class;

//                Method method = Functions.testAndGetMethod(classEntity, "hasPNVariants", null);
//                if (method != null) {
//                    try {
//                        getScaler = (float) method.invoke(null, PNVariant) * 100;
//                    } catch (Exception e) {
//                        getScaler = 100;
//                    }
//                } else {
//                    getScaler = 100;
//                }

                params[0] = String.class;
                Method method = Functions.testAndGetMethod(classEntity, "getScaler", params);
                if (method != null) {
                    try {
                        getScaler = (float) method.invoke(null, PNVariant) * 100;
                    } catch (Exception e) {
                        getScaler = 100;
                    }
                } else {
                    getScaler = 100;
                }

                this.drawEntityOnScreen(k + (this.xSize/2) , l + (int)(this.ySize * 0.190 ), (int)Math.max(getScaler,50), 0, 0, this.getEntity());
            }
        }

        public static void drawEntityOnScreen(int posX, int posY, int scale, float mouseX, float mouseY, EntityLivingBase ent)
        {
            GlStateManager.enableColorMaterial();
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)posX, (float)posY, 50.0F);
            GlStateManager.scale((float)(-scale), (float)scale, (float)scale);
            GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
            float f = ent.renderYawOffset;
            float f1 = ent.rotationYaw;
            float f2 = ent.rotationPitch;
            float f3 = ent.prevRotationYawHead;
            float f4 = ent.rotationYawHead;
            GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
            RenderHelper.enableStandardItemLighting();
            GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(-((float)Math.atan((double)(mouseY / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
            ent.renderYawOffset = (float)Math.atan((double)(mouseX / 40.0F)) * 20.0F;
            ent.rotationYaw = (float)Math.atan((double)(mouseX / 40.0F)) * 40.0F;
            ent.rotationPitch = -((float)Math.atan((double)(mouseY / 40.0F))) * 20.0F;
            ent.rotationYawHead = ent.rotationYaw;
            ent.prevRotationYawHead = ent.rotationYaw;
            GlStateManager.translate(0.0F, 0.0F, 0.0F);
            RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
            rendermanager.setPlayerViewY(180.0F);
            GlStateManager.rotate(60.0F, 1.0F, 1.0F, 0.0F);
            GlStateManager.rotate(-10.0F, 1.0F, 0.0F, 1.0F);
            rendermanager.setRenderShadow(false);
            rendermanager.renderEntity(ent, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
            rendermanager.setRenderShadow(true);
            ent.renderYawOffset = f;
            ent.rotationYaw = f1;
            ent.rotationPitch = f2;
            ent.prevRotationYawHead = f3;
            ent.rotationYawHead = f4;
            GlStateManager.popMatrix();
            RenderHelper.disableStandardItemLighting();
            GlStateManager.disableRescaleNormal();
            GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GlStateManager.disableTexture2D();
            GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        }

        @Nullable
        private EntityLivingBase getEntity() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTrapWater.TileEntityTrapWater) {
                    BlockTrapWater.TileEntityTrapWater te = (BlockTrapWater.TileEntityTrapWater) tileEntity;
                    return te.getTrapped(world, new BlockPos(x, y, z));
                }
            }
            return null;
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
            this.fontRenderer.drawString("Water Creature Trap", 35, 7 - 16, 4210752);
            if (this.getEntity() != null) {
                this.fontRenderer.drawString("Power the block", 50, 18 + 40 - 19, 4210752);
                this.fontRenderer.drawString("to release the trapped", 31,
                        28 + 40 - 19, 4210752);
                this.fontRenderer.drawString(this.getEntity().getName().toString(),
                        (int)(this.xSize - (this.getEntity().getName().toString().length() * 5.25))/2,
                        38 + 40 - 19, 4210752);
                this.fontRenderer.drawString("or click with a bucket to collect it", 12,
                        48 + 40 - 19, 4210752);
            }
            else {
                this.fontRenderer.drawString("Bait the trap below", 40, 28 + 37 - 15, 4210752);
                this.fontRenderer.drawString("to catch something:", 40, 28 + 47 - 15, 4210752);
                ItemStack itemstack = ItemStack.EMPTY;
                Slot slot = (Slot) this.inventorySlots.getSlot(0);
                String baitStr = "";
                if (slot != null) {
                    if (slot.getHasStack()) {
                        itemstack = slot.getStack();
                    }
                    try {
                        baitStr = TrapSpawner.testBait(world, new BlockPos(x, y, z), new Random(), itemstack, 3);
                    } catch (InstantiationException e) {
                        //do nothing
                    } catch (IllegalAccessException e) {
                        //do nothing
                    }
                }
                this.fontRenderer.drawString(baitStr,
                        (int)(this.xSize - (baitStr.length() * 4.5))/2,
                        28 + 57 - 15, 4210752);
            }
            this.fontRenderer.drawString("Inventory", 8, 72 + 40 - 20, 4210752);
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
