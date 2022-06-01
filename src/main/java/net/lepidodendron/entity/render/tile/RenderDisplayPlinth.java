package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisplayPlinth;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.item.ItemRoseFlower;
import net.lepidodendron.item.entities.*;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.opengl.GL11;

public class RenderDisplayPlinth extends TileEntitySpecialRenderer<BlockDisplayPlinth.TileEntityDisplayPlinth> {

    public static final PropertyDirection FACING = BlockDirectional.FACING;
    private static final ResourceLocation TEXTURE_ACANTHOSTEGA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthostega.png");
    private final ModelAcanthostega modelAcanthostega;
    private static final ResourceLocation TEXTURE_ACANTHOSTOMATOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthostomatops.png");
    private final ModelAcanthostomatops modelAcanthostomatops;
    private static final ResourceLocation TEXTURE_ACUTIRAMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acutiramus.png");
    private final ModelAcutiramusPlinth modelAcutiramusPlinth;
    private static final ResourceLocation TEXTURE_BRANCHIOSAUR = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/branchiosaur.png");
    private final ModelBranchiosaur modelBranchiosaur;
    private static final ResourceLocation TEXTURE_CLAUDIOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/claudiosaurus.png");
    private final ModelClaudiosaurus modelClaudiosaurus;

    private static final ResourceLocation TEXTURE_DIICTODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diictodon.png");
    private final ModelDiictodon modelDiictodon;
    private static final ResourceLocation TEXTURE_DVINIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dvinia.png");
    private final ModelDvinia modelDvinia;
    private static final ResourceLocation TEXTURE_EOSIMOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eosimops.png");
    private static final ResourceLocation TEXTURE_HIBBERTOPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hibbertopterus.png");
    private final ModelHibbertopterus modelHibbertopterus;
    private static final ResourceLocation TEXTURE_HYLONOMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hylonomus.png");
    private final ModelHylonomus modelHylonomus;
    private static final ResourceLocation TEXTURE_ICHTHYOSTEGA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ichthyostega.png");
    private final ModelIchthyostega modelIchthyostega;
    private static final ResourceLocation TEXTURE_LABIDOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/labidosaurus.png");
    private final ModelLabidosaurus modelLabidosaurus;
    private static final ResourceLocation TEXTURE_MEGALOCEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megalocephalus.png");
    private final ModelMegalocephalus modelMegalocephalus;
    private static final ResourceLocation TEXTURE_MESOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mesosaurus.png");
    private final ModelMesosaurus modelMesosaurus;
    private static final ResourceLocation TEXTURE_OMNIDENS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/omnidens.png");
    private final ModelOmnidens modelOmnidens;
    private static final ResourceLocation TEXTURE_PROSICTODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prosictodon.png");
    private static final ResourceLocation TEXTURE_ROBERTIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/robertia.png");
    private static final ResourceLocation TEXTURE_GERARUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    private final ModelGerarus modelGerarus;


    public RenderDisplayPlinth() {
        this.modelAcanthostega = new ModelAcanthostega();
        this.modelAcanthostomatops = new ModelAcanthostomatops();
        this.modelAcutiramusPlinth = new ModelAcutiramusPlinth();
        this.modelBranchiosaur = new ModelBranchiosaur();
        this.modelClaudiosaurus = new ModelClaudiosaurus();
        this.modelDiictodon = new ModelDiictodon();
        this.modelDvinia = new ModelDvinia();
        this.modelHibbertopterus = new ModelHibbertopterus();
        this.modelHylonomus = new ModelHylonomus();
        this.modelIchthyostega = new ModelIchthyostega();
        this.modelLabidosaurus = new ModelLabidosaurus();
        this.modelMegalocephalus = new ModelMegalocephalus();
        this.modelMesosaurus = new ModelMesosaurus();
        this.modelOmnidens = new ModelOmnidens();
        this.modelGerarus = new ModelGerarus();

    }

