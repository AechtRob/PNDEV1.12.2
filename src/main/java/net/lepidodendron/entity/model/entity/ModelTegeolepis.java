package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTegeolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;

    private ModelAnimator animator;

    public ModelTegeolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.505F, -1.1381F);
        this.main.cubeList.add(new ModelBox(main, 14, 18, -2.5F, -2.755F, -3.8619F, 5, 5, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 32, 12, -2.0F, 2.245F, -3.8619F, 4, 1, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.755F, 0.6381F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 31, -2.0F, -0.275F, -4.425F, 4, 1, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 7.245F, 8.1381F);
        this.main.addChild(head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.0937F, -11.9899F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2007F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 4, -1.5F, -0.9981F, -1.5512F, 3, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5F, -5.7858F, -11.9279F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0881F, -0.1391F, 0.0122F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.15F, -0.2821F, -1.3655F, 1, 1, 2, 0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5F, -5.7858F, -11.9279F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0881F, 0.1391F, -0.0122F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.15F, -0.2821F, -1.3655F, 1, 1, 2, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.0F, -12.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 21, -1.5F, -2.0F, -4.075F, 3, 1, 5, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 8, -1.5F, -0.075F, -1.4F, 3, 1, 2, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 46, -1.5F, -3.0F, -3.475F, 3, 1, 4, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 34, -1.0F, -2.0F, -6.0F, 2, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 1, -1.2F, -0.75F, -4.375F, 0, 1, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 1, 1.2F, -0.75F, -4.375F, 0, 1, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 12, -1.5F, -1.0F, -4.075F, 3, 1, 5, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.8F, -0.75F, -7.1F, 0, 1, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.8F, -0.75F, -7.1F, 0, 1, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 12, -0.5F, -1.0F, -8.375F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 27, -1.0F, -1.0F, -7.375F, 2, 1, 4, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.825F, -7.7268F, -17.395F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0904F, -0.2651F, 0.0238F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.825F, -7.7268F, -17.395F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0904F, 0.2651F, -0.0238F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, -7.2816F, -11.9754F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0898F, -0.2391F, 0.0213F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 0, 0.0222F, -0.7211F, -5.9257F, 1, 2, 6, 0.001F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, -7.2816F, -11.9754F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0898F, 0.2391F, -0.0213F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 0, -1.0222F, -0.7211F, -5.9257F, 1, 2, 6, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.05F, -6.9332F, -19.7983F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.625F, -0.55F, -0.425F, 0, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 1.475F, -0.55F, -0.425F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -9.1886F, -15.9225F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3098F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 14, -0.5F, 0.0044F, -4.9945F, 1, 1, 1, 0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 32, -1.0F, 0.0044F, -3.9945F, 2, 1, 4, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -10.0F, -12.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2051F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 46, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.123F, -13.4103F);
        this.head.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.75F, -0.3816F, -4.2654F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2144F, -0.2133F, 0.0461F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 2, 0.025F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.75F, -0.3816F, -4.2654F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2144F, 0.2133F, -0.0461F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 2, -0.025F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.3319F, -2.7797F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2094F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 30, -1.0F, 0.0103F, -3.0385F, 2, 1, 3, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.1347F, -3.01F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3622F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 4, -0.5F, -1.0048F, -3.0314F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.0292F, 1.4204F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2007F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 26, -1.0F, -0.9981F, -4.5512F, 2, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.875F, -0.0031F, -1.4646F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0895F, -0.2217F, 0.0197F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 3, -0.075F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.875F, -0.0031F, -1.4646F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0895F, 0.2217F, -0.0197F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 3, 0.075F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.123F, 1.4103F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 13, 31, -1.0F, -0.075F, -4.375F, 2, 1, 3, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.5F, 0.3372F, 1.4824F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1248F, -0.2434F, 0.0217F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 41, 0.025F, -0.2821F, -6.3405F, 1, 1, 5, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.5F, 0.3372F, 1.4824F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1248F, 0.2434F, -0.0217F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 41, -1.025F, -0.2821F, -6.3405F, 1, 1, 5, -0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.0F, 2.745F, -0.1119F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.9163F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 11, 0, 0.0F, 0.0F, -2.0F, 5, 0, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, 2.745F, -0.1119F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.9163F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 11, 0, -5.0F, 0.0F, -2.0F, 5, 0, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.3036F, 3.0158F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 22, 0, -2.5F, -2.0586F, 0.1223F, 5, 4, 8, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -3.0586F, 1.1223F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 31, -2.0F, -0.3F, -1.0F, 4, 2, 8, -0.02F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.9414F, 1.1223F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0742F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -2.0F, -1.0F, 0.0F, 4, 1, 7, -0.01F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.0F, 2.1456F, 5.0928F);
        this.body.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.829F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.0F, 0.5457F, -3.9705F);
        this.backleftfin.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0742F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 18, 1.75F, -0.25F, 3.0F, 3, 0, 2, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.0F, 2.1456F, 5.0928F);
        this.body.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.829F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.0F, 0.5457F, -3.9705F);
        this.backrightfin.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0742F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 18, -4.75F, -0.25F, 3.0F, 3, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0127F, 7.7445F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 38, -2.0F, -1.5713F, -0.1222F, 4, 3, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -2.5713F, 0.3778F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 32, 15, 0.0F, -3.025F, 1.5F, 0, 4, 6, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 35, 39, -1.5F, -0.125F, -0.5F, 3, 2, 5, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 2.4287F, 0.3778F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1353F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 2, 0.0F, -0.325F, 0.675F, 0, 3, 6, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 13, 41, -1.5F, -1.075F, -0.325F, 3, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0872F, 4.8644F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 43, -1.5F, -0.9842F, -0.4866F, 3, 2, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.9842F, 0.0134F);
        this.tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 45, 47, -1.0F, 0.1F, -0.35F, 2, 1, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.0158F, -0.4866F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1484F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 0, -1.0F, -1.175F, 0.125F, 2, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1408F, 3.5134F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 10, 47, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, -0.517F, 3.3666F);
        this.tail3.addChild(tail4);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.517F, 0.6334F);
        this.tail4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0305F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 2, 3, 0.5F, -6.25F, -0.8F, 0, 12, 9, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.517F, 0.6334F);
        this.tail4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6109F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 26, 0.0F, -1.45F, -0.725F, 1, 1, 11, 0.0F, false));

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

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0.21F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.2007F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0881F, -0.1391F, 0.0122F);
        this.setRotateAngle(cube_r4, -0.0881F, 0.1391F, -0.0122F);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0904F, -0.2651F, 0.0238F);
        this.setRotateAngle(cube_r7, -0.0904F, 0.2651F, -0.0238F);
        this.setRotateAngle(cube_r8, -0.0898F, -0.2391F, 0.0213F);
        this.setRotateAngle(cube_r9, -0.0898F, 0.2391F, -0.0213F);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.3098F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.2051F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.2144F, -0.2133F, 0.0461F);
        this.setRotateAngle(cube_r14, -0.2144F, 0.2133F, -0.0461F);
        this.setRotateAngle(cube_r15, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.3622F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.2007F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.0895F, -0.2217F, 0.0197F);
        this.setRotateAngle(cube_r19, -0.0895F, 0.2217F, -0.0197F);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, -0.1248F, -0.2434F, 0.0217F);
        this.setRotateAngle(cube_r22, -0.1248F, 0.2434F, -0.0217F);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.9163F);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.9163F);
        this.setRotateAngle(body, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.829F);
        this.setRotateAngle(cube_r25, 0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.829F);
        this.setRotateAngle(cube_r26, 0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, 0.1353F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(cube_r31, 0.0305F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.6109F, 0.0F, 0.0F);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0.4F;
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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.35F;
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
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.25F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
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
            this.main.offsetY = 0.2F;
            this.bob(main, speed, 0.1F, false, f2, 1);
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

