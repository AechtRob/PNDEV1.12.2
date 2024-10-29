package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockEggsWater;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
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

public class RenderEggsWater extends TileEntitySpecialRenderer<BlockEggsWater.TileEntityCustom> {

    public static RenderEggsWater instance;

    private final ModelMobSpawn spawn_egg;
    private final ModelMobSpawnCylinder cylinder;
    private final ModelMobSpawnDumbbell dumbbell;
    private final ModelMobSpawnMermaidPurse mermaid_purse;
    private final ModelMobSpawnPiles piles;
    private final ModelMobSpawnTube tube;
    private final ModelMobSpawnEurypterid eurypterid;
    private final ModelInsectEggs insect_eggs;

    public RenderEggsWater() {
        this.spawn_egg = new ModelMobSpawn();
        this.cylinder = new ModelMobSpawnCylinder();
        this.dumbbell = new ModelMobSpawnDumbbell();
        this.mermaid_purse = new ModelMobSpawnMermaidPurse();
        this.piles = new ModelMobSpawnPiles();
        this.tube = new ModelMobSpawnTube();
        this.eurypterid = new ModelMobSpawnEurypterid();
        this.insect_eggs = new ModelInsectEggs();
    }

    public void setRendererDispatcher(TileEntityRendererDispatcher rendererDispatcherIn)
    {
        super.setRendererDispatcher(rendererDispatcherIn);
        instance = this;
    }

    @Override
    public void render(BlockEggsWater.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
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
                if (tileEntity.getTileData().hasKey("PNType")) {
                    creatureType = tileEntity.getTileData().getString("PNType");
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
            if (eggType >= 40) {
                GlStateManager.translate(x + 0.5F, y + 1.50F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
            }
            else if (eggType == 20) {
                GlStateManager.translate(x + 0.5F, y + 1.080F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
            }
//            else {
//                GlStateManager.translate(x + 0.5F, y + 1.500F, z + 0.5F);
//                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
//                GlStateManager.scale(0.05F, 0.05F, 0.05F);
//            }

            try {
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_EGG);
            }
            catch (RuntimeException exception) {
                //splice in something obvious so we can see it is broken!
                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("minecraft:textures/blocks/wool_colored_purple.png"));
            }

            GlStateManager.enableAlpha();
            switch (eggType) {
                case 40: default: //Spawn-jelly
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 0.3F);
                    GlStateManager.enableNormalize();
                    GlStateManager.enableBlend();
                    GlStateManager.enableCull();
                    GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                    this.spawn_egg.renderAll(1.25f);
                    GlStateManager.disableCull();
                    GlStateManager.disableBlend();
                    GlStateManager.disableNormalize();
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    break;

                case 41:  //Mermaid-purse
                   this.mermaid_purse.renderAll(1.25f);
                   break;

                case 42:  //Dumbbells-purse
                    this.dumbbell.renderAll(1.25f);
                    break;

                case 43:  //Tubes
                    this.tube.renderAll(1.25f);
                    break;

                case 44:  //Piles
                    this.piles.renderAll(1.25f);
                    break;

                case 45:  //Cuylinders
                    this.cylinder.renderAll(1.25f);
                    break;

                case 46:  //Eurypterid
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 0.65F);
                    GlStateManager.enableNormalize();
                    GlStateManager.enableBlend();
                    GlStateManager.enableCull();
                    GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                    this.eurypterid.renderAll(1.25f);
                    GlStateManager.disableCull();
                    GlStateManager.disableBlend();
                    GlStateManager.disableNormalize();
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    break;

                case 20:
                    this.insect_eggs.renderAll(0.9f);
                    break;


            }

            //GlStateManager.disableAlpha();
            GlStateManager.disableRescaleNormal();
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
        }
    }
}