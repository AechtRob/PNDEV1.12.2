package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRhamphoichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    public ModelRhamphoichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -4.0F, -7.0F, 4, 4, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 32, 26, 0.025F, -8.0F, -7.0F, 0, 4, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -4.0F, -7.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 43, 21, 0.5F, -4.0F, -2.8F, 0, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.4F, 1.737F, -5.1264F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1571F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 11, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 11, 0.2F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.6864F, -2.9836F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, -0.5F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 15, -0.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 2.3505F, -8.6961F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0131F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 26, -0.5F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.7107F, -7.1018F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2107F, -0.2306F, 0.0489F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 48, 0.0F, -0.5F, 0.0F, 1, 1, 2, -0.003F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 1.7107F, -7.1018F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2107F, 0.2306F, -0.0489F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 48, -1.0F, -0.5F, 0.0F, 1, 1, 2, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 2.2002F, -7.2037F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2051F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 48, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.055F, -5.8114F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1004F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 36, -0.5F, 0.0F, -3.0F, 1, 1, 4, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.6644F, -3.66F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1876F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 0, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4305F, -2.9689F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2749F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 47, -0.5F, 0.0F, -1.0F, 2, 2, 1, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.144F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 9, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.0F, 1.75F, -1.5F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.5236F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 49, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.0F, 1.75F, -1.5F);
        this.head.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.5236F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 49, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.3185F, -5.8761F);
        this.head.addChild(jaw);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0854F, -0.3485F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1178F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 44, -0.5F, -0.325F, -2.525F, 1, 1, 3, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.0F, -2.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 10, -2.0F, -2.0F, 0.0F, 4, 4, 5, 0.003F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 34, 0.0F, -5.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1136F, 4.5264F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 18, -1.5F, -1.8864F, -0.0264F, 3, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 0, -0.025F, -4.8864F, -0.0264F, 0, 3, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 2.1136F, -0.0264F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 20, -1.0F, -2.0F, 0.15F, 3, 2, 5, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 1.3636F, 4.2236F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.8017F, 0.3474F, -0.3382F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 13, 28, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 1.3636F, 4.2236F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.8017F, -0.3474F, 0.3382F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 13, 28, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1225F, 4.6438F);
        this.tail2.addChild(tail3);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -4.0089F, -0.1702F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0393F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 28, 1.5F, -1.0F, 0.2F, 0, 3, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -2.0089F, -0.1702F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0393F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 0, -0.5F, 0.0F, 0.2F, 2, 2, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.564F, 0.2112F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1527F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 36, 1.0F, -0.025F, 1.0F, 0, 1, 5, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 9, 0.0F, -2.0F, 0.0F, 2, 2, 6, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.0063F, -0.5497F, 5.4726F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 21, -0.4938F, -0.6106F, 0.0518F, 1, 1, 2, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5188F, -2.2106F, 0.0518F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 43, 0.5F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0063F, -1.2106F, 0.0518F);
        this.tail4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 43, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0063F, 1.2694F, 0.2239F);
        this.tail4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 42, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.003F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 43, 30, -0.025F, -0.025F, 0.0F, 0, 1, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(-0.0021F, -0.2272F, 3.8223F);
        this.tail4.addChild(tail5);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.4667F, -0.4885F, 3.067F);
        this.tail5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -3.1329F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 13, 34, 0.475F, -4.5F, -1.1F, 0, 9, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0083F, -0.9834F, -3.9706F);
        this.tail5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 47, 4, -0.5F, 0.0F, 4.0F, 1, 1, 2, -0.006F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0083F, 1.4967F, -3.7984F);
        this.tail5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2182F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 49, 8, -0.5F, -1.0F, 4.0F, 1, 1, 1, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(140);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.5F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.3f, 0.25F, 3, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed*0.3f, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetY = -0.20F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
