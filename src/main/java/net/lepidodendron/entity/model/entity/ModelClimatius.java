package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelClimatius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftSpines;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightSpines;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;

    public ModelClimatius() {
        this.textureWidth = 39;
        this.textureHeight = 39;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.06F, 21.6019F, -4.0632F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.06F, -1.1019F, 0.0632F, 2, 2, 7, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 24, 28, -1.06F, -1.1019F, -1.9368F, 2, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.06F, 0.2722F, -2.2673F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.6581F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 6, -1.1F, -1.05F, -0.25F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 6, 0.1F, -1.05F, -0.25F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.06F, -0.2695F, -3.7218F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.4835F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 6, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.06F, -0.8431F, -2.9027F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 13, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.06F, -1.1019F, -1.9368F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 10, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.006F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.56F, 1.8942F, 2.1164F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1004F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -0.5F, -2.0F, 0.0F, 2, 2, 5, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.06F, 0.8981F, -1.8118F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 27, -1.0F, -1.35F, 0.0F, 2, 2, 2, 0.003F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 18, -1.0F, -1.35F, 2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.06F, -1.1019F, 2.0632F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 29, 1.0F, -2.5F, 0.0F, 0, 3, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.94F, 1.5481F, -0.0618F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.3339F, 0.0859F, -0.8154F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 30, 0, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.06F, 1.5481F, -0.0618F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.3339F, -0.0859F, 0.8154F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 30, 0, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.leftSpines = new AdvancedModelRenderer(this);
        this.leftSpines.setRotationPoint(-0.91F, 1.8942F, 2.1164F);
        this.main.addChild(leftSpines);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.928F, -0.3075F, 5.3002F);
        this.leftSpines.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1766F, 0.1615F, -0.4831F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 20, -0.025F, -0.55F, -1.1F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.559F, -0.4676F, 3.7507F);
        this.leftSpines.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4779F, 0.1615F, -0.4831F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 32, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.2767F, -0.6222F, 3.0376F);
        this.leftSpines.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.696F, 0.1615F, -0.4831F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 16, 0.0F, -0.5F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.35F, -0.125F, 1.7737F);
        this.leftSpines.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6659F, 0.0586F, -0.4543F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 29, 0.0F, -0.9F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.25F, -0.125F, 0.9987F);
        this.leftSpines.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.8011F, 0.073F, -0.3315F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 23, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.25F, -0.0251F, 0.2487F);
        this.leftSpines.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.0629F, 0.073F, -0.3315F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 33, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.rightSpines = new AdvancedModelRenderer(this);
        this.rightSpines.setRotationPoint(0.79F, 1.8942F, 2.1164F);
        this.main.addChild(rightSpines);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.928F, -0.3075F, 5.3002F);
        this.rightSpines.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1766F, -0.1615F, 0.4831F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 20, 0.025F, -0.55F, -1.1F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.559F, -0.4676F, 3.7507F);
        this.rightSpines.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4779F, -0.1615F, 0.4831F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 32, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.2767F, -0.6222F, 3.0376F);
        this.rightSpines.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.696F, -0.1615F, 0.4831F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 16, 0.0F, -0.5F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.35F, -0.125F, 1.7737F);
        this.rightSpines.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6659F, -0.0586F, 0.4543F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 29, 0.0F, -0.9F, 0.0F, 0, 2, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.25F, -0.125F, 0.9987F);
        this.rightSpines.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.8011F, -0.073F, 0.3315F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 33, 23, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.25F, -0.0251F, 0.2487F);
        this.rightSpines.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.0629F, -0.073F, 0.3315F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 33, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.06F, 0.8844F, -1.7485F);
        this.main.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.6414F, -0.0977F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.3963F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 6, -0.5F, -2.0F, -0.025F, 2, 2, 1, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.06F, -1.0769F, 6.5632F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 18, -1.0F, 0.0F, 0.0F, 2, 2, 3, -0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 2.0F, 3.0F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 24, -0.5F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 0.0F, 0.25F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9163F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 29, 1.0F, 0.0F, -0.25F, 0, 2, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(-1.15F, 2.25F, 3.0F);
        this.tail.addChild(backLeftFin);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 0.0F, -2.0F);
        this.backLeftFin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3431F, 0.2751F, -0.6502F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 32, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(1.15F, 2.25F, 3.0F);
        this.tail.addChild(backRightFin);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.5F, 0.0F, -2.0F);
        this.backRightFin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3431F, -0.2751F, 0.6502F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 32, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail.addChild(tail2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -1.7419F, 6.347F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5541F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 18, 0.5F, 0.0F, -5.95F, 0, 2, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.9676F, 0.4107F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.5585F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 19, 0, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.006F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, -1.7441F, 5.5316F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 23, 0.5F, 0.0F, 0.0F, 1, 1, 3, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3054F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 10, -0.5F, 0.0F, -0.2F, 1, 1, 6, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.22F;
        this.main.offsetX = -0.05F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.0036F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.0036F);
        this.setRotateAngle(cube_r3, -0.1091F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.7505F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0305F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0916F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.1896F, -0.2409F, 0.8933F);
        this.setRotateAngle(cube_r10, 0.1896F, 0.2409F, -0.8933F);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r12, 0.1614F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(tail2, 0.4752F, -0.3931F, -0.1946F);
        this.setRotateAngle(cube_r16, -0.4363F, 0.0F, 0.0F);
        this.main.offsetY = -0.45F;
        this.main.offsetZ = 0.01F;
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.0036F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.0036F);
        this.setRotateAngle(cube_r3, -0.1091F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.7505F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0305F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0916F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.1896F, -0.2409F, 0.8933F);
        this.setRotateAngle(cube_r10, 0.1896F, 0.2409F, -0.8933F);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r12, 0.1614F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(tail2, 0.4752F, -0.3931F, -0.1946F);
        this.setRotateAngle(cube_r16, -0.4363F, 0.0F, 0.0F);
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(main, speed, 0.15F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, -0.2F, f2, 1);
            this.flap(frontLeftFin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), 0.25F, true, -3, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.05F, true, -3, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.05F, true, 0.5F, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.2F, true, 3.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.05F, true, 3.5F, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
            }
        }
    }
}
