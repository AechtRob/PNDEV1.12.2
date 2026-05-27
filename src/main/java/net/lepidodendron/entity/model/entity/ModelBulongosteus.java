package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBulongosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;


    private ModelAnimator animator;

    public ModelBulongosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.4849F, 3.0002F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 41, -1.5F, -2.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.25F, -3.45F, -1.075F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1091F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 30, -0.5F, -2.0F, -3.0F, 1, 5, 4, 0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.8559F, -3.45F, -0.1354F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0829F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 0, 0.0F, -2.0F, 0.0F, 1, 5, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.8559F, -3.45F, -0.1354F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0829F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 0, -1.0F, -2.0F, 0.0F, 1, 5, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.25F, -3.45F, -1.075F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1091F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 30, -0.5F, -2.0F, -3.0F, 1, 5, 4, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, -1.0F, -2.15F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 25, 0.0F, -0.2F, 0.3F, 4, 1, 5, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -6.4358F, 2.981F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 22, -1.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -6.0F, -2.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 15, -1.0F, 0.0F, 0.0F, 5, 1, 5, 0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-1.5F, -6.0F, -2.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 19, 31, -0.5F, 2.858F, -3.5654F, 4, 3, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.2847F, 3.8778F, -5.3798F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6054F, -0.1765F, 0.029F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 32, 0.125F, -1.075F, 0.25F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.725F, 3.04F, -5.8216F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.2744F, -0.0661F, -0.038F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 47, 49, -0.35F, 0.075F, -0.65F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.7153F, 3.8778F, -5.3798F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6054F, 0.1765F, -0.029F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 32, -0.125F, -1.075F, 0.25F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.275F, 3.5952F, -5.0445F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.8236F, -0.1765F, 0.029F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 46, 0.0F, -4.0F, -0.075F, 1, 4, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.275F, 3.5952F, -5.0445F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.8236F, 0.1765F, -0.029F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 46, -1.0F, -4.0F, -0.075F, 1, 4, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.275F, 3.04F, -5.8216F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.2744F, 0.0661F, 0.038F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 47, 49, -0.65F, 0.075F, -0.65F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.725F, 3.04F, -5.8216F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7044F, -0.1495F, -0.0122F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 46, -0.875F, 0.0F, 0.125F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.275F, 3.04F, -5.8216F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7044F, 0.1495F, 0.0122F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 35, 46, -0.125F, 0.0F, 0.125F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 3.04F, -5.8216F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 46, -1.0F, -1.0F, 0.0F, 3, 1, 3, -0.006F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 1.0419F, -5.9089F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 0, -1.0F, 0.0F, 0.0F, 3, 2, 1, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 40, -1.0F, 0.0F, -6.0F, 3, 2, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 9, -1.5F, 0.0F, -3.0F, 4, 1, 3, 0.003F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(3.0379F, 2.3872F, -4.1554F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0193F, 0.2173F, -0.1724F);
        this.eye.cubeList.add(new ModelBox(eye, 49, 4, -0.5375F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 42, 49, -0.4625F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.0379F, 2.3872F, -4.1554F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.0193F, -0.2173F, 0.1724F);
        this.eye2.cubeList.add(new ModelBox(eye2, 49, 4, -0.4625F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 42, 49, -0.5375F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(1.5F, 5.333F, -3.4404F);
        this.head.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, -1.0796F, -0.8688F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6144F, -0.116F, 0.0607F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 49, -0.4F, -0.225F, -1.325F, 1, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, -1.0796F, -0.8688F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6144F, 0.116F, -0.0607F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 35, 49, -0.6F, -0.225F, -1.325F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.48F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 46, -2.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.6F, -0.9F, -1.95F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0097F, -0.218F, 0.348F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 40, 17, 0.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.6F, -0.9F, -1.95F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0097F, 0.218F, -0.348F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 40, 17, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0125F, -2.8862F, 3.8876F);
        this.main.addChild(tail);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.0125F, 3.1961F, 0.36F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 0, -1.5F, -3.0F, 0.0F, 3, 3, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.4875F, -3.4977F, 0.4123F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.0385F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 41, 40, -1.5F, 0.9F, 0.2F, 0, 4, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5125F, -2.9382F, 3.3597F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1876F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 15, -1.5F, 0.025F, -2.875F, 4, 4, 5, 0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.1506F, 2.3734F, 1.3277F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0799F, -0.3519F, 0.2284F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 47, 30, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.1756F, 2.3734F, 1.3277F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0799F, 0.3519F, -0.2284F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 47, 30, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.0125F, -0.2129F, 4.3843F);
        this.tail.addChild(tail2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 1.7734F, 5.1806F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 33, -0.5F, -2.05F, -5.025F, 2, 2, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -1.4873F, 5.3783F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 22, -1.5F, 0.0F, -5.0F, 3, 3, 5, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7109F, 4.5321F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 47, 33, -1.0F, -0.7641F, -0.0321F, 2, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.2905F, 3.8754F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.6109F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 10, -0.5F, -0.775F, -4.2F, 1, 1, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.3109F, 1.9679F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4363F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, 0.5F, -0.375F, -2.05F, 0, 4, 10, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.3109F, 1.9679F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3054F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 39, -0.5F, -1.025F, 0.0F, 1, 1, 5, 0.003F, false));



        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.5F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.12F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetX = -0.06F;
        this.main.offsetZ = 0.03F;
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.2F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

