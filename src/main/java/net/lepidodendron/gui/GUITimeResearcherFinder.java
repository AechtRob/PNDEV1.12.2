package net.lepidodendron.gui;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.item.*;
import net.lepidodendron.util.AcidBathOutputMobs;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.lepidodendron.util.AcidBathOutputStatics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@ElementsLepidodendronMod.ModElement.Tag
public class GUITimeResearcherFinder extends ElementsLepidodendronMod.ModElement {
    public static int GUIID = LepidodendronMod.GUI_TIME_RESEARCHER_FINDER_ID;
    public static HashMap guistate = new HashMap();
    public GUITimeResearcherFinder(ElementsLepidodendronMod instance) {
        super(instance, 1);
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
        elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
        elements.addNetworkMessage(GUILifeChangedMessageHandler.class, GUILifeChangedMessage.class, Side.SERVER);
    }

    public static class GUILepidodendronTimeResearcherFinder extends Container implements Supplier<Map<Integer, Slot>> {
        private IInventory internal;
        public static World world;
        private EntityPlayer entity;
        public static int x, y, z;
        private Map<Integer, Slot> customSlots = new HashMap<>();

        public GUILepidodendronTimeResearcherFinder(World world, int x, int y, int z, EntityPlayer player) {
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

            this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 18, 36) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    if (ent instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
                        BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom te = (BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) ent;
                        return te.isItemValidForSlot(0, stack);
                    }
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }
            }));
            this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 80, 68) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return false;
                }
            }));
            this.customSlots.put(2, this.addSlotToContainer(new Slot(internal, 2, 134, 45) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }
            }));
            this.customSlots.put(3, this.addSlotToContainer(new Slot(internal, 3, 152, 45) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }
            }));
            this.customSlots.put(4, this.addSlotToContainer(new Slot(internal, 4, 134, 63) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return false;
                }

                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return true;
                }
            }));
            this.customSlots.put(5, this.addSlotToContainer(new Slot(internal, 5, 152, 63) {
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
                    this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 99 + si * 18));
            for (si = 0; si < 9; ++si)
                this.addSlotToContainer(new Slot(player.inventory, si, 0 + 8 + si * 18, 0 + 157));

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
            super(new GUILepidodendronTimeResearcherFinder(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.xSize = 182;
            this.ySize = 196;
        }
        private static final ResourceLocation texture = new ResourceLocation("lepidodendron:textures/gui/time_researcher_finder_gui.png");

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
            this.drawTexturedModalRect(k + 68, l + 55, 19,196, this.getProgressBarLength(), 6);
            if (LepidodendronConfig.machinesRF) {
                this.drawTexturedModalRect(k + 20, l + 76, 0,196, 18, 26);
                this.drawTexturedModalRect(k + 21, l + 77 + (24 - this.getRFHeight()), 0, 222, 16, this.getRFHeight());
            }
            if (renderZap()) {
                this.drawTexturedModalRect(k + 76, l + 81, 19,222, 30, 12);
            }
        }

        private boolean renderZap() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
                    return ((BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom)tileEntity).renderZap;
                }
            }
            return false;
        }

        private int getRFHeight() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
                    BlockPos RFStorage = new BlockPos(x, y + 1, z);
                    RFStorage = RFStorage.offset(world.getBlockState(new BlockPos(x, y, z)).getValue(BlockTimeResearcher.BlockCustom.FACING).rotateY());
                    TileEntity tileEntity2 = world.getTileEntity(RFStorage);
                    if (tileEntity2 != null) {
                        if (tileEntity2 instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
                            BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity2;
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
                if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
                    BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
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
            this.fontRenderer.drawString("Fossil Searcher", 35, -6, 4210752);
            this.fontRenderer.drawString("Searching for:", 50, 12, 4210752);
            String mob = "- NONE -";
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
                    BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom te = (BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) tileEntity;
                    mob = te.getSelectedLife();
                }
            }
            if (!(mob.equalsIgnoreCase("- NONE -"))) {
                mob = translateMob(mob);
            }
            int xPos = (this.fontRenderer.getStringWidth(mob) / 2);
            this.fontRenderer.drawString(mob, 88 - xPos, 22, 4210752);
            DecimalFormat df = new DecimalFormat("#0.##%");
            xPos = (this.fontRenderer.getStringWidth(df.format(getProbability())) / 2);
            this.fontRenderer.drawString(df.format(getProbability()), 89 - xPos, 57, 4210752);
        }

        public double getProbability() {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
                    BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom te = (BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) tileEntity;
                    String mob = te.getSelectedLife();
                    if (te.getStackInSlot(1).getItem() == ItemFossilPrecambrian.block
                        || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPrecambrian.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(1);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilCambrian.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCambrian.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getCambrianCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getCambrianCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getCambrianCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(2);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilOrdovician.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilOrdovician.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(3);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilSilurian.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilSilurian.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getSilurianCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getSilurianCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getSilurianCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(4);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilDevonian.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilDevonian.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getDevonianCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getDevonianCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getDevonianCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(5);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilCarboniferous.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCarboniferous.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(6);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilPermian.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPermian.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getPermianCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getPermianCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getPermianCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(7);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilTriassic.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilTriassic.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getTriassicCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getTriassicCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getTriassicCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(8);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilJurassic.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilJurassic.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getJurassicCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getJurassicCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getJurassicCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(9);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilCretaceous.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCretaceous.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getCretaceousCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getCretaceousCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(10);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilPaleogene.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPaleogene.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(11);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilCambrian.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilNeogene.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getNeogeneCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getNeogeneCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(12);
                        }
                    }
                    if (te.getStackInSlot(1).getItem() == ItemFossilCambrian.block
                            || te.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPleistocene.block)) {
                        if (Arrays.stream(AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()).anyMatch(m -> m.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants()).anyMatch(p -> p.equalsIgnoreCase(mob))
                                || Arrays.stream(AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics()).anyMatch(s -> s.equalsIgnoreCase(mob))
                        ) {
                            return getPercent(13);
                        }
                    }
                }
            }
            return 0.0D;
        }

        @Nullable
        private float getPercent(int dimIn) {
            EnumFacing facing = world.getBlockState(new BlockPos(x, y, z)).getValue(BlockTimeResearcherFinderBottom.BlockCustom.FACING);
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y +  1, z).offset(facing.rotateY()));
            if (tileEntity != null) {
                if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
                    BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
                    return BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom.actualProbablity(te.getResearchPercent(dimIn));
                }
            }
            return 0;
        }

        public String translateMob(String mobIn) {
            if (mobIn.equalsIgnoreCase("- NONE -") || mobIn.equalsIgnoreCase("")) {
                mobIn = "- NONE -";
            }
            else if (mobIn.substring(0,10).equalsIgnoreCase("minecraft:")) {
                mobIn = mobIn.replace("@", "_").substring(10);
            }
            else {
                mobIn = mobIn.replace("@", "_").substring(LepidodendronMod.MODID.length() + 1);
            }

            String name = "entity." + mobIn + ".name";
            name = net.minecraft.util.text.translation.I18n.translateToLocal(name);
            if (name.equalsIgnoreCase("entity." + mobIn + ".name")) {
                name = "tile.pf_" + mobIn + ".name";
                name = net.minecraft.util.text.translation.I18n.translateToLocal(name);
            }
            if (name.equalsIgnoreCase("tile.pf_" + mobIn + ".name")) {
                name = "item.pf_" + mobIn + ".name";
                name = net.minecraft.util.text.translation.I18n.translateToLocal(name);
            }
            if (name.equalsIgnoreCase("item.pf_" + mobIn + ".name")) {
                name = mobIn;
            }

            return name;
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
            this.buttonList.add(new GuiButtonLife(0, this.width / 2 + 32, this.guiTop - 9));

        }

        @Override
        protected void actionPerformed(GuiButton button) {
            LepidodendronMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.id, x, y, z));
            if (button.id == 0)
            {
                TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
                if (tileEntity != null) {
                    if (tileEntity instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
                        this.mc.displayGuiScreen(new GUITimeResearcherFinderSelector(this,  (BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) tileEntity));
                    }
                }
            }
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


    public static class GUILifeChangedMessageHandler implements IMessageHandler<GUILifeChangedMessage, IMessage> {
        @Override
        public IMessage onMessage(GUILifeChangedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().player;
            TileEntity te = entity.getServerWorld().getTileEntity(new BlockPos(message.x,message.y, message.z));
            if (te != null) {
                if (te instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
                    ((BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) te).setSelectedLife(message.mobID);
                    ((BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) te).markDirty();
                }
            }
            return null;
        }
    }

    public static class GUILifeChangedMessage implements IMessage {
        String mobID;
        int x, y, z;
        public GUILifeChangedMessage() {
        }

        public GUILifeChangedMessage(String mobID, int x, int y, int z) {
            this.mobID = mobID;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public void toBytes(io.netty.buffer.ByteBuf buf) {
            ByteBufUtils.writeUTF8String(buf, mobID);
            buf.writeInt(x);
            buf.writeInt(y);
            buf.writeInt(z);
        }

        @Override
        public void fromBytes(io.netty.buffer.ByteBuf buf) {
            mobID = ByteBufUtils.readUTF8String(buf);
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

    public static class GuiButtonLife extends GuiButton {
        public GuiButtonLife(int buttonID, int xPos, int yPos) {
            super(buttonID, xPos, yPos, 16, 16, "");
        }

        public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
            if (this.visible) {
                mc.getTextureManager().bindTexture(GuiWindow.texture);
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                this.drawTexturedModalRect(this.x, this.y, 22,204, this.width, this.height);
            }
        }
    }
}
