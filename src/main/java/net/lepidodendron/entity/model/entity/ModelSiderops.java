package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSiderops;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSiderops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer hindlegR;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;
    private final AdvancedModelRenderer front;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer front2;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer wholehead;
    private final AdvancedModelRenderer headbase;
    private final AdvancedModelRenderer headdonotmove;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelSiderops() {
        this.textureWidth = 100;
        this.textureHeight = 90;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 25.1F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -8.0F, 10.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 53, 54, -4.5F, 5.0F, -1.5F, 9, 1, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.0F, 16.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 20, -4.0F, -0.25F, -1.0F, 8, 5, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -8.0F, 10.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 24, -5.0F, -0.5F, -1.0F, 10, 6, 7, 0.0F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(4.0F, -4.0F, 15.5F);
        this.body.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.3927F, 0.0F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 41, 70, -1.0F, -0.9F, -1.5F, 5, 2, 3, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(3.25F, 0.1F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.1309F, 0.2182F, 1.3963F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 0, 7, -0.25F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.2182F, 0.3491F, -1.2828F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 68, 12, -0.5F, -1.0F, -1.75F, 4, 1, 4, 0.0F, false));

        this.hindlegR = new AdvancedModelRenderer(this);
        this.hindlegR.setRotationPoint(-4.0F, -4.0F, 15.5F);
        this.body.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.3927F, 0.0F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 41, 70, -4.0F, -0.9F, -1.5F, 5, 2, 3, 0.0F, true));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.1309F, -0.2182F, -1.3963F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 0, 7, -2.75F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, 0.2182F, -0.3491F, 1.2654F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 68, 12, -3.5F, -1.0F, -1.75F, 4, 1, 4, 0.0F, true));

        this.front = new AdvancedModelRenderer(this);
        this.front.setRotationPoint(0.0F, -6.0F, 9.5F);
        this.body.addChild(front);
        this.front.cubeList.add(new ModelBox(front, 0, 18, -5.0F, 2.2F, -10.75F, 10, 2, 11, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, -9.5F);
        this.front.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -6.0F, -1.25F, -1.0F, 12, 7, 11, 0.0F, false));

        this.front2 = new AdvancedModelRenderer(this);
        this.front2.setRotationPoint(0.0F, -1.0F, -10.5F);
        this.front.addChild(front2);
        this.front2.cubeList.add(new ModelBox(front2, 30, 37, -5.5F, -2.0F, -5.0F, 11, 7, 6, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(5.0F, 3.0F, -2.5F);
        this.front2.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.3491F, 0.2618F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 57, 71, -1.0F, -1.15F, -1.5F, 4, 2, 3, 0.0F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(2.25F, 0.0F, 0.25F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.5236F, 0.8727F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 0, 18, -0.25F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.6665F, 0.9372F, -0.4931F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 18, 56, -0.5F, -1.0F, -1.5F, 3, 1, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-5.0F, 3.0F, -2.5F);
        this.front2.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.3491F, -0.2618F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 57, 71, -3.0F, -1.15F, -1.5F, 4, 2, 3, 0.0F, true));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-2.25F, 0.0F, 0.25F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -0.5236F, -0.8727F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 0, 18, -2.75F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.6665F, -0.9372F, 0.4931F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 18, 56, -2.5F, -1.0F, -1.5F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.front2.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 5.0F, -2.0F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 45, -4.5F, -1.3518F, -2.1268F, 9, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 8.0F, 6.0F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 50, -5.0F, -8.5F, -10.0F, 10, 6, 5, 0.0F, false));

        this.wholehead = new AdvancedModelRenderer(this);
        this.wholehead.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.neck.addChild(wholehead);


        this.headbase = new AdvancedModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.wholehead.addChild(headbase);


        this.headdonotmove = new AdvancedModelRenderer(this);
        this.headdonotmove.setRotationPoint(0.0F, -1.0F, -13.25F);
        this.headbase.addChild(headdonotmove);
        this.setRotateAngle(headdonotmove, 0.1745F, 0.0F, 0.0F);
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 68, 8, -3.5F, -0.975F, 3.55F, 7, 2, 2, 0.0F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 0, 68, -3.0F, -0.97F, 1.25F, 6, 2, 3, 0.0F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 0, 31, -4.5F, -1.0F, 5.25F, 9, 3, 9, 0.0F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 31, 24, -1.0F, -0.95F, -0.1F, 2, 2, 2, 0.0F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 0, 35, -1.5F, 0.375F, 0.9F, 3, 2, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.525F, -0.25F);
        this.headdonotmove.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 4, -4.5F, 0.25F, 2.15F, 3, 1, 0, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.5F, 0.0F, 5.0F);
        this.headdonotmove.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2443F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 31, 0.1F, -1.5F, -1.775F, 1, 2, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.5F, -1.0F, 9.0F);
        this.headdonotmove.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.6109F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 62, -3.0F, 0.0F, -1.775F, 3, 2, 7, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.5F, -1.0F, 7.0F);
        this.headdonotmove.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, -0.6545F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 31, -2.0F, 0.0F, -1.775F, 2, 2, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.0F, 0.0F, 7.0F);
        this.headdonotmove.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3927F, -0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 0, -0.8099F, 0.1829F, -0.1521F, 6, 2, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.headdonotmove.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, -0.5236F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 23, -1.2561F, -0.4F, 5.8325F, 0, 2, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.headdonotmove.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, -0.48F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 1, -2.2561F, 0.6F, 3.8325F, 0, 1, 5, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdonotmove.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, -0.5236F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 62, -2.5061F, -1.4F, 2.8325F, 5, 2, 6, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.025F, 0.0F);
        this.headdonotmove.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.48F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 22, -3.7817F, -0.95F, -0.5074F, 3, 2, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.225F, 0.0F);
        this.headdonotmove.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.5672F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 28, -3.7817F, 1.025F, -0.2574F, 3, 1, 0, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.525F, -0.25F);
        this.headdonotmove.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.2618F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 35, 4, 1.5F, 0.25F, 2.15F, 3, 1, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(6.0F, 0.0F, 7.0F);
        this.headdonotmove.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3927F, 0.4363F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 66, 0, -5.1901F, 0.1829F, -0.1521F, 6, 2, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.headdonotmove.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1745F, 0.5236F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 23, 1.2561F, -0.4F, 5.8325F, 0, 2, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.headdonotmove.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1745F, 0.48F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 1, 2.2561F, 0.6F, 3.8325F, 0, 1, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdonotmove.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1745F, 0.5236F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 62, -2.4939F, -1.4F, 2.8325F, 5, 2, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.225F, 0.0F);
        this.headdonotmove.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.5672F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 31, 28, 0.7817F, 1.025F, -0.2574F, 3, 1, 0, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.025F, 0.0F);
        this.headdonotmove.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.48F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 22, 0.7817F, -0.95F, -0.5074F, 3, 2, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(4.5F, -1.0F, 7.0F);
        this.headdonotmove.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.6545F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 31, 0.0F, 0.0F, -1.775F, 2, 2, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(4.5F, -1.0F, 9.0F);
        this.headdonotmove.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.6109F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 62, 62, 0.0F, 0.0F, -1.775F, 3, 2, 7, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(4.5F, 0.0F, 5.0F);
        this.headdonotmove.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.2443F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 27, 31, -1.1F, -1.5F, -1.775F, 1, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.0F, -0.75F);
        this.wholehead.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 11, -5.0F, 0.0F, -6.25F, 11, 2, 7, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 0, -5.5F, 1.5F, -6.35F, 12, 1, 7, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-8.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.7418F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 66, -0.85F, -1.46F, 1.9F, 3, 3, 4, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-8.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.3142F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.0F, -1.475F, 0.1F, 3, 3, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(9.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.7418F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 66, -2.15F, -1.46F, 1.9F, 3, 3, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(9.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.3142F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -3.0F, -1.475F, 0.1F, 3, 3, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 0.25F, -13.25F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.48F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -1.15F, -1.45F, 3.25F, 0, 1, 5, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 43, -1.4F, -0.7F, 2.5F, 4, 2, 11, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 0.5F, -13.25F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2618F, -0.9599F, 0.1745F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 62, 0.1F, -0.475F, 0.0F, 3, 1, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.0F, -13.25F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.9599F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 11, 75, 0.1F, -0.475F, 0.0F, 3, 1, 3, 0.0F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 25, 0.35F, -1.225F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.5F, 0.25F, -13.25F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.48F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, 1.15F, -1.45F, 3.25F, 0, 1, 5, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 43, -2.6F, -0.7F, 2.5F, 4, 2, 11, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.5F, 0.5F, -13.25F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2618F, 0.9599F, -0.1745F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 56, 62, -3.1F, -0.475F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.5F, 0.25F, -13.25F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.9599F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 25, -0.35F, -1.475F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 11, 75, -3.1F, -0.725F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, 2.0F, -6.25F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2182F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 31, 20, -4.5F, -0.475F, -3.0F, 9, 1, 3, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 73, -2.0F, -0.475F, -6.0F, 4, 1, 3, 0.01F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 35, 2, -1.0F, -0.475F, -7.0F, 2, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 5.0F, 8.75F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0262F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 71, 71, -2.0F, -4.65F, -21.0F, 4, 1, 3, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 64, 40, -4.0F, -4.65F, -18.0F, 8, 2, 3, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 31, 18, -1.5F, -6.15F, -21.25F, 3, 2, 0, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 35, 0, -1.0F, -4.875F, -22.05F, 2, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -5.75F, 19.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 56, -2.5F, -0.85F, -1.0F, 5, 4, 8, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 35, 0, 0.0F, -2.5F, -1.0F, 0, 2, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1222F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 61, 29, -1.5F, -1.0F, -1.0F, 3, 3, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 43, 0.01F, -4.0F, 0.0F, 0, 3, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 66, -1.0F, -1.0F, -1.0F, 2, 2, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 51, 0.0F, -4.0F, 0.0F, 0, 5, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(wholehead, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
        this.neck.offsetY = -0.02F;
        this.neck.offsetX = 0.0F;
        this.neck.offsetZ = 0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(front, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(front2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(neck, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(wholehead, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.3F, 0.0F);
        this.body.offsetY = -0.13F;
        this.body.render(0.01F);
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
        //this.body4.offsetY = -0.50F; //72
        //this.body4.offsetZ = -1F; //72

        EntityPrehistoricFloraSiderops sider = (EntityPrehistoricFloraSiderops) e;

        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 4, wholehead);

        float speed = 0.185F;
        if (sider.getIsFast()) {
            speed = speed * 1.52F;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.neck, this.front2, this.front};
        sider.tailBuffer.applyChainSwingBuffer(Tail);

        boolean isAtBottom = sider.isAtBottom();
        float bottomModifierTail = 1F;
        boolean atBottom = false;
        if (sider.isReallyInWater() && isAtBottom && !sider.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.12F;
            bottomModifierTail = 0.3F;
            atBottom = true;
        }

        if (!sider.isReallyInWater()) {//on land

            if (f3 == 0.0F || !sider.getIsMoving()) { //Not moving
                return;
            }

            this.flap(hindlegL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(hindlegL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(hindlegL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(hindlegL3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(hindlegR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(hindlegR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(hindlegR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(hindlegR3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(forelegL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(forelegL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(forelegL2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(forelegL3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(forelegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(forelegR2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(forelegR3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.025F, -0.2, f2, 0.7F);
            //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, -1, f2, 1);

        }
        else {//in water
            speed = speed * 2F;

            if (!atBottom) {

                this.setRotateAngle(forelegL, 0, -(float) Math.toRadians(42.5), -(float) Math.toRadians(10));
                this.setRotateAngle(forelegR, 0, -(float) Math.toRadians(-42.5),-(float) Math.toRadians(-10));
                this.setRotateAngle(forelegL2, 0, -(float) Math.toRadians(17.5), 0);
                this.setRotateAngle(forelegR2, 0, -(float) Math.toRadians(-17.5), 0);
                this.setRotateAngle(forelegL3, 0, -(float) Math.toRadians(12.5), -0);
                this.setRotateAngle(forelegR3, 0, -(float) Math.toRadians(-12.5), 0);

                this.setRotateAngle(hindlegL, 0, -(float) Math.toRadians(32.5), -(float) Math.toRadians(17));
                this.setRotateAngle(hindlegR, (0), -(float) Math.toRadians(-32.5), -(float) Math.toRadians(-17));
                this.setRotateAngle(hindlegL2, (float) Math.toRadians(0), -(float) Math.toRadians(75), (float) Math.toRadians(0));
                this.setRotateAngle(hindlegR2, (float) Math.toRadians(0), -(float) Math.toRadians(-75), (float) Math.toRadians(0));
                this.setRotateAngle(hindlegL3, (float) Math.toRadians(0), -(float) Math.toRadians(7.5), (float) Math.toRadians(-0));
                this.setRotateAngle(hindlegR3, (float) Math.toRadians(0), -(float) Math.toRadians(-7.5), (float) Math.toRadians(0));

                AdvancedModelRenderer[] BackL = {this.hindlegL, this.hindlegL2};
                AdvancedModelRenderer[] BackR = {this.hindlegR, this.hindlegR2};
                AdvancedModelRenderer[] FrontL = {this.forelegL, this.forelegL2};
                AdvancedModelRenderer[] FrontR = {this.forelegR, this.forelegR2};

                this.chainSwingExtended(FrontL, speed * 0.85F, -0.2F, 0, 1F, f2, 1);
                this.chainSwingExtended(FrontR, speed * 0.85F, -0.2F, -2, 4F, f2, 1);
                this.chainSwingExtended(BackL, speed * 0.85F, -0.13F, -2, 1F, f2, 1);
                this.chainSwingExtended(BackR, speed * 0.85F, -0.13F, -2, 4F, f2, 1);

                //this.body4.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, -1, f2, 1);

            }
            else if (f3 != 0 && sider.getIsMoving()) {
                this.flap(hindlegL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
                this.swing(hindlegL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(hindlegL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
                this.walk(hindlegL3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.flap(hindlegR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
                this.swing(hindlegR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(hindlegR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
                this.walk(hindlegR3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(forelegL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
                this.swing(forelegL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(forelegL2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
                this.walk(forelegL3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
                this.swing(forelegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(forelegR2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
                this.walk(forelegR3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                this.chainSwing(Torso, speed, 0.05F, -0.2, f2, 0.7F);
                this.bob(body, speed*2, 0.05F, false, f2, 1F);

                //this.body4.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, -1, f2, 1);

            }

            this.chainSwing(Tail, speed * bottomModifierTail, 0.6F * bottomModifierTail, -0.4, f2, 0.5F * bottomModifierTail);
            if (!atBottom) {
                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                this.chainSwing(Torso, speed, 0.05F, -0.2, f2, 0.7F);
            }
            else {
                this.swing(neck, speed * bottomModifierTail * 0.33F, 0.1F, false, 0, -0.05F, f2, 0.5F);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-0.2F);
        animator.rotate(this.wholehead, -(float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.2F);
        animator.rotate(this.wholehead, -(float) Math.toRadians(7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
