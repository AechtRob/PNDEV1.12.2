package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTemnodontosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelTemnodontosaurus extends ModelBasePalaeopedia {


    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer backrightflipper;
    private final AdvancedModelRenderer backleftflipper;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer frontrightflipper;
    private final AdvancedModelRenderer frontleftflipper;
    public ModelTemnodontosaurus() {
        this.textureWidth = 150;
        this.textureHeight = 135;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 9.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 25, -6.5F, -16.0F, -2.0F, 13, 16, 13, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -7.5F, -13.0F, -16.0F, 15, 11, 14, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -15.9902F, -4.0149F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0829F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 40, -6.5F, 0.2641F, -11.9584F, 13, 3, 14, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 11, -6.5F, -3.8F, -7.975F, 13, 3, 14, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -10.6661F, 7.7402F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 22, 57, -5.0F, -3.0839F, 3.2598F, 10, 13, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 28, -4.0F, -5.0839F, 3.2598F, 8, 2, 10, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 39, 17, 0.0F, -13.0839F, 3.2598F, 0, 8, 11, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 10.6661F, 0.2598F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 0, -4.5F, -1.075F, 3.0F, 9, 1, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.4375F, 13.0905F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 62, 57, -4.0F, -4.5214F, -0.8308F, 8, 10, 11, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.5214F, 0.1692F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1004F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 78, -3.5F, 0.0F, 0.0F, 7, 2, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 8.4786F, 0.1692F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 80, -3.5F, -3.0F, 0.0F, 7, 3, 10, 0.0F, false));

        this.backrightflipper = new AdvancedModelRenderer(this);
        this.backrightflipper.setRotationPoint(-3.5F, 5.4786F, 3.6692F);
        this.body2.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.0F, 0.0F, 1.4399F);
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 44, 0, -0.5F, 0.0F, -1.5F, 1, 6, 3, 0.0F, false));
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 104, 59, 0.0F, 0.0F, -1.5F, 0, 17, 7, 0.0F, false));

        this.backleftflipper = new AdvancedModelRenderer(this);
        this.backleftflipper.setRotationPoint(3.5F, 5.4786F, 3.6692F);
        this.body2.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.0F, 0.0F, -1.4399F);
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 44, 0, -0.5F, 0.0F, -1.5F, 1, 6, 3, 0.0F, true));
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 104, 59, 0.0F, 0.0F, -1.5F, 0, 17, 7, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.5372F, 10.277F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 90, 20, -3.0F, -3.9843F, -1.1078F, 6, 8, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 6.0157F, -0.1078F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1833F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 108, 107, -2.5F, -2.1F, -0.825F, 5, 2, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.9843F, -0.1078F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 118, 64, -2.5F, 0.0F, 0.0F, 5, 1, 7, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.0026F, 6.8743F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 64, 101, -2.5F, -2.9817F, -0.9821F, 5, 6, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.5183F, 3.0179F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 109, 117, -2.0F, -1.5F, -4.0F, 4, 2, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.2317F, 0.0179F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0611F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 118, -2.0F, 0.0F, -0.9F, 4, 2, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5101F, 7.0951F);
        this.body4.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 90, 101, -2.0F, -2.4715F, -1.0772F, 4, 5, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.2785F, -3.0772F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1353F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 115, -1.5F, -2.125F, 2.0F, 3, 2, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.4715F, -3.0772F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 117, -1.5F, 0.0F, 2.0F, 3, 1, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.75F, 0.0285F, 7.6728F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 88, -0.25F, -1.5F, -0.75F, 2, 3, 12, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 106, -1.25F, -0.5F, 0.25F, 1, 1, 11, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 106, 1.75F, -0.5F, 0.25F, 1, 1, 11, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.75F, -0.3922F, 10.547F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 43, 0.0F, -20.5328F, -1.672F, 0, 42, 11, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 10.2378F, 1.5309F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 25, -0.5F, 5.9883F, -0.0024F, 1, 6, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 54, -0.5F, -0.0117F, -0.0024F, 1, 6, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.8922F, 1.203F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 25, -0.5F, -1.0F, -2.5F, 1, 10, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -8.5924F, -14.6976F);
        this.main.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 78, 40, -6.0F, -3.4076F, -6.3024F, 12, 9, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 8.5924F, 6.6976F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 107, 36, -4.5F, -3.225F, -12.975F, 9, 3, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -7.4076F, 6.6976F);
        this.neck.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1484F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 110, 15, -4.5F, 0.1F, -13.0F, 9, 3, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.3125F, 0.0651F, -6.0222F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 7, 0, -3.4375F, -1.4727F, -6.7803F, 1, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -3.4625F, -0.9727F, -6.2803F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 3.0875F, -0.9727F, -6.2803F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 7, 0, 3.0625F, -1.4727F, -6.7803F, 1, 2, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 84, 0, -3.1875F, -3.4727F, -9.2803F, 7, 5, 9, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 107, 95, -1.6875F, -0.4727F, -18.2803F, 4, 2, 9, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 39, 26, -1.4375F, 1.5273F, -18.2803F, 0, 1, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 103, 83, -0.6875F, 0.5273F, -29.2803F, 2, 1, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 39, 25, -0.4375F, 1.5273F, -29.2803F, 0, 1, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 39, 26, 2.0625F, 1.5273F, -18.2803F, 0, 1, 11, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 39, 25, 1.0625F, 1.5273F, -29.2803F, 0, 1, 11, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.1875F, -5.4727F, -0.2803F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2225F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 89, 54, -2.5F, 0.2F, -9.075F, 6, 2, 10, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.3125F, -0.9727F, -21.7803F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0654F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 103, -0.5F, -0.225F, -7.625F, 1, 2, 12, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.3125F, -3.4727F, -9.2803F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1571F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 104, -1.5F, 0.275F, -9.35F, 3, 3, 10, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.3125F, 1.534F, -0.3601F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 85, 115, -2.5F, -4.0067F, -6.9201F, 5, 4, 7, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 80, 90, -3.5F, -0.0067F, -8.9201F, 7, 2, 9, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 111, 45, -2.0F, -0.0067F, -17.9201F, 4, 1, 9, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 26, -1.75F, -1.0067F, -17.9201F, 0, 1, 11, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 105, 3, -1.0F, -0.0067F, -28.9201F, 2, 1, 11, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 25, -0.75F, -1.0067F, -28.9201F, 0, 1, 11, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 26, 1.75F, -1.0067F, -17.9201F, 0, 1, 11, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 25, 0.75F, -1.0067F, -28.9201F, 0, 1, 11, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 3.9933F, 0.0799F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1396F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 93, -2.5F, -2.0F, -9.0F, 6, 2, 9, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.9933F, -17.9201F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0785F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 106, -0.5F, -1.125F, -10.675F, 1, 1, 11, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.4933F, -13.4201F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 111, 55, -2.0F, -1.225F, -3.225F, 4, 1, 8, -0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 118, 23, -1.5F, -0.225F, -4.225F, 3, 1, 9, 0.01F, false));

        this.frontrightflipper = new AdvancedModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-4.5F, -3.0F, -14.5F);
        this.main.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.0F, 0.0F, 1.309F);
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 0, 0, -0.5F, 0.0F, -2.0F, 1, 7, 5, 0.0F, false));
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 62, 69, 0.0F, 0.0F, -2.0F, 0, 22, 9, 0.0F, false));

        this.frontleftflipper = new AdvancedModelRenderer(this);
        this.frontleftflipper.setRotationPoint(4.5F, -3.0F, -14.5F);
        this.main.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.0F, 0.0F, -1.309F);
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 0, 0, -0.5F, 0.0F, -2.0F, 1, 7, 5, 0.0F, true));
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 62, 69, 0.0F, 0.0F, -2.0F, 0, 22, 9, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(neck, -0.0F, 0.0F, -0.25F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.neck.offsetY = 0.08F;
        this.neck.offsetX = -0.0F;
        this.neck.offsetZ = 0.1F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.1F, 0.3F, 0.0F);
        this.setRotateAngle(body, -0.05F, 0.1F, 0.03F);
        this.setRotateAngle(body2, -0.05F, 0.12F, 0.04F);
        this.setRotateAngle(body3, -0.05F, 0.13F, 0.05F);
        this.setRotateAngle(body4, 0.0F, -0.14F, 0.06F);
        this.setRotateAngle(tail, 0.05F, -0.15F, 0.07F);
        this.setRotateAngle(tail2, 0.15F, -0.16F, 0.0F);
        this.setRotateAngle(tail3, 0.17F, -0.17F, 0.0F);
        this.setRotateAngle(neck, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(body, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.03F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.04F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.22F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.main.offsetY = 0.09F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.main.offsetY = 0.15F;
        //this.main.offsetZ = -1F;

       AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4, this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] upperBody = {this.neck, this.head};
        ((EntityPrehistoricFloraTemnodontosaurus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.15F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.5F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.18F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.25F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(upperBody, speed * still, 0.15F, 0, f2, 0.5F *still);
            this.flap(frontleftflipper, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
            this.swing(frontleftflipper, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
            this.walk(frontleftflipper, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

            this.flap(frontrightflipper, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
            this.swing(frontrightflipper, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
            this.walk(frontrightflipper, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

            this.flap(backleftflipper, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
            this.swing(backleftflipper, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
            this.walk(backleftflipper, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

            this.flap(backrightflipper, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
            this.swing(backrightflipper, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
            this.walk(backrightflipper, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        }
        else {
            //Dont swing if on land - it loooks dumb
            //this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(frontleftflipper, (float) (speed * 0.65), 0.05F, false, 0.8F, 0, f2, 0.5F);
            this.swing(frontleftflipper, (float) (speed * 0.65), 0.05F, true, 0, 0, f2, 0.5F);
            this.walk(frontleftflipper, (float) (speed * 0.65), 0.05F, true, 0, 0, f2, 0.5F);

            this.flap(frontrightflipper, (float) (speed * 0.65), 0.05F, true, 0.8F, 0, f2, 0.5F);
            this.swing(frontrightflipper, (float) (speed * 0.65), 0.05F, false, 0, 0, f2, 0.5F);
            this.walk(frontrightflipper, (float) (speed * 0.65), 0.05F, true, 0, 0, f2, 0.5F);

            this.flap(backleftflipper, (float) (speed * 0.65), 0.05F, false, 1.8F, 0, f2, 0.5F);
            this.swing(backleftflipper, (float) (speed * 0.65), 0.05F, true, 1, 0, f2, 0.5F);
            this.walk(backleftflipper, (float) (speed * 0.65), 0.05F, true, 1, 0, f2, 0.5F);

            this.flap(backrightflipper, (float) (speed * 0.65), 0.05F, true, 1.8F, 0, f2, 0.5F);
            this.swing(backrightflipper, (float) (speed * 0.65), 0.05F, false, 1, 0, f2, 0.5F);
            this.walk(backrightflipper, (float) (speed * 0.65), 0.05F, true, 1, 0, f2, 0.5F);
        }


        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = -0.05F;
            this.bob(main, -speed * 1.8F, 0.02F, false, f2, 1);
            this.walk(jaw, (float) (speed * 1.8F), 0.15F, false, 1, 0, f2, 0);
            this.chainWave(fishTail, speed * 1.5F, 0.0025F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.01F, -0.25, f2, 0.2F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

