package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmphibamus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAmphibamus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer UpperlegR;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer LowerlegR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperlegL;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer LowerlegL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeR2;

    private ModelAnimator animator;

    public ModelAmphibamus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 22.775F, -1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.5F, 4.0F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 12, -1.0F, 0.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.UpperlegR = new AdvancedModelRenderer(this);
        this.UpperlegR.setRotationPoint(-1.0F, 0.25F, 4.5F);
        this.Hips.addChild(UpperlegR);
        this.setRotateAngle(UpperlegR, -0.2269F, -0.1309F, -0.0436F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.UpperlegR.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -0.5F, -1.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.LowerlegR = new AdvancedModelRenderer(this);
        this.LowerlegR.setRotationPoint(-2.5F, 0.1F, -0.25F);
        this.UpperlegR.addChild(LowerlegR);
        this.setRotateAngle(LowerlegR, 0.0436F, 1.6144F, -0.0436F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.LowerlegR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -0.5F, -0.5F, -1.0F, 1, 2, 1, -0.01F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(-2.0F, 0.25F, 0.0F);
        this.LowerlegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.1309F, -1.0472F, 0.3927F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 0, -2.0F, 0.0F, -1.75F, 2, 0, 3, 0.0F, false));

        this.UpperlegL = new AdvancedModelRenderer(this);
        this.UpperlegL.setRotationPoint(1.0F, 0.25F, 4.5F);
        this.Hips.addChild(UpperlegL);
        this.setRotateAngle(UpperlegL, -0.2269F, 0.1309F, 0.0436F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.UpperlegL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.5F, -1.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.LowerlegL = new AdvancedModelRenderer(this);
        this.LowerlegL.setRotationPoint(2.5F, 0.1F, -0.25F);
        this.UpperlegL.addChild(LowerlegL);
        this.setRotateAngle(LowerlegL, 0.0436F, -1.6144F, 0.0436F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.LowerlegL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 17, -0.5F, -0.5F, -1.0F, 1, 2, 1, -0.01F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(2.0F, 0.25F, 0.0F);
        this.LowerlegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.1309F, 1.0472F, -0.3927F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 0, 0.0F, 0.0F, -1.75F, 2, 0, 3, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.2094F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.0F, -1.5F);
        this.Tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 7, 0.5F, -0.75F, 1.5F, 0, 2, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 11, 0.0F, -0.25F, 1.5F, 1, 1, 3, 0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.75F, 2.5F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.75F, -1.5F);
        this.Tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.5F, -0.25F, 6.5F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, 0.49F, -0.75F, 1.5F, 0, 2, 5, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, 0.0F, -0.25F, 1.5F, 1, 1, 4, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.5F, 2.35F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.0F, -5.0F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.5F, -0.65F, -0.75F, 4, 3, 7, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.75F, -5.5F);
        this.Body.addChild(Chest);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.25F, 0.5F);
        this.Chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 17, -1.0F, -0.4F, -2.0F, 3, 2, 2, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.5F, 1.0F, -0.5F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.0262F, 0.829F, -0.3054F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.UpperArmR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 24, -0.75F, -0.5F, -0.5F, 1, 2, 1, 0.01F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-1.5F, 0.25F, 0.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.0F, -1.7453F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.LowerArmR.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 1.5708F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 0, -1.0F, -0.6F, -0.5F, 1, 2, 1, 0.0F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.2618F, -0.48F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.HandR.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.6545F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 3, -1.0F, -0.475F, -1.75F, 2, 0, 3, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(1.5F, 1.0F, -0.5F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.0262F, -0.829F, 0.3054F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.UpperArmL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -1.5708F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 24, -0.25F, -0.5F, -0.5F, 1, 2, 1, 0.01F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(1.5F, 0.25F, 0.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.0F, 1.7453F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.LowerArmL.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -1.5708F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 0, 0.0F, -0.6F, -0.5F, 1, 2, 1, 0.0F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.2618F, 0.48F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.HandL.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.6545F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 3, -1.0F, -0.475F, -1.75F, 2, 0, 3, 0.0F, true));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.5F, -1.25F);
        this.Chest.addChild(Head);


        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.4F, 0.25F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0873F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 14, 20, -1.0F, -0.0067F, -4.5527F, 2, 1, 2, -0.005F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 10, -1.5F, -0.0017F, -3.1527F, 3, 1, 4, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.975F, 4.5F, -3.75F);
        this.Jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -1.117F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 4, -0.6876F, -4.4967F, -0.3751F, 2, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.975F, 4.5F, -3.75F);
        this.Jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -1.4835F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 4, 1.0065F, -4.5167F, -0.8022F, 3, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.975F, 4.5F, -3.75F);
        this.Jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.117F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 4, -1.3124F, -4.4967F, -0.3751F, 2, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.975F, 4.5F, -3.75F);
        this.Jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 1.4835F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 4, -4.0065F, -4.5167F, -0.8022F, 3, 1, 2, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 0.25F, -0.25F);
        this.Head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 20, 21, -1.0F, -0.7567F, -4.0527F, 2, 1, 2, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 15, 0, -1.5F, -0.7767F, -2.6527F, 3, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 3.75F, -3.25F);
        this.Upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.117F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 23, -0.6876F, -4.4967F, -0.3751F, 2, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 3.75F, -3.25F);
        this.Upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.4835F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 17, 1.0065F, -4.5167F, -0.8022F, 3, 1, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 3.75F, -3.25F);
        this.Upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 1.4835F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 17, -4.0065F, -4.5167F, -0.8022F, 3, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 3.75F, -3.25F);
        this.Upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 1.117F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 23, -1.3124F, -4.4967F, -0.3751F, 2, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 3.75F, -3.25F);
        this.Upperjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 8, -1.5F, -5.01F, 1.85F, 3, 1, 2, 0.01F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 21, -1.0F, -5.01F, 0.35F, 2, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 3.75F, -3.25F);
        this.Upperjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5672F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 15, -1.0F, -4.1869F, 1.7805F, 2, 1, 1, -0.01F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.5F, -1.225F, -1.25F);
        this.Upperjaw.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, -0.2618F, 0.2618F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 22, -1.0692F, 0.003F, -1.6361F, 1, 1, 2, 0.0F, false));

        this.eyeR2 = new AdvancedModelRenderer(this);
        this.eyeR2.setRotationPoint(0.5F, -1.225F, -1.25F);
        this.Upperjaw.addChild(eyeR2);
        this.setRotateAngle(eyeR2, 0.0F, 0.2618F, -0.2618F);
        this.eyeR2.cubeList.add(new ModelBox(eyeR2, 0, 22, 0.0692F, 0.003F, -1.6361F, 1, 1, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Hips.rotateAngleY = (float) Math.toRadians(00);
        this.setRotateAngle(Head, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, 0.0F, -2.0F, 0.0F);
        this.setRotateAngle(UpperArmR, 0.0F, -4.0F, 0.0F);
        this.Hips.offsetY = -0.22F;
        this.Hips.offsetX = 0.0F;
        this.Hips.offsetZ = -0.2F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail1, 0.35F, 0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Head, -0.5F, -0.2F, 0.0F);
        this.setRotateAngle(Jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, 0.3F, -0.5F, -0.5F);
        this.setRotateAngle(LowerArmL, 0.3F, 0.3F, 0.3F);
        this.setRotateAngle(HandL, 0.0F, 1.5F, 0.5F);
        this.setRotateAngle(UpperArmR, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(LowerArmR, 0.0F, -1.0F, 0.0F);
        this.setRotateAngle(HandR, 0.0F, -1.0F, 0.1F);
        this.setRotateAngle(UpperlegL, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(LowerlegL, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(FootL, 0.0F, 0.9F, 0.0F);
        this.setRotateAngle(UpperlegR, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(LowerlegR, 0.0F, 1.5F, 0.0F);
        this.setRotateAngle(FootR, 0.0F, -1.9F, 0.0F);
        this.Hips.offsetZ = -0.0F;
        this.Hips.offsetY = 0.0435F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = 0.7F;
        this.Hips.offsetX = 0.1F;
        this.Hips.rotateAngleY = (float) Math.toRadians(210);
        this.Hips.rotateAngleX = (float) Math.toRadians(8);
        this.Hips.rotateAngleZ = (float) Math.toRadians(-4);
        this.Hips.scaleChildren = true;
        float scaler = 0.575F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, -0.05F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();
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
        EntityPrehistoricFloraAmphibamus ee = (EntityPrehistoricFloraAmphibamus) entitylivingbaseIn;
        if (ee.isReallyInWater()) {
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            if (ee.getIsFast()) {
                animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmphibamus entity = (EntityPrehistoricFloraAmphibamus) entitylivingbaseIn;
        int animCycle = 10;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(10), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*10), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2.5));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-260))*0.5);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(8.5987+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))*25), UpperlegR.rotateAngleY + (float) Math.toRadians(12.3117+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-20))*25), UpperlegR.rotateAngleZ + (float) Math.toRadians(-8.2021+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-150))*25));


        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(8.5987-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))*25), UpperlegL.rotateAngleY + (float) Math.toRadians(-12.3117+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-20))*25), UpperlegL.rotateAngleZ + (float) Math.toRadians(8.2021+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-150))*25));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*10), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-10), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))*20), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-10), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-200))*5), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-170))*5), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(50-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))*50), UpperArmR.rotateAngleY + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+10))*25), UpperArmR.rotateAngleZ + (float) Math.toRadians(25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-400))*25));


        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(0), LowerArmR.rotateAngleY + (float) Math.toRadians(50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*50), LowerArmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(-22.5), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-40))*50));


        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))*50), UpperArmL.rotateAngleY + (float) Math.toRadians(15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+10))*25), UpperArmL.rotateAngleZ + (float) Math.toRadians(-25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-400))*25));


        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(0), LowerArmL.rotateAngleY + (float) Math.toRadians(-50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*50), LowerArmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(-22.5), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-40))*50));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-200))*2.5), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(0), LowerlegR.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*50), LowerlegR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*25), FootR.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*25), FootR.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))*25));


        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(0), LowerlegL.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*50), LowerlegL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(55-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*25), FootL.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*25), FootL.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))*25));

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmphibamus entity = (EntityPrehistoricFloraAmphibamus) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*4), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+550))*0.1);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.17914 + (((tickAnim - 0) / 5) * (-4.84262-(-7.17914)));
            yy = -39.50401 + (((tickAnim - 0) / 5) * (22.93867-(-39.50401)));
            zz = 4.85346 + (((tickAnim - 0) / 5) * (10.1528-(4.85346)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4.84262 + (((tickAnim - 5) / 3) * (-1.68001-(-4.84262)));
            yy = 22.93867 + (((tickAnim - 5) / 3) * (48.26881-(22.93867)));
            zz = 10.1528 + (((tickAnim - 5) / 3) * (7.07619-(10.1528)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.68001 + (((tickAnim - 8) / 2) * (-16.71776-(-1.68001)));
            yy = 48.26881 + (((tickAnim - 8) / 2) * (55.29121-(48.26881)));
            zz = 7.07619 + (((tickAnim - 8) / 2) * (3.17062-(7.07619)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -16.71776 + (((tickAnim - 10) / 1) * (-16.82814-(-16.71776)));
            yy = 55.29121 + (((tickAnim - 10) / 1) * (43.87854-(55.29121)));
            zz = 3.17062 + (((tickAnim - 10) / 1) * (9.09426-(3.17062)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -16.82814 + (((tickAnim - 11) / 5) * (-31.78932-(-16.82814)));
            yy = 43.87854 + (((tickAnim - 11) / 5) * (5.46042-(43.87854)));
            zz = 9.09426 + (((tickAnim - 11) / 5) * (21.69919-(9.09426)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -31.78932 + (((tickAnim - 16) / 2) * (-23.642-(-31.78932)));
            yy = 5.46042 + (((tickAnim - 16) / 2) * (-11.8335-(5.46042)));
            zz = 21.69919 + (((tickAnim - 16) / 2) * (27.60846-(21.69919)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -23.642 + (((tickAnim - 18) / 2) * (-7.17914-(-23.642)));
            yy = -11.8335 + (((tickAnim - 18) / 2) * (-39.50401-(-11.8335)));
            zz = 27.60846 + (((tickAnim - 18) / 2) * (4.85346-(27.60846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 47.5 + (((tickAnim - 0) / 5) * (23.75-(47.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 23.75 + (((tickAnim - 5) / 3) * (-17.08-(23.75)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -17.08 + (((tickAnim - 8) / 2) * (-45-(-17.08)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -45 + (((tickAnim - 10) / 6) * (14.38-(-45)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 14.38 + (((tickAnim - 16) / 4) * (47.5-(14.38)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(xx), LowerlegR.rotateAngleY + (float) Math.toRadians(yy), LowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -156.11342 + (((tickAnim - 0) / 5) * (-167.11265-(-156.11342)));
            yy = -5.15117 + (((tickAnim - 0) / 5) * (27.64994-(-5.15117)));
            zz = 159.25046 + (((tickAnim - 0) / 5) * (171.28154-(159.25046)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -167.11265 + (((tickAnim - 5) / 5) * (-158.13976-(-167.11265)));
            yy = 27.64994 + (((tickAnim - 5) / 5) * (-2.92029-(27.64994)));
            zz = 171.28154 + (((tickAnim - 5) / 5) * (160.37516-(171.28154)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -158.13976 + (((tickAnim - 10) / 5) * (-12.17785-(-158.13976)));
            yy = -2.92029 + (((tickAnim - 10) / 5) * (-0.62031-(-2.92029)));
            zz = 160.37516 + (((tickAnim - 10) / 5) * (26.84318-(160.37516)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -12.17785 + (((tickAnim - 15) / 5) * (-156.11342-(-12.17785)));
            yy = -0.62031 + (((tickAnim - 15) / 5) * (-5.15117-(-0.62031)));
            zz = 26.84318 + (((tickAnim - 15) / 5) * (159.25046-(26.84318)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -16.71776 + (((tickAnim - 0) / 1) * (-16.82814-(-16.71776)));
            yy = -55.29121 + (((tickAnim - 0) / 1) * (-43.87854-(-55.29121)));
            zz = -3.17062 + (((tickAnim - 0) / 1) * (-9.09426-(-3.17062)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = -16.82814 + (((tickAnim - 1) / 5) * (-31.78932-(-16.82814)));
            yy = -43.87854 + (((tickAnim - 1) / 5) * (-5.46042-(-43.87854)));
            zz = -9.09426 + (((tickAnim - 1) / 5) * (-21.69919-(-9.09426)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -31.78932 + (((tickAnim - 6) / 2) * (-23.642-(-31.78932)));
            yy = -5.46042 + (((tickAnim - 6) / 2) * (11.8335-(-5.46042)));
            zz = -21.69919 + (((tickAnim - 6) / 2) * (-27.60846-(-21.69919)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -23.642 + (((tickAnim - 8) / 2) * (-7.17914-(-23.642)));
            yy = 11.8335 + (((tickAnim - 8) / 2) * (39.50401-(11.8335)));
            zz = -27.60846 + (((tickAnim - 8) / 2) * (-4.85346-(-27.60846)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.17914 + (((tickAnim - 10) / 5) * (-4.84262-(-7.17914)));
            yy = 39.50401 + (((tickAnim - 10) / 5) * (-22.93867-(39.50401)));
            zz = -4.85346 + (((tickAnim - 10) / 5) * (-10.1528-(-4.85346)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -4.84262 + (((tickAnim - 15) / 3) * (-1.68001-(-4.84262)));
            yy = -22.93867 + (((tickAnim - 15) / 3) * (-48.26881-(-22.93867)));
            zz = -10.1528 + (((tickAnim - 15) / 3) * (-7.07619-(-10.1528)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.68001 + (((tickAnim - 18) / 2) * (-16.71776-(-1.68001)));
            yy = -48.26881 + (((tickAnim - 18) / 2) * (-55.29121-(-48.26881)));
            zz = -7.07619 + (((tickAnim - 18) / 2) * (-3.17062-(-7.07619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 45 + (((tickAnim - 0) / 6) * (-14.38-(45)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -14.38 + (((tickAnim - 6) / 4) * (-47.5-(-14.38)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -47.5 + (((tickAnim - 10) / 5) * (-23.75-(-47.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -23.75 + (((tickAnim - 15) / 3) * (17.08-(-23.75)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 17.08 + (((tickAnim - 18) / 2) * (45-(17.08)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -158.13976 + (((tickAnim - 0) / 5) * (-12.17785-(-158.13976)));
            yy = 2.92029 + (((tickAnim - 0) / 5) * (0.62031-(2.92029)));
            zz = -160.37516 + (((tickAnim - 0) / 5) * (-26.84318-(-160.37516)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.17785 + (((tickAnim - 5) / 5) * (-156.11342-(-12.17785)));
            yy = 0.62031 + (((tickAnim - 5) / 5) * (5.15117-(0.62031)));
            zz = -26.84318 + (((tickAnim - 5) / 5) * (-159.25046-(-26.84318)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -156.11342 + (((tickAnim - 10) / 5) * (-167.11265-(-156.11342)));
            yy = 5.15117 + (((tickAnim - 10) / 5) * (-27.64994-(5.15117)));
            zz = -159.25046 + (((tickAnim - 10) / 5) * (-171.28154-(-159.25046)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -167.11265 + (((tickAnim - 15) / 5) * (-158.13976-(-167.11265)));
            yy = -27.64994 + (((tickAnim - 15) / 5) * (2.92029-(-27.64994)));
            zz = -171.28154 + (((tickAnim - 15) / 5) * (-160.37516-(-171.28154)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+45))*5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*2.5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-5))*10), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60+30))*5));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(2.5), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-500))*5), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-500))*2.5));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(-5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+700))*5), Chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 28.17299 + (((tickAnim - 0) / 5) * (61.50232-(28.17299)));
            yy = 25.27372 + (((tickAnim - 0) / 5) * (-24.17341-(25.27372)));
            zz = 36.15125 + (((tickAnim - 0) / 5) * (66.42374-(36.15125)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 61.50232 + (((tickAnim - 5) / 5) * (-6.87912-(61.50232)));
            yy = -24.17341 + (((tickAnim - 5) / 5) * (-85.36657-(-24.17341)));
            zz = 66.42374 + (((tickAnim - 5) / 5) * (10.86096-(66.42374)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -6.87912 + (((tickAnim - 10) / 3) * (7.08859-(-6.87912)));
            yy = -85.36657 + (((tickAnim - 10) / 3) * (-44.76493-(-85.36657)));
            zz = 10.86096 + (((tickAnim - 10) / 3) * (19.97779-(10.86096)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.08859 + (((tickAnim - 13) / 2) * (21.05629-(7.08859)));
            yy = -44.76493 + (((tickAnim - 13) / 2) * (-4.16329-(-44.76493)));
            zz = 19.97779 + (((tickAnim - 13) / 2) * (29.09461-(19.97779)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 21.05629 + (((tickAnim - 15) / 5) * (28.17299-(21.05629)));
            yy = -4.16329 + (((tickAnim - 15) / 5) * (25.27372-(-4.16329)));
            zz = 29.09461 + (((tickAnim - 15) / 5) * (36.15125-(29.09461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 45 + (((tickAnim - 0) / 6) * (22.5-(45)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 22.5 + (((tickAnim - 6) / 4) * (60-(22.5)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 60 + (((tickAnim - 10) / 3) * (-2.5-(60)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -2.5 + (((tickAnim - 13) / 2) * (-20-(-2.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -20 + (((tickAnim - 15) / 5) * (45-(-20)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -201.51 + (((tickAnim - 0) / 10) * (-360.19649-(-201.51)));
            yy = -53.66094 + (((tickAnim - 0) / 10) * (19.49174-(-53.66094)));
            zz = 185.07689 + (((tickAnim - 0) / 10) * (363.76216-(185.07689)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -360.19649 + (((tickAnim - 10) / 3) * (-370.24434-(-360.19649)));
            yy = 19.49174 + (((tickAnim - 10) / 3) * (41.09755-(19.49174)));
            zz = 363.76216 + (((tickAnim - 10) / 3) * (368.83109-(363.76216)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -370.24434 + (((tickAnim - 13) / 2) * (-382.91565-(-370.24434)));
            yy = 41.09755 + (((tickAnim - 13) / 2) * (17.86523-(41.09755)));
            zz = 368.83109 + (((tickAnim - 13) / 2) * (376.59245-(368.83109)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -382.91565 + (((tickAnim - 15) / 3) * (-393.13059-(-382.91565)));
            yy = 17.86523 + (((tickAnim - 15) / 3) * (-43.09768-(17.86523)));
            zz = 376.59245 + (((tickAnim - 15) / 3) * (379.42749-(376.59245)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -393.13059 + (((tickAnim - 18) / 0) * (-396.53209-(-393.13059)));
            yy = -43.09768 + (((tickAnim - 18) / 0) * (-51.84434-(-43.09768)));
            zz = 379.42749 + (((tickAnim - 18) / 0) * (382.56234-(379.42749)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -396.53209 + (((tickAnim - 18) / 1) * (-299.02-(-396.53209)));
            yy = -51.84434 + (((tickAnim - 18) / 1) * (-62.75-(-51.84434)));
            zz = 382.56234 + (((tickAnim - 18) / 1) * (283.82-(382.56234)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -299.02 + (((tickAnim - 19) / 1) * (-201.51-(-299.02)));
            yy = -62.75 + (((tickAnim - 19) / 1) * (-53.66094-(-62.75)));
            zz = 283.82 + (((tickAnim - 19) / 1) * (185.07689-(283.82)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.87912 + (((tickAnim - 0) / 3) * (7.08859-(-6.87912)));
            yy = 85.36657 + (((tickAnim - 0) / 3) * (44.76493-(85.36657)));
            zz = -10.86096 + (((tickAnim - 0) / 3) * (-19.97779-(-10.86096)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.08859 + (((tickAnim - 3) / 2) * (21.05629-(7.08859)));
            yy = 44.76493 + (((tickAnim - 3) / 2) * (4.16329-(44.76493)));
            zz = -19.97779 + (((tickAnim - 3) / 2) * (-29.09461-(-19.97779)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.05629 + (((tickAnim - 5) / 5) * (28.17299-(21.05629)));
            yy = 4.16329 + (((tickAnim - 5) / 5) * (-25.27372-(4.16329)));
            zz = -29.09461 + (((tickAnim - 5) / 5) * (-36.15125-(-29.09461)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 28.17299 + (((tickAnim - 10) / 5) * (61.50232-(28.17299)));
            yy = -25.27372 + (((tickAnim - 10) / 5) * (24.17341-(-25.27372)));
            zz = -36.15125 + (((tickAnim - 10) / 5) * (-66.42374-(-36.15125)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 61.50232 + (((tickAnim - 15) / 5) * (-6.87912-(61.50232)));
            yy = 24.17341 + (((tickAnim - 15) / 5) * (85.36657-(24.17341)));
            zz = -66.42374 + (((tickAnim - 15) / 5) * (-10.86096-(-66.42374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -60 + (((tickAnim - 0) / 3) * (2.5-(-60)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (20-(2.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 20 + (((tickAnim - 5) / 5) * (-45-(20)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -45 + (((tickAnim - 10) / 6) * (-22.5-(-45)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -22.5 + (((tickAnim - 16) / 4) * (-60-(-22.5)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -360.19649 + (((tickAnim - 0) / 3) * (-370.24434-(-360.19649)));
            yy = -19.49174 + (((tickAnim - 0) / 3) * (-41.09755-(-19.49174)));
            zz = -363.76216 + (((tickAnim - 0) / 3) * (-368.83109-(-363.76216)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -370.24434 + (((tickAnim - 3) / 2) * (-382.91565-(-370.24434)));
            yy = -41.09755 + (((tickAnim - 3) / 2) * (-17.86523-(-41.09755)));
            zz = -368.83109 + (((tickAnim - 3) / 2) * (-376.59245-(-368.83109)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -382.91565 + (((tickAnim - 5) / 3) * (-393.13059-(-382.91565)));
            yy = -17.86523 + (((tickAnim - 5) / 3) * (43.09768-(-17.86523)));
            zz = -376.59245 + (((tickAnim - 5) / 3) * (-379.42749-(-376.59245)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -393.13059 + (((tickAnim - 8) / 0) * (-396.53209-(-393.13059)));
            yy = 43.09768 + (((tickAnim - 8) / 0) * (51.84434-(43.09768)));
            zz = -379.42749 + (((tickAnim - 8) / 0) * (-382.56234-(-379.42749)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -396.53209 + (((tickAnim - 8) / 1) * (-299.02-(-396.53209)));
            yy = 51.84434 + (((tickAnim - 8) / 1) * (62.75-(51.84434)));
            zz = -382.56234 + (((tickAnim - 8) / 1) * (-283.82-(-382.56234)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -299.02 + (((tickAnim - 9) / 1) * (-201.51-(-299.02)));
            yy = 62.75 + (((tickAnim - 9) / 1) * (53.66094-(62.75)));
            zz = -283.82 + (((tickAnim - 9) / 1) * (-185.07689-(-283.82)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -201.51 + (((tickAnim - 10) / 10) * (-360.19649-(-201.51)));
            yy = 53.66094 + (((tickAnim - 10) / 10) * (-19.49174-(53.66094)));
            zz = -185.07689 + (((tickAnim - 10) / 10) * (-363.76216-(-185.07689)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-20), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-300))*2.5), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+700))*2.5));

    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmphibamus entity = (EntityPrehistoricFloraAmphibamus) entitylivingbaseIn;
        int animCycle = 5;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+145))*8), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+100))*8));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+550))*0.4);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.25))*0.2);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+45))*10), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-20))*5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-5))*20), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-60+30))*10));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(2.5), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-500))*10), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-500))*5));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(-5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+700))*10), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-20), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-400))*5), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+700))*5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -56.95148 + (((tickAnim - 0) / 3) * (28.20953-(-56.95148)));
            yy = -44.78008 + (((tickAnim - 0) / 3) * (78.08377-(-44.78008)));
            zz = 2.76013 + (((tickAnim - 0) / 3) * (18.35721-(2.76013)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 28.20953 + (((tickAnim - 3) / 0) * (-15.78822-(28.20953)));
            yy = 78.08377 + (((tickAnim - 3) / 0) * (14.287-(78.08377)));
            zz = 18.35721 + (((tickAnim - 3) / 0) * (41.48545-(18.35721)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.78822 + (((tickAnim - 3) / 2) * (-56.95148-(-15.78822)));
            yy = 14.287 + (((tickAnim - 3) / 2) * (-44.78008-(14.287)));
            zz = 41.48545 + (((tickAnim - 3) / 2) * (2.76013-(41.48545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 129.8923 + (((tickAnim - 0) / 2) * (57.22533-(129.8923)));
            yy = -11.83497 + (((tickAnim - 0) / 2) * (-36.72631-(-11.83497)));
            zz = 68.07111 + (((tickAnim - 0) / 2) * (72.19268-(68.07111)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 57.22533 + (((tickAnim - 2) / 1) * (29.72278-(57.22533)));
            yy = -36.72631 + (((tickAnim - 2) / 1) * (-77.4974-(-36.72631)));
            zz = 72.19268 + (((tickAnim - 2) / 1) * (-2.47629-(72.19268)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 29.72278 + (((tickAnim - 3) / 0) * (51.39702-(29.72278)));
            yy = -77.4974 + (((tickAnim - 3) / 0) * (-40.61539-(-77.4974)));
            zz = -2.47629 + (((tickAnim - 3) / 0) * (16.29257-(-2.47629)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 51.39702 + (((tickAnim - 3) / 2) * (129.8923-(51.39702)));
            yy = -40.61539 + (((tickAnim - 3) / 2) * (-11.83497-(-40.61539)));
            zz = 16.29257 + (((tickAnim - 3) / 2) * (68.07111-(16.29257)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 41.3761 + (((tickAnim - 0) / 3) * (-21.46918-(41.3761)));
            yy = -1.45931 + (((tickAnim - 0) / 3) * (-6.62127-(-1.45931)));
            zz = 4.15354 + (((tickAnim - 0) / 3) * (43.14252-(4.15354)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -21.46918 + (((tickAnim - 3) / 2) * (41.3761-(-21.46918)));
            yy = -6.62127 + (((tickAnim - 3) / 2) * (-1.45931-(-6.62127)));
            zz = 43.14252 + (((tickAnim - 3) / 2) * (4.15354-(43.14252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(0), LowerArmR.rotateAngleY + (float) Math.toRadians(37.5), LowerArmR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.5 + (((tickAnim - 2) / 1) * (-70-(2.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -70 + (((tickAnim - 3) / 0) * (-7.92-(-70)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -7.92 + (((tickAnim - 3) / 1) * (-28.33-(-7.92)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -28.33 + (((tickAnim - 4) / 1) * (0-(-28.33)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(xx), LowerlegR.rotateAngleY + (float) Math.toRadians(yy), LowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.20953 + (((tickAnim - 0) / 1) * (-15.78822-(28.20953)));
            yy = -78.08377 + (((tickAnim - 0) / 1) * (-14.287-(-78.08377)));
            zz = -18.35721 + (((tickAnim - 0) / 1) * (-41.48545-(-18.35721)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -15.78822 + (((tickAnim - 1) / 2) * (-56.95148-(-15.78822)));
            yy = -14.287 + (((tickAnim - 1) / 2) * (44.78008-(-14.287)));
            zz = -41.48545 + (((tickAnim - 1) / 2) * (-2.76013-(-41.48545)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -56.95148 + (((tickAnim - 3) / 2) * (28.20953-(-56.95148)));
            yy = 44.78008 + (((tickAnim - 3) / 2) * (-78.08377-(44.78008)));
            zz = -2.76013 + (((tickAnim - 3) / 2) * (-18.35721-(-2.76013)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 70 + (((tickAnim - 0) / 1) * (7.92-(70)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 7.92 + (((tickAnim - 1) / 1) * (28.33-(7.92)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 28.33 + (((tickAnim - 2) / 1) * (0-(28.33)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -2.5 + (((tickAnim - 4) / 1) * (70-(-2.5)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -21.46918 + (((tickAnim - 0) / 3) * (41.3761-(-21.46918)));
            yy = 6.62127 + (((tickAnim - 0) / 3) * (1.45931-(6.62127)));
            zz = -43.14252 + (((tickAnim - 0) / 3) * (-4.15354-(-43.14252)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 41.3761 + (((tickAnim - 3) / 2) * (-21.46918-(41.3761)));
            yy = 1.45931 + (((tickAnim - 3) / 2) * (6.62127-(1.45931)));
            zz = -4.15354 + (((tickAnim - 3) / 2) * (-43.14252-(-4.15354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-35-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (-45-(0)));
            zz = 15 + (((tickAnim - 3) / 0) * (45-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35 + (((tickAnim - 3) / 2) * (0-(-35)));
            yy = -45 + (((tickAnim - 3) / 2) * (0-(-45)));
            zz = 45 + (((tickAnim - 3) / 2) * (0-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 29.72278 + (((tickAnim - 0) / 1) * (51.39702-(29.72278)));
            yy = 77.4974 + (((tickAnim - 0) / 1) * (40.61539-(77.4974)));
            zz = 2.47629 + (((tickAnim - 0) / 1) * (-16.29257-(2.47629)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 51.39702 + (((tickAnim - 1) / 2) * (129.8923-(51.39702)));
            yy = 40.61539 + (((tickAnim - 1) / 2) * (11.83497-(40.61539)));
            zz = -16.29257 + (((tickAnim - 1) / 2) * (-68.07111-(-16.29257)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 129.8923 + (((tickAnim - 3) / 1) * (57.22533-(129.8923)));
            yy = 11.83497 + (((tickAnim - 3) / 1) * (36.72631-(11.83497)));
            zz = -68.07111 + (((tickAnim - 3) / 1) * (-72.19268-(-68.07111)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 57.22533 + (((tickAnim - 4) / 1) * (29.72278-(57.22533)));
            yy = 36.72631 + (((tickAnim - 4) / 1) * (77.4974-(36.72631)));
            zz = -72.19268 + (((tickAnim - 4) / 1) * (2.47629-(-72.19268)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (45-(0)));
            zz = -15 + (((tickAnim - 0) / 1) * (-45-(-15)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -35 + (((tickAnim - 1) / 2) * (0-(-35)));
            yy = 45 + (((tickAnim - 1) / 2) * (0-(45)));
            zz = -45 + (((tickAnim - 1) / 2) * (0-(-45)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(0), LowerArmL.rotateAngleY + (float) Math.toRadians(-37.5), LowerArmL.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.body.offsetY = 1.2F;

        EntityPrehistoricFloraAmphibamus Amphibamus = (EntityPrehistoricFloraAmphibamus) e;

        this.faceTarget(f3, f4, 6, Chest);

//        float speed = 0.4F;
//        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2};
//        AdvancedModelRenderer[] Torso = {this.body, this.chest};
//
//        AdvancedModelRenderer[] LeftArm = {this.upperarmleft, this.lowerarmleft};
//        AdvancedModelRenderer[] RightArm = {this.upperarmright, this.lowerarmright};
//
//        AdvancedModelRenderer[] LeftLeg = {this.upperlegleft, this.lowerlegleft};
//        AdvancedModelRenderer[] RightLeg = {this.upperlegright, this.lowerlegright};
//
//        if (!Amphibamus.isReallyInWater()) {
//            //Land animation:
//            this.chainWave(Tail, speed * (0.1F), 0.05F, -3, f2, 1);
//            this.chainSwing(Tail, speed * (0.1F), 0.12F, -3, f2, 0.8F);
//
//
//            this.walk(this.upperjaw, speed * 0.2F, 2F,true, 0F,0.1F, f2, 0.1F);
//
//
//
//            if (f3 == 0.0F || !Amphibamus.getIsMoving()) { //Not moving
//                return;
//            }
//
//            this.flap(upperlegleft, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
//            this.swing(upperlegleft, speed, -0.5F, true, -1, 1F, f2, 0.5F);
//            this.walk(lowerlegleft, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
//            this.flap(lowerlegleft, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
//            this.flap(footleft, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
//            this.walk(footleft, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
//            this.swing(footleft, speed, 0.2F, false, 3, 0F, f2, 0.5F);
//
//            this.flap(upperlegright, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
//            this.swing(upperlegright, speed, 0.5F, true, 2, -1F, f2, 0.5F);
//            this.walk(lowerlegright, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
//            this.flap(lowerlegright, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
//            this.flap(footright, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
//            this.walk(footright, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
//            this.swing(footright, speed, -0.2F, false, 6, 0F, f2, 0.5F);
//
//            this.flap(upperarmleft, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
//            this.swing(upperarmleft, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
//            this.walk(lowerarmleft, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
//            this.flap(handleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
//            this.walk(handleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
//            this.swing(handleft, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);
//
//            this.flap(upperarmleft, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
//            this.swing(upperarmleft, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
//            this.walk(lowerarmright, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
//            this.flap(handright, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
//            this.walk(handright, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
//            this.swing(handright, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);
//
//
//
//        }
//        else {
//            //Swimming animation:
//            speed = speed * 1.2F;
//
//            this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
//            this.setRotateAngle(cube_r11, 0.0F, 0.0F, -1.5708F);
//            this.setRotateAngle(cube_r12, 0.0F, -0.6545F, 0.0F);
//            this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.5708F);
//            this.setRotateAngle(cube_r14, 0.0F, 0.0F, 1.5708F);
//            this.setRotateAngle(cube_r15, 0.0F, 0.6545F, 0.0F);
//            this.setRotateAngle(cube_r16, 0.0F, -1.117F, 0.0F);
//            this.setRotateAngle(cube_r17, 0.0F, -1.4835F, 0.0F);
//            this.setRotateAngle(cube_r18, 0.0F, 1.117F, 0.0F);
//            this.setRotateAngle(cube_r19, 0.0F, 1.4835F, 0.0F);
//            this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
//            this.setRotateAngle(cube_r20, 0.0F, -1.117F, 0.0F);
//            this.setRotateAngle(cube_r21, 0.0F, -1.4835F, 0.0F);
//            this.setRotateAngle(cube_r22, 0.0F, 1.4835F, 0.0F);
//            this.setRotateAngle(cube_r23, 0.0F, 1.117F, 0.0F);
//            this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r25, 0.5672F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
//            this.setRotateAngle(cube_r4, 0.0F, 0.0F, 1.5708F);
//            this.setRotateAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
//            this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
//            this.setRotateAngle(eyeR, 0.0F, -0.2618F, 0.2618F);
//            this.setRotateAngle(eyeR2, 0.0F, 0.2618F, -0.2618F);
//            this.setRotateAngle(footleft, 1.3836F, 0.2338F, -0.0296F);
//            this.setRotateAngle(footright, 1.3836F, -0.2338F, 0.0296F);
//            this.setRotateAngle(handleft, 0.7411F, 0.1196F, 0.3152F);
//            this.setRotateAngle(handright, 0.7411F, -0.1196F, -0.3152F);
//            this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(lowerarmleft, 0.0F, -0.1309F, 0.0F);
//            this.setRotateAngle(lowerarmright, 0.0F, 0.1309F, 0.0F);
//            this.setRotateAngle(lowerlegleft, -0.0025F, -0.6981F, 0.0888F);
//            this.setRotateAngle(lowerlegright, -0.0025F, 0.6981F, -0.0888F);
//            this.setRotateAngle(tail1, 0.2094F, 0.0F, 0.0F);
//            this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
//            this.setRotateAngle(upperarmleft, -0.0329F, -1.0035F, 0.3139F);
//            this.setRotateAngle(upperarmright, -0.0329F, 1.0035F, -0.3139F);
//            this.setRotateAngle(upperlegleft, -0.4269F, -1.002F, 0.4398F);
//            this.setRotateAngle(upperlegright, -0.4269F, 1.002F, -0.4398F);
//
//            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
//            if (f3 == 0.0F) {
//                return;
//            }
//
//            this.chainSwingExtended(LeftArm, speed, -0.2F,0F,3.0F, f2, 0.7F);
//            this.chainSwingExtended(RightArm, speed, 0.2F,0F,0, f2, 0.7F);
//
//            this.chainSwingExtended(LeftLeg, speed, 0.2F,0F,3.0F, f2, 0.7F);
//            this.chainSwingExtended(RightLeg, speed , -0.2F,0F,0, f2, 0.7F);
//
//            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
//            this.chainSwing(Tail, speed * 1.2F, 0.3F, -3, f2, 0.8F);
//            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
//
//
//        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAmphibamus e = (EntityPrehistoricFloraAmphibamus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-1F);
        animator.rotate(this.Upperjaw, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Head, 0,0,-1F);
        animator.rotate(this.Upperjaw, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
