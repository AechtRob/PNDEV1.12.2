package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCratosirex;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCratosirex extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;

    public ModelCratosirex() {
        this.textureWidth = 23;
        this.textureHeight = 20;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.7F, -0.8F);
        this.setRotateAngle(main, 0.0524F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 2, -0.5F, -0.8541F, -1.83F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.6459F, 2.77F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 11, -1.0F, -2.0F, -4.0F, 2, 2, 3, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.8447F, -1.7311F);
        this.main.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -0.425F, -0.6F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.9774F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 8, 0.0F, -0.4848F, 0.6246F, 2, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, 0.5F, -0.4848F, -0.0754F, 1, 1, 1, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9266F, 0.0518F, -0.1911F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.9156F, -1.51F, 0.3402F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9266F, -0.0518F, 0.1911F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.0844F, -1.51F, 0.3402F, 1, 1, 1, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.5F, -1.0F, -0.6F);
        this.head.addChild(leftAntenna);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.leftAntenna.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.5672F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 8, -1.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.5F, -1.0F, -0.6F);
        this.head.addChild(rightAntenna);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.rightAntenna.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5672F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 8, -1.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.9041F, 1.57F);
        this.main.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.1396F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 4, -1.0F, -0.18F, -0.4F, 2, 1, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 17, 12, -0.5F, -0.178F, 5.15F, 1, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 10, 16, -1.0F, 0.42F, 1.6F, 2, 1, 2, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.2909F, 0.9028F);
        this.abdomen.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.2479F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 4, -1.0F, -1.0F, 0.0F, 2, 3, 1, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.7F, 5.6F);
        this.abdomen.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 9, -0.5F, -1.55F, -2.603F, 1, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 4, -0.5F, -0.54F, -2.603F, 1, 0, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0551F, 4.6149F);
        this.abdomen.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.2479F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 4, -1.0F, -1.0F, -0.75F, 2, 3, 1, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.0869F, 6.4091F);
        this.abdomen.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 9, 0.0F, -1.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.7F, -0.8541F, -0.43F);
        this.main.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0F, -1.5272F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.1347F, 1.8F, 0.9957F);
        this.leftForewing.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1222F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.346F, -2.02F, -1.4775F, 9, 0, 4, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.7F, -0.8541F, -0.43F);
        this.main.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0F, 1.5272F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.1347F, 1.8F, 0.9957F);
        this.rightForewing.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.1222F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -9.346F, -2.0272F, -1.4775F, 9, 0, 4, 0.0F, true));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(0.8F, -1.1541F, 0.07F);
        this.main.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.0F, -1.0036F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.2F, 1.5F);
        this.leftHindwing.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.4014F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 11, -0.4787F, -0.03F, -1.7731F, 5, 0, 3, 0.0F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-0.8F, -1.1541F, 0.07F);
        this.main.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.0F, 1.0036F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.2F, 1.5F);
        this.rightHindwing.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.4014F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 11, -4.5213F, -0.0324F, -1.7731F, 5, 0, 3, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 0.6459F, -0.73F);
        this.main.addChild(leftLeg1);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.leftLeg1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0832F, 0.5744F, -0.0453F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 16, -0.3583F, -0.2135F, 0.0118F, 4, 2, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 0.6459F, -0.73F);
        this.main.addChild(rightLeg1);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.rightLeg1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0832F, -0.5744F, 0.0453F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 16, -3.6417F, -0.2135F, 0.0118F, 4, 2, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 0.6459F, 0.47F);
        this.main.addChild(leftLeg2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.leftLeg2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0734F, -0.3134F, 0.0227F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 14, -0.3583F, -0.2135F, 0.0118F, 4, 2, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 0.6459F, 0.47F);
        this.main.addChild(rightLeg2);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.rightLeg2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0734F, 0.3134F, -0.0227F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 14, -3.6417F, -0.2135F, 0.0118F, 4, 2, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 0.6459F, 1.47F);
        this.main.addChild(leftLeg3);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.leftLeg3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1845F, -1.1808F, 0.171F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 16, -0.3583F, -0.2135F, 0.0118F, 6, 2, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 0.6459F, 1.47F);
        this.main.addChild(rightLeg3);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.rightLeg3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1845F, 1.1808F, -0.171F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 16, -5.6417F, -0.2135F, 0.0118F, 6, 2, 0, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, 0.0F);
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.main.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.30F;
        this.main.offsetX = -0.05F;
        this.main.rotateAngleY = (float)Math.toRadians(210);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.9F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraCratosirex ee = (EntityPrehistoricFloraCratosirex) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCratosirex ee = (EntityPrehistoricFloraCratosirex) entitylivingbaseIn;

        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying

        }
        if (ee.getAnimation() == ee.STAND_ANIMATION) { //The idle scratch
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCratosirex entity = (EntityPrehistoricFloraCratosirex) entitylivingbaseIn;
        int animCycle = 115;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 17.5 + (((tickAnim - 10) / 8) * (22.5-(17.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 18) / 2) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 17.5 + (((tickAnim - 20) / 2) * (22.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 22) / 3) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 17.5 + (((tickAnim - 25) / 13) * (0-(17.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 38) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 50) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 88) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 8) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 96) / 9) * (17.5-(0)));
            yy = 0 + (((tickAnim - 96) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 17.5 + (((tickAnim - 105) / 10) * (0-(17.5)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 15) * (1-(1)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 1 + (((tickAnim - 25) / 13) * (0-(1)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 38) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 50) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 88) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 8) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 96) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 9) * (1-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 105) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -42.5 + (((tickAnim - 15) / 3) * (-50-(-42.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -50 + (((tickAnim - 18) / 2) * (-42.5-(-50)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -42.5 + (((tickAnim - 20) / 2) * (-50-(-42.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -50 + (((tickAnim - 22) / 3) * (-42.5-(-50)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -42.5 + (((tickAnim - 25) / 13) * (-22.5-(-42.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -22.5 + (((tickAnim - 38) / 9) * (-20-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*3-(-22.5)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 78) {
            xx = -20-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*3 + (((tickAnim - 47) / 31) * (-20-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*2-(-20-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*3)));
            yy = 0 + (((tickAnim - 47) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 31) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = -20-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*2 + (((tickAnim - 78) / 10) * (-25-(-20-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*2)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 96) {
            xx = -25 + (((tickAnim - 88) / 8) * (-27.5-(-25)));
            yy = 0 + (((tickAnim - 88) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 8) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = -27.5 + (((tickAnim - 96) / 9) * (-45-(-27.5)));
            yy = 0 + (((tickAnim - 96) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = -45 + (((tickAnim - 105) / 3) * (-2.3-(-45)));
            yy = 0 + (((tickAnim - 105) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 3) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = -2.3 + (((tickAnim - 108) / 3) * (5.39-(-2.3)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.31594-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.15393-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.1522-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.31594 + (((tickAnim - 5) / 5) * (0-(-12.31594)));
            yy = -2.15393 + (((tickAnim - 5) / 5) * (0-(-2.15393)));
            zz = -5.1522 + (((tickAnim - 5) / 5) * (10-(-5.1522)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (5-(0)));
            zz = 10 + (((tickAnim - 10) / 8) * (10-(10)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 5 + (((tickAnim - 18) / 4) * (5-(5)));
            zz = 10 + (((tickAnim - 18) / 4) * (10-(10)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 5 + (((tickAnim - 22) / 4) * (0-(5)));
            zz = 10 + (((tickAnim - 22) / 4) * (10-(10)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 10 + (((tickAnim - 26) / 12) * (0-(10)));
        }
        else if (tickAnim >= 38 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 58) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 96) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (10-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 10 + (((tickAnim - 105) / 10) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (21.79-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 21.79 + (((tickAnim - 8) / 2) * (-10-(21.79)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (-5-(0)));
            zz = -10 + (((tickAnim - 10) / 8) * (-10-(-10)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -5 + (((tickAnim - 18) / 4) * (-5-(-5)));
            zz = -10 + (((tickAnim - 18) / 4) * (-10-(-10)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = -5 + (((tickAnim - 22) / 4) * (0-(-5)));
            zz = -10 + (((tickAnim - 22) / 4) * (-10-(-10)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = -10 + (((tickAnim - 26) / 12) * (0-(-10)));
        }
        else if (tickAnim >= 38 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 58) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 96) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (-10-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = -10 + (((tickAnim - 105) / 10) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-17.44535-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (19.75962-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (21.20061-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -17.44535 + (((tickAnim - 10) / 8) * (-17.76996-(-17.44535)));
            yy = 19.75962 + (((tickAnim - 10) / 8) * (22.26611-(19.75962)));
            zz = 21.20061 + (((tickAnim - 10) / 8) * (20.33662-(21.20061)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17.76996 + (((tickAnim - 18) / 2) * (-17.2777-(-17.76996)));
            yy = 22.26611 + (((tickAnim - 18) / 2) * (17.6957-(22.26611)));
            zz = 20.33662 + (((tickAnim - 18) / 2) * (21.85115-(20.33662)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -17.2777 + (((tickAnim - 20) / 2) * (-17.76996-(-17.2777)));
            yy = 17.6957 + (((tickAnim - 20) / 2) * (22.26611-(17.6957)));
            zz = 21.85115 + (((tickAnim - 20) / 2) * (20.33662-(21.85115)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -17.76996 + (((tickAnim - 22) / 1) * (-17.2777-(-17.76996)));
            yy = 22.26611 + (((tickAnim - 22) / 1) * (17.6957-(22.26611)));
            zz = 20.33662 + (((tickAnim - 22) / 1) * (21.85115-(20.33662)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -17.2777 + (((tickAnim - 23) / 3) * (-16.98216-(-17.2777)));
            yy = 17.6957 + (((tickAnim - 23) / 3) * (14.98328-(17.6957)));
            zz = 21.85115 + (((tickAnim - 23) / 3) * (22.75057-(21.85115)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -16.98216 + (((tickAnim - 26) / 12) * (0-(-16.98216)));
            yy = 14.98328 + (((tickAnim - 26) / 12) * (0-(14.98328)));
            zz = 22.75057 + (((tickAnim - 26) / 12) * (0-(22.75057)));
        }
        else if (tickAnim >= 38 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 58) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 96) / 9) * (-16.98216-(0)));
            yy = 0 + (((tickAnim - 96) / 9) * (14.98328-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (22.75057-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -16.98216 + (((tickAnim - 105) / 10) * (0-(-16.98216)));
            yy = 14.98328 + (((tickAnim - 105) / 10) * (0-(14.98328)));
            zz = 22.75057 + (((tickAnim - 105) / 10) * (0-(22.75057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-17.44535-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-19.75962-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-21.20061-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -17.44535 + (((tickAnim - 10) / 8) * (-17.76996-(-17.44535)));
            yy = -19.75962 + (((tickAnim - 10) / 8) * (-22.26611-(-19.75962)));
            zz = -21.20061 + (((tickAnim - 10) / 8) * (-20.33662-(-21.20061)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17.76996 + (((tickAnim - 18) / 2) * (-17.2777-(-17.76996)));
            yy = -22.26611 + (((tickAnim - 18) / 2) * (-17.6957-(-22.26611)));
            zz = -20.33662 + (((tickAnim - 18) / 2) * (-21.85115-(-20.33662)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -17.2777 + (((tickAnim - 20) / 2) * (-17.76996-(-17.2777)));
            yy = -17.6957 + (((tickAnim - 20) / 2) * (-22.26611-(-17.6957)));
            zz = -21.85115 + (((tickAnim - 20) / 2) * (-20.33662-(-21.85115)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -17.76996 + (((tickAnim - 22) / 1) * (-17.2777-(-17.76996)));
            yy = -22.26611 + (((tickAnim - 22) / 1) * (-17.6957-(-22.26611)));
            zz = -20.33662 + (((tickAnim - 22) / 1) * (-21.85115-(-20.33662)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -17.2777 + (((tickAnim - 23) / 3) * (-16.98216-(-17.2777)));
            yy = -17.6957 + (((tickAnim - 23) / 3) * (-14.98328-(-17.6957)));
            zz = -21.85115 + (((tickAnim - 23) / 3) * (-22.75057-(-21.85115)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -16.98216 + (((tickAnim - 26) / 12) * (0-(-16.98216)));
            yy = -14.98328 + (((tickAnim - 26) / 12) * (0-(-14.98328)));
            zz = -22.75057 + (((tickAnim - 26) / 12) * (0-(-22.75057)));
        }
        else if (tickAnim >= 38 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 58) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 96) / 9) * (-16.98216-(0)));
            yy = 0 + (((tickAnim - 96) / 9) * (-14.98328-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (-22.75057-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -16.98216 + (((tickAnim - 105) / 10) * (0-(-16.98216)));
            yy = -14.98328 + (((tickAnim - 105) / 10) * (0-(-14.98328)));
            zz = -22.75057 + (((tickAnim - 105) / 10) * (0-(-22.75057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.65744-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.65469-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.82772-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.65744 + (((tickAnim - 5) / 5) * (-40.42445-(-8.65744)));
            yy = 3.65469 + (((tickAnim - 5) / 5) * (7.9185-(3.65469)));
            zz = -2.82772 + (((tickAnim - 5) / 5) * (-6.12673-(-2.82772)));
        }
        else if (tickAnim >= 10 && tickAnim < 26) {
            xx = -40.42445 + (((tickAnim - 10) / 16) * (-40.42445-(-40.42445)));
            yy = 7.9185 + (((tickAnim - 10) / 16) * (7.9185-(7.9185)));
            zz = -6.12673 + (((tickAnim - 10) / 16) * (-6.12673-(-6.12673)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -40.42445 + (((tickAnim - 26) / 12) * (0-(-40.42445)));
            yy = 7.9185 + (((tickAnim - 26) / 12) * (0-(7.9185)));
            zz = -6.12673 + (((tickAnim - 26) / 12) * (0-(-6.12673)));
        }
        else if (tickAnim >= 38 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 58) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 96) / 9) * (-40.42445-(0)));
            yy = 0 + (((tickAnim - 96) / 9) * (7.9185-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (-6.12673-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 114) {
            xx = -40.42445 + (((tickAnim - 105) / 9) * (0-(-40.42445)));
            yy = 7.9185 + (((tickAnim - 105) / 9) * (0-(7.9185)));
            zz = -6.12673 + (((tickAnim - 105) / 9) * (0-(-6.12673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.65744-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.65469-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.82772-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.65744 + (((tickAnim - 5) / 5) * (-40.42445-(-8.65744)));
            yy = -3.65469 + (((tickAnim - 5) / 5) * (-7.9185-(-3.65469)));
            zz = 2.82772 + (((tickAnim - 5) / 5) * (6.12673-(2.82772)));
        }
        else if (tickAnim >= 10 && tickAnim < 26) {
            xx = -40.42445 + (((tickAnim - 10) / 16) * (-40.42445-(-40.42445)));
            yy = -7.9185 + (((tickAnim - 10) / 16) * (-7.9185-(-7.9185)));
            zz = 6.12673 + (((tickAnim - 10) / 16) * (6.12673-(6.12673)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -40.42445 + (((tickAnim - 26) / 4) * (-6.75467-(-40.42445)));
            yy = -7.9185 + (((tickAnim - 26) / 4) * (-4.7511-(-7.9185)));
            zz = 6.12673 + (((tickAnim - 26) / 4) * (3.67604-(6.12673)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -6.75467 + (((tickAnim - 30) / 8) * (0-(-6.75467)));
            yy = -4.7511 + (((tickAnim - 30) / 8) * (0-(-4.7511)));
            zz = 3.67604 + (((tickAnim - 30) / 8) * (0-(3.67604)));
        }
        else if (tickAnim >= 38 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 58) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 96) / 9) * (-40.42445-(0)));
            yy = 0 + (((tickAnim - 96) / 9) * (-7.9185-(0)));
            zz = 0 + (((tickAnim - 96) / 9) * (6.12673-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 114) {
            xx = -40.42445 + (((tickAnim - 105) / 9) * (0-(-40.42445)));
            yy = -7.9185 + (((tickAnim - 105) / 9) * (0-(-7.9185)));
            zz = 6.12673 + (((tickAnim - 105) / 9) * (0-(6.12673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCratosirex entity = (EntityPrehistoricFloraCratosirex) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(80+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4, main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*2);
        this.main.rotationPointY = (float) (this.main.rotationPointY - (float)((3.6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*1.5))+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1496+40))*0.2));
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+90))*5+10), abdomen.rotateAngleY + (float) Math.toRadians(0), abdomen.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.47864 + (((tickAnim - 0) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 0) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 0) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 63.85001 + (((tickAnim - 1) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 1) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 1) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -1.43455 + (((tickAnim - 2) / 0) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 2) / 0) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 2) / 0) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -34.40977 + (((tickAnim - 2) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 2) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 2) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.47864 + (((tickAnim - 3) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 3) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 3) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 63.85001 + (((tickAnim - 4) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 4) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 4) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -1.43455 + (((tickAnim - 5) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 5) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 5) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -34.40977 + (((tickAnim - 6) / 0) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 6) / 0) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 6) / 0) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.47864 + (((tickAnim - 6) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 6) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 6) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 63.85001 + (((tickAnim - 7) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 7) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 7) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -1.43455 + (((tickAnim - 8) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 8) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 8) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -34.40977 + (((tickAnim - 9) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 9) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 9) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 2.47864 + (((tickAnim - 10) / 0) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 10) / 0) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 10) / 0) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 63.85001 + (((tickAnim - 10) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 10) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 10) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -1.43455 + (((tickAnim - 11) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 11) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 11) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -34.40977 + (((tickAnim - 12) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 12) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 12) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 2.47864 + (((tickAnim - 13) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 13) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 13) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 63.85001 + (((tickAnim - 14) / 0) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 14) / 0) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 14) / 0) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -1.43455 + (((tickAnim - 14) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 14) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 14) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -34.40977 + (((tickAnim - 15) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 15) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 15) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 2.47864 + (((tickAnim - 16) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 16) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 16) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 63.85001 + (((tickAnim - 17) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 17) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 17) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -1.43455 + (((tickAnim - 18) / 0) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 18) / 0) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 18) / 0) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -34.40977 + (((tickAnim - 18) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 18) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 18) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 2.47864 + (((tickAnim - 19) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 19) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 19) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 63.85001 + (((tickAnim - 20) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 20) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 20) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -1.43455 + (((tickAnim - 21) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 21) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 21) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -34.40977 + (((tickAnim - 22) / 0) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 22) / 0) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 22) / 0) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 2.47864 + (((tickAnim - 22) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 22) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 22) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 63.85001 + (((tickAnim - 23) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 23) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 23) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -1.43455 + (((tickAnim - 24) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 24) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 24) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -34.40977 + (((tickAnim - 25) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 25) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 25) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 2.47864 + (((tickAnim - 26) / 0) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 26) / 0) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 26) / 0) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 63.85001 + (((tickAnim - 26) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 26) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 26) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -1.43455 + (((tickAnim - 27) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 27) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 27) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -34.40977 + (((tickAnim - 28) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 28) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 28) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 2.47864 + (((tickAnim - 29) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 29) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 29) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 63.85001 + (((tickAnim - 30) / 0) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 30) / 0) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 30) / 0) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -1.43455 + (((tickAnim - 30) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 30) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 30) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -34.40977 + (((tickAnim - 31) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 31) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 31) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 2.47864 + (((tickAnim - 32) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 32) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 32) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 63.85001 + (((tickAnim - 33) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 33) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 33) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -1.43455 + (((tickAnim - 34) / 0) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 34) / 0) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 34) / 0) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -34.40977 + (((tickAnim - 34) / 1) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 34) / 1) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 34) / 1) * (-82.50706-(-25.80349)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 2.47864 + (((tickAnim - 35) / 1) * (63.85001-(2.47864)));
            yy = 87.17379 + (((tickAnim - 35) / 1) * (114.26857-(87.17379)));
            zz = -82.50706 + (((tickAnim - 35) / 1) * (-5.10623-(-82.50706)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 63.85001 + (((tickAnim - 36) / 1) * (-1.43455-(63.85001)));
            yy = 114.26857 + (((tickAnim - 36) / 1) * (85.45233-(114.26857)));
            zz = -5.10623 + (((tickAnim - 36) / 1) * (35.02564-(-5.10623)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -1.43455 + (((tickAnim - 37) / 1) * (-34.40977-(-1.43455)));
            yy = 85.45233 + (((tickAnim - 37) / 1) * (84.89891-(85.45233)));
            zz = 35.02564 + (((tickAnim - 37) / 1) * (-25.80349-(35.02564)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -34.40977 + (((tickAnim - 38) / 0) * (2.47864-(-34.40977)));
            yy = 84.89891 + (((tickAnim - 38) / 0) * (87.17379-(84.89891)));
            zz = -25.80349 + (((tickAnim - 38) / 0) * (-82.50706-(-25.80349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.47864 + (((tickAnim - 0) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 0) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 0) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 63.85001 + (((tickAnim - 1) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 1) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 1) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -1.43455 + (((tickAnim - 2) / 0) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 2) / 0) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 2) / 0) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -34.40977 + (((tickAnim - 2) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 2) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 2) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.47864 + (((tickAnim - 3) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 3) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 3) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 63.85001 + (((tickAnim - 4) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 4) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 4) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -1.43455 + (((tickAnim - 5) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 5) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 5) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -34.40977 + (((tickAnim - 6) / 0) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 6) / 0) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 6) / 0) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.47864 + (((tickAnim - 6) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 6) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 6) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 63.85001 + (((tickAnim - 7) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 7) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 7) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -1.43455 + (((tickAnim - 8) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 8) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 8) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -34.40977 + (((tickAnim - 9) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 9) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 9) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 2.47864 + (((tickAnim - 10) / 0) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 10) / 0) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 10) / 0) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 63.85001 + (((tickAnim - 10) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 10) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 10) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -1.43455 + (((tickAnim - 11) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 11) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 11) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -34.40977 + (((tickAnim - 12) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 12) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 12) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 2.47864 + (((tickAnim - 13) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 13) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 13) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 63.85001 + (((tickAnim - 14) / 0) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 14) / 0) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 14) / 0) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -1.43455 + (((tickAnim - 14) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 14) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 14) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -34.40977 + (((tickAnim - 15) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 15) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 15) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 2.47864 + (((tickAnim - 16) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 16) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 16) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 63.85001 + (((tickAnim - 17) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 17) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 17) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -1.43455 + (((tickAnim - 18) / 0) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 18) / 0) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 18) / 0) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -34.40977 + (((tickAnim - 18) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 18) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 18) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 2.47864 + (((tickAnim - 19) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 19) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 19) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 63.85001 + (((tickAnim - 20) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 20) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 20) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -1.43455 + (((tickAnim - 21) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 21) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 21) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -34.40977 + (((tickAnim - 22) / 0) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 22) / 0) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 22) / 0) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 2.47864 + (((tickAnim - 22) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 22) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 22) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 63.85001 + (((tickAnim - 23) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 23) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 23) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -1.43455 + (((tickAnim - 24) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 24) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 24) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -34.40977 + (((tickAnim - 25) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 25) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 25) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 2.47864 + (((tickAnim - 26) / 0) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 26) / 0) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 26) / 0) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 63.85001 + (((tickAnim - 26) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 26) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 26) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -1.43455 + (((tickAnim - 27) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 27) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 27) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -34.40977 + (((tickAnim - 28) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 28) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 28) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 2.47864 + (((tickAnim - 29) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 29) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 29) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 63.85001 + (((tickAnim - 30) / 0) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 30) / 0) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 30) / 0) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -1.43455 + (((tickAnim - 30) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 30) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 30) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -34.40977 + (((tickAnim - 31) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 31) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 31) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 2.47864 + (((tickAnim - 32) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 32) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 32) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 63.85001 + (((tickAnim - 33) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 33) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 33) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -1.43455 + (((tickAnim - 34) / 0) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 34) / 0) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 34) / 0) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -34.40977 + (((tickAnim - 34) / 1) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 34) / 1) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 34) / 1) * (82.50706-(25.80349)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 2.47864 + (((tickAnim - 35) / 1) * (63.85001-(2.47864)));
            yy = -87.17379 + (((tickAnim - 35) / 1) * (-114.26857-(-87.17379)));
            zz = 82.50706 + (((tickAnim - 35) / 1) * (5.10623-(82.50706)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 63.85001 + (((tickAnim - 36) / 1) * (-1.43455-(63.85001)));
            yy = -114.26857 + (((tickAnim - 36) / 1) * (-85.45233-(-114.26857)));
            zz = 5.10623 + (((tickAnim - 36) / 1) * (-35.02564-(5.10623)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -1.43455 + (((tickAnim - 37) / 1) * (-34.40977-(-1.43455)));
            yy = -85.45233 + (((tickAnim - 37) / 1) * (-84.89891-(-85.45233)));
            zz = -35.02564 + (((tickAnim - 37) / 1) * (25.80349-(-35.02564)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -34.40977 + (((tickAnim - 38) / 0) * (2.47864-(-34.40977)));
            yy = -84.89891 + (((tickAnim - 38) / 0) * (-87.17379-(-84.89891)));
            zz = 25.80349 + (((tickAnim - 38) / 0) * (82.50706-(25.80349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 9.91615 + (((tickAnim - 0) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 0) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 0) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 65.20208 + (((tickAnim - 1) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 1) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 1) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -9.22288 + (((tickAnim - 2) / 0) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 2) / 0) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 2) / 0) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -22.21685 + (((tickAnim - 2) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 2) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 2) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 9.91615 + (((tickAnim - 3) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 3) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 3) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 65.20208 + (((tickAnim - 4) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 4) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 4) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -9.22288 + (((tickAnim - 5) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 5) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 5) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -22.21685 + (((tickAnim - 6) / 0) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 6) / 0) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 6) / 0) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 9.91615 + (((tickAnim - 6) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 6) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 6) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 65.20208 + (((tickAnim - 7) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 7) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 7) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -9.22288 + (((tickAnim - 8) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 8) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 8) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -22.21685 + (((tickAnim - 9) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 9) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 9) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 9.91615 + (((tickAnim - 10) / 0) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 10) / 0) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 10) / 0) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 65.20208 + (((tickAnim - 10) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 10) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 10) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -9.22288 + (((tickAnim - 11) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 11) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 11) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -22.21685 + (((tickAnim - 12) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 12) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 12) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.91615 + (((tickAnim - 13) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 13) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 13) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 65.20208 + (((tickAnim - 14) / 0) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 14) / 0) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 14) / 0) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -9.22288 + (((tickAnim - 14) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 14) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 14) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -22.21685 + (((tickAnim - 15) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 15) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 15) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 9.91615 + (((tickAnim - 16) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 16) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 16) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 65.20208 + (((tickAnim - 17) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 17) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 17) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -9.22288 + (((tickAnim - 18) / 0) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 18) / 0) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 18) / 0) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -22.21685 + (((tickAnim - 18) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 18) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 18) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 9.91615 + (((tickAnim - 19) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 19) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 19) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 65.20208 + (((tickAnim - 20) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 20) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 20) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -9.22288 + (((tickAnim - 21) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 21) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 21) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -22.21685 + (((tickAnim - 22) / 0) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 22) / 0) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 22) / 0) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 9.91615 + (((tickAnim - 22) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 22) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 22) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 65.20208 + (((tickAnim - 23) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 23) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 23) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -9.22288 + (((tickAnim - 24) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 24) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 24) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -22.21685 + (((tickAnim - 25) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 25) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 25) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 9.91615 + (((tickAnim - 26) / 0) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 26) / 0) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 26) / 0) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 65.20208 + (((tickAnim - 26) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 26) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 26) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -9.22288 + (((tickAnim - 27) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 27) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 27) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -22.21685 + (((tickAnim - 28) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 28) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 28) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 9.91615 + (((tickAnim - 29) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 29) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 29) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 65.20208 + (((tickAnim - 30) / 0) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 30) / 0) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 30) / 0) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -9.22288 + (((tickAnim - 30) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 30) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 30) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -22.21685 + (((tickAnim - 31) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 31) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 31) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 9.91615 + (((tickAnim - 32) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 32) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 32) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 65.20208 + (((tickAnim - 33) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 33) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 33) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -9.22288 + (((tickAnim - 34) / 0) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 34) / 0) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 34) / 0) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -22.21685 + (((tickAnim - 34) / 1) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 34) / 1) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 34) / 1) * (-82.61267-(-18.35165)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 9.91615 + (((tickAnim - 35) / 1) * (65.20208-(9.91615)));
            yy = 56.20124 + (((tickAnim - 35) / 1) * (91.7192-(56.20124)));
            zz = -82.61267 + (((tickAnim - 35) / 1) * (-5.19594-(-82.61267)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 65.20208 + (((tickAnim - 36) / 1) * (-9.22288-(65.20208)));
            yy = 91.7192 + (((tickAnim - 36) / 1) * (54.91732-(91.7192)));
            zz = -5.19594 + (((tickAnim - 36) / 1) * (32.02068-(-5.19594)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -9.22288 + (((tickAnim - 37) / 1) * (-22.21685-(-9.22288)));
            yy = 54.91732 + (((tickAnim - 37) / 1) * (58.39475-(54.91732)));
            zz = 32.02068 + (((tickAnim - 37) / 1) * (-18.35165-(32.02068)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -22.21685 + (((tickAnim - 38) / 0) * (9.91615-(-22.21685)));
            yy = 58.39475 + (((tickAnim - 38) / 0) * (56.20124-(58.39475)));
            zz = -18.35165 + (((tickAnim - 38) / 0) * (-82.61267-(-18.35165)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 9.91615 + (((tickAnim - 0) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 0) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 0) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 65.20208 + (((tickAnim - 1) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 1) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 1) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -9.22288 + (((tickAnim - 2) / 0) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 2) / 0) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 2) / 0) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -22.21685 + (((tickAnim - 2) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 2) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 2) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 9.91615 + (((tickAnim - 3) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 3) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 3) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 65.20208 + (((tickAnim - 4) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 4) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 4) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -9.22288 + (((tickAnim - 5) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 5) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 5) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -22.21685 + (((tickAnim - 6) / 0) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 6) / 0) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 6) / 0) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 9.91615 + (((tickAnim - 6) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 6) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 6) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 65.20208 + (((tickAnim - 7) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 7) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 7) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -9.22288 + (((tickAnim - 8) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 8) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 8) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -22.21685 + (((tickAnim - 9) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 9) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 9) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 9.91615 + (((tickAnim - 10) / 0) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 10) / 0) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 10) / 0) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 65.20208 + (((tickAnim - 10) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 10) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 10) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -9.22288 + (((tickAnim - 11) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 11) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 11) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -22.21685 + (((tickAnim - 12) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 12) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 12) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.91615 + (((tickAnim - 13) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 13) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 13) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 65.20208 + (((tickAnim - 14) / 0) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 14) / 0) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 14) / 0) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -9.22288 + (((tickAnim - 14) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 14) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 14) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -22.21685 + (((tickAnim - 15) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 15) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 15) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 9.91615 + (((tickAnim - 16) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 16) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 16) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 65.20208 + (((tickAnim - 17) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 17) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 17) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -9.22288 + (((tickAnim - 18) / 0) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 18) / 0) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 18) / 0) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -22.21685 + (((tickAnim - 18) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 18) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 18) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 9.91615 + (((tickAnim - 19) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 19) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 19) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 65.20208 + (((tickAnim - 20) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 20) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 20) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -9.22288 + (((tickAnim - 21) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 21) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 21) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -22.21685 + (((tickAnim - 22) / 0) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 22) / 0) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 22) / 0) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 9.91615 + (((tickAnim - 22) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 22) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 22) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 65.20208 + (((tickAnim - 23) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 23) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 23) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -9.22288 + (((tickAnim - 24) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 24) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 24) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -22.21685 + (((tickAnim - 25) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 25) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 25) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 9.91615 + (((tickAnim - 26) / 0) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 26) / 0) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 26) / 0) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 65.20208 + (((tickAnim - 26) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 26) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 26) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -9.22288 + (((tickAnim - 27) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 27) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 27) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -22.21685 + (((tickAnim - 28) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 28) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 28) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 9.91615 + (((tickAnim - 29) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 29) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 29) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 65.20208 + (((tickAnim - 30) / 0) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 30) / 0) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 30) / 0) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -9.22288 + (((tickAnim - 30) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 30) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 30) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -22.21685 + (((tickAnim - 31) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 31) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 31) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 9.91615 + (((tickAnim - 32) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 32) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 32) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 65.20208 + (((tickAnim - 33) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 33) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 33) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -9.22288 + (((tickAnim - 34) / 0) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 34) / 0) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 34) / 0) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -22.21685 + (((tickAnim - 34) / 1) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 34) / 1) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 34) / 1) * (82.61267-(18.35165)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 9.91615 + (((tickAnim - 35) / 1) * (65.20208-(9.91615)));
            yy = -56.20124 + (((tickAnim - 35) / 1) * (-91.7192-(-56.20124)));
            zz = 82.61267 + (((tickAnim - 35) / 1) * (5.19594-(82.61267)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 65.20208 + (((tickAnim - 36) / 1) * (-9.22288-(65.20208)));
            yy = -91.7192 + (((tickAnim - 36) / 1) * (-54.91732-(-91.7192)));
            zz = 5.19594 + (((tickAnim - 36) / 1) * (-32.02068-(5.19594)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -9.22288 + (((tickAnim - 37) / 1) * (-22.21685-(-9.22288)));
            yy = -54.91732 + (((tickAnim - 37) / 1) * (-58.39475-(-54.91732)));
            zz = -32.02068 + (((tickAnim - 37) / 1) * (18.35165-(-32.02068)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -22.21685 + (((tickAnim - 38) / 0) * (9.91615-(-22.21685)));
            yy = -58.39475 + (((tickAnim - 38) / 0) * (-56.20124-(-58.39475)));
            zz = 18.35165 + (((tickAnim - 38) / 0) * (82.61267-(18.35165)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-17.57931), leftLeg1.rotateAngleY + (float) Math.toRadians(-1.19354), leftLeg1.rotateAngleZ + (float) Math.toRadians(-35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+20))*10);


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-17.57931), rightLeg1.rotateAngleY + (float) Math.toRadians(1.19354), rightLeg1.rotateAngleZ + (float) Math.toRadians(35-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+30))*10);


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, leftLeg2.rotateAngleY + (float) Math.toRadians(-27.75589), leftLeg2.rotateAngleZ + (float) Math.toRadians(0.41511));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+50))*6, rightLeg2.rotateAngleY + (float) Math.toRadians(27.75589), rightLeg2.rotateAngleZ + (float) Math.toRadians(-0.41511));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*4, leftLeg3.rotateAngleY + (float) Math.toRadians(-7.5), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+120))*4, rightLeg3.rotateAngleY + (float) Math.toRadians(7.5), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraInsectFlyingBase e = (EntityPrehistoricFloraInsectFlyingBase) entity;
        animator.update(entity);
        //N/A
    }

}
