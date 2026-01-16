package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAetheolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;

    public ModelAetheolepis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 14, 0.25F, -11.6F, -5.0F, 1, 7, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 14, -1.25F, -11.6F, -5.0F, 1, 7, 5, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 35, 12, -1.0F, -9.325F, 1.925F, 2, 2, 2, -0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 24, 31, -1.0F, -13.5F, -3.0F, 2, 2, 2, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -10.0F, 3.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 24, -0.5F, -3.35F, -3.25F, 2, 4, 3, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -8.3152F, -7.4496F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.1563F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 21, -1.525F, 0.6F, -0.35F, 1, 1, 1, 0.003F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 21, -0.475F, 0.6F, -0.35F, 1, 1, 1, 0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 17, -1.5F, 0.0F, -1.0F, 2, 3, 1, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -10.9133F, -5.9496F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.0472F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 24, -0.5F, 0.0F, -3.0F, 2, 3, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -12.5F, -4.7321F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9163F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 33, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -13.5F, -3.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 32, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -13.5F, -1.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.829F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 1.5F, -6.0F, 0.0F, 0, 6, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -13.5F, -1.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6545F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 31, -0.5F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -3.6292F, -4.7256F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.8988F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 27, -0.5F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -2.5541F, -1.9248F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3665F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 6, -0.5F, -2.0F, -3.0F, 2, 2, 3, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -3.2799F, 0.9861F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2443F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 0, -0.5F, -2.0F, -3.0F, 2, 2, 3, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, -7.325F, 3.925F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7243F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 0, 1.5F, 0.0F, -5.0F, 0, 6, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -7.325F, 3.925F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.9425F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 14, -0.5F, -4.0F, -5.0F, 2, 4, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.4496F, -5.8201F);
        this.main.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.9439F, 0.4802F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.9163F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 22, -0.5F, -3.05F, -0.475F, 2, 3, 1, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.25F, -6.75F, -4.5F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.4461F, 0.4802F, -0.2174F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 20, 36, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.25F, -6.75F, -4.5F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.4461F, -0.4802F, 0.2174F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 20, 36, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -7.85F, 3.9F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 28, 12, 0.525F, -2.5F, 0.0F, 0, 5, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, -3.1095F, -1.8586F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.3076F, 0.5457F, -0.1634F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 35, 27, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, -3.1095F, -1.8586F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.3076F, -0.5457F, 0.1634F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 35, 27, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.main.offsetY = -0.15F;
        this.main.offsetX = -0.04F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);

        //this.body.offsetX = -0.09F;
        this.main.offsetY = -0.3F;
        this.main.offsetX = -0.04F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.6F;
        this.main.rotateAngleY = (float) Math.toRadians(210);
        this.main.rotateAngleX = (float) Math.toRadians(8);
        this.main.rotateAngleZ = (float) Math.toRadians(-4);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.main.rotateAngleY = (float) Math.toRadians(230);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.6065F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 1.7497F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 1.2435F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.6894F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r11, -0.6938F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.6938F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.6894F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        AdvancedModelRenderer[] fishTail = {this.tail};
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
