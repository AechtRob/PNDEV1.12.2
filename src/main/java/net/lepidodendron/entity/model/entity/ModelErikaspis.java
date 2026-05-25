package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelErikaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r32;


    public ModelErikaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.5F, -5.4F, 0.25F, 9, 4, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 27, 0, -3.5F, -5.4F, 3.75F, 7, 4, 2, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 0.675F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 20, -3.0F, -1.0F, -4.0F, 6, 1, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, 0.675F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 42, -3.0F, -1.0F, 3.0F, 6, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 15, -4.0F, -1.0F, 0.0F, 8, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.8702F, -6.7834F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.3526F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 46, -2.0F, 0.025F, 0.0F, 4, 4, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.0451F, -7.3029F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6981F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 52, -2.0F, 0.025F, -1.0F, 4, 2, 1, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.75F, -2.7015F, -6.4253F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1734F, -0.5005F, -0.1633F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 4, -0.125F, -0.5F, -0.925F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.75F, -2.7015F, -6.4253F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1734F, 0.5005F, 0.1633F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 4, -0.875F, -0.5F, -0.925F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -5.0804F, -3.4392F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 9, -3.0F, 0.025F, -4.0F, 5, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -6.2959F, 3.4544F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 20, -1.0F, 0.025F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -5.775F, 0.5F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 33, -2.0F, 0.025F, 0.0F, 5, 1, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 9, -3.5F, 0.025F, -4.0F, 8, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.4714F, -0.8054F, -1.1735F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.028F, -0.2125F, -0.1806F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 45, -0.075F, -2.0F, -2.0F, 2, 2, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-4.6306F, -4.2668F, -3.5647F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1668F, -0.0808F, -0.1548F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 38, 0.0F, -0.2F, -0.125F, 2, 3, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(4.4714F, -0.8054F, -1.1735F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.028F, 0.2125F, 0.1806F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 43, 45, -1.925F, -2.0F, -2.0F, 2, 2, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.2806F, -1.9017F, -6.5519F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2506F, -0.4872F, -0.0467F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 7, 0.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-4.6215F, -4.4472F, -3.7163F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2805F, -0.5319F, -0.2401F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 38, 0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.2806F, -1.9017F, -6.5519F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2506F, 0.4872F, 0.0467F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 7, -2.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(4.6215F, -4.4472F, -3.7163F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2805F, 0.5319F, 0.2401F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 43, 38, -2.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.9655F, -1.1522F, 0.0461F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0972F, -0.4916F, -0.1666F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 33, -0.75F, -0.5F, -3.0F, 1, 1, 6, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-5.9376F, -1.35F, 1.2496F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -2.3789F, -1.2228F, 2.551F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 48, -3.0F, -2.825F, -2.1F, 3, 3, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(5.9376F, -1.35F, 1.2496F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -2.3789F, 1.2228F, -2.551F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 48, 0.0F, -2.825F, -2.1F, 3, 3, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-5.419F, -0.9283F, 1.4802F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -2.9864F, -0.9844F, 2.7994F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 33, -2.0F, -0.5F, -2.5F, 2, 1, 3, -0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(5.419F, -0.9283F, 1.4802F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -2.9864F, 0.9844F, -2.7994F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 47, 33, 0.0F, -0.5F, -2.5F, 2, 1, 3, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(4.9655F, -1.1522F, 0.0461F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0972F, 0.4916F, 0.1666F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 33, -0.25F, -0.5F, -3.0F, 1, 1, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(4.6306F, -4.2668F, -3.5647F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1668F, 0.0808F, 0.1548F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 38, -2.0F, -0.2F, -0.125F, 2, 3, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(5.0F, -1.0F, 1.25F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.2346F, 0.7287F, 0.1081F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 44, 14, -3.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-5.0F, -1.0F, 1.25F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.2346F, -0.7287F, -0.1081F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 44, 14, 0.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0056F, -1.4017F, -3.4519F);
        this.main.addChild(jaw);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.0056F, -0.4686F, -3.3315F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.3526F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 46, 0, -3.0F, 1.725F, -0.2F, 6, 2, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 52, -2.0F, -0.275F, -0.2F, 4, 2, 1, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.2056F, -0.968F, -2.3502F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.3452F, -0.2555F, 0.0579F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 48, -0.5F, -0.925F, -0.5F, 1, 2, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.1944F, -0.968F, -2.3502F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.3452F, 0.2555F, -0.0579F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 48, -0.5F, -0.925F, -0.5F, 1, 2, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.3333F, -3.8013F, 5.9943F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -2.8333F, -0.9487F, -0.4943F, 5, 3, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.8333F, -1.4055F, 1.0357F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.0036F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 35, 52, 1.5F, 0.175F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.1667F, -0.9487F, 4.5057F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 24, -2.5F, 0.0F, -5.0F, 4, 1, 5, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.8333F, 2.0513F, 4.5057F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 19, 26, -1.5F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.6667F, 2.0513F, 1.0057F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3491F, 0.0F, -0.8727F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 40, 52, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.3333F, 2.0513F, 1.0057F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.3491F, 0.0F, 0.8727F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 40, 52, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.3333F, -0.0475F, 4.0233F);
        this.tail.addChild(tail2);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 1.2714F, 3.8914F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2182F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 46, -0.5F, -1.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.9012F, -0.0175F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0436F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 38, 26, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3669F, 3.6456F);
        this.tail2.addChild(tail3);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -0.3817F, -0.1665F);
        this.tail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3054F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 31, 0.5F, 0.0F, -0.2F, 0, 3, 7, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 17, 41, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
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
