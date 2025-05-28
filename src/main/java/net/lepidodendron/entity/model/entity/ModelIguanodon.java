package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIguanodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelIguanodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer opposablePinkie;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer opposablePinkie2;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r80;

    private ModelAnimator animator;

    public ModelIguanodon() {
        this.textureWidth = 170;
        this.textureHeight = 170;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.0F, 3.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.1058F, 7.4872F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 135, 45, 0.0F, -1.5383F, -10.8676F, 0, 3, 11, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.9F, -5.2F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 40, 0.0F, -1.6244F, -0.0596F, 0, 2, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -7.9F, -5.2F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 109, -2.0F, 0.1756F, -0.0596F, 4, 5, 14, 0.005F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.2F, -6.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1571F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 40, -6.0F, -0.104F, 0.0518F, 12, 24, 14, 0.005F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(6.5F, 2.8F, -1.3F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2269F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.7686F, 1.2984F);
        this.leftLeg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 91, -3.0F, -8.0285F, -6.0408F, 6, 22, 13, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 16.3686F, -3.9016F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.672F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 52, 127, -2.3F, 0.4569F, -0.7138F, 5, 19, 7, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.2F, 18.8413F, 4.7723F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 32, 134, -2.5F, -0.0087F, -3.4314F, 5, 7, 4, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 7.4231F, 0.2116F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3403F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 148, 106, -3.0F, -2.0319F, -3.2504F, 6, 3, 4, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 104, 63, -3.0F, -2.3F, -5.2F, 6, 3, 6, -0.003F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.5F, 2.8F, -1.3F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2269F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.7686F, 1.2984F);
        this.rightLeg.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 91, -3.0F, -8.0285F, -6.0408F, 6, 22, 13, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 16.3686F, -3.9016F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.672F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 52, 127, -2.7F, 0.4569F, -0.7138F, 5, 19, 7, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.2F, 18.8413F, 4.7723F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 32, 134, -2.5F, -0.0087F, -3.4314F, 5, 7, 4, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 7.4231F, 0.2116F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3403F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 148, 106, -3.0F, -2.0319F, -3.2504F, 6, 3, 4, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 104, 63, -3.0F, -2.3F, -5.2F, 6, 3, 6, -0.003F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.hips.addChild(body);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -7.8F, -1.2F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 47, 0.0F, -1.9074F, 0.048F, 0, 2, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -7.8F, -4.2F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 48, 0.0F, -1.9597F, 1.0476F, 0, 2, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 147, 45, -2.0F, 0.0403F, 0.0476F, 4, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.6874F, -4.7816F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 40, 0.0F, -1.9903F, -0.3608F, 0, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.0F, -15.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 0, 0.0F, -2.2391F, 3.993F, 0, 2, 5, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 47, 0.0F, -2.0391F, 1.993F, 0, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 126, 132, -2.0F, -0.2391F, -0.007F, 4, 4, 11, 0.008F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -6.0F, -15.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2269F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 0, 0.0F, -1.7391F, -0.007F, 0, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.0F, -15.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 59, 0, -7.0F, -0.0388F, 0.0279F, 14, 2, 15, -0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -4.0F, -15.0F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -7.0F, -0.0388F, 0.0279F, 14, 24, 15, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -15.0F);
        this.body.addChild(chest);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 11.6F, -15.0F);
        this.chest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5585F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 53, 24, -6.0F, -13.747F, -1.1667F, 12, 14, 16, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -5.8F, -1.0F);
        this.chest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 139, 84, 0.0F, -1.4339F, -10.9447F, 0, 2, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.1F, 0.0F);
        this.chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3316F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 118, 0, -2.0F, -0.0758F, -12.9879F, 4, 3, 13, 0.005F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3665F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 79, -6.0F, 0.0637F, -12.6353F, 12, 16, 13, 0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(5.2F, 13.3F, -8.4F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3924F, 0.0167F, -0.2148F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5611F, 5.8871F, 0.8344F);
        this.leftArm.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2967F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 140, 17, -2.0F, -7.7318F, -1.4898F, 4, 14, 6, 0.005F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-1.0168F, 14.24F, 2.2922F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5692F, 0.5468F, -0.0034F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 77, 145, -1.0F, -5.0F, -1.6F, 3, 14, 4, -0.01F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.6311F, 9.1478F, 0.2556F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1721F, 0.3317F, 0.155F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 0, -1.7786F, -0.1176F, -1.9996F, 2, 6, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.2786F, 0.8824F, -1.8996F);
        this.leftArm3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1571F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 6, -0.5F, -1.0903F, -3.9608F, 1, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.2786F, 0.8824F, -1.8996F);
        this.leftArm3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0349F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 48, -0.5F, -0.2903F, -3.9608F, 1, 1, 4, -0.004F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.0639F, 5.7263F, 0.0004F);
        this.leftArm3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3927F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 53, 64, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.004F, false));

        this.opposablePinkie = new AdvancedModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.2492F, 0.1824F, 1.8494F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);
        this.opposablePinkie.cubeList.add(new ModelBox(opposablePinkie, 0, 40, -0.5794F, -0.3392F, -0.6694F, 1, 4, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-5.2F, 13.3F, -8.4F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3924F, -0.0167F, 0.2148F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5611F, 5.8871F, 0.8344F);
        this.rightArm.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2967F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 140, 17, -2.0F, -7.7318F, -1.4898F, 4, 14, 6, 0.005F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(1.0168F, 14.24F, 2.2922F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.5692F, -0.5468F, 0.0034F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 77, 145, -2.0F, -5.0F, -1.6F, 3, 14, 4, -0.01F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.6311F, 9.1478F, 0.2556F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1721F, -0.3317F, -0.155F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 0, -0.2214F, -0.1176F, -1.9996F, 2, 6, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.2786F, 0.8824F, -1.8996F);
        this.rightArm3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1571F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 59, 6, -0.5F, -1.0903F, -3.9608F, 1, 1, 4, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.2786F, 0.8824F, -1.8996F);
        this.rightArm3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0349F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 48, -0.5F, -0.2903F, -3.9608F, 1, 1, 4, -0.004F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0639F, 5.7263F, 0.0004F);
        this.rightArm3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3927F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 64, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.004F, true));

        this.opposablePinkie2 = new AdvancedModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.2492F, 0.1824F, 1.8494F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);
        this.opposablePinkie2.cubeList.add(new ModelBox(opposablePinkie2, 0, 40, -0.4206F, -0.3392F, -0.6694F, 1, 4, 1, 0.0F, true));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 3.0F, -11.0F);
        this.chest.addChild(neck4);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -5.0F, -1.5F);
        this.neck4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3316F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 53, 55, 0.0F, -0.8646F, -7.0966F, 0, 1, 7, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -5.1F, -0.5F);
        this.neck4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2618F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 103, 0, -1.5F, -0.1268F, -9.0885F, 3, 3, 9, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.5F, -8.0F);
        this.neck4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0698F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 94, 18, -4.0F, -3.3736F, 0.0239F, 8, 10, 10, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.7F, -7.8F);
        this.neck4.addChild(neck3);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -3.8964F, -1.3394F);
        this.neck3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1658F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 12, 10, 0.0F, -0.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -4.4812F, -3.252F);
        this.neck3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.384F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 53, 55, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -1.1F, -6.9F);
        this.neck3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2967F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 129, -3.0F, -4.0F, 0.0F, 6, 9, 9, 0.005F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.9F, -6.5F);
        this.neck3.addChild(neck2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -3.3474F, 1.9291F);
        this.neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5323F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 57, 55, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -6.5F, -7.5F);
        this.neck2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.6196F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 55, 0.0F, -3.1089F, 7.0071F, 0, 1, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 53, 0, 0.0F, -3.5089F, 5.0071F, 0, 2, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 59, 6, 0.0F, -3.9089F, 3.0071F, 0, 2, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 119, 63, -2.0F, -2.1089F, 0.0071F, 4, 8, 12, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -8.5629F, -4.1773F);
        this.neck2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.5323F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 59, 18, 0.0F, -0.4F, -0.6F, 0, 2, 1, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.3F, -7.5F);
        this.neck2.addChild(neck);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -4.2303F, 0.9255F);
        this.neck.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2356F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 59, 24, 0.0F, -0.4F, -0.3F, 0, 2, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.neck.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1047F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 59, 33, 0.0F, -4.5934F, -2.1212F, 0, 2, 1, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 146, 127, -2.0F, -2.9934F, -4.1212F, 4, 9, 5, 0.009F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -3.9522F, -3.1257F);
        this.neck.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0349F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 64, 24, 0.0F, -0.6F, -0.5F, 0, 2, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -3.2F);
        this.neck.addChild(head);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.0F, -2.9F, -2.2F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2182F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 53, 64, -1.0F, -0.7643F, -0.1138F, 0, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 11, -3.0F, 0.1357F, -0.1138F, 4, 1, 2, 0.005F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.3315F, -5.8079F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.5149F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 94, 22, -2.6F, -0.6F, -0.1F, 2, 1, 2, 0.005F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 94, 22, 0.6F, -0.6F, -0.1F, 2, 1, 2, 0.005F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-2.6F, -0.1685F, -6.2079F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.7488F, -0.7622F, -0.5705F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 77, 91, 0.0F, 0.0321F, -1.9981F, 2, 1, 2, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(2.6F, -0.1685F, -6.2079F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.7488F, 0.7622F, 0.5705F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 77, 91, -2.0F, 0.0321F, -1.9981F, 2, 1, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -0.5F, -5.6F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.6196F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 64, 33, -0.5F, -0.4438F, 2.0479F, 0, 1, 1, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 59, 18, -2.5F, 0.1562F, 0.0479F, 4, 1, 4, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 7.5F, -11.5F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 2.3475F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 86, -1.0F, 0.0463F, 0.0317F, 3, 2, 2, -0.005F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 6.9F, -12.7F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 1.9809F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 77, 95, -1.0F, 0.0075F, -0.9971F, 3, 1, 1, 0.004F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 4.9F, -12.5F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 1.4399F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 51, 91, -1.0F, 0.0154F, -1.9876F, 3, 1, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 5.0F, -12.5F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 1.5272F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 44, 8, -1.0F, 0.0368F, -1.9479F, 3, 1, 2, 0.009F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 5.3F, -10.6F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.9338F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 87, 18, -1.0F, -0.8626F, -1.8789F, 3, 1, 2, 0.006F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 4.0F, -12.0F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 1.0908F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 51, 95, -1.0F, -0.0125F, -1.0168F, 3, 2, 1, 0.005F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 1.3F, -9.1F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.7592F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 39, 47, -1.0F, -0.0616F, -4.0181F, 2, 2, 4, -0.005F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 4.8F, -10.2F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3054F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 40, -0.6F, -0.188F, 0.3247F, 0, 1, 6, 0.0F, true));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 40, 0.6F, -0.188F, 0.3247F, 0, 1, 6, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 3.5F, -6.2F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.4625F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 140, 0, -1.0F, -2.0093F, -5.0351F, 2, 2, 8, 0.006F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.0F, 3.4F, -6.8F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0897F, -0.5044F, -0.0435F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 89, 63, 0.0F, -2.8626F, 0.0552F, 2, 3, 3, -0.004F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(1.0F, 3.4F, -6.8F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0897F, 0.5044F, 0.0435F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 89, 63, -2.0F, -2.8626F, 0.0552F, 2, 3, 3, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, -0.5F, -5.6F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.4451F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 79, -1.0F, 0.0562F, -3.9521F, 2, 2, 4, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, -0.5F, -5.6F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.4276F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 44, 0, -2.01F, 1.1562F, -0.0521F, 1, 1, 1, 0.0F, true));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 44, 0, 2.01F, 1.1562F, -0.0521F, 1, 1, 1, 0.0F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 111, 132, -2.0F, 0.0562F, 0.0479F, 5, 4, 6, -0.006F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.5F, 4.3514F, -2.3775F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.9687F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 59, 0, -3.0F, -2.8574F, -0.1417F, 5, 3, 2, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.5F, 4.3514F, -2.7775F);
        this.head.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.2356F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 119, 45, -3.0F, -2.7641F, 0.2472F, 5, 3, 5, 0.005F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(1.4F, 4.8F, 0.7F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.036F, 0.0F, 0.0F);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.4F, 0.9205F, -10.3843F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 1.2305F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 66, 6, -1.0F, -0.5F, -0.3F, 2, 1, 1, 0.009F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.4F, 1.1485F, -12.5262F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 2.042F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 7, 40, -1.0F, 0.1143F, -0.7896F, 2, 2, 1, 0.003F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-1.4F, 2.2485F, -11.9262F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 1.1694F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 60, 64, -1.0F, -1.0678F, -0.0114F, 2, 2, 1, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-1.4F, 2.7485F, -11.1262F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.925F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 43, 79, -1.0F, -1.0076F, -0.0936F, 2, 1, 2, 0.005F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-1.4F, 2.1485F, -9.2262F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.3142F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 76, 18, -1.0F, -1.0241F, -1.986F, 2, 1, 3, 0.004F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-1.2F, -0.4515F, -7.7262F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.2793F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 9, 0, -0.8F, -0.7383F, -2.1446F, 0, 1, 2, 0.0F, true));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 9, 0, 0.4F, -0.7383F, -2.1446F, 0, 1, 2, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-2.4857F, -0.9928F, -6.0742F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.1715F, -0.2975F, 0.0095F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 59, 33, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-2.915F, -2.0913F, -6.0977F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.1372F, -0.2972F, 0.0076F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 59, 24, 0.2899F, -1.5F, -1.9F, 0, 4, 4, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-2.3F, -1.3351F, -7.5063F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.1571F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 53, 55, 0.19F, -2.0F, -3.0F, 0, 3, 3, 0.0F, true));
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 61, 55, 0.2F, -2.0F, -3.0F, 0, 3, 3, 0.0F, true));
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 53, 55, 1.61F, -2.0F, -3.0F, 0, 3, 3, 0.0F, false));
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 61, 55, 1.6F, -2.0F, -3.0F, 0, 3, 3, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-2.8899F, -2.0913F, -6.0977F);
        this.jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.1372F, -0.2972F, 0.0076F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 38, 79, 0.3F, -1.5F, -1.9F, 0, 4, 4, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-1.4F, -0.4515F, -7.7262F);
        this.jaw.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1571F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 92, 147, -1.0F, 0.1617F, -2.8445F, 2, 2, 7, 0.007F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.3143F, -0.9928F, -6.0742F);
        this.jaw.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.1715F, 0.2975F, -0.0095F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 59, 33, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.09F, -2.0913F, -6.0977F);
        this.jaw.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.1372F, 0.2972F, -0.0076F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 59, 24, -0.29F, -1.5F, -1.9F, 0, 4, 4, 0.0F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 38, 79, -0.3F, -1.5F, -1.9F, 0, 4, 4, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-2.3F, 0.4485F, -7.4262F);
        this.jaw.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.1396F, -0.3491F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 39, 40, -0.1F, -0.8133F, -0.2105F, 2, 2, 4, 0.007F, true));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.5F, 0.4485F, -7.4262F);
        this.jaw.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.1396F, 0.3491F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 39, 40, -1.9F, -0.8133F, -0.2105F, 2, 2, 4, 0.007F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, 0.8485F, -2.0262F);
        this.jaw.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0873F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 121, 17, -3.4F, -3.9F, -1.8F, 4, 2, 5, -0.009F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 148, -3.9F, -1.9F, -1.8F, 5, 2, 5, -0.005F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 7.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2269F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 53, 55, -5.0F, -2.8F, -2.1F, 10, 20, 15, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, -7.0F, 0.9F);
        this.tail.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.0524F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 140, 60, 0.0F, -1.3337F, 0.0012F, 0, 2, 11, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, -7.0F, -1.0F);
        this.tail.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.0349F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 0, 0.0F, -1.4F, -0.1F, 0, 2, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 119, 25, -1.5F, -0.1F, -0.1F, 3, 5, 14, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0349F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 89, 76, -3.5F, -2.6F, -0.2F, 7, 10, 15, 0.005F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, -6.7F, -0.4F);
        this.tail2.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.1047F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 132, 106, 0.0F, -0.9F, 0.1F, 0, 1, 15, 0.0F, false));
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 90, 102, -1.5F, 0.1F, 0.1F, 3, 10, 15, 0.005F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7F, 14.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0262F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 94, 39, -2.0F, -1.9F, -1.1F, 4, 7, 16, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.0F, -4.3F, -0.5F);
        this.tail3.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.0873F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 95, 130, 0.0F, -1.0F, 0.65F, 0, 1, 15, 0.0F, false));
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 111, 112, -1.0F, 0.0F, -0.1F, 2, 3, 16, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 14.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1484F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 114, -1.5F, -0.9F, -1.1F, 3, 4, 15, 0.005F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.tail4.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.0873F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 77, 91, 0.0F, -0.9F, 1.9F, 0, 1, 11, 0.0F, false));
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 77, 128, -1.0F, 0.1F, -0.1F, 2, 2, 14, 0.005F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.6F, 13.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0698F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 120, 88, -1.0F, -1.0F, -0.3F, 2, 3, 14, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, -1.0F, -0.3F);
        this.tail5.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.0349F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 17, 134, 0.0F, -1.0F, 0.0F, 0, 1, 14, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0524F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 44, 0, -0.5F, -1.0F, -0.4F, 1, 2, 12, 0.005F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, -0.9F, 0.5F);
        this.tail6.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.0349F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 42, 145, 0.0F, -0.5F, -0.9F, 0, 1, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.offsetZ = 0.7F;
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.520F;
        this.hips.offsetX = -0.2F;
        this.hips.rotateAngleY = (float)Math.toRadians(125);
        this.hips.rotateAngleX = (float)Math.toRadians(-2);
        this.hips.rotateAngleZ = (float)Math.toRadians(2);
        this.hips.scaleChildren = true;
        float scaler = 0.45F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
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

        EntityPrehistoricFloraIguanodon entityIguanodon = (EntityPrehistoricFloraIguanodon) e;

        this.faceTarget(f3, f4, 10, neck3);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck, this.head};
