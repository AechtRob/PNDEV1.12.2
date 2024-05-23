package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockDisplayCase;
import net.lepidodendron.item.ItemGlassCaseDisplayItem;
import net.lepidodendron.item.ItemTaxidermyDisplayItem;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.annotation.Nullable;
import java.lang.reflect.Method;

public class RenderDisplayCase extends TileEntitySpecialRenderer<BlockDisplayCase.TileEntityDisplayCase> {

    public final float scaler = 6.0F;
    private static final Class[] params = new Class[1];

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderDisplayCase() {
    }

    @Override
    public void render(BlockDisplayCase.TileEntityDisplayCase entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        EnumFacing facing;
        params[0] = String.class;
        boolean itemRender  = true;
        int currentRotation = 0;
        String PNVariant = null;

        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);

            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDisplayCase.TileEntityDisplayCase) {
                    BlockDisplayCase.TileEntityDisplayCase tee = (BlockDisplayCase.TileEntityDisplayCase) te;
                    ItemStack itemstack = tee.getStackInSlot(0);
                    if (itemstack.isEmpty()) {
                        return;
                    }

                    GlStateManager.pushMatrix();
                    GlStateManager.disableCull();
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.enableAlpha();

                    if (itemstack.getItem() instanceof ItemGlassCaseDisplayItem) {
                        //Full body drops:
                        ItemGlassCaseDisplayItem displayItem = (ItemGlassCaseDisplayItem) itemstack.getItem();
                        Class classEntity = findEntity(displayItem.getMobStr());
                        if (classEntity != null) {
                            itemRender = false;

                            double offsetCase = 0F;
                            ResourceLocation textureDisplay = null;
                            ResourceLocation textureDisplayTransparent = null;
                            ModelBase modelDisplay = null;
                            float getScaler = 0;

                            if (displayItem.getVariantStr() != null) {
                                PNVariant = displayItem.getVariantStr();
                            }

                            Method method = testAndGetMethod(classEntity, "offsetCase", params);
                            if (method != null) {
                                try {
                                    offsetCase = (double) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            } else {
                                itemRender = true;
                            }
                            method = testAndGetMethod(classEntity, "textureDisplay", params);
                            if (method != null) {
                                try {
                                    textureDisplay = (ResourceLocation) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            } else {
                                itemRender = true;
                            }
                            method = testAndGetMethod(classEntity, "textureDisplayTransparent", params);
                            if (method != null) {
                                try {
                                    textureDisplayTransparent = (ResourceLocation) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    //Do not worry if there is no transparent layer
                                }
                            } else {
                                //Do not worry if there is no transparent layer
                            }
                            method = testAndGetMethod(classEntity, "modelDisplay", params);
                            if (method != null) {
                                try {
                                    modelDisplay = (ModelBase) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            } else {
                                itemRender = true;
                            }
                            method = testAndGetMethod(classEntity, "getScaler", params);
                            if (method != null) {
                                try {
                                    getScaler = (float) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            } else {
                                itemRender = true;
                            }

                            if (!itemRender) {
                                try {
                                    itemRender = !renderTaxidermy(facing, (float) x, (float) y, (float) z, currentRotation,
                                            textureDisplay, getScaler, modelDisplay,
                                            offsetCase, false);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                                if (textureDisplayTransparent != null) {
                                    try { //Add in any transparency
                                        itemRender = itemRender || !renderTaxidermy(facing, (float) x, (float) y, (float) z, currentRotation,
                                                textureDisplayTransparent, getScaler, modelDisplay,
                                                offsetCase, true);
                                    } catch (Exception e) {
                                        //Ignore this if there are no transparent parts
                                    }
                                }
                            }
                        }
                    }

                    else if (itemstack.getItem() == ItemTaxidermyDisplayItem.block) {
                        Class classEntity = getEntityFromNBT(itemstack);
                        if (classEntity != null) {
                            itemRender = false;
                            double offsetCase = 0F;
                            ResourceLocation textureDisplay = null;
                            ResourceLocation textureDisplayTransparent = null;
                            ModelBase modelDisplay = null;
                            float getScaler = 0;

                            //Is there a variant included?
                            if (itemstack.hasTagCompound()) {
                                if (itemstack.getTagCompound().hasKey("PNVariant")) {
                                    PNVariant = itemstack.getTagCompound().getString("PNVariant");
                                }
                            }

                            params[0] = String.class;
                            Method method = testAndGetMethod(classEntity, "offsetCase", params);
                            if (method != null) {
                                try {
                                    offsetCase = (double) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            } else {
                                itemRender = true;
                            }
                            method = testAndGetMethod(classEntity, "textureDisplay", params);
                            if (method != null) {
                                try {
                                    textureDisplay = (ResourceLocation) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            } else {
                                itemRender = true;
                            }
                            method = testAndGetMethod(classEntity, "textureDisplayTransparent", params);
                            if (method != null) {
                                try {
                                    textureDisplayTransparent = (ResourceLocation) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    //Do not worry if there is no transparent layer
                                }
                            } else {
                                //Do not worry if there is no transparent layer
                            }
                            method = testAndGetMethod(classEntity, "modelDisplay", params);
                            if (method != null) {
                                try {
                                    modelDisplay = (ModelBase) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            } else {
                                itemRender = true;
                            }
                            method = testAndGetMethod(classEntity, "getScaler", params);
                            if (method != null) {
                                try {
                                    getScaler = (float) method.invoke(null, PNVariant);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            } else {
                                itemRender = true;
                            }

                            if (!itemRender) {
                                try {
                                    itemRender = !renderTaxidermy(facing, (float) x, (float) y, (float) z, currentRotation,
                                            textureDisplay, getScaler, modelDisplay,
                                            offsetCase, false);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                                if (textureDisplayTransparent != null) {
                                    try { //Add in any transprency
                                        itemRender = itemRender || !renderTaxidermy(facing, (float) x, (float) y, (float) z, currentRotation,
                                                textureDisplayTransparent, getScaler, modelDisplay,
                                                offsetCase, true);
                                    } catch (Exception e) {
                                        //Ignore this if there are no transparent parts
                                    }
                                }
                            }
                        }
                    }
                    else {
                        itemRender = true;
                    }


                    // ********************************************************************
                    if (itemRender) { //standard items
                        //itemRender = true;

                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        //GlStateManager.pushMatrix();

                        float scale = 0.6666F;
                        if (facing == EnumFacing.UP) {
                            GlStateManager.translate(x + 0.5, y, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.DOWN) {
                            GlStateManager.translate(x + 0.5, y + 1, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + 1);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 1, y + 0.5, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x, y + 0.5, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        //model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.FIXED, false);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);
                    }

                    if (itemRender) {
                        GlStateManager.disableRescaleNormal();
                        //GlStateManager.disableAlpha();
                        GlStateManager.disableBlend();
                        GlStateManager.enableCull();
                        GlStateManager.disableRescaleNormal();
                        RenderHelper.disableStandardItemLighting();
                        GlStateManager.popMatrix();
                    }
                    else {
                        //GlStateManager.disableAlpha();
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();
                    }

                }
            }
        }
    }

    @Nullable
    public Class getEntityFromNBT(ItemStack stack) {
        if (!stack.hasTagCompound()) {
            return null;
        }
        if (!stack.getTagCompound().hasKey("PFMob")) {
            return null;
        }
        Class classOut = null;
        NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
        String stringDNA = (blockNBT.getString("id"));
        if (stringDNA != null) {
            if (stringDNA.indexOf("@") >= 1) {
                stringDNA = stringDNA.substring(0, stringDNA.indexOf("@"));
            }
            classOut = findEntity(stringDNA);
        }
        return classOut;
    }

    @Nullable
    private static Class<? extends Entity> findEntity(String entity) {
        Class<? extends Entity> entityClass;
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
        entityClass = ee == null ? null : ee.getEntityClass();
        if (entityClass == null) {
            return null;
        }
        return entityClass;
    }

    public boolean renderTaxidermy(EnumFacing facing, float x, float y, float z,
                                   float currentRotation,
                                   ResourceLocation TEXTURE,
                                   float scalerModel,
                                   ModelBase model,
                                   double offset,
                                   boolean transparent
    ) {

        //net.minecraft.util.math.Vec3d cameraPos = rendererDispatcher.entity.getPositionVector();
        float renderLimit = LepidodendronConfig.taxidermyRenderRange;
        if (renderLimit < 16) {
            renderLimit = 16;
        }
        if (renderLimit > 254) {
            renderLimit = 254;
        }
        if ((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)) > Math.pow(renderLimit, 2)) {
            return false;
        }

        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        Method renderMethod = testAndGetMethod(model.getClass(), "renderStaticDisplayCase", new Class[]{float.class});
        if (renderMethod != null) {
            if (transparent) {
                GlStateManager.pushMatrix();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            }
            else {
                if (facing == EnumFacing.UP) {
                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                }
                if (facing == EnumFacing.DOWN) {
                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                }
                if (facing == EnumFacing.NORTH) {
                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(90, 1F, 0F, 0F);
                }
                if (facing == EnumFacing.SOUTH) {
                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(270, 1F, 0F, 0F);
                }
                if (facing == EnumFacing.WEST) {
                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(90, 0F, 0F, 1F);
                }
                if (facing == EnumFacing.EAST) {
                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(270, 0F, 0F, 1F);
                }
                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                GlStateManager.scale(this.scaler * scalerModel, this.scaler * scalerModel, this.scaler * scalerModel);
            }
            this.bindTexture(TEXTURE);
            try {
                renderMethod.invoke(model, Minecraft.getMinecraft().player.ticksExisted);
            } catch (Exception e) {
                flag1 = false;
            }
            flag2 = true;
        } else {
            flag3 = false;
        }
        if (transparent) {
            GlStateManager.disableBlend();
            GlStateManager.disableNormalize();
            GlStateManager.popMatrix();
        }
        return flag1 && flag2 && flag3;
    }

    @Nullable
    public Method testAndGetMethod(Class clazz, String methodname, @Nullable Class[] params) {
        Method methodToFind = null;
        try {
            methodToFind = clazz.getMethod(methodname, params);
        } catch (NoSuchMethodException | SecurityException e) {
        }
        return methodToFind;
    }

}