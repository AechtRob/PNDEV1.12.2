package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHadronector extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    public ModelHadronector() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.5F, 25.4F, 2.25F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -9.5F, -9.25F, 4, 7, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -10.875F, -5.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 27, 0.0F, -3.0013F, 0.0063F, 0, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -10.875F, -5.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 12, -1.5F, -0.0013F, 0.0063F, 3, 2, 5, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -10.0F, -7.25F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 0, -1.5F, -0.225F, -2.05F, 3, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.8F, -5.35F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0654F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 28, -1.5F, -0.967F, -0.0059F, 3, 1, 4, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -2.0F, -7.25F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 28, -1.5F, -1.1F, -2.1F, 3, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -9.5F, -9.25F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 33, 0, -1.5F, 3.1885F, -2.1421F, 3, 3, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.025F, -2.825F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 14, -1.0F, 0.003F, -1.9948F, 2, 2, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.6439F, -4.5903F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 20, -1.0F, -0.75F, 0.35F, 2, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.25F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1833F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 41, -1.0F, -1.575F, -4.1F, 2, 2, 2, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.25F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1396F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 20, -1.5F, -1.65F, -2.075F, 3, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.4109F, -4.116F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 5, -1.0F, -0.375F, -0.95F, 2, 1, 2, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 4.05F, -3.2F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6065F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 35, -1.0F, -0.4115F, -0.9421F, 2, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 7.0F, -0.025F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 39, -1.0F, -1.0F, -2.925F, 2, 1, 3, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 34, -1.5F, 0.0F, -3.0F, 3, 3, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 5.2098F, -2.5119F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.48F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 16, -0.5F, -0.4457F, -2.7704F, 2, 1, 3, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.4293F, -1.2704F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 41, 0.0F, -0.675F, -1.45F, 1, 1, 3, -0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.0625F, 2.575F, -2.45F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0154F, 0.1739F, 0.0886F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.4375F, 0.0F, 0.0F);
        this.eye.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 12, -0.9F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 45, -0.975F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.0625F, 2.575F, -2.45F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.0154F, -0.1739F, -0.0886F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.4375F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 12, -0.1F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 45, -0.025F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.125F, -5.25F, -7.675F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.8727F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 11, 28, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 41, 0.0F, -2.5F, 0.5F, 0, 4, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.125F, -5.25F, -7.675F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.8727F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 11, 28, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 41, 0.0F, -2.5F, 0.5F, 0, 4, 3, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(bone);


        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, -2.6308F, -5.7299F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.3487F, 0.5972F, -0.0943F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 41, 26, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 16, 42, 0.0F, -1.25F, 1.5F, 0, 2, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.0F, -2.6308F, -5.7299F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.3487F, -0.5972F, 0.0943F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 41, 26, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 16, 42, 0.0F, -1.25F, 1.5F, 0, 2, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -7.0F, -1.25F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -1.5F, -2.0F, -0.5F, 3, 6, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 5.233F, 2.8441F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7418F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 32, 0.0F, -1.0F, -2.0F, 0, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 5.2F, -4.1F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0654F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 43, 41, -1.0F, -0.967F, 3.9441F, 2, 1, 2, -0.03F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.3708F, 0.525F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, -4.0F, -0.775F, 0, 4, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 23, 44, -0.5F, -1.0F, -0.775F, 1, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.025F, 3.7656F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 35, -1.0F, -1.025F, 0.7344F, 2, 2, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 38, -1.0F, -1.025F, -0.2656F, 2, 2, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 0, 0.0F, -4.275F, 0.7344F, 0, 4, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 16, 0.0F, 0.425F, 0.7344F, 0, 4, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 8, -0.5F, -0.525F, 4.7344F, 1, 1, 4, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.025F, 8.7594F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.7418F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 16, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -3.025F, 0.7344F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.4581F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 31, -1.0F, 0.0F, 0.0F, 1, 2, 5, 0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 2.975F, 0.7344F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4581F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 27, 23, -1.0F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = -0.32F;
        this.main.offsetY = -0.18F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.main.offsetY = -0.14F;
        this.main.render(0.01F);
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
