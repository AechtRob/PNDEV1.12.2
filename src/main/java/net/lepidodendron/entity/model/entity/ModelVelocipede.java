package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelVelocipede extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Velocipede;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg10;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftLeg11;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftLeg12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightLeg12;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLeg13;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightLeg13;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftLeg14;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightLeg14;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftLeg15;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightLeg15;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leftLeg16;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightLeg16;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftLeg17;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightLeg17;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftLeg18;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightLeg18;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftLeg19;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftLeg20;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer rightLeg20;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightLeg19;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer ultimatelegleft;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer ultimatelegright;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer leftLeg21;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer rightLeg21;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer leftLeg22;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer rightLeg22;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer leftFang;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer rightFang;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer rightAntenna1;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer leftAntenna1;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer cube_r50;

    private ModelAnimator animator;

    public ModelVelocipede() {
        this.textureWidth = 32;
        this.textureHeight = 29;

        this.Velocipede = new AdvancedModelRenderer(this);
        this.Velocipede.setRotationPoint(0.0F, 22.6F, -10.2F);
        this.Velocipede.cubeList.add(new ModelBox(Velocipede, 15, 0, -1.0F, -0.2F, -1.9F, 2, 1, 5, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.3F, 3.1F);
        this.Velocipede.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -1.0F, -0.5F, 0.0F, 2, 1, 5, 0.01F, false));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(1.0F, 0.5F, 2.4F);
        this.body1.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0F, -0.4451F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg8.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 28, 0.0316F, -0.9928F, -0.1974F, 2, 1, 0, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-1.0F, 0.5F, 2.4F);
        this.body1.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.4451F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg8.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 28, -2.0316F, -0.9928F, -0.1974F, 2, 1, 0, 0.0F, true));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(1.0F, 0.5F, 3.7F);
        this.body1.addChild(leftLeg9);
        this.setRotateAngle(leftLeg9, 0.0F, -0.4451F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg9.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 28, 0.0316F, -0.9928F, -0.1974F, 2, 1, 0, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(-1.0F, 0.5F, 3.7F);
        this.body1.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.4451F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg9.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 28, -2.0316F, -0.9928F, -0.1974F, 2, 1, 0, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(1.0F, 0.5F, 1.3F);
        this.body1.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, -0.4451F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg7.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 21, 0.0316F, -0.9928F, -0.1974F, 2, 1, 0, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-1.0F, 0.5F, 1.3F);
        this.body1.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.4451F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg7.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 21, -2.0316F, -0.9928F, -0.1974F, 2, 1, 0, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.body1.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, -0.4887F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2115F, 0.6831F, 0.5326F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 28, 0.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.body1.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.4887F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg6.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2115F, -0.6831F, -0.5326F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 28, -2.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(1.0F, 0.5F, 4.8F);
        this.body1.addChild(leftLeg10);
        this.setRotateAngle(leftLeg10, 0.0F, -0.4451F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg10.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 15, 0.0316F, -0.9928F, -0.1974F, 2, 1, 0, 0.0F, false));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(-1.0F, 0.5F, 4.8F);
        this.body1.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.4451F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg10.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 15, -2.0316F, -0.9928F, -0.1974F, 2, 1, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 7, -1.0F, -0.4F, 0.0F, 2, 1, 5, 0.0F, false));

        this.leftLeg11 = new AdvancedModelRenderer(this);
        this.leftLeg11.setRotationPoint(0.9F, 0.6F, 0.5F);
        this.body2.addChild(leftLeg11);
        this.setRotateAngle(leftLeg11, 0.0F, -0.7243F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg11.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 24, 0.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, false));

        this.rightLeg11 = new AdvancedModelRenderer(this);
        this.rightLeg11.setRotationPoint(-0.9F, 0.6F, 0.5F);
        this.body2.addChild(rightLeg11);
        this.setRotateAngle(rightLeg11, 0.0F, 0.7243F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg11.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 24, -3.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, true));

        this.leftLeg12 = new AdvancedModelRenderer(this);
        this.leftLeg12.setRotationPoint(0.9F, 0.6F, 1.5F);
        this.body2.addChild(leftLeg12);
        this.setRotateAngle(leftLeg12, 0.0F, -0.7941F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg12.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 24, 0.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, false));

        this.rightLeg12 = new AdvancedModelRenderer(this);
        this.rightLeg12.setRotationPoint(-0.9F, 0.6F, 1.5F);
        this.body2.addChild(rightLeg12);
        this.setRotateAngle(rightLeg12, 0.0F, 0.7941F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg12.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 24, -3.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, true));

        this.leftLeg13 = new AdvancedModelRenderer(this);
        this.leftLeg13.setRotationPoint(0.9F, 0.6F, 2.3F);
        this.body2.addChild(leftLeg13);
        this.setRotateAngle(leftLeg13, 0.0F, -0.8639F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg13.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 24, 0.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, false));

        this.rightLeg13 = new AdvancedModelRenderer(this);
        this.rightLeg13.setRotationPoint(-0.9F, 0.6F, 2.3F);
        this.body2.addChild(rightLeg13);
        this.setRotateAngle(rightLeg13, 0.0F, 0.8639F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg13.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 24, -3.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, true));

        this.leftLeg14 = new AdvancedModelRenderer(this);
        this.leftLeg14.setRotationPoint(0.9F, 0.6F, 3.3F);
        this.body2.addChild(leftLeg14);
        this.setRotateAngle(leftLeg14, 0.0F, -0.8639F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg14.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 25, 0.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, false));

        this.rightLeg14 = new AdvancedModelRenderer(this);
        this.rightLeg14.setRotationPoint(-0.9F, 0.6F, 3.3F);
        this.body2.addChild(rightLeg14);
        this.setRotateAngle(rightLeg14, 0.0F, 0.8639F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg14.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 25, -3.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, true));

        this.leftLeg15 = new AdvancedModelRenderer(this);
        this.leftLeg15.setRotationPoint(0.9F, 0.6F, 4.3F);
        this.body2.addChild(leftLeg15);
        this.setRotateAngle(leftLeg15, 0.0F, -0.8639F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg15.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 26, 0.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, false));

        this.rightLeg15 = new AdvancedModelRenderer(this);
        this.rightLeg15.setRotationPoint(-0.9F, 0.6F, 4.3F);
        this.body2.addChild(rightLeg15);
        this.setRotateAngle(rightLeg15, 0.0F, 0.8639F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg15.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 7, 26, -3.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1F, 4.9F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 14, -1.0F, -0.5F, 0.0F, 2, 1, 5, 0.01F, false));

        this.leftLeg16 = new AdvancedModelRenderer(this);
        this.leftLeg16.setRotationPoint(0.9F, 0.5F, 0.6F);
        this.body3.addChild(leftLeg16);
        this.setRotateAngle(leftLeg16, 0.0F, -0.9163F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg16.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 7, 0.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, false));

        this.rightLeg16 = new AdvancedModelRenderer(this);
        this.rightLeg16.setRotationPoint(-0.9F, 0.5F, 0.6F);
        this.body3.addChild(rightLeg16);
        this.setRotateAngle(rightLeg16, 0.0F, 0.9163F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg16.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 7, -3.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, true));

        this.leftLeg17 = new AdvancedModelRenderer(this);
        this.leftLeg17.setRotationPoint(0.9F, 0.5F, 1.5F);
        this.body3.addChild(leftLeg17);
        this.setRotateAngle(leftLeg17, 0.0F, -0.9163F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg17.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1982F, 0.5977F, 0.5105F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 9, 0.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, false));

        this.rightLeg17 = new AdvancedModelRenderer(this);
        this.rightLeg17.setRotationPoint(-0.9F, 0.5F, 1.5F);
        this.body3.addChild(rightLeg17);
        this.setRotateAngle(rightLeg17, 0.0F, 0.9163F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg17.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1982F, -0.5977F, -0.5105F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 9, -3.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, true));

        this.leftLeg18 = new AdvancedModelRenderer(this);
        this.leftLeg18.setRotationPoint(0.9F, 0.5F, 2.5F);
        this.body3.addChild(leftLeg18);
        this.setRotateAngle(leftLeg18, 0.0F, -0.9163F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg18.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1917F, 0.5463F, 0.4984F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 11, 0.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, false));

        this.rightLeg18 = new AdvancedModelRenderer(this);
        this.rightLeg18.setRotationPoint(-0.9F, 0.5F, 2.5F);
        this.body3.addChild(rightLeg18);
        this.setRotateAngle(rightLeg18, 0.0F, 0.9163F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg18.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1917F, -0.5463F, -0.4984F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 11, -3.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, true));

        this.leftLeg19 = new AdvancedModelRenderer(this);
        this.leftLeg19.setRotationPoint(0.9F, 0.5F, 3.5F);
        this.body3.addChild(leftLeg19);
        this.setRotateAngle(leftLeg19, 0.0F, -0.9163F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg19.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1861F, 0.4949F, 0.4871F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 13, 0.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, false));

        this.leftLeg20 = new AdvancedModelRenderer(this);
        this.leftLeg20.setRotationPoint(0.8F, 0.5F, 4.8F);
        this.body3.addChild(leftLeg20);
        this.setRotateAngle(leftLeg20, 0.0F, -0.9163F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg20.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1736F, 0.3403F, 0.4564F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 14, 26, 0.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, false));

        this.rightLeg20 = new AdvancedModelRenderer(this);
        this.rightLeg20.setRotationPoint(-0.9F, 0.5F, 4.8F);
        this.body3.addChild(rightLeg20);
        this.setRotateAngle(rightLeg20, 0.0F, 0.9163F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg20.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1736F, -0.3403F, -0.4564F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 14, 26, -3.0316F, -0.9928F, -0.1973F, 3, 1, 0, 0.0F, true));

        this.rightLeg19 = new AdvancedModelRenderer(this);
        this.rightLeg19.setRotationPoint(-0.9F, 0.5F, 3.5F);
        this.body3.addChild(rightLeg19);
        this.setRotateAngle(rightLeg19, 0.0F, 0.9163F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg19.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1861F, -0.4949F, -0.4871F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 13, -3.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 15, 15, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.ultimatelegleft = new AdvancedModelRenderer(this);
        this.ultimatelegleft.setRotationPoint(0.7F, 0.5F, 4.0F);
        this.body4.addChild(ultimatelegleft);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ultimatelegleft.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.192F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 7, 0.0F, -2.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.ultimatelegright = new AdvancedModelRenderer(this);
        this.ultimatelegright.setRotationPoint(-0.7F, 0.5F, 4.0F);
        this.body4.addChild(ultimatelegright);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ultimatelegright.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.192F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 15, 7, 0.0F, -2.0F, 0.0F, 0, 2, 5, 0.0F, true));

        this.leftLeg21 = new AdvancedModelRenderer(this);
        this.leftLeg21.setRotationPoint(0.8F, 0.5F, 1.0F);
        this.body4.addChild(leftLeg21);
        this.setRotateAngle(leftLeg21, 0.0F, -0.9163F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg21.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1676F, 0.2199F, 0.4348F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 21, 26, 0.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, false));

        this.rightLeg21 = new AdvancedModelRenderer(this);
        this.rightLeg21.setRotationPoint(-0.8F, 0.5F, 1.0F);
        this.body4.addChild(rightLeg21);
        this.setRotateAngle(rightLeg21, 0.0F, 0.9163F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg21.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1676F, -0.2199F, -0.4348F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 21, 26, -3.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, true));

        this.leftLeg22 = new AdvancedModelRenderer(this);
        this.leftLeg22.setRotationPoint(0.8F, 0.5F, 2.2F);
        this.body4.addChild(leftLeg22);
        this.setRotateAngle(leftLeg22, 0.0F, -0.9163F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg22.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1641F, 0.0822F, 0.4115F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 27, 0.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, false));

        this.rightLeg22 = new AdvancedModelRenderer(this);
        this.rightLeg22.setRotationPoint(-0.8F, 0.5F, 2.2F);
        this.body4.addChild(rightLeg22);
        this.setRotateAngle(rightLeg22, 0.0F, 0.9163F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg22.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1641F, -0.0822F, -0.4115F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 27, -3.0316F, -0.9928F, -0.1974F, 3, 1, 0, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.8F, -2.9F);
        this.Velocipede.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 21, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.leftFang = new AdvancedModelRenderer(this);
        this.leftFang.setRotationPoint(-0.1F, 0.0F, 0.2F);
        this.head.addChild(leftFang);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.leftFang.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.2793F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 19, 21, 0.5F, 0.0F, -1.7F, 1, 0, 2, 0.0F, false));

        this.rightFang = new AdvancedModelRenderer(this);
        this.rightFang.setRotationPoint(0.1F, 0.0F, 0.2F);
        this.head.addChild(rightFang);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.rightFang.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.2793F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 19, 21, -1.5F, 0.0F, -1.7F, 1, 0, 2, 0.0F, true));

        this.rightAntenna1 = new AdvancedModelRenderer(this);
        this.rightAntenna1.setRotationPoint(-0.5F, -0.6F, -1.0F);
        this.head.addChild(rightAntenna1);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.1F, 0.4F, 0.0F);
        this.rightAntenna1.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.3485F, 0.0686F, 1.6885F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 9, 21, -1.9829F, 0.1955F, -1.9228F, 2, 0, 2, 0.0F, true));

        this.leftAntenna1 = new AdvancedModelRenderer(this);
        this.leftAntenna1.setRotationPoint(0.5F, -0.6F, -1.0F);
        this.head.addChild(leftAntenna1);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.1F, 0.4F, 0.0F);
        this.leftAntenna1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3485F, -0.0686F, -1.6885F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 9, 21, -0.0171F, 0.1955F, -1.9228F, 2, 0, 2, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 0.8F, -1.3F);
        this.Velocipede.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0873F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg1.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1836F, 0.4691F, 0.4817F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 17, 28, 0.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 0.8F, -1.3F);
        this.Velocipede.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, -0.0873F, 0.0F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg1.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1836F, -0.4691F, -0.4817F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 17, 28, -2.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 0.8F, -0.4F);
        this.Velocipede.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0873F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1836F, 0.4691F, 0.4817F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 28, 17, 0.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 0.8F, -0.4F);
        this.Velocipede.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, -0.0873F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1836F, -0.4691F, -0.4817F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 28, 17, -2.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 0.8F, 0.4F);
        this.Velocipede.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -0.0873F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1836F, 0.4691F, 0.4817F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 28, 19, 0.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 0.8F, 0.4F);
        this.Velocipede.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0873F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1836F, -0.4691F, -0.4817F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 28, 19, -2.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(1.0F, 0.8F, 1.2F);
        this.Velocipede.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, -0.3142F, 0.0F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg4.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1836F, 0.4691F, 0.4817F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 22, 28, 0.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-1.0F, 0.8F, 1.2F);
        this.Velocipede.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.3142F, 0.0F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1836F, -0.4691F, -0.4817F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 22, 28, -2.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(1.0F, 0.8F, 2.1F);
        this.Velocipede.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, -0.3142F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg5.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1836F, 0.4691F, 0.4817F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 28, 26, 0.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-1.0F, 0.8F, 2.1F);
        this.Velocipede.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.3142F, 0.0F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg5.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1836F, -0.4691F, -0.4817F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 28, 26, -2.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Velocipede.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Velocipede.offsetY = -2.8F;
        this.Velocipede.offsetX = -1.1F;
        this.Velocipede.offsetZ = 2.0F;
        this.Velocipede.rotateAngleY = (float)Math.toRadians(120);
        this.Velocipede.rotateAngleX = (float)Math.toRadians(1);
        this.Velocipede.rotateAngleZ = (float)Math.toRadians(0);
        this.Velocipede.scaleChildren = true;
        float scaler = 4.0F;
        this.Velocipede.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Velocipede.render(f);
        //Reset rotations, positions and sizing:
        this.Velocipede.setScale(1.0F, 1.0F, 1.0F);
        this.Velocipede.scaleChildren = false;
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
        EntityPrehistoricFloraMyriapod ee = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;

        if(ee.getIsMoving()){
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMyriapod entity = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Velocipede, Velocipede.rotateAngleX + (float) Math.toRadians(0), Velocipede.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(120*3))))*4, Velocipede.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(120*3))))*2);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(120*3))+180))*4, body1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -10 + (((tickAnim - 0) / 4) * (-40-(-10)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 4) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 4) / 3) * (-32.59907-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.30864 + (((tickAnim - 7) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 7) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 7) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 11) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 19) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 19) / 3) * (-32.59907-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -17.30864 + (((tickAnim - 22) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 22) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 22) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 26) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 34) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 34) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.30864 + (((tickAnim - 38) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 38) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 38) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 42) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 49) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 49) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -17.30864 + (((tickAnim - 53) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 53) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 53) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 57) / 3) * (-10-(20)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg8, leftLeg8.rotateAngleX + (float) Math.toRadians(xx), leftLeg8.rotateAngleY + (float) Math.toRadians(yy), leftLeg8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -17.30864 + (((tickAnim - 0) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 0) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 0) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 4) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 11) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 11) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -17.30864 + (((tickAnim - 15) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 15) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 15) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 19) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 26) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 26) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -17.30864 + (((tickAnim - 30) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 30) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 30) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 34) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 42) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 42) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = -17.30864 + (((tickAnim - 45) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 45) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 45) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 49) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 49) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 49) / 8) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 57) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 57) / 3) * (32.59907-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg8, rightLeg8.rotateAngleX + (float) Math.toRadians(xx), rightLeg8.rotateAngleY + (float) Math.toRadians(yy), rightLeg8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 7) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 7) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -17.30864 + (((tickAnim - 11) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 11) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 11) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 22) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 22) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -17.30864 + (((tickAnim - 26) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 26) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 26) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 30) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 38) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 38) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -17.30864 + (((tickAnim - 42) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 42) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 42) / 3) * (0-(-32.59907)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 45) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 53) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 53) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -17.30864 + (((tickAnim - 57) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 57) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 57) / 3) * (0-(-32.59907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg9, leftLeg9.rotateAngleX + (float) Math.toRadians(xx), leftLeg9.rotateAngleY + (float) Math.toRadians(yy), leftLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 0) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 0) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -17.30864 + (((tickAnim - 4) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 4) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 4) / 3) * (0-(32.59907)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 7) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 15) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 15) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -17.30864 + (((tickAnim - 19) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 19) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 19) / 3) * (0-(32.59907)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 22) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 30) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 30) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -17.30864 + (((tickAnim - 34) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 34) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 34) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 38) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 45) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 45) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -17.30864 + (((tickAnim - 49) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 49) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 49) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 53) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 0) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 0) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -17.30864 + (((tickAnim - 4) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 4) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 4) / 3) * (0-(-32.59907)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 7) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 15) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 15) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -17.30864 + (((tickAnim - 19) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 19) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 19) / 3) * (0-(-32.59907)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 22) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 30) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 30) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -17.30864 + (((tickAnim - 34) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 34) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 34) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 38) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 45) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 45) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -17.30864 + (((tickAnim - 49) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 49) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 49) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 53) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg7, leftLeg7.rotateAngleX + (float) Math.toRadians(xx), leftLeg7.rotateAngleY + (float) Math.toRadians(yy), leftLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 7) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 7) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -17.30864 + (((tickAnim - 11) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 11) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 11) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 15) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 22) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 22) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -17.30864 + (((tickAnim - 26) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 26) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 26) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 30) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 38) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 38) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -17.30864 + (((tickAnim - 42) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 42) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 42) / 3) * (0-(32.59907)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 45) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 53) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 53) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -17.30864 + (((tickAnim - 57) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 57) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 57) / 3) * (0-(32.59907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg7, rightLeg7.rotateAngleX + (float) Math.toRadians(xx), rightLeg7.rotateAngleY + (float) Math.toRadians(yy), rightLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -17.30864 + (((tickAnim - 0) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 0) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 0) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 4) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 11) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 11) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -17.30864 + (((tickAnim - 15) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 15) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 15) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 19) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 26) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 26) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -17.30864 + (((tickAnim - 30) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 30) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 30) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 34) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 42) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 42) / 3) * (-32.59907-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = -17.30864 + (((tickAnim - 45) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 45) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 45) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 49) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 49) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 49) / 8) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 57) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 57) / 3) * (-32.59907-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg6, leftLeg6.rotateAngleX + (float) Math.toRadians(xx), leftLeg6.rotateAngleY + (float) Math.toRadians(yy), leftLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 10 + (((tickAnim - 0) / 4) * (40-(10)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 4) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 4) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.30864 + (((tickAnim - 7) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 7) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 7) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 11) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 19) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 19) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -17.30864 + (((tickAnim - 22) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 22) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 22) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 26) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 34) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 34) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.30864 + (((tickAnim - 38) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 38) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 38) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 42) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 49) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 49) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -17.30864 + (((tickAnim - 53) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 53) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 53) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 57) / 3) * (10-(-20)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -17.30864 + (((tickAnim - 0) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 0) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 0) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 4) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 11) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 11) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -17.30864 + (((tickAnim - 15) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 15) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 15) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 19) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 26) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 26) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -17.30864 + (((tickAnim - 30) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 30) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 30) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 34) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 42) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 42) / 3) * (-32.59907-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = -17.30864 + (((tickAnim - 45) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 45) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 45) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 49) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 49) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 49) / 8) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 57) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 57) / 3) * (-32.59907-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg10, leftLeg10.rotateAngleX + (float) Math.toRadians(xx), leftLeg10.rotateAngleY + (float) Math.toRadians(yy), leftLeg10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 10 + (((tickAnim - 0) / 4) * (40-(10)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 4) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 4) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.30864 + (((tickAnim - 7) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 7) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 7) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 11) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 19) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 19) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -17.30864 + (((tickAnim - 22) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 22) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 22) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 26) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 34) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 34) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.30864 + (((tickAnim - 38) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 38) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 38) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 42) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 49) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 49) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -17.30864 + (((tickAnim - 53) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 53) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 53) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 57) / 3) * (10-(-20)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg10, rightLeg10.rotateAngleX + (float) Math.toRadians(xx), rightLeg10.rotateAngleY + (float) Math.toRadians(yy), rightLeg10.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(120*3))+180))*4, body2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (17.46257-(0)));
            yy = -27.5 + (((tickAnim - 0) / 4) * (2.03828-(-27.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (-47.31891-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 17.46257 + (((tickAnim - 4) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 4) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 4) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 7) / 8) * (-27.5-(20)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (17.46257-(0)));
            yy = -27.5 + (((tickAnim - 15) / 3) * (2.03828-(-27.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (-47.31891-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 17.46257 + (((tickAnim - 18) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 18) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 18) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 22) / 8) * (-27.5-(20)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (17.46257-(0)));
            yy = -27.5 + (((tickAnim - 30) / 4) * (2.03828-(-27.5)));
            zz = 0 + (((tickAnim - 30) / 4) * (-47.31891-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 17.46257 + (((tickAnim - 34) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 34) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 34) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 38) / 7) * (-27.5-(20)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (17.46257-(0)));
            yy = -27.5 + (((tickAnim - 45) / 4) * (2.03828-(-27.5)));
            zz = 0 + (((tickAnim - 45) / 4) * (-47.31891-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 17.46257 + (((tickAnim - 49) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 49) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 49) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 53) / 7) * (-27.5-(20)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg11, leftLeg11.rotateAngleX + (float) Math.toRadians(xx), leftLeg11.rotateAngleY + (float) Math.toRadians(yy), leftLeg11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 7) * (27.5-(-20)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (17.46257-(0)));
            yy = 27.5 + (((tickAnim - 7) / 4) * (-2.03828-(27.5)));
            zz = 0 + (((tickAnim - 7) / 4) * (47.31891-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 17.46257 + (((tickAnim - 11) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 11) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 11) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 15) / 7) * (27.5-(-20)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (17.46257-(0)));
            yy = 27.5 + (((tickAnim - 22) / 4) * (-2.03828-(27.5)));
            zz = 0 + (((tickAnim - 22) / 4) * (47.31891-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 17.46257 + (((tickAnim - 26) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 26) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 26) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 30) / 8) * (27.5-(-20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (17.46257-(0)));
            yy = 27.5 + (((tickAnim - 38) / 3) * (-2.03828-(27.5)));
            zz = 0 + (((tickAnim - 38) / 3) * (47.31891-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 17.46257 + (((tickAnim - 41) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 41) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 41) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 45) / 8) * (27.5-(-20)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 53) / 3) * (17.46257-(0)));
            yy = 27.5 + (((tickAnim - 53) / 3) * (-2.03828-(27.5)));
            zz = 0 + (((tickAnim - 53) / 3) * (47.31891-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 17.46257 + (((tickAnim - 56) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 56) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 56) / 4) * (0-(47.31891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg11, rightLeg11.rotateAngleX + (float) Math.toRadians(xx), rightLeg11.rotateAngleY + (float) Math.toRadians(yy), rightLeg11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.73 + (((tickAnim - 0) / 4) * (5.46735-(2.73)));
            yy = 0.06 + (((tickAnim - 0) / 4) * (-19.88061-(0.06)));
            zz = -3.01 + (((tickAnim - 0) / 4) * (-6.01024-(-3.01)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 5.46735 + (((tickAnim - 4) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 4) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 4) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 17.46257 + (((tickAnim - 7) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 7) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 7) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 11) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 11) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 5.46735 + (((tickAnim - 18) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 18) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 18) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 17.46257 + (((tickAnim - 22) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 22) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 22) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 26) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 26) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 5.46735 + (((tickAnim - 34) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 34) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 34) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 17.46257 + (((tickAnim - 38) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 38) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 38) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 41) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 41) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 41) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 5.46735 + (((tickAnim - 49) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 49) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 49) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 17.46257 + (((tickAnim - 53) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 53) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 53) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (2.73-(0)));
            yy = 20 + (((tickAnim - 56) / 4) * (0.06-(20)));
            zz = 0 + (((tickAnim - 56) / 4) * (-3.01-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(xx), leftLeg12.rotateAngleY + (float) Math.toRadians(yy), leftLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.46257 + (((tickAnim - 0) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 0) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 0) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 4) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 4) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5.46735 + (((tickAnim - 11) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 11) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 11) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 17.46257 + (((tickAnim - 15) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 15) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 15) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 18) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 18) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 5.46735 + (((tickAnim - 26) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 26) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 26) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.46257 + (((tickAnim - 30) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 30) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 30) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 34) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 34) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 34) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 5.46735 + (((tickAnim - 41) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 41) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 41) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 17.46257 + (((tickAnim - 45) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 45) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 45) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 49) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 49) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 49) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 5.46735 + (((tickAnim - 56) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 56) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 56) / 4) * (47.31891-(6.01024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 0) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 0) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 5.46735 + (((tickAnim - 7) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 7) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 7) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 17.46257 + (((tickAnim - 11) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 11) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 11) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 15) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 15) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 5.46735 + (((tickAnim - 22) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 22) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 22) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 17.46257 + (((tickAnim - 26) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 26) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 26) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 30) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 30) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 5.46735 + (((tickAnim - 38) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 38) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 38) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 17.46257 + (((tickAnim - 41) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 41) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 41) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 45) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 45) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 5.46735 + (((tickAnim - 53) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 53) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 53) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 17.46257 + (((tickAnim - 56) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 56) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 56) / 4) * (0-(-47.31891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg13, leftLeg13.rotateAngleX + (float) Math.toRadians(xx), leftLeg13.rotateAngleY + (float) Math.toRadians(yy), leftLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.46735 + (((tickAnim - 0) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 0) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 0) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 17.46257 + (((tickAnim - 4) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 4) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 4) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 7) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 7) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 5.46735 + (((tickAnim - 15) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 15) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 15) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 17.46257 + (((tickAnim - 18) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 18) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 18) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 22) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 22) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 5.46735 + (((tickAnim - 30) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 30) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 30) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 17.46257 + (((tickAnim - 34) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 34) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 34) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 38) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 38) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 5.46735 + (((tickAnim - 45) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 45) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 45) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 17.46257 + (((tickAnim - 49) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 49) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 49) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 53) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 53) / 7) * (6.01024-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg13, rightLeg13.rotateAngleX + (float) Math.toRadians(xx), rightLeg13.rotateAngleY + (float) Math.toRadians(yy), rightLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.46257 + (((tickAnim - 0) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 0) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 0) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 4) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 4) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5.46735 + (((tickAnim - 11) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 11) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 11) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 17.46257 + (((tickAnim - 15) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 15) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 15) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 18) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 18) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 5.46735 + (((tickAnim - 26) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 26) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 26) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.46257 + (((tickAnim - 30) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 30) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 30) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 34) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 34) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 34) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 5.46735 + (((tickAnim - 41) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 41) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 41) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 17.46257 + (((tickAnim - 45) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 45) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 45) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 49) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 49) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 49) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 5.46735 + (((tickAnim - 56) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 56) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 56) / 4) * (-47.31891-(-6.01024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg14, leftLeg14.rotateAngleX + (float) Math.toRadians(xx), leftLeg14.rotateAngleY + (float) Math.toRadians(yy), leftLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.73 + (((tickAnim - 0) / 4) * (5.46735-(2.73)));
            yy = -0.06 + (((tickAnim - 0) / 4) * (19.88061-(-0.06)));
            zz = 3.01 + (((tickAnim - 0) / 4) * (6.01024-(3.01)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 5.46735 + (((tickAnim - 4) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 4) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 4) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 17.46257 + (((tickAnim - 7) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 7) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 7) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 11) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 11) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 5.46735 + (((tickAnim - 18) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 18) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 18) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 17.46257 + (((tickAnim - 22) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 22) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 22) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 26) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 26) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 5.46735 + (((tickAnim - 34) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 34) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 34) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 17.46257 + (((tickAnim - 38) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 38) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 38) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 41) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 41) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 41) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 5.46735 + (((tickAnim - 49) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 49) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 49) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 17.46257 + (((tickAnim - 53) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 53) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 53) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (2.73-(0)));
            yy = -20 + (((tickAnim - 56) / 4) * (-0.06-(-20)));
            zz = 0 + (((tickAnim - 56) / 4) * (3.01-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg14, rightLeg14.rotateAngleX + (float) Math.toRadians(xx), rightLeg14.rotateAngleY + (float) Math.toRadians(yy), rightLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.46735 + (((tickAnim - 0) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 0) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 0) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 17.46257 + (((tickAnim - 4) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 4) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 4) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 7) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 7) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 5.46735 + (((tickAnim - 15) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 15) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 15) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 17.46257 + (((tickAnim - 18) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 18) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 18) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 22) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 22) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 5.46735 + (((tickAnim - 30) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 30) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 30) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 17.46257 + (((tickAnim - 34) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 34) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 34) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 38) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 38) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 5.46735 + (((tickAnim - 45) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 45) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 45) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 17.46257 + (((tickAnim - 49) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 49) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 49) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 53) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 53) / 7) * (-6.01024-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg15, leftLeg15.rotateAngleX + (float) Math.toRadians(xx), leftLeg15.rotateAngleY + (float) Math.toRadians(yy), leftLeg15.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 0) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 0) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 5.46735 + (((tickAnim - 7) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 7) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 7) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 17.46257 + (((tickAnim - 11) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 11) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 11) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 15) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 15) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 5.46735 + (((tickAnim - 22) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 22) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 22) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 17.46257 + (((tickAnim - 26) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 26) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 26) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 30) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 30) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 5.46735 + (((tickAnim - 38) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 38) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 38) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 17.46257 + (((tickAnim - 41) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 41) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 41) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 45) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 45) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 5.46735 + (((tickAnim - 53) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 53) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 53) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 17.46257 + (((tickAnim - 56) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 56) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 56) / 4) * (0-(47.31891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg15, rightLeg15.rotateAngleX + (float) Math.toRadians(xx), rightLeg15.rotateAngleY + (float) Math.toRadians(yy), rightLeg15.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(120*3))))*4, body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.73 + (((tickAnim - 0) / 4) * (5.46735-(2.73)));
            yy = 0.06 + (((tickAnim - 0) / 4) * (-19.88061-(0.06)));
            zz = -3.01 + (((tickAnim - 0) / 4) * (-6.01024-(-3.01)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 5.46735 + (((tickAnim - 4) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 4) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 4) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 17.46257 + (((tickAnim - 7) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 7) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 7) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 11) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 11) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5.46735 + (((tickAnim - 18) / 5) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 18) / 5) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 18) / 5) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 17.46257 + (((tickAnim - 23) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 23) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 23) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 26) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 26) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 5.46735 + (((tickAnim - 34) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 34) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 34) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 17.46257 + (((tickAnim - 38) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 38) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 38) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 42) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 42) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 5.46735 + (((tickAnim - 49) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 49) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 49) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 17.46257 + (((tickAnim - 53) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 53) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 53) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (2.73-(0)));
            yy = 20 + (((tickAnim - 56) / 4) * (0.06-(20)));
            zz = 0 + (((tickAnim - 56) / 4) * (-3.01-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg16, leftLeg16.rotateAngleX + (float) Math.toRadians(xx), leftLeg16.rotateAngleY + (float) Math.toRadians(yy), leftLeg16.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.46257 + (((tickAnim - 0) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 0) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 0) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 4) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 4) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 5.46735 + (((tickAnim - 11) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 11) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 11) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 17.46257 + (((tickAnim - 14) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 14) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 14) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 18) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 18) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 5.46735 + (((tickAnim - 26) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 26) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 26) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.46257 + (((tickAnim - 30) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 30) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 30) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 34) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 34) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 5.46735 + (((tickAnim - 42) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 42) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 42) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 17.46257 + (((tickAnim - 45) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 45) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 45) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 49) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 49) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 49) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 5.46735 + (((tickAnim - 56) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 56) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 56) / 4) * (47.31891-(6.01024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg16, rightLeg16.rotateAngleX + (float) Math.toRadians(xx), rightLeg16.rotateAngleY + (float) Math.toRadians(yy), rightLeg16.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 0) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 0) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 5.46735 + (((tickAnim - 7) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 7) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 7) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 17.46257 + (((tickAnim - 11) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 11) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 11) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 14) / 9) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 14) / 9) * (-6.01024-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 5.46735 + (((tickAnim - 23) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 23) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 23) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 17.46257 + (((tickAnim - 26) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 26) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 26) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 30) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 30) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 5.46735 + (((tickAnim - 38) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 38) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 38) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 17.46257 + (((tickAnim - 42) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 42) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 42) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 45) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 45) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 5.46735 + (((tickAnim - 53) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 53) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 53) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 17.46257 + (((tickAnim - 56) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 56) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 56) / 4) * (0-(-47.31891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg17, leftLeg17.rotateAngleX + (float) Math.toRadians(xx), leftLeg17.rotateAngleY + (float) Math.toRadians(yy), leftLeg17.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.46735 + (((tickAnim - 0) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 0) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 0) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 17.46257 + (((tickAnim - 4) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 4) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 4) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 7) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 7) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 5.46735 + (((tickAnim - 14) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 14) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 14) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 17.46257 + (((tickAnim - 18) / 5) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 18) / 5) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 18) / 5) * (0-(47.31891)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 23) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 23) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 5.46735 + (((tickAnim - 30) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 30) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 30) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 17.46257 + (((tickAnim - 34) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 34) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 34) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 38) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 38) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 5.46735 + (((tickAnim - 45) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 45) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 45) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 17.46257 + (((tickAnim - 49) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 49) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 49) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 53) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 53) / 7) * (6.01024-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg17, rightLeg17.rotateAngleX + (float) Math.toRadians(xx), rightLeg17.rotateAngleY + (float) Math.toRadians(yy), rightLeg17.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.46257 + (((tickAnim - 0) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 0) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 0) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 4) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 4) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 5.46735 + (((tickAnim - 11) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 11) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 11) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 17.46257 + (((tickAnim - 14) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 14) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 14) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 18) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 18) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 5.46735 + (((tickAnim - 26) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 26) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 26) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.46257 + (((tickAnim - 30) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 30) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 30) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 34) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 34) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 5.46735 + (((tickAnim - 42) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 42) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 42) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 17.46257 + (((tickAnim - 45) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 45) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 45) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 49) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 49) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 49) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 5.46735 + (((tickAnim - 56) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 56) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 56) / 4) * (-47.31891-(-6.01024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg18, leftLeg18.rotateAngleX + (float) Math.toRadians(xx), leftLeg18.rotateAngleY + (float) Math.toRadians(yy), leftLeg18.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.73 + (((tickAnim - 0) / 4) * (5.46735-(2.73)));
            yy = -0.06 + (((tickAnim - 0) / 4) * (19.88061-(-0.06)));
            zz = 3.01 + (((tickAnim - 0) / 4) * (6.01024-(3.01)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 5.46735 + (((tickAnim - 4) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 4) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 4) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 17.46257 + (((tickAnim - 7) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 7) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 7) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 11) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 11) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5.46735 + (((tickAnim - 18) / 5) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 18) / 5) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 18) / 5) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 17.46257 + (((tickAnim - 23) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 23) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 23) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 26) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 26) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 5.46735 + (((tickAnim - 34) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 34) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 34) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 17.46257 + (((tickAnim - 38) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 38) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 38) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 42) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 42) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 5.46735 + (((tickAnim - 49) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 49) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 49) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 17.46257 + (((tickAnim - 53) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 53) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 53) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (2.73-(0)));
            yy = -20 + (((tickAnim - 56) / 4) * (-0.06-(-20)));
            zz = 0 + (((tickAnim - 56) / 4) * (3.01-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg18, rightLeg18.rotateAngleX + (float) Math.toRadians(xx), rightLeg18.rotateAngleY + (float) Math.toRadians(yy), rightLeg18.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.46735 + (((tickAnim - 0) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 0) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 0) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 17.46257 + (((tickAnim - 4) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 4) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 4) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 7) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 7) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 5.46735 + (((tickAnim - 14) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 14) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 14) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 17.46257 + (((tickAnim - 18) / 5) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 18) / 5) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 18) / 5) * (0-(-47.31891)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 23) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 23) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 5.46735 + (((tickAnim - 30) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 30) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 30) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 17.46257 + (((tickAnim - 34) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 34) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 34) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 38) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 38) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 5.46735 + (((tickAnim - 45) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 45) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 45) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 17.46257 + (((tickAnim - 49) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 49) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 49) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 53) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 53) / 7) * (-6.01024-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg19, leftLeg19.rotateAngleX + (float) Math.toRadians(xx), leftLeg19.rotateAngleY + (float) Math.toRadians(yy), leftLeg19.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.73 + (((tickAnim - 0) / 4) * (5.46735-(2.73)));
            yy = 0.06 + (((tickAnim - 0) / 4) * (-19.88061-(0.06)));
            zz = -3.01 + (((tickAnim - 0) / 4) * (-6.01024-(-3.01)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 5.46735 + (((tickAnim - 4) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 4) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 4) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 17.46257 + (((tickAnim - 7) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 7) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 7) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 11) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 11) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5.46735 + (((tickAnim - 18) / 5) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 18) / 5) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 18) / 5) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 17.46257 + (((tickAnim - 23) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 23) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 23) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 26) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 26) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 5.46735 + (((tickAnim - 34) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 34) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 34) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 17.46257 + (((tickAnim - 38) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 38) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 38) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 42) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 42) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 5.46735 + (((tickAnim - 49) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 49) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 49) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 17.46257 + (((tickAnim - 53) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 53) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 53) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (2.73-(0)));
            yy = 20 + (((tickAnim - 56) / 4) * (0.06-(20)));
            zz = 0 + (((tickAnim - 56) / 4) * (-3.01-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg20, leftLeg20.rotateAngleX + (float) Math.toRadians(xx), leftLeg20.rotateAngleY + (float) Math.toRadians(yy), leftLeg20.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 0) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 0) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 5.46735 + (((tickAnim - 7) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 7) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 7) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 17.46257 + (((tickAnim - 11) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 11) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 11) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 14) / 9) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 14) / 9) * (6.01024-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 5.46735 + (((tickAnim - 23) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 23) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 23) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 17.46257 + (((tickAnim - 26) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 26) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 26) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 30) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 30) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 5.46735 + (((tickAnim - 38) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 38) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 38) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 17.46257 + (((tickAnim - 42) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 42) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 42) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 45) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 45) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 5.46735 + (((tickAnim - 53) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 53) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 53) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 17.46257 + (((tickAnim - 56) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 56) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 56) / 4) * (0-(47.31891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg19, rightLeg19.rotateAngleX + (float) Math.toRadians(xx), rightLeg19.rotateAngleY + (float) Math.toRadians(yy), rightLeg19.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(120*3))))*4, body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ultimatelegleft, ultimatelegleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(360*2))))*4, ultimatelegleft.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(360*2))))), ultimatelegleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ultimatelegright, ultimatelegright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(360*2))+40))*4, ultimatelegright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(360*2))))), ultimatelegright.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.46257 + (((tickAnim - 0) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 0) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 0) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 4) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 4) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 5.46735 + (((tickAnim - 11) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 11) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 11) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 17.46257 + (((tickAnim - 14) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 14) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 14) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 18) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 18) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 5.46735 + (((tickAnim - 26) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 26) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 26) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.46257 + (((tickAnim - 30) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 30) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 30) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 34) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 34) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 5.46735 + (((tickAnim - 42) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 42) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 42) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 17.46257 + (((tickAnim - 45) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 45) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 45) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 49) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 49) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 49) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 5.46735 + (((tickAnim - 56) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 56) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 56) / 4) * (47.31891-(6.01024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg20, rightLeg20.rotateAngleX + (float) Math.toRadians(xx), rightLeg20.rotateAngleY + (float) Math.toRadians(yy), rightLeg20.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 0) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 0) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 5.46735 + (((tickAnim - 7) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 7) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 7) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 17.46257 + (((tickAnim - 11) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 11) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 11) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 15) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 15) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 5.46735 + (((tickAnim - 22) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 22) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 22) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 17.46257 + (((tickAnim - 26) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 26) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 26) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 30) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 30) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 5.46735 + (((tickAnim - 38) / 3) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 38) / 3) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 38) / 3) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 17.46257 + (((tickAnim - 41) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 41) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 41) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 45) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 45) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 45) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 5.46735 + (((tickAnim - 52) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 52) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 52) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 17.46257 + (((tickAnim - 56) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 56) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 56) / 4) * (0-(-47.31891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg21, leftLeg21.rotateAngleX + (float) Math.toRadians(xx), leftLeg21.rotateAngleY + (float) Math.toRadians(yy), leftLeg21.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.46735 + (((tickAnim - 0) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 0) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 0) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 17.46257 + (((tickAnim - 4) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 4) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 4) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 7) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 7) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 5.46735 + (((tickAnim - 15) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 15) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 15) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 17.46257 + (((tickAnim - 18) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 18) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 18) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 22) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 22) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 5.46735 + (((tickAnim - 30) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 30) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 30) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 17.46257 + (((tickAnim - 34) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 34) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 34) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 38) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 38) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 5.46735 + (((tickAnim - 45) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 45) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 45) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = 17.46257 + (((tickAnim - 49) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 49) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 49) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 52) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 52) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 52) / 8) * (6.01024-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg21, rightLeg21.rotateAngleX + (float) Math.toRadians(xx), rightLeg21.rotateAngleY + (float) Math.toRadians(yy), rightLeg21.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.46257 + (((tickAnim - 0) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 0) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 0) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 4) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 4) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5.46735 + (((tickAnim - 11) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 11) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 11) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 17.46257 + (((tickAnim - 15) / 3) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 15) / 3) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 15) / 3) * (0-(-47.31891)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 18) / 8) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 18) / 8) * (-6.01024-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 5.46735 + (((tickAnim - 26) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 26) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 26) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.46257 + (((tickAnim - 30) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 30) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 30) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 34) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 34) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 34) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 5.46735 + (((tickAnim - 41) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 41) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 41) / 4) * (-47.31891-(-6.01024)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 17.46257 + (((tickAnim - 45) / 4) * (0-(17.46257)));
            yy = 2.03828 + (((tickAnim - 45) / 4) * (20-(2.03828)));
            zz = -47.31891 + (((tickAnim - 45) / 4) * (0-(-47.31891)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 49) / 7) * (5.46735-(0)));
            yy = 20 + (((tickAnim - 49) / 7) * (-19.88061-(20)));
            zz = 0 + (((tickAnim - 49) / 7) * (-6.01024-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 5.46735 + (((tickAnim - 56) / 4) * (17.46257-(5.46735)));
            yy = -19.88061 + (((tickAnim - 56) / 4) * (2.03828-(-19.88061)));
            zz = -6.01024 + (((tickAnim - 56) / 4) * (-47.31891-(-6.01024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg22, leftLeg22.rotateAngleX + (float) Math.toRadians(xx), leftLeg22.rotateAngleY + (float) Math.toRadians(yy), leftLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.73 + (((tickAnim - 0) / 4) * (5.46735-(2.73)));
            yy = -0.06 + (((tickAnim - 0) / 4) * (19.88061-(-0.06)));
            zz = 3.01 + (((tickAnim - 0) / 4) * (6.01024-(3.01)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 5.46735 + (((tickAnim - 4) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 4) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 4) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 17.46257 + (((tickAnim - 7) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 7) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 7) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 11) / 7) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 11) / 7) * (6.01024-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 5.46735 + (((tickAnim - 18) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 18) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 18) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 17.46257 + (((tickAnim - 22) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 22) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 22) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 26) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 26) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 5.46735 + (((tickAnim - 34) / 4) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 34) / 4) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 34) / 4) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 17.46257 + (((tickAnim - 38) / 3) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 38) / 3) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 38) / 3) * (0-(47.31891)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 41) / 8) * (5.46735-(0)));
            yy = -20 + (((tickAnim - 41) / 8) * (19.88061-(-20)));
            zz = 0 + (((tickAnim - 41) / 8) * (6.01024-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = 5.46735 + (((tickAnim - 49) / 3) * (17.46257-(5.46735)));
            yy = 19.88061 + (((tickAnim - 49) / 3) * (-2.03828-(19.88061)));
            zz = 6.01024 + (((tickAnim - 49) / 3) * (47.31891-(6.01024)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 17.46257 + (((tickAnim - 52) / 4) * (0-(17.46257)));
            yy = -2.03828 + (((tickAnim - 52) / 4) * (-20-(-2.03828)));
            zz = 47.31891 + (((tickAnim - 52) / 4) * (0-(47.31891)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (2.73-(0)));
            yy = -20 + (((tickAnim - 56) / 4) * (-0.06-(-20)));
            zz = 0 + (((tickAnim - 56) / 4) * (3.01-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg22, rightLeg22.rotateAngleX + (float) Math.toRadians(xx), rightLeg22.rotateAngleY + (float) Math.toRadians(yy), rightLeg22.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntenna1, rightAntenna1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(360))+40))*4, rightAntenna1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(360))))*10), rightAntenna1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 7) * (-30-(20)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-12.5-(0)));
            yy = -30 + (((tickAnim - 7) / 4) * (-5-(-30)));
            zz = 0 + (((tickAnim - 7) / 4) * (-32.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -12.5 + (((tickAnim - 11) / 4) * (0-(-12.5)));
            yy = -5 + (((tickAnim - 11) / 4) * (20-(-5)));
            zz = -32.5 + (((tickAnim - 11) / 4) * (0-(-32.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 8) * (-30-(20)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (-12.5-(0)));
            yy = -30 + (((tickAnim - 23) / 3) * (-5-(-30)));
            zz = 0 + (((tickAnim - 23) / 3) * (-32.5-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 26) / 4) * (0-(-12.5)));
            yy = -5 + (((tickAnim - 26) / 4) * (20-(-5)));
            zz = -32.5 + (((tickAnim - 26) / 4) * (0-(-32.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 30) / 8) * (-30-(20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-12.5-(0)));
            yy = -30 + (((tickAnim - 38) / 4) * (-5-(-30)));
            zz = 0 + (((tickAnim - 38) / 4) * (-32.5-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -12.5 + (((tickAnim - 42) / 4) * (0-(-12.5)));
            yy = -5 + (((tickAnim - 42) / 4) * (20-(-5)));
            zz = -32.5 + (((tickAnim - 42) / 4) * (0-(-32.5)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 46) / 7) * (-30-(20)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (-12.5-(0)));
            yy = -30 + (((tickAnim - 53) / 4) * (-5-(-30)));
            zz = 0 + (((tickAnim - 53) / 4) * (-32.5-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 57) / 3) * (0-(-12.5)));
            yy = -5 + (((tickAnim - 57) / 3) * (20-(-5)));
            zz = -32.5 + (((tickAnim - 57) / 3) * (0-(-32.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.5-(0)));
            yy = 30 + (((tickAnim - 0) / 4) * (5-(30)));
            zz = 0 + (((tickAnim - 0) / 4) * (32.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -12.5 + (((tickAnim - 4) / 3) * (0-(-12.5)));
            yy = 5 + (((tickAnim - 4) / 3) * (-20-(5)));
            zz = 32.5 + (((tickAnim - 4) / 3) * (0-(32.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 7) / 8) * (30-(-20)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-12.5-(0)));
            yy = 30 + (((tickAnim - 15) / 3) * (5-(30)));
            zz = 0 + (((tickAnim - 15) / 3) * (32.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -12.5 + (((tickAnim - 18) / 5) * (0-(-12.5)));
            yy = 5 + (((tickAnim - 18) / 5) * (-20-(5)));
            zz = 32.5 + (((tickAnim - 18) / 5) * (0-(32.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 23) / 7) * (30-(-20)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-12.5-(0)));
            yy = 30 + (((tickAnim - 30) / 4) * (5-(30)));
            zz = 0 + (((tickAnim - 30) / 4) * (32.5-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 34) / 4) * (0-(-12.5)));
            yy = 5 + (((tickAnim - 34) / 4) * (-20-(5)));
            zz = 32.5 + (((tickAnim - 34) / 4) * (0-(32.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 38) / 8) * (30-(-20)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 46) / 3) * (-12.5-(0)));
            yy = 30 + (((tickAnim - 46) / 3) * (5-(30)));
            zz = 0 + (((tickAnim - 46) / 3) * (32.5-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -12.5 + (((tickAnim - 49) / 4) * (0-(-12.5)));
            yy = 5 + (((tickAnim - 49) / 4) * (-20-(5)));
            zz = 32.5 + (((tickAnim - 49) / 4) * (0-(32.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 53) / 7) * (30-(-20)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -17.30864 + (((tickAnim - 0) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 0) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 0) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 4) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 11) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 11) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -17.30864 + (((tickAnim - 15) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 15) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 15) / 3) * (0-(-32.59907)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 26) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 26) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -17.30864 + (((tickAnim - 30) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 30) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 30) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 34) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 42) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 42) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = -17.30864 + (((tickAnim - 46) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 46) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 46) / 3) * (0-(-32.59907)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 49) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 49) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 49) / 8) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 57) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 57) / 3) * (-32.59907-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 10 + (((tickAnim - 0) / 4) * (40-(10)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 4) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 4) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.30864 + (((tickAnim - 7) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 7) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 7) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 11) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 18) / 5) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 18) / 5) * (32.59907-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -17.30864 + (((tickAnim - 23) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 23) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 23) / 3) * (0-(32.59907)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 26) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 34) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 34) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.30864 + (((tickAnim - 38) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 38) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 38) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 42) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 49) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 49) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -17.30864 + (((tickAnim - 53) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 53) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 53) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 57) / 3) * (10-(-20)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 0) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 0) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -17.30864 + (((tickAnim - 4) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 4) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 4) / 3) * (0-(-32.59907)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 7) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 15) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 15) / 3) * (-32.59907-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -17.30864 + (((tickAnim - 18) / 5) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 18) / 5) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 18) / 5) * (0-(-32.59907)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 23) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 30) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 30) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -17.30864 + (((tickAnim - 34) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 34) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 34) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 38) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 46) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 46) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 46) / 3) * (-32.59907-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -17.30864 + (((tickAnim - 49) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 49) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 49) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 53) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 7) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 7) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -17.30864 + (((tickAnim - 11) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 11) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 11) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 15) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 23) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 23) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -17.30864 + (((tickAnim - 26) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 26) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 26) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 30) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 38) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 38) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -17.30864 + (((tickAnim - 42) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 42) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 42) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 46) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 53) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 53) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -17.30864 + (((tickAnim - 57) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 57) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 57) / 3) * (0-(32.59907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -10 + (((tickAnim - 0) / 4) * (-40-(-10)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 4) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 4) / 3) * (-32.59907-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.30864 + (((tickAnim - 7) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 7) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 7) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 11) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 18) / 5) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 18) / 5) * (-32.59907-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -17.30864 + (((tickAnim - 23) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 23) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 23) / 3) * (0-(-32.59907)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 26) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 34) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 34) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.30864 + (((tickAnim - 38) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 38) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 38) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 42) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 49) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 49) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -17.30864 + (((tickAnim - 53) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 53) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 53) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 57) / 3) * (-10-(20)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -17.30864 + (((tickAnim - 0) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 0) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 0) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 4) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 11) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 11) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -17.30864 + (((tickAnim - 15) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 15) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 15) / 3) * (0-(32.59907)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 18) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 26) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 26) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -17.30864 + (((tickAnim - 30) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 30) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 30) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 34) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 42) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 42) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = -17.30864 + (((tickAnim - 46) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 46) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 46) / 3) * (0-(32.59907)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 49) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 49) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 49) / 8) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 57) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 57) / 3) * (32.59907-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 7) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 7) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -17.30864 + (((tickAnim - 11) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 11) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 11) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 23) / 3) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 23) / 3) * (-32.59907-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -17.30864 + (((tickAnim - 26) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 26) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 26) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 30) / 8) * (-40-(20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 38) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 38) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -17.30864 + (((tickAnim - 42) / 4) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 42) / 4) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 42) / 4) * (0-(-32.59907)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            yy = 20 + (((tickAnim - 46) / 7) * (-40-(20)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (-17.30864-(0)));
            yy = -40 + (((tickAnim - 53) / 4) * (-9.21541-(-40)));
            zz = 0 + (((tickAnim - 53) / 4) * (-32.59907-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -17.30864 + (((tickAnim - 57) / 3) * (0-(-17.30864)));
            yy = -9.21541 + (((tickAnim - 57) / 3) * (20-(-9.21541)));
            zz = -32.59907 + (((tickAnim - 57) / 3) * (0-(-32.59907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 0) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 0) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -17.30864 + (((tickAnim - 4) / 3) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 4) / 3) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 4) / 3) * (0-(32.59907)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 7) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 15) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 15) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -17.30864 + (((tickAnim - 18) / 5) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 18) / 5) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 18) / 5) * (0-(32.59907)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 23) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 30) / 4) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 30) / 4) * (32.59907-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -17.30864 + (((tickAnim - 34) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 34) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 34) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 38) / 8) * (40-(-20)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 46) / 3) * (-17.30864-(0)));
            yy = 40 + (((tickAnim - 46) / 3) * (9.21541-(40)));
            zz = 0 + (((tickAnim - 46) / 3) * (32.59907-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -17.30864 + (((tickAnim - 49) / 4) * (0-(-17.30864)));
            yy = 9.21541 + (((tickAnim - 49) / 4) * (-20-(9.21541)));
            zz = 32.59907 + (((tickAnim - 49) / 4) * (0-(32.59907)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 53) / 7) * (40-(-20)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftAntenna1, leftAntenna1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(360))+40))*4, leftAntenna1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(360))))*10), leftAntenna1.rotateAngleZ + (float) Math.toRadians(0));
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraMyriapod entityMyriapod = (EntityPrehistoricFloraMyriapod) e;


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMyriapod e = (EntityPrehistoricFloraMyriapod) entity;
        animator.update(entity);
        
    }
}
