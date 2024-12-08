package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAlbalophosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAlbalophosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer upperbody2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;

    private ModelAnimator animator;

    public ModelAlbalophosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 26.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -15.6F, 1.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 36, 0.5F, -4.0F, 0.25F, 0, 4, 5, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 18, 1.5F, -4.0F, 0.25F, 0, 4, 5, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 36, -0.5F, -4.0F, 0.25F, 0, 4, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 18, -1.5F, -4.0F, 0.25F, 0, 4, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 20, -2.5F, 0.0F, 0.25F, 5, 6, 5, 0.0F, false));

        this.upperbody2 = new AdvancedModelRenderer(this);
        this.upperbody2.setRotationPoint(0.0F, -15.6F, 1.65F);
        this.body.addChild(upperbody2);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.4F, -2.65F);
        this.upperbody2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 24, 0.0F, -6.5F, -4.5F, 0, 3, 7, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 30, 2.0F, -5.5F, -4.5F, 0, 2, 7, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 27, 1.0F, -6.5F, -4.5F, 0, 3, 7, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 27, -1.0F, -6.5F, -4.5F, 0, 3, 7, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 30, -2.0F, -5.5F, -4.5F, 0, 2, 7, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.0F, -3.5F, -4.5F, 6, 7, 7, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.259F, -7.0724F);
        this.upperbody2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.2182F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0753F, 0.1364F);
        this.upperbody.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 9, -2.0F, -0.066F, -5.046F, 4, 6, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0753F, 0.1364F);
        this.upperbody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 25, -2.0F, 0.309F, -1.046F, 4, 6, 4, -0.04F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.2F, 5.0753F, -2.3636F);
        this.upperbody.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.7132F, -0.3751F, 0.3069F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 44, 5, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.25F, 0.25F, 3.5F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.4363F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 0, -0.5F, -0.5F, -1.0F, 1, 3, 2, -0.01F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.5F, 2.5F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 0, 14, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(1.2F, 5.0753F, -2.3636F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.7132F, 0.3751F, -0.3069F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 44, 5, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.25F, 0.25F, 3.5F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.4363F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 0, -0.5F, -0.5F, -1.0F, 1, 3, 2, -0.01F, true));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.5F, 2.5F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 0, 14, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 1.8503F, -4.5886F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 26, 0, -1.0F, -0.0053F, -2.8565F, 3, 4, 5, -0.005F, false));
        this.neck.cubeList.add(new ModelBox(neck, 12, 50, 0.0F, -0.0053F, -2.8565F, 1, 4, 5, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 50, -0.75F, -0.0053F, -2.8565F, 1, 4, 5, -0.005F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 50, 0.75F, -0.0053F, -2.8565F, 1, 4, 5, -0.005F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0447F, -2.6065F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 36, 27, -1.0F, 0.3281F, -4.0215F, 3, 3, 4, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 31, -0.325F, 2.5281F, -5.1715F, 0, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 45, 16, -0.5F, 1.3281F, -5.6965F, 2, 2, 2, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 31, 1.325F, 2.5281F, -5.1715F, 0, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.3F, 3.8966F, -5.7222F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.8029F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -1.0F, 0.3F, 0, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.6F, -1.0F, 0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 2.8281F, -6.0215F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 5, -1.0F, -0.425F, -0.775F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.55F, 1.5F, -4.025F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 5, -0.55F, -0.625F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 0.7774F, -4.1629F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6415F, 0.1323F, 0.2611F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 14, -0.5F, -0.55F, -1.4F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, 2.3281F, -4.0215F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5192F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 17, -1.0F, -1.0F, -1.0F, 1, 2, 1, 0.002F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.55F, 1.5F, -4.025F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 5, -0.45F, -0.625F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.2732F, -5.666F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.9032F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 45, 34, -1.0F, 0.0021F, -1.999F, 2, 1, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.7774F, -4.1629F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6415F, -0.1323F, -0.2611F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 14, -0.5F, -0.55F, -1.4F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.0697F, -4.0959F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6414F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 47, -1.0F, 0.027F, -1.9771F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.3281F, -2.0215F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 9, -1.5F, -0.5F, -2.0F, 3, 1, 4, 0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 2.3281F, -4.0215F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.5192F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 17, 0.0F, -1.0F, -1.0F, 1, 2, 1, 0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 3.3242F, -0.774F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 0, -1.5F, 0.0039F, -3.2476F, 3, 1, 4, 0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 0, -0.775F, -0.2961F, -3.9476F, 0, 1, 4, 0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 0, 0.775F, -0.2961F, -3.9476F, 0, 1, 4, 0.002F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 47, -1.0F, 0.0039F, -4.9976F, 2, 1, 2, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.6039F, -2.0726F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 39, -1.5F, -0.9093F, -1.0986F, 3, 1, 1, -0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.4539F, -3.1726F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2487F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 47, 0, -1.0F, -1.0009F, -1.8672F, 2, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.4539F, -3.1726F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 1, 43, -1.5F, -0.6205F, 0.9337F, 3, 1, 3, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.8539F, -5.1726F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4363F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 19, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, -0.9961F, -3.2476F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.5192F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 18, -1.0F, 1.0F, -1.0F, 1, 1, 1, 0.003F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 3, 19, -1.0F, 1.0F, -1.0F, 1, 1, 1, 0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -0.9961F, -3.2476F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.5192F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 3, 19, 0.0F, 1.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.35F, -0.9961F, -1.3476F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1309F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 41, -0.175F, -1.575F, -2.525F, 0, 3, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.35F, -0.9961F, -1.3476F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1309F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 41, 0.175F, -1.575F, -2.525F, 0, 3, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -9.1961F, 6.5524F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3927F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 0, -1.5F, 5.0F, -12.0F, 3, 1, 3, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -14.4533F, 4.3792F);
        this.body.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 14, -2.0F, -0.3476F, -0.0266F, 4, 4, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 36, -1.0F, -4.3476F, 1.9734F, 0, 4, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 36, 1.0F, -4.3476F, 1.9734F, 0, 4, 5, 0.0F, true));
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 36, 0.0F, -4.3476F, 1.9734F, 0, 4, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3476F, 5.9734F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 15, -1.5F, 0.0F, 0.0F, 3, 3, 5, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 41, -0.75F, -3.0F, 1.0F, 0, 3, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 41, 0.75F, -3.0F, 1.0F, 0, 3, 4, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 34, -1.0F, 0.1305F, -0.0086F, 2, 2, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 41, -0.5F, -2.8695F, 0.9914F, 0, 3, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 41, 0.5F, -2.8695F, 0.9914F, 0, 3, 4, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1305F, 4.9914F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 45, 11, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.5F, -11.6565F, 2.4559F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3927F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 11, 31, -1.5F, -1.9435F, -2.7309F, 3, 5, 5, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 2.8221F, -2.4795F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.829F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 43, 42, -1.0F, 0.0056F, -0.1212F, 2, 5, 3, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.25F, 1.125F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.48F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 46, 25, -1.0F, 0.1084F, -0.6345F, 2, 4, 2, -0.01F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 3.6084F, 0.3655F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0436F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 0, 36, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.5F, -11.6565F, 2.4559F);
        this.body.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3927F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 11, 31, -1.5F, -1.9435F, -2.7309F, 3, 5, 5, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 2.8221F, -2.4795F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.829F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 43, 42, -1.0F, 0.0056F, -0.1212F, 2, 5, 3, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.25F, 1.125F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.48F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 46, 25, -1.0F, 0.1084F, -0.6345F, 2, 4, 2, -0.01F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 3.6084F, 0.3655F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0436F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 0, 36, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = -1.338F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.054F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraAlbalophosaurus EntityAlbalophosaurus = (EntityPrehistoricFloraAlbalophosaurus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityAlbalophosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityAlbalophosaurus.getAnimation() == EntityAlbalophosaurus.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityAlbalophosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityAlbalophosaurus.getIsMoving()) {
                    if (EntityAlbalophosaurus.getAnimation() != EntityAlbalophosaurus.EAT_ANIMATION
                        && EntityAlbalophosaurus.getAnimation() != EntityAlbalophosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm3, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityAlbalophosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAlbalophosaurus ee = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAlbalophosaurus entity = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 3.25 + (((tickAnim - 4) / 3) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 4.75 + (((tickAnim - 7) / 5) * (-0.5-(4.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.5 + (((tickAnim - 12) / 3) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 4.75 + (((tickAnim - 4) / 3) * (5.25-(4.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 5.25 + (((tickAnim - 7) / 5) * (-6-(5.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 12) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 20 + (((tickAnim - 7) / 5) * (-12.25-(20)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -12.25 + (((tickAnim - 12) / 3) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-20.65896-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-9.01728-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-11.98929-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -20.65896 + (((tickAnim - 7) / 8) * (0-(-20.65896)));
            yy = -9.01728 + (((tickAnim - 7) / 8) * (0-(-9.01728)));
            zz = -11.98929 + (((tickAnim - 7) / 8) * (0-(-11.98929)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 20 + (((tickAnim - 7) / 5) * (-9-(20)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -9 + (((tickAnim - 12) / 3) * (0-(-9)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-15.31239-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.49189-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (14.2888-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -15.31239 + (((tickAnim - 7) / 8) * (0-(-15.31239)));
            yy = -2.49189 + (((tickAnim - 7) / 8) * (0-(-2.49189)));
            zz = 14.2888 + (((tickAnim - 7) / 8) * (0-(14.2888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -13.75 + (((tickAnim - 4) / 3) * (-15.25-(-13.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -15.25 + (((tickAnim - 7) / 5) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 1.25 + (((tickAnim - 4) / 8) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8.5 + (((tickAnim - 4) / 3) * (-10-(-8.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -10 + (((tickAnim - 7) / 5) * (0-(-10)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 11.25 + (((tickAnim - 4) / 3) * (0-(11.25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (22.25-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 22.25 + (((tickAnim - 12) / 3) * (0-(22.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAlbalophosaurus entity = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.13098-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.99714-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.99657-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = -0.13098 + (((tickAnim - 7) / 15) * (-0.13098-(-0.13098)));
            yy = -2.99714 + (((tickAnim - 7) / 15) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 7) / 15) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.13098 + (((tickAnim - 22) / 8) * (-10.13098-(-0.13098)));
            yy = -2.99714 + (((tickAnim - 22) / 8) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 22) / 8) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10.13098 + (((tickAnim - 30) / 10) * (-10.13098-(-10.13098)));
            yy = -2.99714 + (((tickAnim - 30) / 10) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 30) / 10) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10.13098 + (((tickAnim - 40) / 10) * (0-(-10.13098)));
            yy = -2.99714 + (((tickAnim - 40) / 10) * (0-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 40) / 10) * (0-(-0.99657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (1.1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 1.1 + (((tickAnim - 30) / 10) * (1.1-(1.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 1.1 + (((tickAnim - 40) / 10) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 4 + (((tickAnim - 7) / 5) * (4.00547-(4)));
            yy = 0 + (((tickAnim - 7) / 5) * (2.99269-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.20946-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 4.00547 + (((tickAnim - 12) / 5) * (4-(4.00547)));
            yy = 2.99269 + (((tickAnim - 12) / 5) * (0-(2.99269)));
            zz = 0.20946 + (((tickAnim - 12) / 5) * (0-(0.20946)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 4 + (((tickAnim - 17) / 5) * (4.00547-(4)));
            yy = 0 + (((tickAnim - 17) / 5) * (2.99269-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.20946-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 4.00547 + (((tickAnim - 22) / 8) * (12.80454-(4.00547)));
            yy = 2.99269 + (((tickAnim - 22) / 8) * (0.1591-(2.99269)));
            zz = 0.20946 + (((tickAnim - 22) / 8) * (-1.84832-(0.20946)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.80454 + (((tickAnim - 30) / 10) * (12.80454-(12.80454)));
            yy = 0.1591 + (((tickAnim - 30) / 10) * (0.1591-(0.1591)));
            zz = -1.84832 + (((tickAnim - 30) / 10) * (-1.84832-(-1.84832)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.80454 + (((tickAnim - 40) / 10) * (0-(12.80454)));
            yy = 0.1591 + (((tickAnim - 40) / 10) * (0-(0.1591)));
            zz = -1.84832 + (((tickAnim - 40) / 10) * (0-(-1.84832)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 8.75 + (((tickAnim - 7) / 5) * (8.72192-(8.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (-6.98494-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.4601-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 8.72192 + (((tickAnim - 12) / 5) * (8.75-(8.72192)));
            yy = -6.98494 + (((tickAnim - 12) / 5) * (0-(-6.98494)));
            zz = 0.4601 + (((tickAnim - 12) / 5) * (0-(0.4601)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 8.75 + (((tickAnim - 17) / 5) * (8.72192-(8.75)));
            yy = 0 + (((tickAnim - 17) / 5) * (-6.98494-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.4601-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 8.72192 + (((tickAnim - 22) / 8) * (14-(8.72192)));
            yy = -6.98494 + (((tickAnim - 22) / 8) * (0-(-6.98494)));
            zz = 0.4601 + (((tickAnim - 22) / 8) * (0-(0.4601)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 14 + (((tickAnim - 30) / 10) * (14-(14)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 40) / 10) * (0-(14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-58.5-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -58.5 + (((tickAnim - 33) / 2) * (-36.81461-(-58.5)));
            yy = 0 + (((tickAnim - 33) / 2) * (2.2205-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (-13.39838-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -36.81461 + (((tickAnim - 35) / 3) * (-58.5-(-36.81461)));
            yy = 2.2205 + (((tickAnim - 35) / 3) * (0-(2.2205)));
            zz = -13.39838 + (((tickAnim - 35) / 3) * (0-(-13.39838)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -58.5 + (((tickAnim - 38) / 2) * (-36.81461-(-58.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (2.2205-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (-13.39838-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -36.81461 + (((tickAnim - 40) / 10) * (0-(-36.81461)));
            yy = 2.2205 + (((tickAnim - 40) / 10) * (0-(2.2205)));
            zz = -13.39838 + (((tickAnim - 40) / 10) * (0-(-13.39838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (34.25-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 34.25 + (((tickAnim - 33) / 2) * (32.02777-(34.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (36.34287-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (-21.02882-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 32.02777 + (((tickAnim - 35) / 3) * (34.25-(32.02777)));
            yy = 36.34287 + (((tickAnim - 35) / 3) * (0-(36.34287)));
            zz = -21.02882 + (((tickAnim - 35) / 3) * (0-(-21.02882)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 34.25 + (((tickAnim - 38) / 2) * (32.02777-(34.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (36.34287-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (-21.02882-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32.02777 + (((tickAnim - 40) / 10) * (0-(32.02777)));
            yy = 36.34287 + (((tickAnim - 40) / 10) * (0-(36.34287)));
            zz = -21.02882 + (((tickAnim - 40) / 10) * (0-(-21.02882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-8.90956-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (5.67589-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (30.72319-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -8.90956 + (((tickAnim - 33) / 2) * (0-(-8.90956)));
            yy = 5.67589 + (((tickAnim - 33) / 2) * (0-(5.67589)));
            zz = 30.72319 + (((tickAnim - 33) / 2) * (0-(30.72319)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-8.90956-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (5.67589-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (30.72319-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -8.90956 + (((tickAnim - 38) / 2) * (0-(-8.90956)));
            yy = 5.67589 + (((tickAnim - 38) / 2) * (0-(5.67589)));
            zz = 30.72319 + (((tickAnim - 38) / 2) * (0-(30.72319)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -40.75 + (((tickAnim - 30) / 3) * (-20.60939-(-40.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (-4.97969-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.37938-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -20.60939 + (((tickAnim - 33) / 2) * (-40.75-(-20.60939)));
            yy = -4.97969 + (((tickAnim - 33) / 2) * (0-(-4.97969)));
            zz = 10.37938 + (((tickAnim - 33) / 2) * (0-(10.37938)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -40.75 + (((tickAnim - 35) / 3) * (-20.60939-(-40.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (-4.97969-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.37938-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -20.60939 + (((tickAnim - 38) / 2) * (-40.75-(-20.60939)));
            yy = -4.97969 + (((tickAnim - 38) / 2) * (0-(-4.97969)));
            zz = 10.37938 + (((tickAnim - 38) / 2) * (0-(10.37938)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -40.75 + (((tickAnim - 40) / 10) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (34.5-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 34.5 + (((tickAnim - 30) / 3) * (28.06276-(34.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (-18.27011-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (23.99775-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 28.06276 + (((tickAnim - 33) / 2) * (34.5-(28.06276)));
            yy = -18.27011 + (((tickAnim - 33) / 2) * (0-(-18.27011)));
            zz = 23.99775 + (((tickAnim - 33) / 2) * (0-(23.99775)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 34.5 + (((tickAnim - 35) / 3) * (28.06276-(34.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (-18.27011-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (23.99775-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 28.06276 + (((tickAnim - 38) / 2) * (34.5-(28.06276)));
            yy = -18.27011 + (((tickAnim - 38) / 2) * (0-(-18.27011)));
            zz = 23.99775 + (((tickAnim - 38) / 2) * (0-(23.99775)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 40) / 10) * (0-(34.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (-53-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = -53 + (((tickAnim - 30) / 3) * (18-(-53)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 18 + (((tickAnim - 33) / 2) * (-53-(18)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = -53 + (((tickAnim - 35) / 3) * (18-(-53)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 18 + (((tickAnim - 38) / 2) * (-53-(18)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -53 + (((tickAnim - 40) / 10) * (0-(-53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.72217-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-19.06236-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (9.8817-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 9.72217 + (((tickAnim - 7) / 15) * (9.72217-(9.72217)));
            yy = -19.06236 + (((tickAnim - 7) / 15) * (-19.06236-(-19.06236)));
            zz = 9.8817 + (((tickAnim - 7) / 15) * (9.8817-(9.8817)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 9.72217 + (((tickAnim - 22) / 8) * (32-(9.72217)));
            yy = -19.06236 + (((tickAnim - 22) / 8) * (0-(-19.06236)));
            zz = 9.8817 + (((tickAnim - 22) / 8) * (0-(9.8817)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 32 + (((tickAnim - 30) / 10) * (32-(32)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 40) / 10) * (0-(32)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.40385-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-23.68749-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-6.25637-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 3.40385 + (((tickAnim - 7) / 15) * (3.40385-(3.40385)));
            yy = -23.68749 + (((tickAnim - 7) / 15) * (-23.68749-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 7) / 15) * (-6.25637-(-6.25637)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 3.40385 + (((tickAnim - 22) / 18) * (3.40385-(3.40385)));
            yy = -23.68749 + (((tickAnim - 22) / 18) * (-23.68749-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 22) / 18) * (-6.25637-(-6.25637)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.40385 + (((tickAnim - 40) / 10) * (0-(3.40385)));
            yy = -23.68749 + (((tickAnim - 40) / 10) * (0-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 40) / 10) * (0-(-6.25637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.87181-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-6.38431-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (1.22344-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.87181 + (((tickAnim - 10) / 4) * (-1.48425-(-0.87181)));
            yy = -6.38431 + (((tickAnim - 10) / 4) * (0.94633-(-6.38431)));
            zz = 1.22344 + (((tickAnim - 10) / 4) * (-0.25154-(1.22344)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -1.48425 + (((tickAnim - 14) / 4) * (-2.16671-(-1.48425)));
            yy = 0.94633 + (((tickAnim - 14) / 4) * (-2.99794-(0.94633)));
            zz = -0.25154 + (((tickAnim - 14) / 4) * (0.61229-(-0.25154)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -2.16671 + (((tickAnim - 18) / 3) * (-2.55327-(-2.16671)));
            yy = -2.99794 + (((tickAnim - 18) / 3) * (-0.54032-(-2.99794)));
            zz = 0.61229 + (((tickAnim - 18) / 3) * (0.07863-(0.61229)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -2.55327 + (((tickAnim - 21) / 9) * (-3.75-(-2.55327)));
            yy = -0.54032 + (((tickAnim - 21) / 9) * (0-(-0.54032)));
            zz = 0.07863 + (((tickAnim - 21) / 9) * (0-(0.07863)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 30) / 10) * (4.38-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.38 + (((tickAnim - 40) / 10) * (0-(4.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.65527-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (11.73268-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-0.64223-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.65527 + (((tickAnim - 10) / 4) * (-1.11408-(-0.65527)));
            yy = 11.73268 + (((tickAnim - 10) / 4) * (-7.1518-(11.73268)));
            zz = -0.64223 + (((tickAnim - 10) / 4) * (0.52722-(-0.64223)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -1.11408 + (((tickAnim - 14) / 4) * (-1.6654-(-1.11408)));
            yy = -7.1518 + (((tickAnim - 14) / 4) * (11.65879-(-7.1518)));
            zz = 0.52722 + (((tickAnim - 14) / 4) * (-0.832-(0.52722)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -1.6654 + (((tickAnim - 18) / 3) * (-1.88911-(-1.6654)));
            yy = 11.65879 + (((tickAnim - 18) / 3) * (2.51258-(11.65879)));
            zz = -0.832 + (((tickAnim - 18) / 3) * (-0.14102-(-0.832)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -1.88911 + (((tickAnim - 21) / 4) * (-2.28614-(-1.88911)));
            yy = 2.51258 + (((tickAnim - 21) / 4) * (-3.11384-(2.51258)));
            zz = -0.14102 + (((tickAnim - 21) / 4) * (0.29827-(-0.14102)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.28614 + (((tickAnim - 25) / 5) * (-2.75-(-2.28614)));
            yy = -3.11384 + (((tickAnim - 25) / 5) * (0-(-3.11384)));
            zz = 0.29827 + (((tickAnim - 25) / 5) * (0-(0.29827)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 30) / 5) * (-5.06-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.06 + (((tickAnim - 35) / 5) * (7.38-(-5.06)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.38 + (((tickAnim - 40) / 10) * (0-(7.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0.72921-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (13.51852-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (2.53613-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.72921 + (((tickAnim - 10) / 4) * (0.84218-(0.72921)));
            yy = 13.51852 + (((tickAnim - 10) / 4) * (-2.32002-(13.51852)));
            zz = 2.53613 + (((tickAnim - 10) / 4) * (-0.50631-(2.53613)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.84218 + (((tickAnim - 14) / 4) * (1.40434-(0.84218)));
            yy = -2.32002 + (((tickAnim - 14) / 4) * (11.35802-(-2.32002)));
            zz = -0.50631 + (((tickAnim - 14) / 4) * (2.24121-(-0.50631)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.40434 + (((tickAnim - 18) / 3) * (1.4276-(1.40434)));
            yy = 11.35802 + (((tickAnim - 18) / 3) * (1.41344-(11.35802)));
            zz = 2.24121 + (((tickAnim - 18) / 3) * (0.23216-(2.24121)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1.4276 + (((tickAnim - 21) / 4) * (1.72126-(1.4276)));
            yy = 1.41344 + (((tickAnim - 21) / 4) * (-4.37002-(1.41344)));
            zz = 0.23216 + (((tickAnim - 21) / 4) * (-0.93857-(0.23216)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.72126 + (((tickAnim - 25) / 5) * (2-(1.72126)));
            yy = -4.37002 + (((tickAnim - 25) / 5) * (0-(-4.37002)));
            zz = -0.93857 + (((tickAnim - 25) / 5) * (0-(-0.93857)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 30) / 5) * (-8-(2)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -8 + (((tickAnim - 35) / 3) * (-11.16-(-8)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -11.16 + (((tickAnim - 38) / 2) * (3.67-(-11.16)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.67 + (((tickAnim - 40) / 10) * (0-(3.67)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.81326-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-22.74794-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0.31449-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.81326 + (((tickAnim - 10) / 2) * (-1.11729-(-0.81326)));
            yy = -22.74794 + (((tickAnim - 10) / 2) * (22.48676-(-22.74794)));
            zz = 0.31449 + (((tickAnim - 10) / 2) * (-0.44629-(0.31449)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -1.11729 + (((tickAnim - 12) / 2) * (-1.39137-(-1.11729)));
            yy = 22.48676 + (((tickAnim - 12) / 2) * (12.22702-(22.48676)));
            zz = -0.44629 + (((tickAnim - 12) / 2) * (-0.12138-(-0.44629)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -1.39137 + (((tickAnim - 14) / 2) * (-1.76969-(-1.39137)));
            yy = 12.22702 + (((tickAnim - 14) / 2) * (-19.14633-(12.22702)));
            zz = -0.12138 + (((tickAnim - 14) / 2) * (0.85722-(-0.12138)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -1.76969 + (((tickAnim - 16) / 2) * (-2.09238-(-1.76969)));
            yy = -19.14633 + (((tickAnim - 16) / 2) * (-18.10263-(-19.14633)));
            zz = 0.85722 + (((tickAnim - 16) / 2) * (0.86671-(0.85722)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -2.09238 + (((tickAnim - 18) / 3) * (-2.65245-(-2.09238)));
            yy = -18.10263 + (((tickAnim - 18) / 3) * (26.38666-(-18.10263)));
            zz = 0.86671 + (((tickAnim - 18) / 3) * (-1.10359-(0.86671)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -2.65245 + (((tickAnim - 21) / 4) * (0-(-2.65245)));
            yy = 26.38666 + (((tickAnim - 21) / 4) * (-5-(26.38666)));
            zz = -1.10359 + (((tickAnim - 21) / 4) * (0-(-1.10359)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (7.25-(0)));
            yy = -5 + (((tickAnim - 25) / 5) * (0-(-5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 30) / 5) * (-2.31-(7.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -2.31 + (((tickAnim - 35) / 3) * (-3.05-(-2.31)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -3.05 + (((tickAnim - 38) / 1) * (-8.04-(-3.05)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -8.04 + (((tickAnim - 39) / 3) * (12.71-(-8.04)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 12.71 + (((tickAnim - 42) / 8) * (0-(12.71)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.25-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-16-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -16 + (((tickAnim - 30) / 10) * (-16-(-16)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 40) / 10) * (0-(-16)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -14.25 + (((tickAnim - 30) / 10) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 40) / 10) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (31.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 31.75 + (((tickAnim - 30) / 10) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 40) / 10) * (0-(31.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (9.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 9.25 + (((tickAnim - 30) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 40) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -16 + (((tickAnim - 7) / 5) * (39-(-16)));
            yy = -6.75 + (((tickAnim - 7) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 39 + (((tickAnim - 12) / 5) * (-16-(39)));
            yy = -6.75 + (((tickAnim - 12) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -16 + (((tickAnim - 17) / 5) * (39-(-16)));
            yy = -6.75 + (((tickAnim - 17) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 39 + (((tickAnim - 22) / 8) * (39-(39)));
            yy = -6.75 + (((tickAnim - 22) / 8) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 39 + (((tickAnim - 30) / 10) * (39-(39)));
            yy = -6.75 + (((tickAnim - 30) / 10) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 39 + (((tickAnim - 40) / 10) * (0-(39)));
            yy = -6.75 + (((tickAnim - 40) / 10) * (0-(-6.75)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -28.25 + (((tickAnim - 7) / 5) * (5-(-28.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 12) / 2) * (-35.33-(5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -35.33 + (((tickAnim - 14) / 3) * (-28.25-(-35.33)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -28.25 + (((tickAnim - 17) / 7) * (8.68-(-28.25)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 8.68 + (((tickAnim - 24) / 6) * (-2.75-(8.68)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.75 + (((tickAnim - 30) / 10) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -2.75 + (((tickAnim - 40) / 3) * (-3.8408-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (1.24062-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0.61371-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -3.8408 + (((tickAnim - 43) / 2) * (-23.93159-(-3.8408)));
            yy = 1.24062 + (((tickAnim - 43) / 2) * (2.48123-(1.24062)));
            zz = 0.61371 + (((tickAnim - 43) / 2) * (1.22742-(0.61371)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -23.93159 + (((tickAnim - 45) / 5) * (0-(-23.93159)));
            yy = 2.48123 + (((tickAnim - 45) / 5) * (0-(2.48123)));
            zz = 1.22742 + (((tickAnim - 45) / 5) * (0-(1.22742)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0.675-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 43) / 7) * (0-(0.675)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-50.87-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -50.87 + (((tickAnim - 3) / 4) * (16.75-(-50.87)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 16.75 + (((tickAnim - 7) / 5) * (-12.25-(16.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -12.25 + (((tickAnim - 12) / 2) * (-66.38-(-12.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -66.38 + (((tickAnim - 14) / 3) * (16.75-(-66.38)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 16.75 + (((tickAnim - 17) / 5) * (-12.25-(16.75)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -12.25 + (((tickAnim - 22) / 2) * (3.15-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 3.15 + (((tickAnim - 24) / 6) * (-1.75-(3.15)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -1.75 + (((tickAnim - 30) / 10) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -1.75 + (((tickAnim - 40) / 3) * (-74.43-(-1.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -74.43 + (((tickAnim - 43) / 2) * (-70.12-(-74.43)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -70.12 + (((tickAnim - 45) / 5) * (0-(-70.12)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 12) / 1) * (0.53-(0.275)));
            zz = 0.425 + (((tickAnim - 12) / 1) * (0.98-(0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.53 + (((tickAnim - 13) / 1) * (0-(0.53)));
            zz = 0.98 + (((tickAnim - 13) / 1) * (0-(0.98)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.525-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0.175 + (((tickAnim - 22) / 8) * (0-(0.175)));
            zz = 0.525 + (((tickAnim - 22) / 8) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (97-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 97 + (((tickAnim - 3) / 4) * (34-(97)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 34 + (((tickAnim - 7) / 2) * (1-(34)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 9) / 3) * (90-(1)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 90 + (((tickAnim - 12) / 1) * (75.63-(90)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 75.63 + (((tickAnim - 13) / 1) * (104.08-(75.63)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 104.08 + (((tickAnim - 14) / 3) * (34-(104.08)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 34 + (((tickAnim - 17) / 2) * (0-(34)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 5.5 + (((tickAnim - 22) / 2) * (29.18-(5.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 29.18 + (((tickAnim - 24) / 6) * (-22.75-(29.18)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -22.75 + (((tickAnim - 30) / 10) * (-22.75-(-22.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -22.75 + (((tickAnim - 40) / 3) * (91.44-(-22.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 91.44 + (((tickAnim - 43) / 2) * (85.13-(91.44)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 85.13 + (((tickAnim - 45) / 5) * (0-(85.13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -0.525 + (((tickAnim - 3) / 4) * (0-(-0.525)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (1.025-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.025 + (((tickAnim - 12) / 1) * (2.02-(1.025)));
            zz = -0.425 + (((tickAnim - 12) / 1) * (-0.07-(-0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 2.02 + (((tickAnim - 13) / 1) * (0-(2.02)));
            zz = -0.07 + (((tickAnim - 13) / 1) * (0-(-0.07)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0.225-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0.225 + (((tickAnim - 22) / 8) * (0-(0.225)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAlbalophosaurus entity = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -13.25 + (((tickAnim - 10) / 25) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 35) / 15) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -3.15 + (((tickAnim - 10) / 25) * (-3.15-(-3.15)));
            zz = 0.45 + (((tickAnim - 10) / 25) * (0.45-(0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -3.15 + (((tickAnim - 35) / 15) * (0-(-3.15)));
            zz = 0.45 + (((tickAnim - 35) / 15) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 10) / 25) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 35) / 15) * (0-(10.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 10) / 25) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 35) / 15) * (0-(12.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -30 + (((tickAnim - 10) / 25) * (-30-(-30)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 35) / 15) * (0-(-30)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -14.25 + (((tickAnim - 10) / 25) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 35) / 15) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (47.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 47.25 + (((tickAnim - 10) / 25) * (47.25-(47.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 47.25 + (((tickAnim - 35) / 15) * (0-(47.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -25.25 + (((tickAnim - 10) / 25) * (-25.25-(-25.25)));
            yy = -2 + (((tickAnim - 10) / 25) * (-2-(-2)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25.25 + (((tickAnim - 35) / 15) * (0-(-25.25)));
            yy = -2 + (((tickAnim - 35) / 15) * (0-(-2)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -14.5 + (((tickAnim - 10) / 25) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 35) / 15) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-43.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = -43.5 + (((tickAnim - 10) / 25) * (-43.5-(-43.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -43.5 + (((tickAnim - 35) / 15) * (0-(-43.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -14.25 + (((tickAnim - 10) / 25) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 35) / 15) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 1.35 + (((tickAnim - 10) / 25) * (1.35-(1.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 1.35 + (((tickAnim - 35) / 15) * (0-(1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -9.5 + (((tickAnim - 10) / 25) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 35) / 15) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.50276-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.24935-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.07431-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 3.50276 + (((tickAnim - 10) / 25) * (3.50276-(3.50276)));
            yy = -4.24935 + (((tickAnim - 10) / 25) * (-4.24935-(-4.24935)));
            zz = -0.07431 + (((tickAnim - 10) / 25) * (-0.07431-(-0.07431)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.50276 + (((tickAnim - 35) / 15) * (0-(3.50276)));
            yy = -4.24935 + (((tickAnim - 35) / 15) * (0-(-4.24935)));
            zz = -0.07431 + (((tickAnim - 35) / 15) * (0-(-0.07431)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.46609-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.49226-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.35309-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 6.46609 + (((tickAnim - 10) / 25) * (6.46609-(6.46609)));
            yy = -10.49226 + (((tickAnim - 10) / 25) * (-10.49226-(-10.49226)));
            zz = -2.35309 + (((tickAnim - 10) / 25) * (-2.35309-(-2.35309)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 6.46609 + (((tickAnim - 35) / 5) * (-19.25-(6.46609)));
            yy = -10.49226 + (((tickAnim - 35) / 5) * (0-(-10.49226)));
            zz = -2.35309 + (((tickAnim - 35) / 5) * (0-(-2.35309)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 40) / 10) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.14829-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-11.66118-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.45207-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 7.14829 + (((tickAnim - 10) / 25) * (7.14829-(7.14829)));
            yy = -11.66118 + (((tickAnim - 10) / 25) * (-11.66118-(-11.66118)));
            zz = -1.45207 + (((tickAnim - 10) / 25) * (-1.45207-(-1.45207)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.14829 + (((tickAnim - 35) / 5) * (7.33-(7.14829)));
            yy = -11.66118 + (((tickAnim - 35) / 5) * (0-(-11.66118)));
            zz = -1.45207 + (((tickAnim - 35) / 5) * (0-(-1.45207)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 7.33 + (((tickAnim - 40) / 3) * (-21.36-(7.33)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -21.36 + (((tickAnim - 43) / 7) * (0-(-21.36)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -0.35 + (((tickAnim - 10) / 25) * (-0.35-(-0.35)));
            zz = -0.45 + (((tickAnim - 10) / 25) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.35 + (((tickAnim - 35) / 15) * (0-(-0.35)));
            zz = -0.45 + (((tickAnim - 35) / 15) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.9588-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.8949-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.729-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -5.9588 + (((tickAnim - 10) / 25) * (-5.9588-(-5.9588)));
            yy = 7.8949 + (((tickAnim - 10) / 25) * (7.8949-(7.8949)));
            zz = 2.729 + (((tickAnim - 10) / 25) * (2.729-(2.729)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.9588 + (((tickAnim - 35) / 15) * (0-(-5.9588)));
            yy = 7.8949 + (((tickAnim - 35) / 15) * (0-(7.8949)));
            zz = 2.729 + (((tickAnim - 35) / 15) * (0-(2.729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 10) / 25) * (17-(17)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 35) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-78.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -78.25 + (((tickAnim - 10) / 25) * (-78.25-(-78.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -78.25 + (((tickAnim - 35) / 15) * (0-(-78.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (83-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 83 + (((tickAnim - 10) / 25) * (83-(83)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 83 + (((tickAnim - 35) / 15) * (0-(83)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.95882-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.89494-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.72902-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 5.95882 + (((tickAnim - 10) / 25) * (5.95882-(5.95882)));
            yy = -7.89494 + (((tickAnim - 10) / 25) * (-7.89494-(-7.89494)));
            zz = -2.72902 + (((tickAnim - 10) / 25) * (-2.72902-(-2.72902)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.95882 + (((tickAnim - 35) / 15) * (0-(5.95882)));
            yy = -7.89494 + (((tickAnim - 35) / 15) * (0-(-7.89494)));
            zz = -2.72902 + (((tickAnim - 35) / 15) * (0-(-2.72902)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 10) / 25) * (17-(17)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 35) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-92.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -92.25 + (((tickAnim - 10) / 25) * (-92.25-(-92.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -92.25 + (((tickAnim - 35) / 15) * (0-(-92.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (81.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 81.75 + (((tickAnim - 10) / 25) * (81.75-(81.75)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 81.75 + (((tickAnim - 35) / 15) * (0-(81.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAlbalophosaurus entity = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;
        int animCycle = 182;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.75 + (((tickAnim - 10) / 10) * (-6-(2.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -6 + (((tickAnim - 20) / 8) * (-1-(-6)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -1 + (((tickAnim - 28) / 9) * (-6-(-1)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = -6 + (((tickAnim - 37) / 11) * (-3.25-(-6)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = -3.25 + (((tickAnim - 48) / 10) * (-7.75182-(-3.25)));
            yy = 0 + (((tickAnim - 48) / 10) * (-1.23858-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0.16859-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -7.75182 + (((tickAnim - 58) / 10) * (-7.75357-(-7.75182)));
            yy = -1.23858 + (((tickAnim - 58) / 10) * (-1.73401-(-1.23858)));
            zz = 0.16859 + (((tickAnim - 58) / 10) * (0.23606-(0.16859)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = -7.75357 + (((tickAnim - 68) / 7) * (-7.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(-7.75357)));
            yy = -1.73401 + (((tickAnim - 68) / 7) * (-1.73401-(-1.73401)));
            zz = 0.23606 + (((tickAnim - 68) / 7) * (0.23606-(0.23606)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = -7.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 75) / 9) * (-14.29611-(-7.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = -1.73401 + (((tickAnim - 75) / 9) * (-7.4597-(-1.73401)));
            zz = 0.23606 + (((tickAnim - 75) / 9) * (0.76616-(0.23606)));
        }
        else if (tickAnim >= 84 && tickAnim < 95) {
            xx = -14.29611 + (((tickAnim - 84) / 11) * (-13.54611-(-14.29611)));
            yy = -7.4597 + (((tickAnim - 84) / 11) * (-7.4597-(-7.4597)));
            zz = 0.76616 + (((tickAnim - 84) / 11) * (0.76616-(0.76616)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -13.54611 + (((tickAnim - 95) / 10) * (-13.79611-(-13.54611)));
            yy = -7.4597 + (((tickAnim - 95) / 10) * (-7.4597-(-7.4597)));
            zz = 0.76616 + (((tickAnim - 95) / 10) * (0.76616-(0.76616)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = -13.79611 + (((tickAnim - 105) / 5) * (-13.86564-(-13.79611)));
            yy = -7.4597 + (((tickAnim - 105) / 5) * (-4.98642-(-7.4597)));
            zz = 0.76616 + (((tickAnim - 105) / 5) * (0.16241-(0.76616)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -13.86564 + (((tickAnim - 110) / 5) * (-8.37902-(-13.86564)));
            yy = -4.98642 + (((tickAnim - 110) / 5) * (3.1567-(-4.98642)));
            zz = 0.16241 + (((tickAnim - 110) / 5) * (-1.83713-(0.16241)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -8.37902 + (((tickAnim - 115) / 5) * (-13.8829-(-8.37902)));
            yy = 3.1567 + (((tickAnim - 115) / 5) * (9.78287-(3.1567)));
            zz = -1.83713 + (((tickAnim - 115) / 5) * (-3.46456-(-1.83713)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -13.8829 + (((tickAnim - 120) / 10) * (-14.62215-(-13.8829)));
            yy = 9.78287 + (((tickAnim - 120) / 10) * (9.54097-(9.78287)));
            zz = -3.46456 + (((tickAnim - 120) / 10) * (-3.40052-(-3.46456)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -14.62215 + (((tickAnim - 130) / 15) * (0-(-14.62215)));
            yy = 9.54097 + (((tickAnim - 130) / 15) * (0-(9.54097)));
            zz = -3.40052 + (((tickAnim - 130) / 15) * (0-(-3.40052)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 145) / 12) * (-1-(0)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 164) {
            xx = -1 + (((tickAnim - 157) / 7) * (-3-(-1)));
            yy = 0 + (((tickAnim - 157) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 7) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 170) {
            xx = -3 + (((tickAnim - 164) / 6) * (-1-(-3)));
            yy = 0 + (((tickAnim - 164) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 6) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 173) {
            xx = -1 + (((tickAnim - 170) / 3) * (-3-(-1)));
            yy = 0 + (((tickAnim - 170) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 3) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = -3 + (((tickAnim - 173) / 10) * (0-(-3)));
            yy = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.75 + (((tickAnim - 10) / 10) * (12.5-(-4.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 12.5 + (((tickAnim - 20) / 8) * (-2-(12.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -2 + (((tickAnim - 28) / 9) * (12.5-(-2)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 12.5 + (((tickAnim - 37) / 11) * (6.25-(12.5)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 6.25 + (((tickAnim - 48) / 10) * (-2.32131-(6.25)));
            yy = 0 + (((tickAnim - 48) / 10) * (-5.55991-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (1.46857-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -2.32131 + (((tickAnim - 58) / 10) * (-2.32131-(-2.32131)));
            yy = -5.55991 + (((tickAnim - 58) / 10) * (-5.55991-(-5.55991)));
            zz = 1.46857 + (((tickAnim - 58) / 10) * (1.46857-(1.46857)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = -2.32131 + (((tickAnim - 68) / 7) * (-1.82131-(-2.32131)));
            yy = -5.55991 + (((tickAnim - 68) / 7) * (-5.55991-(-5.55991)));
            zz = 1.46857 + (((tickAnim - 68) / 7) * (1.46857-(1.46857)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = -1.82131 + (((tickAnim - 75) / 9) * (-9.96251-(-1.82131)));
            yy = -5.55991 + (((tickAnim - 75) / 9) * (-0.94064-(-5.55991)));
            zz = 1.46857 + (((tickAnim - 75) / 9) * (-0.44877-(1.46857)));
        }
        else if (tickAnim >= 84 && tickAnim < 95) {
            xx = -9.96251 + (((tickAnim - 84) / 11) * (-10.46251-(-9.96251)));
            yy = -0.94064 + (((tickAnim - 84) / 11) * (-0.94064-(-0.94064)));
            zz = -0.44877 + (((tickAnim - 84) / 11) * (-0.44877-(-0.44877)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -10.46251 + (((tickAnim - 95) / 10) * (-9.96251-(-10.46251)));
            yy = -0.94064 + (((tickAnim - 95) / 10) * (-0.94064-(-0.94064)));
            zz = -0.44877 + (((tickAnim - 95) / 10) * (-0.44877-(-0.44877)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = -9.96251 + (((tickAnim - 105) / 5) * (-8.72524-(-9.96251)));
            yy = -0.94064 + (((tickAnim - 105) / 5) * (-1.93383-(-0.94064)));
            zz = -0.44877 + (((tickAnim - 105) / 5) * (-3.22307-(-0.44877)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -8.72524 + (((tickAnim - 110) / 5) * (1.40022-(-8.72524)));
            yy = -1.93383 + (((tickAnim - 110) / 5) * (5.79951-(-1.93383)));
            zz = -3.22307 + (((tickAnim - 110) / 5) * (0.60657-(-3.22307)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 1.40022 + (((tickAnim - 115) / 5) * (-8.62627-(1.40022)));
            yy = 5.79951 + (((tickAnim - 115) / 5) * (12.45057-(5.79951)));
            zz = 0.60657 + (((tickAnim - 115) / 5) * (4.14499-(0.60657)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -8.62627 + (((tickAnim - 120) / 10) * (-5.59263-(-8.62627)));
            yy = 12.45057 + (((tickAnim - 120) / 10) * (11.97534-(12.45057)));
            zz = 4.14499 + (((tickAnim - 120) / 10) * (4.304-(4.14499)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -5.59263 + (((tickAnim - 130) / 15) * (0-(-5.59263)));
            yy = 11.97534 + (((tickAnim - 130) / 15) * (0-(11.97534)));
            zz = 4.304 + (((tickAnim - 130) / 15) * (0-(4.304)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 145) / 12) * (3-(0)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 164) {
            xx = 3 + (((tickAnim - 157) / 7) * (7.75-(3)));
            yy = 0 + (((tickAnim - 157) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 7) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 170) {
            xx = 7.75 + (((tickAnim - 164) / 6) * (3-(7.75)));
            yy = 0 + (((tickAnim - 164) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 6) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 173) {
            xx = 3 + (((tickAnim - 170) / 3) * (7.75-(3)));
            yy = 0 + (((tickAnim - 170) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 3) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 7.75 + (((tickAnim - 173) / 10) * (0-(7.75)));
            yy = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 15.75 + (((tickAnim - 10) / 18) * (12.65969-(15.75)));
            yy = 0 + (((tickAnim - 10) / 18) * (10.70712-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (-5.04723-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 145) {
            xx = 12.65969 + (((tickAnim - 28) / 117) * (-11.09031-(12.65969)));
            yy = 10.70712 + (((tickAnim - 28) / 117) * (10.70712-(10.70712)));
            zz = -5.04723 + (((tickAnim - 28) / 117) * (-5.04723-(-5.04723)));
        }
        else if (tickAnim >= 145 && tickAnim < 183) {
            xx = -11.09031 + (((tickAnim - 145) / 38) * (0-(-11.09031)));
            yy = 10.70712 + (((tickAnim - 145) / 38) * (0-(10.70712)));
            zz = -5.04723 + (((tickAnim - 145) / 38) * (0-(-5.04723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-31.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (4.25-(0)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = -31.75 + (((tickAnim - 10) / 18) * (-31.75-(-31.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 145) {
            xx = 4.25 + (((tickAnim - 28) / 117) * (25.5-(4.25)));
            yy = 0 + (((tickAnim - 28) / 117) * (0-(0)));
            zz = -31.75 + (((tickAnim - 28) / 117) * (-31.75-(-31.75)));
        }
        else if (tickAnim >= 145 && tickAnim < 183) {
            xx = 25.5 + (((tickAnim - 145) / 38) * (0-(25.5)));
            yy = 0 + (((tickAnim - 145) / 38) * (0-(0)));
            zz = -31.75 + (((tickAnim - 145) / 38) * (0-(-31.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (1.75-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 28) / 155) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 155) * (0-(0)));
            zz = 1.75 + (((tickAnim - 28) / 155) * (0-(1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 10) / 18) * (18-(10)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 145) {
            xx = 18 + (((tickAnim - 28) / 117) * (7.75-(18)));
            yy = 0 + (((tickAnim - 28) / 117) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 117) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 183) {
            xx = 7.75 + (((tickAnim - 145) / 38) * (0-(7.75)));
            yy = 0 + (((tickAnim - 145) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (27-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (-4-(0)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 27 + (((tickAnim - 10) / 18) * (27-(27)));
        }
        else if (tickAnim >= 28 && tickAnim < 145) {
            xx = -4 + (((tickAnim - 28) / 117) * (6-(-4)));
            yy = 0 + (((tickAnim - 28) / 117) * (0-(0)));
            zz = 27 + (((tickAnim - 28) / 117) * (27-(27)));
        }
        else if (tickAnim >= 145 && tickAnim < 183) {
            xx = 6 + (((tickAnim - 145) / 38) * (0-(6)));
            yy = 0 + (((tickAnim - 145) / 38) * (0-(0)));
            zz = 27 + (((tickAnim - 145) / 38) * (0-(27)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 28) / 155) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 155) * (0-(0)));
            zz = -5 + (((tickAnim - 28) / 155) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.5 + (((tickAnim - 10) / 10) * (-9-(6.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -9 + (((tickAnim - 20) / 8) * (9.25-(-9)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 9.25 + (((tickAnim - 28) / 9) * (-9-(9.25)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = -9 + (((tickAnim - 37) / 11) * (2.75-(-9)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 2.75 + (((tickAnim - 48) / 10) * (5.91275-(2.75)));
            yy = 0 + (((tickAnim - 48) / 10) * (-11.38321-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (-8.10157-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = 5.91275 + (((tickAnim - 58) / 10) * (5.91275-(5.91275)));
            yy = -11.38321 + (((tickAnim - 58) / 10) * (-11.38321-(-11.38321)));
            zz = -8.10157 + (((tickAnim - 58) / 10) * (-8.10157-(-8.10157)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 5.91275 + (((tickAnim - 68) / 7) * (14.16275-(5.91275)));
            yy = -11.38321 + (((tickAnim - 68) / 7) * (-11.38321-(-11.38321)));
            zz = -8.10157 + (((tickAnim - 68) / 7) * (-8.10157-(-8.10157)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 14.16275 + (((tickAnim - 75) / 9) * (6.16275-(14.16275)));
            yy = -11.38321 + (((tickAnim - 75) / 9) * (-11.38321-(-11.38321)));
            zz = -8.10157 + (((tickAnim - 75) / 9) * (-8.10157-(-8.10157)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 6.16275 + (((tickAnim - 84) / 4) * (7.02485-(6.16275)));
            yy = -11.38321 + (((tickAnim - 84) / 4) * (-14.00717-(-11.38321)));
            zz = -8.10157 + (((tickAnim - 84) / 4) * (-11.68712-(-8.10157)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 7.02485 + (((tickAnim - 88) / 5) * (10.23924-(7.02485)));
            yy = -14.00717 + (((tickAnim - 88) / 5) * (-24.84319-(-14.00717)));
            zz = -11.68712 + (((tickAnim - 88) / 5) * (-17.52618-(-11.68712)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 10.23924 + (((tickAnim - 93) / 7) * (10.23924-(10.23924)));
            yy = -24.84319 + (((tickAnim - 93) / 7) * (-24.84319-(-24.84319)));
            zz = -17.52618 + (((tickAnim - 93) / 7) * (-17.52618-(-17.52618)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 10.23924 + (((tickAnim - 100) / 10) * (8.48924-(10.23924)));
            yy = -24.84319 + (((tickAnim - 100) / 10) * (-24.84319-(-24.84319)));
            zz = -17.52618 + (((tickAnim - 100) / 10) * (-17.52618-(-17.52618)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 8.48924 + (((tickAnim - 110) / 5) * (17.54335-(8.48924)));
            yy = -24.84319 + (((tickAnim - 110) / 5) * (1.71415-(-24.84319)));
            zz = -17.52618 + (((tickAnim - 110) / 5) * (-0.45234-(-17.52618)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 17.54335 + (((tickAnim - 115) / 5) * (18.00819-(17.54335)));
            yy = 1.71415 + (((tickAnim - 115) / 5) * (24.1891-(1.71415)));
            zz = -0.45234 + (((tickAnim - 115) / 5) * (13.99691-(-0.45234)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 18.00819 + (((tickAnim - 120) / 10) * (18.32613-(18.00819)));
            yy = 24.1891 + (((tickAnim - 120) / 10) * (22.49089-(24.1891)));
            zz = 13.99691 + (((tickAnim - 120) / 10) * (15.99497-(13.99691)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 18.32613 + (((tickAnim - 130) / 15) * (0-(18.32613)));
            yy = 22.49089 + (((tickAnim - 130) / 15) * (0-(22.49089)));
            zz = 15.99497 + (((tickAnim - 130) / 15) * (0-(15.99497)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 145) / 12) * (4.25-(0)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 164) {
            xx = 4.25 + (((tickAnim - 157) / 7) * (-2.5-(4.25)));
            yy = 0 + (((tickAnim - 157) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 7) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 170) {
            xx = -2.5 + (((tickAnim - 164) / 6) * (4.25-(-2.5)));
            yy = 0 + (((tickAnim - 164) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 6) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 173) {
            xx = 4.25 + (((tickAnim - 170) / 3) * (0.5-(4.25)));
            yy = 0 + (((tickAnim - 170) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 3) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 0.5 + (((tickAnim - 173) / 10) * (0-(0.5)));
            yy = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.9-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0.9 + (((tickAnim - 20) / 8) * (0-(0.9)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0.9-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0.9 + (((tickAnim - 37) / 11) * (0-(0.9)));
        }
        else if (tickAnim >= 48 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 48) / 97) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 97) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 145) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.75 + (((tickAnim - 10) / 10) * (10-(-7.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 20) / 8) * (-17.5-(10)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -17.5 + (((tickAnim - 28) / 9) * (10-(-17.5)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 37) / 11) * (-7.25-(10)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = -7.25 + (((tickAnim - 48) / 10) * (8.5-(-7.25)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = 8.5 + (((tickAnim - 58) / 10) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 58) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 10) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 8.5 + (((tickAnim - 68) / 7) * (-5.75-(8.5)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = -5.75 + (((tickAnim - 75) / 9) * (17-(-5.75)));
            yy = 0 + (((tickAnim - 75) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 9) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 17 + (((tickAnim - 84) / 4) * (17-(17)));
            yy = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 4) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 17 + (((tickAnim - 88) / 5) * (17.21432-(17)));
            yy = 0 + (((tickAnim - 88) / 5) * (-4.98663-(0)));
            zz = 0 + (((tickAnim - 88) / 5) * (-4.9188-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 94) {
            xx = 17.21432 + (((tickAnim - 93) / 1) * (15.22872-(17.21432)));
            yy = -4.98663 + (((tickAnim - 93) / 1) * (-5.32181-(-4.98663)));
            zz = -4.9188 + (((tickAnim - 93) / 1) * (-5.24942-(-4.9188)));
        }
        else if (tickAnim >= 94 && tickAnim < 96) {
            xx = 15.22872 + (((tickAnim - 94) / 2) * (17.21432-(15.22872)));
            yy = -5.32181 + (((tickAnim - 94) / 2) * (-4.98663-(-5.32181)));
            zz = -5.24942 + (((tickAnim - 94) / 2) * (-4.9188-(-5.24942)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = 17.21432 + (((tickAnim - 96) / 2) * (15.22872-(17.21432)));
            yy = -4.98663 + (((tickAnim - 96) / 2) * (-5.32181-(-4.98663)));
            zz = -4.9188 + (((tickAnim - 96) / 2) * (-5.24942-(-4.9188)));
        }
        else if (tickAnim >= 98 && tickAnim < 99) {
            xx = 15.22872 + (((tickAnim - 98) / 1) * (17.21432-(15.22872)));
            yy = -5.32181 + (((tickAnim - 98) / 1) * (-4.98663-(-5.32181)));
            zz = -5.24942 + (((tickAnim - 98) / 1) * (-4.9188-(-5.24942)));
        }
        else if (tickAnim >= 99 && tickAnim < 100) {
            xx = 17.21432 + (((tickAnim - 99) / 1) * (17.21432-(17.21432)));
            yy = -4.98663 + (((tickAnim - 99) / 1) * (-4.98663-(-4.98663)));
            zz = -4.9188 + (((tickAnim - 99) / 1) * (-4.9188-(-4.9188)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 17.21432 + (((tickAnim - 100) / 10) * (19.08308-(17.21432)));
            yy = -4.98663 + (((tickAnim - 100) / 10) * (-3.27032-(-4.98663)));
            zz = -4.9188 + (((tickAnim - 100) / 10) * (-3.09625-(-4.9188)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 19.08308 + (((tickAnim - 110) / 5) * (-3.50106-(19.08308)));
            yy = -3.27032 + (((tickAnim - 110) / 5) * (-3.95574-(-3.27032)));
            zz = -3.09625 + (((tickAnim - 110) / 5) * (-1.411-(-3.09625)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -3.50106 + (((tickAnim - 115) / 5) * (-1.12014-(-3.50106)));
            yy = -3.95574 + (((tickAnim - 115) / 5) * (-4.71983-(-3.95574)));
            zz = -1.411 + (((tickAnim - 115) / 5) * (-0.18023-(-1.411)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -1.12014 + (((tickAnim - 120) / 10) * (-0.37014-(-1.12014)));
            yy = -4.71983 + (((tickAnim - 120) / 10) * (-4.71983-(-4.71983)));
            zz = -0.18023 + (((tickAnim - 120) / 10) * (-0.18023-(-0.18023)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -0.37014 + (((tickAnim - 130) / 15) * (0-(-0.37014)));
            yy = -4.71983 + (((tickAnim - 130) / 15) * (0-(-4.71983)));
            zz = -0.18023 + (((tickAnim - 130) / 15) * (0-(-0.18023)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 145) / 12) * (-7-(0)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 164) {
            xx = -7 + (((tickAnim - 157) / 7) * (-0.75-(-7)));
            yy = 0 + (((tickAnim - 157) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 7) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 170) {
            xx = -0.75 + (((tickAnim - 164) / 6) * (-7-(-0.75)));
            yy = 0 + (((tickAnim - 164) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 6) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 173) {
            xx = -7 + (((tickAnim - 170) / 3) * (-0.75-(-7)));
            yy = 0 + (((tickAnim - 170) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 3) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = -0.75 + (((tickAnim - 173) / 10) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.63 + (((tickAnim - 5) / 5) * (-0.25-(19.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 10) / 10) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -0.25 + (((tickAnim - 20) / 8) * (25.5-(-0.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 25.5 + (((tickAnim - 28) / 4) * (-0.5-(25.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -0.5 + (((tickAnim - 32) / 5) * (-0.25-(-0.5)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -0.25 + (((tickAnim - 37) / 5) * (5.52-(-0.25)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 5.52 + (((tickAnim - 42) / 1) * (-0.25-(5.52)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -0.25 + (((tickAnim - 43) / 2) * (5.52-(-0.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 5.52 + (((tickAnim - 45) / 2) * (-0.25-(5.52)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = -0.25 + (((tickAnim - 47) / 1) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 99) {
            xx = -0.25 + (((tickAnim - 48) / 51) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 48) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 51) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 103) {
            xx = -0.25 + (((tickAnim - 99) / 4) * (1-(-0.25)));
            yy = 0 + (((tickAnim - 99) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 4) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = 1 + (((tickAnim - 103) / 4) * (-0.25-(1)));
            yy = 0 + (((tickAnim - 103) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 4) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 145) {
            xx = -0.25 + (((tickAnim - 107) / 38) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 107) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 38) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = -0.25 + (((tickAnim - 145) / 12) * (11-(-0.25)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 164) {
            xx = 11 + (((tickAnim - 157) / 7) * (-1-(11)));
            yy = 0 + (((tickAnim - 157) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 7) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 170) {
            xx = -1 + (((tickAnim - 164) / 6) * (11-(-1)));
            yy = 0 + (((tickAnim - 164) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 6) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 173) {
            xx = 11 + (((tickAnim - 170) / 3) * (-1-(11)));
            yy = 0 + (((tickAnim - 170) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 3) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 178) {
            xx = -1 + (((tickAnim - 173) / 5) * (2.13-(-1)));
            yy = 0 + (((tickAnim - 173) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 5) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 179) {
            xx = 2.13 + (((tickAnim - 178) / 1) * (0-(2.13)));
            yy = 0 + (((tickAnim - 178) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 1) * (0-(0)));
        }
        else if (tickAnim >= 179 && tickAnim < 181) {
            xx = 0 + (((tickAnim - 179) / 2) * (2.13-(0)));
            yy = 0 + (((tickAnim - 179) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 179) / 2) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 183) {
            xx = 2.13 + (((tickAnim - 181) / 2) * (0-(2.13)));
            yy = 0 + (((tickAnim - 181) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.25 + (((tickAnim - 10) / 10) * (4.98811-(-4.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.47001-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.06727-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 4.98811 + (((tickAnim - 20) / 8) * (7.23811-(4.98811)));
            yy = -0.47001 + (((tickAnim - 20) / 8) * (-0.47001-(-0.47001)));
            zz = -0.06727 + (((tickAnim - 20) / 8) * (-0.06727-(-0.06727)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 7.23811 + (((tickAnim - 28) / 9) * (0-(7.23811)));
            yy = -0.47001 + (((tickAnim - 28) / 9) * (0-(-0.47001)));
            zz = -0.06727 + (((tickAnim - 28) / 9) * (0-(-0.06727)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 37) / 21) * (-5.04935-(0)));
            yy = 0 + (((tickAnim - 37) / 21) * (-4.58779-(0)));
            zz = 0 + (((tickAnim - 37) / 21) * (1.23202-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -5.04935 + (((tickAnim - 58) / 10) * (-5.04935-(-5.04935)));
            yy = -4.58779 + (((tickAnim - 58) / 10) * (-4.58779-(-4.58779)));
            zz = 1.23202 + (((tickAnim - 58) / 10) * (1.23202-(1.23202)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = -5.04935 + (((tickAnim - 68) / 17) * (-17.79935-(-5.04935)));
            yy = -4.58779 + (((tickAnim - 68) / 17) * (-4.58779-(-4.58779)));
            zz = 1.23202 + (((tickAnim - 68) / 17) * (1.23202-(1.23202)));
        }
        else if (tickAnim >= 85 && tickAnim < 104) {
            xx = -17.79935 + (((tickAnim - 85) / 19) * (-17.79023-(-17.79935)));
            yy = -4.58779 + (((tickAnim - 85) / 19) * (-4.36664-(-4.58779)));
            zz = 1.23202 + (((tickAnim - 85) / 19) * (1.11509-(1.23202)));
        }
        else if (tickAnim >= 104 && tickAnim < 130) {
            xx = -17.79023 + (((tickAnim - 104) / 26) * (-17.71796-(-17.79023)));
            yy = -4.36664 + (((tickAnim - 104) / 26) * (1.82971-(-4.36664)));
            zz = 1.11509 + (((tickAnim - 104) / 26) * (-2.14386-(1.11509)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -17.71796 + (((tickAnim - 130) / 15) * (0-(-17.71796)));
            yy = 1.82971 + (((tickAnim - 130) / 15) * (0-(1.82971)));
            zz = -2.14386 + (((tickAnim - 130) / 15) * (0-(-2.14386)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 145) / 12) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = -1.5 + (((tickAnim - 157) / 10) * (0.25-(-1.5)));
            yy = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 10) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 176) {
            xx = 0.25 + (((tickAnim - 167) / 9) * (-1.5-(0.25)));
            yy = 0 + (((tickAnim - 167) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 9) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 183) {
            xx = -1.5 + (((tickAnim - 176) / 7) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 176) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 10) / 10) * (1.25-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 1.25 + (((tickAnim - 20) / 8) * (12-(1.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 12 + (((tickAnim - 28) / 9) * (0-(12)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 37) / 21) * (-1.52016-(0)));
            yy = 0 + (((tickAnim - 37) / 21) * (-5.73595-(0)));
            zz = 0 + (((tickAnim - 37) / 21) * (0.40245-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -1.52016 + (((tickAnim - 58) / 10) * (-1.52016-(-1.52016)));
            yy = -5.73595 + (((tickAnim - 58) / 10) * (-5.73595-(-5.73595)));
            zz = 0.40245 + (((tickAnim - 58) / 10) * (0.40245-(0.40245)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = -1.52016 + (((tickAnim - 68) / 17) * (-12.27016-(-1.52016)));
            yy = -5.73595 + (((tickAnim - 68) / 17) * (-5.73595-(-5.73595)));
            zz = 0.40245 + (((tickAnim - 68) / 17) * (0.40245-(0.40245)));
        }
        else if (tickAnim >= 85 && tickAnim < 104) {
            xx = -12.27016 + (((tickAnim - 85) / 19) * (-12.21158-(-12.27016)));
            yy = -5.73595 + (((tickAnim - 85) / 19) * (2.72713-(-5.73595)));
            zz = 0.40245 + (((tickAnim - 85) / 19) * (-1.82272-(0.40245)));
        }
        else if (tickAnim >= 104 && tickAnim < 130) {
            xx = -12.21158 + (((tickAnim - 104) / 26) * (-12.31805-(-12.21158)));
            yy = 2.72713 + (((tickAnim - 104) / 26) * (7.32045-(2.72713)));
            zz = -1.82272 + (((tickAnim - 104) / 26) * (-3.03761-(-1.82272)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -12.31805 + (((tickAnim - 130) / 15) * (0-(-12.31805)));
            yy = 7.32045 + (((tickAnim - 130) / 15) * (0-(7.32045)));
            zz = -3.03761 + (((tickAnim - 130) / 15) * (0-(-3.03761)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 145) / 12) * (-2-(0)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = -2 + (((tickAnim - 157) / 10) * (0.75-(-2)));
            yy = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 10) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 176) {
            xx = 0.75 + (((tickAnim - 167) / 9) * (-2-(0.75)));
            yy = 0 + (((tickAnim - 167) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 9) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 183) {
            xx = -2 + (((tickAnim - 176) / 7) * (0-(-2)));
            yy = 0 + (((tickAnim - 176) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 10) / 10) * (-19-(2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -19 + (((tickAnim - 20) / 8) * (-6-(-19)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -6 + (((tickAnim - 28) / 9) * (0-(-6)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 37) / 21) * (-4.4987-(0)));
            yy = 0 + (((tickAnim - 37) / 21) * (-1.24424-(0)));
            zz = 0 + (((tickAnim - 37) / 21) * (-0.11983-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -4.4987 + (((tickAnim - 58) / 10) * (-4.4987-(-4.4987)));
            yy = -1.24424 + (((tickAnim - 58) / 10) * (-1.24424-(-1.24424)));
            zz = -0.11983 + (((tickAnim - 58) / 10) * (-0.11983-(-0.11983)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = -4.4987 + (((tickAnim - 68) / 17) * (5.7513-(-4.4987)));
            yy = -1.24424 + (((tickAnim - 68) / 17) * (-1.24424-(-1.24424)));
            zz = -0.11983 + (((tickAnim - 68) / 17) * (-0.11983-(-0.11983)));
        }
        else if (tickAnim >= 85 && tickAnim < 104) {
            xx = 5.7513 + (((tickAnim - 85) / 19) * (5.81561-(5.7513)));
            yy = -1.24424 + (((tickAnim - 85) / 19) * (5.25181-(-1.24424)));
            zz = -0.11983 + (((tickAnim - 85) / 19) * (1.71633-(-0.11983)));
        }
        else if (tickAnim >= 104 && tickAnim < 117) {
            xx = 5.81561 + (((tickAnim - 104) / 13) * (5.8254-(5.81561)));
            yy = 5.25181 + (((tickAnim - 104) / 13) * (-3.41656-(5.25181)));
            zz = 1.71633 + (((tickAnim - 104) / 13) * (-0.72806-(1.71633)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 5.8254 + (((tickAnim - 117) / 13) * (6.09313-(5.8254)));
            yy = -3.41656 + (((tickAnim - 117) / 13) * (11.7424-(-3.41656)));
            zz = -0.72806 + (((tickAnim - 117) / 13) * (3.5913-(-0.72806)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 6.09313 + (((tickAnim - 130) / 15) * (0-(6.09313)));
            yy = 11.7424 + (((tickAnim - 130) / 15) * (0-(11.7424)));
            zz = 3.5913 + (((tickAnim - 130) / 15) * (0-(3.5913)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 145) / 12) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = -3.25 + (((tickAnim - 157) / 10) * (0.25-(-3.25)));
            yy = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 10) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 176) {
            xx = 0.25 + (((tickAnim - 167) / 9) * (-3.25-(0.25)));
            yy = 0 + (((tickAnim - 167) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 9) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 183) {
            xx = -3.25 + (((tickAnim - 176) / 7) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 176) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 10) / 10) * (-16.21112-(9.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (1.20968-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.53975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -16.21112 + (((tickAnim - 20) / 8) * (-4.71112-(-16.21112)));
            yy = 1.20968 + (((tickAnim - 20) / 8) * (1.20968-(1.20968)));
            zz = 0.53975 + (((tickAnim - 20) / 8) * (0.53975-(0.53975)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -4.71112 + (((tickAnim - 28) / 9) * (0-(-4.71112)));
            yy = 1.20968 + (((tickAnim - 28) / 9) * (0-(1.20968)));
            zz = 0.53975 + (((tickAnim - 28) / 9) * (0-(0.53975)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 37) / 21) * (3.91565-(0)));
            yy = 0 + (((tickAnim - 37) / 21) * (-16.71308-(0)));
            zz = 0 + (((tickAnim - 37) / 21) * (-1.12767-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = 3.91565 + (((tickAnim - 58) / 10) * (3.91565-(3.91565)));
            yy = -16.71308 + (((tickAnim - 58) / 10) * (-16.71308-(-16.71308)));
            zz = -1.12767 + (((tickAnim - 58) / 10) * (-1.12767-(-1.12767)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = 3.91565 + (((tickAnim - 68) / 17) * (12.41565-(3.91565)));
            yy = -16.71308 + (((tickAnim - 68) / 17) * (-16.71308-(-16.71308)));
            zz = -1.12767 + (((tickAnim - 68) / 17) * (-1.12767-(-1.12767)));
        }
        else if (tickAnim >= 85 && tickAnim < 104) {
            xx = 12.41565 + (((tickAnim - 85) / 19) * (11.89103-(12.41565)));
            yy = -16.71308 + (((tickAnim - 85) / 19) * (-2.04541-(-16.71308)));
            zz = -1.12767 + (((tickAnim - 85) / 19) * (2.06433-(-1.12767)));
        }
        else if (tickAnim >= 104 && tickAnim < 117) {
            xx = 11.89103 + (((tickAnim - 104) / 13) * (12.00309-(11.89103)));
            yy = -2.04541 + (((tickAnim - 104) / 13) * (-6.29518-(-2.04541)));
            zz = 2.06433 + (((tickAnim - 104) / 13) * (1.17477-(2.06433)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 12.00309 + (((tickAnim - 117) / 13) * (12.06714-(12.00309)));
            yy = -6.29518 + (((tickAnim - 117) / 13) * (9.9398-(-6.29518)));
            zz = 1.17477 + (((tickAnim - 117) / 13) * (4.60828-(1.17477)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 12.06714 + (((tickAnim - 130) / 15) * (0-(12.06714)));
            yy = 9.9398 + (((tickAnim - 130) / 15) * (0-(9.9398)));
            zz = 4.60828 + (((tickAnim - 130) / 15) * (0-(4.60828)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 145) / 12) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 162) {
            xx = -4.5 + (((tickAnim - 157) / 5) * (-3.72-(-4.5)));
            yy = 0 + (((tickAnim - 157) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 5) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 167) {
            xx = -3.72 + (((tickAnim - 162) / 5) * (6.5-(-3.72)));
            yy = 0 + (((tickAnim - 162) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 5) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 176) {
            xx = 6.5 + (((tickAnim - 167) / 9) * (-4.5-(6.5)));
            yy = 0 + (((tickAnim - 167) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 9) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 183) {
            xx = -4.5 + (((tickAnim - 176) / 7) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 176) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 68 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 68) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 17) * (-0.25-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 85) / 98) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 98) * (0-(0)));
            zz = -0.25 + (((tickAnim - 85) / 98) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAlbalophosaurus entity = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.62773-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.24749-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.25362-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.62773 + (((tickAnim - 10) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 10) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 10) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.87773 + (((tickAnim - 13) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 13) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 13) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 11.62773 + (((tickAnim - 15) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 15) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 15) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.87773 + (((tickAnim - 18) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 18) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 18) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 11.62773 + (((tickAnim - 20) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 20) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 20) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 12.87773 + (((tickAnim - 23) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 23) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 23) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 11.62773 + (((tickAnim - 25) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 25) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 25) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.87773 + (((tickAnim - 28) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 28) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 28) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 11.62773 + (((tickAnim - 30) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 30) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 30) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12.87773 + (((tickAnim - 33) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 33) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 33) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 11.62773 + (((tickAnim - 35) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 35) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 35) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 12.87773 + (((tickAnim - 38) / 4) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 38) / 4) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 38) / 4) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 11.62773 + (((tickAnim - 42) / 13) * (0-(11.62773)));
            yy = 3.24749 + (((tickAnim - 42) / 13) * (0-(3.24749)));
            zz = 2.25362 + (((tickAnim - 42) / 13) * (0-(2.25362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.39605-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.06105-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.98308-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.39605 + (((tickAnim - 10) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 10) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 10) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.96395 + (((tickAnim - 13) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 13) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 13) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.39605 + (((tickAnim - 15) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 15) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 15) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.96395 + (((tickAnim - 18) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 18) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 18) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6.39605 + (((tickAnim - 20) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 20) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 20) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.96395 + (((tickAnim - 23) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 23) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 23) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6.39605 + (((tickAnim - 25) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 25) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 25) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.96395 + (((tickAnim - 28) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 28) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 28) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6.39605 + (((tickAnim - 30) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 30) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 30) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.96395 + (((tickAnim - 33) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 33) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 33) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6.39605 + (((tickAnim - 35) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 35) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 35) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.96395 + (((tickAnim - 38) / 4) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 38) / 4) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 38) / 4) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6.39605 + (((tickAnim - 42) / 13) * (0-(6.39605)));
            yy = -10.06105 + (((tickAnim - 42) / 13) * (0-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 42) / 13) * (0-(1.98308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = -31.5 + (((tickAnim - 10) / 31) * (-31.5-(-31.5)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 31) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = -31.5 + (((tickAnim - 41) / 14) * (0-(-31.5)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 36.75 + (((tickAnim - 10) / 31) * (36.75-(36.75)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 31) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 36.75 + (((tickAnim - 41) / 14) * (0-(36.75)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (25.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 25.75 + (((tickAnim - 10) / 31) * (25.75-(25.75)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 25.75 + (((tickAnim - 41) / 14) * (0-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34.43858-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.21784-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (28.02752-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 34.43858 + (((tickAnim - 10) / 31) * (34.43858-(34.43858)));
            yy = -5.21784 + (((tickAnim - 10) / 31) * (-5.21784-(-5.21784)));
            zz = 28.02752 + (((tickAnim - 10) / 31) * (28.02752-(28.02752)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 34.43858 + (((tickAnim - 41) / 14) * (0-(34.43858)));
            yy = -5.21784 + (((tickAnim - 41) / 14) * (0-(-5.21784)));
            zz = 28.02752 + (((tickAnim - 41) / 14) * (0-(28.02752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 10) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 10) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.18391 + (((tickAnim - 13) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 13) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 13) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 15) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 15) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.18391 + (((tickAnim - 18) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 18) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 18) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 20) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 20) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.18391 + (((tickAnim - 23) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 23) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 23) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 25) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 25) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.18391 + (((tickAnim - 28) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 28) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 28) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 30) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 30) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.18391 + (((tickAnim - 33) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 33) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 33) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6 + (((tickAnim - 35) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 35) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.18391 + (((tickAnim - 38) / 4) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 38) / 4) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 38) / 4) * (0-(10.37068)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6 + (((tickAnim - 42) / 13) * (0-(6)));
            yy = -22.25 + (((tickAnim - 42) / 13) * (0-(-22.25)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 10) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 10) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -3.55309 + (((tickAnim - 13) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 13) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 13) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 15) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 15) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3.55309 + (((tickAnim - 18) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 18) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 18) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 20) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -3.55309 + (((tickAnim - 23) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 23) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 23) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 25) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 25) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.55309 + (((tickAnim - 28) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 28) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 28) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 30) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -3.55309 + (((tickAnim - 33) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 33) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 33) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 35) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -3.55309 + (((tickAnim - 38) / 4) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 38) / 4) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 38) / 4) * (0-(10.31088)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            yy = -17.75 + (((tickAnim - 42) / 13) * (0-(-17.75)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 10) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 13) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 15) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 18) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2 + (((tickAnim - 20) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.25 + (((tickAnim - 23) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -2 + (((tickAnim - 25) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 28) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 30) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 33) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -2 + (((tickAnim - 35) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 38) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -2 + (((tickAnim - 40) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2.25 + (((tickAnim - 43) / 2) * (5.27-(2.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 5.27 + (((tickAnim - 45) / 10) * (0-(5.27)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 10) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 13) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3.25 + (((tickAnim - 15) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 18) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -3.25 + (((tickAnim - 20) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 6.25 + (((tickAnim - 23) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -3.25 + (((tickAnim - 25) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 6.25 + (((tickAnim - 28) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -3.25 + (((tickAnim - 30) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 33) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -3.25 + (((tickAnim - 35) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 38) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -3.25 + (((tickAnim - 40) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 6.25 + (((tickAnim - 43) / 2) * (3.34-(6.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3.34 + (((tickAnim - 45) / 10) * (0-(3.34)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -8.25 + (((tickAnim - 10) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.19 + (((tickAnim - 11) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1 + (((tickAnim - 13) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -8.25 + (((tickAnim - 15) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11.19 + (((tickAnim - 16) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 18) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -8.25 + (((tickAnim - 20) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -11.19 + (((tickAnim - 21) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -1 + (((tickAnim - 23) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -8.25 + (((tickAnim - 25) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -11.19 + (((tickAnim - 26) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 28) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -8.25 + (((tickAnim - 30) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -11.19 + (((tickAnim - 31) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 33) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -8.25 + (((tickAnim - 35) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -11.19 + (((tickAnim - 36) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 38) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -8.25 + (((tickAnim - 40) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -11.19 + (((tickAnim - 41) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -1 + (((tickAnim - 43) / 2) * (-0.63-(-1)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -0.63 + (((tickAnim - 45) / 10) * (0-(-0.63)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -5.75 + (((tickAnim - 10) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.09 + (((tickAnim - 11) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 13) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -5.75 + (((tickAnim - 15) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11.09 + (((tickAnim - 16) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 18) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -5.75 + (((tickAnim - 20) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -11.09 + (((tickAnim - 21) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2 + (((tickAnim - 23) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -5.75 + (((tickAnim - 25) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -11.09 + (((tickAnim - 26) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2 + (((tickAnim - 28) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -5.75 + (((tickAnim - 30) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -11.09 + (((tickAnim - 31) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 33) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -5.75 + (((tickAnim - 35) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -11.09 + (((tickAnim - 36) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 38) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -5.75 + (((tickAnim - 40) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -11.09 + (((tickAnim - 41) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2 + (((tickAnim - 43) / 2) * (3.24-(2)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3.24 + (((tickAnim - 45) / 10) * (0-(3.24)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.74553-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-8.88216-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.58045-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.74553 + (((tickAnim - 10) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 10) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 10) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -27.12183 + (((tickAnim - 13) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 13) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 13) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -38.74553 + (((tickAnim - 15) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 15) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 15) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.12183 + (((tickAnim - 18) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 18) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 18) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -38.74553 + (((tickAnim - 20) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 20) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 20) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -27.12183 + (((tickAnim - 23) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 23) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 23) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -38.74553 + (((tickAnim - 25) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 25) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 25) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -27.12183 + (((tickAnim - 28) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 28) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 28) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -38.74553 + (((tickAnim - 30) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 30) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 30) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -27.12183 + (((tickAnim - 33) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 33) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 33) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -38.74553 + (((tickAnim - 35) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 35) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 35) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -27.12183 + (((tickAnim - 38) / 4) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 38) / 4) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 38) / 4) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -38.74553 + (((tickAnim - 42) / 13) * (0-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 42) / 13) * (0-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 42) / 13) * (0-(-1.58045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-31.27421-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10.31702-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -31.27421 + (((tickAnim - 10) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 10) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 10) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -19.75 + (((tickAnim - 13) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -31.27421 + (((tickAnim - 15) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 15) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 15) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -19.75 + (((tickAnim - 18) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -31.27421 + (((tickAnim - 20) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 20) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 20) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -19.75 + (((tickAnim - 23) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -31.27421 + (((tickAnim - 25) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 25) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 25) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -19.75 + (((tickAnim - 28) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -31.27421 + (((tickAnim - 30) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 30) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 30) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -19.75 + (((tickAnim - 33) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -31.27421 + (((tickAnim - 35) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 35) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 35) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -19.75 + (((tickAnim - 38) / 4) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 38) / 4) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (10.31702-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -31.27421 + (((tickAnim - 42) / 13) * (0-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 42) / 13) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 42) / 13) * (0-(10.31702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -13.5 + (((tickAnim - 10) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -35.25 + (((tickAnim - 13) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -13.5 + (((tickAnim - 15) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -35.25 + (((tickAnim - 18) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -13.5 + (((tickAnim - 20) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -35.25 + (((tickAnim - 23) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -13.5 + (((tickAnim - 25) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -35.25 + (((tickAnim - 28) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 30) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -35.25 + (((tickAnim - 33) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -13.5 + (((tickAnim - 35) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -35.25 + (((tickAnim - 38) / 4) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -13.5 + (((tickAnim - 42) / 13) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 107.25 + (((tickAnim - 13) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 107.25 + (((tickAnim - 18) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 20) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 107.25 + (((tickAnim - 23) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 107.25 + (((tickAnim - 28) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 30) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 107.25 + (((tickAnim - 33) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6 + (((tickAnim - 35) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 107.25 + (((tickAnim - 38) / 4) * (6-(107.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6 + (((tickAnim - 42) / 13) * (0-(6)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAlbalophosaurus entity = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.25 + (((tickAnim - 5) / 5) * (0-(8.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (1-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (0-(1)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 5) / 5) * (-3-(11)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3 + (((tickAnim - 10) / 5) * (1.5-(-3)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 15) / 5) * (0-(1.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 5) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 5) / 15) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 5) / 15) * (0-(16)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -12.25 + (((tickAnim - 5) / 15) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.25 + (((tickAnim - 5) / 5) * (3.25-(34.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 3.25 + (((tickAnim - 10) / 5) * (0-(3.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 18) / 2) * (0-(1.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.55-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.55 + (((tickAnim - 5) / 5) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -19.5 + (((tickAnim - 5) / 5) * (-16.5-(-19.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -16.5 + (((tickAnim - 10) / 5) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.25 + (((tickAnim - 18) / 2) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.75 + (((tickAnim - 3) / 2) * (0-(30.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23 + (((tickAnim - 8) / 2) * (0-(23)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (7.25-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.25 + (((tickAnim - 18) / 2) * (0-(7.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAlbalophosaurus entity = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.89088 + (((tickAnim - 0) / 8) * (-3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(1.89088)));
            yy = 0.8976 + (((tickAnim - 0) / 8) * (-0.44881-(0.8976)));
            zz = 2.09762 + (((tickAnim - 0) / 8) * (-1.34881-(2.09762)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 8) / 2) * (1.39088-(-3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -0.44881 + (((tickAnim - 8) / 2) * (-0.89762-(-0.44881)));
            zz = -1.34881 + (((tickAnim - 8) / 2) * (-2.49762-(-1.34881)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 1.39088 + (((tickAnim - 10) / 8) * (-5.0591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8-(1.39088)));
            yy = -0.89762 + (((tickAnim - 10) / 8) * (-0.44881-(-0.89762)));
            zz = -2.49762 + (((tickAnim - 10) / 8) * (0.97619-(-2.49762)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.0591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8 + (((tickAnim - 18) / 2) * (1.89088-(-5.0591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8)));
            yy = -0.44881 + (((tickAnim - 18) / 2) * (0.8976-(-0.44881)));
            zz = 0.97619 + (((tickAnim - 18) / 2) * (2.09762-(0.97619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.25 + (((tickAnim - 0) / 5) * (0-(-0.25)));
            yy = -0.4 + (((tickAnim - 0) / 5) * (-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*3-(0)));
            yy = -0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1 + (((tickAnim - 5) / 5) * (-0.4-(-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*3 + (((tickAnim - 10) / 5) * (0-(-2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*3)));
            yy = -0.4 + (((tickAnim - 10) / 5) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-0.25-(0)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1 + (((tickAnim - 15) / 5) * (-0.4-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*3), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*4), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-2), upperbody.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+140))*2.5), upperbody.rotateAngleZ + (float) Math.toRadians(0));
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(0);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(0);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(0.375);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+210))*3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+200))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+90))*2), upperbody2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+110))*-2.5), upperbody2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -8.08117 + (((tickAnim - 0) / 2) * (-5.58098-(-8.08117)));
            yy = 7.95475 + (((tickAnim - 0) / 2) * (7.95396-(7.95475)));
            zz = -17.31864 + (((tickAnim - 0) / 2) * (-17.31886-(-17.31864)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -5.58098 + (((tickAnim - 2) / 8) * (-8.08-(-5.58098)));
            yy = 7.95396 + (((tickAnim - 2) / 8) * (7.95-(7.95396)));
            zz = -17.31886 + (((tickAnim - 2) / 8) * (-17.32-(-17.31886)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -8.08 + (((tickAnim - 10) / 2) * (-5.58098-(-8.08)));
            yy = 7.95 + (((tickAnim - 10) / 2) * (7.95396-(7.95)));
            zz = -17.32 + (((tickAnim - 10) / 2) * (-17.31886-(-17.32)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -5.58098 + (((tickAnim - 12) / 8) * (-8.08-(-5.58098)));
            yy = 7.95396 + (((tickAnim - 12) / 8) * (7.95-(7.95396)));
            zz = -17.31886 + (((tickAnim - 12) / 8) * (-17.32-(-17.31886)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 3) / 7) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 10) / 3) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 13) / 7) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+360))*2), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+360))*1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*2));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 0) / 3) * (15.83-(30)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 15.83 + (((tickAnim - 3) / 4) * (-15.23749-(15.83)));
            yy = 0 + (((tickAnim - 3) / 4) * (14.4352-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-1.81626-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.23749 + (((tickAnim - 7) / 3) * (-18.21181-(-15.23749)));
            yy = 14.4352 + (((tickAnim - 7) / 3) * (10.76174-(14.4352)));
            zz = -1.81626 + (((tickAnim - 7) / 3) * (-2.03659-(-1.81626)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.21181 + (((tickAnim - 10) / 10) * (30-(-18.21181)));
            yy = 10.76174 + (((tickAnim - 10) / 10) * (0-(10.76174)));
            zz = -2.03659 + (((tickAnim - 10) / 10) * (0-(-2.03659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (32.58-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 32.58 + (((tickAnim - 3) / 4) * (19.17-(32.58)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 19.17 + (((tickAnim - 7) / 3) * (-32.5-(19.17)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -32.5 + (((tickAnim - 10) / 3) * (-5-(-32.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 13) / 2) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 15) / 5) * (17.5-(-2.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 0) / 3) * (-72.5-(5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -72.5 + (((tickAnim - 3) / 4) * (-78.75-(-72.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -78.75 + (((tickAnim - 7) / 3) * (20-(-78.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (-13.75-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -13.75 + (((tickAnim - 13) / 2) * (7.5-(-13.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 15) / 5) * (5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 0) / 3) * (150.83-(7.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 150.83 + (((tickAnim - 3) / 4) * (135.42-(150.83)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 135.42 + (((tickAnim - 7) / 1) * (62.46-(135.42)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 62.46 + (((tickAnim - 8) / 2) * (29.40191-(62.46)));
            yy = 0 + (((tickAnim - 8) / 2) * (-2.64718-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (4.24326-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.40191 + (((tickAnim - 10) / 3) * (26.32596-(29.40191)));
            yy = -2.64718 + (((tickAnim - 10) / 3) * (-1.32359-(-2.64718)));
            zz = 4.24326 + (((tickAnim - 10) / 3) * (2.12163-(4.24326)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 26.32596 + (((tickAnim - 13) / 2) * (-6.75-(26.32596)));
            yy = -1.32359 + (((tickAnim - 13) / 2) * (0-(-1.32359)));
            zz = 2.12163 + (((tickAnim - 13) / 2) * (0-(2.12163)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -6.75 + (((tickAnim - 15) / 3) * (-14.62-(-6.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -14.62 + (((tickAnim - 18) / 2) * (7.5-(-14.62)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.125-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 5) / 2) * (0-(0.125)));
            zz = -0.125 + (((tickAnim - 5) / 2) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -8.08117 + (((tickAnim - 0) / 2) * (-5.58098-(-8.08117)));
            yy = -7.9547 + (((tickAnim - 0) / 2) * (-7.954-(-7.9547)));
            zz = 17.3186 + (((tickAnim - 0) / 2) * (17.3189-(17.3186)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -5.58098 + (((tickAnim - 2) / 8) * (-8.08-(-5.58098)));
            yy = -7.954 + (((tickAnim - 2) / 8) * (-7.95-(-7.954)));
            zz = 17.3189 + (((tickAnim - 2) / 8) * (17.32-(17.3189)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -8.08 + (((tickAnim - 10) / 2) * (-5.58098-(-8.08)));
            yy = -7.95 + (((tickAnim - 10) / 2) * (-7.954-(-7.95)));
            zz = 17.32 + (((tickAnim - 10) / 2) * (17.3189-(17.32)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -5.58098 + (((tickAnim - 12) / 8) * (-8.08-(-5.58098)));
            yy = -7.954 + (((tickAnim - 12) / 8) * (-7.95-(-7.954)));
            zz = 17.3189 + (((tickAnim - 12) / 8) * (17.32-(17.3189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 3) / 7) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 10) / 3) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 13) / 7) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -18.21181 + (((tickAnim - 0) / 10) * (30-(-18.21181)));
            yy = -10.7617 + (((tickAnim - 0) / 10) * (0-(-10.7617)));
            zz = 2.0366 + (((tickAnim - 0) / 10) * (0-(2.0366)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 10) / 3) * (15.83-(30)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 15.83 + (((tickAnim - 13) / 4) * (-15.23749-(15.83)));
            yy = 0 + (((tickAnim - 13) / 4) * (-14.4352-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (1.8163-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.23749 + (((tickAnim - 17) / 3) * (-18.21181-(-15.23749)));
            yy = -14.4352 + (((tickAnim - 17) / 3) * (-10.7617-(-14.4352)));
            zz = 1.8163 + (((tickAnim - 17) / 3) * (2.0366-(1.8163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.5 + (((tickAnim - 0) / 3) * (-5-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 5) / 5) * (17.5-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 10) / 3) * (34.08-(17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 34.08 + (((tickAnim - 13) / 4) * (19.17-(34.08)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.17 + (((tickAnim - 17) / 3) * (-32.5-(19.17)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 0) / 3) * (-13.75-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.75 + (((tickAnim - 3) / 2) * (7.5-(-13.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 5) / 5) * (5-(7.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 10) / 3) * (-72.5-(5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -72.5 + (((tickAnim - 13) / 4) * (-78.75-(-72.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -78.75 + (((tickAnim - 17) / 3) * (20-(-78.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.40191 + (((tickAnim - 0) / 3) * (26.32596-(29.40191)));
            yy = 2.6472 + (((tickAnim - 0) / 3) * (1.3236-(2.6472)));
            zz = -4.2433 + (((tickAnim - 0) / 3) * (-2.1216-(-4.2433)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.32596 + (((tickAnim - 3) / 2) * (-6.75-(26.32596)));
            yy = 1.3236 + (((tickAnim - 3) / 2) * (0-(1.3236)));
            zz = -2.1216 + (((tickAnim - 3) / 2) * (0-(-2.1216)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.75 + (((tickAnim - 5) / 3) * (-14.62-(-6.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -14.62 + (((tickAnim - 8) / 2) * (7.5-(-14.62)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 10) / 3) * (150.83-(7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 150.83 + (((tickAnim - 13) / 4) * (135.42-(150.83)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 135.42 + (((tickAnim - 17) / 1) * (62.46-(135.42)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 62.46 + (((tickAnim - 18) / 2) * (29.40191-(62.46)));
            yy = 0 + (((tickAnim - 18) / 2) * (2.6472-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-4.2433-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.125-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 15) / 2) * (0-(0.125)));
            zz = -0.125 + (((tickAnim - 15) / 2) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAlbalophosaurus entity = (EntityPrehistoricFloraAlbalophosaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.14088 + (((tickAnim - 0) / 5) * (1.3909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.4))*1-(1.14088)));
            yy = 0.8976 + (((tickAnim - 0) / 5) * (-0.89762-(0.8976)));
            zz = 2.09762 + (((tickAnim - 0) / 5) * (-2.49762-(2.09762)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.3909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.4))*1 + (((tickAnim - 5) / 5) * (1.14088-(1.3909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.4))*1)));
            yy = -0.89762 + (((tickAnim - 5) / 5) * (0.8976-(-0.89762)));
            zz = -2.49762 + (((tickAnim - 5) / 5) * (2.09762-(-2.49762)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.25 + (((tickAnim - 0) / 3) * (0-(-0.25)));
            yy = -0.4 + (((tickAnim - 0) / 3) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.25-(0)));
            yy = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1 + (((tickAnim - 3) / 2) * (-0.4-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.25 + (((tickAnim - 5) / 3) * (0-(0.25)));
            yy = -0.4 + (((tickAnim - 5) / 3) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1-(-0.4)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.25-(0)));
            yy = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1 + (((tickAnim - 8) / 2) * (-0.4-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+60))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+60))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*6), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*6), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*8), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*8), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*-2), upperbody.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+140))*2.5), upperbody.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+210))*6), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+200))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+90))*2.5), upperbody2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+110))*-2.5), upperbody2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -8.08117 + (((tickAnim - 0) / 1) * (-5.58098-(-8.08117)));
            yy = 7.95475 + (((tickAnim - 0) / 1) * (7.95396-(7.95475)));
            zz = -17.31864 + (((tickAnim - 0) / 1) * (-17.31886-(-17.31864)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -5.58098 + (((tickAnim - 1) / 4) * (-8.08-(-5.58098)));
            yy = 7.95396 + (((tickAnim - 1) / 4) * (7.95-(7.95396)));
            zz = -17.31886 + (((tickAnim - 1) / 4) * (-17.32-(-17.31886)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -8.08 + (((tickAnim - 5) / 1) * (-5.58098-(-8.08)));
            yy = 7.95 + (((tickAnim - 5) / 1) * (7.95396-(7.95)));
            zz = -17.32 + (((tickAnim - 5) / 1) * (-17.31886-(-17.32)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -5.58098 + (((tickAnim - 6) / 4) * (-8.08-(-5.58098)));
            yy = 7.95396 + (((tickAnim - 6) / 4) * (7.95-(7.95396)));
            zz = -17.31886 + (((tickAnim - 6) / 4) * (-17.32-(-17.31886)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.5 + (((tickAnim - 0) / 2) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 2) / 3) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -17.5 + (((tickAnim - 5) / 2) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 7) / 3) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+360))*4), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+360))*1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.5 + (((tickAnim - 0) / 3) * (-18.24974-(37.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (14.32357-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.56449-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.24974 + (((tickAnim - 3) / 2) * (-7.12507-(-18.24974)));
            yy = 14.32357 + (((tickAnim - 3) / 2) * (11.15065-(14.32357)));
            zz = -2.56449 + (((tickAnim - 3) / 2) * (-0.64325-(-2.56449)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.12507 + (((tickAnim - 5) / 5) * (37.5-(-7.12507)));
            yy = 11.15065 + (((tickAnim - 5) / 5) * (0-(11.15065)));
            zz = -0.64325 + (((tickAnim - 5) / 5) * (0-(-0.64325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (40-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 40 + (((tickAnim - 3) / 2) * (-42.5-(40)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -42.5 + (((tickAnim - 5) / 1) * (-16.67-(-42.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16.67 + (((tickAnim - 6) / 2) * (7.5-(-16.67)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 8) / 0) * (27.49173-(7.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 27.49173 + (((tickAnim - 8) / 2) * (10-(27.49173)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 0) / 3) * (-90-(5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -90 + (((tickAnim - 3) / 2) * (5-(-90)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 5 + (((tickAnim - 5) / 1) * (-29.17-(5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -29.17 + (((tickAnim - 6) / 2) * (0-(-29.17)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 117.5 + (((tickAnim - 0) / 3) * (162.5-(117.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 162.5 + (((tickAnim - 3) / 1) * (36.75-(162.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 36.75 + (((tickAnim - 4) / 1) * (42.5-(36.75)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 42.5 + (((tickAnim - 5) / 1) * (42.92-(42.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 42.92 + (((tickAnim - 6) / 2) * (-10-(42.92)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 8) / 2) * (117.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -8.08117 + (((tickAnim - 0) / 1) * (-5.58098-(-8.08117)));
            yy = -7.9547 + (((tickAnim - 0) / 1) * (-7.954-(-7.9547)));
            zz = 17.3186 + (((tickAnim - 0) / 1) * (17.3189-(17.3186)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -5.58098 + (((tickAnim - 1) / 4) * (-8.08-(-5.58098)));
            yy = -7.954 + (((tickAnim - 1) / 4) * (-7.95-(-7.954)));
            zz = 17.3189 + (((tickAnim - 1) / 4) * (17.32-(17.3189)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -8.08 + (((tickAnim - 5) / 1) * (-5.58098-(-8.08)));
            yy = -7.95 + (((tickAnim - 5) / 1) * (-7.954-(-7.95)));
            zz = 17.32 + (((tickAnim - 5) / 1) * (17.3189-(17.32)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -5.58098 + (((tickAnim - 6) / 4) * (-8.08-(-5.58098)));
            yy = -7.954 + (((tickAnim - 6) / 4) * (-7.95-(-7.954)));
            zz = 17.3189 + (((tickAnim - 6) / 4) * (17.32-(17.3189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.5 + (((tickAnim - 0) / 2) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 2) / 3) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -17.5 + (((tickAnim - 5) / 2) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 7) / 3) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.12507 + (((tickAnim - 0) / 5) * (37.5-(-7.12507)));
            yy = -11.15065 + (((tickAnim - 0) / 5) * (0-(-11.15065)));
            zz = 0.64325 + (((tickAnim - 0) / 5) * (0-(0.64325)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 37.5 + (((tickAnim - 5) / 3) * (-18.24974-(37.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (-14.32357-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (2.56449-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.24974 + (((tickAnim - 8) / 2) * (-7.12507-(-18.24974)));
            yy = -14.32357 + (((tickAnim - 8) / 2) * (-11.15065-(-14.32357)));
            zz = 2.56449 + (((tickAnim - 8) / 2) * (0.64325-(2.56449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42.5 + (((tickAnim - 0) / 1) * (-16.67-(-42.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -16.67 + (((tickAnim - 1) / 2) * (7.5-(-16.67)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 3) / 0) * (27.49173-(7.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.49173 + (((tickAnim - 3) / 2) * (10-(27.49173)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (40-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (-42.5-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 5 + (((tickAnim - 0) / 1) * (-29.17-(5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -29.17 + (((tickAnim - 1) / 2) * (0-(-29.17)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (-90-(5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -90 + (((tickAnim - 8) / 2) * (5-(-90)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 42.5 + (((tickAnim - 0) / 1) * (44.17-(42.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.17 + (((tickAnim - 1) / 1) * (11.84-(44.17)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 11.84 + (((tickAnim - 2) / 1) * (-2-(11.84)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2 + (((tickAnim - 3) / 2) * (117.5-(-2)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 117.5 + (((tickAnim - 5) / 3) * (162.5-(117.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 162.5 + (((tickAnim - 8) / 1) * (40.5-(162.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 40.5 + (((tickAnim - 9) / 1) * (42.5-(40.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAlbalophosaurus e = (EntityPrehistoricFloraAlbalophosaurus) entity;
        animator.update(entity);

    }
}
