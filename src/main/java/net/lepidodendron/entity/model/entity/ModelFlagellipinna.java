package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelFlagellipinna extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;

    public ModelFlagellipinna() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -11.0F, -1.75F, 3, 5, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 11, 21, -1.5F, -10.5F, -3.75F, 3, 4, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -12.0214F, 3.3997F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.1781F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 0, 0.5F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -11.6199F, 2.8263F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.1345F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 9, -0.5F, 0.0F, 0.0F, 2, 2, 3, 0.006F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -7.8534F, -5.4768F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.2305F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 34, -0.5F, 0.55F, -0.975F, 1, 1, 1, -0.006F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 14, -0.5F, -0.3F, -1.075F, 1, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -9.6057F, -3.6937F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.405F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 6, -2.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 6, 0.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -10.6694F, -4.038F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7941F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -1.5F, 0.0F, 0.0F, 2, 3, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -11.2603F, -2.9936F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.0559F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 21, -0.5F, -0.8F, 0.0F, 2, 2, 3, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -11.6199F, 2.8263F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.9687F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 9, 0.5F, -8.0F, -3.0F, 0, 8, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 0, -0.5F, 0.0F, -3.0F, 2, 5, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -12.4085F, -0.7492F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.9425F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 33, 0.5F, -2.425F, -0.5F, 0, 5, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -5.859F, 2.7651F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0036F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 5, 0.5F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 15, -0.5F, -2.0F, 0.0F, 2, 2, 3, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -3.6471F, 0.7383F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.829F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 27, 0.475F, -0.5F, 0.075F, 0, 2, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 19, -0.5F, -3.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -5.5606F, -4.8318F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5454F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 29, 0.5F, -1.0F, -0.25F, 0, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 33, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -4.1776F, -3.3871F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.8072F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 26, 0.5F, -1.5F, -0.2F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 28, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -2.5F, -0.9F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.9774F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 21, 0.5F, -3.0F, -0.2F, 0, 3, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 0, 0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -2.5F, -0.9F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.8727F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 27, 0.5F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -2.5F, -0.9F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6109F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 26, -0.5F, -4.0F, 0.0F, 2, 4, 2, 0.003F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(1.0076F, -3.4094F, -1.361F);
        this.main.addChild(bone);
        this.setRotateAngle(bone, 0.4074F, 0.5293F, 0.2145F);
        this.bone.cubeList.add(new ModelBox(bone, 31, 34, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-1.0076F, -3.4094F, -1.361F);
        this.main.addChild(bone2);
        this.setRotateAngle(bone2, 0.4074F, -0.5293F, -0.2145F);
        this.bone2.cubeList.add(new ModelBox(bone2, 31, 34, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -7.8545F, -5.4336F);
        this.main.addChild(jaw);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.0343F, 0.018F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.2305F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 10, -0.5F, -0.25F, -0.075F, 1, 2, 1, -0.003F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 18, -0.5F, 0.55F, -0.175F, 1, 1, 1, -0.009F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -8.575F, 3.75F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 21, 33, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 28, 0.0F, -2.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -7.5F, -3.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.2399F, 0.4253F, -0.1006F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 10, 33, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -7.5F, -3.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.2399F, -0.4253F, 0.1006F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 10, 33, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.4F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.4F;
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

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
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
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetX = 0.50F;
                 this.main.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
