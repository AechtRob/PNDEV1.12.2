package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockEggsWaterSurface;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.tile.ModelEggAmphibianSpawnSurface;
import net.lepidodendron.entity.model.tile.ModelEggCrossModel;
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

public class RenderEggsWaterSurface extends TileEntitySpecialRenderer<BlockEggsWaterSurface.TileEntityCustom> {

    public static RenderEggsWaterSurface instance;

    private final ModelEggAmphibianSpawnSurface spawn_egg;
    private final ModelEggCrossModel plant_egg;

    public RenderEggsWaterSurface() {
        this.spawn_egg = new ModelEggAmphibianSpawnSurface();
        this.plant_egg = new ModelEggCrossModel();
    }

    public void setRendererDispatcher(TileEntityRendererDispatcher rendererDispatcherIn)
    {
        super.setRendererDispatcher(rendererDispatcherIn);
        instance = this;
    }

    @Override
    public void render(BlockEggsWaterSurface.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
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
                }
                int i = eggRenderType.indexOf("@");
                if (i >= 1) {
                    creatureType = eggRenderType.substring(eggRenderType.indexOf("@") + 1);
                    eggRenderType = eggRenderType.substring(0, eggRenderType.indexOf("@"));
                }
            }
            if (!eggRenderType.equals("")) {
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
                    else if (entityEggs instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
                        EntityPrehistoricFloraCrawlingFlyingInsectBase entityBase = (EntityPrehistoricFloraCrawlingFlyingInsectBase) entityEggs;
                        if (entityBase.hasPNVariants() && !creatureType.equalsIgnoreCase("")) {
                            TEXTURE_EGG = entityBase.getEggTexture(creatureType);
                            eggType = entityBase.getEggType(creatureType);
                        }
                        else {
                            TEXTURE_EGG = entityBase.getEggTexture(null);
                            eggType = entityBase.getEggType(null);
                        }
                    }
                    else if (entityEggs instanceof EntityPrehistoricFloraInsectFlyingBase) {
                        EntityPrehistoricFloraInsectFlyingBase entityBase = (EntityPrehistoricFloraInsectFlyingBase) entityEggs;
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
            else {
                //Something has gone wrong!
                return;
            }
            //Render any eggs:
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableRescaleNormal();
            if (eggType == 21) { //underwater cross model, but "surface"
                GlStateManager.translate(x + 0.5F, y + 0.50F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
            }
            if (eggType == 47) { //floating spawn
                GlStateManager.translate(x + 0.5F, y + 1.50F, z + 0.5F);
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

                case 21: //underwater cross model
                    this.plant_egg.renderAll(1.25f);
                    break;

                case 47: default: //Spawn-jelly 0n the surface
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 0.55F);
                    GlStateManager.enableNormalize();
                    GlStateManager.enableBlend();
                    //GlStateManager.enableCull();
                    GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                    this.spawn_egg.renderAll(1.25f);
                    //GlStateManager.disableCull();
                    GlStateManager.disableBlend();
                    GlStateManager.disableNormalize();
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    break;


            }

            //GlStateManager.disableAlpha();
            GlStateManager.disableRescaleNormal();
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
        }
    }
}