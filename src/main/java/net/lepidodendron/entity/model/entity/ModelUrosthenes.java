package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelUrosthenes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer cube_r23;

    public ModelUrosthenes() {
        this.textureWidth = 58;
        this.textureHeight = 56;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.2F, 1.225F);
        this.main.cubeList.add(new ModelBox(main, 0, 13, -1.5F, -3.449F, -4.9076F, 3, 6, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 37, -1.5F, -2.449F, -7.9076F, 3, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.3801F, 2.2391F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0131F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 0, -1.0F, -1.875F, -6.2F, 2, 2, 6, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.2104F, -5.9164F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 36, -1.0F, -0.925F, -1.95F, 2, 2, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.1389F, 1.4826F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2356F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, 0.0F, -9.9F, 2, 2, 10, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.5142F, 1.902F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 27, -1.0F, -1.2858F, -0.802F, 2, 4, 5, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.2747F, 4.3102F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5803F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 28, 0.0F, -2.2F, -3.9F, 0, 7, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.3281F, 0.2495F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4232F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 28, -0.5F, 0.0F, -0.575F, 1, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.8969F, 1.382F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3272F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 9, -1.0F, -1.5F, -2.15F, 2, 3, 5, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, -1.2065F, -2.2518F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.8988F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 28, 2.0F, -8.6F, -0.95F, 0, 7, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6678F, 4.1713F);
        this.tail.addChild(tail2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.2379F, 0.0711F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4538F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 49, -0.5F, 0.075F, -0.2F, 1, 1, 3, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.4249F, 1.0528F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4145F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 41, -0.5F, -1.1F, -1.5F, 1, 2, 4, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.6069F, 0.1388F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5803F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 43, -0.025F, -2.2F, 0.8F, 0, 7, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, -1.8742F, -6.4231F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.8988F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 48, 1.975F, -8.6F, 3.475F, 0, 4, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.1536F, 1.9267F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 32, -0.5F, -0.85F, -2.525F, 1, 3, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 48, -0.5F, -0.85F, -2.025F, 1, 2, 3, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5464F, 2.5267F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 13, 0.0F, -2.975F, -0.45F, 0, 7, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.2F, 1.1F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 41, -0.5F, -0.675F, -1.15F, 1, 1, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.7F, -0.6F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 37, -0.5F, -0.85F, 0.975F, 1, 2, 1, 0.01F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.975F, 1.825F, -6.925F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.6256F, -0.5293F, 0.2145F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 46, 0.0F, -1.5F, 0.0F, 0, 3, 4, 0.0F, true));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.8525F, 2.8015F, -3.385F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.6412F, -0.0818F, 0.1076F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 36, 18, 0.0F, -2.5F, 0.0F, 0, 3, 6, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.975F, 1.825F, -6.925F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.6256F, 0.5293F, -0.2145F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 46, 0.0F, -1.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.8525F, 2.8015F, -3.385F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.6412F, 0.0818F, -0.1076F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 36, 18, 0.0F, -2.5F, 0.0F, 0, 3, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.4524F, -7.8432F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 44, 43, -1.5F, -1.2994F, -1.2664F, 3, 3, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.0767F, -1.9977F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2967F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 49, 23, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.5131F, -3.1493F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.2985F, -0.2104F, 0.0582F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 51, 7, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 0.5131F, -3.1493F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.2985F, 0.2104F, -0.0582F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 7, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.5131F, -3.1493F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.3046F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 18, -1.0F, 0.0F, 0.0F, 2, 2, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.6973F, -2.8116F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.9556F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 28, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -3.2982F, -0.2744F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5629F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 0, -1.0F, 0.0F, -3.0F, 2, 3, 3, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2303F, -2.0384F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7854F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.8722F, -0.1317F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.0908F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 9, -0.5F, -0.725F, -2.4F, 2, 1, 2, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.8722F, -0.1317F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.8727F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 48, -0.5F, -1.275F, -2.4F, 2, 1, 3, -0.02F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.275F, -0.9994F, -2.7914F);
        this.head.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.2618F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.175F, -0.1F, -0.2F);
        this.leftEye.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 51, 11, -0.35F, 0.2F, 0.125F, 1, 1, 1, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 51, 11, 1.15F, 0.2F, 0.125F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.09F;
        this.main.offsetY = -0.16F;
        this.main.offsetZ = 0.07F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.0F;
        this.main.offsetY = -0.3F;
        this.main.offsetZ = -0.002F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
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
        this.main.offsetY = -0.6F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.28F;
        if (!e.isInWater()) {
            speed = 0.68F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.85F, -3, f2, 1);
            this.swing(main, speed, 0.4F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), -0.3F, true, 0, -0.3F, f2, 1);
            this.walk(frontLeftFin, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.4F, true, 2, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.4F, true, 2, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.4F, true, 2, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.4F, true, 2, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.3F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
