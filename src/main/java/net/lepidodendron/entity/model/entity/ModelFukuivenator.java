package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuivenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFukuivenator extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private ModelAnimator animator;

    public ModelFukuivenator() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 10.85F, 1.75F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 1.325F, 0.2F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 33, -3.0F, -4.0F, -1.0F, 4, 2, 5, 0.015F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 1.3F, -0.2F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 24, -3.0F, -4.0F, -1.0F, 4, 4, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 3.9F, 0.0F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -3.0F, -4.0F, -1.0F, 4, 4, 5, -0.01F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-2.0F, -0.6F, 1.5F);
        this.hip.addChild(legright);
        this.setRotateAngle(legright, -0.3054F, 0.0F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 0, -1.0F, -0.9F, -1.0F, 2, 6, 3, 0.0F, false));
        this.legright.cubeList.add(new ModelBox(legright, 21, 2, -0.6F, -0.9F, 2.0F, 0, 6, 1, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 5.0F, -0.3F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.8465F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 23, -1.0F, -0.5F, -0.4F, 2, 7, 2, -0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 6.45F, 0.8F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, -0.7418F, 0.0F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 36, 49, -1.0F, -0.75F, -0.6F, 2, 4, 1, -0.02F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(0.0F, 3.25F, 0.0F);
        this.legright3.addChild(legright4);
        this.setRotateAngle(legright4, 0.192F, 0.0F, 0.0F);
        this.legright4.cubeList.add(new ModelBox(legright4, 38, 28, -1.5F, -0.25F, -3.6F, 3, 1, 4, 0.01F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(2.0F, -0.6F, 1.5F);
        this.hip.addChild(legleft);
        this.setRotateAngle(legleft, -0.3054F, 0.0F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 0, -1.0F, -0.9F, -1.0F, 2, 6, 3, 0.0F, true));
        this.legleft.cubeList.add(new ModelBox(legleft, 21, 2, 0.6F, -0.9F, 2.0F, 0, 6, 1, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 5.0F, -0.3F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.8465F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 23, -1.0F, -0.5F, -0.4F, 2, 7, 2, -0.01F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 6.45F, 0.8F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.7418F, 0.0F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 36, 49, -1.0F, -0.75F, -0.6F, 2, 4, 1, -0.02F, true));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.0F, 3.25F, 0.0F);
        this.legleft3.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.192F, 0.0F, 0.0F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 38, 28, -1.5F, -0.25F, -3.6F, 3, 1, 4, 0.01F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.7F, 4.3F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 18, 33, -1.5F, -1.0F, -0.5F, 3, 3, 5, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 33, 22, -1.5F, 2.0F, -0.5F, 3, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 3, -1.0F, -0.75F, -0.5F, 2, 2, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 13, -1.0F, 1.25F, -0.5F, 2, 1, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 14, -0.5F, -0.5F, -0.25F, 1, 1, 9, 0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 13, -2.0F, 0.0F, 2.75F, 4, 0, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 41, -0.5F, 0.5F, -0.25F, 1, 1, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 23, -0.5F, -0.5F, -0.5F, 1, 1, 9, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -2.5F, 0.0F, 0.0F, 5, 0, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, 0.05F);
        this.hip.addChild(body);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -0.125F, -4.3F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 41, -3.0F, -2.0F, -1.0F, 4, 1, 3, 0.015F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.0F, -4.5F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 41, -3.0F, -2.0F, -1.0F, 4, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 4.05F, -6.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2007F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 11, -3.0F, -6.0F, 0.0F, 5, 6, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2F, -1.85F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0087F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 14, -2.0F, -2.0F, -1.0F, 4, 2, 3, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.125F, -2.05F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 39, -2.0F, -2.0F, -1.0F, 4, 2, 3, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.65F, -6.0F);
        this.body.addChild(chest);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 1.25F, -0.55F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 9, -3.0F, -2.0F, -1.0F, 4, 2, 3, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 1.4F, -0.7F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 40, -3.0F, -2.0F, -1.0F, 4, 2, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 3.1F, -2.25F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 33, -3.0F, -3.0F, -1.0F, 4, 3, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 3.4F, -2.45F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6981F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 0, -3.0F, -2.0F, -0.975F, 4, 2, 3, -0.01F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(2.0F, 3.7F, -1.4F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 1.1781F, 0.2618F, 0.0F);
        this.armleft.cubeList.add(new ModelBox(armleft, 0, 50, -0.5F, 0.0F, -0.55F, 1, 4, 1, 0.0F, true));
        this.armleft.cubeList.add(new ModelBox(armleft, 29, 0, -0.5F, 0.0F, -0.15F, 1, 4, 1, -0.01F, true));
        this.armleft.cubeList.add(new ModelBox(armleft, 0, 6, 0.425F, 0.0F, -0.4F, 0, 6, 3, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.0F, 3.8F, 0.55F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -2.0071F, 0.0F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 33, 22, -0.5F, 0.0F, -0.8F, 1, 4, 1, 0.01F, true));
        this.armleft2.cubeList.add(new ModelBox(armleft2, 30, 46, 0.4F, -1.0F, 0.2F, 0, 5, 3, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.25F, 4.0F, -0.3F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.6694F, 0.0249F, 0.0045F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 42, 49, -1.0F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.025F, 0.0F, 0.6F);
        this.armleft3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 33, -1.0F, -0.4F, -1.0F, 1, 4, 1, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.025F, 0.0F, -0.5F);
        this.armleft3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 28, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.025F, 0.5F, -0.25F);
        this.armleft3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.4835F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 18, -1.0F, -4.0F, -1.0F, 0, 4, 6, 0.0F, true));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-2.0F, 3.7F, -1.4F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 1.1781F, -0.2618F, 0.0F);
        this.armright.cubeList.add(new ModelBox(armright, 0, 50, -0.5F, 0.0F, -0.55F, 1, 4, 1, 0.0F, false));
        this.armright.cubeList.add(new ModelBox(armright, 29, 0, -0.5F, 0.0F, -0.15F, 1, 4, 1, -0.01F, false));
        this.armright.cubeList.add(new ModelBox(armright, 0, 6, -0.425F, 0.0F, -0.4F, 0, 6, 3, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.0F, 3.8F, 0.55F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, -2.0071F, 0.0F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 33, 22, -0.5F, 0.0F, -0.8F, 1, 4, 1, 0.01F, false));
        this.armright2.cubeList.add(new ModelBox(armright2, 30, 46, -0.4F, -1.0F, 0.2F, 0, 5, 3, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-0.25F, 4.0F, -0.3F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.6694F, -0.0249F, -0.0045F);
        this.armright3.cubeList.add(new ModelBox(armright3, 42, 49, 0.0F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.025F, 0.0F, 0.6F);
        this.armright3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 33, 0.0F, -0.4F, -1.0F, 1, 4, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.025F, 0.0F, -0.5F);
        this.armright3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 28, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.025F, 0.5F, -0.25F);
        this.armright3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.4835F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 18, 1.0F, -4.0F, -1.0F, 0, 4, 6, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.0F, -2.95F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1309F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 45, 36, -1.0F, -1.0F, -2.25F, 2, 2, 3, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.4F, -1.3F);
        this.neck1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 47, 46, -1.0F, -1.0F, -1.0F, 2, 1, 3, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.4F, -1.55F);
        this.neck1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 11, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.02F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.05F, -2.05F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.6109F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 10, 45, -1.0F, -0.9F, -2.5F, 2, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.275F, -1.7F);
        this.neck2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2007F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 46, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.021F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2182F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 45, -1.0F, -0.9F, -2.5F, 2, 2, 3, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.1F, -1.3F);
        this.neck3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2182F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 5, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.022F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.1F, -2.425F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.6109F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 13, 33, -1.0F, -0.9F, -2.5F, 2, 2, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -0.025F, -1.45F);
        this.neck4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 42, 45, -1.0F, -1.0F, 1.0F, 1, 0, 1, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 41, 46, -1.5F, -1.0F, -1.0F, 2, 1, 2, 0.015F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.1F, -0.5F);
        this.neck4.addChild(throat);
        this.setRotateAngle(throat, 0.2618F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 21, 0, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -2.5F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 11, 40, -1.0F, -0.95F, -0.6F, 2, 2, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 9, -1.0F, 0.05F, -1.6F, 2, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 0, -0.5F, -0.775F, -1.925F, 1, 1, 1, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.775F, -3.125F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3796F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 49, 30, 0.0F, -1.005F, -1.3F, 1, 1, 3, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.625F, 1.15F, -3.6F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.1222F, 0.0305F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 13, -0.125F, -0.85F, -1.0F, 0, 1, 3, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 44, 19, -1.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.625F, 1.15F, -3.6F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, -0.1222F, -0.0305F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 13, 0.125F, -0.85F, -1.0F, 0, 1, 3, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 44, 19, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 1.15F, -3.6F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 44, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.4F, -0.625F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0698F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 19, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.02F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.95F, -0.6F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 19, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.05F, 0.4F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 33, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 13, -0.725F, -1.4F, -1.8F, 1, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 13, -0.275F, -1.4F, -1.8F, 1, 1, 2, -0.01F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 25, -0.5F, -0.5F, -4.95F, 1, 1, 3, -0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.6F, 0.275F, -3.9F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.1222F, 0.0305F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 12, -0.125F, -0.85F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.5F, -4.95F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.1265F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 11, 28, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.02F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 0.5F, -4.95F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.1265F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 28, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.02F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.6F, 0.275F, -3.9F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.1222F, -0.0305F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 12, 0.125F, -0.85F, -1.0F, 0, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.offsetY = -0.01F;
        this.body.offsetZ = -0.03F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hip.offsetY = 0.295F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = 0.1F;
        this.hip.offsetX = 0.2F;
        this.hip.offsetZ = 2.0F;
        this.hip.rotateAngleY = (float)Math.toRadians(240);
        this.hip.rotateAngleX = (float)Math.toRadians(-0);
        this.hip.rotateAngleZ = (float)Math.toRadians(3);
        this.hip.scaleChildren = true;
        float scaler = 0.575F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraFukuivenator EntityMegalosaurus = (EntityPrehistoricFloraFukuivenator) e;
//        this.hip.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.armleft, this.armleft2, this.armleft3};
        AdvancedModelRenderer[] ArmR = {this.armright, this.armright2, this.armright3};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.jaw, 0.1F, -0.05F, false, 3F, 0.05F, f2, 1F);

                    this.walk(this.armleft, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.armright, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.armleft, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.armright, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraFukuivenator ee = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;

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
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12 + (((tickAnim - 3) / 4) * (2.75-(12)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 2.75 + (((tickAnim - 7) / 3) * (0-(2.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.35-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -0.35 + (((tickAnim - 7) / 3) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -9 + (((tickAnim - 3) / 4) * (9.5-(-9)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 9.5 + (((tickAnim - 7) / 3) * (0-(9.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 3) / 4) * (0-(-0.1)));
            zz = 0.2 + (((tickAnim - 3) / 4) * (-0.2-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -0.2 + (((tickAnim - 7) / 3) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -19.5 + (((tickAnim - 3) / 4) * (8.25-(-19.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 8.25 + (((tickAnim - 7) / 3) * (0-(8.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 4) * (0.05-(0.125)));
            zz = 0.2 + (((tickAnim - 3) / 4) * (-0.3-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 7) / 3) * (0-(0.05)));
            zz = -0.3 + (((tickAnim - 7) / 3) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 21 + (((tickAnim - 3) / 4) * (-11.5-(21)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -11.5 + (((tickAnim - 7) / 3) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.05 + (((tickAnim - 3) / 4) * (0-(0.05)));
            zz = 0.275 + (((tickAnim - 3) / 4) * (0-(0.275)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -9.25 + (((tickAnim - 3) / 4) * (-15.75-(-9.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.75 + (((tickAnim - 7) / 3) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 10.5 + (((tickAnim - 3) / 4) * (29.5-(10.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 29.5 + (((tickAnim - 7) / 1) * (0-(29.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.5 + (((tickAnim - 10) / 10) * (0-(16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.19432-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.21862-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.33407-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.19432 + (((tickAnim - 10) / 10) * (0-(15.19432)));
            yy = -1.21862 + (((tickAnim - 10) / 10) * (0-(-1.21862)));
            zz = 0.33407 + (((tickAnim - 10) / 10) * (0-(0.33407)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 24 + (((tickAnim - 10) / 10) * (0-(24)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 10) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 31.75 + (((tickAnim - 5) / 3) * (28.83-(31.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28.83 + (((tickAnim - 8) / 2) * (0-(28.83)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.21-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.21 + (((tickAnim - 8) / 2) * (27.25-(6.21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.25 + (((tickAnim - 10) / 10) * (0-(27.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.425-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.425 + (((tickAnim - 10) / 10) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 3.75 + (((tickAnim - 5) / 3) * (-11.75-(3.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.75 + (((tickAnim - 8) / 2) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
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
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 65.79 + (((tickAnim - 3) / 5) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 68.5 + (((tickAnim - 8) / 4) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 55.5 + (((tickAnim - 12) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 65.79 + (((tickAnim - 19) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 68.5 + (((tickAnim - 23) / 5) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 55.5 + (((tickAnim - 28) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 65.79 + (((tickAnim - 35) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 68.5 + (((tickAnim - 39) / 11) * (0-(68.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 2) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 2) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 5) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 3) / 5) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 4) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 8) / 4) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 12) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 12) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 18) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 18) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 19) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 19) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 5) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 23) / 5) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 28) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 28) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0.875-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-0.28-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 33) / 2) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 33) / 2) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 35) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 35) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 39) / 11) * (0-(0.975)));
            zz = -0.375 + (((tickAnim - 39) / 11) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft4.rotationPointX = this.legleft4.rotationPointX + (float)(xx);
        this.legleft4.rotationPointY = this.legleft4.rotationPointY - (float)(yy);
        this.legleft4.rotationPointZ = this.legleft4.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -14.5 + (((tickAnim - 15) / 20) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
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
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.75 + (((tickAnim - 15) / 20) * (-5.75-(-5.75)));
            zz = 2.75 + (((tickAnim - 15) / 20) * (2.75-(2.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.75 + (((tickAnim - 35) / 15) * (0-(-5.75)));
            zz = 2.75 + (((tickAnim - 35) / 15) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -26.75 + (((tickAnim - 15) / 20) * (-26.75-(-26.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -26.75 + (((tickAnim - 35) / 15) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (43-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 43 + (((tickAnim - 15) / 20) * (43-(43)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 43 + (((tickAnim - 35) / 15) * (0-(43)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-84-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -84 + (((tickAnim - 15) / 20) * (-84-(-84)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -84 + (((tickAnim - 35) / 15) * (0-(-84)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.175-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.175 + (((tickAnim - 15) / 20) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.175 + (((tickAnim - 35) / 15) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (81.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 81.25 + (((tickAnim - 15) / 20) * (81.25-(81.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 81.25 + (((tickAnim - 35) / 15) * (0-(81.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -26.75 + (((tickAnim - 15) / 20) * (-26.75-(-26.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -26.75 + (((tickAnim - 35) / 15) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (43-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 43 + (((tickAnim - 15) / 20) * (43-(43)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 43 + (((tickAnim - 35) / 15) * (0-(43)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-84-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -84 + (((tickAnim - 15) / 20) * (-84-(-84)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -84 + (((tickAnim - 35) / 15) * (0-(-84)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.175-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.175 + (((tickAnim - 15) / 20) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.175 + (((tickAnim - 35) / 15) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (81.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 81.25 + (((tickAnim - 15) / 20) * (81.25-(81.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 81.25 + (((tickAnim - 35) / 15) * (0-(81.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10.25 + (((tickAnim - 15) / 20) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 35) / 15) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 15) / 20) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 23.5 + (((tickAnim - 15) / 20) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23.5 + (((tickAnim - 35) / 15) * (0-(23.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10 + (((tickAnim - 15) / 20) * (-10-(-10)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 35) / 15) * (0-(-10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.25 + (((tickAnim - 15) / 20) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 35) / 15) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.5 + (((tickAnim - 15) / 20) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 35) / 15) * (0-(24.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -29 + (((tickAnim - 15) / 20) * (-29-(-29)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29 + (((tickAnim - 35) / 15) * (0-(-29)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.5 + (((tickAnim - 15) / 20) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 35) / 15) * (0-(24.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -29 + (((tickAnim - 15) / 20) * (-29-(-29)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29 + (((tickAnim - 35) / 15) * (0-(-29)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13 + (((tickAnim - 15) / 20) * (-13-(-13)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 35) / 15) * (0-(-13)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 32.5 + (((tickAnim - 15) / 20) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 32.5 + (((tickAnim - 35) / 15) * (0-(32.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 18.75 + (((tickAnim - 15) / 20) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 35) / 15) * (0-(18.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 13) / 17) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -18.75 + (((tickAnim - 13) / 17) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.4-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = -0.05 + (((tickAnim - 13) / 17) * (0-(-0.05)));
            zz = 0.4 + (((tickAnim - 13) / 17) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -24.75 + (((tickAnim - 13) / 17) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 17) * (0-(0.15)));
            zz = 0.275 + (((tickAnim - 13) / 17) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (40.7382-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.62753-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.31844-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 40.7382 + (((tickAnim - 13) / 17) * (0-(40.7382)));
            yy = -4.62753 + (((tickAnim - 13) / 17) * (0-(-4.62753)));
            zz = 3.31844 + (((tickAnim - 13) / 17) * (0-(3.31844)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.675-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 17) * (0-(0.15)));
            zz = 0.675 + (((tickAnim - 13) / 17) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 13) / 17) * (0-(27.5)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -28.25 + (((tickAnim - 60) / 11) * (-12.25-(-28.25)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = -12.25 + (((tickAnim - 71) / 34) * (-28.25-(-12.25)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = -28.25 + (((tickAnim - 105) / 13) * (-12.25-(-28.25)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = -12.25 + (((tickAnim - 118) / 32) * (-28.25-(-12.25)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -28.25 + (((tickAnim - 150) / 20) * (0-(-28.25)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 18.75 + (((tickAnim - 60) / 11) * (0-(18.75)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 71) / 34) * (18.75-(0)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 18.75 + (((tickAnim - 105) / 13) * (0-(18.75)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 118) / 32) * (18.75-(0)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 18.75 + (((tickAnim - 150) / 20) * (0-(18.75)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 14.5 + (((tickAnim - 60) / 11) * (11.25-(14.5)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = 11.25 + (((tickAnim - 71) / 34) * (14.5-(11.25)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 14.5 + (((tickAnim - 105) / 13) * (11.25-(14.5)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 11.25 + (((tickAnim - 118) / 32) * (14.5-(11.25)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 14.5 + (((tickAnim - 150) / 20) * (0-(14.5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (13.25-(0)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = 13.25 + (((tickAnim - 71) / 34) * (0-(13.25)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 105) / 13) * (13.25-(0)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 13.25 + (((tickAnim - 118) / 32) * (0-(13.25)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -5 + (((tickAnim - 60) / 11) * (-11.25-(-5)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = -11.25 + (((tickAnim - 71) / 34) * (-5-(-11.25)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = -5 + (((tickAnim - 105) / 13) * (-11.25-(-5)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = -11.25 + (((tickAnim - 118) / 32) * (-5-(-11.25)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -5 + (((tickAnim - 150) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            yy = -0.125 + (((tickAnim - 71) / 47) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 71) / 47) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = -0.125 + (((tickAnim - 118) / 52) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright4.rotationPointX = this.legright4.rotationPointX + (float)(xx);
        this.legright4.rotationPointY = this.legright4.rotationPointY - (float)(yy);
        this.legright4.rotationPointZ = this.legright4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 18.75 + (((tickAnim - 60) / 11) * (0-(18.75)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 71) / 34) * (18.75-(0)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 18.75 + (((tickAnim - 105) / 13) * (0-(18.75)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 118) / 32) * (18.75-(0)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 18.75 + (((tickAnim - 150) / 20) * (0-(18.75)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 14.5 + (((tickAnim - 60) / 11) * (11.25-(14.5)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = 11.25 + (((tickAnim - 71) / 34) * (14.5-(11.25)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 14.5 + (((tickAnim - 105) / 13) * (11.25-(14.5)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 11.25 + (((tickAnim - 118) / 32) * (14.5-(11.25)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 14.5 + (((tickAnim - 150) / 20) * (0-(14.5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (13.25-(0)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = 13.25 + (((tickAnim - 71) / 34) * (0-(13.25)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 105) / 13) * (13.25-(0)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 13.25 + (((tickAnim - 118) / 32) * (0-(13.25)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -5 + (((tickAnim - 60) / 11) * (-11.25-(-5)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = -11.25 + (((tickAnim - 71) / 34) * (-5-(-11.25)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = -5 + (((tickAnim - 105) / 13) * (-11.25-(-5)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = -11.25 + (((tickAnim - 118) / 32) * (-5-(-11.25)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -5 + (((tickAnim - 150) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 71 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            yy = -0.125 + (((tickAnim - 71) / 47) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 71) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft4.rotationPointX = this.legleft4.rotationPointX + (float)(xx);
        this.legleft4.rotationPointY = this.legleft4.rotationPointY - (float)(yy);
        this.legleft4.rotationPointZ = this.legleft4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 3.5 + (((tickAnim - 60) / 11) * (15.5-(3.5)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = 15.5 + (((tickAnim - 71) / 34) * (3.5-(15.5)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 3.5 + (((tickAnim - 105) / 13) * (15.5-(3.5)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 15.5 + (((tickAnim - 118) / 32) * (3.5-(15.5)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 3.5 + (((tickAnim - 150) / 20) * (0-(3.5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (-0.475-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            zz = -0.475 + (((tickAnim - 71) / 47) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = -0.475 + (((tickAnim - 118) / 52) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (16.15642-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-3.03339-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-1.94043-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 16.15642 + (((tickAnim - 60) / 45) * (16.15642-(16.15642)));
            yy = -3.03339 + (((tickAnim - 60) / 45) * (-3.03339-(-3.03339)));
            zz = -1.94043 + (((tickAnim - 60) / 45) * (-1.94043-(-1.94043)));
        }
        else if (tickAnim >= 105 && tickAnim < 150) {
            xx = 16.15642 + (((tickAnim - 105) / 45) * (16.15642-(16.15642)));
            yy = -3.03339 + (((tickAnim - 105) / 45) * (-3.03339-(-3.03339)));
            zz = -1.94043 + (((tickAnim - 105) / 45) * (-1.94043-(-1.94043)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 16.15642 + (((tickAnim - 150) / 20) * (0-(16.15642)));
            yy = -3.03339 + (((tickAnim - 150) / 20) * (0-(-3.03339)));
            zz = -1.94043 + (((tickAnim - 150) / 20) * (0-(-1.94043)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (-0.4-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            zz = -0.4 + (((tickAnim - 71) / 47) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = -0.4 + (((tickAnim - 118) / 52) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 13.25 + (((tickAnim - 60) / 11) * (49.5-(13.25)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 105) {
            xx = 49.5 + (((tickAnim - 71) / 34) * (13.25-(49.5)));
            yy = 0 + (((tickAnim - 71) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 34) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 13.25 + (((tickAnim - 105) / 13) * (49.5-(13.25)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 49.5 + (((tickAnim - 118) / 32) * (13.25-(49.5)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 13.25 + (((tickAnim - 150) / 20) * (0-(13.25)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 61 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 61) / 4) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 61) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 4) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = -34.75 + (((tickAnim - 65) / 5) * (13.75-(-34.75)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 81) {
            xx = 13.75 + (((tickAnim - 70) / 11) * (21.34-(13.75)));
            yy = 0 + (((tickAnim - 70) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 11) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 106) {
            xx = 21.34 + (((tickAnim - 81) / 25) * (0-(21.34)));
            yy = 0 + (((tickAnim - 81) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 25) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 106) / 4) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 106) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 4) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -34.75 + (((tickAnim - 110) / 5) * (13.75-(-34.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 13.75 + (((tickAnim - 115) / 16) * (21.34-(13.75)));
            yy = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 150) {
            xx = 21.34 + (((tickAnim - 131) / 19) * (0-(21.34)));
            yy = 0 + (((tickAnim - 131) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (-8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = -8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*1 + (((tickAnim - 61) / 10) * (0-(-8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*1)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 71) / 35) * (-8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*1-(0)));
            yy = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = -8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*1 + (((tickAnim - 106) / 12) * (0-(-8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*1)));
            yy = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 12) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0.775-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 61) / 10) * (0-(-0.175)));
            zz = 0.775 + (((tickAnim - 61) / 10) * (0-(0.775)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 35) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (0.775-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 106) / 12) * (0-(-0.175)));
            zz = 0.775 + (((tickAnim - 106) / 12) * (0-(0.775)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (-9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = -9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*1 + (((tickAnim - 61) / 10) * (-19-(-9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*1)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = -19 + (((tickAnim - 71) / 35) * (-9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*1-(-19)));
            yy = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = -9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*1 + (((tickAnim - 106) / 12) * (-19-(-9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*1)));
            yy = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 12) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = -19 + (((tickAnim - 118) / 52) * (0-(-19)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0.85-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 61) / 10) * (-0.25-(-0.175)));
            zz = 0.85 + (((tickAnim - 61) / 10) * (1.475-(0.85)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            yy = -0.25 + (((tickAnim - 71) / 35) * (-0.175-(-0.25)));
            zz = 1.475 + (((tickAnim - 71) / 35) * (0.85-(1.475)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 106) / 12) * (-0.25-(-0.175)));
            zz = 0.85 + (((tickAnim - 106) / 12) * (1.475-(0.85)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = -0.25 + (((tickAnim - 118) / 52) * (0-(-0.25)));
            zz = 1.475 + (((tickAnim - 118) / 52) * (0-(1.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (-30.84657-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (51.21489-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (-57.72875-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = -30.84657 + (((tickAnim - 61) / 10) * (17.45997-(-30.84657)));
            yy = 51.21489 + (((tickAnim - 61) / 10) * (11.35668-(51.21489)));
            zz = -57.72875 + (((tickAnim - 61) / 10) * (41.04672-(-57.72875)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 17.45997 + (((tickAnim - 71) / 35) * (-30.84657-(17.45997)));
            yy = 11.35668 + (((tickAnim - 71) / 35) * (51.21489-(11.35668)));
            zz = 41.04672 + (((tickAnim - 71) / 35) * (-57.72875-(41.04672)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = -30.84657 + (((tickAnim - 106) / 12) * (17.45997-(-30.84657)));
            yy = 51.21489 + (((tickAnim - 106) / 12) * (11.35668-(51.21489)));
            zz = -57.72875 + (((tickAnim - 106) / 12) * (41.04672-(-57.72875)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 17.45997 + (((tickAnim - 118) / 52) * (0-(17.45997)));
            yy = 11.35668 + (((tickAnim - 118) / 52) * (0-(11.35668)));
            zz = 41.04672 + (((tickAnim - 118) / 52) * (0-(41.04672)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (73.75-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 73.75 + (((tickAnim - 61) / 10) * (47.25-(73.75)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 47.25 + (((tickAnim - 71) / 35) * (73.75-(47.25)));
            yy = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = 73.75 + (((tickAnim - 106) / 12) * (47.25-(73.75)));
            yy = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 12) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 47.25 + (((tickAnim - 118) / 52) * (0-(47.25)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (-30.84657-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (-51.21489-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (57.72875-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = -30.84657 + (((tickAnim - 61) / 10) * (17.45997-(-30.84657)));
            yy = -51.21489 + (((tickAnim - 61) / 10) * (-11.35668-(-51.21489)));
            zz = 57.72875 + (((tickAnim - 61) / 10) * (-41.04672-(57.72875)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 17.45997 + (((tickAnim - 71) / 35) * (-30.84657-(17.45997)));
            yy = -11.35668 + (((tickAnim - 71) / 35) * (-51.21489-(-11.35668)));
            zz = -41.04672 + (((tickAnim - 71) / 35) * (57.72875-(-41.04672)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = -30.84657 + (((tickAnim - 106) / 12) * (17.45997-(-30.84657)));
            yy = -51.21489 + (((tickAnim - 106) / 12) * (-11.35668-(-51.21489)));
            zz = 57.72875 + (((tickAnim - 106) / 12) * (-41.04672-(57.72875)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 17.45997 + (((tickAnim - 118) / 52) * (0-(17.45997)));
            yy = -11.35668 + (((tickAnim - 118) / 52) * (0-(-11.35668)));
            zz = -41.04672 + (((tickAnim - 118) / 52) * (0-(-41.04672)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (73.75-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 73.75 + (((tickAnim - 61) / 10) * (55.5-(73.75)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 55.5 + (((tickAnim - 71) / 35) * (73.75-(55.5)));
            yy = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = 73.75 + (((tickAnim - 106) / 12) * (55.5-(73.75)));
            yy = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 12) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 55.5 + (((tickAnim - 118) / 52) * (0-(55.5)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (-7.45079-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (-1.22808-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (-4.58885-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = -7.45079 + (((tickAnim - 61) / 10) * (-49.25-(-7.45079)));
            yy = -1.22808 + (((tickAnim - 61) / 10) * (0-(-1.22808)));
            zz = -4.58885 + (((tickAnim - 61) / 10) * (0-(-4.58885)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = -49.25 + (((tickAnim - 71) / 35) * (-7.45079-(-49.25)));
            yy = 0 + (((tickAnim - 71) / 35) * (1.22808-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (4.58885-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = -7.45079 + (((tickAnim - 106) / 12) * (-49.25-(-7.45079)));
            yy = 1.22808 + (((tickAnim - 106) / 12) * (0-(1.22808)));
            zz = 4.58885 + (((tickAnim - 106) / 12) * (0-(4.58885)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = -49.25 + (((tickAnim - 118) / 52) * (0-(-49.25)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0.975-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            zz = 0.975 + (((tickAnim - 71) / 47) * (0.975-(0.975)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0.975 + (((tickAnim - 118) / 52) * (0-(0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (-7.25-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (0.75-(0)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = -7.25 + (((tickAnim - 61) / 10) * (0-(-7.25)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 0.75 + (((tickAnim - 71) / 35) * (0-(0.75)));
            yy = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (7.25-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 106) / 12) * (0.75-(0)));
            yy = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            zz = 7.25 + (((tickAnim - 106) / 12) * (0-(7.25)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0.75 + (((tickAnim - 118) / 52) * (0-(0.75)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (-3.25-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (33.5-(0)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = -3.25 + (((tickAnim - 61) / 10) * (0-(-3.25)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 33.5 + (((tickAnim - 71) / 35) * (0-(33.5)));
            yy = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (3.25-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 106) / 12) * (33.5-(0)));
            yy = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            zz = 3.25 + (((tickAnim - 106) / 12) * (0-(3.25)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 33.5 + (((tickAnim - 118) / 52) * (0-(33.5)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (-17.20756-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (2.77081-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (-8.56621-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = -17.20756 + (((tickAnim - 61) / 10) * (30-(-17.20756)));
            yy = 2.77081 + (((tickAnim - 61) / 10) * (0-(2.77081)));
            zz = -8.56621 + (((tickAnim - 61) / 10) * (0-(-8.56621)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 30 + (((tickAnim - 71) / 35) * (-17.20756-(30)));
            yy = 0 + (((tickAnim - 71) / 35) * (-2.77081-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (8.56621-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = -17.20756 + (((tickAnim - 106) / 12) * (30-(-17.20756)));
            yy = -2.77081 + (((tickAnim - 106) / 12) * (0-(-2.77081)));
            zz = 8.56621 + (((tickAnim - 106) / 12) * (0-(8.56621)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 30 + (((tickAnim - 118) / 52) * (0-(30)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0.6-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            yy = 0.225 + (((tickAnim - 71) / 47) * (0.225-(0.225)));
            zz = 0.6 + (((tickAnim - 71) / 47) * (0.6-(0.6)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = 0.225 + (((tickAnim - 118) / 52) * (0-(0.225)));
            zz = 0.6 + (((tickAnim - 118) / 52) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 19 + (((tickAnim - 71) / 47) * (19-(19)));
            yy = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 47) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 19 + (((tickAnim - 118) / 52) * (0-(19)));
            yy = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0.6-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            yy = 0.2 + (((tickAnim - 71) / 47) * (0.2-(0.2)));
            zz = 0.6 + (((tickAnim - 71) / 47) * (0.6-(0.6)));
        }
        else if (tickAnim >= 118 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 118) / 52) * (0-(0)));
            yy = 0.2 + (((tickAnim - 118) / 52) * (0-(0.2)));
            zz = 0.6 + (((tickAnim - 118) / 52) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5 + (((tickAnim - 61) / 10) * (0-(9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 71) / 35) * (9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5-(0)));
            yy = 0 + (((tickAnim - 71) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 35) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 118) {
            xx = 9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5 + (((tickAnim - 106) / 12) * (0-(9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5)));
            yy = 0 + (((tickAnim - 106) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 12) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 118) / 32) * (9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5-(0)));
            yy = 0 + (((tickAnim - 118) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 32) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5 + (((tickAnim - 150) / 20) * (0-(9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+80))*-5), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*1), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+80))*-1);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26 + (((tickAnim - 0) / 5) * (-31.5-(26)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -31.5 + (((tickAnim - 5) / 5) * (26-(-31.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 32.75 + (((tickAnim - 0) / 1) * (38.87-(32.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 38.87 + (((tickAnim - 1) / 4) * (-13-(38.87)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13 + (((tickAnim - 5) / 5) * (32.75-(-13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-69-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -69 + (((tickAnim - 3) / 0) * (-69-(-69)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -69 + (((tickAnim - 3) / 2) * (14.5-(-69)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.5 + (((tickAnim - 5) / 5) * (0-(14.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.125 + (((tickAnim - 3) / 0) * (-0.125-(-0.125)));
            zz = -0.125 + (((tickAnim - 3) / 0) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 3) / 7) * (0-(-0.125)));
            zz = -0.125 + (((tickAnim - 3) / 7) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 64 + (((tickAnim - 0) / 3) * (94.88-(64)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 94.88 + (((tickAnim - 3) / 2) * (61.75-(94.88)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 61.75 + (((tickAnim - 5) / 1) * (14.75-(61.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 14.75 + (((tickAnim - 6) / 1) * (1.25-(14.75)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1.25 + (((tickAnim - 7) / 1) * (12.19-(1.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 12.19 + (((tickAnim - 8) / 2) * (64-(12.19)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.68-(0)));
            zz = -0.5 + (((tickAnim - 0) / 3) * (-0.215-(-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.68 + (((tickAnim - 3) / 2) * (0.45-(0.68)));
            zz = -0.215 + (((tickAnim - 3) / 2) * (-0.275-(-0.215)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 5) / 1) * (-0.1-(0.45)));
            zz = -0.275 + (((tickAnim - 5) / 1) * (0-(-0.275)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 6) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright4.rotationPointX = this.legright4.rotationPointX + (float)(xx);
        this.legright4.rotationPointY = this.legright4.rotationPointY - (float)(yy);
        this.legright4.rotationPointZ = this.legright4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -31.5 + (((tickAnim - 0) / 5) * (26-(-31.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 26 + (((tickAnim - 5) / 5) * (-31.5-(26)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13 + (((tickAnim - 0) / 5) * (32.75-(-13)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 32.75 + (((tickAnim - 5) / 1) * (38.87-(32.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 38.87 + (((tickAnim - 6) / 4) * (-13-(38.87)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.5 + (((tickAnim - 0) / 5) * (0-(14.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-69-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -69 + (((tickAnim - 8) / 0) * (-69-(-69)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -69 + (((tickAnim - 8) / 2) * (14.5-(-69)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -0.125 + (((tickAnim - 8) / 0) * (-0.125-(-0.125)));
            zz = -0.125 + (((tickAnim - 8) / 0) * (-0.125-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 61.75 + (((tickAnim - 0) / 1) * (14.75-(61.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 14.75 + (((tickAnim - 1) / 1) * (1.25-(14.75)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.25 + (((tickAnim - 2) / 1) * (12.19-(1.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.19 + (((tickAnim - 3) / 2) * (64-(12.19)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 64 + (((tickAnim - 5) / 3) * (94.88-(64)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 94.88 + (((tickAnim - 8) / 2) * (61.75-(94.88)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 1) * (-0.1-(0.45)));
            zz = -0.275 + (((tickAnim - 0) / 1) * (0-(-0.275)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 1) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.68-(0)));
            zz = -0.5 + (((tickAnim - 5) / 3) * (-0.215-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.68 + (((tickAnim - 8) / 2) * (0.45-(0.68)));
            zz = -0.215 + (((tickAnim - 8) / 2) * (-0.275-(-0.215)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft4.rotationPointX = this.legleft4.rotationPointX + (float)(xx);
        this.legleft4.rotationPointY = this.legleft4.rotationPointY - (float)(yy);
        this.legleft4.rotationPointZ = this.legleft4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*7), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-60))*5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*10), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-180))*15), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-5));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.65);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+250))*-5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*5));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(13.5), armleft.rotateAngleY + (float) Math.toRadians(0), armleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(-32), armleft2.rotateAngleY + (float) Math.toRadians(0), armleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(23.5), armleft3.rotateAngleY + (float) Math.toRadians(0), armleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(13.5), armright.rotateAngleY + (float) Math.toRadians(0), armright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(-32), armright2.rotateAngleY + (float) Math.toRadians(0), armright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(23.5), armright3.rotateAngleY + (float) Math.toRadians(0), armright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+250))*-7), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(13.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+300))*9), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(-0.075);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+350))*12), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-9.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+400))*-12), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+450))*12), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 19.5 + (((tickAnim - 0) / 11) * (-25.868-(19.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (-3.78289-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-3.99537-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -25.868 + (((tickAnim - 11) / 9) * (19.5-(-25.868)));
            yy = -3.78289 + (((tickAnim - 11) / 9) * (0-(-3.78289)));
            zz = -3.99537 + (((tickAnim - 11) / 9) * (0-(-3.99537)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23 + (((tickAnim - 0) / 2) * (44.79+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-45-(23)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 44.79+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-45 + (((tickAnim - 2) / 7) * (-2.41-(44.79+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-45)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -2.41 + (((tickAnim - 9) / 2) * (0-(-2.41)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (23-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 55.75 + (((tickAnim - 0) / 3) * (84.16-(55.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 84.16 + (((tickAnim - 3) / 3) * (85.29-(84.16)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 85.29 + (((tickAnim - 6) / 2) * (85.29-(85.29)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 85.29 + (((tickAnim - 8) / 3) * (27.64047-(85.29)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.37633-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (5.53621-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 27.64047 + (((tickAnim - 11) / 2) * (1.6624-(27.64047)));
            yy = 0.37633 + (((tickAnim - 11) / 2) * (-1.38691-(0.37633)));
            zz = 5.53621 + (((tickAnim - 11) / 2) * (5.58078-(5.53621)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.6624 + (((tickAnim - 13) / 2) * (22.67-(1.6624)));
            yy = -1.38691 + (((tickAnim - 13) / 2) * (0-(-1.38691)));
            zz = 5.58078 + (((tickAnim - 13) / 2) * (0-(5.58078)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22.67 + (((tickAnim - 15) / 5) * (55.75-(22.67)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.835-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.07-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.835 + (((tickAnim - 3) / 1) * (1.185-(0.835)));
            zz = -0.07 + (((tickAnim - 3) / 1) * (-0.13-(-0.07)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.185 + (((tickAnim - 4) / 2) * (0.96-(1.185)));
            zz = -0.13 + (((tickAnim - 4) / 2) * (-0.175-(-0.13)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.96 + (((tickAnim - 6) / 2) * (0.96-(0.96)));
            zz = -0.175 + (((tickAnim - 6) / 2) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.96 + (((tickAnim - 8) / 3) * (0.6-(0.96)));
            zz = -0.175 + (((tickAnim - 8) / 3) * (0-(-0.175)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 11) / 1) * (0.525-(0.6)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.525 + (((tickAnim - 12) / 1) * (-0.2-(0.525)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 7) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright4.rotationPointX = this.legright4.rotationPointX + (float)(xx);
        this.legright4.rotationPointY = this.legright4.rotationPointY - (float)(yy);
        this.legright4.rotationPointZ = this.legright4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -25.868 + (((tickAnim - 0) / 9) * (19.5-(-25.868)));
            yy = 3.78289 + (((tickAnim - 0) / 9) * (0-(3.78289)));
            zz = 3.99537 + (((tickAnim - 0) / 9) * (0-(3.99537)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 19.5 + (((tickAnim - 9) / 11) * (-25.868-(19.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (3.78289-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (3.99537-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 6.25 + (((tickAnim - 0) / 9) * (0-(6.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (-48.63-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -48.63 + (((tickAnim - 15) / 3) * (-53.63-(-48.63)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -53.63 + (((tickAnim - 18) / 2) * (6.25-(-53.63)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 9) * (0-(-0.375)));
            zz = -0.025 + (((tickAnim - 0) / 9) * (0-(-0.025)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0.175-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (-0.01-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 15) / 3) * (0.175-(0.175)));
            zz = -0.01 + (((tickAnim - 15) / 3) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 2) * (-0.375-(0.175)));
            zz = -0.01 + (((tickAnim - 18) / 2) * (-0.025-(-0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.64047 + (((tickAnim - 0) / 3) * (3.08863-(27.64047)));
            yy = -0.37633 + (((tickAnim - 0) / 3) * (2.02139-(-0.37633)));
            zz = -5.53621 + (((tickAnim - 0) / 3) * (-8.00019-(-5.53621)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.08863 + (((tickAnim - 3) / 2) * (31.18-(3.08863)));
            yy = 2.02139 + (((tickAnim - 3) / 2) * (0-(2.02139)));
            zz = -8.00019 + (((tickAnim - 3) / 2) * (0-(-8.00019)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 31.18 + (((tickAnim - 5) / 4) * (55.75-(31.18)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 55.75 + (((tickAnim - 9) / 3) * (84.16-(55.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 84.16 + (((tickAnim - 12) / 3) * (85.29-(84.16)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 85.29 + (((tickAnim - 15) / 3) * (85.29-(85.29)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 85.29 + (((tickAnim - 18) / 2) * (27.64047-(85.29)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.37633-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-5.53621-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 1) * (0.88-(0.6)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.88 + (((tickAnim - 1) / 2) * (0.15-(0.88)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 3) / 2) * (-0.13-(0.15)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.13 + (((tickAnim - 5) / 4) * (0-(-0.13)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0.96-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (-0.175-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.96 + (((tickAnim - 15) / 3) * (0.96-(0.96)));
            zz = -0.175 + (((tickAnim - 15) / 3) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.96 + (((tickAnim - 18) / 2) * (0.6-(0.96)));
            zz = -0.175 + (((tickAnim - 18) / 2) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft4.rotationPointX = this.legleft4.rotationPointX + (float)(xx);
        this.legleft4.rotationPointY = this.legleft4.rotationPointY - (float)(yy);
        this.legleft4.rotationPointZ = this.legleft4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-5), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*1), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-0.8);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*0.5);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-48.63-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -48.63 + (((tickAnim - 6) / 2) * (-53.63-(-48.63)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -53.63 + (((tickAnim - 8) / 3) * (6.25-(-53.63)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 11) / 9) * (0-(6.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.01-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 2) * (0.175-(0.175)));
            zz = -0.01 + (((tickAnim - 6) / 2) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 3) * (-0.375-(0.175)));
            zz = -0.01 + (((tickAnim - 8) / 3) * (-0.025-(-0.01)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 11) / 9) * (0-(-0.375)));
            zz = -0.025 + (((tickAnim - 11) / 9) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 23 + (((tickAnim - 9) / 2) * (80.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-45-(23)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 80.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-45 + (((tickAnim - 11) / 7) * (-2.41-(80.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-45)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.41 + (((tickAnim - 18) / 2) * (0-(-2.41)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+130))*5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+140))*4));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+200))*-8), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*8));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+250))*-11), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+240))*10));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.5);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-4));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-4), armleft.rotateAngleY + (float) Math.toRadians(0), armleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*4), armleft2.rotateAngleY + (float) Math.toRadians(0), armleft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-6), armleft3.rotateAngleY + (float) Math.toRadians(0), armleft3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-4), armright.rotateAngleY + (float) Math.toRadians(0), armright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*4), armright2.rotateAngleY + (float) Math.toRadians(0), armright2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-6), armright3.rotateAngleY + (float) Math.toRadians(0), armright3.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraFukuivenator e = (EntityPrehistoricFloraFukuivenator) entity;
        animator.update(entity);

    }
}
