package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParenchodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;

    public ModelParenchodus() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0902F, 19.95F, -0.9395F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5902F, -3.05F, -1.3105F, 3, 4, 3, 0.009F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5902F, 0.5109F, 4.2555F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.117F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 27, -0.5F, -1.0F, 0.0F, 2, 1, 1, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5902F, 1.9854F, 2.9043F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.829F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 0, 1.525F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 0, 0.5F, -3.0F, 0.0F, 2, 3, 2, 0.006F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0902F, 2.9089F, 1.1303F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 16, -0.5F, -3.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5902F, 3.3418F, -0.8223F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 8, -0.6F, -4.25F, -4.1F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 8, 0.6F, -4.25F, -4.1F, 1, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 22, -0.5F, -4.0F, -3.6F, 2, 2, 2, -0.003F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 9, -1.0F, -4.0F, -2.0F, 3, 4, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.4098F, 3.5161F, -2.8147F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 12, -1.5F, -2.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0902F, 3.45F, -1.3105F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 15, -0.5F, -3.0F, 0.5F, 3, 3, 2, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5902F, -2.8914F, 3.638F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.672F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 21, 1.5F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0902F, 0.425F, 5.4383F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 31, 0.025F, -1.0F, -1.1F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5902F, -2.3578F, 3.5659F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5149F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 31, 1.5F, 1.5F, 1.9F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 16, 0.5F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5902F, -3.05F, 1.6895F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.528F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 30, 1.475F, -1.0F, -0.2F, 0, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5902F, -3.05F, 1.6895F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3534F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 22, -0.5F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5902F, -3.05F, -1.3105F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 27, 1.5F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0902F, 0.9071F, -6.8515F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.0503F, -0.0807F, 0.0336F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 11, 0.5F, 0.0F, -0.15F, 0, 3, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 27, 0.0F, 0.0F, 0.0F, 1, 5, 1, 0.003F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.9098F, 0.9071F, -6.8515F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.0503F, 0.0807F, -0.0336F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 11, -0.5F, 0.0F, -0.15F, 0, 3, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 27, -1.0F, 0.0F, 0.0F, 1, 5, 1, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.4098F, -0.0082F, -6.4487F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.1563F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 6, -1.5F, 0.0F, -1.0F, 2, 4, 1, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.4098F, -1.7822F, -4.0294F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6327F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 21, -1.5F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.0902F, -3.05F, -1.3105F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4363F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.3098F, 2.8717F, -1.0791F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.3724F, 0.4353F, -0.3008F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 31, 4, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.4902F, 2.8717F, -1.0791F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.3724F, -0.4353F, 0.3008F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 31, 4, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.4098F, 2.4089F, 1.1303F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.7373F, 0.2975F, -0.2602F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 31, 30, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5902F, 2.4089F, 1.1303F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.7373F, -0.2975F, 0.2602F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 31, 30, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0902F, 2.3346F, -3.6792F);
        this.main.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 1.0988F, 0.0862F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0908F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 16, -0.25F, -3.95F, 0.2F, 0, 3, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 16, 1.25F, -3.95F, 0.2F, 0, 3, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 27, -0.5F, -4.025F, 0.05F, 2, 4, 1, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0902F, -0.9F, 4.7395F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 19, 27, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0993F, 1.1312F);
        this.tail.addChild(tail2);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0993F, -0.6312F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.7854F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 0, 0.5F, 0.0F, 0.0F, 0, 4, 4, 0.0F, false));

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
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
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
            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.20F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
