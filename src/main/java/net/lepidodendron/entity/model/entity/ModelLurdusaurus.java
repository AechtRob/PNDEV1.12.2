package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLurdusaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLurdusaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer opposablePinkie2;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer opposablePinkie3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r67;
    private ModelAnimator animator;

    public ModelLurdusaurus() {
        this.textureWidth = 160;
        this.textureHeight = 176;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 7.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.6F, -0.4F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 59, -2.0F, -6.0F, 3.0F, 4, 5, 18, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.85F, -0.5F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1134F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 148, -6.0F, 7.0F, 3.0F, 12, 3, 18, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, -6.0F, -6.0F, 3.0F, 12, 13, 18, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.0F, -2.2F, 6.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3491F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 2.5186F, 1.2984F);
        this.rightLeg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 0, -3.0F, -5.0285F, -3.0408F, 6, 17, 10, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 13.9F, 1.75F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0036F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.2686F, 1.6734F);
        this.rightLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 100, 118, -3.0F, -6.0285F, -3.0408F, 5, 15, 5, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 12.25F, 2.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9599F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 6.0186F, -0.3266F);
        this.rightLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 132, -3.0F, -7.0285F, -2.0408F, 5, 4, 3, -0.01F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2618F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 5.2686F, -0.0266F);
        this.rightLeg4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 130, 111, -3.5F, -7.0285F, -3.0408F, 6, 3, 4, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.0F, -3.1F);
        this.rightLeg4.addChild(rightLeg5);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 5.2686F, 2.6484F);
        this.rightLeg5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 120, 128, -3.5F, -7.0285F, -7.0408F, 6, 3, 5, 0.01F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(6.0F, -2.2F, 6.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3491F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 2.5186F, 1.2984F);
        this.leftLeg.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 0, -3.0F, -5.0285F, -3.0408F, 6, 17, 10, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 13.9F, 1.75F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0036F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.2686F, 1.6734F);
        this.leftLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 100, 118, -2.0F, -6.0285F, -3.0408F, 5, 15, 5, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 12.25F, 2.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9599F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 6.0186F, -0.3266F);
        this.leftLeg3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 132, -2.0F, -7.0285F, -2.0408F, 5, 4, 3, -0.01F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2618F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 5.2686F, -0.0266F);
        this.leftLeg4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 130, 111, -2.5F, -7.0285F, -3.0408F, 6, 3, 4, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.0F, -3.1F);
        this.leftLeg4.addChild(leftLeg5);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 5.2686F, 2.6484F);
        this.leftLeg5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 120, 128, -2.5F, -7.0285F, -7.0408F, 6, 3, 5, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.35F, 20.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 82, 82, -4.5F, -2.0F, -1.0F, 9, 12, 9, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.6F, -13.225F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0611F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 56, 120, -1.5F, -6.0F, 12.0F, 3, 3, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 8.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 82, -3.5F, -1.25F, -1.0F, 7, 8, 12, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.4F, -13.625F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.096F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 118, -1.5F, -6.0F, 13.0F, 3, 3, 11, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 102, 0, -2.5F, -1.0F, -1.0F, 5, 6, 12, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.075F, -13.625F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 104, 59, -1.0F, -6.0F, 12.3F, 2, 3, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 41, 102, -1.5F, -0.65F, -1.0F, 3, 4, 12, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.4F, -13.625F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 118, 88, -1.0F, -6.0F, 13.0F, 2, 3, 11, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 4.15F, -13.875F);
        this.tail5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0524F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 105, -1.0F, -6.0F, 13.0F, 2, 3, 12, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 11.25F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0873F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.65F, -14.125F);
        this.tail6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0524F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 110, 31, -0.5F, -5.0F, 13.0F, 1, 2, 13, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.8F, 3.1F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -8.0F, -2.0F, -16.0F, 16, 19, 19, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.075F, -18.625F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 100, 103, -2.5F, -6.0F, 3.0F, 5, 5, 10, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.9F, -8.725F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1222F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 110, 46, -2.5F, -6.0F, 3.0F, 5, 5, 7, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.3491F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 69, -6.0F, -1.5F, -9.0F, 12, 11, 10, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 8.95F, 0.5F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.9599F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 38, -6.0F, 1.0F, -11.0F, 12, 8, 13, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 4.275F, -16.25F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1571F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 27, -2.0F, -6.0F, 8.0F, 4, 3, 7, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.25F, -11.825F);
        this.chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0785F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 92, 31, -2.0F, -6.0F, 9.0F, 4, 3, 4, 0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-6.0F, 6.0F, -8.575F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 0.3491F, -0.1745F, 0.1745F);
        this.armright.cubeList.add(new ModelBox(armright, 80, 120, -1.5F, 0.0F, -2.0F, 4, 11, 5, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.75F, 9.75F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, -1.0036F, -0.2618F, 0.3054F);
        this.armright2.cubeList.add(new ModelBox(armright2, 44, 132, -1.5F, -1.0F, -1.75F, 3, 9, 4, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.8143F, 7.7378F, 0.1229F);
        this.armright2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1309F, 0.0F, -0.1745F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 135, -0.2214F, -0.1176F, -1.4996F, 2, 4, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.2786F, -0.0176F, -1.3496F);
        this.rightArm3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.7854F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 128, 136, -0.5F, -1.0903F, -3.9608F, 1, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.2786F, 0.9324F, -2.0746F);
        this.rightArm3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3752F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 112, 138, -0.5F, -0.2903F, -2.4608F, 1, 1, 2, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.2786F, 0.9574F, -1.1746F);
        this.rightArm3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1396F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 74, 132, -0.5F, -1.2903F, -1.4608F, 1, 2, 2, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0639F, 4.1263F, 0.5004F);
        this.rightArm3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.3927F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 120, 136, -0.5F, -0.5F, -2.0F, 1, 2, 3, 0.01F, false));

        this.opposablePinkie2 = new AdvancedModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.2492F, 0.5824F, 1.3494F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.4363F, 0.0F, 0.0F);
        this.opposablePinkie2.cubeList.add(new ModelBox(opposablePinkie2, 40, 90, -0.4206F, -0.3392F, -0.6694F, 1, 4, 1, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(6.0F, 6.0F, -8.575F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.3491F, 0.1745F, -0.1745F);
        this.armleft.cubeList.add(new ModelBox(armleft, 80, 120, -2.5F, 0.0F, -2.0F, 4, 11, 5, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(-0.75F, 9.75F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -1.0036F, 0.2618F, -0.3054F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 44, 132, -1.5F, -1.0F, -1.75F, 3, 9, 4, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.8143F, 7.7378F, 0.1229F);
        this.armleft2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1309F, 0.0F, 0.1745F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 135, -1.7786F, -0.1176F, -1.4996F, 2, 4, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.2786F, -0.0176F, -1.3496F);
        this.leftArm3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.7854F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 128, 136, -0.5F, -1.0903F, -3.9608F, 1, 1, 3, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.2786F, 0.9324F, -2.0746F);
        this.leftArm3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3752F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 112, 138, -0.5F, -0.2903F, -2.4608F, 1, 1, 2, -0.02F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.2786F, 0.9574F, -1.1746F);
        this.leftArm3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1396F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 74, 132, -0.5F, -1.2903F, -1.4608F, 1, 2, 2, -0.01F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.0639F, 4.1263F, 0.5004F);
        this.leftArm3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.3927F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 120, 136, -0.5F, -0.5F, -2.0F, 1, 2, 3, 0.01F, true));

        this.opposablePinkie3 = new AdvancedModelRenderer(this);
        this.opposablePinkie3.setRotationPoint(-0.2492F, 0.5824F, 1.3494F);
        this.leftArm3.addChild(opposablePinkie3);
        this.setRotateAngle(opposablePinkie3, 0.4363F, 0.0F, 0.0F);
        this.opposablePinkie3.cubeList.add(new ModelBox(opposablePinkie3, 40, 90, -0.5794F, -0.3392F, -0.6694F, 1, 4, 1, 0.0F, true));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.25F, -9.0F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.4363F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 118, 74, -3.5F, -1.825F, -5.0F, 7, 8, 6, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.825F, -0.2F);
        this.neck4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1745F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 120, 118, -1.5F, -1.5F, -6.0F, 3, 3, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.675F, -5.0F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.1484F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 72, 103, -2.5F, -2.875F, -7.0F, 5, 8, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -6.75F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.3229F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 120, -2.0F, -2.775F, -6.25F, 4, 7, 8, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.5236F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 44, 69, -1.5F, -2.525F, -3.75F, 3, 7, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -3.4F, -1.9F);
        this.neck.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1963F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 136, 14, -1.5F, 0.0F, -3.0F, 3, 1, 3, -0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -2.525F, 0.95F);
        this.neck.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2967F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 90, 27, -1.5F, 0.0F, -3.0F, 3, 1, 3, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.275F, -3.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 56, 118, -1.5F, 1.625F, -11.775F, 3, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 56, 118, -1.5F, 1.625F, -11.275F, 3, 1, 1, -0.02F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -3.9F, -1.45F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3316F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 104, 74, -1.5F, 1.0F, -3.0F, 3, 1, 4, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -3.625F, -1.15F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1571F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 24, 132, -2.0F, 1.0F, -4.0F, 4, 2, 6, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -1.975F, -7.65F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3229F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 28, 111, -1.0F, 1.0F, -3.5F, 2, 2, 4, 0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 2.175F, -11.875F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1745F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 104, 79, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.025F, -10.65F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.6109F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 84, 136, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -1.325F, -10.4F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.6021F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 58, 139, -1.0F, 1.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -2.725F, -7.6F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4538F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 74, 136, -1.0F, 1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -3.15F, -4.3F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1047F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 10, 135, -1.0F, 1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.075F, -2.2F, -3.9F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0262F, 0.5672F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 138, 34, 0.0F, 1.0F, -1.9F, 1, 2, 2, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.725F, -3.275F, -3.975F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1396F, 0.6632F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 64, 139, 0.0F, 1.0F, -2.7F, 1, 1, 2, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.475F, 1.95F, -4.125F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2094F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 100, 138, 0.0F, -2.0F, -4.85F, 0, 1, 3, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 100, 138, -0.95F, -2.0F, -4.85F, 0, 1, 3, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.975F, 1.95F, -4.05F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0175F, 0.2531F, 0.1004F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 106, 138, 0.0F, -1.5F, -2.35F, 0, 1, 3, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.15F, -3.225F, -4.125F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0873F, 0.0087F, -0.0524F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 140, 0.0F, 1.0F, -0.95F, 1, 1, 2, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.15F, -3.225F, -4.125F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0873F, -0.0087F, 0.0524F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 10, 140, -1.0F, 1.0F, -0.95F, 1, 1, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.725F, -3.275F, -3.975F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1396F, -0.6632F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 64, 139, -1.0F, 1.0F, -2.7F, 1, 1, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.075F, -2.2F, -3.9F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0262F, -0.5672F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 138, 34, -1.0F, 1.0F, -1.9F, 1, 2, 2, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -1.825F, -3.9F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1134F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 28, 105, -1.0F, 1.0F, -3.0F, 2, 2, 4, 0.02F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -0.925F, -0.95F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.384F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 134, 53, -2.0F, 1.0F, -3.0F, 4, 2, 2, 0.02F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.975F, 1.95F, -4.05F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0175F, -0.2531F, -0.1004F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 106, 138, 0.0F, -1.5F, -2.35F, 0, 1, 3, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, -1.075F, 0.4F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.1309F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 132, 58, -2.0F, 0.0F, -3.0F, 4, 3, 4, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.825F, -0.6F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 132, 65, -2.0F, -1.85F, -3.0F, 4, 3, 4, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.4F, -5.525F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.6981F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 138, 31, -1.0F, -1.5F, -5.0F, 2, 1, 2, 0.02F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.725F, -5.25F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.6545F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 138, 28, -1.0F, -1.5F, -5.0F, 2, 1, 2, -0.01F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(1.025F, 0.75F, -2.9F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.3229F, 0.2269F, 0.1004F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 138, 38, 0.0F, -1.5F, -2.35F, 0, 1, 3, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.45F, 1.325F, -3.0F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.3054F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 138, 42, 0.0F, -2.0F, -4.85F, 0, 1, 3, 0.0F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 138, 42, -0.9F, -2.0F, -4.85F, 0, 1, 3, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.75F, 1.325F, -2.35F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.3229F, 0.384F, 0.1004F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 94, 136, 1.0F, -4.275F, -2.15F, 0, 3, 3, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 138, 22, 1.025F, -4.275F, -2.15F, 0, 3, 3, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.25F, 1.6F, -3.0F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.2618F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 136, 0, 1.0F, -4.25F, -5.35F, 0, 3, 4, 0.0F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 136, 7, 1.025F, -4.25F, -5.35F, 0, 3, 4, 0.0F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 136, 7, -0.525F, -4.25F, -5.35F, 0, 3, 4, 0.0F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 136, 0, -0.5F, -4.25F, -5.35F, 0, 3, 4, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.825F, 1.325F, -2.85F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.3229F, 0.384F, 0.1004F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 136, 136, 0.0F, -1.0F, -2.35F, 1, 1, 3, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 138, 18, 0.0F, -1.5F, -2.35F, 1, 1, 3, 0.01F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-1.025F, 0.75F, -2.9F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.3229F, -0.2269F, -0.1004F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 138, 38, 0.0F, -1.5F, -2.35F, 0, 1, 3, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.75F, 1.325F, -2.35F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.3229F, -0.384F, -0.1004F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 138, 22, -1.025F, -4.275F, -2.15F, 0, 3, 3, 0.0F, false));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 94, 136, -1.0F, -4.275F, -2.15F, 0, 3, 3, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.825F, 1.325F, -2.85F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.3229F, -0.384F, -0.1004F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 138, 18, -1.0F, -1.5F, -2.35F, 1, 1, 3, 0.01F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 136, 136, -1.0F, -1.0F, -2.35F, 1, 1, 3, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 1.425F, -3.0F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.2618F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 134, 46, -1.0F, -1.5F, -5.35F, 2, 1, 6, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 1.35F, -3.0F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.2793F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 130, 102, -1.0F, -0.9F, -6.8F, 2, 1, 8, -0.02F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -0.7588F, -4.0878F);
        this.head.addChild(eyes);


        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.05F, -1.8912F, 4.7878F);
        this.eyes.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.1309F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 40, 95, -2.0F, 2.0F, -5.0F, 1, 1, 1, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 40, 95, 1.1F, 2.0F, -5.0F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {

        this.neck.offsetY = 0.0F;
        this.neck.offsetX = 0.0F;
        this.neck.offsetZ = 0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.hips.offsetY = -0.12F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.5F;
        this.hips.offsetX = 0.0F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(150);
        this.hips.rotateAngleX = (float)Math.toRadians(5);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.7F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        EntityPrehistoricFloraLurdusaurus entityLurdusaurus = (EntityPrehistoricFloraLurdusaurus) e;

//        this.faceTarget(f3, f4, 12, Neck1);
//        this.faceTarget(f3, f4, 12, Neck2);
//        this.faceTarget(f3, f4, 12, Neck3);
//        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityLurdusaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityLurdusaurus.getAnimation() == entityLurdusaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityLurdusaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityLurdusaurus.getIsMoving()) {
                    if (entityLurdusaurus.getAnimation() != entityLurdusaurus.EAT_ANIMATION
                        && entityLurdusaurus.getAnimation() != entityLurdusaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityLurdusaurus.getIsFast()) { //Running


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
        this.eyes.setScale(1,1,1);
        EntityPrehistoricFloraLurdusaurus ee = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animBlink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2.5 + (((tickAnim - 8) / 7) * (0.925-(-0.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0.925 + (((tickAnim - 15) / 35) * (7.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0.925)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 7.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 50) / 20) * (0-(7.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.25 + (((tickAnim - 8) / 7) * (-1.575-(-0.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = -1.575 + (((tickAnim - 15) / 35) * (-2.5-(-1.575)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = -2.5 + (((tickAnim - 50) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 15) / 35) * (4.75-(0)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 4.75 + (((tickAnim - 50) / 20) * (0-(4.75)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 15) / 35) * (-11-(0)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = -11 + (((tickAnim - 50) / 20) * (0-(-11)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.425-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.425 + (((tickAnim - 8) / 7) * (0-(1.425)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (12.08-(0)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 12.08 + (((tickAnim - 38) / 12) * (14-(12.08)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 14 + (((tickAnim - 50) / 20) * (0-(14)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0.2025-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (1-(1)));
            yy = 0.2025 + (((tickAnim - 8) / 7) * (1-(0.2025)));
            zz = 1 + (((tickAnim - 8) / 7) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 15) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 23) * (0-(1)));
            zz = 1 + (((tickAnim - 15) / 23) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 38) / 12) * (1-(1)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 1 + (((tickAnim - 38) / 12) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 50) / 20) * (1-(1)));
            yy = 0 + (((tickAnim - 50) / 20) * (1-(0)));
            zz = 1 + (((tickAnim - 50) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
        int animCycle = 73;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*98.3-50))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-2.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*98.3-150))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-2.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*98.3-150))*6), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 22) / 10) * (-5.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-30-(0)));
            yy = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -5.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-30 + (((tickAnim - 32) / 13) * (13.5-(-5.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-30)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 73) {
            xx = 13.5 + (((tickAnim - 45) / 28) * (0-(13.5)));
            yy = 0 + (((tickAnim - 45) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 18.25 + (((tickAnim - 11) / 12) * (0-(18.25)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 23 + (((tickAnim - 11) / 12) * (0-(23)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (36.46-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 36.46 + (((tickAnim - 5) / 6) * (43.25-(36.46)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 43.25 + (((tickAnim - 11) / 2) * (46.73-(43.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 46.73 + (((tickAnim - 13) / 10) * (0-(46.73)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = -0.4 + (((tickAnim - 11) / 12) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.75 + (((tickAnim - 11) / 2) * (0.37-(-10.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0.37 + (((tickAnim - 13) / 5) * (7.95-(0.37)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7.95 + (((tickAnim - 18) / 5) * (0-(7.95)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0.275-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0.275 + (((tickAnim - 18) / 5) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-13-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -13 + (((tickAnim - 10) / 8) * (5.05-(-13)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5.05 + (((tickAnim - 18) / 5) * (0-(5.05)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 18) / 5) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (13.75-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 10) / 3) * (0-(13.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.25 + (((tickAnim - 18) / 15) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 33) / 17) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.275-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -4.275 + (((tickAnim - 18) / 15) * (-4.275-(-4.275)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -4.275 + (((tickAnim - 33) / 17) * (0-(-4.275)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11.5 + (((tickAnim - 18) / 15) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 33) / 17) * (0-(11.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 18) / 15) * (5-(5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 5 + (((tickAnim - 33) / 9) * (-1.37-(5)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -1.37 + (((tickAnim - 42) / 8) * (0-(-1.37)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 5.75 + (((tickAnim - 18) / 7) * (6.75-(5.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 6.75 + (((tickAnim - 25) / 8) * (5.75-(6.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 5.75 + (((tickAnim - 33) / 9) * (23.14-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-30-(5.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 23.14-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-30 + (((tickAnim - 42) / 8) * (0-(23.14-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-30)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 7.75 + (((tickAnim - 18) / 7) * (8.75-(7.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 25) / 8) * (7.75-(8.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 7.75 + (((tickAnim - 33) / 9) * (40.44-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-60-(7.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 40.44-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-60 + (((tickAnim - 42) / 8) * (0-(40.44-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-60)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (-36.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-60-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -36.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-60 + (((tickAnim - 42) / 8) * (0-(-36.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-60)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.0028-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.2531-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.1734-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1.0028 + (((tickAnim - 18) / 15) * (-1.0028-(-1.0028)));
            yy = 0.2531 + (((tickAnim - 18) / 15) * (0.2531-(0.2531)));
            zz = 0.1734 + (((tickAnim - 18) / 15) * (0.1734-(0.1734)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -1.0028 + (((tickAnim - 33) / 17) * (0-(-1.0028)));
            yy = 0.2531 + (((tickAnim - 33) / 17) * (0-(0.2531)));
            zz = 0.1734 + (((tickAnim - 33) / 17) * (0-(0.1734)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 36.5 + (((tickAnim - 18) / 15) * (36.5-(36.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 36.5 + (((tickAnim - 33) / 17) * (0-(36.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-16.9977-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.2569-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.1359-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -16.9977 + (((tickAnim - 18) / 15) * (-16.9977-(-16.9977)));
            yy = -0.2569 + (((tickAnim - 18) / 15) * (-0.2569-(-0.2569)));
            zz = 0.1359 + (((tickAnim - 18) / 15) * (0.1359-(0.1359)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -16.9977 + (((tickAnim - 33) / 17) * (0-(-16.9977)));
            yy = -0.2569 + (((tickAnim - 33) / 17) * (0-(-0.2569)));
            zz = 0.1359 + (((tickAnim - 33) / 17) * (0-(0.1359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -4.25 + (((tickAnim - 18) / 15) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 33) / 17) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10.5 + (((tickAnim - 18) / 15) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 33) / 17) * (0-(10.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.4995-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7.0934-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.2676-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.4995 + (((tickAnim - 18) / 15) * (8.4995-(8.4995)));
            yy = -7.0934 + (((tickAnim - 18) / 15) * (-7.0934-(-7.0934)));
            zz = -6.2676 + (((tickAnim - 18) / 15) * (-6.2676-(-6.2676)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.4995 + (((tickAnim - 33) / 17) * (0-(8.4995)));
            yy = -7.0934 + (((tickAnim - 33) / 17) * (0-(-7.0934)));
            zz = -6.2676 + (((tickAnim - 33) / 17) * (0-(-6.2676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10.5 + (((tickAnim - 18) / 15) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 33) / 17) * (0-(10.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.1753-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (6.1476-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (5.3887-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.1753 + (((tickAnim - 18) / 15) * (8.1753-(8.1753)));
            yy = 6.1476 + (((tickAnim - 18) / 15) * (6.1476-(6.1476)));
            zz = 5.3887 + (((tickAnim - 18) / 15) * (5.3887-(5.3887)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.1753 + (((tickAnim - 33) / 17) * (0-(8.1753)));
            yy = 6.1476 + (((tickAnim - 33) / 17) * (0-(6.1476)));
            zz = 5.3887 + (((tickAnim - 33) / 17) * (0-(5.3887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.0028-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.2531-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.1734-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1.0028 + (((tickAnim - 18) / 15) * (-1.0028-(-1.0028)));
            yy = 0.2531 + (((tickAnim - 18) / 15) * (0.2531-(0.2531)));
            zz = 0.1734 + (((tickAnim - 18) / 15) * (0.1734-(0.1734)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -1.0028 + (((tickAnim - 33) / 17) * (0-(-1.0028)));
            yy = 0.2531 + (((tickAnim - 33) / 17) * (0-(0.2531)));
            zz = 0.1734 + (((tickAnim - 33) / 17) * (0-(0.1734)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 36.5 + (((tickAnim - 18) / 15) * (36.5-(36.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 36.5 + (((tickAnim - 33) / 17) * (0-(36.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-16.9977-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.2569-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.1359-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -16.9977 + (((tickAnim - 18) / 15) * (-16.9977-(-16.9977)));
            yy = -0.2569 + (((tickAnim - 18) / 15) * (-0.2569-(-0.2569)));
            zz = 0.1359 + (((tickAnim - 18) / 15) * (0.1359-(0.1359)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -16.9977 + (((tickAnim - 33) / 17) * (0-(-16.9977)));
            yy = -0.2569 + (((tickAnim - 33) / 17) * (0-(-0.2569)));
            zz = 0.1359 + (((tickAnim - 33) / 17) * (0-(0.1359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -4.25 + (((tickAnim - 18) / 15) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 33) / 17) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
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
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
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
            xx = 0 + (((tickAnim - 0) / 8) * (-3.1416-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.767-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.1454-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.1416 + (((tickAnim - 8) / 7) * (0-(-3.1416)));
            yy = 0.767 + (((tickAnim - 8) / 7) * (0-(0.767)));
            zz = -2.1454 + (((tickAnim - 8) / 7) * (0-(-2.1454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.0947-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-5.1228-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-6.1026-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 17.0947 + (((tickAnim - 8) / 7) * (0-(17.0947)));
            yy = -5.1228 + (((tickAnim - 8) / 7) * (0-(-5.1228)));
            zz = -6.1026 + (((tickAnim - 8) / 7) * (0-(-6.1026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-25.7359-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.79152-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-21.60769-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -25.7359 + (((tickAnim - 3) / 5) * (-44.36336-(-25.7359)));
            yy = 2.79152 + (((tickAnim - 3) / 5) * (-2.57832-(2.79152)));
            zz = -21.60769 + (((tickAnim - 3) / 5) * (-22.40286-(-21.60769)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -44.36336 + (((tickAnim - 8) / 7) * (0-(-44.36336)));
            yy = -2.57832 + (((tickAnim - 8) / 7) * (0-(-2.57832)));
            zz = -22.40286 + (((tickAnim - 8) / 7) * (0-(-22.40286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




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

    }
    public void animBlink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
        int animCycle = 110;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 0) / 30) * (-13.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -13.25 + (((tickAnim - 30) / 50) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = -13.25 + (((tickAnim - 80) / 30) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            yy = 0.925 + (((tickAnim - 30) / 50) * (0.925-(0.925)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            yy = 0.925 + (((tickAnim - 80) / 30) * (0-(0.925)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-2.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-5 + (((tickAnim - 30) / 20) * (-2.25-(-2.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -2.25 + (((tickAnim - 50) / 30) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -2.25 + (((tickAnim - 80) / 15) * (-6.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*130))*10-(-2.25)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -6.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*130))*10 + (((tickAnim - 95) / 15) * (0-(-6.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*130))*10)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0.625-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0.625 + (((tickAnim - 95) / 15) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = -2.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 10) / 40) * (0.75-(-2.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0.75 + (((tickAnim - 50) / 30) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0.75 + (((tickAnim - 80) / 15) * (9.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*10-(0.75)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 9.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*10 + (((tickAnim - 95) / 15) * (0-(9.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*10)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0.55-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0.55 + (((tickAnim - 95) / 15) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*20 + (((tickAnim - 0) / 50) * (-6-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*20)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -6 + (((tickAnim - 50) / 30) * (-6-(-6)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -6 + (((tickAnim - 80) / 15) * (-15.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(-6)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -15.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 95) / 15) * (0-(-15.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.275-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = -0.2 + (((tickAnim - 14) / 16) * (-0.2-(-0.2)));
            zz = 0.275 + (((tickAnim - 14) / 16) * (0.275-(0.275)));
        }
        else if (tickAnim >= 30 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 30) / 80) * (0-(0)));
            yy = -0.2 + (((tickAnim - 30) / 80) * (0-(-0.2)));
            zz = 0.275 + (((tickAnim - 30) / 80) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*130))*-10 + (((tickAnim - 0) / 50) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*130))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (-2.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20-(0)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -2.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20 + (((tickAnim - 95) / 15) * (0-(-2.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-12 + (((tickAnim - 0) / 30) * (11.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-12)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 11.25 + (((tickAnim - 30) / 50) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 11.25 + (((tickAnim - 80) / 15) * (-14.905-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-30-(11.25)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -14.905-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-30 + (((tickAnim - 95) / 15) * (0-(-14.905-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-30)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110))*-10 + (((tickAnim - 0) / 30) * (3.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110))*-10)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 3.25 + (((tickAnim - 30) / 50) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 3.25 + (((tickAnim - 80) / 30) * (0-(3.25)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 7.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-50))*-10 + (((tickAnim - 0) / 30) * (2.5-(7.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-50))*-10)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 30) / 50) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 2.5 + (((tickAnim - 80) / 30) * (0-(2.5)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-190))*5 + (((tickAnim - 0) / 35) * (1.25-(0.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-190))*5)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 1.25 + (((tickAnim - 35) / 10) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 1.25 + (((tickAnim - 45) / 35) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 1.25 + (((tickAnim - 80) / 30) * (0-(1.25)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 4.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-150))*-10 + (((tickAnim - 0) / 30) * (3.375-(4.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-150))*-10)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 3.375 + (((tickAnim - 30) / 5) * (2.75-(3.375)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 80) {
            xx = 2.75 + (((tickAnim - 35) / 45) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 35) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 45) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 2.75 + (((tickAnim - 80) / 30) * (0-(2.75)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -3.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-200))*-10 + (((tickAnim - 0) / 30) * (-0.075-(-3.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-200))*-10)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.075 + (((tickAnim - 30) / 5) * (1-(-0.075)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 35) / 45) * (1-(1)));
            yy = 0 + (((tickAnim - 35) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 45) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 1 + (((tickAnim - 80) / 30) * (0-(1)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -9.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-250))*-10 + (((tickAnim - 0) / 30) * (-1.05-(-9.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-250))*-10)));
            yy = -9.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-250))*-10 + (((tickAnim - 0) / 30) * (0-(-9.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*110-250))*-10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -1.05 + (((tickAnim - 30) / 5) * (1.25-(-1.05)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 80) {
            xx = 1.25 + (((tickAnim - 35) / 45) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 35) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 45) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 1.25 + (((tickAnim - 80) / 30) * (0-(1.25)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (1.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 1.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 9) / 9) * (-18.81-(1.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -18.81 + (((tickAnim - 18) / 12) * (-14.25-(-18.81)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -14.25 + (((tickAnim - 30) / 50) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = -14.25 + (((tickAnim - 80) / 30) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (29.35-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 29.35 + (((tickAnim - 9) / 9) * (-7.5-(29.35)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 18) / 12) * (-11.75-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -11.75 + (((tickAnim - 30) / 50) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -11.75 + (((tickAnim - 80) / 15) * (35.62-(-11.75)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 35.62 + (((tickAnim - 95) / 15) * (0-(35.62)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-24.15-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -24.15 + (((tickAnim - 9) / 9) * (-2.67-(-24.15)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -2.67 + (((tickAnim - 18) / 12) * (-2-(-2.67)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -2 + (((tickAnim - 30) / 50) * (-2-(-2)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -2 + (((tickAnim - 80) / 15) * (-35.5-(-2)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -35.5 + (((tickAnim - 95) / 15) * (0-(-35.5)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (22.33-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 22.33 + (((tickAnim - 3) / 6) * (30.46-(22.33)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 30.46 + (((tickAnim - 9) / 9) * (41.92-(30.46)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 41.92 + (((tickAnim - 18) / 12) * (43.25-(41.92)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 43.25 + (((tickAnim - 30) / 50) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 43.25 + (((tickAnim - 80) / 15) * (40.87-(43.25)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 40.87 + (((tickAnim - 95) / 15) * (0-(40.87)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(0), rightLeg5.rotateAngleY + (float) Math.toRadians(0), rightLeg5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -19.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 10) / 20) * (11.4699-(-19.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 10) / 20) * (-1.7098-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (2.8143-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 11.4699 + (((tickAnim - 30) / 50) * (11.4699-(11.4699)));
            yy = -1.7098 + (((tickAnim - 30) / 50) * (-1.7098-(-1.7098)));
            zz = 2.8143 + (((tickAnim - 30) / 50) * (2.8143-(2.8143)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 11.4699 + (((tickAnim - 80) / 8) * (-11.365-(11.4699)));
            yy = -1.7098 + (((tickAnim - 80) / 8) * (-1.2349-(-1.7098)));
            zz = 2.8143 + (((tickAnim - 80) / 8) * (2.0326-(2.8143)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = -11.365 + (((tickAnim - 88) / 7) * (-23.54-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-30-(-11.365)));
            yy = -1.2349 + (((tickAnim - 88) / 7) * (-0.8549-(-1.2349)));
            zz = 2.0326 + (((tickAnim - 88) / 7) * (1.4072-(2.0326)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -23.54-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-30 + (((tickAnim - 95) / 15) * (0-(-23.54-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-30)));
            yy = -0.8549 + (((tickAnim - 95) / 15) * (0-(-0.8549)));
            zz = 1.4072 + (((tickAnim - 95) / 15) * (0-(1.4072)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (60.9076-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.4392-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-7.3591-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 60.9076-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90 + (((tickAnim - 10) / 20) * (-16.5-(60.9076-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90)));
            yy = -6.4392 + (((tickAnim - 10) / 20) * (0-(-6.4392)));
            zz = -7.3591 + (((tickAnim - 10) / 20) * (0-(-7.3591)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -16.5 + (((tickAnim - 30) / 50) * (-16.5-(-16.5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = -16.5 + (((tickAnim - 80) / 8) * (29.3229-(-16.5)));
            yy = 0 + (((tickAnim - 80) / 8) * (1.3624-(0)));
            zz = 0 + (((tickAnim - 80) / 8) * (-14.8674-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 29.3229 + (((tickAnim - 88) / 7) * (-3-(29.3229)));
            yy = 1.3624 + (((tickAnim - 88) / 7) * (0-(1.3624)));
            zz = -14.8674 + (((tickAnim - 88) / 7) * (0-(-14.8674)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -3 + (((tickAnim - 95) / 15) * (0-(-3)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 95) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 95) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 9) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 95) / 9) * (-0.55-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 104) / 6) * (0-(-0.35)));
            zz = -0.55 + (((tickAnim - 104) / 6) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.92-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.92 + (((tickAnim - 10) / 10) * (24.5-(-3.92)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.5 + (((tickAnim - 20) / 10) * (21.25-(24.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 21.25 + (((tickAnim - 30) / 50) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 21.25 + (((tickAnim - 80) / 8) * (-11.365-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-20-(21.25)));
            yy = 0 + (((tickAnim - 80) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 8) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = -11.365-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-20 + (((tickAnim - 88) / 7) * (22.5-(-11.365-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-20)));
            yy = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 7) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 22.5 + (((tickAnim - 95) / 15) * (0-(22.5)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 10) / 10) * (0.175-(-0.3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            yy = 0.175 + (((tickAnim - 20) / 60) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 80) / 8) * (0-(0)));
            yy = 0.175 + (((tickAnim - 80) / 8) * (-0.255-(0.175)));
            zz = 0 + (((tickAnim - 80) / 8) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 88) / 22) * (0-(0)));
            yy = -0.255 + (((tickAnim - 88) / 22) * (0-(-0.255)));
            zz = 0 + (((tickAnim - 88) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 30) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 40) / 10) * (4-(5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 4 + (((tickAnim - 50) / 5) * (3.25-(4)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 3.25 + (((tickAnim - 55) / 5) * (4-(3.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 4 + (((tickAnim - 60) / 5) * (3.25-(4)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 3.25 + (((tickAnim - 65) / 5) * (4-(3.25)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 4 + (((tickAnim - 70) / 10) * (6-(4)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 6 + (((tickAnim - 80) / 15) * (-6.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(6)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -6.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 95) / 15) * (0-(-6.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.225-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0.225 + (((tickAnim - 30) / 10) * (0.225-(0.225)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            zz = 0.225 + (((tickAnim - 40) / 70) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0.625-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.625 + (((tickAnim - 45) / 5) * (0-(0.625)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (1.5-(0)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 75) / 5) * (0-(1.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -18 + (((tickAnim - 9) / 2) * (-39.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-18)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -39.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 11) / 19) * (8.8843-(-39.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 11) / 19) * (2.4494-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (-4.4442-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 8.8843 + (((tickAnim - 30) / 50) * (8.8843-(8.8843)));
            yy = 2.4494 + (((tickAnim - 30) / 50) * (2.4494-(2.4494)));
            zz = -4.4442 + (((tickAnim - 30) / 50) * (-4.4442-(-4.4442)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 8.8843 + (((tickAnim - 80) / 11) * (-12.793-(8.8843)));
            yy = 2.4494 + (((tickAnim - 80) / 11) * (0.063-(2.4494)));
            zz = -4.4442 + (((tickAnim - 80) / 11) * (-0.2182-(-4.4442)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = -12.793 + (((tickAnim - 91) / 4) * (-17.615-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-20-(-12.793)));
            yy = 0.063 + (((tickAnim - 91) / 4) * (-0.8549-(0.063)));
            zz = -0.2182 + (((tickAnim - 91) / 4) * (1.4072-(-0.2182)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -17.615-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-20 + (((tickAnim - 95) / 15) * (0-(-17.615-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+80))*-20)));
            yy = -0.8549 + (((tickAnim - 95) / 15) * (0-(-0.8549)));
            zz = 1.4072 + (((tickAnim - 95) / 15) * (0-(1.4072)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (31.5949-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (5.5812-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (11.164-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 31.5949 + (((tickAnim - 9) / 2) * (71.6949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90-(31.5949)));
            yy = 5.5812 + (((tickAnim - 9) / 2) * (5.5812-(5.5812)));
            zz = 11.164 + (((tickAnim - 9) / 2) * (11.164-(11.164)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 71.6949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90 + (((tickAnim - 11) / 19) * (-17.5-(71.6949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90)));
            yy = 5.5812 + (((tickAnim - 11) / 19) * (0-(5.5812)));
            zz = 11.164 + (((tickAnim - 11) / 19) * (0-(11.164)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -17.5 + (((tickAnim - 30) / 50) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = -17.5 + (((tickAnim - 80) / 11) * (23.0702-(-17.5)));
            yy = 0 + (((tickAnim - 80) / 11) * (8.8877-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (11.4834-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = 23.0702 + (((tickAnim - 91) / 4) * (-1.5-(23.0702)));
            yy = 8.8877 + (((tickAnim - 91) / 4) * (0-(8.8877)));
            zz = 11.4834 + (((tickAnim - 91) / 4) * (0-(11.4834)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = -1.5 + (((tickAnim - 95) / 12) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 12) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.4 + (((tickAnim - 9) / 2) * (-0.4-(-0.4)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 11) / 69) * (0-(0)));
            yy = -0.4 + (((tickAnim - 11) / 69) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 11) / 69) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (-0.98-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 91) / 4) * (0-(0)));
            yy = -0.98 + (((tickAnim - 91) / 4) * (0-(-0.98)));
            zz = 0 + (((tickAnim - 91) / 4) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 16.25 + (((tickAnim - 30) / 50) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 16.25 + (((tickAnim - 80) / 11) * (-2.12-(16.25)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = -2.12 + (((tickAnim - 91) / 4) * (17.75-(-2.12)));
            yy = 0 + (((tickAnim - 91) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 4) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 17.75 + (((tickAnim - 95) / 12) * (0-(17.75)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 12) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 0) / 30) * (12.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 12.5 + (((tickAnim - 30) / 50) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 12.5 + (((tickAnim - 80) / 30) * (0-(12.5)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 0) / 30) * (4.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 4.25 + (((tickAnim - 30) / 50) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 4.25 + (((tickAnim - 80) / 30) * (0-(4.25)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 0) / 30) * (-2.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -2.75 + (((tickAnim - 30) / 50) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = -2.75 + (((tickAnim - 80) / 30) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(0), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 40) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 5) * (0.015-(1)));
            zz = 1 + (((tickAnim - 40) / 5) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 45) / 5) * (1-(1)));
            yy = 0.015 + (((tickAnim - 45) / 5) * (1-(0.015)));
            zz = 1 + (((tickAnim - 45) / 5) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 50) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
        int animCycle = 440;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 24) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.4 + (((tickAnim - 0) / 24) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.4)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-0.4 + (((tickAnim - 0) / 24) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-50))*-0.4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-0.4)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.4 + (((tickAnim - 24) / 16) * (0.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.4)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-50))*-0.4 + (((tickAnim - 24) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-50))*-0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0.25 + (((tickAnim - 40) / 8) * (-0.25-(0.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = -0.25 + (((tickAnim - 48) / 354) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 439) {
            xx = -0.25 + (((tickAnim - 402) / 37) * (0.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.4-(-0.25)));
            yy = 0 + (((tickAnim - 402) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 37) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-0.4-(0)));
        }
        else if (tickAnim >= 439 && tickAnim < 440) {
            xx = 0.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.4 + (((tickAnim - 439) / 1) * (0-(0.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.4)));
            yy = 0 + (((tickAnim - 439) / 1) * (0-(0)));
            zz = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-0.4 + (((tickAnim - 439) / 1) * (0-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (-7.525-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = -7.525 + (((tickAnim - 24) / 16) * (-12.375-(-7.525)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = -12.375 + (((tickAnim - 40) / 8) * (-12.245-(-12.375)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = -12.245 + (((tickAnim - 48) / 354) * (-12.245-(-12.245)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = -12.245 + (((tickAnim - 402) / 38) * (0-(-12.245)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -1 + (((tickAnim - 10) / 9) * (-0.64-(-1)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -0.64 + (((tickAnim - 19) / 21) * (1-(-0.64)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 40) / 8) * (1.5-(1)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 1.5 + (((tickAnim - 48) / 354) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 1.5 + (((tickAnim - 402) / 38) * (0-(1.5)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.825-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.825 + (((tickAnim - 5) / 5) * (4.5-(1.825)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 4.5 + (((tickAnim - 10) / 9) * (4.92-(4.5)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 4.92 + (((tickAnim - 19) / 21) * (-1.5-(4.92)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = -1.5 + (((tickAnim - 40) / 362) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = -1.5 + (((tickAnim - 402) / 38) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.475-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0.475 + (((tickAnim - 40) / 362) * (0.475-(0.475)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0.475 + (((tickAnim - 402) / 38) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 14.75 + (((tickAnim - 25) / 15) * (22-(14.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 22 + (((tickAnim - 40) / 8) * (0.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(22)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 0.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 48) / 27) * (0-(0.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 27) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 75) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 51) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 126) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 1) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 127) / 33) * (-5.9668-(0)));
            yy = 0 + (((tickAnim - 127) / 33) * (-6.4406-(0)));
            zz = 0 + (((tickAnim - 127) / 33) * (3.851-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 214) {
            xx = -5.9668 + (((tickAnim - 160) / 54) * (-5.9668-(-5.9668)));
            yy = -6.4406 + (((tickAnim - 160) / 54) * (-6.4406-(-6.4406)));
            zz = 3.851 + (((tickAnim - 160) / 54) * (3.851-(3.851)));
        }
        else if (tickAnim >= 214 && tickAnim < 223) {
            xx = -5.9668 + (((tickAnim - 214) / 9) * (-3.6668-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-80))*-20-(-5.9668)));
            yy = -6.4406 + (((tickAnim - 214) / 9) * (-6.4406-(-6.4406)));
            zz = 3.851 + (((tickAnim - 214) / 9) * (3.851-(3.851)));
        }
        else if (tickAnim >= 223 && tickAnim < 260) {
            xx = -3.6668-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-80))*-20 + (((tickAnim - 223) / 37) * (22-(-3.6668-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-80))*-20)));
            yy = -6.4406 + (((tickAnim - 223) / 37) * (0-(-6.4406)));
            zz = 3.851 + (((tickAnim - 223) / 37) * (0-(3.851)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = 22 + (((tickAnim - 260) / 8) * (0.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(22)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 295) {
            xx = 0.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 268) / 27) * (0-(0.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 268) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 27) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 295) / 107) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 107) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 422) {
            xx = 0 + (((tickAnim - 402) / 20) * (3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*3-(0)));
            yy = 0 + (((tickAnim - 402) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 20) * (0-(0)));
        }
        else if (tickAnim >= 422 && tickAnim < 440) {
            xx = 3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*3 + (((tickAnim - 422) / 18) * (0-(3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*3)));
            yy = 0 + (((tickAnim - 422) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 422) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 19 + (((tickAnim - 25) / 15) * (18.25-(19)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 18.25 + (((tickAnim - 40) / 8) * (1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(18.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 48) / 27) * (0-(1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 27) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 75) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 51) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 126) / 1) * (-19.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40))*20-(0)));
            yy = 0 + (((tickAnim - 126) / 1) * (-9.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*38+10))*10-(0)));
            zz = 0 + (((tickAnim - 126) / 1) * (-9.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*38+10))*-10-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 160) {
            xx = -19.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40))*20 + (((tickAnim - 127) / 33) * (-4.4274-(-19.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40))*20)));
            yy = -9.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*38+10))*10 + (((tickAnim - 127) / 33) * (-2.6413-(-9.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*38+10))*10)));
            zz = -9.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*38+10))*-10 + (((tickAnim - 127) / 33) * (-1.4443-(-9.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*38+10))*-10)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = -4.4274 + (((tickAnim - 160) / 15) * (-4.4274-(-4.4274)));
            yy = -2.6413 + (((tickAnim - 160) / 15) * (-2.6413-(-2.6413)));
            zz = -1.4443 + (((tickAnim - 160) / 15) * (-1.4443-(-1.4443)));
        }
        else if (tickAnim >= 175 && tickAnim < 195) {
            xx = -4.4274 + (((tickAnim - 175) / 20) * (-4.4362-(-4.4274)));
            yy = -2.6413 + (((tickAnim - 175) / 20) * (-3.3723-(-2.6413)));
            zz = -1.4443 + (((tickAnim - 175) / 20) * (-1.2762-(-1.4443)));
        }
        else if (tickAnim >= 195 && tickAnim < 214) {
            xx = -4.4362 + (((tickAnim - 195) / 19) * (-4.4362-(-4.4362)));
            yy = -3.3723 + (((tickAnim - 195) / 19) * (-3.3723-(-3.3723)));
            zz = -1.2762 + (((tickAnim - 195) / 19) * (-1.2762-(-1.2762)));
        }
        else if (tickAnim >= 214 && tickAnim < 223) {
            xx = -4.4362 + (((tickAnim - 214) / 9) * (17.0138-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-20-(-4.4362)));
            yy = -3.3723 + (((tickAnim - 214) / 9) * (-3.3723-(-3.3723)));
            zz = -1.2762 + (((tickAnim - 214) / 9) * (-1.2762-(-1.2762)));
        }
        else if (tickAnim >= 223 && tickAnim < 260) {
            xx = 17.0138-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-20 + (((tickAnim - 223) / 37) * (18.25-(17.0138-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-20)));
            yy = -3.3723 + (((tickAnim - 223) / 37) * (0-(-3.3723)));
            zz = -1.2762 + (((tickAnim - 223) / 37) * (0-(-1.2762)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = 18.25 + (((tickAnim - 260) / 8) * (1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(18.25)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 295) {
            xx = 1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 268) / 27) * (0-(1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 268) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 27) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 295) / 107) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 107) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 422) {
            xx = 0 + (((tickAnim - 402) / 20) * (3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*-3-(0)));
            yy = 0 + (((tickAnim - 402) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 20) * (0-(0)));
        }
        else if (tickAnim >= 422 && tickAnim < 440) {
            xx = 3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*-3 + (((tickAnim - 422) / 18) * (0-(3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*-3)));
            yy = 0 + (((tickAnim - 422) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 422) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (25.25-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 25.25 + (((tickAnim - 40) / 8) * (0.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(25.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 0.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 48) / 27) * (0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1-(0.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 27) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 126) {
            xx = 0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1 + (((tickAnim - 75) / 51) * (0-(0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1)));
            yy = 0 + (((tickAnim - 75) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 51) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 126) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 1) * (-18.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*39))*20-(0)));
            zz = 0 + (((tickAnim - 126) / 1) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 127) / 33) * (0.3172-(0)));
            yy = -18.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*39))*20 + (((tickAnim - 127) / 33) * (-5.6803-(-18.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*39))*20)));
            zz = 0 + (((tickAnim - 127) / 33) * (-3.5735-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = 0.3172 + (((tickAnim - 160) / 15) * (0.3172-(0.3172)));
            yy = -5.6803 + (((tickAnim - 160) / 15) * (-5.6803-(-5.6803)));
            zz = -3.5735 + (((tickAnim - 160) / 15) * (-3.5735-(-3.5735)));
        }
        else if (tickAnim >= 175 && tickAnim < 195) {
            xx = 0.3172 + (((tickAnim - 175) / 20) * (0.3896-(0.3172)));
            yy = -5.6803 + (((tickAnim - 175) / 20) * (-5.9139-(-5.6803)));
            zz = -3.5735 + (((tickAnim - 175) / 20) * (-4.2899-(-3.5735)));
        }
        else if (tickAnim >= 195 && tickAnim < 214) {
            xx = 0.3896 + (((tickAnim - 195) / 19) * (0.3896-(0.3896)));
            yy = -5.9139 + (((tickAnim - 195) / 19) * (-5.9139-(-5.9139)));
            zz = -4.2899 + (((tickAnim - 195) / 19) * (-4.2899-(-4.2899)));
        }
        else if (tickAnim >= 214 && tickAnim < 223) {
            xx = 0.3896 + (((tickAnim - 214) / 9) * (-0.0354-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(0.3896)));
            yy = -5.9139 + (((tickAnim - 214) / 9) * (-5.9139-(-5.9139)));
            zz = -4.2899 + (((tickAnim - 214) / 9) * (-4.2899-(-4.2899)));
        }
        else if (tickAnim >= 223 && tickAnim < 260) {
            xx = -0.0354-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 223) / 37) * (25.25-(-0.0354-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = -5.9139 + (((tickAnim - 223) / 37) * (0-(-5.9139)));
            zz = -4.2899 + (((tickAnim - 223) / 37) * (0-(-4.2899)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = 25.25 + (((tickAnim - 260) / 8) * (6.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30-(25.25)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 295) {
            xx = 6.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 268) / 27) * (0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1-(6.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            yy = 0 + (((tickAnim - 268) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 27) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 360) {
            xx = 0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1 + (((tickAnim - 295) / 65) * (0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1-(0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1)));
            yy = 0 + (((tickAnim - 295) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 65) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 402) {
            xx = 0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1 + (((tickAnim - 360) / 42) * (0-(0.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-50))*0.1)));
            yy = 0 + (((tickAnim - 360) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 42) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (-0.6-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            yy = -0.25 + (((tickAnim - 48) / 27) * (0-(-0.25)));
            zz = -0.6 + (((tickAnim - 48) / 27) * (0-(-0.6)));
        }
        else if (tickAnim >= 75 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 75) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 51) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 126) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 1) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 127) / 141) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 141) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 127) / 141) * (-0.6-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 268) / 27) * (0-(0)));
            yy = -0.25 + (((tickAnim - 268) / 27) * (0-(-0.25)));
            zz = -0.6 + (((tickAnim - 268) / 27) * (0-(-0.6)));
        }
        else if (tickAnim >= 295 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 295) / 107) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 107) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (-14.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*85))*50-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = -14.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*85))*50 + (((tickAnim - 48) / 27) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2-(-14.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*85))*50)));
            yy = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 27) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 126) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2 + (((tickAnim - 75) / 51) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2)));
            yy = 0 + (((tickAnim - 75) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 51) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 126) / 1) * (29.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*41))*-30-(0)));
            yy = 0 + (((tickAnim - 126) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 1) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 160) {
            xx = 29.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*41))*-30 + (((tickAnim - 127) / 33) * (10.25-(29.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*41))*-30)));
            yy = 0 + (((tickAnim - 127) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 33) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 214) {
            xx = 10.25 + (((tickAnim - 160) / 54) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 160) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 54) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 215) {
            xx = 10.25 + (((tickAnim - 214) / 1) * (7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*-20-(10.25)));
            yy = 0 + (((tickAnim - 214) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 1) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 260) {
            xx = 7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*-20 + (((tickAnim - 215) / 45) * (0-(7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*-20)));
            yy = 0 + (((tickAnim - 215) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 45) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 260) / 8) * (-2.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*85))*-10-(0)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 295) {
            xx = -2.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*85))*-10 + (((tickAnim - 268) / 27) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2-(-2.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*85))*-10)));
            yy = 0 + (((tickAnim - 268) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 27) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 360) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2 + (((tickAnim - 295) / 65) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2)));
            yy = 0 + (((tickAnim - 295) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 65) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 402) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2 + (((tickAnim - 360) / 42) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*580-150))*0.2)));
            yy = 0 + (((tickAnim - 360) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 42) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 422) {
            xx = 0 + (((tickAnim - 402) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 402) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 20) * (0-(0)));
        }
        else if (tickAnim >= 422 && tickAnim < 440) {
            xx = -12.5 + (((tickAnim - 422) / 18) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 422) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 422) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 40) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 21) * (0.65-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 61) / 199) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 199) * (0-(0)));
            zz = 0.65 + (((tickAnim - 61) / 199) * (0-(0.65)));
        }
        else if (tickAnim >= 260 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 260) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 21) * (0.65-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 281) / 159) * (0-(0)));
            yy = 0 + (((tickAnim - 281) / 159) * (0-(0)));
            zz = 0.65 + (((tickAnim - 281) / 159) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -0.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1 + (((tickAnim - 0) / 23) * (-0.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5-(-0.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 48) {
            xx = -0.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5 + (((tickAnim - 23) / 25) * (1-(-0.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5)));
            yy = 0 + (((tickAnim - 23) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 25) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 1 + (((tickAnim - 48) / 354) * (1-(1)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 422) {
            xx = 1 + (((tickAnim - 402) / 20) * (0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*-1-(1)));
            yy = 0 + (((tickAnim - 402) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 20) * (0-(0)));
        }
        else if (tickAnim >= 422 && tickAnim < 440) {
            xx = 0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*-1 + (((tickAnim - 422) / 18) * (0-(0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*-1)));
            yy = 0 + (((tickAnim - 422) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 422) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1.5 + (((tickAnim - 0) / 23) * (1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1.5-(1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 48) {
            xx = 1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1.5 + (((tickAnim - 23) / 25) * (0.75-(1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1.5)));
            yy = 0 + (((tickAnim - 23) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 25) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 0.75 + (((tickAnim - 48) / 354) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 422) {
            xx = 0.75 + (((tickAnim - 402) / 20) * (1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*1-(0.75)));
            yy = 0 + (((tickAnim - 402) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 20) * (0-(0)));
        }
        else if (tickAnim >= 422 && tickAnim < 440) {
            xx = 1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*1 + (((tickAnim - 422) / 18) * (0-(1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+59))*1)));
            yy = 0 + (((tickAnim - 422) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 422) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+50))*1.5 + (((tickAnim - 0) / 23) * (1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+50))*1.5-(1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+50))*1.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 48) {
            xx = 1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+50))*1.5 + (((tickAnim - 23) / 25) * (0.5-(1.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+50))*1.5)));
            yy = 0 + (((tickAnim - 23) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 25) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 0.5 + (((tickAnim - 48) / 354) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 422) {
            xx = 0.5 + (((tickAnim - 402) / 20) * (1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+99))*1-(0.5)));
            yy = 0 + (((tickAnim - 402) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 20) * (0-(0)));
        }
        else if (tickAnim >= 422 && tickAnim < 440) {
            xx = 1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+99))*1 + (((tickAnim - 422) / 18) * (0-(1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+99))*1)));
            yy = 0 + (((tickAnim - 422) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 422) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2 + (((tickAnim - 0) / 23) * (1.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2-(1.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 48) {
            xx = 1.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2 + (((tickAnim - 23) / 25) * (1.25-(1.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2)));
            yy = 0 + (((tickAnim - 23) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 25) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 1.25 + (((tickAnim - 48) / 354) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 422) {
            xx = 1.25 + (((tickAnim - 402) / 20) * (1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+130))*1-(1.25)));
            yy = 0 + (((tickAnim - 402) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 20) * (0-(0)));
        }
        else if (tickAnim >= 422 && tickAnim < 440) {
            xx = 1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+130))*1 + (((tickAnim - 422) / 18) * (0-(1.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+130))*1)));
            yy = 0 + (((tickAnim - 422) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 422) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3 + (((tickAnim - 0) / 23) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 48) {
            xx = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3 + (((tickAnim - 23) / 25) * (2.25-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3)));
            yy = 0 + (((tickAnim - 23) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 25) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 2.25 + (((tickAnim - 48) / 354) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 2.25 + (((tickAnim - 402) / 38) * (0-(2.25)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 18 + (((tickAnim - 12) / 6) * (71.22-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(18)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 71.22-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 18) / 7) * (-14.75-(71.22-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -14.75 + (((tickAnim - 25) / 15) * (-5.5-(-14.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -5.5 + (((tickAnim - 40) / 8) * (-6.25-(-5.5)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = -6.25 + (((tickAnim - 48) / 354) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 405) {
            xx = -6.25 + (((tickAnim - 402) / 3) * (-11.21-(-6.25)));
            yy = 0 + (((tickAnim - 402) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 3) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 420) {
            xx = -11.21 + (((tickAnim - 405) / 15) * (18.34-(-11.21)));
            yy = 0 + (((tickAnim - 405) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 15) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 18.34 + (((tickAnim - 420) / 20) * (0-(18.34)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 18) / 7) * (0-(-77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (1.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 1.25 + (((tickAnim - 40) / 8) * (3.25-(1.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 3.25 + (((tickAnim - 48) / 354) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 420) {
            xx = 3.25 + (((tickAnim - 402) / 18) * (-16.05-(3.25)));
            yy = 0 + (((tickAnim - 402) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 18) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = -16.05 + (((tickAnim - 420) / 20) * (0-(-16.05)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 38.75 + (((tickAnim - 13) / 5) * (-31.83-(38.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -31.83 + (((tickAnim - 18) / 7) * (0-(-31.83)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 7.25 + (((tickAnim - 40) / 8) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 7.25 + (((tickAnim - 48) / 354) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 7.25 + (((tickAnim - 402) / 38) * (0-(7.25)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (54.42-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 54.42 + (((tickAnim - 18) / 4) * (23.59-(54.42)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 23.59 + (((tickAnim - 22) / 3) * (13.75-(23.59)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 13.75 + (((tickAnim - 25) / 15) * (-3.5-(13.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -3.5 + (((tickAnim - 40) / 8) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = -3.5 + (((tickAnim - 48) / 354) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 405) {
            xx = -3.5 + (((tickAnim - 402) / 3) * (1.55-(-3.5)));
            yy = 0 + (((tickAnim - 402) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 3) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 420) {
            xx = 1.55 + (((tickAnim - 405) / 15) * (-5.61-(1.55)));
            yy = 0 + (((tickAnim - 405) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 15) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = -5.61 + (((tickAnim - 420) / 20) * (0-(-5.61)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -15.5 + (((tickAnim - 13) / 5) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 25) / 415) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 415) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 415) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 6.5 + (((tickAnim - 25) / 8) * (-6.86-(6.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -6.86 + (((tickAnim - 33) / 7) * (-20-(-6.86)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -20 + (((tickAnim - 40) / 8) * (-21.25-(-20)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = -21.25 + (((tickAnim - 48) / 354) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 411) {
            xx = -21.25 + (((tickAnim - 402) / 9) * (1.35-(-21.25)));
            yy = 0 + (((tickAnim - 402) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 9) * (0-(0)));
        }
        else if (tickAnim >= 411 && tickAnim < 420) {
            xx = 1.35 + (((tickAnim - 411) / 9) * (-1.09-(1.35)));
            yy = 0 + (((tickAnim - 411) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 411) / 9) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = -1.09 + (((tickAnim - 420) / 20) * (0-(-1.09)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (31.8753-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (4.4865-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-15.3487-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 31.8753 + (((tickAnim - 25) / 8) * (-16.3332-(31.8753)));
            yy = 4.4865 + (((tickAnim - 25) / 8) * (1.994-(4.4865)));
            zz = -15.3487 + (((tickAnim - 25) / 8) * (-6.8216-(-15.3487)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -16.3332 + (((tickAnim - 33) / 7) * (-6.25-(-16.3332)));
            yy = 1.994 + (((tickAnim - 33) / 7) * (0-(1.994)));
            zz = -6.8216 + (((tickAnim - 33) / 7) * (0-(-6.8216)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = -6.25 + (((tickAnim - 40) / 362) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 411) {
            xx = -6.25 + (((tickAnim - 402) / 9) * (-10.7337-(-6.25)));
            yy = 0 + (((tickAnim - 402) / 9) * (0.4891-(0)));
            zz = 0 + (((tickAnim - 402) / 9) * (-6.8354-(0)));
        }
        else if (tickAnim >= 411 && tickAnim < 420) {
            xx = -10.7337 + (((tickAnim - 411) / 9) * (29.7827-(-10.7337)));
            yy = 0.4891 + (((tickAnim - 411) / 9) * (0.9782-(0.4891)));
            zz = -6.8354 + (((tickAnim - 411) / 9) * (-13.6709-(-6.8354)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 29.7827 + (((tickAnim - 420) / 20) * (0-(29.7827)));
            yy = 0.9782 + (((tickAnim - 420) / 20) * (0-(0.9782)));
            zz = -13.6709 + (((tickAnim - 420) / 20) * (0-(-13.6709)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -1.425 + (((tickAnim - 25) / 8) * (-0.005-(-1.425)));
            zz = 0 + (((tickAnim - 25) / 8) * (0.675-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.005 + (((tickAnim - 33) / 7) * (0-(-0.005)));
            zz = 0.675 + (((tickAnim - 33) / 7) * (0-(0.675)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 411) {
            xx = 0 + (((tickAnim - 402) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 9) * (0-(0)));
        }
        else if (tickAnim >= 411 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 411) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 411) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 411) / 9) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -9.25 + (((tickAnim - 15) / 10) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (35.37-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 35.37 + (((tickAnim - 29) / 4) * (28.25-(35.37)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 28.25 + (((tickAnim - 33) / 4) * (15.12-(28.25)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 15.12 + (((tickAnim - 37) / 3) * (27.75-(15.12)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 27.75 + (((tickAnim - 40) / 362) * (27.75-(27.75)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 411) {
            xx = 27.75 + (((tickAnim - 402) / 9) * (51.61-(27.75)));
            yy = 0 + (((tickAnim - 402) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 9) * (0-(0)));
        }
        else if (tickAnim >= 411 && tickAnim < 420) {
            xx = 51.61 + (((tickAnim - 411) / 9) * (-3.52-(51.61)));
            yy = 0 + (((tickAnim - 411) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 411) / 9) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = -3.52 + (((tickAnim - 420) / 20) * (0-(-3.52)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 15) / 10) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0.77-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.77 + (((tickAnim - 29) / 4) * (0.35-(0.77)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 33) / 4) * (0-(0.35)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = 0.25 + (((tickAnim - 40) / 362) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 411) {
            xx = 0 + (((tickAnim - 402) / 9) * (0-(0)));
            yy = 0.25 + (((tickAnim - 402) / 9) * (0.5-(0.25)));
            zz = 0 + (((tickAnim - 402) / 9) * (0-(0)));
        }
        else if (tickAnim >= 411 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 411) / 9) * (0-(0)));
            yy = 0.5 + (((tickAnim - 411) / 9) * (-0.145-(0.5)));
            zz = 0 + (((tickAnim - 411) / 9) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            yy = -0.145 + (((tickAnim - 420) / 20) * (0-(-0.145)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 11.75 + (((tickAnim - 15) / 25) * (-1.5-(11.75)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -1.5 + (((tickAnim - 40) / 35) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.2-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 91) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.2 + (((tickAnim - 75) / 16) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.2)));
            yy = 0 + (((tickAnim - 75) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 16) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 127) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.4 + (((tickAnim - 91) / 36) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.4)));
            yy = 0 + (((tickAnim - 91) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 36) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 127) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 33) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 175) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 175) / 20) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 214) {
            xx = 0 + (((tickAnim - 195) / 19) * (0-(0)));
            yy = -0.5 + (((tickAnim - 195) / 19) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 195) / 19) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 214) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 214) / 1) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 214) / 1) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 215) / 45) * (-1.5-(0)));
            yy = -0.5 + (((tickAnim - 215) / 45) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 215) / 45) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 295) {
            xx = -1.5 + (((tickAnim - 260) / 35) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.2-(-1.5)));
            yy = 0 + (((tickAnim - 260) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 35) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 360) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.2 + (((tickAnim - 295) / 65) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.2)));
            yy = 0 + (((tickAnim - 295) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 65) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 402) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.4 + (((tickAnim - 360) / 42) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-150))*0.4)));
            yy = 0 + (((tickAnim - 360) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 42) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0.2 + (((tickAnim - 15) / 25) * (0-(0.2)));
            zz = 0.575 + (((tickAnim - 15) / 25) * (0-(0.575)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 75) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 52) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 127) / 133) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 133) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 133) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 260) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 35) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 295) / 145) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 145) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (13.25-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 13.25 + (((tickAnim - 40) / 8) * (0-(13.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 70) / 7) * (3.25-(0)));
            yy = 0 + (((tickAnim - 70) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 7) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = 3.25 + (((tickAnim - 77) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 77) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 6) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 83) / 9) * (3.25-(0)));
            yy = 0 + (((tickAnim - 83) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 9) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 98) {
            xx = 3.25 + (((tickAnim - 92) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 92) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 6) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 98) / 7) * (3.25-(0)));
            yy = 0 + (((tickAnim - 98) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 7) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = 3.25 + (((tickAnim - 105) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 105) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 7) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 112) / 8) * (3.25-(0)));
            yy = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 127) {
            xx = 3.25 + (((tickAnim - 120) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 120) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 7) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 127) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 88) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 215) / 8) * (4-(0)));
            yy = 0 + (((tickAnim - 215) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 8) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 230) {
            xx = 4 + (((tickAnim - 223) / 7) * (0-(4)));
            yy = 0 + (((tickAnim - 223) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 7) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 230) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 230) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 13) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 243) / 17) * (13.25-(0)));
            yy = 0 + (((tickAnim - 243) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 17) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = 13.25 + (((tickAnim - 260) / 8) * (0-(13.25)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 268) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 268) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 22) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 297) {
            xx = 0 + (((tickAnim - 290) / 7) * (3.25-(0)));
            yy = 0 + (((tickAnim - 290) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 7) * (0-(0)));
        }
        else if (tickAnim >= 297 && tickAnim < 303) {
            xx = 3.25 + (((tickAnim - 297) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 297) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 297) / 6) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 312) {
            xx = 0 + (((tickAnim - 303) / 9) * (3.25-(0)));
            yy = 0 + (((tickAnim - 303) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 9) * (0-(0)));
        }
        else if (tickAnim >= 312 && tickAnim < 318) {
            xx = 3.25 + (((tickAnim - 312) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 312) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 312) / 6) * (0-(0)));
        }
        else if (tickAnim >= 318 && tickAnim < 325) {
            xx = 0 + (((tickAnim - 318) / 7) * (3.25-(0)));
            yy = 0 + (((tickAnim - 318) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 318) / 7) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 332) {
            xx = 3.25 + (((tickAnim - 325) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 325) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 7) * (0-(0)));
        }
        else if (tickAnim >= 332 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 332) / 8) * (3.25-(0)));
            yy = 0 + (((tickAnim - 332) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 332) / 8) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 346) {
            xx = 3.25 + (((tickAnim - 340) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 340) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 6) * (0-(0)));
        }
        else if (tickAnim >= 346 && tickAnim < 353) {
            xx = 0 + (((tickAnim - 346) / 7) * (3.25-(0)));
            yy = 0 + (((tickAnim - 346) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 346) / 7) * (0-(0)));
        }
        else if (tickAnim >= 353 && tickAnim < 359) {
            xx = 3.25 + (((tickAnim - 353) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 353) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 353) / 6) * (0-(0)));
        }
        else if (tickAnim >= 359 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 359) / 9) * (3.25-(0)));
            yy = 0 + (((tickAnim - 359) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 359) / 9) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 374) {
            xx = 3.25 + (((tickAnim - 368) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 368) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 368) / 6) * (0-(0)));
        }
        else if (tickAnim >= 374 && tickAnim < 381) {
            xx = 0 + (((tickAnim - 374) / 7) * (3.25-(0)));
            yy = 0 + (((tickAnim - 374) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 374) / 7) * (0-(0)));
        }
        else if (tickAnim >= 381 && tickAnim < 388) {
            xx = 3.25 + (((tickAnim - 381) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 381) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 381) / 7) * (0-(0)));
        }
        else if (tickAnim >= 388 && tickAnim < 396) {
            xx = 0 + (((tickAnim - 388) / 8) * (3.25-(0)));
            yy = 0 + (((tickAnim - 388) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 388) / 8) * (0-(0)));
        }
        else if (tickAnim >= 396 && tickAnim < 402) {
            xx = 3.25 + (((tickAnim - 396) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 396) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 396) / 6) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -38 + (((tickAnim - 10) / 30) * (4.25-(-38)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 4.25 + (((tickAnim - 40) / 8) * (3-(4.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 3 + (((tickAnim - 48) / 354) * (3-(3)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 420) {
            xx = 3 + (((tickAnim - 402) / 18) * (-33.18-(3)));
            yy = 0 + (((tickAnim - 402) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 18) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 430) {
            xx = -33.18 + (((tickAnim - 420) / 10) * (18.16-(-33.18)));
            yy = 0 + (((tickAnim - 420) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 10) * (0-(0)));
        }
        else if (tickAnim >= 430 && tickAnim < 440) {
            xx = 18.16 + (((tickAnim - 430) / 10) * (0-(18.16)));
            yy = 0 + (((tickAnim - 430) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 430) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-25.42-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25.42 + (((tickAnim - 5) / 5) * (5-(-25.42)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 10) / 30) * (6.75-(5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 6.75 + (((tickAnim - 40) / 362) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 430) {
            xx = 6.75 + (((tickAnim - 402) / 28) * (-19.9539-(6.75)));
            yy = 0 + (((tickAnim - 402) / 28) * (-4.1937-(0)));
            zz = 0 + (((tickAnim - 402) / 28) * (10.7157-(0)));
        }
        else if (tickAnim >= 430 && tickAnim < 440) {
            xx = -19.9539 + (((tickAnim - 430) / 10) * (0-(-19.9539)));
            yy = -4.1937 + (((tickAnim - 430) / 10) * (0-(-4.1937)));
            zz = 10.7157 + (((tickAnim - 430) / 10) * (0-(10.7157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.07 + (((tickAnim - 18) / 22) * (-0.525-(0.07)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 362) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = -0.525 + (((tickAnim - 402) / 38) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 23 + (((tickAnim - 10) / 8) * (20.34-(23)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 20.34 + (((tickAnim - 18) / 22) * (-5.5-(20.34)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = -5.5 + (((tickAnim - 40) / 362) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 420) {
            xx = -5.5 + (((tickAnim - 402) / 18) * (28.38-(-5.5)));
            yy = 0 + (((tickAnim - 402) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 18) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 430) {
            xx = 28.38 + (((tickAnim - 420) / 10) * (45.69-(28.38)));
            yy = 0 + (((tickAnim - 420) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 10) * (0-(0)));
        }
        else if (tickAnim >= 430 && tickAnim < 440) {
            xx = 45.69 + (((tickAnim - 430) / 10) * (0-(45.69)));
            yy = 0 + (((tickAnim - 430) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 430) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 18) / 384) * (0-(0)));
            yy = 0.625 + (((tickAnim - 18) / 384) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 18) / 384) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0.625 + (((tickAnim - 402) / 38) * (0-(0.625)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19.5 + (((tickAnim - 25) / 8) * (8.25-(19.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 33) / 7) * (11.5-(8.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 11.5 + (((tickAnim - 40) / 8) * (11.25-(11.5)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = 11.25 + (((tickAnim - 48) / 354) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 429) {
            xx = 11.25 + (((tickAnim - 402) / 27) * (-19.86-(11.25)));
            yy = 0 + (((tickAnim - 402) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 27) * (0-(0)));
        }
        else if (tickAnim >= 429 && tickAnim < 440) {
            xx = -19.86 + (((tickAnim - 429) / 11) * (0-(-19.86)));
            yy = 0 + (((tickAnim - 429) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 429) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (3.5-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 3.5 + (((tickAnim - 25) / 7) * (26.1-(3.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 26.1 + (((tickAnim - 32) / 8) * (-10-(26.1)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -10 + (((tickAnim - 40) / 8) * (-8.75-(-10)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 402) {
            xx = -8.75 + (((tickAnim - 48) / 354) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 48) / 354) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 354) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 429) {
            xx = -8.75 + (((tickAnim - 402) / 27) * (-9.11-(-8.75)));
            yy = 0 + (((tickAnim - 402) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 27) * (0-(0)));
        }
        else if (tickAnim >= 429 && tickAnim < 435) {
            xx = -9.11 + (((tickAnim - 429) / 6) * (1.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-9.11)));
            yy = 0 + (((tickAnim - 429) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 429) / 6) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 440) {
            xx = 1.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 435) / 5) * (0-(1.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 435) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 30.75 + (((tickAnim - 25) / 7) * (-18.75-(30.75)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -18.75 + (((tickAnim - 32) / 8) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 429) {
            xx = 0 + (((tickAnim - 402) / 27) * (-13.68-(0)));
            yy = 0 + (((tickAnim - 402) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 27) * (0-(0)));
        }
        else if (tickAnim >= 429 && tickAnim < 435) {
            xx = -13.68 + (((tickAnim - 429) / 6) * (-22.31-(-13.68)));
            yy = 0 + (((tickAnim - 429) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 429) / 6) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 440) {
            xx = -22.31 + (((tickAnim - 435) / 5) * (0-(-22.31)));
            yy = 0 + (((tickAnim - 435) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 4.5 + (((tickAnim - 12) / 13) * (34-(4.5)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 34 + (((tickAnim - 25) / 15) * (0-(34)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 429) {
            xx = 0 + (((tickAnim - 402) / 27) * (42.86-(0)));
            yy = 0 + (((tickAnim - 402) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 27) * (0-(0)));
        }
        else if (tickAnim >= 429 && tickAnim < 435) {
            xx = 42.86 + (((tickAnim - 429) / 6) * (32.28-(42.86)));
            yy = 0 + (((tickAnim - 429) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 429) / 6) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 440) {
            xx = 32.28 + (((tickAnim - 435) / 5) * (0-(32.28)));
            yy = 0 + (((tickAnim - 435) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 416) {
            xx = 0 + (((tickAnim - 402) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 14) * (1.075-(0)));
            zz = 0 + (((tickAnim - 402) / 14) * (-0.575-(0)));
        }
        else if (tickAnim >= 416 && tickAnim < 429) {
            xx = 0 + (((tickAnim - 416) / 13) * (0-(0)));
            yy = 1.075 + (((tickAnim - 416) / 13) * (0-(1.075)));
            zz = -0.575 + (((tickAnim - 416) / 13) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -24.25 + (((tickAnim - 12) / 13) * (-84.25-(-24.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -84.25 + (((tickAnim - 25) / 7) * (0-(-84.25)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (-1-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (-1.3-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = -1 + (((tickAnim - 25) / 7) * (0-(-1)));
            zz = -1.3 + (((tickAnim - 25) / 7) * (0-(-1.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 362) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 362) * (0-(0)));
        }
        else if (tickAnim >= 402 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 402) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 402) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 85 && tickAnim < 93) {
            xx = 1 + (((tickAnim - 85) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 85) / 8) * (0.07-(1)));
            zz = 1 + (((tickAnim - 85) / 8) * (1-(1)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 1 + (((tickAnim - 93) / 6) * (1-(1)));
            yy = 0.07 + (((tickAnim - 93) / 6) * (1-(0.07)));
            zz = 1 + (((tickAnim - 93) / 6) * (1-(1)));
        }
        else if (tickAnim >= 99 && tickAnim < 212) {
            xx = 1 + (((tickAnim - 99) / 113) * (1-(1)));
            yy = 1 + (((tickAnim - 99) / 113) * (1-(1)));
            zz = 1 + (((tickAnim - 99) / 113) * (1-(1)));
        }
        else if (tickAnim >= 212 && tickAnim < 219) {
            xx = 1 + (((tickAnim - 212) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 212) / 7) * (0.07-(1)));
            zz = 1 + (((tickAnim - 212) / 7) * (1-(1)));
        }
        else if (tickAnim >= 219 && tickAnim < 226) {
            xx = 1 + (((tickAnim - 219) / 7) * (1-(1)));
            yy = 0.07 + (((tickAnim - 219) / 7) * (1-(0.07)));
            zz = 1 + (((tickAnim - 219) / 7) * (1-(1)));
        }
        else if (tickAnim >= 226 && tickAnim < 398) {
            xx = 1 + (((tickAnim - 226) / 172) * (1-(1)));
            yy = 1 + (((tickAnim - 226) / 172) * (1-(1)));
            zz = 1 + (((tickAnim - 226) / 172) * (1-(1)));
        }
        else if (tickAnim >= 398 && tickAnim < 406) {
            xx = 1 + (((tickAnim - 398) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 398) / 8) * (0.07-(1)));
            zz = 1 + (((tickAnim - 398) / 8) * (1-(1)));
        }
        else if (tickAnim >= 406 && tickAnim < 413) {
            xx = 1 + (((tickAnim - 406) / 7) * (1-(1)));
            yy = 0.07 + (((tickAnim - 406) / 7) * (1-(0.07)));
            zz = 1 + (((tickAnim - 406) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*1.5), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*2));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5 + (((tickAnim - 0) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59 + (((tickAnim - 0) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5 + (((tickAnim - 10) / 3) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.5+20))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59 + (((tickAnim - 10) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.5+20))*0.2 + (((tickAnim - 13) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.5+20))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59 + (((tickAnim - 13) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5 + (((tickAnim - 15) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59 + (((tickAnim - 15) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5 + (((tickAnim - 25) / 3) * (-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.5+20))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59 + (((tickAnim - 25) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.5+20))*0.2 + (((tickAnim - 28) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5+20))*0.5-(-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.5+20))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59 + (((tickAnim - 28) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5))*0.59)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*1.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-1.8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+10))*-2), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*1.5));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0.55 + (((tickAnim - 0) / 7) * (0.55-(0.55)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45+20))*-0.1-(0)));
            zz = 0.55 + (((tickAnim - 7) / 2) * (0.55-(0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45+20))*-0.1 + (((tickAnim - 9) / 3) * (0-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45+20))*-0.1)));
            zz = 0.55 + (((tickAnim - 9) / 3) * (0.55-(0.55)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0.55 + (((tickAnim - 12) / 11) * (0.55-(0.55)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45+20))*-0.1-(0)));
            zz = 0.55 + (((tickAnim - 23) / 2) * (0.55-(0.55)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45+20))*-0.1 + (((tickAnim - 25) / 3) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45+20))*-0.1)));
            zz = 0.55 + (((tickAnim - 25) / 3) * (0.55-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-4.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-2.5), neck4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*1), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(6.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*-3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*1.5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-30))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*2.5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*4), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-160))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-160))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*5), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-6), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*7), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-8), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.275 + (((tickAnim - 0) / 3) * (24.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(22.275)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 24.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 3) / 8) * (-16.25-(24.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -16.25 + (((tickAnim - 11) / 19) * (22.275-(-16.25)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9.75 + (((tickAnim - 3) / 3) * (71.445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190-(9.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 71.445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190 + (((tickAnim - 6) / 5) * (-9.5-(71.445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 11) / 19) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.25 + (((tickAnim - 0) / 3) * (28.46-(30.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 28.46 + (((tickAnim - 3) / 3) * (41.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(28.46)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 41.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 6) / 5) * (-14-(41.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -14 + (((tickAnim - 11) / 12) * (-10.38-(-14)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -10.38 + (((tickAnim - 23) / 7) * (30.25-(-10.38)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.075-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 6) / 5) * (0-(0.575)));
            zz = -0.075 + (((tickAnim - 6) / 5) * (0-(-0.075)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.33-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.33 + (((tickAnim - 3) / 4) * (75.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(9.33)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 75.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 7) / 4) * (40.25-(75.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 40.25 + (((tickAnim - 11) / 12) * (7-(40.25)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 7 + (((tickAnim - 23) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.575-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-0.075-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 6) / 5) * (0.575-(0.575)));
            zz = -0.075 + (((tickAnim - 6) / 5) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = 0.575 + (((tickAnim - 11) / 12) * (-0.55-(0.575)));
            zz = -0.075 + (((tickAnim - 11) / 12) * (0-(-0.075)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.55 + (((tickAnim - 23) / 7) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -28.25 + (((tickAnim - 0) / 3) * (0-(-28.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (9.25-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 9.25 + (((tickAnim - 7) / 4) * (0-(9.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -16 + (((tickAnim - 0) / 11) * (9.75-(-16)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 9.75 + (((tickAnim - 11) / 6) * (44.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(9.75)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 44.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 17) / 5) * (-43.25-(44.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -43.25 + (((tickAnim - 22) / 8) * (-16-(-43.25)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 11 + (((tickAnim - 0) / 11) * (23.3093-(11)));
            yy = 0 + (((tickAnim - 0) / 11) * (-2.869-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-7.7758-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 23.3093 + (((tickAnim - 11) / 6) * (190.4908-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300-(23.3093)));
            yy = -2.869 + (((tickAnim - 11) / 6) * (14.388-(-2.869)));
            zz = -7.7758 + (((tickAnim - 11) / 6) * (-5.5807-(-7.7758)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 190.4908-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300 + (((tickAnim - 17) / 5) * (32-(190.4908-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300)));
            yy = 14.388 + (((tickAnim - 17) / 5) * (0-(14.388)));
            zz = -5.5807 + (((tickAnim - 17) / 5) * (0-(-5.5807)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 32 + (((tickAnim - 22) / 8) * (11-(32)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 14.775 + (((tickAnim - 0) / 11) * (-2.5-(14.775)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -2.5 + (((tickAnim - 11) / 6) * (50.12-(-2.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 50.12 + (((tickAnim - 17) / 5) * (11.25-(50.12)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 11.25 + (((tickAnim - 22) / 8) * (14.775-(11.25)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.55 + (((tickAnim - 0) / 5) * (0-(1.55)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 11) / 6) * (0.575-(-0.35)));
            zz = 0 + (((tickAnim - 11) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 17) / 5) * (0.075-(0.575)));
            zz = -0.4 + (((tickAnim - 17) / 5) * (0-(-0.4)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 22) / 1) * (0-(0.075)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (1.895-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 1.895 + (((tickAnim - 27) / 3) * (1.55-(1.895)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -12.25 + (((tickAnim - 18) / 5) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie2, opposablePinkie2.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie2.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -18.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 6) * (-45.25-(-18.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 25) {
            xx = -45.25 + (((tickAnim - 6) / 19) * (5.75-(-45.25)));
            yy = 0 + (((tickAnim - 6) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 19) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 25) / 5) * (126.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(5.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -18.7842-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 0) / 6) * (36-(-18.7842-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -14.388 + (((tickAnim - 0) / 6) * (0-(-14.388)));
            zz = 5.5807 + (((tickAnim - 0) / 6) * (0-(5.5807)));
        }
        else if (tickAnim >= 6 && tickAnim < 25) {
            xx = 36 + (((tickAnim - 6) / 19) * (21.3093-(36)));
            yy = 0 + (((tickAnim - 6) / 19) * (2.869-(0)));
            zz = 0 + (((tickAnim - 6) / 19) * (7.7758-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 21.3093 + (((tickAnim - 25) / 5) * (-18.7842-(21.3093)));
            yy = 2.869 + (((tickAnim - 25) / 5) * (-14.388-(2.869)));
            zz = 7.7758 + (((tickAnim - 25) / 5) * (5.5807-(7.7758)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.6-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 9) * (0-(0.6)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 30.75 + (((tickAnim - 0) / 6) * (0-(30.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 22 + (((tickAnim - 0) / 6) * (0-(22)));
        }
        else if (tickAnim >= 6 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 6) / 19) * (24.25-(0)));
            yy = 0 + (((tickAnim - 6) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 19) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 24.25 + (((tickAnim - 25) / 3) * (37.4722-(24.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (9.7778-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 37.4722 + (((tickAnim - 28) / 2) * (30.75-(37.4722)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 9.7778 + (((tickAnim - 28) / 2) * (22-(9.7778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 6) * (0-(0.325)));
            zz = -0.375 + (((tickAnim - 0) / 6) * (0-(-0.375)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (1.455-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.46-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 1.455 + (((tickAnim - 10) / 4) * (1.62-(1.455)));
            zz = -0.46 + (((tickAnim - 10) / 4) * (-0.31-(-0.46)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 1.62 + (((tickAnim - 14) / 8) * (0-(1.62)));
            zz = -0.31 + (((tickAnim - 14) / 8) * (0-(-0.31)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0.415-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (-0.57-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.415 + (((tickAnim - 26) / 4) * (0.325-(0.415)));
            zz = -0.57 + (((tickAnim - 26) / 4) * (-0.375-(-0.57)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 0) / 8) * (0-(-10)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (-10-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie3, opposablePinkie3.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie3.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -7.025 + (((tickAnim - 0) / 13) * (22.375-(-7.025)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 22.375 + (((tickAnim - 13) / 3) * (54.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(22.375)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 54.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 16) / 10) * (-16.25-(54.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 10) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -16.25 + (((tickAnim - 26) / 4) * (-7.025-(-16.25)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -6 + (((tickAnim - 0) / 13) * (0-(-6)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (9.75-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 9.75 + (((tickAnim - 16) / 5) * (177.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190-(9.75)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 177.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190 + (((tickAnim - 21) / 5) * (-9.5-(177.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 26) / 4) * (-6-(-9.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0.7 + (((tickAnim - 0) / 13) * (30.25-(0.7)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 30.25 + (((tickAnim - 13) / 3) * (28.46-(30.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 28.46 + (((tickAnim - 16) / 6) * (222.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300-(28.46)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 222.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300 + (((tickAnim - 22) / 4) * (-14-(222.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -14 + (((tickAnim - 26) / 4) * (0.7-(-14)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.75 + (((tickAnim - 0) / 5) * (-13.09-(12.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -13.09 + (((tickAnim - 5) / 8) * (0-(-13.09)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (9.33-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 9.33 + (((tickAnim - 16) / 7) * (-7.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(9.33)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -7.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 23) / 3) * (40.25-(-7.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 40.25 + (((tickAnim - 26) / 4) * (12.75-(40.25)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 5) * (-0.065-(0.65)));
            zz = -0.075 + (((tickAnim - 0) / 5) * (-0.05-(-0.075)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = -0.065 + (((tickAnim - 5) / 8) * (0-(-0.065)));
            zz = -0.05 + (((tickAnim - 5) / 8) * (0-(-0.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0.575-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (-0.075-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 22) / 4) * (0.575-(0.575)));
            zz = -0.075 + (((tickAnim - 22) / 4) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 26) / 4) * (0.65-(0.575)));
            zz = -0.075 + (((tickAnim - 26) / 4) * (-0.075-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -28.25 + (((tickAnim - 13) / 4) * (0-(-28.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (9.25-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 9.25 + (((tickAnim - 23) / 4) * (0-(9.25)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLurdusaurus entity = (EntityPrehistoricFloraLurdusaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*1.2), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-0.3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*0.1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*0.25);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*0.3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-30))*-1.3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-1.25), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-1.5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-2), neck4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*0.35), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-1.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-130))*-2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-0.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-1.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-2), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*-3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-300))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-6), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-350))*7));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-6), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-300))*-8), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-400))*10));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 11 + (((tickAnim - 0) / 11) * (24.5-(11)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 24.5 + (((tickAnim - 11) / 8) * (72.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(24.5)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 72.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 19) / 9) * (-17.5-(72.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 28) / 22) * (11-(-17.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-4.05-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = -4.05 + (((tickAnim - 11) / 8) * (-60.33-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(-4.05)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -60.33-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 19) / 9) * (-12.25-(-60.33-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -12.25 + (((tickAnim - 28) / 22) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 12.75 + (((tickAnim - 0) / 11) * (33-(12.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 33 + (((tickAnim - 11) / 8) * (-31.25-(33)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -31.25 + (((tickAnim - 19) / 9) * (-6-(-31.25)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 28) / 22) * (12.75-(-6)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 4.75 + (((tickAnim - 0) / 11) * (29.5-(4.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 29.5 + (((tickAnim - 11) / 8) * (50.12-(29.5)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 50.12 + (((tickAnim - 19) / 4) * (373.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*350-(50.12)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 373.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*350 + (((tickAnim - 23) / 5) * (36.75-(373.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*350)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 36.75 + (((tickAnim - 28) / 10) * (9-(36.75)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 38) / 12) * (4.75-(9)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            yy = 0.925 + (((tickAnim - 11) / 8) * (2.5-(0.925)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 2.5 + (((tickAnim - 19) / 9) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*3-(2.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*3 + (((tickAnim - 28) / 10) * (1.2-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*3)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.2 + (((tickAnim - 38) / 12) * (0-(1.2)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -27.75 + (((tickAnim - 0) / 11) * (-26.5-(-27.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -26.5 + (((tickAnim - 11) / 4) * (14.25-(-26.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 14.25 + (((tickAnim - 15) / 4) * (17-(14.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 17 + (((tickAnim - 19) / 5) * (11.9391-(17)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 11.9391 + (((tickAnim - 24) / 4) * (0-(11.9391)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.76-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0.76 + (((tickAnim - 15) / 4) * (0.225-(0.76)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 19) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -19.94 + (((tickAnim - 0) / 25) * (8-(-19.94)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 25) / 8) * (37.895-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(8)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 37.895-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 33) / 7) * (-31.5-(37.895-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -31.5 + (((tickAnim - 40) / 10) * (-19.94-(-31.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 1.829 + (((tickAnim - 0) / 11) * (5.8284-(1.829)));
            yy = -3.8312 + (((tickAnim - 0) / 11) * (-2.8024-(-3.8312)));
            zz = -4.8114 + (((tickAnim - 0) / 11) * (-5.741-(-4.8114)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 5.8284 + (((tickAnim - 11) / 14) * (11.136-(5.8284)));
            yy = -2.8024 + (((tickAnim - 11) / 14) * (1.0031-(-2.8024)));
            zz = -5.741 + (((tickAnim - 11) / 14) * (-9.1795-(-5.741)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 11.136 + (((tickAnim - 25) / 8) * (-3.7859-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-50-(11.136)));
            yy = 1.0031 + (((tickAnim - 25) / 8) * (-1.4862-(1.0031)));
            zz = -9.1795 + (((tickAnim - 25) / 8) * (-6.9303-(-9.1795)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -3.7859-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-50 + (((tickAnim - 33) / 7) * (3.8065-(-3.7859-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-50)));
            yy = -1.4862 + (((tickAnim - 33) / 7) * (-4.2521-(-1.4862)));
            zz = -6.9303 + (((tickAnim - 33) / 7) * (-4.4311-(-6.9303)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.8065 + (((tickAnim - 40) / 10) * (1.829-(3.8065)));
            yy = -4.2521 + (((tickAnim - 40) / 10) * (-3.8312-(-4.2521)));
            zz = -4.4311 + (((tickAnim - 40) / 10) * (-4.8114-(-4.4311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0.175 + (((tickAnim - 11) / 14) * (-0.525-(0.175)));
            zz = 0 + (((tickAnim - 11) / 14) * (-0.2-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -0.525 + (((tickAnim - 25) / 8) * (0-(-0.525)));
            zz = -0.2 + (((tickAnim - 25) / 8) * (0-(-0.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 22.36 + (((tickAnim - 0) / 25) * (0-(22.36)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (318.795-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*350-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 318.795-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*350 + (((tickAnim - 29) / 11) * (22.75-(318.795-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*350)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 22.75 + (((tickAnim - 40) / 10) * (22.36-(22.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.925 + (((tickAnim - 0) / 11) * (0-(0.925)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0.475-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 25) / 8) * (0.55-(0.475)));
            zz = 0 + (((tickAnim - 25) / 8) * (-0.65-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.55 + (((tickAnim - 33) / 7) * (-2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*4-(0.55)));
            zz = -0.65 + (((tickAnim - 33) / 7) * (0-(-0.65)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*4 + (((tickAnim - 40) / 10) * (0.925-(-2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*4)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (-11.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-50-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -11.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-50 + (((tickAnim - 33) / 8) * (0-(-11.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-50)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie2, opposablePinkie2.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie2.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-130))*1.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 8 + (((tickAnim - 0) / 7) * (5.095-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(8)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 5.095-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 7) / 8) * (-31.5-(5.095-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = -31.5 + (((tickAnim - 15) / 35) * (8-(-31.5)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 11.136 + (((tickAnim - 0) / 7) * (51.7641-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*100-(11.136)));
            yy = -1.0031 + (((tickAnim - 0) / 7) * (1.4862-(-1.0031)));
            zz = 9.1795 + (((tickAnim - 0) / 7) * (6.9303-(9.1795)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 51.7641-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*100 + (((tickAnim - 7) / 8) * (3.8065-(51.7641-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*100)));
            yy = 1.4862 + (((tickAnim - 7) / 8) * (4.2521-(1.4862)));
            zz = 6.9303 + (((tickAnim - 7) / 8) * (4.4311-(6.9303)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.8065 + (((tickAnim - 15) / 15) * (9.0784-(3.8065)));
            yy = 4.2521 + (((tickAnim - 15) / 15) * (2.8024-(4.2521)));
            zz = 4.4311 + (((tickAnim - 15) / 15) * (5.741-(4.4311)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.0784 + (((tickAnim - 30) / 20) * (11.136-(9.0784)));
            yy = 2.8024 + (((tickAnim - 30) / 20) * (-1.0031-(2.8024)));
            zz = 5.741 + (((tickAnim - 30) / 20) * (9.1795-(5.741)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 7) * (0-(-0.525)));
            zz = -0.2 + (((tickAnim - 0) / 7) * (0-(-0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 7) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 24) * (1.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2-(0)));
            zz = 0 + (((tickAnim - 7) / 24) * (-0.11-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 1.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2 + (((tickAnim - 31) / 19) * (-0.525-(1.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2)));
            zz = -0.11 + (((tickAnim - 31) / 19) * (-0.2-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-274.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-350-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -274.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-350 + (((tickAnim - 3) / 12) * (28.5-(-274.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-350)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 28.5 + (((tickAnim - 15) / 15) * (13.6933-(28.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (1.0334-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0.8258-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.6933 + (((tickAnim - 30) / 20) * (0-(13.6933)));
            yy = 1.0334 + (((tickAnim - 30) / 20) * (0-(1.0334)));
            zz = 0.8258 + (((tickAnim - 30) / 20) * (0-(0.8258)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 7) * (0.55-(0.375)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.65-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 7) / 6) * (0.15-(0.55)));
            zz = -0.65 + (((tickAnim - 7) / 6) * (0-(-0.65)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 2) * (-10.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*12-(0.15)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 15) / 26) * (0-(0)));
            yy = -10.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*12 + (((tickAnim - 15) / 26) * (2.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-2-(-10.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*12)));
            zz = 0 + (((tickAnim - 15) / 26) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 2.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-2 + (((tickAnim - 41) / 9) * (0.375-(2.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-2)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 15) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie3, opposablePinkie3.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie3.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -17.5 + (((tickAnim - 0) / 33) * (24.5-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 24.5 + (((tickAnim - 33) / 9) * (-71.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100-(24.5)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -71.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100 + (((tickAnim - 42) / 8) * (-17.5-(-71.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -12.25 + (((tickAnim - 0) / 33) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (58.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*70-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 58.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*70 + (((tickAnim - 42) / 8) * (-12.25-(58.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*70)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -6 + (((tickAnim - 0) / 33) * (33-(-6)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 33 + (((tickAnim - 33) / 10) * (-32.25-(33)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -32.25 + (((tickAnim - 43) / 7) * (-6-(-32.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 36.75 + (((tickAnim - 0) / 14) * (-2.52-(36.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = -2.52 + (((tickAnim - 14) / 19) * (29.5-(-2.52)));
            yy = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 19) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 29.5 + (((tickAnim - 33) / 9) * (55.37-(29.5)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 55.37 + (((tickAnim - 42) / 4) * (-374.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-450-(55.37)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -374.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-450 + (((tickAnim - 46) / 4) * (36.75-(-374.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-450)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 0) / 14) * (1.115-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            yy = 1.115 + (((tickAnim - 14) / 19) * (0.925-(1.115)));
            zz = 0 + (((tickAnim - 14) / 19) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0.925 + (((tickAnim - 33) / 10) * (2.85-(0.925)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 2.85 + (((tickAnim - 43) / 3) * (1.595-(2.85)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 1.595 + (((tickAnim - 46) / 4) * (1.1-(1.595)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (-41.05-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -41.05 + (((tickAnim - 23) / 10) * (-26.5-(-41.05)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -26.5 + (((tickAnim - 33) / 5) * (14.25-(-26.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 14.25 + (((tickAnim - 38) / 4) * (17-(14.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 17 + (((tickAnim - 42) / 6) * (18.35-(17)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 18.35 + (((tickAnim - 48) / 2) * (0-(18.35)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0.76-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0.76 + (((tickAnim - 38) / 4) * (0.225-(0.76)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0.225 + (((tickAnim - 42) / 8) * (0-(0.225)));
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

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLurdusaurus e = (EntityPrehistoricFloraLurdusaurus) entity;
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
