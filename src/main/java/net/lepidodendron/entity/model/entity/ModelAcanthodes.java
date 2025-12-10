package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAcanthodes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAcanthodes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer gilljointright;
    private final AdvancedModelRenderer gilljointleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer lowerjawjointright;
    private final AdvancedModelRenderer lowerjawjointhiddenright;
    private final AdvancedModelRenderer lowerjawjointleft;
    private final AdvancedModelRenderer lowerjawjointhiddenleft;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jawjointright;
    private final AdvancedModelRenderer jawjointhiddenright;
    private final AdvancedModelRenderer jawjointleft;
    private final AdvancedModelRenderer jawjointhiddenleft;

    private ModelAnimator animator;

    public ModelAcanthodes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 46, 0, -1.5F, -8.65F, -5.0F, 3, 5, 4, 0.0F, false));

        this.gilljointright = new AdvancedModelRenderer(this);
        this.gilljointright.setRotationPoint(-2.1F, -6.0F, -3.75F);
        this.base.addChild(gilljointright);
        this.setRotateAngle(gilljointright, 0.0F, 0.0873F, 0.0F);
        this.gilljointright.cubeList.add(new ModelBox(gilljointright, 16, 0, 0.0F, -1.5F, -0.25F, 3, 3, 5, 0.0F, false));

        this.gilljointleft = new AdvancedModelRenderer(this);
        this.gilljointleft.setRotationPoint(2.1F, -6.0F, -3.75F);
        this.base.addChild(gilljointleft);
        this.setRotateAngle(gilljointleft, 0.0F, -0.0873F, 0.0F);
        this.gilljointleft.cubeList.add(new ModelBox(gilljointleft, 16, 0, -3.0F, -1.5F, -0.25F, 3, 3, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, -1.5F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 17, 11, -2.0F, -2.65F, 0.0F, 4, 5, 11, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 24, 0.0F, 1.85F, 7.5F, 0, 2, 3, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, 0.7F, 1.4F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.8727F, 0.0F, 0.6545F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 19, 0.0F, 0.0F, -1.0F, 0, 8, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, 0.7F, 1.4F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.8727F, 0.0F, -0.6545F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 19, 0.0F, 0.0F, -1.0F, 0, 8, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 11.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -2.4F, -0.5F, 4, 5, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.15F, 7.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 22, -1.5F, -1.75F, -0.5F, 3, 4, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.25F, 7.5F);
        this.body3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 27, -1.0F, -1.0F, -8.0F, 2, 1, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.75F, 7.5F);
        this.body3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 28, -1.0F, 0.0F, -8.0F, 2, 1, 8, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 7.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 0, -1.0F, -1.5F, -1.0F, 2, 3, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 5.4F, 8.0F);
        this.body4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0611F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 28, 1.0F, -4.0F, -8.0F, 0, 4, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 1.5F, 7.0F);
        this.body4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0611F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 3, 0.0F, -1.0F, -8.0F, 1, 1, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -2.25F, 10.75F);
        this.body4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 1.0F, -2.0F, -8.0F, 0, 3, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.5F, 7.0F);
        this.body4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 36, 0.0F, 0.0F, -8.0F, 1, 1, 8, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.body4.addChild(body5);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 6.65F, 2.75F);
        this.body5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 1.0F, -8.0F, -1.0F, 0, 8, 14, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 1.75F, 0.75F);
        this.body5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 34, 0.0F, -3.0F, -1.0F, 1, 3, 5, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -5.65F, -4.85F);
        this.base.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0436F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 16, 45, -1.0F, 0.1F, -5.75F, 2, 1, 6, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.25F, -4.15F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 45, -1.0F, -1.0F, -1.0F, 2, 1, 6, -0.02F, false));

        this.lowerjawjointright = new AdvancedModelRenderer(this);
        this.lowerjawjointright.setRotationPoint(-1.0F, 0.1F, -5.75F);
        this.lowerjaw.addChild(lowerjawjointright);
        this.setRotateAngle(lowerjawjointright, 0.0F, -0.1309F, 0.0F);
        this.lowerjawjointright.cubeList.add(new ModelBox(lowerjawjointright, 36, 39, 0.0F, 0.01F, 0.0F, 2, 1, 6, -0.01F, false));

        this.lowerjawjointhiddenright = new AdvancedModelRenderer(this);
        this.lowerjawjointhiddenright.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerjawjointright.addChild(lowerjawjointhiddenright);
        this.lowerjawjointhiddenright.cubeList.add(new ModelBox(lowerjawjointhiddenright, 38, 27, 0.0F, 0.01F, 0.0F, 2, 1, 6, -0.02F, false));

        this.lowerjawjointleft = new AdvancedModelRenderer(this);
        this.lowerjawjointleft.setRotationPoint(1.0F, 0.1F, -5.75F);
        this.lowerjaw.addChild(lowerjawjointleft);
        this.setRotateAngle(lowerjawjointleft, 0.0F, 0.1309F, 0.0F);
        this.lowerjawjointleft.cubeList.add(new ModelBox(lowerjawjointleft, 36, 39, -2.0F, 0.01F, 0.0F, 2, 1, 6, -0.01F, true));

        this.lowerjawjointhiddenleft = new AdvancedModelRenderer(this);
        this.lowerjawjointhiddenleft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerjawjointleft.addChild(lowerjawjointhiddenleft);
        this.lowerjawjointhiddenleft.cubeList.add(new ModelBox(lowerjawjointhiddenleft, 38, 27, -2.0F, 0.01F, 0.0F, 2, 1, 6, -0.02F, true));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.base.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.1134F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 36, 12, -1.0F, -2.0F, -6.75F, 2, 2, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0F, -6.75F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 37, -1.0F, 0.0F, 0.0F, 2, 2, 6, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.8F, -4.85F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 27, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.03F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.2F, -5.25F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.02F, false));

        this.jawjointright = new AdvancedModelRenderer(this);
        this.jawjointright.setRotationPoint(-1.0F, -1.0F, -4.75F);
        this.upperjaw.addChild(jawjointright);
        this.setRotateAngle(jawjointright, -0.0436F, -0.2182F, 0.0F);
        this.jawjointright.cubeList.add(new ModelBox(jawjointright, 32, 46, 0.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.jawjointhiddenright = new AdvancedModelRenderer(this);
        this.jawjointhiddenright.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.jawjointright.addChild(jawjointhiddenright);
        this.jawjointhiddenright.cubeList.add(new ModelBox(jawjointhiddenright, 18, 36, 0.0F, -2.0F, -1.0F, 1, 2, 5, -0.01F, false));

        this.jawjointleft = new AdvancedModelRenderer(this);
        this.jawjointleft.setRotationPoint(1.0F, -1.0F, -4.75F);
        this.upperjaw.addChild(jawjointleft);
        this.setRotateAngle(jawjointleft, -0.0436F, 0.2182F, 0.0F);
        this.jawjointleft.cubeList.add(new ModelBox(jawjointleft, 32, 46, -2.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.jawjointhiddenleft = new AdvancedModelRenderer(this);
        this.jawjointhiddenleft.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.jawjointleft.addChild(jawjointhiddenleft);
        this.jawjointhiddenleft.cubeList.add(new ModelBox(jawjointhiddenleft, 18, 36, -1.0F, -2.0F, -1.0F, 1, 2, 5, -0.01F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(lowerjaw, 0.3F, 0.0F, 0.0F);
        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.15F;
        this.base.offsetZ = -0.4F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjawjointleft, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(lowerjawjointright, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jawjointleft, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(jawjointright, 0.0F, -0.7F, 0.0F);
        this.base.offsetZ = -0.1F;
        this.base.offsetY = -0.03F;
        this.base.offsetX = -0.02F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.2F;
        this.base.offsetX = 0.8F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 2.8F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjawjointleft, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(lowerjawjointright, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jawjointleft, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(jawjointright, 0.0F, -0.7F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAcanthodes ee = (EntityPrehistoricFloraAcanthodes) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        
        if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAcanthodes entity = (EntityPrehistoricFloraAcanthodes) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-90))*-1.2), base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-20))*-1.1));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*151/0.525))*-0.2);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-80))*-5.2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-40))*-1.1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-700))*8.2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-40))*-1.1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-60))*14.2), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-40))*-1.1));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66+80))*-18.2), body4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-40))*-1.1));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66+80))*-20.2), body5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.66-40))*-1.1));

        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(xx), pectoralfinright.rotateAngleY + (float) Math.toRadians(yy), pectoralfinright.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(xx), pectoralfinleft.rotateAngleY + (float) Math.toRadians(yy), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAcanthodes entity = (EntityPrehistoricFloraAcanthodes) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-90))*-1.2), base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-20))*-1.1));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*151/0.21))*-0.2);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-80))*-5.2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-40))*-1.1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-700))*10.2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-40))*-1.1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-60))*17.2), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-40))*-1.1));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265+80))*-12.2), body4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-40))*-1.1));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265+80))*-27.2), body5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*190/0.265-40))*-1.1));

        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(xx), pectoralfinright.rotateAngleY + (float) Math.toRadians(yy), pectoralfinright.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(xx), pectoralfinleft.rotateAngleY + (float) Math.toRadians(yy), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcanthodes entity = (EntityPrehistoricFloraAcanthodes) entitylivingbaseIn;

        int animCycle = 400;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-40-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            yy = -40 + (((tickAnim - 20) / 340) * (-40-(-40)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            yy = -40 + (((tickAnim - 360) / 40) * (0-(-40)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawjointright, jawjointright.rotateAngleX + (float) Math.toRadians(xx), jawjointright.rotateAngleY + (float) Math.toRadians(yy), jawjointright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (27.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            yy = 27.5 + (((tickAnim - 20) / 340) * (27.5-(27.5)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            yy = 27.5 + (((tickAnim - 360) / 40) * (0-(27.5)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(gilljointright, gilljointright.rotateAngleX + (float) Math.toRadians(xx), gilljointright.rotateAngleY + (float) Math.toRadians(yy), gilljointright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = -2.5 + (((tickAnim - 20) / 340) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            zz = -1 + (((tickAnim - 20) / 340) * (-1-(-1)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = -2.5 + (((tickAnim - 360) / 40) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            zz = -1 + (((tickAnim - 360) / 40) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.gilljointright.rotationPointX = this.gilljointright.rotationPointX + (float)(xx);
        this.gilljointright.rotationPointY = this.gilljointright.rotationPointY - (float)(yy);
        this.gilljointright.rotationPointZ = this.gilljointright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 0.9 + (((tickAnim - 20) / 340) * (0.9-(0.9)));
            yy = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 0.9 + (((tickAnim - 360) / 40) * (0-(0.9)));
            yy = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jawjointhiddenright.rotationPointX = this.jawjointhiddenright.rotationPointX + (float)(xx);
        this.jawjointhiddenright.rotationPointY = this.jawjointhiddenright.rotationPointY - (float)(yy);
        this.jawjointhiddenright.rotationPointZ = this.jawjointhiddenright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 40 + (((tickAnim - 20) / 60) * (50-(40)));
            yy = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 50 + (((tickAnim - 80) / 60) * (40-(50)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 40 + (((tickAnim - 140) / 60) * (50-(40)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 50 + (((tickAnim - 200) / 60) * (40-(50)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 320) {
            xx = 40 + (((tickAnim - 260) / 60) * (50-(40)));
            yy = 0 + (((tickAnim - 260) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 60) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 50 + (((tickAnim - 320) / 40) * (40-(50)));
            yy = 0 + (((tickAnim - 320) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 40) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 40 + (((tickAnim - 360) / 40) * (0-(40)));
            yy = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            yy = -32.5 + (((tickAnim - 20) / 340) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            yy = -32.5 + (((tickAnim - 360) / 40) * (0-(-32.5)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawjointright, lowerjawjointright.rotateAngleX + (float) Math.toRadians(xx), lowerjawjointright.rotateAngleY + (float) Math.toRadians(yy), lowerjawjointright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 1.25 + (((tickAnim - 20) / 340) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 1.25 + (((tickAnim - 360) / 40) * (0-(1.25)));
            yy = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerjawjointhiddenright.rotationPointX = this.lowerjawjointhiddenright.rotationPointX + (float)(xx);
        this.lowerjawjointhiddenright.rotationPointY = this.lowerjawjointhiddenright.rotationPointY - (float)(yy);
        this.lowerjawjointhiddenright.rotationPointZ = this.lowerjawjointhiddenright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (40-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            yy = 40 + (((tickAnim - 20) / 340) * (40-(40)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            yy = 40 + (((tickAnim - 360) / 40) * (0-(40)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawjointleft, jawjointleft.rotateAngleX + (float) Math.toRadians(xx), jawjointleft.rotateAngleY + (float) Math.toRadians(yy), jawjointleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = -0.9 + (((tickAnim - 20) / 340) * (-0.9-(-0.9)));
            yy = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = -0.9 + (((tickAnim - 360) / 40) * (0-(-0.9)));
            yy = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jawjointhiddenleft.rotationPointX = this.jawjointhiddenleft.rotationPointX + (float)(xx);
        this.jawjointhiddenleft.rotationPointY = this.jawjointhiddenleft.rotationPointY - (float)(yy);
        this.jawjointhiddenleft.rotationPointZ = this.jawjointhiddenleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-27.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            yy = -27.5 + (((tickAnim - 20) / 340) * (-27.5-(-27.5)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            yy = -27.5 + (((tickAnim - 360) / 40) * (0-(-27.5)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(gilljointleft, gilljointleft.rotateAngleX + (float) Math.toRadians(xx), gilljointleft.rotateAngleY + (float) Math.toRadians(yy), gilljointleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 2.5 + (((tickAnim - 20) / 340) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            zz = -1 + (((tickAnim - 20) / 340) * (-1-(-1)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 2.5 + (((tickAnim - 360) / 40) * (0-(2.5)));
            yy = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            zz = -1 + (((tickAnim - 360) / 40) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.gilljointleft.rotationPointX = this.gilljointleft.rotationPointX + (float)(xx);
        this.gilljointleft.rotationPointY = this.gilljointleft.rotationPointY - (float)(yy);
        this.gilljointleft.rotationPointZ = this.gilljointleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            yy = 32.5 + (((tickAnim - 20) / 340) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            yy = 32.5 + (((tickAnim - 360) / 40) * (0-(32.5)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawjointleft, lowerjawjointleft.rotateAngleX + (float) Math.toRadians(xx), lowerjawjointleft.rotateAngleY + (float) Math.toRadians(yy), lowerjawjointleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 360) {
            xx = -1.25 + (((tickAnim - 20) / 340) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 20) / 340) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 340) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = -1.25 + (((tickAnim - 360) / 40) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerjawjointhiddenleft.rotationPointX = this.lowerjawjointhiddenleft.rotationPointX + (float)(xx);
        this.lowerjawjointhiddenleft.rotationPointY = this.lowerjawjointhiddenleft.rotationPointY - (float)(yy);
        this.lowerjawjointhiddenleft.rotationPointZ = this.lowerjawjointhiddenleft.rotationPointZ + (float)(zz);

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};

        EntityPrehistoricFloraAcanthodes ee = (EntityPrehistoricFloraAcanthodes) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = -0.2F;
            this.bob(base, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

