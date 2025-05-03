package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStethacanthus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelStethacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer anvil;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelStethacanthus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 28.0F, 5.0F);
        this.main.cubeList.add(new ModelBox(main, 16, 21, -4.0F, -11.5F, -9.0F, 8, 7, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 23, 47, -3.5F, -11.5F, -14.0F, 7, 6, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.5F, -9.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1134F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 58, -2.5F, -1.0F, -5.0F, 5, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.6065F, -1.041F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 36, -3.5F, -2.3935F, -0.959F, 7, 5, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.7685F, 0.041F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 0, -3.0F, 0.0F, -1.0F, 6, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.1065F, 0.041F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 29, -3.0F, -1.05F, -1.0F, 6, 1, 7, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.1431F, 5.8313F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 24, 0, -3.0F, -0.7504F, -1.1903F, 6, 4, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.9754F, -0.5153F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, 0.0F, -5.0F, -0.35F, 0, 5, 8, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 36, -2.5F, 0.0F, -0.35F, 5, 2, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.9746F, -0.1903F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 13, -2.5F, -1.0245F, 0.0284F, 5, 1, 8, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.0F, 2.9746F, 3.3097F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.3054F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.0F, 0.0F, 0.5F);
        this.backrightfin.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 13, -3.4F, 0.0F, -2.2F, 8, 0, 6, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.0F, 2.9746F, 3.3097F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.3054F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.0F, 0.0F, 0.5F);
        this.backleftfin.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 13, -4.6F, 0.0F, -2.2F, 8, 0, 6, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.2496F, 7.2097F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 47, 47, -2.0F, -2.0F, -1.0F, 4, 4, 7, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 58, -1.0F, -1.5F, -1.0F, 2, 3, 8, -0.02F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.75F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -7.5F, 0.0F, 0, 17, 12, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-3.9674F, -5.95F, -8.5817F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.4363F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0326F, 0.725F, 7.0817F);
        this.frontrightfin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 0, -0.95F, -0.725F, -4.0F, 1, 0, 9, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.0326F, 0.225F, 3.5817F);
        this.frontrightfin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3054F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -8.575F, -0.25F, -3.75F, 10, 0, 7, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(3.9674F, -5.95F, -8.5817F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.4363F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0326F, 0.725F, 7.0817F);
        this.frontleftfin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 0, -0.05F, -0.725F, -4.0F, 1, 0, 9, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0326F, 0.225F, 3.5817F);
        this.frontleftfin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -1.425F, -0.25F, -3.75F, 10, 0, 7, 0.0F, true));

        this.anvil = new AdvancedModelRenderer(this);
        this.anvil.setRotationPoint(0.0F, -13.0F, -10.5F);
        this.main.addChild(anvil);
        this.anvil.cubeList.add(new ModelBox(anvil, 47, 37, -2.5F, -2.125F, -0.5F, 5, 2, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, -1.625F, 1.0F);
        this.anvil.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.48F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 3.6F, 0.9F, 2.9F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, -0.4F, 0.9F, 2.9F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 0.6F, 0.525F, 2.125F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 2.6F, 0.525F, 2.125F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 1.6F, 0.9F, 2.9F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 3.6F, 0.025F, 1.125F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, -0.4F, 0.025F, 1.125F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 1.6F, 0.025F, 1.125F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 1.6F, -0.825F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 3.6F, -0.825F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 2.6F, -0.55F, 0.025F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 0.6F, -0.55F, 0.025F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, -0.4F, -0.825F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.anvil.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6545F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 62, -1.5F, -2.075F, -0.25F, 3, 5, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 58, -1.5F, -2.275F, 1.75F, 3, 5, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -4.5F, -9.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 48, -3.0F, -7.0F, -11.0F, 5, 4, 6, 0.0015F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.5F, -3.5F, -12.5F, 0, 1, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 1.5F, -3.5F, -12.5F, 0, 1, 7, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 59, 60, -3.0F, -5.0F, -12.925F, 5, 2, 2, -0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.175F, -4.25F, -10.25F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2182F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.725F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.175F, -4.25F, -10.25F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2182F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -0.275F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.05F, -4.25F, -10.25F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2138F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 7, -0.7F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.05F, -4.25F, -10.25F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.2138F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 7, -0.3F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -7.0F, -11.0F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.7199F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 36, -3.0F, 0.0F, -3.0F, 5, 2, 3, -0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -5.0F, -13.25F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1614F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 62, 45, -2.5F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.0F, -4.5F, -5.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.144F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 58, 9, -1.0F, -1.5F, -7.0F, 1, 3, 7, 0.002F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-4.0F, -4.5F, -5.0F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.144F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 9, 0.0F, -1.5F, -7.0F, 1, 3, 7, 0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -2.9092F, -5.0309F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 22, -2.5F, -0.0908F, -4.9691F, 5, 2, 5, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 55, 22, -2.5F, -0.0908F, -7.8191F, 5, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 1, -2.025F, -0.5908F, -7.8191F, 0, 1, 7, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 1, 2.025F, -0.5908F, -7.8191F, 0, 1, 7, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 1.9092F, -4.9691F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3447F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 45, 58, -3.0F, -1.0F, -3.0F, 5, 1, 3, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.5F, 0.9092F, 0.0309F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.2007F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 35, 14, -1.0F, -1.0F, -5.0F, 1, 2, 5, -0.002F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-3.5F, 0.9092F, 0.0309F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.2007F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 35, 14, 0.0F, -1.0F, -5.0F, 1, 2, 5, -0.002F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 2.9092F, 5.0309F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1134F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 58, -2.0F, -1.0F, -10.0F, 4, 1, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.jaw.rotateAngleX = 0.65f;
        this.main.offsetY = -0.195F;
        this.body.scaleChildren = true;
        this.body.setScale(0,0,0);
        this.main.render(0.01F);
        this.body.setScale(1,1,1);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -(float)Math.toRadians(7.5), 0.0F, 0.0F);
        this.setRotateAngle(body, -0, (float)Math.toRadians(5), 0.0F);
        this.setRotateAngle(tail, -0, (float)Math.toRadians(7.5), 0.0F);
        this.setRotateAngle(tail2, -0, (float)Math.toRadians(12.5), 0.0F);
        this.setRotateAngle(tail3, -0, (float)Math.toRadians(10), 0.0F);
        this.setRotateAngle(tail4, -0, (float)Math.toRadians(22.5), 0.0F);
        this.setRotateAngle(jaw, (float)Math.toRadians(12.5), 0, 0.0F);
        this.main.offsetY = -0.32F;
        this.main.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.7F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body, -0, (float)Math.toRadians(5), 0.0F);
        this.setRotateAngle(tail, -0, (float)Math.toRadians(7.5), 0.0F);
        this.setRotateAngle(tail2, -0, (float)Math.toRadians(12.5), 0.0F);
        this.setRotateAngle(tail3, -0, (float)Math.toRadians(10), 0.0F);
        this.setRotateAngle(tail4, -0, (float)Math.toRadians(22.5), 0.0F);
        this.setRotateAngle(jaw, (float)Math.toRadians(12.5), 0, 0.0F);
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

        AdvancedModelRenderer[] fishTail = {this.body, this.tail2, this.tail3, this.tail4};
        ((EntityPrehistoricFloraStethacanthus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.2F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 0.6F);
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.walk(frontleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 0.5F);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 0.5F);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 0.5F);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 0.5F);
            this.walk(backleftfin, (float) (speed * 0.75), 0.1F, true, 1, 0, f2, 0.5F);
            this.walk(backrightfin, (float) (speed * 0.75), 0.1F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.3F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }
}