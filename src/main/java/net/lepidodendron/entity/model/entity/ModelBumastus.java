package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBumastus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelBumastus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cephalon;
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
    private final AdvancedModelRenderer leftAntennae;
    private final AdvancedModelRenderer rightAntennae;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer thorax1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer thorax3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;

    public ModelBumastus() {
        this.textureWidth = 38;
        this.textureHeight = 38;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.0284F, 0.0F, -3.5039F);
        this.main.addChild(cephalon);
        this.cephalon.cubeList.add(new ModelBox(cephalon, 30, 12, -1.0284F, -2.125F, -4.4961F, 2, 2, 2, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 16, -2.5284F, -3.0F, -1.9961F, 5, 2, 2, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 31, -1.5284F, -2.1F, -2.4961F, 3, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5284F, -3.0F, -1.9961F);
        this.cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.37F, 0.4404F, -0.8326F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 2, -2.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.7784F, -1.0F, 0.1539F);
        this.cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, -2.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5284F, -3.0F, -0.4961F);
        this.cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.829F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 34, -3.0F, 0.0F, -1.5F, 3, 1, 2, -0.002F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0284F, -0.125F, -4.4961F);
        this.cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 29, -3.0F, -2.0F, 0.0F, 3, 2, 2, -0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.8F, -0.125F, -3.3481F);
        this.cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.0472F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 12, -1.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 31, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-5.3F, -0.125F, -0.75F);
        this.cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.4835F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 12, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.001F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(5.2433F, -0.125F, -0.75F);
        this.cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -1.4835F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 12, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.7433F, -0.125F, -3.3481F);
        this.cephalon.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.0472F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 12, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 31, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.9716F, -0.125F, -4.4961F);
        this.cephalon.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3927F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 29, 0.0F, -2.0F, 0.0F, 3, 2, 2, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.7216F, -1.0F, 0.1539F);
        this.cephalon.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, -0.3927F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 12, 1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.4716F, -3.0F, -0.4961F);
        this.cephalon.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.829F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 34, 0.0F, 0.0F, -1.5F, 3, 1, 2, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.4716F, -3.0F, -1.9961F);
        this.cephalon.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.37F, -0.4404F, 0.8326F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 2, 0.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5284F, -3.0F, -1.9961F);
        this.cephalon.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5672F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 16, -2.0F, 0.0F, -2.0F, 5, 2, 2, 0.0F, false));

        this.leftAntennae = new AdvancedModelRenderer(this);
        this.leftAntennae.setRotationPoint(0.9716F, 0.0F, -1.4961F);
        this.cephalon.addChild(leftAntennae);
        this.setRotateAngle(leftAntennae, -0.0436F, -0.0873F, 0.0F);
        this.leftAntennae.cubeList.add(new ModelBox(leftAntennae, -7, 0, 0.0F, 0.0F, -7.0F, 2, 0, 7, 0.0F, false));

        this.rightAntennae = new AdvancedModelRenderer(this);
        this.rightAntennae.setRotationPoint(-1.0284F, 0.0F, -1.4961F);
        this.cephalon.addChild(rightAntennae);
        this.setRotateAngle(rightAntennae, -0.0436F, 0.0873F, 0.0F);
        this.rightAntennae.cubeList.add(new ModelBox(rightAntennae, -7, 0, -2.0F, 0.0F, -7.0F, 2, 0, 7, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.4716F, -1.0F, 0.5039F);
        this.cephalon.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.3491F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, -1, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.5284F, -1.0F, 0.5039F);
        this.cephalon.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 3.1416F, 0.0F, 2.7925F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, -1, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.thorax1 = new AdvancedModelRenderer(this);
        this.thorax1.setRotationPoint(-0.0284F, 0.0F, -0.0211F);
        this.cephalon.addChild(thorax1);
        this.thorax1.cubeList.add(new ModelBox(thorax1, 20, 0, -1.5F, -2.5F, 0.025F, 3, 1, 2, 0.0F, false));
        this.thorax1.cubeList.add(new ModelBox(thorax1, 5, 0, -2.5F, -2.0F, 0.025F, 5, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.5F, -2.0F, 1.025F);
        this.thorax1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.48F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 6, -2.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.5F, -2.0F, 1.025F);
        this.thorax1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.48F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 6, 0.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(0.0F, 0.0F, 1.975F);
        this.thorax1.addChild(thorax2);
        this.thorax2.cubeList.add(new ModelBox(thorax2, 20, 4, -1.5F, -2.5F, 0.0F, 3, 1, 2, -0.004F, false));
        this.thorax2.cubeList.add(new ModelBox(thorax2, 5, 4, -2.5F, -2.0F, 0.0F, 5, 1, 2, -0.004F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.5F, -2.0F, 0.5F);
        this.thorax2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.48F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 6, -2.0F, 0.0F, -0.5F, 2, 1, 2, -0.004F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.5F, -2.0F, 0.5F);
        this.thorax2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.48F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 6, 0.0F, 0.0F, -0.5F, 2, 1, 2, -0.004F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.thorax2.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.3491F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, -1, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, -1.0F, 0.5F);
        this.thorax2.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 3.1416F, 0.0F, 2.7925F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, -1, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.thorax3 = new AdvancedModelRenderer(this);
        this.thorax3.setRotationPoint(0.0F, 0.0F, 1.975F);
        this.thorax2.addChild(thorax3);
        this.thorax3.cubeList.add(new ModelBox(thorax3, 20, 8, -1.5F, -2.5F, -0.025F, 3, 1, 2, -0.008F, false));
        this.thorax3.cubeList.add(new ModelBox(thorax3, 5, 8, -2.5F, -2.0F, -0.025F, 5, 1, 2, -0.008F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.5F, -2.0F, 0.475F);
        this.thorax3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.48F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 6, -1.99F, 0.0F, -0.5F, 2, 1, 2, -0.008F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.5F, -2.0F, 0.475F);
        this.thorax3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.48F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 6, -0.01F, 0.0F, -0.5F, 2, 1, 2, -0.008F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, -1.0F, 0.475F);
        this.thorax3.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.3491F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, -1, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, -1.0F, 0.475F);
        this.thorax3.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 3.1416F, 0.0F, 2.7925F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, -1, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.0F, 1.925F);
        this.thorax3.addChild(pygidium);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 21, -1.5F, -2.55F, 0.0F, 3, 1, 3, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 13, 26, -1.5F, -1.95F, 0.0F, 3, 1, 3, -0.002F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 11, 35, -1.5F, -1.125F, 4.0F, 3, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-4.7766F, -1.125F, 3.7057F);
        this.pygidium.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.5708F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 25, -4.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -2.55F, 0.0F);
        this.pygidium.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.48F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 21, -3.0F, 0.0F, 0.0F, 3, 1, 3, -0.002F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, -2.55F, 3.0F);
        this.pygidium.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4971F, -0.12F, -0.5062F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 19, 12, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, -1.125F, 6.0F);
        this.pygidium.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.6109F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 21, -4.0F, 0.0F, -2.0F, 4, 1, 2, -0.002F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(4.7766F, -1.125F, 3.7057F);
        this.pygidium.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 1.5708F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 25, 0.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, -1.125F, 6.0F);
        this.pygidium.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.6109F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 21, 0.0F, 0.0F, -2.0F, 4, 1, 2, -0.002F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.5F, -2.55F, 0.0F);
        this.pygidium.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.48F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 21, 0.0F, 0.0F, 0.0F, 3, 1, 3, -0.002F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.5F, -2.55F, 3.0F);
        this.pygidium.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4971F, 0.12F, 0.5062F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 12, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -2.55F, 3.0F);
        this.pygidium.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.48F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 26, -1.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.pygidium.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.3491F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, -1, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.5F, -1.0F, 0.5F);
        this.pygidium.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 3.1416F, 0.0F, 2.7925F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, -1, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));
        updateDefaultPose();
    }
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 * 0.3F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.main.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.5F;
        this.main.offsetX = -0.05F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        this.main.offsetY = 1.05F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraBumastus) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            }
            this.bob(main, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftLeg1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.bob(main, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(leftAntennae, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntennae, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
