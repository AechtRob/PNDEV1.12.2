package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTrimerus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrimerus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Trimerus;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer LEFTCEPHALON1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer LEFTCEPHALON2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer LEFTCEPHALON3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer RIGHTCEPHALON1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer RIGHTCEPHALON2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer RIGHTCEPHALON3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer LEFTRIDGE1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer RIGHTRIDGE1;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer LEFTRIDGE2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer RIGHTRIDGE2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer LEFTRIDGE3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer RIGHTRIDGE3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer rightLeg10;

    public ModelTrimerus() {
        this.textureWidth = 32;
        this.textureHeight = 28;

        this.Trimerus = new AdvancedModelRenderer(this);
        this.Trimerus.setRotationPoint(0.0F, 21.25F, -3.0F);
        this.setRotateAngle(Trimerus, 0.1745F, 0.0F, 0.0F);
        this.Trimerus.cubeList.add(new ModelBox(Trimerus, 0, 10, -1.0F, 0.35F, -5.0F, 2, 1, 5, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.35F, -5.0F);
        this.Trimerus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 0, -0.5F, 0.7F, -1.2F, 1, 0, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.Trimerus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 5, -1.5F, -0.15F, 0.0F, 2, 1, 5, 0.0F, false));

        this.LEFTCEPHALON1 = new AdvancedModelRenderer(this);
        this.LEFTCEPHALON1.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.Trimerus.addChild(LEFTCEPHALON1);
        this.setRotateAngle(LEFTCEPHALON1, 0.0F, 0.0F, 0.6109F);
        this.LEFTCEPHALON1.cubeList.add(new ModelBox(LEFTCEPHALON1, 11, 13, 0.0F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));
        this.LEFTCEPHALON1.cubeList.add(new ModelBox(LEFTCEPHALON1, 0, 10, -0.5F, -0.25F, -1.5F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, 0.5F, 0.5F);
        this.LEFTCEPHALON1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3054F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 10, -1.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.LEFTCEPHALON2 = new AdvancedModelRenderer(this);
        this.LEFTCEPHALON2.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.LEFTCEPHALON1.addChild(LEFTCEPHALON2);
        this.setRotateAngle(LEFTCEPHALON2, 0.0F, -0.5672F, 0.0F);
        this.LEFTCEPHALON2.cubeList.add(new ModelBox(LEFTCEPHALON2, 13, 26, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -0.5F, 0.0F);
        this.LEFTCEPHALON2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2955F, -0.1374F, -0.3867F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 0, -0.4F, 0.15F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.LEFTCEPHALON2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.219F, 0.1798F, -0.4753F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, -0.55F, 0.5F, -1.2F, 1, 0, 2, 0.0F, false));

        this.LEFTCEPHALON3 = new AdvancedModelRenderer(this);
        this.LEFTCEPHALON3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.LEFTCEPHALON2.addChild(LEFTCEPHALON3);
        this.setRotateAngle(LEFTCEPHALON3, 0.0F, -0.5847F, 0.0F);
        this.LEFTCEPHALON3.cubeList.add(new ModelBox(LEFTCEPHALON3, 22, 12, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.02F, false));
        this.LEFTCEPHALON3.cubeList.add(new ModelBox(LEFTCEPHALON3, 22, 7, 1.3F, -1.0F, 0.0F, 2, 1, 1, -0.03F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.7F, -0.5F, 0.0F);
        this.LEFTCEPHALON3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 0, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.6F, -0.5F, 0.0F);
        this.LEFTCEPHALON3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 0, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.LEFTCEPHALON3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 0, -0.4F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.RIGHTCEPHALON1 = new AdvancedModelRenderer(this);
        this.RIGHTCEPHALON1.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.Trimerus.addChild(RIGHTCEPHALON1);
        this.setRotateAngle(RIGHTCEPHALON1, 0.0F, 0.0F, -0.6109F);
        this.RIGHTCEPHALON1.cubeList.add(new ModelBox(RIGHTCEPHALON1, 11, 13, -3.0F, 0.0F, -3.0F, 3, 1, 4, 0.0F, true));
        this.RIGHTCEPHALON1.cubeList.add(new ModelBox(RIGHTCEPHALON1, 0, 10, -0.5F, -0.25F, -1.5F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.0F, 0.5F, 0.5F);
        this.RIGHTCEPHALON1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3054F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 10, -1.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.RIGHTCEPHALON2 = new AdvancedModelRenderer(this);
        this.RIGHTCEPHALON2.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.RIGHTCEPHALON1.addChild(RIGHTCEPHALON2);
        this.setRotateAngle(RIGHTCEPHALON2, 0.0F, 0.5672F, 0.0F);
        this.RIGHTCEPHALON2.cubeList.add(new ModelBox(RIGHTCEPHALON2, 13, 26, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -0.5F, 0.0F);
        this.RIGHTCEPHALON2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2955F, 0.1374F, 0.3867F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 0, -0.6F, 0.15F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.RIGHTCEPHALON2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.219F, -0.1798F, 0.4753F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 0, -0.45F, 0.5F, -1.2F, 1, 0, 2, 0.0F, true));

        this.RIGHTCEPHALON3 = new AdvancedModelRenderer(this);
        this.RIGHTCEPHALON3.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.RIGHTCEPHALON2.addChild(RIGHTCEPHALON3);
        this.setRotateAngle(RIGHTCEPHALON3, 0.0F, 0.5847F, 0.0F);
        this.RIGHTCEPHALON3.cubeList.add(new ModelBox(RIGHTCEPHALON3, 22, 12, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.02F, true));
        this.RIGHTCEPHALON3.cubeList.add(new ModelBox(RIGHTCEPHALON3, 22, 7, -3.3F, -1.0F, 0.0F, 2, 1, 1, -0.03F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.7F, -0.5F, 0.0F);
        this.RIGHTCEPHALON3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3491F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 0, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.6F, -0.5F, 0.0F);
        this.RIGHTCEPHALON3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 0, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.RIGHTCEPHALON3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.1309F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 0, -0.6F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.5F, 1.4F, -4.15F);
        this.Trimerus.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.1085F, -0.3433F, 0.0779F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 0, 0, 0.0F, -0.0055F, -4.0249F, 5, 0, 4, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.5F, 1.4F, -4.15F);
        this.Trimerus.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.1085F, 0.3433F, -0.0779F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 0, 0, -5.0F, -0.0055F, -4.0249F, 5, 0, 4, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.0F, 1.25F, -3.0F);
        this.Trimerus.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.3927F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 27, 21, 0.0F, 0.1F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(0.0F, 1.25F, -3.0F);
        this.Trimerus.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.0F, -0.3927F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 27, 21, -2.0F, 0.1F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 1.25F, -1.5F);
        this.Trimerus.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.3927F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 22, 5, 0.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 1.25F, -1.5F);
        this.Trimerus.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.3927F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 22, 5, -3.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.65F, -0.2F);
        this.Trimerus.addChild(body1);
        this.setRotateAngle(body1, -0.1745F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 22, -1.0F, 0.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.LEFTRIDGE1 = new AdvancedModelRenderer(this);
        this.LEFTRIDGE1.setRotationPoint(1.0F, 0.75F, 0.0F);
        this.body1.addChild(LEFTRIDGE1);
        this.setRotateAngle(LEFTRIDGE1, 0.0F, 0.0F, 0.7418F);
        this.LEFTRIDGE1.cubeList.add(new ModelBox(LEFTRIDGE1, 0, 5, -1.1F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));
        this.LEFTRIDGE1.cubeList.add(new ModelBox(LEFTRIDGE1, 27, 10, 1.9F, 0.01F, 2.0F, 2, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.9F, 0.0F, 3.5F);
        this.LEFTRIDGE1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2618F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 10, -1.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.9F, 0.0F, 1.5F);
        this.LEFTRIDGE1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.1745F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 10, -1.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.RIGHTRIDGE1 = new AdvancedModelRenderer(this);
        this.RIGHTRIDGE1.setRotationPoint(-1.0F, 0.75F, 0.0F);
        this.body1.addChild(RIGHTRIDGE1);
        this.setRotateAngle(RIGHTRIDGE1, 0.0F, 0.0F, -0.7418F);
        this.RIGHTRIDGE1.cubeList.add(new ModelBox(RIGHTRIDGE1, 0, 5, -2.9F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));
        this.RIGHTRIDGE1.cubeList.add(new ModelBox(RIGHTRIDGE1, 27, 10, -3.9F, 0.01F, 2.0F, 2, 0, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.9F, 0.0F, 3.5F);
        this.RIGHTRIDGE1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.2618F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 10, -1.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.9F, 0.0F, 1.5F);
        this.RIGHTRIDGE1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 27, 10, -1.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 1.9F, 0.7F);
        this.body1.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.48F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 22, 5, 0.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 1.9F, 0.7F);
        this.body1.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, -0.48F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 22, 5, -3.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 1.9F, 2.2F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.48F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 22, 5, 0.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 1.9F, 2.2F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -0.48F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 22, 5, -3.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 1.9F, 3.7F);
        this.body1.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 0.48F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 22, 5, 0.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 1.9F, 3.7F);
        this.body1.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -0.48F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 22, 5, -3.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 11, 19, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.LEFTRIDGE2 = new AdvancedModelRenderer(this);
        this.LEFTRIDGE2.setRotationPoint(1.0F, 0.75F, 2.0F);
        this.body2.addChild(LEFTRIDGE2);
        this.setRotateAngle(LEFTRIDGE2, 0.0F, 0.0F, 0.7418F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.75F, 0.0F, 1.0F);
        this.LEFTRIDGE2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3054F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 27, 10, -1.2F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.75F, 0.0F, 0.0F);
        this.LEFTRIDGE2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 10, -1.1F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 0, -3.0F, 0.0F, -2.0F, 3, 0, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.75F, 0.0F, -1.0F);
        this.LEFTRIDGE2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.3491F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 27, 10, -1.1F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.RIGHTRIDGE2 = new AdvancedModelRenderer(this);
        this.RIGHTRIDGE2.setRotationPoint(-1.0F, 0.75F, 2.0F);
        this.body2.addChild(RIGHTRIDGE2);
        this.setRotateAngle(RIGHTRIDGE2, 0.0F, 0.0F, -0.7418F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.75F, 0.0F, 1.0F);
        this.RIGHTRIDGE2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.3054F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 27, 10, -0.8F, 0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.75F, 0.0F, 0.0F);
        this.RIGHTRIDGE2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 10, -0.9F, 0.01F, -0.5F, 2, 0, 1, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 0, 0.0F, 0.0F, -2.0F, 3, 0, 4, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.75F, 0.0F, -1.0F);
        this.RIGHTRIDGE2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.3491F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 10, -0.9F, 0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.0F, 1.9F, 1.2F);
        this.body2.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 0.4363F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 22, 5, 0.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.0F, 1.9F, 1.2F);
        this.body2.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -0.4363F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 22, 5, -3.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.0F, 1.9F, 2.7F);
        this.body2.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 0.3927F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 22, 5, 0.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(0.0F, 1.9F, 2.7F);
        this.body2.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -0.3927F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 22, 5, -3.0F, 0.1F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 20, 22, -0.5F, 1.0F, -0.15F, 1, 1, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 15, -0.5F, 0.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.25F, 3.75F);
        this.body3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.829F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 15, 0, -0.5F, 0.0F, -0.65F, 1, 0, 2, 0.0F, false));

        this.LEFTRIDGE3 = new AdvancedModelRenderer(this);
        this.LEFTRIDGE3.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.body3.addChild(LEFTRIDGE3);
        this.setRotateAngle(LEFTRIDGE3, -0.2177F, -0.0615F, 0.7532F);
        this.LEFTRIDGE3.cubeList.add(new ModelBox(LEFTRIDGE3, 0, 17, -0.2F, -0.15F, -0.2F, 3, 0, 4, 0.0F, false));
        this.LEFTRIDGE3.cubeList.add(new ModelBox(LEFTRIDGE3, 27, 10, 1.4F, -0.14F, 0.8F, 2, 0, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.25F, 0.0F, 3.75F);
        this.LEFTRIDGE3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -1.0472F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 10, -1.05F, -0.14F, -0.25F, 2, 0, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.75F, 0.0F, 3.25F);
        this.LEFTRIDGE3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.48F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 10, -1.2F, -0.14F, -0.45F, 2, 0, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.75F, 0.0F, 2.5F);
        this.LEFTRIDGE3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.2618F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 27, 10, -1.65F, -0.14F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.75F, 0.0F, 0.25F);
        this.LEFTRIDGE3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.2618F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 27, 10, -1.0F, -0.14F, -0.45F, 2, 0, 1, 0.0F, false));

        this.RIGHTRIDGE3 = new AdvancedModelRenderer(this);
        this.RIGHTRIDGE3.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.body3.addChild(RIGHTRIDGE3);
        this.setRotateAngle(RIGHTRIDGE3, -0.2177F, 0.0615F, -0.7532F);
        this.RIGHTRIDGE3.cubeList.add(new ModelBox(RIGHTRIDGE3, 0, 17, -2.8F, -0.15F, -0.2F, 3, 0, 4, 0.0F, true));
        this.RIGHTRIDGE3.cubeList.add(new ModelBox(RIGHTRIDGE3, 27, 10, -3.4F, -0.14F, 0.8F, 2, 0, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.25F, 0.0F, 3.75F);
        this.RIGHTRIDGE3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 1.0472F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 27, 10, -0.95F, -0.14F, -0.25F, 2, 0, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.75F, 0.0F, 3.25F);
        this.RIGHTRIDGE3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.48F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 27, 10, -0.8F, -0.14F, -0.45F, 2, 0, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.75F, 0.0F, 2.5F);
        this.RIGHTRIDGE3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.2618F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 27, 10, -0.35F, -0.14F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.75F, 0.0F, 0.25F);
        this.RIGHTRIDGE3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.2618F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 27, 10, -1.0F, -0.14F, -0.45F, 2, 0, 1, 0.0F, true));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, 1.9F, 0.2F);
        this.body3.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0F, 0.0F, 0.5236F);
        this.leftLeg8.cubeList.add(new ModelBox(leftLeg8, 27, 21, 0.0F, 0.1F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, 1.9F, 0.2F);
        this.body3.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.0F, -0.5236F);
        this.rightLeg8.cubeList.add(new ModelBox(rightLeg8, 27, 21, -2.0F, 0.1F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(0.0F, 1.9F, 1.7F);
        this.body3.addChild(leftLeg9);
        this.setRotateAngle(leftLeg9, 0.0F, 0.0F, 0.48F);
        this.leftLeg9.cubeList.add(new ModelBox(leftLeg9, 27, 21, 0.0F, 0.1F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(0.0F, 1.9F, 1.7F);
        this.body3.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.0F, -0.48F);
        this.rightLeg9.cubeList.add(new ModelBox(rightLeg9, 27, 21, -2.0F, 0.1F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(0.0F, 1.9F, 3.2F);
        this.body3.addChild(leftLeg10);
        this.setRotateAngle(leftLeg10, 0.0F, 0.0F, 0.8727F);
        this.leftLeg10.cubeList.add(new ModelBox(leftLeg10, 10, 12, 0.0F, 0.1F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(0.0F, 1.9F, 3.2F);
        this.body3.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.0F, -0.8727F);
        this.rightLeg10.cubeList.add(new ModelBox(rightLeg10, 10, 12, -1.0F, 0.1F, -0.5F, 1, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Trimerus.render(f5 * 0.38F);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Trimerus, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.Trimerus.offsetZ = -0.03F;
        this.Trimerus.offsetY = 0.35F;
        this.Trimerus.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Trimerus.offsetY = -0.35F;
        this.Trimerus.offsetX = 0.07F;
        this.Trimerus.rotateAngleX = (float)Math.toRadians(45);
        this.Trimerus.rotateAngleY = (float)Math.toRadians(220);
        this.Trimerus.rotateAngleZ = (float)Math.toRadians(-20);
        this.Trimerus.scaleChildren = true;
        float scaler = 0.6F;
        this.Trimerus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Trimerus.render(f);
        //Reset rotations, positions and sizing:
        this.Trimerus.setScale(1.0F, 1.0F, 1.0F);
        this.Trimerus.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Trimerus.offsetY = 0.91F;
        EntityPrehistoricFloraTrimerus ee = (EntityPrehistoricFloraTrimerus) e;

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7, this.leftLeg8, this.leftLeg9, this.leftLeg10};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7, this.rightLeg8, this.rightLeg9, this.rightLeg10};

        this.swing(leftAntenna, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntenna, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                this.flap(leftLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);

                this.flap(leftLeg6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg10, 0.5F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg10, 0.5F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);

                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            }
        }
    }
}
