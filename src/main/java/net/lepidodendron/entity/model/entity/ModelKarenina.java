package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLacewing;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKarenina extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Karenina;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer Leg_3_L_r1;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer Leg_3_L_r2;

    public ModelKarenina() {
        this.textureWidth = 27;
        this.textureHeight = 24;

        this.Karenina = new AdvancedModelRenderer(this);
        this.Karenina.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.5F, -2.0F, -2.3F);
        this.Karenina.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 21, 8, -1.0F, -0.5F, -0.1F, 1, 1, 2, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1222F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 21, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 1.8F);
        this.thorax.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 8, -1.0F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2F, -1.8F);
        this.thorax.addChild(head);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4538F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.3F, 0.6F, -0.7F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 2, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.7F, 0.6F, -0.7F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(-0.3F, 0.0F, -0.9F);
        this.head.addChild(leftAntenna);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.2F, 0.3F, 0.0F);
        this.leftAntenna.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1079F, -0.5294F, -0.3766F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 14, -0.0642F, 0.0684F, -3.8005F, 2, 0, 4, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.7F, 0.0F, -0.9F);
        this.head.addChild(rightAntenna);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1F, 0.4F, 0.0F);
        this.rightAntenna.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1079F, 0.5294F, 0.3766F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, -1.8873F, -0.0575F, -3.7583F, 2, 0, 4, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.0F, -0.4F, 0.5F);
        this.thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 2.654F, -1.3508F, -1.3553F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 0, 4, -0.7F, 0.0F, -1.5F, 11, 0, 4, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-1.0F, -0.4F, 0.5F);
        this.thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 2.654F, 1.3508F, 1.3553F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 0, 0, -10.3F, 0.0F, -1.5F, 11, 0, 4, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(-0.1F, -0.3F, 1.9F);
        this.thorax.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.144F, -1.2313F, 1.267F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHindwing.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5061F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 11, -0.3108F, 0.0F, -0.5817F, 8, 0, 3, 0.0F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-0.9F, -0.3F, 1.9F);
        this.thorax.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.144F, 1.2313F, -1.267F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHindwing.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5061F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -7.6892F, 0.0F, -0.5817F, 8, 0, 3, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(-0.1F, 0.6F, -0.7F);
        this.thorax.addChild(leftLeg1);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.leftLeg1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1109F, 0.5772F, -0.0397F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 22, 0.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.9F, 0.1F, -0.7F);
        this.thorax.addChild(rightLeg1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.rightLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1109F, -0.5772F, 0.0397F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 19, -5.0166F, -0.4977F, -0.0445F, 5, 2, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.1F, 0.1F, 0.6F);
        this.thorax.addChild(leftLeg2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.leftLeg2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0709F, -0.5042F, -0.038F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 20, 0.0133F, -0.3982F, -0.0356F, 5, 2, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.9F, 0.1F, 0.6F);
        this.thorax.addChild(rightLeg2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.rightLeg2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0709F, 0.5042F, 0.038F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 18, -5.0166F, -0.4977F, -0.0445F, 5, 2, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.5F, 0.1F, 1.3F);
        this.thorax.addChild(leftLeg3);


        this.Leg_3_L_r1 = new AdvancedModelRenderer(this);
        this.Leg_3_L_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.leftLeg3.addChild(Leg_3_L_r1);
        this.setRotateAngle(Leg_3_L_r1, -0.032F, -1.0446F, -0.0662F);
        this.Leg_3_L_r1.cubeList.add(new ModelBox(Leg_3_L_r1, 12, 17, 0.0166F, -0.4977F, -0.0445F, 5, 2, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 0.1F, 1.3F);
        this.thorax.addChild(rightLeg3);


        this.Leg_3_L_r2 = new AdvancedModelRenderer(this);
        this.Leg_3_L_r2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.rightLeg3.addChild(Leg_3_L_r2);
        this.setRotateAngle(Leg_3_L_r2, -0.032F, 1.0446F, 0.0662F);
        this.Leg_3_L_r2.cubeList.add(new ModelBox(Leg_3_L_r2, 12, 15, -5.0166F, -0.4977F, -0.0445F, 5, 2, 0, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Karenina.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {

        this.Karenina.render(0.01f);
    }

    public void renderStaticFloor(float f) {

        this.Karenina.render(0.01f);
    }

    public void renderStaticDisplayCase(float f) {

        this.Karenina.render(0.01f);
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

        this.setRotateAngle(Karenina, Karenina.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4, Karenina.rotateAngleY + (float) Math.toRadians(0), Karenina.rotateAngleZ + (float) Math.toRadians(0));
        this.Karenina.rotationPointX = this.Karenina.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
        this.Karenina.rotationPointY = this.Karenina.rotationPointY - (float)(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*0.8);
        this.Karenina.rotationPointZ = this.Karenina.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 202.73312 + (((tickAnim - 0) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 0) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 0) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 277.05025 + (((tickAnim - 1) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 1) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 1) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 219.8226 + (((tickAnim - 2) / 0) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 2) / 0) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 2) / 0) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 170.589 + (((tickAnim - 2) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 2) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 2) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 202.73312 + (((tickAnim - 3) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 3) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 3) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 277.05025 + (((tickAnim - 4) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 4) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 4) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 219.8226 + (((tickAnim - 5) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 5) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 5) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 170.589 + (((tickAnim - 6) / 0) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 6) / 0) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 6) / 0) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 202.73312 + (((tickAnim - 6) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 6) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 6) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 277.05025 + (((tickAnim - 7) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 7) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 7) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 219.8226 + (((tickAnim - 8) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 8) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 8) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 170.589 + (((tickAnim - 9) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 9) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 9) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 202.73312 + (((tickAnim - 10) / 0) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 10) / 0) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 10) / 0) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 277.05025 + (((tickAnim - 10) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 10) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 10) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 219.8226 + (((tickAnim - 11) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 11) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 11) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 170.589 + (((tickAnim - 12) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 12) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 12) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 202.73312 + (((tickAnim - 13) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 13) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 13) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 277.05025 + (((tickAnim - 14) / 0) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 14) / 0) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 14) / 0) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 219.8226 + (((tickAnim - 14) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 14) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 14) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 170.589 + (((tickAnim - 15) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 15) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 15) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 202.73312 + (((tickAnim - 16) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 16) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 16) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 277.05025 + (((tickAnim - 17) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 17) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 17) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 219.8226 + (((tickAnim - 18) / 0) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 18) / 0) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 18) / 0) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 170.589 + (((tickAnim - 18) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 18) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 18) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 202.73312 + (((tickAnim - 19) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 19) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 19) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 277.05025 + (((tickAnim - 20) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 20) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 20) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 219.8226 + (((tickAnim - 21) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 21) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 21) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 170.589 + (((tickAnim - 22) / 0) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 22) / 0) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 22) / 0) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 202.73312 + (((tickAnim - 22) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 22) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 22) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 277.05025 + (((tickAnim - 23) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 23) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 23) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 219.8226 + (((tickAnim - 24) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 24) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 24) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 170.589 + (((tickAnim - 25) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 25) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 25) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 202.73312 + (((tickAnim - 26) / 0) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 26) / 0) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 26) / 0) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 277.05025 + (((tickAnim - 26) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 26) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 26) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 219.8226 + (((tickAnim - 27) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 27) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 27) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 170.589 + (((tickAnim - 28) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 28) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 28) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 202.73312 + (((tickAnim - 29) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 29) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 29) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 277.05025 + (((tickAnim - 30) / 0) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 30) / 0) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 30) / 0) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 219.8226 + (((tickAnim - 30) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 30) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 30) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 170.589 + (((tickAnim - 31) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 31) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 31) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 202.73312 + (((tickAnim - 32) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 32) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 32) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 277.05025 + (((tickAnim - 33) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 33) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 33) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 219.8226 + (((tickAnim - 34) / 0) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 34) / 0) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 34) / 0) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 170.589 + (((tickAnim - 34) / 1) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 34) / 1) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 34) / 1) * (-354.53313-(-301.20491)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 202.73312 + (((tickAnim - 35) / 1) * (277.05025-(202.73312)));
            yy = 81.30139 + (((tickAnim - 35) / 1) * (78.57845-(81.30139)));
            zz = -354.53313 + (((tickAnim - 35) / 1) * (-264.5518-(-354.53313)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 277.05025 + (((tickAnim - 36) / 1) * (219.8226-(277.05025)));
            yy = 78.57845 + (((tickAnim - 36) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 36) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 219.8226 + (((tickAnim - 37) / 1) * (170.589-(219.8226)));
            yy = 77.03172 + (((tickAnim - 37) / 1) * (88.4494-(77.03172)));
            zz = -215.19193 + (((tickAnim - 37) / 1) * (-301.20491-(-215.19193)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 170.589 + (((tickAnim - 38) / 0) * (202.73312-(170.589)));
            yy = 88.4494 + (((tickAnim - 38) / 0) * (81.30139-(88.4494)));
            zz = -301.20491 + (((tickAnim - 38) / 0) * (-354.53313-(-301.20491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 202.73312 + (((tickAnim - 0) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 0) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 0) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 277.05025 + (((tickAnim - 1) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 1) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 1) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 219.8226 + (((tickAnim - 2) / 0) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 2) / 0) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 2) / 0) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 170.589 + (((tickAnim - 2) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 2) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 2) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 202.73312 + (((tickAnim - 3) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 3) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 3) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 277.05025 + (((tickAnim - 4) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 4) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 4) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 219.8226 + (((tickAnim - 5) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 5) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 5) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 170.589 + (((tickAnim - 6) / 0) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 6) / 0) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 6) / 0) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 202.73312 + (((tickAnim - 6) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 6) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 6) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 277.05025 + (((tickAnim - 7) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 7) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 7) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 219.8226 + (((tickAnim - 8) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 8) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 8) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 170.589 + (((tickAnim - 9) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 9) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 9) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 202.73312 + (((tickAnim - 10) / 0) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 10) / 0) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 10) / 0) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 277.05025 + (((tickAnim - 10) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 10) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 10) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 219.8226 + (((tickAnim - 11) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 11) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 11) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 170.589 + (((tickAnim - 12) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 12) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 12) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 202.73312 + (((tickAnim - 13) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 13) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 13) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 277.05025 + (((tickAnim - 14) / 0) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 14) / 0) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 14) / 0) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 219.8226 + (((tickAnim - 14) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 14) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 14) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 170.589 + (((tickAnim - 15) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 15) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 15) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 202.73312 + (((tickAnim - 16) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 16) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 16) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 277.05025 + (((tickAnim - 17) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 17) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 17) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 219.8226 + (((tickAnim - 18) / 0) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 18) / 0) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 18) / 0) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 170.589 + (((tickAnim - 18) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 18) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 18) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 202.73312 + (((tickAnim - 19) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 19) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 19) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 277.05025 + (((tickAnim - 20) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 20) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 20) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 219.8226 + (((tickAnim - 21) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 21) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 21) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 170.589 + (((tickAnim - 22) / 0) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 22) / 0) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 22) / 0) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 202.73312 + (((tickAnim - 22) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 22) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 22) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 277.05025 + (((tickAnim - 23) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 23) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 23) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 219.8226 + (((tickAnim - 24) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 24) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 24) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 170.589 + (((tickAnim - 25) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 25) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 25) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 202.73312 + (((tickAnim - 26) / 0) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 26) / 0) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 26) / 0) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 277.05025 + (((tickAnim - 26) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 26) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 26) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 219.8226 + (((tickAnim - 27) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 27) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 27) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 170.589 + (((tickAnim - 28) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 28) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 28) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 202.73312 + (((tickAnim - 29) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 29) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 29) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 277.05025 + (((tickAnim - 30) / 0) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 30) / 0) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 30) / 0) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 219.8226 + (((tickAnim - 30) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 30) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 30) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 170.589 + (((tickAnim - 31) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 31) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 31) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 202.73312 + (((tickAnim - 32) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 32) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 32) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 277.05025 + (((tickAnim - 33) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 33) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 33) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 219.8226 + (((tickAnim - 34) / 0) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 34) / 0) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 34) / 0) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 170.589 + (((tickAnim - 34) / 1) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 34) / 1) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 34) / 1) * (354.53313-(301.20491)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 202.73312 + (((tickAnim - 35) / 1) * (277.05025-(202.73312)));
            yy = -81.30139 + (((tickAnim - 35) / 1) * (-78.57845-(-81.30139)));
            zz = 354.53313 + (((tickAnim - 35) / 1) * (264.5518-(354.53313)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 277.05025 + (((tickAnim - 36) / 1) * (219.8226-(277.05025)));
            yy = -78.57845 + (((tickAnim - 36) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 36) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 219.8226 + (((tickAnim - 37) / 1) * (170.589-(219.8226)));
            yy = -77.03172 + (((tickAnim - 37) / 1) * (-88.4494-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 37) / 1) * (301.20491-(215.19193)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 170.589 + (((tickAnim - 38) / 0) * (202.73312-(170.589)));
            yy = -88.4494 + (((tickAnim - 38) / 0) * (-81.30139-(-88.4494)));
            zz = 301.20491 + (((tickAnim - 38) / 0) * (354.53313-(301.20491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -24.67954 + (((tickAnim - 0) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 0) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 0) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 17.18597 + (((tickAnim - 1) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 1) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 1) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 20.85438 + (((tickAnim - 2) / 0) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 2) / 0) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 2) / 0) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -59.12045 + (((tickAnim - 2) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 2) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 2) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -24.67954 + (((tickAnim - 3) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 3) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 3) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 17.18597 + (((tickAnim - 4) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 4) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 4) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 20.85438 + (((tickAnim - 5) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 5) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 5) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -59.12045 + (((tickAnim - 6) / 0) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 6) / 0) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 6) / 0) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -24.67954 + (((tickAnim - 6) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 6) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 6) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 17.18597 + (((tickAnim - 7) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 7) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 7) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.85438 + (((tickAnim - 8) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 8) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 8) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -59.12045 + (((tickAnim - 9) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 9) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 9) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -24.67954 + (((tickAnim - 10) / 0) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 10) / 0) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 10) / 0) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 17.18597 + (((tickAnim - 10) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 10) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 10) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 20.85438 + (((tickAnim - 11) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 11) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 11) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -59.12045 + (((tickAnim - 12) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 12) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 12) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -24.67954 + (((tickAnim - 13) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 13) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 13) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 17.18597 + (((tickAnim - 14) / 0) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 14) / 0) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 14) / 0) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 20.85438 + (((tickAnim - 14) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 14) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 14) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -59.12045 + (((tickAnim - 15) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 15) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 15) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -24.67954 + (((tickAnim - 16) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 16) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 16) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 17.18597 + (((tickAnim - 17) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 17) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 17) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 20.85438 + (((tickAnim - 18) / 0) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 18) / 0) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 18) / 0) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -59.12045 + (((tickAnim - 18) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 18) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 18) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -24.67954 + (((tickAnim - 19) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 19) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 19) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 17.18597 + (((tickAnim - 20) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 20) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 20) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 20.85438 + (((tickAnim - 21) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 21) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 21) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -59.12045 + (((tickAnim - 22) / 0) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 22) / 0) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 22) / 0) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -24.67954 + (((tickAnim - 22) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 22) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 22) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 17.18597 + (((tickAnim - 23) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 23) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 23) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 20.85438 + (((tickAnim - 24) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 24) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 24) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -59.12045 + (((tickAnim - 25) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 25) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 25) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -24.67954 + (((tickAnim - 26) / 0) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 26) / 0) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 26) / 0) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 17.18597 + (((tickAnim - 26) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 26) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 26) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 20.85438 + (((tickAnim - 27) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 27) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 27) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -59.12045 + (((tickAnim - 28) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 28) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 28) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -24.67954 + (((tickAnim - 29) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 29) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 29) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 17.18597 + (((tickAnim - 30) / 0) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 30) / 0) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 30) / 0) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 20.85438 + (((tickAnim - 30) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 30) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 30) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -59.12045 + (((tickAnim - 31) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 31) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 31) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -24.67954 + (((tickAnim - 32) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 32) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 32) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 17.18597 + (((tickAnim - 33) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 33) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 33) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 20.85438 + (((tickAnim - 34) / 0) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 34) / 0) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 34) / 0) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -59.12045 + (((tickAnim - 34) / 1) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 34) / 1) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 34) / 1) * (-145.2653-(-88.56589)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -24.67954 + (((tickAnim - 35) / 1) * (17.18597-(-24.67954)));
            yy = 95.21477 + (((tickAnim - 35) / 1) * (84.0415-(95.21477)));
            zz = -145.2653 + (((tickAnim - 35) / 1) * (-55.34338-(-145.2653)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 17.18597 + (((tickAnim - 36) / 1) * (20.85438-(17.18597)));
            yy = 84.0415 + (((tickAnim - 36) / 1) * (84.84316-(84.0415)));
            zz = -55.34338 + (((tickAnim - 36) / 1) * (5.87034-(-55.34338)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 20.85438 + (((tickAnim - 37) / 1) * (-59.12045-(20.85438)));
            yy = 84.84316 + (((tickAnim - 37) / 1) * (80.70653-(84.84316)));
            zz = 5.87034 + (((tickAnim - 37) / 1) * (-88.56589-(5.87034)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -59.12045 + (((tickAnim - 38) / 0) * (-24.67954-(-59.12045)));
            yy = 80.70653 + (((tickAnim - 38) / 0) * (95.21477-(80.70653)));
            zz = -88.56589 + (((tickAnim - 38) / 0) * (-145.2653-(-88.56589)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -24.67954 + (((tickAnim - 0) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 0) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 0) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 17.18597 + (((tickAnim - 1) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 1) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 1) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 20.85438 + (((tickAnim - 2) / 0) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 2) / 0) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 2) / 0) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -59.12045 + (((tickAnim - 2) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 2) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 2) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -24.67954 + (((tickAnim - 3) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 3) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 3) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 17.18597 + (((tickAnim - 4) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 4) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 4) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 20.85438 + (((tickAnim - 5) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 5) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 5) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -59.12045 + (((tickAnim - 6) / 0) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 6) / 0) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 6) / 0) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -24.67954 + (((tickAnim - 6) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 6) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 6) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 17.18597 + (((tickAnim - 7) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 7) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 7) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.85438 + (((tickAnim - 8) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 8) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 8) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -59.12045 + (((tickAnim - 9) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 9) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 9) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -24.67954 + (((tickAnim - 10) / 0) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 10) / 0) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 10) / 0) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 17.18597 + (((tickAnim - 10) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 10) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 10) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 20.85438 + (((tickAnim - 11) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 11) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 11) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -59.12045 + (((tickAnim - 12) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 12) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 12) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -24.67954 + (((tickAnim - 13) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 13) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 13) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 17.18597 + (((tickAnim - 14) / 0) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 14) / 0) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 14) / 0) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 20.85438 + (((tickAnim - 14) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 14) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 14) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -59.12045 + (((tickAnim - 15) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 15) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 15) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -24.67954 + (((tickAnim - 16) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 16) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 16) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 17.18597 + (((tickAnim - 17) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 17) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 17) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 20.85438 + (((tickAnim - 18) / 0) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 18) / 0) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 18) / 0) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -59.12045 + (((tickAnim - 18) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 18) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 18) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -24.67954 + (((tickAnim - 19) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 19) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 19) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 17.18597 + (((tickAnim - 20) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 20) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 20) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 20.85438 + (((tickAnim - 21) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 21) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 21) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -59.12045 + (((tickAnim - 22) / 0) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 22) / 0) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 22) / 0) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -24.67954 + (((tickAnim - 22) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 22) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 22) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 17.18597 + (((tickAnim - 23) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 23) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 23) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 20.85438 + (((tickAnim - 24) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 24) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 24) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -59.12045 + (((tickAnim - 25) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 25) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 25) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -24.67954 + (((tickAnim - 26) / 0) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 26) / 0) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 26) / 0) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 17.18597 + (((tickAnim - 26) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 26) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 26) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 20.85438 + (((tickAnim - 27) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 27) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 27) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -59.12045 + (((tickAnim - 28) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 28) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 28) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -24.67954 + (((tickAnim - 29) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 29) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 29) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 17.18597 + (((tickAnim - 30) / 0) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 30) / 0) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 30) / 0) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 20.85438 + (((tickAnim - 30) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 30) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 30) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -59.12045 + (((tickAnim - 31) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 31) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 31) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -24.67954 + (((tickAnim - 32) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 32) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 32) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 17.18597 + (((tickAnim - 33) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 33) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 33) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 20.85438 + (((tickAnim - 34) / 0) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 34) / 0) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 34) / 0) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -59.12045 + (((tickAnim - 34) / 1) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 34) / 1) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 34) / 1) * (145.2653-(88.56589)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -24.67954 + (((tickAnim - 35) / 1) * (17.18597-(-24.67954)));
            yy = -95.21477 + (((tickAnim - 35) / 1) * (-84.0415-(-95.21477)));
            zz = 145.2653 + (((tickAnim - 35) / 1) * (55.34338-(145.2653)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 17.18597 + (((tickAnim - 36) / 1) * (20.85438-(17.18597)));
            yy = -84.0415 + (((tickAnim - 36) / 1) * (-84.84316-(-84.0415)));
            zz = 55.34338 + (((tickAnim - 36) / 1) * (-5.87034-(55.34338)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 20.85438 + (((tickAnim - 37) / 1) * (-59.12045-(20.85438)));
            yy = -84.84316 + (((tickAnim - 37) / 1) * (-80.70653-(-84.84316)));
            zz = -5.87034 + (((tickAnim - 37) / 1) * (88.56589-(-5.87034)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -59.12045 + (((tickAnim - 38) / 0) * (-24.67954-(-59.12045)));
            yy = -80.70653 + (((tickAnim - 38) / 0) * (-95.21477-(-80.70653)));
            zz = 88.56589 + (((tickAnim - 38) / 0) * (145.2653-(88.56589)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(2.88869), leftLeg1.rotateAngleY + (float) Math.toRadians(14.68709), leftLeg1.rotateAngleZ + (float) Math.toRadians(1.1456+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+20))*5);


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(2.88869), rightLeg1.rotateAngleY + (float) Math.toRadians(-14.68709), rightLeg1.rotateAngleZ + (float) Math.toRadians(-1.1456-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+40))*5);


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-19.3445+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, leftLeg2.rotateAngleY + (float) Math.toRadians(-30.88829), leftLeg2.rotateAngleZ + (float) Math.toRadians(24.73582));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-19.3445+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, rightLeg2.rotateAngleY + (float) Math.toRadians(30.88829), rightLeg2.rotateAngleZ + (float) Math.toRadians(-24.73582));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-7.7069+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*4, leftLeg3.rotateAngleY + (float) Math.toRadians(-12.35866), leftLeg3.rotateAngleZ + (float) Math.toRadians(1.19876));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-7.7069+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+80))*4, rightLeg3.rotateAngleY + (float) Math.toRadians(12.35866), rightLeg3.rotateAngleZ + (float) Math.toRadians(-1.19876));

    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);


    }
}
