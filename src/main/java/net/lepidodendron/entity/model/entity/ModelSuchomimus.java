package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSuchomimus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSuchomimus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer lefttoes;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer righttoes;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftJaw1;
    private final AdvancedModelRenderer leftJaw2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer leftMasseter;
    private final AdvancedModelRenderer rightJaw1;
    private final AdvancedModelRenderer rightJaw2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer rightMasseter;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer leftfingers;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer leftclaw;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer rightfingers;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer rightclaw;
    private final AdvancedModelRenderer cube_r63;

    private ModelAnimator animator;

    public ModelSuchomimus() {
        this.textureWidth = 150;
        this.textureHeight = 150;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -11.5F, 4.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 37, -5.5F, -6.1382F, -9.5966F, 11, 19, 19, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 87, 118, -2.0F, -12.0415F, -1.3943F, 4, 7, 8, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -12.0415F, 6.6057F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 99, 23, -3.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -11.1382F, -9.5966F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 111, 118, -2.0F, 0.175F, 0.25F, 4, 7, 8, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(5.9F, 0.0F, 0.0F);
        this.hips.addChild(leftleg);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5F, 2.4119F, -0.3466F);
        this.leftleg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 75, 0.5F, -7.0F, -6.0F, 6, 20, 13, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 14.3421F, -5.1421F);
        this.leftleg.addChild(leftleg2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5F, 10.1512F, 4.7263F);
        this.leftleg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 105, 41, 1.0F, -12.9F, -0.4F, 5, 15, 7, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 9.5836F, 8.3386F);
        this.leftleg2.addChild(leftleg3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.5F, 8.3218F, 1.0308F);
        this.leftleg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, 1.5F, -9.5F, -3.55F, 4, 12, 4, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 10.0718F, -1.7692F);
        this.leftleg3.addChild(leftfoot);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 60, 51, -2.5F, 0.0F, -2.75F, 5, 2, 6, 0.0F, false));

        this.lefttoes = new AdvancedModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 1.0F, -2.75F);
        this.leftfoot.addChild(lefttoes);
        this.lefttoes.cubeList.add(new ModelBox(lefttoes, 48, 104, -3.0F, -0.975F, -4.0F, 6, 2, 5, 0.001F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-5.9F, 0.0F, 0.0F);
        this.hips.addChild(rightleg);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.5F, 2.4119F, -0.3466F);
        this.rightleg.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 75, -6.5F, -7.0F, -6.0F, 6, 20, 13, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 14.3421F, -5.1421F);
        this.rightleg.addChild(rightleg2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.5F, 10.1512F, 4.7263F);
        this.rightleg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 105, 41, -6.0F, -12.9F, -0.4F, 5, 15, 7, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 9.5836F, 8.3386F);
        this.rightleg2.addChild(rightleg3);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.5F, 8.3218F, 1.0308F);
        this.rightleg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 37, -5.5F, -9.5F, -3.55F, 4, 12, 4, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 10.0718F, -1.7692F);
        this.rightleg3.addChild(rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 60, 51, -2.5F, 0.0F, -2.75F, 5, 2, 6, 0.0F, true));

        this.righttoes = new AdvancedModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 1.0F, -2.75F);
        this.rightfoot.addChild(righttoes);
        this.righttoes.cubeList.add(new ModelBox(righttoes, 48, 104, -3.0F, -0.975F, -4.0F, 6, 2, 5, 0.001F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.2049F, 9.1386F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 49, 20, -4.5F, -1.5678F, -0.3467F, 9, 14, 17, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -7.1128F, 0.7816F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1876F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 0, -2.0F, 0.2F, 0.0F, 3, 6, 17, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.4519F, 16.9337F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 59, -3.0F, -2.6521F, -2.0327F, 6, 11, 16, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -5.1521F, -1.0327F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 101, 23, -1.0F, 0.0F, 0.0F, 2, 3, 15, 0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.3405F, 12.9976F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 72, 74, -2.5F, -1.0F, 0.0F, 5, 9, 16, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -2.5F, 0.0F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 86, -0.5F, 0.0F, 0.0F, 2, 2, 16, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.9171F, 15.4993F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 61, 99, -2.0F, -1.7026F, -0.0876F, 4, 7, 13, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 84, 23, -0.5F, -2.7026F, -0.0876F, 1, 1, 13, -0.001F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.069F, 12.3266F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 108, -1.5F, -0.3096F, 0.1196F, 3, 5, 11, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.3096F, 0.6196F);
        this.tail5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 119, 78, -0.5F, -0.4F, -0.5F, 1, 2, 11, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.3954F, 10.6141F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0873F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 116, 62, -1.0F, -0.5718F, -0.065F, 2, 3, 12, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.3508F, 12.0611F);
        this.tail6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0087F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 39, 0.0F, 0.0F, -12.0F, 0, 3, 12, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 120, 26, -0.5F, -0.5718F, -0.065F, 1, 2, 10, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.4282F, 6.935F);
        this.tail7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 44, 0.975F, -2.4F, -7.0F, 0, 2, 10, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.25F, 9.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.1745F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 78, 0, -0.5F, -0.5718F, -0.065F, 1, 1, 10, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.4282F, 6.935F);
        this.tail8.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 6, 1.0F, -1.4F, -7.0F, 0, 1, 10, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -9.0382F, -8.8466F);
        this.hips.addChild(body);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.2016F, -18.74F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2793F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 119, -2.0F, 0.0F, 11.0F, 4, 6, 8, 0.001F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 107, 0, -2.0F, 0.0F, 0.0F, 4, 4, 11, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 8.6F, -14.0F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -7.0F, -4.6F, -4.5F, 14, 18, 19, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 5.7382F, -20.8534F);
        this.body.addChild(chest);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 12.2344F, -6.5174F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3665F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 0, -4.0F, -5.05F, -0.025F, 10, 5, 11, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -1.2061F, -1.6102F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3316F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 128, 38, -1.0F, 0.1F, -3.0F, 3, 1, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 6.0F, -3.0F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1571F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 72, 51, -5.0F, -6.4F, -4.5F, 11, 12, 11, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 4.3045F, -6.7111F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.6981F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 95, 99, -3.5F, -3.5F, -5.25F, 7, 9, 10, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.4F, -5.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 28, 104, -2.5F, -4.75F, -7.25F, 5, 8, 10, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.75F, -7.25F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3054F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 22, 122, -2.0F, -3.7F, -4.5F, 4, 8, 6, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(-1.0F, -0.25F, -2.5F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.5236F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 0, 0, -0.5F, -4.0F, -6.0F, 3, 8, 6, 0.01F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.25F, -5.25F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.4363F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 38, 88, -0.5F, -4.0F, -3.5F, 3, 7, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -3.95F, -3.5F);
        this.neck5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.48F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 75, 0.5F, -0.05F, -3.0F, 2, 2, 3, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.0F, -1.25F, -2.5F);
        this.neck5.addChild(head);
        this.setRotateAngle(head, -0.1571F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 127, 112, -2.0F, -1.1F, -5.75F, 4, 3, 6, 0.02F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -0.7584F, -6.6769F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5323F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 84, 28, -1.0F, 0.0F, 0.0F, 1, 2, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.7207F, -15.8529F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 75, -1.5F, 0.0F, -0.3F, 2, 2, 11, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 1.7984F, -18.8423F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1571F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -1.5F, 0.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.7412F, -16.0882F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3665F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 66, 16, -1.5F, 0.0F, -2.95F, 2, 1, 3, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 3.077F, -18.5016F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 98, 74, -1.5F, -1.15F, 0.5F, 2, 1, 14, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 3.5659F, -14.9523F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1833F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 120, 15, -1.5F, -1.0F, 0.0F, 2, 1, 10, 0.02F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.75F, 3.6654F, -17.9513F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.6226F, -0.2875F, -0.2008F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 3, 3, 0.1879F, -0.5F, -0.5684F, 0, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.25F, 3.6654F, -15.2013F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3491F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 4, 4, -0.5F, -0.35F, -1.05F, 0, 1, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 12, 3, 1.0F, -0.35F, -1.05F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.25F, 3.1654F, -14.2013F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2705F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 9, -0.5F, -0.1F, -0.2F, 0, 1, 5, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 10, 1.0F, -0.1F, -0.2F, 0, 1, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.75F, 3.6654F, -17.9513F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.6226F, 0.2875F, 0.2008F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 4, 1, -0.1879F, -0.5F, -0.5684F, 0, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 3.5764F, -14.5524F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0262F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 14, -1.5F, -1.0F, -4.4F, 2, 1, 4, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9891F, 0.5854F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0393F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 76, 119, -2.5F, -1.0F, -5.3F, 4, 2, 5, 0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.6517F, -5.1678F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0698F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 103, 118, -2.5F, -2.65F, 0.0F, 4, 3, 4, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 2.5F, -5.25F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0698F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 84, 11, -1.0F, -1.0913F, -0.1444F, 2, 1, 5, -0.04F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.25F, -14.25F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0349F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 41, 47, -1.0F, 0.0015F, -2.024F, 2, 1, 2, -0.03F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0175F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 119, 91, -1.0F, 1.5F, -15.25F, 2, 1, 10, -0.04F, false));

        this.leftJaw1 = new AdvancedModelRenderer(this);
        this.leftJaw1.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.jaw.addChild(leftJaw1);
        this.setRotateAngle(leftJaw1, 0.0873F, 0.0F, 0.0F);
        this.leftJaw1.cubeList.add(new ModelBox(leftJaw1, 129, 102, -1.0F, -1.0F, -6.3F, 2, 3, 6, 0.0F, false));
        this.leftJaw1.cubeList.add(new ModelBox(leftJaw1, 98, 74, -2.0F, 1.0F, -6.3F, 1, 1, 6, -0.01F, false));

        this.leftJaw2 = new AdvancedModelRenderer(this);
        this.leftJaw2.setRotationPoint(0.0F, 0.5F, -6.1F);
        this.leftJaw1.addChild(leftJaw2);
        this.leftJaw2.cubeList.add(new ModelBox(leftJaw2, 98, 81, -1.0F, -0.5F, -5.9F, 1, 1, 6, -0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.75F, -1.2943F, -10.4707F);
        this.leftJaw2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 0, 0.5F, 0.1551F, 2.4903F, 0, 1, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.75F, -0.8443F, -9.7207F);
        this.leftJaw2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1658F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 1, 0.5F, -0.6449F, -0.2597F, 0, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.25F, -1.413F, -11.0629F);
        this.leftJaw2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.2111F, 0.3052F, -0.011F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 2, 1, 0.0F, -0.6949F, -1.0097F, 0, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, -1.7587F, -12.5556F);
        this.leftJaw2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1658F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 78, 0, -0.5F, 0.0051F, -0.0097F, 1, 1, 4, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 0.4181F, -12.8094F);
        this.leftJaw2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3403F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 14, -0.5F, -1.9695F, -0.0097F, 1, 2, 1, -0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, -0.5F, 6.1F);
        this.leftJaw2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0087F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 78, 5, -1.0F, -0.2195F, -18.9097F, 1, 1, 4, -0.02F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 4, -0.5F, -0.7195F, -18.4097F, 1, 1, 1, -0.03F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 25, 80, -0.5F, -0.2195F, -18.9097F, 1, 1, 4, -0.02F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, -0.5F, 6.1F);
        this.leftJaw2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.1222F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 124, -1.4F, 1.7285F, -14.8108F, 1, 1, 9, -0.01F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 65, 124, -0.5F, 1.7285F, -14.8108F, 1, 1, 9, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, -1.4714F, -0.0079F);
        this.leftJaw2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0436F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 82, 99, -0.5F, -0.0278F, -8.9896F, 1, 1, 9, 0.01F, false));

        this.leftMasseter = new AdvancedModelRenderer(this);
        this.leftMasseter.setRotationPoint(-0.25F, -1.5F, -2.15F);
        this.leftJaw2.addChild(leftMasseter);
        this.setRotateAngle(leftMasseter, -1.0036F, 0.0F, 0.0F);
        this.leftMasseter.cubeList.add(new ModelBox(leftMasseter, 41, 39, 0.0F, -4.9F, 0.2F, 0, 5, 3, 0.0F, false));
        this.leftMasseter.cubeList.add(new ModelBox(leftMasseter, 41, 34, -0.05F, -4.9F, 0.2F, 0, 5, 3, 0.0F, false));

        this.rightJaw1 = new AdvancedModelRenderer(this);
        this.rightJaw1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.jaw.addChild(rightJaw1);
        this.setRotateAngle(rightJaw1, 0.0873F, 0.0F, 0.0F);
        this.rightJaw1.cubeList.add(new ModelBox(rightJaw1, 129, 102, -1.0F, -1.0F, -6.3F, 2, 3, 6, 0.0F, true));
        this.rightJaw1.cubeList.add(new ModelBox(rightJaw1, 98, 74, 1.0F, 1.0F, -6.3F, 1, 1, 6, -0.01F, true));

        this.rightJaw2 = new AdvancedModelRenderer(this);
        this.rightJaw2.setRotationPoint(0.0F, 0.5F, -6.1F);
        this.rightJaw1.addChild(rightJaw2);
        this.rightJaw2.cubeList.add(new ModelBox(rightJaw2, 98, 81, 0.0F, -0.5F, -5.9F, 1, 1, 6, -0.01F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.75F, -1.2943F, -10.4707F);
        this.rightJaw2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0873F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 0, -0.5F, 0.1551F, 2.4903F, 0, 1, 3, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.75F, -0.8443F, -9.7207F);
        this.rightJaw2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1658F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 1, -0.5F, -0.6449F, -0.2597F, 0, 1, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.25F, -1.413F, -11.0629F);
        this.rightJaw2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.2111F, -0.3052F, 0.011F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 2, 1, 0.0F, -0.6949F, -1.0097F, 0, 1, 1, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, -1.7587F, -12.5556F);
        this.rightJaw2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1658F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 78, 0, -0.5F, 0.0051F, -0.0097F, 1, 1, 4, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, 0.4181F, -12.8094F);
        this.rightJaw2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3403F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 14, -0.5F, -1.9695F, -0.0097F, 1, 2, 1, -0.01F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, -0.5F, 6.1F);
        this.rightJaw2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0087F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 78, 5, 0.0F, -0.2195F, -18.9097F, 1, 1, 4, -0.02F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 4, -0.5F, -0.7195F, -18.4097F, 1, 1, 1, -0.03F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 25, 80, -0.5F, -0.2195F, -18.9097F, 1, 1, 4, -0.02F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, -0.5F, 6.1F);
        this.rightJaw2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1222F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 124, 0.4F, 1.7285F, -14.8108F, 1, 1, 9, -0.01F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 65, 124, -0.5F, 1.7285F, -14.8108F, 1, 1, 9, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, -1.4714F, -0.0079F);
        this.rightJaw2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0436F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 82, 99, -0.5F, -0.0278F, -8.9896F, 1, 1, 9, 0.01F, true));

        this.rightMasseter = new AdvancedModelRenderer(this);
        this.rightMasseter.setRotationPoint(0.25F, -1.5F, -2.15F);
        this.rightJaw2.addChild(rightMasseter);
        this.setRotateAngle(rightMasseter, -1.0036F, 0.0F, 0.0F);
        this.rightMasseter.cubeList.add(new ModelBox(rightMasseter, 41, 39, 0.0F, -4.9F, 0.2F, 0, 5, 3, 0.0F, true));
        this.rightMasseter.cubeList.add(new ModelBox(rightMasseter, 41, 34, 0.05F, -4.9F, 0.2F, 0, 5, 3, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 47, 17, -2.0F, -0.1F, 0.25F, 4, 1, 1, 0.03F, false));
        this.eye.cubeList.add(new ModelBox(eye, 8, 16, -2.0F, -0.1F, -0.75F, 4, 1, 1, 0.03F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(1.0F, 2.6063F, -6.9897F);
        this.neck5.addChild(throat);
        this.setRotateAngle(throat, -0.3622F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 129, 46, -1.0F, -3.0F, 0.0F, 2, 3, 6, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.5F, -0.1411F, 5.2874F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, -0.2182F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 126, 0, -2.0F, -3.0F, 0.0F, 3, 3, 7, -0.001F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(5.7467F, 11.3379F, -3.0237F);
        this.chest.addChild(leftarm);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-3.4967F, 1.5876F, 2.1251F);
        this.leftarm.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.9595F, 0.0357F, -0.025F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 58, 86, 2.0F, -4.0F, -2.0F, 3, 9, 4, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.5033F, 3.2887F, 5.3708F);
        this.leftarm.addChild(leftarm2);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-3.5F, 1.4153F, 1.7942F);
        this.leftarm2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.2618F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 47, 0, 2.5F, -1.6F, -3.5F, 2, 7, 3, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5227F, 6.2059F, -2.0125F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, -0.3491F, 0.0F, 0.0F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.7727F, 2.9553F, -0.277F);
        this.lefthand.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.1265F, 0.0338F, 0.2597F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 75, -1.3F, -4.0F, -2.0F, 1, 5, 4, 0.0F, false));

        this.leftfingers = new AdvancedModelRenderer(this);
        this.leftfingers.setRotationPoint(0.7727F, 2.9553F, -0.277F);
        this.lefthand.addChild(leftfingers);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5904F, 0.8753F, 0.2706F);
        this.leftfingers.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.1106F, 0.0702F, 0.5633F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 84, 23, -0.9452F, -0.0569F, -1.3825F, 1, 2, 3, -0.001F, false));

        this.leftclaw = new AdvancedModelRenderer(this);
        this.leftclaw.setRotationPoint(-0.005F, 3.5493F, -1.9833F);
        this.lefthand.addChild(leftclaw);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.4723F, -0.1161F, -0.0548F);
        this.leftclaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.2785F, 0.0969F, 0.4691F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 12, 0, -1.3F, -0.3F, -0.3F, 2, 3, 1, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-5.7467F, 11.3379F, -3.0237F);
        this.chest.addChild(rightarm);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(3.4967F, 1.5876F, 2.1251F);
        this.rightarm.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.9595F, -0.0357F, 0.025F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 58, 86, -5.0F, -4.0F, -2.0F, 3, 9, 4, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.5033F, 3.2887F, 5.3708F);
        this.rightarm.addChild(rightarm2);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(3.5F, 1.4153F, 1.7942F);
        this.rightarm2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.2618F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 47, 0, -4.5F, -1.6F, -3.5F, 2, 7, 3, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.5227F, 6.2059F, -2.0125F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, -0.3491F, 0.0F, 0.0F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.7727F, 2.9553F, -0.277F);
        this.righthand.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1265F, -0.0338F, -0.2597F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 75, 0.3F, -4.0F, -2.0F, 1, 5, 4, 0.0F, true));

        this.rightfingers = new AdvancedModelRenderer(this);
        this.rightfingers.setRotationPoint(-0.7727F, 2.9553F, -0.277F);
        this.righthand.addChild(rightfingers);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.5904F, 0.8753F, 0.2706F);
        this.rightfingers.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.1106F, -0.0702F, -0.5633F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 84, 23, -0.0548F, -0.0569F, -1.3825F, 1, 2, 3, -0.001F, true));

        this.rightclaw = new AdvancedModelRenderer(this);
        this.rightclaw.setRotationPoint(0.005F, 3.5493F, -1.9833F);
        this.righthand.addChild(rightclaw);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.4723F, -0.1161F, -0.0548F);
        this.rightclaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.2785F, -0.0969F, -0.4691F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 12, 0, -0.7F, -0.3F, -0.3F, 2, 3, 1, 0.0F, true));

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
        this.hips.offsetY = 0.3F;
        this.hips.offsetX = 1.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(-150);
        this.hips.rotateAngleX = (float)Math.toRadians(6);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 0.7F;
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

        EntityPrehistoricFloraSuchomimus EntitySuchomimus = (EntityPrehistoricFloraSuchomimus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 8, neck5);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.neck5, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.lefthand};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.righthand};

        EntitySuchomimus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntitySuchomimus.getAnimation() == EntitySuchomimus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntitySuchomimus.isReallyInWater()) {

                if (f3 == 0.0F || !EntitySuchomimus.getIsMoving()) { //Is moving at all
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntitySuchomimus.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.5 + (((tickAnim - 5) / 3) * (-5.25-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -5.25 + (((tickAnim - 8) / 4) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -4 + (((tickAnim - 7) / 3) * (3.67-(-4)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.67 + (((tickAnim - 10) / 2) * (0-(3.67)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 7) / 1) * (-6.5-(-7)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -6.5 + (((tickAnim - 8) / 4) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.75 + (((tickAnim - 5) / 3) * (5-(-2.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 8) / 2) * (9.75-(5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 9.75 + (((tickAnim - 10) / 2) * (0-(9.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.25 + (((tickAnim - 4) / 3) * (-1.75-(-5.25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -1.75 + (((tickAnim - 7) / 2) * (7.5-(-1.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 9) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.35-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0.35 + (((tickAnim - 7) / 5) * (0-(0.35)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -6.75 + (((tickAnim - 3) / 5) * (-19.75-(-6.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -19.75 + (((tickAnim - 8) / 1) * (8.62-(-19.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 8.62 + (((tickAnim - 9) / 3) * (0-(8.62)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5.75 + (((tickAnim - 3) / 5) * (10.63-(5.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10.63 + (((tickAnim - 8) / 1) * (17.82-(10.63)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 17.82 + (((tickAnim - 9) / 3) * (0-(17.82)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 3) / 5) * (12.75-(8.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 12.75 + (((tickAnim - 8) / 1) * (-13.37-(12.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -13.37 + (((tickAnim - 9) / 3) * (0-(-13.37)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 4) * (0-(0.2)));
            zz = 0.25 + (((tickAnim - 8) / 4) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 3) / 5) * (20.5-(4.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.5 + (((tickAnim - 8) / 1) * (-17-(20.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 9) / 3) * (0-(-17)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (23.75-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 23.75 + (((tickAnim - 9) / 2) * (0-(23.75)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10.5 + (((tickAnim - 5) / 3) * (-13.5-(-10.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -13.5 + (((tickAnim - 8) / 0) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (6.5-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 6.5 + (((tickAnim - 11) / 1) * (0-(6.5)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-20.42584-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-18.82751-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-33.30254-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20.42584 + (((tickAnim - 3) / 2) * (-42.20351-(-20.42584)));
            yy = -18.82751 + (((tickAnim - 3) / 2) * (-32.20994-(-18.82751)));
            zz = -33.30254 + (((tickAnim - 3) / 2) * (-56.28461-(-33.30254)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -42.20351 + (((tickAnim - 5) / 3) * (-70.56864-(-42.20351)));
            yy = -32.20994 + (((tickAnim - 5) / 3) * (13.32746-(-32.20994)));
            zz = -56.28461 + (((tickAnim - 5) / 3) * (-11.19279-(-56.28461)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -70.56864 + (((tickAnim - 8) / 4) * (0-(-70.56864)));
            yy = 13.32746 + (((tickAnim - 8) / 4) * (0-(13.32746)));
            zz = -11.19279 + (((tickAnim - 8) / 4) * (0-(-11.19279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (14.96916-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-7.03776-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-13.11014-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 14.96916 + (((tickAnim - 3) / 2) * (14.21-(14.96916)));
            yy = -7.03776 + (((tickAnim - 3) / 2) * (-11.53068-(-7.03776)));
            zz = -13.11014 + (((tickAnim - 3) / 2) * (-30.59044-(-13.11014)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 14.21 + (((tickAnim - 5) / 3) * (11.15623-(14.21)));
            yy = -11.53068 + (((tickAnim - 5) / 3) * (-3.89634-(-11.53068)));
            zz = -30.59044 + (((tickAnim - 5) / 3) * (7.59575-(-30.59044)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 11.15623 + (((tickAnim - 8) / 4) * (0-(11.15623)));
            yy = -3.89634 + (((tickAnim - 8) / 4) * (0-(-3.89634)));
            zz = 7.59575 + (((tickAnim - 8) / 4) * (0-(7.59575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-21-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -21 + (((tickAnim - 3) / 2) * (12.7-(-21)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 12.7 + (((tickAnim - 5) / 2) * (14.58-(12.7)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 14.58 + (((tickAnim - 7) / 1) * (-29.25-(14.58)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -29.25 + (((tickAnim - 8) / 4) * (0-(-29.25)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (30.85-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 30.85 + (((tickAnim - 5) / 2) * (43.31-(30.85)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 43.31 + (((tickAnim - 7) / 1) * (-36.5-(43.31)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -36.5 + (((tickAnim - 8) / 4) * (0-(-36.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfingers, leftfingers.rotateAngleX + (float) Math.toRadians(xx), leftfingers.rotateAngleY + (float) Math.toRadians(yy), leftfingers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (7.514-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (51.65877-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-24.66906-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7.514 + (((tickAnim - 5) / 2) * (4.21381-(7.514)));
            yy = 51.65877 + (((tickAnim - 5) / 2) * (59.32188-(51.65877)));
            zz = -24.66906 + (((tickAnim - 5) / 2) * (-29.28144-(-24.66906)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 4.21381 + (((tickAnim - 7) / 1) * (13.75-(4.21381)));
            yy = 59.32188 + (((tickAnim - 7) / 1) * (-40-(59.32188)));
            zz = -29.28144 + (((tickAnim - 7) / 1) * (0-(-29.28144)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 13.75 + (((tickAnim - 8) / 4) * (0-(13.75)));
            yy = -40 + (((tickAnim - 8) / 4) * (0-(-40)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(xx), leftclaw.rotateAngleY + (float) Math.toRadians(yy), leftclaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 10) / 10) * (0-(5.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 10) / 10) * (0-(8.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.725-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.725 + (((tickAnim - 10) / 10) * (0-(0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25.75 + (((tickAnim - 10) / 10) * (0-(25.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 10) / 10) * (0-(21)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 5) / 5) * (0-(10.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 5) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 5) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.83-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.83 + (((tickAnim - 8) / 2) * (0-(4.83)));
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
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15.25 + (((tickAnim - 5) / 3) * (-7.83-(15.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.83 + (((tickAnim - 8) / 2) * (0-(-7.83)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (15-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 14) / 6) * (0-(15)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 5) / 3) * (20.08-(10.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20.08 + (((tickAnim - 8) / 2) * (0-(20.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -2 + (((tickAnim - 5) / 3) * (-6.92-(-2)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -6.92 + (((tickAnim - 8) / 2) * (0-(-6.92)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw1, leftJaw1.rotateAngleX + (float) Math.toRadians(xx), leftJaw1.rotateAngleY + (float) Math.toRadians(yy), leftJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 4.25 + (((tickAnim - 5) / 3) * (10.92-(4.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 10.92 + (((tickAnim - 8) / 2) * (0-(10.92)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw2, leftJaw2.rotateAngleX + (float) Math.toRadians(xx), leftJaw2.rotateAngleY + (float) Math.toRadians(yy), leftJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 2 + (((tickAnim - 5) / 3) * (6.92-(2)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 6.92 + (((tickAnim - 8) / 2) * (0-(6.92)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw1, rightJaw1.rotateAngleX + (float) Math.toRadians(xx), rightJaw1.rotateAngleY + (float) Math.toRadians(yy), rightJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -3.5 + (((tickAnim - 5) / 3) * (-10.92-(-3.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -10.92 + (((tickAnim - 8) / 2) * (0-(-10.92)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw2, rightJaw2.rotateAngleX + (float) Math.toRadians(xx), rightJaw2.rotateAngleY + (float) Math.toRadians(yy), rightJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9.99-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -9.99 + (((tickAnim - 5) / 4) * (0-(-9.99)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 14) / 6) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.795-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            yy = 0.795 + (((tickAnim - 5) / 9) * (-0.5-(0.795)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.5 + (((tickAnim - 14) / 6) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
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
    public void animFishing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 650;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 3.5 + (((tickAnim - 60) / 540) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 3.5 + (((tickAnim - 600) / 50) * (0-(3.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-3.075-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = -3.075 + (((tickAnim - 60) / 540) * (-3.075-(-3.075)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = -3.075 + (((tickAnim - 600) / 50) * (0-(-3.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-19.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -19.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20 + (((tickAnim - 30) / 30) * (-24.5-(-19.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -24.5 + (((tickAnim - 60) / 540) * (-24.5-(-24.5)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -24.5 + (((tickAnim - 600) / 50) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (32.13-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 32.13 + (((tickAnim - 30) / 30) * (-6.75-(32.13)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -6.75 + (((tickAnim - 60) / 540) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = -6.75 + (((tickAnim - 600) / 24) * (38.76-(-6.75)));
            yy = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 24) * (0-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 38.76 + (((tickAnim - 624) / 26) * (0-(38.76)));
            yy = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 624) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.365-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.975-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 0.365 + (((tickAnim - 30) / 30) * (-1.125-(0.365)));
            zz = -0.975 + (((tickAnim - 30) / 30) * (0-(-0.975)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = -1.125 + (((tickAnim - 60) / 540) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            yy = -1.125 + (((tickAnim - 600) / 24) * (0.82-(-1.125)));
            zz = 0 + (((tickAnim - 600) / 24) * (-1.25-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            yy = 0.82 + (((tickAnim - 624) / 26) * (0-(0.82)));
            zz = -1.25 + (((tickAnim - 624) / 26) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -46.75 + (((tickAnim - 30) / 30) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 0 + (((tickAnim - 600) / 24) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 24) * (0-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = -35.75 + (((tickAnim - 624) / 26) * (0-(-35.75)));
            yy = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 624) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.94-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.06-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 1.94 + (((tickAnim - 30) / 30) * (-0.925-(1.94)));
            zz = 0.06 + (((tickAnim - 30) / 30) * (-0.775-(0.06)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = -0.925 + (((tickAnim - 60) / 540) * (-0.925-(-0.925)));
            zz = -0.775 + (((tickAnim - 60) / 540) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            yy = -0.925 + (((tickAnim - 600) / 24) * (1.42-(-0.925)));
            zz = -0.775 + (((tickAnim - 600) / 24) * (-0.125-(-0.775)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            yy = 1.42 + (((tickAnim - 624) / 26) * (0-(1.42)));
            zz = -0.125 + (((tickAnim - 624) / 26) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (90.63-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 90.63 + (((tickAnim - 30) / 30) * (28.25-(90.63)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 28.25 + (((tickAnim - 60) / 540) * (28.25-(28.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 28.25 + (((tickAnim - 600) / 24) * (85.35-(28.25)));
            yy = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 24) * (0-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 85.35 + (((tickAnim - 624) / 26) * (0-(85.35)));
            yy = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 624) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 650) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 28.75 + (((tickAnim - 30) / 30) * (0-(28.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -0.325 + (((tickAnim - 30) / 30) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 11.25 + (((tickAnim - 60) / 540) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 11.25 + (((tickAnim - 600) / 50) * (0-(11.25)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -6.25 + (((tickAnim - 60) / 540) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -6.25 + (((tickAnim - 600) / 50) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 650) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 650) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 650) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -8.75 + (((tickAnim - 60) / 540) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -8.75 + (((tickAnim - 600) / 50) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 650) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(0), righttoes.rotateAngleY + (float) Math.toRadians(0), righttoes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 4.25 + (((tickAnim - 60) / 540) * (6.5-(4.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 6.5 + (((tickAnim - 600) / 50) * (0-(6.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 1 + (((tickAnim - 600) / 50) * (0-(1)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -7.25 + (((tickAnim - 60) / 540) * (-5.5-(-7.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -5.5 + (((tickAnim - 600) / 50) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -7 + (((tickAnim - 60) / 540) * (-8.25-(-7)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -8.25 + (((tickAnim - 600) / 50) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -4.75 + (((tickAnim - 600) / 50) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -2.25 + (((tickAnim - 600) / 50) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -3.5 + (((tickAnim - 600) / 50) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0), tail8.rotateAngleY + (float) Math.toRadians(0), tail8.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 5.25 + (((tickAnim - 60) / 120) * (9-(5.25)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 9 + (((tickAnim - 180) / 420) * (9-(9)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 9 + (((tickAnim - 600) / 50) * (0-(9)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 5.75 + (((tickAnim - 60) / 120) * (-3.6191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10-(5.75)));
            yy = 0 + (((tickAnim - 60) / 120) * (8.46491-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0.28076-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 181) {
            xx = -3.6191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10 + (((tickAnim - 180) / 1) * (1.34492-(-3.6191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10)));
            yy = 8.46491 + (((tickAnim - 180) / 1) * (8.52433-(8.46491)));
            zz = 0.28076 + (((tickAnim - 180) / 1) * (0.28159-(0.28076)));
        }
        else if (tickAnim >= 181 && tickAnim < 600) {
            xx = 1.34492 + (((tickAnim - 181) / 419) * (1.34492-(1.34492)));
            yy = 8.52433 + (((tickAnim - 181) / 419) * (8.52433-(8.52433)));
            zz = 0.28159 + (((tickAnim - 181) / 419) * (0.28159-(0.28159)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 1.34492 + (((tickAnim - 600) / 50) * (0-(1.34492)));
            yy = 8.52433 + (((tickAnim - 600) / 50) * (0-(8.52433)));
            zz = 0.28159 + (((tickAnim - 600) / 50) * (0-(0.28159)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            yy = -0.1 + (((tickAnim - 60) / 120) * (-0.325-(-0.1)));
            zz = 0.3 + (((tickAnim - 60) / 120) * (0.625-(0.3)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = -0.325 + (((tickAnim - 180) / 420) * (-0.325-(-0.325)));
            zz = 0.625 + (((tickAnim - 180) / 420) * (0.625-(0.625)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            yy = -0.325 + (((tickAnim - 600) / 50) * (0-(-0.325)));
            zz = 0.625 + (((tickAnim - 600) / 50) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10 + (((tickAnim - 60) / 120) * (19.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 181) {
            xx = 19.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10 + (((tickAnim - 180) / 1) * (24.125-(19.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10)));
            yy = 0 + (((tickAnim - 180) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 1) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 600) {
            xx = 24.125 + (((tickAnim - 181) / 419) * (24.125-(24.125)));
            yy = 0 + (((tickAnim - 181) / 419) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 419) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 24.125 + (((tickAnim - 600) / 3) * (24.13-(24.125)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 627) {
            xx = 24.13 + (((tickAnim - 603) / 24) * (6.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(24.13)));
            yy = 0 + (((tickAnim - 603) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 24) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 650) {
            xx = 6.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 627) / 23) * (0-(6.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = 0 + (((tickAnim - 627) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = -4.5 + (((tickAnim - 60) / 120) * (18.75-(-4.5)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 18.75 + (((tickAnim - 180) / 420) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 18.75 + (((tickAnim - 600) / 3) * (23.16-(18.75)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 629) {
            xx = 23.16 + (((tickAnim - 603) / 26) * (-1.59-(23.16)));
            yy = 0 + (((tickAnim - 603) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 26) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = -1.59 + (((tickAnim - 629) / 21) * (0-(-1.59)));
            yy = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 7.75 + (((tickAnim - 60) / 120) * (0-(7.75)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 600) / 5) * (9.5-(0)));
            yy = 0 + (((tickAnim - 600) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 5) * (0-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 629) {
            xx = 9.5 + (((tickAnim - 605) / 24) * (-15.1-(9.5)));
            yy = 0 + (((tickAnim - 605) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 605) / 24) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = -15.1 + (((tickAnim - 629) / 21) * (0-(-15.1)));
            yy = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 60) / 590) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 590) * (0-(0)));
            zz = 0.25 + (((tickAnim - 60) / 590) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 12.5 + (((tickAnim - 60) / 120) * (0-(12.5)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 0 + (((tickAnim - 600) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 624) {
            xx = -10 + (((tickAnim - 603) / 21) * (-1.015-(-10)));
            yy = 0 + (((tickAnim - 603) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 21) * (0-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 629) {
            xx = -1.015 + (((tickAnim - 624) / 5) * (-8.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(-1.015)));
            yy = 0 + (((tickAnim - 624) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 624) / 5) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = -8.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 629) / 21) * (0-(-8.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
            yy = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.575-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0.425 + (((tickAnim - 60) / 540) * (0-(0.425)));
            zz = 0.575 + (((tickAnim - 60) / 540) * (0-(0.575)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 24) * (0.02-(0)));
            zz = 0 + (((tickAnim - 600) / 24) * (0.27-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            yy = 0.02 + (((tickAnim - 624) / 26) * (0-(0.02)));
            zz = 0.27 + (((tickAnim - 624) / 26) * (0-(0.27)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 5.75 + (((tickAnim - 60) / 120) * (0-(5.75)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 0 + (((tickAnim - 600) / 3) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 610) {
            xx = -9.5 + (((tickAnim - 603) / 7) * (6.5-(-9.5)));
            yy = 0 + (((tickAnim - 603) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 7) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 650) {
            xx = 6.5 + (((tickAnim - 610) / 40) * (0-(6.5)));
            yy = 0 + (((tickAnim - 610) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 610) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 180) {
            xx = 19 + (((tickAnim - 30) / 150) * (0-(19)));
            yy = 0 + (((tickAnim - 30) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 150) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 600) / 5) * (14.75-(0)));
            yy = 0 + (((tickAnim - 600) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 5) * (0-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 615) {
            xx = 14.75 + (((tickAnim - 605) / 10) * (0-(14.75)));
            yy = 0 + (((tickAnim - 605) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 605) / 10) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 629) {
            xx = 0 + (((tickAnim - 615) / 14) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 615) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 615) / 14) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 638) {
            xx = -12.75 + (((tickAnim - 629) / 9) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 629) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 30) / 150) * (0-(0)));
            yy = 0.925 + (((tickAnim - 30) / 150) * (0-(0.925)));
            zz = 0 + (((tickAnim - 30) / 150) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 600) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 60) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 32) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 92) / 88) * (9-(0)));
            yy = 0 + (((tickAnim - 92) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 88) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 9 + (((tickAnim - 180) / 420) * (9-(9)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 9 + (((tickAnim - 600) / 3) * (23.25-(9)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 605) {
            xx = 23.25 + (((tickAnim - 603) / 2) * (0-(23.25)));
            yy = 0 + (((tickAnim - 603) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 2) * (0-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 605) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 605) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 605) / 15) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 629) {
            xx = 0 + (((tickAnim - 620) / 9) * (10.75-(0)));
            yy = 0 + (((tickAnim - 620) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 620) / 9) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 638) {
            xx = 10.75 + (((tickAnim - 629) / 9) * (0-(10.75)));
            yy = 0 + (((tickAnim - 629) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 92) {
            xx = -3.5 + (((tickAnim - 30) / 62) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 62) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 92) / 88) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 92) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 88) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = -4.5 + (((tickAnim - 180) / 420) * (-5-(-4.5)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = -5 + (((tickAnim - 600) / 3) * (6.87-(-5)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 620) {
            xx = 6.87 + (((tickAnim - 603) / 17) * (-10.75-(6.87)));
            yy = 0 + (((tickAnim - 603) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 17) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 629) {
            xx = -10.75 + (((tickAnim - 620) / 9) * (-12.75-(-10.75)));
            yy = 0 + (((tickAnim - 620) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 620) / 9) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = -12.75 + (((tickAnim - 629) / 21) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 0) / 593) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 593) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 593) * (0-(0)));
        }
        else if (tickAnim >= 593 && tickAnim < 629) {
            xx = 0 + (((tickAnim - 593) / 36) * (32.5-(0)));
            yy = 0 + (((tickAnim - 593) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 593) / 36) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = 32.5 + (((tickAnim - 629) / 21) * (0-(32.5)));
            yy = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 0) / 593) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 593) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 593) * (0-(0)));
        }
        else if (tickAnim >= 593 && tickAnim < 629) {
            xx = 0 + (((tickAnim - 593) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 593) / 36) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 593) / 36) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            yy = -0.25 + (((tickAnim - 629) / 21) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 270 && tickAnim < 279) {
            xx = 1 + (((tickAnim - 270) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 270) / 9) * (0.025-(1)));
            zz = 1 + (((tickAnim - 270) / 9) * (1-(1)));
        }
        else if (tickAnim >= 279 && tickAnim < 289) {
            xx = 1 + (((tickAnim - 279) / 10) * (1-(1)));
            yy = 0.025 + (((tickAnim - 279) / 10) * (1-(0.025)));
            zz = 1 + (((tickAnim - 279) / 10) * (1-(1)));
        }
        else if (tickAnim >= 289 && tickAnim < 574) {
            xx = 1 + (((tickAnim - 289) / 285) * (1-(1)));
            yy = 1 + (((tickAnim - 289) / 285) * (1-(1)));
            zz = 1 + (((tickAnim - 289) / 285) * (1-(1)));
        }
        else if (tickAnim >= 574 && tickAnim < 583) {
            xx = 1 + (((tickAnim - 574) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 574) / 9) * (0.025-(1)));
            zz = 1 + (((tickAnim - 574) / 9) * (1-(1)));
        }
        else if (tickAnim >= 583 && tickAnim < 593) {
            xx = 1 + (((tickAnim - 583) / 10) * (1-(1)));
            yy = 0.025 + (((tickAnim - 583) / 10) * (1-(0.025)));
            zz = 1 + (((tickAnim - 583) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 29 + (((tickAnim - 13) / 10) * (-16.2-(29)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -16.2 + (((tickAnim - 23) / 2) * (0-(-16.2)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (29-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 29 + (((tickAnim - 38) / 10) * (-16.2-(29)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -16.2 + (((tickAnim - 48) / 2) * (0-(-16.2)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.75 + (((tickAnim - 13) / 3) * (26.93434-(11.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (1.41877-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-1.96448-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 26.93434 + (((tickAnim - 16) / 7) * (32.75198-(26.93434)));
            yy = 1.41877 + (((tickAnim - 16) / 7) * (0.38694-(1.41877)));
            zz = -1.96448 + (((tickAnim - 16) / 7) * (-0.53577-(-1.96448)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 32.75198 + (((tickAnim - 23) / 2) * (0-(32.75198)));
            yy = 0.38694 + (((tickAnim - 23) / 2) * (0-(0.38694)));
            zz = -0.53577 + (((tickAnim - 23) / 2) * (0-(-0.53577)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 11.75 + (((tickAnim - 38) / 3) * (26.93434-(11.75)));
            yy = 0 + (((tickAnim - 38) / 3) * (1.41877-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (-1.96448-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 26.93434 + (((tickAnim - 41) / 4) * (26.93434-(26.93434)));
            yy = 1.41877 + (((tickAnim - 41) / 4) * (1.41877-(1.41877)));
            zz = -1.96448 + (((tickAnim - 41) / 4) * (-1.96448-(-1.96448)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.93434 + (((tickAnim - 45) / 5) * (0-(26.93434)));
            yy = 1.41877 + (((tickAnim - 45) / 5) * (0-(1.41877)));
            zz = -1.96448 + (((tickAnim - 45) / 5) * (0-(-1.96448)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.355-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.78-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.355 + (((tickAnim - 20) / 5) * (0-(1.355)));
            zz = -0.78 + (((tickAnim - 20) / 5) * (0-(-0.78)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0.675-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (-0.85-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 45) / 5) * (0-(0.675)));
            zz = -0.85 + (((tickAnim - 45) / 5) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 17 + (((tickAnim - 13) / 3) * (-11.28-(17)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -11.28 + (((tickAnim - 16) / 4) * (-31.78-(-11.28)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -31.78 + (((tickAnim - 20) / 5) * (0-(-31.78)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (17-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 17 + (((tickAnim - 38) / 3) * (-11.28-(17)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -11.28 + (((tickAnim - 41) / 4) * (-37.03-(-11.28)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -37.03 + (((tickAnim - 45) / 5) * (0-(-37.03)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 25.75 + (((tickAnim - 13) / 3) * (42.13-(25.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 42.13 + (((tickAnim - 16) / 4) * (72.76-(42.13)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 72.76 + (((tickAnim - 20) / 5) * (0-(72.76)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (25.75-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 25.75 + (((tickAnim - 38) / 3) * (42.13-(25.75)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 42.13 + (((tickAnim - 41) / 4) * (83.13-(42.13)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 83.13 + (((tickAnim - 45) / 5) * (0-(83.13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.265-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.21-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.265 + (((tickAnim - 6) / 7) * (0-(-0.265)));
            zz = -0.21 + (((tickAnim - 6) / 7) * (0-(-0.21)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0.15 + (((tickAnim - 16) / 9) * (0-(0.15)));
            zz = -0.575 + (((tickAnim - 16) / 9) * (0-(-0.575)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0.15-(0)));
            yy = 0.15 + (((tickAnim - 41) / 4) * (0.625-(0.15)));
            zz = -0.575 + (((tickAnim - 41) / 4) * (-1.375-(-0.575)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.15 + (((tickAnim - 45) / 5) * (0-(0.15)));
            yy = 0.625 + (((tickAnim - 45) / 5) * (0-(0.625)));
            zz = -1.375 + (((tickAnim - 45) / 5) * (0-(-1.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-15.52-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -15.52 + (((tickAnim - 6) / 10) * (26.75-(-15.52)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 26.75 + (((tickAnim - 16) / 9) * (0-(26.75)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (26.75-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.75 + (((tickAnim - 45) / 5) * (0-(26.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 29 + (((tickAnim - 13) / 10) * (-16.2-(29)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -16.2 + (((tickAnim - 23) / 2) * (0-(-16.2)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (29-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 29 + (((tickAnim - 38) / 10) * (-16.2-(29)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -16.2 + (((tickAnim - 48) / 2) * (0-(-16.2)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.75 + (((tickAnim - 13) / 3) * (26.93434-(11.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (1.41877-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-1.96448-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 26.93434 + (((tickAnim - 16) / 7) * (32.75198-(26.93434)));
            yy = 1.41877 + (((tickAnim - 16) / 7) * (0.38694-(1.41877)));
            zz = -1.96448 + (((tickAnim - 16) / 7) * (-0.53577-(-1.96448)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 32.75198 + (((tickAnim - 23) / 2) * (0-(32.75198)));
            yy = 0.38694 + (((tickAnim - 23) / 2) * (0-(0.38694)));
            zz = -0.53577 + (((tickAnim - 23) / 2) * (0-(-0.53577)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 11.75 + (((tickAnim - 38) / 3) * (26.93434-(11.75)));
            yy = 0 + (((tickAnim - 38) / 3) * (1.41877-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (-1.96448-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 26.93434 + (((tickAnim - 41) / 4) * (26.93434-(26.93434)));
            yy = 1.41877 + (((tickAnim - 41) / 4) * (1.41877-(1.41877)));
            zz = -1.96448 + (((tickAnim - 41) / 4) * (-1.96448-(-1.96448)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.93434 + (((tickAnim - 45) / 5) * (0-(26.93434)));
            yy = 1.41877 + (((tickAnim - 45) / 5) * (0-(1.41877)));
            zz = -1.96448 + (((tickAnim - 45) / 5) * (0-(-1.96448)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.355-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.78-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.355 + (((tickAnim - 20) / 5) * (0-(1.355)));
            zz = -0.78 + (((tickAnim - 20) / 5) * (0-(-0.78)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0.675-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (-0.85-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 45) / 5) * (0-(0.675)));
            zz = -0.85 + (((tickAnim - 45) / 5) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 17 + (((tickAnim - 13) / 3) * (-11.28-(17)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -11.28 + (((tickAnim - 16) / 4) * (-31.78-(-11.28)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -31.78 + (((tickAnim - 20) / 5) * (0-(-31.78)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (17-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 17 + (((tickAnim - 38) / 3) * (-11.28-(17)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -11.28 + (((tickAnim - 41) / 4) * (-37.03-(-11.28)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -37.03 + (((tickAnim - 45) / 5) * (0-(-37.03)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 25.75 + (((tickAnim - 13) / 3) * (42.13-(25.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 42.13 + (((tickAnim - 16) / 4) * (72.76-(42.13)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 72.76 + (((tickAnim - 20) / 5) * (0-(72.76)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (25.75-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 25.75 + (((tickAnim - 38) / 3) * (42.13-(25.75)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 42.13 + (((tickAnim - 41) / 4) * (83.13-(42.13)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 83.13 + (((tickAnim - 45) / 5) * (0-(83.13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.265-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.21-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.265 + (((tickAnim - 6) / 7) * (0-(-0.265)));
            zz = -0.21 + (((tickAnim - 6) / 7) * (0-(-0.21)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0.15 + (((tickAnim - 16) / 9) * (0-(0.15)));
            zz = -0.575 + (((tickAnim - 16) / 9) * (0-(-0.575)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0.15-(0)));
            yy = 0.15 + (((tickAnim - 41) / 4) * (0.625-(0.15)));
            zz = -0.575 + (((tickAnim - 41) / 4) * (-1.375-(-0.575)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.15 + (((tickAnim - 45) / 5) * (0-(0.15)));
            yy = 0.625 + (((tickAnim - 45) / 5) * (0-(0.625)));
            zz = -1.375 + (((tickAnim - 45) / 5) * (0-(-1.375)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (-15.52-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -15.52 + (((tickAnim - 6) / 10) * (26.75-(-15.52)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 26.75 + (((tickAnim - 16) / 9) * (0-(26.75)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (26.75-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.75 + (((tickAnim - 45) / 5) * (0-(26.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 20) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 30) / 20) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-14-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (8.85-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -14 + (((tickAnim - 20) / 10) * (-14-(-14)));
            zz = 8.85 + (((tickAnim - 20) / 10) * (8.85-(8.85)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -14 + (((tickAnim - 30) / 20) * (0-(-14)));
            zz = 8.85 + (((tickAnim - 30) / 20) * (0-(8.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -26.5 + (((tickAnim - 20) / 10) * (-26.5-(-26.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -26.5 + (((tickAnim - 30) / 20) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (49.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 49.5 + (((tickAnim - 20) / 10) * (49.5-(49.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 49.5 + (((tickAnim - 30) / 20) * (0-(49.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            zz = -2 + (((tickAnim - 20) / 10) * (-2-(-2)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
            zz = -2 + (((tickAnim - 30) / 20) * (0-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -46.75 + (((tickAnim - 20) / 10) * (-46.75-(-46.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -46.75 + (((tickAnim - 30) / 20) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.525 + (((tickAnim - 20) / 10) * (1.525-(1.525)));
            zz = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.525 + (((tickAnim - 30) / 20) * (0-(1.525)));
            zz = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 35 + (((tickAnim - 20) / 10) * (35-(35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 35 + (((tickAnim - 30) / 20) * (0-(35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.75 + (((tickAnim - 20) / 10) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 30) / 20) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.75 + (((tickAnim - 20) / 10) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 30) / 20) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 20) / 10) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 30) / 20) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 20) / 10) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 30) / 5) * (1.31-(10.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.31 + (((tickAnim - 35) / 15) * (0-(1.31)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.9-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.9 + (((tickAnim - 20) / 10) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.9 + (((tickAnim - 30) / 20) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 30) / 5) * (2.38-(7.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.38 + (((tickAnim - 35) / 15) * (0-(2.38)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (14.25-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.25 + (((tickAnim - 20) / 10) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 14.25 + (((tickAnim - 30) / 8) * (0-(14.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (4.25-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.25 + (((tickAnim - 20) / 10) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 4.25 + (((tickAnim - 30) / 4) * (12.56-(4.25)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 12.56 + (((tickAnim - 34) / 4) * (0-(12.56)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (7-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7 + (((tickAnim - 20) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 7 + (((tickAnim - 30) / 4) * (13.79-(7)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 13.79 + (((tickAnim - 34) / 2) * (23.5-(13.79)));
            yy = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 23.5 + (((tickAnim - 36) / 2) * (18.5-(23.5)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 18.5 + (((tickAnim - 38) / 2) * (0-(18.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
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
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.75 + (((tickAnim - 20) / 10) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 30) / 20) * (0-(4.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8 + (((tickAnim - 20) / 10) * (8-(8)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8 + (((tickAnim - 30) / 20) * (0-(8)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -26.5 + (((tickAnim - 20) / 10) * (-26.5-(-26.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -26.5 + (((tickAnim - 30) / 20) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (49.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 49.5 + (((tickAnim - 20) / 10) * (49.5-(49.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 49.5 + (((tickAnim - 30) / 20) * (0-(49.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            zz = -2 + (((tickAnim - 20) / 10) * (-2-(-2)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
            zz = -2 + (((tickAnim - 30) / 20) * (0-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -46.75 + (((tickAnim - 20) / 10) * (-46.75-(-46.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -46.75 + (((tickAnim - 30) / 20) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.525 + (((tickAnim - 20) / 10) * (1.525-(1.525)));
            zz = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.525 + (((tickAnim - 30) / 20) * (0-(1.525)));
            zz = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 35 + (((tickAnim - 20) / 10) * (35-(35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 35 + (((tickAnim - 30) / 20) * (0-(35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 14) / 21) * (0-(7.5)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 14) / 21) * (0-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.275-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0.275 + (((tickAnim - 14) / 21) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 14) / 21) * (0-(-5)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5 + (((tickAnim - 14) / 10) * (-13.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -13.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5 + (((tickAnim - 24) / 11) * (0-(-13.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.05 + (((tickAnim - 14) / 10) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.05)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01 + (((tickAnim - 24) / 11) * (0-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 3.5 + (((tickAnim - 14) / 10) * (1.25-(3.5)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 1.25 + (((tickAnim - 24) / 11) * (0-(1.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 14) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.01-(1)));
            zz = 1 + (((tickAnim - 0) / 14) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 14) / 10) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.01 + (((tickAnim - 14) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.01)));
            zz = 1 + (((tickAnim - 14) / 10) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 24) / 11) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.01 + (((tickAnim - 24) / 11) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.01)));
            zz = 1 + (((tickAnim - 24) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 8.5 + (((tickAnim - 14) / 10) * (19.25-(8.5)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 19.25 + (((tickAnim - 24) / 11) * (0-(19.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.05-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 14) / 10) * (-0.25-(0.025)));
            zz = -0.05 + (((tickAnim - 14) / 10) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = -0.25 + (((tickAnim - 24) / 11) * (0-(-0.25)));
            zz = -0.05 + (((tickAnim - 24) / 11) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 14) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.1-(1)));
            zz = 1 + (((tickAnim - 0) / 14) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 14) / 10) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.1 + (((tickAnim - 14) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.1)));
            zz = 1 + (((tickAnim - 14) / 10) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 24) / 11) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.1 + (((tickAnim - 24) / 11) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.1)));
            zz = 1 + (((tickAnim - 24) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 11.75 + (((tickAnim - 18) / 11) * (12.5-(11.75)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = 12.5 + (((tickAnim - 29) / 22) * (0-(12.5)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -18 + (((tickAnim - 18) / 11) * (-19.75-(-18)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = -19.75 + (((tickAnim - 29) / 22) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = 10 + (((tickAnim - 29) / 22) * (0-(10)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0.7-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0.7 + (((tickAnim - 29) / 22) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = -8 + (((tickAnim - 29) / 22) * (0-(-8)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -14 + (((tickAnim - 18) / 11) * (-16.25-(-14)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = -16.25 + (((tickAnim - 29) / 22) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = 18 + (((tickAnim - 16) / 13) * (29.75-(18)));
            yy = 0 + (((tickAnim - 16) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 13) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 41) {
            xx = 29.75 + (((tickAnim - 29) / 12) * (0-(29.75)));
            yy = 0 + (((tickAnim - 29) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = -7.75 + (((tickAnim - 16) / 13) * (-14.75-(-7.75)));
            yy = 0 + (((tickAnim - 16) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 13) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 41) {
            xx = -14.75 + (((tickAnim - 29) / 12) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 29) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 41) {
            xx = 7 + (((tickAnim - 29) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 29) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));

        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(0);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(0);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(0);

        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 0) / 29) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 29) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 29) * (1.2-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 18) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 0) / 18) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 18) / 11) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 18) / 11) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 18) / 11) * (1-(1)));
        }
        else if (tickAnim >= 29 && tickAnim < 41) {
            xx = 1 + (((tickAnim - 29) / 12) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 29) / 12) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 29) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.9-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = -2.9 + (((tickAnim - 20) / 25) * (-2.9-(-2.9)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = -2.9 + (((tickAnim - 45) / 20) * (0-(-2.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 12.25 + (((tickAnim - 20) / 25) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 12.25 + (((tickAnim - 45) / 20) * (0-(12.25)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = -0.85 + (((tickAnim - 20) / 25) * (-0.85-(-0.85)));
            zz = -0.975 + (((tickAnim - 20) / 25) * (-0.975-(-0.975)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -0.85 + (((tickAnim - 45) / 20) * (0-(-0.85)));
            zz = -0.975 + (((tickAnim - 45) / 20) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -13.5 + (((tickAnim - 20) / 25) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -13.5 + (((tickAnim - 45) / 20) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(0), lefttoes.rotateAngleY + (float) Math.toRadians(0), lefttoes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.44-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.44 + (((tickAnim - 15) / 5) * (-22.25-(-22.44)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -22.25 + (((tickAnim - 20) / 25) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -22.25 + (((tickAnim - 45) / 20) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (19.97-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 19.97 + (((tickAnim - 4) / 6) * (4.13-(19.97)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.13 + (((tickAnim - 10) / 10) * (-14.75-(4.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -14.75 + (((tickAnim - 20) / 25) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = -14.75 + (((tickAnim - 45) / 11) * (34.74-(-14.75)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 34.74 + (((tickAnim - 56) / 9) * (0-(34.74)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40.87-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -40.87 + (((tickAnim - 10) / 10) * (16.75-(-40.87)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 16.75 + (((tickAnim - 20) / 25) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 16.75 + (((tickAnim - 45) / 11) * (-35.82-(16.75)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -35.82 + (((tickAnim - 56) / 9) * (0-(-35.82)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-1.675-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-1.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = -1.675 + (((tickAnim - 20) / 25) * (-1.675-(-1.675)));
            zz = -1.025 + (((tickAnim - 20) / 25) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            yy = -1.675 + (((tickAnim - 45) / 11) * (1.68-(-1.675)));
            zz = -1.025 + (((tickAnim - 45) / 11) * (-0.02-(-1.025)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            yy = 1.68 + (((tickAnim - 56) / 9) * (0-(1.68)));
            zz = -0.02 + (((tickAnim - 56) / 9) * (0-(-0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (85.88-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 85.88 + (((tickAnim - 10) / 10) * (21.25-(85.88)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 21.25 + (((tickAnim - 20) / 25) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 21.25 + (((tickAnim - 45) / 11) * (79.24-(21.25)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 79.24 + (((tickAnim - 56) / 9) * (0-(79.24)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0.22353-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-8.7432-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0.34621-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0.22353 + (((tickAnim - 45) / 20) * (0-(0.22353)));
            yy = -8.7432 + (((tickAnim - 45) / 20) * (0-(-8.7432)));
            zz = 0.34621 + (((tickAnim - 45) / 20) * (0-(0.34621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-10.25-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -10.25 + (((tickAnim - 45) / 20) * (0-(-10.25)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-12.25-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -12.25 + (((tickAnim - 45) / 20) * (0-(-12.25)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-9.75-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -9.75 + (((tickAnim - 45) / 20) * (0-(-9.75)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-11-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -11 + (((tickAnim - 45) / 20) * (0-(-11)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-15.25-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -15.25 + (((tickAnim - 45) / 20) * (0-(-15.25)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (14.8-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 18) / 27) * (0-(0)));
            yy = 14.8 + (((tickAnim - 18) / 27) * (-16.25-(14.8)));
            zz = 0 + (((tickAnim - 18) / 27) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = -16.25 + (((tickAnim - 45) / 6) * (-26.76-(-16.25)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 51) / 14) * (0-(0)));
            yy = -26.76 + (((tickAnim - 51) / 14) * (0-(-26.76)));
            zz = 0 + (((tickAnim - 51) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (19.39-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 19.39 + (((tickAnim - 18) / 11) * (28.82-(19.39)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 29) / 16) * (0-(0)));
            yy = 28.82 + (((tickAnim - 29) / 16) * (-18.25-(28.82)));
            zz = 0 + (((tickAnim - 29) / 16) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = -18.25 + (((tickAnim - 45) / 6) * (-35.18-(-18.25)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 51) / 7) * (0-(0)));
            yy = -35.18 + (((tickAnim - 51) / 7) * (-35.06-(-35.18)));
            zz = 0 + (((tickAnim - 51) / 7) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            yy = -35.06 + (((tickAnim - 58) / 7) * (0-(-35.06)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 20) / 15) * (-3-(1)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -3 + (((tickAnim - 35) / 10) * (0-(-3)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 4.25 + (((tickAnim - 20) / 15) * (0.25-(4.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0.25 + (((tickAnim - 35) / 10) * (0-(0.25)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 20) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 45) * (0-(0)));
            zz = 0.375 + (((tickAnim - 20) / 45) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 30) / 5) * (13.35479-(19.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (2.25207-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-7.25831-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 13.35479 + (((tickAnim - 35) / 5) * (19.5-(13.35479)));
            yy = 2.25207 + (((tickAnim - 35) / 5) * (0-(2.25207)));
            zz = -7.25831 + (((tickAnim - 35) / 5) * (0-(-7.25831)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 19.5 + (((tickAnim - 40) / 5) * (16-(19.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 16 + (((tickAnim - 45) / 20) * (0-(16)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 30) / 5) * (24.18495-(6.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (6.9399-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-2.15118-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 24.18495 + (((tickAnim - 35) / 5) * (6.5-(24.18495)));
            yy = 6.9399 + (((tickAnim - 35) / 5) * (0-(6.9399)));
            zz = -2.15118 + (((tickAnim - 35) / 5) * (0-(-2.15118)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 6.5 + (((tickAnim - 40) / 5) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 6.5 + (((tickAnim - 45) / 20) * (0-(6.5)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 4.75 + (((tickAnim - 30) / 5) * (1.0594-(4.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (-4.50402-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-1.51031-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.0594 + (((tickAnim - 35) / 5) * (4.75-(1.0594)));
            yy = -4.50402 + (((tickAnim - 35) / 5) * (0-(-4.50402)));
            zz = -1.51031 + (((tickAnim - 35) / 5) * (0-(-1.51031)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 4.75 + (((tickAnim - 40) / 5) * (2-(4.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 2 + (((tickAnim - 45) / 20) * (0-(2)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.03896-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (10.67898-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (4.92992-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5.03896 + (((tickAnim - 30) / 5) * (-12.97178-(-5.03896)));
            yy = 10.67898 + (((tickAnim - 30) / 5) * (-8.05161-(10.67898)));
            zz = 4.92992 + (((tickAnim - 30) / 5) * (4.81583-(4.92992)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -12.97178 + (((tickAnim - 35) / 5) * (-5.5-(-12.97178)));
            yy = -8.05161 + (((tickAnim - 35) / 5) * (0-(-8.05161)));
            zz = 4.81583 + (((tickAnim - 35) / 5) * (0-(4.81583)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5.5 + (((tickAnim - 40) / 5) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -5.5 + (((tickAnim - 45) / 20) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.55-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 35) / 5) * (0-(-0.325)));
            zz = -0.55 + (((tickAnim - 35) / 5) * (0-(-0.55)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 30) * (-10.8188-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.41315-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-5.57421-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10.8188 + (((tickAnim - 30) / 10) * (-10.75-(-10.8188)));
            yy = 1.41315 + (((tickAnim - 30) / 10) * (0-(1.41315)));
            zz = -5.57421 + (((tickAnim - 30) / 10) * (0-(-5.57421)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -10.75 + (((tickAnim - 40) / 5) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -10.75 + (((tickAnim - 45) / 20) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-19.96748-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.58202-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-8.81107-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -19.96748 + (((tickAnim - 30) / 5) * (2.75-(-19.96748)));
            yy = -0.58202 + (((tickAnim - 30) / 5) * (0-(-0.58202)));
            zz = -8.81107 + (((tickAnim - 30) / 5) * (0-(-8.81107)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 35) / 5) * (-19.75-(2.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -19.75 + (((tickAnim - 40) / 5) * (-13.25-(-19.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -13.25 + (((tickAnim - 45) / 20) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 26.75 + (((tickAnim - 30) / 5) * (0-(26.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (26.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 26.75 + (((tickAnim - 40) / 5) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 26.75 + (((tickAnim - 45) / 20) * (0-(26.75)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -3.5 + (((tickAnim - 30) / 5) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (-3.5-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -3.5 + (((tickAnim - 45) / 20) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw1, leftJaw1.rotateAngleX + (float) Math.toRadians(xx), leftJaw1.rotateAngleY + (float) Math.toRadians(yy), leftJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 5.5 + (((tickAnim - 30) / 5) * (0-(5.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (5.5-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 5.5 + (((tickAnim - 45) / 20) * (0-(5.5)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw2, leftJaw2.rotateAngleX + (float) Math.toRadians(xx), leftJaw2.rotateAngleY + (float) Math.toRadians(yy), leftJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (3-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 3 + (((tickAnim - 30) / 5) * (0-(3)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (3-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 3 + (((tickAnim - 45) / 20) * (0-(3)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw1, rightJaw1.rotateAngleX + (float) Math.toRadians(xx), rightJaw1.rotateAngleY + (float) Math.toRadians(yy), rightJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -5.5 + (((tickAnim - 30) / 5) * (0-(-5.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (-5.5-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -5.5 + (((tickAnim - 45) / 20) * (0-(-5.5)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw2, rightJaw2.rotateAngleX + (float) Math.toRadians(xx), rightJaw2.rotateAngleY + (float) Math.toRadians(yy), rightJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (-3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 4.25 + (((tickAnim - 29) / 11) * (0-(4.25)));
            yy = -3.75 + (((tickAnim - 29) / 11) * (0.88-(-3.75)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0.88 + (((tickAnim - 40) / 25) * (0-(0.88)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = -0.125 + (((tickAnim - 40) / 25) * (0-(-0.125)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (10.75428-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (-6.28981-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (10.37944-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 10.75428 + (((tickAnim - 29) / 1) * (12.25-(10.75428)));
            yy = -6.28981 + (((tickAnim - 29) / 1) * (0-(-6.28981)));
            zz = 10.37944 + (((tickAnim - 29) / 1) * (0-(10.37944)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 30) / 5) * (23.52005-(12.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (3.43562-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.66863-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 23.52005 + (((tickAnim - 35) / 5) * (12.25-(23.52005)));
            yy = 3.43562 + (((tickAnim - 35) / 5) * (0-(3.43562)));
            zz = 0.66863 + (((tickAnim - 35) / 5) * (0-(0.66863)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 12.25 + (((tickAnim - 40) / 5) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 12.25 + (((tickAnim - 45) / 20) * (0-(12.25)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -0.3 + (((tickAnim - 29) / 11) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -23.18591 + (((tickAnim - 0) / 23) * (27.7228-(-23.18591)));
            yy = 1.77481 + (((tickAnim - 0) / 23) * (-1.28005-(1.77481)));
            zz = 4.13588 + (((tickAnim - 0) / 23) * (2.43412-(4.13588)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.7228 + (((tickAnim - 23) / 10) * (1.36062-(27.7228)));
            yy = -1.28005 + (((tickAnim - 23) / 10) * (0.23405-(-1.28005)));
            zz = 2.43412 + (((tickAnim - 23) / 10) * (-0.2433-(2.43412)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 1.36062 + (((tickAnim - 33) / 9) * (-18.88721-(1.36062)));
            yy = 0.23405 + (((tickAnim - 33) / 9) * (1.13424-(0.23405)));
            zz = -0.2433 + (((tickAnim - 33) / 9) * (3.31134-(-0.2433)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -18.88721 + (((tickAnim - 42) / 3) * (-23.18591-(-18.88721)));
            yy = 1.13424 + (((tickAnim - 42) / 3) * (1.77481-(1.13424)));
            zz = 3.31134 + (((tickAnim - 42) / 3) * (4.13588-(3.31134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -5.5 + (((tickAnim - 0) / 23) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (27.81-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 27.81 + (((tickAnim - 28) / 8) * (25.4-(27.81)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 25.4 + (((tickAnim - 36) / 9) * (-5.5-(25.4)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -0.875 + (((tickAnim - 0) / 23) * (-0.825-(-0.875)));
            zz = -0.55 + (((tickAnim - 0) / 23) * (0-(-0.55)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.825 + (((tickAnim - 23) / 5) * (0.48-(-0.825)));
            zz = 0 + (((tickAnim - 23) / 5) * (-1.035-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 0.48 + (((tickAnim - 28) / 8) * (0.825-(0.48)));
            zz = -1.035 + (((tickAnim - 28) / 8) * (-1.19-(-1.035)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            yy = 0.825 + (((tickAnim - 36) / 9) * (-0.875-(0.825)));
            zz = -1.19 + (((tickAnim - 36) / 9) * (-0.55-(-1.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 11.25 + (((tickAnim - 0) / 10) * (-5.25-(11.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -5.25 + (((tickAnim - 10) / 13) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (3.49-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 3.49 + (((tickAnim - 26) / 8) * (-41.17-(3.49)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -41.17 + (((tickAnim - 34) / 4) * (-52.92-(-41.17)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -52.92 + (((tickAnim - 38) / 7) * (11.25-(-52.92)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 10) * (0.635-(-0.75)));
            zz = -0.475 + (((tickAnim - 0) / 10) * (-0.54-(-0.475)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0.635 + (((tickAnim - 10) / 13) * (-0.625-(0.635)));
            zz = -0.54 + (((tickAnim - 10) / 13) * (-0.625-(-0.54)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = -0.625 + (((tickAnim - 23) / 11) * (1.66-(-0.625)));
            zz = -0.625 + (((tickAnim - 23) / 11) * (-0.4-(-0.625)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 1.66 + (((tickAnim - 34) / 4) * (1.66-(1.66)));
            zz = -0.4 + (((tickAnim - 34) / 4) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 1.66 + (((tickAnim - 38) / 7) * (-0.75-(1.66)));
            zz = -0.4 + (((tickAnim - 38) / 7) * (-0.475-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.12343 + (((tickAnim - 0) / 5) * (11.56171-(17.12343)));
            yy = 2.05273 + (((tickAnim - 0) / 5) * (1.02637-(2.05273)));
            zz = -4.77787 + (((tickAnim - 0) / 5) * (-2.38893-(-4.77787)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11.56171 + (((tickAnim - 5) / 5) * (8.45411-(11.56171)));
            yy = 1.02637 + (((tickAnim - 5) / 5) * (0.88527-(1.02637)));
            zz = -2.38893 + (((tickAnim - 5) / 5) * (-5.93457-(-2.38893)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 8.45411 + (((tickAnim - 10) / 13) * (35.53122-(8.45411)));
            yy = 0.88527 + (((tickAnim - 10) / 13) * (-2.23853-(0.88527)));
            zz = -5.93457 + (((tickAnim - 10) / 13) * (-1.59775-(-5.93457)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 35.53122 + (((tickAnim - 23) / 6) * (73.15497-(35.53122)));
            yy = -2.23853 + (((tickAnim - 23) / 6) * (0.12781-(-2.23853)));
            zz = -1.59775 + (((tickAnim - 23) / 6) * (0.00005-(-1.59775)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 73.15497 + (((tickAnim - 29) / 5) * (75.52826-(73.15497)));
            yy = 0.12781 + (((tickAnim - 29) / 5) * (0.29822-(0.12781)));
            zz = 0.00005 + (((tickAnim - 29) / 5) * (0.00011-(0.00005)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 75.52826 + (((tickAnim - 34) / 4) * (75.52826-(75.52826)));
            yy = 0.29822 + (((tickAnim - 34) / 4) * (0.29822-(0.29822)));
            zz = 0.00011 + (((tickAnim - 34) / 4) * (0.00011-(0.00011)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 75.52826 + (((tickAnim - 38) / 7) * (17.12343-(75.52826)));
            yy = 0.29822 + (((tickAnim - 38) / 7) * (2.05273-(0.29822)));
            zz = 0.00011 + (((tickAnim - 38) / 7) * (-4.77787-(0.00011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 3) * (1.135-(0.55)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.06-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.135 + (((tickAnim - 3) / 2) * (0.875-(1.135)));
            zz = -0.06 + (((tickAnim - 3) / 2) * (-0.13-(-0.06)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.875 + (((tickAnim - 5) / 5) * (-0.035-(0.875)));
            zz = -0.13 + (((tickAnim - 5) / 5) * (-0.26-(-0.13)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.035 + (((tickAnim - 10) / 7) * (1.865-(-0.035)));
            zz = -0.26 + (((tickAnim - 10) / 7) * (-0.43-(-0.26)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.865 + (((tickAnim - 17) / 3) * (1.915-(1.865)));
            zz = -0.43 + (((tickAnim - 17) / 3) * (-0.51-(-0.43)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.915 + (((tickAnim - 20) / 3) * (0.675-(1.915)));
            zz = -0.51 + (((tickAnim - 20) / 3) * (-0.575-(-0.51)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.675 + (((tickAnim - 23) / 6) * (1.575-(0.675)));
            zz = -0.575 + (((tickAnim - 23) / 6) * (0.25-(-0.575)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = 1.575 + (((tickAnim - 29) / 5) * (0.34-(1.575)));
            zz = 0.25 + (((tickAnim - 29) / 5) * (-0.28-(0.25)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0.34 + (((tickAnim - 34) / 4) * (0.34-(0.34)));
            zz = -0.28 + (((tickAnim - 34) / 4) * (-0.28-(-0.28)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0.34 + (((tickAnim - 38) / 7) * (0.55-(0.34)));
            zz = -0.28 + (((tickAnim - 38) / 7) * (0-(-0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-62.75-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -62.75 + (((tickAnim - 23) / 6) * (30.25-(-62.75)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 30.25 + (((tickAnim - 29) / 5) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 30.25 + (((tickAnim - 34) / 11) * (0-(30.25)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-0.475-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 6) * (-0.35-(0)));
            zz = -0.475 + (((tickAnim - 23) / 6) * (-0.23-(-0.475)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 29) / 5) * (-0.35-(-0.35)));
            zz = -0.23 + (((tickAnim - 29) / 5) * (-0.23-(-0.23)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = -0.35 + (((tickAnim - 34) / 11) * (0-(-0.35)));
            zz = -0.23 + (((tickAnim - 34) / 11) * (0-(-0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 27.7228 + (((tickAnim - 0) / 11) * (1.36062-(27.7228)));
            yy = 1.28005 + (((tickAnim - 0) / 11) * (0.23405-(1.28005)));
            zz = -2.43412 + (((tickAnim - 0) / 11) * (-0.2433-(-2.43412)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 1.36062 + (((tickAnim - 11) / 8) * (-18.88721-(1.36062)));
            yy = 0.23405 + (((tickAnim - 11) / 8) * (-1.13424-(0.23405)));
            zz = -0.2433 + (((tickAnim - 11) / 8) * (-3.31134-(-0.2433)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -18.88721 + (((tickAnim - 19) / 4) * (-23.18591-(-18.88721)));
            yy = -1.13424 + (((tickAnim - 19) / 4) * (-1.77481-(-1.13424)));
            zz = -3.31134 + (((tickAnim - 19) / 4) * (-4.13588-(-3.31134)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -23.18591 + (((tickAnim - 23) / 22) * (27.7228-(-23.18591)));
            yy = -1.77481 + (((tickAnim - 23) / 22) * (1.28005-(-1.77481)));
            zz = -4.13588 + (((tickAnim - 23) / 22) * (-2.43412-(-4.13588)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (27.81-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 27.81 + (((tickAnim - 5) / 8) * (25.4-(27.81)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 25.4 + (((tickAnim - 13) / 10) * (-5.5-(25.4)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -5.5 + (((tickAnim - 23) / 22) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.825 + (((tickAnim - 0) / 5) * (0.48-(-0.825)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.035-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.48 + (((tickAnim - 5) / 8) * (0.825-(0.48)));
            zz = -1.035 + (((tickAnim - 5) / 8) * (-1.19-(-1.035)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 13) / 10) * (-0.875-(0.825)));
            zz = -1.19 + (((tickAnim - 13) / 10) * (-0.55-(-1.19)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = -0.875 + (((tickAnim - 23) / 22) * (-0.825-(-0.875)));
            zz = -0.55 + (((tickAnim - 23) / 22) * (0-(-0.55)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 3.49 + (((tickAnim - 3) / 9) * (-41.17-(3.49)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -41.17 + (((tickAnim - 12) / 4) * (-52.92-(-41.17)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -52.92 + (((tickAnim - 16) / 7) * (11.25-(-52.92)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 11.25 + (((tickAnim - 23) / 10) * (-5.25-(11.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -5.25 + (((tickAnim - 33) / 12) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 12) * (1.66-(-0.625)));
            zz = -0.625 + (((tickAnim - 0) / 12) * (-0.4-(-0.625)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.66 + (((tickAnim - 12) / 4) * (1.66-(1.66)));
            zz = -0.4 + (((tickAnim - 12) / 4) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 1.66 + (((tickAnim - 16) / 7) * (-0.75-(1.66)));
            zz = -0.4 + (((tickAnim - 16) / 7) * (-0.475-(-0.4)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 23) / 10) * (0.635-(-0.75)));
            zz = -0.475 + (((tickAnim - 23) / 10) * (-0.54-(-0.475)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            yy = 0.635 + (((tickAnim - 33) / 12) * (-0.625-(0.635)));
            zz = -0.54 + (((tickAnim - 33) / 12) * (-0.625-(-0.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 35.53122 + (((tickAnim - 0) / 7) * (73.15497-(35.53122)));
            yy = 2.23853 + (((tickAnim - 0) / 7) * (0.12781-(2.23853)));
            zz = 1.59775 + (((tickAnim - 0) / 7) * (0.00005-(1.59775)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 73.15497 + (((tickAnim - 7) / 5) * (75.52826-(73.15497)));
            yy = 0.12781 + (((tickAnim - 7) / 5) * (0.29822-(0.12781)));
            zz = 0.00005 + (((tickAnim - 7) / 5) * (0.00011-(0.00005)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 75.52826 + (((tickAnim - 12) / 4) * (75.52826-(75.52826)));
            yy = 0.29822 + (((tickAnim - 12) / 4) * (0.29822-(0.29822)));
            zz = 0.00011 + (((tickAnim - 12) / 4) * (0.00011-(0.00011)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 75.52826 + (((tickAnim - 16) / 7) * (17.12343-(75.52826)));
            yy = 0.29822 + (((tickAnim - 16) / 7) * (2.05273-(0.29822)));
            zz = 0.00011 + (((tickAnim - 16) / 7) * (4.77787-(0.00011)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 17.12343 + (((tickAnim - 23) / 5) * (11.56171-(17.12343)));
            yy = 2.05273 + (((tickAnim - 23) / 5) * (1.02637-(2.05273)));
            zz = 4.77787 + (((tickAnim - 23) / 5) * (2.38893-(4.77787)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 11.56171 + (((tickAnim - 28) / 5) * (8.45411-(11.56171)));
            yy = 1.02637 + (((tickAnim - 28) / 5) * (0.88527-(1.02637)));
            zz = 2.38893 + (((tickAnim - 28) / 5) * (5.93457-(2.38893)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 8.45411 + (((tickAnim - 33) / 12) * (35.53122-(8.45411)));
            yy = 0.88527 + (((tickAnim - 33) / 12) * (2.23853-(0.88527)));
            zz = 5.93457 + (((tickAnim - 33) / 12) * (1.59775-(5.93457)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.975 + (((tickAnim - 0) / 7) * (1.575-(0.975)));
            zz = -0.575 + (((tickAnim - 0) / 7) * (0.25-(-0.575)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 1.575 + (((tickAnim - 7) / 5) * (0.34-(1.575)));
            zz = 0.25 + (((tickAnim - 7) / 5) * (-0.28-(0.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.34 + (((tickAnim - 12) / 4) * (0.34-(0.34)));
            zz = -0.28 + (((tickAnim - 12) / 4) * (-0.28-(-0.28)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.34 + (((tickAnim - 16) / 7) * (0.425-(0.34)));
            zz = -0.28 + (((tickAnim - 16) / 7) * (0-(-0.28)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 23) / 2) * (1.135-(0.425)));
            zz = 0 + (((tickAnim - 23) / 2) * (-0.06-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 1.135 + (((tickAnim - 25) / 3) * (0.875-(1.135)));
            zz = -0.06 + (((tickAnim - 25) / 3) * (-0.13-(-0.06)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.875 + (((tickAnim - 28) / 5) * (-0.035-(0.875)));
            zz = -0.13 + (((tickAnim - 28) / 5) * (-0.26-(-0.13)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = -0.035 + (((tickAnim - 33) / 6) * (1.865-(-0.035)));
            zz = -0.26 + (((tickAnim - 33) / 6) * (-0.43-(-0.26)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 1.865 + (((tickAnim - 39) / 4) * (1.915-(1.865)));
            zz = -0.43 + (((tickAnim - 39) / 4) * (-0.51-(-0.43)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 1.915 + (((tickAnim - 43) / 2) * (0.975-(1.915)));
            zz = -0.51 + (((tickAnim - 43) / 2) * (-0.575-(-0.51)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -62.75 + (((tickAnim - 0) / 7) * (30.25-(-62.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 30.25 + (((tickAnim - 7) / 5) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 30.25 + (((tickAnim - 12) / 11) * (0-(30.25)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (-62.75-(0)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.35-(0)));
            zz = -0.475 + (((tickAnim - 0) / 7) * (-0.23-(-0.475)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 7) / 5) * (-0.35-(-0.35)));
            zz = -0.23 + (((tickAnim - 7) / 5) * (-0.23-(-0.23)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = -0.35 + (((tickAnim - 12) / 11) * (0-(-0.35)));
            zz = -0.23 + (((tickAnim - 12) / 11) * (0-(-0.23)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (-0.475-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-20))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*0.8), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-80))*0.7);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-150))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-90))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-200))*2.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-100))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-90))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-250))*3.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-150))*2), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-300))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*4), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-350))*4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-200))*6), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-400))*4.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-250))*8), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-450))*5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-280))*12), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-500))*5.5), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-300))*14), tail8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*-0.8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-200))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*-1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-220))*-1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-280))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-320))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-400))*2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-350))*-2), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-400))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-400))*2), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-150))*-3), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*1));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-250))*-3), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*1));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-150))*-3), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*1));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-250))*-3), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*1));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSuchomimus entity = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -23.18591 + (((tickAnim - 0) / 13) * (27.7228-(-23.18591)));
            yy = 1.77481 + (((tickAnim - 0) / 13) * (-1.28005-(1.77481)));
            zz = 4.13588 + (((tickAnim - 0) / 13) * (2.43412-(4.13588)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 27.7228 + (((tickAnim - 13) / 5) * (1.36062-(27.7228)));
            yy = -1.28005 + (((tickAnim - 13) / 5) * (0.23405-(-1.28005)));
            zz = 2.43412 + (((tickAnim - 13) / 5) * (-0.2433-(2.43412)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.36062 + (((tickAnim - 18) / 5) * (-18.88721-(1.36062)));
            yy = 0.23405 + (((tickAnim - 18) / 5) * (1.13424-(0.23405)));
            zz = -0.2433 + (((tickAnim - 18) / 5) * (3.31134-(-0.2433)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -18.88721 + (((tickAnim - 23) / 2) * (-23.18591-(-18.88721)));
            yy = 1.13424 + (((tickAnim - 23) / 2) * (1.77481-(1.13424)));
            zz = 3.31134 + (((tickAnim - 23) / 2) * (4.13588-(3.31134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -5.5 + (((tickAnim - 0) / 13) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (27.81-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 27.81 + (((tickAnim - 15) / 5) * (25.4-(27.81)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.4 + (((tickAnim - 20) / 5) * (-5.5-(25.4)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.875 + (((tickAnim - 0) / 13) * (-0.825-(-0.875)));
            zz = -0.55 + (((tickAnim - 0) / 13) * (0-(-0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.825 + (((tickAnim - 13) / 2) * (0.48-(-0.825)));
            zz = 0 + (((tickAnim - 13) / 2) * (-1.035-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.48 + (((tickAnim - 15) / 5) * (0.825-(0.48)));
            zz = -1.035 + (((tickAnim - 15) / 5) * (-1.19-(-1.035)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 5) * (-0.875-(0.825)));
            zz = -1.19 + (((tickAnim - 20) / 5) * (-0.55-(-1.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 11.25 + (((tickAnim - 0) / 6) * (-5.25-(11.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -5.25 + (((tickAnim - 6) / 7) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (3.49-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 14) / 5) * (-41.17-(3.49)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -41.17 + (((tickAnim - 19) / 2) * (-52.92-(-41.17)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -52.92 + (((tickAnim - 21) / 4) * (11.25-(-52.92)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 6) * (0.635-(-0.75)));
            zz = -0.475 + (((tickAnim - 0) / 6) * (-0.54-(-0.475)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.635 + (((tickAnim - 6) / 7) * (-0.625-(0.635)));
            zz = -0.54 + (((tickAnim - 6) / 7) * (-0.625-(-0.54)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = -0.625 + (((tickAnim - 13) / 6) * (1.66-(-0.625)));
            zz = -0.625 + (((tickAnim - 13) / 6) * (-0.4-(-0.625)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 1.66 + (((tickAnim - 19) / 2) * (1.66-(1.66)));
            zz = -0.4 + (((tickAnim - 19) / 2) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 1.66 + (((tickAnim - 21) / 4) * (-0.75-(1.66)));
            zz = -0.4 + (((tickAnim - 21) / 4) * (-0.475-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.12343 + (((tickAnim - 0) / 3) * (11.56171-(17.12343)));
            yy = 2.05273 + (((tickAnim - 0) / 3) * (1.02637-(2.05273)));
            zz = -4.77787 + (((tickAnim - 0) / 3) * (-2.38893-(-4.77787)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 11.56171 + (((tickAnim - 3) / 3) * (8.45411-(11.56171)));
            yy = 1.02637 + (((tickAnim - 3) / 3) * (0.88527-(1.02637)));
            zz = -2.38893 + (((tickAnim - 3) / 3) * (-5.93457-(-2.38893)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 8.45411 + (((tickAnim - 6) / 7) * (35.53122-(8.45411)));
            yy = 0.88527 + (((tickAnim - 6) / 7) * (-2.23853-(0.88527)));
            zz = -5.93457 + (((tickAnim - 6) / 7) * (-1.59775-(-5.93457)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 35.53122 + (((tickAnim - 13) / 3) * (73.15497-(35.53122)));
            yy = -2.23853 + (((tickAnim - 13) / 3) * (0.12781-(-2.23853)));
            zz = -1.59775 + (((tickAnim - 13) / 3) * (0.00005-(-1.59775)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 73.15497 + (((tickAnim - 16) / 3) * (75.52826-(73.15497)));
            yy = 0.12781 + (((tickAnim - 16) / 3) * (0.29822-(0.12781)));
            zz = 0.00005 + (((tickAnim - 16) / 3) * (0.00011-(0.00005)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 75.52826 + (((tickAnim - 19) / 2) * (75.52826-(75.52826)));
            yy = 0.29822 + (((tickAnim - 19) / 2) * (0.29822-(0.29822)));
            zz = 0.00011 + (((tickAnim - 19) / 2) * (0.00011-(0.00011)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 75.52826 + (((tickAnim - 21) / 4) * (17.12343-(75.52826)));
            yy = 0.29822 + (((tickAnim - 21) / 4) * (2.05273-(0.29822)));
            zz = 0.00011 + (((tickAnim - 21) / 4) * (-4.77787-(0.00011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 2) * (1.135-(0.55)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.06-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.135 + (((tickAnim - 2) / 1) * (0.875-(1.135)));
            zz = -0.06 + (((tickAnim - 2) / 1) * (-0.13-(-0.06)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 3) / 3) * (-0.035-(0.875)));
            zz = -0.13 + (((tickAnim - 3) / 3) * (-0.26-(-0.13)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.035 + (((tickAnim - 6) / 3) * (1.865-(-0.035)));
            zz = -0.26 + (((tickAnim - 6) / 3) * (-0.43-(-0.26)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.865 + (((tickAnim - 9) / 2) * (1.915-(1.865)));
            zz = -0.43 + (((tickAnim - 9) / 2) * (-0.51-(-0.43)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.915 + (((tickAnim - 11) / 2) * (0.675-(1.915)));
            zz = -0.51 + (((tickAnim - 11) / 2) * (-0.575-(-0.51)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.675 + (((tickAnim - 13) / 3) * (1.575-(0.675)));
            zz = -0.575 + (((tickAnim - 13) / 3) * (0.25-(-0.575)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.575 + (((tickAnim - 16) / 3) * (0.34-(1.575)));
            zz = 0.25 + (((tickAnim - 16) / 3) * (-0.28-(0.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0.34 + (((tickAnim - 19) / 2) * (0.34-(0.34)));
            zz = -0.28 + (((tickAnim - 19) / 2) * (-0.28-(-0.28)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.34 + (((tickAnim - 21) / 4) * (0.55-(0.34)));
            zz = -0.28 + (((tickAnim - 21) / 4) * (0-(-0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-62.75-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -62.75 + (((tickAnim - 13) / 3) * (30.25-(-62.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 30.25 + (((tickAnim - 16) / 3) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 30.25 + (((tickAnim - 19) / 6) * (0-(30.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.475-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.35-(0)));
            zz = -0.475 + (((tickAnim - 13) / 3) * (-0.23-(-0.475)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 16) / 3) * (-0.35-(-0.35)));
            zz = -0.23 + (((tickAnim - 16) / 3) * (-0.23-(-0.23)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 19) / 6) * (0-(-0.35)));
            zz = -0.23 + (((tickAnim - 19) / 6) * (0-(-0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 27.7228 + (((tickAnim - 0) / 6) * (1.36062-(27.7228)));
            yy = 1.28005 + (((tickAnim - 0) / 6) * (0.23405-(1.28005)));
            zz = -2.43412 + (((tickAnim - 0) / 6) * (-0.2433-(-2.43412)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 1.36062 + (((tickAnim - 6) / 5) * (-18.88721-(1.36062)));
            yy = 0.23405 + (((tickAnim - 6) / 5) * (-1.13424-(0.23405)));
            zz = -0.2433 + (((tickAnim - 6) / 5) * (-3.31134-(-0.2433)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -18.88721 + (((tickAnim - 11) / 2) * (-23.18591-(-18.88721)));
            yy = -1.13424 + (((tickAnim - 11) / 2) * (-1.77481-(-1.13424)));
            zz = -3.31134 + (((tickAnim - 11) / 2) * (-4.13588-(-3.31134)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -23.18591 + (((tickAnim - 13) / 12) * (27.7228-(-23.18591)));
            yy = -1.77481 + (((tickAnim - 13) / 12) * (1.28005-(-1.77481)));
            zz = -4.13588 + (((tickAnim - 13) / 12) * (-2.43412-(-4.13588)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.81-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 27.81 + (((tickAnim - 3) / 5) * (25.4-(27.81)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.4 + (((tickAnim - 8) / 5) * (-5.5-(25.4)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5.5 + (((tickAnim - 13) / 12) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.825 + (((tickAnim - 0) / 3) * (0.48-(-0.825)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.035-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.48 + (((tickAnim - 3) / 5) * (0.825-(0.48)));
            zz = -1.035 + (((tickAnim - 3) / 5) * (-1.19-(-1.035)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 8) / 5) * (-0.875-(0.825)));
            zz = -1.19 + (((tickAnim - 8) / 5) * (-0.55-(-1.19)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.875 + (((tickAnim - 13) / 12) * (-0.825-(-0.875)));
            zz = -0.55 + (((tickAnim - 13) / 12) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 3.49 + (((tickAnim - 2) / 5) * (-41.17-(3.49)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -41.17 + (((tickAnim - 7) / 1) * (-52.92-(-41.17)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -52.92 + (((tickAnim - 8) / 5) * (11.25-(-52.92)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.25 + (((tickAnim - 13) / 5) * (-5.25-(11.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -5.25 + (((tickAnim - 18) / 7) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 7) * (1.66-(-0.625)));
            zz = -0.625 + (((tickAnim - 0) / 7) * (-0.4-(-0.625)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.66 + (((tickAnim - 7) / 1) * (1.66-(1.66)));
            zz = -0.4 + (((tickAnim - 7) / 1) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.66 + (((tickAnim - 8) / 5) * (-0.75-(1.66)));
            zz = -0.4 + (((tickAnim - 8) / 5) * (-0.475-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 13) / 5) * (0.635-(-0.75)));
            zz = -0.475 + (((tickAnim - 13) / 5) * (-0.54-(-0.475)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.635 + (((tickAnim - 18) / 7) * (-0.625-(0.635)));
            zz = -0.54 + (((tickAnim - 18) / 7) * (-0.625-(-0.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35.53122 + (((tickAnim - 0) / 3) * (73.15497-(35.53122)));
            yy = 2.23853 + (((tickAnim - 0) / 3) * (0.12781-(2.23853)));
            zz = 1.59775 + (((tickAnim - 0) / 3) * (0.00005-(1.59775)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 73.15497 + (((tickAnim - 3) / 4) * (75.52826-(73.15497)));
            yy = 0.12781 + (((tickAnim - 3) / 4) * (0.29822-(0.12781)));
            zz = 0.00005 + (((tickAnim - 3) / 4) * (0.00011-(0.00005)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 75.52826 + (((tickAnim - 7) / 1) * (75.52826-(75.52826)));
            yy = 0.29822 + (((tickAnim - 7) / 1) * (0.29822-(0.29822)));
            zz = 0.00011 + (((tickAnim - 7) / 1) * (0.00011-(0.00011)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 75.52826 + (((tickAnim - 8) / 5) * (17.12343-(75.52826)));
            yy = 0.29822 + (((tickAnim - 8) / 5) * (2.05273-(0.29822)));
            zz = 0.00011 + (((tickAnim - 8) / 5) * (4.77787-(0.00011)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.12343 + (((tickAnim - 13) / 2) * (11.56171-(17.12343)));
            yy = 2.05273 + (((tickAnim - 13) / 2) * (1.02637-(2.05273)));
            zz = 4.77787 + (((tickAnim - 13) / 2) * (2.38893-(4.77787)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 11.56171 + (((tickAnim - 15) / 3) * (8.45411-(11.56171)));
            yy = 1.02637 + (((tickAnim - 15) / 3) * (0.88527-(1.02637)));
            zz = 2.38893 + (((tickAnim - 15) / 3) * (5.93457-(2.38893)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 8.45411 + (((tickAnim - 18) / 7) * (35.53122-(8.45411)));
            yy = 0.88527 + (((tickAnim - 18) / 7) * (2.23853-(0.88527)));
            zz = 5.93457 + (((tickAnim - 18) / 7) * (1.59775-(5.93457)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 0) / 3) * (1.575-(0.975)));
            zz = -0.575 + (((tickAnim - 0) / 3) * (0.25-(-0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.575 + (((tickAnim - 3) / 4) * (0.34-(1.575)));
            zz = 0.25 + (((tickAnim - 3) / 4) * (-0.28-(0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.34 + (((tickAnim - 7) / 1) * (0.34-(0.34)));
            zz = -0.28 + (((tickAnim - 7) / 1) * (-0.28-(-0.28)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.34 + (((tickAnim - 8) / 5) * (0.425-(0.34)));
            zz = -0.28 + (((tickAnim - 8) / 5) * (0-(-0.28)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 13) / 1) * (1.135-(0.425)));
            zz = 0 + (((tickAnim - 13) / 1) * (-0.06-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 1.135 + (((tickAnim - 14) / 1) * (0.875-(1.135)));
            zz = -0.06 + (((tickAnim - 14) / 1) * (-0.13-(-0.06)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 15) / 3) * (-0.035-(0.875)));
            zz = -0.13 + (((tickAnim - 15) / 3) * (-0.26-(-0.13)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.035 + (((tickAnim - 18) / 4) * (1.865-(-0.035)));
            zz = -0.26 + (((tickAnim - 18) / 4) * (-0.43-(-0.26)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 1.865 + (((tickAnim - 22) / 1) * (1.915-(1.865)));
            zz = -0.43 + (((tickAnim - 22) / 1) * (-0.51-(-0.43)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 1.915 + (((tickAnim - 23) / 2) * (0.975-(1.915)));
            zz = -0.51 + (((tickAnim - 23) / 2) * (-0.575-(-0.51)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -62.75 + (((tickAnim - 0) / 3) * (30.25-(-62.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 30.25 + (((tickAnim - 3) / 4) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 30.25 + (((tickAnim - 7) / 6) * (0-(30.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-62.75-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.35-(0)));
            zz = -0.475 + (((tickAnim - 0) / 3) * (-0.23-(-0.475)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 3) / 4) * (-0.35-(-0.35)));
            zz = -0.23 + (((tickAnim - 3) / 4) * (-0.23-(-0.23)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 7) / 6) * (0-(-0.35)));
            zz = -0.23 + (((tickAnim - 7) / 6) * (0-(-0.23)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-0.475-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-20))*2.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-80))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*6), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-180))*8), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*6), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*10), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*-6), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*12), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*-8), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-280))*14), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-500))*-10), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-300))*16), tail8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(18+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-220))*-2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-280))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-320))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*-3), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*4), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-5), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*3));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*3));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-5), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*3));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*3));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSuchomimus ee = (EntityPrehistoricFloraSuchomimus) entitylivingbaseIn;

//        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //Ambient
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //Ambient
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animFishing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSuchomimus e = (EntityPrehistoricFloraSuchomimus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
