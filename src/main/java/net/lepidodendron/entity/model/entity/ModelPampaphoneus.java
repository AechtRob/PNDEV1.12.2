package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPampaphoneus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPampaphoneus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftbacktoe;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightbacktoe;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftfronttoe;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightfronttoe;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r51;

    private ModelAnimator animator;

    public ModelPampaphoneus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 16.1101F, 7.1609F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.1278F, 2.1107F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -3.0F, -3.0F, -3.5F, 6, 7, 5, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.9347F, 1.2027F, 1.9559F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.3968F, -0.2148F, -0.0385F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.6681F, 0.2345F, -2.0067F);
        this.leftleg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.1345F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 23, -1.3F, -3.25F, -1.0F, 3, 5, 4, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.6681F, 0.6019F, -3.5942F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4363F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.3466F, 0.0205F);
        this.leftleg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -3.2F, -2.2F, 2, 5, 3, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 4.3F, -1.5F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.6104F, 0.025F, 0.0357F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.1F, -1.5F);
        this.leftfoot.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2094F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 28, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));

        this.leftbacktoe = new AdvancedModelRenderer(this);
        this.leftbacktoe.setRotationPoint(0.0F, -0.0079F, -1.4281F);
        this.leftfoot.addChild(leftbacktoe);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1079F, -0.0719F);
        this.leftbacktoe.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 0, -2.0F, -0.5F, -2.0F, 4, 1, 2, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.9347F, 1.2027F, 1.9559F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.3968F, 0.2148F, 0.0385F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.6681F, 0.2345F, -2.0067F);
        this.rightleg.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.1345F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 23, -1.7F, -3.25F, -1.0F, 3, 5, 4, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.6681F, 0.6019F, -3.5942F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4363F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.3466F, 0.0205F);
        this.rightleg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.0F, -3.2F, -2.2F, 2, 5, 3, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 4.3F, -1.5F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.6104F, -0.025F, -0.0357F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.1F, -1.5F);
        this.rightfoot.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 28, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, true));

        this.rightbacktoe = new AdvancedModelRenderer(this);
        this.rightbacktoe.setRotationPoint(0.0F, -0.0079F, -1.4281F);
        this.rightfoot.addChild(rightbacktoe);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.1079F, -0.0719F);
        this.rightbacktoe.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2094F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 0, -2.0F, -0.5F, -2.0F, 4, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.01F, -2.1787F, -0.6946F);
        this.hips.addChild(body);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.75F, 4.7F, -10.3F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -6.76F, -6.8286F, -0.0902F, 8, 9, 11, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3F, -10.1F);
        this.body.addChild(chest);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.75F, 5.0F, -0.2F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 0, -5.76F, -6.5712F, -3.0941F, 6, 8, 4, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(2.9199F, 3.333F, -1.598F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.0873F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0161F, 0.109F, 1.0117F);
        this.leftarm.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.9703F, 0.4932F, -0.1289F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 20, -2.0F, -1.25F, -2.25F, 3, 5, 3, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(2.0381F, 2.215F, 2.8531F);
        this.leftarm.addChild(leftarm2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0127F, 2.8208F, -2.7879F);
        this.leftarm2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.487F, 0.0062F, -0.0237F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 3, -1.0F, -4.25F, 0.55F, 2, 5, 2, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.0519F, 4.1544F, -1.8617F);
        this.leftarm2.addChild(lefthand);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.76F, -4.7612F, 0.3533F);
        this.lefthand.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0803F, 0.0062F, -0.0237F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 23, 0.6466F, 4.5813F, -2.0007F, 4, 1, 2, 0.0F, false));

        this.leftfronttoe = new AdvancedModelRenderer(this);
        this.leftfronttoe.setRotationPoint(-0.0043F, 0.4803F, -1.2468F);
        this.lefthand.addChild(leftfronttoe);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.7557F, -5.2416F, 1.6F);
        this.leftfronttoe.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0803F, 0.0062F, -0.0237F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 41, 0.6466F, 4.5813F, -4.0007F, 4, 1, 2, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-2.9398F, 3.333F, -1.598F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.0873F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0161F, 0.109F, 1.0117F);
        this.rightarm.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.9703F, -0.4932F, 0.1289F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 20, -1.0F, -1.25F, -2.25F, 3, 5, 3, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-2.0381F, 2.215F, 2.8531F);
        this.rightarm.addChild(rightarm2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.0127F, 2.8208F, -2.7879F);
        this.rightarm2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.487F, -0.0062F, 0.0237F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 3, -1.0F, -4.25F, 0.55F, 2, 5, 2, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.0519F, 4.1544F, -1.8617F);
        this.rightarm2.addChild(righthand);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.76F, -4.7612F, 0.3533F);
        this.righthand.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0803F, -0.0062F, 0.0237F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 23, -4.6466F, 4.5813F, -2.0007F, 4, 1, 2, 0.0F, true));

        this.rightfronttoe = new AdvancedModelRenderer(this);
        this.rightfronttoe.setRotationPoint(0.0043F, 0.4803F, -1.2468F);
        this.righthand.addChild(rightfronttoe);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.7557F, -5.2416F, 1.6F);
        this.rightfronttoe.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0803F, -0.0062F, 0.0237F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 41, -4.6466F, 4.5813F, -4.0007F, 4, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.chest.addChild(neck);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.75F, 5.0F, 3.0F);
        this.neck.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 12, -5.26F, -5.1227F, -6.4651F, 5, 6, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.neck.addChild(neck2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.75F, 5.0F, 4.75F);
        this.neck2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 20, -4.76F, -6.4792F, -8.8972F, 4, 5, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.49F, -0.4992F, -3.9618F);
        this.neck2.addChild(head);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.48F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 33, 48, -3.0F, -1.4F, -1.4F, 4, 3, 2, -0.05F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 1.8647F, -1.5878F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 45, 48, -3.0F, -3.35F, 0.15F, 4, 3, 2, -0.1F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.2212F, -3.9963F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.48F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 50, -2.0F, -1.6F, -0.6F, 3, 2, 3, 0.002F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 2.8949F, -4.7468F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 27, 7, -0.3F, -0.7F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.8949F, -4.7468F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 27, 7, 0.3F, -0.7F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 2.6909F, -4.9644F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 50, 29, -1.0F, -0.8F, -2.4F, 2, 1, 3, 0.001F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.55F, -0.397F, -2.912F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.8326F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 29, -1.1F, 0.1F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.05F, -0.1564F, -3.0977F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.8997F, -0.3033F, -0.1888F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 20, -0.5F, -0.8F, -0.5F, 1, 2, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.55F, -0.397F, -2.912F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.8326F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 29, 0.1F, 0.1F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.05F, -0.1564F, -3.0977F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.8997F, 0.3033F, 0.1888F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 20, -0.5F, -0.8F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.75F, 3.0245F, -7.0066F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 20, -0.65F, -0.3F, -0.1F, 0, 2, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.25F, 3.0245F, -7.0066F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 12, 20, 0.65F, -0.3F, -0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, 2.0084F, -6.8451F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3927F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 9, 50, -0.5F, 0.55F, -0.75F, 2, 1, 1, -0.2F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 2.0084F, -6.8451F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0436F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 50, 33, -1.0F, 0.1F, -1.3F, 2, 1, 1, -0.1F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, 1.1618F, -5.4511F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.48F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 10, 30, 0.0F, -0.9F, -0.9F, 1, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.0045F, 1.7417F, -5.5117F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3078F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 53, 12, -1.5F, -0.6F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 1.5269F, -6.9675F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.7854F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 53, -1.0F, -0.4F, -1.2F, 1, 2, 2, -0.1F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.5F, 0.5614F, -4.2092F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.288F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 12, 50, 0.0F, -0.9F, -0.45F, 2, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7325F, -0.323F);
        this.head.addChild(jaw);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.3167F, -2.4516F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1309F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 29, -2.0F, -3.0F, -0.2F, 3, 3, 4, -0.001F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 1.3138F, -3.697F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2618F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 22, 38, -1.0F, -0.7F, -1.95F, 2, 1, 5, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 1.4617F, -6.3133F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1047F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 17, 38, -1.0F, -0.5F, -1.5F, 2, 1, 3, -0.15F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 1.3167F, -2.4516F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1745F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 44, 35, -2.0F, -1.5F, -1.0F, 3, 2, 4, -0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.2584F, -4.6414F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1745F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 10, 26, -0.65F, -0.1F, -1.8F, 0, 1, 3, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 0.2584F, -4.6414F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1745F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 10, 26, 0.65F, -0.1F, -1.8F, 0, 1, 3, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 0.7381F, -6.8125F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.3927F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 52, 26, -1.0F, -0.4F, -0.8F, 2, 1, 1, -0.2F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.74F, 0.3369F, -5.8645F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0436F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 7, 0, 0.54F, 0.0F, -1.25F, 0, 1, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.74F, 0.3369F, -5.8645F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0436F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 7, 0, -0.54F, 0.0F, -1.25F, 0, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.567F, 3.5462F);
        this.hips.addChild(tail);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 1.3374F, 2.4942F);
        this.tail.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.3054F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 27, 35, -2.0F, -2.25F, -3.0F, 4, 4, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.9335F, 7.6571F);
        this.tail.addChild(tail2);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 1.3229F, 4.9263F);
        this.tail2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.2182F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 20, 20, -1.0F, -1.95F, -5.0F, 3, 3, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 2.424F, 11.2536F);
        this.tail2.addChild(tail3);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.2415F, 5.7563F);
        this.tail3.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1309F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 20, -1.0F, -0.7F, -6.0F, 2, 2, 16, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.chest.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.rightarm.setScale(0,0,0);
        this.leftarm.setScale(0,0,0);
        this.rightarm.scaleChildren = true;
        this.leftarm.scaleChildren = true;
        this.chest.offsetY = -0.03F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = -0.2F;
        this.chest.render(0.01F);
        this.rightarm.setScale(1,1,1);
        this.leftarm.setScale(1,1,1);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(neck, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(neck2, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(head, -0.6F, 0.0F, -0.1F);
        this.setRotateAngle(jaw, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(leftarm, 0.2F, 0.2F, -0.2F);
        this.setRotateAngle(leftarm2, 0.3F, -0.2F, 0.3F);
        this.setRotateAngle(lefthand, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftfronttoe, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm, -0.4F, -0.5F, -0.3F);
        this.setRotateAngle(rightarm2, 0.2F, 0.2F, 0.3F);
        this.setRotateAngle(righthand, 0.25F, 0.0F, 0.1F);
        this.setRotateAngle(rightfronttoe, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.1F, -0.3F, -0.3F);
        this.setRotateAngle(leftleg2, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(leftfoot, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftbacktoe, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(rightfoot, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(rightbacktoe, 0.0F, 0.0F, 0.0F);
        this.hips.offsetZ = -0.03F;
        this.hips.offsetY = -0.13F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.0F;
        this.hips.offsetX = 0.15F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 0.8F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.0F, 3.6F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(neck, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(neck2, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(head, -0.6F, 0.0F, -0.1F);
        this.setRotateAngle(jaw, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 1.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 1.5F, 0.0F);
        this.setRotateAngle(leftarm, 0.2F, 0.2F, -0.2F);
        this.setRotateAngle(leftarm2, 0.3F, -0.2F, 0.3F);
        this.setRotateAngle(lefthand, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftfronttoe, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm, -0.4F, -0.5F, -0.3F);
        this.setRotateAngle(rightarm2, 0.2F, 0.2F, 0.3F);
        this.setRotateAngle(righthand, 0.25F, 0.0F, 0.1F);
        this.setRotateAngle(rightfronttoe, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.1F, -0.3F, -0.3F);
        this.setRotateAngle(leftleg2, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(leftfoot, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftbacktoe, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(rightfoot, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(rightbacktoe, 0.0F, 0.0F, 0.0F);
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

        EntityPrehistoricFloraPampaphoneus Pampaphoneus = (EntityPrehistoricFloraPampaphoneus) e;
        float masterSpeed = Pampaphoneus.getTravelSpeed();

        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 4, neck2);
        this.faceTarget(f3, f4, 4, head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        Pampaphoneus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Pampaphoneus.getAnimation() == Pampaphoneus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Pampaphoneus.isReallyInWater()) {

            if (f3 == 0.0F || !Pampaphoneus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Pampaphoneus.getIsFast()) { //Running
                if (Pampaphoneus.getIsSneaking()) {

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
        EntityPrehistoricFloraPampaphoneus ee = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SHAKE_ANIMATION) { //The noise anim
            animShake(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SNIFF_ANIMATION) { //The noise anim
            animSniff(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 10) * (0-(0.25)));
            zz = -1 + (((tickAnim - 10) / 10) * (0-(-1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 30) / 10) * (0-(0.25)));
            zz = -1 + (((tickAnim - 30) / 10) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 40.16232 + (((tickAnim - 0) / 10) * (6.89388-(40.16232)));
            yy = 5.72233 + (((tickAnim - 0) / 10) * (1.42638-(5.72233)));
            zz = -7.12315 + (((tickAnim - 0) / 10) * (-9.0236-(-7.12315)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6.89388 + (((tickAnim - 10) / 5) * (-11.60385-(6.89388)));
            yy = 1.42638 + (((tickAnim - 10) / 5) * (2.37278-(1.42638)));
            zz = -9.0236 + (((tickAnim - 10) / 5) * (1.00197-(-9.0236)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.60385 + (((tickAnim - 15) / 5) * (-5.194-(-11.60385)));
            yy = 2.37278 + (((tickAnim - 15) / 5) * (1.76581-(2.37278)));
            zz = 1.00197 + (((tickAnim - 15) / 5) * (-0.42593-(1.00197)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5.194 + (((tickAnim - 20) / 20) * (40.16232-(-5.194)));
            yy = 1.76581 + (((tickAnim - 20) / 20) * (5.72233-(1.76581)));
            zz = -0.42593 + (((tickAnim - 20) / 20) * (-7.12315-(-0.42593)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -12.5 + (((tickAnim - 0) / 5) * (19.38-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.38 + (((tickAnim - 5) / 5) * (15.42-(19.38)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.42 + (((tickAnim - 10) / 10) * (-15-(15.42)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15 + (((tickAnim - 20) / 10) * (-8.75-(-15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -8.75 + (((tickAnim - 30) / 10) * (-12.5-(-8.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27.14639 + (((tickAnim - 0) / 5) * (33.13-(-27.14639)));
            yy = 5.93718 + (((tickAnim - 0) / 5) * (0-(5.93718)));
            zz = 4.59823 + (((tickAnim - 0) / 5) * (0-(4.59823)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 33.13 + (((tickAnim - 5) / 5) * (-27.91-(33.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.91 + (((tickAnim - 10) / 10) * (22.5-(-27.91)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 20) / 10) * (-8.86573-(22.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (-1.85958-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.32527-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -8.86573 + (((tickAnim - 30) / 10) * (-27.14639-(-8.86573)));
            yy = -1.85958 + (((tickAnim - 30) / 10) * (5.93718-(-1.85958)));
            zz = 0.32527 + (((tickAnim - 30) / 10) * (4.59823-(0.32527)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -52.5 + (((tickAnim - 5) / 5) * (30-(-52.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 30 + (((tickAnim - 10) / 10) * (0-(30)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -5.194 + (((tickAnim - 0) / 20) * (40.16232-(-5.194)));
            yy = -1.76581 + (((tickAnim - 0) / 20) * (-5.72233-(-1.76581)));
            zz = 0.42593 + (((tickAnim - 0) / 20) * (7.12315-(0.42593)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 40.16232 + (((tickAnim - 20) / 10) * (6.89388-(40.16232)));
            yy = -5.72233 + (((tickAnim - 20) / 10) * (-1.42638-(-5.72233)));
            zz = 7.12315 + (((tickAnim - 20) / 10) * (9.0236-(7.12315)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 6.89388 + (((tickAnim - 30) / 5) * (-11.60385-(6.89388)));
            yy = -1.42638 + (((tickAnim - 30) / 5) * (-2.37278-(-1.42638)));
            zz = 9.0236 + (((tickAnim - 30) / 5) * (-1.00197-(9.0236)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -11.60385 + (((tickAnim - 35) / 5) * (-5.194-(-11.60385)));
            yy = -2.37278 + (((tickAnim - 35) / 5) * (-1.76581-(-2.37278)));
            zz = -1.00197 + (((tickAnim - 35) / 5) * (0.42593-(-1.00197)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 0) / 10) * (-8.75-(-15)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.75 + (((tickAnim - 10) / 10) * (-12.5-(-8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 20) / 5) * (19.38-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 19.38 + (((tickAnim - 25) / 5) * (15.42-(19.38)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15.42 + (((tickAnim - 30) / 10) * (-15-(15.42)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 0) / 10) * (-8.86573-(22.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.85958-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.32527-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.86573 + (((tickAnim - 10) / 10) * (-27.14639-(-8.86573)));
            yy = 1.85958 + (((tickAnim - 10) / 10) * (-5.93718-(1.85958)));
            zz = -0.32527 + (((tickAnim - 10) / 10) * (-4.59823-(-0.32527)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -27.14639 + (((tickAnim - 20) / 5) * (33.13-(-27.14639)));
            yy = -5.93718 + (((tickAnim - 20) / 5) * (0-(-5.93718)));
            zz = -4.59823 + (((tickAnim - 20) / 5) * (0-(-4.59823)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 33.13 + (((tickAnim - 25) / 5) * (-27.91-(33.13)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.91 + (((tickAnim - 30) / 10) * (22.5-(-27.91)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -52.5 + (((tickAnim - 25) / 5) * (30-(-52.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30 + (((tickAnim - 30) / 10) * (0-(30)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbacktoe, rightbacktoe.rotateAngleX + (float) Math.toRadians(xx), rightbacktoe.rotateAngleY + (float) Math.toRadians(yy), rightbacktoe.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-2), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*2), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-2));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -63.66299 + (((tickAnim - 0) / 20) * (10.74165-(-63.66299)));
            yy = -9.58409 + (((tickAnim - 0) / 20) * (4.47829-(-9.58409)));
            zz = -0.82763 + (((tickAnim - 0) / 20) * (1.43338-(-0.82763)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.74165 + (((tickAnim - 20) / 10) * (-26.93061-(10.74165)));
            yy = 4.47829 + (((tickAnim - 20) / 10) * (1.16496-(4.47829)));
            zz = 1.43338 + (((tickAnim - 20) / 10) * (-24.41339-(1.43338)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -26.93061 + (((tickAnim - 30) / 10) * (-63.66299-(-26.93061)));
            yy = 1.16496 + (((tickAnim - 30) / 10) * (-9.58409-(1.16496)));
            zz = -24.41339 + (((tickAnim - 30) / 10) * (-0.82763-(-24.41339)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 42.91036 + (((tickAnim - 0) / 10) * (9.05541-(42.91036)));
            yy = 3.14752 + (((tickAnim - 0) / 10) * (1.32883-(3.14752)));
            zz = 7.42202 + (((tickAnim - 0) / 10) * (2.76248-(7.42202)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.05541 + (((tickAnim - 10) / 10) * (-4.79954-(9.05541)));
            yy = 1.32883 + (((tickAnim - 10) / 10) * (-0.48987-(1.32883)));
            zz = 2.76248 + (((tickAnim - 10) / 10) * (-1.89707-(2.76248)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.79954 + (((tickAnim - 20) / 10) * (-12.21502-(-4.79954)));
            yy = -0.48987 + (((tickAnim - 20) / 10) * (5.81356-(-0.48987)));
            zz = -1.89707 + (((tickAnim - 20) / 10) * (22.29652-(-1.89707)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -12.21502 + (((tickAnim - 30) / 10) * (42.91036-(-12.21502)));
            yy = 5.81356 + (((tickAnim - 30) / 10) * (3.14752-(5.81356)));
            zz = 22.29652 + (((tickAnim - 30) / 10) * (7.42202-(22.29652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.47638 + (((tickAnim - 0) / 10) * (19.76313-(22.47638)));
            yy = -1.2497 + (((tickAnim - 0) / 10) * (3.03295-(-1.2497)));
            zz = 2.16541 + (((tickAnim - 0) / 10) * (1.13635-(2.16541)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 19.76313 + (((tickAnim - 10) / 5) * (7.42854-(19.76313)));
            yy = 3.03295 + (((tickAnim - 10) / 5) * (1.33252-(3.03295)));
            zz = 1.13635 + (((tickAnim - 10) / 5) * (0.54148-(1.13635)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.42854 + (((tickAnim - 15) / 5) * (12.88394-(7.42854)));
            yy = 1.33252 + (((tickAnim - 15) / 5) * (-0.98788-(1.33252)));
            zz = 0.54148 + (((tickAnim - 15) / 5) * (4.9165-(0.54148)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 12.88394 + (((tickAnim - 20) / 12) * (66.40997-(12.88394)));
            yy = -0.98788 + (((tickAnim - 20) / 12) * (-0.41162-(-0.98788)));
            zz = 4.9165 + (((tickAnim - 20) / 12) * (2.04854-(4.9165)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 66.40997 + (((tickAnim - 32) / 3) * (46.34598-(66.40997)));
            yy = -0.41162 + (((tickAnim - 32) / 3) * (-0.24697-(-0.41162)));
            zz = 2.04854 + (((tickAnim - 32) / 3) * (1.22913-(2.04854)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 46.34598 + (((tickAnim - 35) / 5) * (22.47638-(46.34598)));
            yy = -0.24697 + (((tickAnim - 35) / 5) * (-1.2497-(-0.24697)));
            zz = 1.22913 + (((tickAnim - 35) / 5) * (2.16541-(1.22913)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 20) / 6) * (10.42-(-10)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 10.42 + (((tickAnim - 26) / 14) * (0-(10.42)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfronttoe, leftfronttoe.rotateAngleX + (float) Math.toRadians(xx), leftfronttoe.rotateAngleY + (float) Math.toRadians(yy), leftfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.74165 + (((tickAnim - 0) / 10) * (-26.93061-(10.74165)));
            yy = -4.47829 + (((tickAnim - 0) / 10) * (-1.16496-(-4.47829)));
            zz = -1.43338 + (((tickAnim - 0) / 10) * (24.41339-(-1.43338)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.93061 + (((tickAnim - 10) / 10) * (-63.66299-(-26.93061)));
            yy = -1.16496 + (((tickAnim - 10) / 10) * (9.58409-(-1.16496)));
            zz = 24.41339 + (((tickAnim - 10) / 10) * (0.82763-(24.41339)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -63.66299 + (((tickAnim - 20) / 20) * (10.74165-(-63.66299)));
            yy = 9.58409 + (((tickAnim - 20) / 20) * (-4.47829-(9.58409)));
            zz = 0.82763 + (((tickAnim - 20) / 20) * (-1.43338-(0.82763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -4.79954 + (((tickAnim - 0) / 10) * (-12.21502-(-4.79954)));
            yy = 0.48987 + (((tickAnim - 0) / 10) * (-5.81356-(0.48987)));
            zz = 1.89707 + (((tickAnim - 0) / 10) * (-22.29652-(1.89707)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.21502 + (((tickAnim - 10) / 10) * (42.91036-(-12.21502)));
            yy = -5.81356 + (((tickAnim - 10) / 10) * (-3.14752-(-5.81356)));
            zz = -22.29652 + (((tickAnim - 10) / 10) * (-7.42202-(-22.29652)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42.91036 + (((tickAnim - 20) / 10) * (9.05541-(42.91036)));
            yy = -3.14752 + (((tickAnim - 20) / 10) * (-1.32883-(-3.14752)));
            zz = -7.42202 + (((tickAnim - 20) / 10) * (-2.76248-(-7.42202)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 9.05541 + (((tickAnim - 30) / 10) * (-4.79954-(9.05541)));
            yy = -1.32883 + (((tickAnim - 30) / 10) * (0.48987-(-1.32883)));
            zz = -2.76248 + (((tickAnim - 30) / 10) * (1.89707-(-2.76248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 12.88394 + (((tickAnim - 0) / 12) * (66.40997-(12.88394)));
            yy = 0.98788 + (((tickAnim - 0) / 12) * (0.41162-(0.98788)));
            zz = -4.9165 + (((tickAnim - 0) / 12) * (-2.04854-(-4.9165)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 66.40997 + (((tickAnim - 12) / 3) * (46.34598-(66.40997)));
            yy = 0.41162 + (((tickAnim - 12) / 3) * (0.24697-(0.41162)));
            zz = -2.04854 + (((tickAnim - 12) / 3) * (-1.22913-(-2.04854)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 46.34598 + (((tickAnim - 15) / 5) * (22.47638-(46.34598)));
            yy = 0.24697 + (((tickAnim - 15) / 5) * (1.2497-(0.24697)));
            zz = -1.22913 + (((tickAnim - 15) / 5) * (-2.16541-(-1.22913)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.47638 + (((tickAnim - 20) / 10) * (19.76313-(22.47638)));
            yy = 1.2497 + (((tickAnim - 20) / 10) * (-3.03295-(1.2497)));
            zz = -2.16541 + (((tickAnim - 20) / 10) * (-1.13635-(-2.16541)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 19.76313 + (((tickAnim - 30) / 5) * (7.42854-(19.76313)));
            yy = -3.03295 + (((tickAnim - 30) / 5) * (-1.33252-(-3.03295)));
            zz = -1.13635 + (((tickAnim - 30) / 5) * (-0.54148-(-1.13635)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.42854 + (((tickAnim - 35) / 5) * (12.88394-(7.42854)));
            yy = -1.33252 + (((tickAnim - 35) / 5) * (0.98788-(-1.33252)));
            zz = -0.54148 + (((tickAnim - 35) / 5) * (-4.9165-(-0.54148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -10 + (((tickAnim - 0) / 6) * (10.42-(-10)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 10.42 + (((tickAnim - 6) / 14) * (0-(10.42)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfronttoe, rightfronttoe.rotateAngleX + (float) Math.toRadians(xx), rightfronttoe.rotateAngleY + (float) Math.toRadians(yy), rightfronttoe.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*2)), neck.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*2)), neck.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*-1)));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*-2.5), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*2.5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.5 + (((tickAnim - 0) / 3) * (-1.5-(-1.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.5 + (((tickAnim - 3) / 2) * (-1.5-(-1.5)));
            zz = -1 + (((tickAnim - 3) / 2) * (0-(-1)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -1.5 + (((tickAnim - 5) / 3) * (-1.5-(-1.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (-1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1.5 + (((tickAnim - 8) / 2) * (-1.5-(-1.5)));
            zz = -1 + (((tickAnim - 8) / 2) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -45 + (((tickAnim - 0) / 5) * (41.06723-(-45)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.25007-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-4.5911-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 41.06723 + (((tickAnim - 5) / 3) * (-7.17663-(41.06723)));
            yy = -2.25007 + (((tickAnim - 5) / 3) * (-9.21466-(-2.25007)));
            zz = -4.5911 + (((tickAnim - 5) / 3) * (-24.47336-(-4.5911)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.17663 + (((tickAnim - 8) / 2) * (-45-(-7.17663)));
            yy = -9.21466 + (((tickAnim - 8) / 2) * (0-(-9.21466)));
            zz = -24.47336 + (((tickAnim - 8) / 2) * (0-(-24.47336)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 8) / 2) * (0-(0.75)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.5 + (((tickAnim - 0) / 5) * (25-(17.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 5) / 2) * (32.5-(25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 32.5 + (((tickAnim - 7) / 3) * (17.5-(32.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 35 + (((tickAnim - 0) / 2) * (-4.17-(35)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -4.17 + (((tickAnim - 2) / 1) * (-32.09-(-4.17)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -32.09 + (((tickAnim - 3) / 2) * (0-(-32.09)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (124.17-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 124.17 + (((tickAnim - 7) / 1) * (-27.92-(124.17)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -27.92 + (((tickAnim - 8) / 2) * (35-(-27.92)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.06785-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.29741-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.3278-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.06785 + (((tickAnim - 2) / 1) * (-2.36429-(0.06785)));
            yy = -1.29741 + (((tickAnim - 2) / 1) * (-2.59483-(-1.29741)));
            zz = -0.3278 + (((tickAnim - 2) / 1) * (-0.65559-(-0.3278)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.36429 + (((tickAnim - 3) / 2) * (-44.79644-(-2.36429)));
            yy = -2.59483 + (((tickAnim - 3) / 2) * (-3.89224-(-2.59483)));
            zz = -0.65559 + (((tickAnim - 3) / 2) * (-0.98339-(-0.65559)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -44.79644 + (((tickAnim - 5) / 2) * (35.13571-(-44.79644)));
            yy = -3.89224 + (((tickAnim - 5) / 2) * (-2.59483-(-3.89224)));
            zz = -0.98339 + (((tickAnim - 5) / 2) * (-0.65559-(-0.98339)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 35.13571 + (((tickAnim - 7) / 1) * (126.35178-(35.13571)));
            yy = -2.59483 + (((tickAnim - 7) / 1) * (-1.94612-(-2.59483)));
            zz = -0.65559 + (((tickAnim - 7) / 1) * (-0.4917-(-0.65559)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 126.35178 + (((tickAnim - 8) / 2) * (0-(126.35178)));
            yy = -1.94612 + (((tickAnim - 8) / 2) * (0-(-1.94612)));
            zz = -0.4917 + (((tickAnim - 8) / 2) * (0-(-0.4917)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*-2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*2.5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+90))*2.5), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*-2.5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 42.79355 + (((tickAnim - 0) / 3) * (-33.34675-(42.79355)));
            yy = 7.80647 + (((tickAnim - 0) / 3) * (4.73262-(7.80647)));
            zz = -10.82548 + (((tickAnim - 0) / 3) * (-38.298-(-10.82548)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -33.34675 + (((tickAnim - 3) / 2) * (-87.20645-(-33.34675)));
            yy = 4.73262 + (((tickAnim - 3) / 2) * (7.80647-(4.73262)));
            zz = -38.298 + (((tickAnim - 3) / 2) * (-10.82548-(-38.298)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -87.20645 + (((tickAnim - 5) / 2) * (-18.41473-(-87.20645)));
            yy = 7.80647 + (((tickAnim - 5) / 2) * (-1.97576-(7.80647)));
            zz = -10.82548 + (((tickAnim - 5) / 2) * (-3.02392-(-10.82548)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -18.41473 + (((tickAnim - 7) / 1) * (19.57927-(-18.41473)));
            yy = -1.97576 + (((tickAnim - 7) / 1) * (7.80647-(-1.97576)));
            zz = -3.02392 + (((tickAnim - 7) / 1) * (-10.82548-(-3.02392)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.57927 + (((tickAnim - 8) / 2) * (42.79355-(19.57927)));
            yy = 7.80647 + (((tickAnim - 8) / 2) * (7.80647-(7.80647)));
            zz = -10.82548 + (((tickAnim - 8) / 2) * (-10.82548-(-10.82548)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 22.71783 + (((tickAnim - 0) / 2) * (-41.92502-(22.71783)));
            yy = 2.57594 + (((tickAnim - 0) / 2) * (2.57594-(2.57594)));
            zz = 9.6658 + (((tickAnim - 0) / 2) * (9.6658-(9.6658)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -41.92502 + (((tickAnim - 2) / 3) * (32.71783-(-41.92502)));
            yy = 2.57594 + (((tickAnim - 2) / 3) * (2.57594-(2.57594)));
            zz = 9.6658 + (((tickAnim - 2) / 3) * (9.6658-(9.6658)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 32.71783 + (((tickAnim - 5) / 2) * (-25.13931-(32.71783)));
            yy = 2.57594 + (((tickAnim - 5) / 2) * (2.57594-(2.57594)));
            zz = 9.6658 + (((tickAnim - 5) / 2) * (9.6658-(9.6658)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -25.13931 + (((tickAnim - 7) / 1) * (-33.99645-(-25.13931)));
            yy = 2.57594 + (((tickAnim - 7) / 1) * (2.57594-(2.57594)));
            zz = 9.6658 + (((tickAnim - 7) / 1) * (9.6658-(9.6658)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33.99645 + (((tickAnim - 8) / 2) * (22.71783-(-33.99645)));
            yy = 2.57594 + (((tickAnim - 8) / 2) * (2.57594-(2.57594)));
            zz = 9.6658 + (((tickAnim - 8) / 2) * (9.6658-(9.6658)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -15 + (((tickAnim - 0) / 2) * (53.93-(-15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 53.93 + (((tickAnim - 2) / 3) * (42.5-(53.93)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 42.5 + (((tickAnim - 5) / 2) * (46.07-(42.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 46.07 + (((tickAnim - 7) / 1) * (22.83-(46.07)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.83 + (((tickAnim - 8) / 1) * (-26.29-(22.83)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -26.29 + (((tickAnim - 9) / 1) * (-15-(-26.29)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -25 + (((tickAnim - 0) / 2) * (50-(-25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 50 + (((tickAnim - 2) / 3) * (27.5-(50)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.5 + (((tickAnim - 5) / 2) * (0-(27.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-5-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -5 + (((tickAnim - 8) / 1) * (5-(-5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 9) / 1) * (-25-(5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfronttoe, leftfronttoe.rotateAngleX + (float) Math.toRadians(xx), leftfronttoe.rotateAngleY + (float) Math.toRadians(yy), leftfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -87.20645 + (((tickAnim - 0) / 2) * (-18.41473-(-87.20645)));
            yy = -7.80647 + (((tickAnim - 0) / 2) * (1.97576-(-7.80647)));
            zz = 10.82548 + (((tickAnim - 0) / 2) * (3.02392-(10.82548)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -18.41473 + (((tickAnim - 2) / 1) * (19.57927-(-18.41473)));
            yy = 1.97576 + (((tickAnim - 2) / 1) * (-7.80647-(1.97576)));
            zz = 3.02392 + (((tickAnim - 2) / 1) * (10.82548-(3.02392)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 19.57927 + (((tickAnim - 3) / 2) * (42.79355-(19.57927)));
            yy = -7.80647 + (((tickAnim - 3) / 2) * (-7.80647-(-7.80647)));
            zz = 10.82548 + (((tickAnim - 3) / 2) * (10.82548-(10.82548)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 42.79355 + (((tickAnim - 5) / 3) * (-33.34675-(42.79355)));
            yy = -7.80647 + (((tickAnim - 5) / 3) * (-4.73262-(-7.80647)));
            zz = 10.82548 + (((tickAnim - 5) / 3) * (38.298-(10.82548)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33.34675 + (((tickAnim - 8) / 2) * (-87.20645-(-33.34675)));
            yy = -4.73262 + (((tickAnim - 8) / 2) * (-7.80647-(-4.73262)));
            zz = 38.298 + (((tickAnim - 8) / 2) * (10.82548-(38.298)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 32.71783 + (((tickAnim - 0) / 2) * (-25.13931-(32.71783)));
            yy = -2.57594 + (((tickAnim - 0) / 2) * (-2.57594-(-2.57594)));
            zz = -9.6658 + (((tickAnim - 0) / 2) * (-9.6658-(-9.6658)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.13931 + (((tickAnim - 2) / 1) * (-33.99645-(-25.13931)));
            yy = -2.57594 + (((tickAnim - 2) / 1) * (-2.57594-(-2.57594)));
            zz = -9.6658 + (((tickAnim - 2) / 1) * (-9.6658-(-9.6658)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -33.99645 + (((tickAnim - 3) / 2) * (22.71783-(-33.99645)));
            yy = -2.57594 + (((tickAnim - 3) / 2) * (-2.57594-(-2.57594)));
            zz = -9.6658 + (((tickAnim - 3) / 2) * (-9.6658-(-9.6658)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 22.71783 + (((tickAnim - 5) / 2) * (-41.92502-(22.71783)));
            yy = -2.57594 + (((tickAnim - 5) / 2) * (-2.57594-(-2.57594)));
            zz = -9.6658 + (((tickAnim - 5) / 2) * (-9.6658-(-9.6658)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -41.92502 + (((tickAnim - 7) / 3) * (32.71783-(-41.92502)));
            yy = -2.57594 + (((tickAnim - 7) / 3) * (-2.57594-(-2.57594)));
            zz = -9.6658 + (((tickAnim - 7) / 3) * (-9.6658-(-9.6658)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 42.5 + (((tickAnim - 0) / 2) * (46.07-(42.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 46.07 + (((tickAnim - 2) / 1) * (22.83-(46.07)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 22.83 + (((tickAnim - 3) / 1) * (-26.29-(22.83)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -26.29 + (((tickAnim - 4) / 1) * (-15-(-26.29)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -15 + (((tickAnim - 5) / 1) * (-13.03-(-15)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -13.03 + (((tickAnim - 6) / 1) * (53.93-(-13.03)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 53.93 + (((tickAnim - 7) / 3) * (42.5-(53.93)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.5 + (((tickAnim - 0) / 2) * (0-(27.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-5-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5 + (((tickAnim - 3) / 1) * (5-(-5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 4) / 1) * (-25-(5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -25 + (((tickAnim - 5) / 2) * (50-(-25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 50 + (((tickAnim - 7) / 3) * (27.5-(50)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfronttoe, rightfronttoe.rotateAngleX + (float) Math.toRadians(xx), rightfronttoe.rotateAngleY + (float) Math.toRadians(yy), rightfronttoe.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+120))*-2.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*2.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*2.5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*-2.5));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+60))*-2.5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*10), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*-2.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-2.5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 41.06723 + (((tickAnim - 0) / 3) * (-7.17663-(41.06723)));
            yy = 2.25007 + (((tickAnim - 0) / 3) * (9.21466-(2.25007)));
            zz = 4.5911 + (((tickAnim - 0) / 3) * (24.47336-(4.5911)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.17663 + (((tickAnim - 3) / 2) * (-45-(-7.17663)));
            yy = 9.21466 + (((tickAnim - 3) / 2) * (0-(9.21466)));
            zz = 24.47336 + (((tickAnim - 3) / 2) * (0-(24.47336)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -45 + (((tickAnim - 5) / 5) * (41.06723-(-45)));
            yy = 0 + (((tickAnim - 5) / 5) * (2.25007-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (4.5911-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 2) * (0-(0.75)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
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
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25 + (((tickAnim - 0) / 2) * (32.5-(25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 32.5 + (((tickAnim - 2) / 3) * (17.5-(32.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 5) / 5) * (25-(17.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (124.17-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 124.17 + (((tickAnim - 2) / 1) * (-27.92-(124.17)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -27.92 + (((tickAnim - 3) / 2) * (35-(-27.92)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 35 + (((tickAnim - 5) / 2) * (-4.17-(35)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -4.17 + (((tickAnim - 7) / 1) * (-32.09-(-4.17)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.09 + (((tickAnim - 8) / 2) * (0-(-32.09)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -44.79644 + (((tickAnim - 0) / 2) * (35.13571-(-44.79644)));
            yy = 3.89224 + (((tickAnim - 0) / 2) * (2.59483-(3.89224)));
            zz = 0.98339 + (((tickAnim - 0) / 2) * (0.65559-(0.98339)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 35.13571 + (((tickAnim - 2) / 1) * (126.35178-(35.13571)));
            yy = 2.59483 + (((tickAnim - 2) / 1) * (1.94612-(2.59483)));
            zz = 0.65559 + (((tickAnim - 2) / 1) * (0.4917-(0.65559)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 126.35178 + (((tickAnim - 3) / 2) * (0-(126.35178)));
            yy = 1.94612 + (((tickAnim - 3) / 2) * (0-(1.94612)));
            zz = 0.4917 + (((tickAnim - 3) / 2) * (0-(0.4917)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0.06785-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (1.29741-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.3278-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.06785 + (((tickAnim - 7) / 1) * (-2.36429-(0.06785)));
            yy = 1.29741 + (((tickAnim - 7) / 1) * (2.59483-(1.29741)));
            zz = 0.3278 + (((tickAnim - 7) / 1) * (0.65559-(0.3278)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.36429 + (((tickAnim - 8) / 2) * (-44.79644-(-2.36429)));
            yy = 2.59483 + (((tickAnim - 8) / 2) * (3.89224-(2.59483)));
            zz = 0.65559 + (((tickAnim - 8) / 2) * (0.98339-(0.65559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbacktoe, rightbacktoe.rotateAngleX + (float) Math.toRadians(xx), rightbacktoe.rotateAngleY + (float) Math.toRadians(yy), rightbacktoe.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 10) / 30) * (0-(17.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 14) / 26) * (0-(-20)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -17.5 + (((tickAnim - 23) / 17) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (42.5-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 42.5 + (((tickAnim - 18) / 2) * (40-(42.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 40 + (((tickAnim - 20) / 4) * (42.5-(40)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 42.5 + (((tickAnim - 24) / 6) * (0-(42.5)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animShake(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 5) / 3) * (2.5034-(2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.15606-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-2.49513-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5034 + (((tickAnim - 8) / 1) * (2.5034-(2.5034)));
            yy = -0.15606 + (((tickAnim - 8) / 1) * (0.15606-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 8) / 1) * (2.49513-(-2.49513)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 2.5034 + (((tickAnim - 9) / 2) * (2.5034-(2.5034)));
            yy = 0.15606 + (((tickAnim - 9) / 2) * (-0.15606-(0.15606)));
            zz = 2.49513 + (((tickAnim - 9) / 2) * (-2.49513-(2.49513)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 2.5034 + (((tickAnim - 11) / 2) * (2.5034-(2.5034)));
            yy = -0.15606 + (((tickAnim - 11) / 2) * (0.15606-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 11) / 2) * (2.49513-(-2.49513)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 2.5034 + (((tickAnim - 13) / 1) * (2.5034-(2.5034)));
            yy = 0.15606 + (((tickAnim - 13) / 1) * (-0.15606-(0.15606)));
            zz = 2.49513 + (((tickAnim - 13) / 1) * (-2.49513-(2.49513)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 2.5034 + (((tickAnim - 14) / 2) * (2.5034-(2.5034)));
            yy = -0.15606 + (((tickAnim - 14) / 2) * (0.15606-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 14) / 2) * (2.49513-(-2.49513)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.5034 + (((tickAnim - 16) / 2) * (2.5034-(2.5034)));
            yy = 0.15606 + (((tickAnim - 16) / 2) * (-0.15606-(0.15606)));
            zz = 2.49513 + (((tickAnim - 16) / 2) * (-2.49513-(2.49513)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 2.5034 + (((tickAnim - 18) / 1) * (2.5034-(2.5034)));
            yy = -0.15606 + (((tickAnim - 18) / 1) * (0.15606-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 18) / 1) * (2.49513-(-2.49513)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 2.5034 + (((tickAnim - 19) / 2) * (2.5034-(2.5034)));
            yy = 0.15606 + (((tickAnim - 19) / 2) * (-0.15606-(0.15606)));
            zz = 2.49513 + (((tickAnim - 19) / 2) * (-2.49513-(2.49513)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 2.5034 + (((tickAnim - 21) / 2) * (2.5-(2.5034)));
            yy = -0.15606 + (((tickAnim - 21) / 2) * (0-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 21) / 2) * (0-(-2.49513)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 23) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 5) / 2) * (-4.99872-(-5)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.05888-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-2.49931-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -4.99872 + (((tickAnim - 7) / 1) * (-4.99872-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 7) / 1) * (0.05888-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 7) / 1) * (2.49931-(-2.49931)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.99872 + (((tickAnim - 8) / 2) * (-4.99872-(-4.99872)));
            yy = 0.05888 + (((tickAnim - 8) / 2) * (-0.05888-(0.05888)));
            zz = 2.49931 + (((tickAnim - 8) / 2) * (-2.49931-(2.49931)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -4.99872 + (((tickAnim - 10) / 2) * (-4.99872-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 10) / 2) * (0.05888-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 10) / 2) * (2.49931-(-2.49931)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -4.99872 + (((tickAnim - 12) / 1) * (-4.99872-(-4.99872)));
            yy = 0.05888 + (((tickAnim - 12) / 1) * (-0.05888-(0.05888)));
            zz = 2.49931 + (((tickAnim - 12) / 1) * (-2.49931-(2.49931)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.99872 + (((tickAnim - 13) / 2) * (-4.99872-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 13) / 2) * (0.05888-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 13) / 2) * (2.49931-(-2.49931)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -4.99872 + (((tickAnim - 15) / 2) * (-4.99872-(-4.99872)));
            yy = 0.05888 + (((tickAnim - 15) / 2) * (-0.05888-(0.05888)));
            zz = 2.49931 + (((tickAnim - 15) / 2) * (-2.49931-(2.49931)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -4.99872 + (((tickAnim - 17) / 1) * (-4.99872-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 17) / 1) * (0.05888-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 17) / 1) * (2.49931-(-2.49931)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.99872 + (((tickAnim - 18) / 2) * (-4.99872-(-4.99872)));
            yy = 0.05888 + (((tickAnim - 18) / 2) * (-0.05888-(0.05888)));
            zz = 2.49931 + (((tickAnim - 18) / 2) * (-2.49931-(2.49931)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -4.99872 + (((tickAnim - 20) / 2) * (-5-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 20) / 2) * (0-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 20) / 2) * (0-(-2.49931)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 22) / 8) * (0-(-5)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 5) / 2) * (2.34699-(-5)));
            yy = 0 + (((tickAnim - 5) / 2) * (1.61004-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-14.88645-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 2.34699 + (((tickAnim - 7) / 2) * (2.34699-(2.34699)));
            yy = 1.61004 + (((tickAnim - 7) / 2) * (-1.61004-(1.61004)));
            zz = -14.88645 + (((tickAnim - 7) / 2) * (14.88645-(-14.88645)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 2.34699 + (((tickAnim - 9) / 3) * (2.34699-(2.34699)));
            yy = -1.61004 + (((tickAnim - 9) / 3) * (1.61004-(-1.61004)));
            zz = 14.88645 + (((tickAnim - 9) / 3) * (-14.88645-(14.88645)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 2.34699 + (((tickAnim - 12) / 2) * (2.34699-(2.34699)));
            yy = 1.61004 + (((tickAnim - 12) / 2) * (-1.61004-(1.61004)));
            zz = -14.88645 + (((tickAnim - 12) / 2) * (14.88645-(-14.88645)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 2.34699 + (((tickAnim - 14) / 3) * (2.34699-(2.34699)));
            yy = -1.61004 + (((tickAnim - 14) / 3) * (1.61004-(-1.61004)));
            zz = 14.88645 + (((tickAnim - 14) / 3) * (-14.88645-(14.88645)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 2.34699 + (((tickAnim - 17) / 3) * (-5-(2.34699)));
            yy = 1.61004 + (((tickAnim - 17) / 3) * (0-(1.61004)));
            zz = -14.88645 + (((tickAnim - 17) / 3) * (0-(-14.88645)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 20) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 25) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animSniff(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10.31-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 10.31 + (((tickAnim - 4) / 9) * (20-(10.31)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 20 + (((tickAnim - 13) / 11) * (20-(20)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 20 + (((tickAnim - 24) / 12) * (17.90693-(20)));
            yy = 0 + (((tickAnim - 24) / 12) * (7.05378-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (-1.08789-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 17.90693 + (((tickAnim - 36) / 7) * (19.1018-(17.90693)));
            yy = 7.05378 + (((tickAnim - 36) / 7) * (4.84993-(7.05378)));
            zz = -1.08789 + (((tickAnim - 36) / 7) * (-2.53205-(-1.08789)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 19.1018 + (((tickAnim - 43) / 5) * (20.14247-(19.1018)));
            yy = 4.84993 + (((tickAnim - 43) / 5) * (4.71512-(4.84993)));
            zz = -2.53205 + (((tickAnim - 43) / 5) * (-2.30286-(-2.53205)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 20.14247 + (((tickAnim - 48) / 12) * (0-(20.14247)));
            yy = 4.71512 + (((tickAnim - 48) / 12) * (0-(4.71512)));
            zz = -2.30286 + (((tickAnim - 48) / 12) * (0-(-2.30286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 17) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 7.5 + (((tickAnim - 28) / 6) * (-2.02-(7.5)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -2.02 + (((tickAnim - 34) / 9) * (6.2-(-2.02)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 6.2 + (((tickAnim - 43) / 17) * (0-(6.2)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 5 + (((tickAnim - 20) / 4) * (-3.02-(5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -3.02 + (((tickAnim - 24) / 4) * (5-(-3.02)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 5 + (((tickAnim - 28) / 14) * (5-(5)));
            yy = 0 + (((tickAnim - 28) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 14) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 42) / 4) * (-10.52-(5)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -10.52 + (((tickAnim - 46) / 4) * (5-(-10.52)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 50) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 25) / 25) * (0-(-10)));
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
            yy = 0 + (((tickAnim - 0) / 25) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -2 + (((tickAnim - 25) / 25) * (0-(-2)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (-37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -37.5 + (((tickAnim - 25) / 25) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 25) / 25) * (0-(27.5)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 25) / 25) * (0-(17.5)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (-37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -37.5 + (((tickAnim - 25) / 25) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 25) / 25) * (0-(27.5)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 25) / 25) * (0-(17.5)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 25) / 25) * (0-(10)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 25) / 25) * (0-(15)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-25.28-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 30) {
            xx = -25.28 + (((tickAnim - 6) / 24) * (50-(-25.28)));
            yy = 0 + (((tickAnim - 6) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 24) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 50 + (((tickAnim - 30) / 20) * (0-(50)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (8.06-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 30) {
            xx = 8.06 + (((tickAnim - 6) / 24) * (-10-(8.06)));
            yy = 0 + (((tickAnim - 6) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 24) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -10 + (((tickAnim - 30) / 9) * (27.08-(-10)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 27.08 + (((tickAnim - 39) / 11) * (0-(27.08)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30.56-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 30.56 + (((tickAnim - 6) / 12) * (-5.42-(30.56)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -5.42 + (((tickAnim - 18) / 12) * (-10-(-5.42)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -10 + (((tickAnim - 30) / 9) * (-22.92-(-10)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -22.92 + (((tickAnim - 39) / 11) * (0-(-22.92)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 18) / 12) * (-30-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -30 + (((tickAnim - 30) / 9) * (18.75-(-30)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 39) / 11) * (0-(18.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 26) {
            xx = 25 + (((tickAnim - 10) / 16) * (19.11-(25)));
            yy = 0 + (((tickAnim - 10) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 16) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 19.11 + (((tickAnim - 26) / 7) * (20-(19.11)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 33) / 7) * (0-(20)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (2.5-(0)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 21) / 14) * (-7.5-(2.5)));
            yy = 0 + (((tickAnim - 21) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 14) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 35) / 5) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 5 + (((tickAnim - 13) / 6) * (5-(5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 19) / 4) * (17.5-(5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 17.5 + (((tickAnim - 23) / 13) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 13) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 36) / 4) * (0-(17.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (17.5-(0)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 17.5 + (((tickAnim - 17) / 5) * (11.25-(17.5)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 11.25 + (((tickAnim - 22) / 4) * (0-(11.25)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPampaphoneus entity = (EntityPrehistoricFloraPampaphoneus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 4) / 4) * (21.67-(20)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 21.67 + (((tickAnim - 8) / 7) * (0-(21.67)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 5) / 3) * (-4.5-(7.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -4.5 + (((tickAnim - 8) / 3) * (-20.31-(-4.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -20.31 + (((tickAnim - 11) / 2) * (-22.19-(-20.31)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -22.19 + (((tickAnim - 13) / 2) * (0-(-22.19)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-13.19577-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (3.1622-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-24.81197-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -13.19577 + (((tickAnim - 7) / 1) * (-10.46385-(-13.19577)));
            yy = 3.1622 + (((tickAnim - 7) / 1) * (2.10813-(3.1622)));
            zz = -24.81197 + (((tickAnim - 7) / 1) * (-16.54131-(-24.81197)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -10.46385 + (((tickAnim - 8) / 4) * (-36.5399-(-10.46385)));
            yy = 2.10813 + (((tickAnim - 8) / 4) * (1.31758-(2.10813)));
            zz = -16.54131 + (((tickAnim - 8) / 4) * (-10.33832-(-16.54131)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -36.5399 + (((tickAnim - 12) / 3) * (0-(-36.5399)));
            yy = 1.31758 + (((tickAnim - 12) / 3) * (0-(1.31758)));
            zz = -10.33832 + (((tickAnim - 12) / 3) * (0-(-10.33832)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 8) / 7) * (0-(32.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPampaphoneus e = (EntityPrehistoricFloraPampaphoneus) entity;
        animator.update(entity);

    }
}
