package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCretapantodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail2;

    public ModelCretapantodon() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -3.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -5.25F, -1.5F, 3, 4, 4, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.25F, 2.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 21, 0.025F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, -1.0F, 0.0F, 0.0F, 2, 3, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -1.1161F, 5.0993F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6545F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 21, 1.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.0901F, 2.2802F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 9, -0.5F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -0.0028F, 0.2821F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 16, -0.5F, -2.0F, 0.0F, 3, 2, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.75F, -0.5F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, -0.5F, -1.4F, -1.1F, 3, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -5.9942F, -1.3925F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.0734F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 17, 0.475F, 0.075F, -1.125F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -5.75F, 2.6F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0611F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, 0.5F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -5.25F, -1.5F);
        this.main.addChild(head);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 4.8999F, -0.1875F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 21, -0.5F, -3.0F, -2.0F, 2, 3, 2, 0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.8452F, -1.8126F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.9163F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 27, -1.0F, 0.0F, -1.525F, 2, 2, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 9, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, 1.8308F, -1.3084F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.4835F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 13, 0.4F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 13, 1.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 16, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.9907F, -1.4868F);
        this.head.addChild(jaw);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.1455F, -0.3258F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.9163F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 5, -1.0F, 0.0F, -2.5F, 2, 2, 1, -0.006F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -1.25F, -0.5F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.3979F, 0.4891F, 0.195F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 29, 5, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -1.25F, -0.5F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.3979F, -0.4891F, -0.195F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 29, 5, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, -0.5028F, 1.7821F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.4606F, 0.3152F, -0.1526F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 26, 29, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, -0.5028F, 1.7821F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.4606F, -0.3152F, 0.1526F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 26, 29, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.4266F, 5.7981F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 26, 0, -0.5F, -0.7484F, 0.1019F, 1, 2, 2, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.0027F, 0.147F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3883F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 27, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.708F, 0.2356F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 25, 0.5F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.8234F, -3.2981F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 5, -1.0F, 0.0F, 3.5F, 1, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1766F, 1.7019F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 23, 0.0F, -1.5F, 0.975F, 0, 3, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 27, -0.5F, -1.0F, 0.0F, 1, 2, 1, -0.009F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.4F;
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
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                //this.body.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
