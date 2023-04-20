package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPlectronoceras;
import net.lepidodendron.entity.EntityPrehistoricFloraSilesaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPlectronoceras extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer arm6;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer arm7;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer arm8;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer arm9;
    private final AdvancedModelRenderer arm5;
    private final AdvancedModelRenderer arm10;

    public ModelPlectronoceras() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 18.25F, -1.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, 0.0F, -1.0F, 4, 4, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 8, -2.0F, 3.5F, -0.75F, 4, 2, 3, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 15, 7, -0.5F, 3.25F, 1.85F, 1, 2, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.829F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -1.0F, -6.0F, -1.25F, 2, 3, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 10, -1.5F, -3.25F, -0.5F, 3, 4, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.3526F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -7.5F, -3.65F, 1, 3, 1, 0.0F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(0.6F, 5.25F, -0.25F);
        this.bone.addChild(arm);
        this.setRotateAngle(arm, 0.0F, -0.2182F, 0.0F);
        this.arm.cubeList.add(new ModelBox(arm, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(-0.6F, 5.25F, -0.25F);
        this.bone.addChild(arm6);
        this.setRotateAngle(arm6, 0.0F, 0.2182F, 0.0F);
        this.arm6.cubeList.add(new ModelBox(arm6, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(1.5F, 5.25F, 0.0F);
        this.bone.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, -0.8727F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(-1.5F, 5.25F, 0.0F);
        this.bone.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.8727F, 0.0F);
        this.arm7.cubeList.add(new ModelBox(arm7, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(1.75F, 5.25F, 0.9F);
        this.bone.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, -1.5708F, 0.0F);
        this.arm3.cubeList.add(new ModelBox(arm3, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(-1.75F, 5.25F, 0.8F);
        this.bone.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 1.5708F, 0.0F);
        this.arm8.cubeList.add(new ModelBox(arm8, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(1.45F, 5.25F, 1.75F);
        this.bone.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, -2.0944F, 0.0F);
        this.arm4.cubeList.add(new ModelBox(arm4, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(-1.45F, 5.25F, 1.75F);
        this.bone.addChild(arm9);
        this.setRotateAngle(arm9, 0.0F, 2.0944F, 0.0F);
        this.arm9.cubeList.add(new ModelBox(arm9, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(0.6F, 5.25F, 2.0F);
        this.bone.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, -2.7053F, 0.0F);
        this.arm5.cubeList.add(new ModelBox(arm5, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(-0.6F, 5.25F, 2.0F);
        this.bone.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 2.7053F, 0.0F);
        this.arm10.cubeList.add(new ModelBox(arm10, 12, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = 0.1F;
        this.bone.render(0.014F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        //this.resetToDefaultPose();

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPlectronoceras ee = (EntityPrehistoricFloraPlectronoceras) entitylivingbaseIn;

        if (!ee.isInWater()) {
        }
        else {
            //Swimming pose:
            if(ee.getAnimation()== ee.JUMP_ANIMATION) {
                //moving in water
                animJump(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            }
        }
    }

    public void animJump(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlectronoceras entity = (EntityPrehistoricFloraPlectronoceras) entitylivingbaseIn;
        int animCycle = 29;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (107.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 107.5D + (((tickAnim - 3D) / 7D) * (107.5D-(107.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 107.5D + (((tickAnim - 10D) / 15D) * (80D-(107.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 80D + (((tickAnim - 25D) / 3D) * (0D-(80D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (107.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 107.5D + (((tickAnim - 3D) / 7D) * (107.5D-(107.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 107.5D + (((tickAnim - 10D) / 15D) * (82.5D-(107.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 82.5D + (((tickAnim - 25D) / 3D) * (0D-(82.5D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(xx), arm6.rotateAngleY + (float) Math.toRadians(yy), arm6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (110D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 110D + (((tickAnim - 3D) / 7D) * (110D-(110D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 110D + (((tickAnim - 10D) / 15D) * (90D-(110D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 90D + (((tickAnim - 25D) / 3D) * (0D-(90D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (107.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 107.5D + (((tickAnim - 3D) / 7D) * (107.5D-(107.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 107.5D + (((tickAnim - 10D) / 15D) * (77.5D-(107.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 77.5D + (((tickAnim - 25D) / 3D) * (0D-(77.5D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(xx), arm7.rotateAngleY + (float) Math.toRadians(yy), arm7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (107.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 107.5D + (((tickAnim - 3D) / 7D) * (107.5D-(107.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 107.5D + (((tickAnim - 10D) / 15D) * (75D-(107.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 75D + (((tickAnim - 25D) / 3D) * (0D-(75D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(xx), arm3.rotateAngleY + (float) Math.toRadians(yy), arm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (107.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 107.5D + (((tickAnim - 3D) / 7D) * (107.5D-(107.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 107.5D + (((tickAnim - 10D) / 15D) * (67.5D-(107.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 67.5D + (((tickAnim - 25D) / 3D) * (0D-(67.5D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(xx), arm8.rotateAngleY + (float) Math.toRadians(yy), arm8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (110D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 110D + (((tickAnim - 3D) / 7D) * (110D-(110D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 110D + (((tickAnim - 10D) / 15D) * (80D-(110D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 80D + (((tickAnim - 25D) / 3D) * (0D-(80D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(xx), arm4.rotateAngleY + (float) Math.toRadians(yy), arm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (107.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 107.5D + (((tickAnim - 3D) / 7D) * (107.5D-(107.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 107.5D + (((tickAnim - 10D) / 15D) * (75D-(107.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 75D + (((tickAnim - 25D) / 3D) * (0D-(75D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(xx), arm9.rotateAngleY + (float) Math.toRadians(yy), arm9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (102.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 102.5D + (((tickAnim - 3D) / 7D) * (102.5D-(102.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 102.5D + (((tickAnim - 10D) / 15D) * (72.5D-(102.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 72.5D + (((tickAnim - 25D) / 3D) * (0D-(72.5D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(xx), arm5.rotateAngleY + (float) Math.toRadians(yy), arm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (102.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 102.5D + (((tickAnim - 3D) / 7D) * (102.5D-(102.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 102.5D + (((tickAnim - 10D) / 15D) * (75D-(102.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 75D + (((tickAnim - 25D) / 3D) * (0D-(75D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(xx), arm10.rotateAngleY + (float) Math.toRadians(yy), arm10.rotateAngleZ + (float) Math.toRadians(zz));

    }

}
