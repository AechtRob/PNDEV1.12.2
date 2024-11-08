package net.lepidodendron.gui;

import net.lepidodendron.block.BlockArchiveSorterBottom;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class GUIArchiveSorterBottomSelector extends GuiScreen
{
    protected GuiScreen parentScreen;
    protected BlockArchiveSorterBottom.TileEntityArchiveBottom tileEntity;
    private GUIArchiveSorterBottomSelector.List list;
    private GuiOptionButton confirmSettingsBtn;

    public GUIArchiveSorterBottomSelector(GuiScreen screen, BlockArchiveSorterBottom.TileEntityArchiveBottom te)
    {
        this.parentScreen = screen;
        this.tileEntity = te;
    }

    public void initGui()
    {
        this.confirmSettingsBtn = (GuiOptionButton)this.addButton(new GuiOptionButton(0, this.width / 2 - 75, this.height - 38, I18n.format("gui.done")));
        this.list = new GUIArchiveSorterBottomSelector.List(this.mc);
        this.list.registerScrollButtons(7, 8);
        if ((tileEntity instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom)) {
            ((BlockArchiveSorterBottom.TileEntityArchiveBottom)tileEntity).setLocked(true);
        }
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
        this.drawCenteredString(this.fontRenderer, "Select the itemstack you are looking for", this.width / 2, 16, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @SideOnly(Side.CLIENT)
    class List extends GuiSlot
    {
        private java.util.List<String> invList = null;

        public List(Minecraft mcIn)
        {
            super(mcIn, GUIArchiveSorterBottomSelector.this.width, GUIArchiveSorterBottomSelector.this.height, 32, GUIArchiveSorterBottomSelector.this.height - 65 + 4, 18);
            //Loop over all block inventory contents and offer it here:
            invList = tileEntity.getInventoryAll();
            this.invList.add("- NONE -");

            Collections.sort(this.invList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });

        }

        protected int getSize()
        {
            return this.invList.size();
        }

        protected void elementClicked(int slotIndex, boolean isDoubleClick, int mouseX, int mouseY)
        {
            String selectin = this.invList.get(slotIndex);
            if (selectin.equalsIgnoreCase("- NONE -")) {
                selectin = "";
            }
            GUIArchiveSorterBottom.GuiWindow.searchField.setText(selectin);
            tileEntity.strSearchTile = selectin;

            tileEntity.searchResults(selectin);

        }

        protected boolean isSelected(int slotIndex)
        {
            return (convertEmpty((String)this.invList.get(slotIndex))).equals(GUIArchiveSorterBottom.GuiWindow.searchField.getText());
        }

        public String convertEmpty(String string) {
            if (string.equals("- DONE -")) {
                return "";
            }
            return string;
        }

        protected int getContentHeight()
        {
            return this.getSize() * 18;
        }

        protected void drawBackground()
        {
            GUIArchiveSorterBottomSelector.this.drawDefaultBackground();
        }

        protected void drawSlot(int slotIndex, int xPos, int yPos, int heightIn, int mouseXIn, int mouseYIn, float partialTicks)
        {
            GUIArchiveSorterBottomSelector.this.drawCenteredString(GUIArchiveSorterBottomSelector.this.fontRenderer, this.invList.get(slotIndex), this.width / 2, yPos + 1, 16777215);
        }
    }
}
