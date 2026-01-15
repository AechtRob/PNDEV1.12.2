package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAustelliscus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;

    private ModelAnimator animator;

    public ModelAustelliscus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.505F, -1.1381F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -2.755F, -3.8619F, 5, 5, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 38, -2.0F, 2.245F, -3.8619F, 4, 1, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.755F, 0.6381F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 38, -2.0F, -0.275F, -4.425F, 4, 1, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 7.245F, 8.1381F);
        this.main.addChild(head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.0937F, -11.9899F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2007F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 65, 12, -1.5F, -0.9981F, -1.5512F, 3, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, -5.7858F, -11.9279F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0881F, 0.1391F, -0.0122F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 24, -1.15F, -0.2821F, -1.3655F, 1, 1, 2, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.0F, -12.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 36, -1.5F, -2.0F, -4.075F, 3, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 63, -1.5F, -0.075F, -1.4F, 3, 1, 2, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 43, -1.0F, -2.0F, -6.0F, 2, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 0, -1.5F, -1.0F, -4.075F, 3, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 67, 31, -0.5F, -1.0F, -8.375F, 1, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 43, -1.0F, -1.0F, -7.375F, 2, 1, 4, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.5F, -7.2816F, -11.9754F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0898F, -0.2391F, 0.0213F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 47, 0.0222F, -0.7211F, -5.9257F, 1, 2, 6, 0.001F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.6669F, -7.4441F, -18.0019F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0836F, -0.105F, -0.0067F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 67, -0.45F, -0.525F, -0.625F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.6669F, -7.4441F, -18.0019F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0836F, 0.105F, 0.0067F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 67, -0.55F, -0.525F, -0.625F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.05F, -6.9332F, -19.7983F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 67, 0.625F, -0.55F, -0.425F, 0, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 67, 1.475F, -0.55F, -0.425F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.2F, -6.4996F, -14.8423F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0915F, -0.3042F, 0.0275F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 67, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.8F, -6.7371F, -17.5569F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0894F, -0.2173F, 0.0193F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 36, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.2F, -6.4996F, -14.8423F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0915F, 0.3042F, -0.0275F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 67, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.5F, -7.2816F, -11.9754F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0898F, 0.2391F, -0.0213F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 47, -1.0222F, -0.7211F, -5.9257F, 1, 2, 6, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.8F, -6.7371F, -17.5569F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0894F, 0.2173F, -0.0193F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 65, 36, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -9.1886F, -15.9224F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3098F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 67, 28, -0.5F, 0.0044F, -4.9945F, 1, 1, 1, 0.001F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 56, -1.0F, 0.0044F, -3.9945F, 2, 1, 4, 0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -10.0F, -12.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2051F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 55, -1.5F, 0.0F, -4.0F, 3, 2, 4, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.123F, -13.4103F);
        this.head.addChild(jaw);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.875F, -0.0031F, -1.4646F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0895F, -0.2217F, 0.0197F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 67, 7, -0.325F, -0.5F, -2.0F, 0, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5091F, -0.5834F, -5.215F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3453F, -0.2133F, 0.0461F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 67, 0.0F, -0.7F, 0.625F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5091F, -0.5834F, -5.215F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0474F, -0.2133F, 0.0461F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 55, 67, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5091F, -0.5834F, -5.215F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0474F, 0.2133F, -0.0461F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 55, 67, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5091F, -0.5834F, -5.215F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3453F, 0.2133F, -0.0461F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 67, 0.0F, -0.7F, 0.625F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.3319F, -2.7797F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2094F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 35, 69, -1.0F, 0.0103F, -4.0135F, 1, 1, 1, -0.003F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 63, -1.5F, 0.0103F, -3.0385F, 2, 1, 3, -0.002F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.1347F, -3.01F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3622F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 65, 16, -0.5F, -1.0048F, -3.0314F, 1, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.0293F, 1.4204F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2007F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 63, -1.0F, -0.9981F, -4.5512F, 2, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.875F, -0.0031F, -1.4646F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0895F, 0.2217F, -0.0197F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 67, 7, 0.325F, -0.5F, -2.0F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.123F, 1.4103F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 62, -1.0F, -0.075F, -4.375F, 2, 1, 3, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.5F, 0.3372F, 1.4824F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1248F, -0.2434F, 0.0217F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 56, 0.025F, -0.2821F, -6.3405F, 1, 1, 5, -0.01F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.5F, 0.3372F, 1.4824F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1248F, 0.2434F, -0.0217F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 56, -1.025F, -0.2821F, -6.3405F, 1, 1, 5, -0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.0F, 2.745F, -2.1119F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.1511F, -0.0478F, 0.7724F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 46, 22, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, 2.745F, -2.1119F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.1511F, 0.0478F, -0.7724F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 46, 22, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.3036F, 3.0158F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 19, 14, -2.5F, -2.0586F, 0.1223F, 5, 4, 8, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -3.0586F, 1.1223F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 19, 27, -2.0F, -0.3F, -1.0F, 4, 2, 8, -0.02F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.9414F, 1.1223F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0742F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 44, 27, -2.0F, -1.0F, 0.0F, 4, 1, 7, -0.01F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.25F, 2.6456F, 4.0928F);
        this.body.addChild(backrightfin);
        this.setRotateAngle(backrightfin, -0.2929F, 0.2409F, -0.8972F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.0F, 0.5457F, -2.9705F);
        this.backrightfin.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0742F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 65, 21, -4.75F, -0.25F, 3.0F, 3, 0, 2, 0.0F, true));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.25F, 2.6456F, 4.0928F);
        this.body.addChild(backleftfin);
        this.setRotateAngle(backleftfin, -0.2929F, -0.2409F, 0.8972F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.0F, 0.5457F, -2.9705F);
        this.backleftfin.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0742F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 65, 21, 1.75F, -0.25F, 3.0F, 3, 0, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0127F, 7.7445F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 46, 13, -2.0F, -1.5713F, -0.1222F, 4, 3, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -2.8755F, 1.115F);
        this.tail.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3927F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 62, 0.0F, -4.025F, 0.0F, 0, 5, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -2.5713F, 0.3778F);
        this.tail.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 25, 47, -1.5F, -0.125F, -0.5F, 3, 2, 5, -0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.2419F, 1.0084F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3971F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 17, 48, 0.0F, -0.225F, 0.025F, 0, 3, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 2.4287F, 0.3778F);
        this.tail.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1353F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 48, -1.5F, -1.075F, -0.325F, 3, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0872F, 4.8644F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 55, -1.5F, -0.9842F, -0.4866F, 3, 2, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.9842F, 0.0134F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2618F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 9, 62, -1.0F, 0.1F, -0.35F, 2, 1, 4, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 2.0158F, -0.4866F);
        this.tail2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1484F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 57, 49, -1.0F, -1.175F, 0.125F, 2, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1408F, 2.5134F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 43, 56, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.517F, 3.3666F);
        this.tail3.addChild(tail4);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -6.0305F, 8.6372F);
        this.tail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.9861F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 2, 15, 0.5F, 0.125F, 0.175F, 0, 11, 8, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, 0.517F, 0.6334F);
        this.tail4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.6109F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 27, 0, 0.0F, -1.45F, -0.725F, 1, 1, 11, 0.0F, false));

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
        this.main.offsetY = -0.5F;
        this.main.offsetX = 0.1F;
        this.main.rotateAngleY = (float)Math.toRadians(235);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.65F;
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
        this.main.offsetX = -0.14F;
        this.main.offsetY = -0.19F;
        this.main.offsetZ = 0.06F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.18F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
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
        this.flap(frontleftfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontleftfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontrightfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontrightfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backleftfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backleftfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backrightfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backrightfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
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

    }
}

