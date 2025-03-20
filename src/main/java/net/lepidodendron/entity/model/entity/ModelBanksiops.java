package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBanksiops;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBanksiops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tail2;


    private ModelAnimator animator;

    public ModelBanksiops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 22.3F, 6.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, -0.5F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 19, -2.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2F, -1.75F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.5F, -7.75F, 5, 2, 8, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.1001F, -7.4544F);
        this.body.addChild(chest);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5999F, -1.2956F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 0, -2.0F, -1.1F, -1.5F, 4, 2, 3, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.9295F, 0.7444F, -1.3281F);
        this.chest.addChild(rightarm);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.8205F, 0.2551F, -0.0501F);
        this.rightarm.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1119F, 0.6475F, -0.2409F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 0, -0.9F, -0.7F, 0.0F, 2, 1, 1, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-1.0F, 0.25F, 0.5F);
        this.rightarm.addChild(rightarm2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.25F, 0.2F, -0.5F);
        this.rightarm2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1472F, 0.6235F, -0.0259F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -0.6F, -1.2F, 1, 1, 2, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.85F, 0.2F, -1.3F);
        this.rightarm2.addChild(righthand);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.6F, 0.0F, 0.8F);
        this.righthand.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 14, -1.5F, -0.2F, -2.75F, 2, 1, 2, -0.1F, true));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(1.9295F, 0.7444F, -1.3281F);
        this.chest.addChild(leftarm);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.8205F, 0.2551F, -0.0501F);
        this.leftarm.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1119F, -0.6475F, 0.2409F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 0, -1.1F, -0.7F, 0.0F, 2, 1, 1, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(1.0F, 0.25F, 0.5F);
        this.leftarm.addChild(leftarm2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.25F, 0.2F, -0.5F);
        this.leftarm2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1472F, -0.6235F, 0.0259F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -0.6F, -1.2F, 1, 1, 2, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.85F, 0.2F, -1.3F);
        this.leftarm2.addChild(lefthand);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.6F, 0.0F, 0.8F);
        this.lefthand.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2618F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 14, -0.5F, -0.2F, -2.75F, 2, 1, 2, -0.1F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0999F, -2.6446F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0329F, 0.775F, -0.4245F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1843F, -0.9478F, -0.2256F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 34, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0329F, 0.775F, -0.4245F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1843F, 0.9478F, 0.2256F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 34, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.55F, -0.651F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 9, -2.0F, -1.0F, -1.0F, 4, 2, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3547F, -1.3858F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 32, 4, -1.0F, 0.3047F, -4.2652F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 30, -0.4995F, 0.5552F, -4.7657F, 1, 1, 3, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 22, -0.5F, 0.8047F, -4.6402F, 1, 1, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.709F, 1.2547F, -3.9887F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.7418F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 16, -0.5F, -0.25F, -0.125F, 1, 1, 0, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.4649F, 1.3047F, -3.6687F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1174F, 0.838F, -0.0064F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 6, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.6097F, 1.2547F, -2.2348F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 1.0908F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 11, -0.35F, -0.25F, -0.5F, 1, 1, 0, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.709F, 1.0547F, -4.2387F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.829F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 34, -1.5005F, -0.5005F, -0.2495F, 2, 1, 1, 0.001F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.6097F, 1.0547F, -2.4848F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 1.0908F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 4, -0.35F, -0.5F, -0.6249F, 1, 1, 2, 0.0001F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.8612F, 1.3047F, -1.3027F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.575F, 1.2573F, -0.598F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 30, -0.95F, -0.55F, -0.75F, 2, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.6831F, 0.5682F, -0.841F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.9872F, 1.4268F, 0.6119F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 25, -1.5F, -0.3F, -0.5F, 3, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.8047F, -2.8765F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1057F, -0.3823F, 0.4028F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 22, -1.4793F, -0.0944F, -0.0609F, 1, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.8047F, -2.8765F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1057F, 0.3823F, -0.4028F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 22, 0.4793F, -0.0944F, -0.0609F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.6831F, 0.5682F, -0.841F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.9872F, -1.4268F, -0.6119F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 25, -1.5F, -0.3F, -0.5F, 3, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.8612F, 1.3047F, -1.3027F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.575F, -1.2573F, 0.598F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 30, -1.05F, -0.55F, -0.75F, 2, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.6097F, 1.0547F, -2.4848F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -1.0908F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 4, -0.65F, -0.5F, -0.6249F, 1, 1, 2, 0.0001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.709F, 1.0547F, -4.2387F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.829F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 23, 34, -0.4995F, -0.5005F, -0.2495F, 2, 1, 1, 0.001F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.4648F, 1.3047F, -3.6687F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1174F, -0.838F, 0.0064F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 19, 6, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.6097F, 1.2547F, -2.2348F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -1.0908F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 11, -0.65F, -0.25F, -0.5F, 1, 1, 0, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.709F, 1.2547F, -3.9887F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.7418F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 8, 16, -0.5F, -0.25F, -0.125F, 1, 1, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.25F, 0.7891F, -1.4267F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 8, 27, -1.75F, -0.775F, -1.35F, 3, 1, 3, -0.1F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.25F, 1.209F, -0.2806F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 25, -1.25F, -0.0293F, -2.7846F, 3, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 9, 32, -0.25F, -0.1373F, -4.4081F, 1, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.25F, -0.3307F, 0.2591F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 8, 13, -0.5F, 1.3854F, -4.5428F, 1, 0, 0, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 8, 11, -0.5F, 0.3104F, -4.4928F, 1, 1, 0, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.25F, -0.3307F, 0.2591F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.8727F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 12, 22, 1.4166F, -0.0736F, -3.3649F, 1, 1, 0, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 11, 1.4166F, 0.1764F, -3.4899F, 1, 1, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.2638F, 0.3452F, -3.7055F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.7679F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 27, 6, -0.5F, -0.5F, -0.4946F, 1, 1, 1, 0.0011F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.25F, -0.3307F, 0.2591F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 1.0908F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 30, 34, 1.1379F, 0.1764F, -3.1015F, 1, 1, 1, 0.0001F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.25F, -0.3307F, 0.2591F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.2618F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 8, 11, -2.7667F, 0.1514F, -1.807F, 2, 1, 3, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.25F, -0.3307F, 0.2591F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.2618F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 8, 11, 0.7667F, 0.1514F, -1.807F, 2, 1, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.25F, -0.3307F, 0.2591F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -1.0908F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 30, 34, -2.1379F, 0.1764F, -3.1015F, 1, 1, 1, 0.0001F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.25F, -0.3307F, 0.2591F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.8727F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 11, -2.4166F, 0.1764F, -3.4899F, 1, 1, 2, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 22, -2.4166F, -0.0736F, -3.3649F, 1, 1, 0, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.7638F, 0.3452F, -3.7055F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.7679F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 27, 6, -0.5F, -0.5F, -0.4946F, 1, 1, 1, 0.0011F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.8523F, 0.4445F, 0.284F);
        this.hip.addChild(rightleg);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.7491F, 0.0064F, -0.3637F);
        this.rightleg.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0899F, -0.9202F, -0.1281F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 18, 19, -1.0F, -0.25F, -1.0F, 2, 1, 1, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.75F, 0.2F, -1.55F);
        this.rightleg.addChild(rightleg2);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.6272F, 0.168F, 0.6439F);
        this.rightleg2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0206F, 0.5604F, -0.2339F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 15, -1.0F, -0.4F, -0.5F, 2, 1, 1, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(-1.15F, 0.65F, 1.0F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.0F, 0.5236F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.3F, 0.1F, -0.3F);
        this.rightfoot.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.8727F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 19, 30, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.1F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.8523F, 0.4445F, 0.284F);
        this.hip.addChild(leftleg);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.7491F, 0.0064F, -0.3637F);
        this.leftleg.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0899F, 0.9202F, 0.1281F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 18, 19, -1.0F, -0.25F, -1.0F, 2, 1, 1, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.75F, 0.2F, -1.55F);
        this.leftleg.addChild(leftleg2);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.6272F, 0.168F, 0.6439F);
        this.leftleg2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0206F, -0.5604F, 0.2339F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 15, -1.0F, -0.4F, -0.5F, 2, 1, 1, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(1.15F, 0.65F, 1.0F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.0F, -0.5236F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.3F, 0.1F, -0.3F);
        this.leftfoot.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.8727F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 19, 30, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.1F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5989F, 0.7739F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0F, -0.0989F, 1.7261F);
        this.tail.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0873F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 22, -1.001F, -1.95F, -2.5F, 0, 2, 5, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 15, 11, -2.0F, -0.7F, -2.5F, 2, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4761F, 3.8261F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 19, -0.5F, -1.0F, -0.1F, 1, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 11, 0.0F, -2.0F, 0.15F, 0, 3, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(neck, -0.4F, 0.0F, 0.05F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.hip.offsetZ = -0.05F;
        this.hip.offsetY = -0.1F;
        this.hip.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -0.8F;
        this.hip.offsetX = -0.20F;
        this.hip.rotateAngleY = (float)Math.toRadians(-167);
        this.hip.rotateAngleX = (float)Math.toRadians(16);
        this.hip.rotateAngleZ = (float)Math.toRadians(-8);
        this.hip.scaleChildren = true;
        float scaler = 2.0F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, 0.2F, 3.4F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(neck, -0.4F, 0.0F, 0.05F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.body4.offsetY = -0.50F; //72
        //this.body4.offsetZ = -1F; //72

        EntityPrehistoricFloraBanksiops Banksiops = (EntityPrehistoricFloraBanksiops) e;

        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 4, head);

        float speed = 0.185F;
        if (Banksiops.getIsFast()) {
            speed = speed * 1.52F;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        //AdvancedModelRenderer[] Torso = {this.neck, this.body, this.body2, this.body3};
        Banksiops.tailBuffer.applyChainSwingBuffer(Tail);

        boolean isAtBottom = Banksiops.isAtBottom();
        float bottomModifierTail = 1F;
        boolean atBottom = false;
        if (Banksiops.isReallyInWater() && isAtBottom && !Banksiops.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.12F;
            bottomModifierTail = 0.3F;
            atBottom = true;
        }

        if (!Banksiops.isReallyInWater()) {//on land

            if (f3 == 0.0F || !Banksiops.getIsMoving()) { //Not moving
                this.chainSwing(Tail, speed * bottomModifierTail, 0.6F * bottomModifierTail, -0.4, f2, 0.5F * bottomModifierTail);
                return;
            }

        }
        else {//in water
            speed = speed * 2F;

            if (!atBottom) {

                //this.body4.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, -1, f2, 1);

            }
            else if (f3 != 0 && Banksiops.getIsMoving()) {

                //this.body4.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, -1, f2, 1);

            }

           // this.chainSwing(Tail, speed * bottomModifierTail, 0.6F * bottomModifierTail, -0.4, f2, 0.5F * bottomModifierTail);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBanksiops ee = (EntityPrehistoricFloraBanksiops) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            if (ee.getIsMoving()) {
                //Swimming pose:
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        else if (ee.getAnimation() == ee.GAPE_ANIMATION) { //The noise anim
            animGape(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBanksiops entity = (EntityPrehistoricFloraBanksiops) entitylivingbaseIn;

        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*1));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.25505-(0)));
            yy = 10 + (((tickAnim - 0) / 5) * (11.94923-(10)));
            zz = 0 + (((tickAnim - 0) / 5) * (12.18061-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -1.25505 + (((tickAnim - 5) / 8) * (-10.19559-(-1.25505)));
            yy = 11.94923 + (((tickAnim - 5) / 8) * (-43.03372-(11.94923)));
            zz = 12.18061 + (((tickAnim - 5) / 8) * (19.36283-(12.18061)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10.19559 + (((tickAnim - 13) / 5) * (0-(-10.19559)));
            yy = -43.03372 + (((tickAnim - 13) / 5) * (-47.5-(-43.03372)));
            zz = 19.36283 + (((tickAnim - 13) / 5) * (0-(19.36283)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = -47.5 + (((tickAnim - 18) / 17) * (10-(-47.5)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.04428-(0)));
            yy = 12.5 + (((tickAnim - 0) / 5) * (-7.88155-(12.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (7.57194-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -1.04428 + (((tickAnim - 5) / 8) * (-0.51728-(-1.04428)));
            yy = -7.88155 + (((tickAnim - 5) / 8) * (35.77012-(-7.88155)));
            zz = 7.57194 + (((tickAnim - 5) / 8) * (3.19085-(7.57194)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.51728 + (((tickAnim - 13) / 5) * (0-(-0.51728)));
            yy = 35.77012 + (((tickAnim - 13) / 5) * (47.5-(35.77012)));
            zz = 3.19085 + (((tickAnim - 13) / 5) * (0-(3.19085)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 47.5 + (((tickAnim - 18) / 17) * (12.5-(47.5)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.5-(0)));
            yy = -45 + (((tickAnim - 0) / 5) * (1.59-(-45)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 17.5 + (((tickAnim - 5) / 13) * (0-(17.5)));
            yy = 1.59 + (((tickAnim - 5) / 13) * (25-(1.59)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 25 + (((tickAnim - 18) / 17) * (-45-(25)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 47.5 + (((tickAnim - 0) / 17) * (-10-(47.5)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (-1.25505-(0)));
            yy = -10 + (((tickAnim - 17) / 5) * (-11.94923-(-10)));
            zz = 0 + (((tickAnim - 17) / 5) * (-12.18061-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -1.25505 + (((tickAnim - 22) / 7) * (-10.19559-(-1.25505)));
            yy = -11.94923 + (((tickAnim - 22) / 7) * (43.03372-(-11.94923)));
            zz = -12.18061 + (((tickAnim - 22) / 7) * (-19.36283-(-12.18061)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -10.19559 + (((tickAnim - 29) / 6) * (0-(-10.19559)));
            yy = 43.03372 + (((tickAnim - 29) / 6) * (47.5-(43.03372)));
            zz = -19.36283 + (((tickAnim - 29) / 6) * (0-(-19.36283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -47.5 + (((tickAnim - 0) / 17) * (-12.5-(-47.5)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (-1.04428-(0)));
            yy = -12.5 + (((tickAnim - 17) / 5) * (7.88155-(-12.5)));
            zz = 0 + (((tickAnim - 17) / 5) * (-7.57194-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -1.04428 + (((tickAnim - 22) / 7) * (-0.51728-(-1.04428)));
            yy = 7.88155 + (((tickAnim - 22) / 7) * (-35.77012-(7.88155)));
            zz = -7.57194 + (((tickAnim - 22) / 7) * (-3.19085-(-7.57194)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -0.51728 + (((tickAnim - 29) / 6) * (0-(-0.51728)));
            yy = -35.77012 + (((tickAnim - 29) / 6) * (-47.5-(-35.77012)));
            zz = -3.19085 + (((tickAnim - 29) / 6) * (0-(-3.19085)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -25 + (((tickAnim - 0) / 17) * (45-(-25)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (17.5-(0)));
            yy = 45 + (((tickAnim - 17) / 5) * (-1.59-(45)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 22) / 13) * (0-(17.5)));
            yy = -1.59 + (((tickAnim - 22) / 13) * (-25-(-1.59)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*-7), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*-1));


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*5 ), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*1));

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0.05 + (((tickAnim - 18) / 17) * (0-(0.05)));
            zz = -0.5 + (((tickAnim - 18) / 17) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -2.5 + (((tickAnim - 0) / 18) * (70-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-32.5-(0)));
            yy = 70 + (((tickAnim - 18) / 5) * (44.5-(70)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -32.5 + (((tickAnim - 23) / 12) * (0-(-32.5)));
            yy = 44.5 + (((tickAnim - 23) / 12) * (-2.5-(44.5)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -25 + (((tickAnim - 0) / 18) * (12.5-(-25)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 12.5 + (((tickAnim - 18) / 11) * (-48.13-(12.5)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -48.13 + (((tickAnim - 29) / 6) * (-25-(-48.13)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 2.5 + (((tickAnim - 0) / 10) * (-73.41-(2.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -73.41 + (((tickAnim - 10) / 8) * (-65-(-73.41)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (-11.04587-(0)));
            yy = -65 + (((tickAnim - 18) / 13) * (-16.87013-(-65)));
            zz = 0 + (((tickAnim - 18) / 13) * (-33.48529-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -11.04587 + (((tickAnim - 31) / 4) * (0-(-11.04587)));
            yy = -16.87013 + (((tickAnim - 31) / 4) * (2.5-(-16.87013)));
            zz = -33.48529 + (((tickAnim - 31) / 4) * (0-(-33.48529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-32.5-(0)));
            yy = -70 + (((tickAnim - 0) / 5) * (-44.5-(-70)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = -32.5 + (((tickAnim - 5) / 13) * (0-(-32.5)));
            yy = -44.5 + (((tickAnim - 5) / 13) * (2.5-(-44.5)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 2.5 + (((tickAnim - 18) / 17) * (-70-(2.5)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -12.5 + (((tickAnim - 0) / 13) * (48.13-(-12.5)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 48.13 + (((tickAnim - 13) / 5) * (25-(48.13)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 25 + (((tickAnim - 18) / 17) * (-12.5-(25)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-11.04587-(0)));
            yy = 65 + (((tickAnim - 0) / 13) * (16.87013-(65)));
            zz = 0 + (((tickAnim - 0) / 13) * (33.48529-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -11.04587 + (((tickAnim - 13) / 5) * (0-(-11.04587)));
            yy = 16.87013 + (((tickAnim - 13) / 5) * (-2.5-(16.87013)));
            zz = 33.48529 + (((tickAnim - 13) / 5) * (0-(33.48529)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = -2.5 + (((tickAnim - 18) / 9) * (73.41-(-2.5)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 73.41 + (((tickAnim - 27) / 8) * (65-(73.41)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*-7));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*-10), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*-1));

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBanksiops entity = (EntityPrehistoricFloraBanksiops) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-20))*5), hip.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*1);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-3), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(74.65406), rightarm.rotateAngleY + (float) Math.toRadians(23.9765-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), rightarm.rotateAngleZ + (float) Math.toRadians(-18.27034));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(35-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0), righthand.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), righthand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(74.65406), leftarm.rotateAngleY + (float) Math.toRadians(-23.9765-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), leftarm.rotateAngleZ + (float) Math.toRadians(18.27034));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(-35-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0), lefthand.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), lefthand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(62.59979), rightleg.rotateAngleY + (float) Math.toRadians(49.9083+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), rightleg.rotateAngleZ + (float) Math.toRadians(28.46985));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), rightfoot.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), rightfoot.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(62.59979), leftleg.rotateAngleY + (float) Math.toRadians(-49.9083+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), leftleg.rotateAngleZ + (float) Math.toRadians(-28.46985));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), leftfoot.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), leftfoot.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-70))*10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*20), tail2.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animGape(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBanksiops entity = (EntityPrehistoricFloraBanksiops) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 17) / 33) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 17) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 33) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = -12.5 + (((tickAnim - 50) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -30 + (((tickAnim - 20) / 6) * (-30.53-(-30)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -30.53 + (((tickAnim - 26) / 7) * (-29-(-30.53)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = -29 + (((tickAnim - 33) / 20) * (-30-(-29)));
            yy = 0 + (((tickAnim - 33) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 20) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = -30 + (((tickAnim - 53) / 17) * (0-(-30)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 52.5 + (((tickAnim - 15) / 18) * (50.5-(52.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 50.5 + (((tickAnim - 33) / 7) * (50.2-(50.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 50.2 + (((tickAnim - 40) / 13) * (52.5-(50.2)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = 52.5 + (((tickAnim - 53) / 17) * (0-(52.5)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBanksiops entity = (EntityPrehistoricFloraBanksiops) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -22.5 + (((tickAnim - 7) / 6) * (-8.32327-(-22.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (-0.46974-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-2.4555-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -8.32327 + (((tickAnim - 13) / 7) * (0-(-8.32327)));
            yy = -0.46974 + (((tickAnim - 13) / 7) * (0-(-0.46974)));
            zz = -2.4555 + (((tickAnim - 13) / 7) * (0-(-2.4555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (21.0624-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (5.0142-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-16.80669-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 21.0624 + (((tickAnim - 7) / 13) * (0-(21.0624)));
            yy = 5.0142 + (((tickAnim - 7) / 13) * (0-(5.0142)));
            zz = -16.80669 + (((tickAnim - 7) / 13) * (0-(-16.80669)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 8) / 12) * (0-(22.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        
    }
}
