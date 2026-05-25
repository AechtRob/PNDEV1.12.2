package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGemuendenaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;


    public ModelGemuendenaspis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -3.25F, -3.25F, 4, 3, 6, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 10, -1.0F, -3.5F, -3.25F, 2, 1, 6, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 35, 39, 0.0F, -4.0F, -1.5F, 0, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 20, -1.5F, -1.0F, -1.25F, 3, 1, 4, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5936F, -0.5633F, -2.2019F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1647F, -1.0378F, 0.0718F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 29, -0.75F, -1.0F, -1.075F, 2, 1, 1, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.578F, -0.7511F, -4.43F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1371F, 0.9152F, -0.1793F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 36, -2.725F, -1.0F, 0.05F, 3, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5936F, -0.5633F, -2.2019F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1647F, 1.0378F, -0.0718F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 29, -1.25F, -1.0F, -1.075F, 2, 1, 1, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.578F, -0.7511F, -4.43F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1371F, -0.9152F, 0.1793F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 36, -0.275F, -1.0F, 0.05F, 3, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.1678F, -0.9858F, -6.8849F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.631F, 1.3806F, -0.5197F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 21, -4.0F, -2.0F, 0.0F, 4, 2, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.1678F, -0.9858F, -6.8849F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.631F, -1.3806F, 0.5197F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 21, 0.0F, -2.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.2852F, -2.3246F, -6.9422F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1519F, 0.8853F, 0.1711F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 39, -0.425F, -0.5F, -0.625F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.2852F, -2.3246F, -6.9422F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1519F, -0.8853F, -0.1711F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 39, -0.575F, -0.5F, -0.625F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.1391F, -2.5638F, -8.0528F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1633F, 1.0336F, 0.0791F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 39, -1.925F, 0.0F, 0.1F, 2, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.6057F, -8.303F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4718F, 0.7779F, -0.3948F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 26, -1.925F, -1.0F, 0.1F, 2, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.1391F, -2.5638F, -8.0528F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1633F, -1.0336F, -0.0791F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 39, -0.075F, 0.0F, 0.1F, 2, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -1.6057F, -8.303F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4718F, -0.7779F, 0.3948F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 26, -0.075F, -1.0F, 0.1F, 2, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -2.5147F, -7.2197F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 38, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.6713F, -7.757F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5672F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 5, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -2.9779F, -7.2158F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 38, -0.5F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -3.5F, -3.25F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 26, -0.5F, 0.0F, -4.0F, 2, 1, 4, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, 0.0F, -1.25F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 0, -0.5F, -1.0F, -5.0F, 4, 1, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 32, 0.0F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.4302F, -1.0F, -2.6144F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1504F, -0.5944F, 0.2643F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 30, 17, 0.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.4302F, -1.0F, -2.6144F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1504F, 0.5944F, -0.2643F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 30, 17, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0098F, -1.9543F, 2.3043F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 18, -1.4902F, -0.7957F, -0.0543F, 3, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.9902F, -1.4903F, 0.0065F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.2566F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 38, 1.0F, 0.4F, -0.275F, 0, 3, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0098F, -1.4903F, 0.0065F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1396F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 5, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0098F, 1.9043F, -0.0543F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 11, -1.0F, -0.95F, 0.025F, 2, 1, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0012F, 1.2847F, 2.5043F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.1301F, -0.2442F, 0.3116F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 38, 0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9817F, 1.2847F, 2.5043F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.1301F, 0.2442F, -0.3116F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 38, -2.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0181F, 0.6263F, 3.531F);
        this.tail.addChild(tail2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5083F, 0.7757F, 3.8291F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 26, -0.5F, -0.95F, -3.95F, 2, 1, 4, -0.006F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5083F, -1.5717F, -0.0722F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 25, -0.5F, 0.0F, 0.0F, 2, 2, 4, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0417F, -0.2579F, 3.3203F);
        this.tail2.addChild(tail3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0333F, 0.3859F, 3.9874F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 11, 32, -0.5F, -0.825F, -4.0F, 1, 1, 4, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0333F, -1.0087F, 0.0941F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 32, -0.5F, 0.05F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0333F, -0.1669F, 3.6757F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 32, -0.5F, -0.4125F, -0.2F, 1, 1, 4, -0.006F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 17, 10, 0.0F, -0.3875F, -0.2F, 0, 3, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.025F, -6.075F);
        this.main.addChild(jaw);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.5675F, -0.0714F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 0, -0.5F, -1.0F, -2.0F, 2, 1, 2, -0.003F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }}