    @Override
    public void render(BlockDisplayPlinth.TileEntityDisplayPlinth entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        EnumFacing facing;
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");

            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDisplayPlinth.TileEntityDisplayPlinth) {
                    BlockDisplayPlinth.TileEntityDisplayPlinth tee = (BlockDisplayPlinth.TileEntityDisplayPlinth) te;
                    ItemStack itemstack = tee.getStackInSlot(0);
                    if (itemstack.isEmpty() || tee.isEmpty()) {
                        //System.err.println("No items1");
                        return;
                    }
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                    GlStateManager.enableBlend();
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                    GlStateManager.pushMatrix();

                    if (itemstack.getItem() == ItemRoseFlower.block) {
                        double offset = 0.12;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_GERARUS);
                        modelGerarus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAcanthostegaRaw.block) {
                        double offset = 0.17;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_ACANTHOSTEGA);
                        GlStateManager.scale(0.13F,0.13F,0.13F);
                        modelAcanthostega.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAcanthostomatopsRaw.block) {
                        double offset = 0.38;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_ACANTHOSTOMATOPS);
                        GlStateManager.scale(0.16F,0.16F,0.16F);
                        modelAcanthostomatops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAcutiramusRaw.block) {
                        double offset = 2.3;
                        double voffset = 0.5;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_ACUTIRAMUS);
                        GlStateManager.scale(1.1F,1.1F,1.1F);
                        modelAcutiramusPlinth.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBranchiosaurRaw.block) {
                        double offset = 0.3;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_BRANCHIOSAUR);
                        GlStateManager.scale(0.12F,0.12F,0.12F);
                        modelBranchiosaur.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemClaudiosaurusRaw.block) {
                        double offset = 0.23;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_CLAUDIOSAURUS);
                        GlStateManager.scale(0.09F,0.09F,0.09F);
                        modelClaudiosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEosimopsRaw.block) {
                        double offset = 0.16;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_EOSIMOPS);
                        GlStateManager.scale(0.21F,0.21F,0.21F);
                        modelDiictodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDiictodonRaw.block) {
                        double offset = 0.16;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_DIICTODON);
                        GlStateManager.scale(0.2F,0.2F,0.2F);
                        modelDiictodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDviniaRaw.block) {
                        double offset = 0.41;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_DVINIA);
                        GlStateManager.scale(0.16F,0.16F,0.16F);
                        modelDvinia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHibbertopterusRaw.block) {
                        double offset = 1.4;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_HIBBERTOPTERUS);
                        GlStateManager.scale(0.64F,0.64F,0.64F);
                        modelHibbertopterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHylonomusRaw.block) {
                        double offset = 0.06;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_HYLONOMUS);
                        GlStateManager.scale(0.13F,0.13F,0.13F);
                        modelHylonomus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemIchthyostegaRaw.block) {
                        double offset = 0.12;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_ICHTHYOSTEGA);
                        GlStateManager.rotate(5,-1,0,0);
                        GlStateManager.scale(0.28F,0.28F,0.28F);
                        modelIchthyostega.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLabidosaurusRaw.block) {
                        double offset = 0.58;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_LABIDOSAURUS);
                        GlStateManager.scale(0.24F,0.24F,0.24F);
                        modelLabidosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMegalocephalusRaw.block) {
                        double offset = 0.38;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_MEGALOCEPHALUS);
                        GlStateManager.scale(0.16F,0.16F,0.16F);
                        modelMegalocephalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMesosaurusRaw.block) {
                        double offset = 0.04;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_MESOSAURUS);
                        GlStateManager.scale(0.07F,0.07F,0.07F);
                        modelMesosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOmnidensRaw.block) {
                        double offset = 0.58;
                        //double voffset = -0.15;
                        double voffset = 0;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_OMNIDENS);
                        GlStateManager.scale(0.24F,0.24F,0.24F);
                        modelOmnidens.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemProsictodonRaw.block) {
                        double offset = 0.16;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_PROSICTODON);
                        GlStateManager.scale(0.19F,0.19F,0.19F);
                        modelDiictodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemRobertiaRaw.block) {
                        double offset = 0.1;
                        GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                        this.bindTexture(TEXTURE_ROBERTIA);
                        GlStateManager.scale(0.13F,0.13F,0.13F);
                        modelDiictodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }

                    // ********************************************************************
                    else { //standard items
                        float scale = 0.6666F;

                        double offset = Math.sin((tee.getWorld().getTotalWorldTime() + partialTicks) / 8) / 32.0;
                        GlStateManager.translate(x + 0.5, y + 0.85 + offset, z + 0.5);
                        GlStateManager.rotate((tee.getWorld().getTotalWorldTime() + partialTicks) * 2, 0, 1, 0);

                        GlStateManager.scale(scale, scale, scale);

                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        //model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.FIXED, false);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);
                    }

                    GlStateManager.popMatrix();
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.disableBlend();

                }
            }
        }
    }
}