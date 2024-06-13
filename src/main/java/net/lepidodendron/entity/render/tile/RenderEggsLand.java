package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEggs;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.tile.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RenderEggsLand extends TileEntitySpecialRenderer<BlockEggs.TileEntityCustom> {

    public static RenderEggsLand instance;

    private final ModelEggSmall small_egg;
    private final ModelEggMedium medium_egg;
    private final ModelEggLarge large_egg;
    private final ModelEggHuge huge_egg;
    private final ModelEggVast vast_egg;
    private final ModelRottenLogEggs rotten_wood_eggs;

    public static final ResourceLocation TEXTURE_HYLONOMUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hylonomus_eggs.png");
    public static final ResourceLocation TEXTURE_CASINERIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/casineria_eggs.png");
    public static final ResourceLocation TEXTURE_LABIDOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/labidosaurus_eggs.png");
    public static final ResourceLocation TEXTURE_WEIGELTISAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/weigeltisaurus_eggs.png");
    public static final ResourceLocation TEXTURE_CELTEDENS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/celtedens_eggs.png");
    public static final ResourceLocation TEXTURE_LONGISQUAMA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/longisquama_eggs.png");
    public static final ResourceLocation TEXTURE_HYPURONECTOR_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hypuronector_eggs.png");

    public RenderEggsLand() {
        this.small_egg = new ModelEggSmall();
        this.medium_egg = new ModelEggMedium();
        this.large_egg = new ModelEggLarge();
        this.huge_egg = new ModelEggHuge();
        this.vast_egg = new ModelEggVast();
        this.rotten_wood_eggs = new ModelRottenLogEggs();
    }

    public void setRendererDispatcher(TileEntityRendererDispatcher rendererDispatcherIn)
    {
        super.setRendererDispatcher(rendererDispatcherIn);
        instance = this;
    }

    @Override
    public void render(BlockEggs.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        //EnumFacing facing = EnumFacing.NORTH;
        int eggType = 0;
        ResourceLocation TEXTURE_EGG = null;
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {

            String eggRenderType = "";
            String creatureType = "";
            TileEntity tileEntity = entity.getWorld().getTileEntity(pos);
            if (tileEntity != null) {
                if (tileEntity.getTileData().hasKey("creature")) {
                    eggRenderType = tileEntity.getTileData().getString("creature");
                    int i = eggRenderType.indexOf("@");
                    if (i >= 1) {
                        creatureType = eggRenderType.substring(eggRenderType.indexOf("@") + 1);
                        eggRenderType = eggRenderType.substring(0, eggRenderType.indexOf("@"));
                    }
                }
            }
            if (!eggRenderType.equals("")) {
                if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hylonomus")) {
                    TEXTURE_EGG = TEXTURE_HYLONOMUS_EGG;
                    eggType = 10; //rotten wood
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_labidosaurus")) {
                    TEXTURE_EGG = TEXTURE_LABIDOSAURUS_EGG;
                    eggType = 10; //rotten wood
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_casineria")) {
                    TEXTURE_EGG = TEXTURE_CASINERIA_EGG;
                    eggType = 10; //rotten wood
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_weigeltisaurus")) {
                    TEXTURE_EGG = TEXTURE_WEIGELTISAURUS_EGG;
                    eggType = 10; //rotten wood
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_celtedens")) {
                    TEXTURE_EGG = TEXTURE_CELTEDENS_EGG;
                    eggType = 10; //rotten wood
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_longisquama")) {
                    TEXTURE_EGG = TEXTURE_LONGISQUAMA_EGG;
                    eggType = 10; //rotten wood
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hypuronector")) {
                    TEXTURE_EGG = TEXTURE_HYPURONECTOR_EGG;
                    eggType = 10; //rotten wood
                }
                else {
                    EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(eggRenderType));
                    if (ee != null) {
                        Entity entityEggs = ee.newInstance(world);
                        if (entityEggs instanceof EntityPrehistoricFloraAgeableBase) {
                            EntityPrehistoricFloraAgeableBase entityBase = (EntityPrehistoricFloraAgeableBase) entityEggs;
                            if (entityBase.hasPNVariants() && !creatureType.equalsIgnoreCase("")) {
                                TEXTURE_EGG = entityBase.getEggTexture(creatureType);
                                eggType = entityBase.getEggType(creatureType);
                            }
                            else {
                                TEXTURE_EGG = entityBase.getEggTexture(null);
                                eggType = entityBase.getEggType(null);
                            }
                        }
                        else {
                            //Something has gone wrong!
                            entityEggs.setDead();
                            return;
                        }
                        entityEggs.setDead();
                    }
                    else {
                        //Something has gone wrong!
                        return;
                    }
                }
            }
            else {
                //Something has gone wrong!
                return;
            }
            //Render any eggs:
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableRescaleNormal();
            if (eggType == 10) {
                GlStateManager.translate(x + 0.5F, y + 0.9F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.50F, 0.50F, 0.50F);
            }
            else {
                GlStateManager.translate(x + 0.5F, y + 1.500F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
            }

            try {
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_EGG);
            }
            catch (RuntimeException exception) {
                //splice in something obvious so we can see it is broken!
                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("minecraft:textures/blocks/wool_colored_purple.png"));
            }

            GlStateManager.enableAlpha();
            switch (eggType) {
                case 0: default:
                    this.small_egg.renderAll(1.2f);
                    break;

                case 1:
                    this.medium_egg.renderAll(1.2f);
                    break;

                case 2:
                    this.large_egg.renderAll(1.2f);
                    break;

                case 3:
                    this.huge_egg.renderAll(1.2f);
                    break;

                case 4:
                    this.vast_egg.renderAll(0.9f);
                    break;

                case 10:
                    this.rotten_wood_eggs.renderAll(0.075F);
                    break;
            }

            //GlStateManager.disableAlpha();
            GlStateManager.disableRescaleNormal();
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
        }
    }
}