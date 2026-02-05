package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGymnotrachelus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r34;

    private ModelAnimator animator;

    public ModelGymnotrachelus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.0874F, -8.8659F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 59, -1.5F, -1.0F, -3.0F, 4, 1, 3, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -5.1457F, -8.9454F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 0, -2.5F, 3.05F, 0.3F, 6, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -3.2744F, -14.7382F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 52, -1.5F, -1.0F, 0.0F, 4, 1, 4, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -4.1979F, -16.5122F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 61, -0.5F, -1.0F, 0.0F, 3, 1, 2, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.1376F, -16.8543F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 60, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -6.3446F, -8.9977F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 43, -2.5F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.748F, -3.9052F, -15.8983F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5744F, -0.2234F, -0.0123F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 11, 0.25F, -0.675F, 0.2F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.21F, -4.0057F, -16.0148F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1237F, -0.0134F, 0.017F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 30, -0.275F, -0.525F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.21F, -4.0057F, -16.0148F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1237F, 0.0134F, -0.017F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 30, -0.725F, -0.525F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.748F, -3.9052F, -15.8983F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4827F, -0.2234F, -0.0123F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 48, 0.0F, -0.975F, -0.75F, 2, 1, 1, -0.003F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.748F, -3.9052F, -15.8983F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4871F, -0.2234F, -0.0123F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 32, 0.0F, -1.975F, 0.0F, 2, 2, 8, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.748F, -3.9052F, -15.8983F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4827F, 0.2234F, 0.0123F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 48, -2.0F, -0.975F, -0.75F, 2, 1, 1, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.5F, -6.2946F, -8.9977F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0974F, -0.2509F, -0.0286F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 48, 0.025F, 0.0F, -5.925F, 2, 4, 6, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.5F, -6.2946F, -8.9977F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0974F, 0.2509F, 0.0286F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 48, -2.025F, 0.0F, -5.925F, 2, 4, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.748F, -3.9052F, -15.8983F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5744F, 0.2234F, 0.0123F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 11, -0.25F, -0.675F, 0.2F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.748F, -3.9052F, -15.8983F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4871F, 0.2234F, 0.0123F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 32, -2.0F, -1.975F, 0.0F, 2, 2, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -6.55F, -2.0F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 19, -3.5F, -0.1F, -7.0F, 7, 5, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.2704F, -11.6419F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 0, -1.5F, -0.2112F, -5.2702F, 3, 1, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 0.7888F, -5.2702F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1047F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 52, 22, -0.5F, -1.0F, 0.0F, 3, 1, 6, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.3915F, 0.1183F, -4.6977F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, -0.2182F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 62, 30, 0.0F, -0.5F, -0.45F, 1, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.3915F, 0.1183F, -4.6977F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, -0.2182F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 64, 0.025F, -0.425F, 0.45F, 0, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.3915F, 0.1183F, -4.6977F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.2182F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 64, -0.025F, -0.425F, 0.45F, 0, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.3915F, 0.1183F, -4.6977F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1745F, 0.2182F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 62, 30, -1.0F, -0.5F, -0.45F, 1, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, 0.2888F, -5.2702F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.2182F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 54, 8, 0.0F, -0.5F, 0.0F, 2, 1, 6, 0.006F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 0.2888F, -5.2702F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.2182F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 54, 8, -2.0F, -0.5F, 0.0F, 2, 1, 6, 0.003F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.8416F, -4.6811F, -14.2798F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.3491F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-3.275F, -0.0825F, 0.404F);
        this.eye.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 57, 30, 2.8F, -0.4F, -0.9F, 1, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 11, 61, 2.75F, -0.9F, -1.4F, 1, 2, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.8416F, -4.6811F, -14.2798F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.3491F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.275F, -0.0825F, 0.404F);
        this.eye2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 57, 30, -3.8F, -0.4F, -0.9F, 1, 1, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 11, 61, -3.75F, -0.9F, -1.4F, 1, 2, 2, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0F, -0.8957F, -9.3454F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, -0.2182F, 0.3927F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 21, 42, 0.0F, 0.0F, 0.0F, 7, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0F, -0.8957F, -9.3454F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.2182F, -0.3927F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 21, 42, -7.0F, 0.0F, 0.0F, 7, 0, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(body);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, -0.3F, 3.65F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0829F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 21, 33, -1.5F, -2.0F, -6.025F, 5, 2, 6, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-3.5F, -6.6F, -2.35F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.0908F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 60, 3.5F, 0.25F, 0.0F, 0, 6, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -6.6F, -2.35F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 29, 10, -2.5F, 0.0F, 0.0F, 6, 5, 6, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.5F, -0.55F, 1.65F);
        this.body.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0587F, -0.3189F, 0.6485F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 54, 16, 0.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.5F, -0.55F, 1.65F);
        this.body.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0587F, 0.3189F, -0.6485F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 54, 16, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.9998F, -1.0516F);
        this.body.addChild(tail);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 2.1924F, 9.8081F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1745F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 33, -1.5F, -1.5F, -5.8F, 4, 2, 6, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, -2.0002F, 4.0516F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 29, 22, -1.5F, -0.325F, 0.1F, 5, 4, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2752F, 5.2923F);
        this.tail.addChild(tail2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0F, 1.3739F, 8.7288F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2182F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 55, 52, -0.5F, -2.0F, -5.0F, 3, 2, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -2.0505F, 4.0093F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 52, -1.5F, 0.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6005F, 0.2593F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 45, 60, -1.0F, -1.0F, 8.0F, 2, 3, 3, -0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, -1.0F, 11.0F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5672F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, 1.0F, 0.0F, -2.0F, 0, 6, 12, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 42, 0.5F, 0.0F, -1.0F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.5F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, 1.0036F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(backRightFin, 0.0F, 0.2618F, -0.1309F);
        this.setRotateAngle(tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.48F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3054F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.12F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, 1.0036F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(backRightFin, 0.0F, 0.2618F, -0.1309F);
        this.setRotateAngle(tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.48F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3054F, 0.0F);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.06F;
        this.main.offsetZ = 0.03F;
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


        AdvancedModelRenderer[] fishTail = {this.body, this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.2F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

