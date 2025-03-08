package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelUighuroniscus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontLeftFin2;
    private final AdvancedModelRenderer frontRightFin2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    public ModelUighuroniscus() {
        this.textureWidth = 44;
        this.textureHeight = 44;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.0F, -1.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -2.5F, -3.0F, 4, 5, 6, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.0F, 1.5381F, -1.8087F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.4152F, 0.3215F, -0.1384F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 7, 34, 0.025F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.0F, 1.5381F, -1.8087F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.4152F, -0.3215F, 0.1384F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 7, 34, -0.025F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 20, 14, -1.5F, -1.0F, -4.0F, 3, 3, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 0, -1.5F, 2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.8309F, -6.3754F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.1345F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 0, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 12, -1.5F, 2.0F, 0.0F, 3, 2, 2, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.0765F, -5.774F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2654F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 34, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 20, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.7F, 0.9648F, -4.1982F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.5672F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.2654F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -1.0F, -0.3F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.7F, 0.9648F, -4.1982F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.5672F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.2654F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -1.0F, -0.3F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.5309F, -2.7504F);
        this.head.addChild(jaw);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.7F, -3.625F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.1345F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 34, -1.0F, 0.2F, -0.55F, 2, 2, 1, -0.003F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 8, -1.5F, 2.0F, -0.55F, 3, 2, 1, -0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0818F, -0.0514F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 29, -1.0F, -0.575F, -1.525F, 2, 2, 2, -0.005F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.4F, 2.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 2.8F, 0.5F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 6, -0.5F, -1.0F, -0.5F, 2, 1, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -2.0F, 2.5F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 26, 1.5F, -3.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.frontLeftFin2 = new AdvancedModelRenderer(this);
        this.frontLeftFin2.setRotationPoint(0.875F, 1.7631F, 0.6913F);
        this.body.addChild(frontLeftFin2);
        this.setRotateAngle(frontLeftFin2, -0.4369F, 0.4407F, -0.1966F);
        this.frontLeftFin2.cubeList.add(new ModelBox(frontLeftFin2, 0, 34, 0.025F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.frontRightFin2 = new AdvancedModelRenderer(this);
        this.frontRightFin2.setRotationPoint(-0.875F, 1.7631F, 0.6913F);
        this.body.addChild(frontRightFin2);
        this.setRotateAngle(frontRightFin2, -0.4369F, -0.4407F, 0.1966F);
        this.frontRightFin2.cubeList.add(new ModelBox(frontRightFin2, 0, 34, -0.025F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 5.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -1.0F, -1.5F, 0.0F, 2, 3, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 2.6F, 0.5F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 22, 1.0F, -0.175F, -0.15F, 0, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 2.6F, 0.5F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 2, 0.0F, -1.125F, -0.25F, 1, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 3.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 30, -0.5F, -1.1F, 0.0F, 1, 3, 3, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 16, 0.0F, -3.5F, -0.1F, 0, 6, 7, 0.0F, false));

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
        this.main.offsetX = 0.938F;
        this.main.rotateAngleY = (float)Math.toRadians(241);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.63F;
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
            this.flap(frontLeftFin2, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin2, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(frontRightFin2, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(frontRightFin2, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
