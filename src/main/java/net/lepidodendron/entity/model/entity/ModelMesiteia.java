package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMesiteia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;

    public ModelMesiteia() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -1.975F, -4.0F, 3, 2, 4, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 7, -1.5F, -0.8F, -4.0F, 3, 1, 4, -0.006F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -0.1F, -2.75F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, 0.2618F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.frontLeftFin.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 0, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -0.1F, -2.75F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, -0.2618F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.frontRightFin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 0, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 13, -1.5F, -1.4F, 0.0F, 3, 2, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.5061F, 0.5526F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0567F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 10, -0.5F, 0.0F, -0.025F, 2, 1, 2, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 0.5F, 2.0F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, 0.1745F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.25F, -0.1F, 0.0F);
        this.backLeftFin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 27, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 0.5F, 2.0F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0F, -0.1745F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.25F, -0.1F, 0.0F);
        this.backRightFin.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 27, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.35F, 2.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 13, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 18, 0.0F, -1.75F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1134F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 0, -1.0F, -0.85F, 0.075F, 2, 1, 4, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 3.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 19, -0.5F, -0.475F, 0.0F, 1, 1, 3, 0.003F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 28, 0.0F, -1.225F, 0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1265F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 19, -0.5F, -0.925F, 0.075F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, 0.5F, 0.25F, -0.3F, 0, 1, 4, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 6, 0.0F, -0.5F, -0.3F, 1, 1, 4, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 14, 28, -0.5F, -1.0F, -5.7F, 1, 1, 1, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 24, -1.0F, -1.0F, -4.7F, 2, 1, 2, 0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.3772F, -1.6552F, -4.04F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0503F, -0.1189F, -0.0406F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 30, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.6212F, 0.0F, -3.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 30, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.1883F, 0.0F, -4.9526F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.7592F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 3, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.6212F, 0.0F, -3.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 23, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.006F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.1883F, 0.0F, -4.9526F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.7592F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 3, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.6212F, 0.0F, -3.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.1309F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 30, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.6212F, 0.0F, -3.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2182F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 23, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.006F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.3772F, -1.6552F, -4.04F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0503F, 0.1189F, 0.0406F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 30, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.7F, -1.0802F, -4.351F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3237F, -0.3323F, -0.109F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 29, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.7F, -1.0802F, -4.351F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3237F, 0.3323F, 0.109F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 29, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -2.1891F, -0.939F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0916F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 6, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -2.0235F, -2.9321F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0829F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 25, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.5736F, -4.8808F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2269F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 14, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.0F, -5.7F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6109F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 19, 28, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.375F, -2.7F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 24, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 31, -0.5F, -0.5F, -2.95F, 1, 1, 1, -0.006F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.0F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.5F;
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
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                //this.Root.offsetY = 1.55F;
                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed * 0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);

            this.flap(frontLeftFin, speed * 2.5F, 0.3F, false, 0, 0, f2, 1);
            this.flap(frontRightFin, speed * 2.5F, -0.3F, false, 0, 0, f2, 1);
            this.chainWave(fishTail, speed * 2.5F, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 2.5F, 0.25F, -3, f2, 1);


        }
    }
}
