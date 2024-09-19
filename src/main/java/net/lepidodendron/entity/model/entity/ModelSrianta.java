package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSrianta extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    public ModelSrianta() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -7.0F, -7.0F, 5, 7, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -7.0F, -4.8F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.0F, -5.8F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -0.5F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.2F, -1.8F, -6.25F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.4995F, -0.6925F, 0.8636F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 27, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 1.0F, -0.75F);
        this.frontrightfin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 45, -1.0F, 0.0F, -0.75F, 0, 5, 4, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.2F, -1.8F, -6.25F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.4995F, 0.6925F, -0.8636F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 27, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 1.0F, -0.75F);
        this.frontleftfin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 45, 1.0F, 0.0F, -0.75F, 0, 5, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 33, 19, -1.5F, 0.9309F, -11.8831F, 3, 4, 5, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 5.9309F, -6.9831F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0916F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 38, -1.5F, -1.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 2.4809F, -11.9831F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3709F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 37, -0.9947F, -1.0F, -0.951F, 1, 2, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 2.4809F, -11.9831F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3709F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 37, -0.0053F, -1.0F, -0.951F, 1, 2, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.65F, 2.6809F, -6.7331F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1963F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 38, -1.0F, -1.0F, -5.05F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, 2.9309F, -6.9831F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1963F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 9, -1.0F, -2.0F, -5.05F, 1, 4, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.65F, 2.6809F, -6.7331F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1963F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 38, 0.0F, -1.0F, -5.05F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.5F, 2.9309F, -6.9831F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1963F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 9, 0.0F, -2.0F, -5.05F, 1, 4, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 3.775F, -12.65F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -2.1817F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 9, -0.5F, -0.9836F, -1.9823F, 2, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 3.475F, -13.625F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 29, -0.5F, -2.0117F, -0.0026F, 2, 2, 1, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.25F, -13.4F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.0036F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 37, -0.5F, -0.006F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -0.475F, -10.95F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6109F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 19, -1.5F, 0.0F, -3.0F, 2, 2, 3, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.65F, -0.425F, -10.95F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.616F, 0.1528F, 0.0864F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 6, -1.0F, 0.0F, -3.0F, 1, 2, 3, -0.001F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.35F, -0.95F, -7.025F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1329F, 0.173F, 0.023F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 25, -1.0F, 0.0F, -4.0F, 1, 2, 4, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.65F, -0.425F, -10.95F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.616F, -0.1528F, -0.0864F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 6, 0.0F, 0.0F, -3.0F, 1, 2, 3, -0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.35F, -0.95F, -7.025F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1329F, -0.173F, -0.023F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 25, 0.0F, 0.0F, -4.0F, 1, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 13, 43, -1.5F, 0.0F, -4.0F, 3, 2, 4, -0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.2906F, -11.9228F);
        this.head.addChild(jaw);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.2258F, 0.6405F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 19, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.1758F, 0.2405F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.6109F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 0, -1.0F, 0.0F, -3.0F, 2, 1, 3, -0.002F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.5F, -0.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -2.0F, -2.5F, 0.0F, 4, 5, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -3.475F, 0.2F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 35, -2.0F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 3.5F, 0.3F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1614F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 0, -2.0F, -2.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.0F, 2.5F, 3.8F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 1.0935F, -0.3886F, 0.3685F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 26, 35, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 48, -0.5F, 1.25F, -1.25F, 0, 4, 3, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.0F, 2.5F, 3.8F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 1.0935F, 0.3886F, -0.3685F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 26, 35, 0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 48, 0.5F, 1.25F, -1.25F, 0, 4, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 8, -1.5F, -1.5F, 0.0F, 3, 3, 7, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -3.5F, -0.1F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 37, 0.0F, -3.0F, 1.0F, 0, 4, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -2.5F, 0.2F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1309F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 27, -1.0F, 0.0F, 0.0F, 2, 2, 7, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 2.75F, 0.45F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2138F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 35, 29, -1.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 40, -1.0F, -1.5F, 0.0F, 2, 2, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.4F, 2.65F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5672F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 15, 0.0F, 0.0149F, -0.795F, 0, 3, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 1.5F, 0.1F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 0, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.5F, 5.0F);
        this.tail3.addChild(tail4);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 2.0F, 0.0F);
        this.tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.7418F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 45, 0, 0.0F, -1.0F, 0.0F, 1, 1, 4, -0.001F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.tail4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.5236F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 13, 19, 1.0F, 0.0F, 0.0F, 0, 5, 8, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 25, 0.5F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(main, 0.0F, 1.58F, 0.0F);
        this.main.offsetZ = -0.285F;
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.03F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.2F, -0.2F, 0.2F);
        this.setRotateAngle(tail4, 0.2F, -0.4F, 0.2F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.1F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0.05F;
        this.main.rotateAngleY = (float)Math.toRadians(245);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, -0.2F, 3.8F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.2F, -0.2F, 0.2F);
        this.setRotateAngle(tail4, 0.2F, -0.4F, 0.2F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(main, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0, f2, 1);

            this.flap(backrightfin, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(backleftfin, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            //this.flap(dorsalfinR, speed * 0.8F, 0.25F, false, 0F, -0.1F, f2, 1F);
            //this.flap(dorsalfinL, speed * 0.8F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.flap(frontrightfin, speed * 0.8F, -0.5F, false, 0F, -0.2F, f2, 1F);
            this.flap(frontleftfin, speed * 0.8F, 0.5F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -.30F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
