package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelNerepisacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    public ModelNerepisacanthus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -4.5F, -4.0F, 3, 3, 10, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -4.5F, -1.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 31, -1.0F, -3.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.6974F, 0.863F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.7017F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 14, -0.5F, 0.0F, 0.0F, 2, 5, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.9588F, -2.1256F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.4835F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 26, -0.5F, 0.0F, 0.0F, 2, 3, 1, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.5939F, -5.0815F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4835F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 8, -0.5F, 0.0F, -0.375F, 2, 3, 2, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -3.3363F, -7.7205F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 21, -0.5F, 0.0F, -1.0F, 2, 3, 1, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -3.9791F, -6.9544F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 5, 35, -0.5F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.0927F, -6.7981F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 14, -1.075F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 14, -0.925F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -4.5F, -4.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 26, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.1076F, -5.1191F);
        this.main.addChild(jaw);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.4522F, 0.2964F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 30, -0.5F, -2.925F, -1.35F, 2, 3, 1, -0.01F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, -1.5939F, -4.0815F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.3054F, 0.0F, -0.8727F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 18, 30, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.0F, -1.5939F, -4.0815F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.3054F, 0.0F, 0.8727F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 18, 30, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, -1.4474F, 2.863F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.2888F, 0.1362F, -0.741F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 32, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, -1.4474F, 2.863F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.2888F, -0.1362F, 0.741F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 32, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.1791F, 5.0268F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 22, -1.0F, -1.3209F, 0.2482F, 2, 2, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.638F, 1.3959F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7985F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 16, -0.5F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.8672F, 0.4225F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2313F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 0, -0.5F, -2.0F, 0.0F, 2, 2, 5, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -0.8209F, 1.2482F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.2217F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 35, -1.0F, 0.0F, 0.3F, 0, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.9915F, 4.6735F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 31, -0.5F, -0.3043F, -0.0003F, 1, 2, 2, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -2.3293F, 7.1958F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 14, 0.5F, -2.175F, -6.9F, 0, 5, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.6707F, 1.9997F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 14, -0.5F, -0.975F, 0.0F, 1, 1, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.22F;
        this.main.offsetX = -0.05F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.4752F, -0.3931F, -0.1946F);
        this.main.offsetY = -0.45F;
        this.main.offsetZ = 0.0F;
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.4752F, -0.3931F, -0.1946F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(main, speed, 0.15F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.25F, true, 0, -0.2F, f2, 1);
            this.flap(frontLeftFin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.walk(frontLeftFin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), 0.25F, true, -3, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.05F, true, -3, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0.5F, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.05F, true, 0.5F, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.2F, true, 3.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.05F, true, 3.5F, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
            }
        }
    }
}
