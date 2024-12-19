package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParaclupea extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;

    public ModelParaclupea() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -6.75F, -2.5F, 4, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.3916F, -2.5243F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 7, -0.5F, -4.0F, -3.0F, 3, 4, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, 0.45F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 29, -0.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, 0.45F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 4, -0.5F, -1.0F, -3.0F, 3, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -7.9956F, 0.4502F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7418F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 35, 2.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -7.9956F, 0.4502F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 22, -1.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -8.0F, 0.5F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 13, -1.0F, 0.0F, -4.05F, 3, 4, 4, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -0.25F, 0.45F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 29, -1.0F, -5.75F, 3.05F, 3, 3, 3, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.35F, 3.8F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2138F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 34, -0.5F, -0.025F, -0.65F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -0.55F, 3.05F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6065F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 34, 1.5F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 15, 0.5F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 35, 22, -0.5F, -5.65F, 3.05F, 2, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.9F, 5.05F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 0, -0.5F, -0.85F, -2.225F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 13, 0.5F, -8.65F, 5.05F, 0, 7, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.025F, -2.25F, -2.5F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.5672F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 36, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.025F, -2.25F, -2.5F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.5672F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 36, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.025F, -1.25F, 2.0F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.5672F, 0.0F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.025F, -1.25F, 2.0F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, -0.5672F, 0.0F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 22, 22, -1.5F, -5.897F, -6.0346F, 3, 3, 3, 0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.7768F, -5.1854F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6545F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 29, -0.5F, -2.0F, -3.0F, 3, 2, 3, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -6.4775F, -7.3598F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4712F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 14, -0.5F, 0.0F, -1.0F, 3, 3, 1, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -7.647F, -3.5346F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2967F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 0, -0.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.275F, -5.722F, -5.5346F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.2618F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 35, 9, -1.525F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 15, 0, -1.475F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.275F, -5.722F, -5.5346F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.2618F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 35, 9, -1.475F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 15, 0, -1.525F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -4.0585F, -7.2294F);
        this.head.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.4554F, -0.336F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.8727F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 13, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.0F;
        this.main.offsetX = -1.338F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.63F;
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
        this.main.offsetZ = -0.34F;
        this.main.offsetY = -0.18F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.14F;
        this.main.offsetZ = 0.015F;
        this.main.render(0.01F);
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
