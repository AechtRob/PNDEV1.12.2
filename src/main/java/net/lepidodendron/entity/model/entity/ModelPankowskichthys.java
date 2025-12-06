package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPankowskichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer spine;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;

    public ModelPankowskichthys() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -4.0F, -1.25F, 2, 3, 2, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.1345F, -5.0814F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 24, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.6718F, -4.238F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -0.5F, -1.0F, -0.175F, 2, 1, 2, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.2091F, -3.3946F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 4, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -3.5579F, -3.8199F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0908F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 12, -0.5F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -3.8586F, -2.8662F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -1.525F, 0.4F, -0.8F, 1, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -0.475F, 0.4F, -0.8F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 22, -1.5F, 0.0F, -1.0F, 2, 1, 1, -0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -2.7753F, -1.9571F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 21, -0.5F, -1.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -4.0F, -1.25F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 6, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.8F, -1.1057F, -2.577F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1281F, 0.4791F, 0.0295F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 13, 0.0F, -0.5F, -1.2F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.8F, -1.1057F, -2.577F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1281F, -0.4791F, -0.0295F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 13, 0.0F, -0.5F, -1.2F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.4329F, -1.1462F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1178F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 0, -0.5F, -2.0F, -2.0F, 2, 2, 2, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -0.6014F, -0.1566F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0669F, -0.1276F, 1.0866F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 5, 25, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -0.6014F, -0.1566F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0669F, 0.1276F, -1.0866F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 25, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.5764F, -0.1566F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.144F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 18, -0.5F, -1.0F, -1.0F, 2, 1, 1, -0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.25F, -0.25F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 15, -0.5F, -0.35F, -0.2F, 2, 1, 1, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.8F, -0.9F, 0.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.4531F, 0.272F, -0.5042F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 2, 28, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.8F, -0.9F, 0.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.4531F, -0.272F, 0.5042F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 2, 28, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.spine = new AdvancedModelRenderer(this);
        this.spine.setRotationPoint(-0.5F, -4.0F, -1.25F);
        this.main.addChild(spine);
        this.setRotateAngle(spine, 0.1745F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -3.1926F, 4.7781F);
        this.spine.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 11, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.4982F, 3.1228F);
        this.spine.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 25, 1.0F, -1.3F, 1.7F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 7, 1.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.4982F, 3.1228F);
        this.spine.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6981F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 10, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.0365F, 2.2358F);
        this.spine.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 10, 1.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.48F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 5, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, -0.075F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 9, 19, -1.0F, -2.7301F, 0.5817F, 2, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, -1.3373F, 0.9537F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6109F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 25, 4, 1.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -2.5551F, 2.1067F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3491F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 16, -0.5F, 0.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, -4.0F, 0.75F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.8072F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 23, 21, 1.5F, -0.4F, 0.0F, 0, 1, 2, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 15, 0.5F, 0.0F, 0.0F, 2, 1, 2, -0.006F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.0924F, 1.8226F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 24, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.tail2.addChild(tail3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.7854F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 20, 0.5F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.6706F, -3.0118F);
        this.main.addChild(jaw);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.2512F, -1.5262F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 5, 20, -0.5F, -0.25F, 0.1F, 1, 1, 0, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 8, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = -0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 6.0F;
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



            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                //this.body.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
