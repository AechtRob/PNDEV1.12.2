package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYanornis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYanornis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tailFeathers;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer armleft1;
    private final AdvancedModelRenderer tertialsleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer secondariesleft;
    private final AdvancedModelRenderer secondariesleftfoldable;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer primariesleft;
    private final AdvancedModelRenderer primaryleft7;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer primaryleft6;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer primaryleft5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer primaryleft4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer primaryleft3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer primaryleft2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer primaryleft1;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer armright1;
    private final AdvancedModelRenderer tertialsright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer secondariesright;
    private final AdvancedModelRenderer secondariesrightfoldable;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer primariesright;
    private final AdvancedModelRenderer primaryright7;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer primaryright6;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer primaryright5;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer primaryright4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer primaryright3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer primaryright2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer primaryright1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r41;

    private ModelAnimator animator;

    public ModelYanornis() {
        this.textureWidth = 74;
        this.textureHeight = 75;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.1F, 0.0F);


        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.9F, -9.1F, -0.1F);
        this.base.addChild(legleft);
        this.setRotateAngle(legleft, 0.4363F, 0.0F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 44, 9, -1.2F, -0.798F, -1.1805F, 2, 7, 2, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 6.302F, 0.6195F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, -1.0472F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 0, -0.7F, -0.022F, -0.9633F, 1, 4, 1, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 3.728F, -0.5133F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.6109F, 0.0F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 39, 58, -1.6F, -0.25F, -3.45F, 3, 1, 5, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.9F, -9.1F, -0.1F);
        this.base.addChild(legright);
        this.setRotateAngle(legright, 0.4363F, 0.0F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 44, 9, -0.8F, -0.798F, -1.1805F, 2, 7, 2, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 6.302F, 0.6195F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, -1.0472F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 0, -0.3F, -0.022F, -0.9633F, 1, 4, 1, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 3.728F, -0.5133F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.6109F, 0.0F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 39, 58, -1.4F, -0.25F, -3.45F, 3, 1, 5, 0.0F, false));

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -13.255F, 2.2869F);
        this.base.addChild(hips);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.541F, 0.9056F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 46, -1.0F, -1.0F, -3.0F, 2, 3, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.041F, -1.5944F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 40, -4.0F, -2.0F, -1.0F, 6, 8, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.441F, 2.5056F);
        this.hips.addChild(tail);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.2F, 1.1F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 57, -2.0F, 0.0F, -2.0F, 4, 3, 4, 0.0F, false));

        this.tailFeathers = new AdvancedModelRenderer(this);
        this.tailFeathers.setRotationPoint(-0.5F, 0.1F, 2.1F);
        this.tail.addChild(tailFeathers);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.3F, -1.0F);
        this.tailFeathers.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 0, -3.0F, 1.0F, 0.9F, 7, 0, 8, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(-0.5F, -0.659F, -1.9944F);
        this.hips.addChild(chest);
        this.setRotateAngle(chest, -0.2094F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, 2.3F, -6.8F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 47, -3.0F, -2.0F, -3.0F, 4, 2, 4, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 4.2982F, -4.8801F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 46, -2.0F, 2.0F, 6.0F, 7, 1, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 4.3F, -4.9F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 36, -2.0F, 1.0F, -1.0F, 7, 2, 7, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.7F, -5.6F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 28, -3.0F, -1.4738F, 2.5955F, 7, 0, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 32, -3.0F, -2.0F, -0.4F, 7, 0, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.7F, -5.6F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 53, 6, -3.0F, -2.0F, 6.0F, 7, 0, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -3.0F, -2.0F, -1.0F, 7, 7, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.7F, -9.0F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 0, -2.0F, 4.0F, 2.0F, 5, 1, 4, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.2F, -8.8F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 36, -2.0F, -1.0F, 2.0F, 5, 6, 4, 0.0F, false));

        this.armleft1 = new AdvancedModelRenderer(this);
        this.armleft1.setRotationPoint(4.0F, 0.6141F, -6.3925F);
        this.chest.addChild(armleft1);
        this.setRotateAngle(armleft1, 0.1691F, 0.1559F, -0.0878F);
        this.armleft1.cubeList.add(new ModelBox(armleft1, 28, 24, -1.5707F, -0.9455F, -1.0205F, 2, 2, 4, 0.0F, true));

        this.tertialsleft = new AdvancedModelRenderer(this);
        this.tertialsleft.setRotationPoint(1.1293F, 0.0545F, -1.0205F);
        this.armleft1.addChild(tertialsleft);
        this.tertialsleft.cubeList.add(new ModelBox(tertialsleft, 19, 49, -1.0F, -9.0F, -1.0F, 0, 9, 5, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(-0.5707F, 0.0545F, 2.6795F);
        this.armleft1.addChild(armleft2);
        this.setRotateAngle(armleft2, -2.1889F, -0.1427F, 0.1008F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 22, 36, -0.25F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.secondariesleft = new AdvancedModelRenderer(this);
        this.secondariesleft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armleft2.addChild(secondariesleft);
        this.setRotateAngle(secondariesleft, 0.5672F, 0.0F, 0.0F);
        this.secondariesleft.cubeList.add(new ModelBox(secondariesleft, 30, 54, 0.51F, -10.7F, -0.2F, 0, 11, 4, 0.0F, true));

        this.secondariesleftfoldable = new AdvancedModelRenderer(this);
        this.secondariesleftfoldable.setRotationPoint(0.5F, -3.2F, -0.2F);
        this.secondariesleft.addChild(secondariesleftfoldable);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.secondariesleftfoldable.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 3.0543F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 62, 0.0F, -6.5F, -3.0F, 0, 10, 3, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.25F, 0.0F, 4.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 1.9635F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 1.85F, 0.05F);
        this.armleft3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 15, -0.5F, -3.0F, -1.0F, 0, 2, 6, 0.0F, true));

        this.primariesleft = new AdvancedModelRenderer(this);
        this.primariesleft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armleft3.addChild(primariesleft);


        this.primaryleft7 = new AdvancedModelRenderer(this);
        this.primaryleft7.setRotationPoint(0.1253F, 0.962F, 5.0792F);
        this.primariesleft.addChild(primaryleft7);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 19, -0.06F, -3.0F, -1.0F, 0, 3, 13, 0.0F, true));

        this.primaryleft6 = new AdvancedModelRenderer(this);
        this.primaryleft6.setRotationPoint(0.1253F, 0.962F, 5.0792F);
        this.primariesleft.addChild(primaryleft6);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 2, -0.05F, -3.0F, -1.0F, 0, 3, 13, 0.0F, true));

        this.primaryleft5 = new AdvancedModelRenderer(this);
        this.primaryleft5.setRotationPoint(0.1253F, 1.162F, 3.3792F);
        this.primariesleft.addChild(primaryleft5);
        this.setRotateAngle(primaryleft5, 0.1309F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.0253F, -0.162F, 1.1208F);
        this.primaryleft5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 15, -0.04F, -3.0F, -1.0F, 0, 3, 13, 0.0F, true));

        this.primaryleft4 = new AdvancedModelRenderer(this);
        this.primaryleft4.setRotationPoint(0.1253F, 0.662F, 3.3792F);
        this.primariesleft.addChild(primaryleft4);
        this.setRotateAngle(primaryleft4, 0.1745F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 24, -0.03F, -3.0F, -1.0F, 0, 3, 12, 0.0F, true));

        this.primaryleft3 = new AdvancedModelRenderer(this);
        this.primaryleft3.setRotationPoint(0.1253F, 1.162F, 4.4792F);
        this.primariesleft.addChild(primaryleft3);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 14, -0.02F, -3.0F, -1.0F, 0, 3, 10, 0.0F, true));

        this.primaryleft2 = new AdvancedModelRenderer(this);
        this.primaryleft2.setRotationPoint(0.1253F, 1.162F, 3.7792F);
        this.primariesleft.addChild(primaryleft2);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 44, -0.01F, -3.0F, -1.0F, 0, 3, 10, 0.0F, true));

        this.primaryleft1 = new AdvancedModelRenderer(this);
        this.primaryleft1.setRotationPoint(0.1253F, 0.962F, 2.1792F);
        this.primariesleft.addChild(primaryleft1);
        this.setRotateAngle(primaryleft1, 0.0436F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 9, 0.0F, -3.0F, -1.0F, 0, 3, 11, 0.0F, true));

        this.armright1 = new AdvancedModelRenderer(this);
        this.armright1.setRotationPoint(-3.0F, 0.6141F, -6.3925F);
        this.chest.addChild(armright1);
        this.setRotateAngle(armright1, 0.1691F, -0.1559F, 0.0878F);
        this.armright1.cubeList.add(new ModelBox(armright1, 28, 24, -0.4293F, -0.9455F, -1.0205F, 2, 2, 4, 0.0F, false));

        this.tertialsright = new AdvancedModelRenderer(this);
        this.tertialsright.setRotationPoint(-1.1293F, 0.0545F, -1.0205F);
        this.armright1.addChild(tertialsright);
        this.tertialsright.cubeList.add(new ModelBox(tertialsright, 19, 49, 1.0F, -9.0F, -1.0F, 0, 9, 5, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.5707F, 0.0545F, 2.6795F);
        this.armright1.addChild(armright2);
        this.setRotateAngle(armright2, -2.1889F, 0.1427F, -0.1008F);
        this.armright2.cubeList.add(new ModelBox(armright2, 22, 36, -0.75F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.secondariesright = new AdvancedModelRenderer(this);
        this.secondariesright.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armright2.addChild(secondariesright);
        this.setRotateAngle(secondariesright, 0.5672F, 0.0F, 0.0F);
        this.secondariesright.cubeList.add(new ModelBox(secondariesright, 30, 54, -0.51F, -10.7F, -0.2F, 0, 11, 4, 0.0F, false));

        this.secondariesrightfoldable = new AdvancedModelRenderer(this);
        this.secondariesrightfoldable.setRotationPoint(-0.5F, -3.2F, -0.2F);
        this.secondariesright.addChild(secondariesrightfoldable);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.secondariesrightfoldable.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -3.0543F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 62, 0.0F, -6.5F, -3.0F, 0, 10, 3, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-0.25F, 0.0F, 4.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 1.9635F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 1.85F, 0.05F);
        this.armright3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 15, 0.5F, -3.0F, -1.0F, 0, 2, 6, 0.0F, false));

        this.primariesright = new AdvancedModelRenderer(this);
        this.primariesright.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armright3.addChild(primariesright);


        this.primaryright7 = new AdvancedModelRenderer(this);
        this.primaryright7.setRotationPoint(-0.1253F, 0.962F, 5.0792F);
        this.primariesright.addChild(primaryright7);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright7.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 14, 19, 0.06F, -3.0F, -1.0F, 0, 3, 13, 0.0F, false));

        this.primaryright6 = new AdvancedModelRenderer(this);
        this.primaryright6.setRotationPoint(-0.1253F, 0.962F, 5.0792F);
        this.primariesright.addChild(primaryright6);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright6.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2182F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 2, 0.05F, -3.0F, -1.0F, 0, 3, 13, 0.0F, false));

        this.primaryright5 = new AdvancedModelRenderer(this);
        this.primaryright5.setRotationPoint(-0.1253F, 1.162F, 3.3792F);
        this.primariesright.addChild(primaryright5);
        this.setRotateAngle(primaryright5, 0.1309F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0253F, -0.162F, 1.1208F);
        this.primaryright5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 15, 0.04F, -3.0F, -1.0F, 0, 3, 13, 0.0F, false));

        this.primaryright4 = new AdvancedModelRenderer(this);
        this.primaryright4.setRotationPoint(-0.1253F, 0.662F, 3.3792F);
        this.primariesright.addChild(primaryright4);
        this.setRotateAngle(primaryright4, 0.1745F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 24, 0.03F, -3.0F, -1.0F, 0, 3, 12, 0.0F, false));

        this.primaryright3 = new AdvancedModelRenderer(this);
        this.primaryright3.setRotationPoint(-0.1253F, 1.162F, 4.4792F);
        this.primariesright.addChild(primaryright3);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 14, 0.02F, -3.0F, -1.0F, 0, 3, 10, 0.0F, false));

        this.primaryright2 = new AdvancedModelRenderer(this);
        this.primaryright2.setRotationPoint(-0.1253F, 1.162F, 3.7792F);
        this.primariesright.addChild(primaryright2);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2182F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 42, 44, 0.01F, -3.0F, -1.0F, 0, 3, 10, 0.0F, false));

        this.primaryright1 = new AdvancedModelRenderer(this);
        this.primaryright1.setRotationPoint(-0.1253F, 0.962F, 2.1792F);
        this.primariesright.addChild(primaryright1);
        this.setRotateAngle(primaryright1, 0.0436F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 9, 0.0F, -3.0F, -1.0F, 0, 3, 11, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 4.3F, -8.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.5672F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.4F, -0.5F);
        this.neck1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.0036F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 56, 9, -1.0F, -3.05F, -3.2828F, 4, 4, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.8F, -2.1F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0436F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -6.1F, 0.8F);
        this.neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.3526F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 14, 19, -1.0F, -1.0F, 3.0F, 3, 4, 3, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.2F, 0.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);


        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0873F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -2.128F, -0.0377F);
        this.neck4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -1.6144F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 58, -1.5F, -1.5F, -1.5F, 3, 3, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -3.0583F, -0.2446F);
        this.neck4.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 24, -1.5F, -1.0235F, -1.6621F, 3, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 0, -1.0F, -1.0235F, -2.6121F, 2, 1, 1, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 15, -1.6F, -1.2235F, -1.9121F, 1, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 15, 0.6F, -1.2235F, -1.9121F, 1, 1, 1, 0.02F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.368F, -0.256F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.7418F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 30, -2.0F, -2.0F, -1.0641F, 3, 2, 2, -0.02F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.7922F, 0.3679F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -1.885F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 30, 5, -2.0F, -1.2F, -0.6F, 3, 1, 0, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.7922F, 0.3679F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.4486F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 30, 3, -2.0F, -0.8F, -1.0F, 3, 1, 0, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.7922F, 0.3679F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -1.5708F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 49, -2.0F, 0.0F, -1.0F, 3, 2, 1, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.3638F, -1.5687F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -1.0036F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 22, 3, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.015F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.48F, 0.1765F, -2.1121F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3491F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 7, 15, 0.3F, -0.5F, -0.4F, 0, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 7, 15, -1.26F, -0.5F, -0.4F, 0, 1, 1, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.5F, -0.7617F, -2.5718F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.3491F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.2169F, 0.2543F);
        this.upperjaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0436F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 56, 18, 0.0F, -0.4787F, -3.3447F, 1, 1, 4, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0765F, 0.1379F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 32, -1.5F, -1.1F, -1.8F, 3, 2, 1, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 51, 58, -1.5F, -0.1F, -0.8F, 3, 1, 1, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 63, 18, -1.5F, -1.1F, -0.8F, 3, 1, 1, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 0, -1.0F, -0.1F, -2.75F, 2, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 9, -0.5F, -0.1143F, -5.3F, 1, 1, 4, -0.02F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.0F, 0.9F, -1.75F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3054F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 10, 15, 1.79F, -1.4F, -1.148F, 0, 1, 1, 0.0F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 10, 15, 0.21F, -1.4F, -1.148F, 0, 1, 1, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.2848F, -1.3127F);
        this.head.addChild(throat);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -0.8693F, -0.2329F);
        this.throat.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -1.309F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 63, 25, -1.0F, -0.5F, -0.6F, 2, 1, 3, -0.02F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.base.offsetY = -0.1F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -2.30F;
        this.base.offsetX = 1.55F;
        this.base.offsetZ = 2.05F;
        this.base.rotateAngleY = (float)Math.toRadians(230);
        this.base.rotateAngleX = (float)Math.toRadians(9);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 2.2F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraYanornis ee = (EntityPrehistoricFloraYanornis) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};
        AdvancedModelRenderer[] Tail = {this.tail};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.5F, -0.02F, 0.5F, f2, 0.4F);
            this.chainWave(Tail, 0.5F, -0.01F, 0.5F, f2, 0.4F);

        }
        else {
            if (!ee.isReallyInWater()) {

                if (f3 == 0.0F || !ee.getIsMoving()) {
                    if (ee.getAnimation() != ee.DRINK_ANIMATION) {
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
        this.head.setScale(1,1,1);
//        this.feathers.setScale(1,1,1);
//        this.feathers2.setScale(1,1,1);
//        this.feathers3.setScale(1,1,1);
//        this.feathers4.setScale(1,1,1);
        EntityPrehistoricFloraYanornis ee = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;

        if (ee.getIsFlying() || ee.getIsLaunching()) {

            this.tertialsleft.setScale((float)1,(float)1,(float)1);
            this.tertialsright.setScale((float)1,(float)1,(float)1);

        } else {
            this.tertialsleft.setScale((float)1,(float)0,(float)0);
            this.tertialsright.setScale((float)1,(float)0,(float)0);

        }

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else {
                    if (ee.getIsLaunching()) {
                        animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            if (ee.getIsLaunching()) {
                animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                //Is gliding:
                animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYanornis entity = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;
        int animCycle = 739;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10 + (((tickAnim - 40) / 1) * (-12.75-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 285) {
            xx = -12.75 + (((tickAnim - 41) / 244) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 244) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = -12.75 + (((tickAnim - 285) / 29) * (-11.59228-(-12.75)));
            yy = 0 + (((tickAnim - 285) / 29) * (0.36397-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0.93142-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 320) {
            xx = -11.59228 + (((tickAnim - 314) / 6) * (-14.75-(-11.59228)));
            yy = 0.36397 + (((tickAnim - 314) / 6) * (0-(0.36397)));
            zz = 0.93142 + (((tickAnim - 314) / 6) * (0-(0.93142)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = -14.75 + (((tickAnim - 320) / 355) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = -14.75 + (((tickAnim - 675) / 10) * (7-(-14.75)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 7 + (((tickAnim - 685) / 30) * (3.12511-(7)));
            yy = 0 + (((tickAnim - 685) / 30) * (-0.13353-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (-1.7449-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 3.12511 + (((tickAnim - 715) / 24) * (0-(3.12511)));
            yy = -0.13353 + (((tickAnim - 715) / 24) * (0-(-0.13353)));
            zz = -1.7449 + (((tickAnim - 715) / 24) * (0-(-1.7449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (-0.325-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            zz = -0.325 + (((tickAnim - 41) / 244) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = -0.325 + (((tickAnim - 285) / 35) * (-7.245-(-0.325)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = -7.245 + (((tickAnim - 320) / 355) * (-7.245-(-7.245)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = -7.245 + (((tickAnim - 675) / 10) * (-8.865-(-7.245)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            zz = -8.865 + (((tickAnim - 685) / 54) * (0-(-8.865)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 20.25 + (((tickAnim - 27) / 13) * (17.25-(20.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 17.25 + (((tickAnim - 40) / 245) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 17.25 + (((tickAnim - 285) / 35) * (-16.75-(17.25)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = -16.75 + (((tickAnim - 320) / 355) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = -16.75 + (((tickAnim - 675) / 1) * (5.5-(-16.75)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 679) {
            xx = 5.5 + (((tickAnim - 676) / 3) * (37.25-(5.5)));
            yy = 0 + (((tickAnim - 676) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 3) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 37.25 + (((tickAnim - 679) / 6) * (0-(37.25)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = -30.25 + (((tickAnim - 715) / 12) * (38.2-(-30.25)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 38.2 + (((tickAnim - 727) / 12) * (0-(38.2)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-0.85-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0.775 + (((tickAnim - 27) / 13) * (0-(0.775)));
            zz = -0.85 + (((tickAnim - 27) / 13) * (0-(-0.85)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 285) / 390) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 390) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 390) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 676) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 676) / 3) * (0.9-(0)));
            zz = 0 + (((tickAnim - 676) / 3) * (-1.475-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 679) / 6) * (0-(0.9)));
            zz = -1.475 + (((tickAnim - 679) / 6) * (0-(-1.475)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            yy = -0.775 + (((tickAnim - 715) / 12) * (0.69-(-0.775)));
            zz = 0 + (((tickAnim - 715) / 12) * (-1.35-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            yy = 0.69 + (((tickAnim - 727) / 12) * (0-(0.69)));
            zz = -1.35 + (((tickAnim - 727) / 12) * (0-(-1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -3.25 + (((tickAnim - 27) / 13) * (23-(-3.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 23 + (((tickAnim - 40) / 245) * (23-(23)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 304) {
            xx = 23 + (((tickAnim - 285) / 19) * (-17.5-(23)));
            yy = 0 + (((tickAnim - 285) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 19) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = -17.5 + (((tickAnim - 304) / 16) * (17.25-(-17.5)));
            yy = 0 + (((tickAnim - 304) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 16) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 17.25 + (((tickAnim - 320) / 355) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 17.25 + (((tickAnim - 675) / 1) * (10.5-(17.25)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 680) {
            xx = 10.5 + (((tickAnim - 676) / 4) * (-41.5-(10.5)));
            yy = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 4) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = -41.5 + (((tickAnim - 680) / 5) * (17.5-(-41.5)));
            yy = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 5) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 17.5 + (((tickAnim - 685) / 30) * (21.25-(17.5)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 21.25 + (((tickAnim - 715) / 12) * (-34.49-(21.25)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = -34.49 + (((tickAnim - 727) / 12) * (0-(-34.49)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0.4 + (((tickAnim - 40) / 245) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 285) / 390) * (0-(0)));
            yy = 0.4 + (((tickAnim - 285) / 390) * (0.2-(0.4)));
            zz = 0 + (((tickAnim - 285) / 390) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 675) / 1) * (0-(0.2)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 680) {
            xx = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 4) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 5) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (1.2-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            yy = 1.2 + (((tickAnim - 715) / 12) * (0-(1.2)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 31 + (((tickAnim - 27) / 13) * (-27.5-(31)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -27.5 + (((tickAnim - 40) / 245) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 304) {
            xx = -27.5 + (((tickAnim - 285) / 19) * (46.58-(-27.5)));
            yy = 0 + (((tickAnim - 285) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 19) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 46.58 + (((tickAnim - 304) / 16) * (14.5-(46.58)));
            yy = 0 + (((tickAnim - 304) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 16) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 14.5 + (((tickAnim - 320) / 355) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 14.5 + (((tickAnim - 675) / 1) * (-22-(14.5)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 680) {
            xx = -22 + (((tickAnim - 676) / 4) * (75-(-22)));
            yy = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 4) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 683) {
            xx = 75 + (((tickAnim - 680) / 3) * (54.25-(75)));
            yy = 0 + (((tickAnim - 680) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 3) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 54.25 + (((tickAnim - 683) / 2) * (-23.25-(54.25)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = -23.25 + (((tickAnim - 685) / 30) * (6.5-(-23.25)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 6.5 + (((tickAnim - 715) / 12) * (60.65-(6.5)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 733) {
            xx = 60.65 + (((tickAnim - 727) / 6) * (71.58-(60.65)));
            yy = 0 + (((tickAnim - 727) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 6) * (0-(0)));
        }
        else if (tickAnim >= 733 && tickAnim < 739) {
            xx = 71.58 + (((tickAnim - 733) / 6) * (0-(71.58)));
            yy = 0 + (((tickAnim - 733) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 733) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0.85 + (((tickAnim - 27) / 13) * (0.2-(0.85)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0.2 + (((tickAnim - 40) / 245) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 285) / 10) * (0-(0)));
            yy = 0.2 + (((tickAnim - 285) / 10) * (0.81-(0.2)));
            zz = 0 + (((tickAnim - 285) / 10) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 295) / 9) * (0-(0)));
            yy = 0.81 + (((tickAnim - 295) / 9) * (0.875-(0.81)));
            zz = 0 + (((tickAnim - 295) / 9) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 304) / 16) * (0-(0)));
            yy = 0.875 + (((tickAnim - 304) / 16) * (0-(0.875)));
            zz = 0 + (((tickAnim - 304) / 16) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 680) {
            xx = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 4) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 680) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 680) / 3) * (1.75-(0)));
            zz = 0 + (((tickAnim - 680) / 3) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 1.75 + (((tickAnim - 683) / 2) * (0.175-(1.75)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0.175 + (((tickAnim - 685) / 30) * (0-(0.175)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 733) {
            xx = 0 + (((tickAnim - 727) / 6) * (0.22-(0)));
            yy = 0 + (((tickAnim - 727) / 6) * (0.79-(0)));
            zz = 0 + (((tickAnim - 727) / 6) * (-0.075-(0)));
        }
        else if (tickAnim >= 733 && tickAnim < 739) {
            xx = 0.22 + (((tickAnim - 733) / 6) * (0-(0.22)));
            yy = 0.79 + (((tickAnim - 733) / 6) * (0-(0.79)));
            zz = -0.075 + (((tickAnim - 733) / 6) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (34.25-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 34.25 + (((tickAnim - 320) / 355) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 34.25 + (((tickAnim - 675) / 10) * (-4.75-(34.25)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = -4.75 + (((tickAnim - 685) / 14) * (37.38-(-4.75)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 37.38 + (((tickAnim - 699) / 16) * (19.5-(37.38)));
            yy = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 16) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 19.5 + (((tickAnim - 715) / 24) * (0-(19.5)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0.85-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (-1.625-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            yy = 0.85 + (((tickAnim - 699) / 16) * (0-(0.85)));
            zz = -1.625 + (((tickAnim - 699) / 16) * (0-(-1.625)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (27.25-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 27.25 + (((tickAnim - 320) / 355) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 27.25 + (((tickAnim - 675) / 5) * (-29.37-(27.25)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = -29.37 + (((tickAnim - 680) / 5) * (-4.5-(-29.37)));
            yy = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 5) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = -4.5 + (((tickAnim - 685) / 14) * (-3.69-(-4.5)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = -3.69 + (((tickAnim - 699) / 16) * (24-(-3.69)));
            yy = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 16) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 24 + (((tickAnim - 715) / 24) * (0-(24)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 16) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 13.25 + (((tickAnim - 40) / 245) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 13.25 + (((tickAnim - 285) / 35) * (-47-(13.25)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = -47 + (((tickAnim - 320) / 355) * (-47-(-47)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = -47 + (((tickAnim - 675) / 5) * (24.63-(-47)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = 24.63 + (((tickAnim - 680) / 5) * (2.25-(24.63)));
            yy = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 5) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 2.25 + (((tickAnim - 685) / 14) * (48.56-(2.25)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 708) {
            xx = 48.56 + (((tickAnim - 699) / 9) * (6.33-(48.56)));
            yy = 0 + (((tickAnim - 699) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 9) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 6.33 + (((tickAnim - 708) / 7) * (-46.25-(6.33)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = -46.25 + (((tickAnim - 715) / 24) * (0-(-46.25)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 285) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 19) * (0.38-(0)));
            zz = 0 + (((tickAnim - 285) / 19) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 304) / 16) * (0-(0)));
            yy = 0.38 + (((tickAnim - 304) / 16) * (-0.225-(0.38)));
            zz = 0 + (((tickAnim - 304) / 16) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = -0.225 + (((tickAnim - 320) / 355) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 675) / 10) * (-0.325-(-0.225)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = -0.325 + (((tickAnim - 685) / 14) * (1.1-(-0.325)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 699) / 9) * (0-(0)));
            yy = 1.1 + (((tickAnim - 699) / 9) * (0-(1.1)));
            zz = 0 + (((tickAnim - 699) / 9) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 708) / 7) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = -0.625 + (((tickAnim - 715) / 24) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 0) / 675) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 675) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 675) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 0 + (((tickAnim - 675) / 5) * (27.25-(0)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = 27.25 + (((tickAnim - 680) / 5) * (28.25-(27.25)));
            yy = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 5) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 28.25 + (((tickAnim - 685) / 30) * (0-(28.25)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 40) / 69) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 109) / 150) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 259) / 26) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 285) / 35) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 320) / 20) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 320) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 20) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 580) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2 + (((tickAnim - 340) / 240) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2)));
            yy = 0 + (((tickAnim - 340) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 240) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 675) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5 + (((tickAnim - 580) / 95) * (5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5)));
            yy = 0 + (((tickAnim - 580) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 580) / 95) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5 + (((tickAnim - 675) / 4) * (-4.96-(5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -4.96 + (((tickAnim - 679) / 6) * (0-(-4.96)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.65-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 40) / 699) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 699) * (0-(0)));
            zz = 0.65 + (((tickAnim - 40) / 699) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.tertialsleft.setScale((float)1,(float)0,(float)1);


        this.tertialsright.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 40) / 69) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 109) / 150) * (-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = -7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 259) / 26) * (-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = -7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 285) / 29) * (-11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = -11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 314) / 26) * (-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10-(-11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 341) {
            xx = -6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10 + (((tickAnim - 340) / 1) * (-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10)));
            yy = 0 + (((tickAnim - 340) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 1) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 375) {
            xx = -1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 341) / 34) * (-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5-(-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 341) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 34) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = -1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5 + (((tickAnim - 375) / 185) * (5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5)));
            yy = 0 + (((tickAnim - 375) / 185) * (0.6224-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (-1.21684-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 560) / 93) * (2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 560) / 93) * (0.6224-(0.6224)));
            zz = -1.21684 + (((tickAnim - 560) / 93) * (-1.21684-(-1.21684)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 653) / 22) * (2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 653) / 22) * (0.6224-(0.6224)));
            zz = -1.21684 + (((tickAnim - 653) / 22) * (-1.21684-(-1.21684)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 675) / 4) * (-4.76971-(2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 675) / 4) * (0.36307-(0.6224)));
            zz = -1.21684 + (((tickAnim - 675) / 4) * (-0.70982-(-1.21684)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -4.76971 + (((tickAnim - 679) / 6) * (34.75-(-4.76971)));
            yy = 0.36307 + (((tickAnim - 679) / 6) * (0-(0.36307)));
            zz = -0.70982 + (((tickAnim - 679) / 6) * (0-(-0.70982)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 34.75 + (((tickAnim - 685) / 14) * (18.61083-(34.75)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0.63128-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 18.61083 + (((tickAnim - 699) / 8) * (9.57417-(18.61083)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0.63128 + (((tickAnim - 699) / 8) * (-3.83952-(0.63128)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = 9.57417 + (((tickAnim - 707) / 1) * (7.94-(9.57417)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = -3.83952 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(-3.83952)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 7.94 + (((tickAnim - 708) / 7) * (0-(7.94)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 0) / 314) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 314) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 314) * (0.275-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 314) / 361) * (0-(0)));
            yy = 0 + (((tickAnim - 314) / 361) * (0-(0)));
            zz = 0.275 + (((tickAnim - 314) / 361) * (0-(0.275)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 40) / 69) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 109) / 150) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 259) / 26) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 285) / 29) * (-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = -14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 314) / 26) * (16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20-(-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 341) {
            xx = 16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20 + (((tickAnim - 340) / 1) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1-(16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20)));
            yy = 0 + (((tickAnim - 340) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 1) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 375) {
            xx = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1 + (((tickAnim - 341) / 34) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1)));
            yy = 0 + (((tickAnim - 341) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 34) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1 + (((tickAnim - 375) / 185) * (17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 560) / 93) * (17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 653) / 22) * (17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 675) / 4) * (-7.88-(17.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -7.88 + (((tickAnim - 679) / 6) * (25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(-7.88)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 685) / 14) * (0-(25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (-0.17448-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -0.05 + (((tickAnim - 707) / 1) * (0.25-(-0.05)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = -0.17448 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2-(-0.17448)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0.25 + (((tickAnim - 708) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 679) / 6) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = -0.475 + (((tickAnim - 685) / 30) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 40) / 69) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 109) / 150) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 259) / 26) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 285) / 29) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 314) / 26) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 340) / 35) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 375) / 185) * (27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 560) / 93) * (38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 653) / 22) * (38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 675) / 4) * (14.5-(38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 14.5 + (((tickAnim - 679) / 6) * (0-(14.5)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (0.04619-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -0.6 + (((tickAnim - 707) / 1) * (-0.75-(-0.6)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = 0.04619 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3-(0.04619)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -0.75 + (((tickAnim - 708) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 0) / 560) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 560) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 560) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            yy = -0.175 + (((tickAnim - 560) / 93) * (-0.17-(-0.175)));
            zz = 0 + (((tickAnim - 560) / 93) * (0.3-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            yy = -0.17 + (((tickAnim - 653) / 22) * (-0.17-(-0.17)));
            zz = 0.3 + (((tickAnim - 653) / 22) * (0.3-(0.3)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = -0.17 + (((tickAnim - 675) / 10) * (-0.02-(-0.17)));
            zz = 0.3 + (((tickAnim - 675) / 10) * (0.3-(0.3)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = -0.02 + (((tickAnim - 685) / 30) * (0-(-0.02)));
            zz = 0.3 + (((tickAnim - 685) / 30) * (0-(0.3)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 259) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 40) / 219) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 40) / 219) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 219) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 259) / 26) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 285) / 29) * (27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 328) {
            xx = 27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 314) / 14) * (-18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28-(27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 314) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 14) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 340) {
            xx = -18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28 + (((tickAnim - 328) / 12) * (10.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1-(-18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28)));
            yy = 0 + (((tickAnim - 328) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 12) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 10.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1 + (((tickAnim - 340) / 35) * (10.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1-(10.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = 10.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1 + (((tickAnim - 375) / 185) * (-6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1-(10.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = -6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1 + (((tickAnim - 560) / 93) * (-6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1-(-6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = -6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1 + (((tickAnim - 653) / 22) * (-6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1-(-6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = -6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1 + (((tickAnim - 675) / 4) * (5.5-(-6.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 5.5 + (((tickAnim - 679) / 6) * (0-(5.5)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-14.1-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (0.17448-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -14.1 + (((tickAnim - 707) / 1) * (-17.25-(-14.1)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = 0.17448 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4-(0.17448)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -17.25 + (((tickAnim - 708) / 7) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 259 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 285) / 394) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 394) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 394) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (-8-(0)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 693) {
            xx = -8 + (((tickAnim - 685) / 8) * (3.5-(-8)));
            yy = 0 + (((tickAnim - 685) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 8) * (0-(0)));
        }
        else if (tickAnim >= 693 && tickAnim < 699) {
            xx = 3.5 + (((tickAnim - 693) / 6) * (21.75-(3.5)));
            yy = 0 + (((tickAnim - 693) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 693) / 6) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 21.75 + (((tickAnim - 699) / 5) * (-5.42-(21.75)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = -5.42 + (((tickAnim - 704) / 4) * (-13.75-(-5.42)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -13.75 + (((tickAnim - 708) / 7) * (-4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9-(-13.75)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6)));
        }
        else if (tickAnim >= 715 && tickAnim < 725) {
            xx = -4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9 + (((tickAnim - 715) / 10) * (-10.75-(-4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9)));
            yy = 0 + (((tickAnim - 715) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 10) * (0-(0)));
        }
        else if (tickAnim >= 725 && tickAnim < 733) {
            xx = -10.75 + (((tickAnim - 725) / 8) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 725) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 675 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 675) / 4) * (9.25-(0)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 683) {
            xx = 9.25 + (((tickAnim - 679) / 4) * (31.46-(9.25)));
            yy = 0 + (((tickAnim - 679) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 4) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 31.46 + (((tickAnim - 683) / 2) * (8.5-(31.46)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 8.5 + (((tickAnim - 685) / 14) * (6.25-(8.5)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 6.25 + (((tickAnim - 699) / 5) * (29.5-(6.25)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 29.5 + (((tickAnim - 704) / 4) * (0-(29.5)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 725) {
            xx = 0 + (((tickAnim - 715) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 715) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 10) * (0-(0)));
        }
        else if (tickAnim >= 725 && tickAnim < 728) {
            xx = 12.75 + (((tickAnim - 725) / 3) * (0-(12.75)));
            yy = 0 + (((tickAnim - 725) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 0) / 699) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 699) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 699) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 704) / 4) * (15.25-(0)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 15.25 + (((tickAnim - 708) / 7) * (0-(15.25)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 725) {
            xx = 0 + (((tickAnim - 715) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 715) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 10) * (0-(0)));
        }
        else if (tickAnim >= 725 && tickAnim < 733) {
            xx = 10.25 + (((tickAnim - 725) / 8) * (0-(10.25)));
            yy = 0 + (((tickAnim - 725) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 8) * (0-(0)));
        }
        else if (tickAnim >= 733 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 733) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 733) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 733) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 0) / 699) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 699) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 699) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 699) / 5) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 704) / 4) * (0.325-(-0.425)));
            zz = 0.1 + (((tickAnim - 704) / 4) * (0.75-(0.1)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0.325 + (((tickAnim - 708) / 7) * (0-(0.325)));
            zz = 0.75 + (((tickAnim - 708) / 7) * (0-(0.75)));
        }
        else if (tickAnim >= 715 && tickAnim < 733) {
            xx = 0 + (((tickAnim - 715) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 18) * (0-(0)));
        }
        else if (tickAnim >= 733 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 733) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 733) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 733) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYanornis entity = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 10) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 10) / 10) * (0-(25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 26.5 + (((tickAnim - 10) / 3) * (14.75-(26.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 13) / 7) * (0-(14.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 49 + (((tickAnim - 10) / 3) * (30.25-(49)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 30.25 + (((tickAnim - 13) / 7) * (0-(30.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.75 + (((tickAnim - 10) / 3) * (-0.5-(-38.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 13) / 7) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (33.75-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 33.75 + (((tickAnim - 10) / 3) * (0-(33.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.tertialsleft.setScale((float)1,(float)0,(float)1);


        this.tertialsright.setScale((float)1,(float)0,(float)1);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYanornis entity = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 38.5 + (((tickAnim - 8) / 8) * (0-(38.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 38.5 + (((tickAnim - 23) / 9) * (0-(38.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 38.5 + (((tickAnim - 39) / 11) * (0-(38.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 8) / 4) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -12.5 + (((tickAnim - 12) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 23) / 5) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 28) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 39) / 11) * (0-(24)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 8) / 4) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -41.75 + (((tickAnim - 12) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 23) / 5) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -41.75 + (((tickAnim - 28) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -17 + (((tickAnim - 39) / 6) * (-43.85-(-17)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -43.85 + (((tickAnim - 45) / 5) * (0-(-43.85)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 12) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 28) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0.525-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = 0.65 + (((tickAnim - 45) / 5) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);



        this.tertialsleft.setScale((float)1,(float)0,(float)1);


        this.tertialsright.setScale((float)1,(float)0,(float)1);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYanornis entity = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.94956-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.51444-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.17562-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.94956 + (((tickAnim - 20) / 10) * (21.94956-(21.94956)));
            yy = -0.51444 + (((tickAnim - 20) / 10) * (-0.51444-(-0.51444)));
            zz = 0.17562 + (((tickAnim - 20) / 10) * (0.17562-(0.17562)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21.94956 + (((tickAnim - 30) / 20) * (0-(21.94956)));
            yy = -0.51444 + (((tickAnim - 30) / 20) * (0-(-0.51444)));
            zz = 0.17562 + (((tickAnim - 30) / 20) * (0-(0.17562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.775-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -7.25 + (((tickAnim - 20) / 10) * (-7.25-(-7.25)));
            zz = 6.775 + (((tickAnim - 20) / 10) * (6.775-(6.775)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -7.25 + (((tickAnim - 30) / 20) * (0-(-7.25)));
            zz = 6.775 + (((tickAnim - 30) / 20) * (0-(6.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.5 + (((tickAnim - 20) / 10) * (34.5-(34.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 30) / 20) * (0-(34.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.35-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.85 + (((tickAnim - 20) / 10) * (2.85-(2.85)));
            zz = -2.35 + (((tickAnim - 20) / 10) * (-2.35-(-2.35)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.85 + (((tickAnim - 30) / 20) * (0-(2.85)));
            zz = -2.35 + (((tickAnim - 30) / 20) * (0-(-2.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-63.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -63.5 + (((tickAnim - 20) / 10) * (-63.5-(-63.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -63.5 + (((tickAnim - 30) / 20) * (0-(-63.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 20) / 10) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 30) / 20) * (0-(10.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.5 + (((tickAnim - 20) / 10) * (34.5-(34.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 30) / 20) * (0-(34.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.35-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.85 + (((tickAnim - 20) / 10) * (2.85-(2.85)));
            zz = -2.35 + (((tickAnim - 20) / 10) * (-2.35-(-2.35)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.85 + (((tickAnim - 30) / 20) * (0-(2.85)));
            zz = -2.35 + (((tickAnim - 30) / 20) * (0-(-2.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-63.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -63.5 + (((tickAnim - 20) / 10) * (-63.5-(-63.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -63.5 + (((tickAnim - 30) / 20) * (0-(-63.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 20) / 10) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 30) / 20) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));



        this.tertialsleft.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 10) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.75 + (((tickAnim - 30) / 20) * (0-(0.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));



        this.tertialsright.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYanornis entity = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.tertialsright.setScale((float)1,(float)0,(float)1);


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(9.9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (1.045-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1.4625-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 5) / 9) * (1-(1)));
            yy = 1.045 + (((tickAnim - 5) / 9) * (1-(1.045)));
            zz = 1.4625 + (((tickAnim - 5) / 9) * (0.5325-(1.4625)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 0.5325 + (((tickAnim - 14) / 6) * (1-(0.5325)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animLaunching(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYanornis entity = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(49.25), legleft.rotateAngleY + (float) Math.toRadians(0), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(-30.5), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(49.25), legright.rotateAngleY + (float) Math.toRadians(0), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(-30.5), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(-95.7780545587+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-10), armleft1.rotateAngleY + (float) Math.toRadians(-4.580149933+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*10), armleft1.rotateAngleZ + (float) Math.toRadians(-86.5938958994+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-20));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(107.9864869385+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-10), armleft2.rotateAngleY + (float) Math.toRadians(7.1722231079+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*20), armleft2.rotateAngleZ + (float) Math.toRadians(-2.9477));


        this.setRotateAngle(secondariesleft, secondariesleft.rotateAngleX + (float) Math.toRadians(-33), secondariesleft.rotateAngleY + (float) Math.toRadians(0), secondariesleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(secondariesleftfoldable, secondariesleftfoldable.rotateAngleX + (float) Math.toRadians(178.22302), secondariesleftfoldable.rotateAngleY + (float) Math.toRadians(-9.99529), secondariesleftfoldable.rotateAngleZ + (float) Math.toRadians(-179.69148));
        this.secondariesleftfoldable.rotationPointX = this.secondariesleftfoldable.rotationPointX + (float)(0);
        this.secondariesleftfoldable.rotationPointY = this.secondariesleftfoldable.rotationPointY - (float)(0);
        this.secondariesleftfoldable.rotationPointZ = this.secondariesleftfoldable.rotationPointZ + (float)(0.275);


        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(-95.4203), armleft3.rotateAngleY + (float) Math.toRadians(-5.2149709656+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*20), armleft3.rotateAngleZ + (float) Math.toRadians(-1.75001));


        this.setRotateAngle(primaryleft6, primaryleft6.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*15), primaryleft6.rotateAngleY + (float) Math.toRadians(0), primaryleft6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft5, primaryleft5.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-290))*5), primaryleft5.rotateAngleY + (float) Math.toRadians(0), primaryleft5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft4, primaryleft4.rotateAngleX + (float) Math.toRadians(15.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-270))*5), primaryleft4.rotateAngleY + (float) Math.toRadians(0), primaryleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft3, primaryleft3.rotateAngleX + (float) Math.toRadians(49.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*5), primaryleft3.rotateAngleY + (float) Math.toRadians(0), primaryleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft2, primaryleft2.rotateAngleX + (float) Math.toRadians(63.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-230))*5), primaryleft2.rotateAngleY + (float) Math.toRadians(0), primaryleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft1, primaryleft1.rotateAngleX + (float) Math.toRadians(70.75), primaryleft1.rotateAngleY + (float) Math.toRadians(0), primaryleft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(-95.7780545587+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-10), armright1.rotateAngleY + (float) Math.toRadians(4.580149933+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-10), armright1.rotateAngleZ + (float) Math.toRadians(86.5938958994+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*20));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(107.9864869385+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-10), armright2.rotateAngleY + (float) Math.toRadians(-7.1722231079+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-20), armright2.rotateAngleZ + (float) Math.toRadians(2.9477));


        this.setRotateAngle(secondariesright, secondariesright.rotateAngleX + (float) Math.toRadians(-33), secondariesright.rotateAngleY + (float) Math.toRadians(0), secondariesright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(secondariesrightfoldable, secondariesrightfoldable.rotateAngleX + (float) Math.toRadians(178.22302), secondariesrightfoldable.rotateAngleY + (float) Math.toRadians(9.99529), secondariesrightfoldable.rotateAngleZ + (float) Math.toRadians(179.69148));
        this.secondariesrightfoldable.rotationPointX = this.secondariesrightfoldable.rotationPointX + (float)(0);
        this.secondariesrightfoldable.rotationPointY = this.secondariesrightfoldable.rotationPointY - (float)(0);
        this.secondariesrightfoldable.rotationPointZ = this.secondariesrightfoldable.rotationPointZ + (float)(0.275);


        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(-95.4203), armright3.rotateAngleY + (float) Math.toRadians(5.2149709656+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-20), armright3.rotateAngleZ + (float) Math.toRadians(1.75001));


        this.setRotateAngle(primaryright6, primaryright6.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*15), primaryright6.rotateAngleY + (float) Math.toRadians(0), primaryright6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright5, primaryright5.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-290))*5), primaryright5.rotateAngleY + (float) Math.toRadians(0), primaryright5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright4, primaryright4.rotateAngleX + (float) Math.toRadians(15.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-270))*5), primaryright4.rotateAngleY + (float) Math.toRadians(0), primaryright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright3, primaryright3.rotateAngleX + (float) Math.toRadians(49.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*5), primaryright3.rotateAngleY + (float) Math.toRadians(0), primaryright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright2, primaryright2.rotateAngleX + (float) Math.toRadians(63.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-230))*5), primaryright2.rotateAngleY + (float) Math.toRadians(0), primaryright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright1, primaryright1.rotateAngleX + (float) Math.toRadians(70.75), primaryright1.rotateAngleY + (float) Math.toRadians(0), primaryright1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(25.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+200))*3.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(17+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+250))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-55.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+350))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(51.25), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0.95);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(1.3);
        this.throat.setScale((float)1,(float)1.3,(float)1);


        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2), base.rotateAngleY + (float) Math.toRadians(-4.58015), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-40))*-1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*5), tailFeathers.rotateAngleY + (float) Math.toRadians(0), tailFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft7, primaryleft7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*15), primaryleft7.rotateAngleY + (float) Math.toRadians(0), primaryleft7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright7, primaryright7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*15), primaryright7.rotateAngleY + (float) Math.toRadians(0), primaryright7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+300))*2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYanornis entity = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(49.25), legleft.rotateAngleY + (float) Math.toRadians(0), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(-30.5), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(49.25), legright.rotateAngleY + (float) Math.toRadians(0), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(-30.5), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(-95.7780545587+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-15), armleft1.rotateAngleY + (float) Math.toRadians(-4.580149933+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*15), armleft1.rotateAngleZ + (float) Math.toRadians(-86.5938958994+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-35));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(107.9864869385+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-10), armleft2.rotateAngleY + (float) Math.toRadians(7.1722231079+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*20), armleft2.rotateAngleZ + (float) Math.toRadians(-2.9477));


        this.setRotateAngle(secondariesleft, secondariesleft.rotateAngleX + (float) Math.toRadians(-33), secondariesleft.rotateAngleY + (float) Math.toRadians(0), secondariesleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(secondariesleftfoldable, secondariesleftfoldable.rotateAngleX + (float) Math.toRadians(178.22302), secondariesleftfoldable.rotateAngleY + (float) Math.toRadians(-9.99529), secondariesleftfoldable.rotateAngleZ + (float) Math.toRadians(-179.69148));
        this.secondariesleftfoldable.rotationPointX = this.secondariesleftfoldable.rotationPointX + (float)(0);
        this.secondariesleftfoldable.rotationPointY = this.secondariesleftfoldable.rotationPointY - (float)(0);
        this.secondariesleftfoldable.rotationPointZ = this.secondariesleftfoldable.rotationPointZ + (float)(0.275);


        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(-95.4203), armleft3.rotateAngleY + (float) Math.toRadians(-5.2149709656+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*20), armleft3.rotateAngleZ + (float) Math.toRadians(-1.75001));


        this.setRotateAngle(primaryleft6, primaryleft6.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*15), primaryleft6.rotateAngleY + (float) Math.toRadians(0), primaryleft6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft5, primaryleft5.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-290))*5), primaryleft5.rotateAngleY + (float) Math.toRadians(0), primaryleft5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft4, primaryleft4.rotateAngleX + (float) Math.toRadians(15.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-270))*5), primaryleft4.rotateAngleY + (float) Math.toRadians(0), primaryleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft3, primaryleft3.rotateAngleX + (float) Math.toRadians(49.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*5), primaryleft3.rotateAngleY + (float) Math.toRadians(0), primaryleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft2, primaryleft2.rotateAngleX + (float) Math.toRadians(63.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-230))*5), primaryleft2.rotateAngleY + (float) Math.toRadians(0), primaryleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft1, primaryleft1.rotateAngleX + (float) Math.toRadians(70.75), primaryleft1.rotateAngleY + (float) Math.toRadians(0), primaryleft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(-95.7780545587+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-15), armright1.rotateAngleY + (float) Math.toRadians(4.580149933+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-15), armright1.rotateAngleZ + (float) Math.toRadians(86.5938958994+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*35));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(107.9864869385+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-10), armright2.rotateAngleY + (float) Math.toRadians(-7.1722231079+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-20), armright2.rotateAngleZ + (float) Math.toRadians(2.9477));


        this.setRotateAngle(secondariesright, secondariesright.rotateAngleX + (float) Math.toRadians(-33), secondariesright.rotateAngleY + (float) Math.toRadians(0), secondariesright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(secondariesrightfoldable, secondariesrightfoldable.rotateAngleX + (float) Math.toRadians(178.22302), secondariesrightfoldable.rotateAngleY + (float) Math.toRadians(9.99529), secondariesrightfoldable.rotateAngleZ + (float) Math.toRadians(179.69148));
        this.secondariesrightfoldable.rotationPointX = this.secondariesrightfoldable.rotationPointX + (float)(0);
        this.secondariesrightfoldable.rotationPointY = this.secondariesrightfoldable.rotationPointY - (float)(0);
        this.secondariesrightfoldable.rotationPointZ = this.secondariesrightfoldable.rotationPointZ + (float)(0.275);


        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(-95.4203), armright3.rotateAngleY + (float) Math.toRadians(5.2149709656+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-20), armright3.rotateAngleZ + (float) Math.toRadians(1.75001));


        this.setRotateAngle(primaryright6, primaryright6.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*15), primaryright6.rotateAngleY + (float) Math.toRadians(0), primaryright6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright5, primaryright5.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-290))*5), primaryright5.rotateAngleY + (float) Math.toRadians(0), primaryright5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright4, primaryright4.rotateAngleX + (float) Math.toRadians(15.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-270))*5), primaryright4.rotateAngleY + (float) Math.toRadians(0), primaryright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright3, primaryright3.rotateAngleX + (float) Math.toRadians(49.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*5), primaryright3.rotateAngleY + (float) Math.toRadians(0), primaryright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright2, primaryright2.rotateAngleX + (float) Math.toRadians(63.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-230))*5), primaryright2.rotateAngleY + (float) Math.toRadians(0), primaryright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright1, primaryright1.rotateAngleX + (float) Math.toRadians(70.75), primaryright1.rotateAngleY + (float) Math.toRadians(0), primaryright1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(25.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+200))*3.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(29.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+250))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+350))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(51.25), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0.95);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(1.3);
        this.throat.setScale((float)1,(float)1.3,(float)1);


        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-32.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2), base.rotateAngleY + (float) Math.toRadians(-4.58015), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0.975+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-1.5);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(-2.95);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*5), tailFeathers.rotateAngleY + (float) Math.toRadians(0), tailFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft7, primaryleft7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*15), primaryleft7.rotateAngleY + (float) Math.toRadians(0), primaryleft7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright7, primaryright7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*15), primaryright7.rotateAngleY + (float) Math.toRadians(0), primaryright7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(28.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+300))*2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYanornis entity = (EntityPrehistoricFloraYanornis) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-150))*-1), base.rotateAngleY + (float) Math.toRadians(0), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-150))*0.5);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-200))*-0.8);



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -35 + (((tickAnim - 0) / 14) * (35.75-(-35)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 35.75 + (((tickAnim - 14) / 14) * (-35-(35.75)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 20 + (((tickAnim - 0) / 14) * (0-(20)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (-33.62-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -33.62 + (((tickAnim - 19) / 5) * (-29.88-(-33.62)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -29.88 + (((tickAnim - 24) / 4) * (20-(-29.88)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.25 + (((tickAnim - 0) / 6) * (-7.29-(15.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -7.29 + (((tickAnim - 6) / 8) * (24.25-(-7.29)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 24.25 + (((tickAnim - 14) / 5) * (57.62-(24.25)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 57.62 + (((tickAnim - 19) / 5) * (57.90452-(57.62)));
            yy = 0 + (((tickAnim - 19) / 5) * (-0.57258-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (-0.39697-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 57.90452 + (((tickAnim - 24) / 4) * (15.25-(57.90452)));
            yy = -0.57258 + (((tickAnim - 24) / 4) * (0-(-0.57258)));
            zz = -0.39697 + (((tickAnim - 24) / 4) * (0-(-0.39697)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 6) * (0.3-(0.575)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 6) / 22) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 22) * (0.575-(0.3)));
            zz = 0 + (((tickAnim - 6) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 35.75 + (((tickAnim - 0) / 13) * (-35-(35.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -35 + (((tickAnim - 13) / 15) * (35.75-(-35)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-33.62-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -33.62 + (((tickAnim - 5) / 5) * (-29.88-(-33.62)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -29.88 + (((tickAnim - 10) / 3) * (20-(-29.88)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 20 + (((tickAnim - 13) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 24.25 + (((tickAnim - 0) / 5) * (57.62-(24.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 57.62 + (((tickAnim - 5) / 5) * (57.90452-(57.62)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.57258-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.39697-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 57.90452 + (((tickAnim - 10) / 3) * (15.25-(57.90452)));
            yy = -0.57258 + (((tickAnim - 10) / 3) * (0-(-0.57258)));
            zz = -0.39697 + (((tickAnim - 10) / 3) * (0-(-0.39697)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 15.25 + (((tickAnim - 13) / 6) * (-7.04-(15.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -7.04 + (((tickAnim - 19) / 9) * (24.25-(-7.04)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.575 + (((tickAnim - 13) / 6) * (0.5-(0.575)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0.5 + (((tickAnim - 19) / 9) * (0-(0.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-80))*3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-150))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-200))*2), tailFeathers.rotateAngleY + (float) Math.toRadians(0), tailFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-210))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-230))*2), armleft1.rotateAngleY + (float) Math.toRadians(0), armleft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-230))*2), armright1.rotateAngleY + (float) Math.toRadians(0), armright1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-300))*3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-350))*-3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-400))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-450))*3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*261/0.5-500))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.tertialsleft.setScale((float)1,(float)0,(float)1);


        this.tertialsright.setScale((float)1,(float)0,(float)1);


        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0.175);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
