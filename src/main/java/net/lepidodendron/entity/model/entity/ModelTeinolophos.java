package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTeinolophos;
import net.lepidodendron.entity.EntityPrehistoricFloraTeinolophos;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTeinolophos extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legLeft;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legLeft2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legLeft3;
    private final AdvancedModelRenderer legRight;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legRight2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legRight3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer armLeft;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer armLeft2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer armLeft3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer armRight;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer armRight2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer armRight3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neckThroat;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r35;

    private ModelAnimator animator;

    public ModelTeinolophos() {
        this.textureWidth = 36;
        this.textureHeight = 33;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 18.5783F, 3.9757F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -0.6533F, -3.5507F, 6, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 1.8467F, 1.9493F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, -1.0F, -2.125F, -1.925F, 4, 4, 3, 0.0F, false));

        this.legLeft = new AdvancedModelRenderer(this);
        this.legLeft.setRotationPoint(2.2803F, 1.041F, 1.2556F);
        this.main.addChild(legLeft);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.4697F, 0.3148F, 0.6977F);
        this.legLeft.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1591F, -0.0469F, -0.2842F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -1.675F, -0.875F, -1.575F, 2, 3, 2, 0.0F, false));

        this.legLeft2 = new AdvancedModelRenderer(this);
        this.legLeft2.setRotationPoint(0.7117F, 2.274F, -0.9396F);
        this.legLeft.addChild(legLeft2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1392F, -0.2027F, -0.1016F);
        this.legLeft2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6827F, -0.0469F, -0.2842F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 16, -0.5F, -0.8F, 0.0F, 1, 1, 3, 0.0F, false));

        this.legLeft3 = new AdvancedModelRenderer(this);
        this.legLeft3.setRotationPoint(0.183F, 1.3817F, 2.2083F);
        this.legLeft2.addChild(legLeft3);
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 8, 28, -1.0F, -0.125F, -1.75F, 2, 1, 2, 0.0F, false));

        this.legRight = new AdvancedModelRenderer(this);
        this.legRight.setRotationPoint(-2.2803F, 1.041F, 1.2556F);
        this.main.addChild(legRight);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.4697F, 0.3148F, 0.6977F);
        this.legRight.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1591F, 0.0469F, 0.2842F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 26, -0.325F, -0.875F, -1.575F, 2, 3, 2, 0.0F, true));

        this.legRight2 = new AdvancedModelRenderer(this);
        this.legRight2.setRotationPoint(-0.7117F, 2.274F, -0.9396F);
        this.legRight.addChild(legRight2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.1392F, -0.2027F, -0.1016F);
        this.legRight2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6827F, 0.0469F, 0.2842F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 16, -0.5F, -0.8F, 0.0F, 1, 1, 3, 0.0F, true));

        this.legRight3 = new AdvancedModelRenderer(this);
        this.legRight3.setRotationPoint(-0.183F, 1.3817F, 2.2083F);
        this.legRight2.addChild(legRight3);
        this.legRight3.cubeList.add(new ModelBox(legRight3, 8, 28, -1.0F, -0.125F, -1.75F, 2, 1, 2, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0016F, -0.1277F, -3.7173F);
        this.main.addChild(chest);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5343F, 1.979F, -1.3139F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 8, -2.0F, -2.15F, -1.125F, 5, 4, 3, 0.0F, false));

        this.armLeft = new AdvancedModelRenderer(this);
        this.armLeft.setRotationPoint(2.1181F, 3.0081F, -0.9837F);
        this.chest.addChild(armLeft);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3476F, -0.0291F, -0.3301F);
        this.armLeft.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1898F, 0.0987F, -0.2467F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 12, -1.375F, -1.0F, -0.7F, 2, 2, 2, 0.0F, false));

        this.armLeft2 = new AdvancedModelRenderer(this);
        this.armLeft2.setRotationPoint(0.7177F, 0.609F, 0.1186F);
        this.armLeft.addChild(armLeft2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.1701F, 0.9451F, 0.0336F);
        this.armLeft2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2148F, -0.0385F, -0.1747F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 28, -0.3F, -1.15F, -0.575F, 1, 2, 1, 0.0F, false));

        this.armLeft3 = new AdvancedModelRenderer(this);
        this.armLeft3.setRotationPoint(0.2588F, 1.0869F, 0.095F);
        this.armLeft2.addChild(armLeft3);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.021F, 0.775F, 0.0063F);
        this.armLeft3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1047F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 3, -0.6F, -0.775F, -1.75F, 1, 1, 2, 0.0F, false));

        this.armRight = new AdvancedModelRenderer(this);
        this.armRight.setRotationPoint(-2.1868F, 3.0081F, -0.9837F);
        this.chest.addChild(armRight);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.3476F, -0.0291F, -0.3301F);
        this.armRight.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1898F, -0.0987F, 0.2467F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 12, -0.625F, -1.0F, -0.7F, 2, 2, 2, 0.0F, true));

        this.armRight2 = new AdvancedModelRenderer(this);
        this.armRight2.setRotationPoint(-0.7177F, 0.609F, 0.1186F);
        this.armRight.addChild(armRight2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.1701F, 0.9451F, 0.0336F);
        this.armRight2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2148F, 0.0385F, 0.1747F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 28, -0.7F, -1.15F, -0.575F, 1, 2, 1, 0.0F, true));

        this.armRight3 = new AdvancedModelRenderer(this);
        this.armRight3.setRotationPoint(-0.2588F, 1.0869F, 0.095F);
        this.armRight2.addChild(armRight3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.0211F, 0.775F, 0.0063F);
        this.armRight3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1047F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 3, -0.4F, -0.775F, -1.75F, 1, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.0343F, 0.329F, -2.2639F);
        this.chest.addChild(neck);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.025F, -1.1F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.048F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 15, -1.5F, -1.35F, -1.675F, 3, 2, 3, -0.01F, false));

        this.neckThroat = new AdvancedModelRenderer(this);
        this.neckThroat.setRotationPoint(0.0F, 2.1F, -2.05F);
        this.neck.addChild(neckThroat);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.075F, 0.95F);
        this.neckThroat.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3272F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 8, -0.5F, -0.675F, -0.625F, 2, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0705F, -2.2797F);
        this.neck.addChild(head);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.9608F, -0.5015F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0785F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 0, -1.5F, -1.475F, -1.275F, 3, 2, 2, 0.01F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.0379F, -1.8245F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.1543F, -1.6054F);
        this.head2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2051F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 0, -0.5F, 0.0F, -0.3F, 1, 1, 2, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5299F, 0.9257F, -1.9764F);
        this.head2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5161F, -0.174F, -0.0138F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 13, 0.0F, -0.625F, -0.825F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5955F, 0.9257F, -1.9764F);
        this.head2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5161F, 0.174F, 0.0138F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 13, 0.0F, -0.625F, -0.825F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.4345F, 0.7528F, -2.9662F);
        this.head2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0797F, -0.174F, -0.0138F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 30, 0.075F, -0.25F, 1.475F, 0, 1, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.7528F, -2.9662F);
        this.head2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0797F, 0.174F, 0.0138F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 30, -0.075F, -0.25F, 1.475F, 0, 1, 2, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 27, -0.975F, -0.5F, 0.0F, 1, 1, 3, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.7528F, -2.9662F);
        this.head2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0797F, -0.174F, -0.0138F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 27, -0.025F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 1.1629F, 0.4245F);
        this.head2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0785F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 13, 0.5F, -1.175F, -3.375F, 1, 1, 1, 0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.head.addChild(eye);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0785F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 22, 0.55F, -1.375F, -0.625F, 1, 1, 1, -0.01F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.head.addChild(eye2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0785F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 22, -1.55F, -1.375F, -0.625F, 1, 1, 1, -0.01F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.125F, -0.3F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0044F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.4296F, -0.03F, -3.7189F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3088F, -0.1566F, -0.0124F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 8, 26, 0.025F, -0.5F, -0.45F, 0, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.4951F, -0.03F, -3.7189F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3088F, 0.1566F, 0.0124F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 26, -0.025F, -0.5F, -0.45F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.4345F, 0.3168F, -4.3018F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0795F, -0.1566F, -0.0124F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 24, 0.1F, -0.75F, 1.725F, 0, 1, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.3168F, -4.3018F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0795F, 0.1566F, 0.0124F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 24, -0.1F, -0.75F, 1.725F, 0, 1, 2, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 20, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.3168F, -4.3018F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0795F, -0.1566F, -0.0124F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 20, 0.0F, -0.5F, 0.0F, 1, 1, 3, -0.001F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.125F, -0.6F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0785F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 13, -0.5F, -0.35F, -3.725F, 1, 1, 1, 0.001F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 24, -1.5F, -0.325F, -0.875F, 3, 1, 2, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.5525F, -1.1287F);
        this.jaw.addChild(throat);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.0254F, 0.019F);
        this.throat.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1789F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 27, -1.0F, -0.9F, -0.05F, 2, 1, 2, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.1698F, 3.0312F);
        this.main.addChild(tail);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.3269F, 1.418F);
        this.tail.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2618F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 14, 20, -1.0F, -1.075F, -2.7F, 2, 1, 3, -0.01F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 4, -1.0F, -1.575F, -2.775F, 2, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5223F, 1.7696F);
        this.tail.addChild(tail2);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.5212F, 1.2566F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 24, -1.0F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.1229F, 1.3014F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1745F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 22, -1.0F, -0.6F, -1.475F, 2, 1, 3, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.407F, 2.7726F);
        this.tail2.addChild(tail3);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.1744F, 1.2659F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1222F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 26, 8, -0.5F, -0.575F, -1.5F, 1, 1, 3, 0.01F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        
        this.main.offsetY = -0.13F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.4F;
        this.main.offsetX = 0.3F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
     
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
        //this.resetToDefaultPose();
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraTeinolophos proteros = (EntityPrehistoricFloraTeinolophos) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};



        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTeinolophos ee = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }  else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }




    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeinolophos entity = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.88-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.88 + (((tickAnim - 5) / 5) * (17.25-(21.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.5 + (((tickAnim - 5) / 5) * (0-(31.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeinolophos entity = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -47.25 + (((tickAnim - 12) / 10) * (58.75-(-47.25)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 58.75 + (((tickAnim - 22) / 10) * (-47.25-(58.75)));
            yy = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = -47.25 + (((tickAnim - 32) / 10) * (58.75-(-47.25)));
            yy = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 58.75 + (((tickAnim - 42) / 8) * (0-(58.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -33.25 + (((tickAnim - 6) / 6) * (-0.5-(-33.25)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -0.5 + (((tickAnim - 12) / 10) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -0.5 + (((tickAnim - 22) / 5) * (-72.25-(-0.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -72.25 + (((tickAnim - 27) / 5) * (-0.5-(-72.25)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = -0.5 + (((tickAnim - 32) / 10) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -0.5 + (((tickAnim - 42) / 3) * (-54.05-(-0.5)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -54.05 + (((tickAnim - 45) / 5) * (0-(-54.05)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 3) * (0.325-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 45) / 5) * (0-(0.325)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armLeft2.rotationPointX = this.armLeft2.rotationPointX + (float)(xx);
        this.armLeft2.rotationPointY = this.armLeft2.rotationPointY - (float)(yy);
        this.armLeft2.rotationPointZ = this.armLeft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (60.08-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 60.08 + (((tickAnim - 6) / 6) * (62.25-(60.08)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 62.25 + (((tickAnim - 12) / 10) * (62.25-(62.25)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 62.25 + (((tickAnim - 22) / 10) * (62.25-(62.25)));
            yy = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 62.25 + (((tickAnim - 32) / 10) * (62.25-(62.25)));
            yy = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 62.25 + (((tickAnim - 42) / 8) * (0-(62.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(xx), armLeft3.rotateAngleY + (float) Math.toRadians(yy), armLeft3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeinolophos entity = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.88-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.88 + (((tickAnim - 5) / 5) * (17.25-(21.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.5 + (((tickAnim - 5) / 5) * (0-(31.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeinolophos entity = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10.75 + (((tickAnim - 18) / 15) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10.75 + (((tickAnim - 33) / 17) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.825 + (((tickAnim - 18) / 15) * (-0.825-(-0.825)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.825 + (((tickAnim - 33) / 17) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-21.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -21.25 + (((tickAnim - 18) / 15) * (-21.25-(-21.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -21.25 + (((tickAnim - 33) / 17) * (0-(-21.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 18) / 15) * (13-(13)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 33) / 17) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (22.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 22.25 + (((tickAnim - 18) / 15) * (22.25-(22.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 22.25 + (((tickAnim - 33) / 17) * (0-(22.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.75 + (((tickAnim - 18) / 15) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 33) / 17) * (0-(6.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0.125 + (((tickAnim - 18) / 15) * (0.125-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.25 + (((tickAnim - 18) / 15) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (21.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 21.25 + (((tickAnim - 18) / 15) * (21.25-(21.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 21.25 + (((tickAnim - 33) / 17) * (0-(21.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 18) / 15) * (13-(13)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 33) / 17) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-22.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -22.25 + (((tickAnim - 18) / 15) * (-22.25-(-22.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -22.25 + (((tickAnim - 33) / 17) * (0-(-22.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeinolophos entity = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.88-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.88 + (((tickAnim - 5) / 5) * (17.25-(21.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.5 + (((tickAnim - 5) / 5) * (0-(31.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeinolophos entity = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*0.3);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 34.5 + (((tickAnim - 0) / 5) * (-0.72851-(34.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.17826-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-13.74887-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.72851 + (((tickAnim - 5) / 5) * (-36-(-0.72851)));
            yy = -0.17826 + (((tickAnim - 5) / 5) * (0-(-0.17826)));
            zz = -13.74887 + (((tickAnim - 5) / 5) * (0-(-13.74887)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -36 + (((tickAnim - 10) / 10) * (34.5-(-36)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.75 + (((tickAnim - 0) / 3) * (22.63-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 22.63 + (((tickAnim - 3) / 5) * (-35.18-(22.63)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35.18 + (((tickAnim - 8) / 2) * (-18-(-35.18)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18 + (((tickAnim - 10) / 10) * (-7.75-(-18)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.55-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 8) / 2) * (0-(0.55)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft2.rotationPointX = this.legLeft2.rotationPointX + (float)(xx);
        this.legLeft2.rotationPointY = this.legLeft2.rotationPointY - (float)(yy);
        this.legLeft2.rotationPointZ = this.legLeft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 74 + (((tickAnim - 0) / 3) * (99.19-(74)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 99.19 + (((tickAnim - 3) / 2) * (57.13-(99.19)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 57.13 + (((tickAnim - 5) / 3) * (40.44-(57.13)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40.44 + (((tickAnim - 8) / 2) * (54.75-(40.44)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 54.75 + (((tickAnim - 10) / 3) * (32.06-(54.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 32.06 + (((tickAnim - 13) / 7) * (74-(32.06)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (-0.455-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 3) / 2) * (0.45-(-0.1)));
            zz = -0.455 + (((tickAnim - 3) / 2) * (-0.375-(-0.455)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 5) / 3) * (0.605-(0.45)));
            zz = -0.375 + (((tickAnim - 5) / 3) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.605 + (((tickAnim - 8) / 2) * (0.4-(0.605)));
            zz = -0.375 + (((tickAnim - 8) / 2) * (-0.125-(-0.375)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 3) * (0.625-(0.4)));
            zz = -0.125 + (((tickAnim - 10) / 3) * (-0.14-(-0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 13) / 7) * (0-(0.625)));
            zz = -0.14 + (((tickAnim - 13) / 7) * (-0.2-(-0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft3.rotationPointX = this.legLeft3.rotationPointX + (float)(xx);
        this.legLeft3.rotationPointY = this.legLeft3.rotationPointY - (float)(yy);
        this.legLeft3.rotationPointZ = this.legLeft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-140))*-2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.2);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -35.5 + (((tickAnim - 0) / 10) * (61.5-(-35.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 61.5 + (((tickAnim - 10) / 5) * (11.81794-(61.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (5.45526-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-24.43497-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 11.81794 + (((tickAnim - 15) / 5) * (-35.5-(11.81794)));
            yy = 5.45526 + (((tickAnim - 15) / 5) * (0-(5.45526)));
            zz = -24.43497 + (((tickAnim - 15) / 5) * (0-(-24.43497)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 0) / 10) * (-15.5-(10.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.5 + (((tickAnim - 10) / 5) * (-56.12-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -56.12 + (((tickAnim - 15) / 5) * (10.25-(-56.12)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.75 + (((tickAnim - 0) / 3) * (1.75-(25.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 1.75 + (((tickAnim - 3) / 7) * (58.75-(1.75)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 58.75 + (((tickAnim - 10) / 2) * (100.58-(58.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 100.58 + (((tickAnim - 12) / 3) * (71.75-(100.58)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 71.75 + (((tickAnim - 15) / 5) * (25.75-(71.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(xx), armLeft3.rotateAngleY + (float) Math.toRadians(yy), armLeft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0.275-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 2) * (0.405-(0.275)));
            zz = -0.25 + (((tickAnim - 10) / 2) * (-0.385-(-0.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.405 + (((tickAnim - 12) / 8) * (0-(0.405)));
            zz = -0.385 + (((tickAnim - 12) / 8) * (0-(-0.385)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armLeft3.rotationPointX = this.armLeft3.rotationPointX + (float)(xx);
        this.armLeft3.rotationPointY = this.armLeft3.rotationPointY - (float)(yy);
        this.armLeft3.rotationPointZ = this.armLeft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2.2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 61.5 + (((tickAnim - 0) / 5) * (11.81794-(61.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5.45526-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (24.43497-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11.81794 + (((tickAnim - 5) / 5) * (-35.5-(11.81794)));
            yy = -5.45526 + (((tickAnim - 5) / 5) * (0-(-5.45526)));
            zz = 24.43497 + (((tickAnim - 5) / 5) * (0-(24.43497)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -35.5 + (((tickAnim - 10) / 10) * (61.5-(-35.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.5 + (((tickAnim - 0) / 5) * (-56.12-(-15.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -56.12 + (((tickAnim - 5) / 5) * (10.25-(-56.12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.25 + (((tickAnim - 10) / 10) * (-15.5-(10.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 58.75 + (((tickAnim - 0) / 2) * (100.58-(58.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 100.58 + (((tickAnim - 2) / 3) * (71.75-(100.58)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 71.75 + (((tickAnim - 5) / 5) * (25.75-(71.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.75 + (((tickAnim - 10) / 3) * (1.5-(25.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 13) / 7) * (58.75-(1.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(xx), armRight3.rotateAngleY + (float) Math.toRadians(yy), armRight3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 2) * (0.405-(0.275)));
            zz = -0.25 + (((tickAnim - 0) / 2) * (-0.385-(-0.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = 0.405 + (((tickAnim - 2) / 8) * (0-(0.405)));
            zz = -0.385 + (((tickAnim - 2) / 8) * (0-(-0.385)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armRight3.rotationPointX = this.armRight3.rotationPointX + (float)(xx);
        this.armRight3.rotationPointY = this.armRight3.rotationPointY - (float)(yy);
        this.armRight3.rotationPointZ = this.armRight3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -36 + (((tickAnim - 0) / 10) * (34.5-(-36)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 34.5 + (((tickAnim - 10) / 5) * (-0.72851-(34.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.17826-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (13.74887-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.72851 + (((tickAnim - 15) / 5) * (-36-(-0.72851)));
            yy = 0.17826 + (((tickAnim - 15) / 5) * (0-(0.17826)));
            zz = 13.74887 + (((tickAnim - 15) / 5) * (0-(13.74887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -18 + (((tickAnim - 0) / 10) * (-7.75-(-18)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.75 + (((tickAnim - 10) / 3) * (22.63-(-7.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 22.63 + (((tickAnim - 13) / 5) * (-35.18-(22.63)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -35.18 + (((tickAnim - 18) / 2) * (-18-(-35.18)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.55-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 18) / 2) * (0-(0.55)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight2.rotationPointX = this.legRight2.rotationPointX + (float)(xx);
        this.legRight2.rotationPointY = this.legRight2.rotationPointY - (float)(yy);
        this.legRight2.rotationPointZ = this.legRight2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 54.75 + (((tickAnim - 0) / 3) * (25.92-(54.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 25.92 + (((tickAnim - 3) / 7) * (74-(25.92)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 74 + (((tickAnim - 10) / 3) * (99.19-(74)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 99.19 + (((tickAnim - 13) / 2) * (57.13-(99.19)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 57.13 + (((tickAnim - 15) / 3) * (40.44-(57.13)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 40.44 + (((tickAnim - 18) / 2) * (54.75-(40.44)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (0.62-(0.4)));
            zz = -0.125 + (((tickAnim - 0) / 3) * (-0.15-(-0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.62 + (((tickAnim - 3) / 7) * (0-(0.62)));
            zz = -0.15 + (((tickAnim - 3) / 7) * (-0.2-(-0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.1-(0)));
            zz = -0.2 + (((tickAnim - 10) / 3) * (-0.455-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 2) * (0.45-(-0.1)));
            zz = -0.455 + (((tickAnim - 13) / 2) * (-0.375-(-0.455)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 15) / 3) * (0.605-(0.45)));
            zz = -0.375 + (((tickAnim - 15) / 3) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.605 + (((tickAnim - 18) / 2) * (0.4-(0.605)));
            zz = -0.375 + (((tickAnim - 18) / 2) * (-0.125-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight3.rotationPointX = this.legRight3.rotationPointX + (float)(xx);
        this.legRight3.rotationPointY = this.legRight3.rotationPointY - (float)(yy);
        this.legRight3.rotationPointZ = this.legRight3.rotationPointZ + (float)(zz);
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeinolophos entity = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*4), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*7), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*7));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*0.5);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 34.5 + (((tickAnim - 0) / 3) * (-0.72851-(34.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.17826-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-13.74887-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.72851 + (((tickAnim - 3) / 2) * (-36-(-0.72851)));
            yy = -0.17826 + (((tickAnim - 3) / 2) * (0-(-0.17826)));
            zz = -13.74887 + (((tickAnim - 3) / 2) * (0-(-13.74887)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -36 + (((tickAnim - 5) / 5) * (34.5-(-36)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.75 + (((tickAnim - 0) / 2) * (22.63-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 22.63 + (((tickAnim - 2) / 2) * (-35.18-(22.63)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -35.18 + (((tickAnim - 4) / 1) * (-18-(-35.18)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18 + (((tickAnim - 5) / 5) * (-7.75-(-18)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0.55-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.55 + (((tickAnim - 4) / 1) * (0-(0.55)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft2.rotationPointX = this.legLeft2.rotationPointX + (float)(xx);
        this.legLeft2.rotationPointY = this.legLeft2.rotationPointY - (float)(yy);
        this.legLeft2.rotationPointZ = this.legLeft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 74 + (((tickAnim - 0) / 2) * (99.19-(74)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 99.19 + (((tickAnim - 2) / 1) * (57.13-(99.19)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 57.13 + (((tickAnim - 3) / 1) * (40.44-(57.13)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 40.44 + (((tickAnim - 4) / 1) * (54.75-(40.44)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 54.75 + (((tickAnim - 5) / 2) * (32.06-(54.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 32.06 + (((tickAnim - 7) / 3) * (74-(32.06)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.1-(0)));
            zz = -0.2 + (((tickAnim - 0) / 2) * (-0.455-(-0.2)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 2) / 1) * (0.45-(-0.1)));
            zz = -0.455 + (((tickAnim - 2) / 1) * (-0.375-(-0.455)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 3) / 1) * (0.605-(0.45)));
            zz = -0.375 + (((tickAnim - 3) / 1) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.605 + (((tickAnim - 4) / 1) * (0.4-(0.605)));
            zz = -0.375 + (((tickAnim - 4) / 1) * (-0.125-(-0.375)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 5) / 2) * (0.625-(0.4)));
            zz = -0.125 + (((tickAnim - 5) / 2) * (-0.14-(-0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 7) / 3) * (0-(0.625)));
            zz = -0.14 + (((tickAnim - 7) / 3) * (-0.2-(-0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft3.rotationPointX = this.legLeft3.rotationPointX + (float)(xx);
        this.legLeft3.rotationPointY = this.legLeft3.rotationPointY - (float)(yy);
        this.legLeft3.rotationPointZ = this.legLeft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-140))*-8), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-8), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-8));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.2);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -35.5 + (((tickAnim - 0) / 5) * (61.5-(-35.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 61.5 + (((tickAnim - 5) / 3) * (11.81794-(61.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (5.45526-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-24.43497-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.81794 + (((tickAnim - 8) / 2) * (-35.5-(11.81794)));
            yy = 5.45526 + (((tickAnim - 8) / 2) * (0-(5.45526)));
            zz = -24.43497 + (((tickAnim - 8) / 2) * (0-(-24.43497)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.25 + (((tickAnim - 0) / 5) * (-15.5-(10.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15.5 + (((tickAnim - 5) / 3) * (-56.12-(-15.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -56.12 + (((tickAnim - 8) / 2) * (10.25-(-56.12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25.75 + (((tickAnim - 0) / 2) * (1.75-(25.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 1.75 + (((tickAnim - 2) / 3) * (58.75-(1.75)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 58.75 + (((tickAnim - 5) / 1) * (100.58-(58.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 100.58 + (((tickAnim - 6) / 2) * (71.75-(100.58)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 71.75 + (((tickAnim - 8) / 2) * (25.75-(71.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(xx), armLeft3.rotateAngleY + (float) Math.toRadians(yy), armLeft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0.275-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 5) / 1) * (0.405-(0.275)));
            zz = -0.25 + (((tickAnim - 5) / 1) * (-0.385-(-0.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.405 + (((tickAnim - 6) / 4) * (0-(0.405)));
            zz = -0.385 + (((tickAnim - 6) / 4) * (0-(-0.385)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armLeft3.rotationPointX = this.armLeft3.rotationPointX + (float)(xx);
        this.armLeft3.rotationPointY = this.armLeft3.rotationPointY - (float)(yy);
        this.armLeft3.rotationPointZ = this.armLeft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*4.2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-4), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*8), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*4));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 61.5 + (((tickAnim - 0) / 3) * (11.81794-(61.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.45526-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (24.43497-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.81794 + (((tickAnim - 3) / 2) * (-35.5-(11.81794)));
            yy = -5.45526 + (((tickAnim - 3) / 2) * (0-(-5.45526)));
            zz = 24.43497 + (((tickAnim - 3) / 2) * (0-(24.43497)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -35.5 + (((tickAnim - 5) / 5) * (61.5-(-35.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15.5 + (((tickAnim - 0) / 3) * (-56.12-(-15.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -56.12 + (((tickAnim - 3) / 2) * (10.25-(-56.12)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 5) / 5) * (-15.5-(10.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 58.75 + (((tickAnim - 0) / 1) * (100.58-(58.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 100.58 + (((tickAnim - 1) / 2) * (71.75-(100.58)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 71.75 + (((tickAnim - 3) / 2) * (25.75-(71.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25.75 + (((tickAnim - 5) / 2) * (1.5-(25.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 7) / 3) * (58.75-(1.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(xx), armRight3.rotateAngleY + (float) Math.toRadians(yy), armRight3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 1) * (0.405-(0.275)));
            zz = -0.25 + (((tickAnim - 0) / 1) * (-0.385-(-0.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            yy = 0.405 + (((tickAnim - 1) / 4) * (0-(0.405)));
            zz = -0.385 + (((tickAnim - 1) / 4) * (0-(-0.385)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.275-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armRight3.rotationPointX = this.armRight3.rotationPointX + (float)(xx);
        this.armRight3.rotationPointY = this.armRight3.rotationPointY - (float)(yy);
        this.armRight3.rotationPointZ = this.armRight3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -36 + (((tickAnim - 0) / 5) * (34.5-(-36)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 34.5 + (((tickAnim - 5) / 3) * (-0.72851-(34.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.17826-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (13.74887-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.72851 + (((tickAnim - 8) / 2) * (-36-(-0.72851)));
            yy = 0.17826 + (((tickAnim - 8) / 2) * (0-(0.17826)));
            zz = 13.74887 + (((tickAnim - 8) / 2) * (0-(13.74887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18 + (((tickAnim - 0) / 5) * (-7.75-(-18)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -7.75 + (((tickAnim - 5) / 2) * (22.63-(-7.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 22.63 + (((tickAnim - 7) / 2) * (-35.18-(22.63)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -35.18 + (((tickAnim - 9) / 1) * (-18-(-35.18)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.55-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.55 + (((tickAnim - 9) / 1) * (0-(0.55)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight2.rotationPointX = this.legRight2.rotationPointX + (float)(xx);
        this.legRight2.rotationPointY = this.legRight2.rotationPointY - (float)(yy);
        this.legRight2.rotationPointZ = this.legRight2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 54.75 + (((tickAnim - 0) / 2) * (25.92-(54.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 25.92 + (((tickAnim - 2) / 3) * (74-(25.92)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 74 + (((tickAnim - 5) / 2) * (99.19-(74)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 99.19 + (((tickAnim - 7) / 1) * (57.13-(99.19)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 57.13 + (((tickAnim - 8) / 1) * (40.44-(57.13)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 40.44 + (((tickAnim - 9) / 1) * (54.75-(40.44)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 2) * (0.62-(0.4)));
            zz = -0.125 + (((tickAnim - 0) / 2) * (-0.15-(-0.125)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.62 + (((tickAnim - 2) / 3) * (0-(0.62)));
            zz = -0.15 + (((tickAnim - 2) / 3) * (-0.2-(-0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.1-(0)));
            zz = -0.2 + (((tickAnim - 5) / 2) * (-0.455-(-0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 7) / 1) * (0.45-(-0.1)));
            zz = -0.455 + (((tickAnim - 7) / 1) * (-0.375-(-0.455)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 1) * (0.605-(0.45)));
            zz = -0.375 + (((tickAnim - 8) / 1) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.605 + (((tickAnim - 9) / 1) * (0.4-(0.605)));
            zz = -0.375 + (((tickAnim - 9) / 1) * (-0.125-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight3.rotationPointX = this.legRight3.rotationPointX + (float)(xx);
        this.legRight3.rotationPointY = this.legRight3.rotationPointY - (float)(yy);
        this.legRight3.rotationPointZ = this.legRight3.rotationPointZ + (float)(zz);
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeinolophos entity = (EntityPrehistoricFloraTeinolophos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*7), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*10));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*0.39);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.45 + (((tickAnim - 0) / 10) * (-315.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*500-(-0.45)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -42.5 + (((tickAnim - 0) / 10) * (-56.5-(-42.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -315.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*500 + (((tickAnim - 10) / 10) * (-0.45-(-315.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*500)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -56.5 + (((tickAnim - 10) / 10) * (-42.5-(-56.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25.35 + (((tickAnim - 0) / 10) * (-6.75-(25.35)));
            yy = -19.25 + (((tickAnim - 0) / 10) * (0-(-19.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 10) / 10) * (25.35-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (-19.25-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 133.1 + (((tickAnim - 0) / 10) * (-14-(133.1)));
            yy = -2.25 + (((tickAnim - 0) / 10) * (0-(-2.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (133.1-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -8 + (((tickAnim - 0) / 10) * (351.414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-500-(-8)));
            yy = 0 + (((tickAnim - 0) / 10) * (14.64704-(0)));
            zz = 56.5 + (((tickAnim - 0) / 10) * (22.95651-(56.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 351.414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-500 + (((tickAnim - 10) / 10) * (-8-(351.414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-500)));
            yy = 14.64704 + (((tickAnim - 10) / 10) * (0-(14.64704)));
            zz = 22.95651 + (((tickAnim - 10) / 10) * (56.5-(22.95651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -6.75 + (((tickAnim - 0) / 10) * (25.35-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (-19.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25.35 + (((tickAnim - 10) / 10) * (-6.75-(25.35)));
            yy = -19.25 + (((tickAnim - 10) / 10) * (0-(-19.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -14 + (((tickAnim - 0) / 10) * (133.1-(-14)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 133.1 + (((tickAnim - 10) / 10) * (-14-(133.1)));
            yy = -2.25 + (((tickAnim - 10) / 10) * (0-(-2.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-7.75), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*-8), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-8));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.175);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -56.02662 + (((tickAnim - 0) / 10) * (-471.6123+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-700-(-56.02662)));
            yy = 28.50353 + (((tickAnim - 0) / 10) * (0.04858-(28.50353)));
            zz = -32.32984 + (((tickAnim - 0) / 10) * (-36.25004-(-32.32984)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -471.6123+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-700 + (((tickAnim - 10) / 10) * (-56.02662-(-471.6123+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-700)));
            yy = 0.04858 + (((tickAnim - 10) / 10) * (28.50353-(0.04858)));
            zz = -36.25004 + (((tickAnim - 10) / 10) * (-32.32984-(-36.25004)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -30.25 + (((tickAnim - 0) / 10) * (-455.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-115))*-500-(-30.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -455.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-115))*-500 + (((tickAnim - 10) / 10) * (-30.25-(-455.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-115))*-500)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 43.5 + (((tickAnim - 0) / 10) * (-184.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500-(43.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -184.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500 + (((tickAnim - 10) / 10) * (43.5-(-184.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(xx), armLeft3.rotateAngleY + (float) Math.toRadians(yy), armLeft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.375-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 5) * (0-(-0.275)));
            zz = -0.375 + (((tickAnim - 15) / 5) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armLeft3.rotationPointX = this.armLeft3.rotationPointX + (float)(xx);
        this.armLeft3.rotationPointY = this.armLeft3.rotationPointY - (float)(yy);
        this.armLeft3.rotationPointZ = this.armLeft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 37.20913 + (((tickAnim - 0) / 10) * (-186.0332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500-(37.20913)));
            yy = 17.29943 + (((tickAnim - 0) / 10) * (-10.46233-(17.29943)));
            zz = 43.86296 + (((tickAnim - 0) / 10) * (38.62095-(43.86296)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -186.0332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500 + (((tickAnim - 10) / 10) * (37.20913-(-186.0332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500)));
            yy = -10.46233 + (((tickAnim - 10) / 10) * (17.29943-(-10.46233)));
            zz = 38.62095 + (((tickAnim - 10) / 10) * (43.86296-(38.62095)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 13 + (((tickAnim - 0) / 10) * (647.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-115))*700-(13)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 647.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-115))*700 + (((tickAnim - 10) / 10) * (13-(647.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-115))*700)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 61.25 + (((tickAnim - 0) / 10) * (249.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-500-(61.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 249.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-500 + (((tickAnim - 10) / 10) * (61.25-(249.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-500)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(xx), armRight3.rotateAngleY + (float) Math.toRadians(yy), armRight3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.375-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 5) * (0-(-0.275)));
            zz = -0.375 + (((tickAnim - 5) / 5) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armRight3.rotationPointX = this.armRight3.rotationPointX + (float)(xx);
        this.armRight3.rotationPointY = this.armRight3.rotationPointY - (float)(yy);
        this.armRight3.rotationPointZ = this.armRight3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(14.75), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-9.75), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*4), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(4.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(12.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6.75), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*8), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*12), tail3.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTeinolophos e = (EntityPrehistoricFloraTeinolophos) entity;

        }
}
