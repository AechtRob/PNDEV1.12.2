package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAnguillavus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r22;

    public ModelAnguillavus() {
        this.textureWidth = 51;
        this.textureHeight = 51;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.547F, -5.7152F);
        this.main.cubeList.add(new ModelBox(main, 15, 23, -1.5F, -1.747F, 1.4652F, 3, 3, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 33, 37, -1.5F, 0.253F, -0.5098F, 3, 1, 2, -0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 41, 21, -0.5F, -0.322F, -2.2598F, 1, 1, 3, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 43, 4, 0.5F, -0.322F, -0.5098F, 1, 1, 2, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 43, 4, -1.5F, -0.322F, -0.5098F, 1, 1, 2, 0.003F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.2294F, -0.4667F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4669F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 26, 0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.925F, -0.2634F, -0.4829F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2105F, -0.4213F, 0.077F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 44, -0.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.925F, -0.2634F, -0.4829F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2105F, 0.4213F, -0.077F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 44, -0.4F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.747F, 1.4652F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 39, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.178F, -0.5098F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 43, 8, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 0.178F, -0.5098F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 8, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, 0.503F, 1.4652F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.6127F, 0.3644F, -0.2455F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 44, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, 0.503F, 1.4652F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.6127F, -0.3644F, 0.2455F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 44, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.378F, -0.2598F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 0, -0.5F, -0.125F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -0.2F, -0.25F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.5236F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 12, 0.0F, 0.075F, -2.0F, 1, 1, 2, -0.003F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, -0.2F, -0.25F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 12, -1.0F, 0.075F, -2.0F, 1, 1, 2, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.247F, 3.9652F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 5, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.2819F, 4.5048F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 41, 0.025F, 0.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 9, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.5F, 5.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 30, 0.0F, 0.0F, -5.0F, 0, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.body2.addChild(body3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 2.2809F, 5.0389F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 41, 1.025F, -1.475F, -3.3F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 1.5F, 0.0F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 16, 0.0F, -1.0F, 0.0F, 2, 1, 5, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, -1.5F, 0.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 32, 1.975F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 0, 1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.body3.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.7691F, 0.3446F, -0.4024F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 10, 44, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 1.0F, 1.5F);
        this.body3.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.7691F, -0.3446F, 0.4024F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 10, 44, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.2175F, 4.6565F);
        this.body3.addChild(body4);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, 1.0825F, 0.0435F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0087F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 37, 2.0F, -0.5F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 1.0825F, 0.0435F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0698F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 18, 0.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.5175F, 0.0435F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 0, 1.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 8, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.003F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.251F, 4.7656F);
        this.body4.addChild(body5);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.0F, -2.0377F, 0.115F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1091F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 7, 1.975F, 0.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -1.0415F, 0.0279F);
        this.body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 25, 1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, 1.3335F, -4.7221F);
        this.body5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0698F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 37, 2.025F, -0.2F, 4.8F, 0, 1, 5, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 23, 1.5F, -1.0F, 4.8F, 1, 1, 5, -0.003F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0085F, 4.6779F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 13, 30, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.006F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.body6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1353F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 30, -0.025F, -1.05F, 0.25F, 0, 1, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.body6.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 14, 0.025F, -0.05F, 0.25F, 0, 1, 5, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -0.05F, 5.0F);
        this.body6.addChild(body7);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.body7.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 43, 16, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.25F;
        this.main.offsetX = 1.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);

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
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                //this.Root.offsetY = 1.55F;
                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed * 0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.flap(frontLeftFin, speed * 2.5F, 0.3F, false, 0, 0, f2, 1);
            this.flap(frontRightFin, speed * 2.5F, -0.3F, false, 0, 0, f2, 1);
            this.chainWave(fishTail, speed * 2.5F, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 2.5F, 0.25F, -3, f2, 1);

            this.flap(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);

        }
    }
}
