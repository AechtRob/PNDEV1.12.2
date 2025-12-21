package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelStemmatodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    public ModelStemmatodus() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -7.0F, -3.1F, 2, 6, 4, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 11, 11, -1.0F, -6.0F, 0.9F, 2, 4, 2, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 0, -1.0F, -5.5F, -5.0F, 2, 3, 2, 0.009F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.3418F, -6.5518F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 27, -1.0F, -0.125F, -0.9F, 2, 2, 1, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.1895F, -5.7865F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.1781F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 6, -1.0F, 0.0F, -2.0F, 2, 2, 2, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.9556F, -5.1437F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.8727F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 27, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.9824F, -2.9318F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7418F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 11, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.6894F, 2.5345F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.9425F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 26, 0.0F, -0.55F, -0.2F, 0, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 0, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -7.8078F, 0.8764F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5934F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 30, -0.025F, -0.6F, 0.0F, 0, 1, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -8.3269F, -0.5309F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6152F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 10, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -8.5F, -1.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3534F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 18, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -8.5F, -1.0F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 18, -2.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -1.484F, -4.8794F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 27, -0.5F, -1.0F, -1.0F, 2, 1, 1, -0.006F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.5414F, 2.677F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.0036F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -0.5F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.2787F, 1.6206F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.0908F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 3, 0.5F, 0.2F, 0.6F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.5414F, 0.945F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.829F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 30, 0.525F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.5414F, 0.945F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 5, -0.5F, -2.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, -0.3671F, -1.0474F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 27, 0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, -0.8F, -3.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 23, 0.5F, -1.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.8F, -3.0F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 11, -0.5F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.775F, -4.5F, -5.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 31, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 31, 1.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.95F, -3.0F, -3.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.6109F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 5, 31, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.95F, -3.0F, -3.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.6109F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 5, 31, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.9918F, -4.6518F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 9, 23, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.1F, 2.6875F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 27, 16, -1.0F, -1.0F, -0.0125F, 2, 2, 1, -0.006F, false));
        this.tail.cubeList.add(new ModelBox(tail, 31, 0, -0.5F, -0.5F, 0.9625F, 1, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.5625F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 20, 0.0F, -1.5F, 0.0F, 0, 3, 2, 0.0F, false));
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
