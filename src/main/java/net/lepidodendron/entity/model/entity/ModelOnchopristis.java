package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOnchopristis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelOnchopristis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;

    private ModelAnimator animator;

    public ModelOnchopristis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 1.0F);
        this.head.cubeList.add(new ModelBox(head, 47, 34, -1.5F, -1.0F, -7.0F, 3, 1, 5, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 48, -1.5F, -2.0F, -2.4F, 3, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -2.0F, -0.5F, 5.35F, 0, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -0.25F, -0.5F, 2.5F, 0, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 1.25F, -3.0F, -2.85F, 1, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.25F, -3.0F, -2.85F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 0.0F, -7.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 28, -2.325F, -1.15F, 4.575F, 4, 1, 4, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, 0.0F, -7.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 44, -2.275F, -2.0F, 4.3F, 4, 2, 4, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -1.0F, -7.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.4F, 0.75F, -0.25F, 1, 0, 5, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 28, -2.75F, 0.0F, -0.25F, 3, 1, 5, -0.015F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -1.0F, -7.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.5236F, 0.0873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 42, -2.75F, 0.0F, -0.25F, 3, 1, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, 0.0F, -7.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 28, -1.675F, -1.15F, 4.575F, 4, 1, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.0F, -7.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 44, -1.725F, -2.0F, 4.3F, 4, 2, 4, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -1.0F, -7.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, -0.5236F, -0.0873F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 42, -0.25F, 0.0F, -0.25F, 3, 1, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, -1.0F, -7.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.5236F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.6F, 0.75F, -0.25F, 1, 0, 5, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 28, -0.25F, 0.0F, -0.25F, 3, 1, 5, -0.015F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, -0.5672F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 10, 2.0F, -0.5F, 5.35F, 0, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, -0.3491F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 20, 0.25F, -0.5F, 2.5F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 9, 0.0F, -0.5F, 5.25F, 0, 1, 3, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 33, -1.5F, 0.0F, 0.0F, 3, 1, 8, -0.01F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(-1.5F, -1.0F, -7.0F);
        this.head.addChild(snout);
        this.snout.cubeList.add(new ModelBox(snout, 9, 18, 1.0F, 0.0F, -17.0F, 1, 1, 15, 0.01F, false));
        this.snout.cubeList.add(new ModelBox(snout, 2, 0, 1.0F, 0.75F, -17.25F, 1, 0, 1, 0.0F, false));
        this.snout.cubeList.add(new ModelBox(snout, 27, 14, 0.5F, 0.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.snout.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.0524F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 4, 0, -1.65F, -0.25F, -17.0F, 2, 0, 17, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 0, -0.1F, -1.0F, -17.0F, 1, 1, 17, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.0F, 1.0F, 0.0F);
        this.snout.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0524F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 0, -0.9F, -1.0F, -17.0F, 1, 1, 17, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.35F, -0.25F, -17.0F, 2, 0, 17, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, 0.5F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 26, 18, -5.0F, -1.0F, 0.0F, 10, 3, 7, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, 0.0F, -1.75F, 0.5F, 0, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -1.25F, -1.75F, 0.5F, 0, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, 1.25F, -1.75F, 6.4F, 0, 1, 4, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 17, 34, -4.0F, -1.0F, 6.75F, 8, 3, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -1.25F, -1.75F, 6.4F, 0, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 26, 0.0F, -1.75F, 6.4F, 0, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, 1.25F, -1.75F, 0.5F, 0, 1, 6, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 10.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 32, 5, -3.0F, -0.5F, -1.0F, 6, 2, 7, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, 1.25F, -0.55F, -0.5F, 0, 1, 6, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, -1.25F, -0.55F, -0.5F, 0, 1, 6, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 10, 0.0F, -0.55F, -0.5F, 0, 1, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0698F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 34, -2.5F, 0.075F, -1.0F, 5, 1, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.325F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 42, -2.0F, -0.85F, -0.75F, 4, 2, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.25F, -0.25F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 1.25F, -0.5F, 0.5F, 0, 1, 2, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -1.25F, -0.5F, 0.5F, 0, 1, 2, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 8, 0.0F, -0.5F, 0.5F, 0, 1, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 39, 0, -1.5F, 0.0F, -0.5F, 3, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.125F, 3.25F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 18, 41, -1.0F, -1.0F, -1.25F, 2, 2, 6, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 5, 0.0F, -4.0F, 1.25F, 0, 3, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 4.75F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 2, 0.0F, -3.75F, 0.0F, 0, 3, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 23, -0.5F, -0.75F, -0.3F, 1, 2, 7, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 12, 0.0F, -2.25F, -1.0F, 0, 4, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-2.0F, 1.5F, 2.25F);
        this.body2.addChild(pelvicfinright);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 7, -3.0F, 0.0F, -2.25F, 3, 0, 7, 0.0F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 0, -3.0F, 0.01F, -2.25F, 3, 0, 7, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(2.0F, 1.5F, 2.25F);
        this.body2.addChild(pelvicfinleft);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 7, 0.0F, 0.0F, -2.25F, 3, 0, 7, 0.0F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 0, 0.0F, 0.01F, -2.25F, 3, 0, 7, 0.0F, true));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-4.0F, 2.0F, 1.25F);
        this.body.addChild(pectoralfinright);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 18, -6.0F, -0.05F, -1.25F, 6, 0, 12, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 15, 0, -6.0F, -0.04F, -1.25F, 6, 0, 12, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(4.0F, 2.0F, 1.25F);
        this.body.addChild(pectoralfinleft);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 18, 0.0F, -0.05F, -1.25F, 6, 0, 12, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 15, 0, 0.0F, -0.04F, -1.25F, 6, 0, 12, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetY = -0.2F;
        this.head.offsetX = -0.15F;
        this.head.offsetZ = -0.4F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.head.offsetZ = -0.1F;
        this.head.offsetY = -0.03F;
        this.head.offsetX = -0.02F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -2.0F;
        this.head.offsetX = -1.338F;
        this.head.rotateAngleY = (float)Math.toRadians(200);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 1.63F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
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
        EntityPrehistoricFloraOnchopristis ee = (EntityPrehistoricFloraOnchopristis) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOnchopristis entity = (EntityPrehistoricFloraOnchopristis) entitylivingbaseIn;
        int animCycle = 26;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*-2), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*-0.5));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*0.2);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+120))*3), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+180))*-7), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+200))*-12), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+350))*10), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+300))*18), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+300))*25), body6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0), pectoralfinright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+120))*0.5), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-120))*-2));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+120))*0.5), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-120))*-2));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOnchopristis entity = (EntityPrehistoricFloraOnchopristis) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-4), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*0.5);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+120))*5), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+180))*-10), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+200))*-16), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+350))*10), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+300))*18), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+300))*25), body6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0), pectoralfinright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+120))*1), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+120))*1), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOnchopristis entity = (EntityPrehistoricFloraOnchopristis) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-19.17659-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (10.08787-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.71901-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -19.17659 + (((tickAnim - 3) / 2) * (-21.97479-(-19.17659)));
            yy = 10.08787 + (((tickAnim - 3) / 2) * (-16.06531-(10.08787)));
            zz = -1.71901 + (((tickAnim - 3) / 2) * (9.92871-(-1.71901)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -21.97479 + (((tickAnim - 5) / 3) * (-20.84553-(-21.97479)));
            yy = -16.06531 + (((tickAnim - 5) / 3) * (5.70837-(-16.06531)));
            zz = 9.92871 + (((tickAnim - 5) / 3) * (-13.81148-(9.92871)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -20.84553 + (((tickAnim - 8) / 3) * (-21.97479-(-20.84553)));
            yy = 5.70837 + (((tickAnim - 8) / 3) * (-16.06531-(5.70837)));
            zz = -13.81148 + (((tickAnim - 8) / 3) * (9.92871-(-13.81148)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -21.97479 + (((tickAnim - 11) / 2) * (-20.84553-(-21.97479)));
            yy = -16.06531 + (((tickAnim - 11) / 2) * (5.70837-(-16.06531)));
            zz = 9.92871 + (((tickAnim - 11) / 2) * (-13.81148-(9.92871)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -20.84553 + (((tickAnim - 13) / 3) * (0-(-20.84553)));
            yy = 5.70837 + (((tickAnim - 13) / 3) * (0-(5.70837)));
            zz = -13.81148 + (((tickAnim - 13) / 3) * (0-(-13.81148)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (4.15-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 4.15 + (((tickAnim - 18) / 3) * (0-(4.15)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (4.15-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 4.15 + (((tickAnim - 24) / 4) * (0-(4.15)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.08-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 3.08 + (((tickAnim - 5) / 6) * (3.08-(3.08)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 3.08 + (((tickAnim - 11) / 2) * (3.08-(3.08)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 3.08 + (((tickAnim - 13) / 8) * (0-(3.08)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (3.47804-(10)));
            yy = 0 + (((tickAnim - 3) / 2) * (5.98533-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.42007-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 3.47804 + (((tickAnim - 5) / 3) * (5.24358-(3.47804)));
            yy = 5.98533 + (((tickAnim - 5) / 3) * (-3.24207-(5.98533)));
            zz = -0.42007 + (((tickAnim - 5) / 3) * (0.22695-(-0.42007)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 5.24358 + (((tickAnim - 8) / 3) * (3.47804-(5.24358)));
            yy = -3.24207 + (((tickAnim - 8) / 3) * (5.98533-(-3.24207)));
            zz = 0.22695 + (((tickAnim - 8) / 3) * (-0.42007-(0.22695)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 3.47804 + (((tickAnim - 11) / 2) * (5.24358-(3.47804)));
            yy = 5.98533 + (((tickAnim - 11) / 2) * (-3.24207-(5.98533)));
            zz = -0.42007 + (((tickAnim - 11) / 2) * (0.22695-(-0.42007)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.24358 + (((tickAnim - 13) / 2) * (-0.5-(5.24358)));
            yy = -3.24207 + (((tickAnim - 13) / 2) * (0-(-3.24207)));
            zz = 0.22695 + (((tickAnim - 13) / 2) * (0-(0.22695)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.5 + (((tickAnim - 15) / 3) * (-7.91-(-0.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -7.91 + (((tickAnim - 18) / 3) * (0-(-7.91)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (-6.16-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -6.16 + (((tickAnim - 24) / 4) * (0-(-6.16)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-4.625-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 3.75 + (((tickAnim - 1) / 2) * (0-(3.75)));
            yy = -4.625 + (((tickAnim - 1) / 2) * (-9.25-(-4.625)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -9.25 + (((tickAnim - 3) / 1) * (7.66-(-9.25)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 7.66 + (((tickAnim - 4) / 1) * (-3.43-(7.66)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -3.43 + (((tickAnim - 5) / 3) * (-11.04-(-3.43)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -11.04 + (((tickAnim - 8) / 3) * (17-(-11.04)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 17 + (((tickAnim - 11) / 1) * (0-(17)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3.25 + (((tickAnim - 15) / 3) * (-6.2-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -6.2 + (((tickAnim - 18) / 3) * (0-(-6.2)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.86771-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-19.01938-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.12384-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 3.86771 + (((tickAnim - 3) / 1) * (4.84069-(3.86771)));
            yy = -19.01938 + (((tickAnim - 3) / 1) * (8.19581-(-19.01938)));
            zz = -2.12384 + (((tickAnim - 3) / 1) * (-0.06018-(-2.12384)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 4.84069 + (((tickAnim - 4) / 1) * (6.16971-(4.84069)));
            yy = 8.19581 + (((tickAnim - 4) / 1) * (11.0917-(8.19581)));
            zz = -0.06018 + (((tickAnim - 4) / 1) * (0.05351-(-0.06018)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6.16971 + (((tickAnim - 5) / 3) * (9.21497-(6.16971)));
            yy = 11.0917 + (((tickAnim - 5) / 3) * (-21.01272-(11.0917)));
            zz = 0.05351 + (((tickAnim - 5) / 3) * (-4.92712-(0.05351)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 9.21497 + (((tickAnim - 8) / 3) * (11.14339-(9.21497)));
            yy = -21.01272 + (((tickAnim - 8) / 3) * (16.82006-(-21.01272)));
            zz = -4.92712 + (((tickAnim - 8) / 3) * (2.50417-(-4.92712)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 11.14339 + (((tickAnim - 11) / 1) * (0-(11.14339)));
            yy = 16.82006 + (((tickAnim - 11) / 1) * (0-(16.82006)));
            zz = 2.50417 + (((tickAnim - 11) / 1) * (0-(2.50417)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (13.45862-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-18.51424-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-4.34568-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 13.45862 + (((tickAnim - 13) / 2) * (-2.45302-(13.45862)));
            yy = -18.51424 + (((tickAnim - 13) / 2) * (-6.94284-(-18.51424)));
            zz = -4.34568 + (((tickAnim - 13) / 2) * (-1.62963-(-4.34568)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2.45302 + (((tickAnim - 15) / 3) * (3.02819-(-2.45302)));
            yy = -6.94284 + (((tickAnim - 15) / 3) * (-4.1657-(-6.94284)));
            zz = -1.62963 + (((tickAnim - 15) / 3) * (-0.97778-(-1.62963)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 3.02819 + (((tickAnim - 18) / 3) * (0-(3.02819)));
            yy = -4.1657 + (((tickAnim - 18) / 3) * (0-(-4.1657)));
            zz = -0.97778 + (((tickAnim - 18) / 3) * (0-(-0.97778)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.11502-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-7.10173-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.12344-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 3.11502 + (((tickAnim - 3) / 1) * (4.23484-(3.11502)));
            yy = -7.10173 + (((tickAnim - 3) / 1) * (-13.28769-(-7.10173)));
            zz = -1.12344 + (((tickAnim - 3) / 1) * (-1.85441-(-1.12344)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 4.23484 + (((tickAnim - 4) / 1) * (5.36786-(4.23484)));
            yy = -13.28769 + (((tickAnim - 4) / 1) * (16.21241-(-13.28769)));
            zz = -1.85441 + (((tickAnim - 4) / 1) * (0.54934-(-1.85441)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5.36786 + (((tickAnim - 5) / 3) * (7.36452-(5.36786)));
            yy = 16.21241 + (((tickAnim - 5) / 3) * (-12.16413-(16.21241)));
            zz = 0.54934 + (((tickAnim - 5) / 3) * (-3.56127-(0.54934)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.36452 + (((tickAnim - 8) / 3) * (9.91493-(7.36452)));
            yy = -12.16413 + (((tickAnim - 8) / 3) * (20.85745-(-12.16413)));
            zz = -3.56127 + (((tickAnim - 8) / 3) * (0.99402-(-3.56127)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 9.91493 + (((tickAnim - 11) / 2) * (11.33538-(9.91493)));
            yy = 20.85745 + (((tickAnim - 11) / 2) * (3.25078-(20.85745)));
            zz = 0.99402 + (((tickAnim - 11) / 2) * (-2.53027-(0.99402)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 11.33538 + (((tickAnim - 13) / 2) * (2.00077-(11.33538)));
            yy = 3.25078 + (((tickAnim - 13) / 2) * (1.21904-(3.25078)));
            zz = -2.53027 + (((tickAnim - 13) / 2) * (-0.94885-(-2.53027)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.00077 + (((tickAnim - 15) / 3) * (6.45046-(2.00077)));
            yy = 1.21904 + (((tickAnim - 15) / 3) * (0.73143-(1.21904)));
            zz = -0.94885 + (((tickAnim - 15) / 3) * (-0.56931-(-0.94885)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 6.45046 + (((tickAnim - 18) / 3) * (0-(6.45046)));
            yy = 0.73143 + (((tickAnim - 18) / 3) * (0-(0.73143)));
            zz = -0.56931 + (((tickAnim - 18) / 3) * (0-(-0.56931)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.8-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 4.8 + (((tickAnim - 3) / 1) * (-8.8-(4.8)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -8.8 + (((tickAnim - 4) / 1) * (27.85-(-8.8)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 27.85 + (((tickAnim - 5) / 3) * (-9.1-(27.85)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -9.1 + (((tickAnim - 8) / 3) * (-16.93-(-9.1)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -16.93 + (((tickAnim - 11) / 1) * (22.54-(-16.93)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 22.54 + (((tickAnim - 12) / 1) * (-20-(22.54)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-3-(0)));
            yy = -20 + (((tickAnim - 13) / 2) * (-7.5-(-20)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3 + (((tickAnim - 15) / 3) * (3.2-(-3)));
            yy = -7.5 + (((tickAnim - 15) / 3) * (-4.5-(-7.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 3.2 + (((tickAnim - 18) / 3) * (0-(3.2)));
            yy = -4.5 + (((tickAnim - 18) / 3) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (3.2-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 3.2 + (((tickAnim - 24) / 4) * (0-(3.2)));
            yy = -4.5 + (((tickAnim - 24) / 4) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(xx), body5.rotateAngleY + (float) Math.toRadians(yy), body5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (14-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 14 + (((tickAnim - 3) / 1) * (-18.62-(14)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -18.62 + (((tickAnim - 4) / 1) * (18.5-(-18.62)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 18.5 + (((tickAnim - 5) / 3) * (-15.75-(18.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -15.75 + (((tickAnim - 8) / 3) * (-23.2-(-15.75)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -23.2 + (((tickAnim - 11) / 1) * (29.03-(-23.2)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 29.03 + (((tickAnim - 12) / 1) * (-23.75-(29.03)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (12.5-(0)));
            yy = -23.75 + (((tickAnim - 13) / 5) * (-7.91667-(-23.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 12.5 + (((tickAnim - 18) / 3) * (0-(12.5)));
            yy = -7.91667 + (((tickAnim - 18) / 3) * (0-(-7.91667)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (-7.91667-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 12.5 + (((tickAnim - 24) / 4) * (0-(12.5)));
            yy = -7.91667 + (((tickAnim - 24) / 4) * (0-(-7.91667)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(xx), body6.rotateAngleY + (float) Math.toRadians(yy), body6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-8.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -8.5 + (((tickAnim - 3) / 2) * (15.75-(-8.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 15.75 + (((tickAnim - 5) / 3) * (-9.5-(15.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = -9.5 + (((tickAnim - 8) / 3) * (19.25-(-9.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 19.25 + (((tickAnim - 11) / 2) * (-17.5-(19.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = -17.5 + (((tickAnim - 13) / 8) * (0-(-17.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(xx), pectoralfinright.rotateAngleY + (float) Math.toRadians(yy), pectoralfinright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (22-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 22 + (((tickAnim - 3) / 2) * (-10-(22)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 5) / 3) * (14.25-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 14.25 + (((tickAnim - 8) / 3) * (-15.25-(14.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -15.25 + (((tickAnim - 11) / 2) * (14.25-(-15.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 14.25 + (((tickAnim - 13) / 8) * (0-(14.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(xx), pectoralfinleft.rotateAngleY + (float) Math.toRadians(yy), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6};

        EntityPrehistoricFloraOnchopristis ee = (EntityPrehistoricFloraOnchopristis) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            //this.main.rotateAngleZ = (float) Math.toRadians(90);
            //this.main.offsetY = -0.2F;
           // this.bob(main, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

