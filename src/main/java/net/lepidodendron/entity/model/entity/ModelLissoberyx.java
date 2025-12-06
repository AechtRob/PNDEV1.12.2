package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLissoberyx extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;

    public ModelLissoberyx() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.112F, 19.7743F, -2.7792F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.612F, -2.7744F, -0.4708F, 3, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.612F, -2.7744F, 2.5292F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 9, -0.5F, 0.0F, 0.0F, 2, 4, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.612F, 3.0826F, 2.5932F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4625F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 17, -0.5F, -2.0F, 0.0F, 2, 2, 3, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.612F, 3.4222F, -0.3875F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3752F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 0, -0.5F, -2.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.612F, 3.2256F, 1.7792F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1134F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 0, -0.5F, -2.05F, -2.175F, 2, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.612F, -2.7744F, 2.0292F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, 0.5F, -2.5F, -1.5F, 0, 3, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.112F, -0.0034F, -4.2203F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.9238F, -0.0766F, 0.0318F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 30, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.888F, -0.0034F, -4.2203F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9238F, 0.0766F, -0.0318F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 30, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.612F, -0.9273F, -3.8376F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.1781F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 25, -0.5F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.612F, -0.9273F, -3.1305F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.9199F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 6, 0.4F, 0.15F, -0.85F, 1, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 6, 1.6F, 0.15F, -0.85F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.612F, -2.3415F, -2.4234F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7854F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 23, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.006F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.612F, -2.7744F, -0.4708F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 18, -0.5F, 0.0F, -2.0F, 2, 4, 2, 0.009F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.112F, 0.2458F, 4.1025F);
        this.main.addChild(tail);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.3778F, 1.198F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.8727F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 21, 0.5F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.3456F, 2.2967F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6545F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 11, -0.5F, -1.85F, -1.95F, 1, 2, 3, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.1632F, 0.9907F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 25, -0.5F, 0.0F, 0.0F, 1, 2, 2, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.8322F, 2.3404F);
        this.tail.addChild(tail2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.3759F, 1.7791F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3142F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 28, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.181F, 1.1502F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 17, -0.5F, -0.5F, -1.325F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.081F, 1.4002F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 17, 0.0F, -2.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.388F, 0.7256F, 0.5292F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.3155F, 0.2494F, -0.0804F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 30, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.612F, 0.7256F, 0.5292F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.3155F, -0.2494F, 0.0804F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 30, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.888F, 2.7025F, 0.8788F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.2706F, 0.2527F, -0.0692F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 19, 30, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.112F, 2.7025F, 0.8788F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.2706F, -0.2527F, 0.0692F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 19, 30, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.112F, 1.0388F, -1.463F);
        this.main.addChild(jaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.2892F, -2.9683F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7069F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 6, -0.5F, -1.0F, 0.0F, 2, 1, 3, -0.006F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -1.9661F, -2.3746F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.1781F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 25, -0.5F, 0.0F, -1.825F, 2, 3, 1, -0.003F, false));

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
        float scaler = 5.0F;
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
