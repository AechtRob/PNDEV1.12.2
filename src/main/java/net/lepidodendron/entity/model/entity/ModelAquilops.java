package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAquilops;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAquilops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer leglef4;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer leglef2;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer armleft1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer handlegft;
    private final AdvancedModelRenderer armright1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer handlegft2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer Eye1;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer Eye2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r46;

    private ModelAnimator animator;

    public ModelAquilops() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 10.0F, 2.175F);


        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -2.5F, -0.1F);
        this.body.addChild(Body2);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.5261F, -1.0809F);
        this.Body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 45, -1.5F, -6.35F, -3.925F, 3, 4, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 21, -2.0F, -4.35F, -4.925F, 4, 2, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.0F, -2.6F, -5.925F, 6, 8, 7, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(2.25F, 3.4673F, -1.7887F);
        this.Body2.addChild(legleft1);
        this.setRotateAngle(legleft1, -0.2182F, 0.0F, 0.0F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, 30, 52, -1.0F, -1.2488F, -2.0287F, 3, 6, 4, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.5F, 4.8783F, -1.5492F);
        this.legleft1.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.6109F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 45, 55, -1.0F, -0.5216F, -0.2038F, 2, 6, 3, 0.0F, false));

        this.leglef4 = new AdvancedModelRenderer(this);
        this.leglef4.setRotationPoint(0.0F, 4.5669F, 1.3864F);
        this.legleft2.addChild(leglef4);
        this.setRotateAngle(leglef4, -0.3927F, 0.0F, 0.0F);
        this.leglef4.cubeList.add(new ModelBox(leglef4, 0, 60, -1.0F, 0.3666F, -0.9752F, 2, 4, 2, -0.01F, false));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 3.9413F, 0.0381F);
        this.leglef4.addChild(footleft);
        this.footleft.cubeList.add(new ModelBox(footleft, 0, 53, -1.5F, -0.0748F, -4.0133F, 3, 1, 5, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-2.25F, 3.4673F, -1.7887F);
        this.Body2.addChild(legright3);
        this.setRotateAngle(legright3, -0.2182F, 0.0F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 30, 52, -2.0F, -1.2488F, -2.0287F, 3, 6, 4, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.5F, 4.8783F, -1.5492F);
        this.legright3.addChild(legright4);
        this.setRotateAngle(legright4, 0.6109F, 0.0F, 0.0F);
        this.legright4.cubeList.add(new ModelBox(legright4, 45, 55, -1.0F, -0.5216F, -0.2038F, 2, 6, 3, 0.0F, true));

        this.leglef2 = new AdvancedModelRenderer(this);
        this.leglef2.setRotationPoint(0.0F, 4.5669F, 1.3864F);
        this.legright4.addChild(leglef2);
        this.setRotateAngle(leglef2, -0.3927F, 0.0F, 0.0F);
        this.leglef2.cubeList.add(new ModelBox(leglef2, 0, 60, -1.0F, 0.3666F, -0.9752F, 2, 4, 2, -0.01F, true));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 3.9413F, 0.0381F);
        this.leglef2.addChild(footright);
        this.footright.cubeList.add(new ModelBox(footright, 0, 53, -1.5F, -0.0748F, -4.0133F, 3, 1, 5, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, -6.15F);
        this.Body2.addChild(body3);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.3401F, -0.9227F);
        this.body3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3578F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 30, -2.0F, -2.375F, -4.075F, 4, 6, 5, 0.0F, false));

        this.armleft1 = new AdvancedModelRenderer(this);
        this.armleft1.setRotationPoint(1.8068F, 3.2978F, -3.1302F);
        this.body3.addChild(armleft1);
        this.setRotateAngle(armleft1, 0.3444F, 0.1925F, -0.49F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.1861F, 0.1836F, 0.4652F);
        this.armleft1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.0436F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 62, -2.5F, -0.25F, -1.5F, 2, 4, 2, 0.0F, false));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.2022F, 3.2678F, 0.0909F);
        this.armleft1.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.4804F, -0.0378F, -0.0218F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 53, 62, -0.5F, -0.95F, -2.85F, 1, 2, 3, 0.0F, false));

        this.handlegft = new AdvancedModelRenderer(this);
        this.handlegft.setRotationPoint(0.5F, 0.05F, -2.85F);
        this.armleft2.addChild(handlegft);
        this.handlegft.cubeList.add(new ModelBox(handlegft, 0, 16, 0.0F, -0.9991F, -1.9892F, 0, 2, 2, 0.0F, false));

        this.armright1 = new AdvancedModelRenderer(this);
        this.armright1.setRotationPoint(-1.8068F, 3.2978F, -3.1302F);
        this.body3.addChild(armright1);
        this.setRotateAngle(armright1, 0.3444F, -0.1925F, 0.49F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.1861F, 0.1836F, 0.4652F);
        this.armright1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.0436F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 62, 0.5F, -0.25F, -1.5F, 2, 4, 2, 0.0F, true));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-0.2022F, 3.2678F, 0.0909F);
        this.armright1.addChild(armright2);
        this.setRotateAngle(armright2, 0.4804F, 0.0378F, 0.0218F);
        this.armright2.cubeList.add(new ModelBox(armright2, 53, 62, -0.5F, -0.95F, -2.85F, 1, 2, 3, 0.0F, true));

        this.handlegft2 = new AdvancedModelRenderer(this);
        this.handlegft2.setRotationPoint(-0.5F, 0.05F, -2.85F);
        this.armright2.addChild(handlegft2);
        this.handlegft2.cubeList.add(new ModelBox(handlegft2, 0, 16, 0.0F, -0.9991F, -1.9892F, 0, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 4.0F, -4.5F);
        this.body3.addChild(neck);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.6599F, 3.5773F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2531F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 3, -1.5F, 0.125F, -7.825F, 3, 4, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -3.0539F, -3.3062F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.35F, -1.6013F, -0.7707F, 2, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.4314F, 2.0F, -3.4996F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5672F, -0.0175F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 16, 0.325F, -1.075F, -0.55F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.4314F, 2.0F, -4.4996F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5672F, -0.0175F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 19, 0.325F, -0.95F, -0.6F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.4314F, 2.0F, -3.4996F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5672F, 0.0175F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 16, -0.325F, -1.075F, -0.55F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.4314F, 2.0F, -4.4996F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5672F, 0.0175F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 19, -0.325F, -0.95F, -0.6F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.125F, -2.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.9599F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 0, -2.15F, -2.0066F, -0.0912F, 3, 1, 1, -0.01F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 0, -1.85F, -2.0066F, -0.0912F, 3, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.9769F, -0.8762F, -0.7332F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6109F, -0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 41, -0.9F, -1.025F, -0.825F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.475F, 2.0F, -2.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3054F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 45, -1.0F, -3.525F, 1.0F, 2, 1, 1, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 55, -1.0F, -3.0F, -1.0F, 2, 3, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.475F, -0.35F, -2.325F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3046F, -0.2971F, 0.0027F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 45, -0.925F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.8F, 2.0F, -4.2F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.3054F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 0, -1.0F, -2.0F, -1.0F, 2, 2, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.75F, 1.075F, -3.6F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4435F, -0.2677F, -0.1741F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 61, 25, -1.0F, -2.0F, -1.0F, 1, 2, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.25F, 1.075F, -3.6F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4435F, 0.2677F, 0.1741F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 61, 25, 0.0F, -2.0F, -1.0F, 1, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.9769F, -0.8762F, -0.7332F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6109F, 0.3054F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 41, -0.1F, -1.025F, -0.825F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.475F, -0.35F, -2.325F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3046F, 0.2971F, -0.0027F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 45, -0.075F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.475F, 2.0F, -2.0F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.3054F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 45, -1.0F, -3.525F, 1.0F, 2, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 56, 55, -1.0F, -3.0F, -1.0F, 2, 3, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.4F, 2.075F, -2.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4285F, -0.0537F, -0.7406F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 62, 62, -0.5F, -1.85F, -0.425F, 1, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.4F, 2.075F, -2.0F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2546F, -0.3602F, -0.7762F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 29, 63, -0.675F, -1.725F, -3.375F, 1, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.4F, 2.075F, -2.0F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2546F, 0.3602F, 0.7762F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 63, -0.325F, -1.725F, -3.375F, 1, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.4F, 2.075F, -2.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.4285F, 0.0537F, 0.7406F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 62, 62, -0.5F, -1.85F, -0.425F, 1, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.2F, 2.0F, -4.2F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.3054F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 0, -1.0F, -2.0F, -1.0F, 2, 2, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.375F, -6.55F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.3352F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 42, 3, -1.0F, -0.2066F, -0.3912F, 1, 1, 1, -0.05F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, -1.125F, -2.0F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.2654F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 9, 45, -1.0F, -1.2066F, -0.3912F, 3, 2, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -0.5F, -3.75F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.2217F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 22, 55, -1.0F, -1.2066F, -0.3912F, 2, 2, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 1.375F, -5.375F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.4835F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 38, 63, -1.0F, -1.2066F, -0.3912F, 2, 2, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.425F, -5.375F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.9599F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 63, 49, -1.0F, -1.2066F, -0.3912F, 2, 2, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.75F, -6.5F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.5672F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 29, -1.0F, -1.2066F, -0.3912F, 1, 2, 1, 0.0F, false));

        this.Eye1 = new AdvancedModelRenderer(this);
        this.Eye1.setRotationPoint(-0.125F, 1.6F, -3.875F);
        this.head.addChild(Eye1);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye1.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2595F, 0.2768F, 0.1391F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 44, 30, 0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Eye2 = new AdvancedModelRenderer(this);
        this.Eye2.setRotationPoint(-0.875F, 1.6F, -3.875F);
        this.head.addChild(Eye2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2595F, -0.2768F, -0.1391F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 44, 30, -1.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.0F, -1.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 14, -0.75F, 0.7F, -2.375F, 2, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 14, -1.25F, 0.7F, -2.375F, 2, 1, 3, -0.01F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.975F, 0.0F, -0.75F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.0175F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 10, 0.175F, -0.5F, -3.025F, 0, 1, 4, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.975F, 0.0F, -0.75F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0466F, -0.302F, 0.1554F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 59, 10, -0.9F, -2.5F, -2.45F, 0, 3, 4, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.975F, 0.0F, -0.75F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.3054F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 0, -1.0F, 0.0F, -3.4F, 2, 1, 5, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.025F, 1.5587F, -4.2332F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2793F, -0.3054F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 47, -0.6F, -1.5F, 0.1F, 1, 1, 2, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.975F, 0.0F, -0.75F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0175F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 36, 10, -0.175F, -0.5F, -3.025F, 0, 1, 4, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.975F, 0.0F, -0.75F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.3054F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 55, 0, -1.0F, 0.0F, -3.4F, 2, 1, 5, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.975F, 0.0F, -0.75F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0466F, 0.302F, -0.1554F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 59, 10, 0.9F, -2.5F, -2.45F, 0, 3, 4, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.025F, 1.5587F, -4.2332F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.2793F, 0.3054F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 17, 47, -0.4F, -1.5F, 0.1F, 1, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 0.75F, -4.5F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2793F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 35, 20, -1.0F, -0.775F, 0.4F, 1, 1, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 0.75F, -4.5F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.5672F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 28, 0, -1.0F, -0.925F, -0.55F, 1, 1, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.25F, -0.4F);
        this.Body2.addChild(tail1);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 2.2761F, 3.3191F);
        this.tail1.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.3054F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 1, 29, -1.0F, -6.175F, -3.975F, 2, 5, 6, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 27, 0, -2.0F, -3.175F, -3.975F, 4, 2, 6, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 16, -2.5F, -1.425F, -3.775F, 5, 6, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.125F, 5.55F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.25F, 1.2611F, -1.4525F);
        this.tail2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.1745F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 17, 22, -0.25F, -6.6F, 1.05F, 1, 5, 7, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 12, 35, -1.25F, -3.6F, 1.05F, 3, 2, 7, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 20, 9, -1.75F, -1.85F, 1.05F, 4, 4, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.25F, 1.1893F, 6.7498F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 1.615F, -0.0666F);
        this.tail3.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0873F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 50, 14, -0.25F, -5.6F, -0.25F, 1, 4, 6, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 50, 25, -0.75F, -3.6F, -0.25F, 2, 2, 6, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 27, 42, -1.25F, -1.85F, -0.25F, 3, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.8498F, 5.7359F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.5114F, -0.0959F);
        this.tail4.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0873F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 41, -0.25F, -3.6F, -0.25F, 0, 3, 8, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 17, 45, -0.75F, -2.6F, -0.25F, 1, 2, 7, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 42, 35, -1.25F, -0.85F, -0.25F, 2, 2, 7, 0.0F, false));


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
        this.body.offsetY = -1.0F;
        this.body.offsetX = 0.1F;
        this.body.rotateAngleY = (float)Math.toRadians(225);
        this.body.rotateAngleX = (float)Math.toRadians(14);
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

        EntityPrehistoricFloraAquilops EntityAquilops = (EntityPrehistoricFloraAquilops) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.armleft1, this.armleft2, this.handlegft};
        AdvancedModelRenderer[] ArmR = {this.armright1, this.armright2, this.handlegft2};

        EntityAquilops.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityAquilops.getAnimation() == EntityAquilops.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityAquilops.isReallyInWater()) {

                if (f3 == 0.0F || !EntityAquilops.getIsMoving()) {
                    if (EntityAquilops.getAnimation() != EntityAquilops.EAT_ANIMATION
                        && EntityAquilops.getAnimation() != EntityAquilops.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.armleft1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.armright1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.armleft1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.armright1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityAquilops.getIsFast()) { //Running


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
        EntityPrehistoricFloraAquilops ee = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The noise anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 115;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = 8.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*5 + (((tickAnim - 15) / 28) * (12-(8.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*5)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 12 + (((tickAnim - 43) / 17) * (-8.75-(12)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -8.75 + (((tickAnim - 60) / 8) * (1.85-(-8.75)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = 1.85 + (((tickAnim - 68) / 8) * (-8.75-(1.85)));
            yy = 0 + (((tickAnim - 68) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 8) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = -8.75 + (((tickAnim - 76) / 8) * (1.85-(-8.75)));
            yy = 0 + (((tickAnim - 76) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 8) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 92) {
            xx = 1.85 + (((tickAnim - 84) / 8) * (-8.75-(1.85)));
            yy = 0 + (((tickAnim - 84) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 8) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 100) {
            xx = -8.75 + (((tickAnim - 92) / 8) * (1.85-(-8.75)));
            yy = 0 + (((tickAnim - 92) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 8) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = 1.85 + (((tickAnim - 100) / 5) * (-8.75-(1.85)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -8.75 + (((tickAnim - 105) / 11) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = 5.75 + (((tickAnim - 15) / 28) * (9.25-(5.75)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 9.25 + (((tickAnim - 43) / 17) * (9.5-(9.25)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 9.5 + (((tickAnim - 60) / 8) * (-2-(9.5)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -2 + (((tickAnim - 68) / 8) * (9.5-(-2)));
            yy = 0 + (((tickAnim - 68) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 8) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = 9.5 + (((tickAnim - 76) / 8) * (-2-(9.5)));
            yy = 0 + (((tickAnim - 76) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 8) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 92) {
            xx = -2 + (((tickAnim - 84) / 8) * (9.5-(-2)));
            yy = 0 + (((tickAnim - 84) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 8) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 100) {
            xx = 9.5 + (((tickAnim - 92) / 8) * (-2-(9.5)));
            yy = 0 + (((tickAnim - 92) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 8) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = -2 + (((tickAnim - 100) / 5) * (9.5-(-2)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 9.5 + (((tickAnim - 105) / 11) * (0-(9.5)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = 7 + (((tickAnim - 15) / 28) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 7 + (((tickAnim - 43) / 17) * (0-(7)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = -9.25 + (((tickAnim - 15) / 28) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -9.25 + (((tickAnim - 43) / 5) * (-64.57-(-9.25)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -64.57 + (((tickAnim - 48) / 12) * (0-(-64.57)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leglef4, leglef4.rotateAngleX + (float) Math.toRadians(xx), leglef4.rotateAngleY + (float) Math.toRadians(yy), leglef4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = 17.75 + (((tickAnim - 15) / 28) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 17.75 + (((tickAnim - 43) / 5) * (86.7-(17.75)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 86.7 + (((tickAnim - 48) / 12) * (0-(86.7)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = -13.75 + (((tickAnim - 15) / 28) * (-18.25-(-13.75)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -18.25 + (((tickAnim - 43) / 17) * (10-(-18.25)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 10 + (((tickAnim - 60) / 8) * (-2-(10)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -2 + (((tickAnim - 68) / 8) * (10-(-2)));
            yy = 0 + (((tickAnim - 68) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 8) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = 10 + (((tickAnim - 76) / 8) * (-2-(10)));
            yy = 0 + (((tickAnim - 76) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 8) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 92) {
            xx = -2 + (((tickAnim - 84) / 8) * (10-(-2)));
            yy = 0 + (((tickAnim - 84) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 8) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 100) {
            xx = 10 + (((tickAnim - 92) / 8) * (-2-(10)));
            yy = 0 + (((tickAnim - 92) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 8) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = -2 + (((tickAnim - 100) / 5) * (10-(-2)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 10 + (((tickAnim - 105) / 11) * (0-(10)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 0.5 + (((tickAnim - 15) / 45) * (0-(0.5)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = -5 + (((tickAnim - 15) / 28) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 43) / 17) * (0-(-5)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leglef2, leglef2.rotateAngleX + (float) Math.toRadians(xx), leglef2.rotateAngleY + (float) Math.toRadians(yy), leglef2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = 10.75 + (((tickAnim - 15) / 28) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 10.75 + (((tickAnim - 43) / 17) * (0-(10.75)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.01067-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.5893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.3273-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5.01067 + (((tickAnim - 15) / 15) * (5.45892-(5.01067)));
            yy = -7.5893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10 + (((tickAnim - 15) / 15) * (-7.17378-(-7.5893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10)));
            zz = 0.3273 + (((tickAnim - 15) / 15) * (-3.92037-(0.3273)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 5.45892 + (((tickAnim - 30) / 13) * (5.80284-(5.45892)));
            yy = -7.17378 + (((tickAnim - 30) / 13) * (1.3737+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*5-(-7.17378)));
            zz = -3.92037 + (((tickAnim - 30) / 13) * (0.83729-(-3.92037)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 5.80284 + (((tickAnim - 43) / 17) * (-7.65583-(5.80284)));
            yy = 1.3737+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*5 + (((tickAnim - 43) / 17) * (-0.85418-(1.3737+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*5)));
            zz = 0.83729 + (((tickAnim - 43) / 17) * (6.53681-(0.83729)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -7.65583 + (((tickAnim - 60) / 8) * (5.34417-(-7.65583)));
            yy = -0.85418 + (((tickAnim - 60) / 8) * (-0.85418-(-0.85418)));
            zz = 6.53681 + (((tickAnim - 60) / 8) * (6.53681-(6.53681)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 5.34417 + (((tickAnim - 68) / 7) * (-6.18219-(5.34417)));
            yy = -0.85418 + (((tickAnim - 68) / 7) * (9.66863-(-0.85418)));
            zz = 6.53681 + (((tickAnim - 68) / 7) * (-4.8812-(6.53681)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = -6.18219 + (((tickAnim - 75) / 8) * (10.79809-(-6.18219)));
            yy = 9.66863 + (((tickAnim - 75) / 8) * (5.0649-(9.66863)));
            zz = -4.8812 + (((tickAnim - 75) / 8) * (0.11418-(-4.8812)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 10.79809 + (((tickAnim - 83) / 7) * (-7.65583-(10.79809)));
            yy = 5.0649 + (((tickAnim - 83) / 7) * (-0.85418-(5.0649)));
            zz = 0.11418 + (((tickAnim - 83) / 7) * (6.53681-(0.11418)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = -7.65583 + (((tickAnim - 90) / 8) * (5.34417-(-7.65583)));
            yy = -0.85418 + (((tickAnim - 90) / 8) * (-0.85418-(-0.85418)));
            zz = 6.53681 + (((tickAnim - 90) / 8) * (6.53681-(6.53681)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = 5.34417 + (((tickAnim - 98) / 7) * (-6.18219-(5.34417)));
            yy = -0.85418 + (((tickAnim - 98) / 7) * (9.66863-(-0.85418)));
            zz = 6.53681 + (((tickAnim - 98) / 7) * (-4.8812-(6.53681)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -6.18219 + (((tickAnim - 105) / 11) * (0-(-6.18219)));
            yy = 9.66863 + (((tickAnim - 105) / 11) * (0-(9.66863)));
            zz = -4.8812 + (((tickAnim - 105) / 11) * (0-(-4.8812)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.56077-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (16.93431-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.76303-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 11.56077 + (((tickAnim - 15) / 15) * (9.26757-(11.56077)));
            yy = 16.93431 + (((tickAnim - 15) / 15) * (19.32143-(16.93431)));
            zz = -7.76303 + (((tickAnim - 15) / 15) * (-12.46655-(-7.76303)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 9.26757 + (((tickAnim - 30) / 13) * (14.90081-(9.26757)));
            yy = 19.32143 + (((tickAnim - 30) / 13) * (12.43792-(19.32143)));
            zz = -12.46655 + (((tickAnim - 30) / 13) * (-0.08111-(-12.46655)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 14.90081 + (((tickAnim - 43) / 17) * (4.67525-(14.90081)));
            yy = 12.43792 + (((tickAnim - 43) / 17) * (-8.26524-(12.43792)));
            zz = -0.08111 + (((tickAnim - 43) / 17) * (0.41072-(-0.08111)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 4.67525 + (((tickAnim - 60) / 7) * (1.67026-(4.67525)));
            yy = -8.26524 + (((tickAnim - 60) / 7) * (1.29811-(-8.26524)));
            zz = 0.41072 + (((tickAnim - 60) / 7) * (-22.09882-(0.41072)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = 1.67026 + (((tickAnim - 67) / 8) * (4.67525-(1.67026)));
            yy = 1.29811 + (((tickAnim - 67) / 8) * (-8.26524-(1.29811)));
            zz = -22.09882 + (((tickAnim - 67) / 8) * (0.41072-(-22.09882)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 4.67525 + (((tickAnim - 75) / 7) * (1.67026-(4.67525)));
            yy = -8.26524 + (((tickAnim - 75) / 7) * (1.29811-(-8.26524)));
            zz = 0.41072 + (((tickAnim - 75) / 7) * (-22.09882-(0.41072)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 1.67026 + (((tickAnim - 82) / 8) * (4.67525-(1.67026)));
            yy = 1.29811 + (((tickAnim - 82) / 8) * (-8.26524-(1.29811)));
            zz = -22.09882 + (((tickAnim - 82) / 8) * (0.41072-(-22.09882)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = 4.67525 + (((tickAnim - 90) / 7) * (1.67026-(4.67525)));
            yy = -8.26524 + (((tickAnim - 90) / 7) * (1.29811-(-8.26524)));
            zz = 0.41072 + (((tickAnim - 90) / 7) * (-22.09882-(0.41072)));
        }
        else if (tickAnim >= 97 && tickAnim < 105) {
            xx = 1.67026 + (((tickAnim - 97) / 8) * (4.80263-(1.67026)));
            yy = 1.29811 + (((tickAnim - 97) / 8) * (-10.02653-(1.29811)));
            zz = -22.09882 + (((tickAnim - 97) / 8) * (4.28083-(-22.09882)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 4.80263 + (((tickAnim - 105) / 11) * (0-(4.80263)));
            yy = -10.02653 + (((tickAnim - 105) / 11) * (0-(-10.02653)));
            zz = 4.28083 + (((tickAnim - 105) / 11) * (0-(4.28083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (43.72976-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (7.96205-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (22.67069-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 43.72976 + (((tickAnim - 60) / 45) * (43.72976-(43.72976)));
            yy = 7.96205 + (((tickAnim - 60) / 45) * (7.96205-(7.96205)));
            zz = 22.67069 + (((tickAnim - 60) / 45) * (22.67069-(22.67069)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 43.72976 + (((tickAnim - 105) / 11) * (0-(43.72976)));
            yy = 7.96205 + (((tickAnim - 105) / 11) * (0-(7.96205)));
            zz = 22.67069 + (((tickAnim - 105) / 11) * (0-(22.67069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.56077-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-16.9343-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (7.763-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 11.56077 + (((tickAnim - 15) / 15) * (12.74917-(11.56077)));
            yy = -16.9343 + (((tickAnim - 15) / 15) * (-19.80231-(-16.9343)));
            zz = 7.763 + (((tickAnim - 15) / 15) * (13.48509-(7.763)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 12.74917 + (((tickAnim - 30) / 13) * (5.36484-(12.74917)));
            yy = -19.80231 + (((tickAnim - 30) / 13) * (-25.85342-(-19.80231)));
            zz = 13.48509 + (((tickAnim - 30) / 13) * (26.68008-(13.48509)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 5.36484 + (((tickAnim - 43) / 17) * (-2.52833-(5.36484)));
            yy = -25.85342 + (((tickAnim - 43) / 17) * (23.0344-(-25.85342)));
            zz = 26.68008 + (((tickAnim - 43) / 17) * (-10.45791-(26.68008)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -2.52833 + (((tickAnim - 60) / 7) * (0.90749-(-2.52833)));
            yy = 23.0344 + (((tickAnim - 60) / 7) * (14.21165-(23.0344)));
            zz = -10.45791 + (((tickAnim - 60) / 7) * (15.04898-(-10.45791)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = 0.90749 + (((tickAnim - 67) / 8) * (-2.52833-(0.90749)));
            yy = 14.21165 + (((tickAnim - 67) / 8) * (23.0344-(14.21165)));
            zz = 15.04898 + (((tickAnim - 67) / 8) * (-10.45791-(15.04898)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = -2.52833 + (((tickAnim - 75) / 7) * (0.90749-(-2.52833)));
            yy = 23.0344 + (((tickAnim - 75) / 7) * (14.21165-(23.0344)));
            zz = -10.45791 + (((tickAnim - 75) / 7) * (15.04898-(-10.45791)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 0.90749 + (((tickAnim - 82) / 8) * (-2.52833-(0.90749)));
            yy = 14.21165 + (((tickAnim - 82) / 8) * (23.0344-(14.21165)));
            zz = 15.04898 + (((tickAnim - 82) / 8) * (-10.45791-(15.04898)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = -2.52833 + (((tickAnim - 90) / 7) * (0.90749-(-2.52833)));
            yy = 23.0344 + (((tickAnim - 90) / 7) * (14.21165-(23.0344)));
            zz = -10.45791 + (((tickAnim - 90) / 7) * (15.04898-(-10.45791)));
        }
        else if (tickAnim >= 97 && tickAnim < 105) {
            xx = 0.90749 + (((tickAnim - 97) / 8) * (-0.73416-(0.90749)));
            yy = 14.21165 + (((tickAnim - 97) / 8) * (19.84143-(14.21165)));
            zz = 15.04898 + (((tickAnim - 97) / 8) * (-0.5532-(15.04898)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -0.73416 + (((tickAnim - 105) / 11) * (0-(-0.73416)));
            yy = 19.84143 + (((tickAnim - 105) / 11) * (0-(19.84143)));
            zz = -0.5532 + (((tickAnim - 105) / 11) * (0-(-0.5532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (39.65736-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-12.82234-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-28.36374-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 39.65736 + (((tickAnim - 60) / 45) * (39.65736-(39.65736)));
            yy = -12.82234 + (((tickAnim - 60) / 45) * (-12.82234-(-12.82234)));
            zz = -28.36374 + (((tickAnim - 60) / 45) * (-28.36374-(-28.36374)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 39.65736 + (((tickAnim - 105) / 11) * (0-(39.65736)));
            yy = -12.82234 + (((tickAnim - 105) / 11) * (0-(-12.82234)));
            zz = -28.36374 + (((tickAnim - 105) / 11) * (0-(-28.36374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17.36319-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.2799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.01014-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 17.36319 + (((tickAnim - 15) / 8) * (18.56589-(17.36319)));
            yy = -7.2799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10 + (((tickAnim - 15) / 8) * (0.7886+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15-(-7.2799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10)));
            zz = 2.01014 + (((tickAnim - 15) / 8) * (-2.99442-(2.01014)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 18.56589 + (((tickAnim - 23) / 12) * (18.33312-(18.56589)));
            yy = 0.7886+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15 + (((tickAnim - 23) / 12) * (24.9842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25-(0.7886+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15)));
            zz = -2.99442 + (((tickAnim - 23) / 12) * (6.48327-(-2.99442)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 18.33312 + (((tickAnim - 35) / 8) * (17.38991-(18.33312)));
            yy = 24.9842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25 + (((tickAnim - 35) / 8) * (-7.16084-(24.9842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25)));
            zz = 6.48327 + (((tickAnim - 35) / 8) * (-2.23572-(6.48327)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 17.38991 + (((tickAnim - 43) / 9) * (8.37175-(17.38991)));
            yy = -7.16084 + (((tickAnim - 43) / 9) * (-12.43833-(-7.16084)));
            zz = -2.23572 + (((tickAnim - 43) / 9) * (-3.3239-(-2.23572)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 8.37175 + (((tickAnim - 52) / 8) * (-0.90481-(8.37175)));
            yy = -12.43833 + (((tickAnim - 52) / 8) * (-19.4094-(-12.43833)));
            zz = -3.3239 + (((tickAnim - 52) / 8) * (-2.04224-(-3.3239)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -0.90481 + (((tickAnim - 60) / 8) * (34.89532-(-0.90481)));
            yy = -19.4094 + (((tickAnim - 60) / 8) * (-3.16129-(-19.4094)));
            zz = -2.04224 + (((tickAnim - 60) / 8) * (-2.2958-(-2.04224)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 34.89532 + (((tickAnim - 68) / 7) * (10.14532-(34.89532)));
            yy = -3.16129 + (((tickAnim - 68) / 7) * (-3.16129-(-3.16129)));
            zz = -2.2958 + (((tickAnim - 68) / 7) * (-2.2958-(-2.2958)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 10.14532 + (((tickAnim - 75) / 8) * (27.08587-(10.14532)));
            yy = -3.16129 + (((tickAnim - 75) / 8) * (-12.30085-(-3.16129)));
            zz = -2.2958 + (((tickAnim - 75) / 8) * (-2.15317-(-2.2958)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 27.08587 + (((tickAnim - 83) / 7) * (-0.90481-(27.08587)));
            yy = -12.30085 + (((tickAnim - 83) / 7) * (-19.4094-(-12.30085)));
            zz = -2.15317 + (((tickAnim - 83) / 7) * (-2.04224-(-2.15317)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = -0.90481 + (((tickAnim - 90) / 8) * (34.89532-(-0.90481)));
            yy = -19.4094 + (((tickAnim - 90) / 8) * (-3.16129-(-19.4094)));
            zz = -2.04224 + (((tickAnim - 90) / 8) * (-2.2958-(-2.04224)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = 34.89532 + (((tickAnim - 98) / 7) * (10.14532-(34.89532)));
            yy = -3.16129 + (((tickAnim - 98) / 7) * (-3.16129-(-3.16129)));
            zz = -2.2958 + (((tickAnim - 98) / 7) * (-2.2958-(-2.2958)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 10.14532 + (((tickAnim - 105) / 11) * (0-(10.14532)));
            yy = -3.16129 + (((tickAnim - 105) / 11) * (0-(-3.16129)));
            zz = -2.2958 + (((tickAnim - 105) / 11) * (0-(-2.2958)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-39.27307-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.4445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (11.12902-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = -39.27307 + (((tickAnim - 15) / 16) * (-42.00313-(-39.27307)));
            yy = -5.4445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15 + (((tickAnim - 15) / 16) * (15.6348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-15-(-5.4445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15)));
            zz = 11.12902 + (((tickAnim - 15) / 16) * (-17.46816-(11.12902)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -42.00313 + (((tickAnim - 31) / 4) * (-41.51708-(-42.00313)));
            yy = 15.6348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-15 + (((tickAnim - 31) / 4) * (24.9842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25-(15.6348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-15)));
            zz = -17.46816 + (((tickAnim - 31) / 4) * (-8.57819-(-17.46816)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -41.51708 + (((tickAnim - 35) / 8) * (-39.92038-(-41.51708)));
            yy = 24.9842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25 + (((tickAnim - 35) / 8) * (-11.6206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15-(24.9842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25)));
            zz = -8.57819 + (((tickAnim - 35) / 8) * (12.85954-(-8.57819)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = -39.92038 + (((tickAnim - 43) / 9) * (-31.30135-(-39.92038)));
            yy = -11.6206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15 + (((tickAnim - 43) / 9) * (-14.8803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*35-(-11.6206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15)));
            zz = 12.85954 + (((tickAnim - 43) / 9) * (15.87698-(12.85954)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -31.30135 + (((tickAnim - 52) / 8) * (-20.86413-(-31.30135)));
            yy = -14.8803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*35 + (((tickAnim - 52) / 8) * (25.60713-(-14.8803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*35)));
            zz = 15.87698 + (((tickAnim - 52) / 8) * (3.84347-(15.87698)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -20.86413 + (((tickAnim - 60) / 8) * (-36.7693-(-20.86413)));
            yy = 25.60713 + (((tickAnim - 60) / 8) * (12.32832-(25.60713)));
            zz = 3.84347 + (((tickAnim - 60) / 8) * (6.42486-(3.84347)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = -36.7693 + (((tickAnim - 68) / 7) * (-38.14996-(-36.7693)));
            yy = 12.32832 + (((tickAnim - 68) / 7) * (-8.38387-(12.32832)));
            zz = 6.42486 + (((tickAnim - 68) / 7) * (7.69081-(6.42486)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = -38.14996 + (((tickAnim - 75) / 8) * (-34.84927-(-38.14996)));
            yy = -8.38387 + (((tickAnim - 75) / 8) * (8.14704-(-8.38387)));
            zz = 7.69081 + (((tickAnim - 75) / 8) * (5.68493-(7.69081)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -34.84927 + (((tickAnim - 83) / 7) * (-20.86413-(-34.84927)));
            yy = 8.14704 + (((tickAnim - 83) / 7) * (25.60713-(8.14704)));
            zz = 5.68493 + (((tickAnim - 83) / 7) * (3.84347-(5.68493)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = -20.86413 + (((tickAnim - 90) / 8) * (-36.7693-(-20.86413)));
            yy = 25.60713 + (((tickAnim - 90) / 8) * (12.32832-(25.60713)));
            zz = 3.84347 + (((tickAnim - 90) / 8) * (6.42486-(3.84347)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = -36.7693 + (((tickAnim - 98) / 7) * (-38.14996-(-36.7693)));
            yy = 12.32832 + (((tickAnim - 98) / 7) * (-8.38387-(12.32832)));
            zz = 6.42486 + (((tickAnim - 98) / 7) * (7.69081-(6.42486)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -38.14996 + (((tickAnim - 105) / 11) * (0-(-38.14996)));
            yy = -8.38387 + (((tickAnim - 105) / 11) * (0-(-8.38387)));
            zz = 7.69081 + (((tickAnim - 105) / 11) * (0-(7.69081)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.675-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 15) / 45) * (0.85-(0)));
            yy = -0.425 + (((tickAnim - 15) / 45) * (-0.43-(-0.425)));
            zz = 0.675 + (((tickAnim - 15) / 45) * (0.68-(0.675)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0.85 + (((tickAnim - 60) / 15) * (0-(0.85)));
            yy = -0.43 + (((tickAnim - 60) / 15) * (-0.325-(-0.43)));
            zz = 0.68 + (((tickAnim - 60) / 15) * (0.875-(0.68)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 75) / 8) * (0.43-(0)));
            yy = -0.325 + (((tickAnim - 75) / 8) * (-0.83-(-0.325)));
            zz = 0.875 + (((tickAnim - 75) / 8) * (0.78-(0.875)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 0.43 + (((tickAnim - 83) / 7) * (0.85-(0.43)));
            yy = -0.83 + (((tickAnim - 83) / 7) * (-0.43-(-0.83)));
            zz = 0.78 + (((tickAnim - 83) / 7) * (0.68-(0.78)));
        }
        else if (tickAnim >= 90 && tickAnim < 105) {
            xx = 0.85 + (((tickAnim - 90) / 15) * (0-(0.85)));
            yy = -0.43 + (((tickAnim - 90) / 15) * (-0.325-(-0.43)));
            zz = 0.68 + (((tickAnim - 90) / 15) * (0.875-(0.68)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = -0.325 + (((tickAnim - 105) / 11) * (0-(-0.325)));
            zz = 0.875 + (((tickAnim - 105) / 11) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (28.49434-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-4.6676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*-20-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (6.74397-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 28.49434 + (((tickAnim - 30) / 30) * (-4.34463-(28.49434)));
            yy = -4.6676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*-20 + (((tickAnim - 30) / 30) * (-14.12283-(-4.6676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*-20)));
            zz = 6.74397 + (((tickAnim - 30) / 30) * (-0.53153-(6.74397)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -4.34463 + (((tickAnim - 60) / 15) * (-4.40691-(-4.34463)));
            yy = -14.12283 + (((tickAnim - 60) / 15) * (17.04051-(-14.12283)));
            zz = -0.53153 + (((tickAnim - 60) / 15) * (-2.88731-(-0.53153)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -4.40691 + (((tickAnim - 75) / 15) * (-4.34463-(-4.40691)));
            yy = 17.04051 + (((tickAnim - 75) / 15) * (-14.12283-(17.04051)));
            zz = -2.88731 + (((tickAnim - 75) / 15) * (-0.53153-(-2.88731)));
        }
        else if (tickAnim >= 90 && tickAnim < 105) {
            xx = -4.34463 + (((tickAnim - 90) / 15) * (-4.40691-(-4.34463)));
            yy = -14.12283 + (((tickAnim - 90) / 15) * (17.04051-(-14.12283)));
            zz = -0.53153 + (((tickAnim - 90) / 15) * (-2.88731-(-0.53153)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -4.40691 + (((tickAnim - 105) / 11) * (0-(-4.40691)));
            yy = 17.04051 + (((tickAnim - 105) / 11) * (0-(17.04051)));
            zz = -2.88731 + (((tickAnim - 105) / 11) * (0-(-2.88731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.625-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 15) / 101) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 101) * (0-(0)));
            zz = -0.625 + (((tickAnim - 15) / 101) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.77792-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.9971-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 8.77792 + (((tickAnim - 15) / 15) * (8.83448-(8.77792)));
            yy = -11.9971 + (((tickAnim - 15) / 15) * (20.4949-(-11.9971)));
            zz = -0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3 + (((tickAnim - 15) / 15) * (-0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3-(-0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 8.83448 + (((tickAnim - 30) / 13) * (8.75201-(8.83448)));
            yy = 20.4949 + (((tickAnim - 30) / 13) * (-3.24923-(20.4949)));
            zz = -0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3 + (((tickAnim - 30) / 13) * (-0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3-(-0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 8.75201 + (((tickAnim - 43) / 17) * (2.6244-(8.75201)));
            yy = -3.24923 + (((tickAnim - 43) / 17) * (-12.78142-(-3.24923)));
            zz = -0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3 + (((tickAnim - 43) / 17) * (-1.41034-(-0.2657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 2.6244 + (((tickAnim - 60) / 15) * (2.66609-(2.6244)));
            yy = -12.78142 + (((tickAnim - 60) / 15) * (10.38743-(-12.78142)));
            zz = -1.41034 + (((tickAnim - 60) / 15) * (-3.36504-(-1.41034)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 2.66609 + (((tickAnim - 75) / 15) * (2.6244-(2.66609)));
            yy = 10.38743 + (((tickAnim - 75) / 15) * (-12.78142-(10.38743)));
            zz = -3.36504 + (((tickAnim - 75) / 15) * (-1.41034-(-3.36504)));
        }
        else if (tickAnim >= 90 && tickAnim < 105) {
            xx = 2.6244 + (((tickAnim - 90) / 15) * (2.66609-(2.6244)));
            yy = -12.78142 + (((tickAnim - 90) / 15) * (10.38743-(-12.78142)));
            zz = -1.41034 + (((tickAnim - 90) / 15) * (-3.36504-(-1.41034)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 2.66609 + (((tickAnim - 105) / 11) * (0-(2.66609)));
            yy = 10.38743 + (((tickAnim - 105) / 11) * (0-(10.38743)));
            zz = -3.36504 + (((tickAnim - 105) / 11) * (0-(-3.36504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.275-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 15) / 101) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 101) * (0-(0)));
            zz = -0.275 + (((tickAnim - 15) / 101) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.52579-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-6.4841-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 6.52579 + (((tickAnim - 15) / 7) * (5.78923-(6.52579)));
            yy = -6.4841 + (((tickAnim - 15) / 7) * (-7.0664-(-6.4841)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5 + (((tickAnim - 15) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 5.78923 + (((tickAnim - 22) / 8) * (1.86075-(5.78923)));
            yy = -7.0664 + (((tickAnim - 22) / 8) * (22.58013-(-7.0664)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5 + (((tickAnim - 22) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 1.86075 + (((tickAnim - 30) / 13) * (5.22363-(1.86075)));
            yy = 22.58013 + (((tickAnim - 30) / 13) * (15.27715-(22.58013)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5 + (((tickAnim - 30) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 5.22363 + (((tickAnim - 43) / 17) * (-2.15355-(5.22363)));
            yy = 15.27715 + (((tickAnim - 43) / 17) * (-7.73706-(15.27715)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5 + (((tickAnim - 43) / 17) * (6.21849-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -2.15355 + (((tickAnim - 60) / 7) * (-2.75112-(-2.15355)));
            yy = -7.73706 + (((tickAnim - 60) / 7) * (-0.21749-(-7.73706)));
            zz = 6.21849 + (((tickAnim - 60) / 7) * (5.59246-(6.21849)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = -2.75112 + (((tickAnim - 67) / 8) * (-2.36796-(-2.75112)));
            yy = -0.21749 + (((tickAnim - 67) / 8) * (18.67476-(-0.21749)));
            zz = 5.59246 + (((tickAnim - 67) / 8) * (4.02857-(5.59246)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = -2.36796 + (((tickAnim - 75) / 8) * (-2.32028-(-2.36796)));
            yy = 18.67476 + (((tickAnim - 75) / 8) * (12.58079-(18.67476)));
            zz = 4.02857 + (((tickAnim - 75) / 8) * (4.52323-(4.02857)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -2.32028 + (((tickAnim - 83) / 7) * (-2.15355-(-2.32028)));
            yy = 12.58079 + (((tickAnim - 83) / 7) * (-7.73706-(12.58079)));
            zz = 4.52323 + (((tickAnim - 83) / 7) * (6.21849-(4.52323)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = -2.15355 + (((tickAnim - 90) / 3) * (-2.29217-(-2.15355)));
            yy = -7.73706 + (((tickAnim - 90) / 3) * (-16.17341-(-7.73706)));
            zz = 6.21849 + (((tickAnim - 90) / 3) * (6.93125-(6.21849)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -2.29217 + (((tickAnim - 93) / 5) * (-2.24419-(-2.29217)));
            yy = -16.17341 + (((tickAnim - 93) / 5) * (-3.02621-(-16.17341)));
            zz = 6.93125 + (((tickAnim - 93) / 5) * (5.82913-(6.93125)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = -2.24419 + (((tickAnim - 98) / 7) * (-2.36796-(-2.24419)));
            yy = -3.02621 + (((tickAnim - 98) / 7) * (18.67476-(-3.02621)));
            zz = 5.82913 + (((tickAnim - 98) / 7) * (4.02857-(5.82913)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = -2.36796 + (((tickAnim - 105) / 3) * (-1.83213-(-2.36796)));
            yy = 18.67476 + (((tickAnim - 105) / 3) * (19.03336-(18.67476)));
            zz = 4.02857 + (((tickAnim - 105) / 3) * (2.52781-(4.02857)));
        }
        else if (tickAnim >= 108 && tickAnim < 116) {
            xx = -1.83213 + (((tickAnim - 108) / 8) * (0-(-1.83213)));
            yy = 19.03336 + (((tickAnim - 108) / 8) * (0-(19.03336)));
            zz = 2.52781 + (((tickAnim - 108) / 8) * (0-(2.52781)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.35-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 15) / 101) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 101) * (0-(0)));
            zz = -0.35 + (((tickAnim - 15) / 101) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 5 + (((tickAnim - 15) / 7) * (-0.52998-(5)));
            yy = 0 + (((tickAnim - 15) / 7) * (-26.24014-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7 + (((tickAnim - 15) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.52998 + (((tickAnim - 22) / 8) * (1.58378-(-0.52998)));
            yy = -26.24014 + (((tickAnim - 22) / 8) * (27.13216-(-26.24014)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7 + (((tickAnim - 22) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 1.58378 + (((tickAnim - 30) / 13) * (4.32112-(1.58378)));
            yy = 27.13216 + (((tickAnim - 30) / 13) * (37.48258-(27.13216)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7 + (((tickAnim - 30) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 4.32112 + (((tickAnim - 43) / 17) * (-11.14042-(4.32112)));
            yy = 37.48258 + (((tickAnim - 43) / 17) * (-14.48671-(37.48258)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7 + (((tickAnim - 43) / 17) * (5.58712-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*-7)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -11.14042 + (((tickAnim - 60) / 7) * (-12.31226-(-11.14042)));
            yy = -14.48671 + (((tickAnim - 60) / 7) * (-15.56726-(-14.48671)));
            zz = 5.58712 + (((tickAnim - 60) / 7) * (6.60595-(5.58712)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = -12.31226 + (((tickAnim - 67) / 8) * (-11.17887-(-12.31226)));
            yy = -15.56726 + (((tickAnim - 67) / 8) * (20.50656-(-15.56726)));
            zz = 6.60595 + (((tickAnim - 67) / 8) * (4.88877-(6.60595)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = -11.17887 + (((tickAnim - 75) / 8) * (-11.10627-(-11.17887)));
            yy = 20.50656 + (((tickAnim - 75) / 8) * (9.16346-(20.50656)));
            zz = 4.88877 + (((tickAnim - 75) / 8) * (5.06695-(4.88877)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -11.10627 + (((tickAnim - 83) / 7) * (-11.14042-(-11.10627)));
            yy = 9.16346 + (((tickAnim - 83) / 7) * (-14.48671-(9.16346)));
            zz = 5.06695 + (((tickAnim - 83) / 7) * (5.58712-(5.06695)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = -11.14042 + (((tickAnim - 90) / 3) * (-11.22907-(-11.14042)));
            yy = -14.48671 + (((tickAnim - 90) / 3) * (-25.96029-(-14.48671)));
            zz = 5.58712 + (((tickAnim - 90) / 3) * (5.84358-(5.58712)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -11.22907 + (((tickAnim - 93) / 5) * (-11.18607-(-11.22907)));
            yy = -25.96029 + (((tickAnim - 93) / 5) * (-11.71545-(-25.96029)));
            zz = 5.84358 + (((tickAnim - 93) / 5) * (5.54238-(5.84358)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = -11.18607 + (((tickAnim - 98) / 7) * (-11.17887-(-11.18607)));
            yy = -11.71545 + (((tickAnim - 98) / 7) * (20.50656-(-11.71545)));
            zz = 5.54238 + (((tickAnim - 98) / 7) * (4.88877-(5.54238)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = -11.17887 + (((tickAnim - 105) / 3) * (-8.11405-(-11.17887)));
            yy = 20.50656 + (((tickAnim - 105) / 3) * (24.15936-(20.50656)));
            zz = 4.88877 + (((tickAnim - 105) / 3) * (3.76888-(4.88877)));
        }
        else if (tickAnim >= 108 && tickAnim < 116) {
            xx = -8.11405 + (((tickAnim - 108) / 8) * (0-(-8.11405)));
            yy = 24.15936 + (((tickAnim - 108) / 8) * (0-(24.15936)));
            zz = 3.76888 + (((tickAnim - 108) / 8) * (0-(3.76888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(0);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -7.25 + (((tickAnim - 4) / 4) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (15.75-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 15.75 + (((tickAnim - 12) / 3) * (0-(15.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -9 + (((tickAnim - 4) / 4) * (-1.25-(-9)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.25 + (((tickAnim - 8) / 4) * (2.25-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 12) / 3) * (0-(2.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11 + (((tickAnim - 4) / 4) * (-28.25-(11)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -28.25 + (((tickAnim - 8) / 4) * (-11.75-(-28.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -11.75 + (((tickAnim - 12) / 3) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.5 + (((tickAnim - 5) / 3) * (-31.75-(16.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -31.75 + (((tickAnim - 8) / 4) * (-4-(-31.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -4 + (((tickAnim - 12) / 3) * (0-(-4)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.25 + (((tickAnim - 5) / 3) * (2.25-(-3.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 8) / 4) * (0-(2.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
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
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 5) / 3) * (2-(-4.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2 + (((tickAnim - 8) / 4) * (0-(2)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
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
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (-27.25-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -27.25 + (((tickAnim - 8) / 4) * (-6-(-27.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 1 + (((tickAnim - 8) / 7) * (0-(1)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10.75 + (((tickAnim - 5) / 3) * (20.75-(-10.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 20.75 + (((tickAnim - 8) / 4) * (-7.75-(20.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -7.75 + (((tickAnim - 12) / 3) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 5) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (29.5-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 29.5 + (((tickAnim - 12) / 3) * (0-(29.5)));
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
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Body2.rotationPointX = this.Body2.rotationPointX + (float)(xx);
        this.Body2.rotationPointY = this.Body2.rotationPointY - (float)(yy);
        this.Body2.rotationPointZ = this.Body2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = -28.25 + (((tickAnim - 17) / 7) * (-7.57-(-28.25)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -7.57 + (((tickAnim - 24) / 6) * (-27.75-(-7.57)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.75 + (((tickAnim - 30) / 10) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -27.75 + (((tickAnim - 40) / 3) * (-3.8408-(-27.75)));
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
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




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
            xx = 3.15 + (((tickAnim - 24) / 6) * (12.25-(3.15)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.25 + (((tickAnim - 30) / 10) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 12.25 + (((tickAnim - 40) / 3) * (-74.43-(12.25)));
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
        this.setRotateAngle(leglef4, leglef4.rotateAngleX + (float) Math.toRadians(xx), leglef4.rotateAngleY + (float) Math.toRadians(yy), leglef4.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leglef4.rotationPointX = this.leglef4.rotationPointX + (float)(xx);
        this.leglef4.rotationPointY = this.leglef4.rotationPointY - (float)(yy);
        this.leglef4.rotationPointZ = this.leglef4.rotationPointZ + (float)(zz);




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
            xx = 29.18 + (((tickAnim - 24) / 6) * (-13-(29.18)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -13 + (((tickAnim - 30) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -13 + (((tickAnim - 40) / 3) * (91.44-(-13)));
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
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


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
            yy = 0.225 + (((tickAnim - 22) / 8) * (-0.3-(0.225)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 10) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 40) / 10) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footleft.rotationPointX = this.footleft.rotationPointX + (float)(xx);
        this.footleft.rotationPointY = this.footleft.rotationPointY - (float)(yy);
        this.footleft.rotationPointZ = this.footleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.25 + (((tickAnim - 30) / 10) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 40) / 10) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (27.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 27.75 + (((tickAnim - 30) / 10) * (27.75-(27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 27.75 + (((tickAnim - 40) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leglef2, leglef2.rotateAngleX + (float) Math.toRadians(xx), leglef2.rotateAngleY + (float) Math.toRadians(yy), leglef2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (6.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 30) / 10) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 40) / 10) * (0-(6.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 30) / 10) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 40) / 10) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footright.rotationPointX = this.footright.rotationPointX + (float)(xx);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(yy);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-14.816-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (-5.53413-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (13.07071-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -14.816 + (((tickAnim - 30) / 3) * (-20.60939-(-14.816)));
            yy = -5.53413 + (((tickAnim - 30) / 3) * (-4.97969-(-5.53413)));
            zz = 13.07071 + (((tickAnim - 30) / 3) * (10.37938-(13.07071)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -20.60939 + (((tickAnim - 33) / 2) * (-21.76135-(-20.60939)));
            yy = -4.97969 + (((tickAnim - 33) / 2) * (1.39283-(-4.97969)));
            zz = 10.37938 + (((tickAnim - 33) / 2) * (15.03848-(10.37938)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -21.76135 + (((tickAnim - 35) / 3) * (-20.60939-(-21.76135)));
            yy = 1.39283 + (((tickAnim - 35) / 3) * (-4.97969-(1.39283)));
            zz = 15.03848 + (((tickAnim - 35) / 3) * (10.37938-(15.03848)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -20.60939 + (((tickAnim - 38) / 2) * (-19.48676-(-20.60939)));
            yy = -4.97969 + (((tickAnim - 38) / 2) * (0.89436-(-4.97969)));
            zz = 10.37938 + (((tickAnim - 38) / 2) * (18.36383-(10.37938)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.48676 + (((tickAnim - 40) / 10) * (0-(-19.48676)));
            yy = 0.89436 + (((tickAnim - 40) / 10) * (0-(0.89436)));
            zz = 18.36383 + (((tickAnim - 40) / 10) * (0-(18.36383)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (52.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 52.75 + (((tickAnim - 30) / 3) * (28.06276-(52.75)));
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
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.225 + (((tickAnim - 30) / 20) * (0-(0.225)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(handlegft, handlegft.rotateAngleX + (float) Math.toRadians(xx), handlegft.rotateAngleY + (float) Math.toRadians(yy), handlegft.rotateAngleZ + (float) Math.toRadians(zz));




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




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-19.83971-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (-0.56748-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-8.79922-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -19.83971 + (((tickAnim - 33) / 2) * (-19.56461-(-19.83971)));
            yy = -0.56748 + (((tickAnim - 33) / 2) * (2.2205-(-0.56748)));
            zz = -8.79922 + (((tickAnim - 33) / 2) * (-13.39838-(-8.79922)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -19.56461 + (((tickAnim - 35) / 3) * (-20.54881-(-19.56461)));
            yy = 2.2205 + (((tickAnim - 35) / 3) * (-0.93565-(2.2205)));
            zz = -13.39838 + (((tickAnim - 35) / 3) * (-12.80936-(-13.39838)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -20.54881 + (((tickAnim - 38) / 2) * (-16.31461-(-20.54881)));
            yy = -0.93565 + (((tickAnim - 38) / 2) * (2.2205-(-0.93565)));
            zz = -12.80936 + (((tickAnim - 38) / 2) * (-13.39838-(-12.80936)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -16.31461 + (((tickAnim - 40) / 10) * (0-(-16.31461)));
            yy = 2.2205 + (((tickAnim - 40) / 10) * (0-(2.2205)));
            zz = -13.39838 + (((tickAnim - 40) / 10) * (0-(-13.39838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(handlegft2, handlegft2.rotateAngleX + (float) Math.toRadians(xx), handlegft2.rotateAngleY + (float) Math.toRadians(yy), handlegft2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -4.25 + (((tickAnim - 10) / 25) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 35) / 15) * (0-(-4.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0.00276-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.24935-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.07431-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0.00276 + (((tickAnim - 10) / 25) * (0.00276-(0.00276)));
            yy = -4.24935 + (((tickAnim - 10) / 25) * (-4.24935-(-4.24935)));
            zz = -0.07431 + (((tickAnim - 10) / 25) * (-0.07431-(-0.07431)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.00276 + (((tickAnim - 35) / 15) * (0-(0.00276)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (19.21609-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.49226-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.35309-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 19.21609 + (((tickAnim - 10) / 25) * (19.21609-(19.21609)));
            yy = -10.49226 + (((tickAnim - 10) / 25) * (-10.49226-(-10.49226)));
            zz = -2.35309 + (((tickAnim - 10) / 25) * (-2.35309-(-2.35309)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 19.21609 + (((tickAnim - 35) / 5) * (-19.25-(19.21609)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.575-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -0.075 + (((tickAnim - 10) / 25) * (-0.075-(-0.075)));
            zz = -0.575 + (((tickAnim - 10) / 25) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.075 + (((tickAnim - 35) / 15) * (0-(-0.075)));
            zz = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -4.125 + (((tickAnim - 10) / 25) * (-4.125-(-4.125)));
            zz = 0.45 + (((tickAnim - 10) / 25) * (0.45-(0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.125 + (((tickAnim - 35) / 15) * (0-(-4.125)));
            zz = 0.45 + (((tickAnim - 35) / 15) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body2.rotationPointX = this.Body2.rotationPointX + (float)(xx);
        this.Body2.rotationPointY = this.Body2.rotationPointY - (float)(yy);
        this.Body2.rotationPointZ = this.Body2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leglef4, leglef4.rotateAngleX + (float) Math.toRadians(xx), leglef4.rotateAngleY + (float) Math.toRadians(yy), leglef4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -1.125 + (((tickAnim - 10) / 25) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.125 + (((tickAnim - 35) / 15) * (0-(-1.125)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leglef4.rotationPointX = this.leglef4.rotationPointX + (float)(xx);
        this.leglef4.rotationPointY = this.leglef4.rotationPointY - (float)(yy);
        this.leglef4.rotationPointZ = this.leglef4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.95882-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.8949-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.729-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 5.95882 + (((tickAnim - 10) / 25) * (5.95882-(5.95882)));
            yy = 7.8949 + (((tickAnim - 10) / 25) * (7.8949-(7.8949)));
            zz = 2.729 + (((tickAnim - 10) / 25) * (2.729-(2.729)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.95882 + (((tickAnim - 35) / 15) * (0-(5.95882)));
            yy = 7.8949 + (((tickAnim - 35) / 15) * (0-(7.8949)));
            zz = 2.729 + (((tickAnim - 35) / 15) * (0-(2.729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leglef2, leglef2.rotateAngleX + (float) Math.toRadians(xx), leglef2.rotateAngleY + (float) Math.toRadians(yy), leglef2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -1.125 + (((tickAnim - 10) / 25) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.125 + (((tickAnim - 35) / 15) * (0-(-1.125)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leglef2.rotationPointX = this.leglef2.rotationPointX + (float)(xx);
        this.leglef2.rotationPointY = this.leglef2.rotationPointY - (float)(yy);
        this.leglef2.rotationPointZ = this.leglef2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




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




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 8.75 + (((tickAnim - 10) / 25) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 35) / 15) * (0-(8.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 135;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.49-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -1.49 + (((tickAnim - 8) / 14) * (1.25-(-1.49)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 1.25 + (((tickAnim - 22) / 11) * (-1.49-(1.25)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -1.49 + (((tickAnim - 33) / 8) * (1.25-(-1.49)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = 1.25 + (((tickAnim - 41) / 11) * (-1.49-(1.25)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -1.49 + (((tickAnim - 52) / 8) * (1.25-(-1.49)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 1.25 + (((tickAnim - 60) / 12) * (-1.25-(1.25)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 135) {
            xx = -1.25 + (((tickAnim - 72) / 63) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 72) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 63) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 2.25 + (((tickAnim - 8) / 14) * (-1.5-(2.25)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -1.5 + (((tickAnim - 22) / 11) * (2.25-(-1.5)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 2.25 + (((tickAnim - 33) / 8) * (-1.5-(2.25)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = -1.5 + (((tickAnim - 41) / 11) * (2.25-(-1.5)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 2.25 + (((tickAnim - 52) / 8) * (-0.75-(2.25)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = -0.75 + (((tickAnim - 60) / 12) * (2-(-0.75)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 135) {
            xx = 2 + (((tickAnim - 72) / 63) * (0-(2)));
            yy = 0 + (((tickAnim - 72) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 63) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 2.25 + (((tickAnim - 8) / 14) * (-1.5-(2.25)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -1.5 + (((tickAnim - 22) / 11) * (2.25-(-1.5)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 2.25 + (((tickAnim - 33) / 8) * (-1.5-(2.25)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = -1.5 + (((tickAnim - 41) / 11) * (2.25-(-1.5)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 2.25 + (((tickAnim - 52) / 8) * (-0.75-(2.25)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = -0.75 + (((tickAnim - 60) / 12) * (2-(-0.75)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 135) {
            xx = 2 + (((tickAnim - 72) / 63) * (0-(2)));
            yy = 0 + (((tickAnim - 72) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 63) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 5) / 7) * (9.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15-(4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 9.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15 + (((tickAnim - 12) / 10) * (5-(9.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 5 + (((tickAnim - 22) / 9) * (5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(5)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 31) / 7) * (8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15-(5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = 8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15 + (((tickAnim - 38) / 11) * (5-(8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15)));
            yy = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 11) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 49) / 11) * (0-(5)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (-7.3078-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (7.19173-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (-0.91978-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = -7.3078 + (((tickAnim - 72) / 9) * (-6.3078-(-7.3078)));
            yy = 7.19173 + (((tickAnim - 72) / 9) * (7.19173-(7.19173)));
            zz = -0.91978 + (((tickAnim - 72) / 9) * (-0.91978-(-0.91978)));
        }
        else if (tickAnim >= 81 && tickAnim < 95) {
            xx = -6.3078 + (((tickAnim - 81) / 14) * (-10.0578-(-6.3078)));
            yy = 7.19173 + (((tickAnim - 81) / 14) * (7.19173-(7.19173)));
            zz = -0.91978 + (((tickAnim - 81) / 14) * (-0.91978-(-0.91978)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -10.0578 + (((tickAnim - 95) / 10) * (-6.89401-(-10.0578)));
            yy = 7.19173 + (((tickAnim - 95) / 10) * (-4.39281-(7.19173)));
            zz = -0.91978 + (((tickAnim - 95) / 10) * (-0.40079-(-0.91978)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -6.89401 + (((tickAnim - 105) / 10) * (-8.39401-(-6.89401)));
            yy = -4.39281 + (((tickAnim - 105) / 10) * (-4.39281-(-4.39281)));
            zz = -0.40079 + (((tickAnim - 105) / 10) * (-0.40079-(-0.40079)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -8.39401 + (((tickAnim - 115) / 10) * (-8.39401-(-8.39401)));
            yy = -4.39281 + (((tickAnim - 115) / 10) * (-4.39281-(-4.39281)));
            zz = -0.40079 + (((tickAnim - 115) / 10) * (-0.40079-(-0.40079)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -8.39401 + (((tickAnim - 125) / 10) * (0-(-8.39401)));
            yy = -4.39281 + (((tickAnim - 125) / 10) * (0-(-4.39281)));
            zz = -0.40079 + (((tickAnim - 125) / 10) * (0-(-0.40079)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (14.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -1.8 + (((tickAnim - 5) / 7) * (0-(-1.8)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 14.5 + (((tickAnim - 5) / 7) * (10.75-(14.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 10.75 + (((tickAnim - 12) / 10) * (0-(10.75)));
        }
        else if (tickAnim >= 22 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 14) * (9.5-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            zz = 9.5 + (((tickAnim - 36) / 24) * (0-(9.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (21.5-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 72) / 9) * (7.75-(0)));
            yy = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            zz = 21.5 + (((tickAnim - 72) / 9) * (21.5-(21.5)));
        }
        else if (tickAnim >= 81 && tickAnim < 95) {
            xx = 7.75 + (((tickAnim - 81) / 14) * (18.5-(7.75)));
            yy = 0 + (((tickAnim - 81) / 14) * (0-(0)));
            zz = 21.5 + (((tickAnim - 81) / 14) * (21.5-(21.5)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 18.5 + (((tickAnim - 95) / 40) * (0-(18.5)));
            yy = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            zz = 21.5 + (((tickAnim - 95) / 40) * (0-(21.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (6.25-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 12) / 24) * (0-(0)));
            yy = 6.25 + (((tickAnim - 12) / 24) * (14.5-(6.25)));
            zz = 0 + (((tickAnim - 12) / 24) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 14.5 + (((tickAnim - 36) / 24) * (0-(14.5)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (18-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = 18 + (((tickAnim - 72) / 9) * (6.75-(18)));
            yy = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 9) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 135) {
            xx = 6.75 + (((tickAnim - 81) / 54) * (0-(6.75)));
            yy = 0 + (((tickAnim - 81) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (22.5-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 72) / 63) * (0-(0)));
            yy = 22.5 + (((tickAnim - 72) / 63) * (0-(22.5)));
            zz = 0 + (((tickAnim - 72) / 63) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handlegft, handlegft.rotateAngleX + (float) Math.toRadians(xx), handlegft.rotateAngleY + (float) Math.toRadians(yy), handlegft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-8-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -1.8 + (((tickAnim - 5) / 7) * (0-(-1.8)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = -8 + (((tickAnim - 5) / 7) * (-16.25-(-8)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = -16.25 + (((tickAnim - 12) / 10) * (0-(-16.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 14) * (-18.75-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            zz = -18.75 + (((tickAnim - 36) / 24) * (0-(-18.75)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (-21.75-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 72) / 9) * (5.75-(0)));
            yy = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            zz = -21.75 + (((tickAnim - 72) / 9) * (-21.75-(-21.75)));
        }
        else if (tickAnim >= 81 && tickAnim < 95) {
            xx = 5.75 + (((tickAnim - 81) / 14) * (13.5-(5.75)));
            yy = 0 + (((tickAnim - 81) / 14) * (0-(0)));
            zz = -21.75 + (((tickAnim - 81) / 14) * (-21.75-(-21.75)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 13.5 + (((tickAnim - 95) / 40) * (0-(13.5)));
            yy = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            zz = -21.75 + (((tickAnim - 95) / 40) * (0-(-21.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 12) / 24) * (0-(0)));
            yy = -4.25 + (((tickAnim - 12) / 24) * (-10-(-4.25)));
            zz = 0 + (((tickAnim - 12) / 24) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = -10 + (((tickAnim - 36) / 24) * (0-(-10)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (30-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = 30 + (((tickAnim - 72) / 9) * (25.25-(30)));
            yy = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 9) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 135) {
            xx = 25.25 + (((tickAnim - 81) / 54) * (0-(25.25)));
            yy = 0 + (((tickAnim - 81) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (-24.25-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 72) / 63) * (0-(0)));
            yy = -24.25 + (((tickAnim - 72) / 63) * (0-(-24.25)));
            zz = 0 + (((tickAnim - 72) / 63) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handlegft2, handlegft2.rotateAngleX + (float) Math.toRadians(xx), handlegft2.rotateAngleY + (float) Math.toRadians(yy), handlegft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -7.8 + (((tickAnim - 5) / 7) * (0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15-(-7.8)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15 + (((tickAnim - 12) / 10) * (-6.25-(0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = -6.25 + (((tickAnim - 22) / 9) * (-6-(-6.25)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -6 + (((tickAnim - 31) / 7) * (-2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15-(-6)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15 + (((tickAnim - 38) / 11) * (-6.25-(-2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15)));
            yy = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 11) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = -6.25 + (((tickAnim - 49) / 11) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (-5.8996-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (4.63103-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (1.02528-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = -5.8996 + (((tickAnim - 72) / 9) * (-1.8996-(-5.8996)));
            yy = 4.63103 + (((tickAnim - 72) / 9) * (4.63103-(4.63103)));
            zz = 1.02528 + (((tickAnim - 72) / 9) * (1.02528-(1.02528)));
        }
        else if (tickAnim >= 81 && tickAnim < 95) {
            xx = -1.8996 + (((tickAnim - 81) / 14) * (3.3504-(-1.8996)));
            yy = 4.63103 + (((tickAnim - 81) / 14) * (4.63103-(4.63103)));
            zz = 1.02528 + (((tickAnim - 81) / 14) * (1.02528-(1.02528)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 3.3504 + (((tickAnim - 95) / 10) * (20.65939-(3.3504)));
            yy = 4.63103 + (((tickAnim - 95) / 10) * (-14.95181-(4.63103)));
            zz = 1.02528 + (((tickAnim - 95) / 10) * (-5.09327-(1.02528)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 20.65939 + (((tickAnim - 105) / 10) * (14.1241-(20.65939)));
            yy = -14.95181 + (((tickAnim - 105) / 10) * (-20.77667-(-14.95181)));
            zz = -5.09327 + (((tickAnim - 105) / 10) * (-6.60613-(-5.09327)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 14.1241 + (((tickAnim - 115) / 10) * (14.56773-(14.1241)));
            yy = -20.77667 + (((tickAnim - 115) / 10) * (-24.89429-(-20.77667)));
            zz = -6.60613 + (((tickAnim - 115) / 10) * (-7.74848-(-6.60613)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 14.56773 + (((tickAnim - 125) / 10) * (0-(14.56773)));
            yy = -24.89429 + (((tickAnim - 125) / 10) * (0-(-24.89429)));
            zz = -7.74848 + (((tickAnim - 125) / 10) * (0-(-7.74848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.05-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -12.05 + (((tickAnim - 5) / 7) * (-15-(-12.05)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -15 + (((tickAnim - 12) / 10) * (2.25-(-15)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 2.25 + (((tickAnim - 22) / 9) * (-10.25-(2.25)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -10.25 + (((tickAnim - 31) / 7) * (-15-(-10.25)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -15 + (((tickAnim - 38) / 11) * (2.25-(-15)));
            yy = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 11) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 2.25 + (((tickAnim - 49) / 11) * (0-(2.25)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (9-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 9 + (((tickAnim - 72) / 3) * (4.75-(9)));
            yy = 0 + (((tickAnim - 72) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 3) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 4.75 + (((tickAnim - 75) / 3) * (6.41-(4.75)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 79) {
            xx = 6.41 + (((tickAnim - 78) / 1) * (3.75-(6.41)));
            yy = 0 + (((tickAnim - 78) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 1) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 81) {
            xx = 3.75 + (((tickAnim - 79) / 2) * (4.75-(3.75)));
            yy = 0 + (((tickAnim - 79) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 2) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 95) {
            xx = 4.75 + (((tickAnim - 81) / 14) * (0.5-(4.75)));
            yy = 0 + (((tickAnim - 81) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 14) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 0.5 + (((tickAnim - 95) / 10) * (-8.645-(0.5)));
            yy = 0 + (((tickAnim - 95) / 10) * (-16.59095-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (5.44664-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -8.645 + (((tickAnim - 105) / 10) * (0.355-(-8.645)));
            yy = -16.59095 + (((tickAnim - 105) / 10) * (-16.59095-(-16.59095)));
            zz = 5.44664 + (((tickAnim - 105) / 10) * (5.44664-(5.44664)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 0.355 + (((tickAnim - 115) / 10) * (0.355-(0.355)));
            yy = -16.59095 + (((tickAnim - 115) / 10) * (-16.59095-(-16.59095)));
            zz = 5.44664 + (((tickAnim - 115) / 10) * (5.44664-(5.44664)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 0.355 + (((tickAnim - 125) / 10) * (0-(0.355)));
            yy = -16.59095 + (((tickAnim - 125) / 10) * (0-(-16.59095)));
            zz = 5.44664 + (((tickAnim - 125) / 10) * (0-(5.44664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25.95-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 25.95 + (((tickAnim - 5) / 7) * (-2-(25.95)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -2 + (((tickAnim - 12) / 3) * (6.5-(-2)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.5 + (((tickAnim - 15) / 3) * (-2-(6.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2 + (((tickAnim - 18) / 2) * (6.5-(-2)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 6.5 + (((tickAnim - 20) / 2) * (-2-(6.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = -2 + (((tickAnim - 22) / 9) * (27.75-(-2)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 27.75 + (((tickAnim - 31) / 7) * (-2-(27.75)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -2 + (((tickAnim - 38) / 5) * (6.5-(-2)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 6.5 + (((tickAnim - 43) / 2) * (-2-(6.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -2 + (((tickAnim - 45) / 3) * (6.5-(-2)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 6.5 + (((tickAnim - 48) / 1) * (-2-(6.5)));
            yy = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = -2 + (((tickAnim - 49) / 11) * (0-(-2)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -2 + (((tickAnim - 8) / 14) * (7.25-(-2)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 22) / 11) * (2.5-(7.25)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 2.5 + (((tickAnim - 33) / 10) * (6.5-(2.5)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 6.5 + (((tickAnim - 43) / 9) * (5.25-(6.5)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 72) {
            xx = 5.25 + (((tickAnim - 52) / 20) * (-1.5-(5.25)));
            yy = 0 + (((tickAnim - 52) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 20) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 85) {
            xx = -1.5 + (((tickAnim - 72) / 13) * (-1.5005-(-1.5)));
            yy = 0 + (((tickAnim - 72) / 13) * (-1.24315-(0)));
            zz = 0 + (((tickAnim - 72) / 13) * (0.03256-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 115) {
            xx = -1.5005 + (((tickAnim - 85) / 30) * (1.24996-(-1.5005)));
            yy = -1.24315 + (((tickAnim - 85) / 30) * (-1.99297-(-1.24315)));
            zz = 0.03256 + (((tickAnim - 85) / 30) * (0.0162-(0.03256)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 1.24996 + (((tickAnim - 115) / 10) * (1.24996-(1.24996)));
            yy = -1.99297 + (((tickAnim - 115) / 10) * (-1.99297-(-1.99297)));
            zz = 0.0162 + (((tickAnim - 115) / 10) * (0.0162-(0.0162)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 1.24996 + (((tickAnim - 125) / 10) * (0-(1.24996)));
            yy = -1.99297 + (((tickAnim - 125) / 10) * (0-(-1.99297)));
            zz = 0.0162 + (((tickAnim - 125) / 10) * (0-(0.0162)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.75 + (((tickAnim - 8) / 14) * (-5.5-(1.75)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -5.5 + (((tickAnim - 22) / 11) * (-4.5-(-5.5)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -4.5 + (((tickAnim - 33) / 5) * (-1.99-(-4.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -1.99 + (((tickAnim - 38) / 5) * (-6.25-(-1.99)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = -6.25 + (((tickAnim - 43) / 9) * (-6.5-(-6.25)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 72) {
            xx = -6.5 + (((tickAnim - 52) / 20) * (-2.76616-(-6.5)));
            yy = 0 + (((tickAnim - 52) / 20) * (3.19808-(0)));
            zz = 0 + (((tickAnim - 52) / 20) * (-0.57892-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 85) {
            xx = -2.76616 + (((tickAnim - 72) / 13) * (-2.77235-(-2.76616)));
            yy = 3.19808 + (((tickAnim - 72) / 13) * (3.71087-(3.19808)));
            zz = -0.57892 + (((tickAnim - 72) / 13) * (-0.67201-(-0.57892)));
        }
        else if (tickAnim >= 85 && tickAnim < 115) {
            xx = -2.77235 + (((tickAnim - 85) / 30) * (0.24238-(-2.77235)));
            yy = 3.71087 + (((tickAnim - 85) / 30) * (0.73494-(3.71087)));
            zz = -0.67201 + (((tickAnim - 85) / 30) * (-0.29239-(-0.67201)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 0.24238 + (((tickAnim - 115) / 10) * (0.24238-(0.24238)));
            yy = 0.73494 + (((tickAnim - 115) / 10) * (0.73494-(0.73494)));
            zz = -0.29239 + (((tickAnim - 115) / 10) * (-0.29239-(-0.29239)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 0.24238 + (((tickAnim - 125) / 10) * (0-(0.24238)));
            yy = 0.73494 + (((tickAnim - 125) / 10) * (0-(0.73494)));
            zz = -0.29239 + (((tickAnim - 125) / 10) * (0-(-0.29239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -5 + (((tickAnim - 8) / 14) * (2.96383-(-5)));
            yy = 0 + (((tickAnim - 8) / 14) * (1.71248-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (-1.86297-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 2.96383 + (((tickAnim - 22) / 11) * (2-(2.96383)));
            yy = 1.71248 + (((tickAnim - 22) / 11) * (0-(1.71248)));
            zz = -1.86297 + (((tickAnim - 22) / 11) * (0-(-1.86297)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 2 + (((tickAnim - 33) / 8) * (-1.66144-(2)));
            yy = 0 + (((tickAnim - 33) / 8) * (-0.08671-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0.09433-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = -1.66144 + (((tickAnim - 41) / 11) * (4.25-(-1.66144)));
            yy = -0.08671 + (((tickAnim - 41) / 11) * (0-(-0.08671)));
            zz = 0.09433 + (((tickAnim - 41) / 11) * (0-(0.09433)));
        }
        else if (tickAnim >= 52 && tickAnim < 72) {
            xx = 4.25 + (((tickAnim - 52) / 20) * (-1.5-(4.25)));
            yy = 0 + (((tickAnim - 52) / 20) * (4.75-(0)));
            zz = 0 + (((tickAnim - 52) / 20) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 85) {
            xx = -1.5 + (((tickAnim - 72) / 13) * (-1.49485-(-1.5)));
            yy = 4.75 + (((tickAnim - 72) / 13) * (3.59385-(4.75)));
            zz = 0 + (((tickAnim - 72) / 13) * (0.0811-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 115) {
            xx = -1.49485 + (((tickAnim - 85) / 30) * (2.50515-(-1.49485)));
            yy = 3.59385 + (((tickAnim - 85) / 30) * (-3.90615-(3.59385)));
            zz = 0.0811 + (((tickAnim - 85) / 30) * (0.08042-(0.0811)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 2.50515 + (((tickAnim - 115) / 10) * (2.50515-(2.50515)));
            yy = -3.90615 + (((tickAnim - 115) / 10) * (-3.90615-(-3.90615)));
            zz = 0.08042 + (((tickAnim - 115) / 10) * (0.08042-(0.08042)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 2.50515 + (((tickAnim - 125) / 10) * (0-(2.50515)));
            yy = -3.90615 + (((tickAnim - 125) / 10) * (0-(-3.90615)));
            zz = 0.08042 + (((tickAnim - 125) / 10) * (0-(0.08042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -9.25 + (((tickAnim - 8) / 14) * (-3.75-(-9.25)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -3.75 + (((tickAnim - 22) / 11) * (5-(-3.75)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 5 + (((tickAnim - 33) / 8) * (-9.34-(5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = -9.34 + (((tickAnim - 41) / 11) * (-0.25-(-9.34)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 72) {
            xx = -0.25 + (((tickAnim - 52) / 20) * (-3.75-(-0.25)));
            yy = 0 + (((tickAnim - 52) / 20) * (17-(0)));
            zz = 0 + (((tickAnim - 52) / 20) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 85) {
            xx = -3.75 + (((tickAnim - 72) / 13) * (-3.97129-(-3.75)));
            yy = 17 + (((tickAnim - 72) / 13) * (7.41842-(17)));
            zz = 0 + (((tickAnim - 72) / 13) * (-1.05243-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 115) {
            xx = -3.97129 + (((tickAnim - 85) / 30) * (-0.76867-(-3.97129)));
            yy = 7.41842 + (((tickAnim - 85) / 30) * (-4.6733-(7.41842)));
            zz = -1.05243 + (((tickAnim - 85) / 30) * (-3.01949-(-1.05243)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -0.76867 + (((tickAnim - 115) / 10) * (-0.76867-(-0.76867)));
            yy = -4.6733 + (((tickAnim - 115) / 10) * (-4.6733-(-4.6733)));
            zz = -3.01949 + (((tickAnim - 115) / 10) * (-3.01949-(-3.01949)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -0.76867 + (((tickAnim - 125) / 10) * (0-(-0.76867)));
            yy = -4.6733 + (((tickAnim - 125) / 10) * (0-(-4.6733)));
            zz = -3.01949 + (((tickAnim - 125) / 10) * (0-(-3.01949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -6.25 + (((tickAnim - 70) / 5) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Eye1, Eye1.rotateAngleX + (float) Math.toRadians(xx), Eye1.rotateAngleY + (float) Math.toRadians(yy), Eye1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (1.4-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = 1.4 + (((tickAnim - 70) / 5) * (0-(1.4)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Eye1.rotationPointX = this.Eye1.rotationPointX + (float)(xx);
        this.Eye1.rotationPointY = this.Eye1.rotationPointY - (float)(yy);
        this.Eye1.rotationPointZ = this.Eye1.rotationPointZ + (float)(zz);


        if (tickAnim >= 65 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 65) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 65) / 5) * (0.035-(1)));
            zz = 1 + (((tickAnim - 65) / 5) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 70) / 5) * (1-(1)));
            yy = 0.035 + (((tickAnim - 70) / 5) * (1-(0.035)));
            zz = 1 + (((tickAnim - 70) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -6.25 + (((tickAnim - 70) / 5) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Eye2, Eye2.rotateAngleX + (float) Math.toRadians(xx), Eye2.rotateAngleY + (float) Math.toRadians(yy), Eye2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (1.4-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = 1.4 + (((tickAnim - 70) / 5) * (0-(1.4)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Eye2.rotationPointX = this.Eye2.rotationPointX + (float)(xx);
        this.Eye2.rotationPointY = this.Eye2.rotationPointY - (float)(yy);
        this.Eye2.rotationPointZ = this.Eye2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 0) / 65) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 65) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 65) * (1-(1)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 65) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 65) / 5) * (0.035-(1)));
            zz = 1 + (((tickAnim - 65) / 5) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 70) / 5) * (1-(1)));
            yy = 0.035 + (((tickAnim - 70) / 5) * (1-(0.035)));
            zz = 1 + (((tickAnim - 70) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye2.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = -1.75 + (((tickAnim - 5) / 27) * (-4.5-(-1.75)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*4 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*4)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -4.5 + (((tickAnim - 32) / 8) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*1 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.00043-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.09968-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.48996-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.00043 + (((tickAnim - 3) / 2) * (2.01915-(1.00043)));
            yy = -0.09968 + (((tickAnim - 3) / 2) * (0.63744-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 3) / 2) * (3.44153-(-0.48996)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.01915 + (((tickAnim - 5) / 3) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 5) / 3) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 5) / 3) * (-1.60048-(3.44153)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.37946 + (((tickAnim - 8) / 2) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 8) / 2) * (0.63744-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 8) / 2) * (3.44153-(-1.60048)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 2.01915 + (((tickAnim - 10) / 3) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 10) / 3) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 10) / 3) * (-1.60048-(3.44153)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 2.37946 + (((tickAnim - 13) / 3) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 13) / 3) * (0.63744-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 13) / 3) * (3.44153-(-1.60048)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.01915 + (((tickAnim - 16) / 2) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 16) / 2) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 16) / 2) * (-1.60048-(3.44153)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 2.37946 + (((tickAnim - 18) / 4) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 18) / 4) * (0.63744-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 18) / 4) * (3.44153-(-1.60048)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 2.01915 + (((tickAnim - 22) / 2) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 22) / 2) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 22) / 2) * (-1.60048-(3.44153)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 2.37946 + (((tickAnim - 24) / 4) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 24) / 4) * (0.63744-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 24) / 4) * (3.44153-(-1.60048)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 2.01915 + (((tickAnim - 28) / 3) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 28) / 3) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 28) / 3) * (-1.15048-(3.44153)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 2.37946 + (((tickAnim - 31) / 4) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 31) / 4) * (0.63744-(-0.2816)));
            zz = -1.15048 + (((tickAnim - 31) / 4) * (3.44153-(-1.15048)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.01915 + (((tickAnim - 35) / 5) * (0-(2.01915)));
            yy = 0.63744 + (((tickAnim - 35) / 5) * (0-(0.63744)));
            zz = 3.44153 + (((tickAnim - 35) / 5) * (0-(3.44153)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.00043-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.09968-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.48996-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.00043 + (((tickAnim - 3) / 2) * (2.01915-(1.00043)));
            yy = -0.09968 + (((tickAnim - 3) / 2) * (0.63744-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 3) / 2) * (3.44153-(-0.48996)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.01915 + (((tickAnim - 5) / 3) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 5) / 3) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 5) / 3) * (-1.60048-(3.44153)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.37946 + (((tickAnim - 8) / 2) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 8) / 2) * (0.63744-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 8) / 2) * (3.44153-(-1.60048)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 2.01915 + (((tickAnim - 10) / 3) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 10) / 3) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 10) / 3) * (-1.60048-(3.44153)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 2.37946 + (((tickAnim - 13) / 3) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 13) / 3) * (0.63744-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 13) / 3) * (3.44153-(-1.60048)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.01915 + (((tickAnim - 16) / 2) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 16) / 2) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 16) / 2) * (-1.60048-(3.44153)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 2.37946 + (((tickAnim - 18) / 4) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 18) / 4) * (0.63744-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 18) / 4) * (3.44153-(-1.60048)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 2.01915 + (((tickAnim - 22) / 2) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 22) / 2) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 22) / 2) * (-1.60048-(3.44153)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 2.37946 + (((tickAnim - 24) / 4) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 24) / 4) * (0.63744-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 24) / 4) * (3.44153-(-1.60048)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 2.01915 + (((tickAnim - 28) / 3) * (2.37946-(2.01915)));
            yy = 0.63744 + (((tickAnim - 28) / 3) * (-0.2816-(0.63744)));
            zz = 3.44153 + (((tickAnim - 28) / 3) * (-1.15048-(3.44153)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 2.37946 + (((tickAnim - 31) / 4) * (2.01915-(2.37946)));
            yy = -0.2816 + (((tickAnim - 31) / 4) * (0.63744-(-0.2816)));
            zz = -1.15048 + (((tickAnim - 31) / 4) * (3.44153-(-1.15048)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.01915 + (((tickAnim - 35) / 5) * (0-(2.01915)));
            yy = 0.63744 + (((tickAnim - 35) / 5) * (0-(0.63744)));
            zz = 3.44153 + (((tickAnim - 35) / 5) * (0-(3.44153)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = 4.25 + (((tickAnim - 5) / 27) * (-8.75-(4.25)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*3 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -8.75 + (((tickAnim - 32) / 8) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.45425-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-9.1539-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (15.02728-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 12.45425 + (((tickAnim - 5) / 30) * (30.71653-(12.45425)));
            yy = -9.1539 + (((tickAnim - 5) / 30) * (-17.07946-(-9.1539)));
            zz = 15.02728 + (((tickAnim - 5) / 30) * (21.53664-(15.02728)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 30.71653 + (((tickAnim - 35) / 5) * (0-(30.71653)));
            yy = -17.07946 + (((tickAnim - 35) / 5) * (0-(-17.07946)));
            zz = 21.53664 + (((tickAnim - 35) / 5) * (0-(21.53664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.45425-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-9.1539-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-15.0273-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 12.45425 + (((tickAnim - 5) / 30) * (30.71653-(12.45425)));
            yy = -9.1539 + (((tickAnim - 5) / 30) * (-17.07946-(-9.1539)));
            zz = -15.0273 + (((tickAnim - 5) / 30) * (-21.5366-(-15.0273)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 30.71653 + (((tickAnim - 35) / 5) * (0-(30.71653)));
            yy = -17.07946 + (((tickAnim - 35) / 5) * (0-(-17.07946)));
            zz = -21.5366 + (((tickAnim - 35) / 5) * (0-(-21.5366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13.775-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*6-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = -13.775 + (((tickAnim - 5) / 27) * (10.75-(-13.775)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*6 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*6)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 10.75 + (((tickAnim - 32) / 8) * (0-(10.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*8-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = 14.5 + (((tickAnim - 5) / 27) * (-20.25-(14.5)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*8 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*8)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -20.25 + (((tickAnim - 32) / 8) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.75 + (((tickAnim - 3) / 2) * (0-(3.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*1-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = -3.75 + (((tickAnim - 5) / 27) * (9.25-(-3.75)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*1 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*1)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 9.25 + (((tickAnim - 32) / 8) * (0-(9.25)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = -3.5 + (((tickAnim - 5) / 27) * (3.25-(-3.5)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*7 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*7)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 3.25 + (((tickAnim - 32) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 5.25 + (((tickAnim - 5) / 12) * (-10.5-(5.25)));
            yy = 0 + (((tickAnim - 5) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*7 + (((tickAnim - 5) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*13-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*7)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = -10.5 + (((tickAnim - 17) / 15) * (1-(-10.5)));
            yy = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*13 + (((tickAnim - 17) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*13)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 32) / 8) * (0-(1)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*12-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 4.25 + (((tickAnim - 5) / 12) * (-25.25-(4.25)));
            yy = 0 + (((tickAnim - 5) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*12 + (((tickAnim - 5) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*18-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*12)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = -25.25 + (((tickAnim - 17) / 15) * (-11.25-(-25.25)));
            yy = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*18 + (((tickAnim - 17) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*18)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -11.25 + (((tickAnim - 32) / 8) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*6 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




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


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.625-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0.625 + (((tickAnim - 5) / 15) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 30.75 + (((tickAnim - 3) / 3) * (0-(30.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 23 + (((tickAnim - 9) / 2) * (0-(23)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
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
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6.25 + (((tickAnim - 5) / 5) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Eye1, Eye1.rotateAngleX + (float) Math.toRadians(xx), Eye1.rotateAngleY + (float) Math.toRadians(yy), Eye1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.4 + (((tickAnim - 5) / 5) * (0-(1.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Eye1.rotationPointX = this.Eye1.rotationPointX + (float)(xx);
        this.Eye1.rotationPointY = this.Eye1.rotationPointY - (float)(yy);
        this.Eye1.rotationPointZ = this.Eye1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (0.035-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0.035 + (((tickAnim - 5) / 5) * (1-(0.035)));
            zz = 1 + (((tickAnim - 5) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6.25 + (((tickAnim - 5) / 5) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Eye2, Eye2.rotateAngleX + (float) Math.toRadians(xx), Eye2.rotateAngleY + (float) Math.toRadians(yy), Eye2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.4 + (((tickAnim - 5) / 5) * (0-(1.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Eye2.rotationPointX = this.Eye2.rotationPointX + (float)(xx);
        this.Eye2.rotationPointY = this.Eye2.rotationPointY - (float)(yy);
        this.Eye2.rotationPointZ = this.Eye2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (0.035-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0.035 + (((tickAnim - 5) / 5) * (1-(0.035)));
            zz = 1 + (((tickAnim - 5) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye2.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*3), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.89088 + (((tickAnim - 0) / 8) * (-3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(1.89088)));
            yy = 0.8976 + (((tickAnim - 0) / 8) * (-0.44881-(0.8976)));
            zz = 2.09762 + (((tickAnim - 0) / 8) * (-1.34881-(2.09762)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 8) / 2) * (0.69088-(-3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -0.44881 + (((tickAnim - 8) / 2) * (-0.89762-(-0.44881)));
            zz = -1.34881 + (((tickAnim - 8) / 2) * (-2.49762-(-1.34881)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0.69088 + (((tickAnim - 10) / 8) * (-5.0591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8-(0.69088)));
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
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Body2.rotationPointX = this.Body2.rotationPointX + (float)(xx);
        this.Body2.rotationPointY = this.Body2.rotationPointY - (float)(yy);
        this.Body2.rotationPointZ = this.Body2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leglef4, leglef4.rotateAngleX + (float) Math.toRadians(xx), leglef4.rotateAngleY + (float) Math.toRadians(yy), leglef4.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6.75 + (((tickAnim - 5) / 5) * (79-(-6.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 79 + (((tickAnim - 10) / 3) * (150.83-(79)));
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
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.footleft.rotationPointX = this.footleft.rotationPointX + (float)(xx);
        this.footleft.rotationPointY = this.footleft.rotationPointY - (float)(yy);
        this.footleft.rotationPointZ = this.footleft.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leglef2, leglef2.rotateAngleX + (float) Math.toRadians(xx), leglef2.rotateAngleY + (float) Math.toRadians(yy), leglef2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 70.5 + (((tickAnim - 0) / 3) * (150.83-(70.5)));
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
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 15) / 5) * (70.5-(-6.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.footright.rotationPointX = this.footright.rotationPointX + (float)(xx);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(yy);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(zz);



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-2), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+140))*2.5), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(0);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(0);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(0.375);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.78694 + (((tickAnim - 0) / 2) * (9.56876-(7.78694)));
            yy = -3.64475 + (((tickAnim - 0) / 2) * (-3.61362-(-3.64475)));
            zz = 2.17857 + (((tickAnim - 0) / 2) * (0.76681-(2.17857)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 9.56876 + (((tickAnim - 2) / 1) * (8.91364-(9.56876)));
            yy = -3.61362 + (((tickAnim - 2) / 1) * (0.21917-(-3.61362)));
            zz = 0.76681 + (((tickAnim - 2) / 1) * (-1.05012-(0.76681)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 8.91364 + (((tickAnim - 3) / 7) * (20.45249-(8.91364)));
            yy = 0.21917 + (((tickAnim - 3) / 7) * (-0.05696-(0.21917)));
            zz = -1.05012 + (((tickAnim - 3) / 7) * (5.82408-(-1.05012)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20.45249 + (((tickAnim - 10) / 10) * (7.78694-(20.45249)));
            yy = -0.05696 + (((tickAnim - 10) / 10) * (-3.64475-(-0.05696)));
            zz = 5.82408 + (((tickAnim - 10) / 10) * (2.17857-(5.82408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.5 + (((tickAnim - 0) / 3) * (6.5-(13.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 6.5 + (((tickAnim - 3) / 7) * (25.25-(6.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.25 + (((tickAnim - 10) / 3) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25.25 + (((tickAnim - 13) / 7) * (13.5-(25.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+210))*3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+200))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+360))*2), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+360))*1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*2));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 21.53694 + (((tickAnim - 0) / 2) * (22.73899-(21.53694)));
            yy = -3.64475 + (((tickAnim - 0) / 2) * (-5.52998-(-3.64475)));
            zz = 2.17857 + (((tickAnim - 0) / 2) * (1.41178-(2.17857)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 22.73899 + (((tickAnim - 2) / 1) * (20.99316-(22.73899)));
            yy = -5.52998 + (((tickAnim - 2) / 1) * (-9.20133-(-5.52998)));
            zz = 1.41178 + (((tickAnim - 2) / 1) * (-2.24462-(1.41178)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 20.99316 + (((tickAnim - 3) / 7) * (11.15674-(20.99316)));
            yy = -9.20133 + (((tickAnim - 3) / 7) * (-14.98384-(-9.20133)));
            zz = -2.24462 + (((tickAnim - 3) / 7) * (-6.65178-(-2.24462)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.15674 + (((tickAnim - 10) / 10) * (21.53694-(11.15674)));
            yy = -14.98384 + (((tickAnim - 10) / 10) * (-3.64475-(-14.98384)));
            zz = -6.65178 + (((tickAnim - 10) / 10) * (2.17857-(-6.65178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.5 + (((tickAnim - 0) / 3) * (6.5-(13.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 6.5 + (((tickAnim - 3) / 7) * (16.75-(6.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16.75 + (((tickAnim - 10) / 3) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 16.75 + (((tickAnim - 13) / 7) * (13.5-(16.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAquilops entity = (EntityPrehistoricFloraAquilops) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+60))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+60))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*6), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*6), tail4.rotateAngleZ + (float) Math.toRadians(0));



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
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.25 + (((tickAnim - 0) / 3) * (0-(-0.25)));
            yy = -0.4 + (((tickAnim - 0) / 3) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.25-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1 + (((tickAnim - 3) / 2) * (-0.4-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.25 + (((tickAnim - 5) / 3) * (0-(0.25)));
            yy = -0.4 + (((tickAnim - 5) / 3) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1-(-0.4)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.25-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1 + (((tickAnim - 8) / 2) * (-0.4-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body2.rotationPointX = this.Body2.rotationPointX + (float)(xx);
        this.Body2.rotationPointY = this.Body2.rotationPointY - (float)(yy);
        this.Body2.rotationPointZ = this.Body2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leglef4, leglef4.rotateAngleX + (float) Math.toRadians(xx), leglef4.rotateAngleY + (float) Math.toRadians(yy), leglef4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leglef2, leglef2.rotateAngleX + (float) Math.toRadians(xx), leglef2.rotateAngleY + (float) Math.toRadians(yy), leglef2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*-2), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+140))*2.5), body3.rotateAngleZ + (float) Math.toRadians(0));



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
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+210))*6), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+200))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+360))*4), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+360))*1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.225);



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
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAquilops e = (EntityPrehistoricFloraAquilops) entity;
        animator.update(entity);


    }
}
