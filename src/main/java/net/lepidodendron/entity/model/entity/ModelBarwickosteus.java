package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBarwickosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private ModelAnimator animator;


    public ModelBarwickosteus() {
        animator = ModelAnimator.create();
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 36, -2.0F, -2.5198F, -6.3838F, 4, 1, 1, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.045F, -2.1069F, -6.0065F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.067F, -0.2466F, -0.0186F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 34, 0.025F, -1.0F, 0.075F, 1, 2, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.045F, -2.1069F, -6.0065F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.067F, 0.2466F, 0.0186F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 34, -1.025F, -1.0F, 0.075F, 1, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.625F, -2.1938F, -6.8011F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1787F, -0.2148F, -0.0385F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.625F, -2.1938F, -6.8011F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1787F, 0.2148F, 0.0385F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.7198F, -7.2588F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 18, -1.3F, -0.3F, -0.1F, 0, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 18, 1.3F, -0.3F, -0.1F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.7198F, -7.2588F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 18, -1.5F, -0.8F, -0.3F, 4, 1, 2, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -2.8377F, -7.277F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.48F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 5, -0.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -3.8637F, -4.4579F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 22, -0.5F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, -4.5477F, -2.5785F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 22, -0.5F, 0.0F, -2.0F, 5, 2, 2, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -4.8088F, -0.5957F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 5, -0.5F, 0.0F, 0.0F, 3, 2, 3, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -4.75F, -2.0F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 27, -1.5F, 0.125F, -0.6F, 4, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.0F, 2.2F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 33, -1.0F, -2.7F, -2.025F, 3, 3, 2, 0.006F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.5F, -2.7F, -6.025F, 4, 3, 4, 0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.1431F, 1.7399F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -0.7664F, 2.9201F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5149F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 40, 1.5F, -1.1F, -2.1F, 0, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -0.1504F, 4.8595F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1222F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 15, 0.5F, -0.375F, -5.0F, 2, 2, 4, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 1.8931F, 0.2601F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 8, -0.5F, -1.45F, -0.375F, 2, 2, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.6869F, 2.4181F, 0.4514F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.3927F, 0.3927F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 39, 4, 0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.6869F, 2.4181F, 0.4514F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.3927F, -0.3927F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 39, 4, -2.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5451F, 3.2634F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -0.9649F, 3.9848F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0567F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 27, -1.25F, 0.0F, -3.95F, 1, 2, 4, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 11, -0.75F, 0.0F, -3.95F, 1, 2, 4, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 1.352F, 0.5062F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6021F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 40, 1.0F, 0.3F, 0.2F, 0, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.25F, 1.0774F, 3.9954F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0654F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 27, 0.75F, -0.625F, -4.0F, 1, 1, 4, -0.006F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.241F, 3.3001F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.0533F, 3.3229F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5934F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 28, -0.5F, -1.25F, -3.3F, 1, 1, 3, -0.009F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -1.7116F, 8.1813F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 8, 0.5F, -0.1F, -8.075F, 0, 3, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.6674F, 0.2497F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 18, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.9379F, -1.3211F, -0.929F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1474F, 0.3976F, 0.0458F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 17, 0, -2.25F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.9379F, -1.3211F, -0.929F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1474F, -0.3976F, -0.0458F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 17, 0, -0.75F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(1.9856F, -1.3456F, -3.2015F);
        this.main.addChild(leftSpine);
        this.setRotateAngle(leftSpine, 0.0435F, -0.0038F, 0.0872F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.3858F, 0.0F, 2.3407F);
        this.leftSpine.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.5236F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 0, -2.0F, -0.5F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.382F, 0.0F, 2.4278F);
        this.leftSpine.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.0873F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 24, -1.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.9568F, 0.0F, 5.5717F);
        this.leftSpine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -1.4835F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 39, -1.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.9568F, 0.0F, 4.0717F);
        this.leftSpine.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -1.5708F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 39, 0.0F, -0.5F, 0.0F, 3, 1, 1, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.6889F, 0.0F, 1.3528F);
        this.leftSpine.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -1.1345F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 7, 0.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.2144F, 0.0F, 0.0016F);
        this.leftSpine.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.7418F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 41, 18, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.0892F, -1.6085F, 1.5237F);
        this.leftSpine.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1201F, 0.2815F, 0.4097F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 38, -1.5308F, -0.9564F, -1.0F, 2, 1, 2, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.0892F, -1.6085F, 1.5237F);
        this.leftSpine.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2783F, 0.1274F, 1.1523F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 35, 33, -0.3003F, -1.0221F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.2144F, 0.5F, 0.0016F);
        this.leftSpine.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0585F, -0.4338F, 0.0939F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 37, 14, -2.0F, -0.975F, 0.0F, 2, 1, 2, 0.006F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-1.9856F, -1.3456F, -3.2015F);
        this.main.addChild(rightSpine);
        this.setRotateAngle(rightSpine, 0.0435F, 0.0038F, -0.0872F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.3858F, 0.0F, 2.3407F);
        this.rightSpine.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.5236F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 0, -1.0F, -0.5F, -2.0F, 3, 1, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.382F, 0.0F, 2.4278F);
        this.rightSpine.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0873F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 30, 24, 0.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.9568F, 0.0F, 5.5717F);
        this.rightSpine.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 1.4835F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 39, -1.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.9568F, 0.0F, 4.0717F);
        this.rightSpine.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 1.5708F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 39, -3.0F, -0.5F, 0.0F, 3, 1, 1, -0.003F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.6889F, 0.0F, 1.3528F);
        this.rightSpine.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 1.1345F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 39, 7, -3.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.2144F, 0.0F, 0.0016F);
        this.rightSpine.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.7418F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 41, 18, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.003F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0892F, -1.6085F, 1.5237F);
        this.rightSpine.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1201F, -0.2815F, -0.4097F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 35, 38, -0.4692F, -0.9564F, -1.0F, 2, 1, 2, -0.003F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0892F, -1.6085F, 1.5237F);
        this.rightSpine.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2783F, -0.1274F, -1.1523F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 35, 33, -1.6997F, -1.0221F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.2144F, 0.5F, 0.0016F);
        this.rightSpine.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0585F, 0.4338F, -0.0939F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 37, 14, 0.0F, -0.975F, 0.0F, 2, 1, 2, 0.006F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3866F, -4.0685F);
        this.main.addChild(jaw);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.75F, -0.1883F, -2.8717F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.4363F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 31, 39, -0.5F, -0.6F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 31, 39, 2.0F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0F, 0.7981F, -1.6564F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2182F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 35, 24, -0.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -0.8008F, -0.5917F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 1.6581F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 37, 11, -1.5F, -0.975F, -0.65F, 4, 1, 1, -0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.5F, 0.3F, -1.7F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0598F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 32, -0.5F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));

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
