package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMaraldichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer analFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    public ModelMaraldichthys() {
        this.textureWidth = 39;
        this.textureHeight = 39;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 14, 29, 0.0F, -23.4421F, -1.0596F, 0, 8, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.4736F, -2.5058F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.4399F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 17, -0.5F, 0.0F, -4.65F, 1, 1, 5, 0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6F, -9.915F, -1.7199F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 2.7925F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 34, -0.5F, -0.1F, -0.2F, 1, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 34, 0.7F, -0.1F, -0.2F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -9.6845F, -2.6401F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 2.138F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 24, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -10.6835F, -2.6837F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.6144F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 6, -0.5F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -12.4962F, -1.8385F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 0, -1.5F, 0.0F, -2.0F, 2, 2, 3, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.025F, -6.8316F, 1.7947F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.5446F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 29, -0.025F, 0.0F, -3.75F, 0, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.025F, -10.8302F, 1.69F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.2828F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, 0.0F, 0.0F, -2.4F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.4529F, 0.7533F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.7279F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 10, 0.0F, -0.5F, -3.5F, 0, 1, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.2948F, 0.6446F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.6406F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, -0.325F, -0.65F, 1, 1, 8, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -7.9258F, 0.9394F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.6232F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 6, -0.5F, -0.075F, -3.0F, 1, 1, 3, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.1419F, -0.0164F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.4573F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 10, -0.5F, -0.425F, -5.0F, 1, 1, 5, -0.006F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -7.2247F, -1.6158F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.2654F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 11, -0.5F, -1.675F, -0.25F, 1, 1, 3, -0.006F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 25, -0.5F, -0.75F, 0.0F, 1, 1, 3, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -7.343F, -1.1805F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.0908F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 30, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -7.5921F, 0.3809F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.0908F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 34, -0.5F, 1.0F, -2.0F, 1, 1, 1, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -7.5921F, 0.3809F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2094F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 19, -0.5F, -3.0F, -2.0F, 2, 3, 2, -0.006F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.1F, -23.4857F, -1.3587F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 30, -0.125F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -15.4933F, -1.7076F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 21, -0.5F, 1.025F, -0.075F, 1, 2, 1, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -15.4933F, -1.7076F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2356F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 29, -0.5F, 0.175F, 0.725F, 1, 5, 1, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -12.4962F, -1.8385F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 19, -0.5F, -11.0F, 0.0F, 1, 11, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -12.5F, 0.0F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 24, -0.5F, 0.25F, -1.825F, 2, 2, 2, -0.003F, false));

        this.analFin = new AdvancedModelRenderer(this);
        this.analFin.setRotationPoint(0.0F, -13.4083F, 0.1732F);
        this.main.addChild(analFin);
        this.setRotateAngle(analFin, 1.0036F, 0.0F, 0.0F);
        this.analFin.cubeList.add(new ModelBox(analFin, 28, 16, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.95F, -8.6604F, 0.2525F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0873F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.025F, 0.0F, 0.0F);
        this.backLeftFin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.48F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 0, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.95F, -8.6604F, 0.2525F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0873F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.025F, 0.0F, 0.0F);
        this.backRightFin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.48F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 0, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.5F, -0.4834F, -0.3984F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.6682F, 0.3879F, -0.2902F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 28, 21, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.5F, -0.4834F, -0.3984F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.6682F, -0.3879F, 0.2902F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 28, 21, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -15.0542F, -0.3719F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 1.0036F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 25, -0.025F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0634F, 1.6902F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3927F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 29, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.15F;
        this.main.offsetX = 1.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
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

             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetX = 0.40F;
//                this.bob(main, -speed, 5F, false, f2, 1);
            } else {
                 this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
                 this.swing(analFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

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
