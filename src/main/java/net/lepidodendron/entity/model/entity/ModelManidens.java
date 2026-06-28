package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraManidens;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelManidens extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Manidens;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer crest;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer jawfluff;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer jawfluff2;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;

    private ModelAnimator animator;

    public ModelManidens() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.Manidens = new AdvancedModelRenderer(this);
        this.Manidens.setRotationPoint(0.0F, 5.0F, 5.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Manidens.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.4535F, -1.0287F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3403F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 56, -2.0F, 0.0017F, -0.1491F, 4, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.9535F, -2.1286F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 58, -1.0F, -0.1737F, 0.9303F, 2, 2, 7, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.3535F, -1.3287F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2356F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 46, -3.0F, -0.138F, -0.1142F, 6, 7, 6, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.1F, 0.8465F, 0.7713F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 9.2649F, -12.5905F);
        this.leftLeg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.1F, -10.8945F, 11.5606F, 3, 9, 3, -0.002F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 60, -2.1F, -10.8945F, 9.7606F, 3, 9, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.9649F, -1.9905F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.3578F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 10.5256F, -9.4025F);
        this.leftLeg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.0647F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 32, -1.6F, 2.8191F, 14.9012F, 2, 8, 1, -0.002F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 25, -1.6F, 2.8191F, 13.3012F, 2, 8, 2, -0.001F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 2.2039F, 7.1485F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3665F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 12.8453F, -6.9877F);
        this.leftLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.9599F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 24, -1.6F, -13.6584F, -6.5978F, 2, 1, 4, -0.004F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 58, -1.6F, -13.2584F, -6.5978F, 2, 1, 4, -0.004F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.5F, 2.0345F, 2.0111F);
        this.leftLeg3.addChild(leftLeg4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 13.5108F, -6.7987F);
        this.leftLeg4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9599F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 59, -2.0F, -2.0202F, 10.0369F, 3, 1, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.1F, 0.8465F, 0.7713F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 9.2649F, -12.5905F);
        this.rightLeg.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.9F, -10.8945F, 11.5606F, 3, 9, 3, -0.002F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 60, -0.9F, -10.8945F, 9.7606F, 3, 9, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.9649F, -1.9905F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.3578F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 10.5256F, -9.4025F);
        this.rightLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0647F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 32, -0.4F, 2.8191F, 14.9012F, 2, 8, 1, -0.002F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 25, -0.4F, 2.8191F, 13.3012F, 2, 8, 2, -0.001F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 2.2039F, 7.1485F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3665F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 12.8453F, -6.9877F);
        this.rightLeg3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.9599F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 24, -0.4F, -13.6584F, -6.5978F, 2, 1, 4, -0.004F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 58, -0.4F, -13.2584F, -6.5978F, 2, 1, 4, -0.004F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.7F, 2.0345F, 2.0111F);
        this.rightLeg3.addChild(rightLeg4);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.7F, 13.5108F, -6.7987F);
        this.rightLeg4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.9599F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 59, -1.0F, -2.0202F, 10.0369F, 3, 1, 5, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.6465F, 3.6714F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3491F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 37, 31, -2.0F, -2.6F, -0.3F, 4, 5, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.6F, 0.8F);
        this.tail1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0262F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 14, -1.0F, -0.7F, -0.7F, 2, 1, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.6F, 8.8F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0524F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 46, 0, -0.5F, -0.7016F, -0.9258F, 1, 3, 10, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 32, -1.5F, -1.7F, -1.0F, 3, 3, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 14, -0.5F, -0.0019F, 0.0872F, 1, 1, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 25, -1.0F, -1.1F, -1.0F, 2, 2, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2618F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.4F, 0.0F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0262F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 16, 0.0F, -0.0013F, -1.0611F, 0, 1, 14, -0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.5F, -0.4F, -1.0F, 1, 1, 14, -0.002F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.9465F, -3.1286F);
        this.hips.addChild(body);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -5.5F, -5.0F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1571F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 58, -1.0F, -0.5197F, -0.2497F, 2, 2, 7, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -3.9F, -5.0F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0698F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 55, 27, -2.0F, -1.0F, -0.5F, 4, 2, 7, -0.003F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 9, -3.5F, -0.1F, -0.1F, 7, 8, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -5.7F);
        this.body.addChild(chest);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 2.4F, -3.5F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3229F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 46, -3.0F, -2.7034F, -1.5956F, 6, 3, 6, -0.002F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -2.3F, -5.1F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6109F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 59, 0, -1.0F, 0.1334F, -0.0824F, 2, 3, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.3F, -5.1F);
        this.chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.48F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 0, -2.0F, 0.1334F, -0.0824F, 4, 2, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -3.9F, 0.4F);
        this.chest.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2007F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 46, -3.0F, 0.0055F, -5.8089F, 6, 5, 6, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 2.3F, -2.0F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.2007F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.1F, -0.7517F, 1.1614F);
        this.leftArm.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.0821F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 20, -0.5F, -0.6332F, -0.605F, 1, 1, 5, -0.002F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.8F, 0.659F, -14.5532F);
        this.leftArm.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.8901F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 16, 2.4F, -13.0335F, 8.0882F, 1, 2, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.9F, 2.659F, 3.1468F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.4102F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 6.4763F, -12.5281F);
        this.leftArm2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.384F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 55, 27, 0.5F, -11.0508F, 8.7413F, 1, 5, 1, -0.002F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 6.3763F, -12.8281F);
        this.leftArm2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.384F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 14, 0.5F, -11.0508F, 8.6413F, 1, 5, 1, -0.003F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.5F, 4.1763F, -1.9281F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.0436F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.8F, -0.0131F, -0.1003F);
        this.leftArm3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1766F, 0.0704F, 0.2377F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 59, 0, 0.7765F, -0.4024F, -0.0849F, 1, 2, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.8F, 6.4869F, -12.7003F);
        this.leftArm3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3065F, 0.078F, 0.1946F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 9, 24, -1.4579F, -10.2436F, 9.5735F, 1, 2, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 2.3F, -2.0F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.2007F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.1F, -0.7517F, 1.1614F);
        this.rightArm.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.0821F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 20, -0.5F, -0.6332F, -0.605F, 1, 1, 5, -0.002F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(2.8F, 0.659F, -14.5532F);
        this.rightArm.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.8901F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 16, -3.4F, -13.0335F, 8.0882F, 1, 2, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.9F, 2.659F, 3.1468F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4102F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 6.4763F, -12.5281F);
        this.rightArm2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.384F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 55, 27, -1.5F, -11.0508F, 8.7413F, 1, 5, 1, -0.002F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 6.3763F, -12.8281F);
        this.rightArm2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.384F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 56, 14, -1.5F, -11.0508F, 8.6413F, 1, 5, 1, -0.003F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.5F, 4.1763F, -1.9281F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.0436F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.8F, -0.0131F, -0.1003F);
        this.rightArm3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1766F, -0.0704F, -0.2377F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 59, 0, -1.7765F, -0.4024F, -0.0849F, 1, 2, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.8F, 6.4869F, -12.7003F);
        this.rightArm3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3065F, -0.078F, -0.1946F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 9, 24, 0.4579F, -10.2436F, 9.5735F, 1, 2, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.3F, -4.3F);
        this.chest.addChild(neck1);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -1.8F, -3.4F);
        this.neck1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3054F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 38, 0, -2.0F, -1.4F, 0.8F, 4, 4, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.neck1.addChild(neck2);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -4.0F, -1.6F);
        this.neck2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.7418F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 33, 64, -1.5F, 0.0F, 0.0F, 3, 4, 4, -0.002F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.5F, -2.0F);
        this.neck2.addChild(neck3);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.8F, -2.3F);
        this.neck3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.4712F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 61, 66, -1.0F, 0.0F, 0.0F, 2, 4, 3, -0.004F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -2.0F);
        this.neck3.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 48, 64, -1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 23, 32, 0.55F, -0.3F, -3.0F, 1, 1, 1, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 23, 32, -1.55F, -0.3F, -3.0F, 1, 1, 1, 0.003F, true));
        this.head.cubeList.add(new ModelBox(head, 25, 70, -0.5F, 0.0F, -6.0F, 1, 1, 3, -0.004F, false));
        this.head.cubeList.add(new ModelBox(head, 64, 37, -1.5F, -0.4F, -3.0F, 3, 2, 3, -0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 60, -0.5F, 0.6F, -6.0F, 1, 1, 3, -0.005F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -1.2F, -3.3F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0436F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 19, 46, -1.0F, -0.0535F, 0.0458F, 2, 2, 3, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3054F, -0.2967F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 16, -0.4F, 0.0F, 1.1F, 0, 1, 2, 0.0F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 8, 16, -0.38F, 0.0F, 1.1F, 0, 1, 2, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3927F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 45, 70, -1.29F, -1.7F, -3.0F, 0, 1, 3, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 52, 70, -1.27F, -1.7F, -3.0F, 0, 1, 3, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 52, 70, 1.27F, -1.7F, -3.0F, 0, 1, 3, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 45, 70, 1.29F, -1.7F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 1.0F, -6.0F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.3054F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 50, 27, 0.2076F, -0.1F, 0.1868F, 0, 1, 2, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 70, 0, 0.0076F, -1.0F, 0.1868F, 1, 1, 3, 0.002F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 27, 40, 0.0076F, -0.4F, 0.1868F, 1, 1, 3, 0.001F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3054F, 0.2967F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 8, 16, 0.38F, 0.0F, 1.1F, 0, 1, 2, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 16, 0.4F, 0.0F, 1.1F, 0, 1, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.7F, -6.7F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 1.309F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 59, 56, -0.5F, 0.0F, -1.01F, 1, 1, 1, 0.02F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.7854F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 59, 59, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.002F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.1F, -0.6F, -3.2F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.4937F, -0.3344F, -0.4295F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 43, 27, -1.2781F, -0.6266F, -1.2933F, 1, 1, 2, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.1F, -0.6F, -3.2F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.4955F, 0.0458F, -0.2933F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 20, 27, -1.479F, -1.2538F, 0.3512F, 1, 1, 1, -0.001F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.1F, -0.6F, -3.2F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1503F, 0.0458F, -0.2933F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 15, 27, -1.479F, -0.7326F, -0.0137F, 1, 1, 1, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.1F, -0.6F, -3.2F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.4955F, -0.0458F, 0.2933F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 20, 27, 0.479F, -1.2538F, 0.3512F, 1, 1, 1, -0.001F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.1F, -0.6F, -3.2F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1503F, -0.0458F, 0.2933F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 15, 27, 0.479F, -0.7326F, -0.0137F, 1, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.1F, -0.6F, -3.2F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.4937F, 0.3344F, 0.4295F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 43, 27, 0.2781F, -0.6266F, -1.2933F, 1, 1, 2, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4363F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 32, 0, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 39, 58, -1.0F, 0.0F, 2.0F, 2, 2, 1, -0.002F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 1.0F, -6.0F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.3054F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 50, 27, -0.2076F, -0.1F, 0.1868F, 0, 1, 2, 0.0F, false));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 27, 40, -1.0076F, -0.4F, 0.1868F, 1, 1, 3, 0.0F, false));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 70, 0, -1.0076F, -1.0F, 0.1868F, 1, 1, 3, 0.002F, false));

        this.crest = new AdvancedModelRenderer(this);
        this.crest.setRotationPoint(0.0F, -1.4F, -0.3F);
        this.head.addChild(crest);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.3578F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 69, 10, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.004F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.4404F, -0.6068F, -0.2625F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 44, 46, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.4404F, 0.6068F, 0.2625F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 44, 46, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 68, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 71, 29, 1.3F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 71, 24, 1.28F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 9, -1.5F, 0.4F, -3.0F, 3, 1, 3, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 69, 43, -0.5F, 0.0F, -6.0F, 1, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 71, 24, -1.28F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 71, 29, -1.3F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.1309F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 69, 16, -0.5F, 0.0F, 0.2F, 1, 1, 3, -0.002F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.2967F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 46, -0.4F, -1.0F, 1.3F, 0, 1, 2, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 15, 20, -0.39F, -1.0F, 1.3F, 0, 1, 2, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 51, 0, -0.3F, -0.2F, 1.3F, 0, 1, 2, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 0, -0.29F, -1.2F, 0.1F, 0, 1, 1, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 10, 0, -0.3F, -0.5F, 0.1F, 0, 1, 1, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 17, 32, -0.5F, 0.0F, 0.3F, 1, 1, 3, 0.003F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.2967F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 51, 0, 0.3F, -0.2F, 1.3F, 0, 1, 2, 0.0F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 0, 0.29F, -1.2F, 0.1F, 0, 1, 1, 0.0F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 10, 0, 0.3F, -0.5F, 0.1F, 0, 1, 1, 0.0F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 15, 20, 0.39F, -1.0F, 1.3F, 0, 1, 2, 0.0F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 46, 0.4F, -1.0F, 1.3F, 0, 1, 2, 0.0F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 17, 32, -0.5F, 0.0F, 0.3F, 1, 1, 3, 0.002F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.3927F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 55, 37, -0.5F, -0.1F, -0.6F, 1, 1, 1, 0.003F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 1.5F, -1.6F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.2269F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 15, 16, -1.0F, -1.0534F, 0.0239F, 2, 1, 2, -0.002F, false));

        this.jawfluff = new AdvancedModelRenderer(this);
        this.jawfluff.setRotationPoint(1.5F, 0.9F, -1.0F);
        this.jaw.addChild(jawfluff);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.1F, 0.2F, 0.2F);
        this.jawfluff.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 1.4925F, 0.1908F, -0.3F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 24, -0.0057F, -0.1493F, 0.1414F, 0, 2, 1, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-1.4F, 0.5F, -0.4F);
        this.jawfluff.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.6077F, 0.2602F, -0.3543F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 17, 0, 1.3F, 0.1F, -0.1F, 0, 3, 2, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.1F, 0.5F, -0.3F);
        this.jawfluff.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.1341F, 0.2602F, -0.3543F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 7, 32, -0.02F, -0.5891F, -0.5793F, 0, 2, 1, 0.0F, false));

        this.jawfluff2 = new AdvancedModelRenderer(this);
        this.jawfluff2.setRotationPoint(-1.5F, 0.9F, -1.0F);
        this.jaw.addChild(jawfluff2);


        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.1F, 0.2F, 0.2F);
        this.jawfluff2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 1.4925F, -0.1908F, 0.3F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 24, 0.0057F, -0.1493F, 0.1414F, 0, 2, 1, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(1.4F, 0.5F, -0.4F);
        this.jawfluff2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.6077F, -0.2602F, 0.3543F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 17, 0, -1.3F, 0.1F, -0.1F, 0, 3, 2, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.1F, 0.5F, -0.3F);
        this.jawfluff2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.1341F, -0.2602F, 0.3543F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 7, 32, 0.02F, -0.5891F, -0.5793F, 0, 2, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Manidens.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Manidens.offsetY = -1.0F;
        this.Manidens.offsetX = 0.1F;
        this.Manidens.offsetZ = 2.0F;
        this.Manidens.rotateAngleY = (float)Math.toRadians(225);
        this.Manidens.rotateAngleX = (float)Math.toRadians(14);
        this.Manidens.rotateAngleZ = (float)Math.toRadians(-8);
        this.Manidens.scaleChildren = true;
        float scaler = 1.4F;
        this.Manidens.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.Manidens.render(f);
        //Reset rotations, positions and sizing:
        this.Manidens.setScale(1.0F, 1.0F, 1.0F);
        this.Manidens.scaleChildren = false;
        resetToDefaultPose();

    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck1, 0.0F, 0.0F, -0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.12F, 0.0499F, -0.0F);
        this.neck1.offsetY = -0F;
        this.neck1.offsetX = -0F;
        this.neck1.offsetZ = -0.07F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
      
        this.Manidens.offsetY = 0.02F;
        this.Manidens.render(0.01F);
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

        EntityPrehistoricFloraManidens EntityManidens = (EntityPrehistoricFloraManidens) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityManidens.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityManidens.getAnimation() == EntityManidens.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityManidens.isReallyInWater()) {

                if (f3 == 0.0F || !EntityManidens.getIsMoving()) {
                    if (EntityManidens.getAnimation() != EntityManidens.EAT_ANIMATION
                        && EntityManidens.getAnimation() != EntityManidens.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityManidens.getIsFast()) { //Running


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
        EntityPrehistoricFloraManidens ee = (EntityPrehistoricFloraManidens) entitylivingbaseIn;

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
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraManidens entity = (EntityPrehistoricFloraManidens) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 39.25 + (((tickAnim - 13) / 10) * (0-(39.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (39.25-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 39.25 + (((tickAnim - 34) / 10) * (-6.75-(39.25)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 44) / 6) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 18.75 + (((tickAnim - 13) / 6) * (-16-(18.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -16 + (((tickAnim - 19) / 4) * (0-(-16)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (18.75-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 18.75 + (((tickAnim - 34) / 7) * (-16-(18.75)));
            yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = -16 + (((tickAnim - 41) / 3) * (-8.5-(-16)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 44) / 6) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.175 + (((tickAnim - 19) / 4) * (0-(1.175)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 23) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 18) * (1.175-(0)));
            zz = 0 + (((tickAnim - 23) / 18) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 41) / 3) * (0-(1.175)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 13.5 + (((tickAnim - 13) / 3) * (-36.25-(13.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -36.25 + (((tickAnim - 16) / 3) * (-36.25-(-36.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -36.25 + (((tickAnim - 19) / 4) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (13.5-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 13.5 + (((tickAnim - 34) / 4) * (-36.25-(13.5)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -36.25 + (((tickAnim - 38) / 3) * (-36.25-(-36.25)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = -36.25 + (((tickAnim - 41) / 3) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.075-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 16) / 3) * (0.25-(0.25)));
            zz = -0.075 + (((tickAnim - 16) / 3) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 19) / 4) * (0-(0.25)));
            zz = -0.075 + (((tickAnim - 19) / 4) * (0-(-0.075)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0.25-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (-0.075-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 38) / 3) * (0.25-(0.25)));
            zz = -0.075 + (((tickAnim - 38) / 3) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 41) / 3) * (0-(0.25)));
            zz = -0.075 + (((tickAnim - 41) / 3) * (0-(-0.075)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (63.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 63.25 + (((tickAnim - 13) / 3) * (85.42-(63.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 85.42 + (((tickAnim - 16) / 3) * (85.42-(85.42)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 85.42 + (((tickAnim - 19) / 4) * (0-(85.42)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (63.25-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 63.25 + (((tickAnim - 34) / 4) * (85.42-(63.25)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 85.42 + (((tickAnim - 38) / 3) * (85.42-(85.42)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 85.42 + (((tickAnim - 41) / 3) * (13.5-(85.42)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 44) / 6) * (0-(13.5)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.125-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.4-(0)));
            zz = -1.125 + (((tickAnim - 13) / 3) * (-1.85-(-1.125)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 16) / 3) * (0.4-(0.4)));
            zz = -1.85 + (((tickAnim - 16) / 3) * (-1.85-(-1.85)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 19) / 4) * (0-(0.4)));
            zz = -1.85 + (((tickAnim - 19) / 4) * (0-(-1.85)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (-1.125-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0.4-(0)));
            zz = -1.125 + (((tickAnim - 34) / 4) * (-1.85-(-1.125)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 38) / 3) * (0.4-(0.4)));
            zz = -1.85 + (((tickAnim - 38) / 3) * (-1.85-(-1.85)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 41) / 3) * (0-(0.4)));
            zz = -1.85 + (((tickAnim - 41) / 3) * (0-(-1.85)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.30106-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-6.24277-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.76642-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -0.30106 + (((tickAnim - 13) / 10) * (-0.23416-(-0.30106)));
            yy = -6.24277 + (((tickAnim - 13) / 10) * (-2.49981-(-6.24277)));
            zz = 2.76642 + (((tickAnim - 13) / 10) * (1.2453-(2.76642)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -0.23416 + (((tickAnim - 23) / 11) * (-0.30106-(-0.23416)));
            yy = -2.49981 + (((tickAnim - 23) / 11) * (-6.24277-(-2.49981)));
            zz = 1.2453 + (((tickAnim - 23) / 11) * (2.76642-(1.2453)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -0.30106 + (((tickAnim - 34) / 6) * (-0.23416-(-0.30106)));
            yy = -6.24277 + (((tickAnim - 34) / 6) * (-2.49981-(-6.24277)));
            zz = 2.76642 + (((tickAnim - 34) / 6) * (1.2453-(2.76642)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -0.23416 + (((tickAnim - 40) / 10) * (0-(-0.23416)));
            yy = -2.49981 + (((tickAnim - 40) / 10) * (0-(-2.49981)));
            zz = 1.2453 + (((tickAnim - 40) / 10) * (0-(1.2453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.16285-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-9.24858-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.01317-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -0.16285 + (((tickAnim - 13) / 10) * (0.35575-(-0.16285)));
            yy = -9.24858 + (((tickAnim - 13) / 10) * (-11.74439-(-9.24858)));
            zz = 1.01317 + (((tickAnim - 13) / 10) * (-1.53305-(1.01317)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0.35575 + (((tickAnim - 23) / 11) * (-0.16285-(0.35575)));
            yy = -11.74439 + (((tickAnim - 23) / 11) * (-9.24858-(-11.74439)));
            zz = -1.53305 + (((tickAnim - 23) / 11) * (1.01317-(-1.53305)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -0.16285 + (((tickAnim - 34) / 6) * (0.35575-(-0.16285)));
            yy = -9.24858 + (((tickAnim - 34) / 6) * (-11.74439-(-9.24858)));
            zz = 1.01317 + (((tickAnim - 34) / 6) * (-1.53305-(1.01317)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.35575 + (((tickAnim - 40) / 10) * (0-(0.35575)));
            yy = -11.74439 + (((tickAnim - 40) / 10) * (0-(-11.74439)));
            zz = -1.53305 + (((tickAnim - 40) / 10) * (0-(-1.53305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.36837-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-13.39234-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.27516-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = 17.36837 + (((tickAnim - 13) / 21) * (17.36837-(17.36837)));
            yy = -13.39234 + (((tickAnim - 13) / 21) * (-13.39234-(-13.39234)));
            zz = 3.27516 + (((tickAnim - 13) / 21) * (3.27516-(3.27516)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 17.36837 + (((tickAnim - 34) / 16) * (0-(17.36837)));
            yy = -13.39234 + (((tickAnim - 34) / 16) * (0-(-13.39234)));
            zz = 3.27516 + (((tickAnim - 34) / 16) * (0-(3.27516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (12.58371-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-10.52211-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.19441-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 12.58371 + (((tickAnim - 13) / 10) * (9.58081-(12.58371)));
            yy = -10.52211 + (((tickAnim - 13) / 10) * (-18.47694-(-10.52211)));
            zz = 1.19441 + (((tickAnim - 13) / 10) * (10.8862-(1.19441)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 9.58081 + (((tickAnim - 23) / 11) * (12.58371-(9.58081)));
            yy = -18.47694 + (((tickAnim - 23) / 11) * (-10.52211-(-18.47694)));
            zz = 10.8862 + (((tickAnim - 23) / 11) * (1.19441-(10.8862)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 12.58371 + (((tickAnim - 34) / 6) * (9.58081-(12.58371)));
            yy = -10.52211 + (((tickAnim - 34) / 6) * (-18.47694-(-10.52211)));
            zz = 1.19441 + (((tickAnim - 34) / 6) * (10.8862-(1.19441)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.58081 + (((tickAnim - 40) / 10) * (0-(9.58081)));
            yy = -18.47694 + (((tickAnim - 40) / 10) * (0-(-18.47694)));
            zz = 10.8862 + (((tickAnim - 40) / 10) * (0-(10.8862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (-0.1054-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (-7.99931-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0.75737-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -0.1054 + (((tickAnim - 23) / 11) * (0-(-0.1054)));
            yy = -7.99931 + (((tickAnim - 23) / 11) * (0-(-7.99931)));
            zz = 0.75737 + (((tickAnim - 23) / 11) * (0-(0.75737)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (-0.1054-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (-7.99931-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0.75737-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -0.1054 + (((tickAnim - 40) / 10) * (0-(-0.1054)));
            yy = -7.99931 + (((tickAnim - 40) / 10) * (0-(-7.99931)));
            zz = 0.75737 + (((tickAnim - 40) / 10) * (0-(0.75737)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-5.50971-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-20.03632-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (15.72404-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -5.50971 + (((tickAnim - 2) / 7) * (-2.86511-(-5.50971)));
            yy = -20.03632 + (((tickAnim - 2) / 7) * (-18.75768-(-20.03632)));
            zz = 15.72404 + (((tickAnim - 2) / 7) * (8.30444-(15.72404)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -2.86511 + (((tickAnim - 9) / 4) * (0-(-2.86511)));
            yy = -18.75768 + (((tickAnim - 9) / 4) * (0-(-18.75768)));
            zz = 8.30444 + (((tickAnim - 9) / 4) * (0-(8.30444)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (-12.25-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (-6.83311-(0)));
            yy = -12.25 + (((tickAnim - 23) / 11) * (-27.73567-(-12.25)));
            zz = 0 + (((tickAnim - 23) / 11) * (14.43883-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -6.83311 + (((tickAnim - 34) / 16) * (0-(-6.83311)));
            yy = -27.73567 + (((tickAnim - 34) / 16) * (0-(-27.73567)));
            zz = 14.43883 + (((tickAnim - 34) / 16) * (0-(14.43883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraManidens entity = (EntityPrehistoricFloraManidens) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -14.75 + (((tickAnim - 18) / 15) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.75 + (((tickAnim - 33) / 17) * (0-(-14.75)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (-7.1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (4.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -7.1 + (((tickAnim - 18) / 15) * (-7.1-(-7.1)));
            zz = 4.1 + (((tickAnim - 18) / 15) * (4.1-(4.1)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -7.1 + (((tickAnim - 33) / 17) * (0-(-7.1)));
            zz = 4.1 + (((tickAnim - 33) / 17) * (0-(4.1)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -18.75 + (((tickAnim - 18) / 15) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 33) / 17) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (48-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 48 + (((tickAnim - 18) / 15) * (48-(48)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 48 + (((tickAnim - 33) / 17) * (0-(48)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -0.35 + (((tickAnim - 18) / 15) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -0.35 + (((tickAnim - 33) / 17) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -47.25 + (((tickAnim - 18) / 15) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -47.25 + (((tickAnim - 33) / 17) * (0-(-47.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 15) * (0.325-(0.325)));
            zz = 0.1 + (((tickAnim - 18) / 15) * (0.1-(0.1)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.325 + (((tickAnim - 33) / 17) * (0-(0.325)));
            zz = 0.1 + (((tickAnim - 33) / 17) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 31.75 + (((tickAnim - 18) / 15) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 33) / 17) * (0-(31.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-1.01-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 7) * (0-(0.1)));
            zz = -1.01 + (((tickAnim - 11) / 7) * (-1.225-(-1.01)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -1.225 + (((tickAnim - 18) / 15) * (-1.225-(-1.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -1.225 + (((tickAnim - 33) / 17) * (0-(-1.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -18.75 + (((tickAnim - 18) / 15) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 33) / 17) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (48-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 48 + (((tickAnim - 18) / 15) * (48-(48)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 48 + (((tickAnim - 33) / 17) * (0-(48)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -0.35 + (((tickAnim - 18) / 15) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -0.35 + (((tickAnim - 33) / 17) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -47.25 + (((tickAnim - 18) / 15) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -47.25 + (((tickAnim - 33) / 17) * (0-(-47.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 15) * (0.325-(0.325)));
            zz = 0.1 + (((tickAnim - 18) / 15) * (0.1-(0.1)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.325 + (((tickAnim - 33) / 17) * (0-(0.325)));
            zz = 0.1 + (((tickAnim - 33) / 17) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 31.75 + (((tickAnim - 18) / 15) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 33) / 17) * (0-(31.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-1.01-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 7) * (0-(0.1)));
            zz = -1.01 + (((tickAnim - 11) / 7) * (-1.225-(-1.01)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -1.225 + (((tickAnim - 18) / 15) * (-1.225-(-1.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -1.225 + (((tickAnim - 33) / 17) * (0-(-1.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (1.93-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 1.93 + (((tickAnim - 11) / 7) * (17.25-(1.93)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.25 + (((tickAnim - 18) / 15) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 17.25 + (((tickAnim - 33) / 4) * (7.70246-(17.25)));
            yy = 0 + (((tickAnim - 33) / 4) * (0.42368-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (-0.70818-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 7.70246 + (((tickAnim - 37) / 6) * (-4.66737-(7.70246)));
            yy = 0.42368 + (((tickAnim - 37) / 6) * (0.23832-(0.42368)));
            zz = -0.70818 + (((tickAnim - 37) / 6) * (-0.39835-(-0.70818)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.66737 + (((tickAnim - 43) / 7) * (0-(-4.66737)));
            yy = 0.23832 + (((tickAnim - 43) / 7) * (0-(0.23832)));
            zz = -0.39835 + (((tickAnim - 43) / 7) * (0-(-0.39835)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 18) / 15) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 33) / 17) * (0-(8.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0.425 + (((tickAnim - 18) / 15) * (0.425-(0.425)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0.425 + (((tickAnim - 33) / 17) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.25 + (((tickAnim - 18) / 15) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 33) / 17) * (0-(8.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraManidens entity = (EntityPrehistoricFloraManidens) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 10) / 3) * (1.75-(2.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1.75 + (((tickAnim - 13) / 4) * (2.5-(1.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 2.5 + (((tickAnim - 17) / 7) * (-6.75-(2.5)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 24) / 6) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 10) / 3) * (1.25-(3.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1.25 + (((tickAnim - 13) / 4) * (3.25-(1.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 3.25 + (((tickAnim - 17) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));

        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5.25 + (((tickAnim - 10) / 3) * (-0.25-(5.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.25 + (((tickAnim - 13) / 4) * (5.25-(-0.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 5.25 + (((tickAnim - 17) / 7) * (0-(5.25)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12 + (((tickAnim - 10) / 3) * (-5.25-(-12)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -5.25 + (((tickAnim - 13) / 4) * (-12-(-5.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -12 + (((tickAnim - 17) / 7) * (0-(-12)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.525-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0.525 + (((tickAnim - 10) / 7) * (0.525-(0.525)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0.525 + (((tickAnim - 17) / 13) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -16.75 + (((tickAnim - 10) / 7) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -16.75 + (((tickAnim - 17) / 7) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8.5 + (((tickAnim - 10) / 3) * (-12.75-(-8.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -12.75 + (((tickAnim - 13) / 4) * (-8.5-(-12.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -8.5 + (((tickAnim - 17) / 4) * (4.97-(-8.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 4.97 + (((tickAnim - 21) / 3) * (11.25-(4.97)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 11.25 + (((tickAnim - 24) / 4) * (22-(11.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 22 + (((tickAnim - 28) / 2) * (0-(22)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -28.5 + (((tickAnim - 5) / 5) * (49-(-28.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 49 + (((tickAnim - 10) / 3) * (0-(49)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (49-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 49 + (((tickAnim - 17) / 4) * (49-(49)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 49 + (((tickAnim - 21) / 3) * (0-(49)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (49-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 49 + (((tickAnim - 28) / 2) * (0-(49)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(xx), crest.rotateAngleY + (float) Math.toRadians(yy), crest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (22.75-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.75 + (((tickAnim - 10) / 3) * (0-(22.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (22.75-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 22.75 + (((tickAnim - 17) / 4) * (0-(22.75)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (18.75-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 18.75 + (((tickAnim - 24) / 4) * (25.25-(18.75)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 25.25 + (((tickAnim - 28) / 2) * (0-(25.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraManidens entity = (EntityPrehistoricFloraManidens) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 28) / 12) * (0-(4)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 1.75 + (((tickAnim - 16) / 12) * (-5.75-(1.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3 + (((tickAnim - 16) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -5.75 + (((tickAnim - 28) / 12) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 9.5 + (((tickAnim - 16) / 12) * (0.75-(9.5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5 + (((tickAnim - 16) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0.75 + (((tickAnim - 28) / 12) * (0-(0.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.11842-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.54947-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -9.11842 + (((tickAnim - 8) / 8) * (9.25-(-9.11842)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = -5.54947 + (((tickAnim - 8) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12-(-5.54947)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 9.25 + (((tickAnim - 16) / 12) * (16.75-(9.25)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12 + (((tickAnim - 16) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 16.75 + (((tickAnim - 28) / 12) * (0-(16.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0.1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0.1 + (((tickAnim - 28) / 12) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 28) / 12) * (0-(4)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 1.75 + (((tickAnim - 16) / 12) * (-1.5-(1.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3 + (((tickAnim - 16) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 28) / 12) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 9.5 + (((tickAnim - 16) / 12) * (6.25-(9.5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5 + (((tickAnim - 16) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 28) / 12) * (0-(6.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*8-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 13.25 + (((tickAnim - 16) / 12) * (17-(13.25)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*8 + (((tickAnim - 16) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*8)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 17 + (((tickAnim - 28) / 12) * (0-(17)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*8 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -9.75 + (((tickAnim - 16) / 12) * (-19.75-(-9.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12 + (((tickAnim - 16) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -19.75 + (((tickAnim - 28) / 12) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0.1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0.1 + (((tickAnim - 28) / 12) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -24.25 + (((tickAnim - 16) / 12) * (-27.25-(-24.25)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 16) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -27.25 + (((tickAnim - 28) / 12) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 28) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*20-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 40) {
            xx = -8.75 + (((tickAnim - 16) / 24) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 16) / 24) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*20 + (((tickAnim - 16) / 24) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(xx), crest.rotateAngleY + (float) Math.toRadians(yy), crest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (4.25-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 4.25 + (((tickAnim - 34) / 4) * (0-(4.25)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraManidens entity = (EntityPrehistoricFloraManidens) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 10) / 10) * (0-(8.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.4 + (((tickAnim - 10) / 10) * (0-(0.4)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 10) / 10) * (0-(9.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.75 + (((tickAnim - 10) / 10) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37 + (((tickAnim - 10) / 10) * (0-(37)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 34.25 + (((tickAnim - 10) / 10) * (0-(34.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 10) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.25 + (((tickAnim - 10) / 10) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (30.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30.13 + (((tickAnim - 5) / 3) * (3.79-(30.13)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.79 + (((tickAnim - 8) / 2) * (3.75-(3.79)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 3.75 + (((tickAnim - 10) / 5) * (27.63-(3.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 27.63 + (((tickAnim - 15) / 5) * (0-(27.63)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (22-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22 + (((tickAnim - 8) / 2) * (0-(22)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraManidens entity = (EntityPrehistoricFloraManidens) entitylivingbaseIn;
        int animCycle = 315;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = 9.5 + (((tickAnim - 40) / 248) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 9.5 + (((tickAnim - 288) / 27) * (0-(9.5)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-26.34-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -26.34 + (((tickAnim - 20) / 8) * (-15.75-(-26.34)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -15.75 + (((tickAnim - 28) / 12) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = -15.75 + (((tickAnim - 40) / 248) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = -15.75 + (((tickAnim - 288) / 27) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.69-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 13.69 + (((tickAnim - 20) / 8) * (-13.5-(13.69)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -13.5 + (((tickAnim - 28) / 12) * (-18.5-(-13.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = -18.5 + (((tickAnim - 40) / 248) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 302) {
            xx = -18.5 + (((tickAnim - 288) / 14) * (38.78-(-18.5)));
            yy = 0 + (((tickAnim - 288) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 14) * (0-(0)));
        }
        else if (tickAnim >= 302 && tickAnim < 315) {
            xx = 38.78 + (((tickAnim - 302) / 13) * (0-(38.78)));
            yy = 0 + (((tickAnim - 302) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 302) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-44.41-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -44.41 + (((tickAnim - 20) / 8) * (2.25-(-44.41)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 28) / 12) * (3.75-(2.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = 3.75 + (((tickAnim - 40) / 248) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 302) {
            xx = 3.75 + (((tickAnim - 288) / 14) * (-33.68-(3.75)));
            yy = 0 + (((tickAnim - 288) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 14) * (0-(0)));
        }
        else if (tickAnim >= 302 && tickAnim < 315) {
            xx = -33.68 + (((tickAnim - 302) / 13) * (0-(-33.68)));
            yy = 0 + (((tickAnim - 302) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 302) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (73.88-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 73.88 + (((tickAnim - 20) / 8) * (18.75-(73.88)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 18.75 + (((tickAnim - 28) / 12) * (19-(18.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = 19 + (((tickAnim - 40) / 248) * (19-(19)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 302) {
            xx = 19 + (((tickAnim - 288) / 14) * (77.71-(19)));
            yy = 0 + (((tickAnim - 288) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 14) * (0-(0)));
        }
        else if (tickAnim >= 302 && tickAnim < 315) {
            xx = 77.71 + (((tickAnim - 302) / 13) * (0-(77.71)));
            yy = 0 + (((tickAnim - 302) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 302) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.245-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = -1.245 + (((tickAnim - 20) / 8) * (-0.025-(-1.245)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = -0.025 + (((tickAnim - 28) / 12) * (-0.2-(-0.025)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = -0.2 + (((tickAnim - 40) / 248) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 288 && tickAnim < 302) {
            xx = 0 + (((tickAnim - 288) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 14) * (0-(0)));
            zz = -0.2 + (((tickAnim - 288) / 14) * (-1.275-(-0.2)));
        }
        else if (tickAnim >= 302 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 302) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 302) / 13) * (0-(0)));
            zz = -1.275 + (((tickAnim - 302) / 13) * (0-(-1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = -9.5 + (((tickAnim - 40) / 248) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = -9.5 + (((tickAnim - 288) / 27) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = -2.25 + (((tickAnim - 40) / 248) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = -2.25 + (((tickAnim - 288) / 27) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = 7 + (((tickAnim - 40) / 248) * (7-(7)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 7 + (((tickAnim - 288) / 27) * (0-(7)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = -5.25 + (((tickAnim - 40) / 248) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 248) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = -5.25 + (((tickAnim - 288) / 27) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 40) / 248) * (0-(0)));
            yy = -0.1 + (((tickAnim - 40) / 248) * (-0.1-(-0.1)));
            zz = 0.1 + (((tickAnim - 40) / 248) * (0.1-(0.1)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            yy = -0.1 + (((tickAnim - 288) / 27) * (0-(-0.1)));
            zz = 0.1 + (((tickAnim - 288) / 27) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*114.3))*-1), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 40) / 245) * (-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 315) {
            xx = -3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 285) / 30) * (0-(-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
            yy = 0 + (((tickAnim - 285) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-1 + (((tickAnim - 40) / 245) * (-13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-1-(-13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-1)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 315) {
            xx = -13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-1 + (((tickAnim - 285) / 30) * (0-(-13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-1)));
            yy = 0 + (((tickAnim - 285) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 101) {
            xx = 6.75 + (((tickAnim - 40) / 61) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 40) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 61) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 149) {
            xx = 6.75 + (((tickAnim - 101) / 48) * (-8.5-(6.75)));
            yy = 0 + (((tickAnim - 101) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 48) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = -8.5 + (((tickAnim - 149) / 26) * (-9.25-(-8.5)));
            yy = 0 + (((tickAnim - 149) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 216) {
            xx = -9.25 + (((tickAnim - 175) / 41) * (6.75-(-9.25)));
            yy = 0 + (((tickAnim - 175) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 41) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 277) {
            xx = 6.75 + (((tickAnim - 216) / 61) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 216) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 61) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 6.75 + (((tickAnim - 277) / 38) * (0-(6.75)));
            yy = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.2-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 40) / 61) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 61) * (-0.15-(-0.15)));
            zz = 0.2 + (((tickAnim - 40) / 61) * (0.2-(0.2)));
        }
        else if (tickAnim >= 101 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 101) / 48) * (0-(0)));
            yy = -0.15 + (((tickAnim - 101) / 48) * (0.225-(-0.15)));
            zz = 0.2 + (((tickAnim - 101) / 48) * (0-(0.2)));
        }
        else if (tickAnim >= 149 && tickAnim < 216) {
            xx = 0 + (((tickAnim - 149) / 67) * (0-(0)));
            yy = 0.225 + (((tickAnim - 149) / 67) * (-0.15-(0.225)));
            zz = 0 + (((tickAnim - 149) / 67) * (0.2-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 216) / 61) * (0-(0)));
            yy = -0.15 + (((tickAnim - 216) / 61) * (-0.15-(-0.15)));
            zz = 0.2 + (((tickAnim - 216) / 61) * (0.2-(0.2)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            yy = -0.15 + (((tickAnim - 277) / 38) * (0-(-0.15)));
            zz = 0.2 + (((tickAnim - 277) / 38) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 101) {
            xx = 8 + (((tickAnim - 40) / 61) * (8-(8)));
            yy = 0 + (((tickAnim - 40) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 61) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 149) {
            xx = 8 + (((tickAnim - 101) / 48) * (0-(8)));
            yy = 0 + (((tickAnim - 101) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 48) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 149) / 26) * (-1-(0)));
            yy = 0 + (((tickAnim - 149) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 216) {
            xx = -1 + (((tickAnim - 175) / 41) * (8-(-1)));
            yy = 0 + (((tickAnim - 175) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 41) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 277) {
            xx = 8 + (((tickAnim - 216) / 61) * (8-(8)));
            yy = 0 + (((tickAnim - 216) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 61) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 8 + (((tickAnim - 277) / 38) * (0-(8)));
            yy = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 38) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 40) * (0.575-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 40) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 61) * (0-(0)));
            zz = 0.575 + (((tickAnim - 40) / 61) * (0.575-(0.575)));
        }
        else if (tickAnim >= 101 && tickAnim < 216) {
            xx = 0 + (((tickAnim - 101) / 115) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 115) * (0-(0)));
            zz = 0.575 + (((tickAnim - 101) / 115) * (0.575-(0.575)));
        }
        else if (tickAnim >= 216 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 216) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 216) / 61) * (0-(0)));
            zz = 0.575 + (((tickAnim - 216) / 61) * (0.575-(0.575)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            zz = 0.575 + (((tickAnim - 277) / 38) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10.5691-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (13.25071-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-15.79475-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 277) {
            xx = 10.5691 + (((tickAnim - 40) / 237) * (10.5691-(10.5691)));
            yy = 13.25071 + (((tickAnim - 40) / 237) * (13.25071-(13.25071)));
            zz = -15.79475 + (((tickAnim - 40) / 237) * (-15.79475-(-15.79475)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 10.5691 + (((tickAnim - 277) / 38) * (0-(10.5691)));
            yy = 13.25071 + (((tickAnim - 277) / 38) * (0-(13.25071)));
            zz = -15.79475 + (((tickAnim - 277) / 38) * (0-(-15.79475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 21 + (((tickAnim - 40) / 13) * (31-(21)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 31 + (((tickAnim - 53) / 5) * (30.5-(31)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 30.5 + (((tickAnim - 58) / 3) * (31-(30.5)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 72) {
            xx = 31 + (((tickAnim - 61) / 11) * (15.5-(31)));
            yy = 0 + (((tickAnim - 61) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 11) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 15.5 + (((tickAnim - 72) / 8) * (21-(15.5)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 21 + (((tickAnim - 80) / 13) * (31-(21)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 31 + (((tickAnim - 93) / 5) * (30.5-(31)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 30.5 + (((tickAnim - 98) / 3) * (31-(30.5)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 150) {
            xx = 31 + (((tickAnim - 101) / 49) * (0-(31)));
            yy = 0 + (((tickAnim - 101) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 49) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 150) / 25) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 150) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 25) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 216) {
            xx = -1.75 + (((tickAnim - 175) / 41) * (21-(-1.75)));
            yy = 0 + (((tickAnim - 175) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 41) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 228) {
            xx = 21 + (((tickAnim - 216) / 12) * (31-(21)));
            yy = 0 + (((tickAnim - 216) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 12) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 31 + (((tickAnim - 228) / 5) * (30.5-(31)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 30.5 + (((tickAnim - 233) / 4) * (31-(30.5)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 248) {
            xx = 31 + (((tickAnim - 237) / 11) * (15.5-(31)));
            yy = 0 + (((tickAnim - 237) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 11) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 256) {
            xx = 15.5 + (((tickAnim - 248) / 8) * (21-(15.5)));
            yy = 0 + (((tickAnim - 248) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 8) * (0-(0)));
        }
        else if (tickAnim >= 256 && tickAnim < 268) {
            xx = 21 + (((tickAnim - 256) / 12) * (31-(21)));
            yy = 0 + (((tickAnim - 256) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 256) / 12) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 273) {
            xx = 31 + (((tickAnim - 268) / 5) * (30.5-(31)));
            yy = 0 + (((tickAnim - 268) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 5) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 277) {
            xx = 30.5 + (((tickAnim - 273) / 4) * (31-(30.5)));
            yy = 0 + (((tickAnim - 273) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 4) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 31 + (((tickAnim - 277) / 38) * (0-(31)));
            yy = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 29.5 + (((tickAnim - 53) / 5) * (28.5-(29.5)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 28.5 + (((tickAnim - 58) / 3) * (29.5-(28.5)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 72) {
            xx = 29.5 + (((tickAnim - 61) / 11) * (4.75-(29.5)));
            yy = 0 + (((tickAnim - 61) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 11) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 93) {
            xx = 4.75 + (((tickAnim - 72) / 21) * (29.5-(4.75)));
            yy = 0 + (((tickAnim - 72) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 21) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 29.5 + (((tickAnim - 93) / 5) * (28.5-(29.5)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 28.5 + (((tickAnim - 98) / 3) * (29.5-(28.5)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 112) {
            xx = 29.5 + (((tickAnim - 101) / 11) * (4.75-(29.5)));
            yy = 0 + (((tickAnim - 101) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 11) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 150) {
            xx = 4.75 + (((tickAnim - 112) / 38) * (0-(4.75)));
            yy = 0 + (((tickAnim - 112) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 38) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 150) / 25) * (7-(0)));
            yy = 0 + (((tickAnim - 150) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 25) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 228) {
            xx = 7 + (((tickAnim - 175) / 53) * (29.5-(7)));
            yy = 0 + (((tickAnim - 175) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 53) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 29.5 + (((tickAnim - 228) / 5) * (28.5-(29.5)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 28.5 + (((tickAnim - 233) / 4) * (29.5-(28.5)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 248) {
            xx = 29.5 + (((tickAnim - 237) / 11) * (4.75-(29.5)));
            yy = 0 + (((tickAnim - 237) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 11) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 268) {
            xx = 4.75 + (((tickAnim - 248) / 20) * (29.5-(4.75)));
            yy = 0 + (((tickAnim - 248) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 20) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 273) {
            xx = 29.5 + (((tickAnim - 268) / 5) * (28.5-(29.5)));
            yy = 0 + (((tickAnim - 268) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 5) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 277) {
            xx = 28.5 + (((tickAnim - 273) / 4) * (29.5-(28.5)));
            yy = 0 + (((tickAnim - 273) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 4) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 288) {
            xx = 29.5 + (((tickAnim - 277) / 11) * (4.75-(29.5)));
            yy = 0 + (((tickAnim - 277) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 11) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 4.75 + (((tickAnim - 288) / 27) * (0-(4.75)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 53) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 53) / 8) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 53) / 8) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 61) / 32) * (0-(0)));
            yy = -0.15 + (((tickAnim - 61) / 32) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 61) / 32) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 93) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 93) / 8) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 93) / 8) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 101) / 127) * (0-(0)));
            yy = -0.15 + (((tickAnim - 101) / 127) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 101) / 127) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 228) / 9) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 228) / 9) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 237) / 31) * (0-(0)));
            yy = -0.15 + (((tickAnim - 237) / 31) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 237) / 31) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 268) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 268) / 9) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 268) / 9) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            yy = -0.15 + (((tickAnim - 277) / 38) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 277) / 38) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 13.5 + (((tickAnim - 40) / 13) * (-2-(13.5)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -2 + (((tickAnim - 53) / 5) * (-3.25-(-2)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = -3.25 + (((tickAnim - 58) / 3) * (-2-(-3.25)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 72) {
            xx = -2 + (((tickAnim - 61) / 11) * (22.25-(-2)));
            yy = 0 + (((tickAnim - 61) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 11) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 22.25 + (((tickAnim - 72) / 8) * (13.5-(22.25)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 13.5 + (((tickAnim - 80) / 13) * (-2-(13.5)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -2 + (((tickAnim - 93) / 5) * (-3.25-(-2)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = -3.25 + (((tickAnim - 98) / 3) * (-2-(-3.25)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 112) {
            xx = -2 + (((tickAnim - 101) / 11) * (22.25-(-2)));
            yy = 0 + (((tickAnim - 101) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 11) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 131) {
            xx = 22.25 + (((tickAnim - 112) / 19) * (-11.55-(22.25)));
            yy = 0 + (((tickAnim - 112) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 19) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 175) {
            xx = -11.55 + (((tickAnim - 131) / 44) * (12.25-(-11.55)));
            yy = 0 + (((tickAnim - 131) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 44) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 216) {
            xx = 12.25 + (((tickAnim - 175) / 41) * (13.5-(12.25)));
            yy = 0 + (((tickAnim - 175) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 41) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 228) {
            xx = 13.5 + (((tickAnim - 216) / 12) * (-2-(13.5)));
            yy = 0 + (((tickAnim - 216) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 12) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = -2 + (((tickAnim - 228) / 5) * (-3.25-(-2)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = -3.25 + (((tickAnim - 233) / 4) * (-2-(-3.25)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 248) {
            xx = -2 + (((tickAnim - 237) / 11) * (22.25-(-2)));
            yy = 0 + (((tickAnim - 237) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 11) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 256) {
            xx = 22.25 + (((tickAnim - 248) / 8) * (13.5-(22.25)));
            yy = 0 + (((tickAnim - 248) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 8) * (0-(0)));
        }
        else if (tickAnim >= 256 && tickAnim < 268) {
            xx = 13.5 + (((tickAnim - 256) / 12) * (-2-(13.5)));
            yy = 0 + (((tickAnim - 256) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 256) / 12) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 273) {
            xx = -2 + (((tickAnim - 268) / 5) * (-3.25-(-2)));
            yy = 0 + (((tickAnim - 268) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 5) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 277) {
            xx = -3.25 + (((tickAnim - 273) / 4) * (-2-(-3.25)));
            yy = 0 + (((tickAnim - 273) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 4) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 288) {
            xx = -2 + (((tickAnim - 277) / 11) * (22.25-(-2)));
            yy = 0 + (((tickAnim - 277) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 11) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 22.25 + (((tickAnim - 288) / 27) * (0-(22.25)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 9 + (((tickAnim - 40) / 9) * (-9.12-(9)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -9.12 + (((tickAnim - 49) / 4) * (-9.5-(-9.12)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -9.5 + (((tickAnim - 53) / 5) * (-4.5-(-9.5)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = -4.5 + (((tickAnim - 58) / 3) * (-9.5-(-4.5)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = -9.5 + (((tickAnim - 61) / 5) * (4.37-(-9.5)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 4.37 + (((tickAnim - 66) / 6) * (10.25-(4.37)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 6) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 10.25 + (((tickAnim - 72) / 8) * (9-(10.25)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 89) {
            xx = 9 + (((tickAnim - 80) / 9) * (-9.12-(9)));
            yy = 0 + (((tickAnim - 80) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 9) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 93) {
            xx = -9.12 + (((tickAnim - 89) / 4) * (-9.5-(-9.12)));
            yy = 0 + (((tickAnim - 89) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 4) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -9.5 + (((tickAnim - 93) / 5) * (-4.5-(-9.5)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = -4.5 + (((tickAnim - 98) / 3) * (-9.5-(-4.5)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -9.5 + (((tickAnim - 101) / 5) * (4.37-(-9.5)));
            yy = 0 + (((tickAnim - 101) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 5) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 112) {
            xx = 4.37 + (((tickAnim - 106) / 6) * (10.25-(4.37)));
            yy = 0 + (((tickAnim - 106) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 6) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 10.25 + (((tickAnim - 112) / 8) * (3.06-(10.25)));
            yy = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 131) {
            xx = 3.06 + (((tickAnim - 120) / 11) * (0.57-(3.06)));
            yy = 0 + (((tickAnim - 120) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 11) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 133) {
            xx = 0.57 + (((tickAnim - 131) / 2) * (-1.58-(0.57)));
            yy = 0 + (((tickAnim - 131) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 2) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = -1.58 + (((tickAnim - 133) / 3) * (-2.43-(-1.58)));
            yy = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 3) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 138) {
            xx = -2.43 + (((tickAnim - 136) / 2) * (-7.58-(-2.43)));
            yy = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 2) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = -7.58 + (((tickAnim - 138) / 4) * (-7.29-(-7.58)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 144) {
            xx = -7.29 + (((tickAnim - 142) / 2) * (-8.86-(-7.29)));
            yy = 0 + (((tickAnim - 142) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 2) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 150) {
            xx = -8.86 + (((tickAnim - 144) / 6) * (2.57-(-8.86)));
            yy = 0 + (((tickAnim - 144) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 6) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 158) {
            xx = 2.57 + (((tickAnim - 150) / 8) * (-3.26-(2.57)));
            yy = 0 + (((tickAnim - 150) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 8) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 161) {
            xx = -3.26 + (((tickAnim - 158) / 3) * (-7.24-(-3.26)));
            yy = 0 + (((tickAnim - 158) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 3) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 163) {
            xx = -7.24 + (((tickAnim - 161) / 2) * (-6.09-(-7.24)));
            yy = 0 + (((tickAnim - 161) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 2) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 166) {
            xx = -6.09 + (((tickAnim - 163) / 3) * (-9.24-(-6.09)));
            yy = 0 + (((tickAnim - 163) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 3) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 168) {
            xx = -9.24 + (((tickAnim - 166) / 2) * (-10.09-(-9.24)));
            yy = 0 + (((tickAnim - 166) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 2) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = -10.09 + (((tickAnim - 168) / 7) * (-16.43-(-10.09)));
            yy = 0 + (((tickAnim - 168) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 7) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 216) {
            xx = -16.43 + (((tickAnim - 175) / 41) * (9-(-16.43)));
            yy = 0 + (((tickAnim - 175) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 41) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 225) {
            xx = 9 + (((tickAnim - 216) / 9) * (-9.12-(9)));
            yy = 0 + (((tickAnim - 216) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 9) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 228) {
            xx = -9.12 + (((tickAnim - 225) / 3) * (-9.5-(-9.12)));
            yy = 0 + (((tickAnim - 225) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 3) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = -9.5 + (((tickAnim - 228) / 5) * (-4.5-(-9.5)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = -4.5 + (((tickAnim - 233) / 4) * (-9.5-(-4.5)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 242) {
            xx = -9.5 + (((tickAnim - 237) / 5) * (4.37-(-9.5)));
            yy = 0 + (((tickAnim - 237) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 5) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 248) {
            xx = 4.37 + (((tickAnim - 242) / 6) * (10.25-(4.37)));
            yy = 0 + (((tickAnim - 242) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 6) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 256) {
            xx = 10.25 + (((tickAnim - 248) / 8) * (9-(10.25)));
            yy = 0 + (((tickAnim - 248) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 8) * (0-(0)));
        }
        else if (tickAnim >= 256 && tickAnim < 265) {
            xx = 9 + (((tickAnim - 256) / 9) * (-9.12-(9)));
            yy = 0 + (((tickAnim - 256) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 256) / 9) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 268) {
            xx = -9.12 + (((tickAnim - 265) / 3) * (-9.5-(-9.12)));
            yy = 0 + (((tickAnim - 265) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 3) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 273) {
            xx = -9.5 + (((tickAnim - 268) / 5) * (-4.5-(-9.5)));
            yy = 0 + (((tickAnim - 268) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 5) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 277) {
            xx = -4.5 + (((tickAnim - 273) / 4) * (-9.5-(-4.5)));
            yy = 0 + (((tickAnim - 273) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 4) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 282) {
            xx = -9.5 + (((tickAnim - 277) / 5) * (4.37-(-9.5)));
            yy = 0 + (((tickAnim - 277) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 5) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 288) {
            xx = 4.37 + (((tickAnim - 282) / 6) * (10.25-(4.37)));
            yy = 0 + (((tickAnim - 282) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 6) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 10.25 + (((tickAnim - 288) / 27) * (0-(10.25)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 19.75 + (((tickAnim - 40) / 13) * (-21.25-(19.75)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -21.25 + (((tickAnim - 53) / 5) * (-17.25-(-21.25)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = -17.25 + (((tickAnim - 58) / 3) * (-21.25-(-17.25)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 80) {
            xx = -21.25 + (((tickAnim - 61) / 19) * (19.75-(-21.25)));
            yy = 0 + (((tickAnim - 61) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 19) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 19.75 + (((tickAnim - 80) / 13) * (-21.25-(19.75)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -21.25 + (((tickAnim - 93) / 5) * (-17.25-(-21.25)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = -17.25 + (((tickAnim - 98) / 3) * (-21.25-(-17.25)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 150) {
            xx = -21.25 + (((tickAnim - 101) / 49) * (12.5-(-21.25)));
            yy = 0 + (((tickAnim - 101) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 49) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 315) {
            xx = 12.5 + (((tickAnim - 150) / 165) * (0-(12.5)));
            yy = 0 + (((tickAnim - 150) / 165) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 165) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(xx), crest.rotateAngleY + (float) Math.toRadians(yy), crest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 40) / 9) * (17.5-(0)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 17.5 + (((tickAnim - 49) / 4) * (0-(17.5)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 8.5 + (((tickAnim - 58) / 3) * (0-(8.5)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 61) / 5) * (5.75-(0)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 5.75 + (((tickAnim - 66) / 6) * (0-(5.75)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 6) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 80) / 9) * (17.5-(0)));
            yy = 0 + (((tickAnim - 80) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 9) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 93) {
            xx = 17.5 + (((tickAnim - 89) / 4) * (0-(17.5)));
            yy = 0 + (((tickAnim - 89) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 4) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 93) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 8.5 + (((tickAnim - 98) / 3) * (0-(8.5)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 101) / 5) * (5.75-(0)));
            yy = 0 + (((tickAnim - 101) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 5) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 112) {
            xx = 5.75 + (((tickAnim - 106) / 6) * (0-(5.75)));
            yy = 0 + (((tickAnim - 106) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 6) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 216) {
            xx = 0 + (((tickAnim - 112) / 104) * (0-(0)));
            yy = 0 + (((tickAnim - 112) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 104) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 216) / 9) * (17.5-(0)));
            yy = 0 + (((tickAnim - 216) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 9) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 228) {
            xx = 17.5 + (((tickAnim - 225) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 225) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 3) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 228) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 8.5 + (((tickAnim - 233) / 4) * (0-(8.5)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 237) / 5) * (5.75-(0)));
            yy = 0 + (((tickAnim - 237) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 5) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 248) {
            xx = 5.75 + (((tickAnim - 242) / 6) * (0-(5.75)));
            yy = 0 + (((tickAnim - 242) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 6) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 256) {
            xx = 0 + (((tickAnim - 248) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 248) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 8) * (0-(0)));
        }
        else if (tickAnim >= 256 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 256) / 9) * (17.5-(0)));
            yy = 0 + (((tickAnim - 256) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 256) / 9) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 268) {
            xx = 17.5 + (((tickAnim - 265) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 265) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 3) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 268) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 268) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 5) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 277) {
            xx = 8.5 + (((tickAnim - 273) / 4) * (0-(8.5)));
            yy = 0 + (((tickAnim - 273) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 4) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 282) {
            xx = 0 + (((tickAnim - 277) / 5) * (5.75-(0)));
            yy = 0 + (((tickAnim - 277) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 5) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 288) {
            xx = 5.75 + (((tickAnim - 282) / 6) * (0-(5.75)));
            yy = 0 + (((tickAnim - 282) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraManidens entity = (EntityPrehistoricFloraManidens) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(11+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-50))*5), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-90))*-4), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-90))*-4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-170))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-120))*1.5);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -31 + (((tickAnim - 0) / 7) * (48.25-(-31)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 48.25 + (((tickAnim - 7) / 6) * (-31-(48.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -12.25 + (((tickAnim - 0) / 7) * (10-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 7) / 1) * (30.3-(10)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 30.3 + (((tickAnim - 8) / 1) * (29.62-(30.3)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 29.62 + (((tickAnim - 9) / 3) * (-16.28-(29.62)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -16.28 + (((tickAnim - 12) / 1) * (-12.25-(-16.28)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 7) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
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
            xx = 15.5 + (((tickAnim - 0) / 3) * (2.33-(15.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 2.33 + (((tickAnim - 3) / 4) * (0-(2.33)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-41.67-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -41.67 + (((tickAnim - 9) / 2) * (-41.67-(-41.67)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -41.67 + (((tickAnim - 11) / 2) * (15.5-(-41.67)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 1) * (0.125-(-0.225)));
            zz = 0.025 + (((tickAnim - 0) / 1) * (-0.16-(0.025)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.125 + (((tickAnim - 1) / 1) * (0-(0.125)));
            zz = -0.16 + (((tickAnim - 1) / 1) * (0.045-(-0.16)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0.045 + (((tickAnim - 2) / 5) * (0-(0.045)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.355-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.055-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.355 + (((tickAnim - 9) / 2) * (0.355-(0.355)));
            zz = 0.055 + (((tickAnim - 9) / 2) * (0.055-(0.055)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.355 + (((tickAnim - 11) / 2) * (-0.225-(0.355)));
            zz = 0.055 + (((tickAnim - 11) / 2) * (0.025-(0.055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 20 + (((tickAnim - 0) / 2) * (-6.35-(20)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -6.35 + (((tickAnim - 2) / 5) * (49.5-(-6.35)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 49.5 + (((tickAnim - 7) / 1) * (76.3-(49.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 76.3 + (((tickAnim - 8) / 1) * (84.3-(76.3)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 84.3 + (((tickAnim - 9) / 2) * (97.3-(84.3)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 97.3 + (((tickAnim - 11) / 2) * (20-(97.3)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 1) * (1.06-(-1)));
            zz = -0.15 + (((tickAnim - 0) / 1) * (-0.915-(-0.15)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.06 + (((tickAnim - 1) / 1) * (1.15-(1.06)));
            zz = -0.915 + (((tickAnim - 1) / 1) * (-1-(-0.915)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.15 + (((tickAnim - 2) / 1) * (-0.78-(1.15)));
            zz = -1 + (((tickAnim - 2) / 1) * (-0.365-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.78 + (((tickAnim - 3) / 4) * (0-(-0.78)));
            zz = -0.365 + (((tickAnim - 3) / 4) * (-0.925-(-0.365)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.15-(0)));
            zz = -0.925 + (((tickAnim - 7) / 1) * (-1.55-(-0.925)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.15 + (((tickAnim - 8) / 1) * (0.39-(0.15)));
            zz = -1.55 + (((tickAnim - 8) / 1) * (-2.19-(-1.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.39 + (((tickAnim - 9) / 2) * (0.39-(0.39)));
            zz = -2.19 + (((tickAnim - 9) / 2) * (-2.19-(-2.19)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.39 + (((tickAnim - 11) / 2) * (-1-(0.39)));
            zz = -2.19 + (((tickAnim - 11) / 2) * (-0.15-(-2.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 37.5 + (((tickAnim - 0) / 4) * (-27.43-(37.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -27.43 + (((tickAnim - 4) / 2) * (-23.75-(-27.43)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -23.75 + (((tickAnim - 6) / 7) * (37.5-(-23.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.25 + (((tickAnim - 0) / 3) * (47.78-(16.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 47.78 + (((tickAnim - 3) / 3) * (-21.25-(47.78)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -21.25 + (((tickAnim - 6) / 7) * (16.25-(-21.25)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 6) / 7) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-41.67-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -41.67 + (((tickAnim - 3) / 1) * (-41.67-(-41.67)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -41.67 + (((tickAnim - 4) / 2) * (23.75-(-41.67)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 23.75 + (((tickAnim - 6) / 7) * (0-(23.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.355-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.055-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.355 + (((tickAnim - 3) / 1) * (0.355-(0.355)));
            zz = 0.055 + (((tickAnim - 3) / 1) * (0.055-(0.055)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.355 + (((tickAnim - 4) / 2) * (-0.225-(0.355)));
            zz = 0.055 + (((tickAnim - 4) / 2) * (0.025-(0.055)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 6) / 7) * (0-(-0.225)));
            zz = 0.025 + (((tickAnim - 6) / 7) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 64.5 + (((tickAnim - 0) / 2) * (76.3-(64.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 76.3 + (((tickAnim - 2) / 1) * (84.3-(76.3)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 84.3 + (((tickAnim - 3) / 1) * (84.3-(84.3)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 84.3 + (((tickAnim - 4) / 2) * (15-(84.3)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 15 + (((tickAnim - 6) / 1) * (8.53569-(15)));
            yy = 0 + (((tickAnim - 6) / 1) * (-3.46133-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-0.51917-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 8.53569 + (((tickAnim - 7) / 1) * (-25.49692-(8.53569)));
            yy = -3.46133 + (((tickAnim - 7) / 1) * (-0.94569-(-3.46133)));
            zz = -0.51917 + (((tickAnim - 7) / 1) * (2.66546-(-0.51917)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -25.49692 + (((tickAnim - 8) / 5) * (64.5-(-25.49692)));
            yy = -0.94569 + (((tickAnim - 8) / 5) * (0-(-0.94569)));
            zz = 2.66546 + (((tickAnim - 8) / 5) * (0-(2.66546)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.15-(0)));
            zz = -0.925 + (((tickAnim - 0) / 2) * (-1.55-(-0.925)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.15 + (((tickAnim - 2) / 1) * (0.39-(0.15)));
            zz = -1.55 + (((tickAnim - 2) / 1) * (-2.19-(-1.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.39 + (((tickAnim - 3) / 1) * (0.39-(0.39)));
            zz = -2.19 + (((tickAnim - 3) / 1) * (-2.19-(-2.19)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.39 + (((tickAnim - 4) / 2) * (0-(0.39)));
            zz = -2.19 + (((tickAnim - 4) / 2) * (0-(-2.19)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.94-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-1.485-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.94 + (((tickAnim - 7) / 1) * (1.805-(0.94)));
            zz = -1.485 + (((tickAnim - 7) / 1) * (-1.6-(-1.485)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.805 + (((tickAnim - 8) / 0) * (0.475-(1.805)));
            zz = -1.6 + (((tickAnim - 8) / 0) * (-0.725-(-1.6)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 2) * (-0.675-(0.475)));
            zz = -0.725 + (((tickAnim - 8) / 2) * (0-(-0.725)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.675 + (((tickAnim - 10) / 3) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.925-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5))*4), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*-6), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-90))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-100))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*-10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-90))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-150))*5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-200))*-15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-90))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-200))*10), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-250))*-20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-90))*-7));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-100))*-4), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-90))*3), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-170))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-150))*7), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-240))*4));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.25);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-100))*3.5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-150))*-4.5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-100))*3.5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-150))*-4.5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-250))*5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-350))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-400))*7), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-420))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-425))*-15), crest.rotateAngleY + (float) Math.toRadians(0), crest.rotateAngleZ + (float) Math.toRadians(0));
        

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraManidens entity = (EntityPrehistoricFloraManidens) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*0.5);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -23.5 + (((tickAnim - 0) / 13) * (37.5-(-23.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 37.5 + (((tickAnim - 13) / 12) * (-23.5-(37.5)));
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
            xx = -4.75 + (((tickAnim - 0) / 13) * (16.25-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 16.25 + (((tickAnim - 13) / 2) * (30.3-(16.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 30.3 + (((tickAnim - 15) / 10) * (-4.75-(30.3)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 13) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 21.25 + (((tickAnim - 0) / 6) * (2.33-(21.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 2.33 + (((tickAnim - 6) / 7) * (0-(2.33)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-41.67-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -41.67 + (((tickAnim - 18) / 4) * (-41.67-(-41.67)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -41.67 + (((tickAnim - 22) / 3) * (21.25-(-41.67)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 13) * (0-(-0.125)));
            zz = 0.15 + (((tickAnim - 0) / 13) * (0-(0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.355-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.055-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.355 + (((tickAnim - 18) / 4) * (0.355-(0.355)));
            zz = 0.055 + (((tickAnim - 18) / 4) * (0.055-(0.055)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.355 + (((tickAnim - 22) / 3) * (-0.125-(0.355)));
            zz = 0.055 + (((tickAnim - 22) / 3) * (0.15-(0.055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 6 + (((tickAnim - 0) / 6) * (-12.95-(6)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -12.95 + (((tickAnim - 6) / 7) * (49.5-(-12.95)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 49.5 + (((tickAnim - 13) / 2) * (76.3-(49.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 76.3 + (((tickAnim - 15) / 3) * (84.3-(76.3)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 84.3 + (((tickAnim - 18) / 4) * (84.3-(84.3)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 84.3 + (((tickAnim - 22) / 3) * (6-(84.3)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.575 + (((tickAnim - 0) / 3) * (0.425-(-0.575)));
            zz = 0.075 + (((tickAnim - 0) / 3) * (-0.4-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 3) * (-0.825-(0.425)));
            zz = -0.4 + (((tickAnim - 3) / 3) * (0.475-(-0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.825 + (((tickAnim - 6) / 7) * (0-(-0.825)));
            zz = 0.475 + (((tickAnim - 6) / 7) * (-0.925-(0.475)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.15-(0)));
            zz = -0.925 + (((tickAnim - 13) / 2) * (-1.55-(-0.925)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 3) * (0.39-(0.15)));
            zz = -1.55 + (((tickAnim - 15) / 3) * (-2.19-(-1.55)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.39 + (((tickAnim - 18) / 4) * (0.39-(0.39)));
            zz = -2.19 + (((tickAnim - 18) / 4) * (-2.19-(-2.19)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.39 + (((tickAnim - 22) / 3) * (-0.575-(0.39)));
            zz = -2.19 + (((tickAnim - 22) / 3) * (0.075-(-2.19)));
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
            xx = 37.5 + (((tickAnim - 0) / 12) * (-23.5-(37.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.5 + (((tickAnim - 12) / 13) * (37.5-(-23.5)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.25 + (((tickAnim - 0) / 3) * (30.3-(16.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 30.3 + (((tickAnim - 3) / 9) * (-4.75-(30.3)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -4.75 + (((tickAnim - 12) / 13) * (16.25-(-4.75)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -0.3 + (((tickAnim - 12) / 13) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-41.67-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -41.67 + (((tickAnim - 5) / 3) * (-41.67-(-41.67)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -41.67 + (((tickAnim - 8) / 4) * (21.25-(-41.67)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 21.25 + (((tickAnim - 12) / 13) * (0-(21.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.355-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.055-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.355 + (((tickAnim - 5) / 3) * (0.355-(0.355)));
            zz = 0.055 + (((tickAnim - 5) / 3) * (0.055-(0.055)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.355 + (((tickAnim - 8) / 4) * (-0.125-(0.355)));
            zz = 0.055 + (((tickAnim - 8) / 4) * (0.15-(0.055)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -0.125 + (((tickAnim - 12) / 13) * (0-(-0.125)));
            zz = 0.15 + (((tickAnim - 12) / 13) * (0-(0.15)));
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
            xx = 49.5 + (((tickAnim - 0) / 3) * (76.3-(49.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 76.3 + (((tickAnim - 3) / 2) * (84.3-(76.3)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 84.3 + (((tickAnim - 5) / 3) * (84.3-(84.3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 84.3 + (((tickAnim - 8) / 4) * (10.75-(84.3)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 10.75 + (((tickAnim - 12) / 5) * (-16.69-(10.75)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -16.69 + (((tickAnim - 17) / 8) * (49.5-(-16.69)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
            zz = -0.925 + (((tickAnim - 0) / 3) * (-1.55-(-0.925)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 3) / 2) * (0.39-(0.15)));
            zz = -1.55 + (((tickAnim - 3) / 2) * (-2.19-(-1.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.39 + (((tickAnim - 5) / 3) * (0.39-(0.39)));
            zz = -2.19 + (((tickAnim - 5) / 3) * (-2.19-(-2.19)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.39 + (((tickAnim - 8) / 4) * (-0.575-(0.39)));
            zz = -2.19 + (((tickAnim - 8) / 4) * (0.075-(-2.19)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.575 + (((tickAnim - 12) / 2) * (0.39-(-0.575)));
            zz = 0.075 + (((tickAnim - 12) / 2) * (-0.56-(0.075)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.39 + (((tickAnim - 14) / 3) * (-0.15-(0.39)));
            zz = -0.56 + (((tickAnim - 14) / 3) * (0-(-0.56)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 17) / 8) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 17) / 8) * (-0.925-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*7), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*-2.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-240))*2));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*3.5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-4.5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*3.5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-4.5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*3.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-420))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-425))*-4), crest.rotateAngleY + (float) Math.toRadians(0), crest.rotateAngleZ + (float) Math.toRadians(0));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraManidens e = (EntityPrehistoricFloraManidens) entity;
        animator.update(entity);


    }
}
