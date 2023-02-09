package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraGoodradigbeeon;
import net.lepidodendron.entity.EntityPrehistoricFloraWuttagoonaspis;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGoodradigbeeon extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer shoulder;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;


    public ModelGoodradigbeeon() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.5F, -0.125F);
        this.main.cubeList.add(new ModelBox(main, 39, 33, -3.5F, -2.0F, -4.825F, 7, 1, 3, -0.0015F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 39, -3.5F, -2.025F, -1.875F, 7, 2, 3, 0.02F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 33, -1.0F, -2.0F, -8.0F, 2, 1, 3, -0.002F, false));
        this.main.cubeList.add(new ModelBox(main, 6, 55, -1.0F, -2.0F, -5.0F, 2, 1, 1, -0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.3998F, -1.5F, -5.186F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2086F, 0.9894F, 0.2481F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, -1.5F, -0.225F, -0.5F, 3, 1, 0, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.3998F, -1.5F, -5.186F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2086F, -0.9894F, -0.2481F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -1.5F, -0.225F, -0.5F, 3, 1, 0, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.3998F, -1.5F, -5.186F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.0036F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 50, -1.5F, -0.5F, -1.5F, 3, 1, 3, -0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.3998F, -1.5F, -5.186F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.0036F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 50, -1.5F, -0.5F, -1.5F, 3, 1, 3, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.258F, -1.5F, -1.5844F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.4835F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 26, -2.9128F, -0.5F, -2.4962F, 3, 1, 3, -0.001F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 8, 0.0872F, -0.5F, -2.4962F, 3, 2, 3, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.258F, -1.5F, -1.5844F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.4835F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 8, -3.0872F, -0.5F, -2.4962F, 3, 2, 3, -0.001F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 37, -0.0872F, -0.5F, -2.4962F, 3, 1, 3, -0.001F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.1749F, -1.0F, -7.1157F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 9, -1.0F, -0.6F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.1749F, -1.0F, -7.1157F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 9, -1.0F, -0.6F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5412F, -1.5F, -5.6934F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3927F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 4, -0.6173F, -0.5F, -1.9239F, 2, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5412F, -1.5F, -5.6934F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 4, -1.3827F, -0.5F, -1.9239F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.4065F, -6.9668F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2225F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 16, -1.0F, -0.0444F, -1.2792F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -2.276F, -4.9733F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.096F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 46, -2.45F, -0.2941F, -1.7698F, 1, 1, 3, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 46, 2.45F, -0.2941F, -1.7698F, 1, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -2.276F, -4.9733F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 46, -2.5F, -0.5691F, -1.7948F, 4, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -3.5387F, 1.0873F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0916F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 26, -4.0F, -0.0021F, -5.0041F, 8, 2, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.3137F, -1.0F, -1.7265F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 46, 16, -3.8137F, 0.0F, -3.1485F, 7, 1, 3, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 41, -1.3137F, -0.0038F, -6.1864F, 2, 1, 2, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 46, 20, -3.3137F, -0.0038F, -5.1364F, 6, 1, 2, 0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 9, 1.9363F, -0.0038F, -4.1364F, 1, 1, 1, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 9, -3.5637F, -0.0038F, -4.1364F, 1, 1, 1, -0.002F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.8549F, -0.5038F, -3.8798F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 3, -0.6173F, 0.5F, -1.9239F, 2, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.2275F, -0.5038F, -3.8798F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.3927F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 3, -1.3827F, 0.5F, -1.9239F, 2, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.7135F, -0.5038F, -3.3724F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 1.0036F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 9, -1.5F, 0.5F, -1.5F, 3, 1, 1, -0.01F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.0862F, -0.5038F, -3.3724F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -1.0036F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 9, -1.5F, 0.5F, -1.5F, 3, 1, 1, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.5717F, -0.5F, 0.1421F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 1.4835F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 0, -0.0872F, 0.5F, -2.4962F, 3, 1, 3, -0.001F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.9443F, -0.5F, 0.1421F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.4835F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 48, 0, -2.9128F, 0.5F, -2.4962F, 3, 1, 3, -0.001F, false));

        this.shoulder = new AdvancedModelRenderer(this);
        this.shoulder.setRotationPoint(-1.0F, 0.0F, 0.175F);
        this.main.addChild(shoulder);
        this.shoulder.cubeList.add(new ModelBox(shoulder, 22, 9, -4.0F, -1.9F, 0.975F, 10, 2, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, -3.6496F, 5.213F);
        this.shoulder.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3796F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 21, 21, 0.0F, -1.0F, -2.2F, 0, 3, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -3.6484F, 4.428F);
        this.shoulder.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1614F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 33, 0, -2.0F, -0.375F, -3.725F, 4, 1, 7, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-5.3065F, -1.812F, 5.8F);
        this.shoulder.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0407F, 0.5183F, 0.0356F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, 0.0602F, -0.9945F, 0.1434F, 2, 2, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(7.3065F, -1.812F, 5.8F);
        this.shoulder.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0407F, -0.5183F, -0.0356F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -2.0602F, -0.9945F, 0.1434F, 2, 2, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.5F, -2.1551F, 3.4673F);
        this.shoulder.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0448F, -0.231F, -0.0103F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 46, -0.1F, -0.55F, -2.5F, 1, 2, 5, -0.001F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(6.5F, -2.1551F, 3.4673F);
        this.shoulder.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0448F, 0.231F, 0.0103F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 38, 46, -0.9F, -0.55F, -2.5F, 1, 2, 5, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, -2.0F, 4.5F);
        this.shoulder.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 17, -5.0F, -1.7F, -3.525F, 10, 3, 5, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(1.0F, -2.2866F, 5.5157F);
        this.shoulder.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -0.7134F, -0.5157F, 9, 3, 6, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.2134F, 2.4843F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0436F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 19, -4.0F, -0.075F, -2.95F, 8, 1, 6, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(4.5F, 1.5616F, 0.5843F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.3054F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.frontleftfin.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.2618F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 19, 0, -0.475F, 0.0F, -0.25F, 8, 0, 5, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-4.5F, 1.5616F, 0.5843F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.3054F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.frontrightfin.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.2618F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 19, 0, -7.525F, 0.0F, -0.25F, 8, 0, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0854F, 5.0056F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 25, -4.0F, -0.7988F, -0.0213F, 8, 3, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -1.2988F, -3.0213F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0131F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 33, -3.0F, 0.025F, 3.05F, 6, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0787F, 4.4967F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 33, -3.0F, -0.8775F, -0.018F, 6, 3, 5, 0.001F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.3775F, -8.018F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0218F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 44, -2.0F, 0.025F, 8.05F, 4, 1, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.7563F, 1.6225F, 1.0528F);
        this.tail2.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.6545F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0063F, 0.5F, -0.4958F);
        this.backrightfin.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.3927F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 41, -6.0F, -0.5F, 0.0F, 6, 0, 4, 0.0F, true));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.7563F, 1.6225F, 1.0528F);
        this.tail2.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.6545F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.0063F, 0.5F, -0.4958F);
        this.backleftfin.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.3927F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 41, 0.0F, -0.5F, 0.0F, 6, 0, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4117F, 4.5288F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 39, -2.0F, -0.4658F, -0.0468F, 4, 2, 5, -0.001F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 25, 9, 0.0F, -3.4658F, -0.0468F, 0, 3, 7, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 2.5342F, -0.0468F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1134F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 45, -1.5F, -1.325F, 0.0F, 3, 1, 5, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5342F, 4.9532F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 45, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, 0.0F, -3.0F, 0.0F, 0, 6, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0F;
        this.main.offsetZ = 0.02F;
        this.main.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.headshield.offsetZ = -0.4F;
        //this.main.offsetY = 0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        EntityPrehistoricFloraGoodradigbeeon goodra = (EntityPrehistoricFloraGoodradigbeeon) e;
        float speed = 0.3F;
        float taildegree = 0.25F;
        float inwater = 1F;

        if (!e.isInWater()) {
            speed = 0.7F;
            inwater = 0.65F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifier = 1F;
        float swingModifier = 1F;
        float finDegreeZ = (float)Math.toRadians(25);
        float finDegreeY = (float)Math.toRadians(7.5);
        if (isAtBottom && !goodra.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.23F;
            bottomModifier = 0.8F;
            swingModifier = 0.5F;
            finDegreeZ = (float)Math.toRadians(15);
            finDegreeY = (float)Math.toRadians(12.5);

            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);

        }



        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.chainWave(fishTail, speed *0.5F* bottomModifier, 0.02F, -1, f2, 1);
            this.chainSwing(fishTail, speed *0.5F* bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(main, speed *0.5F* bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
            if(isAtBottom && !goodra.getIsFast()) {
                this.walk(jaw, (float) (speed * 0.2), (float) Math.toRadians(7.5), true, 0.5F, -0.3F, f2, 1);
            } else {
                this.walk(jaw, (float) (speed * 0.4), (float) Math.toRadians(10), true, 0.2F, -0.25F, f2, 1);
            }
            this.flap(frontleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
            this.swing(frontleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);
            this.flap(frontrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, 0F, 0, f2, 1 * inwater);
            this.swing(frontrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, 0, 0, f2, 1 * inwater);

            this.flap(backleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(backleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(backrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(backrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.02F;
                this.main.offsetX = 0.5F;
                //this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
        }
    }


}
