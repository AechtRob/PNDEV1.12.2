package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBrochoadmones extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer leftSpine2;
    private final AdvancedModelRenderer rightSpine2;
    private final AdvancedModelRenderer leftSpine3;
    private final AdvancedModelRenderer rightSpine3;
    private final AdvancedModelRenderer leftSpine4;
    private final AdvancedModelRenderer rightSpine4;
    private final AdvancedModelRenderer leftSpine5;
    private final AdvancedModelRenderer rightSpine5;
    private final AdvancedModelRenderer leftSpine6;
    private final AdvancedModelRenderer rightSpine6;
    private final AdvancedModelRenderer leftSpine7;
    private final AdvancedModelRenderer rightSpine7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    public ModelBrochoadmones() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 17, 10, -1.0F, -6.8134F, -1.558F, 2, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.7069F, -5.1452F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 32, -0.5F, -2.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -2.3135F, -2.2136F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0592F, 0.7409F, 0.0399F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 20, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -2.3135F, -2.2136F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0592F, -0.7409F, -0.0399F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 20, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -0.9F, -0.2F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.5F, -4.0F, -4.95F, 3, 4, 5, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.575F, -2.043F, -7.2264F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 31, -0.5F, -0.55F, -0.425F, 1, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 31, 0.65F, -0.55F, -0.425F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.4176F, -7.7217F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 5, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -3.3356F, -6.5722F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5672F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 30, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -4.9944F, -5.0521F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.829F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 16, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -6.212F, -3.4654F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 29, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -6.5127F, -2.5117F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.0036F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 22, 1.5F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -6.8134F, -1.558F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 16, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.5F, -6.3635F, 3.3908F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.8639F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 22, 2.5F, 0.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -6.8134F, 1.442F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2269F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 20, 0.5F, 0.0F, 0.0F, 2, 2, 3, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, -0.9F, -0.2F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.5F, -4.0F, 0.0F, 3, 4, 5, 0.01F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.45F, -2.4F, -1.95F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.6898F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 29, 36, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.45F, -2.4F, -1.95F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.6898F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 29, 36, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(0.9F, -0.9F, -4.8F);
        this.main.addChild(leftSpine);
        this.setRotateAngle(leftSpine, 0.4408F, 0.1964F, -0.3922F);
        this.leftSpine.cubeList.add(new ModelBox(leftSpine, 37, 17, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-0.9F, -0.9F, -4.8F);
        this.main.addChild(rightSpine);
        this.setRotateAngle(rightSpine, 0.4408F, -0.1964F, 0.3922F);
        this.rightSpine.cubeList.add(new ModelBox(rightSpine, 37, 17, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.leftSpine2 = new AdvancedModelRenderer(this);
        this.leftSpine2.setRotationPoint(0.6F, -0.9F, -3.8F);
        this.main.addChild(leftSpine2);
        this.setRotateAngle(leftSpine2, 0.6527F, 0.2448F, -0.3649F);
        this.leftSpine2.cubeList.add(new ModelBox(leftSpine2, 20, 37, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.rightSpine2 = new AdvancedModelRenderer(this);
        this.rightSpine2.setRotationPoint(-0.6F, -0.9F, -3.8F);
        this.main.addChild(rightSpine2);
        this.setRotateAngle(rightSpine2, 0.6527F, -0.2448F, 0.3649F);
        this.rightSpine2.cubeList.add(new ModelBox(rightSpine2, 20, 37, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.leftSpine3 = new AdvancedModelRenderer(this);
        this.leftSpine3.setRotationPoint(0.4F, -0.9F, -2.8F);
        this.main.addChild(leftSpine3);
        this.setRotateAngle(leftSpine3, 0.8239F, 0.3297F, -0.2912F);
        this.leftSpine3.cubeList.add(new ModelBox(leftSpine3, 34, 36, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.rightSpine3 = new AdvancedModelRenderer(this);
        this.rightSpine3.setRotationPoint(-0.4F, -0.9F, -2.8F);
        this.main.addChild(rightSpine3);
        this.setRotateAngle(rightSpine3, 0.8239F, -0.3297F, 0.2912F);
        this.rightSpine3.cubeList.add(new ModelBox(rightSpine3, 34, 36, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.leftSpine4 = new AdvancedModelRenderer(this);
        this.leftSpine4.setRotationPoint(0.4F, -0.9F, -1.3F);
        this.main.addChild(leftSpine4);
        this.setRotateAngle(leftSpine4, 0.9581F, 0.3644F, -0.2455F);
        this.leftSpine4.cubeList.add(new ModelBox(leftSpine4, 37, 9, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.rightSpine4 = new AdvancedModelRenderer(this);
        this.rightSpine4.setRotationPoint(-0.4F, -0.9F, -1.3F);
        this.main.addChild(rightSpine4);
        this.setRotateAngle(rightSpine4, 0.9581F, -0.3644F, 0.2455F);
        this.rightSpine4.cubeList.add(new ModelBox(rightSpine4, 37, 9, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.leftSpine5 = new AdvancedModelRenderer(this);
        this.leftSpine5.setRotationPoint(0.4F, -0.9F, -0.2F);
        this.main.addChild(leftSpine5);
        this.setRotateAngle(leftSpine5, 1.0494F, 0.3843F, -0.2121F);
        this.leftSpine5.cubeList.add(new ModelBox(leftSpine5, 37, 13, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.rightSpine5 = new AdvancedModelRenderer(this);
        this.rightSpine5.setRotationPoint(-0.4F, -0.9F, -0.2F);
        this.main.addChild(rightSpine5);
        this.setRotateAngle(rightSpine5, 1.0494F, -0.3843F, 0.2121F);
        this.rightSpine5.cubeList.add(new ModelBox(rightSpine5, 37, 13, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.leftSpine6 = new AdvancedModelRenderer(this);
        this.leftSpine6.setRotationPoint(0.5137F, -1.1092F, 1.3981F);
        this.main.addChild(leftSpine6);
        this.setRotateAngle(leftSpine6, 1.0494F, 0.3843F, -0.2121F);
        this.leftSpine6.cubeList.add(new ModelBox(leftSpine6, 17, 37, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.rightSpine6 = new AdvancedModelRenderer(this);
        this.rightSpine6.setRotationPoint(-0.5137F, -1.1092F, 1.3981F);
        this.main.addChild(rightSpine6);
        this.setRotateAngle(rightSpine6, 1.0494F, -0.3843F, 0.2121F);
        this.rightSpine6.cubeList.add(new ModelBox(rightSpine6, 17, 37, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.leftSpine7 = new AdvancedModelRenderer(this);
        this.leftSpine7.setRotationPoint(0.8F, -1.2916F, 2.7743F);
        this.main.addChild(leftSpine7);
        this.setRotateAngle(leftSpine7, 0.8047F, 0.3093F, -0.4295F);
        this.leftSpine7.cubeList.add(new ModelBox(leftSpine7, 12, 34, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.rightSpine7 = new AdvancedModelRenderer(this);
        this.rightSpine7.setRotationPoint(-0.8F, -1.2916F, 2.7743F);
        this.main.addChild(rightSpine7);
        this.setRotateAngle(rightSpine7, 0.8047F, -0.3093F, 0.4295F);
        this.rightSpine7.cubeList.add(new ModelBox(rightSpine7, 12, 34, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.5807F, -6.0545F);
        this.main.addChild(jaw);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.8738F, 0.9093F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 36, -0.5F, -1.0F, -2.6F, 2, 1, 1, -0.006F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 34, -0.5F, -1.0F, -2.0F, 2, 1, 1, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.0561F, 4.0717F);
        this.main.addChild(tail);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -2.2363F, 0.3248F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.384F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 21, -0.5F, 0.175F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.5F, 2.278F, -0.1992F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6152F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 34, 2.5F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 2.5035F, 0.6855F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 26, 0.5F, -3.0F, 0.0F, 2, 3, 2, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.075F, 1.8F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.755F, 2.2313F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.8203F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 0, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.4865F, 5.2591F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4014F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 0, -0.025F, -0.25F, -6.0F, 0, 3, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.3248F, 0.1136F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2269F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 34, 0.5F, 0.0F, 5.05F, 0, 1, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 29, 26, 0.0F, 0.0F, 2.05F, 1, 1, 3, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 10, 0.0F, 0.0F, -0.95F, 1, 2, 3, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.755F, 2.2313F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6021F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 31, -0.5F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.15F;
        this.main.offsetZ = 0.07F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.1F, 0.1F, 0.1F);
        this.main.offsetX = -0.005F;
        this.main.offsetZ = -0.03F;
        this.main.offsetY = 0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.25F;
        this.main.offsetX = 3.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 5.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
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
        //this.Brochoadmones.offsetY = 1.25F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.28F;
        if (!e.isInWater()) {
            speed = 0.676F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            //this.chainWave(fishTail, speed, 0.02F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.115F, -0.5, f2, 1);
            this.swing(main, speed, 0.11F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), -0.35F, true, 0, -0.35F, f2, 1);

            this.flap(rightSpine7, speed * 0.7F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(leftSpine7, speed * 0.7F, -0.75F, false, 0F, 0.3F, f2, 1F);

            this.flap(frontRightFin, speed * 0.8F, 0.45F, false, 1F, -0.1F, f2, 1F);
            this.flap(frontLeftFin, speed * 0.8F, -0.45F, false, 1F, 0.1F, f2, 1F);
            this.swing(frontRightFin, speed * 0.8F, 0.45F, false, 1F, -0.2F, f2, 1F);
            this.swing(frontLeftFin, speed * 0.8F, -0.45F, false, 1F, 0.2F, f2, 1F);

            this.flap(rightSpine, speed * 0.9F, 0.25F, false, 0F, -0.1F, f2, 1F);
            this.flap(leftSpine, speed * 0.9F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(rightSpine, speed * 0.9F, 0.65F, false, 0F, -0.2F, f2, 1F);
            this.swing(leftSpine, speed * 0.9F, -0.65F, false, 0F, 0.2F, f2, 1F);

            this.flap(rightSpine2, speed * 0.9F, 0.25F, false, 2.0F, -0.1F, f2, 1F);
            this.flap(leftSpine2, speed * 0.9F, -0.25F, false, 2.0F, 0.1F, f2, 1F);
            this.swing(rightSpine2, speed * 0.9F, 0.65F, false, 2.0F, -0.2F, f2, 1F);
            this.swing(leftSpine2, speed * 0.9F, -0.65F, false, 2.0F, 0.2F, f2, 1F);

            this.flap(rightSpine3, speed * 0.9F, 0.25F, false, 1.0F, -0.1F, f2, 1F);
            this.flap(leftSpine3, speed * 0.9F, -0.25F, false, 1.0F, 0.1F, f2, 1F);
            this.swing(rightSpine3, speed * 0.9F, 0.65F, false, 1.0F, -0.2F, f2, 1F);
            this.swing(leftSpine3, speed * 0.9F, -0.65F, false, 1.0F, 0.2F, f2, 1F);

            this.flap(rightSpine4, speed * 0.9F, 0.25F, false, 3.0F, -0.1F, f2, 1F);
            this.flap(leftSpine4, speed * 0.9F, -0.25F, false, 3.0F, 0.1F, f2, 1F);
            this.swing(rightSpine4, speed * 0.9F, 0.65F, false, 3.0F, -0.2F, f2, 1F);
            this.swing(leftSpine4, speed * 0.9F, -0.65F, false, 3.0F, 0.2F, f2, 1F);

            this.flap(rightSpine5, speed * 0.9F, 0.25F, false, 2.0F, -0.1F, f2, 1F);
            this.flap(leftSpine5, speed * 0.9F, -0.25F, false, 2.0F, 0.1F, f2, 1F);
            this.swing(rightSpine5, speed * 0.9F, 0.65F, false, 2.0F, -0.2F, f2, 1F);
            this.swing(leftSpine5, speed * 0.9F, -0.65F, false, 2.0F, 0.2F, f2, 1F);

            this.flap(rightSpine6, speed * 0.9F, 0.25F, false, 4.0F, -0.1F, f2, 1F);
            this.flap(leftSpine6, speed * 0.9F, -0.25F, false, 4.0F, 0.1F, f2, 1F);
            this.swing(rightSpine6, speed * 0.9F, 0.65F, false, 4.0F, -0.2F, f2, 1F);
            this.swing(leftSpine6, speed * 0.9F, -0.65F, false, 4.0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
