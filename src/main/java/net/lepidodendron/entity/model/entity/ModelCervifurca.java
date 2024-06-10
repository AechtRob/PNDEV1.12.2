package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCervifurca extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftpelvic;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightpelvic;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftpectoral;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightpectoral;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail5;

    public ModelCervifurca() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 27.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, 5.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 8, -4.0F, -1.0F, -6.2F, 8, 4, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -3.5F, -2.3F, -0.4F, 7, 5, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 25, -3.0F, 2.4F, -0.4F, 6, 1, 6, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -6.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 13, -3.0F, 0.0F, -0.1F, 6, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 2.7F, -6.2F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 8, -4.0F, -1.0F, 3.0F, 7, 1, 3, 0.0F, false));

        this.leftpelvic = new AdvancedModelRenderer(this);
        this.leftpelvic.setRotationPoint(3.1F, 2.9F, 4.4F);
        this.body.addChild(leftpelvic);
        this.setRotateAngle(leftpelvic, 0.0932F, -0.9156F, 0.6248F);
        this.leftpelvic.cubeList.add(new ModelBox(leftpelvic, 51, 33, -0.7123F, -0.6F, -0.6779F, 3, 1, 1, 0.0F, false));
        this.leftpelvic.cubeList.add(new ModelBox(leftpelvic, 40, 25, -0.7123F, -0.1F, -2.6779F, 5, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(8.1509F, -0.1F, 6.1298F);
        this.leftpelvic.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 15, -0.1415F, -0.5F, -0.3811F, 5, 1, 1, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, 0.0F, 0.5F);
        this.leftpelvic.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6283F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 22, -1.2F, -0.6F, -0.5F, 11, 1, 1, 0.002F, false));

        this.rightpelvic = new AdvancedModelRenderer(this);
        this.rightpelvic.setRotationPoint(-3.1F, 2.9F, 4.4F);
        this.body.addChild(rightpelvic);
        this.setRotateAngle(rightpelvic, 0.0932F, 0.9156F, -0.6248F);
        this.rightpelvic.cubeList.add(new ModelBox(rightpelvic, 51, 33, -2.2877F, -0.6F, -0.6779F, 3, 1, 1, 0.0F, true));
        this.rightpelvic.cubeList.add(new ModelBox(rightpelvic, 40, 25, -4.2877F, -0.1F, -2.6779F, 5, 0, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-8.1509F, -0.1F, 6.1298F);
        this.rightpelvic.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 15, -4.8585F, -0.5F, -0.3811F, 5, 1, 1, -0.002F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.2F, 0.0F, 0.5F);
        this.rightpelvic.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6283F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 22, -9.8F, -0.6F, -0.5F, 11, 1, 1, 0.002F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 1.0F, -7.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 44, 46, -2.5F, -1.0F, -3.0F, 4, 1, 2, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 29, -2.5F, -0.4F, -3.0F, 4, 1, 2, -0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 37, 5, -2.0F, -0.6F, -4.0F, 3, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 33, -3.5F, -1.0F, -1.2F, 6, 3, 2, 0.015F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.7F, -3.7F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 40, -2.0F, -1.0271F, -0.0342F, 3, 1, 1, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.3F, -5.6F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 39, -1.5F, -0.9293F, 0.005F, 2, 1, 1, -0.004F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 51, -2.0F, -0.9293F, 0.905F, 3, 1, 1, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0F, -1.2F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4276F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 39, -3.0F, -0.1F, -0.6F, 5, 1, 3, 0.015F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.8F, -5.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2269F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 44, -1.5F, -0.0249F, -0.9902F, 2, 1, 1, 0.002F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 50, -2.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.8F, 0.6F, -2.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, -0.4014F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -0.198F, -2.8361F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.8F, 0.6F, -2.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1222F, -0.4014F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 8, 0.0F, -0.9F, -2.0F, 0, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.8F, 0.6F, -2.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.4014F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, -0.198F, -2.8361F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.8F, 0.6F, -2.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1222F, 0.4014F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 8, 0.0F, -0.9F, -2.0F, 0, 1, 2, 0.0F, false));

        this.leftpectoral = new AdvancedModelRenderer(this);
        this.leftpectoral.setRotationPoint(2.5F, -1.0F, -1.2F);
        this.head.addChild(leftpectoral);
        this.setRotateAngle(leftpectoral, 0.0F, 0.2618F, -0.48F);
        this.leftpectoral.cubeList.add(new ModelBox(leftpectoral, 17, 33, -1.531F, -0.2625F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.4F, 0.4F, 0.0F);
        this.leftpectoral.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.2182F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 3, 0.069F, -0.1625F, -0.4F, 9, 0, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 0, 0.069F, -0.6625F, 0.0F, 9, 1, 1, 0.002F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -1.931F, -0.1625F, 0.0F, 11, 0, 7, 0.0F, false));

        this.rightpectoral = new AdvancedModelRenderer(this);
        this.rightpectoral.setRotationPoint(-3.5F, -1.0F, -1.2F);
        this.head.addChild(rightpectoral);
        this.setRotateAngle(rightpectoral, 0.0F, -0.2618F, 0.48F);
        this.rightpectoral.cubeList.add(new ModelBox(rightpectoral, 17, 33, -2.469F, -0.2625F, 0.0F, 4, 1, 4, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.4F, 0.4F, 0.0F);
        this.rightpectoral.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.2182F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 3, -9.069F, -0.1625F, -0.4F, 9, 0, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 0, -9.069F, -0.6625F, 0.0F, 9, 1, 1, 0.002F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -9.069F, -0.1625F, 0.0F, 11, 0, 7, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6F, -1.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 50, 7, -2.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 13, 31, -1.5F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 19, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 39, -2.0F, -1.0F, 0.0F, 3, 1, 2, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.7F, 0.2F, -1.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3665F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.7F, 0.2F, -1.0F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3665F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.0F, 10.6F);
        this.root.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 31, -2.0F, -2.17F, -1.0F, 4, 4, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4538F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 39, -1.5F, -2.0F, 0.0F, 3, 2, 4, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tail.addChild(tail2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 46, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0524F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 18, -1.0F, -1.1F, -1.0F, 2, 2, 4, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 44, -1.0F, -1.0F, -1.0F, 2, 2, 4, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.4F, 0.0F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1222F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 48, 2, -1.0F, -0.9F, 0.0F, 2, 1, 3, -0.005F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 58, 42, 0.0F, -2.9F, 0.0F, 0, 3, 3, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 8, -0.5F, -0.3F, -1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.3F, 4.0F);
        this.tail4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 37, 46, -0.5F, 0.0F, -4.1F, 1, 1, 4, -0.002F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.6F, 4.0F);
        this.tail4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1047F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 39, -0.5F, -0.9F, -5.0F, 1, 1, 5, -0.004F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 4.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 51, -0.5F, -0.9F, 0.0F, 1, 2, 2, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 40, 0.0F, -2.9F, 0.0F, 0, 6, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(180);
        this.setRotateAngle(root, -1.5F, 3.15F, 0.0F);
        this.root.offsetY = -0.35F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = -0.19F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.25F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.3F, 0.0F);
        this.root.offsetY = -0.2F;
        this.root.render(0.01F);
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
        //this.root.offsetY = 1.2F;

        AdvancedModelRenderer[] finLeft = {this.leftpectoral};
        AdvancedModelRenderer[] finRight = {this.rightpectoral};
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 1.2F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            if (f3 != 0 || !(e.isInWater())) {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
                this.swing(root, speed, 0.1F, true, 0, 0, f2, 1);
            }

            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(leftpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(leftpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finLeft, speed, -0.30F, -0.8, f2, 1);

            this.walk(rightpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(rightpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finRight, speed, 0.30F, 0.8, f2, 1);

            this.walk(leftpelvic, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(leftpelvic, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(leftpelvic, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(rightpelvic, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(rightpelvic, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
            this.flap(rightpelvic, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

            if (!e.isInWater()) {
                //this.root.rotateAngleZ = (float) Math.toRadians(90);
                this.root.offsetY = 0.07F;
                this.bob(root, -speed, 2F, false, f2, 1);
            }
        }
    }
}
