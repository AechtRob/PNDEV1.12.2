package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSasayamamylos;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSasayamamylos extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r29;


    private ModelAnimator animator;

    public ModelSasayamamylos() {
        this.textureWidth = 37;
        this.textureHeight = 35;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 20.3F, 3.2F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.0F, -0.6F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3142F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, -1.0F, -2.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.3F, 0.1F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.0F, -4.2F, 4, 4, 4, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.3F, -4.2F);
        this.body.addChild(chest);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.1F, 1.0F, -1.7F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -1.4F, -0.9947F, -0.0572F, 3, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1F, 0.0F, -1.7F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 8, -1.4F, -2.0F, -0.5F, 3, 3, 3, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.3F, -2.0F);
        this.chest.addChild(Neck);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.Neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4189F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 15, -1.0F, -1.032F, -0.0585F, 2, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, -1.1F);
        this.Neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2269F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 25, -1.0F, 0.0518F, -0.1932F, 2, 2, 2, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.1F, -1.9F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 29, 19, -1.0F, -0.8796F, -1.2227F, 2, 1, 2, 0.02F, false));
        this.Head.cubeList.add(new ModelBox(Head, 14, 33, 0.1F, -0.7796F, -1.4227F, 1, 1, 1, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 19, 33, -1.1F, -0.7796F, -1.4227F, 1, 1, 1, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6204F, -0.0227F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 30, -0.5F, -1.0F, -0.8F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.0796F, 0.4773F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.4363F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 23, -0.4F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -0.0796F, 0.4773F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 23, -0.6F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.8796F, -1.3227F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2094F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 12, -0.5F, 0.0181F, -0.8824F, 1, 1, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.6204F, -0.7227F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 18, -0.5F, -1.3129F, -1.9754F, 1, 1, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.1F, -0.0296F, -2.2477F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.672F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 33, -0.45F, -0.4599F, -0.5568F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 33, 0.25F, -0.4599F, -0.5568F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5204F, -0.9227F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 0, -0.5F, -1.3129F, -1.9754F, 1, 1, 2, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.3796F, -1.1227F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0963F, -0.604F, -0.0945F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 30, -0.4819F, -0.381F, -0.7627F, 1, 1, 1, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.3796F, -1.1227F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0963F, 0.604F, 0.0945F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 30, -0.5181F, -0.381F, -0.7627F, 1, 1, 1, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(-0.1F, 0.4193F, -0.2489F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0175F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 15, -0.9F, -0.504F, -1.0214F, 2, 1, 2, 0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 30, 4, -0.4F, -0.504F, -2.6214F, 1, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 11, 18, -0.4F, -0.604F, -2.4214F, 1, 1, 0, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 5, 32, 0.5F, -0.604F, -2.4214F, 0, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 24, 33, -0.3F, -0.604F, -2.4214F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.9F, 0.496F, -0.5214F);
        this.Jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.5236F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 32, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.1F, 0.496F, -0.5214F);
        this.Jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.5236F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 30, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.6F, -0.9165F, -0.6939F);
        this.Jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4996F, -0.27F, 0.1446F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 33, 0.0F, -0.275F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.8F, -0.9165F, -0.6939F);
        this.Jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4996F, 0.27F, -0.1446F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 33, 0.0F, -0.275F, 0.0F, 0, 1, 1, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-0.9F, 0.3F, -0.6F);
        this.chest.addChild(rightArm1);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightArm1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4887F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 20, -1.0F, -0.8182F, -1.2084F, 2, 2, 2, -0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.5F, 1.2F, 0.2F);
        this.rightArm1.addChild(rightArm2);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.2F, -0.8F, 0.0F);
        this.rightArm2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2443F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 30, -0.6F, -0.0816F, -0.4337F, 1, 3, 1, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.2F, 1.7F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 30, 8, -0.6F, -0.5F, -1.8F, 1, 1, 2, -0.01F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(0.9F, 0.3F, -0.6F);
        this.chest.addChild(leftArm1);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftArm1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4887F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 20, -1.0F, -0.8182F, -1.2084F, 2, 2, 2, -0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.5F, 1.2F, 0.2F);
        this.leftArm1.addChild(leftArm2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.2F, -0.8F, 0.0F);
        this.leftArm2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2443F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 30, -0.4F, -0.0816F, -0.4337F, 1, 3, 1, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-0.2F, 1.7F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 30, 8, -0.4F, -0.5F, -1.8F, 1, 1, 2, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.2F, 0.1F, 2.5F);
        this.root.addChild(leftLeg1);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.8F, -1.8F);
        this.leftLeg1.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, -0.2269F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 0, -1.0F, -2.0F, -2.0F, 2, 3, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.1F, 1.2F, -3.1F);
        this.leftLeg1.addChild(leftLeg2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.6708F, -0.1733F, 0.0545F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 25, -1.0F, -0.5827F, -0.0814F, 1, 1, 3, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(-1.3F, 1.6F, 2.2F);
        this.leftLeg2.addChild(leftFoot);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 0, 22, 0.0F, -0.2F, -2.8F, 1, 1, 3, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.2F, 0.1F, 2.5F);
        this.root.addChild(rightLeg1);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.8F, -1.8F);
        this.rightLeg1.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1745F, 0.2269F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 0, -1.0F, -2.0F, -2.0F, 2, 3, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.1F, 1.2F, -3.1F);
        this.rightLeg1.addChild(rightLeg2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.6708F, 0.1733F, -0.0545F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 27, 25, 0.0F, -0.5827F, -0.0814F, 1, 1, 3, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(1.3F, 1.6F, 2.2F);
        this.rightLeg2.addChild(rightFoot);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 0, 22, -1.0F, -0.2F, -2.8F, 1, 1, 3, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.6F, 3.1F);
        this.root.addChild(Tail1);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4189F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 25, -0.5F, -0.4F, 0.1F, 1, 1, 3, 0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.1F, 2.5F);
        this.Tail1.addChild(Tail2);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.384F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 27, -0.5F, -0.4F, 0.1F, 1, 1, 3, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 1.1613F, 2.8743F);
        this.Tail2.addChild(Tail3);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1222F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 11, 20, -0.5F, -0.4F, -0.2F, 1, 1, 3, -0.01F, false));



        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.80F;
        this.root.offsetX = 0.4F;
        this.root.rotateAngleY = (float)Math.toRadians(250);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 3.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = 0.156F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

