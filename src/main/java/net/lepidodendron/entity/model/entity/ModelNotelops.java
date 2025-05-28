package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelNotelops extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;

    public ModelNotelops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -7.2F, -5.0F, 4, 5, 7, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 23, 9, -1.5F, -4.9127F, -11.6301F, 3, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 51, 12, -1.5F, -5.7127F, -10.6301F, 3, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 54, -1.45F, -5.4627F, -11.1301F, 3, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 54, -1.55F, -5.4627F, -11.1301F, 3, 1, 1, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 17, 40, -1.5F, -8.1372F, -1.971F, 3, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.025F, -7.5622F, 1.754F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4102F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 54, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -6.4627F, -9.732F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 42, -0.5F, 0.0F, -4.0F, 3, 1, 4, 0.006F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -7.4888F, -6.913F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 44, -0.5F, 0.0F, -3.0F, 3, 2, 3, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.9845F, -6.9782F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 7, -1.5F, 0.5F, 0.0F, 3, 2, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 38, -1.5F, 0.5F, 2.0F, 3, 2, 3, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -3.7353F, -12.8151F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3123F, -0.1347F, 0.0369F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 48, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -3.7353F, -12.8151F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3123F, 0.1347F, -0.0369F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 48, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.7353F, -12.8151F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2662F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 17, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -1.2124F, 0.0461F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0785F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 50, -0.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -1.4741F, -4.9471F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 32, -0.5F, -2.0F, 0.0F, 3, 2, 5, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.4693F, -4.9037F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1004F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 41, -1.5F, -2.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -4.575F, -9.0F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0785F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 0, -2.0F, -1.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.18F, -4.8554F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2269F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 24, -2.0F, -0.85F, -4.175F, 4, 2, 5, -0.006F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.8F, -2.9004F, -5.7194F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.5405F, 0.3283F, -0.3603F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 51, 17, 0.0F, 0.0F, -0.75F, 0, 4, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.8F, -2.9004F, -5.7194F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.5405F, -0.3283F, 0.3603F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 51, 17, 0.0F, 0.0F, -0.75F, 0, 4, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -5.6225F, 1.6739F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 13, -2.0F, -1.1775F, -0.6739F, 4, 4, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -2.5109F, 0.2859F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4014F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 31, -1.5F, -4.0F, 0.0F, 0, 4, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -2.5166F, 0.2616F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2269F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 32, -0.5F, 0.0F, 0.025F, 3, 3, 5, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 4.2532F, 0.366F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1702F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 9, -0.5F, -2.0F, 0.0F, 3, 2, 5, 0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 3.2532F, 1.866F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.725F, 0.4079F, -0.338F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 51, 25, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 3.2532F, 1.866F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.725F, -0.4079F, 0.338F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 51, 25, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.1755F, 4.7939F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 0, -1.5F, -0.853F, 0.0322F, 3, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 1.7386F, 2.4383F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.9032F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 48, -1.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 2.2309F, 0.4999F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2487F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 47, 31, -0.5F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -2.5673F, 0.3395F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.384F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 47, -0.5F, 0.0F, 0.025F, 2, 2, 4, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0247F, 3.8293F);
        this.tail2.addChild(tail3);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.8282F, 0.2029F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1614F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 50, -0.5F, -0.2F, -0.4F, 2, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 1.2711F, 0.5476F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0131F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 48, -0.5F, -1.925F, -0.8F, 2, 2, 3, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0782F, 2.1029F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 21, 13, 0.0F, -6.0F, 0.0F, 0, 12, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.8027F, -8.6532F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.9076F, -4.162F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2662F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 24, -1.5F, -0.4F, 0.0F, 3, 1, 5, -0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = 0.5F;
        this.main.rotateAngleY = (float)Math.toRadians(252);
        this.main.rotateAngleX = (float)Math.toRadians(6);
        this.main.rotateAngleZ = (float)Math.toRadians(-6);
        this.main.scaleChildren = true;
        float scaler = 2.93F;
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
        this.setRotateAngle(main, 0.0F, 1.58F, 0.0F);
        this.main.offsetX = -0.03F;
        this.main.offsetY = -0.22F;
        this.main.offsetZ = -0.37F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.09F;
        this.main.offsetZ = 0.01F;
        this.main.render(0.01F);
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
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
                //this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
