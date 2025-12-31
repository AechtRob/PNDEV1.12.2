package net.lepidodendron.gui;

import com.google.common.collect.Lists;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.util.AcidBathOutputMobs;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.lepidodendron.util.AcidBathOutputStatics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class GUITimeResearcherFinderSelector extends GuiScreen
{
    protected GuiScreen parentScreen;
    protected BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom tileEntity;
    private GUITimeResearcherFinderSelector.List list;
    private GuiOptionButton confirmSettingsBtn;

    public GUITimeResearcherFinderSelector(GuiScreen screen, BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom te)
    {
        this.parentScreen = screen;
        this.tileEntity = te;
    }

    public void initGui()
    {
        this.confirmSettingsBtn = (GuiOptionButton)this.addButton(new GuiOptionButton(0, this.width / 2 - 75, this.height - 38, I18n.format("gui.done")));
        this.list = new GUITimeResearcherFinderSelector.List(this.mc);
        this.list.registerScrollButtons(7, 8);
    }

    public void handleMouseInput() throws IOException
    {
        super.handleMouseInput();
        this.list.handleMouseInput();
    }

    protected void actionPerformed(GuiButton button) throws IOException
    {
        if (button.enabled)
        {
            switch (button.id)
            {
                case 0:
                    this.mc.displayGuiScreen(this.parentScreen);
                    break;
            }
        }
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.list.drawScreen(mouseX, mouseY, partialTicks);
        this.drawCenteredString(this.fontRenderer, "Select the output you are looking for", this.width / 2, 16, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @SideOnly(Side.CLIENT)
    class List extends GuiSlot
    {
        private final java.util.List<String> lifeList = Lists.<String>newArrayList();

        public List(Minecraft mcIn)
        {
            super(mcIn, GUITimeResearcherFinderSelector.this.width, GUITimeResearcherFinderSelector.this.height, 32, GUITimeResearcherFinderSelector.this.height - 65 + 4, 18);
            this.lifeList.add("- NONE -");
            //Loop over all life possible in the mod and offer here:
            if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPrecambrian.block)
                || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilPrecambrian.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCambrian.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilCambrian.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getCambrianCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getCambrianCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getCambrianCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilOrdovician.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilOrdovician.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilSilurian.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilSilurian.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getSilurianCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getSilurianCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getSilurianCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilDevonian.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilDevonian.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getDevonianCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getDevonianCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getDevonianCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCarboniferous.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilCarboniferous.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPermian.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilPermian.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getPermianCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getPermianCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getPermianCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilTriassic.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilTriassic.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getTriassicCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getTriassicCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getTriassicCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilJurassic.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilJurassic.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getJurassicCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getJurassicCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getJurassicCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCretaceous.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilCretaceous.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getCretaceousCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getCretaceousCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPaleogene.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilPaleogene.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilNeogene.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilNeogene.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getNeogeneCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getNeogeneCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }
            else if (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPleistocene.block)
                    || (GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(0).getItem() == Item.getItemFromBlock(BlockFossilPleistocene.block)
                    && GUITimeResearcherFinderSelector.this.tileEntity.getStackInSlot(1).isEmpty())) {
                for (String stringLife : AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
                for (String stringLife : AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants()) {
                    if (!this.lifeList.contains(stringLife))
                        this.lifeList.add(stringLife);
                }
            }

            Collections.sort(this.lifeList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return translateMob(o1).compareTo(translateMob(o2));
                }
            });

        }
        
        public String translateMob(String mobIn) {
            if (mobIn.equalsIgnoreCase("lepidodendron:sapling")) {
                mobIn = "lepidodendron:lepidodendron_sapling";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:glossopterissapling")) {
                mobIn = "lepidodendron:glossopteris_sapling";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:coral")) {
                mobIn = "lepidodendron:reef_coral";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:stromatoporoidea_reef")) {
                mobIn = "lepidodendron:reef_stromatoporoidea";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:archaeocyatha_reef")) {
                mobIn = "lepidodendron:reef_archaeocyatha";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:glass_sponge_reef")) {
                mobIn = "lepidodendron:reef_glass_sponge";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:sponge_reef")) {
                mobIn = "lepidodendron:reef_sponge";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:algal_reef")) {
                mobIn = "lepidodendron:reef_algal";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:shelly_reef")) {
                mobIn = "lepidodendron:reef_shelly";
            }
            if (mobIn.equalsIgnoreCase("lepidodendron:rudist_reef")) {
                mobIn = "lepidodendron:reef_rudist";
            }
            if (mobIn.equalsIgnoreCase("- NONE -") || mobIn.equalsIgnoreCase("")) {
                mobIn = "- NONE -";
            }
            else if (mobIn.substring(0,10).equalsIgnoreCase("minecraft:")) {
                mobIn = mobIn.replace("@", "_").substring(10);
                if (mobIn.equalsIgnoreCase("acacia_sapling")) {
                    return net.minecraft.util.text.translation.I18n.translateToLocal("tile.sapling.acacia.name");
                }
                if (mobIn.equalsIgnoreCase("birch_sapling")) {
                    return net.minecraft.util.text.translation.I18n.translateToLocal("tile.sapling.birch.name");
                }
                if (mobIn.equalsIgnoreCase("dark_oak_sapling")) {
                    return net.minecraft.util.text.translation.I18n.translateToLocal("tile.sapling.big_oak.name");
                }
                if (mobIn.equalsIgnoreCase("jungle_sapling")) {
                    return net.minecraft.util.text.translation.I18n.translateToLocal("tile.sapling.jungle.name");
                }
                if (mobIn.equalsIgnoreCase("oak_sapling")) {
                    return net.minecraft.util.text.translation.I18n.translateToLocal("tile.sapling.oak.name");
                }
                if (mobIn.equalsIgnoreCase("spruce_sapling")) {
                    return net.minecraft.util.text.translation.I18n.translateToLocal("tile.sapling.spruce.name");
                }
                if (mobIn.equalsIgnoreCase("large_fern")) {
                    return net.minecraft.util.text.translation.I18n.translateToLocal("tile.doublePlant.fern.name");
                }
                if (mobIn.equalsIgnoreCase("small_fern")) {
                    return net.minecraft.util.text.translation.I18n.translateToLocal("tile.tallgrass.fern.name");
                }
            }
            else {
                int colonPos = mobIn.indexOf(":");
                if (!(colonPos > 0)) {
                    mobIn = "- NONE -";
                }
                else {
                    mobIn = mobIn.replace("@", "_").substring(colonPos + 1);
                }
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

        protected int getSize()
        {
            return this.lifeList.size();
        }

        protected void elementClicked(int slotIndex, boolean isDoubleClick, int mouseX, int mouseY)
        {
            String life = this.lifeList.get(slotIndex);
            //Save this string into the Tile Entity:
            GUITimeResearcherFinderSelector.this.tileEntity.setSelectedLife(life);
            int x = GUITimeResearcherFinder.GUILepidodendronTimeResearcherFinder.x;
            int y = GUITimeResearcherFinder.GUILepidodendronTimeResearcherFinder.y;
            int z = GUITimeResearcherFinder.GUILepidodendronTimeResearcherFinder.z;
            LepidodendronMod.PACKET_HANDLER.sendToServer(new GUITimeResearcherFinder.GUILifeChangedMessage(life, x, y, z));

            GUITimeResearcherFinderSelector.this.confirmSettingsBtn.displayString = I18n.format("gui.done");

        }

        protected boolean isSelected(int slotIndex)
        {
            return ((String)this.lifeList.get(slotIndex)).equals(GUITimeResearcherFinderSelector.this.tileEntity.getSelectedLife());
        }

        protected int getContentHeight()
        {
            return this.getSize() * 18;
        }

        protected void drawBackground()
        {
            GUITimeResearcherFinderSelector.this.drawDefaultBackground();
        }

        protected void drawSlot(int slotIndex, int xPos, int yPos, int heightIn, int mouseXIn, int mouseYIn, float partialTicks)
        {
            GUITimeResearcherFinderSelector.this.drawCenteredString(GUITimeResearcherFinderSelector.this.fontRenderer, translateMob(this.lifeList.get(slotIndex).toString()), this.width / 2, yPos + 1, 16777215);
        }
    }
}
