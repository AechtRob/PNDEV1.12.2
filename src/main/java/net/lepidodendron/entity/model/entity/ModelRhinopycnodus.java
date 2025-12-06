package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRhinopycnodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;

    public ModelRhinopycnodus() {
        this.textureWidth = 52;
        this.textureHeight = 52;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 15, -1.5F, -11.5F, -3.975F, 3, 8, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -12.25F, -1.0F, 4, 9, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -13.7333F, 3.1887F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7679F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 44, 1.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -13.8639F, 2.9755F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5498F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 39, -1.0F, 0.0F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.9135F, 3.7744F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.8727F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 44, 1.0F, -1.95F, -0.7F, 0, 3, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.3388F, 2.4257F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 6, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0777F, 0.4428F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 40, -1.0F, -2.0F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -14.0204F, 1.9878F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 21, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -13.6387F, 0.0246F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.192F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 16, -1.0F, 0.0F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -8.9032F, -5.6394F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 10, -0.5F, -1.0F, -1.0F, 2, 2, 2, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -8.2134F, -7.7875F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 38, -0.5F, 0.0F, 2.0F, 2, 3, 2, 0.006F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 6, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.009F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -7.5686F, -8.7995F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 29, -0.5F, 0.0F, -1.8F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -10.6328F, -6.2284F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.8727F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 10, -0.5F, 0.0F, -4.0F, 2, 1, 4, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.65F, -10.3872F, -4.8357F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 46, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 46, 0.8F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -11.7799F, -4.5901F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6109F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 36, -0.5F, 0.0F, -2.0F, 2, 3, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -9.28F, -2.4992F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 22, -0.5F, -2.825F, -1.625F, 2, 4, 2, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -13.2228F, -0.8852F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4538F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 24, -0.5F, 0.025F, -3.0F, 2, 3, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -2.9435F, -3.4624F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 15, -0.5F, -3.0F, -5.0F, 2, 3, 5, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -2.5F, -1.0F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 27, -0.5F, -1.9F, -2.5F, 2, 2, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -6.4082F, -2.2382F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.2449F, 0.4677F, -0.1122F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 20, 38, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -6.4082F, -2.2382F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.2449F, -0.4677F, 0.1122F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 20, 38, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, -2.8F, 0.0F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.6799F, 0.422F, -0.3198F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 45, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, -2.8F, 0.0F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.6799F, -0.422F, 0.3198F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 45, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.955F, 3.0043F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 19, 0, -1.5F, -2.895F, -0.0043F, 3, 6, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -4.8639F, 1.6765F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.8988F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 43, 0, 0.975F, -0.75F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 0, 0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 4.6927F, 1.1954F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.829F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 39, 0.975F, -0.1F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 4.6927F, 1.1954F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6981F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 13, 32, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6037F, 2.485F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 16, -1.0F, -0.7487F, 0.0107F, 2, 2, 3, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.975F, -3.1198F, 1.059F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.0734F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 9, 44, 1.0F, -0.5F, -0.1F, 0, 1, 3, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 34, -0.025F, 0.0F, 0.0F, 2, 2, 3, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 2.1606F, 1.0086F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9599F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 46, 1.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.1606F, 1.0086F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.8727F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 41, 11, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 24, 0.0F, -3.7487F, 0.0107F, 0, 7, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -7.2345F, -6.8661F);
        this.main.addChild(jaw);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.5139F, -1.1118F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.48F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 25, -0.5F, -1.0F, 0.0F, 2, 1, 1, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -0.1355F, -0.384F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 44, -0.5F, 0.0F, 0.0F, 2, 1, 1, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.3341F, -1.9334F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.5672F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 22, 0.0F, 0.75F, -1.7F, 1, 1, 0, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 20, 42, -0.5F, 0.1F, 0.0F, 2, 1, 2, -0.006F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 35, 34, -0.5F, 1.0F, -1.8F, 2, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.25F;
        this.main.offsetX = 0.F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.2F;
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
                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
