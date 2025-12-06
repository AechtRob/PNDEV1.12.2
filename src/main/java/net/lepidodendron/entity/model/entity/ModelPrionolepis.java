package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPrionolepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    public ModelPrionolepis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.7136F, 4.3681F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -0.9636F, -0.3681F, 3, 3, 5, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 24, -1.5F, -0.9636F, -4.3681F, 3, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 2.0364F, -0.3681F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 17, -0.5F, -2.0F, -3.75F, 3, 2, 4, -0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.9636F, -0.3681F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 8, 0.5F, -3.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.4F, 1.5364F, 4.3819F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.5509F, 0.3007F, -0.18F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 39, 29, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.4F, 1.5364F, 4.3819F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.5509F, -0.3007F, 0.18F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 39, 29, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.6F, 1.5364F, -3.6181F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.4674F, 0.3542F, -0.1733F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 27, 39, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.6F, 1.5364F, -3.6181F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.4674F, -0.3542F, 0.1733F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 27, 39, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.9636F, 0.1319F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 35, 33, -1.0F, 0.0F, -6.0F, 3, 1, 2, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.025F, 2.0267F, -11.7352F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1685F, -0.1899F, 0.0287F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 9, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.003F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 41, 0.4F, -0.9F, 0.0F, 0, 1, 3, 0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.025F, 2.0267F, -11.7352F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1685F, 0.1899F, -0.0287F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 41, -0.4F, -0.9F, 0.0F, 0, 1, 3, 0.003F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 9, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 2.0267F, -11.7352F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1484F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 37, -0.5F, 0.0F, -6.0F, 1, 1, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 33, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.2624F, -9.1283F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0894F, -0.2173F, 0.0193F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 6, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 1.2624F, -9.1283F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0894F, 0.2173F, -0.0193F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 6, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 3.0F, -0.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 38, -0.5F, -3.0F, -5.75F, 3, 3, 1, -0.009F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 0, -0.75F, -3.0F, -4.95F, 3, 3, 2, -0.003F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 0, -0.25F, -3.0F, -4.95F, 3, 3, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.7247F, -6.4796F);
        this.head.addChild(jaw);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.525F, -0.698F, -5.2556F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1462F, -0.1726F, 0.0261F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 17, 0.0F, -0.4F, -0.25F, 1, 1, 6, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 41, 0.3F, -0.45F, -0.25F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.525F, -0.698F, -5.2556F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1462F, 0.1726F, -0.0261F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 41, -0.3F, -0.45F, -0.25F, 0, 1, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -1.0F, -0.4F, -0.25F, 1, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.698F, -5.2556F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1484F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 0, -0.5F, -0.4F, -0.3F, 1, 1, 6, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.6223F, 4.2962F);
        this.main.addChild(tail);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.414F, 0.0856F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2007F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 17, -0.5F, -1.0F, 0.0F, 2, 1, 4, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.586F, 0.0856F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0305F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 25, -0.5F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2194F, 3.7899F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 31, -0.5F, -1.2166F, -0.2043F, 1, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.6572F, 0.7878F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4756F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 23, 0.5F, -0.2F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.7834F, -0.2043F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1265F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 32, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6166F, 3.2957F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 37, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.006F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 23, 0.0F, -2.5F, -0.25F, 0, 5, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.2F;
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.70F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
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
