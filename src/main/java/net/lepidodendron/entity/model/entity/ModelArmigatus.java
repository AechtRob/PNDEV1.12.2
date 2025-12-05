package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelArmigatus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;

    public ModelArmigatus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -7.5F, -2.2F, 3, 6, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 26, 15, -1.0F, -8.3545F, -1.1087F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.1527F, -0.0304F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 13, -0.5F, -2.0F, 0.0F, 2, 2, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.6736F, -2.9848F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 0, -0.5F, -2.0F, -3.0F, 2, 2, 3, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.9459F, -5.1841F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.8639F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 20, -0.5F, -1.0F, -3.55F, 2, 1, 4, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.5F, -2.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 28, -0.5F, -2.0F, -1.0F, 2, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -7.578F, -4.0065F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 8, -0.5F, 0.0F, -3.0F, 2, 3, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -8.3041F, 1.8681F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6545F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 10, 1.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -8.3545F, 1.8913F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 6, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -6.5F, -3.2F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 32, -0.5F, -1.25F, -0.5F, 2, 2, 3, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -3.5F, -2.2F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 0, -0.5F, -3.0F, -2.5F, 2, 4, 3, 0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.482F, 3.2925F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 20, -1.0F, -2.018F, 0.0075F, 2, 4, 3, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, 3.8072F, 0.6429F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6109F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 32, 1.5F, -0.5F, 0.0F, 0, 2, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 26, 0.5F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -3.271F, 0.5062F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 32, -0.5F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.518F, 2.5075F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 35, 26, -0.5F, -1.1F, 0.0F, 1, 2, 3, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 2.6045F, 0.5929F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.48F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 8, 0.525F, 0.0F, -0.1F, 0, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 34, 0.0F, -2.0F, -0.1F, 1, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.8509F, 0.8599F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3796F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 22, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 13, 0.0F, -3.0F, 0.0F, 0, 6, 6, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -2.55F, -2.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1929F, 0.6079F, 0.0367F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 37, 16, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -2.55F, -2.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.1929F, -0.6079F, -0.0367F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 37, 16, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.6F, -5.8F, -4.0F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, -0.5236F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 38, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 32, 38, -0.425F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.6F, -5.8F, -4.0F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, -0.5236F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 38, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 32, 38, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.95F, -1.1287F, 2.3349F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.7132F, 0.3751F, -0.3069F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 20, 38, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.95F, -1.1287F, 2.3349F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.7132F, -0.3751F, 0.3069F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 20, 38, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.0748F, -5.1209F);
        this.main.addChild(jaw);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.1461F, -0.1132F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.8639F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 38, -1.4F, -1.9F, -1.85F, 0, 2, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 38, 0.4F, -1.9F, -1.85F, 0, 2, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 26, -1.5F, 0.0F, -3.3F, 2, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.25F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 6.0F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
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
            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
