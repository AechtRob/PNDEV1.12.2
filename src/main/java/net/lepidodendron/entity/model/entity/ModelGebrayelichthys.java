package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGebrayelichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;

    public ModelGebrayelichthys() {
        this.textureWidth = 34;
        this.textureHeight = 34;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.1192F, 14.4079F, 0.7554F);
        this.main.cubeList.add(new ModelBox(main, 0, 7, -1.1192F, -0.4079F, -2.3554F, 2, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.3808F, -0.048F, 1.1358F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 27, -0.5F, -0.5F, -0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.4192F, 3.313F, -3.2811F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 0, -0.5F, -1.2F, -0.375F, 1, 1, 4, -0.006F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 0, 0.1F, -1.2F, -0.375F, 1, 1, 4, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.4192F, -0.191F, -2.7505F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.1345F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 25, -0.5F, 0.0F, -4.0F, 1, 1, 2, -0.003F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 14, -0.5F, 0.0F, -2.0F, 1, 2, 2, 0.003F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 14, 0.1F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 25, 0.1F, 0.0F, -4.0F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.4192F, -0.7998F, -1.9571F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6545F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 30, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 30, 0.1F, 0.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.4192F, -1.4079F, -1.0054F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, -0.5F, 0.1F, -1.125F, 1, 1, 1, -0.003F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, 0.1F, 0.1F, -1.125F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5808F, -0.3745F, -0.6084F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8727F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 10, -1.5F, -1.0F, 0.0F, 1, 2, 1, -0.006F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 10, -0.9F, -1.0F, 0.0F, 1, 2, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.6192F, -7.0687F, 1.1288F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9599F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 32, 0.5F, 0.25F, 1.75F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, 0.5F, 0.25F, 0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 20, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.6192F, -9.5262F, 2.8495F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6981F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 30, 0.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.6192F, -5.3923F, 1.1746F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.1781F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 0, 0.5F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.1192F, -5.2561F, 0.2835F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.1345F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 25, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.1192F, 8.4851F, -0.9769F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.6144F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 23, -0.5F, -1.0F, -1.0F, 1, 1, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.3808F, 3.8657F, 0.9365F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.1781F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 7, -0.5F, -0.5F, -5.25F, 0, 1, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.0F, -1.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.3808F, -0.1191F, 1.2852F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.4835F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 31, -0.475F, -0.5F, -1.25F, 0, 1, 1, -0.003F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 0, -0.5F, -0.5F, -2.5F, 0, 1, 1, -0.003F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 30, -0.5F, -0.5F, -3.75F, 0, 1, 1, -0.003F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 14, -1.0F, -1.0F, -4.0F, 1, 1, 4, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.6192F, -2.9939F, 0.3918F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.5708F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 31, 0.5F, -0.45F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.6192F, -3.048F, 0.6358F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.789F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 31, 0.5F, -0.75F, -2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 20, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.1192F, -1.1405F, 0.0344F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.2654F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4192F, 3.5351F, 0.298F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.048F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 19, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.003F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 19, 0.1F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.9192F, 9.1643F, -1.7787F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3534F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 6, 0.0F, -6.0F, -1.0F, 1, 6, 1, 0.006F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 6, 0.6F, -6.0F, -1.0F, 1, 6, 1, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.4192F, 5.2955F, -1.2608F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 27, -0.5F, 0.0F, -1.0F, 1, 2, 1, -0.003F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 27, 0.1F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.9192F, 3.5921F, -2.3554F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 20, 0.0F, -1.1F, -0.3F, 1, 3, 2, 0.003F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 20, 0.6F, -1.1F, -0.3F, 1, 3, 2, 0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.6692F, 0.0921F, -1.8554F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 29, 14, -0.5F, -0.225F, -0.4F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 29, 14, 0.6F, -0.225F, -0.4F, 1, 1, 1, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.6808F, 8.6682F, -2.1076F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3186F, 0.1451F, -0.413F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 31, 27, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9192F, 8.6682F, -2.1076F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.3186F, -0.1451F, 0.413F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 31, 27, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.6058F, 3.0093F, 0.2014F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.2739F, 0.2947F, -0.0814F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 30, 31, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.8442F, 3.0093F, 0.2014F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.2739F, -0.2947F, 0.0814F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 30, 31, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.1192F, -0.5046F, 0.6396F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 14, 26, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.006F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0087F, 1.8785F);
        this.tail.addChild(tail2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6981F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 27, 5, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.1192F, 2.8076F, -2.2503F);
        this.main.addChild(jaw);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0264F, 0.5348F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 5, 29, -0.5F, 0.0F, -1.5F, 1, 1, 1, -0.006F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.8F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.6F;
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

             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetX = 0.10F;
//                this.bob(main, -speed, 5F, false, f2, 1);
            } else {
                 this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);

                 this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                 this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                 this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                 this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                 this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
                 this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
                 this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
                 this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


                 this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             }
        }
    }
}
