package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMontsecosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMontsecosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer throat;

    private ModelAnimator animator;

    public ModelMontsecosuchus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 18.85F, 0.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.7F, 3.3F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 33, -1.0F, -1.0F, -4.0F, 2, 1, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 0.95F, 3.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, 0.0F, -1.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7F, 3.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.336F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 10, -1.5F, -0.6F, -0.5F, 3, 3, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 27, -1.0F, -0.85F, -0.5F, 2, 1, 6, -0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.05F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 19, -1.0F, -0.5F, -0.5F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 5.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 8, -0.5F, -0.5F, -0.25F, 1, 1, 7, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.825F, 1.2F, 2.25F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.6452F, -1.0174F, -0.755F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 28, 36, -2.5F, -1.0F, -1.0F, 3, 2, 2, 0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.5F, -1.0F, 0.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -1.309F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 34, 14, -4.0F, 0.0F, -0.25F, 4, 1, 1, 0.01F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 36, 6, -4.0F, 0.0F, -0.75F, 4, 1, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-3.975F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0268F, 0.0095F, 1.6798F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 32, 23, -3.25F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.825F, 1.2F, 2.25F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.6452F, 1.0174F, 0.755F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 28, 36, -0.5F, -1.0F, -1.0F, 3, 2, 2, 0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.5F, -1.0F, 0.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 1.309F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 34, 14, 0.0F, 0.0F, -0.25F, 4, 1, 1, 0.01F, true));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 36, 6, 0.0F, 0.0F, -0.75F, 4, 1, 1, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(3.975F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0268F, -0.0095F, -1.6798F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 32, 23, -0.75F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, -0.55F);
        this.main.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -0.2F, -6.0F, 3, 4, 6, 0.02F, false));
        this.body2.cubeList.add(new ModelBox(body2, 18, 16, -2.25F, -0.2F, -6.0F, 1, 4, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 18, 16, 1.25F, -0.2F, -6.0F, 1, 4, 6, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 18, 16, 1.25F, -0.2F, -6.0F, 1, 4, 6, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 16, 26, -1.0F, -0.375F, -6.0F, 2, 1, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1038F, -5.8372F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 32, 16, -1.5F, -0.175F, -3.75F, 3, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.675F, -1.75F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0218F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 31, 0.0F, -1.0F, -2.0F, 2, 1, 4, -0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.0F, 1.575F, -2.5F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0F, 0.3491F, -0.8727F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 18, 38, -2.85F, -0.5F, -0.75F, 3, 1, 1, 0.01F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 38, 36, -2.85F, -0.5F, -0.25F, 3, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.75F, 0.0F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0F, -0.48F, -0.7156F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 36, 41, -1.85F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.85F, 0.0F, -0.25F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.1309F, -0.0349F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 40, 0.0F, -1.5F, -1.5F, 0, 3, 2, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.0F, 1.575F, -2.5F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.3491F, 0.8727F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 18, 38, -0.15F, -0.5F, -0.75F, 3, 1, 1, 0.01F, true));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 38, 36, -0.15F, -0.5F, -0.25F, 3, 1, 1, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.75F, 0.0F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0F, 0.48F, 0.7156F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 36, 41, -0.15F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.85F, 0.0F, -0.25F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.1309F, 0.0349F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 40, 0.0F, -1.5F, -1.5F, 0, 3, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.15F, -3.575F);
        this.body3.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 34, -0.5F, -0.225F, -3.825F, 1, 2, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 34, 8, -0.5F, -0.325F, -3.825F, 1, 1, 4, 0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 36, 0, -1.4F, -0.225F, -3.825F, 1, 2, 4, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 36, 0, 0.4F, -0.225F, -3.825F, 1, 2, 4, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 1.775F, -3.825F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1484F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 26, -0.5F, -1.0F, 0.0F, 2, 1, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0712F, -3.4378F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 24, 40, -1.0F, 0.0F, -1.25F, 2, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 40, -1.0F, -0.35F, -1.125F, 2, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 4, 40, -0.5F, 0.0F, -3.275F, 1, 1, 2, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.25F, -3.225F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3622F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 40, -1.0F, -0.25F, -0.05F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.25F, -3.225F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3622F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 40, 0.0F, -0.25F, -0.05F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.35F, -1.125F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 33, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.25F, 0.25F, -1.275F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0873F, -0.3927F, 0.3054F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 24, 42, -0.75F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.25F, 0.25F, -1.275F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0873F, 0.3927F, -0.3054F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 24, 42, -0.25F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-1.525F, 1.0F, -1.4F);
        this.head.addChild(bone);
        this.setRotateAngle(bone, 0.1047F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.025F, -0.75F, -1.675F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 42, 0.0F, -0.25F, 1.7F, 1, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.75F, 0.8F);
        this.bone.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0698F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 43, 0.0F, -0.25F, 0.0F, 1, 1, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(1.525F, 1.0F, -1.4F);
        this.head.addChild(bone2);
        this.setRotateAngle(bone2, 0.1047F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.025F, -0.75F, -1.675F);
        this.bone2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 42, -1.0F, -0.25F, 1.7F, 1, 1, 1, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.75F, 0.8F);
        this.bone2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0698F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 43, -1.0F, -0.25F, 0.0F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.75F, 0.7F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 38, -0.5F, -0.25F, -3.925F, 1, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 41, -1.0F, -0.25F, -1.95F, 2, 1, 1, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.475F, 0.0F, -3.875F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3622F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 34, -1.0F, -0.25F, -0.05F, 1, 1, 2, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.475F, -0.025F, -3.775F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 42, -1.0F, -0.25F, 1.7F, 1, 1, 1, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, -0.025F, -1.3F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.1134F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 41, -1.0F, -0.25F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, -0.025F, -1.3F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.1134F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 41, 0.0F, -0.25F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.475F, 0.0F, -3.875F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.3622F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 34, 0.0F, -0.25F, -0.05F, 1, 1, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.475F, -0.025F, -3.775F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 42, 0.0F, -0.25F, 1.7F, 1, 1, 1, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.75F, -2.3F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.1527F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 10, 38, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.0F;
        this.main.offsetX = -0.038F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(18);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.33F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraMontsecosuchus proteros = (EntityPrehistoricFloraMontsecosuchus) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eyeright.setScale(1,1,1);
        this.eyeleft.setScale(1,1,1);
        EntityPrehistoricFloraMontsecosuchus ee = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()) {
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.BASK_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }  else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.YAWN_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (19.94-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 19.94 + (((tickAnim - 4) / 4) * (8.25-(19.94)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 8.25 + (((tickAnim - 8) / 7) * (0-(8.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-7.75-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 21.5 + (((tickAnim - 4) / 4) * (23.5-(21.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -7.75 + (((tickAnim - 4) / 4) * (0-(-7.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 23.5 + (((tickAnim - 8) / 7) * (0-(23.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 2) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 7) * (0-(0.175)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 3) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 3) / 3) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 6) / 2) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 6) / 2) * (0.0125-(0.0125)));
            zz = 1 + (((tickAnim - 6) / 2) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 8) / 7) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 8) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (31.25-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 31.25 + (((tickAnim - 6) / 2) * (0-(31.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 2) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 7) * (0-(0.175)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 3) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 3) / 3) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 6) / 2) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 6) / 2) * (0.0125-(0.0125)));
            zz = 1 + (((tickAnim - 6) / 2) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 8) / 7) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 8) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.5 + (((tickAnim - 3) / 4) * (-8.75-(12.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.75 + (((tickAnim - 7) / 3) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.5 + (((tickAnim - 3) / 2) * (-22.4-(-18.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -22.4 + (((tickAnim - 5) / 2) * (0-(-22.4)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0.475 + (((tickAnim - 3) / 7) * (0-(0.475)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21 + (((tickAnim - 3) / 2) * (42.25-(21)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 42.25 + (((tickAnim - 5) / 2) * (0-(42.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 10) {
            xx = -0.55 + (((tickAnim - 1) / 9) * (0-(-0.55)));
            yy = 0 + (((tickAnim - 1) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (43.72235-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-74.19995-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-8.38797-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 43.72235 + (((tickAnim - 23) / 8) * (16.27635-(43.72235)));
            yy = -74.19995 + (((tickAnim - 23) / 8) * (-60.30034-(-74.19995)));
            zz = -8.38797 + (((tickAnim - 23) / 8) * (-34.88082-(-8.38797)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 16.27635 + (((tickAnim - 31) / 7) * (-5.28116-(16.27635)));
            yy = -60.30034 + (((tickAnim - 31) / 7) * (-22.74678-(-60.30034)));
            zz = -34.88082 + (((tickAnim - 31) / 7) * (-24.01179-(-34.88082)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -5.28116 + (((tickAnim - 38) / 12) * (0-(-5.28116)));
            yy = -22.74678 + (((tickAnim - 38) / 12) * (0-(-22.74678)));
            zz = -24.01179 + (((tickAnim - 38) / 12) * (0-(-24.01179)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-6.25-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-7.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (1.58828-(0)));
            yy = -6.25 + (((tickAnim - 23) / 15) * (10.2678-(-6.25)));
            zz = -7.5 + (((tickAnim - 23) / 15) * (-35.44864-(-7.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.58828 + (((tickAnim - 38) / 12) * (0-(1.58828)));
            yy = 10.2678 + (((tickAnim - 38) / 12) * (0-(10.2678)));
            zz = -35.44864 + (((tickAnim - 38) / 12) * (0-(-35.44864)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-14.87907-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.69931-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-11.18588-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -14.87907 + (((tickAnim - 7) / 7) * (-9.23799-(-14.87907)));
            yy = -2.69931 + (((tickAnim - 7) / 7) * (-29.77144-(-2.69931)));
            zz = -11.18588 + (((tickAnim - 7) / 7) * (28.11789-(-11.18588)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -9.23799 + (((tickAnim - 14) / 9) * (0-(-9.23799)));
            yy = -29.77144 + (((tickAnim - 14) / 9) * (0-(-29.77144)));
            zz = 28.11789 + (((tickAnim - 14) / 9) * (68-(28.11789)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 68 + (((tickAnim - 23) / 5) * (113.38-(68)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (-15.13336-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (2.42648-(0)));
            zz = 113.38 + (((tickAnim - 28) / 10) * (33.21008-(113.38)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -15.13336 + (((tickAnim - 38) / 12) * (0-(-15.13336)));
            yy = 2.42648 + (((tickAnim - 38) / 12) * (0-(2.42648)));
            zz = 33.21008 + (((tickAnim - 38) / 12) * (0-(33.21008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = -0.4 + (((tickAnim - 7) / 16) * (0-(-0.4)));
            yy = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (-0.3-(0)));
            yy = -0.475 + (((tickAnim - 28) / 10) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -0.3 + (((tickAnim - 38) / 12) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);

    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -6 + (((tickAnim - 24) / 11) * (0-(-6)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 24) / 11) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = -0.05 + (((tickAnim - 5) / 19) * (-0.05-(-0.05)));
            yy = 0.3 + (((tickAnim - 5) / 19) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 5) / 19) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -0.05 + (((tickAnim - 24) / 11) * (0-(-0.05)));
            yy = 0.3 + (((tickAnim - 24) / 11) * (0-(0.3)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 5) / 19) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 5) / 19) * (0.0125-(0.0125)));
            zz = 1 + (((tickAnim - 5) / 19) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 24) / 11) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 24) / 11) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 24) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-12.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = -12.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 10) / 14) * (34.5-(-12.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 34.5 + (((tickAnim - 24) / 11) * (0-(34.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = -0.05 + (((tickAnim - 5) / 19) * (-0.05-(-0.05)));
            yy = 0.3 + (((tickAnim - 5) / 19) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 5) / 19) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -0.05 + (((tickAnim - 24) / 11) * (0-(-0.05)));
            yy = 0.3 + (((tickAnim - 24) / 11) * (0-(0.3)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 5) / 19) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 5) / 19) * (0.0125-(0.0125)));
            zz = 1 + (((tickAnim - 5) / 19) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 24) / 11) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 24) / 11) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 24) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.05 + (((tickAnim - 3) / 3) * (0.05-(0.05)));
            yy = 0.3 + (((tickAnim - 3) / 3) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.05 + (((tickAnim - 6) / 3) * (0-(0.05)));
            yy = 0.3 + (((tickAnim - 6) / 3) * (0-(0.3)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 3) / 3) * (0.0125-(0.0125)));
            zz = 1 + (((tickAnim - 3) / 3) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 6) / 3) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 6) / 3) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 6) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -4 + (((tickAnim - 5) / 4) * (0-(-4)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.025 + (((tickAnim - 5) / 4) * (0-(0.025)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (0.7-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 5) / 4) * (1-(1)));
            yy = 1.1 + (((tickAnim - 5) / 4) * (1-(1.1)));
            zz = 0.7 + (((tickAnim - 5) / 4) * (1-(0.7)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.05 + (((tickAnim - 3) / 3) * (-0.05-(-0.05)));
            yy = 0.3 + (((tickAnim - 3) / 3) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -0.05 + (((tickAnim - 6) / 3) * (0-(-0.05)));
            yy = 0.3 + (((tickAnim - 6) / 3) * (0-(0.3)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 3) / 3) * (0.0125-(0.0125)));
            zz = 1 + (((tickAnim - 3) / 3) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 6) / 3) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 6) / 3) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 6) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30 + (((tickAnim - 0) / 18) * (-10.1-(-14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -10.1 + (((tickAnim - 18) / 12) * (0-(-10.1)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.325-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0.325 + (((tickAnim - 12) / 18) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50 + (((tickAnim - 18) / 12) * (0-(33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100 + (((tickAnim - 18) / 3) * (0-(77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5))*3), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-0.15);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-80))*0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-80))*0.3);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*-3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-3));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*-3), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-20))*-3), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-100))*-3), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-90))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*-1));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 18.47345 + (((tickAnim - 0) / 7) * (-12.78077-(18.47345)));
            yy = 29.04767 + (((tickAnim - 0) / 7) * (-15.44937-(29.04767)));
            zz = 4.26116 + (((tickAnim - 0) / 7) * (99.0922+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(4.26116)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -12.78077 + (((tickAnim - 7) / 7) * (3.47621-(-12.78077)));
            yy = -15.44937 + (((tickAnim - 7) / 7) * (-44.01447-(-15.44937)));
            zz = 99.0922+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 7) / 7) * (-8.48957-(99.0922+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 3.47621 + (((tickAnim - 14) / 7) * (11.86181-(3.47621)));
            yy = -44.01447 + (((tickAnim - 14) / 7) * (-11.18839-(-44.01447)));
            zz = -8.48957 + (((tickAnim - 14) / 7) * (5.46963-(-8.48957)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 11.86181 + (((tickAnim - 21) / 7) * (18.47345-(11.86181)));
            yy = -11.18839 + (((tickAnim - 21) / 7) * (29.04767-(-11.18839)));
            zz = 5.46963 + (((tickAnim - 21) / 7) * (4.26116-(5.46963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -8.29067 + (((tickAnim - 0) / 7) * (-38.60513-(-8.29067)));
            yy = 32.66185 + (((tickAnim - 0) / 7) * (-43.70318-(32.66185)));
            zz = 10.54324 + (((tickAnim - 0) / 7) * (49.69429-(10.54324)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -38.60513 + (((tickAnim - 7) / 3) * (-37.79195-(-38.60513)));
            yy = -43.70318 + (((tickAnim - 7) / 3) * (-29.35383-(-43.70318)));
            zz = 49.69429 + (((tickAnim - 7) / 3) * (47.30949-(49.69429)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -37.79195 + (((tickAnim - 10) / 4) * (-14.95663-(-37.79195)));
            yy = -29.35383 + (((tickAnim - 10) / 4) * (14.78559-(-29.35383)));
            zz = 47.30949 + (((tickAnim - 10) / 4) * (16.22983-(47.30949)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -14.95663 + (((tickAnim - 14) / 6) * (-11.74647-(-14.95663)));
            yy = 14.78559 + (((tickAnim - 14) / 6) * (5.41362-(14.78559)));
            zz = 16.22983 + (((tickAnim - 14) / 6) * (0.70833-(16.22983)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -11.74647 + (((tickAnim - 20) / 8) * (-8.29067-(-11.74647)));
            yy = 5.41362 + (((tickAnim - 20) / 8) * (32.66185-(5.41362)));
            zz = 0.70833 + (((tickAnim - 20) / 8) * (10.54324-(0.70833)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 55.25 + (((tickAnim - 0) / 3) * (143.26-(55.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 143.26 + (((tickAnim - 3) / 4) * (116.62-(143.26)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 116.62 + (((tickAnim - 7) / 7) * (16.5-(116.62)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 16.5 + (((tickAnim - 14) / 6) * (9.74-(16.5)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 9.74 + (((tickAnim - 20) / 8) * (55.25-(9.74)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.155-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.11-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.155 + (((tickAnim - 3) / 4) * (-0.2-(-0.155)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0.11 + (((tickAnim - 3) / 4) * (0.3-(0.11)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.2 + (((tickAnim - 7) / 7) * (0.6-(-0.2)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0.3 + (((tickAnim - 7) / 7) * (0-(0.3)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0.6 + (((tickAnim - 14) / 3) * (0.535-(0.6)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0.535 + (((tickAnim - 17) / 3) * (0.325-(0.535)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0.325 + (((tickAnim - 20) / 8) * (0-(0.325)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.68124 + (((tickAnim - 0) / 6) * (22.41153-(17.68124)));
            yy = -9.39504 + (((tickAnim - 0) / 6) * (38.02785-(-9.39504)));
            zz = -18.66956 + (((tickAnim - 0) / 6) * (2.50892-(-18.66956)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 22.41153 + (((tickAnim - 6) / 7) * (47.58575-(22.41153)));
            yy = 38.02785 + (((tickAnim - 6) / 7) * (78.41959-(38.02785)));
            zz = 2.50892 + (((tickAnim - 6) / 7) * (-15.33084-(2.50892)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 47.58575 + (((tickAnim - 13) / 7) * (43.65253-(47.58575)));
            yy = 78.41959 + (((tickAnim - 13) / 7) * (34.73004-(78.41959)));
            zz = -15.33084 + (((tickAnim - 13) / 7) * (14.75445-(-15.33084)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 43.65253 + (((tickAnim - 20) / 8) * (17.68124-(43.65253)));
            yy = 34.73004 + (((tickAnim - 20) / 8) * (-9.39504-(34.73004)));
            zz = 14.75445 + (((tickAnim - 20) / 8) * (-18.66956-(14.75445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 8.75 + (((tickAnim - 0) / 13) * (-0.25-(8.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (9.84621-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (16.03635-(0)));
            zz = -0.25 + (((tickAnim - 13) / 7) * (36.39033-(-0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 9.84621 + (((tickAnim - 20) / 8) * (0-(9.84621)));
            yy = 16.03635 + (((tickAnim - 20) / 8) * (0-(16.03635)));
            zz = 36.39033 + (((tickAnim - 20) / 8) * (8.75-(36.39033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3.5087 + (((tickAnim - 0) / 6) * (-29.78852-(3.5087)));
            yy = 0.08781 + (((tickAnim - 0) / 6) * (0.35279-(0.08781)));
            zz = -10.75382 + (((tickAnim - 0) / 6) * (11.5655-(-10.75382)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -29.78852 + (((tickAnim - 6) / 3) * (-14.9271-(-29.78852)));
            yy = 0.35279 + (((tickAnim - 6) / 3) * (21.98641-(0.35279)));
            zz = 11.5655 + (((tickAnim - 6) / 3) * (-9.14673-(11.5655)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -14.9271 + (((tickAnim - 9) / 4) * (0-(-14.9271)));
            yy = 21.98641 + (((tickAnim - 9) / 4) * (0-(21.98641)));
            zz = -9.14673 + (((tickAnim - 9) / 4) * (-38.75-(-9.14673)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-1.21262-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (1.63025-(0)));
            zz = -38.75 + (((tickAnim - 13) / 3) * (-95.93607-(-38.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -1.21262 + (((tickAnim - 16) / 4) * (-36.2811-(-1.21262)));
            yy = 1.63025 + (((tickAnim - 16) / 4) * (1.51131-(1.63025)));
            zz = -95.93607 + (((tickAnim - 16) / 4) * (-54.54671-(-95.93607)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -36.2811 + (((tickAnim - 20) / 4) * (-26.70648-(-36.2811)));
            yy = 1.51131 + (((tickAnim - 20) / 4) * (10.88852-(1.51131)));
            zz = -54.54671 + (((tickAnim - 20) / 4) * (3.99966-(-54.54671)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -26.70648 + (((tickAnim - 24) / 4) * (3.5087-(-26.70648)));
            yy = 10.88852 + (((tickAnim - 24) / 4) * (0.08781-(10.88852)));
            zz = 3.99966 + (((tickAnim - 24) / 4) * (-10.75382-(3.99966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.5 + (((tickAnim - 0) / 3) * (0.955-(0.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.03-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.955 + (((tickAnim - 3) / 3) * (0.875-(0.955)));
            yy = -0.03 + (((tickAnim - 3) / 3) * (-0.06-(-0.03)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.875 + (((tickAnim - 6) / 3) * (0.4-(0.875)));
            yy = -0.06 + (((tickAnim - 6) / 3) * (-0.44-(-0.06)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.4 + (((tickAnim - 9) / 4) * (0-(0.4)));
            yy = -0.44 + (((tickAnim - 9) / 4) * (0.2-(-0.44)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0.625-(0)));
            yy = 0.2 + (((tickAnim - 13) / 7) * (-0.575-(0.2)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0.625 + (((tickAnim - 20) / 8) * (0.5-(0.625)));
            yy = -0.575 + (((tickAnim - 20) / 8) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5))*-3), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-90))*3), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*3), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-120))*3), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*3));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3.47621 + (((tickAnim - 0) / 7) * (11.86181-(3.47621)));
            yy = 44.01447 + (((tickAnim - 0) / 7) * (11.18839-(44.01447)));
            zz = 8.48957 + (((tickAnim - 0) / 7) * (-5.46963-(8.48957)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 11.86181 + (((tickAnim - 7) / 6) * (18.47345-(11.86181)));
            yy = 11.18839 + (((tickAnim - 7) / 6) * (-29.04767-(11.18839)));
            zz = -5.46963 + (((tickAnim - 7) / 6) * (-4.26116-(-5.46963)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.47345 + (((tickAnim - 13) / 7) * (-12.78077-(18.47345)));
            yy = -29.04767 + (((tickAnim - 13) / 7) * (3.25063-(-29.04767)));
            zz = -4.26116 + (((tickAnim - 13) / 7) * (200.5672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-250-(-4.26116)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -12.78077 + (((tickAnim - 20) / 8) * (3.47621-(-12.78077)));
            yy = 3.25063 + (((tickAnim - 20) / 8) * (44.01447-(3.25063)));
            zz = 200.5672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-250 + (((tickAnim - 20) / 8) * (8.48957-(200.5672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-250)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -14.95663 + (((tickAnim - 0) / 13) * (-8.29067-(-14.95663)));
            yy = -14.78559 + (((tickAnim - 0) / 13) * (-32.66185-(-14.78559)));
            zz = -16.22983 + (((tickAnim - 0) / 13) * (-10.54324-(-16.22983)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -8.29067 + (((tickAnim - 13) / 7) * (-38.60513-(-8.29067)));
            yy = -32.66185 + (((tickAnim - 13) / 7) * (43.70318-(-32.66185)));
            zz = -10.54324 + (((tickAnim - 13) / 7) * (-49.69429-(-10.54324)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -38.60513 + (((tickAnim - 20) / 4) * (-37.79195-(-38.60513)));
            yy = 43.70318 + (((tickAnim - 20) / 4) * (29.35383-(43.70318)));
            zz = -49.69429 + (((tickAnim - 20) / 4) * (-47.30949-(-49.69429)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -37.79195 + (((tickAnim - 24) / 4) * (-14.95663-(-37.79195)));
            yy = 29.35383 + (((tickAnim - 24) / 4) * (-14.78559-(29.35383)));
            zz = -47.30949 + (((tickAnim - 24) / 4) * (-16.22983-(-47.30949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.05195-(0)));
            yy = -16.5 + (((tickAnim - 0) / 6) * (7.26569-(-16.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (12.50011-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.05195 + (((tickAnim - 6) / 7) * (0-(-0.05195)));
            yy = 7.26569 + (((tickAnim - 6) / 7) * (-55.25-(7.26569)));
            zz = 12.50011 + (((tickAnim - 6) / 7) * (0-(12.50011)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -55.25 + (((tickAnim - 13) / 3) * (-143.26-(-55.25)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -143.26 + (((tickAnim - 16) / 4) * (-116.62-(-143.26)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -116.62 + (((tickAnim - 20) / 8) * (-16.5-(-116.62)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.6 + (((tickAnim - 0) / 3) * (-0.535-(-0.6)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.535 + (((tickAnim - 3) / 3) * (-0.325-(-0.535)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.325 + (((tickAnim - 6) / 7) * (0-(-0.325)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0.195-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0.11-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.195 + (((tickAnim - 16) / 4) * (-0.2-(0.195)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0.11 + (((tickAnim - 16) / 4) * (0.3-(0.11)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -0.2 + (((tickAnim - 20) / 8) * (-0.6-(-0.2)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0.3 + (((tickAnim - 20) / 8) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 47.58575 + (((tickAnim - 0) / 7) * (23.0275-(47.58575)));
            yy = -78.41959 + (((tickAnim - 0) / 7) * (-32.39553-(-78.41959)));
            zz = 15.33084 + (((tickAnim - 0) / 7) * (-20.86821-(15.33084)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 23.0275 + (((tickAnim - 7) / 7) * (17.68124-(23.0275)));
            yy = -32.39553 + (((tickAnim - 7) / 7) * (9.39504-(-32.39553)));
            zz = -20.86821 + (((tickAnim - 7) / 7) * (18.66956-(-20.86821)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 17.68124 + (((tickAnim - 14) / 6) * (22.41153-(17.68124)));
            yy = 9.39504 + (((tickAnim - 14) / 6) * (-38.02785-(9.39504)));
            zz = 18.66956 + (((tickAnim - 14) / 6) * (-2.50892-(18.66956)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 22.41153 + (((tickAnim - 20) / 8) * (47.58575-(22.41153)));
            yy = -38.02785 + (((tickAnim - 20) / 8) * (-78.41959-(-38.02785)));
            zz = -2.50892 + (((tickAnim - 20) / 8) * (15.33084-(-2.50892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.84621-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-16.03635-(0)));
            zz = -0.25 + (((tickAnim - 0) / 7) * (-36.39033-(-0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 9.84621 + (((tickAnim - 7) / 7) * (0-(9.84621)));
            yy = -16.03635 + (((tickAnim - 7) / 7) * (0-(-16.03635)));
            zz = -36.39033 + (((tickAnim - 7) / 7) * (-8.75-(-36.39033)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = -8.75 + (((tickAnim - 14) / 14) * (-0.25-(-8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.21262-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.63025-(0)));
            zz = 38.75 + (((tickAnim - 0) / 3) * (95.93607-(38.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -1.21262 + (((tickAnim - 3) / 4) * (-36.2811-(-1.21262)));
            yy = -1.63025 + (((tickAnim - 3) / 4) * (-1.51131-(-1.63025)));
            zz = 95.93607 + (((tickAnim - 3) / 4) * (54.54671-(95.93607)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -36.2811 + (((tickAnim - 7) / 4) * (-26.70648-(-36.2811)));
            yy = -1.51131 + (((tickAnim - 7) / 4) * (-10.88852-(-1.51131)));
            zz = 54.54671 + (((tickAnim - 7) / 4) * (-3.99966-(54.54671)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -26.70648 + (((tickAnim - 11) / 3) * (3.5087-(-26.70648)));
            yy = -10.88852 + (((tickAnim - 11) / 3) * (-0.08781-(-10.88852)));
            zz = -3.99966 + (((tickAnim - 11) / 3) * (10.75382-(-3.99966)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 3.5087 + (((tickAnim - 14) / 6) * (-29.78852-(3.5087)));
            yy = -0.08781 + (((tickAnim - 14) / 6) * (-0.35279-(-0.08781)));
            zz = 10.75382 + (((tickAnim - 14) / 6) * (-11.5655-(10.75382)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -29.78852 + (((tickAnim - 20) / 3) * (-14.9271-(-29.78852)));
            yy = -0.35279 + (((tickAnim - 20) / 3) * (-21.98641-(-0.35279)));
            zz = -11.5655 + (((tickAnim - 20) / 3) * (9.14673-(-11.5655)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -14.9271 + (((tickAnim - 23) / 5) * (0-(-14.9271)));
            yy = -21.98641 + (((tickAnim - 23) / 5) * (0-(-21.98641)));
            zz = 9.14673 + (((tickAnim - 23) / 5) * (38.75-(9.14673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.625-(0)));
            yy = -0.2 + (((tickAnim - 0) / 7) * (-0.575-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.625 + (((tickAnim - 7) / 7) * (-0.5-(-0.625)));
            yy = -0.575 + (((tickAnim - 7) / 7) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -0.5 + (((tickAnim - 14) / 3) * (-0.955-(-0.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (-0.03-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -0.955 + (((tickAnim - 17) / 3) * (-0.875-(-0.955)));
            yy = -0.03 + (((tickAnim - 17) / 3) * (-0.06-(-0.03)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.875 + (((tickAnim - 20) / 3) * (-0.4-(-0.875)));
            yy = -0.06 + (((tickAnim - 20) / 3) * (-0.44-(-0.06)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.4 + (((tickAnim - 23) / 5) * (0-(-0.4)));
            yy = -0.44 + (((tickAnim - 23) / 5) * (-0.2-(-0.44)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*5), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*9), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*0.5);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*6), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-9), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-5));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-7), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*-9), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*8));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-9.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*-7), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-7));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.225);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(9.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-1));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.37329 + (((tickAnim - 0) / 3) * (-12.78077-(1.37329)));
            yy = 39.05369 + (((tickAnim - 0) / 3) * (-15.44937-(39.05369)));
            zz = 35.15168 + (((tickAnim - 0) / 3) * (66.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(35.15168)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -12.78077 + (((tickAnim - 3) / 5) * (4.57001-(-12.78077)));
            yy = -15.44937 + (((tickAnim - 3) / 5) * (-65.96255-(-15.44937)));
            zz = 66.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 3) / 5) * (-10.36209-(66.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 4.57001 + (((tickAnim - 8) / 3) * (11.86181-(4.57001)));
            yy = -65.96255 + (((tickAnim - 8) / 3) * (-11.18839-(-65.96255)));
            zz = -10.36209 + (((tickAnim - 8) / 3) * (5.46963-(-10.36209)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 11.86181 + (((tickAnim - 11) / 4) * (1.37329-(11.86181)));
            yy = -11.18839 + (((tickAnim - 11) / 4) * (39.05369-(-11.18839)));
            zz = 5.46963 + (((tickAnim - 11) / 4) * (35.15168-(5.46963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.29067 + (((tickAnim - 0) / 3) * (-38.60513-(-8.29067)));
            yy = 32.66185 + (((tickAnim - 0) / 3) * (-43.70318-(32.66185)));
            zz = 10.54324 + (((tickAnim - 0) / 3) * (49.69429-(10.54324)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -38.60513 + (((tickAnim - 3) / 3) * (-37.79195-(-38.60513)));
            yy = -43.70318 + (((tickAnim - 3) / 3) * (-29.35383-(-43.70318)));
            zz = 49.69429 + (((tickAnim - 3) / 3) * (47.30949-(49.69429)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -37.79195 + (((tickAnim - 6) / 2) * (-14.95663-(-37.79195)));
            yy = -29.35383 + (((tickAnim - 6) / 2) * (14.78559-(-29.35383)));
            zz = 47.30949 + (((tickAnim - 6) / 2) * (16.22983-(47.30949)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -14.95663 + (((tickAnim - 8) / 3) * (-11.74647-(-14.95663)));
            yy = 14.78559 + (((tickAnim - 8) / 3) * (5.41362-(14.78559)));
            zz = 16.22983 + (((tickAnim - 8) / 3) * (0.70833-(16.22983)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.74647 + (((tickAnim - 11) / 4) * (-8.29067-(-11.74647)));
            yy = 5.41362 + (((tickAnim - 11) / 4) * (32.66185-(5.41362)));
            zz = 0.70833 + (((tickAnim - 11) / 4) * (10.54324-(0.70833)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 55.25 + (((tickAnim - 0) / 2) * (143.26-(55.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 143.26 + (((tickAnim - 2) / 1) * (116.62-(143.26)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 116.62 + (((tickAnim - 3) / 5) * (44.25-(116.62)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (2.31947-(0)));
            yy = 44.25 + (((tickAnim - 8) / 3) * (9.58795-(44.25)));
            zz = 0 + (((tickAnim - 8) / 3) * (7.84851-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 2.31947 + (((tickAnim - 11) / 4) * (0-(2.31947)));
            yy = 9.58795 + (((tickAnim - 11) / 4) * (55.25-(9.58795)));
            zz = 7.84851 + (((tickAnim - 11) / 4) * (0-(7.84851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.155-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.11-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.155 + (((tickAnim - 2) / 1) * (-0.2-(-0.155)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.11 + (((tickAnim - 2) / 1) * (0.3-(0.11)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.2 + (((tickAnim - 3) / 5) * (0-(-0.2)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0.3 + (((tickAnim - 3) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0.955-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.955 + (((tickAnim - 8) / 1) * (0.91-(0.955)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0.91 + (((tickAnim - 9) / 2) * (0.325-(0.91)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.325 + (((tickAnim - 11) / 4) * (0-(0.325)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.68124 + (((tickAnim - 0) / 3) * (22.41153-(17.68124)));
            yy = -9.39504 + (((tickAnim - 0) / 3) * (38.02785-(-9.39504)));
            zz = -18.66956 + (((tickAnim - 0) / 3) * (2.50892-(-18.66956)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 22.41153 + (((tickAnim - 3) / 5) * (47.58575-(22.41153)));
            yy = 38.02785 + (((tickAnim - 3) / 5) * (78.41959-(38.02785)));
            zz = 2.50892 + (((tickAnim - 3) / 5) * (-15.33084-(2.50892)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 47.58575 + (((tickAnim - 8) / 3) * (43.65253-(47.58575)));
            yy = 78.41959 + (((tickAnim - 8) / 3) * (34.73004-(78.41959)));
            zz = -15.33084 + (((tickAnim - 8) / 3) * (14.75445-(-15.33084)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 43.65253 + (((tickAnim - 11) / 4) * (17.68124-(43.65253)));
            yy = 34.73004 + (((tickAnim - 11) / 4) * (-9.39504-(34.73004)));
            zz = 14.75445 + (((tickAnim - 11) / 4) * (-18.66956-(14.75445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 8.75 + (((tickAnim - 0) / 8) * (-0.25-(8.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (9.84621-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (16.03635-(0)));
            zz = -0.25 + (((tickAnim - 8) / 3) * (36.39033-(-0.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 9.84621 + (((tickAnim - 11) / 4) * (0-(9.84621)));
            yy = 16.03635 + (((tickAnim - 11) / 4) * (0-(16.03635)));
            zz = 36.39033 + (((tickAnim - 11) / 4) * (8.75-(36.39033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.5087 + (((tickAnim - 0) / 3) * (-29.78852-(3.5087)));
            yy = 0.08781 + (((tickAnim - 0) / 3) * (0.35279-(0.08781)));
            zz = -10.75382 + (((tickAnim - 0) / 3) * (11.5655-(-10.75382)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -29.78852 + (((tickAnim - 3) / 2) * (-14.9271-(-29.78852)));
            yy = 0.35279 + (((tickAnim - 3) / 2) * (21.98641-(0.35279)));
            zz = 11.5655 + (((tickAnim - 3) / 2) * (-9.14673-(11.5655)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -14.9271 + (((tickAnim - 5) / 3) * (0-(-14.9271)));
            yy = 21.98641 + (((tickAnim - 5) / 3) * (0-(21.98641)));
            zz = -9.14673 + (((tickAnim - 5) / 3) * (-38.75-(-9.14673)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-1.21262-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (1.63025-(0)));
            zz = -38.75 + (((tickAnim - 8) / 0) * (-95.93607-(-38.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -1.21262 + (((tickAnim - 8) / 3) * (-36.2811-(-1.21262)));
            yy = 1.63025 + (((tickAnim - 8) / 3) * (1.51131-(1.63025)));
            zz = -95.93607 + (((tickAnim - 8) / 3) * (-54.54671-(-95.93607)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -36.2811 + (((tickAnim - 11) / 2) * (-26.70648-(-36.2811)));
            yy = 1.51131 + (((tickAnim - 11) / 2) * (10.88852-(1.51131)));
            zz = -54.54671 + (((tickAnim - 11) / 2) * (3.99966-(-54.54671)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -26.70648 + (((tickAnim - 13) / 2) * (3.5087-(-26.70648)));
            yy = 10.88852 + (((tickAnim - 13) / 2) * (0.08781-(10.88852)));
            zz = 3.99966 + (((tickAnim - 13) / 2) * (-10.75382-(3.99966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.5 + (((tickAnim - 0) / 2) * (0.955-(0.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.03-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.955 + (((tickAnim - 2) / 1) * (0.875-(0.955)));
            yy = -0.03 + (((tickAnim - 2) / 1) * (-0.06-(-0.03)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.875 + (((tickAnim - 3) / 2) * (0.4-(0.875)));
            yy = -0.06 + (((tickAnim - 3) / 2) * (-0.44-(-0.06)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.4 + (((tickAnim - 5) / 3) * (0-(0.4)));
            yy = -0.44 + (((tickAnim - 5) / 3) * (0.2-(-0.44)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0.625-(0)));
            yy = 0.2 + (((tickAnim - 8) / 3) * (-0.575-(0.2)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.625 + (((tickAnim - 11) / 4) * (0.5-(0.625)));
            yy = -0.575 + (((tickAnim - 11) / 4) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-3), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*3), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*7), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-120))*3), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.57001 + (((tickAnim - 0) / 3) * (11.86181-(4.57001)));
            yy = 65.96255 + (((tickAnim - 0) / 3) * (11.18839-(65.96255)));
            zz = 10.36209 + (((tickAnim - 0) / 3) * (-5.46963-(10.36209)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 11.86181 + (((tickAnim - 3) / 5) * (1.37329-(11.86181)));
            yy = 11.18839 + (((tickAnim - 3) / 5) * (-39.05369-(11.18839)));
            zz = -5.46963 + (((tickAnim - 3) / 5) * (-35.15168-(-5.46963)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1.37329 + (((tickAnim - 8) / 3) * (-12.78077-(1.37329)));
            yy = -39.05369 + (((tickAnim - 8) / 3) * (3.25063-(-39.05369)));
            zz = -35.15168 + (((tickAnim - 8) / 3) * (-173.8078+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(-35.15168)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -12.78077 + (((tickAnim - 11) / 4) * (4.57001-(-12.78077)));
            yy = 3.25063 + (((tickAnim - 11) / 4) * (65.96255-(3.25063)));
            zz = -173.8078+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 11) / 4) * (10.36209-(-173.8078+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14.95663 + (((tickAnim - 0) / 8) * (-8.29067-(-14.95663)));
            yy = -14.78559 + (((tickAnim - 0) / 8) * (-32.66185-(-14.78559)));
            zz = -16.22983 + (((tickAnim - 0) / 8) * (-10.54324-(-16.22983)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -8.29067 + (((tickAnim - 8) / 3) * (-38.60513-(-8.29067)));
            yy = -32.66185 + (((tickAnim - 8) / 3) * (43.70318-(-32.66185)));
            zz = -10.54324 + (((tickAnim - 8) / 3) * (-49.69429-(-10.54324)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -38.60513 + (((tickAnim - 11) / 2) * (-37.79195-(-38.60513)));
            yy = 43.70318 + (((tickAnim - 11) / 2) * (29.35383-(43.70318)));
            zz = -49.69429 + (((tickAnim - 11) / 2) * (-47.30949-(-49.69429)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -37.79195 + (((tickAnim - 13) / 2) * (-14.95663-(-37.79195)));
            yy = 29.35383 + (((tickAnim - 13) / 2) * (-14.78559-(29.35383)));
            zz = -47.30949 + (((tickAnim - 13) / 2) * (-16.22983-(-47.30949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.05195-(0)));
            yy = -39 + (((tickAnim - 0) / 3) * (7.26569-(-39)));
            zz = 0 + (((tickAnim - 0) / 3) * (12.50011-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.05195 + (((tickAnim - 3) / 5) * (0-(-0.05195)));
            yy = 7.26569 + (((tickAnim - 3) / 5) * (-55.25-(7.26569)));
            zz = 12.50011 + (((tickAnim - 3) / 5) * (0-(12.50011)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -55.25 + (((tickAnim - 8) / 0) * (-143.26-(-55.25)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -143.26 + (((tickAnim - 8) / 3) * (-116.62-(-143.26)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -116.62 + (((tickAnim - 11) / 4) * (-39-(-116.62)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.77-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.77 + (((tickAnim - 1) / 1) * (-1.035-(-0.77)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.035 + (((tickAnim - 2) / 1) * (-0.325-(-1.035)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.325 + (((tickAnim - 3) / 5) * (0-(-0.325)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0.195-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0.11-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.195 + (((tickAnim - 8) / 3) * (-0.2-(0.195)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0.11 + (((tickAnim - 8) / 3) * (0.3-(0.11)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.2 + (((tickAnim - 11) / 4) * (0-(-0.2)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0.3 + (((tickAnim - 11) / 4) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47.58575 + (((tickAnim - 0) / 3) * (23.0275-(47.58575)));
            yy = -78.41959 + (((tickAnim - 0) / 3) * (-32.39553-(-78.41959)));
            zz = 15.33084 + (((tickAnim - 0) / 3) * (-20.86821-(15.33084)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 23.0275 + (((tickAnim - 3) / 5) * (17.68124-(23.0275)));
            yy = -32.39553 + (((tickAnim - 3) / 5) * (9.39504-(-32.39553)));
            zz = -20.86821 + (((tickAnim - 3) / 5) * (18.66956-(-20.86821)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.68124 + (((tickAnim - 8) / 3) * (22.41153-(17.68124)));
            yy = 9.39504 + (((tickAnim - 8) / 3) * (-38.02785-(9.39504)));
            zz = 18.66956 + (((tickAnim - 8) / 3) * (-2.50892-(18.66956)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 22.41153 + (((tickAnim - 11) / 4) * (47.58575-(22.41153)));
            yy = -38.02785 + (((tickAnim - 11) / 4) * (-78.41959-(-38.02785)));
            zz = -2.50892 + (((tickAnim - 11) / 4) * (15.33084-(-2.50892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.84621-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-16.03635-(0)));
            zz = -0.25 + (((tickAnim - 0) / 3) * (-36.39033-(-0.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 9.84621 + (((tickAnim - 3) / 5) * (0-(9.84621)));
            yy = -16.03635 + (((tickAnim - 3) / 5) * (0-(-16.03635)));
            zz = -36.39033 + (((tickAnim - 3) / 5) * (-8.75-(-36.39033)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -8.75 + (((tickAnim - 8) / 7) * (-0.25-(-8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-1.21262-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.63025-(0)));
            zz = 38.75 + (((tickAnim - 0) / 2) * (95.93607-(38.75)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.21262 + (((tickAnim - 2) / 1) * (-36.2811-(-1.21262)));
            yy = -1.63025 + (((tickAnim - 2) / 1) * (-1.51131-(-1.63025)));
            zz = 95.93607 + (((tickAnim - 2) / 1) * (54.54671-(95.93607)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -36.2811 + (((tickAnim - 3) / 3) * (-26.70648-(-36.2811)));
            yy = -1.51131 + (((tickAnim - 3) / 3) * (-10.88852-(-1.51131)));
            zz = 54.54671 + (((tickAnim - 3) / 3) * (-3.99966-(54.54671)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -26.70648 + (((tickAnim - 6) / 2) * (3.5087-(-26.70648)));
            yy = -10.88852 + (((tickAnim - 6) / 2) * (-0.08781-(-10.88852)));
            zz = -3.99966 + (((tickAnim - 6) / 2) * (10.75382-(-3.99966)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.5087 + (((tickAnim - 8) / 3) * (-29.78852-(3.5087)));
            yy = -0.08781 + (((tickAnim - 8) / 3) * (-0.35279-(-0.08781)));
            zz = 10.75382 + (((tickAnim - 8) / 3) * (-11.5655-(10.75382)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -29.78852 + (((tickAnim - 11) / 2) * (-14.9271-(-29.78852)));
            yy = -0.35279 + (((tickAnim - 11) / 2) * (-21.98641-(-0.35279)));
            zz = -11.5655 + (((tickAnim - 11) / 2) * (9.14673-(-11.5655)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -14.9271 + (((tickAnim - 13) / 2) * (0-(-14.9271)));
            yy = -21.98641 + (((tickAnim - 13) / 2) * (0-(-21.98641)));
            zz = 9.14673 + (((tickAnim - 13) / 2) * (38.75-(9.14673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.625-(0)));
            yy = -0.2 + (((tickAnim - 0) / 3) * (-0.575-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.625 + (((tickAnim - 3) / 5) * (-0.5-(-0.625)));
            yy = -0.575 + (((tickAnim - 3) / 5) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.5 + (((tickAnim - 8) / 1) * (-0.955-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.03-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -0.955 + (((tickAnim - 9) / 2) * (-0.875-(-0.955)));
            yy = -0.03 + (((tickAnim - 9) / 2) * (-0.06-(-0.03)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.875 + (((tickAnim - 11) / 2) * (-0.4-(-0.875)));
            yy = -0.06 + (((tickAnim - 11) / 2) * (-0.44-(-0.06)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.4 + (((tickAnim - 13) / 2) * (0-(-0.4)));
            yy = -0.44 + (((tickAnim - 13) / 2) * (-0.2-(-0.44)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMontsecosuchus entity = (EntityPrehistoricFloraMontsecosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1.5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-1.5), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-0.5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(65.98351), rightArm.rotateAngleY + (float) Math.toRadians(29.3872929237-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5), rightArm.rotateAngleZ + (float) Math.toRadians(22.61309));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-91.18634), rightArm2.rotateAngleY + (float) Math.toRadians(20.58276), rightArm2.rotateAngleZ + (float) Math.toRadians(13.85228));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(95), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(31.18566), rightLeg.rotateAngleY + (float) Math.toRadians(108.8158537045-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2), rightLeg.rotateAngleZ + (float) Math.toRadians(12.10307));
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(0.65);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(0);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(32.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*2));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(-87));
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(-0.45);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(10.5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6.75), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*22), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(65.98351), leftArm.rotateAngleY + (float) Math.toRadians(-29.3872929237-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5), leftArm.rotateAngleZ + (float) Math.toRadians(-22.61309));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-91.18634), leftArm2.rotateAngleY + (float) Math.toRadians(-20.58276), leftArm2.rotateAngleZ + (float) Math.toRadians(-13.85228));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(-95), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(31.18566), leftLeg.rotateAngleY + (float) Math.toRadians(-108.8158537045-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2), leftLeg.rotateAngleZ + (float) Math.toRadians(-12.10307));
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(-0.65);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(0);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(-32.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*2));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(87));
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(-0.45);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMontsecosuchus e = (EntityPrehistoricFloraMontsecosuchus) entity;
        animator.update(entity);

    }
}
