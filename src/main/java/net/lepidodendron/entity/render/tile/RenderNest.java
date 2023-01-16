package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.tile.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RenderNest extends TileEntitySpecialRenderer<BlockNest.TileEntityNest> {

    private final ModelEggSmall small_egg;
    private final ModelEggMedium medium_egg;
    private final ModelEggLarge large_egg;
    private final ModelEggHuge huge_egg;
    private final ModelEggVast vast_egg;
    private final ModelNest nest;
    private final ModelNestMound nest_mound;

    public RenderNest() {
        this.small_egg = new ModelEggSmall();
        this.medium_egg = new ModelEggMedium();
        this.large_egg = new ModelEggLarge();
        this.huge_egg = new ModelEggHuge();
        this.vast_egg = new ModelEggVast();

        this.nest = new ModelNest();
        this.nest_mound = new ModelNestMound();
    }

    @Override
    public void render(BlockNest.TileEntityNest entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        //EnumFacing facing = EnumFacing.NORTH;

        int eggType = 0;
        //splice in something obvious so we can see it is broken!
        ResourceLocation TEXTURE_EGG = new ResourceLocation("minecraft:textures/blocks/wool_colored_purple.png");;
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld() && world.getBlockState(pos).getBlock() == BlockNest.block) {

            if ((world.getBlockState(pos.down()).getMaterial() != Material.LEAVES
                    && world.getBlockState(pos.down()).getMaterial() != Material.WOOD)) { //i.e. omit birds nest styles:

                Minecraft minecraft = Minecraft.getMinecraft();
                BlockRendererDispatcher ren = minecraft.getBlockRendererDispatcher();
                String texture = "minecraft:blocks/dirt";
                IBlockState state = entity.getWorld().getBlockState(entity.getPos().down());
                BlockPos pos1 = pos.down();
                if (pos1 != null) {
                    state = entity.getWorld().getBlockState(pos1);

                    if (state.isFullBlock() &&
                            (state.getMaterial() == Material.GROUND
                                    || state.getMaterial() == Material.ROCK
                                    || state.getMaterial() == Material.SAND
                                    || state.getMaterial() == Material.CLAY)
                    ) {
                        try {
                            texture = ren.getModelForState(state).getQuads(state, EnumFacing.UP, 0).get(0).getSprite().getIconName();
                        } catch (RuntimeException exception) {
                            texture = "minecraft:blocks/dirt";
                        }
                    }
                }
                texture = texture.replace(":", ":textures/");
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F, y + 1.50F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(texture + ".png"));
                GlStateManager.enableAlpha();
                if (BlockNest.BlockCustom.isMound(world, pos)) {
                    this.nest_mound.renderAll(1.25f);
                } else {
                    this.nest.renderAll(1.25f);
                }
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
            }

            //Render eggs:
            String eggRenderType = new Object() {
                public String getValue(BlockPos pos1, String tag) {
                    TileEntity tileEntity = world.getTileEntity(pos1);
                    if (tileEntity != null)
                        return tileEntity.getTileData().getString(tag);
                    return "";
                }
            }.getValue(pos, "egg");

            //System.err.println("eggRenderType " + eggRenderType);

            if (!eggRenderType.equalsIgnoreCase("")) {
                EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(eggRenderType));
                if (ee != null) {
                    Entity entityEggs = ee.newInstance(world);
                    if (entityEggs instanceof EntityPrehistoricFloraAgeableBase) {
                        EntityPrehistoricFloraAgeableBase entityBase = (EntityPrehistoricFloraAgeableBase) entityEggs;
                        TEXTURE_EGG = entityBase.getEggTexture();
                        eggType = entityBase.getEggType();
                        if (entityBase.isNestMound()) {
                            eggType = -1;
                        }
                    }
                }

                if (eggType != -1) {
                    GlStateManager.pushMatrix();
                    GlStateManager.disableCull();
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.translate(x + 0.5F, y + 1.500F, z + 0.5F);
                    GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);

                    try {
                        Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_EGG);
                    }
                    catch (RuntimeException exception) {
                        //splice in something obvious so we can see it is broken!
                        Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("minecraft:textures/blocks/wool_colored_purple.png"));
                    }

                    //Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_EGG);
                    GlStateManager.enableAlpha();
                    switch (eggType) {
                        case 0:
                        default:
                            this.small_egg.renderAllRaised(1.2f);
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
                    }

                    GlStateManager.disableAlpha();
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }
            }
        }
    }

}