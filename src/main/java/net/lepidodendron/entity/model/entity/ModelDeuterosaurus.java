package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDeuterosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDeuterosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer leftbacktoe;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer rightbacktoe;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftfronttoe;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightfronttoe;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;

    private ModelAnimator animator;

    public ModelDeuterosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 8.2722F, 15.059F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.8505F, 1.6975F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 45, -5.0F, -3.5F, -7.5F, 9, 11, 11, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(3.7495F, 1.3023F, 1.1411F);
        this.hips.addChild(leftleg);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.837F, 8.1315F, -6.041F);
        this.leftleg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6963F, -0.4937F, -0.5157F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 68, 1.4366F, -11.4936F, -5.2906F, 5, 11, 7, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(5.8066F, 3.5909F, -6.6136F);
        this.leftleg.addChild(leftleg2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.483F, 4.5335F, 1.725F);
        this.leftleg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2706F, -0.2527F, -0.0692F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 84, -1.5F, -5.0F, -2.5F, 4, 10, 5, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.2764F, 9.3965F, 2.4361F);
        this.leftleg2.addChild(leftfoot);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 0, 90, -3.5F, -0.25F, -3.75F, 7, 2, 5, 0.0F, false));

        this.leftbacktoe = new AdvancedModelRenderer(this);
        this.leftbacktoe.setRotationPoint(0.0F, 0.75F, -3.75F);
        this.leftfoot.addChild(leftbacktoe);
        this.leftbacktoe.cubeList.add(new ModelBox(leftbacktoe, 82, 99, -3.5F, -1.0F, -3.0F, 7, 2, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-3.7495F, 1.3023F, 1.1411F);
        this.hips.addChild(rightleg);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.837F, 8.1315F, -6.041F);
        this.rightleg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6963F, 0.4937F, 0.5157F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 68, -6.4366F, -11.4936F, -5.2906F, 5, 11, 7, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-5.8066F, 3.5909F, -6.6136F);
        this.rightleg.addChild(rightleg2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.483F, 4.5335F, 1.725F);
        this.rightleg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2706F, 0.2527F, 0.0692F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 84, -2.5F, -5.0F, -2.5F, 4, 10, 5, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.2764F, 9.3965F, 2.4361F);
        this.rightleg2.addChild(rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 0, 90, -3.5F, -0.25F, -3.75F, 7, 2, 5, 0.0F, true));

        this.rightbacktoe = new AdvancedModelRenderer(this);
        this.rightbacktoe.setRotationPoint(0.0F, 0.75F, -3.75F);
        this.rightfoot.addChild(rightbacktoe);
        this.rightbacktoe.cubeList.add(new ModelBox(rightbacktoe, 82, 99, -3.5F, -1.0F, -3.0F, 7, 2, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8733F, 4.1986F);
        this.hips.addChild(tail);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 8.1035F, 19.9387F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 68, -4.0F, 1.0281F, -22.7522F, 7, 8, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.4942F, 4.1159F);
        this.tail.addChild(tail2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 5.6093F, 15.8228F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 72, -3.0F, -1.0448F, -17.6518F, 6, 6, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 2.6081F, 5.0866F);
        this.tail2.addChild(tail3);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 3.0012F, 10.7362F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 76, -3.0F, -1.9478F, -11.8611F, 5, 5, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 2.3434F, 6.2219F);
        this.tail3.addChild(tail4);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.6578F, 4.5142F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 71, 58, -1.0F, -1.472F, -4.5064F, 3, 3, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.2014F, 9.6303F);
        this.tail4.addChild(tail5);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5436F, -5.116F);
        this.tail5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 75, 45, -1.0F, -0.0156F, 5.0827F, 2, 2, 10, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.542F, -3.222F);
        this.hips.addChild(body);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 2.3805F, -3.379F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 28, -6.0F, -5.95F, -7.8F, 11, 16, 11, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.6474F, -10.0907F);
        this.body.addChild(body2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.0672F, -4.2464F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -6.0F, -8.1F, -6.25F, 12, 16, 11, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.8328F, -7.2464F);
        this.body2.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 45, 19, -6.5F, -0.9F, -8.5F, 13, 16, 9, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(6.2313F, 11.8628F, -4.417F);
        this.chest.addChild(leftarm);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2313F, 1.0873F, 4.8109F);
        this.leftarm.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6025F, 0.8036F, -0.387F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 56, 0.1F, -2.5F, -4.55F, 5, 6, 10, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(4.7067F, 1.6748F, 6.6032F);
        this.leftarm.addChild(leftarm2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.3121F, 3.7743F, -2.0227F);
        this.leftarm2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3182F, -0.0419F, -0.1208F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 65, 96, -1.9F, -4.3F, -1.75F, 4, 10, 4, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(1.2254F, 8.7743F, -3.5379F);
        this.leftarm2.addChild(lefthand);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 90, 25, -3.5F, -0.25F, -3.0F, 7, 2, 5, 0.0F, false));

        this.leftfronttoe = new AdvancedModelRenderer(this);
        this.leftfronttoe.setRotationPoint(0.0F, 0.75F, -3.0F);
        this.lefthand.addChild(leftfronttoe);
        this.leftfronttoe.cubeList.add(new ModelBox(leftfronttoe, 99, 86, -3.5F, -1.0F, -3.0F, 7, 2, 3, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-6.2313F, 11.8628F, -4.417F);
        this.chest.addChild(rightarm);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.2313F, 1.0873F, 4.8109F);
        this.rightarm.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6025F, -0.8036F, 0.387F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 56, -5.1F, -2.5F, -4.55F, 5, 6, 10, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-4.7067F, 1.6748F, 6.6032F);
        this.rightarm.addChild(rightarm2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.3121F, 3.7743F, -2.0227F);
        this.rightarm2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3182F, 0.0419F, 0.1208F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 65, 96, -2.1F, -4.3F, -1.75F, 4, 10, 4, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-1.2254F, 8.7743F, -3.5379F);
        this.rightarm2.addChild(righthand);
        this.righthand.cubeList.add(new ModelBox(righthand, 90, 25, -3.5F, -0.25F, -3.0F, 7, 2, 5, 0.0F, true));

        this.rightfronttoe = new AdvancedModelRenderer(this);
        this.rightfronttoe.setRotationPoint(0.0F, 0.75F, -3.0F);
        this.righthand.addChild(rightfronttoe);
        this.rightfronttoe.cubeList.add(new ModelBox(rightfronttoe, 99, 86, -3.5F, -1.0F, -3.0F, 7, 2, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.6624F, -7.7867F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.1745F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 4.1876F, -1.4633F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 47, 0, -5.0F, -6.75F, -3.25F, 9, 11, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.3124F, -3.0633F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 80, 0, -4.0F, -2.5F, -3.8F, 8, 9, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.7212F, -3.3012F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 7, -2.0F, 2.5973F, -9.9455F, 4, 2, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 62, 1.0F, 4.5973F, -9.9455F, 1, 2, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 47, 24, -2.0F, 4.5973F, -9.9455F, 1, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.9785F, 1.9273F, -5.3984F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0348F, -0.2603F, -0.002F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 98, 68, -1.6F, 0.0F, -3.0F, 3, 2, 6, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.0631F, 1.8247F, -1.2582F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.036F, -0.3475F, -0.0068F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 87, -1.0948F, -0.0494F, -5.5533F, 4, 2, 7, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0509F, -0.2483F, -6.0775F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.7234F, -0.2537F, -0.1687F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 82, 105, -0.9F, -1.0F, -1.5F, 2, 2, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.7367F, -0.6703F, -4.1617F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1544F, -0.4022F, -0.1736F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 28, -1.0F, -1.0F, -1.6F, 2, 2, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.0631F, 1.8247F, -1.2582F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0042F, -0.3503F, 0.1774F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 90, 44, -1.0627F, -2.8652F, -4.4259F, 4, 3, 6, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.1631F, 0.9129F, -5.2323F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.012F, -0.2623F, 0.1787F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 73, -0.5F, -0.95F, -0.5F, 1, 2, 2, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 38, 97, -0.3F, -0.9F, -5.5F, 1, 2, 8, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0509F, -0.2483F, -6.0775F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.7234F, 0.2537F, 0.1687F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 82, 105, -1.1F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.1675F, -7.2852F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3054F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -1.0F, -0.9769F, -1.5306F, 2, 3, 3, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5984F, 0.7076F, -7.1831F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6109F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 56, -1.5984F, -2.9332F, -2.6922F, 2, 3, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.0025F, -8.5231F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2618F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 78, 72, -1.0F, -1.4769F, -0.5328F, 2, 3, 1, 0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.2388F, -9.8746F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5236F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 106, 54, -1.0F, -0.6F, -1.7F, 2, 2, 3, 0.02F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 3.5973F, -8.4455F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 73, 0, -1.4F, 0.7F, -1.2F, 0, 1, 3, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 78, 1.4F, 0.7F, -1.2F, 0, 1, 3, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 105, 77, -2.0F, -2.2F, -1.2F, 4, 3, 3, 0.02F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 4.4312F, -10.7239F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0436F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 54, 105, -1.0F, -1.6F, -1.1F, 2, 2, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 2.6952F, -11.9066F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0436F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 105, 0, -1.5F, -1.1F, -0.3F, 3, 2, 3, -0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 3.447F, -9.5223F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3927F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 105, 44, -2.0F, -0.8F, -2.4F, 3, 2, 3, 0.02F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.3857F, -0.8646F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1222F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 17, -3.0F, -1.0F, -1.5F, 6, 2, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.652F, -3.8544F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1222F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 68, -1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.675F, -5.372F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.6109F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 34, 34, -1.0F, -0.9394F, -1.15F, 2, 2, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(2.1631F, 0.9129F, -5.2323F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.012F, 0.2623F, -0.1787F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 73, -0.5F, -0.95F, -0.5F, 1, 2, 2, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 38, 97, -0.7F, -0.9F, -5.5F, 1, 2, 8, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(3.0631F, 1.8247F, -1.2582F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0042F, 0.3503F, -0.1774F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 90, 44, -2.9373F, -2.8652F, -4.4259F, 4, 3, 6, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(3.0631F, 1.8247F, -1.2582F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.036F, 0.3475F, 0.0068F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 46, 87, -2.9052F, -0.0494F, -5.5533F, 4, 2, 7, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.9785F, 1.9273F, -5.3984F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0348F, 0.2603F, 0.002F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 98, 68, -1.4F, 0.0F, -3.0F, 3, 2, 6, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 5.4211F, -1.2494F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3491F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 88, 58, -3.0F, -3.75F, -2.2F, 6, 4, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 4.3256F, -4.4258F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3054F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 19, 100, -1.5F, -1.0F, -0.8F, 4, 2, 5, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.7367F, -0.6703F, -4.1617F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1544F, 0.4022F, 0.1736F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 34, 28, -1.0F, -1.0F, -1.6F, 2, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.9607F, -3.1386F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2356F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 1.3441F, -7.5642F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1745F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 36, 7, -1.0F, -0.7F, -0.75F, 2, 1, 2, -0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 2.0537F, -7.6658F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.48F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 34, -1.5F, -0.7F, -0.9F, 3, 2, 2, 0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 1.5196F, -5.8993F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0436F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 5, 62, -1.4F, -1.9F, -1.2F, 1, 2, 1, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 64, 45, 0.4F, -1.9F, -1.2F, 1, 2, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.3797F, 1.1912F, -3.3F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2587F, -0.3137F, -0.0733F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 90, 33, -0.8F, -1.0F, -4.0F, 2, 2, 8, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.3797F, 1.1912F, -3.3F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.2587F, 0.3137F, 0.0733F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 90, 33, -1.2F, -1.0F, -4.0F, 2, 2, 8, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 0.5062F, -3.0317F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.3491F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 97, 99, -1.0F, -0.5F, -4.6F, 3, 1, 6, -0.01F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, 0.7149F, -2.4872F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1745F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 81, 14, -1.0F, -0.3F, -5.2F, 3, 2, 8, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.8149F, -0.1872F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2182F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 36, 0, -2.5F, -1.25F, -1.5F, 5, 3, 3, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.1973F, 1.6844F);
        this.jaw.addChild(throat);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.5409F, 0.68F);
        this.throat.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1571F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 49, 97, -2.0F, -2.3578F, -0.9F, 4, 3, 3, 0.01F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.5701F, -1.4388F);
        this.throat.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.3229F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 62, 87, -2.0F, -1.7F, -1.5F, 4, 2, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
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
        this.hips.offsetY = 0.1F;
        this.hips.offsetX = -0.15F;
        this.hips.rotateAngleY = (float)Math.toRadians(-130);
        this.hips.rotateAngleX = (float)Math.toRadians(19);
        this.hips.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 0.55F;
        this.hips.scaleChildren = true;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.body1.offsetY = 0F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraDeuterosaurus Deuterosaurus = (EntityPrehistoricFloraDeuterosaurus) e;
        float masterSpeed = Deuterosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        Deuterosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Deuterosaurus.getAnimation() == Deuterosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Deuterosaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Deuterosaurus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Deuterosaurus.getIsFast()) { //Running
                if (Deuterosaurus.getIsSneaking()) {

                }
                else { //normal run:

                }


            }
            else { //Walking



            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }




    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDeuterosaurus ee = (EntityPrehistoricFloraDeuterosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    if (ee.getIsSneaking()) {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
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
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) { // not present
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) { // not present
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The roar anim
            animTerritorial(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //Ambient noise, closed-mouth, no amim
            //animTerritorial(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDeuterosaurus entity = (EntityPrehistoricFloraDeuterosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*1), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*6));

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.65 + (((tickAnim - 0) / 12) * (0.3-(-0.65)));
            zz = 0 + (((tickAnim - 0) / 12) * (-1.75-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0.3 + (((tickAnim - 12) / 18) * (-0.65-(0.3)));
            zz = -1.75 + (((tickAnim - 12) / 18) * (0-(-1.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.65 + (((tickAnim - 30) / 15) * (0.3-(-0.65)));
            zz = 0 + (((tickAnim - 30) / 15) * (-1.75-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 45) / 15) * (-0.65-(0.3)));
            zz = -1.75 + (((tickAnim - 45) / 15) * (0-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/3))*4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/3))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/3))*6), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/3))*6), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/3))*6), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-2), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*2), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-2), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*-4));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 0) / 30) * (43.80344-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (-13.09687-(0)));
            zz = 10 + (((tickAnim - 0) / 30) * (-2.14233-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 43.80344 + (((tickAnim - 30) / 10) * (15.3472-(43.80344)));
            yy = -13.09687 + (((tickAnim - 30) / 10) * (-6.85301-(-13.09687)));
            zz = -2.14233 + (((tickAnim - 30) / 10) * (-5.77599-(-2.14233)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 15.3472 + (((tickAnim - 40) / 11) * (-4.39544-(15.3472)));
            yy = -6.85301 + (((tickAnim - 40) / 11) * (-3.22494-(-6.85301)));
            zz = -5.77599 + (((tickAnim - 40) / 11) * (2.57601-(-5.77599)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -4.39544 + (((tickAnim - 51) / 9) * (-12.5-(-4.39544)));
            yy = -3.22494 + (((tickAnim - 51) / 9) * (0-(-3.22494)));
            zz = 2.57601 + (((tickAnim - 51) / 9) * (10-(2.57601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 0) / 15) * (41.04999-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.82436-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-9.13715-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 41.04999 + (((tickAnim - 15) / 15) * (22.57734-(41.04999)));
            yy = -11.82436 + (((tickAnim - 15) / 15) * (-4.61854-(-11.82436)));
            zz = -9.13715 + (((tickAnim - 15) / 15) * (-1.91757-(-9.13715)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 22.57734 + (((tickAnim - 30) / 10) * (35.46788-(22.57734)));
            yy = -4.61854 + (((tickAnim - 30) / 10) * (-14.51659-(-4.61854)));
            zz = -1.91757 + (((tickAnim - 30) / 10) * (-9.54912-(-1.91757)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 35.46788 + (((tickAnim - 40) / 11) * (-34.77982-(35.46788)));
            yy = -14.51659 + (((tickAnim - 40) / 11) * (-6.83134-(-14.51659)));
            zz = -9.54912 + (((tickAnim - 40) / 11) * (-4.4937-(-9.54912)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -34.77982 + (((tickAnim - 51) / 9) * (-7.5-(-34.77982)));
            yy = -6.83134 + (((tickAnim - 51) / 9) * (0-(-6.83134)));
            zz = -4.4937 + (((tickAnim - 51) / 9) * (0-(-4.4937)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 0) / 8) * (-11.25-(17.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -11.25 + (((tickAnim - 8) / 7) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (7.5-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 7.5 + (((tickAnim - 30) / 11) * (-35.87-(7.5)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = -35.87 + (((tickAnim - 41) / 10) * (37.78-(-35.87)));
            yy = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 10) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 37.78 + (((tickAnim - 51) / 9) * (17.5-(37.78)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.62-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -10.62 + (((tickAnim - 8) / 22) * (-72.5-(-10.62)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = -72.5 + (((tickAnim - 30) / 11) * (9.21-(-72.5)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 9.21 + (((tickAnim - 41) / 10) * (13.89-(9.21)));
            yy = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 10) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 13.89 + (((tickAnim - 51) / 9) * (0-(13.89)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 0) / 10) * (10-(35)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 10) / 20) * (-70-(10)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -70 + (((tickAnim - 30) / 10) * (-17.5-(-70)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -17.5 + (((tickAnim - 40) / 20) * (35-(-17.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 0) / 10) * (-47.5-(-20)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -47.5 + (((tickAnim - 10) / 15) * (-0.62-(-47.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -0.62 + (((tickAnim - 25) / 5) * (25-(-0.62)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 25 + (((tickAnim - 30) / 6) * (-1.46-(25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -1.46 + (((tickAnim - 36) / 4) * (-7.5-(-1.46)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 40) / 20) * (-20-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 52.5 + (((tickAnim - 0) / 10) * (77.5-(52.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 77.5 + (((tickAnim - 10) / 15) * (63.13-(77.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 63.13 + (((tickAnim - 25) / 5) * (45-(63.13)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 45 + (((tickAnim - 30) / 6) * (41.87-(45)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 41.87 + (((tickAnim - 36) / 4) * (22.5-(41.87)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 22.5 + (((tickAnim - 40) / 20) * (52.5-(22.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -32.5 + (((tickAnim - 0) / 5) * (81.66-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 81.66 + (((tickAnim - 5) / 5) * (35.83-(81.66)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 35.83 + (((tickAnim - 10) / 11) * (-14.93-(35.83)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -14.93 + (((tickAnim - 21) / 9) * (-2.5-(-14.93)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 30) / 10) * (4.17-(-2.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 4.17 + (((tickAnim - 40) / 13) * (-39.44-(4.17)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -39.44 + (((tickAnim - 53) / 7) * (-32.5-(-39.44)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfronttoe, leftfronttoe.rotateAngleX + (float) Math.toRadians(xx), leftfronttoe.rotateAngleY + (float) Math.toRadians(yy), leftfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -70 + (((tickAnim - 0) / 10) * (-17.5-(-70)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -17.5 + (((tickAnim - 10) / 20) * (35-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 35 + (((tickAnim - 30) / 10) * (10-(35)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 40) / 20) * (-70-(10)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 25 + (((tickAnim - 0) / 6) * (-1.46-(25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.46 + (((tickAnim - 6) / 4) * (-7.5-(-1.46)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 10) / 20) * (-20-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 30) / 10) * (-47.5-(-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -47.5 + (((tickAnim - 40) / 15) * (-0.62-(-47.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -0.62 + (((tickAnim - 55) / 5) * (25-(-0.62)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 45 + (((tickAnim - 0) / 6) * (41.87-(45)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 41.87 + (((tickAnim - 6) / 4) * (22.5-(41.87)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 10) / 20) * (52.5-(22.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 52.5 + (((tickAnim - 30) / 10) * (77.5-(52.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 77.5 + (((tickAnim - 40) / 15) * (63.13-(77.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 63.13 + (((tickAnim - 55) / 5) * (45-(63.13)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 0) / 10) * (4.17-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 4.17 + (((tickAnim - 10) / 13) * (-39.44-(4.17)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -39.44 + (((tickAnim - 23) / 7) * (-32.5-(-39.44)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -32.5 + (((tickAnim - 30) / 5) * (81.66-(-32.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 81.66 + (((tickAnim - 35) / 5) * (35.83-(81.66)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 35.83 + (((tickAnim - 40) / 11) * (-14.93-(35.83)));
            yy = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -14.93 + (((tickAnim - 51) / 9) * (-2.5-(-14.93)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfronttoe, rightfronttoe.rotateAngleX + (float) Math.toRadians(xx), rightfronttoe.rotateAngleY + (float) Math.toRadians(yy), rightfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 43.80344 + (((tickAnim - 0) / 10) * (15.3472-(43.80344)));
            yy = 13.09687 + (((tickAnim - 0) / 10) * (6.85301-(13.09687)));
            zz = 2.14233 + (((tickAnim - 0) / 10) * (5.77599-(2.14233)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 15.3472 + (((tickAnim - 10) / 11) * (-4.39544-(15.3472)));
            yy = 6.85301 + (((tickAnim - 10) / 11) * (3.22494-(6.85301)));
            zz = 5.77599 + (((tickAnim - 10) / 11) * (-2.57601-(5.77599)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -4.39544 + (((tickAnim - 21) / 9) * (-12.5-(-4.39544)));
            yy = 3.22494 + (((tickAnim - 21) / 9) * (0-(3.22494)));
            zz = -2.57601 + (((tickAnim - 21) / 9) * (-10-(-2.57601)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 30) / 30) * (43.80344-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (13.09687-(0)));
            zz = -10 + (((tickAnim - 30) / 30) * (2.14233-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.57734 + (((tickAnim - 0) / 10) * (35.46788-(22.57734)));
            yy = 4.61854 + (((tickAnim - 0) / 10) * (14.51659-(4.61854)));
            zz = 1.91757 + (((tickAnim - 0) / 10) * (9.54912-(1.91757)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 35.46788 + (((tickAnim - 10) / 11) * (-34.77982-(35.46788)));
            yy = 14.51659 + (((tickAnim - 10) / 11) * (6.83134-(14.51659)));
            zz = 9.54912 + (((tickAnim - 10) / 11) * (4.4937-(9.54912)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -34.77982 + (((tickAnim - 21) / 9) * (-7.5-(-34.77982)));
            yy = 6.83134 + (((tickAnim - 21) / 9) * (0-(6.83134)));
            zz = 4.4937 + (((tickAnim - 21) / 9) * (0-(4.4937)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -7.5 + (((tickAnim - 30) / 15) * (41.04999-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (11.82436-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (9.13715-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 41.04999 + (((tickAnim - 45) / 15) * (22.57734-(41.04999)));
            yy = 11.82436 + (((tickAnim - 45) / 15) * (4.61854-(11.82436)));
            zz = 9.13715 + (((tickAnim - 45) / 15) * (1.91757-(9.13715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 7.5 + (((tickAnim - 0) / 11) * (-35.87-(7.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -35.87 + (((tickAnim - 11) / 10) * (37.78-(-35.87)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 37.78 + (((tickAnim - 21) / 9) * (17.5-(37.78)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 17.5 + (((tickAnim - 30) / 8) * (-11.25-(17.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -11.25 + (((tickAnim - 38) / 7) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (7.5-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -72.5 + (((tickAnim - 0) / 11) * (9.21-(-72.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 9.21 + (((tickAnim - 11) / 10) * (13.89-(9.21)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 13.89 + (((tickAnim - 21) / 9) * (0-(13.89)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (-10.62-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = -10.62 + (((tickAnim - 38) / 22) * (-72.5-(-10.62)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbacktoe, rightbacktoe.rotateAngleX + (float) Math.toRadians(xx), rightbacktoe.rotateAngleY + (float) Math.toRadians(yy), rightbacktoe.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDeuterosaurus entity = (EntityPrehistoricFloraDeuterosaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*2.5), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*-2.5), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+90))*1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*0.75);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*-1);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -3.27027 + (((tickAnim - 0) / 2) * (-12.4716-(-3.27027)));
            yy = -3.18737 + (((tickAnim - 0) / 2) * (-7.90025-(-3.18737)));
            zz = -7.10205 + (((tickAnim - 0) / 2) * (-4.48202-(-7.10205)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -12.4716 + (((tickAnim - 2) / 3) * (35-(-12.4716)));
            yy = -7.90025 + (((tickAnim - 2) / 3) * (0-(-7.90025)));
            zz = -4.48202 + (((tickAnim - 2) / 3) * (0-(-4.48202)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 35 + (((tickAnim - 5) / 2) * (36.07585-(35)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.00897-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-9.6665-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 36.07585 + (((tickAnim - 7) / 1) * (7.15169-(36.07585)));
            yy = -0.00897 + (((tickAnim - 7) / 1) * (-0.01795-(-0.00897)));
            zz = -9.6665 + (((tickAnim - 7) / 1) * (-19.33301-(-9.6665)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.15169 + (((tickAnim - 8) / 2) * (-3.27027-(7.15169)));
            yy = -0.01795 + (((tickAnim - 8) / 2) * (-3.18737-(-0.01795)));
            zz = -19.33301 + (((tickAnim - 8) / 2) * (-7.10205-(-19.33301)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -24.1056 + (((tickAnim - 0) / 2) * (-3.8013-(-24.1056)));
            yy = -19.69098 + (((tickAnim - 0) / 2) * (-10.68725-(-19.69098)));
            zz = -0.22132 + (((tickAnim - 0) / 2) * (-6.99435-(-0.22132)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -3.8013 + (((tickAnim - 2) / 1) * (0.50741-(-3.8013)));
            yy = -10.68725 + (((tickAnim - 2) / 1) * (-3.63077-(-10.68725)));
            zz = -6.99435 + (((tickAnim - 2) / 1) * (0.40685-(-6.99435)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.50741 + (((tickAnim - 3) / 2) * (23.18672-(0.50741)));
            yy = -3.63077 + (((tickAnim - 3) / 2) * (-5.51738-(-3.63077)));
            zz = 0.40685 + (((tickAnim - 3) / 2) * (-5.14839-(0.40685)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 23.18672 + (((tickAnim - 5) / 2) * (14.91396-(23.18672)));
            yy = -5.51738 + (((tickAnim - 5) / 2) * (-9.65135-(-5.51738)));
            zz = -5.14839 + (((tickAnim - 5) / 2) * (-3.71133-(-5.14839)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 14.91396 + (((tickAnim - 7) / 1) * (34.344-(14.91396)));
            yy = -9.65135 + (((tickAnim - 7) / 1) * (-12.01361-(-9.65135)));
            zz = -3.71133 + (((tickAnim - 7) / 1) * (-2.89015-(-3.71133)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 34.344 + (((tickAnim - 8) / 0) * (19.25654-(34.344)));
            yy = -12.01361 + (((tickAnim - 8) / 0) * (-14.96645-(-12.01361)));
            zz = -2.89015 + (((tickAnim - 8) / 0) * (-1.86368-(-2.89015)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.25654 + (((tickAnim - 8) / 2) * (-24.1056-(19.25654)));
            yy = -14.96645 + (((tickAnim - 8) / 2) * (-19.69098-(-14.96645)));
            zz = -1.86368 + (((tickAnim - 8) / 2) * (-0.22132-(-1.86368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 30.07019 + (((tickAnim - 0) / 2) * (17.59751-(30.07019)));
            yy = -0.51136 + (((tickAnim - 0) / 2) * (-0.99567-(-0.51136)));
            zz = 6.44531 + (((tickAnim - 0) / 2) * (11.56215-(6.44531)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.59751 + (((tickAnim - 2) / 1) * (-9.93632-(17.59751)));
            yy = -0.99567 + (((tickAnim - 2) / 1) * (1.69066-(-0.99567)));
            zz = 11.56215 + (((tickAnim - 2) / 1) * (0.92545-(11.56215)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -9.93632 + (((tickAnim - 3) / 1) * (-32.41564-(-9.93632)));
            yy = 1.69066 + (((tickAnim - 3) / 1) * (2.73481-(1.69066)));
            zz = 0.92545 + (((tickAnim - 3) / 1) * (2.34793-(0.92545)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -32.41564 + (((tickAnim - 4) / 1) * (-22.47314-(-32.41564)));
            yy = 2.73481 + (((tickAnim - 4) / 1) * (1.60667-(2.73481)));
            zz = 2.34793 + (((tickAnim - 4) / 1) * (1.91561-(2.34793)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -22.47314 + (((tickAnim - 5) / 2) * (33.9852-(-22.47314)));
            yy = 1.60667 + (((tickAnim - 5) / 2) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 5) / 2) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 33.9852 + (((tickAnim - 7) / 1) * (-4.36039-(33.9852)));
            yy = 1.60667 + (((tickAnim - 7) / 1) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 7) / 1) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -4.36039 + (((tickAnim - 8) / 0) * (-15.75745-(-4.36039)));
            yy = 1.60667 + (((tickAnim - 8) / 0) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 8) / 0) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15.75745 + (((tickAnim - 8) / 2) * (30.07019-(-15.75745)));
            yy = 1.60667 + (((tickAnim - 8) / 2) * (-0.51136-(1.60667)));
            zz = 1.91561 + (((tickAnim - 8) / 2) * (6.44531-(1.91561)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.77-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.77 + (((tickAnim - 3) / 2) * (-0.4-(0.77)));
            zz = 0.7 + (((tickAnim - 3) / 2) * (1.2-(0.7)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 5) / 5) * (0-(-0.4)));
            zz = 1.2 + (((tickAnim - 5) / 5) * (0-(1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (-35-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -35 + (((tickAnim - 5) / 2) * (136.67-(-35)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 136.67 + (((tickAnim - 7) / 2) * (-10.83-(136.67)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -10.83 + (((tickAnim - 9) / 1) * (0-(-10.83)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 35 + (((tickAnim - 0) / 2) * (36.07585-(35)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.00897-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (9.6665-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 36.07585 + (((tickAnim - 2) / 1) * (7.15169-(36.07585)));
            yy = 0.00897 + (((tickAnim - 2) / 1) * (0.01795-(0.00897)));
            zz = 9.6665 + (((tickAnim - 2) / 1) * (19.33301-(9.6665)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.15169 + (((tickAnim - 3) / 2) * (-3.27027-(7.15169)));
            yy = 0.01795 + (((tickAnim - 3) / 2) * (3.18737-(0.01795)));
            zz = 19.33301 + (((tickAnim - 3) / 2) * (7.10205-(19.33301)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -3.27027 + (((tickAnim - 5) / 2) * (-12.4716-(-3.27027)));
            yy = 3.18737 + (((tickAnim - 5) / 2) * (7.90025-(3.18737)));
            zz = 7.10205 + (((tickAnim - 5) / 2) * (4.48202-(7.10205)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -12.4716 + (((tickAnim - 7) / 3) * (35-(-12.4716)));
            yy = 7.90025 + (((tickAnim - 7) / 3) * (0-(7.90025)));
            zz = 4.48202 + (((tickAnim - 7) / 3) * (0-(4.48202)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.18672 + (((tickAnim - 0) / 2) * (14.91396-(23.18672)));
            yy = 5.51738 + (((tickAnim - 0) / 2) * (9.65135-(5.51738)));
            zz = 5.14839 + (((tickAnim - 0) / 2) * (3.71133-(5.14839)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 14.91396 + (((tickAnim - 2) / 1) * (34.344-(14.91396)));
            yy = 9.65135 + (((tickAnim - 2) / 1) * (12.01361-(9.65135)));
            zz = 3.71133 + (((tickAnim - 2) / 1) * (2.89015-(3.71133)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 34.344 + (((tickAnim - 3) / 0) * (19.25654-(34.344)));
            yy = 12.01361 + (((tickAnim - 3) / 0) * (14.96645-(12.01361)));
            zz = 2.89015 + (((tickAnim - 3) / 0) * (1.86368-(2.89015)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 19.25654 + (((tickAnim - 3) / 2) * (-24.1056-(19.25654)));
            yy = 14.96645 + (((tickAnim - 3) / 2) * (19.69098-(14.96645)));
            zz = 1.86368 + (((tickAnim - 3) / 2) * (0.22132-(1.86368)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -24.1056 + (((tickAnim - 5) / 2) * (-3.8013-(-24.1056)));
            yy = 19.69098 + (((tickAnim - 5) / 2) * (10.68725-(19.69098)));
            zz = 0.22132 + (((tickAnim - 5) / 2) * (6.99435-(0.22132)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -3.8013 + (((tickAnim - 7) / 1) * (0.50741-(-3.8013)));
            yy = 10.68725 + (((tickAnim - 7) / 1) * (3.63077-(10.68725)));
            zz = 6.99435 + (((tickAnim - 7) / 1) * (-0.40685-(6.99435)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.50741 + (((tickAnim - 8) / 2) * (23.18672-(0.50741)));
            yy = 3.63077 + (((tickAnim - 8) / 2) * (5.51738-(3.63077)));
            zz = -0.40685 + (((tickAnim - 8) / 2) * (5.14839-(-0.40685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -22.47314 + (((tickAnim - 0) / 2) * (33.9852-(-22.47314)));
            yy = -1.60667 + (((tickAnim - 0) / 2) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 0) / 2) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 33.9852 + (((tickAnim - 2) / 1) * (-4.36039-(33.9852)));
            yy = -1.60667 + (((tickAnim - 2) / 1) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 2) / 1) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -4.36039 + (((tickAnim - 3) / 0) * (-15.75745-(-4.36039)));
            yy = -1.60667 + (((tickAnim - 3) / 0) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 3) / 0) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.75745 + (((tickAnim - 3) / 2) * (30.07019-(-15.75745)));
            yy = -1.60667 + (((tickAnim - 3) / 2) * (0.51136-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 3) / 2) * (-6.44531-(-1.91561)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 30.07019 + (((tickAnim - 5) / 2) * (17.59751-(30.07019)));
            yy = 0.51136 + (((tickAnim - 5) / 2) * (0.99567-(0.51136)));
            zz = -6.44531 + (((tickAnim - 5) / 2) * (-11.56215-(-6.44531)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 17.59751 + (((tickAnim - 7) / 1) * (-9.93632-(17.59751)));
            yy = 0.99567 + (((tickAnim - 7) / 1) * (-1.69066-(0.99567)));
            zz = -11.56215 + (((tickAnim - 7) / 1) * (-0.92545-(-11.56215)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -9.93632 + (((tickAnim - 8) / 1) * (-32.41564-(-9.93632)));
            yy = -1.69066 + (((tickAnim - 8) / 1) * (-2.73481-(-1.69066)));
            zz = -0.92545 + (((tickAnim - 8) / 1) * (-2.34793-(-0.92545)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -32.41564 + (((tickAnim - 9) / 1) * (-22.47314-(-32.41564)));
            yy = -2.73481 + (((tickAnim - 9) / 1) * (-1.60667-(-2.73481)));
            zz = -2.34793 + (((tickAnim - 9) / 1) * (-1.91561-(-2.34793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 5) * (0-(-0.4)));
            zz = 1.2 + (((tickAnim - 0) / 5) * (0-(1.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.77-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.7-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.77 + (((tickAnim - 8) / 2) * (-0.4-(0.77)));
            zz = 0.7 + (((tickAnim - 8) / 2) * (1.2-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -35 + (((tickAnim - 0) / 2) * (136.67-(-35)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 136.67 + (((tickAnim - 2) / 2) * (-10.83-(136.67)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -10.83 + (((tickAnim - 4) / 1) * (0-(-10.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-35-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbacktoe, rightbacktoe.rotateAngleX + (float) Math.toRadians(xx), rightbacktoe.rotateAngleY + (float) Math.toRadians(yy), rightbacktoe.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+60))*-2.5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*10), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*10), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*-3), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*2.5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+90))*2.5), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*-2.5));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.5 + (((tickAnim - 0) / 2) * (35-(17.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 35 + (((tickAnim - 2) / 1) * (2.41492-(35)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.64686-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-14.98637-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.41492 + (((tickAnim - 3) / 2) * (-62.5-(2.41492)));
            yy = 0.64686 + (((tickAnim - 3) / 2) * (0-(0.64686)));
            zz = -14.98637 + (((tickAnim - 3) / 2) * (0-(-14.98637)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -62.5 + (((tickAnim - 5) / 5) * (17.5-(-62.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -15 + (((tickAnim - 0) / 2) * (11.88-(-15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 11.88 + (((tickAnim - 2) / 2) * (-16.87-(11.88)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -16.87 + (((tickAnim - 4) / 1) * (2.5-(-16.87)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.5 + (((tickAnim - 5) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -15.5 + (((tickAnim - 9) / 1) * (-15-(-15.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (20.42-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 20.42 + (((tickAnim - 1) / 1) * (53.13-(20.42)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 53.13 + (((tickAnim - 2) / 1) * (97.09-(53.13)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 97.09 + (((tickAnim - 3) / 1) * (29.8-(97.09)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 29.8 + (((tickAnim - 4) / 1) * (42.5-(29.8)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 42.5 + (((tickAnim - 5) / 1) * (47.92-(42.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 47.92 + (((tickAnim - 6) / 3) * (16.88-(47.92)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 16.88 + (((tickAnim - 9) / 1) * (0-(16.88)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -50 + (((tickAnim - 1) / 1) * (138.75-(-50)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 138.75 + (((tickAnim - 2) / 1) * (135.75-(138.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 135.75 + (((tickAnim - 3) / 1) * (-20.42-(135.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -20.42 + (((tickAnim - 4) / 1) * (-25-(-20.42)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -25 + (((tickAnim - 5) / 1) * (0-(-25)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfronttoe, leftfronttoe.rotateAngleX + (float) Math.toRadians(xx), leftfronttoe.rotateAngleY + (float) Math.toRadians(yy), leftfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -62.5 + (((tickAnim - 0) / 5) * (17.5-(-62.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 17.5 + (((tickAnim - 5) / 2) * (35-(17.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 7) / 1) * (2.41492-(35)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.64686-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (14.98637-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.41492 + (((tickAnim - 8) / 2) * (-62.5-(2.41492)));
            yy = -0.64686 + (((tickAnim - 8) / 2) * (0-(-0.64686)));
            zz = 14.98637 + (((tickAnim - 8) / 2) * (0-(14.98637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.5 + (((tickAnim - 0) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -15.5 + (((tickAnim - 4) / 1) * (-15-(-15.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 5) / 2) * (11.88-(-15)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 11.88 + (((tickAnim - 7) / 2) * (-16.87-(11.88)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -16.87 + (((tickAnim - 9) / 1) * (2.5-(-16.87)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 42.5 + (((tickAnim - 0) / 1) * (47.92-(42.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 47.92 + (((tickAnim - 1) / 3) * (16.88-(47.92)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 16.88 + (((tickAnim - 4) / 1) * (0-(16.88)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (20.42-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 20.42 + (((tickAnim - 6) / 1) * (53.13-(20.42)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 53.13 + (((tickAnim - 7) / 1) * (97.09-(53.13)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 97.09 + (((tickAnim - 8) / 1) * (29.8-(97.09)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 29.8 + (((tickAnim - 9) / 1) * (42.5-(29.8)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -25 + (((tickAnim - 0) / 1) * (0-(-25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-50-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -50 + (((tickAnim - 6) / 1) * (138.75-(-50)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 138.75 + (((tickAnim - 7) / 1) * (135.75-(138.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 135.75 + (((tickAnim - 8) / 1) * (-20.42-(135.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -20.42 + (((tickAnim - 9) / 1) * (-25-(-20.42)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfronttoe, rightfronttoe.rotateAngleX + (float) Math.toRadians(xx), rightfronttoe.rotateAngleY + (float) Math.toRadians(yy), rightfronttoe.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+120))*-2.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*2.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*2.5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*-2.5));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeuterosaurus entity = (EntityPrehistoricFloraDeuterosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 25) / 25) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -3 + (((tickAnim - 25) / 25) * (0-(-3)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-23.03134-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.10802-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (4.95177-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -23.03134 + (((tickAnim - 25) / 25) * (0-(-23.03134)));
            yy = 0.10802 + (((tickAnim - 25) / 25) * (0-(0.10802)));
            zz = 4.95177 + (((tickAnim - 25) / 25) * (0-(4.95177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -1.5 + (((tickAnim - 25) / 25) * (0-(-1.5)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 47.5 + (((tickAnim - 25) / 25) * (0-(47.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 25) / 25) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-23.03134-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.10802-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-4.95177-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -23.03134 + (((tickAnim - 25) / 25) * (0-(-23.03134)));
            yy = -0.10802 + (((tickAnim - 25) / 25) * (0-(-0.10802)));
            zz = -4.95177 + (((tickAnim - 25) / 25) * (0-(-4.95177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -1.5 + (((tickAnim - 25) / 25) * (0-(-1.5)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 47.5 + (((tickAnim - 25) / 25) * (0-(47.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 25) / 25) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 25) / 25) * (0-(12.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.91767-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.08425-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (3.86212-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 17.91767 + (((tickAnim - 25) / 25) * (0-(17.91767)));
            yy = 0.08425 + (((tickAnim - 25) / 25) * (0-(0.08425)));
            zz = 3.86212 + (((tickAnim - 25) / 25) * (0-(3.86212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 25) / 25) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.47178-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.65182-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-4.95744-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 12.47178 + (((tickAnim - 25) / 25) * (0-(12.47178)));
            yy = 0.65182 + (((tickAnim - 25) / 25) * (0-(0.65182)));
            zz = -4.95744 + (((tickAnim - 25) / 25) * (0-(-4.95744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.91767-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.08425-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-3.86212-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 17.91767 + (((tickAnim - 25) / 25) * (0-(17.91767)));
            yy = -0.08425 + (((tickAnim - 25) / 25) * (0-(-0.08425)));
            zz = -3.86212 + (((tickAnim - 25) / 25) * (0-(-3.86212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 25) / 25) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.47178-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.65182-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (4.95744-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 12.47178 + (((tickAnim - 25) / 25) * (0-(12.47178)));
            yy = -0.65182 + (((tickAnim - 25) / 25) * (0-(-0.65182)));
            zz = 4.95744 + (((tickAnim - 25) / 25) * (0-(4.95744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 25) / 25) * (0-(2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeuterosaurus entity = (EntityPrehistoricFloraDeuterosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (32.94757-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.1248-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.31353-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 32.94757 + (((tickAnim - 18) / 10) * (8.13096-(32.94757)));
            yy = 3.1248 + (((tickAnim - 18) / 10) * (0.8337-(3.1248)));
            zz = -6.31353 + (((tickAnim - 18) / 10) * (-1.61045-(-6.31353)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.13096 + (((tickAnim - 28) / 8) * (-31.93388-(8.13096)));
            yy = 0.8337 + (((tickAnim - 28) / 8) * (0.87982-(0.8337)));
            zz = -1.61045 + (((tickAnim - 28) / 8) * (6.70998-(-1.61045)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -31.93388 + (((tickAnim - 36) / 4) * (0-(-31.93388)));
            yy = 0.87982 + (((tickAnim - 36) / 4) * (0-(0.87982)));
            zz = 6.70998 + (((tickAnim - 36) / 4) * (0-(6.70998)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-2.82-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -2.82 + (((tickAnim - 11) / 7) * (-0.47-(-2.82)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -0.47 + (((tickAnim - 18) / 10) * (52.5-(-0.47)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 52.5 + (((tickAnim - 28) / 12) * (0-(52.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -22.5 + (((tickAnim - 11) / 7) * (-20-(-22.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -20 + (((tickAnim - 18) / 10) * (50.83-(-20)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 50.83 + (((tickAnim - 28) / 4) * (-11.11-(50.83)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -11.11 + (((tickAnim - 32) / 8) * (0-(-11.11)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 11) / 7) * (-15-(30)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -15 + (((tickAnim - 18) / 10) * (51.88-(-15)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 51.88 + (((tickAnim - 28) / 4) * (7.09-(51.88)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 7.09 + (((tickAnim - 32) / 8) * (0-(7.09)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeuterosaurus entity = (EntityPrehistoricFloraDeuterosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.57751-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.83825-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.22522-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.57751 + (((tickAnim - 8) / 4) * (-12.29659-(2.57751)));
            yy = 0.83825 + (((tickAnim - 8) / 4) * (2.63805-(0.83825)));
            zz = 0.22522 + (((tickAnim - 8) / 4) * (-8.41332-(0.22522)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -12.29659 + (((tickAnim - 12) / 4) * (-21.77966-(-12.29659)));
            yy = 2.63805 + (((tickAnim - 12) / 4) * (5.90219-(2.63805)));
            zz = -8.41332 + (((tickAnim - 12) / 4) * (2.49072-(-8.41332)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -21.77966 + (((tickAnim - 16) / 6) * (-5.85461-(-21.77966)));
            yy = 5.90219 + (((tickAnim - 16) / 6) * (-0.01225-(5.90219)));
            zz = 2.49072 + (((tickAnim - 16) / 6) * (0.19743-(2.49072)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -5.85461 + (((tickAnim - 22) / 4) * (2.92609-(-5.85461)));
            yy = -0.01225 + (((tickAnim - 22) / 4) * (-0.00957-(-0.01225)));
            zz = 0.19743 + (((tickAnim - 22) / 4) * (0.15424-(0.19743)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 2.92609 + (((tickAnim - 26) / 14) * (0-(2.92609)));
            yy = -0.00957 + (((tickAnim - 26) / 14) * (0-(-0.00957)));
            zz = 0.15424 + (((tickAnim - 26) / 14) * (0-(0.15424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.36967-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.56716-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-7.07954-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.36967 + (((tickAnim - 10) / 3) * (3.08784-(17.36967)));
            yy = 2.56716 + (((tickAnim - 10) / 3) * (3.24098-(2.56716)));
            zz = -7.07954 + (((tickAnim - 10) / 3) * (-0.9277-(-7.07954)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3.08784 + (((tickAnim - 13) / 5) * (-1.77966-(3.08784)));
            yy = 3.24098 + (((tickAnim - 13) / 5) * (5.90219-(3.24098)));
            zz = -0.9277 + (((tickAnim - 13) / 5) * (2.49072-(-0.9277)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -1.77966 + (((tickAnim - 18) / 6) * (-5.85461-(-1.77966)));
            yy = 5.90219 + (((tickAnim - 18) / 6) * (-0.01225-(5.90219)));
            zz = 2.49072 + (((tickAnim - 18) / 6) * (0.19743-(2.49072)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -5.85461 + (((tickAnim - 24) / 4) * (20.42609-(-5.85461)));
            yy = -0.01225 + (((tickAnim - 24) / 4) * (-0.00957-(-0.01225)));
            zz = 0.19743 + (((tickAnim - 24) / 4) * (0.15424-(0.19743)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 20.42609 + (((tickAnim - 28) / 12) * (0-(20.42609)));
            yy = -0.00957 + (((tickAnim - 28) / 12) * (0-(-0.00957)));
            zz = 0.15424 + (((tickAnim - 28) / 12) * (0-(0.15424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.25002-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.99318-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-9.54589-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 22.25002 + (((tickAnim - 13) / 3) * (6.13589-(22.25002)));
            yy = 2.99318 + (((tickAnim - 13) / 3) * (2.91011-(2.99318)));
            zz = -9.54589 + (((tickAnim - 13) / 3) * (-7.50449-(-9.54589)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 6.13589 + (((tickAnim - 16) / 6) * (-24.27966-(6.13589)));
            yy = 2.91011 + (((tickAnim - 16) / 6) * (5.90219-(2.91011)));
            zz = -7.50449 + (((tickAnim - 16) / 6) * (2.49072-(-7.50449)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -24.27966 + (((tickAnim - 22) / 6) * (11.64539-(-24.27966)));
            yy = 5.90219 + (((tickAnim - 22) / 6) * (-0.01225-(5.90219)));
            zz = 2.49072 + (((tickAnim - 22) / 6) * (0.19743-(2.49072)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 11.64539 + (((tickAnim - 28) / 4) * (10.42609-(11.64539)));
            yy = -0.01225 + (((tickAnim - 28) / 4) * (-0.00957-(-0.01225)));
            zz = 0.19743 + (((tickAnim - 28) / 4) * (0.15424-(0.19743)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 10.42609 + (((tickAnim - 32) / 8) * (0-(10.42609)));
            yy = -0.00957 + (((tickAnim - 32) / 8) * (0-(-0.00957)));
            zz = 0.15424 + (((tickAnim - 32) / 8) * (0-(0.15424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (65-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 65 + (((tickAnim - 23) / 5) * (0-(65)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeuterosaurus entity = (EntityPrehistoricFloraDeuterosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 20) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 22) / 6) * (5-(5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 28) / 12) * (0-(5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 5 + (((tickAnim - 24) / 7) * (5-(5)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 31) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.37757-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.7949-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (23.49556-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 19.37757 + (((tickAnim - 20) / 3) * (19.37757-(19.37757)));
            yy = -8.7949 + (((tickAnim - 20) / 3) * (-8.7949-(-8.7949)));
            zz = 23.49556 + (((tickAnim - 20) / 3) * (23.49556-(23.49556)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 19.37757 + (((tickAnim - 23) / 7) * (15.4282-(19.37757)));
            yy = -8.7949 + (((tickAnim - 23) / 7) * (-17.18025-(-8.7949)));
            zz = 23.49556 + (((tickAnim - 23) / 7) * (31.87455-(23.49556)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15.4282 + (((tickAnim - 30) / 10) * (0-(15.4282)));
            yy = -17.18025 + (((tickAnim - 30) / 10) * (0-(-17.18025)));
            zz = 31.87455 + (((tickAnim - 30) / 10) * (0-(31.87455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-53.53-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -53.53 + (((tickAnim - 20) / 3) * (-53.53-(-53.53)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -53.53 + (((tickAnim - 23) / 7) * (-45.78398-(-53.53)));
            yy = 0 + (((tickAnim - 23) / 7) * (-5.39032-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-5.22255-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45.78398 + (((tickAnim - 30) / 10) * (0-(-45.78398)));
            yy = -5.39032 + (((tickAnim - 30) / 10) * (0-(-5.39032)));
            zz = -5.22255 + (((tickAnim - 30) / 10) * (0-(-5.22255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.10633-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (13.79834-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-20.59083-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 12.10633 + (((tickAnim - 20) / 3) * (12.10633-(12.10633)));
            yy = 13.79834 + (((tickAnim - 20) / 3) * (13.79834-(13.79834)));
            zz = -20.59083 + (((tickAnim - 20) / 3) * (-20.59083-(-20.59083)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 12.10633 + (((tickAnim - 23) / 7) * (5.80911-(12.10633)));
            yy = 13.79834 + (((tickAnim - 23) / 7) * (13.34419-(13.79834)));
            zz = -20.59083 + (((tickAnim - 23) / 7) * (-15.46837-(-20.59083)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5.80911 + (((tickAnim - 30) / 10) * (0-(5.80911)));
            yy = 13.34419 + (((tickAnim - 30) / 10) * (0-(13.34419)));
            zz = -15.46837 + (((tickAnim - 30) / 10) * (0-(-15.46837)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.37757-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.7949-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-23.49556-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 19.37757 + (((tickAnim - 20) / 3) * (19.37757-(19.37757)));
            yy = 8.7949 + (((tickAnim - 20) / 3) * (8.7949-(8.7949)));
            zz = -23.49556 + (((tickAnim - 20) / 3) * (-23.49556-(-23.49556)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 19.37757 + (((tickAnim - 23) / 7) * (15.4282-(19.37757)));
            yy = 8.7949 + (((tickAnim - 23) / 7) * (17.18025-(8.7949)));
            zz = -23.49556 + (((tickAnim - 23) / 7) * (-31.87455-(-23.49556)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15.4282 + (((tickAnim - 30) / 10) * (0-(15.4282)));
            yy = 17.18025 + (((tickAnim - 30) / 10) * (0-(17.18025)));
            zz = -31.87455 + (((tickAnim - 30) / 10) * (0-(-31.87455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-53.53-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -53.53 + (((tickAnim - 20) / 3) * (-53.53-(-53.53)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -53.53 + (((tickAnim - 23) / 7) * (-45.78398-(-53.53)));
            yy = 0 + (((tickAnim - 23) / 7) * (5.39032-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (5.22255-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45.78398 + (((tickAnim - 30) / 10) * (0-(-45.78398)));
            yy = 5.39032 + (((tickAnim - 30) / 10) * (0-(5.39032)));
            zz = 5.22255 + (((tickAnim - 30) / 10) * (0-(5.22255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.10633-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-13.79834-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (20.59083-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 12.10633 + (((tickAnim - 20) / 3) * (12.10633-(12.10633)));
            yy = -13.79834 + (((tickAnim - 20) / 3) * (-13.79834-(-13.79834)));
            zz = 20.59083 + (((tickAnim - 20) / 3) * (20.59083-(20.59083)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 12.10633 + (((tickAnim - 23) / 7) * (5.80911-(12.10633)));
            yy = -13.79834 + (((tickAnim - 23) / 7) * (-13.34419-(-13.79834)));
            zz = 20.59083 + (((tickAnim - 23) / 7) * (15.46837-(20.59083)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5.80911 + (((tickAnim - 30) / 10) * (0-(5.80911)));
            yy = -13.34419 + (((tickAnim - 30) / 10) * (0-(-13.34419)));
            zz = 15.46837 + (((tickAnim - 30) / 10) * (0-(15.46837)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 2.5 + (((tickAnim - 26) / 7) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 33) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 27) / 6) * (5-(5)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 33) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 12.5 + (((tickAnim - 24) / 7) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 31) / 9) * (0-(12.5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (37.5-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 37.5 + (((tickAnim - 28) / 5) * (0-(37.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animTerritorial(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeuterosaurus entity = (EntityPrehistoricFloraDeuterosaurus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 42) {
            xx = 5 + (((tickAnim - 10) / 32) * (5-(5)));
            yy = 0 + (((tickAnim - 10) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 32) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 42) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 11) / 29) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 11) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 29) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -2.5 + (((tickAnim - 40) / 60) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 42) {
            xx = 2.5 + (((tickAnim - 13) / 29) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 13) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 29) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 2.5 + (((tickAnim - 42) / 58) * (0-(2.5)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 13) / 7) * (-11.24314-(7.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (27.0478-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-5.16524-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -11.24314 + (((tickAnim - 20) / 7) * (18.46573-(-11.24314)));
            yy = 27.0478 + (((tickAnim - 20) / 7) * (2.16403-(27.0478)));
            zz = -5.16524 + (((tickAnim - 20) / 7) * (-9.34782-(-5.16524)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 18.46573 + (((tickAnim - 27) / 6) * (-34.65871-(18.46573)));
            yy = 2.16403 + (((tickAnim - 27) / 6) * (4.65051-(2.16403)));
            zz = -9.34782 + (((tickAnim - 27) / 6) * (-19.81289-(-9.34782)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = -34.65871 + (((tickAnim - 33) / 9) * (7.5-(-34.65871)));
            yy = 4.65051 + (((tickAnim - 33) / 9) * (0-(4.65051)));
            zz = -19.81289 + (((tickAnim - 33) / 9) * (0-(-19.81289)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = 7.5 + (((tickAnim - 42) / 18) * (0-(7.5)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 13) / 7) * (-53.16171-(-17.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (-7.57131-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (9.97528-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -53.16171 + (((tickAnim - 20) / 7) * (10.31112-(-53.16171)));
            yy = -7.57131 + (((tickAnim - 20) / 7) * (-5.24168-(-7.57131)));
            zz = 9.97528 + (((tickAnim - 20) / 7) * (6.90596-(9.97528)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 10.31112 + (((tickAnim - 27) / 6) * (-36.8221-(10.31112)));
            yy = -5.24168 + (((tickAnim - 27) / 6) * (-2.91204-(-5.24168)));
            zz = 6.90596 + (((tickAnim - 27) / 6) * (3.83665-(6.90596)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -36.8221 + (((tickAnim - 33) / 3) * (-16.68456-(-36.8221)));
            yy = -2.91204 + (((tickAnim - 33) / 3) * (-2.03843-(-2.91204)));
            zz = 3.83665 + (((tickAnim - 33) / 3) * (2.68565-(3.83665)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = -16.68456 + (((tickAnim - 36) / 6) * (20-(-16.68456)));
            yy = -2.03843 + (((tickAnim - 36) / 6) * (0-(-2.03843)));
            zz = 2.68565 + (((tickAnim - 36) / 6) * (0-(2.68565)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 20 + (((tickAnim - 42) / 10) * (-45.93-(20)));
            yy = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 10) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -45.93 + (((tickAnim - 52) / 8) * (0-(-45.93)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 13) / 7) * (62.5-(5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 62.5 + (((tickAnim - 20) / 8) * (-2.4-(62.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -2.4 + (((tickAnim - 28) / 6) * (48.58-(-2.4)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 48.58 + (((tickAnim - 34) / 4) * (4.37-(48.58)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 4.37 + (((tickAnim - 38) / 4) * (-32.5-(4.37)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = -32.5 + (((tickAnim - 42) / 10) * (52.57-(-32.5)));
            yy = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 10) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 52.57 + (((tickAnim - 52) / 8) * (0-(52.57)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (17.5-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 20) / 5) * (-35.51-(17.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -35.51 + (((tickAnim - 25) / 3) * (-33.27-(-35.51)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -33.27 + (((tickAnim - 28) / 3) * (5.44-(-33.27)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 5.44 + (((tickAnim - 31) / 3) * (19.15-(5.44)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 19.15 + (((tickAnim - 34) / 4) * (0.3679-(19.15)));
            yy = 0 + (((tickAnim - 34) / 4) * (-0.22682-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (1.15737-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0.3679 + (((tickAnim - 38) / 4) * (15-(0.3679)));
            yy = -0.22682 + (((tickAnim - 38) / 4) * (0-(-0.22682)));
            zz = 1.15737 + (((tickAnim - 38) / 4) * (0-(1.15737)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 15 + (((tickAnim - 42) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 10) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 52) / 8) * (0-(15)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfronttoe, leftfronttoe.rotateAngleX + (float) Math.toRadians(xx), leftfronttoe.rotateAngleY + (float) Math.toRadians(yy), leftfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 42) {
            xx = 7.5 + (((tickAnim - 13) / 29) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 13) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 29) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 42) / 8) * (0-(7.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 42) {
            xx = -17.5 + (((tickAnim - 13) / 29) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 13) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 29) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 42) / 8) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 42) {
            xx = 5 + (((tickAnim - 13) / 29) * (5-(5)));
            yy = 0 + (((tickAnim - 13) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 29) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 42) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 2.5 + (((tickAnim - 13) / 9) * (-15-(2.5)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = -15 + (((tickAnim - 22) / 10) * (-1.2-(-15)));
            yy = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -1.2 + (((tickAnim - 32) / 6) * (-9.21-(-1.2)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -9.21 + (((tickAnim - 38) / 5) * (2.5-(-9.21)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 2.5 + (((tickAnim - 43) / 5) * (-21.43-(2.5)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -21.43 + (((tickAnim - 48) / 5) * (-21.41941-(-21.43)));
            yy = 0 + (((tickAnim - 48) / 5) * (-0.49528-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (-2.45048-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -21.41941 + (((tickAnim - 53) / 4) * (-21.41941-(-21.41941)));
            yy = -0.49528 + (((tickAnim - 53) / 4) * (0.49528-(-0.49528)));
            zz = -2.45048 + (((tickAnim - 53) / 4) * (2.45048-(-2.45048)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -21.41941 + (((tickAnim - 57) / 3) * (-21.41941-(-21.41941)));
            yy = 0.49528 + (((tickAnim - 57) / 3) * (-0.49528-(0.49528)));
            zz = 2.45048 + (((tickAnim - 57) / 3) * (-2.45048-(2.45048)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = -21.41941 + (((tickAnim - 60) / 4) * (-21.41941-(-21.41941)));
            yy = -0.49528 + (((tickAnim - 60) / 4) * (0.49528-(-0.49528)));
            zz = -2.45048 + (((tickAnim - 60) / 4) * (2.45048-(-2.45048)));
        }
        else if (tickAnim >= 64 && tickAnim < 66) {
            xx = -21.41941 + (((tickAnim - 64) / 2) * (-21.41941-(-21.41941)));
            yy = 0.49528 + (((tickAnim - 64) / 2) * (-0.49528-(0.49528)));
            zz = 2.45048 + (((tickAnim - 64) / 2) * (-2.45048-(2.45048)));
        }
        else if (tickAnim >= 66 && tickAnim < 71) {
            xx = -21.41941 + (((tickAnim - 66) / 5) * (-21.43-(-21.41941)));
            yy = -0.49528 + (((tickAnim - 66) / 5) * (0-(-0.49528)));
            zz = -2.45048 + (((tickAnim - 66) / 5) * (0-(-2.45048)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = -21.43 + (((tickAnim - 71) / 7) * (-16.52555-(-21.43)));
            yy = 0 + (((tickAnim - 71) / 7) * (0.28429-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (2.48379-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -16.52555 + (((tickAnim - 78) / 5) * (-16.52555-(-16.52555)));
            yy = 0.28429 + (((tickAnim - 78) / 5) * (-0.28429-(0.28429)));
            zz = 2.48379 + (((tickAnim - 78) / 5) * (-2.48379-(2.48379)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = -16.52555 + (((tickAnim - 83) / 2) * (-16.52555-(-16.52555)));
            yy = -0.28429 + (((tickAnim - 83) / 2) * (0.28429-(-0.28429)));
            zz = -2.48379 + (((tickAnim - 83) / 2) * (2.48379-(-2.48379)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = -16.52555 + (((tickAnim - 85) / 3) * (-16.52555-(-16.52555)));
            yy = 0.28429 + (((tickAnim - 85) / 3) * (-0.28429-(0.28429)));
            zz = 2.48379 + (((tickAnim - 85) / 3) * (-2.48379-(2.48379)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
            xx = -16.52555 + (((tickAnim - 88) / 4) * (-16.52555-(-16.52555)));
            yy = -0.28429 + (((tickAnim - 88) / 4) * (0.28429-(-0.28429)));
            zz = -2.48379 + (((tickAnim - 88) / 4) * (2.48379-(-2.48379)));
        }
        else if (tickAnim >= 92 && tickAnim < 93) {
            xx = -16.52555 + (((tickAnim - 92) / 1) * (-16.52555-(-16.52555)));
            yy = 0.28429 + (((tickAnim - 92) / 1) * (-0.28429-(0.28429)));
            zz = 2.48379 + (((tickAnim - 92) / 1) * (-2.48379-(2.48379)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = -16.52555 + (((tickAnim - 93) / 3) * (-16.52555-(-16.52555)));
            yy = -0.28429 + (((tickAnim - 93) / 3) * (0.28429-(-0.28429)));
            zz = -2.48379 + (((tickAnim - 93) / 3) * (2.48379-(-2.48379)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = -16.52555 + (((tickAnim - 96) / 2) * (-16.52555-(-16.52555)));
            yy = 0.28429 + (((tickAnim - 96) / 2) * (-0.28429-(0.28429)));
            zz = 2.48379 + (((tickAnim - 96) / 2) * (-2.48379-(2.48379)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = -16.52555 + (((tickAnim - 98) / 2) * (0-(-16.52555)));
            yy = -0.28429 + (((tickAnim - 98) / 2) * (0-(-0.28429)));
            zz = -2.48379 + (((tickAnim - 98) / 2) * (0-(-2.48379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 15 + (((tickAnim - 14) / 10) * (15.02832-(15)));
            yy = 0 + (((tickAnim - 14) / 10) * (4.95712-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0.65426-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 15.02832 + (((tickAnim - 24) / 5) * (5.03288-(15.02832)));
            yy = 4.95712 + (((tickAnim - 24) / 5) * (5.01585-(4.95712)));
            zz = 0.65426 + (((tickAnim - 24) / 5) * (0.66257-(0.65426)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 5.03288 + (((tickAnim - 29) / 4) * (15.03667-(5.03288)));
            yy = 5.01585 + (((tickAnim - 29) / 4) * (5.06479-(5.01585)));
            zz = 0.66257 + (((tickAnim - 29) / 4) * (0.66949-(0.66257)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 15.03667 + (((tickAnim - 33) / 6) * (15.01949-(15.03667)));
            yy = 5.06479 + (((tickAnim - 33) / 6) * (-2.84675-(5.06479)));
            zz = 0.66949 + (((tickAnim - 33) / 6) * (-0.37499-(0.66949)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 15.01949 + (((tickAnim - 39) / 4) * (15-(15.01949)));
            yy = -2.84675 + (((tickAnim - 39) / 4) * (0-(-2.84675)));
            zz = -0.37499 + (((tickAnim - 39) / 4) * (0-(-0.37499)));
        }
        else if (tickAnim >= 43 && tickAnim < 56) {
            xx = 15 + (((tickAnim - 43) / 13) * (-9.75-(15)));
            yy = 0 + (((tickAnim - 43) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 13) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 66) {
            xx = -9.75 + (((tickAnim - 56) / 10) * (-2.16817-(-9.75)));
            yy = 0 + (((tickAnim - 56) / 10) * (1.2666-(0)));
            zz = 0 + (((tickAnim - 56) / 10) * (7.39288-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = -2.16817 + (((tickAnim - 66) / 2) * (-3.21431-(-2.16817)));
            yy = 1.2666 + (((tickAnim - 66) / 2) * (-0.47968-(1.2666)));
            zz = 7.39288 + (((tickAnim - 66) / 2) * (-1.77342-(7.39288)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -3.21431 + (((tickAnim - 68) / 3) * (-5.14294-(-3.21431)));
            yy = -0.47968 + (((tickAnim - 68) / 3) * (-1.43904-(-0.47968)));
            zz = -1.77342 + (((tickAnim - 68) / 3) * (-5.32027-(-1.77342)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = -5.14294 + (((tickAnim - 71) / 2) * (-3.21431-(-5.14294)));
            yy = -1.43904 + (((tickAnim - 71) / 2) * (-0.47968-(-1.43904)));
            zz = -5.32027 + (((tickAnim - 71) / 2) * (-1.77342-(-5.32027)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -3.21431 + (((tickAnim - 73) / 3) * (-3.21431-(-3.21431)));
            yy = -0.47968 + (((tickAnim - 73) / 3) * (-0.47968-(-0.47968)));
            zz = -1.77342 + (((tickAnim - 73) / 3) * (-1.77342-(-1.77342)));
        }
        else if (tickAnim >= 76 && tickAnim < 78) {
            xx = -3.21431 + (((tickAnim - 76) / 2) * (-9.75-(-3.21431)));
            yy = -0.47968 + (((tickAnim - 76) / 2) * (0-(-0.47968)));
            zz = -1.77342 + (((tickAnim - 76) / 2) * (0-(-1.77342)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = -9.75 + (((tickAnim - 78) / 3) * (-3.21431-(-9.75)));
            yy = 0 + (((tickAnim - 78) / 3) * (-0.47968-(0)));
            zz = 0 + (((tickAnim - 78) / 3) * (-1.77342-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 84) {
            xx = -3.21431 + (((tickAnim - 81) / 3) * (-9.75801-(-3.21431)));
            yy = -0.47968 + (((tickAnim - 81) / 3) * (1.48682-(-0.47968)));
            zz = -1.77342 + (((tickAnim - 81) / 3) * (4.77436-(-1.77342)));
        }
        else if (tickAnim >= 84 && tickAnim < 87) {
            xx = -9.75801 + (((tickAnim - 84) / 3) * (-3.21431-(-9.75801)));
            yy = 1.48682 + (((tickAnim - 84) / 3) * (-0.47968-(1.48682)));
            zz = 4.77436 + (((tickAnim - 84) / 3) * (-1.77342-(4.77436)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = -3.21431 + (((tickAnim - 87) / 2) * (-9.88-(-3.21431)));
            yy = -0.47968 + (((tickAnim - 87) / 2) * (0-(-0.47968)));
            zz = -1.77342 + (((tickAnim - 87) / 2) * (0-(-1.77342)));
        }
        else if (tickAnim >= 89 && tickAnim < 93) {
            xx = -9.88 + (((tickAnim - 89) / 4) * (1.42-(-9.88)));
            yy = 0 + (((tickAnim - 89) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 4) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 1.42 + (((tickAnim - 93) / 7) * (0-(1.42)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 10 + (((tickAnim - 17) / 4) * (10.32865-(10)));
            yy = 0 + (((tickAnim - 17) / 4) * (-6.6434-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (-4.69109-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 10.32865 + (((tickAnim - 21) / 3) * (10.02489-(10.32865)));
            yy = -6.6434 + (((tickAnim - 21) / 3) * (-0.21916-(-6.6434)));
            zz = -4.69109 + (((tickAnim - 21) / 3) * (-0.15526-(-4.69109)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 10.02489 + (((tickAnim - 24) / 3) * (10.23163-(10.02489)));
            yy = -0.21916 + (((tickAnim - 24) / 3) * (-6.13784-(-0.21916)));
            zz = -0.15526 + (((tickAnim - 24) / 3) * (-4.31837-(-0.15526)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 10.23163 + (((tickAnim - 27) / 5) * (-27.27057-(10.23163)));
            yy = -6.13784 + (((tickAnim - 27) / 5) * (-0.44594-(-6.13784)));
            zz = -4.31837 + (((tickAnim - 27) / 5) * (-0.31374-(-4.31837)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -27.27057 + (((tickAnim - 32) / 5) * (10.22723-(-27.27057)));
            yy = -0.44594 + (((tickAnim - 32) / 5) * (5.24596-(-0.44594)));
            zz = -0.31374 + (((tickAnim - 32) / 5) * (3.69088-(-0.31374)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 10.22723 + (((tickAnim - 37) / 6) * (-2.43803-(10.22723)));
            yy = 5.24596 + (((tickAnim - 37) / 6) * (1.43072-(5.24596)));
            zz = 3.69088 + (((tickAnim - 37) / 6) * (1.0066-(3.69088)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -2.43803 + (((tickAnim - 43) / 3) * (10-(-2.43803)));
            yy = 1.43072 + (((tickAnim - 43) / 3) * (0-(1.43072)));
            zz = 1.0066 + (((tickAnim - 43) / 3) * (0-(1.0066)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = 10 + (((tickAnim - 46) / 17) * (-24.56-(10)));
            yy = 0 + (((tickAnim - 46) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 17) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -24.56 + (((tickAnim - 63) / 4) * (-19.56515-(-24.56)));
            yy = 0 + (((tickAnim - 63) / 4) * (0.23693-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (-2.48875-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = -19.56515 + (((tickAnim - 67) / 2) * (-7.20376-(-19.56515)));
            yy = 0.23693 + (((tickAnim - 67) / 2) * (-2.30419-(0.23693)));
            zz = -2.48875 + (((tickAnim - 67) / 2) * (7.1392-(-2.48875)));
        }
        else if (tickAnim >= 69 && tickAnim < 72) {
            xx = -7.20376 + (((tickAnim - 69) / 3) * (-19.56515-(-7.20376)));
            yy = -2.30419 + (((tickAnim - 69) / 3) * (0.23693-(-2.30419)));
            zz = 7.1392 + (((tickAnim - 69) / 3) * (-2.48875-(7.1392)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = -19.56515 + (((tickAnim - 72) / 2) * (-7.07598-(-19.56515)));
            yy = 0.23693 + (((tickAnim - 72) / 2) * (0.76983-(0.23693)));
            zz = -2.48875 + (((tickAnim - 72) / 2) * (-2.37859-(-2.48875)));
        }
        else if (tickAnim >= 74 && tickAnim < 77) {
            xx = -7.07598 + (((tickAnim - 74) / 3) * (-19.56515-(-7.07598)));
            yy = 0.76983 + (((tickAnim - 74) / 3) * (0.23693-(0.76983)));
            zz = -2.37859 + (((tickAnim - 74) / 3) * (-2.48875-(-2.37859)));
        }
        else if (tickAnim >= 77 && tickAnim < 79) {
            xx = -19.56515 + (((tickAnim - 77) / 2) * (-7.20376-(-19.56515)));
            yy = 0.23693 + (((tickAnim - 77) / 2) * (-2.30419-(0.23693)));
            zz = -2.48875 + (((tickAnim - 77) / 2) * (7.1392-(-2.48875)));
        }
        else if (tickAnim >= 79 && tickAnim < 82) {
            xx = -7.20376 + (((tickAnim - 79) / 3) * (-19.56-(-7.20376)));
            yy = -2.30419 + (((tickAnim - 79) / 3) * (0-(-2.30419)));
            zz = 7.1392 + (((tickAnim - 79) / 3) * (0-(7.1392)));
        }
        else if (tickAnim >= 82 && tickAnim < 83) {
            xx = -19.56 + (((tickAnim - 82) / 1) * (-7.07598-(-19.56)));
            yy = 0 + (((tickAnim - 82) / 1) * (0.76983-(0)));
            zz = 0 + (((tickAnim - 82) / 1) * (-2.37859-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = -7.07598 + (((tickAnim - 83) / 3) * (-24.56-(-7.07598)));
            yy = 0.76983 + (((tickAnim - 83) / 3) * (0-(0.76983)));
            zz = -2.37859 + (((tickAnim - 83) / 3) * (0-(-2.37859)));
        }
        else if (tickAnim >= 86 && tickAnim < 100) {
            xx = -24.56 + (((tickAnim - 86) / 14) * (0-(-24.56)));
            yy = 0 + (((tickAnim - 86) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (32.5-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 32.5 + (((tickAnim - 20) / 4) * (17.81-(32.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 17.81 + (((tickAnim - 24) / 4) * (32.5-(17.81)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 32.5 + (((tickAnim - 28) / 2) * (0-(32.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDeuterosaurus e = (EntityPrehistoricFloraDeuterosaurus) entity;
        animator.update(entity);

    }
}