//        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
//        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        entityIguanodon.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityIguanodon.getAnimation() == entityIguanodon.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityIguanodon.isReallyInWater()) {

                if (f3 == 0.0F || !entityIguanodon.getIsMoving()) {
                    if (entityIguanodon.getAnimation() != entityIguanodon.EAT_ANIMATION
                        && (!entityIguanodon.isAnimationDirectionLocked(entityIguanodon.getAnimation()))) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    if (entityIguanodon.getAnimation() == entityIguanodon.NO_ANIMATION) {
//                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
//                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
//                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
//                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
//                        this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
//                        this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
//                        this.flap(this.leftArm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
//                        this.flap(this.rightArm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    }

                    return;
                }

                if (entityIguanodon.getIsFast()) { //Running


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
        EntityPrehistoricFloraIguanodon ee = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIguanodon entity = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 6.75 + (((tickAnim - 13) / 12) * (0-(6.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 13) / 12) * (0-(-7)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 13) / 12) * (0-(-7)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 3.75 + (((tickAnim - 13) / 12) * (0-(3.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0.275 + (((tickAnim - 13) / 12) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 1.5 + (((tickAnim - 13) / 12) * (0-(1.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -9.25 + (((tickAnim - 13) / 12) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -24.5 + (((tickAnim - 13) / 12) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.575-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 3.575 + (((tickAnim - 13) / 12) * (0-(3.575)));
            zz = -0.25 + (((tickAnim - 13) / 12) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 16.25 + (((tickAnim - 13) / 12) * (0-(16.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -9.25 + (((tickAnim - 13) / 12) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -24.5 + (((tickAnim - 13) / 12) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.575-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 3.575 + (((tickAnim - 13) / 12) * (0-(3.575)));
            zz = -0.25 + (((tickAnim - 13) / 12) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 16.25 + (((tickAnim - 13) / 12) * (0-(16.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 7.75 + (((tickAnim - 13) / 12) * (0-(7.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 22.25 + (((tickAnim - 13) / 12) * (0-(22.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 18.5 + (((tickAnim - 13) / 12) * (0-(18.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 14.25 + (((tickAnim - 6) / 7) * (0-(14.25)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 6) / 19) * (0-(0)));
            yy = -0.2 + (((tickAnim - 6) / 19) * (0-(-0.2)));
            zz = 0.65 + (((tickAnim - 6) / 19) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 9 + (((tickAnim - 6) / 7) * (0-(9)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.3-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0.3 + (((tickAnim - 6) / 7) * (0-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 13.5 + (((tickAnim - 6) / 7) * (0-(13.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -1.25 + (((tickAnim - 13) / 12) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.75 + (((tickAnim - 13) / 12) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIguanodon entity = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-10.025-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -10.025 + (((tickAnim - 20) / 10) * (-10.025-(-10.025)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -10.025 + (((tickAnim - 30) / 20) * (0-(-10.025)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.5 + (((tickAnim - 20) / 10) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 30) / 20) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.25 + (((tickAnim - 20) / 10) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 39.25 + (((tickAnim - 30) / 20) * (0-(39.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24 + (((tickAnim - 20) / 10) * (-24-(-24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 30) / 20) * (0-(-24)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.5 + (((tickAnim - 20) / 10) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 30) / 20) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.25 + (((tickAnim - 20) / 10) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 39.25 + (((tickAnim - 30) / 20) * (0-(39.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24 + (((tickAnim - 20) / 10) * (-24-(-24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 30) / 20) * (0-(-24)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.75 + (((tickAnim - 20) / 10) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 30) / 20) * (0-(17.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-34.35671-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.07628-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (4.64264-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -34.35671 + (((tickAnim - 20) / 10) * (-34.35671-(-34.35671)));
            yy = -11.07628 + (((tickAnim - 20) / 10) * (-11.07628-(-11.07628)));
            zz = 4.64264 + (((tickAnim - 20) / 10) * (4.64264-(4.64264)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -34.35671 + (((tickAnim - 30) / 20) * (0-(-34.35671)));
            yy = -11.07628 + (((tickAnim - 30) / 20) * (0-(-11.07628)));
            zz = 4.64264 + (((tickAnim - 30) / 20) * (0-(4.64264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.225-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.225 + (((tickAnim - 20) / 10) * (2.225-(2.225)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.225 + (((tickAnim - 30) / 20) * (0-(2.225)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24 + (((tickAnim - 20) / 10) * (24-(24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 30) / 20) * (0-(24)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
            zz = -0.225 + (((tickAnim - 20) / 10) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
            zz = -0.225 + (((tickAnim - 30) / 20) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.75 + (((tickAnim - 20) / 10) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 30) / 20) * (0-(17.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-34.35671-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (11.07628-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.64264-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -34.35671 + (((tickAnim - 20) / 10) * (-34.35671-(-34.35671)));
            yy = 11.07628 + (((tickAnim - 20) / 10) * (11.07628-(11.07628)));
            zz = -4.64264 + (((tickAnim - 20) / 10) * (-4.64264-(-4.64264)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -34.35671 + (((tickAnim - 30) / 20) * (0-(-34.35671)));
            yy = 11.07628 + (((tickAnim - 30) / 20) * (0-(11.07628)));
            zz = -4.64264 + (((tickAnim - 30) / 20) * (0-(-4.64264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.225-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.225 + (((tickAnim - 20) / 10) * (2.225-(2.225)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.225 + (((tickAnim - 30) / 20) * (0-(2.225)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24 + (((tickAnim - 20) / 10) * (24-(24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 30) / 20) * (0-(24)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
            zz = -0.225 + (((tickAnim - 20) / 10) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
            zz = -0.225 + (((tickAnim - 30) / 20) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 20) / 10) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 30) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.5 + (((tickAnim - 20) / 10) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 30) / 20) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 20) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11.5 + (((tickAnim - 20) / 10) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 30) / 20) * (0-(11.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIguanodon entity = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 21.5 + (((tickAnim - 28) / 22) * (0-(21.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 23.75 + (((tickAnim - 28) / 22) * (0-(23.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 14.5 + (((tickAnim - 28) / 12) * (-40.31-(14.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -40.31 + (((tickAnim - 40) / 10) * (0-(-40.31)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (65.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 65.75 + (((tickAnim - 10) / 18) * (44-(65.75)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 44 + (((tickAnim - 28) / 12) * (73.56-(44)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 73.56 + (((tickAnim - 40) / 10) * (0-(73.56)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.285-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.835-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            yy = 0.285 + (((tickAnim - 10) / 18) * (0.85-(0.285)));
            zz = -0.835 + (((tickAnim - 10) / 18) * (-0.725-(-0.835)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0.85 + (((tickAnim - 28) / 12) * (2.105-(0.85)));
            zz = -0.725 + (((tickAnim - 28) / 12) * (-1.22-(-0.725)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 2.105 + (((tickAnim - 40) / 10) * (0-(2.105)));
            zz = -1.22 + (((tickAnim - 40) / 10) * (0-(-1.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-88-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = -88 + (((tickAnim - 10) / 18) * (29.57078-(-88)));
            yy = 0 + (((tickAnim - 10) / 18) * (3.71765-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (4.62831-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 29.57078 + (((tickAnim - 28) / 12) * (14-(29.57078)));
            yy = 3.71765 + (((tickAnim - 28) / 12) * (0-(3.71765)));
            zz = 4.62831 + (((tickAnim - 28) / 12) * (0-(4.62831)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 40) / 10) * (0-(14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.6-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 18) * (0-(0.15)));
            zz = -0.6 + (((tickAnim - 10) / 18) * (0.45-(-0.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0.45 + (((tickAnim - 28) / 12) * (0-(0.45)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIguanodon entity = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.5 + (((tickAnim - 8) / 7) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.75 + (((tickAnim - 8) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.75 + (((tickAnim - 8) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2 + (((tickAnim - 8) / 7) * (0-(-2)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.5 + (((tickAnim - 8) / 7) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-25.7359-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.79152-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-21.60769-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -25.7359 + (((tickAnim - 3) / 5) * (-69.61336-(-25.7359)));
            yy = 2.79152 + (((tickAnim - 3) / 5) * (-2.57832-(2.79152)));
            zz = -21.60769 + (((tickAnim - 3) / 5) * (-22.40286-(-21.60769)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -69.61336 + (((tickAnim - 8) / 7) * (0-(-69.61336)));
            yy = -2.57832 + (((tickAnim - 8) / 7) * (0-(-2.57832)));
            zz = -22.40286 + (((tickAnim - 8) / 7) * (0-(-22.40286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11.53-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 11.53 + (((tickAnim - 3) / 5) * (-25.25-(11.53)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -25.25 + (((tickAnim - 8) / 7) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.32-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.69-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.8-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.32 + (((tickAnim - 3) / 5) * (-0.725-(-0.32)));
            yy = 0.69 + (((tickAnim - 3) / 5) * (1.55-(0.69)));
            zz = 0.8 + (((tickAnim - 3) / 5) * (0-(0.8)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.725 + (((tickAnim - 8) / 7) * (0-(-0.725)));
            yy = 1.55 + (((tickAnim - 8) / 7) * (0-(1.55)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.25 + (((tickAnim - 3) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
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
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 5) * (0-(0.75)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
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
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 4) / 4) * (-46-(10.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -46 + (((tickAnim - 8) / 7) * (0-(-46)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie, opposablePinkie.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.25 + (((tickAnim - 8) / 7) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.25 + (((tickAnim - 8) / 7) * (0-(15.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.925-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -1 + (((tickAnim - 8) / 7) * (0-(-1)));
            zz = 0.925 + (((tickAnim - 8) / 7) * (0-(0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.25 + (((tickAnim - 8) / 7) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 8) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 8) / 7) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 31.75 + (((tickAnim - 8) / 7) * (0-(31.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 8) / 7) * (0-(-0.3)));
            zz = 1.35 + (((tickAnim - 8) / 7) * (0-(1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIguanodon entity = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;
        int animCycle = 312;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-28.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 61) {
            xx = -28.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5 + (((tickAnim - 60) / 1) * (-24.29299-(-28.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5)));
            yy = 0 + (((tickAnim - 60) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 1) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = -24.29299 + (((tickAnim - 61) / 15) * (-21.37-(-24.29299)));
            yy = 0 + (((tickAnim - 61) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 15) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = -21.37 + (((tickAnim - 76) / 196) * (-21.37-(-21.37)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = -21.37 + (((tickAnim - 272) / 18) * (0-(-21.37)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 5 + (((tickAnim - 300) / 13) * (0-(5)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.61-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (3.43-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = -0.61 + (((tickAnim - 23) / 37) * (-1.6-(-0.61)));
            zz = 3.43 + (((tickAnim - 23) / 37) * (7.95-(3.43)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = -1.6 + (((tickAnim - 60) / 16) * (-1.6-(-1.6)));
            zz = 7.95 + (((tickAnim - 60) / 16) * (6.13-(7.95)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            yy = -1.6 + (((tickAnim - 76) / 196) * (-1.6-(-1.6)));
            zz = 6.13 + (((tickAnim - 76) / 196) * (6.13-(6.13)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            yy = -1.6 + (((tickAnim - 272) / 18) * (0-(-1.6)));
            zz = 6.13 + (((tickAnim - 272) / 18) * (0-(6.13)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0.5-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            yy = -0.375 + (((tickAnim - 300) / 13) * (0-(-0.375)));
            zz = 0.5 + (((tickAnim - 300) / 13) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 61) {
            xx = 12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-5 + (((tickAnim - 60) / 1) * (8.125-(12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-5)));
            yy = 0 + (((tickAnim - 60) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 1) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 8.125 + (((tickAnim - 61) / 10) * (2.88-(8.125)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 81) {
            xx = 2.88 + (((tickAnim - 71) / 10) * (-4.62-(2.88)));
            yy = 0 + (((tickAnim - 71) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 10) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 272) {
            xx = -4.62 + (((tickAnim - 81) / 191) * (-4.62-(-4.62)));
            yy = 0 + (((tickAnim - 81) / 191) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 191) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = -4.62 + (((tickAnim - 272) / 18) * (0-(-4.62)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -6 + (((tickAnim - 300) / 13) * (0-(-6)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 4.25 + (((tickAnim - 61) / 10) * (15.38-(4.25)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 81) {
            xx = 15.38 + (((tickAnim - 71) / 10) * (-3.5-(15.38)));
            yy = 0 + (((tickAnim - 71) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 10) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 272) {
            xx = -3.5 + (((tickAnim - 81) / 191) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 81) / 191) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 191) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 281) {
            xx = -3.5 + (((tickAnim - 272) / 9) * (35.25-(-3.5)));
            yy = 0 + (((tickAnim - 272) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 9) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = 35.25 + (((tickAnim - 281) / 9) * (0-(35.25)));
            yy = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 61) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 20) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 61) / 20) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 81) / 191) * (0-(0)));
            yy = -0.275 + (((tickAnim - 81) / 191) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 81) / 191) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            yy = -0.275 + (((tickAnim - 272) / 18) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 13 + (((tickAnim - 61) / 10) * (-31-(13)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 81) {
            xx = -31 + (((tickAnim - 71) / 10) * (17.5-(-31)));
            yy = 0 + (((tickAnim - 71) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 10) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 272) {
            xx = 17.5 + (((tickAnim - 81) / 191) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 81) / 191) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 191) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 281) {
            xx = 17.5 + (((tickAnim - 272) / 9) * (-19.25-(17.5)));
            yy = 0 + (((tickAnim - 272) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 9) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = -19.25 + (((tickAnim - 281) / 9) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 61) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 20) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 61) / 20) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 81) / 191) * (0-(0)));
            yy = -0.625 + (((tickAnim - 81) / 191) * (-0.625-(-0.625)));
            zz = 0 + (((tickAnim - 81) / 191) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            yy = -0.625 + (((tickAnim - 272) / 18) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (65.38-(0)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 81) {
            xx = 65.38 + (((tickAnim - 71) / 10) * (13.75-(65.38)));
            yy = 0 + (((tickAnim - 71) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 10) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 272) {
            xx = 13.75 + (((tickAnim - 81) / 191) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 81) / 191) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 191) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 281) {
            xx = 13.75 + (((tickAnim - 272) / 9) * (58.88-(13.75)));
            yy = 0 + (((tickAnim - 272) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 9) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = 58.88 + (((tickAnim - 281) / 9) * (0-(58.88)));
            yy = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 10) * (1.55-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (-1.225-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 71) / 10) * (0-(0)));
            yy = 1.55 + (((tickAnim - 71) / 10) * (0-(1.55)));
            zz = -1.225 + (((tickAnim - 71) / 10) * (0-(-1.225)));
        }
        else if (tickAnim >= 81 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 81) / 191) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 191) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 191) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 272) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 272) / 9) * (0.975-(0)));
            zz = 0 + (((tickAnim - 272) / 9) * (-0.975-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            yy = 0.975 + (((tickAnim - 281) / 9) * (0-(0.975)));
            zz = -0.975 + (((tickAnim - 281) / 9) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 61) {
            xx = 12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-5 + (((tickAnim - 60) / 1) * (8.125-(12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-5)));
            yy = 0 + (((tickAnim - 60) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 1) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = 8.125 + (((tickAnim - 61) / 15) * (6.88-(8.125)));
            yy = 0 + (((tickAnim - 61) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 15) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 6.88 + (((tickAnim - 76) / 196) * (6.88-(6.88)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 6.88 + (((tickAnim - 272) / 18) * (0-(6.88)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -6 + (((tickAnim - 300) / 13) * (0-(-6)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 4.25 + (((tickAnim - 60) / 16) * (5-(4.25)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 5 + (((tickAnim - 76) / 196) * (5-(5)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 5 + (((tickAnim - 272) / 18) * (0-(5)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 13 + (((tickAnim - 60) / 16) * (8.5-(13)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 8.5 + (((tickAnim - 76) / 196) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 8.5 + (((tickAnim - 272) / 18) * (0-(8.5)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(0), rightLeg4.rotateAngleY + (float) Math.toRadians(0), rightLeg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = -2.75 + (((tickAnim - 60) / 43) * (-1.75-(-2.75)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 43) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 178) {
            xx = -1.75 + (((tickAnim - 103) / 75) * (-2.5-(-1.75)));
            yy = 0 + (((tickAnim - 103) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 75) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 272) {
            xx = -2.5 + (((tickAnim - 178) / 94) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 178) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 94) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = -2.5 + (((tickAnim - 272) / 18) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 43) * (-0.15-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 103) / 169) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 169) * (0-(0)));
            zz = -0.15 + (((tickAnim - 103) / 169) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = -0.15 + (((tickAnim - 272) / 18) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = -4.25 + (((tickAnim - 60) / 43) * (1-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 43) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 123) {
            xx = 1 + (((tickAnim - 103) / 20) * (-1.36714-(1)));
            yy = 0 + (((tickAnim - 103) / 20) * (0.80036-(0)));
            zz = 0 + (((tickAnim - 103) / 20) * (-0.09674-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 143) {
            xx = -1.36714 + (((tickAnim - 123) / 20) * (1-(-1.36714)));
            yy = 0.80036 + (((tickAnim - 123) / 20) * (0-(0.80036)));
            zz = -0.09674 + (((tickAnim - 123) / 20) * (0-(-0.09674)));
        }
        else if (tickAnim >= 143 && tickAnim < 161) {
            xx = 1 + (((tickAnim - 143) / 18) * (-1-(1)));
            yy = 0 + (((tickAnim - 143) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 18) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 178) {
            xx = -1 + (((tickAnim - 161) / 17) * (1.25-(-1)));
            yy = 0 + (((tickAnim - 161) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 17) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 198) {
            xx = 1.25 + (((tickAnim - 178) / 20) * (1-(1.25)));
            yy = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 20) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 217) {
            xx = 1 + (((tickAnim - 198) / 19) * (-1.36714-(1)));
            yy = 0 + (((tickAnim - 198) / 19) * (0.80036-(0)));
            zz = 0 + (((tickAnim - 198) / 19) * (-0.09674-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 237) {
            xx = -1.36714 + (((tickAnim - 217) / 20) * (1-(-1.36714)));
            yy = 0.80036 + (((tickAnim - 217) / 20) * (0-(0.80036)));
            zz = -0.09674 + (((tickAnim - 217) / 20) * (0-(-0.09674)));
        }
        else if (tickAnim >= 237 && tickAnim < 255) {
            xx = 1 + (((tickAnim - 237) / 18) * (-1-(1)));
            yy = 0 + (((tickAnim - 237) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 18) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 272) {
            xx = -1 + (((tickAnim - 255) / 17) * (1.25-(-1)));
            yy = 0 + (((tickAnim - 255) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 17) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 1.25 + (((tickAnim - 272) / 18) * (0-(1.25)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.7-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 1.7 + (((tickAnim - 60) / 43) * (-0.025-(1.7)));
        }
        else if (tickAnim >= 103 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 103) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 95) * (0-(0)));
            zz = -0.025 + (((tickAnim - 103) / 95) * (-0.025-(-0.025)));
        }
        else if (tickAnim >= 198 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 198) / 92) * (0-(0)));
            yy = 0 + (((tickAnim - 198) / 92) * (0-(0)));
            zz = -0.025 + (((tickAnim - 198) / 92) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 15 + (((tickAnim - 60) / 35) * (22.75-(15)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 22.75 + (((tickAnim - 95) / 20) * (20-(22.75)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 133) {
            xx = 20 + (((tickAnim - 115) / 18) * (22-(20)));
            yy = 0 + (((tickAnim - 115) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 18) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 272) {
            xx = 22 + (((tickAnim - 133) / 139) * (22-(22)));
            yy = 0 + (((tickAnim - 133) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 139) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 285) {
            xx = 22 + (((tickAnim - 272) / 13) * (-15.75-(22)));
            yy = 0 + (((tickAnim - 272) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 13) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = -15.75 + (((tickAnim - 285) / 5) * (-7.5-(-15.75)));
            yy = 0 + (((tickAnim - 285) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 5) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -7.5 + (((tickAnim - 290) / 10) * (-13.75-(-7.5)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -13.75 + (((tickAnim - 300) / 13) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 272) {
            xx = -18 + (((tickAnim - 60) / 212) * (-18-(-18)));
            yy = 0 + (((tickAnim - 60) / 212) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 212) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 285) {
            xx = -18 + (((tickAnim - 272) / 13) * (18.09-(-18)));
            yy = 0 + (((tickAnim - 272) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 13) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 18.09 + (((tickAnim - 285) / 5) * (0-(18.09)));
            yy = 0 + (((tickAnim - 285) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 5) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -12.5 + (((tickAnim - 300) / 13) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (1.9-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 60) / 212) * (0-(0)));
            yy = 1.9 + (((tickAnim - 60) / 212) * (1.9-(1.9)));
            zz = 0 + (((tickAnim - 60) / 212) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 272) / 13) * (0-(0)));
            yy = 1.9 + (((tickAnim - 272) / 13) * (-0.53-(1.9)));
            zz = 0 + (((tickAnim - 272) / 13) * (1.075-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 285) / 5) * (0-(0)));
            yy = -0.53 + (((tickAnim - 285) / 5) * (0-(-0.53)));
            zz = 1.075 + (((tickAnim - 285) / 5) * (0-(1.075)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (1.6-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            yy = 1.6 + (((tickAnim - 300) / 13) * (0-(1.6)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (34.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 272) {
            xx = 32.75 + (((tickAnim - 60) / 212) * (32.75-(32.75)));
            yy = 0 + (((tickAnim - 60) / 212) * (0-(0)));
            zz = 34.25 + (((tickAnim - 60) / 212) * (34.25-(34.25)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 32.75 + (((tickAnim - 272) / 18) * (0-(32.75)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 34.25 + (((tickAnim - 272) / 18) * (0-(34.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(0);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(0);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 32.5 + (((tickAnim - 60) / 35) * (24.5-(32.5)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 24.5 + (((tickAnim - 95) / 20) * (30.5-(24.5)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 133) {
            xx = 30.5 + (((tickAnim - 115) / 18) * (28.5-(30.5)));
            yy = 0 + (((tickAnim - 115) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 18) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 272) {
            xx = 28.5 + (((tickAnim - 133) / 139) * (32.5-(28.5)));
            yy = 0 + (((tickAnim - 133) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 139) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 285) {
            xx = 32.5 + (((tickAnim - 272) / 13) * (-15.75-(32.5)));
            yy = 0 + (((tickAnim - 272) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 13) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = -15.75 + (((tickAnim - 285) / 5) * (-7.5-(-15.75)));
            yy = 0 + (((tickAnim - 285) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 5) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -7.5 + (((tickAnim - 290) / 10) * (-13.75-(-7.5)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -13.75 + (((tickAnim - 300) / 13) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 272) {
            xx = -29.5 + (((tickAnim - 60) / 212) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 60) / 212) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 212) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 285) {
            xx = -29.5 + (((tickAnim - 272) / 13) * (18.09-(-29.5)));
            yy = 0 + (((tickAnim - 272) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 13) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 18.09 + (((tickAnim - 285) / 5) * (0-(18.09)));
            yy = 0 + (((tickAnim - 285) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 5) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -12.5 + (((tickAnim - 300) / 13) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (2.35-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 60) / 212) * (0-(0)));
            yy = 2.35 + (((tickAnim - 60) / 212) * (2.35-(2.35)));
            zz = 0 + (((tickAnim - 60) / 212) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 272) / 13) * (0-(0)));
            yy = 2.35 + (((tickAnim - 272) / 13) * (-0.53-(2.35)));
            zz = 0 + (((tickAnim - 272) / 13) * (1.075-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 285) / 5) * (0-(0)));
            yy = -0.53 + (((tickAnim - 285) / 5) * (0-(-0.53)));
            zz = 1.075 + (((tickAnim - 285) / 5) * (0-(1.075)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (1.6-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            yy = 1.6 + (((tickAnim - 300) / 13) * (0-(1.6)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-33.75-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 272) {
            xx = 30.75 + (((tickAnim - 60) / 212) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 60) / 212) * (0-(0)));
            zz = -33.75 + (((tickAnim - 60) / 212) * (-33.75-(-33.75)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 30.75 + (((tickAnim - 272) / 18) * (0-(30.75)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = -33.75 + (((tickAnim - 272) / 18) * (0-(-33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.575-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 60) / 212) * (0-(0)));
            yy = 0.2 + (((tickAnim - 60) / 212) * (0.2-(0.2)));
            zz = -0.575 + (((tickAnim - 60) / 212) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            yy = 0.2 + (((tickAnim - 272) / 18) * (0-(0.2)));
            zz = -0.575 + (((tickAnim - 272) / 18) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 123) {
            xx = -5.75 + (((tickAnim - 60) / 63) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*5-(-5.75)));
            yy = 0 + (((tickAnim - 60) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 63) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 143) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*5 + (((tickAnim - 123) / 20) * (-9.25-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*5)));
            yy = 0 + (((tickAnim - 123) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 20) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 161) {
            xx = -9.25 + (((tickAnim - 143) / 18) * (-12.5-(-9.25)));
            yy = 0 + (((tickAnim - 143) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 18) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 178) {
            xx = -12.5 + (((tickAnim - 161) / 17) * (-14.75-(-12.5)));
            yy = 0 + (((tickAnim - 161) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 17) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 217) {
            xx = -14.75 + (((tickAnim - 178) / 39) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*5-(-14.75)));
            yy = 0 + (((tickAnim - 178) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 39) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 237) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*5 + (((tickAnim - 217) / 20) * (-9.25-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*5)));
            yy = 0 + (((tickAnim - 217) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 20) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 255) {
            xx = -9.25 + (((tickAnim - 237) / 18) * (-12.5-(-9.25)));
            yy = 0 + (((tickAnim - 237) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 18) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 272) {
            xx = -12.5 + (((tickAnim - 255) / 17) * (-14.75-(-12.5)));
            yy = 0 + (((tickAnim - 255) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 17) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = -14.75 + (((tickAnim - 272) / 18) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 2 + (((tickAnim - 300) / 13) * (0-(2)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (-0.8-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 103) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 40) * (0-(0)));
            zz = -0.8 + (((tickAnim - 103) / 40) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 143 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 143) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 55) * (0-(0)));
            zz = -0.8 + (((tickAnim - 143) / 55) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 198 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 198) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 198) / 39) * (0-(0)));
            zz = -0.8 + (((tickAnim - 198) / 39) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 237 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 237) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 63) * (0-(0)));
            zz = -0.8 + (((tickAnim - 237) / 63) * (0-(-0.8)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = 0.25 + (((tickAnim - 60) / 43) * (9.25-(0.25)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 43) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 123) {
            xx = 9.25 + (((tickAnim - 103) / 20) * (13.5-(9.25)));
            yy = 0 + (((tickAnim - 103) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 20) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 143) {
            xx = 13.5 + (((tickAnim - 123) / 20) * (9.25-(13.5)));
            yy = 0 + (((tickAnim - 123) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 20) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 161) {
            xx = 9.25 + (((tickAnim - 143) / 18) * (5-(9.25)));
            yy = 0 + (((tickAnim - 143) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 18) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 178) {
            xx = 5 + (((tickAnim - 161) / 17) * (1.5-(5)));
            yy = 0 + (((tickAnim - 161) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 17) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 198) {
            xx = 1.5 + (((tickAnim - 178) / 20) * (9.25-(1.5)));
            yy = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 20) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 217) {
            xx = 9.25 + (((tickAnim - 198) / 19) * (13.5-(9.25)));
            yy = 0 + (((tickAnim - 198) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 19) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 237) {
            xx = 13.5 + (((tickAnim - 217) / 20) * (9.25-(13.5)));
            yy = 0 + (((tickAnim - 217) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 20) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 255) {
            xx = 9.25 + (((tickAnim - 237) / 18) * (5-(9.25)));
            yy = 0 + (((tickAnim - 237) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 18) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 272) {
            xx = 5 + (((tickAnim - 255) / 17) * (1.5-(5)));
            yy = 0 + (((tickAnim - 255) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 17) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 300) {
            xx = 1.5 + (((tickAnim - 272) / 28) * (-6.5-(1.5)));
            yy = 0 + (((tickAnim - 272) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 28) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -6.5 + (((tickAnim - 300) / 13) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 43) * (-0.6-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 103) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 40) * (0-(0)));
            zz = -0.6 + (((tickAnim - 103) / 40) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 143 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 143) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 35) * (0-(0)));
            zz = -0.6 + (((tickAnim - 143) / 35) * (-0.225-(-0.6)));
        }
        else if (tickAnim >= 178 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            zz = -0.225 + (((tickAnim - 178) / 20) * (-0.6-(-0.225)));
        }
        else if (tickAnim >= 198 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 198) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 198) / 39) * (0-(0)));
            zz = -0.6 + (((tickAnim - 198) / 39) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 237 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 237) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 35) * (0-(0)));
            zz = -0.6 + (((tickAnim - 237) / 35) * (-0.225-(-0.6)));
        }
        else if (tickAnim >= 272 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 272) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 272) / 28) * (0-(0)));
            zz = -0.225 + (((tickAnim - 272) / 28) * (1.075-(-0.225)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 1.075 + (((tickAnim - 300) / 13) * (0-(1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 111) {
            xx = 12.25 + (((tickAnim - 103) / 8) * (6.22-(12.25)));
            yy = 0 + (((tickAnim - 103) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 8) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 123) {
            xx = 6.22 + (((tickAnim - 111) / 12) * (7-(6.22)));
            yy = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 12) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 138) {
            xx = 7 + (((tickAnim - 123) / 15) * (6-(7)));
            yy = 0 + (((tickAnim - 123) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 15) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 6 + (((tickAnim - 138) / 5) * (9.25-(6)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 161) {
            xx = 9.25 + (((tickAnim - 143) / 18) * (12.5-(9.25)));
            yy = 0 + (((tickAnim - 143) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 18) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 178) {
            xx = 12.5 + (((tickAnim - 161) / 17) * (7.25-(12.5)));
            yy = 0 + (((tickAnim - 161) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 17) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 198) {
            xx = 7.25 + (((tickAnim - 178) / 20) * (12.25-(7.25)));
            yy = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 20) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 205) {
            xx = 12.25 + (((tickAnim - 198) / 7) * (6.22-(12.25)));
            yy = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 7) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 217) {
            xx = 6.22 + (((tickAnim - 205) / 12) * (7-(6.22)));
            yy = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 12) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 232) {
            xx = 7 + (((tickAnim - 217) / 15) * (6-(7)));
            yy = 0 + (((tickAnim - 217) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 15) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 237) {
            xx = 6 + (((tickAnim - 232) / 5) * (9.25-(6)));
            yy = 0 + (((tickAnim - 232) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 5) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 255) {
            xx = 9.25 + (((tickAnim - 237) / 18) * (12.5-(9.25)));
            yy = 0 + (((tickAnim - 237) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 18) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 272) {
            xx = 12.5 + (((tickAnim - 255) / 17) * (7.25-(12.5)));
            yy = 0 + (((tickAnim - 255) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 17) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 281) {
            xx = 7.25 + (((tickAnim - 272) / 9) * (-3.87-(7.25)));
            yy = 0 + (((tickAnim - 272) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 9) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = -3.87 + (((tickAnim - 281) / 9) * (0-(-3.87)));
            yy = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -6.25 + (((tickAnim - 300) / 13) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (-1.375-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 103) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 103) / 8) * (0.35-(0.55)));
            zz = -1.375 + (((tickAnim - 103) / 8) * (-1.145-(-1.375)));
        }
        else if (tickAnim >= 111 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            yy = 0.35 + (((tickAnim - 111) / 12) * (0.6-(0.35)));
            zz = -1.145 + (((tickAnim - 111) / 12) * (-1.37-(-1.145)));
        }
        else if (tickAnim >= 123 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 123) / 20) * (0-(0)));
            yy = 0.6 + (((tickAnim - 123) / 20) * (0.55-(0.6)));
            zz = -1.37 + (((tickAnim - 123) / 20) * (-1.375-(-1.37)));
        }
        else if (tickAnim >= 143 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 143) / 18) * (0-(0)));
            yy = 0.55 + (((tickAnim - 143) / 18) * (0.55-(0.55)));
            zz = -1.375 + (((tickAnim - 143) / 18) * (-0.645-(-1.375)));
        }
        else if (tickAnim >= 161 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 161) / 37) * (0-(0)));
            yy = 0.55 + (((tickAnim - 161) / 37) * (0.55-(0.55)));
            zz = -0.645 + (((tickAnim - 161) / 37) * (-1.375-(-0.645)));
        }
        else if (tickAnim >= 198 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            yy = 0.55 + (((tickAnim - 198) / 7) * (0.35-(0.55)));
            zz = -1.375 + (((tickAnim - 198) / 7) * (-1.145-(-1.375)));
        }
        else if (tickAnim >= 205 && tickAnim < 217) {
            xx = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            yy = 0.35 + (((tickAnim - 205) / 12) * (0.6-(0.35)));
            zz = -1.145 + (((tickAnim - 205) / 12) * (-1.37-(-1.145)));
        }
        else if (tickAnim >= 217 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 217) / 20) * (0-(0)));
            yy = 0.6 + (((tickAnim - 217) / 20) * (0.55-(0.6)));
            zz = -1.37 + (((tickAnim - 217) / 20) * (-1.375-(-1.37)));
        }
        else if (tickAnim >= 237 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 237) / 18) * (0-(0)));
            yy = 0.55 + (((tickAnim - 237) / 18) * (0.55-(0.55)));
            zz = -1.375 + (((tickAnim - 237) / 18) * (-0.645-(-1.375)));
        }
        else if (tickAnim >= 255 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 255) / 26) * (0-(0)));
            yy = 0.55 + (((tickAnim - 255) / 26) * (-0.1-(0.55)));
            zz = -0.645 + (((tickAnim - 255) / 26) * (0.435-(-0.645)));
        }
        else if (tickAnim >= 281 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 281) / 32) * (0-(0)));
            yy = -0.1 + (((tickAnim - 281) / 32) * (0-(-0.1)));
            zz = 0.435 + (((tickAnim - 281) / 32) * (0-(0.435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = 35 + (((tickAnim - 60) / 43) * (-4.75-(35)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 43) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 111) {
            xx = -4.75 + (((tickAnim - 103) / 8) * (10.5-(-4.75)));
            yy = 0 + (((tickAnim - 103) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 8) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 123) {
            xx = 10.5 + (((tickAnim - 111) / 12) * (8.75-(10.5)));
            yy = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 12) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 138) {
            xx = 8.75 + (((tickAnim - 123) / 15) * (-3.75-(8.75)));
            yy = 0 + (((tickAnim - 123) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 15) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -3.75 + (((tickAnim - 138) / 5) * (-4.75-(-3.75)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 161) {
            xx = -4.75 + (((tickAnim - 143) / 18) * (9.5-(-4.75)));
            yy = 0 + (((tickAnim - 143) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 18) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 178) {
            xx = 9.5 + (((tickAnim - 161) / 17) * (23.25-(9.5)));
            yy = 0 + (((tickAnim - 161) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 17) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 198) {
            xx = 23.25 + (((tickAnim - 178) / 20) * (-4.75-(23.25)));
            yy = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 20) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 205) {
            xx = -4.75 + (((tickAnim - 198) / 7) * (10.5-(-4.75)));
            yy = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 7) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 217) {
            xx = 10.5 + (((tickAnim - 205) / 12) * (8.75-(10.5)));
            yy = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 12) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 232) {
            xx = 8.75 + (((tickAnim - 217) / 15) * (-3.75-(8.75)));
            yy = 0 + (((tickAnim - 217) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 15) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 237) {
            xx = -3.75 + (((tickAnim - 232) / 5) * (-4.75-(-3.75)));
            yy = 0 + (((tickAnim - 232) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 5) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 255) {
            xx = -4.75 + (((tickAnim - 237) / 18) * (9.5-(-4.75)));
            yy = 0 + (((tickAnim - 237) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 18) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 272) {
            xx = 9.5 + (((tickAnim - 255) / 17) * (23.25-(9.5)));
            yy = 0 + (((tickAnim - 255) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 17) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 281) {
            xx = 23.25 + (((tickAnim - 272) / 9) * (22.63-(23.25)));
            yy = 0 + (((tickAnim - 272) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 9) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = 22.63 + (((tickAnim - 281) / 9) * (-3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(22.63)));
            yy = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 290) / 10) * (0-(-3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.75-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            yy = -0.3 + (((tickAnim - 60) / 43) * (0.275-(-0.3)));
            zz = 1.75 + (((tickAnim - 60) / 43) * (-0.275-(1.75)));
        }
        else if (tickAnim >= 103 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 103) / 8) * (0-(0)));
            yy = 0.275 + (((tickAnim - 103) / 8) * (0-(0.275)));
            zz = -0.275 + (((tickAnim - 103) / 8) * (0.35-(-0.275)));
        }
        else if (tickAnim >= 111 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            zz = 0.35 + (((tickAnim - 111) / 12) * (0.4-(0.35)));
        }
        else if (tickAnim >= 123 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 123) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 20) * (0.275-(0)));
            zz = 0.4 + (((tickAnim - 123) / 20) * (-0.275-(0.4)));
        }
        else if (tickAnim >= 143 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 143) / 18) * (0-(0)));
            yy = 0.275 + (((tickAnim - 143) / 18) * (-0.22-(0.275)));
            zz = -0.275 + (((tickAnim - 143) / 18) * (0.495-(-0.275)));
        }
        else if (tickAnim >= 161 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 161) / 17) * (0-(0)));
            yy = -0.22 + (((tickAnim - 161) / 17) * (-0.22-(-0.22)));
            zz = 0.495 + (((tickAnim - 161) / 17) * (1.145-(0.495)));
        }
        else if (tickAnim >= 178 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            yy = -0.22 + (((tickAnim - 178) / 20) * (0.275-(-0.22)));
            zz = 1.145 + (((tickAnim - 178) / 20) * (-0.275-(1.145)));
        }
        else if (tickAnim >= 198 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 198) / 7) * (0-(0.275)));
            zz = -0.275 + (((tickAnim - 198) / 7) * (0.35-(-0.275)));
        }
        else if (tickAnim >= 205 && tickAnim < 217) {
            xx = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            zz = 0.35 + (((tickAnim - 205) / 12) * (0.4-(0.35)));
        }
        else if (tickAnim >= 217 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 217) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 217) / 20) * (0.275-(0)));
            zz = 0.4 + (((tickAnim - 217) / 20) * (-0.275-(0.4)));
        }
        else if (tickAnim >= 237 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 237) / 18) * (0-(0)));
            yy = 0.275 + (((tickAnim - 237) / 18) * (-0.22-(0.275)));
            zz = -0.275 + (((tickAnim - 237) / 18) * (0.495-(-0.275)));
        }
        else if (tickAnim >= 255 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 255) / 17) * (0-(0)));
            yy = -0.22 + (((tickAnim - 255) / 17) * (-0.22-(-0.22)));
            zz = 0.495 + (((tickAnim - 255) / 17) * (1.145-(0.495)));
        }
        else if (tickAnim >= 272 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 272) / 9) * (0-(0)));
            yy = -0.22 + (((tickAnim - 272) / 9) * (-0.235-(-0.22)));
            zz = 1.145 + (((tickAnim - 272) / 9) * (1.12-(1.145)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            yy = -0.235 + (((tickAnim - 281) / 9) * (0-(-0.235)));
            zz = 1.12 + (((tickAnim - 281) / 9) * (0.625-(1.12)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0.625 + (((tickAnim - 290) / 10) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-20.32-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = -20.32 + (((tickAnim - 60) / 43) * (-11.25-(-20.32)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 43) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 111) {
            xx = -11.25 + (((tickAnim - 103) / 8) * (-16.25-(-11.25)));
            yy = 0 + (((tickAnim - 103) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 8) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 123) {
            xx = -16.25 + (((tickAnim - 111) / 12) * (-3-(-16.25)));
            yy = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 12) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 143) {
            xx = -3 + (((tickAnim - 123) / 20) * (-11.25-(-3)));
            yy = 0 + (((tickAnim - 123) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 20) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 198) {
            xx = -11.25 + (((tickAnim - 143) / 55) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 143) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 55) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 205) {
            xx = -11.25 + (((tickAnim - 198) / 7) * (-16.25-(-11.25)));
            yy = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 7) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 217) {
            xx = -16.25 + (((tickAnim - 205) / 12) * (-3-(-16.25)));
            yy = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 12) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 237) {
            xx = -3 + (((tickAnim - 217) / 20) * (-11.25-(-3)));
            yy = 0 + (((tickAnim - 217) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 20) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 290) {
            xx = -11.25 + (((tickAnim - 237) / 53) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 237) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 111 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 12) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 123) / 82) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 82) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 82) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 217) {
            xx = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 60) / 38) * (16.25-(0)));
            yy = 0 + (((tickAnim - 60) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 38) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 16.25 + (((tickAnim - 98) / 5) * (0-(16.25)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 103) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 8) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 12) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 123) / 15) * (16.25-(0)));
            yy = 0 + (((tickAnim - 123) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 15) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 16.25 + (((tickAnim - 138) / 5) * (0-(16.25)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 143) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 39) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 192) {
            xx = 0 + (((tickAnim - 182) / 10) * (16.25-(0)));
            yy = 0 + (((tickAnim - 182) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 10) * (0-(0)));
        }
        else if (tickAnim >= 192 && tickAnim < 198) {
            xx = 16.25 + (((tickAnim - 192) / 6) * (0-(16.25)));
            yy = 0 + (((tickAnim - 192) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 192) / 6) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 7) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 217) {
            xx = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 12) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 232) {
            xx = 0 + (((tickAnim - 217) / 15) * (16.25-(0)));
            yy = 0 + (((tickAnim - 217) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 15) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 237) {
            xx = 16.25 + (((tickAnim - 232) / 5) * (0-(16.25)));
            yy = 0 + (((tickAnim - 232) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = -1 + (((tickAnim - 60) / 16) * (-2.5-(-1)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = -2.5 + (((tickAnim - 76) / 196) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = -2.5 + (((tickAnim - 272) / 18) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0.5-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0.5 + (((tickAnim - 300) / 13) * (0-(0.5)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0.75 + (((tickAnim - 60) / 16) * (0.25-(0.75)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 0.25 + (((tickAnim - 76) / 196) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 0.25 + (((tickAnim - 272) / 18) * (0-(0.25)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 18) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -1.5 + (((tickAnim - 300) / 13) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-4.85-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 60) {
            xx = -4.85 + (((tickAnim - 16) / 44) * (-2.5-(-4.85)));
            yy = 0 + (((tickAnim - 16) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 44) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = -2.5 + (((tickAnim - 60) / 16) * (-5.25-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = -5.25 + (((tickAnim - 76) / 196) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 277) {
            xx = -5.25 + (((tickAnim - 272) / 5) * (-5.07-(-5.25)));
            yy = 0 + (((tickAnim - 272) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 5) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 300) {
            xx = -5.07 + (((tickAnim - 277) / 23) * (-2.75-(-5.07)));
            yy = 0 + (((tickAnim - 277) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 23) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -2.75 + (((tickAnim - 300) / 13) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15.48-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 45) {
            xx = -15.48 + (((tickAnim - 18) / 27) * (5.8-(-15.48)));
            yy = 0 + (((tickAnim - 18) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 27) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 5.8 + (((tickAnim - 45) / 15) * (12-(5.8)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 12 + (((tickAnim - 60) / 16) * (5-(12)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 5 + (((tickAnim - 76) / 196) * (5-(5)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 277) {
            xx = 5 + (((tickAnim - 272) / 5) * (-4.86-(5)));
            yy = 0 + (((tickAnim - 272) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 5) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 300) {
            xx = -4.86 + (((tickAnim - 277) / 23) * (-14.25-(-4.86)));
            yy = 0 + (((tickAnim - 277) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 23) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -14.25 + (((tickAnim - 300) / 13) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (18.01-(0)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 18.01 + (((tickAnim - 34) / 6) * (20.04-(18.01)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 20.04 + (((tickAnim - 40) / 20) * (11.5-(20.04)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 11.5 + (((tickAnim - 60) / 16) * (23.25-(11.5)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 23.25 + (((tickAnim - 76) / 196) * (23.25-(23.25)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 282) {
            xx = 23.25 + (((tickAnim - 272) / 10) * (-5.68-(23.25)));
            yy = 0 + (((tickAnim - 272) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 10) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 290) {
            xx = -5.68 + (((tickAnim - 282) / 8) * (0-(-5.68)));
            yy = 0 + (((tickAnim - 282) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 8) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -3.25 + (((tickAnim - 300) / 13) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 0) / 76) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 76) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 76) * (-0.45-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = -0.45 + (((tickAnim - 76) / 196) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 272 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 272) / 18) * (0-(0)));
            zz = -0.45 + (((tickAnim - 272) / 18) * (0-(-0.45)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 18) / 33) * (17.75-(0)));
            yy = 0 + (((tickAnim - 18) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 33) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 17.75 + (((tickAnim - 51) / 9) * (14.5-(17.75)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 14.5 + (((tickAnim - 60) / 16) * (11-(14.5)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 272) {
            xx = 11 + (((tickAnim - 76) / 196) * (11-(11)));
            yy = 0 + (((tickAnim - 76) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 196) * (0-(0)));
        }
        else if (tickAnim >= 272 && tickAnim < 277) {
            xx = 11 + (((tickAnim - 272) / 5) * (29.38-(11)));
            yy = 0 + (((tickAnim - 272) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 272) / 5) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 282) {
            xx = 29.38 + (((tickAnim - 277) / 5) * (14.5-(29.38)));
            yy = 0 + (((tickAnim - 277) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 5) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 285) {
            xx = 14.5 + (((tickAnim - 282) / 3) * (0-(14.5)));
            yy = 0 + (((tickAnim - 282) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 3) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 285) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 5) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -2.75 + (((tickAnim - 300) / 13) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail6.rotationPointX = this.tail6.rotationPointX + (float)(xx);
        this.tail6.rotationPointY = this.tail6.rotationPointY - (float)(yy);
        this.tail6.rotationPointZ = this.tail6.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIguanodon entity = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*2 + (((tickAnim - 25) / 20) * (0-(-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*2)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4 + (((tickAnim - 25) / 20) * (0-(1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -5.25 + (((tickAnim - 25) / 20) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -6.5 + (((tickAnim - 25) / 20) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 16 + (((tickAnim - 25) / 10) * (0-(16)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIguanodon entity = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;
        int animCycle = 33;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 26.75 + (((tickAnim - 0) / 6) * (6.24229-(26.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (-2.73092-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.32347-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 6.24229 + (((tickAnim - 6) / 4) * (-15-(6.24229)));
            yy = -2.73092 + (((tickAnim - 6) / 4) * (0-(-2.73092)));
            zz = 0.32347 + (((tickAnim - 6) / 4) * (0-(0.32347)));
        }
        else if (tickAnim >= 10 && tickAnim < 33) {
            xx = -15 + (((tickAnim - 10) / 23) * (26.75-(-15)));
            yy = 0 + (((tickAnim - 10) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.5 + (((tickAnim - 0) / 3) * (25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(13.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 3) / 5) * (-15.1-(25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15.1 + (((tickAnim - 8) / 2) * (-6.5-(-15.1)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 33) {
            xx = -6.5 + (((tickAnim - 10) / 23) * (13.5-(-6.5)));
            yy = 0 + (((tickAnim - 10) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 10) * (0-(0.275)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 10) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 23) * (0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8 + (((tickAnim - 0) / 3) * (-37.19-(8)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -37.19 + (((tickAnim - 3) / 5) * (-37.19-(-37.19)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.19 + (((tickAnim - 8) / 2) * (0.75-(-37.19)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 33) {
            xx = 0.75 + (((tickAnim - 10) / 23) * (8-(0.75)));
            yy = 0 + (((tickAnim - 10) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 33) * (-0.325-(-0.325)));
            zz = -0.175 + (((tickAnim - 0) / 33) * (-0.175-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.75 + (((tickAnim - 0) / 3) * (74.13-(46.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 74.13 + (((tickAnim - 3) / 3) * (64.41-(74.13)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 64.41 + (((tickAnim - 6) / 4) * (24.25-(64.41)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 24.25 + (((tickAnim - 10) / 7) * (2.5-(24.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 2.5 + (((tickAnim - 17) / 5) * (61.68-(2.5)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 61.68 + (((tickAnim - 22) / 11) * (46.75-(61.68)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (3.72-(0.5)));
            zz = -0.725 + (((tickAnim - 0) / 3) * (-1.14-(-0.725)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 3.72 + (((tickAnim - 3) / 3) * (4.195-(3.72)));
            zz = -1.14 + (((tickAnim - 3) / 3) * (-1.14-(-1.14)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 4.195 + (((tickAnim - 6) / 4) * (0.65-(4.195)));
            zz = -1.14 + (((tickAnim - 6) / 4) * (0-(-1.14)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0.65 + (((tickAnim - 10) / 7) * (0.435-(0.65)));
            zz = 0 + (((tickAnim - 10) / 7) * (-0.53-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0.435 + (((tickAnim - 17) / 5) * (1.885-(0.435)));
            zz = -0.53 + (((tickAnim - 17) / 5) * (-1.055-(-0.53)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 1.885 + (((tickAnim - 22) / 11) * (0.5-(1.885)));
            zz = -1.055 + (((tickAnim - 22) / 11) * (-0.725-(-1.055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 32 + (((tickAnim - 0) / 10) * (0-(32)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (-73.54-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -73.54 + (((tickAnim - 22) / 11) * (32-(-73.54)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0.35 + (((tickAnim - 0) / 10) * (0-(0.35)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (-0.175-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 22) / 11) * (0-(0.3)));
            zz = -0.175 + (((tickAnim - 22) / 11) * (0.35-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 0) / 16) * (29.75-(2.5)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 29.75 + (((tickAnim - 16) / 5) * (6.24229-(29.75)));
            yy = 0 + (((tickAnim - 16) / 5) * (-2.73092-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0.32347-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 6.24229 + (((tickAnim - 21) / 6) * (-13.25-(6.24229)));
            yy = -2.73092 + (((tickAnim - 21) / 6) * (0-(-2.73092)));
            zz = 0.32347 + (((tickAnim - 21) / 6) * (0-(0.32347)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -13.25 + (((tickAnim - 27) / 6) * (2.5-(-13.25)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -5 + (((tickAnim - 0) / 16) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 13.5 + (((tickAnim - 16) / 3) * (-1.31+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35-(13.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -1.31+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35 + (((tickAnim - 19) / 5) * (-15.1-(-1.31+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -15.1 + (((tickAnim - 24) / 3) * (-6.5-(-15.1)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -6.5 + (((tickAnim - 27) / 6) * (-5-(-6.5)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = 0.275 + (((tickAnim - 16) / 11) * (0-(0.275)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -7.75 + (((tickAnim - 0) / 16) * (8-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 8 + (((tickAnim - 16) / 3) * (-37.19-(8)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -37.19 + (((tickAnim - 19) / 4) * (-37.19-(-37.19)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -37.19 + (((tickAnim - 23) / 4) * (0.75-(-37.19)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0.75 + (((tickAnim - 27) / 6) * (-7.75-(0.75)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(-0.325);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(-0.175);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10.75 + (((tickAnim - 0) / 6) * (67.3-(10.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 67.3 + (((tickAnim - 6) / 10) * (46.75-(67.3)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 46.75 + (((tickAnim - 16) / 3) * (74.13-(46.75)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 74.13 + (((tickAnim - 19) / 2) * (64.41-(74.13)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 64.41 + (((tickAnim - 21) / 6) * (21.5-(64.41)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 21.5 + (((tickAnim - 27) / 6) * (10.75-(21.5)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 6) * (0.58-(0.65)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.84-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            yy = 0.58 + (((tickAnim - 6) / 10) * (0.5-(0.58)));
            zz = -0.84 + (((tickAnim - 6) / 10) * (-0.725-(-0.84)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 16) / 3) * (3.72-(0.5)));
            zz = -0.725 + (((tickAnim - 16) / 3) * (-1.14-(-0.725)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 3.72 + (((tickAnim - 19) / 2) * (4.195-(3.72)));
            zz = -1.14 + (((tickAnim - 19) / 2) * (-1.14-(-1.14)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 4.195 + (((tickAnim - 21) / 6) * (0.65-(4.195)));
            zz = -1.14 + (((tickAnim - 21) / 6) * (0-(-1.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -15.5 + (((tickAnim - 0) / 7) * (4.5-(-15.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 4.5 + (((tickAnim - 7) / 4) * (-48.5615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(4.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (-0.0661-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-6.25046-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -48.5615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 11) / 5) * (-53.75-(-48.5615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = -0.0661 + (((tickAnim - 11) / 5) * (0-(-0.0661)));
            zz = -6.25046 + (((tickAnim - 11) / 5) * (0-(-6.25046)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = -53.75 + (((tickAnim - 16) / 17) * (-15.5-(-53.75)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 21.65509 + (((tickAnim - 0) / 7) * (28.65509-(21.65509)));
            yy = -0.38211 + (((tickAnim - 0) / 7) * (-0.38211-(-0.38211)));
            zz = 4.93943 + (((tickAnim - 0) / 7) * (4.93943-(4.93943)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 28.65509 + (((tickAnim - 7) / 4) * (28.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-55-(28.65509)));
            yy = -0.38211 + (((tickAnim - 7) / 4) * (-0.18196-(-0.38211)));
            zz = 4.93943 + (((tickAnim - 7) / 4) * (2.35211-(4.93943)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 28.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-55 + (((tickAnim - 11) / 5) * (29.75-(28.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-55)));
            yy = -0.18196 + (((tickAnim - 11) / 5) * (0-(-0.18196)));
            zz = 2.35211 + (((tickAnim - 11) / 5) * (0-(2.35211)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 29.75 + (((tickAnim - 16) / 17) * (21.65509-(29.75)));
            yy = 0 + (((tickAnim - 16) / 17) * (-0.38211-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (4.93943-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 7) * (-0.295-(0.275)));
            zz = 0.625 + (((tickAnim - 0) / 7) * (0.55-(0.625)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -0.295 + (((tickAnim - 7) / 4) * (1.825-(-0.295)));
            zz = 0.55 + (((tickAnim - 7) / 4) * (0.26-(0.55)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (1.025-(0)));
            yy = 1.825 + (((tickAnim - 11) / 5) * (-1.15-(1.825)));
            zz = 0.26 + (((tickAnim - 11) / 5) * (0.625-(0.26)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = 1.025 + (((tickAnim - 16) / 13) * (0-(1.025)));
            yy = -1.15 + (((tickAnim - 16) / 13) * (0.48-(-1.15)));
            zz = 0.625 + (((tickAnim - 16) / 13) * (0.63-(0.625)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.48 + (((tickAnim - 29) / 4) * (0.275-(0.48)));
            zz = 0.63 + (((tickAnim - 29) / 4) * (0.625-(0.63)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -58 + (((tickAnim - 0) / 23) * (2.5-(-58)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 2.5 + (((tickAnim - 23) / 5) * (-24.0865+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(2.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (-0.0661-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (-6.25046-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -24.0865+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 28) / 5) * (-58-(-24.0865+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = -0.0661 + (((tickAnim - 28) / 5) * (0-(-0.0661)));
            zz = -6.25046 + (((tickAnim - 28) / 5) * (0-(-6.25046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 31.25 + (((tickAnim - 0) / 23) * (28.65509-(31.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.38211-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-4.93943-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 28.65509 + (((tickAnim - 23) / 5) * (-48.056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*55-(28.65509)));
            yy = 0.38211 + (((tickAnim - 23) / 5) * (-0.18196-(0.38211)));
            zz = -4.93943 + (((tickAnim - 23) / 5) * (2.35211-(-4.93943)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -48.056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*55 + (((tickAnim - 28) / 5) * (31.25-(-48.056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*55)));
            yy = -0.18196 + (((tickAnim - 28) / 5) * (0-(-0.18196)));
            zz = 2.35211 + (((tickAnim - 28) / 5) * (0-(2.35211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.85 + (((tickAnim - 0) / 10) * (0-(-0.85)));
            yy = -1.15 + (((tickAnim - 0) / 10) * (-0.285-(-1.15)));
            zz = 0.625 + (((tickAnim - 0) / 10) * (0.6-(0.625)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = -0.285 + (((tickAnim - 10) / 13) * (-0.295-(-0.285)));
            zz = 0.6 + (((tickAnim - 10) / 13) * (0.55-(0.6)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.295 + (((tickAnim - 23) / 5) * (1.825-(-0.295)));
            zz = 0.55 + (((tickAnim - 23) / 5) * (0.26-(0.55)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (-0.85-(0)));
            yy = 1.825 + (((tickAnim - 28) / 5) * (-1.15-(1.825)));
            zz = 0.26 + (((tickAnim - 28) / 5) * (0.625-(0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.65672 + (((tickAnim - 0) / 10) * (-1.45766-(12.65672)));
            yy = 9.81378 + (((tickAnim - 0) / 10) * (6.42972-(9.81378)));
            zz = -18.88315 + (((tickAnim - 0) / 10) * (-12.37172-(-18.88315)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -1.45766 + (((tickAnim - 10) / 13) * (0-(-1.45766)));
            yy = 6.42972 + (((tickAnim - 10) / 13) * (0-(6.42972)));
            zz = -12.37172 + (((tickAnim - 10) / 13) * (0-(-12.37172)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (20.58413-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (25.5253-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (-27.34212-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 20.58413 + (((tickAnim - 28) / 5) * (12.65672-(20.58413)));
            yy = 25.5253 + (((tickAnim - 28) / 5) * (9.81378-(25.5253)));
            zz = -27.34212 + (((tickAnim - 28) / 5) * (-18.88315-(-27.34212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 10) * (1.01-(0.55)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 1.01 + (((tickAnim - 10) / 13) * (0-(1.01)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.32-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.32 + (((tickAnim - 28) / 5) * (0.55-(0.32)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (-83.84-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -83.84 + (((tickAnim - 6) / 10) * (32-(-83.84)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 32 + (((tickAnim - 16) / 11) * (0-(32)));
            yy = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.105-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 6) / 10) * (0-(0.075)));
            zz = -0.105 + (((tickAnim - 6) / 10) * (0.35-(-0.105)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            zz = 0.35 + (((tickAnim - 16) / 11) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.58837 + (((tickAnim - 0) / 7) * (0-(-0.58837)));
            yy = -1.94277 + (((tickAnim - 0) / 7) * (0-(-1.94277)));
            zz = 8.66904 + (((tickAnim - 0) / 7) * (0-(8.66904)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (20.58413-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (-25.5253-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (27.34212-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 20.58413 + (((tickAnim - 11) / 5) * (12.65672-(20.58413)));
            yy = -25.5253 + (((tickAnim - 11) / 5) * (-9.81378-(-25.5253)));
            zz = 27.34212 + (((tickAnim - 11) / 5) * (18.88315-(27.34212)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 12.65672 + (((tickAnim - 16) / 17) * (-0.58837-(12.65672)));
            yy = -9.81378 + (((tickAnim - 16) / 17) * (-1.94277-(-9.81378)));
            zz = 18.88315 + (((tickAnim - 16) / 17) * (8.66904-(18.88315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 7) * (0-(0.675)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.32-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0.32 + (((tickAnim - 11) / 5) * (0.55-(0.32)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = 0.55 + (((tickAnim - 16) / 17) * (0.675-(0.55)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-35.25-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -35.25 + (((tickAnim - 14) / 5) * (0-(-35.25)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie, opposablePinkie.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5))*2.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-30))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-100))*-0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-150))*-1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-50))*-2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-80))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-190))*2.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-130))*4));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-150))*-3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-180))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-220))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-230))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-270))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-260))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-350))*-2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5+150))*-2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5+150))*3), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-50))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5+200))*-4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-100))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5+250))*6), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-100))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5+300))*8), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-150))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5+370))*-10), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-150))*2));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIguanodon entity = (EntityPrehistoricFloraIguanodon) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 22.75 + (((tickAnim - 0) / 8) * (6.24229-(22.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.73092-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.32347-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 6.24229 + (((tickAnim - 8) / 8) * (-10.25-(6.24229)));
            yy = -2.73092 + (((tickAnim - 8) / 8) * (0-(-2.73092)));
            zz = 0.32347 + (((tickAnim - 8) / 8) * (0-(0.32347)));
        }
        else if (tickAnim >= 16 && tickAnim < 60) {
            xx = -10.25 + (((tickAnim - 16) / 44) * (22.75-(-10.25)));
            yy = 0 + (((tickAnim - 16) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 13.5 + (((tickAnim - 0) / 4) * (25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(13.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 4) / 9) * (-15.1-(25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -15.1 + (((tickAnim - 13) / 3) * (-6.5-(-15.1)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 60) {
            xx = -6.5 + (((tickAnim - 16) / 44) * (13.5-(-6.5)));
            yy = 0 + (((tickAnim - 16) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 16) * (0-(0.275)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 16) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 44) * (0.275-(0)));
            zz = 0 + (((tickAnim - 16) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 8 + (((tickAnim - 0) / 4) * (-37.19-(8)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -37.19 + (((tickAnim - 4) / 8) * (-37.19-(-37.19)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -37.19 + (((tickAnim - 12) / 4) * (0.75-(-37.19)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 60) {
            xx = 0.75 + (((tickAnim - 16) / 44) * (8-(0.75)));
            yy = 0 + (((tickAnim - 16) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 60) * (-0.325-(-0.325)));
            zz = -0.175 + (((tickAnim - 0) / 60) * (-0.175-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 46.75 + (((tickAnim - 0) / 4) * (74.13-(46.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 74.13 + (((tickAnim - 4) / 4) * (64.41-(74.13)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 64.41 + (((tickAnim - 8) / 8) * (15.75-(64.41)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 15.75 + (((tickAnim - 16) / 9) * (2.5-(15.75)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 2.5 + (((tickAnim - 25) / 8) * (61.68-(2.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 61.68 + (((tickAnim - 33) / 27) * (46.75-(61.68)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 4) * (3.72-(0.5)));
            zz = -0.725 + (((tickAnim - 0) / 4) * (-1.14-(-0.725)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 3.72 + (((tickAnim - 4) / 4) * (4.195-(3.72)));
            zz = -1.14 + (((tickAnim - 4) / 4) * (-1.14-(-1.14)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 4.195 + (((tickAnim - 8) / 8) * (0.65-(4.195)));
            zz = -1.14 + (((tickAnim - 8) / 8) * (0-(-1.14)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0.65 + (((tickAnim - 16) / 9) * (0.435-(0.65)));
            zz = 0 + (((tickAnim - 16) / 9) * (-0.53-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0.435 + (((tickAnim - 25) / 8) * (1.885-(0.435)));
            zz = -0.53 + (((tickAnim - 25) / 8) * (-1.055-(-0.53)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            yy = 1.885 + (((tickAnim - 33) / 27) * (0.5-(1.885)));
            zz = -1.055 + (((tickAnim - 33) / 27) * (-0.725-(-1.055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 32 + (((tickAnim - 0) / 16) * (0-(32)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (-73.54-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = -73.54 + (((tickAnim - 33) / 27) * (32-(-73.54)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0.35 + (((tickAnim - 0) / 16) * (0-(0.35)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0.3-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (-0.175-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            yy = 0.3 + (((tickAnim - 33) / 27) * (0-(0.3)));
            zz = -0.175 + (((tickAnim - 33) / 27) * (0.35-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 2.5 + (((tickAnim - 0) / 29) * (22.75-(2.5)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 22.75 + (((tickAnim - 29) / 8) * (6.24229-(22.75)));
            yy = 0 + (((tickAnim - 29) / 8) * (-2.73092-(0)));
            zz = 0 + (((tickAnim - 29) / 8) * (0.32347-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 6.24229 + (((tickAnim - 37) / 7) * (-10.25-(6.24229)));
            yy = -2.73092 + (((tickAnim - 37) / 7) * (0-(-2.73092)));
            zz = 0.32347 + (((tickAnim - 37) / 7) * (0-(0.32347)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -10.25 + (((tickAnim - 44) / 16) * (2.5-(-10.25)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = -5 + (((tickAnim - 0) / 29) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 13.5 + (((tickAnim - 29) / 4) * (25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35-(13.5)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35 + (((tickAnim - 33) / 8) * (-15.1-(25.44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = -15.1 + (((tickAnim - 41) / 3) * (-6.5-(-15.1)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -6.5 + (((tickAnim - 44) / 16) * (-5-(-6.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 29) / 15) * (0-(0)));
            yy = 0.275 + (((tickAnim - 29) / 15) * (0-(0.275)));
            zz = 0 + (((tickAnim - 29) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = -7.75 + (((tickAnim - 0) / 29) * (8-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 29) / 4) * (-37.19-(8)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -37.19 + (((tickAnim - 33) / 5) * (-37.19-(-37.19)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -37.19 + (((tickAnim - 38) / 6) * (0.75-(-37.19)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0.75 + (((tickAnim - 44) / 16) * (-7.75-(0.75)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(-0.325);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(-0.175);



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 10.75 + (((tickAnim - 0) / 14) * (67.3-(10.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = 67.3 + (((tickAnim - 14) / 15) * (46.75-(67.3)));
            yy = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 15) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 46.75 + (((tickAnim - 29) / 4) * (74.13-(46.75)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 74.13 + (((tickAnim - 33) / 4) * (64.41-(74.13)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 64.41 + (((tickAnim - 37) / 7) * (15.5-(64.41)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 15.5 + (((tickAnim - 44) / 16) * (10.75-(15.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 14) * (0.58-(0.65)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.84-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            yy = 0.58 + (((tickAnim - 14) / 15) * (0.5-(0.58)));
            zz = -0.84 + (((tickAnim - 14) / 15) * (-0.725-(-0.84)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 29) / 4) * (3.72-(0.5)));
            zz = -0.725 + (((tickAnim - 29) / 4) * (-1.14-(-0.725)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 3.72 + (((tickAnim - 33) / 4) * (4.195-(3.72)));
            zz = -1.14 + (((tickAnim - 33) / 4) * (-1.14-(-1.14)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            yy = 4.195 + (((tickAnim - 37) / 7) * (0.65-(4.195)));
            zz = -1.14 + (((tickAnim - 37) / 7) * (0-(-1.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -17.75 + (((tickAnim - 0) / 14) * (-4.5-(-17.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -4.5 + (((tickAnim - 14) / 8) * (-48.5615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(-4.5)));
            yy = 0 + (((tickAnim - 14) / 8) * (-0.0661-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (-6.25046-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -48.5615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 22) / 7) * (-48-(-48.5615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = -0.0661 + (((tickAnim - 22) / 7) * (0-(-0.0661)));
            zz = -6.25046 + (((tickAnim - 22) / 7) * (0-(-6.25046)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = -48 + (((tickAnim - 29) / 31) * (-17.75-(-48)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 21.65509 + (((tickAnim - 0) / 14) * (28.65509-(21.65509)));
            yy = -0.38211 + (((tickAnim - 0) / 14) * (-0.38211-(-0.38211)));
            zz = 4.93943 + (((tickAnim - 0) / 14) * (4.93943-(4.93943)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 28.65509 + (((tickAnim - 14) / 8) * (45.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-55-(28.65509)));
            yy = -0.38211 + (((tickAnim - 14) / 8) * (-0.18196-(-0.38211)));
            zz = 4.93943 + (((tickAnim - 14) / 8) * (2.35211-(4.93943)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 45.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-55 + (((tickAnim - 22) / 7) * (20.25-(45.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-55)));
            yy = -0.18196 + (((tickAnim - 22) / 7) * (0-(-0.18196)));
            zz = 2.35211 + (((tickAnim - 22) / 7) * (0-(2.35211)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 20.25 + (((tickAnim - 29) / 31) * (21.65509-(20.25)));
            yy = 0 + (((tickAnim - 29) / 31) * (-0.38211-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (4.93943-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 14) * (-0.295-(0.275)));
            zz = 0.625 + (((tickAnim - 0) / 14) * (0.55-(0.625)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -0.295 + (((tickAnim - 14) / 8) * (1.825-(-0.295)));
            zz = 0.55 + (((tickAnim - 14) / 8) * (0.26-(0.55)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 1.825 + (((tickAnim - 22) / 7) * (-1.15-(1.825)));
            zz = 0.26 + (((tickAnim - 22) / 7) * (0.625-(0.26)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            yy = -1.15 + (((tickAnim - 29) / 14) * (0.48-(-1.15)));
            zz = 0.625 + (((tickAnim - 29) / 14) * (0.63-(0.625)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 0.48 + (((tickAnim - 43) / 17) * (0.275-(0.48)));
            zz = 0.63 + (((tickAnim - 43) / 17) * (0.625-(0.63)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = -48 + (((tickAnim - 0) / 44) * (-4.5-(-48)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -4.5 + (((tickAnim - 44) / 9) * (-46.0365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(-4.5)));
            yy = 0 + (((tickAnim - 44) / 9) * (-0.0661-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (-6.25046-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -46.0365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 53) / 7) * (-48-(-46.0365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = -0.0661 + (((tickAnim - 53) / 7) * (0-(-0.0661)));
            zz = -6.25046 + (((tickAnim - 53) / 7) * (0-(-6.25046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 20.25 + (((tickAnim - 0) / 44) * (28.65509-(20.25)));
            yy = 0 + (((tickAnim - 0) / 44) * (0.38211-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (-4.93943-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 28.65509 + (((tickAnim - 44) / 9) * (45.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*55-(28.65509)));
            yy = 0.38211 + (((tickAnim - 44) / 9) * (-0.18196-(0.38211)));
            zz = -4.93943 + (((tickAnim - 44) / 9) * (2.35211-(-4.93943)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 45.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*55 + (((tickAnim - 53) / 7) * (20.25-(45.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*55)));
            yy = -0.18196 + (((tickAnim - 53) / 7) * (0-(-0.18196)));
            zz = 2.35211 + (((tickAnim - 53) / 7) * (0-(2.35211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 15) * (-0.285-(-1.15)));
            zz = 0.625 + (((tickAnim - 0) / 15) * (0.6-(0.625)));
        }
        else if (tickAnim >= 15 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 15) / 29) * (0-(0)));
            yy = -0.285 + (((tickAnim - 15) / 29) * (-0.295-(-0.285)));
            zz = 0.6 + (((tickAnim - 15) / 29) * (0.55-(0.6)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = -0.295 + (((tickAnim - 44) / 9) * (1.825-(-0.295)));
            zz = 0.55 + (((tickAnim - 44) / 9) * (0.26-(0.55)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 1.825 + (((tickAnim - 53) / 7) * (-1.15-(1.825)));
            zz = 0.26 + (((tickAnim - 53) / 7) * (0.625-(0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 12.65672 + (((tickAnim - 0) / 15) * (-1.45766-(12.65672)));
            yy = 9.81378 + (((tickAnim - 0) / 15) * (6.42972-(9.81378)));
            zz = -18.88315 + (((tickAnim - 0) / 15) * (-12.37172-(-18.88315)));
        }
        else if (tickAnim >= 15 && tickAnim < 44) {
            xx = -1.45766 + (((tickAnim - 15) / 29) * (0-(-1.45766)));
            yy = 6.42972 + (((tickAnim - 15) / 29) * (0-(6.42972)));
            zz = -12.37172 + (((tickAnim - 15) / 29) * (0-(-12.37172)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (20.58413-(0)));
            yy = 0 + (((tickAnim - 44) / 9) * (25.5253-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (-27.34212-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 20.58413 + (((tickAnim - 53) / 7) * (12.65672-(20.58413)));
            yy = 25.5253 + (((tickAnim - 53) / 7) * (9.81378-(25.5253)));
            zz = -27.34212 + (((tickAnim - 53) / 7) * (-18.88315-(-27.34212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 15) * (1.01-(0.55)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 15) / 29) * (0-(0)));
            yy = 1.01 + (((tickAnim - 15) / 29) * (0-(1.01)));
            zz = 0 + (((tickAnim - 15) / 29) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 9) * (0.32-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0.32 + (((tickAnim - 53) / 7) * (0.55-(0.32)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-83.84-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = -83.84 + (((tickAnim - 14) / 15) * (32-(-83.84)));
            yy = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 15) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 44) {
            xx = 32 + (((tickAnim - 29) / 15) * (0-(32)));
            yy = 0 + (((tickAnim - 29) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.105-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            yy = 0.075 + (((tickAnim - 14) / 15) * (0-(0.075)));
            zz = -0.105 + (((tickAnim - 14) / 15) * (0.35-(-0.105)));
        }
        else if (tickAnim >= 29 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 29) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 15) * (0-(0)));
            zz = 0.35 + (((tickAnim - 29) / 15) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -0.58837 + (((tickAnim - 0) / 14) * (0-(-0.58837)));
            yy = -1.94277 + (((tickAnim - 0) / 14) * (0-(-1.94277)));
            zz = 8.66904 + (((tickAnim - 0) / 14) * (0-(8.66904)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (20.58413-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (-25.5253-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (27.34212-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 20.58413 + (((tickAnim - 22) / 7) * (12.65672-(20.58413)));
            yy = -25.5253 + (((tickAnim - 22) / 7) * (-9.81378-(-25.5253)));
            zz = 27.34212 + (((tickAnim - 22) / 7) * (18.88315-(27.34212)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 12.65672 + (((tickAnim - 29) / 31) * (-0.58837-(12.65672)));
            yy = -9.81378 + (((tickAnim - 29) / 31) * (-1.94277-(-9.81378)));
            zz = 18.88315 + (((tickAnim - 29) / 31) * (8.66904-(18.88315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 14) * (0-(0.675)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0.32-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0.32 + (((tickAnim - 22) / 7) * (0.55-(0.32)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = 0.55 + (((tickAnim - 29) / 31) * (0.675-(0.55)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (-35.25-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -35.25 + (((tickAnim - 22) / 7) * (0-(-35.25)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie, opposablePinkie.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5))*1.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*-0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*-0.35);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*-1.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-190))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-130))*3));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*-2.3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-180))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-220))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-230))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-270))*-1.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-260))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-350))*-1.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+150))*-1), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+150))*2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+200))*-3), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+250))*4), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+300))*5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+370))*-6), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*2));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraIguanodon e = (EntityPrehistoricFloraIguanodon) entity;
        animator.update(entity);


    }
}
