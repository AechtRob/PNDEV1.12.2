package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCorusichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer lcleithra;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer lcleithra2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail3;

    public ModelCorusichthys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 1.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 16, -1.5F, -4.625F, -2.225F, 3, 3, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 8, -1.5F, -5.5F, -5.225F, 3, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.464F, -8.1155F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.9163F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 34, -1.0F, -0.9F, -0.6F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.6553F, -7.6535F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 17, -0.5F, -0.5F, -2.0F, 2, 1, 3, 0.009F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -4.7387F, -8.5626F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.4835F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 37, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -5.6924F, -8.2619F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.2654F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 34, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -4.9325F, -7.0691F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 38, -1.7F, -0.25F, -0.625F, 1, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 38, -0.3F, -0.25F, -0.625F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 33, -1.5F, -1.0F, -1.0F, 2, 2, 1, 0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -6.2986F, -6.7031F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 26, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -6.1242F, -4.7107F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 0, -0.5F, 0.0F, -2.0F, 2, 4, 2, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -6.1358F, 1.2383F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.8508F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 38, 0.01F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.9622F, 0.2535F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.3963F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 8, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -4.9962F, -0.0733F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 29, 0.99F, -1.0F, -0.2F, 0, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -5.7455F, -3.0022F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 29, 0.975F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.4717F, -2.0365F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 11, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -7.7759F, -3.0684F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5323F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 37, -0.5F, 0.35F, -2.0F, 1, 2, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 17, -0.5F, -0.15F, -1.0F, 1, 3, 1, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -6.1431F, -4.9114F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4276F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 0, -0.5F, -3.0F, 0.0F, 1, 3, 1, 0.006F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -3.5F, -3.5F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -0.5F, -2.3F, -1.75F, 2, 1, 6, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.4481F, -3.8819F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 8, -0.5F, -2.0F, 0.025F, 2, 2, 5, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.7F, -6.6536F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 17, -0.5F, -2.0F, 0.025F, 2, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.5F, -7.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.0472F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 0, -0.5F, -2.4F, -2.975F, 2, 2, 3, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, -0.802F, -1.882F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.5131F, 0.3463F, -0.189F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 39, 14, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.0F, -0.802F, -1.882F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.5131F, -0.3463F, 0.189F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 39, 14, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.lcleithra = new AdvancedModelRenderer(this);
        this.lcleithra.setRotationPoint(1.025F, -1.45F, -4.2786F);
        this.main.addChild(lcleithra);
        this.setRotateAngle(lcleithra, 0.0F, 0.0F, -0.4712F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.425F, 1.0254F, 1.9924F);
        this.lcleithra.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.1134F, 0.2662F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 29, 0.0F, -1.0F, -0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.6754F, 2.4924F);
        this.lcleithra.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.1781F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 34, -0.5F, 0.0F, -2.0F, 1, 1, 2, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.75F, -2.0F);
        this.lcleithra.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 29, -0.5F, -2.0F, 0.025F, 1, 2, 3, 0.006F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.0534F, 0.0391F);
        this.lcleithra.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.6545F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 33, 22, -0.5F, -1.0F, 0.325F, 1, 1, 2, 0.0F, false));

        this.lcleithra2 = new AdvancedModelRenderer(this);
        this.lcleithra2.setRotationPoint(-1.025F, -1.45F, -4.2786F);
        this.main.addChild(lcleithra2);
        this.setRotateAngle(lcleithra2, 0.0F, 0.0F, 0.4712F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.425F, 1.0254F, 1.9924F);
        this.lcleithra2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1134F, -0.2662F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 29, 0.0F, -1.0F, -0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.6754F, 2.4924F);
        this.lcleithra2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.1781F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 34, -0.5F, 0.0F, -2.0F, 1, 1, 2, -0.003F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.75F, -2.0F);
        this.lcleithra2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3927F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 29, -0.5F, -2.0F, 0.025F, 1, 2, 3, 0.006F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.0534F, 0.0391F);
        this.lcleithra2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.6545F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 33, 22, -0.5F, -1.0F, 0.325F, 1, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.0053F, -7.8535F);
        this.main.addChild(jaw);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -0.3794F, 0.8533F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 29, -0.5F, -0.05F, -2.3F, 2, 1, 2, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.0F, 0.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 23, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.006F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.5251F, 0.2605F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1745F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 12, -1.0F, -1.0F, -0.2F, 2, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.8146F, 0.2349F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 7, -1.0F, -0.05F, -0.025F, 2, 1, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 1.3861F, 1.0484F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.6825F, 0.3172F, -0.3665F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 39, 5, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 1.3861F, 1.0484F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.6825F, -0.3172F, 0.3665F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 39, 5, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.025F, 2.475F);
        this.tail.addChild(tail2);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.8906F, 0.8265F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4538F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 23, 37, 0.5F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.4102F, 4.0408F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1484F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 23, -0.5F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -1.1033F, 0.2055F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.6545F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 35, 0.5F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 11, 23, -0.5F, -0.625F, 0.125F, 1, 1, 4, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.025F, 3.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 34, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

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
        this.main.offsetX = -0.6F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(12);
        this.main.rotateAngleZ = (float)Math.toRadians(1);
        this.main.scaleChildren = true;
        float scaler = 8.0F;
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
                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
