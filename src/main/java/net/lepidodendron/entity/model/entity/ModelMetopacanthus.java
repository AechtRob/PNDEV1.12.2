package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMetopacanthus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMetopacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer clasper;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r36;

    public ModelMetopacanthus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.0135F, 2.7747F);
        this.main.cubeList.add(new ModelBox(main, 28, 57, -2.5F, -4.2885F, -14.7747F, 5, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.2365F, -9.7747F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 18, -2.0F, -0.525F, -3.1F, 4, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.2635F, -14.7747F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7025F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 32, -1.5F, 1.15F, -3.15F, 3, 2, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 63, -1.5F, -0.85F, -5.15F, 3, 2, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 1.7462F, -15.7208F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 5, 0.0F, -1.075F, -0.6F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 5, -2.0F, -1.075F, -0.6F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.2635F, -11.2747F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1876F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 60, -2.0F, -0.3F, -3.525F, 4, 4, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.7365F, -14.7747F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 0, -2.0F, -2.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.4865F, -11.2747F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 33, -2.5F, -1.0F, -3.75F, 5, 2, 6, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.75F, -2.0135F, -12.7747F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.3491F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 44, 18, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 14, -0.875F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.75F, -2.0135F, -12.7747F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.3491F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 44, 18, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 14, -1.125F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.clasper = new AdvancedModelRenderer(this);
        this.clasper.setRotationPoint(0.0F, 8.7365F, -4.7747F);
        this.main.addChild(clasper);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -12.75F, -18.4F);
        this.clasper.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 18, -0.5F, 0.0227F, -3.889F, 1, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -12.0F, -14.0F);
        this.clasper.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, -0.275F, 0.3534F, -4.4992F, 0, 1, 5, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, -0.025F, 0.3534F, -5.2492F, 0, 1, 5, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, 0.225F, 0.3534F, -4.4492F, 0, 1, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -12.0F, -14.0F);
        this.clasper.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 16, -0.5F, -0.1466F, -4.4492F, 1, 1, 5, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -13.0F, -10.0F);
        this.clasper.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.25F, -0.25F, -4.25F, 0, 1, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -0.15F, -5.0F, 0, 1, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.25F, -0.25F, -4.25F, 0, 1, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 1, -0.5F, -0.425F, -4.0F, 1, 1, 5, 0.0F, false));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(0.0F, 0.7365F, -18.7747F);
        this.main.addChild(horn);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.2137F, -8.706F);
        this.horn.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2051F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 0, -0.5F, 0.0145F, 0.0133F, 1, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.3113F, -8.156F);
        this.horn.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0742F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 0, -0.5F, 0.4973F, -0.2991F, 1, 2, 1, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.439F, 0.2383F);
        this.horn.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0742F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 13, -0.275F, -0.2752F, -8.8289F, 0, 1, 9, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 13, -0.025F, -0.3252F, -8.2289F, 0, 1, 9, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 13, 0.225F, -0.2752F, -8.8289F, 0, 1, 9, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 61, 23, -0.5F, -0.0002F, -9.0289F, 1, 1, 9, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 41, -0.5F, -0.4524F, -7.7281F, 1, 1, 8, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.159F, -12.7996F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, 0.829F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.25F, -0.8885F, -0.5755F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4232F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 3, -1.25F, 0.325F, -2.775F, 0, 1, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 3, 0.75F, 0.325F, -2.775F, 0, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.242F, 1.2953F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -1.5F, 1.0F, -4.75F, 3, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.3318F, -2.8461F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.384F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 31, -1.5F, -1.1079F, -1.1724F, 3, 1, 4, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.6635F, -9.2997F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 48, 18, -3.5F, -4.5F, 0.0F, 7, 10, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 0, -4.0F, -4.5F, 4.0F, 8, 10, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -5.0F, 3.0F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1658F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 48, 0.0F, -9.75F, -0.7F, 0, 11, 8, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -5.0F, 3.0F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1222F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 66, 9, -0.5F, -10.5F, -1.5F, 1, 12, 1, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(3.55F, 5.3F, 3.025F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -1.0472F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(6.5658F, 0.0247F, -0.6307F);
        this.frontleftfin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.5708F, 0.0436F, -1.5708F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 3, 68, 0.5F, -5.55F, -5.9F, 0, 7, 12, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.2F, -0.15F, 0.0F);
        this.frontleftfin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.5708F, 0.0F, 1.5708F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 65, 65, -0.897F, -1.5F, -0.0052F, 1, 3, 5, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-3.55F, 5.3F, 3.025F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 1.1345F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-6.5658F, 0.0247F, -0.6307F);
        this.frontrightfin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.5708F, -0.0436F, 1.5708F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 3, 68, -0.5F, -5.55F, -5.9F, 0, 7, 12, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.2F, -0.15F, 0.0F);
        this.frontrightfin.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.5708F, 0.0F, -1.5708F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 65, 65, -0.103F, -1.5F, -0.0052F, 1, 3, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 28, 31, -3.5F, -4.5F, -1.0F, 7, 9, 6, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 10, -3.0F, -2.1F, -0.825F, 6, 2, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 31, -3.0F, -3.5F, -1.0F, 6, 7, 8, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -4.0F, 2.5F);
        this.body3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, 0.5F, -3.45F, -2.425F, 0, 4, 7, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -4.0F, 2.5F);
        this.body3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0829F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 46, -2.0F, -0.2F, -3.425F, 5, 2, 8, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 4.75F, 0.0F);
        this.body3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0916F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 46, -2.5F, -1.9F, -0.875F, 5, 2, 8, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.9029F, 3.3992F, 0.5507F);
        this.body3.addChild(backleftfin);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.0029F, -0.6492F, -0.0507F);
        this.backleftfin.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.493F, 0.2929F, -0.493F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 41, -0.5F, 1.0F, -1.5F, 0, 8, 5, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 31, -1.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.9029F, 3.3992F, 0.5507F);
        this.body3.addChild(backrightfin);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0029F, -0.6492F, -0.0507F);
        this.backrightfin.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.493F, -0.2929F, 0.493F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 18, 41, 0.5F, 1.0F, -1.5F, 0, 8, 5, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 31, 0.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 45, 49, -2.5F, -2.5F, -1.0F, 5, 4, 7, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -3.0F, 2.5F);
        this.body4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1614F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 58, 0, -2.0F, -0.075F, -3.45F, 4, 2, 7, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 4.25F, 0.1F);
        this.body4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3098F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 46, 38, -2.0F, -3.4F, -1.3F, 4, 3, 8, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -4.0F, -3.5F);
        this.body4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 1, 5, 0.5F, -2.3F, 3.575F, 0, 3, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -1.0F, 7.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 64, 55, -1.5F, -1.5F, -1.0F, 3, 4, 5, -0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 9, -0.025F, 2.5F, -1.0F, 0, 4, 9, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -3.0F, -9.5F);
        this.body5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 10, 0.5F, -1.15F, 8.575F, 0, 2, 4, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.body5.addChild(body6);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-2.0F, -1.0F, 0.0F);
        this.body6.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.6545F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, 2.0F, -0.5F, -3.0F, 0, 7, 24, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, 1.5F, 0.0F, -2.0F, 1, 2, 16, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(clasper, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(horn, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.09F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.1F, 0.0F);
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        this.main.offsetY = -0.1F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6};
        ((EntityPrehistoricFloraMetopacanthus)e).tailBuffer.applyChainSwingBuffer(fishTail);
        float speed = 0.3F;
        if (f3>0) { // if not in water
            speed = 0.22F;
        } else {
            speed=0.13F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.walk(jaw, (float) (0.1), 0.2F, true, -2, 0.44F, f2, 1);


                //this.walk(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

                this.flap(frontleftfin, (float) (speed * 0.5F), (float) Math.toRadians(40.3015), false, -3, 0.6F, f2, 1);
                this.flap(frontrightfin, (float) (speed * 0.5F), (float) Math.toRadians(40.3015), false, -6, -0.6F, f2, 1);
                if(e.isInWater()) {
                    this.chainWave(fishTail, speed * 0.8F, 0.05F, -3, f2, 1);
                    this.chainSwing(fishTail, speed * 0.8F, 0.25F, -3, f2, 1);
                }
                this.flap(backleftfin, (speed), 0.2F, true, 0, 0, f2, 1);
                this.flap(backrightfin, (speed), 0.2F, true, 0, 0, f2, 1);


                // this.walk(backrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);


            if(!e.isInWater()) {
                //this.chainWave(fishTail, speed * 0.8F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 3F, 0.25F, -3, f2, 1);
                this.main.offsetY = 0F;
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.bob(main, speed*5F, 5F, false, f2, 1);
            }
        }
    }
}
