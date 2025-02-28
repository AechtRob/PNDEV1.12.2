package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKoolasuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKoolasuchus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer hindlegR;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer front;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer front2;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer wholehead;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer headbase;
    private final AdvancedModelRenderer headdonotmove;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
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
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelKoolasuchus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.1F, 16.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.0F, -4.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 1, -4.5F, 5.0F, -1.5F, 9, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.0F, 1.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 60, -4.0F, -0.25F, -1.0F, 8, 5, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -6.0F, -4.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 25, -6.0F, -0.5F, -1.0F, 11, 6, 6, 0.0F, false));

        this.hindlegR = new AdvancedModelRenderer(this);
        this.hindlegR.setRotationPoint(-4.0F, -2.0F, 0.5F);
        this.body.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.3927F, 0.0F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 74, 54, -4.0F, -0.9F, -1.5F, 5, 2, 3, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.1309F, -0.2182F, -1.3963F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 0, 0, -2.75F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, 0.2182F, -0.3491F, 1.2654F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 70, 73, -3.5F, -1.0F, -1.75F, 4, 1, 4, 0.0F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(4.0F, -2.0F, 0.5F);
        this.body.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.3927F, 0.0F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 74, 54, -1.0F, -0.9F, -1.5F, 5, 2, 3, 0.0F, true));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(3.25F, 0.0F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.1309F, 0.2182F, 1.3963F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 0, 0, -0.25F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.2182F, 0.3491F, -1.2654F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 70, 73, -0.5F, -1.0F, -1.75F, 4, 1, 4, 0.0F, true));

        this.front = new AdvancedModelRenderer(this);
        this.front.setRotationPoint(0.0F, -4.0F, -4.5F);
        this.body.addChild(front);
        this.front.cubeList.add(new ModelBox(front, 0, 77, -6.0F, 2.2F, -10.75F, 12, 2, 11, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -2.0F, -9.5F);
        this.front.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -7.0F, -1.25F, -1.0F, 13, 7, 11, 0.0F, false));

        this.front2 = new AdvancedModelRenderer(this);
        this.front2.setRotationPoint(0.0F, -1.0F, -10.5F);
        this.front.addChild(front2);
        this.front2.cubeList.add(new ModelBox(front2, 0, 31, -6.0F, -2.0F, -7.0F, 12, 7, 8, 0.0F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-5.5F, 3.0F, -2.5F);
        this.front2.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.3491F, -0.2618F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 19, 46, -3.0F, -1.15F, -1.5F, 4, 2, 3, 0.0F, false));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-2.25F, 0.0F, 0.25F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -0.5236F, -0.8727F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 0, 7, -2.75F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.6665F, -0.9372F, 0.4931F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 34, 70, -2.5F, -1.0F, -1.5F, 3, 1, 3, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(5.5F, 3.0F, -2.5F);
        this.front2.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.3491F, 0.2618F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 19, 46, -1.0F, -1.15F, -1.5F, 4, 2, 3, 0.0F, true));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(2.25F, 0.0F, 0.25F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.5236F, 0.8727F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 0, 7, -0.25F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.6665F, 0.9372F, -0.4931F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 34, 70, -0.5F, -1.0F, -1.5F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.front2.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 5.0F, -3.0F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 52, -4.5F, -1.3518F, -2.1268F, 9, 2, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 8.0F, 5.0F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 40, -5.0F, -8.5F, -10.0F, 10, 6, 6, 0.0F, false));

        this.wholehead = new AdvancedModelRenderer(this);
        this.wholehead.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.neck.addChild(wholehead);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(5.6F, 1.5F, 4.25F);
        this.wholehead.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, -0.6545F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 19, -4.0F, -1.5F, -5.25F, 4, 3, 6, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 19, -4.0F, -1.5F, -2.25F, 4, 3, 6, -0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-5.6F, 1.5F, 4.25F);
        this.wholehead.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.6545F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 19, 0.0F, -1.5F, -2.25F, 4, 3, 6, -0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 19, 0.0F, -1.5F, -5.25F, 4, 3, 6, 0.0F, false));

        this.headbase = new AdvancedModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wholehead.addChild(headbase);


        this.headdonotmove = new AdvancedModelRenderer(this);
        this.headdonotmove.setRotationPoint(0.0F, -1.0F, -11.25F);
        this.headbase.addChild(headdonotmove);
        this.setRotateAngle(headdonotmove, 0.1745F, 0.0F, 0.0F);
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 63, 15, -3.5F, -0.975F, 3.55F, 7, 2, 2, 0.0F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 70, 29, -3.0F, -0.97F, 1.5F, 6, 2, 3, 0.0F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 52, 54, -4.0F, -1.0F, 5.25F, 8, 3, 6, 0.0F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 31, 25, -1.0F, -0.95F, -0.1F, 2, 1, 2, 0.0F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 0, 31, -1.0F, -0.35F, -0.1F, 2, 1, 2, -0.01F, false));
        this.headdonotmove.cubeList.add(new ModelBox(headdonotmove, 31, 22, -1.5F, 0.125F, 1.4F, 3, 2, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.5F, -0.7F, 5.05F);
        this.headdonotmove.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2443F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 31, -1.1F, -0.5F, -1.775F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.0F, -1.0F, 9.0F);
        this.headdonotmove.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.6109F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 71, 0.0F, 0.0F, -1.775F, 4, 2, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(4.0F, -1.0F, 7.0F);
        this.headdonotmove.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.6109F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 18, 0.0F, 0.0F, -1.775F, 3, 2, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.975F, 0.0F);
        this.headdonotmove.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.48F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 25, 0.7817F, 0.05F, -0.5074F, 3, 1, 2, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 22, 0.7817F, 0.65F, -0.5074F, 3, 1, 2, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.025F, -0.25F);
        this.headdonotmove.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2618F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 18, 1.5F, -0.75F, 2.15F, 3, 2, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.25F, 0.0F, 1.0F);
        this.headdonotmove.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.7941F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 70, -2.4939F, -1.4F, 2.8325F, 5, 2, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdonotmove.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.5236F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 25, 1.2561F, 0.6F, 5.8325F, 0, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(6.725F, -0.325F, 4.3F);
        this.headdonotmove.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3491F, 0.3054F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 44, -5.1901F, 0.1829F, -0.1521F, 5, 2, 8, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.025F, -0.25F);
        this.headdonotmove.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.2618F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 18, -4.5F, -0.75F, 2.15F, 3, 2, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.5F, -0.7F, 5.05F);
        this.headdonotmove.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.2443F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 31, 0.1F, -0.5F, -1.775F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.0F, -1.0F, 9.0F);
        this.headdonotmove.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.6109F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 71, -4.0F, 0.0F, -1.775F, 4, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-4.0F, -1.0F, 7.0F);
        this.headdonotmove.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.0F, -0.6109F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 18, -3.0F, 0.0F, -1.775F, 3, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-6.725F, -0.325F, 4.3F);
        this.headdonotmove.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3491F, -0.3054F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 44, 0.1901F, 0.1829F, -0.1521F, 5, 2, 8, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdonotmove.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1745F, -0.5236F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 25, -1.2561F, 0.6F, 5.8325F, 0, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.95F, -0.05F, 2.0F);
        this.headdonotmove.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2618F, -0.3054F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 3, 4, -2.2561F, 0.6F, 3.8325F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.2F, -1.05F, 1.0F);
        this.headdonotmove.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2618F, -0.7854F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 1, 2, -2.2561F, 0.6F, 3.8325F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.95F, -0.05F, 2.0F);
        this.headdonotmove.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2618F, 0.3054F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 3, 4, 2.2561F, 0.6F, 3.8325F, 0, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.2F, -1.05F, 1.0F);
        this.headdonotmove.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2618F, 0.7854F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 1, 2, 2.2561F, 0.6F, 3.8325F, 0, 1, 3, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.25F, 0.0F, 1.0F);
        this.headdonotmove.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, -0.7941F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 70, -2.5061F, -1.4F, 2.8325F, 5, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.375F, 0.0F);
        this.headdonotmove.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.48F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 22, -3.7817F, 0.05F, -0.5074F, 3, 1, 2, -0.01F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 25, -3.7817F, -0.55F, -0.5074F, 3, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.975F, -0.1F);
        this.headdonotmove.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.5672F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 31, 28, 0.7817F, 1.025F, -0.2574F, 3, 1, 0, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.975F, -0.1F);
        this.headdonotmove.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.5672F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 31, 28, -3.7817F, 1.025F, -0.2574F, 3, 1, 0, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.0F, 0.25F);
        this.wholehead.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 8, -5.0F, -0.1F, -4.25F, 11, 2, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-7.5F, 0.0F, -3.2F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.3054F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 59, -0.85F, -0.46F, 1.9F, 3, 2, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.2F, 0.4F, -10.325F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2531F, 0.7854F, -0.2182F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 58, 72, -2.6F, -0.45F, 2.5F, 4, 1, 4, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.5F, 0.0F, -11.25F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.2618F, 0.9599F, -0.1745F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 5, -3.1F, -0.475F, 0.0F, 3, 1, 3, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.5F, 0.0F, -11.25F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 1.0908F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 35, 74, -3.1F, -0.475F, 0.0F, 3, 1, 3, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(4.8F, 0.5F, -8.75F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.3054F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 4, 4, 1.15F, -1.45F, 3.25F, 0, 1, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.15F, 0.5F, -10.9F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.7418F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 2, 2, 1.15F, -1.45F, 3.25F, 0, 1, 3, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(2.0F, 0.75F, -11.0F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 1.0036F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 1, -0.35F, -1.475F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-3.8F, 0.5F, -8.75F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.3054F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 4, 4, -1.15F, -1.45F, 3.25F, 0, 1, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.15F, 0.5F, -10.9F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.7418F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 2, 2, -1.15F, -1.45F, 3.25F, 0, 1, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.0F, 0.75F, -11.0F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -1.0036F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 1, 0.35F, -1.475F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.4F, 0.0F, -10.575F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.7854F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 74, 63, -2.6F, -0.45F, 2.5F, 4, 1, 4, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(7.0F, 0.0F, -7.0F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.2967F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 44, 68, -3.0F, -0.475F, 0.1F, 3, 2, 6, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-6.0F, 0.0F, -7.0F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.2967F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 44, 68, 0.0F, -0.475F, 0.1F, 3, 2, 6, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.2F, 0.4F, -10.325F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.2531F, -0.7854F, 0.2182F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 58, 72, -1.4F, -0.45F, 2.5F, 4, 1, 4, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.4F, 0.0F, -10.575F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.7854F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 74, 63, -1.4F, -0.45F, 2.5F, 4, 1, 4, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 0.0F, -11.25F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.2618F, -0.9599F, 0.1745F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 75, 5, 0.1F, -0.475F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 0.0F, -11.25F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -1.0908F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 35, 74, 0.1F, -0.475F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.0F, 1.9F, -5.25F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.3054F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 60, 37, -5.5F, -0.475F, -3.0F, 10, 1, 3, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.0F, 2.0F, -4.25F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.2618F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 48, 15, -3.0F, -0.475F, -6.0F, 5, 1, 2, 0.01F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 36, -1.5F, -0.475F, -7.0F, 2, 1, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, 4.9F, 10.75F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0262F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 19, 51, -2.0F, -4.65F, -21.0F, 4, 1, 3, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 62, 0, -4.0F, -4.65F, -18.0F, 8, 2, 3, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 5.0F, 10.75F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0262F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 31, 20, -1.5F, -6.15F, -21.25F, 3, 2, 0, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 34, -1.0F, -4.875F, -22.05F, 2, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 5.025F, 11.75F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0262F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 34, -1.0F, -4.875F, -22.05F, 2, 1, 1, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(1.0F, 5.075F, 9.65F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0087F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 31, 18, -7.0F, -3.5F, -15.1F, 13, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.75F, 5.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 46, -2.5F, -0.85F, -1.0F, 5, 4, 9, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 32, 28, 0.0F, -2.5F, -1.0F, 0, 2, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1222F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 59, -1.5F, -1.0F, -1.0F, 3, 3, 9, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 0, 0.01F, -3.5F, 0.0F, 0, 3, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 63, 63, -1.0F, -1.0F, -0.5F, 2, 2, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 50, 53, 0.0F, -4.0F, -0.5F, 0, 5, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.375F;
        this.body.offsetX = -0.12F;
        this.body.rotateAngleY = (float)Math.toRadians(210);
        this.body.rotateAngleX = (float)Math.toRadians(18);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 0.50F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, wholehead);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        EntityPrehistoricFloraKoolasuchus entitySilesaurus = (EntityPrehistoricFloraKoolasuchus) e;
        ((EntityPrehistoricFloraKoolasuchus)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraKoolasuchus ee = (EntityPrehistoricFloraKoolasuchus) entitylivingbaseIn;

        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
        }
        else {
            //Swimming pose:
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) {
                    animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
                    animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKoolasuchus entity = (EntityPrehistoricFloraKoolasuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*1));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.25);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.98808 + (((tickAnim - 0) / 10) * (11.49715-(22.98808)));
            yy = 55.3375 + (((tickAnim - 0) / 10) * (21.62157-(55.3375)));
            zz = 4.42522 + (((tickAnim - 0) / 10) * (11.03171-(4.42522)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 11.49715 + (((tickAnim - 10) / 8) * (-0.28968-(11.49715)));
            yy = 21.62157 + (((tickAnim - 10) / 8) * (-1.1334-(21.62157)));
            zz = 11.03171 + (((tickAnim - 10) / 8) * (10.66571-(11.03171)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.28968 + (((tickAnim - 18) / 2) * (0-(-0.28968)));
            yy = -1.1334 + (((tickAnim - 18) / 2) * (-8.5-(-1.1334)));
            zz = 10.66571 + (((tickAnim - 18) / 2) * (0-(10.66571)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (22.98808-(0)));
            yy = -8.5 + (((tickAnim - 20) / 20) * (55.3375-(-8.5)));
            zz = 0 + (((tickAnim - 20) / 20) * (4.42522-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR, hindlegR.rotateAngleX + (float) Math.toRadians(xx), hindlegR.rotateAngleY + (float) Math.toRadians(yy), hindlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.34681 + (((tickAnim - 0) / 10) * (29.84041-(7.34681)));
            yy = 31.12803 + (((tickAnim - 0) / 10) * (27.38922-(31.12803)));
            zz = 20.70444 + (((tickAnim - 0) / 10) * (54.04511-(20.70444)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 29.84041 + (((tickAnim - 10) / 8) * (6.99176-(29.84041)));
            yy = 27.38922 + (((tickAnim - 10) / 8) * (-10.66452-(27.38922)));
            zz = 54.04511 + (((tickAnim - 10) / 8) * (13.18407-(54.04511)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6.99176 + (((tickAnim - 18) / 2) * (0-(6.99176)));
            yy = -10.66452 + (((tickAnim - 18) / 2) * (0-(-10.66452)));
            zz = 13.18407 + (((tickAnim - 18) / 2) * (0-(13.18407)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (4.07782-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (12.23743-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (26.77582-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4.07782 + (((tickAnim - 30) / 10) * (7.34681-(4.07782)));
            yy = 12.23743 + (((tickAnim - 30) / 10) * (31.12803-(12.23743)));
            zz = 26.77582 + (((tickAnim - 30) / 10) * (20.70444-(26.77582)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR2, hindlegR2.rotateAngleX + (float) Math.toRadians(xx), hindlegR2.rotateAngleY + (float) Math.toRadians(yy), hindlegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.13733 + (((tickAnim - 0) / 10) * (5.71989-(1.13733)));
            yy = 11.56117 + (((tickAnim - 0) / 10) * (26.22915-(11.56117)));
            zz = -49.80303 + (((tickAnim - 0) / 10) * (-89.76467-(-49.80303)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 5.71989 + (((tickAnim - 10) / 8) * (-1.73478-(5.71989)));
            yy = 26.22915 + (((tickAnim - 10) / 8) * (3.92716-(26.22915)));
            zz = -89.76467 + (((tickAnim - 10) / 8) * (-10.06582-(-89.76467)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.73478 + (((tickAnim - 18) / 2) * (0-(-1.73478)));
            yy = 3.92716 + (((tickAnim - 18) / 2) * (0-(3.92716)));
            zz = -10.06582 + (((tickAnim - 18) / 2) * (0-(-10.06582)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (9.44431-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (14.57583-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-21.2534-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 9.44431 + (((tickAnim - 30) / 10) * (1.13733-(9.44431)));
            yy = 14.57583 + (((tickAnim - 30) / 10) * (11.56117-(14.57583)));
            zz = -21.2534 + (((tickAnim - 30) / 10) * (-49.80303-(-21.2534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR3, hindlegR3.rotateAngleX + (float) Math.toRadians(xx), hindlegR3.rotateAngleY + (float) Math.toRadians(yy), hindlegR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (22.98808-(0)));
            yy = 8.5 + (((tickAnim - 0) / 20) * (-55.3375-(8.5)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.4252-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.98808 + (((tickAnim - 20) / 10) * (4.16404-(22.98808)));
            yy = -55.3375 + (((tickAnim - 20) / 10) * (-20.2843-(-55.3375)));
            zz = -4.4252 + (((tickAnim - 20) / 10) * (-22.18685-(-4.4252)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 4.16404 + (((tickAnim - 30) / 7) * (-2.51725-(4.16404)));
            yy = -20.2843 + (((tickAnim - 30) / 7) * (7.70756-(-20.2843)));
            zz = -22.18685 + (((tickAnim - 30) / 7) * (-14.32616-(-22.18685)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -2.51725 + (((tickAnim - 37) / 3) * (0-(-2.51725)));
            yy = 7.70756 + (((tickAnim - 37) / 3) * (8.5-(7.70756)));
            zz = -14.32616 + (((tickAnim - 37) / 3) * (0-(-14.32616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL, hindlegL.rotateAngleX + (float) Math.toRadians(xx), hindlegL.rotateAngleY + (float) Math.toRadians(yy), hindlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (7.62438-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-19.3932-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-30.76195-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 7.62438 + (((tickAnim - 11) / 9) * (8.98241-(7.62438)));
            yy = -19.3932 + (((tickAnim - 11) / 9) * (-43.65034-(-19.3932)));
            zz = -30.76195 + (((tickAnim - 11) / 9) * (-24.56629-(-30.76195)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.98241 + (((tickAnim - 20) / 10) * (21.15398-(8.98241)));
            yy = -43.65034 + (((tickAnim - 20) / 10) * (-22.66599-(-43.65034)));
            zz = -24.56629 + (((tickAnim - 20) / 10) * (-38.20731-(-24.56629)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 21.15398 + (((tickAnim - 30) / 7) * (14.80022-(21.15398)));
            yy = -22.66599 + (((tickAnim - 30) / 7) * (-0.50613-(-22.66599)));
            zz = -38.20731 + (((tickAnim - 30) / 7) * (-21.65166-(-38.20731)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 14.80022 + (((tickAnim - 37) / 3) * (0-(14.80022)));
            yy = -0.50613 + (((tickAnim - 37) / 3) * (0-(-0.50613)));
            zz = -21.65166 + (((tickAnim - 37) / 3) * (0-(-21.65166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL2, hindlegL2.rotateAngleX + (float) Math.toRadians(xx), hindlegL2.rotateAngleY + (float) Math.toRadians(yy), hindlegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.13733-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.5612-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (49.803-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.13733 + (((tickAnim - 20) / 10) * (3.30024-(1.13733)));
            yy = -11.5612 + (((tickAnim - 20) / 10) * (-31.08787-(-11.5612)));
            zz = 49.803 + (((tickAnim - 20) / 10) * (105.72115-(49.803)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 3.30024 + (((tickAnim - 30) / 8) * (-23.26139-(3.30024)));
            yy = -31.08787 + (((tickAnim - 30) / 8) * (-5.76349-(-31.08787)));
            zz = 105.72115 + (((tickAnim - 30) / 8) * (6.46575-(105.72115)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -23.26139 + (((tickAnim - 38) / 2) * (0-(-23.26139)));
            yy = -5.76349 + (((tickAnim - 38) / 2) * (0-(-5.76349)));
            zz = 6.46575 + (((tickAnim - 38) / 2) * (0-(6.46575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL3, hindlegL3.rotateAngleX + (float) Math.toRadians(xx), hindlegL3.rotateAngleY + (float) Math.toRadians(yy), hindlegL3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(front, front.rotateAngleX + (float) Math.toRadians(0), front.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1.5), front.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*0.5));


        this.setRotateAngle(front2, front2.rotateAngleX + (float) Math.toRadians(0), front2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*1.5), front2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 6.41995 + (((tickAnim - 0) / 18) * (8.04793-(6.41995)));
            yy = -48.11225 + (((tickAnim - 0) / 18) * (27.7393-(-48.11225)));
            zz = 2.2678 + (((tickAnim - 0) / 18) * (10.816-(2.2678)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 8.04793 + (((tickAnim - 18) / 9) * (1.7746-(8.04793)));
            yy = 27.7393 + (((tickAnim - 18) / 9) * (-21.05975-(27.7393)));
            zz = 10.816 + (((tickAnim - 18) / 9) * (19.6166+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(10.816)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 1.7746 + (((tickAnim - 27) / 7) * (-2.94801-(1.7746)));
            yy = -21.05975 + (((tickAnim - 27) / 7) * (-60.0066-(-21.05975)));
            zz = 19.6166+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 27) / 7) * (13.7849+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(19.6166+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -2.94801 + (((tickAnim - 34) / 3) * (7.75-(-2.94801)));
            yy = -60.0066 + (((tickAnim - 34) / 3) * (-63-(-60.0066)));
            zz = 13.7849+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 34) / 3) * (0-(13.7849+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 7.75 + (((tickAnim - 37) / 3) * (6.41995-(7.75)));
            yy = -63 + (((tickAnim - 37) / 3) * (-48.11225-(-63)));
            zz = 0 + (((tickAnim - 37) / 3) * (2.2678-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR, forelegR.rotateAngleX + (float) Math.toRadians(xx), forelegR.rotateAngleY + (float) Math.toRadians(yy), forelegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -24.18635 + (((tickAnim - 0) / 18) * (0-(-24.18635)));
            yy = 21.89174 + (((tickAnim - 0) / 18) * (45-(21.89174)));
            zz = -3.94078 + (((tickAnim - 0) / 18) * (17.25-(-3.94078)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (7.71003-(0)));
            yy = 45 + (((tickAnim - 18) / 9) * (37.0475-(45)));
            zz = 17.25 + (((tickAnim - 18) / 9) * (35.10688-(17.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 7.71003 + (((tickAnim - 27) / 7) * (-22.30431-(7.71003)));
            yy = 37.0475 + (((tickAnim - 27) / 7) * (28.82233-(37.0475)));
            zz = 35.10688 + (((tickAnim - 27) / 7) * (15.95734-(35.10688)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -22.30431 + (((tickAnim - 34) / 3) * (-25.20542-(-22.30431)));
            yy = 28.82233 + (((tickAnim - 34) / 3) * (26.49942-(28.82233)));
            zz = 15.95734 + (((tickAnim - 34) / 3) * (6.10207-(15.95734)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -25.20542 + (((tickAnim - 37) / 3) * (-24.18635-(-25.20542)));
            yy = 26.49942 + (((tickAnim - 37) / 3) * (21.89174-(26.49942)));
            zz = 6.10207 + (((tickAnim - 37) / 3) * (-3.94078-(6.10207)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR2, forelegR2.rotateAngleX + (float) Math.toRadians(xx), forelegR2.rotateAngleY + (float) Math.toRadians(yy), forelegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 3.03807 + (((tickAnim - 0) / 18) * (12.51569-(3.03807)));
            yy = -5.33892 + (((tickAnim - 0) / 18) * (42.0259-(-5.33892)));
            zz = 9.54534 + (((tickAnim - 0) / 18) * (-30.5345-(9.54534)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 12.51569 + (((tickAnim - 18) / 9) * (3.44628-(12.51569)));
            yy = 42.0259 + (((tickAnim - 18) / 9) * (78.6324-(42.0259)));
            zz = -30.5345 + (((tickAnim - 18) / 9) * (-68.6698+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(-30.5345)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 3.44628 + (((tickAnim - 27) / 7) * (-16.04438-(3.44628)));
            yy = 78.6324 + (((tickAnim - 27) / 7) * (-2.76085-(78.6324)));
            zz = -68.6698+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 27) / 7) * (18.18641-(-68.6698+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -16.04438 + (((tickAnim - 34) / 3) * (-1.5-(-16.04438)));
            yy = -2.76085 + (((tickAnim - 34) / 3) * (0-(-2.76085)));
            zz = 18.18641 + (((tickAnim - 34) / 3) * (0-(18.18641)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 37) / 3) * (3.03807-(-1.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (-5.33892-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (9.54534-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR3, forelegR3.rotateAngleX + (float) Math.toRadians(xx), forelegR3.rotateAngleY + (float) Math.toRadians(yy), forelegR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.04793 + (((tickAnim - 0) / 8) * (11.83414-(8.04793)));
            yy = -27.73931 + (((tickAnim - 0) / 8) * (4.84095-(-27.73931)));
            zz = -10.81597 + (((tickAnim - 0) / 8) * (-11.586+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(-10.81597)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.83414 + (((tickAnim - 8) / 7) * (5.318-(11.83414)));
            yy = 4.84095 + (((tickAnim - 8) / 7) * (46.07314-(4.84095)));
            zz = -11.586+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 8) / 7) * (-16.1921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-11.586+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 5.318 + (((tickAnim - 15) / 3) * (7.75-(5.318)));
            yy = 46.07314 + (((tickAnim - 15) / 3) * (63-(46.07314)));
            zz = -16.1921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 15) / 3) * (0-(-16.1921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 7.75 + (((tickAnim - 18) / 22) * (8.04793-(7.75)));
            yy = 63 + (((tickAnim - 18) / 22) * (-27.73931-(63)));
            zz = 0 + (((tickAnim - 18) / 22) * (-10.81597-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL, forelegL.rotateAngleX + (float) Math.toRadians(xx), forelegL.rotateAngleY + (float) Math.toRadians(yy), forelegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.60726-(0)));
            yy = -45 + (((tickAnim - 0) / 8) * (-39.97436-(-45)));
            zz = -17.25 + (((tickAnim - 0) / 8) * (-25.78917-(-17.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -7.60726 + (((tickAnim - 8) / 7) * (-25.09962-(-7.60726)));
            yy = -39.97436 + (((tickAnim - 8) / 7) * (7.04796-(-39.97436)));
            zz = -25.78917 + (((tickAnim - 8) / 7) * (-28.15201-(-25.78917)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -25.09962 + (((tickAnim - 15) / 3) * (-25.20542-(-25.09962)));
            yy = 7.04796 + (((tickAnim - 15) / 3) * (-26.4994-(7.04796)));
            zz = -28.15201 + (((tickAnim - 15) / 3) * (-6.1021-(-28.15201)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -25.20542 + (((tickAnim - 18) / 22) * (0-(-25.20542)));
            yy = -26.4994 + (((tickAnim - 18) / 22) * (-45-(-26.4994)));
            zz = -6.1021 + (((tickAnim - 18) / 22) * (-17.25-(-6.1021)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL2, forelegL2.rotateAngleX + (float) Math.toRadians(xx), forelegL2.rotateAngleY + (float) Math.toRadians(yy), forelegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.51569 + (((tickAnim - 0) / 8) * (15.26105-(12.51569)));
            yy = -42.02586 + (((tickAnim - 0) / 8) * (-87.21196-(-42.02586)));
            zz = 30.53451 + (((tickAnim - 0) / 8) * (62.16569-(30.53451)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.26105 + (((tickAnim - 8) / 7) * (-9.50285-(15.26105)));
            yy = -87.21196 + (((tickAnim - 8) / 7) * (-23.22884-(-87.21196)));
            zz = 62.16569 + (((tickAnim - 8) / 7) * (10.25437-(62.16569)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9.50285 + (((tickAnim - 15) / 3) * (-4-(-9.50285)));
            yy = -23.22884 + (((tickAnim - 15) / 3) * (0-(-23.22884)));
            zz = 10.25437 + (((tickAnim - 15) / 3) * (0-(10.25437)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -4 + (((tickAnim - 18) / 22) * (12.51569-(-4)));
            yy = 0 + (((tickAnim - 18) / 22) * (-42.02586-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (30.53451-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL3, forelegL3.rotateAngleX + (float) Math.toRadians(xx), forelegL3.rotateAngleY + (float) Math.toRadians(yy), forelegL3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*1));


        this.setRotateAngle(wholehead, wholehead.rotateAngleX + (float) Math.toRadians(0), wholehead.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*1.5), wholehead.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-220))*1));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+180))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*-4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*1));
       

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKoolasuchus entity = (EntityPrehistoricFloraKoolasuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*1));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.25);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(hindlegR, hindlegR.rotateAngleX + (float) Math.toRadians(32.34646), hindlegR.rotateAngleY + (float) Math.toRadians(72.43231), hindlegR.rotateAngleZ + (float) Math.toRadians(-37.35972));
        this.setRotateAngle(hindlegR2, hindlegR2.rotateAngleX + (float) Math.toRadians(7.54504), hindlegR2.rotateAngleY + (float) Math.toRadians(18.20484), hindlegR2.rotateAngleZ + (float) Math.toRadians(41.5651+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2));
        this.setRotateAngle(hindlegR3, hindlegR3.rotateAngleX + (float) Math.toRadians(-0.71587), hindlegR3.rotateAngleY + (float) Math.toRadians(25.19301), hindlegR3.rotateAngleZ + (float) Math.toRadians(-90.8321+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*5));
        this.setRotateAngle(hindlegL, hindlegL.rotateAngleX + (float) Math.toRadians(32.34646), hindlegL.rotateAngleY + (float) Math.toRadians(-72.4323), hindlegL.rotateAngleZ + (float) Math.toRadians(37.3597));
        this.setRotateAngle(hindlegL2, hindlegL2.rotateAngleX + (float) Math.toRadians(7.54504), hindlegL2.rotateAngleY + (float) Math.toRadians(-18.2048), hindlegL2.rotateAngleZ + (float) Math.toRadians(-41.5651+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2));
        this.setRotateAngle(hindlegL3, hindlegL3.rotateAngleX + (float) Math.toRadians(-0.71587), hindlegL3.rotateAngleY + (float) Math.toRadians(-25.193), hindlegL3.rotateAngleZ + (float) Math.toRadians(90.8321+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*5));
        this.setRotateAngle(front, front.rotateAngleX + (float) Math.toRadians(0), front.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1.5), front.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*0.5));
        this.setRotateAngle(front2, front2.rotateAngleX + (float) Math.toRadians(0), front2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*1.5), front2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));
        this.setRotateAngle(forelegR, forelegR.rotateAngleX + (float) Math.toRadians(0), forelegR.rotateAngleY + (float) Math.toRadians(21.5), forelegR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(forelegR2, forelegR2.rotateAngleX + (float) Math.toRadians(0), forelegR2.rotateAngleY + (float) Math.toRadians(59.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), forelegR2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(forelegR3, forelegR3.rotateAngleX + (float) Math.toRadians(56.91131), forelegR3.rotateAngleY + (float) Math.toRadians(75.2879+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*5), forelegR3.rotateAngleZ + (float) Math.toRadians(-20.5064));
        this.setRotateAngle(forelegL, forelegL.rotateAngleX + (float) Math.toRadians(0), forelegL.rotateAngleY + (float) Math.toRadians(-21.5), forelegL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(forelegL2, forelegL2.rotateAngleX + (float) Math.toRadians(0), forelegL2.rotateAngleY + (float) Math.toRadians(-59.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2), forelegL2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(forelegL3, forelegL3.rotateAngleX + (float) Math.toRadians(56.91131), forelegL3.rotateAngleY + (float) Math.toRadians(-75.2879+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-5), forelegL3.rotateAngleZ + (float) Math.toRadians(20.50643));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-1.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*1));
        this.setRotateAngle(wholehead, wholehead.rotateAngleX + (float) Math.toRadians(0), wholehead.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*1.5), wholehead.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-220))*1));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+180))*-9), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*-12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*1));
       

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKoolasuchus entity = (EntityPrehistoricFloraKoolasuchus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-10))*1));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-0.3);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(hindlegR, hindlegR.rotateAngleX + (float) Math.toRadians(32.34646), hindlegR.rotateAngleY + (float) Math.toRadians(72.43231), hindlegR.rotateAngleZ + (float) Math.toRadians(-37.35972));
        this.setRotateAngle(hindlegR2, hindlegR2.rotateAngleX + (float) Math.toRadians(7.54504), hindlegR2.rotateAngleY + (float) Math.toRadians(18.20484), hindlegR2.rotateAngleZ + (float) Math.toRadians(41.5651+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2));
        this.setRotateAngle(hindlegR3, hindlegR3.rotateAngleX + (float) Math.toRadians(-0.71587), hindlegR3.rotateAngleY + (float) Math.toRadians(25.19301), hindlegR3.rotateAngleZ + (float) Math.toRadians(-90.8321+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*5));
        this.setRotateAngle(hindlegL, hindlegL.rotateAngleX + (float) Math.toRadians(32.34646), hindlegL.rotateAngleY + (float) Math.toRadians(-72.4323), hindlegL.rotateAngleZ + (float) Math.toRadians(37.3597));
        this.setRotateAngle(hindlegL2, hindlegL2.rotateAngleX + (float) Math.toRadians(7.54504), hindlegL2.rotateAngleY + (float) Math.toRadians(-18.2048), hindlegL2.rotateAngleZ + (float) Math.toRadians(-41.5651+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-2));
        this.setRotateAngle(hindlegL3, hindlegL3.rotateAngleX + (float) Math.toRadians(-0.71587), hindlegL3.rotateAngleY + (float) Math.toRadians(-25.193), hindlegL3.rotateAngleZ + (float) Math.toRadians(90.8321+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*5));
        this.setRotateAngle(front, front.rotateAngleX + (float) Math.toRadians(0), front.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-3), front.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-60))*0.5));
        this.setRotateAngle(front2, front2.rotateAngleX + (float) Math.toRadians(0), front2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*4), front2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*1));
        this.setRotateAngle(forelegR, forelegR.rotateAngleX + (float) Math.toRadians(0), forelegR.rotateAngleY + (float) Math.toRadians(21.5), forelegR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(forelegR2, forelegR2.rotateAngleX + (float) Math.toRadians(0), forelegR2.rotateAngleY + (float) Math.toRadians(59.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2), forelegR2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(forelegR3, forelegR3.rotateAngleX + (float) Math.toRadians(56.91131), forelegR3.rotateAngleY + (float) Math.toRadians(75.2879+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*5), forelegR3.rotateAngleZ + (float) Math.toRadians(-20.5064));
        this.setRotateAngle(forelegL, forelegL.rotateAngleX + (float) Math.toRadians(0), forelegL.rotateAngleY + (float) Math.toRadians(-21.5), forelegL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(forelegL2, forelegL2.rotateAngleX + (float) Math.toRadians(0), forelegL2.rotateAngleY + (float) Math.toRadians(-59.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-2), forelegL2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(forelegL3, forelegL3.rotateAngleX + (float) Math.toRadians(56.91131), forelegL3.rotateAngleY + (float) Math.toRadians(-75.2879+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-5), forelegL3.rotateAngleZ + (float) Math.toRadians(20.50643));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-1.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-180))*1));
        this.setRotateAngle(wholehead, wholehead.rotateAngleX + (float) Math.toRadians(0), wholehead.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-180))*1.5), wholehead.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-220))*1));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*10), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+180))*-15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-60))*1));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*1));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoolasuchus entity = (EntityPrehistoricFloraKoolasuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9.74838-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.1242-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.49485-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -9.74838 + (((tickAnim - 5) / 6) * (0-(-9.74838)));
            yy = -0.1242 + (((tickAnim - 5) / 6) * (0-(-0.1242)));
            zz = -1.49485 + (((tickAnim - 5) / 6) * (0-(-1.49485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.22536-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.59877-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-4.7122-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -12.22536 + (((tickAnim - 5) / 6) * (0-(-12.22536)));
            yy = -0.59877 + (((tickAnim - 5) / 6) * (0-(-0.59877)));
            zz = -4.7122 + (((tickAnim - 5) / 6) * (0-(-4.7122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wholehead, wholehead.rotateAngleX + (float) Math.toRadians(xx), wholehead.rotateAngleY + (float) Math.toRadians(yy), wholehead.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 21.25 + (((tickAnim - 5) / 3) * (0-(21.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKoolasuchus e = (EntityPrehistoricFloraKoolasuchus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.headbase, 0,0,-0.2F);
        animator.rotate(this.headbase, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
