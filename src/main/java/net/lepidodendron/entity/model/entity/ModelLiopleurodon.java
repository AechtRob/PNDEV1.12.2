package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLiopleurodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLiopleurodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;

    private ModelAnimator animator;

    public ModelLiopleurodon() {
        this.textureWidth = 200;
        this.textureHeight = 200;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 9.1808F, 24.7163F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 40, -10.0F, -5.0308F, -10.1163F, 20, 10, 21, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -2.5308F, 0.3837F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 71, -9.0F, -4.5F, -10.5F, 17, 5, 20, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 8.2152F, -2.0188F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 20, -9.0F, -5.8F, -8.0F, 18, 5, 20, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-9.6359F, 4.9517F, -0.1416F);
        this.hips.addChild(rightleg);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-13.3641F, 0.4525F, 9.439F);
        this.rightleg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5672F, 0.0F, -1.6144F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 122, 137, -2.5F, 7.2463F, -4.7F, 5, 11, 8, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-7.6823F, 0.3616F, 0.5898F);
        this.rightleg.addChild(rightleg2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.6819F, 0.0909F, 8.8492F);
        this.rightleg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, -1.6144F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 116, -2.0F, -4.6912F, -5.1642F, 4, 14, 11, 0.0F, false));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(-12.346F, 0.5434F, 7.6882F);
        this.rightleg2.addChild(rightfoot);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(6.6641F, -0.4525F, 1.161F);
        this.rightfoot.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6981F, 0.0F, -1.6144F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 133, -1.0F, -22.2286F, -4.9697F, 2, 19, 8, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(9.6359F, 4.9517F, -0.1416F);
        this.hips.addChild(leftleg);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(13.3641F, 0.4525F, 9.439F);
        this.leftleg.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5672F, 0.0F, 1.6144F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 122, 137, -2.5F, 7.2463F, -4.7F, 5, 11, 8, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(7.6823F, 0.3616F, 0.5898F);
        this.leftleg.addChild(leftleg2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(5.6819F, 0.0909F, 8.8492F);
        this.leftleg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6109F, 0.0F, 1.6144F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 80, 116, -2.0F, -4.6912F, -5.1642F, 4, 14, 11, 0.0F, true));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(12.346F, 0.5434F, 7.6882F);
        this.leftleg2.addChild(leftfoot);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-6.6641F, -0.4525F, 1.161F);
        this.leftfoot.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6981F, 0.0F, 1.6144F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 133, -1.0F, -22.2286F, -4.9697F, 2, 19, 8, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4801F, 10.9011F);
        this.hips.addChild(tail);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, 2.1992F, 3.9826F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 109, 106, -5.0F, -4.2F, -5.0F, 14, 8, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.6863F, 8.6054F);
        this.tail.addChild(tail2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 1.5129F, 5.3772F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 126, 28, -6.0F, -4.3F, -5.5F, 10, 6, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2972F, 5.8429F);
        this.tail2.addChild(tail3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.4898F, 1.8492F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 82, -1.0F, -2.8F, -2.7F, 2, 4, 5, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.8102F, -0.4658F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 147, 103, -3.0F, -4.2F, -0.5F, 7, 5, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5499F, 5.2529F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 17, -1.5F, -1.2219F, 5.7644F, 3, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.7147F, 1.7703F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 71, -1.0F, -2.9F, -3.6F, 2, 4, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.645F, 3.4824F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 2, -1.0F, 1.1F, -0.5F, 2, 2, 2, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -0.645F, 3.4824F);
        this.tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 71, -1.0F, -1.5F, 0.5F, 4, 2, 2, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 0.8928F, 3.8498F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 116, -1.0F, -2.9F, -5.0F, 5, 3, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.5308F, -9.6163F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -12.0F, -2.5F, -20.5F, 24, 19, 21, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.25F, -20.5F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 66, 55, -11.5F, -1.0F, -15.0F, 23, 18, 16, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-11.108F, 12.5439F, -8.3276F);
        this.chest.addChild(rightarm);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-11.892F, 0.4319F, 9.7052F);
        this.rightarm.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5672F, 0.0F, 1.5272F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 144, 74, -2.0F, -16.8132F, -5.1845F, 4, 8, 7, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-5.8344F, 0.3639F, -0.1749F);
        this.rightarm.addChild(rightarm2);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-6.0576F, 0.068F, 9.8802F);
        this.rightarm2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.7418F, 0.0F, 1.5272F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 128, 45, -1.5F, -10.9197F, -4.8329F, 3, 17, 9, 0.0F, false));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-13.2431F, 0.4079F, 11.0422F);
        this.rightarm2.addChild(righthand);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(7.1855F, -0.3399F, -1.162F);
        this.righthand.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.9163F, 0.0F, 1.5272F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -1.0F, 4.7673F, -4.9444F, 2, 11, 6, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(11.108F, 12.5439F, -8.3276F);
        this.chest.addChild(leftarm);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(11.892F, 0.4319F, 9.7052F);
        this.leftarm.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5672F, 0.0F, -1.5272F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 144, 74, -2.0F, -16.8132F, -5.1845F, 4, 8, 7, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(5.8344F, 0.3639F, -0.1749F);
        this.leftarm.addChild(leftarm2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(6.0576F, 0.068F, 9.8802F);
        this.leftarm2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.7418F, 0.0F, -1.5272F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 128, 45, -1.5F, -10.9197F, -4.8329F, 3, 17, 9, 0.0F, true));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(13.2431F, 0.4079F, 11.0422F);
        this.leftarm2.addChild(lefthand);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-7.1855F, -0.3399F, -1.162F);
        this.lefthand.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9163F, 0.0F, -1.5272F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -1.0F, 4.7673F, -4.9444F, 2, 11, 6, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.1F, -15.1F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 63, 89, -8.5F, -3.0F, -10.5F, 17, 16, 11, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.0F, -10.5F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 96, -8.0F, -4.5F, -7.0F, 16, 15, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.5348F, 0.8963F, -6.7252F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 95, 45, -7.0348F, -5.0963F, -6.0748F, 11, 3, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 117, 0, -7.5348F, -0.8946F, -14.9876F, 12, 4, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 44, 2.4652F, 3.0054F, -14.2876F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 43, 2.9652F, 2.6054F, -12.2876F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 144, 62, -5.0348F, 0.1054F, -23.9876F, 7, 3, 9, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 19, -5.5348F, 3.0054F, -14.2876F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 39, -6.0348F, 2.6054F, -12.2876F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5348F, 1.6054F, -19.4876F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 143, 40, -3.0F, -2.4F, -4.1F, 6, 2, 10, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0348F, 0.8587F, -29.5283F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 54, 78, -3.0F, -0.4F, -0.7F, 5, 2, 1, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5348F, 1.1665F, -30.374F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3491F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 0, -2.0F, -0.5F, -0.6F, 4, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.0348F, 1.7024F, -30.3205F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.48F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 10, 42, -1.0F, -1.0F, -1.3F, 3, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-5.1348F, 3.7683F, -19.0011F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0436F, 0.0F, 0.1309F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 19, 0.0F, -0.9997F, 2.6227F, 0, 1, 1, 0.001F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 2, 4, 0.0F, -0.9997F, 0.7727F, 0, 1, 1, 0.001F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-5.1348F, 3.7683F, -19.0011F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, 0.0F, 0.1309F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 10, 0.0F, -1.219F, -0.9644F, 0, 2, 1, 0.001F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 11, 0.0F, -1.6026F, -4.7117F, 0, 3, 1, 0.001F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-5.1348F, 3.7683F, -19.0011F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2182F, 0.0F, 0.1309F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, 0.0F, -2.2954F, -2.8856F, 0, 4, 1, 0.001F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-4.5042F, 3.3004F, -24.6652F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2231F, 0.1302F, 0.5583F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 12, 44, -0.2F, -0.5F, -0.7F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-4.2427F, 2.6564F, -27.7365F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1099F, 0.0688F, 0.5316F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 16, 14, -0.1067F, -0.9232F, 0.4015F, 0, 2, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-4.0427F, 2.4564F, -27.7365F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0003F, 0.0133F, 0.4846F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 5, 0.0703F, -1.0021F, -1.1609F, 0, 3, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.9043F, 2.4502F, -30.4902F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0627F, -0.0227F, 0.8324F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 1, 0.0F, -1.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.9043F, 2.3543F, -31.586F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0715F, 0.05F, 0.6091F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 4, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.9348F, 2.3986F, -32.0875F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.3491F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, -0.75F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 2, 0, 0.9F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 4, 0, 2.55F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.8348F, 2.4502F, -30.4902F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0627F, 0.0227F, -0.8324F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 14, 0.0F, -1.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.8348F, 2.3543F, -31.586F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0715F, -0.05F, -0.6091F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 44, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.0348F, 1.7024F, -30.3205F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 17, -2.0F, -0.2F, -1.8F, 5, 1, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.1732F, 2.6564F, -27.7365F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1099F, -0.0688F, -0.5316F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 2, 39, 0.1067F, -0.9232F, 0.4015F, 0, 2, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.9732F, 2.4564F, -27.7365F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0003F, -0.0133F, -0.4846F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 16, 8, -0.0703F, -1.0021F, -1.1609F, 0, 3, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.5348F, 1.1328F, -26.3391F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.096F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 57, -2.5F, 0.2F, -3.0F, 5, 1, 3, 0.015F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 40, 96, -2.5F, -1.0F, -3.0F, 5, 2, 6, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.4347F, 3.3004F, -24.6652F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.2231F, -0.1302F, -0.5583F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 14, 44, 0.2F, -0.5F, -0.7F, 0, 1, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.5348F, 1.6708F, -25.6166F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.2618F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 108, 94, -3.0F, -1.1F, -0.5F, 6, 2, 3, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(2.0652F, 3.7683F, -19.0011F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0436F, 0.0F, -0.1309F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 18, 43, 0.0F, -0.9997F, 2.6227F, 0, 1, 1, 0.001F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 12, 43, 0.0F, -0.9997F, 0.7727F, 0, 1, 1, 0.001F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(2.0652F, 3.7683F, -19.0011F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1309F, 0.0F, -0.1309F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 39, 0.0F, -1.219F, -0.9644F, 0, 2, 1, 0.001F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 18, 1, 0.0F, -1.6026F, -4.7117F, 0, 3, 1, 0.001F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(2.0652F, 3.7683F, -19.0011F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2182F, 0.0F, -0.1309F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 2, 0, 0.0F, -2.2954F, -2.8856F, 0, 4, 1, 0.001F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.0348F, -3.5963F, -6.0748F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.3927F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 110, 124, -5.0F, -1.3F, -9.5F, 9, 3, 10, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.0348F, 4.6037F, -11.7748F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2618F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 69, 0, -8.0F, -6.0F, 4.5F, 15, 11, 9, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.5348F, 5.4608F, 2.4463F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 144, -5.0F, -4.8571F, -11.7212F, 10, 7, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 96, -2.5F, 4.7918F, -30.0088F, 5, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 108, 0, -3.0F, 4.7918F, -28.0088F, 6, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 117, 15, -2.5F, 3.6387F, -30.0992F, 5, 2, 3, 0.01F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, -0.8571F, -14.2212F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2618F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 4, 42, -4.9F, 1.5F, 0.0F, 0, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 2, 42, -4.1F, 1.3F, -2.3F, 0, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 14, 43, 3.9F, 1.5F, 0.0F, 0, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 2, 44, 3.1F, 1.3F, -2.3F, 0, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 119, 89, -6.0F, 1.7F, -2.5F, 11, 4, 10, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-3.5F, 2.4633F, -20.9971F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1739F, 0.0151F, -0.0859F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 42, 0.2F, -0.4343F, 3.2561F, 0, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 19, 41, 0.2F, -0.4343F, 1.4561F, 0, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 17, 41, 0.2F, -0.4343F, -0.4439F, 0, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 4, 41, 0.2F, -0.3343F, -2.6439F, 0, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 2, 41, 0.2F, -0.6343F, -4.1939F, 0, 1, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-2.302F, 3.5668F, -30.0341F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.121F, 0.05F, -0.3897F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 4, 3, -1.2065F, -0.977F, 2.9583F, 0, 2, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-2.8319F, 3.3808F, -28.3738F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0436F, 0.0F, -0.7854F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 4, 0, -0.3F, -1.5F, -0.2F, 0, 3, 1, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-2.8282F, 3.4387F, -29.9218F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.1117F, 0.0847F, -0.7645F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 18, 4, 0.0082F, -1.5606F, -0.5469F, 0, 3, 1, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-2.4463F, 4.1919F, -31.9263F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1267F, 0.2126F, -0.8625F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 18, 12, -0.1F, -2.0F, -0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-2.3717F, 4.4522F, -33.3348F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0903F, 0.0824F, -0.738F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 41, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.2887F, 4.4619F, -33.8336F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.829F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 19, 0, -0.5F, -0.5F, -0.1F, 1, 1, 0, 0.0F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 16, 45, 2.0774F, -0.5F, -0.1F, 1, 1, 0, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(2.8282F, 3.4387F, -29.9218F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1117F, -0.0847F, 0.7645F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 18, 7, -0.0082F, -1.5606F, -0.5469F, 0, 3, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(2.4463F, 4.1919F, -31.9263F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1267F, -0.2126F, 0.8625F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 4, 39, 0.1F, -2.0F, -0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(2.3717F, 4.4522F, -33.3348F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0903F, -0.0824F, 0.738F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 4, 44, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(1.0F, 4.6234F, -31.8592F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.2182F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 108, 89, -3.5F, -0.5F, -2.0F, 5, 1, 4, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(2.8319F, 3.3808F, -28.3738F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0436F, 0.0F, 0.7854F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 16, 0.3F, -1.5F, -0.2F, 0, 3, 1, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(2.302F, 3.5668F, -30.0341F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.121F, -0.05F, 0.3897F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 10, 1, 1.2065F, -0.977F, 2.9583F, 0, 2, 1, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 4.7918F, -29.2088F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.1309F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 61, 54, -3.5F, -0.9F, 0.9F, 7, 2, 3, -0.001F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(1.5F, 5.5095F, -33.1652F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.6981F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 10, 40, -3.5F, -0.7F, -0.3F, 4, 1, 1, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(1.0F, 5.5335F, -30.7612F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.3054F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 54, 75, -3.5F, -0.8F, -1.8F, 5, 2, 1, 0.01F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(1.0F, 5.5335F, -30.7612F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.1309F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 54, 87, -3.5F, -0.9F, -1.0F, 5, 2, 2, -0.001F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(3.5F, 2.4633F, -20.9971F);
        this.jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.1739F, -0.0151F, 0.0859F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 43, -0.2F, -0.4343F, 3.2561F, 0, 1, 1, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 2, 43, -0.2F, -0.4343F, 1.4561F, 0, 1, 1, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 4, 43, -0.2F, -0.4343F, -0.4439F, 0, 1, 1, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 18, 42, -0.2F, -0.3343F, -2.6439F, 0, 1, 1, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 10, 43, -0.2F, -0.6343F, -4.1939F, 0, 1, 1, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, 5.499F, -18.831F);
        this.jaw.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1745F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 126, 15, -4.0F, -3.3F, -6.4F, 7, 3, 10, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 5.499F, -18.831F);
        this.jaw.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0873F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 140, 127, -3.0F, -1.2F, -6.4F, 6, 2, 10, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, -0.8571F, -14.2212F);
        this.jaw.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.1309F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 61, 45, -5.0F, 4.7F, -1.9F, 10, 2, 7, -0.001F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 36, 116, -5.0F, 1.7F, 4.5F, 10, 5, 12, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -2.0F;
        this.hips.offsetX = -1.338F;
        this.hips.scaleChildren = true;
        float scaler = 1.63F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
            resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLiopleurodon ee = (EntityPrehistoricFloraLiopleurodon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLiopleurodon entity = (EntityPrehistoricFloraLiopleurodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10 + (((tickAnim - 10) / 3) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5) + (((tickAnim - 10) / 3) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10 + (((tickAnim - 13) / 7) * (0-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5) + (((tickAnim - 13) / 7) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10 + (((tickAnim - 10) / 3) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5) + (((tickAnim - 10) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10 + (((tickAnim - 13) / 7) * (0-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5) + (((tickAnim - 13) / 7) * (0-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 0) / 10) * (-9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25 + (((tickAnim - 10) / 3) * (-11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15-(-9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10) + (((tickAnim - 10) / 3) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15 + (((tickAnim - 13) / 7) * (0-(-11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10) + (((tickAnim - 13) / 7) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 0) / 10) * (14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1-(14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1 + (((tickAnim - 13) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLiopleurodon entity = (EntityPrehistoricFloraLiopleurodon) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*2.5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-3));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*3));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*-2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-20))*3));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-0.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*0.5));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*5));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30), rightarm.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-30), rightarm.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-20));
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5), rightarm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-5), rightarm2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*-10));
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*5), righthand.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*-5), righthand.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*-10));
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(13.8249+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*30), rightleg.rotateAngleY + (float) Math.toRadians(6.4639+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-25), rightleg.rotateAngleZ + (float) Math.toRadians(-22.1817+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-10));
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*5), rightleg2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*-5), rightleg2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*-10));
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5), rightfoot.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*-5), rightfoot.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*-10));
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30), leftarm.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*30), leftarm.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*30));
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5), leftarm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*5), leftarm2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*20));
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-5), lefthand.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*5), lefthand.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*10));
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(13.8249+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*30), leftleg.rotateAngleY + (float) Math.toRadians(6.4639+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*25), leftleg.rotateAngleZ + (float) Math.toRadians(22.1817+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*10));
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*5), leftleg2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*5), leftleg2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*10));
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5), leftfoot.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*5), leftfoot.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*10));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLiopleurodon entity = (EntityPrehistoricFloraLiopleurodon) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+80))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-1.5);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*-2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-10))*-1));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-40))*4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-40))*3), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-3));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+60))*2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-0.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+50))*1));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-2.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*3));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*1.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-190))*-0.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-80))*1));
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(18.1113+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20), rightarm.rotateAngleY + (float) Math.toRadians(-6.8846+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20), rightarm.rotateAngleZ + (float) Math.toRadians(-17.4211+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*-20));
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5), rightarm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-10), rightarm2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15));
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+300))*-5), righthand.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*-10), righthand.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*-15));
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(20.1378+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*-20), rightleg.rotateAngleY + (float) Math.toRadians(4.6685+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*-20), rightleg.rotateAngleZ + (float) Math.toRadians(-24.2594+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15));
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*-5), rightleg2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*-15), rightleg2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*-10));
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5), rightfoot.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+160))*-15), rightfoot.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*-10));
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(19.288+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20), leftarm.rotateAngleY + (float) Math.toRadians(-0.3373+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*30), leftarm.rotateAngleZ + (float) Math.toRadians(17.4211+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*20));
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5), leftarm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*10), leftarm2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*15));
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(25.9744+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*-20), leftleg.rotateAngleY + (float) Math.toRadians(-0.7921+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*20), leftleg.rotateAngleZ + (float) Math.toRadians(35.3211+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*15));
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*-5.1156), leftleg2.rotateAngleY + (float) Math.toRadians(-4.984+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*15), leftleg2.rotateAngleZ + (float) Math.toRadians(4.4206+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10));
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5.0737), leftfoot.rotateAngleY + (float) Math.toRadians(-5.9622+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+160))*15), leftfoot.rotateAngleZ + (float) Math.toRadians(4.0862+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*10));
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+300))*5), lefthand.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*10), lefthand.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*15));


    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLiopleurodon entity = (EntityPrehistoricFloraLiopleurodon) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -2.5 + (((tickAnim - 0) / 120) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = -6 + (((tickAnim - 0) / 120) * (-6-(-6)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -15 + (((tickAnim - 0) / 120) * (-15-(-15)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -10 + (((tickAnim - 0) / 120) * (-10-(-10)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 17.48072 + (((tickAnim - 0) / 120) * (17.48072-(17.48072)));
            yy = 0.95645 + (((tickAnim - 0) / 120) * (0.95645-(0.95645)));
            zz = -2.30991 + (((tickAnim - 0) / 120) * (-2.30991-(-2.30991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -12.5 + (((tickAnim - 0) / 120) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = -25 + (((tickAnim - 0) / 120) * (-25-(-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 0) / 120) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 0) / 120) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 0) / 10) * (-2-(1.5)));
            yy = -5 + (((tickAnim - 0) / 10) * (-5-(-5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 10) / 8) * (-2.33413-(-2)));
            yy = -5 + (((tickAnim - 10) / 8) * (-5-(-5)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2.33413 + (((tickAnim - 18) / 7) * (-2.33413-(-2.33413)));
            yy = -5 + (((tickAnim - 18) / 7) * (-5-(-5)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.33413 + (((tickAnim - 25) / 5) * (4.28236-(-2.33413)));
            yy = -5 + (((tickAnim - 25) / 5) * (-5-(-5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 4.28236 + (((tickAnim - 30) / 12) * (2.5-(4.28236)));
            yy = -5 + (((tickAnim - 30) / 12) * (-5-(-5)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 42) / 78) * (1.5-(2.5)));
            yy = -5 + (((tickAnim - 42) / 78) * (-5-(-5)));
            zz = 0 + (((tickAnim - 42) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 3.75 + (((tickAnim - 0) / 10) * (8.5-(3.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 8.5 + (((tickAnim - 10) / 8) * (0.07022-(8.5)));
            yy = 2 + (((tickAnim - 10) / 8) * (2.42978-(2)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0.07022 + (((tickAnim - 18) / 3) * (-7.34429-(0.07022)));
            yy = 2.42978 + (((tickAnim - 18) / 3) * (2.38764-(2.42978)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -7.34429 + (((tickAnim - 21) / 7) * (0.74706-(-7.34429)));
            yy = 2.38764 + (((tickAnim - 21) / 7) * (2.27326-(2.38764)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 0.74706 + (((tickAnim - 28) / 14) * (5-(0.74706)));
            yy = 2.27326 + (((tickAnim - 28) / 14) * (0-(2.27326)));
            zz = 0 + (((tickAnim - 28) / 14) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 120) {
            xx = 5 + (((tickAnim - 42) / 78) * (3.75-(5)));
            yy = 0 + (((tickAnim - 42) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (2.5-(0)));
            yy = -10 + (((tickAnim - 0) / 22) * (-10-(-10)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 2.5 + (((tickAnim - 22) / 4) * (-0.0753-(2.5)));
            yy = -10 + (((tickAnim - 22) / 4) * (-10-(-10)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -0.0753 + (((tickAnim - 26) / 3) * (-0.07343-(-0.0753)));
            yy = -10 + (((tickAnim - 26) / 3) * (-10-(-10)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -0.07343 + (((tickAnim - 29) / 2) * (-2.57249-(-0.07343)));
            yy = -10 + (((tickAnim - 29) / 2) * (-10-(-10)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -2.57249 + (((tickAnim - 31) / 2) * (-0.0559-(-2.57249)));
            yy = -10 + (((tickAnim - 31) / 2) * (-10-(-10)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = -0.0559 + (((tickAnim - 33) / 9) * (-3.5-(-0.0559)));
            yy = -10 + (((tickAnim - 33) / 9) * (2.41-(-10)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = -3.5 + (((tickAnim - 42) / 9) * (-3.75-(-3.5)));
            yy = 2.41 + (((tickAnim - 42) / 9) * (2.41-(2.41)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 57) {
            xx = -3.75 + (((tickAnim - 51) / 6) * (-3.75-(-3.75)));
            yy = 2.41 + (((tickAnim - 51) / 6) * (4.91-(2.41)));
            zz = 0 + (((tickAnim - 51) / 6) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = -3.75 + (((tickAnim - 57) / 6) * (-3.75-(-3.75)));
            yy = 4.91 + (((tickAnim - 57) / 6) * (2.41-(4.91)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -3.75 + (((tickAnim - 63) / 10) * (-7.5-(-3.75)));
            yy = 2.41 + (((tickAnim - 63) / 10) * (-4.4155-(2.41)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 73) / 7) * (-3-(-7.5)));
            yy = -4.4155 + (((tickAnim - 73) / 7) * (-10-(-4.4155)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -3 + (((tickAnim - 80) / 40) * (0-(-3)));
            yy = -10 + (((tickAnim - 80) / 40) * (-10-(-10)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (7.5-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 7.5 + (((tickAnim - 21) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -20.63777 + (((tickAnim - 0) / 13) * (-20.63777-(-20.63777)));
            yy = 13.99872 + (((tickAnim - 0) / 13) * (13.99872-(13.99872)));
            zz = -29.15822 + (((tickAnim - 0) / 13) * (-29.15822-(-29.15822)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -20.63777 + (((tickAnim - 13) / 11) * (9.94978-(-20.63777)));
            yy = 13.99872 + (((tickAnim - 13) / 11) * (16.70204-(13.99872)));
            zz = -29.15822 + (((tickAnim - 13) / 11) * (3.09494-(-29.15822)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 9.94978 + (((tickAnim - 24) / 8) * (-20.63777-(9.94978)));
            yy = 16.70204 + (((tickAnim - 24) / 8) * (13.99872-(16.70204)));
            zz = 3.09494 + (((tickAnim - 24) / 8) * (-29.15822-(3.09494)));
        }
        else if (tickAnim >= 32 && tickAnim < 120) {
            xx = -20.63777 + (((tickAnim - 32) / 88) * (-20.63777-(-20.63777)));
            yy = 13.99872 + (((tickAnim - 32) / 88) * (13.99872-(13.99872)));
            zz = -29.15822 + (((tickAnim - 32) / 88) * (-29.15822-(-29.15822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 11.95212 + (((tickAnim - 0) / 13) * (11.95212-(11.95212)));
            yy = -0.84378 + (((tickAnim - 0) / 13) * (-0.84378-(-0.84378)));
            zz = 22.04538 + (((tickAnim - 0) / 13) * (22.04538-(22.04538)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.95212 + (((tickAnim - 13) / 5) * (-0.67296-(11.95212)));
            yy = -0.84378 + (((tickAnim - 13) / 5) * (10.3627-(-0.84378)));
            zz = 22.04538 + (((tickAnim - 13) / 5) * (5.98259-(22.04538)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.67296 + (((tickAnim - 18) / 5) * (0.21344-(-0.67296)));
            yy = 10.3627 + (((tickAnim - 18) / 5) * (8.77183-(10.3627)));
            zz = 5.98259 + (((tickAnim - 18) / 5) * (3.89615-(5.98259)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0.21344 + (((tickAnim - 23) / 9) * (11.95212-(0.21344)));
            yy = 8.77183 + (((tickAnim - 23) / 9) * (-0.84378-(8.77183)));
            zz = 3.89615 + (((tickAnim - 23) / 9) * (22.04538-(3.89615)));
        }
        else if (tickAnim >= 32 && tickAnim < 120) {
            xx = 11.95212 + (((tickAnim - 32) / 88) * (11.95212-(11.95212)));
            yy = -0.84378 + (((tickAnim - 32) / 88) * (-0.84378-(-0.84378)));
            zz = 22.04538 + (((tickAnim - 32) / 88) * (22.04538-(22.04538)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 15) * (5-(5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (5.07094-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-1.33089-(0)));
            zz = 5 + (((tickAnim - 15) / 3) * (3.43164-(5)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5.07094 + (((tickAnim - 18) / 5) * (-22.39782-(5.07094)));
            yy = -1.33089 + (((tickAnim - 18) / 5) * (-0.31727-(-1.33089)));
            zz = 3.43164 + (((tickAnim - 18) / 5) * (-1.78216-(3.43164)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -22.39782 + (((tickAnim - 23) / 5) * (0-(-22.39782)));
            yy = -0.31727 + (((tickAnim - 23) / 5) * (0-(-0.31727)));
            zz = -1.78216 + (((tickAnim - 23) / 5) * (15-(-1.78216)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 15 + (((tickAnim - 28) / 6) * (5-(15)));
        }
        else if (tickAnim >= 34 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 34) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 86) * (0-(0)));
            zz = 5 + (((tickAnim - 34) / 86) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 47) * (27.5-(25)));
            zz = -12.5 + (((tickAnim - 0) / 47) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 47 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 47) / 14) * (6.42848-(0)));
            yy = 27.5 + (((tickAnim - 47) / 14) * (26.79524-(27.5)));
            zz = -12.5 + (((tickAnim - 47) / 14) * (1.53271-(-12.5)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 6.42848 + (((tickAnim - 61) / 7) * (0-(6.42848)));
            yy = 26.79524 + (((tickAnim - 61) / 7) * (27.5-(26.79524)));
            zz = 1.53271 + (((tickAnim - 61) / 7) * (-12.5-(1.53271)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 27.5 + (((tickAnim - 68) / 52) * (25-(27.5)));
            zz = -12.5 + (((tickAnim - 68) / 52) * (-12.5-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 7.5 + (((tickAnim - 0) / 47) * (7.5-(7.5)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 47) / 7) * (-0.36094-(0)));
            yy = 0 + (((tickAnim - 47) / 7) * (-4.7605-(0)));
            zz = 7.5 + (((tickAnim - 47) / 7) * (3.544-(7.5)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = -0.36094 + (((tickAnim - 54) / 4) * (-0.19022-(-0.36094)));
            yy = -4.7605 + (((tickAnim - 54) / 4) * (-7.39643-(-4.7605)));
            zz = 3.544 + (((tickAnim - 54) / 4) * (4.27202-(3.544)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -0.19022 + (((tickAnim - 58) / 5) * (0-(-0.19022)));
            yy = -7.39643 + (((tickAnim - 58) / 5) * (-10-(-7.39643)));
            zz = 4.27202 + (((tickAnim - 58) / 5) * (15-(4.27202)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 63) / 5) * (0-(-10)));
            zz = 15 + (((tickAnim - 63) / 5) * (7.5-(15)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 7.5 + (((tickAnim - 68) / 52) * (7.5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 47) * (5-(2.5)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 5 + (((tickAnim - 47) / 6) * (-5-(5)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (-7-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = -5 + (((tickAnim - 53) / 7) * (-9.25-(-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = -7 + (((tickAnim - 60) / 4) * (9.73113-(-7)));
            yy = 0 + (((tickAnim - 60) / 4) * (0.7523-(0)));
            zz = -9.25 + (((tickAnim - 60) / 4) * (12.64684-(-9.25)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 9.73113 + (((tickAnim - 64) / 4) * (0-(9.73113)));
            yy = 0.7523 + (((tickAnim - 64) / 4) * (0-(0.7523)));
            zz = 12.64684 + (((tickAnim - 64) / 4) * (5-(12.64684)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 5 + (((tickAnim - 68) / 52) * (2.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -6.39829 + (((tickAnim - 0) / 13) * (-6.39829-(-6.39829)));
            yy = 13.49959 + (((tickAnim - 0) / 13) * (13.49959-(13.49959)));
            zz = 16.72549 + (((tickAnim - 0) / 13) * (16.72549-(16.72549)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -6.39829 + (((tickAnim - 13) / 6) * (-0.70589-(-6.39829)));
            yy = 13.49959 + (((tickAnim - 13) / 6) * (15.79945-(13.49959)));
            zz = 16.72549 + (((tickAnim - 13) / 6) * (2.65435-(16.72549)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.70589 + (((tickAnim - 19) / 5) * (3.76046-(-0.70589)));
            yy = 15.79945 + (((tickAnim - 19) / 5) * (16.42888-(15.79945)));
            zz = 2.65435 + (((tickAnim - 19) / 5) * (8.56503-(2.65435)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 3.76046 + (((tickAnim - 24) / 6) * (-6.39829-(3.76046)));
            yy = 16.42888 + (((tickAnim - 24) / 6) * (13.49959-(16.42888)));
            zz = 8.56503 + (((tickAnim - 24) / 6) * (16.72549-(8.56503)));
        }
        else if (tickAnim >= 30 && tickAnim < 120) {
            xx = -6.39829 + (((tickAnim - 30) / 90) * (-6.39829-(-6.39829)));
            yy = 13.49959 + (((tickAnim - 30) / 90) * (13.49959-(13.49959)));
            zz = 16.72549 + (((tickAnim - 30) / 90) * (16.72549-(16.72549)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 5.45892 + (((tickAnim - 0) / 13) * (5.45892-(5.45892)));
            yy = 0.13586 + (((tickAnim - 0) / 13) * (0.13586-(0.13586)));
            zz = -17.54541 + (((tickAnim - 0) / 13) * (-17.54541-(-17.54541)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 5.45892 + (((tickAnim - 13) / 6) * (-0.70501-(5.45892)));
            yy = 0.13586 + (((tickAnim - 13) / 6) * (-1.58366-(0.13586)));
            zz = -17.54541 + (((tickAnim - 13) / 6) * (7.12519-(-17.54541)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -0.70501 + (((tickAnim - 19) / 6) * (7.48663-(-0.70501)));
            yy = -1.58366 + (((tickAnim - 19) / 6) * (7.54394-(-1.58366)));
            zz = 7.12519 + (((tickAnim - 19) / 6) * (-25.81232-(7.12519)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 7.48663 + (((tickAnim - 25) / 6) * (5.45892-(7.48663)));
            yy = 7.54394 + (((tickAnim - 25) / 6) * (0.13586-(7.54394)));
            zz = -25.81232 + (((tickAnim - 25) / 6) * (-17.54541-(-25.81232)));
        }
        else if (tickAnim >= 31 && tickAnim < 120) {
            xx = 5.45892 + (((tickAnim - 31) / 89) * (5.45892-(5.45892)));
            yy = 0.13586 + (((tickAnim - 31) / 89) * (0.13586-(0.13586)));
            zz = -17.54541 + (((tickAnim - 31) / 89) * (-17.54541-(-17.54541)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 14) * (5-(5)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (7.03562-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0.48013-(0)));
            zz = 5 + (((tickAnim - 14) / 5) * (3.15653-(5)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 7.03562 + (((tickAnim - 19) / 4) * (-17.46839-(7.03562)));
            yy = 0.48013 + (((tickAnim - 19) / 4) * (-2.00369-(0.48013)));
            zz = 3.15653 + (((tickAnim - 19) / 4) * (19.01401-(3.15653)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17.46839 + (((tickAnim - 23) / 5) * (14.5-(-17.46839)));
            yy = -2.00369 + (((tickAnim - 23) / 5) * (0-(-2.00369)));
            zz = 19.01401 + (((tickAnim - 23) / 5) * (-11.42-(19.01401)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 14.5 + (((tickAnim - 28) / 6) * (0-(14.5)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = -11.42 + (((tickAnim - 28) / 6) * (5-(-11.42)));
        }
        else if (tickAnim >= 34 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 34) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 86) * (0-(0)));
            zz = 5 + (((tickAnim - 34) / 86) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = -0.44857 + (((tickAnim - 0) / 47) * (-0.44857-(-0.44857)));
            yy = 23.48029 + (((tickAnim - 0) / 47) * (23.48029-(23.48029)));
            zz = 5.55218 + (((tickAnim - 0) / 47) * (5.55218-(5.55218)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = -0.44857 + (((tickAnim - 47) / 7) * (-0.44857-(-0.44857)));
            yy = 23.48029 + (((tickAnim - 47) / 7) * (23.48029-(23.48029)));
            zz = 5.55218 + (((tickAnim - 47) / 7) * (5.55218-(5.55218)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = -0.44857 + (((tickAnim - 54) / 7) * (0.91077-(-0.44857)));
            yy = 23.48029 + (((tickAnim - 54) / 7) * (27.48609-(23.48029)));
            zz = 5.55218 + (((tickAnim - 54) / 7) * (-10.52725-(5.55218)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 0.91077 + (((tickAnim - 61) / 7) * (-0.44857-(0.91077)));
            yy = 27.48609 + (((tickAnim - 61) / 7) * (23.48029-(27.48609)));
            zz = -10.52725 + (((tickAnim - 61) / 7) * (5.55218-(-10.52725)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -0.44857 + (((tickAnim - 68) / 52) * (-0.44857-(-0.44857)));
            yy = 23.48029 + (((tickAnim - 68) / 52) * (23.48029-(23.48029)));
            zz = 5.55218 + (((tickAnim - 68) / 52) * (5.55218-(5.55218)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 1.52326 + (((tickAnim - 0) / 47) * (1.52326-(1.52326)));
            yy = -0.32278 + (((tickAnim - 0) / 47) * (-0.32278-(-0.32278)));
            zz = -0.74373 + (((tickAnim - 0) / 47) * (-0.74373-(-0.74373)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 1.52326 + (((tickAnim - 47) / 7) * (1.52326-(1.52326)));
            yy = -0.32278 + (((tickAnim - 47) / 7) * (-0.32278-(-0.32278)));
            zz = -0.74373 + (((tickAnim - 47) / 7) * (-0.74373-(-0.74373)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 1.52326 + (((tickAnim - 54) / 4) * (-0.19022-(1.52326)));
            yy = -0.32278 + (((tickAnim - 54) / 4) * (-7.39643-(-0.32278)));
            zz = -0.74373 + (((tickAnim - 54) / 4) * (4.27202-(-0.74373)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -0.19022 + (((tickAnim - 58) / 5) * (2.90908-(-0.19022)));
            yy = -7.39643 + (((tickAnim - 58) / 5) * (-9.57163-(-7.39643)));
            zz = 4.27202 + (((tickAnim - 58) / 5) * (-1.99361-(4.27202)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 2.90908 + (((tickAnim - 63) / 5) * (1.52326-(2.90908)));
            yy = -9.57163 + (((tickAnim - 63) / 5) * (-0.32278-(-9.57163)));
            zz = -1.99361 + (((tickAnim - 63) / 5) * (-0.74373-(-1.99361)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 1.52326 + (((tickAnim - 68) / 52) * (1.52326-(1.52326)));
            yy = -0.32278 + (((tickAnim - 68) / 52) * (-0.32278-(-0.32278)));
            zz = -0.74373 + (((tickAnim - 68) / 52) * (-0.74373-(-0.74373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 0) / 47) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = -7.5 + (((tickAnim - 0) / 47) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 47) / 7) * (1-(1)));
            yy = 0 + (((tickAnim - 47) / 7) * (0-(0)));
            zz = -7.5 + (((tickAnim - 47) / 7) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 54) / 6) * (0-(1)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = -7.5 + (((tickAnim - 54) / 6) * (10-(-7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 60) / 4) * (7.6344-(0)));
            yy = 0 + (((tickAnim - 60) / 4) * (-0.8495-(0)));
            zz = 10 + (((tickAnim - 60) / 4) * (-9.64727-(10)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 7.6344 + (((tickAnim - 64) / 4) * (1-(7.6344)));
            yy = -0.8495 + (((tickAnim - 64) / 4) * (0-(-0.8495)));
            zz = -9.64727 + (((tickAnim - 64) / 4) * (-7.5-(-9.64727)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 68) / 52) * (1-(1)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = -7.5 + (((tickAnim - 68) / 52) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraLiopleurodon ee = (EntityPrehistoricFloraLiopleurodon) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

