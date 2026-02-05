package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBrindabellaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail4;
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
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r34;

    public ModelBrindabellaspis() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 18.8363F, 4.469F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -0.1363F, -4.469F, 5, 5, 6, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.7613F, 1.981F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 15, 0.0F, -0.45F, -4.45F, 0, 3, 7, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.1082F, 3.9506F, -3.719F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -1.3526F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.0185F, 0.0175F, 0.1521F);
        this.frontleftfin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 29, 0.0F, -0.5F, -1.5F, 0, 5, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.1082F, 3.9506F, -3.719F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 1.3526F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0185F, 0.0175F, 0.1521F);
        this.frontrightfin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, 0.0F, -0.5F, -1.5F, 0, 5, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.3746F, 1.108F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 11, 24, -2.0F, -1.5109F, -0.077F, 4, 3, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.5109F, 1.923F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 27, -1.5F, 0.5F, -2.075F, 3, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.4891F, 1.923F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 27, -1.5F, -1.45F, -2.0F, 3, 1, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.4893F, 2.0537F, 0.3891F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.3927F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0586F, -0.2435F, 1.0339F);
        this.backleftfin.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.49F, 0.1925F, -0.8244F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 12, 0.0F, -0.4F, -1.0F, 0, 3, 2, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.4893F, 2.0537F, 0.3891F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.3927F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0586F, -0.2435F, 1.0339F);
        this.backrightfin.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.49F, -0.1925F, 0.8244F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 12, 0.0F, -0.4F, -1.0F, 0, 3, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.3181F, 4.9824F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 20, -1.5F, -0.8928F, -1.0594F, 3, 2, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.8072F, -0.0594F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 7, -1.0F, -1.025F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6428F, 0.9406F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 33, -1.0F, -0.475F, -1.05F, 2, 1, 3, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.021F, 2.8826F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 37, -1.0F, -0.9138F, 0.058F, 2, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.5862F, 1.558F);
        this.tail3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 33, -0.5F, -0.9F, -1.55F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.6638F, -1.942F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 33, -0.5F, -0.475F, 1.95F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2996F, 2.8504F);
        this.tail3.addChild(tail4);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.8718F, 7.8655F);
        this.tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 37, -0.5F, -0.5278F, -0.5893F, 1, 1, 3, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.1142F, 0.2076F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, 0.4F, -0.525F, 0, 3, 11, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 6, -0.5F, -0.6F, -0.25F, 1, 1, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.4639F, 1.9321F, -12.9753F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 17, 17, -2.9639F, -1.0184F, 2.5063F, 5, 2, 5, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 14, -2.4639F, 0.9316F, 4.0313F, 4, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 17, -0.9639F, -0.7684F, -4.1332F, 1, 1, 1, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.5389F, -0.5684F, 2.0063F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, -0.3054F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 15, -0.5F, -0.5F, -0.7F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.9639F, -0.2684F, 2.6063F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.1614F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 1, 39, 0.0F, -0.5F, -2.1F, 1, 1, 2, 0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.4987F, -0.2784F, 0.5855F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.4363F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.15F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0095F, -0.2684F, -4.107F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1134F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 38, -0.5F, -0.5F, 0.55F, 1, 1, 3, 0.001F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5685F, -0.2684F, -3.6172F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -1.0734F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 43, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.003F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.6111F, -0.5684F, 2.0063F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.3054F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 15, -0.5F, -0.5F, -0.7F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.4639F, -2.0473F, 6.2805F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4058F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 25, 7, -1.5F, 0.0F, -0.5F, 3, 2, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.6407F, -0.2684F, -3.6172F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 1.0734F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 43, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.004F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0817F, -0.2684F, -4.107F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1134F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 38, -0.5F, -0.5F, 0.55F, 1, 1, 3, 0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5708F, -0.2784F, 0.5855F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.4363F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -0.85F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.4639F, -0.7691F, 0.3586F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0044F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 35, 26, -1.0F, -0.0243F, -3.4917F, 2, 1, 4, 0.009F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.4639F, -0.5184F, 5.0063F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 14, -2.0F, -1.25F, -4.5F, 4, 1, 7, 0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.4639F, 0.4816F, 1.5063F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3229F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 11, 32, -1.5F, -0.55F, -2.175F, 3, 1, 5, 0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.4639F, 0.9816F, 9.0063F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2618F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 0, -2.0F, 1.575F, -4.5F, 4, 1, 2, 0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-3.243F, 2.2763F, 7.129F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.091F, -0.6536F, 0.0368F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 43, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.9639F, 0.8958F, 6.8311F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.091F, -0.6536F, 0.0368F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 45, 33, 0.5F, 0.85F, 0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.3152F, 2.2763F, 7.129F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.091F, 0.6536F, -0.0368F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 43, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(2.0361F, 0.8958F, 6.8311F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.091F, 0.6536F, -0.0368F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 45, 33, -1.5F, 0.85F, 0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.4639F, 0.8958F, 7.5311F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.048F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 25, 0, -2.5F, -2.0F, -1.5F, 5, 4, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.0361F, -0.2684F, 2.6063F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.1614F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 1, 39, -1.0F, -0.5F, -2.1F, 1, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.4639F, 1.9816F, 4.0063F);
        this.head.addChild(jaw);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3491F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 27, 33, -1.0F, -0.7F, -3.85F, 2, 1, 4, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.22F;
        this.main.offsetX = -0.1F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.1309F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -1.3526F);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 1.3526F);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.134F, 0.2163F, 0.0289F);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(cube_r6, 0.49F, 0.1925F, -0.8244F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.3927F);
        this.setRotateAngle(cube_r7, 0.49F, -0.1925F, 0.8244F);
        this.setRotateAngle(tail2, 0.3124F, 0.2079F, 0.0666F);
        this.setRotateAngle(cube_r8, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.245F, -0.4317F, -0.0774F);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, -0.2123F, -0.3863F, -0.0528F);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, -0.5061F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, 0.5061F, 0.0F);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.048F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0F, -0.1614F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0F, 0.1614F, 0.0F);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
        this.main.offsetY = -0.3F;
        this.main.offsetX = -0.1F;
        this.main.offsetZ = 0.02F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.1F;
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -1.3526F);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 1.3526F);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.134F, 0.2163F, 0.0289F);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(cube_r6, 0.49F, 0.1925F, -0.8244F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.3927F);
        this.setRotateAngle(cube_r7, 0.49F, -0.1925F, 0.8244F);
        this.setRotateAngle(tail2, 0.3124F, 0.2079F, 0.0666F);
        this.setRotateAngle(cube_r8, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.245F, -0.4317F, -0.0774F);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, -0.2123F, -0.3863F, -0.0528F);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, -0.5061F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, 0.5061F, 0.0F);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.048F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0F, -0.1614F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0F, 0.1614F, 0.0F);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.walk(jaw, (float) (speed * 0.75), 0.2F, false, 0, 0.2F, f2, 1);
            this.walk(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.3F;
            }
                this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.25F, -2, f2, 1);
                this.swing(main, speed, 0.1F, true, 0, 0, f2, 1);
            }

    }
}
