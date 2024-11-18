package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPrestosuchus;
import net.lepidodendron.entity.EntityPrehistoricFloraPrestosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPrestosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer leftbacktoe;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer rightbacktoe;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r16;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r42;

    private ModelAnimator animator;

    public ModelPrestosuchus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 2.9227F, 10.3471F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 2.1638F, -0.9744F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 0, -4.0F, -8.25F, -4.0F, 7, 1, 14, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 1.6638F, -0.9744F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, -5.0F, -7.25F, -4.0F, 9, 14, 14, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(4.5F, 0.8812F, 4.3909F);
        this.hips.addChild(leftleg);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 4.196F, -0.988F);
        this.leftleg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 7, -1.0F, -6.75F, -5.0F, 4, 14, 8, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 8.9372F, -7.5221F);
        this.leftleg.addChild(leftleg2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 4.5088F, 2.0341F);
        this.leftleg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -5.0F, -1.5F, 3, 11, 5, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 8.5088F, 4.5341F);
        this.leftleg2.addChild(leftfoot);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 44, 91, -3.0F, 0.75F, -3.0F, 6, 2, 6, 0.0F, false));

        this.leftbacktoe = new AdvancedModelRenderer(this);
        this.leftbacktoe.setRotationPoint(0.0F, 1.25F, -3.0F);
        this.leftfoot.addChild(leftbacktoe);
        this.leftbacktoe.cubeList.add(new ModelBox(leftbacktoe, 23, 60, -3.0F, -0.5F, -4.0F, 6, 2, 4, 0.001F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-4.5F, 0.8812F, 4.3909F);
        this.hips.addChild(rightleg);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 4.196F, -0.988F);
        this.rightleg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 7, -3.0F, -6.75F, -5.0F, 4, 14, 8, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 8.9372F, -7.5221F);
        this.rightleg.addChild(rightleg2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 4.5088F, 2.0341F);
        this.rightleg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -2.5F, -5.0F, -1.5F, 3, 11, 5, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 8.5088F, 4.5341F);
        this.rightleg2.addChild(rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 44, 91, -3.0F, 0.75F, -3.0F, 6, 2, 6, 0.0F, true));

        this.rightbacktoe = new AdvancedModelRenderer(this);
        this.rightbacktoe.setRotationPoint(0.0F, 1.25F, -3.0F);
        this.rightfoot.addChild(rightbacktoe);
        this.rightbacktoe.cubeList.add(new ModelBox(rightbacktoe, 23, 60, -3.0F, -0.5F, -4.0F, 6, 2, 4, 0.001F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.5862F, -3.4744F);
        this.hips.addChild(body);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 8.5F, -19.25F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 16, -5.0F, -8.75F, 3.75F, 8, 1, 16, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 8.0F, -19.25F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -6.0F, -7.75F, 3.75F, 10, 16, 16, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.9346F, -14.3514F);
        this.body.addChild(chest);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 6.5654F, -4.4986F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 41, -4.0F, -8.0F, -2.5F, 5, 1, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 6.0654F, -4.4986F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 33, -5.0F, -7.0F, -2.5F, 8, 14, 8, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(3.5177F, 11.1357F, -4.3388F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.1745F, 0.0F, -0.1745F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.9249F, 1.693F);
        this.leftarm.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 87, -1.0F, -2.5F, -3.0F, 5, 8, 5, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.5149F, 4.1169F, 3.9654F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.2618F, 0.0F, 0.1745F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 3.5877F, -1.7322F);
        this.leftarm2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 32, -0.5F, -2.5F, -0.25F, 4, 9, 3, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.5F, 9.9731F, 0.5076F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0873F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -13.05F, -1.75F);
        this.lefthand.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 95, 50, -1.0F, 12.05F, -2.75F, 5, 2, 5, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-3.5177F, 11.1357F, -4.3388F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.1745F, 0.0F, 0.1745F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.9249F, 1.693F);
        this.rightarm.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 87, -4.0F, -2.5F, -3.0F, 5, 8, 5, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.5149F, 4.1169F, 3.9654F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.2618F, 0.0F, -0.1745F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 3.5877F, -1.7322F);
        this.rightarm2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 32, -3.5F, -2.5F, -0.25F, 4, 9, 3, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.5F, 9.9731F, 0.5076F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0873F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5F, -13.05F, -1.75F);
        this.righthand.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 95, 50, -4.0F, 12.05F, -2.75F, 5, 2, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.913F, -6.6948F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 80, -3.0F, -2.4981F, -3.9564F, 6, 8, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 94, 95, -2.0F, -2.9981F, -3.9564F, 4, 1, 6, 0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5F, 7.5019F, 1.7936F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 33, -4.0F, -1.975F, -6.1F, 5, 2, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.3841F, -2.9265F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 81, 80, -2.5F, -2.0F, -6.0F, 5, 7, 6, -0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 80, 93, -2.0F, 4.8F, -6.025F, 4, 2, 6, -0.001F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 94, 11, -2.0F, -2.5F, -5.75F, 4, 1, 6, -0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.3898F, -5.6496F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 57, 80, -2.5F, 0.3F, -6.5F, 5, 4, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 98, -1.5F, 1.3F, -11.5F, 3, 3, 5, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 3, 0.8F, 3.3F, -13.5F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 3, -0.8F, 3.3F, -13.5F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.4399F, -0.0074F, -7.1262F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0959F, -0.562F, 0.037F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 10, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.4399F, -0.0074F, -7.1262F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0959F, 0.562F, -0.037F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 10, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.25F, 0.1162F, -3.0718F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0299F, -0.1259F, 0.0221F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 0, -0.7F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.25F, 0.1162F, -3.0718F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0299F, 0.1259F, -0.0221F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 0, -0.3F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.6433F, -6.0168F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 92, 31, -1.5F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0093F, -10.974F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 98, 88, -1.5F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 1.3946F, -13.635F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.48F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 5, -1.5F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 4.3F, -11.5F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3491F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 41, -0.5F, -2.0F, -3.0F, 2, 2, 3, 0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 4.55F, -9.0F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 1, -0.925F, -1.35F, 1.375F, 0, 2, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 1, 0.925F, -1.35F, 1.375F, 0, 2, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 30, -0.925F, -1.15F, -2.375F, 0, 2, 3, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 30, 0.925F, -1.15F, -2.375F, 0, 2, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 4.3F, -6.5F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 64, 0, -2.5F, -1.05F, 0.0F, 5, 1, 6, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 5.225F, -1.5F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 88, 69, -2.5F, -0.925F, -5.0F, 4, 3, 7, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 96, 57, -2.0F, -3.775F, -4.0F, 3, 3, 5, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 97, 79, -2.0F, -0.925F, -10.0F, 3, 2, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 32, 0.35F, -1.675F, -8.0F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 32, -1.35F, -1.675F, -8.0F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 2, 2, 0.4F, -1.425F, -10.0F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 2, 2, -1.4F, -1.425F, -10.0F, 0, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -1.4245F, -11.7507F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5672F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 2, 1, -0.9F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 2, 1, 0.9F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 2.6137F, -5.3435F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 94, -2.5F, -2.925F, 0.15F, 3, 3, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.4602F, -7.339F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3098F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 86, 0, -1.5F, -1.55F, -6.15F, 2, 2, 9, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 1.1544F, -5.1711F);
        this.head.addChild(eye);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.25F, -0.1044F, 0.6711F);
        this.eye.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0436F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 44, 10, -0.5F, -0.425F, -1.675F, 1, 1, 2, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 44, 10, 4.0F, -0.425F, -1.675F, 1, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.4425F, 6.6911F);
        this.hips.addChild(tail);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 2.8652F, 3.9433F);
        this.tail.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 77, 59, -3.0F, -6.0F, -2.5F, 5, 1, 9, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 2.3652F, 3.9433F);
        this.tail.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 60, -4.0F, -5.0F, -2.5F, 7, 9, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.7633F, 9.9567F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 1.6019F, -6.0134F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 35, 55, -3.0F, -4.5F, 5.5F, 6, 8, 11, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 2.1019F, -6.0134F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 73, 29, -2.0F, -5.5F, 5.5F, 4, 1, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 2.0457F, 9.9572F);
        this.tail2.addChild(tail3);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 2.5F, 5.0F);
        this.tail3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1745F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 21, 74, -1.5F, -4.0F, -5.5F, 3, 1, 11, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 2.0F, 5.0F);
        this.tail3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1745F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 58, 63, -1.5F, -3.0F, -5.5F, 4, 6, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.8325F, 9.9671F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.0F, 2.0853F, 5.9526F);
        this.tail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 38, 75, -2.0F, -3.5F, -6.5F, 2, 1, 11, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 1.5853F, 5.9526F);
        this.tail4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0873F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 67, 44, -2.0F, -2.5F, -6.5F, 3, 4, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.9908F, 9.9677F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0436F, 0.0F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.5F, 1.0944F, -4.015F);
        this.tail5.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0873F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 58, 55, -2.0F, -3.0F, 3.5F, 1, 1, 7, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, 0.5944F, -4.015F);
        this.tail5.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0873F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 60, 91, -2.0F, -2.0F, 3.5F, 2, 3, 8, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 1.0556F, 6.8888F);
        this.tail5.addChild(tail6);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.5F, 0.0119F, 3.1082F);
        this.tail6.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.2182F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 92, 21, -2.0F, -0.5F, -3.5F, 1, 2, 8, 0.0F, false));
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
        this.hips.offsetY = -0.30F;
        this.hips.offsetX = 1.2F;
        this.hips.rotateAngleY = (float)Math.toRadians(130);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 2.0F;
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

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }



    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraPrestosuchus Prestosuchus = (EntityPrehistoricFloraPrestosuchus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        Prestosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        if (Prestosuchus.getAnimation() == Prestosuchus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }

        if (!Prestosuchus.isReallyInWater()) {

            if (f3 == 0.0F || !Prestosuchus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
            }

            if (Prestosuchus.getIsFast()) { //Running


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
        EntityPrehistoricFloraPrestosuchus ee = (EntityPrehistoricFloraPrestosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

            if (!ee.getIsMoving()) {
                return;
            }

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
            else { //Walking
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                return;
            }
            //moving in water
            return;
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrestosuchus entity = (EntityPrehistoricFloraPrestosuchus) entitylivingbaseIn;
        int animCycle = 18;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5.75 + (((tickAnim - 9) / 9) * (0-(5.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 9.25 + (((tickAnim - 9) / 9) * (0-(9.25)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (25.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -14.25 + (((tickAnim - 9) / 9) * (0-(-14.25)));
            yy = 25.25 + (((tickAnim - 9) / 9) * (0-(25.25)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-33.67119-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-12.04572-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (6.50209-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -33.67119 + (((tickAnim - 9) / 9) * (0-(-33.67119)));
            yy = -12.04572 + (((tickAnim - 9) / 9) * (0-(-12.04572)));
            zz = 6.50209 + (((tickAnim - 9) / 9) * (0-(6.50209)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (27.73412-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.08179-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-9.93228-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 27.73412 + (((tickAnim - 9) / 9) * (0-(27.73412)));
            yy = 1.08179 + (((tickAnim - 9) / 9) * (0-(1.08179)));
            zz = -9.93228 + (((tickAnim - 9) / 9) * (0-(-9.93228)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-25.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -14.25 + (((tickAnim - 9) / 9) * (0-(-14.25)));
            yy = -25.25 + (((tickAnim - 9) / 9) * (0-(-25.25)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-32.90046-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (5.42943-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.4108-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -32.90046 + (((tickAnim - 9) / 9) * (0-(-32.90046)));
            yy = 5.42943 + (((tickAnim - 9) / 9) * (0-(5.42943)));
            zz = -0.4108 + (((tickAnim - 9) / 9) * (0-(-0.4108)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (28.95026-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.77859-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (5.76292-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 28.95026 + (((tickAnim - 9) / 9) * (0-(28.95026)));
            yy = -0.77859 + (((tickAnim - 9) / 9) * (0-(-0.77859)));
            zz = 5.76292 + (((tickAnim - 9) / 9) * (0-(5.76292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 11.25 + (((tickAnim - 9) / 9) * (0-(11.25)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 9) / 3) * (11.25-(16)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 11.25 + (((tickAnim - 12) / 6) * (0-(11.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.325-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0.175 + (((tickAnim - 9) / 9) * (0-(0.175)));
            zz = -0.325 + (((tickAnim - 9) / 9) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 8.5 + (((tickAnim - 9) / 3) * (24.25-(8.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 24.25 + (((tickAnim - 12) / 6) * (0-(24.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 21 + (((tickAnim - 9) / 3) * (0-(21)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrestosuchus entity = (EntityPrehistoricFloraPrestosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 3.75 + (((tickAnim - 4) / 4) * (1.75-(3.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1.75 + (((tickAnim - 8) / 5) * (0-(1.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 3.5 + (((tickAnim - 4) / 4) * (-6.99786-(3.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (-0.09812-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-2.49808-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6.99786 + (((tickAnim - 8) / 5) * (0-(-6.99786)));
            yy = -0.09812 + (((tickAnim - 8) / 5) * (0-(-0.09812)));
            zz = -2.49808 + (((tickAnim - 8) / 5) * (0-(-2.49808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -2 + (((tickAnim - 4) / 4) * (-9.2708-(-2)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.47863-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-4.9771-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -9.2708 + (((tickAnim - 8) / 5) * (0-(-9.2708)));
            yy = 0.47863 + (((tickAnim - 8) / 5) * (0-(0.47863)));
            zz = -4.9771 + (((tickAnim - 8) / 5) * (0-(-4.9771)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 4) / 4) * (32.75-(5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.75 + (((tickAnim - 8) / 2) * (0-(32.75)));
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
        EntityPrehistoricFloraPrestosuchus entity = (EntityPrehistoricFloraPrestosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-34-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -34 + (((tickAnim - 13) / 7) * (8.25-(-34)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 20) / 10) * (-34-(8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -34 + (((tickAnim - 30) / 8) * (8.25-(-34)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 38) / 12) * (0-(8.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-44.37-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -44.37 + (((tickAnim - 6) / 7) * (7.25-(-44.37)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.25 + (((tickAnim - 13) / 7) * (29.5-(7.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 29.5 + (((tickAnim - 20) / 5) * (-44.37-(29.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -44.37 + (((tickAnim - 25) / 5) * (7.25-(-44.37)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 7.25 + (((tickAnim - 30) / 8) * (29.5-(7.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 29.5 + (((tickAnim - 38) / 6) * (-48.98-(29.5)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -48.98 + (((tickAnim - 44) / 6) * (0-(-48.98)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (91.37-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 91.37 + (((tickAnim - 6) / 7) * (26.5-(91.37)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 26.5 + (((tickAnim - 13) / 3) * (-2.36-(26.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.36 + (((tickAnim - 16) / 4) * (105-(-2.36)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 105 + (((tickAnim - 20) / 5) * (89.75-(105)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 89.75 + (((tickAnim - 25) / 5) * (26.5-(89.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 26.5 + (((tickAnim - 30) / 3) * (-2.36-(26.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.36 + (((tickAnim - 33) / 5) * (105-(-2.36)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 105 + (((tickAnim - 38) / 6) * (88.75-(105)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 88.75 + (((tickAnim - 44) / 6) * (0-(88.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrestosuchus entity = (EntityPrehistoricFloraPrestosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -8.25 + (((tickAnim - 18) / 17) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 35) / 15) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-6.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (3.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = -6.525 + (((tickAnim - 18) / 17) * (-6.525-(-6.525)));
            zz = 3.25 + (((tickAnim - 18) / 17) * (3.25-(3.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -6.525 + (((tickAnim - 35) / 15) * (0-(-6.525)));
            zz = 3.25 + (((tickAnim - 35) / 15) * (0-(3.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -24.75 + (((tickAnim - 18) / 17) * (-24.75-(-24.75)));
            yy = -11.75 + (((tickAnim - 18) / 17) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 35) / 15) * (0-(-24.75)));
            yy = -11.75 + (((tickAnim - 35) / 15) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34.60266-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.64886-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.4019-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 34.60266 + (((tickAnim - 18) / 17) * (34.60266-(34.60266)));
            yy = -0.64886 + (((tickAnim - 18) / 17) * (-0.64886-(-0.64886)));
            zz = -1.4019 + (((tickAnim - 18) / 17) * (-1.4019-(-1.4019)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34.60266 + (((tickAnim - 35) / 15) * (0-(34.60266)));
            yy = -0.64886 + (((tickAnim - 35) / 15) * (0-(-0.64886)));
            zz = -1.4019 + (((tickAnim - 35) / 15) * (0-(-1.4019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0.75 + (((tickAnim - 18) / 17) * (0.75-(0.75)));
            zz = -0.35 + (((tickAnim - 18) / 17) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.75 + (((tickAnim - 35) / 15) * (0-(0.75)));
            zz = -0.35 + (((tickAnim - 35) / 15) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (11.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -24.75 + (((tickAnim - 18) / 17) * (-24.75-(-24.75)));
            yy = 11.75 + (((tickAnim - 18) / 17) * (11.75-(11.75)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 35) / 15) * (0-(-24.75)));
            yy = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34.60266-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.64886-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.4019-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 34.60266 + (((tickAnim - 18) / 17) * (34.60266-(34.60266)));
            yy = -0.64886 + (((tickAnim - 18) / 17) * (-0.64886-(-0.64886)));
            zz = -1.4019 + (((tickAnim - 18) / 17) * (-1.4019-(-1.4019)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34.60266 + (((tickAnim - 35) / 15) * (0-(34.60266)));
            yy = -0.64886 + (((tickAnim - 35) / 15) * (0-(-0.64886)));
            zz = -1.4019 + (((tickAnim - 35) / 15) * (0-(-1.4019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0.75 + (((tickAnim - 18) / 17) * (0.75-(0.75)));
            zz = -0.35 + (((tickAnim - 18) / 17) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.75 + (((tickAnim - 35) / 15) * (0-(0.75)));
            zz = -0.35 + (((tickAnim - 35) / 15) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(0), rightfoot.rotateAngleY + (float) Math.toRadians(0), rightfoot.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -3.5 + (((tickAnim - 18) / 17) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 35) / 15) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 3.5 + (((tickAnim - 18) / 17) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -27.75 + (((tickAnim - 18) / 17) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.75 + (((tickAnim - 35) / 15) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 35.5 + (((tickAnim - 18) / 17) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 35) / 15) * (0-(35.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-27-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -27 + (((tickAnim - 18) / 17) * (-27-(-27)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27 + (((tickAnim - 35) / 15) * (0-(-27)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 34.5 + (((tickAnim - 18) / 17) * (34.5-(34.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 35) / 15) * (0-(34.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 9.5 + (((tickAnim - 18) / 17) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 35) / 15) * (0-(9.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -10 + (((tickAnim - 18) / 17) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
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
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 2.75 + (((tickAnim - 18) / 17) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 35) / 15) * (0-(2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 18) / 17) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 10.75 + (((tickAnim - 35) / 7) * (-3.28-(10.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -3.28 + (((tickAnim - 42) / 8) * (0-(-3.28)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.82-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -3.82 + (((tickAnim - 8) / 10) * (16.75-(-3.82)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 16.75 + (((tickAnim - 18) / 17) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 16.75 + (((tickAnim - 35) / 7) * (8.17-(16.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 8.17 + (((tickAnim - 42) / 3) * (-1.37-(8.17)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -1.37 + (((tickAnim - 45) / 5) * (0-(-1.37)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 18) / 17) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 47) {
            xx = 6.75 + (((tickAnim - 35) / 12) * (-2.81-(6.75)));
            yy = 0 + (((tickAnim - 35) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 12) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -2.81 + (((tickAnim - 47) / 3) * (0-(-2.81)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 8 + (((tickAnim - 18) / 17) * (8-(8)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 8 + (((tickAnim - 35) / 7) * (24.94-(8)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 24.94 + (((tickAnim - 42) / 5) * (-1.42-(24.94)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -1.42 + (((tickAnim - 47) / 3) * (0-(-1.42)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrestosuchus entity = (EntityPrehistoricFloraPrestosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 1.75 + (((tickAnim - 13) / 6) * (3.17-(1.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 3.17 + (((tickAnim - 19) / 4) * (1.25-(3.17)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 23) / 7) * (0-(1.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 1.75 + (((tickAnim - 13) / 6) * (-2.17-(1.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -2.17 + (((tickAnim - 19) / 4) * (0.75-(-2.17)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.75 + (((tickAnim - 23) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-9.25004-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.01853-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.24931-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -9.25004 + (((tickAnim - 13) / 6) * (-0.33337-(-9.25004)));
            yy = -0.01853 + (((tickAnim - 13) / 6) * (-0.01853-(-0.01853)));
            zz = 0.24931 + (((tickAnim - 13) / 6) * (0.24931-(0.24931)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -0.33337 + (((tickAnim - 19) / 4) * (-8.25004-(-0.33337)));
            yy = -0.01853 + (((tickAnim - 19) / 4) * (-0.01853-(-0.01853)));
            zz = 0.24931 + (((tickAnim - 19) / 4) * (0.24931-(0.24931)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -8.25004 + (((tickAnim - 23) / 7) * (0-(-8.25004)));
            yy = -0.01853 + (((tickAnim - 23) / 7) * (0-(-0.01853)));
            zz = 0.24931 + (((tickAnim - 23) / 7) * (0-(0.24931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 13) / 2) * (25-(25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 25 + (((tickAnim - 15) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (28.25-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 28.25 + (((tickAnim - 23) / 2) * (28.25-(28.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 28.25 + (((tickAnim - 25) / 5) * (0-(28.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPrestosuchus entity = (EntityPrehistoricFloraPrestosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 31.28914 + (((tickAnim - 0) / 14) * (-10.86983-(31.28914)));
            yy = -3.20939 + (((tickAnim - 0) / 14) * (-7.5346-(-3.20939)));
            zz = -1.39708 + (((tickAnim - 0) / 14) * (-1.8197-(-1.39708)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -10.86983 + (((tickAnim - 14) / 16) * (31.28914-(-10.86983)));
            yy = -7.5346 + (((tickAnim - 14) / 16) * (-3.20939-(-7.5346)));
            zz = -1.8197 + (((tickAnim - 14) / 16) * (-1.39708-(-1.8197)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12 + (((tickAnim - 0) / 4) * (8.76-(12)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 8.76 + (((tickAnim - 4) / 8) * (-16.69-(8.76)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -16.69 + (((tickAnim - 12) / 2) * (-15.75-(-16.69)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -15.75 + (((tickAnim - 14) / 16) * (12-(-15.75)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.325-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.325 + (((tickAnim - 4) / 4) * (2.055-(1.325)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.595-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 2.055 + (((tickAnim - 8) / 4) * (1.33-(2.055)));
            zz = 0.595 + (((tickAnim - 8) / 4) * (0.3-(0.595)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.33 + (((tickAnim - 12) / 2) * (-0.2-(1.33)));
            zz = 0.3 + (((tickAnim - 12) / 2) * (0-(0.3)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = -0.2 + (((tickAnim - 14) / 16) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 28.75 + (((tickAnim - 0) / 4) * (13.30995-(28.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.65663-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.11527-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 13.30995 + (((tickAnim - 4) / 8) * (38.93084-(13.30995)));
            yy = -0.65663 + (((tickAnim - 4) / 8) * (-1.21066-(-0.65663)));
            zz = 1.11527 + (((tickAnim - 4) / 8) * (2.05628-(1.11527)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 38.93084 + (((tickAnim - 12) / 2) * (25.22114-(38.93084)));
            yy = -1.21066 + (((tickAnim - 12) / 2) * (-1.39533-(-1.21066)));
            zz = 2.05628 + (((tickAnim - 12) / 2) * (2.36995-(2.05628)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 25.22114 + (((tickAnim - 14) / 8) * (7.28017-(25.22114)));
            yy = -1.39533 + (((tickAnim - 14) / 8) * (-1.37853-(-1.39533)));
            zz = 2.36995 + (((tickAnim - 14) / 8) * (2.34141-(2.36995)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 7.28017 + (((tickAnim - 22) / 8) * (28.75-(7.28017)));
            yy = -1.37853 + (((tickAnim - 22) / 8) * (0-(-1.37853)));
            zz = 2.34141 + (((tickAnim - 22) / 8) * (0-(2.34141)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.6-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.45 + (((tickAnim - 4) / 4) * (1.77-(1.45)));
            zz = -0.6 + (((tickAnim - 4) / 4) * (-0.35-(-0.6)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.77 + (((tickAnim - 8) / 4) * (1.125-(1.77)));
            zz = -0.35 + (((tickAnim - 8) / 4) * (-0.15-(-0.35)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 12) / 2) * (-0.425-(1.125)));
            zz = -0.15 + (((tickAnim - 12) / 2) * (0-(-0.15)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 14) / 8) * (0.7-(-0.425)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.7 + (((tickAnim - 22) / 4) * (0.97-(0.7)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.97 + (((tickAnim - 26) / 4) * (0-(0.97)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
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
            xx = -20.75 + (((tickAnim - 0) / 4) * (5.94-(-20.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 5.94 + (((tickAnim - 4) / 7) * (3.7-(5.94)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 3.7 + (((tickAnim - 11) / 2) * (-9.02-(3.7)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -9.02 + (((tickAnim - 13) / 1) * (0-(-9.02)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -9.25 + (((tickAnim - 22) / 4) * (-44.37-(-9.25)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -44.37 + (((tickAnim - 26) / 4) * (-20.75-(-44.37)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0.35 + (((tickAnim - 0) / 4) * (0-(0.35)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0.25 + (((tickAnim - 13) / 1) * (0-(0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = -0.125 + (((tickAnim - 22) / 4) * (-0.94-(-0.125)));
            zz = 0.3 + (((tickAnim - 22) / 4) * (0.84-(0.3)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -0.94 + (((tickAnim - 26) / 4) * (0-(-0.94)));
            zz = 0.84 + (((tickAnim - 26) / 4) * (0.35-(0.84)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftbacktoe.rotationPointX = this.leftbacktoe.rotationPointX + (float)(xx);
        this.leftbacktoe.rotationPointY = this.leftbacktoe.rotationPointY - (float)(yy);
        this.leftbacktoe.rotationPointZ = this.leftbacktoe.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -24.75 + (((tickAnim - 0) / 13) * (28.7872-(-24.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.8202-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.2466-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 28.7872 + (((tickAnim - 13) / 14) * (-38.75-(28.7872)));
            yy = 0.8202 + (((tickAnim - 13) / 14) * (0-(0.8202)));
            zz = 3.2466 + (((tickAnim - 13) / 14) * (0-(3.2466)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -38.75 + (((tickAnim - 27) / 3) * (-24.75-(-38.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 0) / 13) * (-3.93428-(4)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.0539-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (6.6745-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -3.93428 + (((tickAnim - 13) / 7) * (-41.66254-(-3.93428)));
            yy = -4.0539 + (((tickAnim - 13) / 7) * (3.06903-(-4.0539)));
            zz = 6.6745 + (((tickAnim - 13) / 7) * (-4.3853-(6.6745)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -41.66254 + (((tickAnim - 20) / 7) * (6.75-(-41.66254)));
            yy = 3.06903 + (((tickAnim - 20) / 7) * (0-(3.06903)));
            zz = -4.3853 + (((tickAnim - 20) / 7) * (0-(-4.3853)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 6.75 + (((tickAnim - 27) / 3) * (4-(6.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 27) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 21 + (((tickAnim - 0) / 7) * (-0.04714-(21)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.5199-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-5.97751-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -0.04714 + (((tickAnim - 7) / 6) * (100.36-(-0.04714)));
            yy = 0.5199 + (((tickAnim - 7) / 6) * (0-(0.5199)));
            zz = -5.97751 + (((tickAnim - 7) / 6) * (0-(-5.97751)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 100.36 + (((tickAnim - 13) / 7) * (109.68-(100.36)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 109.68 + (((tickAnim - 20) / 7) * (32.5-(109.68)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 32.5 + (((tickAnim - 27) / 3) * (21-(32.5)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.95 + (((tickAnim - 0) / 7) * (-0.25-(0.95)));
            zz = 0.2 + (((tickAnim - 0) / 7) * (0-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = -0.25 + (((tickAnim - 7) / 13) * (1.5-(-0.25)));
            zz = 0 + (((tickAnim - 7) / 13) * (-0.675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 1.5 + (((tickAnim - 20) / 7) * (0-(1.5)));
            zz = -0.675 + (((tickAnim - 20) / 7) * (0.2-(-0.675)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0.95-(0)));
            zz = 0.2 + (((tickAnim - 27) / 3) * (0.2-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 13.65775 + (((tickAnim - 0) / 9) * (-38.75-(13.65775)));
            yy = -1.21212 + (((tickAnim - 0) / 9) * (0-(-1.21212)));
            zz = -4.79781 + (((tickAnim - 0) / 9) * (0-(-4.79781)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -38.75 + (((tickAnim - 9) / 16) * (28.7872-(-38.75)));
            yy = 0 + (((tickAnim - 9) / 16) * (-0.82023-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (-3.24664-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 28.7872 + (((tickAnim - 25) / 5) * (13.65775-(28.7872)));
            yy = -0.82023 + (((tickAnim - 25) / 5) * (-1.21212-(-0.82023)));
            zz = -3.24664 + (((tickAnim - 25) / 5) * (-4.79781-(-3.24664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -36 + (((tickAnim - 0) / 4) * (-40.9-(-36)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -40.9 + (((tickAnim - 4) / 5) * (6.75-(-40.9)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 6.75 + (((tickAnim - 9) / 16) * (-3.93428-(6.75)));
            yy = 0 + (((tickAnim - 9) / 16) * (4.0539-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (-6.67449-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.93428 + (((tickAnim - 25) / 5) * (-36-(-3.93428)));
            yy = 4.0539 + (((tickAnim - 25) / 5) * (0-(4.0539)));
            zz = -6.67449 + (((tickAnim - 25) / 5) * (0-(-6.67449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.15 + (((tickAnim - 0) / 9) * (0-(0.15)));
            yy = -0.125 + (((tickAnim - 0) / 9) * (0-(-0.125)));
            zz = 0.55 + (((tickAnim - 0) / 9) * (0-(0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 9) / 21) * (0.15-(0)));
            yy = 0 + (((tickAnim - 9) / 21) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 9) / 21) * (0.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 119.5 + (((tickAnim - 0) / 4) * (116.48-(119.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 116.48 + (((tickAnim - 4) / 5) * (32.5-(116.48)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 32.5 + (((tickAnim - 9) / 9) * (7.13-(32.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 7.13 + (((tickAnim - 18) / 7) * (100.36-(7.13)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 100.36 + (((tickAnim - 25) / 5) * (119.5-(100.36)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 1.325 + (((tickAnim - 0) / 9) * (0-(1.325)));
            zz = -0.85 + (((tickAnim - 0) / 9) * (0-(-0.85)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (1.325-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (-0.85-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -7.11983 + (((tickAnim - 0) / 17) * (31.28914-(-7.11983)));
            yy = 7.53461 + (((tickAnim - 0) / 17) * (3.2094-(7.53461)));
            zz = -1.8197 + (((tickAnim - 0) / 17) * (1.3971-(-1.8197)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 31.28914 + (((tickAnim - 17) / 13) * (-7.11983-(31.28914)));
            yy = 3.2094 + (((tickAnim - 17) / 13) * (7.53461-(3.2094)));
            zz = 1.3971 + (((tickAnim - 17) / 13) * (-1.8197-(1.3971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -21.75 + (((tickAnim - 0) / 17) * (12-(-21.75)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 12 + (((tickAnim - 17) / 4) * (12.41-(12)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 12.41 + (((tickAnim - 21) / 6) * (-25.85-(12.41)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -25.85 + (((tickAnim - 27) / 3) * (-21.75-(-25.85)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 17) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (1.545-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 1.545 + (((tickAnim - 21) / 6) * (1.35-(1.545)));
            zz = 0.175 + (((tickAnim - 21) / 6) * (0.4-(0.175)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 1.35 + (((tickAnim - 27) / 3) * (-0.25-(1.35)));
            zz = 0.4 + (((tickAnim - 27) / 3) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 28.97114 + (((tickAnim - 0) / 7) * (2.48434-(28.97114)));
            yy = -1.39533 + (((tickAnim - 0) / 7) * (-0.12968-(-1.39533)));
            zz = 2.36995 + (((tickAnim - 0) / 7) * (0.22026-(2.36995)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 2.48434 + (((tickAnim - 7) / 10) * (28.75-(2.48434)));
            yy = -0.12968 + (((tickAnim - 7) / 10) * (0-(-0.12968)));
            zz = 0.22026 + (((tickAnim - 7) / 10) * (0-(0.22026)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 28.75 + (((tickAnim - 17) / 4) * (18.38161-(28.75)));
            yy = 0 + (((tickAnim - 17) / 4) * (-0.43604-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0.74061-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 18.38161 + (((tickAnim - 21) / 6) * (31.25676-(18.38161)));
            yy = -0.43604 + (((tickAnim - 21) / 6) * (-1.0465-(-0.43604)));
            zz = 0.74061 + (((tickAnim - 21) / 6) * (1.77746-(0.74061)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 31.25676 + (((tickAnim - 27) / 3) * (28.97114-(31.25676)));
            yy = -1.0465 + (((tickAnim - 27) / 3) * (-1.39533-(-1.0465)));
            zz = 1.77746 + (((tickAnim - 27) / 3) * (2.36995-(1.77746)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 7) * (0.725-(0.25)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 0.725 + (((tickAnim - 7) / 10) * (0-(0.725)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0.905-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0.905 + (((tickAnim - 21) / 2) * (1.58-(0.905)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.58 + (((tickAnim - 23) / 4) * (1.54-(1.58)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 1.54 + (((tickAnim - 27) / 3) * (0.25-(1.54)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-0.15);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*-0.15);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-44.35-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -44.35 + (((tickAnim - 13) / 4) * (-20.75-(-44.35)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -20.75 + (((tickAnim - 17) / 4) * (15.75-(-20.75)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 15.75 + (((tickAnim - 21) / 6) * (3.5-(15.75)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 3.5 + (((tickAnim - 27) / 1) * (-9.02-(3.5)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -9.02 + (((tickAnim - 28) / 2) * (0-(-9.02)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbacktoe, rightbacktoe.rotateAngleX + (float) Math.toRadians(xx), rightbacktoe.rotateAngleY + (float) Math.toRadians(yy), rightbacktoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0.35-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0.35 + (((tickAnim - 17) / 4) * (1.115-(0.35)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 1.115 + (((tickAnim - 21) / 7) * (0.25-(1.115)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0.25 + (((tickAnim - 28) / 2) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightbacktoe.rotationPointX = this.rightbacktoe.rotationPointX + (float)(xx);
        this.rightbacktoe.rotationPointY = this.rightbacktoe.rotationPointY - (float)(yy);
        this.rightbacktoe.rotationPointZ = this.rightbacktoe.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*0.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*-1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*1.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-1.5), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*0.3), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-40))*0.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-60))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*1.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*0.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*0.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-140))*0.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-320))*10), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*1));

    }
    
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPrestosuchus entity = (EntityPrehistoricFloraPrestosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+50))*8.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375-30))*2.3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.275+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375-60))*2.7);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+40))*1.4);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10.75 + (((tickAnim - 0) / 4) * (47.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*15-(10.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 47.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*15 + (((tickAnim - 4) / 5) * (-1.24713-(47.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*15)));
            yy = 0 + (((tickAnim - 4) / 5) * (0.01891-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (-0.0911-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -1.24713 + (((tickAnim - 9) / 6) * (10.75-(-1.24713)));
            yy = 0.01891 + (((tickAnim - 9) / 6) * (0-(0.01891)));
            zz = -0.0911 + (((tickAnim - 9) / 6) * (0-(-0.0911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = -0.525 + (((tickAnim - 9) / 6) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.75 + (((tickAnim - 0) / 3) * (13.5-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 13.5 + (((tickAnim - 3) / 2) * (14.25-(13.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 14.25 + (((tickAnim - 5) / 2) * (6.5-(14.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 6.5 + (((tickAnim - 7) / 2) * (-26-(6.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -26 + (((tickAnim - 9) / 6) * (-3.75-(-26)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.025-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.925 + (((tickAnim - 3) / 4) * (2.11-(0.925)));
            zz = 0.025 + (((tickAnim - 3) / 4) * (0.26-(0.025)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.11 + (((tickAnim - 7) / 1) * (2.11-(2.11)));
            zz = 0.26 + (((tickAnim - 7) / 1) * (0.26-(0.26)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.11 + (((tickAnim - 8) / 1) * (-0.725-(2.11)));
            zz = 0.26 + (((tickAnim - 8) / 1) * (0.35-(0.26)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.725 + (((tickAnim - 9) / 4) * (0.34-(-0.725)));
            zz = 0.35 + (((tickAnim - 9) / 4) * (0.15-(0.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.34 + (((tickAnim - 13) / 2) * (0-(0.34)));
            zz = 0.15 + (((tickAnim - 13) / 2) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.26881 + (((tickAnim - 0) / 3) * (34-(-11.26881)));
            yy = 0.03713 + (((tickAnim - 0) / 3) * (0-(0.03713)));
            zz = 0.18977 + (((tickAnim - 0) / 3) * (0-(0.18977)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 34 + (((tickAnim - 3) / 4) * (13.63-(34)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 13.63 + (((tickAnim - 7) / 2) * (33.5-(13.63)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 33.5 + (((tickAnim - 9) / 6) * (-11.26881-(33.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0.03713-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0.18977-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.95 + (((tickAnim - 0) / 3) * (0.475-(1.95)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 3) / 4) * (1.19-(0.475)));
            zz = -0.4 + (((tickAnim - 3) / 4) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 1.19 + (((tickAnim - 7) / 2) * (-0.6-(1.19)));
            zz = -0.2 + (((tickAnim - 7) / 2) * (0-(-0.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.6 + (((tickAnim - 9) / 4) * (1.89-(-0.6)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.89 + (((tickAnim - 13) / 2) * (1.95-(1.89)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-12.86-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -12.86 + (((tickAnim - 2) / 1) * (12-(-12.86)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 12 + (((tickAnim - 3) / 6) * (0-(12)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0.275 + (((tickAnim - 3) / 6) * (0-(0.275)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftbacktoe.rotationPointX = this.leftbacktoe.rotationPointX + (float)(xx);
        this.leftbacktoe.rotationPointY = this.leftbacktoe.rotationPointY - (float)(yy);
        this.leftbacktoe.rotationPointZ = this.leftbacktoe.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 35.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 0) / 5) * (-0.69-(35.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.69 + (((tickAnim - 5) / 2) * (2.75-(-0.69)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 2.75 + (((tickAnim - 7) / 8) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(2.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -0.4 + (((tickAnim - 7) / 8) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.5 + (((tickAnim - 0) / 5) * (-30.81-(13.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -30.81 + (((tickAnim - 5) / 2) * (-21-(-30.81)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -21 + (((tickAnim - 7) / 8) * (13.5-(-21)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.65 + (((tickAnim - 0) / 3) * (2.71-(1.65)));
            zz = 0.3 + (((tickAnim - 0) / 3) * (1.11-(0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 2.71 + (((tickAnim - 3) / 1) * (2.96-(2.71)));
            zz = 1.11 + (((tickAnim - 3) / 1) * (0.885-(1.11)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 2.96 + (((tickAnim - 4) / 3) * (-0.725-(2.96)));
            zz = 0.885 + (((tickAnim - 4) / 3) * (0-(0.885)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 7) / 3) * (0.125-(-0.725)));
            zz = 0 + (((tickAnim - 7) / 3) * (0.01-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 10) / 3) * (2.13-(0.125)));
            zz = 0.01 + (((tickAnim - 10) / 3) * (0.02-(0.01)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.13 + (((tickAnim - 13) / 2) * (1.65-(2.13)));
            zz = 0.02 + (((tickAnim - 13) / 2) * (0.3-(0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 34 + (((tickAnim - 0) / 3) * (17.63-(34)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 17.63 + (((tickAnim - 3) / 1) * (16.98-(17.63)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 16.98 + (((tickAnim - 4) / 3) * (27.75-(16.98)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 27.75 + (((tickAnim - 7) / 1) * (24.54-(27.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 24.54 + (((tickAnim - 8) / 1) * (10.47-(24.54)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 10.47 + (((tickAnim - 9) / 6) * (34-(10.47)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 3) * (1.54-(0.475)));
            zz = -0.4 + (((tickAnim - 0) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.54 + (((tickAnim - 3) / 4) * (-0.975-(1.54)));
            zz = -0.2 + (((tickAnim - 3) / 4) * (-0.6-(-0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.975 + (((tickAnim - 7) / 1) * (-1.245-(-0.975)));
            zz = -0.6 + (((tickAnim - 7) / 1) * (-0.58-(-0.6)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -1.245 + (((tickAnim - 8) / 4) * (1.255-(-1.245)));
            zz = -0.58 + (((tickAnim - 8) / 4) * (-0.49-(-0.58)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.255 + (((tickAnim - 12) / 3) * (0.475-(1.255)));
            zz = -0.49 + (((tickAnim - 12) / 3) * (-0.4-(-0.49)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12 + (((tickAnim - 0) / 6) * (-9.27-(12)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -9.27 + (((tickAnim - 6) / 1) * (0-(-9.27)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 2.5 + (((tickAnim - 9) / 2) * (-26.36-(2.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -26.36 + (((tickAnim - 11) / 2) * (-23.57-(-26.36)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -23.57 + (((tickAnim - 13) / 2) * (12-(-23.57)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbacktoe, rightbacktoe.rotateAngleX + (float) Math.toRadians(xx), rightbacktoe.rotateAngleY + (float) Math.toRadians(yy), rightbacktoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0.275 + (((tickAnim - 0) / 7) * (0-(0.275)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0.6-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.075-(0)));
            zz = 0.6 + (((tickAnim - 11) / 2) * (0.625-(0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 13) / 2) * (0-(-0.075)));
            zz = 0.625 + (((tickAnim - 13) / 2) * (0.275-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightbacktoe.rotationPointX = this.rightbacktoe.rotationPointX + (float)(xx);
        this.rightbacktoe.rotationPointY = this.rightbacktoe.rotationPointY - (float)(yy);
        this.rightbacktoe.rotationPointZ = this.rightbacktoe.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+100))*-5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+200))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -58 + (((tickAnim - 0) / 8) * (11-(-58)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11 + (((tickAnim - 8) / 7) * (-58-(11)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.25 + (((tickAnim - 0) / 8) * (14.5-(2.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 14.5 + (((tickAnim - 8) / 4) * (-31.63-(14.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -31.63 + (((tickAnim - 12) / 1) * (-31.63-(-31.63)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -31.63 + (((tickAnim - 13) / 2) * (2.25-(-31.63)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.685-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.685 + (((tickAnim - 3) / 5) * (-0.1-(1.685)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 4) * (-0.8-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.8 + (((tickAnim - 12) / 1) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.8 + (((tickAnim - 13) / 2) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 50.49567 + (((tickAnim - 0) / 3) * (16.41875-(50.49567)));
            yy = -0.6626 + (((tickAnim - 0) / 3) * (-0.6626-(-0.6626)));
            zz = 0.74899 + (((tickAnim - 0) / 3) * (0.74899-(0.74899)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 16.41875 + (((tickAnim - 3) / 5) * (121.74567-(16.41875)));
            yy = -0.6626 + (((tickAnim - 3) / 5) * (-0.6626-(-0.6626)));
            zz = 0.74899 + (((tickAnim - 3) / 5) * (0.74899-(0.74899)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 121.74567 + (((tickAnim - 8) / 4) * (106.74567-(121.74567)));
            yy = -0.6626 + (((tickAnim - 8) / 4) * (-0.6626-(-0.6626)));
            zz = 0.74899 + (((tickAnim - 8) / 4) * (0.74899-(0.74899)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 106.74567 + (((tickAnim - 12) / 3) * (50.49567-(106.74567)));
            yy = -0.6626 + (((tickAnim - 12) / 3) * (-0.6626-(-0.6626)));
            zz = 0.74899 + (((tickAnim - 12) / 3) * (0.74899-(0.74899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.975 + (((tickAnim - 0) / 2) * (2.89-(1.975)));
            zz = -0.45 + (((tickAnim - 0) / 2) * (-0.24-(-0.45)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.89 + (((tickAnim - 2) / 1) * (1.35-(2.89)));
            zz = -0.24 + (((tickAnim - 2) / 1) * (0-(-0.24)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.35 + (((tickAnim - 3) / 3) * (2.105-(1.35)));
            zz = 0 + (((tickAnim - 3) / 3) * (-0.43-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.105 + (((tickAnim - 6) / 2) * (1.25-(2.105)));
            zz = -0.43 + (((tickAnim - 6) / 2) * (-0.725-(-0.43)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.25 + (((tickAnim - 8) / 4) * (1.645-(1.25)));
            zz = -0.725 + (((tickAnim - 8) / 4) * (-0.885-(-0.725)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.645 + (((tickAnim - 12) / 3) * (1.975-(1.645)));
            zz = -0.885 + (((tickAnim - 12) / 3) * (-0.45-(-0.885)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.34094 + (((tickAnim - 0) / 5) * (32.75-(-15.34094)));
            yy = 0.24989 + (((tickAnim - 0) / 5) * (0-(0.24989)));
            zz = -0.9796 + (((tickAnim - 0) / 5) * (0-(-0.9796)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 32.75 + (((tickAnim - 5) / 8) * (-47.5-(32.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -47.5 + (((tickAnim - 13) / 2) * (-15.34094-(-47.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.24989-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.9796-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 0) / 5) * (-6.18249-(-15)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.2099-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.38688-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.18249 + (((tickAnim - 5) / 3) * (-45.46625-(-6.18249)));
            yy = -1.2099 + (((tickAnim - 5) / 3) * (-0.60495-(-1.2099)));
            zz = -6.38688 + (((tickAnim - 5) / 3) * (-3.19344-(-6.38688)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -45.46625 + (((tickAnim - 8) / 1) * (-45.46625-(-45.46625)));
            yy = -0.60495 + (((tickAnim - 8) / 1) * (-0.60495-(-0.60495)));
            zz = -3.19344 + (((tickAnim - 8) / 1) * (-3.19344-(-3.19344)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -45.46625 + (((tickAnim - 9) / 4) * (16-(-45.46625)));
            yy = -0.60495 + (((tickAnim - 9) / 4) * (0-(-0.60495)));
            zz = -3.19344 + (((tickAnim - 9) / 4) * (0-(-3.19344)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 16 + (((tickAnim - 13) / 2) * (-15-(16)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.325 + (((tickAnim - 0) / 5) * (0-(1.325)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (-1.425-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = -1.425 + (((tickAnim - 9) / 6) * (1.325-(-1.425)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27 + (((tickAnim - 0) / 3) * (21.4-(27)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21.4 + (((tickAnim - 3) / 2) * (122.5-(21.4)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 122.5 + (((tickAnim - 5) / 4) * (117.37283-(122.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (-0.3313-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0.37449-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 117.37283 + (((tickAnim - 9) / 4) * (30.24567-(117.37283)));
            yy = -0.3313 + (((tickAnim - 9) / 4) * (-0.6626-(-0.3313)));
            zz = 0.37449 + (((tickAnim - 9) / 4) * (0.74899-(0.37449)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 30.24567 + (((tickAnim - 13) / 2) * (27-(30.24567)));
            yy = -0.6626 + (((tickAnim - 13) / 2) * (0-(-0.6626)));
            zz = 0.74899 + (((tickAnim - 13) / 2) * (0-(0.74899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 2.275 + (((tickAnim - 0) / 3) * (2-(2.275)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2 + (((tickAnim - 3) / 2) * (1.28-(2)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.625-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.28 + (((tickAnim - 5) / 4) * (1.475-(1.28)));
            zz = -0.625 + (((tickAnim - 5) / 4) * (-0.775-(-0.625)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.475 + (((tickAnim - 9) / 4) * (2.075-(1.475)));
            zz = -0.775 + (((tickAnim - 9) / 4) * (0-(-0.775)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.075 + (((tickAnim - 13) / 2) * (2.275-(2.075)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+120))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+190))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+220))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+100))*-5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+150))*5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+250))*-5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+350))*10), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+490))*-10), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+650))*10), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+220))*-1.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPrestosuchus e = (EntityPrehistoricFloraPrestosuchus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);
        
    }
}
