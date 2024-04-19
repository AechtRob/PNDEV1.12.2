package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHydropessum extends AdvancedModelBase {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;

    public ModelHydropessum() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.5F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -13.0F, -4.0F, 4, 9, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 35, 6, -2.0F, -16.0F, -1.0F, 3, 3, 5, 0.002F, false));
        this.main.cubeList.add(new ModelBox(main, 28, 17, -2.0F, -4.0F, 0.0F, 3, 4, 5, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.425F, 5.75F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6938F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 36, 0.0F, -4.0714F, -0.6988F, 0, 7, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.425F, 5.75F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5629F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 39, -2.0F, -4.9964F, -2.9988F, 3, 5, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.7F, 3.6F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 22, -2.0F, -3.0193F, -0.9812F, 3, 3, 1, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 36, -2.0F, -3.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6545F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 0, -2.0F, -4.0F, -6.0F, 3, 4, 6, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -16.4446F, 4.632F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.781F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 27, -0.5F, 0.0069F, -0.0016F, 3, 3, 5, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -18.5712F, 5.9333F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6807F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 22, -0.5F, -2.0F, -3.75F, 0, 5, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -18.3946F, 1.807F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5498F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 15, -1.5F, 0.1935F, -0.574F, 3, 2, 4, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -16.75F, -0.7F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.781F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -0.5F, -2.6298F, 0.0133F, 3, 1, 1, -0.002F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 0, -0.5F, -2.0048F, 0.0133F, 3, 2, 3, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -13.0F, -4.0F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7243F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 36, -0.5F, -5.0F, 0.0F, 3, 5, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -8.5564F, 7.3916F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 24, 44, -1.5F, -1.4436F, 0.1084F, 3, 3, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -1.4436F, 3.1084F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6981F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 45, -1.5F, -4.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 5.1314F, 0.9584F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6763F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.0F, -4.2266F, -3.6756F, 2, 4, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0564F, 2.6084F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 48, -1.0F, -1.0F, -0.5F, 2, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 22, 0.0F, -6.0F, 0.0F, 0, 11, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.525F, -4.9F, -3.1F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.4074F, 0.5293F, 0.2145F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 19, 48, 0.0F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.525F, -4.9F, -3.1F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.4074F, -0.5293F, -0.2145F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 19, 48, 0.0F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -13.0F, -4.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 49, 31, -1.5F, 3.0F, -1.0F, 3, 4, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 2.749F, -2.907F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.0647F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 45, -0.5F, 0.007F, -1.999F, 2, 4, 2, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7592F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 23, -0.5F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 10.0F, 0.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.9207F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 0, -0.5F, -2.8F, -4.0F, 2, 3, 3, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.85F, 4.024F, -1.882F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, -0.5236F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 22, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 21, 0, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.85F, 4.024F, -1.882F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, -0.5236F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 22, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 21, 0, -0.55F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.9483F, -1.2497F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.283F, -1.5508F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.8029F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 47, 7, -0.5F, -0.85F, -0.725F, 2, 2, 1, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -3.1993F, -1.6573F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.0647F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 36, -0.5F, 0.007F, -2.999F, 2, 3, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.15F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, false, 0.1F, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
