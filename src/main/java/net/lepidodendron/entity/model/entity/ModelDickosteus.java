package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDickosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
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
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r36;
    private ModelAnimator animator;


    public ModelDickosteus() {
        animator = ModelAnimator.create();
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 21, 22, -3.5F, -6.8379F, -1.0539F, 7, 1, 4, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -5.8378F, -1.0539F, 8, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -3.409F, -8.0344F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0447F, -0.0381F, 0.0279F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 12, -0.45F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -3.409F, -8.0344F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0447F, 0.0381F, -0.0279F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 12, -0.55F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.4797F, -7.9125F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 47, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.3194F, -1.0523F, -3.3698F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3543F, 1.4227F, -0.4878F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 52, -3.0F, -2.0F, 0.0F, 3, 2, 1, -0.003F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.2553F, -5.8947F, -1.0708F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.6563F, 1.3856F, 1.5973F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 51, 0.0F, 0.0F, 0.0F, 2, 3, 2, 0.003F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(4.2553F, -5.8947F, -1.0708F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.6563F, -1.3856F, -1.5973F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 51, -2.0F, 0.0F, 0.0F, 2, 3, 2, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -3.54F, -7.5705F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4715F, 0.8269F, -0.8681F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 55, 9, -2.525F, -0.85F, 0.0F, 3, 1, 1, -0.003F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -4.0099F, -7.7415F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5152F, 0.8036F, 0.387F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 20, -2.0F, -0.5F, 0.0F, 2, 1, 1, -0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.7028F, -3.7048F, -6.3865F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2742F, 0.8261F, 0.1435F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 26, -0.5F, -0.5F, -0.375F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.7028F, -3.7048F, -6.3865F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2742F, -0.8261F, -0.1435F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 55, 26, -0.5F, -0.5F, -0.375F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.3194F, -1.0523F, -3.3698F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3543F, -1.4227F, 0.4878F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 52, 0.0F, -2.0F, 0.0F, 3, 2, 1, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.1074F, -2.06F, -5.9224F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4607F, 1.0176F, -0.6936F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 52, -3.0F, -2.0F, 0.0F, 3, 2, 1, -0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.2856F, -5.0037F, -6.4729F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3666F, 1.0335F, 0.2582F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 46, -4.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.1074F, -2.06F, -5.9224F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4607F, -1.0176F, 0.6936F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 52, 0.0F, -2.0F, 0.0F, 3, 2, 1, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.2856F, -5.0037F, -6.4729F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3666F, -1.0335F, -0.2582F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 46, 0.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, -3.54F, -7.5705F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4715F, -0.8269F, 0.8681F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 55, 9, -0.475F, -0.85F, 0.0F, 3, 1, 1, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -4.0099F, -7.7415F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5152F, -0.8036F, -0.387F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 55, 20, 0.0F, -0.5F, 0.0F, 2, 1, 1, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -5.1638F, -6.0332F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 54, 51, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -5.8479F, -3.8611F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 0, -2.0F, -0.1F, -3.025F, 4, 1, 3, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0F, -0.4158F, -1.0197F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 45, 46, -4.0F, -2.0F, -5.0F, 4, 2, 2, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 16, -5.0F, -1.0F, -3.0F, 6, 1, 2, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 30, -5.5F, -1.0F, -1.0F, 7, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.9378F, 2.9461F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 15, -4.0F, -2.0F, -4.0F, 7, 2, 4, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -6.75F, -1.0F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3054F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 34, -3.0F, -0.1F, -3.025F, 6, 1, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0F, -1.3378F, -1.5539F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, 0.2182F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 9, 0.0F, 0.0F, 0.0F, 7, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0F, -1.3378F, -1.5539F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, -0.2182F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 9, -7.0F, 0.0F, 0.0F, 7, 0, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.028F, -2.294F, -5.6325F);
        this.main.addChild(jaw);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.472F, -0.4225F, -1.3887F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.5225F, -0.1186F, 0.0556F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 52, -0.525F, -0.425F, -0.825F, 0, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.528F, -0.4225F, -1.3887F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.5225F, 0.1186F, -0.0556F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 40, 52, 0.525F, -0.425F, -0.825F, 0, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.028F, 1.01F, -0.3112F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.4363F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 55, 23, -1.0F, -1.0F, -2.6F, 2, 1, 1, -0.003F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 53, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.7945F, 0.953F, -0.3004F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.4283F, -0.4158F, 0.1419F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 47, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.8505F, 0.953F, -0.3004F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4283F, 0.4158F, -0.1419F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 47, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0076F, -3.8868F, 2.3209F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 22, -2.9924F, -1.9132F, 0.0791F, 6, 4, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.9924F, -2.9132F, 0.2291F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1745F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 21, 28, -1.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5076F, 2.949F, 0.6252F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 17, 34, -3.0F, -1.025F, -0.5F, 5, 1, 4, 0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.9695F, 2.1171F, 2.5861F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.1745F, 0.6109F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 44, 5, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9543F, 2.1171F, 2.5861F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.1745F, -0.6109F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 44, 5, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0076F, 0.1298F, 3.5779F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 0, -2.0F, -1.393F, 0.0012F, 4, 3, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.5F, -2.3484F, 0.5904F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3491F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 20, 3.5F, -3.975F, -0.05F, 0, 4, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.0F, -2.3484F, 0.5904F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1658F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 39, 0.5F, 0.025F, -0.5F, 3, 1, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 2.8192F, -2.9527F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 39, -1.0F, -1.05F, 3.025F, 3, 1, 5, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1061F, 4.5073F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 31, -1.5F, -0.9741F, -0.0061F, 3, 2, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5F, 2.3868F, 2.0955F);
        this.tail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2094F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 53, 39, 1.5F, -1.4F, -1.4F, 0, 2, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 1.0287F, 4.9513F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1222F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 9, -0.5F, -1.0F, -5.0F, 2, 1, 5, 0.003F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -1.7599F, 0.0224F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1178F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 17, 40, -0.5F, 0.025F, 0.05F, 2, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0856F, 4.7134F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 52, -1.0F, -0.9884F, -0.3695F, 2, 2, 2, -0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -0.4884F, 1.1305F);
        this.tail4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.48F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 25, 9, 0.5F, -0.5F, -1.0F, 0, 5, 7, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 46, 0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

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
        this.main.offsetZ = -0.5F;

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
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

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
