package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLacewing;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKrika extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg1_r1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg_r1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg2_r1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3_r1;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg3_r2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4_r1;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer leftForewing_r1;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightForewing_r1;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftHindwing_r1;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightHindwing_r1;

    public ModelKrika() {
        this.textureWidth = 50;
        this.textureHeight = 22;

        this.Thorax = new AdvancedModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, 22.5F, -2.1F);
        this.Thorax.cubeList.add(new ModelBox(Thorax, 4, 20, -0.5F, -0.4F, -0.1F, 1, 1, 1, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -0.5F, -0.4F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.1F, 0.8F);
        this.Thorax.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 10, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-1.2F, 0.6F, -1.4F);
        this.Thorax.addChild(head);
        this.setRotateAngle(head, -0.2182F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.7F, 0.2F, 0.7F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3316F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 13, -0.5F, -0.5F, -0.9F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.2F, -0.6F, 0.4F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3316F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 13, -0.5F, -0.5F, -0.9F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2467F, 0.1355F, 0.034F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.4F, 0.0F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2467F, -0.1355F, -0.034F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(0.6F, -0.6F, -0.2F);
        this.head.addChild(rightAntenna);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3F, 0.0F, -0.2F);
        this.rightAntenna.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2043F, 0.4976F, 0.4792F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 10, -1.7684F, -0.0721F, -4.6437F, 2, 0, 5, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(1.7F, -0.6F, -0.2F);
        this.head.addChild(leftAntenna);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.2F, 0.0F, -0.2F);
        this.leftAntenna.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2043F, -0.4976F, -0.4792F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 10, -0.2316F, -0.0721F, -4.6437F, 2, 0, 5, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.2F, 0.3F, 0.2F);
        this.Thorax.addChild(leftLeg1);


        this.leftLeg1_r1 = new AdvancedModelRenderer(this);
        this.leftLeg1_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.leftLeg1.addChild(leftLeg1_r1);
        this.setRotateAngle(leftLeg1_r1, -0.0081F, 0.5228F, -0.0302F);
        this.leftLeg1_r1.cubeList.add(new ModelBox(leftLeg1_r1, 14, 18, 0.0F, -1.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.2F, 0.3F, 0.2F);
        this.Thorax.addChild(rightLeg1);


        this.rightLeg_r1 = new AdvancedModelRenderer(this);
        this.rightLeg_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.rightLeg1.addChild(rightLeg_r1);
        this.setRotateAngle(rightLeg_r1, -0.0081F, -0.5228F, 0.0302F);
        this.rightLeg_r1.cubeList.add(new ModelBox(rightLeg_r1, 0, 16, -7.0F, -1.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.2F, 0.3F, 0.3F);
        this.Thorax.addChild(leftLeg2);


        this.leftLeg2_r1 = new AdvancedModelRenderer(this);
        this.leftLeg2_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.leftLeg2.addChild(leftLeg2_r1);
        this.setRotateAngle(leftLeg2_r1, -0.0099F, -0.7862F, -0.0192F);
        this.leftLeg2_r1.cubeList.add(new ModelBox(leftLeg2_r1, 0, 18, 0.0F, -1.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.2F, 0.3F, 0.3F);
        this.Thorax.addChild(rightLeg2);


        this.rightLeg3_r1 = new AdvancedModelRenderer(this);
        this.rightLeg3_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.rightLeg2.addChild(rightLeg3_r1);
        this.setRotateAngle(rightLeg3_r1, -0.0099F, 0.7862F, 0.0192F);
        this.rightLeg3_r1.cubeList.add(new ModelBox(rightLeg3_r1, 15, 12, -7.0F, -1.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 0.3F, 1.1F);
        this.Thorax.addChild(rightLeg3);


        this.rightLeg3_r2 = new AdvancedModelRenderer(this);
        this.rightLeg3_r2.setRotationPoint(0.1F, 0.5F, 0.0F);
        this.rightLeg3.addChild(rightLeg3_r2);
        this.setRotateAngle(rightLeg3_r2, -0.014F, 1.0479F, 0.014F);
        this.rightLeg3_r2.cubeList.add(new ModelBox(rightLeg3_r2, 14, 16, -7.0F, -1.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.4F, 0.3F, 1.1F);
        this.Thorax.addChild(leftLeg3);


        this.leftLeg4_r1 = new AdvancedModelRenderer(this);
        this.leftLeg4_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.leftLeg3.addChild(leftLeg4_r1);
        this.setRotateAngle(leftLeg4_r1, -0.014F, -1.0479F, -0.014F);
        this.leftLeg4_r1.cubeList.add(new ModelBox(leftLeg4_r1, 15, 10, 0.0F, -1.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.5F, -0.2F, 0.3F);
        this.Thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, -0.2139F, -0.6699F, -1.2343F);


        this.leftForewing_r1 = new AdvancedModelRenderer(this);
        this.leftForewing_r1.setRotationPoint(0.2F, -0.1F, 0.0F);
        this.leftForewing.addChild(leftForewing_r1);
        this.setRotateAngle(leftForewing_r1, 0.0F, 0.1745F, 0.0F);
        this.leftForewing_r1.cubeList.add(new ModelBox(leftForewing_r1, 0, 7, -0.3F, 0.0F, -1.5F, 12, 0, 3, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.5F, -0.2F, 0.3F);
        this.Thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, -0.2139F, 0.6699F, 1.2343F);


        this.rightForewing_r1 = new AdvancedModelRenderer(this);
        this.rightForewing_r1.setRotationPoint(-0.2F, -0.1F, 0.0F);
        this.rightForewing.addChild(rightForewing_r1);
        this.setRotateAngle(rightForewing_r1, 0.0F, -0.1745F, 0.0F);
        this.rightForewing_r1.cubeList.add(new ModelBox(rightForewing_r1, 0, 4, -11.7F, 0.0F, -1.5F, 12, 0, 3, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(0.5F, -0.2F, 2.0F);
        this.Thorax.addChild(leftHindwing);


        this.leftHindwing_r1 = new AdvancedModelRenderer(this);
        this.leftHindwing_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHindwing.addChild(leftHindwing_r1);
        this.setRotateAngle(leftHindwing_r1, 0.0F, -1.2654F, 0.0F);
        this.leftHindwing_r1.cubeList.add(new ModelBox(leftHindwing_r1, 0, 2, -0.3978F, 0.0F, -1.5772F, 24, 0, 2, 0.0F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-0.5F, -0.2F, 2.0F);
        this.Thorax.addChild(rightHindwing);


        this.rightHindwing_r1 = new AdvancedModelRenderer(this);
        this.rightHindwing_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHindwing.addChild(rightHindwing_r1);
        this.setRotateAngle(rightHindwing_r1, 0.0F, 1.2654F, 0.0F);
        this.rightHindwing_r1.cubeList.add(new ModelBox(rightHindwing_r1, 0, 0, -23.6022F, 0.0F, -1.5772F, 24, 0, 2, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Thorax.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {

        this.Thorax.render(0.01f);
    }

    public void renderStaticFloor(float f) {

        this.Thorax.render(0.01f);
    }

    public void renderStaticDisplayCase(float f) {

        this.Thorax.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLacewing ee = (EntityPrehistoricFloraLacewing) entitylivingbaseIn;


        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying

        }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLacewing entity = (EntityPrehistoricFloraLacewing) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Thorax, Thorax.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4, Thorax.rotateAngleY + (float) Math.toRadians(0), Thorax.rotateAngleZ + (float) Math.toRadians(0));
        this.Thorax.rotationPointX = this.Thorax.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
        this.Thorax.rotationPointY = this.Thorax.rotationPointY - (float)(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*0.8);
        this.Thorax.rotationPointZ = this.Thorax.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(0.6736), leftLeg1.rotateAngleY + (float) Math.toRadians(4.70101), leftLeg1.rotateAngleZ + (float) Math.toRadians(14.2523725387+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+20))*10);


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-0.6736), rightLeg1.rotateAngleY + (float) Math.toRadians(-4.70101), rightLeg1.rotateAngleZ + (float) Math.toRadians(-14.2524-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+40))*10);


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-3.1465+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, leftLeg2.rotateAngleY + (float) Math.toRadians(-11.54734), leftLeg2.rotateAngleZ + (float) Math.toRadians(-3.02002));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-3.1465+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, rightLeg2.rotateAngleY + (float) Math.toRadians(11.54734), rightLeg2.rotateAngleZ + (float) Math.toRadians(3.02002));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+80))*4, rightLeg3.rotateAngleY + (float) Math.toRadians(7.5), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*4, leftLeg3.rotateAngleY + (float) Math.toRadians(-7.5), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 76.85253 + (((tickAnim - 1) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 1) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 1) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 2.62502 + (((tickAnim - 2) / 0) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 2) / 0) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 2) / 0) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -44.86979 + (((tickAnim - 2) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 2) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 2) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 76.85253 + (((tickAnim - 4) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 4) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 4) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.62502 + (((tickAnim - 5) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 5) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 5) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -44.86979 + (((tickAnim - 6) / 0) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 6) / 0) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 6) / 0) * (0-(66.29607)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 76.85253 + (((tickAnim - 7) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 7) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 7) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.62502 + (((tickAnim - 8) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 8) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 8) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -44.86979 + (((tickAnim - 9) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 9) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 9) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 10) / 0) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 10) / 0) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 10) / 0) * (58.42988-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 76.85253 + (((tickAnim - 10) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 10) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 10) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 2.62502 + (((tickAnim - 11) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 11) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 11) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -44.86979 + (((tickAnim - 12) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 12) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 12) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 76.85253 + (((tickAnim - 14) / 0) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 14) / 0) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 14) / 0) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 2.62502 + (((tickAnim - 14) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 14) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 14) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -44.86979 + (((tickAnim - 15) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 15) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 15) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 76.85253 + (((tickAnim - 17) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 17) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 17) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 2.62502 + (((tickAnim - 18) / 0) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 18) / 0) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 18) / 0) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -44.86979 + (((tickAnim - 18) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 18) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 18) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 76.85253 + (((tickAnim - 20) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 20) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 20) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 2.62502 + (((tickAnim - 21) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 21) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 21) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -44.86979 + (((tickAnim - 22) / 0) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 22) / 0) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 22) / 0) * (0-(66.29607)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 76.85253 + (((tickAnim - 23) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 23) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 23) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 2.62502 + (((tickAnim - 24) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 24) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 24) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -44.86979 + (((tickAnim - 25) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 25) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 25) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 26) / 0) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 26) / 0) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 26) / 0) * (58.42988-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 76.85253 + (((tickAnim - 26) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 26) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 26) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 2.62502 + (((tickAnim - 27) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 27) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 27) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -44.86979 + (((tickAnim - 28) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 28) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 28) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 29) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 76.85253 + (((tickAnim - 30) / 0) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 30) / 0) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 30) / 0) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 2.62502 + (((tickAnim - 30) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 30) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 30) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -44.86979 + (((tickAnim - 31) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 31) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 31) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 76.85253 + (((tickAnim - 33) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 33) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 33) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 2.62502 + (((tickAnim - 34) / 0) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 34) / 0) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 34) / 0) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -44.86979 + (((tickAnim - 34) / 1) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 34) / 1) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 34) / 1) * (0-(66.29607)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 35) / 1) * (26.64319-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (58.42988-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 76.85253 + (((tickAnim - 36) / 1) * (2.62502-(76.85253)));
            yy = 26.64319 + (((tickAnim - 36) / 1) * (44.2722-(26.64319)));
            zz = 58.42988 + (((tickAnim - 36) / 1) * (121.323-(58.42988)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 2.62502 + (((tickAnim - 37) / 1) * (-44.86979-(2.62502)));
            yy = 44.2722 + (((tickAnim - 37) / 1) * (30.48488-(44.2722)));
            zz = 121.323 + (((tickAnim - 37) / 1) * (66.29607-(121.323)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -44.86979 + (((tickAnim - 38) / 0) * (0-(-44.86979)));
            yy = 30.48488 + (((tickAnim - 38) / 0) * (0-(30.48488)));
            zz = 66.29607 + (((tickAnim - 38) / 0) * (0-(66.29607)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 76.85253 + (((tickAnim - 1) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 1) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 1) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 2.62502 + (((tickAnim - 2) / 0) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 2) / 0) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 2) / 0) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -44.86979 + (((tickAnim - 2) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 2) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 2) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 76.85253 + (((tickAnim - 4) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 4) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 4) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.62502 + (((tickAnim - 5) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 5) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 5) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -44.86979 + (((tickAnim - 6) / 0) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 6) / 0) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 6) / 0) * (0-(-66.29607)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 76.85253 + (((tickAnim - 7) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 7) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 7) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.62502 + (((tickAnim - 8) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 8) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 8) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -44.86979 + (((tickAnim - 9) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 9) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 9) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 10) / 0) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 10) / 0) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 10) / 0) * (-58.42988-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 76.85253 + (((tickAnim - 10) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 10) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 10) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 2.62502 + (((tickAnim - 11) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 11) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 11) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -44.86979 + (((tickAnim - 12) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 12) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 12) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 76.85253 + (((tickAnim - 14) / 0) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 14) / 0) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 14) / 0) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 2.62502 + (((tickAnim - 14) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 14) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 14) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -44.86979 + (((tickAnim - 15) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 15) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 15) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 76.85253 + (((tickAnim - 17) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 17) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 17) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 2.62502 + (((tickAnim - 18) / 0) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 18) / 0) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 18) / 0) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -44.86979 + (((tickAnim - 18) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 18) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 18) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 76.85253 + (((tickAnim - 20) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 20) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 20) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 2.62502 + (((tickAnim - 21) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 21) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 21) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -44.86979 + (((tickAnim - 22) / 0) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 22) / 0) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 22) / 0) * (0-(-66.29607)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 76.85253 + (((tickAnim - 23) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 23) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 23) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 2.62502 + (((tickAnim - 24) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 24) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 24) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -44.86979 + (((tickAnim - 25) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 25) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 25) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 26) / 0) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 26) / 0) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 26) / 0) * (-58.42988-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 76.85253 + (((tickAnim - 26) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 26) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 26) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 2.62502 + (((tickAnim - 27) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 27) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 27) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -44.86979 + (((tickAnim - 28) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 28) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 28) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 29) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 76.85253 + (((tickAnim - 30) / 0) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 30) / 0) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 30) / 0) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 2.62502 + (((tickAnim - 30) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 30) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 30) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -44.86979 + (((tickAnim - 31) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 31) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 31) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 76.85253 + (((tickAnim - 33) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 33) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 33) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 2.62502 + (((tickAnim - 34) / 0) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 34) / 0) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 34) / 0) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -44.86979 + (((tickAnim - 34) / 1) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 34) / 1) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 34) / 1) * (0-(-66.29607)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (76.85253-(0)));
            yy = 0 + (((tickAnim - 35) / 1) * (-26.64319-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (-58.42988-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 76.85253 + (((tickAnim - 36) / 1) * (2.62502-(76.85253)));
            yy = -26.64319 + (((tickAnim - 36) / 1) * (-44.2722-(-26.64319)));
            zz = -58.42988 + (((tickAnim - 36) / 1) * (-121.323-(-58.42988)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 2.62502 + (((tickAnim - 37) / 1) * (-44.86979-(2.62502)));
            yy = -44.2722 + (((tickAnim - 37) / 1) * (-30.48488-(-44.2722)));
            zz = -121.323 + (((tickAnim - 37) / 1) * (-66.29607-(-121.323)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -44.86979 + (((tickAnim - 38) / 0) * (0-(-44.86979)));
            yy = -30.48488 + (((tickAnim - 38) / 0) * (0-(-30.48488)));
            zz = -66.29607 + (((tickAnim - 38) / 0) * (0-(-66.29607)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374-50))*6), leftHindwing.rotateAngleY + (float) Math.toRadians(0), leftHindwing.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374-30))*6), rightHindwing.rotateAngleY + (float) Math.toRadians(0), rightHindwing.rotateAngleZ + (float) Math.toRadians(0));

    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);


    }
}