//    public void renderStaticWall(float f) {
//
//        resetToDefaultPose();
//    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraSasayamamylos entitySasayamamylos = (EntityPrehistoricFloraSasayamamylos) e;

        this.faceTarget(f3, f4, 12, Neck);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Neck = {};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (entitySasayamamylos.getAnimation() == entitySasayamamylos.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entitySasayamamylos.isReallyInWater()) {

                if (f3 == 0.0F || !entitySasayamamylos.getIsMoving()) {
                    if (entitySasayamamylos.getAnimation() != entitySasayamamylos.EAT_ANIMATION
                        && entitySasayamamylos.getAnimation() != entitySasayamamylos.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySasayamamylos.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSasayamamylos ee = (EntityPrehistoricFloraSasayamamylos) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The graze anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSasayamamylos entity = (EntityPrehistoricFloraSasayamamylos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 17) {
            xx = -6 + (((tickAnim - 4) / 13) * (2.57-(-6)));
            yy = 0 + (((tickAnim - 4) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 13) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 2.57 + (((tickAnim - 17) / 3) * (0-(2.57)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 4) / 4) * (-14.11-(-7)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -14.11 + (((tickAnim - 8) / 9) * (-9-(-14.11)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 17) / 3) * (0-(-9)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (12-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 12 + (((tickAnim - 8) / 2) * (0-(12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (12-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 18) / 2) * (0-(12)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSasayamamylos entity = (EntityPrehistoricFloraSasayamamylos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (10.33-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 10.33 + (((tickAnim - 2) / 5) * (43-(10.33)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 43 + (((tickAnim - 7) / 3) * (17.5-(43)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 17.5 + (((tickAnim - 10) / 4) * (7.21-(17.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 7.21 + (((tickAnim - 14) / 6) * (0-(7.21)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (13.33-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 13.33 + (((tickAnim - 2) / 1) * (9.6358-(13.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (1.01224-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-3.87-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 9.6358 + (((tickAnim - 3) / 2) * (-5-(9.6358)));
            yy = 1.01224 + (((tickAnim - 3) / 2) * (0-(1.01224)));
            zz = -3.87 + (((tickAnim - 3) / 2) * (-6-(-3.87)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 5) / 2) * (-5.77-(-5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -6 + (((tickAnim - 5) / 2) * (0-(-6)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -5.77 + (((tickAnim - 7) / 2) * (8.08-(-5.77)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 8.08 + (((tickAnim - 9) / 3) * (14.22-(8.08)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 14.22 + (((tickAnim - 12) / 2) * (3.95-(14.22)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 3.95 + (((tickAnim - 14) / 2) * (8.82-(3.95)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 8.82 + (((tickAnim - 16) / 2) * (-1.71-(8.82)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.71 + (((tickAnim - 18) / 2) * (0-(-1.71)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (31-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 31 + (((tickAnim - 7) / 2) * (0-(31)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (15-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 14) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (16-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 18) / 2) * (0-(16)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSasayamamylos entity = (EntityPrehistoricFloraSasayamamylos) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = -16 + (((tickAnim - 4) / 42) * (-16-(-16)));
            yy = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 46) / 4) * (0-(-16)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            yy = -0.7 + (((tickAnim - 4) / 42) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = -0.7 + (((tickAnim - 46) / 4) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.08-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.08 + (((tickAnim - 4) / 6) * (0-(-0.08)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 43) / 4) * (6.78-(0)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 6.78 + (((tickAnim - 47) / 3) * (0-(6.78)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 4) / 4) * (21.07-(13.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21.07 + (((tickAnim - 8) / 2) * (18-(21.07)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 18 + (((tickAnim - 10) / 4) * (18-(18)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 14) / 6) * (12-(18)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 12 + (((tickAnim - 20) / 7) * (18-(12)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 18 + (((tickAnim - 27) / 7) * (8-(18)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 8 + (((tickAnim - 34) / 9) * (18-(8)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 18 + (((tickAnim - 43) / 2) * (11.25-(18)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 11.25 + (((tickAnim - 45) / 3) * (9.63-(11.25)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 9.63 + (((tickAnim - 48) / 2) * (0-(9.63)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.05-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.05 + (((tickAnim - 3) / 1) * (3.25-(-1.05)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 3.25 + (((tickAnim - 4) / 3) * (-7-(3.25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -7 + (((tickAnim - 7) / 3) * (-9-(-7)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 10) / 10) * (-9-(-9)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -9 + (((tickAnim - 20) / 3) * (-16-(-9)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -16 + (((tickAnim - 23) / 5) * (-3-(-16)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -3 + (((tickAnim - 28) / 4) * (-9-(-3)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -9 + (((tickAnim - 32) / 3) * (-12-(-9)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -12 + (((tickAnim - 35) / 4) * (-3-(-12)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -3 + (((tickAnim - 39) / 4) * (-2.08-(-3)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -2.08 + (((tickAnim - 43) / 3) * (5.84-(-2.08)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 5.84 + (((tickAnim - 46) / 2) * (1.5-(5.84)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 1.5 + (((tickAnim - 48) / 2) * (0-(1.5)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5.4 + (((tickAnim - 3) / 1) * (11-(-5.4)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 11 + (((tickAnim - 4) / 3) * (50-(11)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 50 + (((tickAnim - 7) / 3) * (78-(50)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 78 + (((tickAnim - 10) / 10) * (78-(78)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 78 + (((tickAnim - 20) / 3) * (85-(78)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 85 + (((tickAnim - 23) / 5) * (85-(85)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 85 + (((tickAnim - 28) / 4) * (78-(85)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 78 + (((tickAnim - 32) / 3) * (85-(78)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 85 + (((tickAnim - 35) / 4) * (85-(85)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 85 + (((tickAnim - 39) / 4) * (58.85-(85)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 58.85 + (((tickAnim - 43) / 2) * (15.23-(58.85)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 15.23 + (((tickAnim - 45) / 3) * (-3.38-(15.23)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -3.38 + (((tickAnim - 48) / 2) * (0-(-3.38)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (15-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 11) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (13-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 13 + (((tickAnim - 14) / 2) * (0-(13)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 10) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (19-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 19 + (((tickAnim - 28) / 1) * (0-(19)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.09-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.09 + (((tickAnim - 3) / 3) * (-8.4177-(-7.09)));
            yy = 0 + (((tickAnim - 3) / 3) * (-1.02974-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-6.92422-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -8.4177 + (((tickAnim - 6) / 4) * (-35.32853-(-8.4177)));
            yy = -1.02974 + (((tickAnim - 6) / 4) * (-7.04252-(-1.02974)));
            zz = -6.92422 + (((tickAnim - 6) / 4) * (3.82801-(-6.92422)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -35.32853 + (((tickAnim - 10) / 2) * (-51.32895-(-35.32853)));
            yy = -7.04252 + (((tickAnim - 10) / 2) * (-7.0418-(-7.04252)));
            zz = 3.82801 + (((tickAnim - 10) / 2) * (3.82858-(3.82801)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -51.32895 + (((tickAnim - 12) / 1) * (-35.33-(-51.32895)));
            yy = -7.0418 + (((tickAnim - 12) / 1) * (-7.04-(-7.0418)));
            zz = 3.82858 + (((tickAnim - 12) / 1) * (3.83-(3.82858)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -35.33 + (((tickAnim - 13) / 2) * (-51.32895-(-35.33)));
            yy = -7.04 + (((tickAnim - 13) / 2) * (-7.0418-(-7.04)));
            zz = 3.83 + (((tickAnim - 13) / 2) * (3.82858-(3.83)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -51.32895 + (((tickAnim - 15) / 2) * (-35.33-(-51.32895)));
            yy = -7.0418 + (((tickAnim - 15) / 2) * (-7.04-(-7.0418)));
            zz = 3.82858 + (((tickAnim - 15) / 2) * (3.83-(3.82858)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -35.33 + (((tickAnim - 17) / 1) * (-54.52559-(-35.33)));
            yy = -7.04 + (((tickAnim - 17) / 1) * (-1.06908-(-7.04)));
            zz = 3.83 + (((tickAnim - 17) / 1) * (4.42171-(3.83)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -54.52559 + (((tickAnim - 18) / 4) * (-103.31897-(-54.52559)));
            yy = -1.06908 + (((tickAnim - 18) / 4) * (7.8873-(-1.06908)));
            zz = 4.42171 + (((tickAnim - 18) / 4) * (5.30927-(4.42171)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -103.31897 + (((tickAnim - 22) / 2) * (-85.85807-(-103.31897)));
            yy = 7.8873 + (((tickAnim - 22) / 2) * (0.90571-(7.8873)));
            zz = 5.30927 + (((tickAnim - 22) / 2) * (4.80011-(5.30927)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -85.85807 + (((tickAnim - 24) / 3) * (-46.41005-(-85.85807)));
            yy = 0.90571 + (((tickAnim - 24) / 3) * (-2.07393-(0.90571)));
            zz = 4.80011 + (((tickAnim - 24) / 3) * (4.43632-(4.80011)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -46.41005 + (((tickAnim - 27) / 1) * (-27.76202-(-46.41005)));
            yy = -2.07393 + (((tickAnim - 27) / 1) * (-5.05357-(-2.07393)));
            zz = 4.43632 + (((tickAnim - 27) / 1) * (4.07253-(4.43632)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -27.76202 + (((tickAnim - 28) / 2) * (-35.33-(-27.76202)));
            yy = -5.05357 + (((tickAnim - 28) / 2) * (-7.04-(-5.05357)));
            zz = 4.07253 + (((tickAnim - 28) / 2) * (3.83-(4.07253)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -35.33 + (((tickAnim - 30) / 2) * (-54.52559-(-35.33)));
            yy = -7.04 + (((tickAnim - 30) / 2) * (-1.06908-(-7.04)));
            zz = 3.83 + (((tickAnim - 30) / 2) * (4.42171-(3.83)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -54.52559 + (((tickAnim - 32) / 2) * (-103.31897-(-54.52559)));
            yy = -1.06908 + (((tickAnim - 32) / 2) * (7.8873-(-1.06908)));
            zz = 4.42171 + (((tickAnim - 32) / 2) * (5.30927-(4.42171)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -103.31897 + (((tickAnim - 34) / 3) * (-85.85807-(-103.31897)));
            yy = 7.8873 + (((tickAnim - 34) / 3) * (0.90571-(7.8873)));
            zz = 5.30927 + (((tickAnim - 34) / 3) * (4.80011-(5.30927)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -85.85807 + (((tickAnim - 37) / 2) * (-46.41005-(-85.85807)));
            yy = 0.90571 + (((tickAnim - 37) / 2) * (-2.07393-(0.90571)));
            zz = 4.80011 + (((tickAnim - 37) / 2) * (4.43632-(4.80011)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -46.41005 + (((tickAnim - 39) / 3) * (-27.76202-(-46.41005)));
            yy = -2.07393 + (((tickAnim - 39) / 3) * (-5.05357-(-2.07393)));
            zz = 4.43632 + (((tickAnim - 39) / 3) * (4.07253-(4.43632)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -27.76202 + (((tickAnim - 42) / 1) * (-35.33-(-27.76202)));
            yy = -5.05357 + (((tickAnim - 42) / 1) * (-7.04-(-5.05357)));
            zz = 4.07253 + (((tickAnim - 42) / 1) * (3.83-(4.07253)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -35.33 + (((tickAnim - 43) / 7) * (0-(-35.33)));
            yy = -7.04 + (((tickAnim - 43) / 7) * (0-(-7.04)));
            zz = 3.83 + (((tickAnim - 43) / 7) * (0-(3.83)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.36-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.36 + (((tickAnim - 3) / 3) * (-40.63-(-5.36)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -40.63 + (((tickAnim - 6) / 4) * (-32.82346-(-40.63)));
            yy = 0 + (((tickAnim - 6) / 4) * (-9.40965-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-14.22279-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -32.82346 + (((tickAnim - 10) / 2) * (-17.82247-(-32.82346)));
            yy = -9.40965 + (((tickAnim - 10) / 2) * (-9.40975-(-9.40965)));
            zz = -14.22279 + (((tickAnim - 10) / 2) * (-14.22199-(-14.22279)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -17.82247 + (((tickAnim - 12) / 1) * (-32.82-(-17.82247)));
            yy = -9.40975 + (((tickAnim - 12) / 1) * (-9.41-(-9.40975)));
            zz = -14.22199 + (((tickAnim - 12) / 1) * (-14.22-(-14.22199)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -32.82 + (((tickAnim - 13) / 2) * (-17.82247-(-32.82)));
            yy = -9.41 + (((tickAnim - 13) / 2) * (-9.40975-(-9.41)));
            zz = -14.22 + (((tickAnim - 13) / 2) * (-14.22199-(-14.22)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -17.82247 + (((tickAnim - 15) / 2) * (-32.82-(-17.82247)));
            yy = -9.40975 + (((tickAnim - 15) / 2) * (-9.41-(-9.40975)));
            zz = -14.22199 + (((tickAnim - 15) / 2) * (-14.22-(-14.22199)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -32.82 + (((tickAnim - 17) / 1) * (-39.7913-(-32.82)));
            yy = -9.41 + (((tickAnim - 17) / 1) * (-1.06958-(-9.41)));
            zz = -14.22 + (((tickAnim - 17) / 1) * (0.29032-(-14.22)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -39.7913 + (((tickAnim - 18) / 4) * (14.24086-(-39.7913)));
            yy = -1.06958 + (((tickAnim - 18) / 4) * (-7.64033-(-1.06958)));
            zz = 0.29032 + (((tickAnim - 18) / 4) * (-1.19595-(0.29032)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 14.24086 + (((tickAnim - 22) / 2) * (1.23759-(14.24086)));
            yy = -7.64033 + (((tickAnim - 22) / 2) * (-14.55364-(-7.64033)));
            zz = -1.19595 + (((tickAnim - 22) / 2) * (9.51418-(-1.19595)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 1.23759 + (((tickAnim - 24) / 3) * (-35.93887-(1.23759)));
            yy = -14.55364 + (((tickAnim - 24) / 3) * (-6.84503-(-14.55364)));
            zz = 9.51418 + (((tickAnim - 24) / 3) * (8.89767-(9.51418)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -35.93887 + (((tickAnim - 27) / 1) * (-44.06755-(-35.93887)));
            yy = -6.84503 + (((tickAnim - 27) / 1) * (-8.38401-(-6.84503)));
            zz = 8.89767 + (((tickAnim - 27) / 1) * (-4.97293-(8.89767)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -44.06755 + (((tickAnim - 28) / 2) * (-32.82-(-44.06755)));
            yy = -8.38401 + (((tickAnim - 28) / 2) * (-9.41-(-8.38401)));
            zz = -4.97293 + (((tickAnim - 28) / 2) * (-14.22-(-4.97293)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -32.82 + (((tickAnim - 30) / 2) * (-39.7913-(-32.82)));
            yy = -9.41 + (((tickAnim - 30) / 2) * (-1.06958-(-9.41)));
            zz = -14.22 + (((tickAnim - 30) / 2) * (0.29032-(-14.22)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -39.7913 + (((tickAnim - 32) / 2) * (14.24086-(-39.7913)));
            yy = -1.06958 + (((tickAnim - 32) / 2) * (-7.64033-(-1.06958)));
            zz = 0.29032 + (((tickAnim - 32) / 2) * (-1.19595-(0.29032)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 14.24086 + (((tickAnim - 34) / 3) * (1.23759-(14.24086)));
            yy = -7.64033 + (((tickAnim - 34) / 3) * (-14.55364-(-7.64033)));
            zz = -1.19595 + (((tickAnim - 34) / 3) * (9.51418-(-1.19595)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 1.23759 + (((tickAnim - 37) / 2) * (-35.93887-(1.23759)));
            yy = -14.55364 + (((tickAnim - 37) / 2) * (-6.84503-(-14.55364)));
            zz = 9.51418 + (((tickAnim - 37) / 2) * (8.89767-(9.51418)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -35.93887 + (((tickAnim - 39) / 3) * (-44.06755-(-35.93887)));
            yy = -6.84503 + (((tickAnim - 39) / 3) * (-8.38401-(-6.84503)));
            zz = 8.89767 + (((tickAnim - 39) / 3) * (-4.97293-(8.89767)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -44.06755 + (((tickAnim - 42) / 1) * (-32.82-(-44.06755)));
            yy = -8.38401 + (((tickAnim - 42) / 1) * (-9.41-(-8.38401)));
            zz = -4.97293 + (((tickAnim - 42) / 1) * (-14.22-(-4.97293)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -32.82 + (((tickAnim - 43) / 7) * (0-(-32.82)));
            yy = -9.41 + (((tickAnim - 43) / 7) * (0-(-9.41)));
            zz = -14.22 + (((tickAnim - 43) / 7) * (0-(-14.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (39.91-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 39.91 + (((tickAnim - 3) / 3) * (62.52-(39.91)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 62.52 + (((tickAnim - 6) / 4) * (74.45195-(62.52)));
            yy = 0 + (((tickAnim - 6) / 4) * (-3.82348-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-13.47782-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 74.45195 + (((tickAnim - 10) / 2) * (73.99969-(74.45195)));
            yy = -3.82348 + (((tickAnim - 10) / 2) * (0.0011-(-3.82348)));
            zz = -13.47782 + (((tickAnim - 10) / 2) * (-0.00066-(-13.47782)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 73.99969 + (((tickAnim - 12) / 1) * (74.45-(73.99969)));
            yy = 0.0011 + (((tickAnim - 12) / 1) * (-3.82-(0.0011)));
            zz = -0.00066 + (((tickAnim - 12) / 1) * (-13.48-(-0.00066)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 74.45 + (((tickAnim - 13) / 2) * (73.99969-(74.45)));
            yy = -3.82 + (((tickAnim - 13) / 2) * (0.0011-(-3.82)));
            zz = -13.48 + (((tickAnim - 13) / 2) * (-0.00066-(-13.48)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 73.99969 + (((tickAnim - 15) / 2) * (74.45-(73.99969)));
            yy = 0.0011 + (((tickAnim - 15) / 2) * (-3.82-(0.0011)));
            zz = -0.00066 + (((tickAnim - 15) / 2) * (-13.48-(-0.00066)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 74.45 + (((tickAnim - 17) / 1) * (74.52801-(74.45)));
            yy = -3.82 + (((tickAnim - 17) / 1) * (2.53979-(-3.82)));
            zz = -13.48 + (((tickAnim - 17) / 1) * (9.01808-(-13.48)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 74.52801 + (((tickAnim - 18) / 4) * (77.26414-(74.52801)));
            yy = 2.53979 + (((tickAnim - 18) / 4) * (-9.76792-(2.53979)));
            zz = 9.01808 + (((tickAnim - 18) / 4) * (-36.90904-(9.01808)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 77.26414 + (((tickAnim - 22) / 2) * (78.73115-(77.26414)));
            yy = -9.76792 + (((tickAnim - 22) / 2) * (-11.43426-(-9.76792)));
            zz = -36.90904 + (((tickAnim - 22) / 2) * (-44.86997-(-36.90904)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 78.73115 + (((tickAnim - 24) / 3) * (74.89653-(78.73115)));
            yy = -11.43426 + (((tickAnim - 24) / 3) * (-3.1974-(-11.43426)));
            zz = -44.86997 + (((tickAnim - 24) / 3) * (-11.64444-(-44.86997)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 74.89653 + (((tickAnim - 27) / 1) * (75.45297-(74.89653)));
            yy = -3.1974 + (((tickAnim - 27) / 1) * (-6.15847-(-3.1974)));
            zz = -11.64444 + (((tickAnim - 27) / 1) * (-22.44106-(-11.64444)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 75.45297 + (((tickAnim - 28) / 2) * (74.45-(75.45297)));
            yy = -6.15847 + (((tickAnim - 28) / 2) * (-3.82-(-6.15847)));
            zz = -22.44106 + (((tickAnim - 28) / 2) * (-13.48-(-22.44106)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 74.45 + (((tickAnim - 30) / 2) * (74.52801-(74.45)));
            yy = -3.82 + (((tickAnim - 30) / 2) * (2.53979-(-3.82)));
            zz = -13.48 + (((tickAnim - 30) / 2) * (9.01808-(-13.48)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 74.52801 + (((tickAnim - 32) / 2) * (77.26414-(74.52801)));
            yy = 2.53979 + (((tickAnim - 32) / 2) * (-9.76792-(2.53979)));
            zz = 9.01808 + (((tickAnim - 32) / 2) * (-36.90904-(9.01808)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 77.26414 + (((tickAnim - 34) / 3) * (78.73115-(77.26414)));
            yy = -9.76792 + (((tickAnim - 34) / 3) * (-11.43426-(-9.76792)));
            zz = -36.90904 + (((tickAnim - 34) / 3) * (-44.86997-(-36.90904)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 78.73115 + (((tickAnim - 37) / 2) * (74.89653-(78.73115)));
            yy = -11.43426 + (((tickAnim - 37) / 2) * (-3.1974-(-11.43426)));
            zz = -44.86997 + (((tickAnim - 37) / 2) * (-11.64444-(-44.86997)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 74.89653 + (((tickAnim - 39) / 3) * (75.45297-(74.89653)));
            yy = -3.1974 + (((tickAnim - 39) / 3) * (-6.15847-(-3.1974)));
            zz = -11.64444 + (((tickAnim - 39) / 3) * (-22.44106-(-11.64444)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 75.45297 + (((tickAnim - 42) / 1) * (74.45-(75.45297)));
            yy = -6.15847 + (((tickAnim - 42) / 1) * (-3.82-(-6.15847)));
            zz = -22.44106 + (((tickAnim - 42) / 1) * (-13.48-(-22.44106)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 74.45 + (((tickAnim - 43) / 7) * (0-(74.45)));
            yy = -3.82 + (((tickAnim - 43) / 7) * (0-(-3.82)));
            zz = -13.48 + (((tickAnim - 43) / 7) * (0-(-13.48)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.09-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.09 + (((tickAnim - 3) / 3) * (-8.4177-(-7.09)));
            yy = 0 + (((tickAnim - 3) / 3) * (1.02974-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (6.92422-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -8.4177 + (((tickAnim - 6) / 4) * (-35.32853-(-8.4177)));
            yy = 1.02974 + (((tickAnim - 6) / 4) * (7.04252-(1.02974)));
            zz = 6.92422 + (((tickAnim - 6) / 4) * (-3.82801-(6.92422)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -35.32853 + (((tickAnim - 10) / 2) * (-51.32895-(-35.32853)));
            yy = 7.04252 + (((tickAnim - 10) / 2) * (7.0418-(7.04252)));
            zz = -3.82801 + (((tickAnim - 10) / 2) * (-3.82858-(-3.82801)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -51.32895 + (((tickAnim - 12) / 1) * (-35.33-(-51.32895)));
            yy = 7.0418 + (((tickAnim - 12) / 1) * (7.04-(7.0418)));
            zz = -3.82858 + (((tickAnim - 12) / 1) * (-3.83-(-3.82858)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -35.33 + (((tickAnim - 13) / 2) * (-51.32895-(-35.33)));
            yy = 7.04 + (((tickAnim - 13) / 2) * (7.0418-(7.04)));
            zz = -3.83 + (((tickAnim - 13) / 2) * (-3.82858-(-3.83)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -51.32895 + (((tickAnim - 15) / 2) * (-35.33-(-51.32895)));
            yy = 7.0418 + (((tickAnim - 15) / 2) * (7.04-(7.0418)));
            zz = -3.82858 + (((tickAnim - 15) / 2) * (-3.83-(-3.82858)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -35.33 + (((tickAnim - 17) / 1) * (-54.52559-(-35.33)));
            yy = 7.04 + (((tickAnim - 17) / 1) * (1.06908-(7.04)));
            zz = -3.83 + (((tickAnim - 17) / 1) * (-4.42171-(-3.83)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -54.52559 + (((tickAnim - 18) / 3) * (-103.31897-(-54.52559)));
            yy = 1.06908 + (((tickAnim - 18) / 3) * (-7.8873-(1.06908)));
            zz = -4.42171 + (((tickAnim - 18) / 3) * (-5.30927-(-4.42171)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -103.31897 + (((tickAnim - 21) / 2) * (-85.85807-(-103.31897)));
            yy = -7.8873 + (((tickAnim - 21) / 2) * (-0.90571-(-7.8873)));
            zz = -5.30927 + (((tickAnim - 21) / 2) * (-4.80011-(-5.30927)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -85.85807 + (((tickAnim - 23) / 3) * (-46.41005-(-85.85807)));
            yy = -0.90571 + (((tickAnim - 23) / 3) * (2.07393-(-0.90571)));
            zz = -4.80011 + (((tickAnim - 23) / 3) * (-4.43632-(-4.80011)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -46.41005 + (((tickAnim - 26) / 2) * (-27.76202-(-46.41005)));
            yy = 2.07393 + (((tickAnim - 26) / 2) * (5.05357-(2.07393)));
            zz = -4.43632 + (((tickAnim - 26) / 2) * (-4.07253-(-4.43632)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -27.76202 + (((tickAnim - 28) / 2) * (-35.33-(-27.76202)));
            yy = 5.05357 + (((tickAnim - 28) / 2) * (7.04-(5.05357)));
            zz = -4.07253 + (((tickAnim - 28) / 2) * (-3.83-(-4.07253)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -35.33 + (((tickAnim - 30) / 2) * (-54.52559-(-35.33)));
            yy = 7.04 + (((tickAnim - 30) / 2) * (1.06908-(7.04)));
            zz = -3.83 + (((tickAnim - 30) / 2) * (-4.42171-(-3.83)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -54.52559 + (((tickAnim - 32) / 2) * (-103.31897-(-54.52559)));
            yy = 1.06908 + (((tickAnim - 32) / 2) * (-7.8873-(1.06908)));
            zz = -4.42171 + (((tickAnim - 32) / 2) * (-5.30927-(-4.42171)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -103.31897 + (((tickAnim - 34) / 3) * (-85.85807-(-103.31897)));
            yy = -7.8873 + (((tickAnim - 34) / 3) * (-0.90571-(-7.8873)));
            zz = -5.30927 + (((tickAnim - 34) / 3) * (-4.80011-(-5.30927)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -85.85807 + (((tickAnim - 37) / 2) * (-46.41005-(-85.85807)));
            yy = -0.90571 + (((tickAnim - 37) / 2) * (2.07393-(-0.90571)));
            zz = -4.80011 + (((tickAnim - 37) / 2) * (-4.43632-(-4.80011)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -46.41005 + (((tickAnim - 39) / 3) * (-27.76202-(-46.41005)));
            yy = 2.07393 + (((tickAnim - 39) / 3) * (5.05357-(2.07393)));
            zz = -4.43632 + (((tickAnim - 39) / 3) * (-4.07253-(-4.43632)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -27.76202 + (((tickAnim - 42) / 1) * (-35.33-(-27.76202)));
            yy = 5.05357 + (((tickAnim - 42) / 1) * (7.04-(5.05357)));
            zz = -4.07253 + (((tickAnim - 42) / 1) * (-3.83-(-4.07253)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -35.33 + (((tickAnim - 43) / 7) * (0-(-35.33)));
            yy = 7.04 + (((tickAnim - 43) / 7) * (0-(7.04)));
            zz = -3.83 + (((tickAnim - 43) / 7) * (0-(-3.83)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.36-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.36 + (((tickAnim - 3) / 3) * (-40.63-(-5.36)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -40.63 + (((tickAnim - 6) / 4) * (-32.82346-(-40.63)));
            yy = 0 + (((tickAnim - 6) / 4) * (9.40965-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (14.22279-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -32.82346 + (((tickAnim - 10) / 2) * (-17.82247-(-32.82346)));
            yy = 9.40965 + (((tickAnim - 10) / 2) * (9.40975-(9.40965)));
            zz = 14.22279 + (((tickAnim - 10) / 2) * (14.22199-(14.22279)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -17.82247 + (((tickAnim - 12) / 1) * (-32.82-(-17.82247)));
            yy = 9.40975 + (((tickAnim - 12) / 1) * (9.41-(9.40975)));
            zz = 14.22199 + (((tickAnim - 12) / 1) * (14.22-(14.22199)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -32.82 + (((tickAnim - 13) / 2) * (-17.82247-(-32.82)));
            yy = 9.41 + (((tickAnim - 13) / 2) * (9.40975-(9.41)));
            zz = 14.22 + (((tickAnim - 13) / 2) * (14.22199-(14.22)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -17.82247 + (((tickAnim - 15) / 2) * (-32.82-(-17.82247)));
            yy = 9.40975 + (((tickAnim - 15) / 2) * (9.41-(9.40975)));
            zz = 14.22199 + (((tickAnim - 15) / 2) * (14.22-(14.22199)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -32.82 + (((tickAnim - 17) / 1) * (-39.7913-(-32.82)));
            yy = 9.41 + (((tickAnim - 17) / 1) * (1.06958-(9.41)));
            zz = 14.22 + (((tickAnim - 17) / 1) * (-0.29032-(14.22)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -39.7913 + (((tickAnim - 18) / 3) * (14.24086-(-39.7913)));
            yy = 1.06958 + (((tickAnim - 18) / 3) * (7.64033-(1.06958)));
            zz = -0.29032 + (((tickAnim - 18) / 3) * (1.19595-(-0.29032)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 14.24086 + (((tickAnim - 21) / 2) * (1.23759-(14.24086)));
            yy = 7.64033 + (((tickAnim - 21) / 2) * (14.55364-(7.64033)));
            zz = 1.19595 + (((tickAnim - 21) / 2) * (-9.51418-(1.19595)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 1.23759 + (((tickAnim - 23) / 3) * (-35.93887-(1.23759)));
            yy = 14.55364 + (((tickAnim - 23) / 3) * (6.84503-(14.55364)));
            zz = -9.51418 + (((tickAnim - 23) / 3) * (-8.89767-(-9.51418)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -35.93887 + (((tickAnim - 26) / 2) * (-44.06755-(-35.93887)));
            yy = 6.84503 + (((tickAnim - 26) / 2) * (8.38401-(6.84503)));
            zz = -8.89767 + (((tickAnim - 26) / 2) * (4.97293-(-8.89767)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -44.06755 + (((tickAnim - 28) / 2) * (-32.82-(-44.06755)));
            yy = 8.38401 + (((tickAnim - 28) / 2) * (9.41-(8.38401)));
            zz = 4.97293 + (((tickAnim - 28) / 2) * (14.22-(4.97293)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -32.82 + (((tickAnim - 30) / 2) * (-39.7913-(-32.82)));
            yy = 9.41 + (((tickAnim - 30) / 2) * (1.06958-(9.41)));
            zz = 14.22 + (((tickAnim - 30) / 2) * (-0.29032-(14.22)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -39.7913 + (((tickAnim - 32) / 2) * (14.24086-(-39.7913)));
            yy = 1.06958 + (((tickAnim - 32) / 2) * (7.64033-(1.06958)));
            zz = -0.29032 + (((tickAnim - 32) / 2) * (1.19595-(-0.29032)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 14.24086 + (((tickAnim - 34) / 3) * (1.23759-(14.24086)));
            yy = 7.64033 + (((tickAnim - 34) / 3) * (14.55364-(7.64033)));
            zz = 1.19595 + (((tickAnim - 34) / 3) * (-9.51418-(1.19595)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 1.23759 + (((tickAnim - 37) / 2) * (-35.93887-(1.23759)));
            yy = 14.55364 + (((tickAnim - 37) / 2) * (6.84503-(14.55364)));
            zz = -9.51418 + (((tickAnim - 37) / 2) * (-8.89767-(-9.51418)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -35.93887 + (((tickAnim - 39) / 3) * (-44.06755-(-35.93887)));
            yy = 6.84503 + (((tickAnim - 39) / 3) * (8.38401-(6.84503)));
            zz = -8.89767 + (((tickAnim - 39) / 3) * (4.97293-(-8.89767)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -44.06755 + (((tickAnim - 42) / 1) * (-32.82-(-44.06755)));
            yy = 8.38401 + (((tickAnim - 42) / 1) * (9.41-(8.38401)));
            zz = 4.97293 + (((tickAnim - 42) / 1) * (14.22-(4.97293)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -32.82 + (((tickAnim - 43) / 7) * (0-(-32.82)));
            yy = 9.41 + (((tickAnim - 43) / 7) * (0-(9.41)));
            zz = 14.22 + (((tickAnim - 43) / 7) * (0-(14.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (39.91-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 39.91 + (((tickAnim - 3) / 3) * (62.52-(39.91)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 62.52 + (((tickAnim - 6) / 4) * (74.45195-(62.52)));
            yy = 0 + (((tickAnim - 6) / 4) * (3.82348-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (13.47782-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 74.45195 + (((tickAnim - 10) / 2) * (73.99969-(74.45195)));
            yy = 3.82348 + (((tickAnim - 10) / 2) * (-0.0011-(3.82348)));
            zz = 13.47782 + (((tickAnim - 10) / 2) * (0.00066-(13.47782)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 73.99969 + (((tickAnim - 12) / 1) * (74.45-(73.99969)));
            yy = -0.0011 + (((tickAnim - 12) / 1) * (3.82-(-0.0011)));
            zz = 0.00066 + (((tickAnim - 12) / 1) * (13.48-(0.00066)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 74.45 + (((tickAnim - 13) / 2) * (73.99969-(74.45)));
            yy = 3.82 + (((tickAnim - 13) / 2) * (-0.0011-(3.82)));
            zz = 13.48 + (((tickAnim - 13) / 2) * (0.00066-(13.48)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 73.99969 + (((tickAnim - 15) / 2) * (74.45-(73.99969)));
            yy = -0.0011 + (((tickAnim - 15) / 2) * (3.82-(-0.0011)));
            zz = 0.00066 + (((tickAnim - 15) / 2) * (13.48-(0.00066)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 74.45 + (((tickAnim - 17) / 1) * (74.52801-(74.45)));
            yy = 3.82 + (((tickAnim - 17) / 1) * (-2.53979-(3.82)));
            zz = 13.48 + (((tickAnim - 17) / 1) * (-9.01808-(13.48)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 74.52801 + (((tickAnim - 18) / 3) * (77.26414-(74.52801)));
            yy = -2.53979 + (((tickAnim - 18) / 3) * (9.76792-(-2.53979)));
            zz = -9.01808 + (((tickAnim - 18) / 3) * (36.90904-(-9.01808)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 77.26414 + (((tickAnim - 21) / 2) * (78.73115-(77.26414)));
            yy = 9.76792 + (((tickAnim - 21) / 2) * (11.43426-(9.76792)));
            zz = 36.90904 + (((tickAnim - 21) / 2) * (44.86997-(36.90904)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 78.73115 + (((tickAnim - 23) / 3) * (74.89653-(78.73115)));
            yy = 11.43426 + (((tickAnim - 23) / 3) * (3.1974-(11.43426)));
            zz = 44.86997 + (((tickAnim - 23) / 3) * (11.64444-(44.86997)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 74.89653 + (((tickAnim - 26) / 2) * (75.45297-(74.89653)));
            yy = 3.1974 + (((tickAnim - 26) / 2) * (6.15847-(3.1974)));
            zz = 11.64444 + (((tickAnim - 26) / 2) * (22.44106-(11.64444)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 75.45297 + (((tickAnim - 28) / 2) * (74.45-(75.45297)));
            yy = 6.15847 + (((tickAnim - 28) / 2) * (3.82-(6.15847)));
            zz = 22.44106 + (((tickAnim - 28) / 2) * (13.48-(22.44106)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 74.45 + (((tickAnim - 30) / 2) * (74.52801-(74.45)));
            yy = 3.82 + (((tickAnim - 30) / 2) * (-2.53979-(3.82)));
            zz = 13.48 + (((tickAnim - 30) / 2) * (-9.01808-(13.48)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 74.52801 + (((tickAnim - 32) / 2) * (77.26414-(74.52801)));
            yy = -2.53979 + (((tickAnim - 32) / 2) * (9.76792-(-2.53979)));
            zz = -9.01808 + (((tickAnim - 32) / 2) * (36.90904-(-9.01808)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 77.26414 + (((tickAnim - 34) / 3) * (78.73115-(77.26414)));
            yy = 9.76792 + (((tickAnim - 34) / 3) * (11.43426-(9.76792)));
            zz = 36.90904 + (((tickAnim - 34) / 3) * (44.86997-(36.90904)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 78.73115 + (((tickAnim - 37) / 2) * (74.89653-(78.73115)));
            yy = 11.43426 + (((tickAnim - 37) / 2) * (3.1974-(11.43426)));
            zz = 44.86997 + (((tickAnim - 37) / 2) * (11.64444-(44.86997)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 74.89653 + (((tickAnim - 39) / 3) * (75.45297-(74.89653)));
            yy = 3.1974 + (((tickAnim - 39) / 3) * (6.15847-(3.1974)));
            zz = 11.64444 + (((tickAnim - 39) / 3) * (22.44106-(11.64444)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 75.45297 + (((tickAnim - 42) / 1) * (74.45-(75.45297)));
            yy = 6.15847 + (((tickAnim - 42) / 1) * (3.82-(6.15847)));
            zz = 22.44106 + (((tickAnim - 42) / 1) * (13.48-(22.44106)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 74.45 + (((tickAnim - 43) / 7) * (0-(74.45)));
            yy = 3.82 + (((tickAnim - 43) / 7) * (0-(3.82)));
            zz = 13.48 + (((tickAnim - 43) / 7) * (0-(13.48)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = 27 + (((tickAnim - 4) / 42) * (27-(27)));
            yy = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 27 + (((tickAnim - 46) / 4) * (0-(27)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = -12 + (((tickAnim - 4) / 42) * (-12-(-12)));
            yy = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 46) / 4) * (0-(-12)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = 27 + (((tickAnim - 4) / 42) * (27-(27)));
            yy = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 27 + (((tickAnim - 46) / 4) * (0-(27)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = -12 + (((tickAnim - 4) / 42) * (-12-(-12)));
            yy = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 46) / 4) * (0-(-12)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (5.6-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 5.6 + (((tickAnim - 2) / 2) * (19-(5.6)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = 19 + (((tickAnim - 4) / 42) * (19-(19)));
            yy = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 46) / 4) * (0-(19)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (9.8-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 9.8 + (((tickAnim - 2) / 2) * (17-(9.8)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = 17 + (((tickAnim - 4) / 42) * (17-(17)));
            yy = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 17 + (((tickAnim - 46) / 2) * (9.2-(17)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 9.2 + (((tickAnim - 48) / 2) * (0-(9.2)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-4.6-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -4.6 + (((tickAnim - 2) / 2) * (-14-(-4.6)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 46) {
            xx = -14 + (((tickAnim - 4) / 42) * (-14-(-14)));
            yy = 0 + (((tickAnim - 4) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 42) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -14 + (((tickAnim - 46) / 2) * (-4.4-(-14)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -4.4 + (((tickAnim - 48) / 2) * (0-(-4.4)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSasayamamylos entity = (EntityPrehistoricFloraSasayamamylos) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (21.80607-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.98848-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (7.42422-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21.80607 + (((tickAnim - 3) / 2) * (17.49841-(21.80607)));
            yy = -2.98848 + (((tickAnim - 3) / 2) * (-4.28732-(-2.98848)));
            zz = 7.42422 + (((tickAnim - 3) / 2) * (13.33988-(7.42422)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.49841 + (((tickAnim - 5) / 3) * (1-(17.49841)));
            yy = -4.28732 + (((tickAnim - 5) / 3) * (0-(-4.28732)));
            zz = 13.33988 + (((tickAnim - 5) / 3) * (0-(13.33988)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (0-(1)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22 + (((tickAnim - 3) / 2) * (-30-(-22)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 5) / 3) * (-2-(-30)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2 + (((tickAnim - 8) / 2) * (0-(-2)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (54-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 54 + (((tickAnim - 5) / 5) * (0-(54)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSasayamamylos entity = (EntityPrehistoricFloraSasayamamylos) entitylivingbaseIn;
        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7 + (((tickAnim - 0) / 3) * (14-(-7)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 14 + (((tickAnim - 3) / 0) * (27.5-(14)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (-7-(27.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 3) * (1.7-(1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.7 + (((tickAnim - 3) / 0) * (1.15-(1.7)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 3) / 2) * (1-(1.15)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 8 + (((tickAnim - 0) / 1) * (-5.5-(8)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -5.5 + (((tickAnim - 1) / 2) * (-11-(-5.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -11 + (((tickAnim - 3) / 0) * (-12.5-(-11)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.5 + (((tickAnim - 3) / 2) * (8-(-12.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17 + (((tickAnim - 0) / 1) * (19-(17)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 19 + (((tickAnim - 1) / 2) * (5-(19)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 3) / 0) * (5-(5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 3) / 2) * (17-(5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 13 + (((tickAnim - 0) / 1) * (12-(13)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 12 + (((tickAnim - 1) / 2) * (13-(12)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 13 + (((tickAnim - 3) / 0) * (-13-(13)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13 + (((tickAnim - 3) / 2) * (13-(-13)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -27.5 + (((tickAnim - 0) / 2) * (-26.5-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -26.5 + (((tickAnim - 2) / 1) * (-11.5-(-26.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -11.5 + (((tickAnim - 3) / 2) * (-27.5-(-11.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.51411 + (((tickAnim - 0) / 1) * (2.75706-(27.51411)));
            yy = -9.54456 + (((tickAnim - 0) / 1) * (-4.77228-(-9.54456)));
            zz = 17.65812 + (((tickAnim - 0) / 1) * (8.82906-(17.65812)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 2.75706 + (((tickAnim - 1) / 2) * (-48-(2.75706)));
            yy = -4.77228 + (((tickAnim - 1) / 2) * (0-(-4.77228)));
            zz = 8.82906 + (((tickAnim - 1) / 2) * (0-(8.82906)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -48 + (((tickAnim - 3) / 0) * (-46.24294-(-48)));
            yy = 0 + (((tickAnim - 3) / 0) * (-4.77228-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (8.82906-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -46.24294 + (((tickAnim - 3) / 2) * (27.51411-(-46.24294)));
            yy = -4.77228 + (((tickAnim - 3) / 2) * (-9.54456-(-4.77228)));
            zz = 8.82906 + (((tickAnim - 3) / 2) * (17.65812-(8.82906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -49 + (((tickAnim - 0) / 1) * (-53-(-49)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -53 + (((tickAnim - 1) / 2) * (15-(-53)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 3) / 0) * (27-(15)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27 + (((tickAnim - 3) / 2) * (-49-(27)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 164 + (((tickAnim - 0) / 1) * (157.5-(164)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 157.5 + (((tickAnim - 1) / 2) * (23-(157.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 23 + (((tickAnim - 3) / 0) * (-0.5-(23)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 3) / 2) * (164-(-0.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.51411 + (((tickAnim - 0) / 1) * (2.75706-(27.51411)));
            yy = 9.54456 + (((tickAnim - 0) / 1) * (4.77228-(9.54456)));
            zz = -17.65812 + (((tickAnim - 0) / 1) * (-8.82906-(-17.65812)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 2.75706 + (((tickAnim - 1) / 2) * (-48-(2.75706)));
            yy = 4.77228 + (((tickAnim - 1) / 2) * (0-(4.77228)));
            zz = -8.82906 + (((tickAnim - 1) / 2) * (0-(-8.82906)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -48 + (((tickAnim - 3) / 0) * (-46.24294-(-48)));
            yy = 0 + (((tickAnim - 3) / 0) * (4.77228-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-8.82906-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -46.24294 + (((tickAnim - 3) / 2) * (27.51411-(-46.24294)));
            yy = 4.77228 + (((tickAnim - 3) / 2) * (9.54456-(4.77228)));
            zz = -8.82906 + (((tickAnim - 3) / 2) * (-17.65812-(-8.82906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -49 + (((tickAnim - 0) / 1) * (-53-(-49)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -53 + (((tickAnim - 1) / 2) * (15-(-53)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 3) / 0) * (27-(15)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27 + (((tickAnim - 3) / 2) * (-49-(27)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 164 + (((tickAnim - 0) / 1) * (157.5-(164)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 157.5 + (((tickAnim - 1) / 2) * (23-(157.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 23 + (((tickAnim - 3) / 0) * (-0.5-(23)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 3) / 2) * (164-(-0.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6 + (((tickAnim - 0) / 1) * (10-(6)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 1) / 1) * (49.5-(10)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 49.5 + (((tickAnim - 2) / 1) * (57-(49.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 57 + (((tickAnim - 3) / 0) * (20.5-(57)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20.5 + (((tickAnim - 3) / 2) * (6-(20.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -25 + (((tickAnim - 0) / 1) * (-34-(-25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -34 + (((tickAnim - 1) / 1) * (-20-(-34)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 2) / 1) * (-10-(-20)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 3) / 0) * (-22.5-(-10)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-25-(-22.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 26 + (((tickAnim - 0) / 1) * (24-(26)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 24 + (((tickAnim - 1) / 1) * (2-(24)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 2) / 1) * (74-(2)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 74 + (((tickAnim - 3) / 0) * (-15-(74)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (26-(-15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6 + (((tickAnim - 0) / 1) * (10-(6)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 1) / 1) * (49.5-(10)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 49.5 + (((tickAnim - 2) / 1) * (57-(49.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 57 + (((tickAnim - 3) / 0) * (20.5-(57)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20.5 + (((tickAnim - 3) / 2) * (6-(20.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -25 + (((tickAnim - 0) / 1) * (-34-(-25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -34 + (((tickAnim - 1) / 1) * (-20-(-34)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 2) / 1) * (-10-(-20)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 3) / 0) * (-22.5-(-10)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-25-(-22.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 26 + (((tickAnim - 0) / 1) * (24-(26)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 24 + (((tickAnim - 1) / 1) * (2-(24)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 2) / 1) * (74-(2)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 74 + (((tickAnim - 3) / 0) * (-15-(74)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (26-(-15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25))*10), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-30))*12), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-16-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-60))*15), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSasayamamylos entity = (EntityPrehistoricFloraSasayamamylos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.25 + (((tickAnim - 5) / 5) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.25 + (((tickAnim - 15) / 5) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.37-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.37 + (((tickAnim - 3) / 2) * (0.44-(0.37)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.44 + (((tickAnim - 5) / 5) * (0-(0.44)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.37-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.37 + (((tickAnim - 13) / 2) * (0.44-(0.37)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.44 + (((tickAnim - 15) / 5) * (0-(0.44)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (4.76-(1)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.76 + (((tickAnim - 3) / 2) * (8.33-(4.76)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.33 + (((tickAnim - 5) / 3) * (3.67-(8.33)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.67 + (((tickAnim - 8) / 2) * (1-(3.67)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (4.76-(1)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 4.76 + (((tickAnim - 13) / 2) * (8.33-(4.76)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 8.33 + (((tickAnim - 15) / 3) * (3.67-(8.33)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 3.67 + (((tickAnim - 18) / 2) * (1-(3.67)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11 + (((tickAnim - 0) / 3) * (12.28-(11)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.28 + (((tickAnim - 3) / 2) * (10.75-(12.28)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.75 + (((tickAnim - 5) / 5) * (11-(10.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11 + (((tickAnim - 10) / 3) * (12.28-(11)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.28 + (((tickAnim - 13) / 2) * (10.75-(12.28)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 15) / 5) * (11-(10.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 0) / 5) * (-5-(3)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (3-(-5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 3 + (((tickAnim - 10) / 5) * (-5-(3)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 15) / 5) * (3-(-5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11 + (((tickAnim - 0) / 3) * (-15.5-(-11)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.5 + (((tickAnim - 3) / 2) * (-12-(-15.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -12 + (((tickAnim - 5) / 3) * (-8.5-(-12)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.5 + (((tickAnim - 8) / 2) * (-11-(-8.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 10) / 3) * (-15.5-(-11)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15.5 + (((tickAnim - 13) / 2) * (-12-(-15.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -12 + (((tickAnim - 15) / 3) * (-8.5-(-12)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -8.5 + (((tickAnim - 18) / 2) * (-11-(-8.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -50 + (((tickAnim - 0) / 3) * (-38.67-(-50)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -38.67 + (((tickAnim - 3) / 2) * (-36-(-38.67)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -36 + (((tickAnim - 5) / 5) * (-18-(-36)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18 + (((tickAnim - 10) / 3) * (5.34-(-18)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.34 + (((tickAnim - 13) / 2) * (-17.33-(5.34)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -17.33 + (((tickAnim - 15) / 3) * (-52.66-(-17.33)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -52.66 + (((tickAnim - 18) / 2) * (-50-(-52.66)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27 + (((tickAnim - 0) / 3) * (29-(27)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 29 + (((tickAnim - 3) / 2) * (31.5-(29)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.5 + (((tickAnim - 5) / 5) * (24-(31.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 24 + (((tickAnim - 10) / 3) * (-46.05-(24)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -46.05 + (((tickAnim - 13) / 1) * (-67.75-(-46.05)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -67.75 + (((tickAnim - 14) / 2) * (-51.68-(-67.75)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -51.68 + (((tickAnim - 16) / 2) * (4.39-(-51.68)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 4.39 + (((tickAnim - 18) / 2) * (27-(4.39)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13 + (((tickAnim - 0) / 5) * (-9-(13)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -9 + (((tickAnim - 5) / 5) * (-23-(-9)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -23 + (((tickAnim - 10) / 3) * (72.2-(-23)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 72.2 + (((tickAnim - 13) / 1) * (124-(72.2)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 124 + (((tickAnim - 14) / 2) * (91.79-(124)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 91.79 + (((tickAnim - 16) / 2) * (33.57-(91.79)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 33.57 + (((tickAnim - 18) / 2) * (13-(33.57)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.02275 + (((tickAnim - 0) / 3) * (-8.78829-(20.02275)));
            yy = 4.97254 + (((tickAnim - 0) / 3) * (4.63279-(4.97254)));
            zz = 0.52396 + (((tickAnim - 0) / 3) * (0.29172-(0.52396)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.78829 + (((tickAnim - 3) / 1) * (-10.55209-(-8.78829)));
            yy = 4.63279 + (((tickAnim - 3) / 1) * (4.20811-(4.63279)));
            zz = 0.29172 + (((tickAnim - 3) / 1) * (0.00141-(0.29172)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -10.55209 + (((tickAnim - 4) / 2) * (-14.31588-(-10.55209)));
            yy = 4.20811 + (((tickAnim - 4) / 2) * (3.78342-(4.20811)));
            zz = 0.00141 + (((tickAnim - 4) / 2) * (-0.28889-(0.00141)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -14.31588 + (((tickAnim - 6) / 2) * (-9.78407-(-14.31588)));
            yy = 3.78342 + (((tickAnim - 6) / 2) * (3.44367-(3.78342)));
            zz = -0.28889 + (((tickAnim - 6) / 2) * (-0.52113-(-0.28889)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.78407 + (((tickAnim - 8) / 2) * (-7.98634-(-9.78407)));
            yy = 3.44367 + (((tickAnim - 8) / 2) * (2.93405-(3.44367)));
            zz = -0.52113 + (((tickAnim - 8) / 2) * (-0.8695-(-0.52113)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.98634 + (((tickAnim - 10) / 5) * (6.01821-(-7.98634)));
            yy = 2.93405 + (((tickAnim - 10) / 5) * (3.95329-(2.93405)));
            zz = -0.8695 + (((tickAnim - 10) / 5) * (-0.17277-(-0.8695)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.01821 + (((tickAnim - 15) / 5) * (20.02275-(6.01821)));
            yy = 3.95329 + (((tickAnim - 15) / 5) * (4.97254-(3.95329)));
            zz = -0.17277 + (((tickAnim - 15) / 5) * (0.52396-(-0.17277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23 + (((tickAnim - 0) / 3) * (26.69-(23)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 26.69 + (((tickAnim - 3) / 1) * (5.43-(26.69)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 5.43 + (((tickAnim - 4) / 2) * (6.17-(5.43)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.17 + (((tickAnim - 6) / 2) * (-6.7-(6.17)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -6.7 + (((tickAnim - 8) / 2) * (-11-(-6.7)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11 + (((tickAnim - 10) / 5) * (-6-(-11)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6 + (((tickAnim - 15) / 5) * (23-(-6)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.89227 + (((tickAnim - 0) / 3) * (16.53084-(-18.89227)));
            yy = -0.32451 + (((tickAnim - 0) / 3) * (-0.48794-(-0.32451)));
            zz = -1.95025 + (((tickAnim - 0) / 3) * (-1.56693-(-1.95025)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 16.53084 + (((tickAnim - 3) / 1) * (20.05974-(16.53084)));
            yy = -0.48794 + (((tickAnim - 3) / 1) * (-0.69224-(-0.48794)));
            zz = -1.56693 + (((tickAnim - 3) / 1) * (-1.08778-(-1.56693)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 20.05974 + (((tickAnim - 4) / 2) * (3.58864-(20.05974)));
            yy = -0.69224 + (((tickAnim - 4) / 2) * (-0.89654-(-0.69224)));
            zz = -1.08778 + (((tickAnim - 4) / 2) * (-0.60864-(-1.08778)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 3.58864 + (((tickAnim - 6) / 2) * (5.38319-(3.58864)));
            yy = -0.89654 + (((tickAnim - 6) / 2) * (-1.05998-(-0.89654)));
            zz = -0.60864 + (((tickAnim - 6) / 2) * (-0.22532-(-0.60864)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.38319 + (((tickAnim - 8) / 2) * (23.07501-(5.38319)));
            yy = -1.05998 + (((tickAnim - 8) / 2) * (-1.30513-(-1.05998)));
            zz = -0.22532 + (((tickAnim - 8) / 2) * (0.34966-(-0.22532)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 23.07501 + (((tickAnim - 10) / 5) * (7.09137-(23.07501)));
            yy = -1.30513 + (((tickAnim - 10) / 5) * (-0.81482-(-1.30513)));
            zz = 0.34966 + (((tickAnim - 10) / 5) * (-0.8003-(0.34966)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.09137 + (((tickAnim - 15) / 5) * (-18.89227-(7.09137)));
            yy = -0.81482 + (((tickAnim - 15) / 5) * (-0.32451-(-0.81482)));
            zz = -0.8003 + (((tickAnim - 15) / 5) * (-1.95025-(-0.8003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18 + (((tickAnim - 0) / 3) * (5.34-(-18)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.34 + (((tickAnim - 3) / 2) * (-17.33-(5.34)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -17.33 + (((tickAnim - 5) / 3) * (-52.66-(-17.33)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -52.66 + (((tickAnim - 8) / 2) * (-50-(-52.66)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -50 + (((tickAnim - 10) / 3) * (-38.67-(-50)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -38.67 + (((tickAnim - 13) / 2) * (-36-(-38.67)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36 + (((tickAnim - 15) / 5) * (-18-(-36)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24 + (((tickAnim - 0) / 3) * (-46.05-(24)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -46.05 + (((tickAnim - 3) / 1) * (-67.75-(-46.05)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -67.75 + (((tickAnim - 4) / 2) * (-51.68-(-67.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -51.68 + (((tickAnim - 6) / 2) * (4.39-(-51.68)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.39 + (((tickAnim - 8) / 2) * (27-(4.39)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 27 + (((tickAnim - 10) / 3) * (29-(27)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 29 + (((tickAnim - 13) / 2) * (31.5-(29)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 31.5 + (((tickAnim - 15) / 5) * (24-(31.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -23 + (((tickAnim - 0) / 3) * (72.2-(-23)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 72.2 + (((tickAnim - 3) / 1) * (124-(72.2)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 124 + (((tickAnim - 4) / 2) * (91.79-(124)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 91.79 + (((tickAnim - 6) / 2) * (33.57-(91.79)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33.57 + (((tickAnim - 8) / 2) * (13-(33.57)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 13 + (((tickAnim - 10) / 5) * (-9-(13)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 15) / 5) * (-23-(-9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -7.98634 + (((tickAnim - 0) / 10) * (20.02275-(-7.98634)));
            yy = -2.93405 + (((tickAnim - 0) / 10) * (-4.97254-(-2.93405)));
            zz = 0.8695 + (((tickAnim - 0) / 10) * (-0.52396-(0.8695)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20.02275 + (((tickAnim - 10) / 10) * (-7.98634-(20.02275)));
            yy = -4.97254 + (((tickAnim - 10) / 10) * (-2.93405-(-4.97254)));
            zz = -0.52396 + (((tickAnim - 10) / 10) * (0.8695-(-0.52396)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -11 + (((tickAnim - 0) / 5) * (-6-(-11)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6 + (((tickAnim - 5) / 5) * (23-(-6)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 23 + (((tickAnim - 10) / 3) * (26.69-(23)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 26.69 + (((tickAnim - 13) / 1) * (5.43-(26.69)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 5.43 + (((tickAnim - 14) / 2) * (6.17-(5.43)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 6.17 + (((tickAnim - 16) / 2) * (-6.7-(6.17)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.7 + (((tickAnim - 18) / 2) * (-11-(-6.7)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 23.07501 + (((tickAnim - 0) / 5) * (7.09137-(23.07501)));
            yy = 1.30513 + (((tickAnim - 0) / 5) * (0.81482-(1.30513)));
            zz = -0.34966 + (((tickAnim - 0) / 5) * (0.8003-(-0.34966)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.09137 + (((tickAnim - 5) / 5) * (-18.89227-(7.09137)));
            yy = 0.81482 + (((tickAnim - 5) / 5) * (0.32451-(0.81482)));
            zz = 0.8003 + (((tickAnim - 5) / 5) * (1.95025-(0.8003)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18.89227 + (((tickAnim - 10) / 3) * (16.53084-(-18.89227)));
            yy = 0.32451 + (((tickAnim - 10) / 3) * (0.48794-(0.32451)));
            zz = 1.95025 + (((tickAnim - 10) / 3) * (1.56693-(1.95025)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 16.53084 + (((tickAnim - 13) / 1) * (20.05974-(16.53084)));
            yy = 0.48794 + (((tickAnim - 13) / 1) * (0.69224-(0.48794)));
            zz = 1.56693 + (((tickAnim - 13) / 1) * (1.08778-(1.56693)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 20.05974 + (((tickAnim - 14) / 2) * (3.58864-(20.05974)));
            yy = 0.69224 + (((tickAnim - 14) / 2) * (0.89654-(0.69224)));
            zz = 1.08778 + (((tickAnim - 14) / 2) * (0.60864-(1.08778)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 3.58864 + (((tickAnim - 16) / 2) * (5.38319-(3.58864)));
            yy = 0.89654 + (((tickAnim - 16) / 2) * (1.05998-(0.89654)));
            zz = 0.60864 + (((tickAnim - 16) / 2) * (0.22532-(0.60864)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5.38319 + (((tickAnim - 18) / 2) * (23.07501-(5.38319)));
            yy = 1.05998 + (((tickAnim - 18) / 2) * (1.30513-(1.05998)));
            zz = 0.22532 + (((tickAnim - 18) / 2) * (-0.34966-(0.22532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2 + (((tickAnim - 0) / 3) * (7-(-2)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7 + (((tickAnim - 3) / 2) * (8-(7)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8 + (((tickAnim - 5) / 3) * (0-(8)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-2-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 10) / 3) * (7-(-2)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7 + (((tickAnim - 13) / 2) * (8-(7)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 8 + (((tickAnim - 15) / 3) * (0-(8)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-2-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (-2-(1)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2 + (((tickAnim - 3) / 2) * (1-(-2)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 5) / 3) * (7-(1)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7 + (((tickAnim - 8) / 2) * (1-(7)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (-2-(1)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2 + (((tickAnim - 13) / 2) * (1-(-2)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (7-(1)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 18) / 2) * (1-(7)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4 + (((tickAnim - 0) / 3) * (-13.5-(4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.5 + (((tickAnim - 3) / 2) * (-3-(-13.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (1.5-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 8) / 2) * (4-(1.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 10) / 3) * (-13.5-(4)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -13.5 + (((tickAnim - 13) / 2) * (-3-(-13.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3 + (((tickAnim - 15) / 3) * (1.5-(-3)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 18) / 2) * (4-(1.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSasayamamylos e = (EntityPrehistoricFloraSasayamamylos) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
