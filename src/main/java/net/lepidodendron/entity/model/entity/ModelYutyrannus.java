package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYutyrannus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYutyrannus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer lefttoe;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer righttoe;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer neckfeathers2;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer neckfeathers3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer neckfeathers;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer headcrestside3;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer headcrestside;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer headcrestside2;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer headcrestside4;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer headcresttop;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer throat3;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer throat4;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r71;

    private ModelAnimator animator;

    public ModelYutyrannus() {
        this.textureWidth = 170;
        this.textureHeight = 170;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -7.579F, 3.4267F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 28, -4.5F, -4.5F, -5.5F, 9, 17, 11, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 66, 88, -3.5F, -5.75F, -4.5F, 7, 2, 10, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 121, 50, -2.0F, -6.25F, -5.5F, 4, 2, 10, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(4.45F, 0.5855F, 0.4759F);
        this.hips.addChild(leftleg);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.25F, 1.9645F, 2.5241F);
        this.leftleg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 102, 144, 5.4F, -5.25F, 1.5F, 0, 16, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 67, 1.0F, -5.25F, -7.5F, 5, 16, 9, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.75F, 10.1269F, -6.0432F);
        this.leftleg.addChild(leftleg2);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 5.0F, 4.0F);
        this.leftleg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4189F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 107, 144, 1.5F, -6.7F, 2.5F, 0, 13, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 112, 139, -2.0F, -6.7F, -2.5F, 4, 14, 5, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 11.5144F, 6.8025F);
        this.leftleg2.addChild(leftleg3);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 4.6363F, -1.1563F);
        this.leftleg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 154, 0.5F, -5.4F, -1.5F, 3, 10, 3, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(-0.025F, 7.6863F, -1.6563F);
        this.leftleg3.addChild(leftfoot);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 148, 14, -3.0F, -0.25F, -3.5F, 6, 2, 5, 0.0F, false));

        this.lefttoe = new AdvancedModelRenderer(this);
        this.lefttoe.setRotationPoint(0.0F, 0.75F, -3.5F);
        this.leftfoot.addChild(lefttoe);
        this.lefttoe.cubeList.add(new ModelBox(lefttoe, 49, 21, -3.0F, -1.0F, -3.0F, 6, 2, 3, 0.001F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-4.45F, 0.5855F, 0.4759F);
        this.hips.addChild(rightleg);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.25F, 1.9645F, 2.5241F);
        this.rightleg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 102, 144, -5.4F, -5.25F, 1.5F, 0, 16, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 67, -6.0F, -5.25F, -7.5F, 5, 16, 9, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.75F, 10.1269F, -6.0432F);
        this.rightleg.addChild(rightleg2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 5.0F, 4.0F);
        this.rightleg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4189F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 107, 144, -1.5F, -6.7F, 2.5F, 0, 13, 2, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 112, 139, -2.0F, -6.7F, -2.5F, 4, 14, 5, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 11.5144F, 6.8025F);
        this.rightleg2.addChild(rightleg3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, 4.6363F, -1.1563F);
        this.rightleg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 154, -3.5F, -5.4F, -1.5F, 3, 10, 3, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.025F, 7.6863F, -1.6563F);
        this.rightleg3.addChild(rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 148, 14, -3.0F, -0.25F, -3.5F, 6, 2, 5, 0.0F, true));

        this.righttoe = new AdvancedModelRenderer(this);
        this.righttoe.setRotationPoint(0.0F, 0.75F, -3.5F);
        this.rightfoot.addChild(righttoe);
        this.righttoe.cubeList.add(new ModelBox(righttoe, 49, 21, -3.0F, -1.0F, -3.0F, 6, 2, 3, 0.001F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.7162F, 5.2077F);
        this.hips.addChild(tail);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 4.7162F, 1.7923F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 128, 114, -4.5F, -6.8F, -3.5F, 7, 1, 8, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 112, 158, -4.0F, 6.2F, -1.5F, 0, 4, 5, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 157, 74, 2.0F, 6.2F, -1.5F, 0, 4, 5, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 66, 67, -5.0F, -5.8F, -3.5F, 8, 12, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.8633F, 3.8128F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1745F, 1.5708F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 81, 144, 1.3F, -1.5F, -4.0F, 2, 3, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.0587F, 6.6447F);
        this.tail.addChild(tail2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 3.0F, 4.5F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 128, 98, -1.5F, 4.0F, -5.6F, 0, 3, 12, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 127, -3.0F, 4.0F, -5.6F, 0, 3, 12, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 125, 0.0F, 4.0F, -5.6F, 0, 3, 12, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 0, -5.0F, -4.0F, -5.6F, 7, 8, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 3.4118F, 10.3188F);
        this.tail2.addChild(tail3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.0F, 4.5F);
        this.tail3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 113, -2.5F, 2.5F, -5.5F, 4, 2, 11, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 82, 34, -3.0F, -2.5F, -5.5F, 5, 5, 11, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -6.244F, 4.7726F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0436F, 1.5708F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 121, 0, 8.4F, -0.5F, -5.5F, 3, 2, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4289F, 9.8529F);
        this.tail3.addChild(tail4);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, -2.5014F, 4.5654F);
        this.tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 119, 17, -3.0F, 4.5F, -5.7F, 3, 2, 11, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, 1.4986F, 4.5654F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 93, -3.5F, -3.5F, -5.5F, 4, 4, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.4082F, 9.8083F);
        this.tail4.addChild(tail5);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.5996F, 5.8774F);
        this.tail5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 97, -1.0F, -0.5F, -6.5F, 2, 2, 13, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 1.0985F, 5.9826F);
        this.tail5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1747F, -0.043F, 0.0076F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 115, 34, -0.5F, -1.0F, -6.5F, 1, 2, 13, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5F, 1.0985F, 5.9826F);
        this.tail5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1747F, 0.043F, -0.0076F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 109, -0.5F, -1.0F, -6.5F, 1, 2, 13, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.9696F, 6.3473F);
        this.tail5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 97, 101, -1.0F, -0.3F, -6.5F, 2, 1, 13, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.0716F, 5.6812F);
        this.tail5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 88, 0, -1.5F, -0.5F, -6.0F, 3, 3, 13, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 2.3686F, 12.2353F);
        this.tail5.addChild(tail6);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 0.8888F, 6.5672F);
        this.tail6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.48F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 101, 82, -1.0F, 1.75F, -6.75F, 1, 1, 14, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 66, 101, 2.0F, 1.75F, -6.75F, 1, 1, 14, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 57, 0.5F, 1.25F, -6.75F, 1, 4, 17, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 99, 66, 0.5F, 0.25F, -6.75F, 1, 1, 14, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 79, 0.0F, 1.25F, -7.25F, 2, 2, 15, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.6111F, -4.9871F);
        this.hips.addChild(body);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 5.2514F, -5.5654F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 86, 51, -2.0F, -8.0F, -6.0F, 5, 2, 12, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 134, 2.3F, 9.0F, -5.0F, 0, 2, 12, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 87, 129, -4.7F, 9.0F, -6.0F, 0, 2, 12, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 130, 63, 5.7F, 9.0F, -6.0F, 0, 2, 12, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 132, 78, -1.3F, 9.0F, -5.0F, 0, 2, 12, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 128, 124, 5.7F, 9.0F, -6.0F, 0, 2, 12, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -5.5F, -6.0F, -6.0F, 12, 15, 12, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 5.3514F, -5.5654F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 41, 52, -5.0F, -7.0F, -6.0F, 10, 2, 12, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.9879F, -11.4135F);
        this.body.addChild(chest);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -2.4729F, -4.81F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 82, 21, -4.0F, 0.5F, -5.0F, 9, 3, 9, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 97, 116, -2.5F, -0.25F, -5.0F, 6, 3, 9, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 5.2022F, -8.0261F);
        this.chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 144, 31, -3.5F, 6.7F, -1.0F, 0, 2, 10, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 143, 5.5F, 6.7F, -1.0F, 0, 2, 10, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 41, 28, -4.0F, -6.0F, -1.0F, 10, 13, 10, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(5.0489F, 9.2274F, -6.1228F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.0F, 0.1571F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0592F, -1.1108F, 5.234F);
        this.leftarm.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.1789F, 0.0503F, 0.0161F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 87, 117, -0.1F, -4.0F, -2.0F, 0, 8, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.0489F, 6.4075F, 4.1722F);
        this.leftarm.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.2654F, 0.0436F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 154, -0.9F, -6.2409F, 3.3057F, 2, 7, 3, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0021F, 1.6918F, 6.0901F);
        this.leftarm.addChild(leftarm2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.051F, 4.7157F, -1.9179F);
        this.leftarm2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2182F, 0.0436F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 156, 0.9F, -5.9162F, 2.1617F, 0, 7, 3, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 148, 154, -1.0F, -5.9162F, -0.8383F, 2, 7, 3, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.8443F, 5.612F, -0.9867F);
        this.leftarm2.addChild(lefthand);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5539F, 3.2984F, 0.4644F);
        this.lefthand.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.141F, 0.1164F, 0.2458F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 93, 156, 0.0F, -3.5F, -1.5F, 0, 7, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.8953F, -0.8963F, -0.9312F);
        this.lefthand.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0534F, 0.0309F, 0.2617F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 65, 149, -1.7F, 0.5408F, -1.8542F, 3, 10, 4, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-5.0489F, 9.2274F, -6.1228F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, -0.1571F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0592F, -1.1108F, 5.234F);
        this.rightarm.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.1789F, -0.0503F, -0.0161F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 87, 117, 0.1F, -4.0F, -2.0F, 0, 8, 3, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0489F, 6.4075F, 4.1722F);
        this.rightarm.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.2654F, -0.0436F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 154, -1.1F, -6.2409F, 3.3057F, 2, 7, 3, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.0021F, 1.6918F, 6.0901F);
        this.rightarm.addChild(rightarm2);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.051F, 4.7157F, -1.9179F);
        this.rightarm2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2182F, -0.0436F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 13, 156, -0.9F, -5.9162F, 2.1617F, 0, 7, 3, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 148, 154, -1.0F, -5.9162F, -0.8383F, 2, 7, 3, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.8443F, 5.612F, -0.9867F);
        this.rightarm2.addChild(righthand);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5539F, 3.2984F, 0.4644F);
        this.righthand.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.141F, -0.1164F, -0.2458F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 93, 156, 0.0F, -3.5F, -1.5F, 0, 7, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.8953F, -0.8963F, -0.9312F);
        this.righthand.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0534F, -0.0309F, -0.2617F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 65, 149, -1.3F, 0.5408F, -1.8542F, 3, 10, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.8342F, -9.1269F);
        this.chest.addChild(neck);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.0276F, -2.0304F);
        this.neck.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2182F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 153, 124, -2.0F, 4.25F, -2.5F, 0, 3, 7, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 153, 101, 2.0F, 4.25F, -2.5F, 0, 3, 7, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 60, 117, -3.0F, -4.75F, -2.5F, 6, 9, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.103F, -1.8071F);
        this.neck.addChild(neck2);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.9132F, -1.799F);
        this.neck2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.6545F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 131, 139, -2.0F, -3.2F, -3.9F, 5, 8, 6, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.3764F, -2.9773F);
        this.neck2.addChild(neck3);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 1.9278F, -3.3196F);
        this.neck3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3054F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 25, 141, -2.0F, -3.4F, -2.6F, 5, 7, 5, -0.002F, false));

        this.neckfeathers2 = new AdvancedModelRenderer(this);
        this.neckfeathers2.setRotationPoint(0.0F, -2.001F, -4.2982F);
        this.neck3.addChild(neckfeathers2);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 4.0287F, 0.9787F);
        this.neckfeathers2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1745F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 132, 93, -2.0F, -4.1F, -0.4F, 5, 0, 3, 0.0F, false));

        this.neckfeathers3 = new AdvancedModelRenderer(this);
        this.neckfeathers3.setRotationPoint(0.0F, -1.265F, -2.1876F);
        this.neck3.addChild(neckfeathers3);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 3.2927F, -1.132F);
        this.neckfeathers3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1745F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 150, 10, -2.0F, -3.0F, 1.6F, 5, 0, 3, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.3754F, -4.7407F);
        this.neck3.addChild(neck4);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 4.5228F, -1.874F);
        this.neck4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1134F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 150, 52, -3.0F, -5.0F, -0.5F, 5, 6, 3, -0.001F, false));

        this.neckfeathers = new AdvancedModelRenderer(this);
        this.neckfeathers.setRotationPoint(0.0F, -0.272F, -2.7927F);
        this.neck4.addChild(neckfeathers);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.6895F, 1.2054F);
        this.neckfeathers.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.4625F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 88, 17, -2.5F, 0.1F, -1.5F, 5, 0, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.877F, -1.789F);
        this.neck4.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 131, 154, -1.5F, 0.0545F, -5.0231F, 3, 1, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 0.9066F, -4.6611F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3054F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 72, 164, 0.0F, -0.9F, -2.1F, 1, 2, 2, -0.001F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.5F, 2.172F, -6.8682F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1484F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 46, 141, 1.0F, -1.5F, -1.1F, 1, 3, 3, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.5F, 2.1547F, -8.9292F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.4538F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 56, 160, 1.0F, -0.8F, -1.7F, 1, 3, 3, -0.001F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.5F, 4.4819F, -11.4349F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.8465F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 134, 161, 1.0F, -1.0F, -0.8F, 1, 2, 3, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 6.4812F, -11.4872F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0611F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 123, 161, -0.5F, -0.5F, -1.4F, 2, 1, 3, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.0F, 5.4816F, -11.4611F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0262F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 159, 158, 0.0F, -1.0F, -1.5F, 2, 2, 3, 0.01F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 5.7147F, -9.1326F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1745F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 157, 88, -1.0F, 0.25F, -1.5F, 3, 1, 3, -0.01F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 68, 21, -1.0F, -2.25F, -1.5F, 3, 3, 3, -0.001F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 3.4916F, -6.35F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2618F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 155, 68, -1.0F, 1.7F, -2.0F, 3, 1, 4, -0.01F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 112, 129, -1.0F, -1.6F, -2.0F, 3, 4, 4, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.75F, 0.3121F, -3.6177F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.932F, -0.1048F, -0.3791F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 79, 164, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.75F, 0.3121F, -3.6177F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.932F, 0.1048F, 0.3791F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 65, 164, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-2.0F, 0.3025F, -1.4322F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.6545F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 159, 112, 0.0F, -1.0F, -0.8F, 4, 2, 2, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 2.5959F, -2.085F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0436F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 154, 135, -2.0F, -2.1F, -3.5F, 4, 5, 3, 0.004F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 2.5959F, -2.285F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0436F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 150, 0, -3.0F, -2.1F, -0.5F, 5, 5, 4, 0.004F, false));

        this.headcrestside3 = new AdvancedModelRenderer(this);
        this.headcrestside3.setRotationPoint(-2.5167F, 1.2339F, 0.7561F);
        this.head.addChild(headcrestside3);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.3F, 0.0F, 0.75F);
        this.headcrestside3.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.4356F, 0.5504F, -1.5849F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 121, 14, -1.5F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.headcrestside = new AdvancedModelRenderer(this);
        this.headcrestside.setRotationPoint(2.5167F, 1.2339F, 0.7561F);
        this.head.addChild(headcrestside);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.3F, 0.0F, 0.75F);
        this.headcrestside.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.4356F, -0.5504F, 1.5849F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 121, 14, -1.5F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.headcrestside2 = new AdvancedModelRenderer(this);
        this.headcrestside2.setRotationPoint(2.3843F, 3.3857F, 0.5092F);
        this.head.addChild(headcrestside2);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.666F, -0.0036F, 1.2475F);
        this.headcrestside2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.3895F, -0.0176F, 1.5999F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 101, 98, -1.5F, 0.0F, -1.7F, 3, 0, 2, 0.0F, false));

        this.headcrestside4 = new AdvancedModelRenderer(this);
        this.headcrestside4.setRotationPoint(-2.3843F, 3.3857F, 0.5092F);
        this.head.addChild(headcrestside4);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.666F, -0.0036F, 1.2475F);
        this.headcrestside4.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.3895F, 0.0176F, -1.5999F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 112, 98, -1.5F, 0.0F, -1.7F, 3, 0, 2, 0.0F, false));

        this.headcresttop = new AdvancedModelRenderer(this);
        this.headcresttop.setRotationPoint(0.0F, 0.1471F, -3.1925F);
        this.head.addChild(headcresttop);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, -0.9F, 0.5F);
        this.headcresttop.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.7418F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 105, 17, -1.5F, 0.3F, -1.5F, 3, 0, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 5.142F, 0.9596F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 5.5949F, -11.9765F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.1745F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 100, 163, -0.5F, -0.7F, -0.6F, 2, 1, 2, -0.001F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, 5.5284F, -10.5064F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.3054F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 130, 31, 0.0F, -0.8F, -0.7F, 2, 1, 1, 0.002F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5F, 5.5284F, -10.5064F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.3927F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 121, 63, 0.0F, -0.4F, -0.5F, 2, 1, 1, 0.001F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, 4.9788F, -11.5135F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.3927F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 164, 0.0F, -0.9F, -1.0F, 2, 1, 2, -0.02F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 45, 160, 0.0F, -0.7F, -1.4F, 2, 1, 3, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.5F, 4.9124F, -9.095F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.1745F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 155, 62, -0.5F, -0.6486F, 0.5964F, 3, 1, 4, -0.001F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-1.0F, 3.7094F, -7.9262F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.3927F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 150, 44, 0.0F, -1.1F, -2.8F, 3, 1, 6, -0.02F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 148, 22, 0.0F, -0.7F, -2.8F, 3, 2, 6, -0.002F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-1.5F, 1.9804F, -2.4423F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.3054F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 154, 144, 0.0F, -1.0F, -3.45F, 4, 3, 3, 0.003F, false));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 153, 93, -0.5F, -1.0F, -0.65F, 5, 3, 4, 0.0035F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-1.5F, 1.4283F, -2.3543F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0873F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 46, 149, 0.0F, -3.5F, -2.55F, 4, 5, 5, 0.002F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 3.8552F, -2.8135F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);


        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-1.0F, -4.5748F, 1.8712F);
        this.throat.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.1309F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 156, 0.0F, 1.8F, -3.1F, 2, 3, 4, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -3.0345F, 4.5038F);
        this.throat.addChild(throat2);


        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.5F, 0.0246F, 0.129F);
        this.throat2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.2182F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 159, 151, -1.0F, -0.5091F, -1.9498F, 3, 4, 2, -0.002F, false));

        this.throat3 = new AdvancedModelRenderer(this);
        this.throat3.setRotationPoint(-1.0F, -0.0162F, -1.6349F);
        this.throat2.addChild(throat3);


        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.5F, 2.7F, 2.25F);
        this.throat3.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.3054F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 159, 117, 0.0F, -3.6F, -1.4F, 3, 4, 2, -0.01F, false));

        this.throat4 = new AdvancedModelRenderer(this);
        this.throat4.setRotationPoint(1.0F, -0.0366F, 2.2034F);
        this.throat3.addChild(throat4);


        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-1.5F, 2.7366F, 0.0466F);
        this.throat4.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.6109F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 80, 156, 0.0F, -3.4F, 0.4F, 3, 4, 3, -0.02F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 1.3839F, -1.8376F);
        this.head.addChild(eye);


        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 1.2119F, -0.2474F);
        this.eye.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0436F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 157, 84, -3.0F, -1.7F, -0.7F, 5, 1, 2, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.16F;
        this.hips.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.30F;
        this.hips.offsetX = 0.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(220);
        this.hips.rotateAngleX = (float)Math.toRadians(12);
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

        EntityPrehistoricFloraYutyrannus EntityYutyrannus = (EntityPrehistoricFloraYutyrannus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.lefthand};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.righthand};

        EntityYutyrannus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityYutyrannus.getAnimation() == EntityYutyrannus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityYutyrannus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityYutyrannus.getIsMoving()) {
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

                if (EntityYutyrannus.getIsFast()) { //Running


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
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-7 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-7)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*7 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0.475 + (((tickAnim - 0) / 20) * (0.475-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8 + (((tickAnim - 0) / 11) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0.4 + (((tickAnim - 0) / 12) * (13.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-132))*15-(0.4)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 13.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-132))*15 + (((tickAnim - 12) / 8) * (0.4-(13.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-132))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*-9 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*-9-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*-9)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*2 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*2)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neckfeathers2, neckfeathers2.rotateAngleX + (float) Math.toRadians(-10.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+400))*25), neckfeathers2.rotateAngleY + (float) Math.toRadians(0), neckfeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers3, neckfeathers3.rotateAngleX + (float) Math.toRadians(-10.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+400))*25), neckfeathers3.rotateAngleY + (float) Math.toRadians(0), neckfeathers3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6 + (((tickAnim - 0) / 11) * (-15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6-(-15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);



        this.setRotateAngle(neckfeathers, neckfeathers.rotateAngleX + (float) Math.toRadians(-10.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+400))*25), neckfeathers.rotateAngleY + (float) Math.toRadians(0), neckfeathers.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*12 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*12)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*2 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+660))*4 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+660))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+660))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(headcresttop, headcresttop.rotateAngleX + (float) Math.toRadians(-10.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+400))*25), headcresttop.rotateAngleY + (float) Math.toRadians(0), headcresttop.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*25 + (((tickAnim - 0) / 5) * (19.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*55-(-10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 19.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*55 + (((tickAnim - 5) / 2) * (0.15-(19.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*55)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0.15 + (((tickAnim - 7) / 9) * (0.25-(0.15)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.25 + (((tickAnim - 16) / 4) * (-10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*25-(0.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -35.25 + (((tickAnim - 0) / 6) * (18.6-(-35.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 18.6 + (((tickAnim - 6) / 4) * (18.6-(18.6)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18.6 + (((tickAnim - 10) / 3) * (11.65-(18.6)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11.65 + (((tickAnim - 13) / 7) * (-35.25-(11.65)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 10) / 10) * (0-(15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 10) * (0-(0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));

        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(0);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(0.025);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.525-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 10) / 10) * (0-(0.075)));
            zz = -0.525 + (((tickAnim - 10) / 10) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat4.rotationPointX = this.throat4.rotationPointX + (float)(xx);
        this.throat4.rotationPointY = this.throat4.rotationPointY - (float)(yy);
        this.throat4.rotationPointZ = this.throat4.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1.7-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            zz = 1.7 + (((tickAnim - 10) / 10) * (1-(1.7)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat4.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.5 + (((tickAnim - 10) / 10) * (0-(10.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (0-(5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20.5 + (((tickAnim - 10) / 10) * (0-(20.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (27.75-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.75 + (((tickAnim - 10) / 10) * (0-(27.75)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.5 + (((tickAnim - 5) / 5) * (0-(4.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 5) / 3) * (0-(11.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (9-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 10) / 10) * (0-(9)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.75 + (((tickAnim - 5) / 5) * (2.5-(13.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
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
            yy = 0 + (((tickAnim - 0) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 5) / 5) * (0-(0.175)));
            zz = 0.2 + (((tickAnim - 5) / 5) * (0-(0.2)));
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
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (27.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 27.25 + (((tickAnim - 8) / 2) * (0-(27.25)));
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
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 37 + (((tickAnim - 20) / 15) * (-16.5-(37)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 35) / 15) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 23 + (((tickAnim - 20) / 3) * (36-(23)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 36 + (((tickAnim - 23) / 12) * (-4-(36)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 35) / 15) * (0-(-4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
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
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-24.8676-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.48141-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.82288-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -24.8676 + (((tickAnim - 20) / 8) * (-52.1838-(-24.8676)));
            yy = -1.48141 + (((tickAnim - 20) / 8) * (-0.74071-(-1.48141)));
            zz = -1.82288 + (((tickAnim - 20) / 8) * (-0.91144-(-1.82288)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -52.1838 + (((tickAnim - 28) / 3) * (-52.1838-(-52.1838)));
            yy = -0.74071 + (((tickAnim - 28) / 3) * (-0.74071-(-0.74071)));
            zz = -0.91144 + (((tickAnim - 28) / 3) * (-0.91144-(-0.91144)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -52.1838 + (((tickAnim - 31) / 4) * (0-(-52.1838)));
            yy = -0.74071 + (((tickAnim - 31) / 4) * (0-(-0.74071)));
            zz = -0.91144 + (((tickAnim - 31) / 4) * (0-(-0.91144)));
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
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 20) / 8) * (0-(-0.45)));
            zz = -0.3 + (((tickAnim - 20) / 8) * (-0.65-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = -0.65 + (((tickAnim - 28) / 3) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 4) * (-0.575-(0)));
            zz = -0.65 + (((tickAnim - 31) / 4) * (-0.3-(-0.65)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
            zz = -0.3 + (((tickAnim - 35) / 15) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8.15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 8.15 + (((tickAnim - 8) / 12) * (68.5-(8.15)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 68.5 + (((tickAnim - 20) / 8) * (79.5-(68.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 79.5 + (((tickAnim - 28) / 3) * (79.5-(79.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 79.5 + (((tickAnim - 31) / 4) * (20.5-(79.5)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 35) / 15) * (0-(20.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.6-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (2.95-(0)));
            zz = -0.6 + (((tickAnim - 20) / 8) * (0-(-0.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 2.95 + (((tickAnim - 28) / 3) * (2.95-(2.95)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 2.95 + (((tickAnim - 31) / 4) * (-1.175-(2.95)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.175 + (((tickAnim - 35) / 15) * (0-(-1.175)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -17.25 + (((tickAnim - 18) / 15) * (-17.25-(-17.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 33) / 17) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-10.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (8.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -10.7 + (((tickAnim - 18) / 15) * (-10.7-(-10.7)));
            zz = 8.325 + (((tickAnim - 18) / 15) * (8.325-(8.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -10.7 + (((tickAnim - 33) / 17) * (0-(-10.7)));
            zz = 8.325 + (((tickAnim - 33) / 17) * (0-(8.325)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -30 + (((tickAnim - 18) / 15) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 33) / 17) * (0-(-30)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 54.25 + (((tickAnim - 18) / 15) * (54.25-(54.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 54.25 + (((tickAnim - 33) / 17) * (0-(54.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -33 + (((tickAnim - 18) / 15) * (-33-(-33)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -33 + (((tickAnim - 33) / 17) * (0-(-33)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.025 + (((tickAnim - 18) / 15) * (0.025-(0.025)));
            zz = -1.325 + (((tickAnim - 18) / 15) * (-1.325-(-1.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.025 + (((tickAnim - 33) / 17) * (0-(0.025)));
            zz = -1.325 + (((tickAnim - 33) / 17) * (0-(-1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 25.25 + (((tickAnim - 18) / 15) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 33) / 17) * (0-(25.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.85 + (((tickAnim - 18) / 15) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.85 + (((tickAnim - 33) / 17) * (0-(0.85)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -30 + (((tickAnim - 18) / 15) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 33) / 17) * (0-(-30)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 54.25 + (((tickAnim - 18) / 15) * (54.25-(54.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 54.25 + (((tickAnim - 33) / 17) * (0-(54.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -33 + (((tickAnim - 18) / 15) * (-33-(-33)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -33 + (((tickAnim - 33) / 17) * (0-(-33)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.025 + (((tickAnim - 18) / 15) * (0.025-(0.025)));
            zz = -1.325 + (((tickAnim - 18) / 15) * (-1.325-(-1.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.025 + (((tickAnim - 33) / 17) * (0-(0.025)));
            zz = -1.325 + (((tickAnim - 33) / 17) * (0-(-1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 25.25 + (((tickAnim - 18) / 15) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 33) / 17) * (0-(25.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.85 + (((tickAnim - 18) / 15) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.85 + (((tickAnim - 33) / 17) * (0-(0.85)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -14.25 + (((tickAnim - 18) / 15) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -14.25 + (((tickAnim - 33) / 8) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.07-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -3.07 + (((tickAnim - 8) / 10) * (4.5-(-3.07)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 18) / 15) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 4.5 + (((tickAnim - 33) / 8) * (0-(4.5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -14.75 + (((tickAnim - 8) / 10) * (-1-(-14.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1 + (((tickAnim - 18) / 15) * (-1-(-1)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -1 + (((tickAnim - 33) / 8) * (-11.25-(-1)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 41) / 9) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.65-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -0.65 + (((tickAnim - 18) / 15) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -0.65 + (((tickAnim - 33) / 17) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.96-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -2.96 + (((tickAnim - 8) / 10) * (5.5-(-2.96)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5.5 + (((tickAnim - 18) / 15) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 5.5 + (((tickAnim - 33) / 8) * (0-(5.5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (17.11-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 17.11 + (((tickAnim - 8) / 10) * (30-(17.11)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 30 + (((tickAnim - 18) / 15) * (30-(30)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 30 + (((tickAnim - 33) / 8) * (0-(30)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (30-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 8) / 10) * (16.5-(30)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 16.5 + (((tickAnim - 18) / 15) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 16.5 + (((tickAnim - 33) / 17) * (0-(16.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 18) / 15) * (6-(6)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 33) / 17) * (0-(6)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11.75 + (((tickAnim - 18) / 15) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 33) / 17) * (0-(11.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRumble(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6 + (((tickAnim - 20) / 10) * (-1.5-(6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -1.5 + (((tickAnim - 30) / 15) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.7-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -9.7 + (((tickAnim - 20) / 10) * (-9.7-(-9.7)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = -9.7 + (((tickAnim - 30) / 15) * (0-(-9.7)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12 + (((tickAnim - 20) / 10) * (20-(12)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 20 + (((tickAnim - 30) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -17.25 + (((tickAnim - 20) / 10) * (-17.25-(-17.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -17.25 + (((tickAnim - 30) / 15) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.245-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.245 + (((tickAnim - 10) / 10) * (-1.25-(-0.245)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.25 + (((tickAnim - 20) / 10) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -1.25 + (((tickAnim - 30) / 8) * (-0.21-(-1.25)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = -0.21 + (((tickAnim - 38) / 7) * (0-(-0.21)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.5 + (((tickAnim - 10) / 10) * (-24-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24 + (((tickAnim - 20) / 10) * (-16.75-(-24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -16.75 + (((tickAnim - 30) / 15) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23.13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.13 + (((tickAnim - 10) / 10) * (-7.25-(23.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 20) / 10) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -7.25 + (((tickAnim - 30) / 8) * (42.13-(-7.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 42.13 + (((tickAnim - 38) / 7) * (0-(42.13)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.825 + (((tickAnim - 20) / 10) * (-0.825-(-0.825)));
            zz = 0.2 + (((tickAnim - 20) / 10) * (0.2-(0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.825 + (((tickAnim - 30) / 15) * (0-(-0.825)));
            zz = 0.2 + (((tickAnim - 30) / 15) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-44.87-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -44.87 + (((tickAnim - 10) / 5) * (-44.87-(-44.87)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -44.87 + (((tickAnim - 15) / 5) * (7.25-(-44.87)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 20) / 10) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 7.25 + (((tickAnim - 30) / 8) * (-50.87-(7.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -50.87 + (((tickAnim - 38) / 7) * (0-(-50.87)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.35-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.35 + (((tickAnim - 10) / 5) * (1.35-(1.35)));
            zz = 1.15 + (((tickAnim - 10) / 5) * (1.15-(1.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.35 + (((tickAnim - 15) / 5) * (0-(1.35)));
            zz = 1.15 + (((tickAnim - 15) / 5) * (0-(1.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 30) / 8) * (1.325-(-0.2)));
            zz = 0 + (((tickAnim - 30) / 8) * (1.325-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 1.325 + (((tickAnim - 38) / 7) * (0-(1.325)));
            zz = 1.325 + (((tickAnim - 38) / 7) * (0-(1.325)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (80.38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 80.38 + (((tickAnim - 10) / 5) * (80.38-(80.38)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 80.38 + (((tickAnim - 15) / 5) * (17.75-(80.38)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.75 + (((tickAnim - 20) / 10) * (18.5-(17.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 18.5 + (((tickAnim - 30) / 8) * (83.75-(18.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 83.75 + (((tickAnim - 38) / 7) * (0-(83.75)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 20) / 10) * (-0.455-(-0.725)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.455 + (((tickAnim - 30) / 15) * (0-(-0.455)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(righttoe, righttoe.rotateAngleX + (float) Math.toRadians(0), righttoe.rotateAngleY + (float) Math.toRadians(0), righttoe.rotateAngleZ + (float) Math.toRadians(0));
        this.righttoe.rotationPointX = this.righttoe.rotationPointX + (float)(0);
        this.righttoe.rotationPointY = this.righttoe.rotationPointY - (float)(0);
        this.righttoe.rotationPointZ = this.righttoe.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.53929-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-31.6222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.86887-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 9.53929 + (((tickAnim - 20) / 15) * (8.75-(9.53929)));
            yy = -31.6222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 20) / 15) * (-40.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-31.6222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 0.86887 + (((tickAnim - 20) / 15) * (0-(0.86887)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 8.75 + (((tickAnim - 35) / 10) * (0-(8.75)));
            yy = -40.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 35) / 10) * (0-(-40.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.30843-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-41.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.68673-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 10.30843 + (((tickAnim - 20) / 15) * (0-(10.30843)));
            yy = -41.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 20) / 15) * (-35.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(-41.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            zz = 0.68673 + (((tickAnim - 20) / 15) * (0-(0.68673)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -35.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 35) / 10) * (0-(-35.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.88029-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.0214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.84307-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -2.88029 + (((tickAnim - 20) / 15) * (0-(-2.88029)));
            yy = 0.0214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 20) / 15) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(0.0214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            zz = -3.84307 + (((tickAnim - 20) / 15) * (0-(-3.84307)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 35) / 10) * (0-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.68276-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-45.7815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.25876-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 4.68276 + (((tickAnim - 20) / 15) * (0-(4.68276)));
            yy = -45.7815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50 + (((tickAnim - 20) / 15) * (-44.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50-(-45.7815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50)));
            zz = -3.25876 + (((tickAnim - 20) / 15) * (0-(-3.25876)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -44.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50 + (((tickAnim - 35) / 10) * (0-(-44.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-57.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -57.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-50 + (((tickAnim - 20) / 15) * (7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-20-(-57.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-50)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-20 + (((tickAnim - 35) / 10) * (0-(7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-20)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-50 + (((tickAnim - 20) / 15) * (81.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*50-(8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-50)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 81.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*50 + (((tickAnim - 35) / 10) * (0-(81.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*50)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (41.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 41.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 20) / 25) * (0-(41.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -19.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 20) / 25) * (0-(-19.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            yy = 49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 20) / 10) * (0-(49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            yy = -49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 20) / 10) * (0-(-49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (84.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-85-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 84.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-85 + (((tickAnim - 20) / 10) * (-4.75-(84.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-85)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -4.75 + (((tickAnim - 30) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29.1208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.56468-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.35511-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -29.1208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85 + (((tickAnim - 20) / 25) * (0-(-29.1208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85)));
            yy = 3.56468 + (((tickAnim - 20) / 25) * (0-(3.56468)));
            zz = -2.35511 + (((tickAnim - 20) / 25) * (0-(-2.35511)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = -1.1 + (((tickAnim - 20) / 25) * (0-(-1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-83.4927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*85-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-19.0702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-7.40836-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -83.4927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*85 + (((tickAnim - 20) / 25) * (0-(-83.4927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*85)));
            yy = -19.0702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 20) / 25) * (0-(-19.0702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            zz = -7.40836 + (((tickAnim - 20) / 25) * (0-(-7.40836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15 + (((tickAnim - 20) / 10) * (39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15-(39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15 + (((tickAnim - 30) / 15) * (0-(39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfeathers2, neckfeathers2.rotateAngleX + (float) Math.toRadians(xx), neckfeathers2.rotateAngleY + (float) Math.toRadians(yy), neckfeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 20) / 10) * (27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 30) / 15) * (0-(27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfeathers3, neckfeathers3.rotateAngleX + (float) Math.toRadians(xx), neckfeathers3.rotateAngleY + (float) Math.toRadians(yy), neckfeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.3521143084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (38.8262+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.15088-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -15.3521143084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 20) / 5) * (6.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-105-(-15.3521143084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 38.8262+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 20) / 5) * (-46.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55-(38.8262+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            zz = -3.15088 + (((tickAnim - 20) / 5) * (0-(-3.15088)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-105 + (((tickAnim - 25) / 5) * (-37.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(6.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-105)));
            yy = -46.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55 + (((tickAnim - 25) / 5) * (0-(-46.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -37.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 30) / 15) * (0-(-37.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15 + (((tickAnim - 20) / 10) * (44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15-(44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15 + (((tickAnim - 30) / 15) * (0-(44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfeathers, neckfeathers.rotateAngleX + (float) Math.toRadians(xx), neckfeathers.rotateAngleY + (float) Math.toRadians(yy), neckfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -8 + (((tickAnim - 20) / 5) * (-13.86-(-8)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -13.86 + (((tickAnim - 25) / 5) * (0.5-(-13.86)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0.5 + (((tickAnim - 30) / 15) * (0-(0.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (50.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 50.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15 + (((tickAnim - 20) / 10) * (50.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15-(50.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 50.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15 + (((tickAnim - 30) / 15) * (0-(50.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*15)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headcresttop, headcresttop.rotateAngleX + (float) Math.toRadians(xx), headcresttop.rotateAngleY + (float) Math.toRadians(yy), headcresttop.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.5 + (((tickAnim - 20) / 5) * (0-(25.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.17046-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3.06574-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.07551-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 9.17046 + (((tickAnim - 7) / 6) * (6.41336-(9.17046)));
            yy = -3.06574 + (((tickAnim - 7) / 6) * (-5.74826-(-3.06574)));
            zz = -0.07551 + (((tickAnim - 7) / 6) * (-0.14159-(-0.07551)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 6.41336 + (((tickAnim - 13) / 7) * (10.25-(6.41336)));
            yy = -5.74826 + (((tickAnim - 13) / 7) * (0-(-5.74826)));
            zz = -0.14159 + (((tickAnim - 13) / 7) * (0-(-0.14159)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 10.25 + (((tickAnim - 20) / 5) * (14.25-(10.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 14.25 + (((tickAnim - 25) / 2) * (15-(14.25)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 27) / 3) * (9.25-(15)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 9.25 + (((tickAnim - 30) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 11 + (((tickAnim - 20) / 5) * (25.75-(11)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 25.75 + (((tickAnim - 25) / 20) * (0-(25.75)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 5) * (1.15-(0.2)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.05-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.15 + (((tickAnim - 25) / 5) * (0.875-(1.15)));
            zz = 0.05 + (((tickAnim - 25) / 5) * (0.55-(0.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0.875 + (((tickAnim - 30) / 15) * (0-(0.875)));
            zz = 0.55 + (((tickAnim - 30) / 15) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 20) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 5) * (1.15-(1)));
            zz = 1 + (((tickAnim - 20) / 5) * (1.1813-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 25) / 5) * (1-(1)));
            yy = 1.15 + (((tickAnim - 25) / 5) * (1.1-(1.15)));
            zz = 1.1813 + (((tickAnim - 25) / 5) * (1.3625-(1.1813)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -29 + (((tickAnim - 20) / 5) * (-16.5-(-29)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -16.5 + (((tickAnim - 25) / 20) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.8-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 20) / 5) * (0.205-(0.125)));
            zz = 1.8 + (((tickAnim - 20) / 5) * (1.05-(1.8)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0.205 + (((tickAnim - 25) / 20) * (0-(0.205)));
            zz = 1.05 + (((tickAnim - 25) / 20) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(xx);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(yy);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 9.5 + (((tickAnim - 20) / 25) * (0-(9.5)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat4, throat4.rotateAngleX + (float) Math.toRadians(xx), throat4.rotateAngleY + (float) Math.toRadians(yy), throat4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = -0.1 + (((tickAnim - 20) / 25) * (0-(-0.1)));
            zz = -0.5 + (((tickAnim - 20) / 25) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat4.rotationPointX = this.throat4.rotationPointX + (float)(xx);
        this.throat4.rotationPointY = this.throat4.rotationPointY - (float)(yy);
        this.throat4.rotationPointZ = this.throat4.rotationPointZ + (float)(zz);

    }


    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 20) / 20) * (-3.5-(-2.5)));
            yy = 3 + (((tickAnim - 20) / 20) * (3-(3)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = -3.5 + (((tickAnim - 40) / 55) * (-3.5-(-3.5)));
            yy = 3 + (((tickAnim - 40) / 55) * (3-(3)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = -3.5 + (((tickAnim - 95) / 40) * (0-(-3.5)));
            yy = 3 + (((tickAnim - 95) / 40) * (0-(3)));
            zz = 0 + (((tickAnim - 95) / 40) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            zz = -3.325 + (((tickAnim - 20) / 75) * (-3.325-(-3.325)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            zz = -3.325 + (((tickAnim - 95) / 40) * (0-(-3.325)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (10.27311-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.85304-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.92782-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 10.27311 + (((tickAnim - 20) / 20) * (11.27311-(10.27311)));
            yy = -2.85304 + (((tickAnim - 20) / 20) * (-2.85304-(-2.85304)));
            zz = -0.92782 + (((tickAnim - 20) / 20) * (-0.92782-(-0.92782)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 11.27311 + (((tickAnim - 40) / 55) * (11.27311-(11.27311)));
            yy = -2.85304 + (((tickAnim - 40) / 55) * (-2.85304-(-2.85304)));
            zz = -0.92782 + (((tickAnim - 40) / 55) * (-0.92782-(-0.92782)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 11.27311 + (((tickAnim - 95) / 40) * (0-(11.27311)));
            yy = -2.85304 + (((tickAnim - 95) / 40) * (0-(-2.85304)));
            zz = -0.92782 + (((tickAnim - 95) / 40) * (0-(-0.92782)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 75) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 40) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            yy = -0.7 + (((tickAnim - 20) / 75) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 20) / 75) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            yy = -0.7 + (((tickAnim - 95) / 40) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 95) / 40) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 75) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 40) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            yy = 1.4 + (((tickAnim - 20) / 75) * (1.4-(1.4)));
            zz = 0 + (((tickAnim - 20) / 75) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            yy = 1.4 + (((tickAnim - 95) / 40) * (0-(1.4)));
            zz = 0 + (((tickAnim - 95) / 40) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 95) {
            xx = -8 + (((tickAnim - 20) / 75) * (-8-(-8)));
            yy = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 75) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = -8 + (((tickAnim - 95) / 40) * (0-(-8)));
            yy = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 40) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 20) / 75) * (0-(0)));
            yy = -0.825 + (((tickAnim - 20) / 75) * (-0.825-(-0.825)));
            zz = 0 + (((tickAnim - 20) / 75) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 95) / 40) * (0-(0)));
            yy = -0.825 + (((tickAnim - 95) / 40) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 95) / 40) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.98371-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.57306-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.21238-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -12.98371 + (((tickAnim - 20) / 20) * (-11.98371-(-12.98371)));
            yy = 3.57306 + (((tickAnim - 20) / 20) * (3.57306-(3.57306)));
            zz = -0.21238 + (((tickAnim - 20) / 20) * (-0.21238-(-0.21238)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = -11.98371 + (((tickAnim - 40) / 53) * (-11.98371-(-11.98371)));
            yy = 3.57306 + (((tickAnim - 40) / 53) * (3.57306-(3.57306)));
            zz = -0.21238 + (((tickAnim - 40) / 53) * (-0.21238-(-0.21238)));
        }
        else if (tickAnim >= 93 && tickAnim < 113) {
            xx = -11.98371 + (((tickAnim - 93) / 20) * (10.76847-(-11.98371)));
            yy = 3.57306 + (((tickAnim - 93) / 20) * (1.85799-(3.57306)));
            zz = -0.21238 + (((tickAnim - 93) / 20) * (-0.11044-(-0.21238)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 10.76847 + (((tickAnim - 113) / 22) * (0-(10.76847)));
            yy = 1.85799 + (((tickAnim - 113) / 22) * (0-(1.85799)));
            zz = -0.11044 + (((tickAnim - 113) / 22) * (0-(-0.11044)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (12.63-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 12.63 + (((tickAnim - 4) / 6) * (5.25-(12.63)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 10) / 10) * (-7-(5.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 93) {
            xx = -7 + (((tickAnim - 20) / 73) * (-7-(-7)));
            yy = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 73) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 103) {
            xx = -7 + (((tickAnim - 93) / 10) * (33.3-(-7)));
            yy = 0 + (((tickAnim - 93) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 10) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 33.3 + (((tickAnim - 103) / 10) * (-5.39-(33.3)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = -5.39 + (((tickAnim - 113) / 22) * (0-(-5.39)));
            yy = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 73) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 93) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 20) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 93) / 20) * (0.4-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            yy = -0.875 + (((tickAnim - 113) / 22) * (0-(-0.875)));
            zz = 0.4 + (((tickAnim - 113) / 22) * (0-(0.4)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40.19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40.19 + (((tickAnim - 10) / 3) * (-45.75-(-40.19)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -45.75 + (((tickAnim - 13) / 7) * (14-(-45.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 93) {
            xx = 14 + (((tickAnim - 20) / 73) * (14-(14)));
            yy = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 73) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 103) {
            xx = 14 + (((tickAnim - 93) / 10) * (-46.83-(14)));
            yy = 0 + (((tickAnim - 93) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 10) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = -46.83 + (((tickAnim - 103) / 10) * (-6.72-(-46.83)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = -6.72 + (((tickAnim - 113) / 22) * (0-(-6.72)));
            yy = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.4-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 13) / 7) * (-0.4-(0.675)));
            zz = 0.4 + (((tickAnim - 13) / 7) * (0-(0.4)));
        }
        else if (tickAnim >= 20 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            yy = -0.4 + (((tickAnim - 20) / 73) * (-0.4-(-0.4)));
            zz = 0 + (((tickAnim - 20) / 73) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 93) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 93) / 10) * (0.84-(-0.4)));
            zz = 0 + (((tickAnim - 93) / 10) * (0.375-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            yy = 0.84 + (((tickAnim - 103) / 10) * (1.125-(0.84)));
            zz = 0.375 + (((tickAnim - 103) / 10) * (0-(0.375)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            yy = 1.125 + (((tickAnim - 113) / 22) * (0-(1.125)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (85.63-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 85.63 + (((tickAnim - 10) / 3) * (85.63-(85.63)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 85.63 + (((tickAnim - 13) / 7) * (7.75-(85.63)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 93) {
            xx = 7.75 + (((tickAnim - 20) / 73) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 73) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 103) {
            xx = 7.75 + (((tickAnim - 93) / 10) * (92.5-(7.75)));
            yy = 0 + (((tickAnim - 93) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 10) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 92.5 + (((tickAnim - 103) / 10) * (4-(92.5)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 4 + (((tickAnim - 113) / 22) * (0-(4)));
            yy = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            yy = -0.475 + (((tickAnim - 20) / 73) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 20) / 73) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 93) / 20) * (0-(0)));
            yy = -0.475 + (((tickAnim - 93) / 20) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 93) / 20) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = -19.75 + (((tickAnim - 5) / 9) * (21-(-19.75)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 14) / 6) * (0-(21)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 73) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 93) / 4) * (-27.66-(0)));
            yy = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 4) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = -27.66 + (((tickAnim - 97) / 6) * (22.25-(-27.66)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = 22.25 + (((tickAnim - 103) / 2) * (17-(22.25)));
            yy = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 2) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 17 + (((tickAnim - 105) / 8) * (0-(17)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoe, righttoe.rotateAngleX + (float) Math.toRadians(xx), righttoe.rotateAngleY + (float) Math.toRadians(yy), righttoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.35-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0.35 + (((tickAnim - 14) / 6) * (0-(0.35)));
        }
        else if (tickAnim >= 20 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 73) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 93) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 10) * (0.425-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoe.rotationPointX = this.righttoe.rotationPointX + (float)(xx);
        this.righttoe.rotationPointY = this.righttoe.rotationPointY - (float)(yy);
        this.righttoe.rotationPointZ = this.righttoe.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-1.2501-(0)));
            yy = 0.25 + (((tickAnim - 20) / 20) * (0.74988-(0.25)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.01091-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -1.2501 + (((tickAnim - 40) / 20) * (-1.25018-(-1.2501)));
            yy = 0.74988 + (((tickAnim - 40) / 20) * (0.99982-(0.74988)));
            zz = -0.01091 + (((tickAnim - 40) / 20) * (-0.01636-(-0.01091)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -1.25018 + (((tickAnim - 60) / 35) * (-1.25018-(-1.25018)));
            yy = 0.99982 + (((tickAnim - 60) / 35) * (0.99982-(0.99982)));
            zz = -0.01636 + (((tickAnim - 60) / 35) * (-0.01636-(-0.01636)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = -1.25018 + (((tickAnim - 95) / 40) * (-1.25267-(-1.25018)));
            yy = 0.99982 + (((tickAnim - 95) / 40) * (-3.74905-(0.99982)));
            zz = -0.01636 + (((tickAnim - 95) / 40) * (0.08738-(-0.01636)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = -1.25267 + (((tickAnim - 135) / 25) * (0-(-1.25267)));
            yy = -3.74905 + (((tickAnim - 135) / 25) * (0-(-3.74905)));
            zz = 0.08738 + (((tickAnim - 135) / 25) * (0-(0.08738)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-0.75014-(0)));
            yy = 1 + (((tickAnim - 20) / 20) * (1.49996-(1)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.00655-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -0.75014 + (((tickAnim - 40) / 20) * (-0.75034-(-0.75014)));
            yy = 1.49996 + (((tickAnim - 40) / 20) * (1.82491-(1.49996)));
            zz = -0.00655 + (((tickAnim - 40) / 20) * (-0.0131-(-0.00655)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -0.75034 + (((tickAnim - 60) / 35) * (-0.75034-(-0.75034)));
            yy = 1.82491 + (((tickAnim - 60) / 35) * (1.82491-(1.82491)));
            zz = -0.0131 + (((tickAnim - 60) / 35) * (-0.0131-(-0.0131)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = -0.75034 + (((tickAnim - 95) / 40) * (-0.75399-(-0.75034)));
            yy = 1.82491 + (((tickAnim - 95) / 40) * (0.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(1.82491)));
            zz = -0.0131 + (((tickAnim - 95) / 40) * (0.08863-(-0.0131)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = -0.75399 + (((tickAnim - 135) / 25) * (0-(-0.75399)));
            yy = 0.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 135) / 25) * (0-(0.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = 0.08863 + (((tickAnim - 135) / 25) * (0-(0.08863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (1.24968-(0)));
            yy = -1.5 + (((tickAnim - 20) / 20) * (-0.75018-(-1.5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0.01636-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 1.24968 + (((tickAnim - 40) / 20) * (1.24958-(1.24968)));
            yy = -0.75018 + (((tickAnim - 40) / 20) * (-0.3503-(-0.75018)));
            zz = 0.01636 + (((tickAnim - 40) / 20) * (0.02727-(0.01636)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 1.24958 + (((tickAnim - 60) / 35) * (1.24958-(1.24958)));
            yy = -0.3503 + (((tickAnim - 60) / 35) * (-0.3503-(-0.3503)));
            zz = 0.02727 + (((tickAnim - 60) / 35) * (0.02727-(0.02727)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 1.24958 + (((tickAnim - 95) / 40) * (1.26063-(1.24958)));
            yy = -0.3503 + (((tickAnim - 95) / 40) * (-7.59856-(-0.3503)));
            zz = 0.02727 + (((tickAnim - 95) / 40) * (-0.13181-(0.02727)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = 1.26063 + (((tickAnim - 135) / 25) * (0-(1.26063)));
            yy = -7.59856 + (((tickAnim - 135) / 25) * (0-(-7.59856)));
            zz = -0.13181 + (((tickAnim - 135) / 25) * (0-(-0.13181)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 1) / 39) * (2.74843-(0)));
            yy = 0 + (((tickAnim - 1) / 39) * (-0.50173-(0)));
            zz = 0 + (((tickAnim - 1) / 39) * (0.07196-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.74843 + (((tickAnim - 40) / 20) * (2.74843-(2.74843)));
            yy = -0.50173 + (((tickAnim - 40) / 20) * (-0.72673-(-0.50173)));
            zz = 0.07196 + (((tickAnim - 40) / 20) * (0.07196-(0.07196)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 2.74843 + (((tickAnim - 60) / 35) * (2.74843-(2.74843)));
            yy = -0.72673 + (((tickAnim - 60) / 35) * (-0.72673-(-0.72673)));
            zz = 0.07196 + (((tickAnim - 60) / 35) * (0.07196-(0.07196)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 2.74843 + (((tickAnim - 95) / 40) * (2.75987-(2.74843)));
            yy = -0.72673 + (((tickAnim - 95) / 40) * (-11.0086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(-0.72673)));
            zz = 0.07196 + (((tickAnim - 95) / 40) * (0.36036-(0.07196)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = 2.75987 + (((tickAnim - 135) / 25) * (0-(2.75987)));
            yy = -11.0086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 135) / 25) * (0-(-11.0086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            zz = 0.36036 + (((tickAnim - 135) / 25) * (0-(0.36036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-11.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-15-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 1) / 39) * (5.49495-(0)));
            yy = -11.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-15 + (((tickAnim - 1) / 39) * (-14.3388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15-(-11.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-15)));
            zz = 0 + (((tickAnim - 1) / 39) * (0.28742-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 5.49495 + (((tickAnim - 40) / 20) * (5.50801-(5.49495)));
            yy = -14.3388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 40) / 20) * (3.9701-(-14.3388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            zz = 0.28742 + (((tickAnim - 40) / 20) * (0.62317-(0.28742)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 5.50801 + (((tickAnim - 60) / 35) * (5.50801-(5.50801)));
            yy = 3.9701 + (((tickAnim - 60) / 35) * (3.9701-(3.9701)));
            zz = 0.62317 + (((tickAnim - 60) / 35) * (0.62317-(0.62317)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 5.50801 + (((tickAnim - 95) / 40) * (5.55169-(5.50801)));
            yy = 3.9701 + (((tickAnim - 95) / 40) * (-11.9747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40-(3.9701)));
            zz = 0.62317 + (((tickAnim - 95) / 40) * (1.03495-(0.62317)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = 5.55169 + (((tickAnim - 135) / 25) * (0-(5.55169)));
            yy = -11.9747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40 + (((tickAnim - 135) / 25) * (0-(-11.9747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40)));
            zz = 1.03495 + (((tickAnim - 135) / 25) * (0-(1.03495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-14.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-15-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 1) / 39) * (1.50255-(0)));
            yy = -14.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-15 + (((tickAnim - 1) / 39) * (-11.2498283738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*15-(-14.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-15)));
            zz = 0 + (((tickAnim - 1) / 39) * (-0.01334-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 1.50255 + (((tickAnim - 40) / 20) * (1.47507-(1.50255)));
            yy = -11.2498283738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*15 + (((tickAnim - 40) / 20) * (2.49557-(-11.2498283738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*15)));
            zz = -0.01334 + (((tickAnim - 40) / 20) * (0.34409-(-0.01334)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 1.47507 + (((tickAnim - 60) / 35) * (1.47507-(1.47507)));
            yy = 2.49557 + (((tickAnim - 60) / 35) * (2.49557-(2.49557)));
            zz = 0.34409 + (((tickAnim - 60) / 35) * (0.34409-(0.34409)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 1.47507 + (((tickAnim - 95) / 40) * (1.48247-(1.47507)));
            yy = 2.49557 + (((tickAnim - 95) / 40) * (6.24433-(2.49557)));
            zz = 0.34409 + (((tickAnim - 95) / 40) * (0.44113-(0.34409)));
        }
        else if (tickAnim >= 135 && tickAnim < 146) {
            xx = 1.48247 + (((tickAnim - 135) / 11) * (1.04065-(1.48247)));
            yy = 6.24433 + (((tickAnim - 135) / 11) * (-6.12725-(6.24433)));
            zz = 0.44113 + (((tickAnim - 135) / 11) * (0.1186-(0.44113)));
        }
        else if (tickAnim >= 146 && tickAnim < 160) {
            xx = 1.04065 + (((tickAnim - 146) / 14) * (0-(1.04065)));
            yy = -6.12725 + (((tickAnim - 146) / 14) * (0-(-6.12725)));
            zz = 0.1186 + (((tickAnim - 146) / 14) * (0-(0.1186)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-7-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-7 + (((tickAnim - 20) / 20) * (-4.25-(2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-7)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = -4.25 + (((tickAnim - 40) / 25) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = -4.25 + (((tickAnim - 65) / 30) * (-2.5-(-4.25)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = -2.5 + (((tickAnim - 95) / 40) * (2.24564-(-2.5)));
            yy = 0 + (((tickAnim - 95) / 40) * (-4.6764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0)));
            zz = 0 + (((tickAnim - 95) / 40) * (0.06877-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 2.24564 + (((tickAnim - 135) / 7) * (1.5-(2.24564)));
            yy = -4.6764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 135) / 7) * (-2.55-(-4.6764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = 0.06877 + (((tickAnim - 135) / 7) * (0-(0.06877)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 1.5 + (((tickAnim - 142) / 18) * (0-(1.5)));
            yy = -2.55 + (((tickAnim - 142) / 18) * (0-(-2.55)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4 + (((tickAnim - 20) / 20) * (2.75-(-1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4)));
            yy = 2.5 + (((tickAnim - 20) / 20) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 2.75 + (((tickAnim - 40) / 25) * (2.75-(2.75)));
            yy = 2.5 + (((tickAnim - 40) / 25) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 2.75 + (((tickAnim - 65) / 30) * (0-(2.75)));
            yy = 2.5 + (((tickAnim - 65) / 30) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 95) / 40) * (-4-(0)));
            yy = 2.5 + (((tickAnim - 95) / 40) * (-9.5-(2.5)));
            zz = 0 + (((tickAnim - 95) / 40) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = -4 + (((tickAnim - 135) / 7) * (-4-(-4)));
            yy = -9.5 + (((tickAnim - 135) / 7) * (-9.5-(-9.5)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = -4 + (((tickAnim - 142) / 18) * (0-(-4)));
            yy = -9.5 + (((tickAnim - 142) / 18) * (0-(-9.5)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 135) * (0.775-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0.775 + (((tickAnim - 135) / 7) * (0.775-(0.775)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            zz = 0.775 + (((tickAnim - 142) / 18) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 9 + (((tickAnim - 20) / 20) * (11.5-(9)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 11.5 + (((tickAnim - 40) / 55) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 11.5 + (((tickAnim - 95) / 40) * (10.53978-(11.5)));
            yy = 0 + (((tickAnim - 95) / 40) * (6.99289-(0)));
            zz = 0 + (((tickAnim - 95) / 40) * (-3.29464-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 10.53978 + (((tickAnim - 135) / 7) * (10.53978-(10.53978)));
            yy = 6.99289 + (((tickAnim - 135) / 7) * (6.99289-(6.99289)));
            zz = -3.29464 + (((tickAnim - 135) / 7) * (-3.29464-(-3.29464)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 10.53978 + (((tickAnim - 142) / 18) * (0-(10.53978)));
            yy = 6.99289 + (((tickAnim - 142) / 18) * (0-(6.99289)));
            zz = -3.29464 + (((tickAnim - 142) / 18) * (0-(-3.29464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5.75 + (((tickAnim - 20) / 20) * (2.5-(5.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 2.5 + (((tickAnim - 40) / 120) * (0-(2.5)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (4.75-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 8.75 + (((tickAnim - 20) / 20) * (8.75-(8.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 4.75 + (((tickAnim - 40) / 55) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 8.75 + (((tickAnim - 40) / 55) * (8.75-(8.75)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 4.75 + (((tickAnim - 95) / 40) * (4.62411-(4.75)));
            yy = 0 + (((tickAnim - 95) / 40) * (1.08752-(0)));
            zz = 8.75 + (((tickAnim - 95) / 40) * (-4.45609-(8.75)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 4.62411 + (((tickAnim - 135) / 7) * (4.62411-(4.62411)));
            yy = 1.08752 + (((tickAnim - 135) / 7) * (1.08752-(1.08752)));
            zz = -4.45609 + (((tickAnim - 135) / 7) * (-4.45609-(-4.45609)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 4.62411 + (((tickAnim - 142) / 18) * (0-(4.62411)));
            yy = 1.08752 + (((tickAnim - 142) / 18) * (0-(1.08752)));
            zz = -4.45609 + (((tickAnim - 142) / 18) * (0-(-4.45609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 20) / 20) * (-0.5-(2.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = -0.5 + (((tickAnim - 40) / 55) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = -0.5 + (((tickAnim - 95) / 40) * (15.25577-(-0.5)));
            yy = 0 + (((tickAnim - 95) / 40) * (4.97256-(0)));
            zz = 0 + (((tickAnim - 95) / 40) * (2.67924-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 15.25577 + (((tickAnim - 135) / 7) * (15.25577-(15.25577)));
            yy = 4.97256 + (((tickAnim - 135) / 7) * (4.97256-(4.97256)));
            zz = 2.67924 + (((tickAnim - 135) / 7) * (2.67924-(2.67924)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 15.25577 + (((tickAnim - 142) / 18) * (0-(15.25577)));
            yy = 4.97256 + (((tickAnim - 142) / 18) * (0-(4.97256)));
            zz = 2.67924 + (((tickAnim - 142) / 18) * (0-(2.67924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -6.5 + (((tickAnim - 20) / 20) * (-2.5-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -2.5 + (((tickAnim - 40) / 120) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-17.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (2.15288-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (-0.63653-(0)));
            zz = -17.75 + (((tickAnim - 20) / 20) * (-13.86169-(-17.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 2.15288 + (((tickAnim - 40) / 55) * (2.15288-(2.15288)));
            yy = -0.63653 + (((tickAnim - 40) / 55) * (-0.63653-(-0.63653)));
            zz = -13.86169 + (((tickAnim - 40) / 55) * (-13.86169-(-13.86169)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 2.15288 + (((tickAnim - 95) / 40) * (0-(2.15288)));
            yy = -0.63653 + (((tickAnim - 95) / 40) * (0-(-0.63653)));
            zz = -13.86169 + (((tickAnim - 95) / 40) * (0-(-13.86169)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.50962-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.6134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.29464-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = -4.50962 + (((tickAnim - 20) / 35) * (-3.50158-(-4.50962)));
            yy = 5.6134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5 + (((tickAnim - 20) / 35) * (6.26994-(5.6134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5)));
            zz = -0.29464 + (((tickAnim - 20) / 35) * (-0.63049-(-0.29464)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -3.50158 + (((tickAnim - 55) / 15) * (-3.50158-(-3.50158)));
            yy = 6.26994 + (((tickAnim - 55) / 15) * (6.26994-(6.26994)));
            zz = -0.63049 + (((tickAnim - 55) / 15) * (-0.63049-(-0.63049)));
        }
        else if (tickAnim >= 70 && tickAnim < 71) {
            xx = -3.50158 + (((tickAnim - 70) / 1) * (-3.50158-(-3.50158)));
            yy = 6.26994 + (((tickAnim - 70) / 1) * (-4.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-15-(6.26994)));
            zz = -0.63049 + (((tickAnim - 70) / 1) * (-0.63049-(-0.63049)));
        }
        else if (tickAnim >= 71 && tickAnim < 83) {
            xx = -3.50158 + (((tickAnim - 71) / 12) * (-0.47958-(-3.50158)));
            yy = -4.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-15 + (((tickAnim - 71) / 12) * (9.86656-(-4.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-15)));
            zz = -0.63049 + (((tickAnim - 71) / 12) * (0.92564-(-0.63049)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = -0.47958 + (((tickAnim - 83) / 11) * (-0.47958-(-0.47958)));
            yy = 9.86656 + (((tickAnim - 83) / 11) * (9.86656-(9.86656)));
            zz = 0.92564 + (((tickAnim - 83) / 11) * (0.92564-(0.92564)));
        }
        else if (tickAnim >= 94 && tickAnim < 95) {
            xx = -0.47958 + (((tickAnim - 94) / 1) * (-0.47958-(-0.47958)));
            yy = 9.86656 + (((tickAnim - 94) / 1) * (55.3416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55-(9.86656)));
            zz = 0.92564 + (((tickAnim - 94) / 1) * (0.92564-(0.92564)));
        }
        else if (tickAnim >= 95 && tickAnim < 113) {
            xx = -0.47958 + (((tickAnim - 95) / 18) * (0-(-0.47958)));
            yy = 55.3416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55 + (((tickAnim - 95) / 18) * (-9.25-(55.3416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55)));
            zz = 0.92564 + (((tickAnim - 95) / 18) * (-2.75-(0.92564)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            yy = -9.25 + (((tickAnim - 113) / 22) * (-3-(-9.25)));
            zz = -2.75 + (((tickAnim - 113) / 22) * (0-(-2.75)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = -3 + (((tickAnim - 135) / 7) * (-3-(-3)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = -3 + (((tickAnim - 142) / 18) * (0-(-3)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.01501-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (9.3707+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.24552-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = -2.01501 + (((tickAnim - 20) / 35) * (0.43316-(-2.01501)));
            yy = 9.3707+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5 + (((tickAnim - 20) / 35) * (9.37309-(9.3707+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5)));
            zz = -0.24552 + (((tickAnim - 20) / 35) * (-0.33029-(-0.24552)));
        }
        else if (tickAnim >= 55 && tickAnim < 71) {
            xx = 0.43316 + (((tickAnim - 55) / 16) * (0.43316-(0.43316)));
            yy = 9.37309 + (((tickAnim - 55) / 16) * (9.37309-(9.37309)));
            zz = -0.33029 + (((tickAnim - 55) / 16) * (-0.33029-(-0.33029)));
        }
        else if (tickAnim >= 71 && tickAnim < 83) {
            xx = 0.43316 + (((tickAnim - 71) / 12) * (0.18433-(0.43316)));
            yy = 9.37309 + (((tickAnim - 71) / 12) * (11.37308-(9.37309)));
            zz = -0.33029 + (((tickAnim - 71) / 12) * (-0.32377-(-0.33029)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 0.18433 + (((tickAnim - 83) / 11) * (0.18433-(0.18433)));
            yy = 11.37308 + (((tickAnim - 83) / 11) * (11.37308-(11.37308)));
            zz = -0.32377 + (((tickAnim - 83) / 11) * (-0.32377-(-0.32377)));
        }
        else if (tickAnim >= 94 && tickAnim < 95) {
            xx = 0.18433 + (((tickAnim - 94) / 1) * (0.18433-(0.18433)));
            yy = 11.37308 + (((tickAnim - 94) / 1) * (35.4231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*55-(11.37308)));
            zz = -0.32377 + (((tickAnim - 94) / 1) * (-0.32377-(-0.32377)));
        }
        else if (tickAnim >= 95 && tickAnim < 113) {
            xx = 0.18433 + (((tickAnim - 95) / 18) * (-0.12721-(0.18433)));
            yy = 35.4231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*55 + (((tickAnim - 95) / 18) * (-7.24889-(35.4231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*55)));
            zz = -0.32377 + (((tickAnim - 95) / 18) * (1.00806-(-0.32377)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = -0.12721 + (((tickAnim - 113) / 22) * (0-(-0.12721)));
            yy = -7.24889 + (((tickAnim - 113) / 22) * (0-(-7.24889)));
            zz = 1.00806 + (((tickAnim - 113) / 22) * (0-(1.00806)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-7.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = 9.75 + (((tickAnim - 20) / 35) * (8.08181-(9.75)));
            yy = -8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 20) / 35) * (1.37893-(-8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = -7.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 20) / 35) * (2.70382-(-7.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
        }
        else if (tickAnim >= 55 && tickAnim < 71) {
            xx = 8.08181 + (((tickAnim - 55) / 16) * (8.08181-(8.08181)));
            yy = 1.37893 + (((tickAnim - 55) / 16) * (1.37893-(1.37893)));
            zz = 2.70382 + (((tickAnim - 55) / 16) * (2.70382-(2.70382)));
        }
        else if (tickAnim >= 71 && tickAnim < 83) {
            xx = 8.08181 + (((tickAnim - 71) / 12) * (8.10861-(8.08181)));
            yy = 1.37893 + (((tickAnim - 71) / 12) * (4.84408-(1.37893)));
            zz = 2.70382 + (((tickAnim - 71) / 12) * (3.19734-(2.70382)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 8.10861 + (((tickAnim - 83) / 11) * (8.10861-(8.10861)));
            yy = 4.84408 + (((tickAnim - 83) / 11) * (4.84408-(4.84408)));
            zz = 3.19734 + (((tickAnim - 83) / 11) * (3.19734-(3.19734)));
        }
        else if (tickAnim >= 94 && tickAnim < 95) {
            xx = 8.10861 + (((tickAnim - 94) / 1) * (8.10861-(8.10861)));
            yy = 4.84408 + (((tickAnim - 94) / 1) * (50.5191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55-(4.84408)));
            zz = 3.19734 + (((tickAnim - 94) / 1) * (3.19734-(3.19734)));
        }
        else if (tickAnim >= 95 && tickAnim < 135) {
            xx = 8.10861 + (((tickAnim - 95) / 40) * (0-(8.10861)));
            yy = 50.5191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55 + (((tickAnim - 95) / 40) * (-6.25-(50.5191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55)));
            zz = 3.19734 + (((tickAnim - 95) / 40) * (0-(3.19734)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = -6.25 + (((tickAnim - 135) / 7) * (-6.25-(-6.25)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = -6.25 + (((tickAnim - 142) / 18) * (0-(-6.25)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (6-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0.75-(0)));
            yy = 6 + (((tickAnim - 55) / 3) * (6-(6)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 0.75 + (((tickAnim - 58) / 4) * (0-(0.75)));
            yy = 6 + (((tickAnim - 58) / 4) * (6-(6)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 62) / 3) * (0.75-(0)));
            yy = 6 + (((tickAnim - 62) / 3) * (6-(6)));
            zz = 0 + (((tickAnim - 62) / 3) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 0.75 + (((tickAnim - 65) / 3) * (0-(0.75)));
            yy = 6 + (((tickAnim - 65) / 3) * (6-(6)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            yy = 6 + (((tickAnim - 68) / 3) * (6-(6)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 71) / 6) * (-6.18333-(0)));
            yy = 6 + (((tickAnim - 71) / 6) * (6-(6)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = -6.18333 + (((tickAnim - 77) / 6) * (-5.75-(-6.18333)));
            yy = 6 + (((tickAnim - 77) / 6) * (6-(6)));
            zz = 0 + (((tickAnim - 77) / 6) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = -5.75 + (((tickAnim - 83) / 11) * (-5.75-(-5.75)));
            yy = 6 + (((tickAnim - 83) / 11) * (6-(6)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 95) {
            xx = -5.75 + (((tickAnim - 94) / 1) * (-5.75-(-5.75)));
            yy = 6 + (((tickAnim - 94) / 1) * (6-(6)));
            zz = 0 + (((tickAnim - 94) / 1) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 113) {
            xx = -5.75 + (((tickAnim - 95) / 18) * (-2.71058-(-5.75)));
            yy = 6 + (((tickAnim - 95) / 18) * (-9.12242-(6)));
            zz = 0 + (((tickAnim - 95) / 18) * (-2.11231-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = -2.71058 + (((tickAnim - 113) / 22) * (0-(-2.71058)));
            yy = -9.12242 + (((tickAnim - 113) / 22) * (-16-(-9.12242)));
            zz = -2.11231 + (((tickAnim - 113) / 22) * (0-(-2.11231)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = -16 + (((tickAnim - 135) / 7) * (-16-(-16)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = -16 + (((tickAnim - 142) / 18) * (0-(-16)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2 + (((tickAnim - 10) / 10) * (-0.65-(-2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.65 + (((tickAnim - 20) / 5) * (-19.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+27.5))*20-(-0.65)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -19.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+27.5))*20 + (((tickAnim - 25) / 10) * (17.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20-(-19.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+27.5))*20)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 17.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20 + (((tickAnim - 35) / 5) * (-0.675-(17.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -0.675 + (((tickAnim - 40) / 15) * (-0.675-(-0.675)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -0.675 + (((tickAnim - 55) / 3) * (-2.17-(-0.675)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -2.17 + (((tickAnim - 58) / 4) * (-0.675-(-2.17)));
            yy = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = -0.675 + (((tickAnim - 62) / 3) * (-2.17-(-0.675)));
            yy = 0 + (((tickAnim - 62) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 3) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -2.17 + (((tickAnim - 65) / 3) * (-0.675-(-2.17)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -0.675 + (((tickAnim - 68) / 3) * (-0.675-(-0.675)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = -0.675 + (((tickAnim - 71) / 6) * (6.93-(-0.675)));
            yy = 0 + (((tickAnim - 71) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = 6.93 + (((tickAnim - 77) / 6) * (3.83-(6.93)));
            yy = 0 + (((tickAnim - 77) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 6) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 3.83 + (((tickAnim - 83) / 5) * (4.83-(3.83)));
            yy = 0 + (((tickAnim - 83) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 4.83 + (((tickAnim - 88) / 6) * (3.83-(4.83)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 95) {
            xx = 3.83 + (((tickAnim - 94) / 1) * (3.83-(3.83)));
            yy = 0 + (((tickAnim - 94) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 1) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 113) {
            xx = 3.83 + (((tickAnim - 95) / 18) * (0-(3.83)));
            yy = 0 + (((tickAnim - 95) / 18) * (-21-(0)));
            zz = 0 + (((tickAnim - 95) / 18) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            yy = -21 + (((tickAnim - 113) / 22) * (0-(-21)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 135 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.25 + (((tickAnim - 10) / 5) * (0-(4.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -6 + (((tickAnim - 20) / 20) * (-9-(-6)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -9 + (((tickAnim - 40) / 15) * (-2-(-9)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -2 + (((tickAnim - 55) / 3) * (0.75-(-2)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 0.75 + (((tickAnim - 58) / 4) * (-2-(0.75)));
            yy = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = -2 + (((tickAnim - 62) / 3) * (0.75-(-2)));
            yy = 0 + (((tickAnim - 62) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 3) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 0.75 + (((tickAnim - 65) / 3) * (-2-(0.75)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -2 + (((tickAnim - 68) / 3) * (-2-(-2)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = -2 + (((tickAnim - 71) / 6) * (-2.62-(-2)));
            yy = 0 + (((tickAnim - 71) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = -2.62 + (((tickAnim - 77) / 6) * (5.25-(-2.62)));
            yy = 0 + (((tickAnim - 77) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 6) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 93) {
            xx = 5.25 + (((tickAnim - 83) / 10) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 83) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 10) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 113) {
            xx = 5.25 + (((tickAnim - 93) / 20) * (10.50658-(5.25)));
            yy = 0 + (((tickAnim - 93) / 20) * (12.99987-(0)));
            zz = 0 + (((tickAnim - 93) / 20) * (0.05772-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 10.50658 + (((tickAnim - 113) / 22) * (7.89591-(10.50658)));
            yy = 12.99987 + (((tickAnim - 113) / 22) * (7.78788-(12.99987)));
            zz = 0.05772 + (((tickAnim - 113) / 22) * (-0.64748-(0.05772)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 7.89591 + (((tickAnim - 135) / 7) * (7.89591-(7.89591)));
            yy = 7.78788 + (((tickAnim - 135) / 7) * (7.78788-(7.78788)));
            zz = -0.64748 + (((tickAnim - 135) / 7) * (-0.64748-(-0.64748)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 7.89591 + (((tickAnim - 142) / 18) * (0-(7.89591)));
            yy = 7.78788 + (((tickAnim - 142) / 18) * (0-(7.78788)));
            zz = -0.64748 + (((tickAnim - 142) / 18) * (0-(-0.64748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -12.75 + (((tickAnim - 55) / 105) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 105) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0.25-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0.575-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            yy = 0.25 + (((tickAnim - 55) / 105) * (0-(0.25)));
            zz = 0.575 + (((tickAnim - 55) / 105) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(xx);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(yy);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 6) * (0.0675-(1)));
            zz = 1 + (((tickAnim - 0) / 6) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 6) / 7) * (1-(1)));
            yy = 0.0675 + (((tickAnim - 6) / 7) * (1-(0.0675)));
            zz = 1 + (((tickAnim - 6) / 7) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 13) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 13) / 15) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 28) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 28) / 6) * (0.0675-(1)));
            zz = 1 + (((tickAnim - 28) / 6) * (1-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 1 + (((tickAnim - 34) / 7) * (1-(1)));
            yy = 0.0675 + (((tickAnim - 34) / 7) * (1-(0.0675)));
            zz = 1 + (((tickAnim - 34) / 7) * (1-(1)));
        }
        else if (tickAnim >= 41 && tickAnim < 71) {
            xx = 1 + (((tickAnim - 41) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 41) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 41) / 30) * (1-(1)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 1 + (((tickAnim - 71) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 71) / 6) * (0.0675-(1)));
            zz = 1 + (((tickAnim - 71) / 6) * (1-(1)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 77) / 6) * (1-(1)));
            yy = 0.0675 + (((tickAnim - 77) / 6) * (1-(0.0675)));
            zz = 1 + (((tickAnim - 77) / 6) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 1 + (((tickAnim - 83) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 83) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 83) / 4) * (1-(1)));
        }
        else if (tickAnim >= 87 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 87) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 87) / 3) * (0.0675-(1)));
            zz = 1 + (((tickAnim - 87) / 3) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 1 + (((tickAnim - 90) / 3) * (1-(1)));
            yy = 0.0675 + (((tickAnim - 90) / 3) * (1-(0.0675)));
            zz = 1 + (((tickAnim - 90) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);



        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(0), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 18) / 22) * (0-(2.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (2.75-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 2.75 + (((tickAnim - 55) / 3) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 2.75 + (((tickAnim - 58) / 22) * (0-(2.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -6 + (((tickAnim - 18) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -6 + (((tickAnim - 55) / 3) * (-6-(-6)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -6 + (((tickAnim - 58) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (31.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 31.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40 + (((tickAnim - 18) / 22) * (34.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40-(31.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 58) {
            xx = 34.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40 + (((tickAnim - 40) / 18) * (7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*20-(34.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40)));
            yy = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 18) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*20 + (((tickAnim - 58) / 22) * (0-(7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*20)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5 + (((tickAnim - 18) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5 + (((tickAnim - 40) / 15) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5 + (((tickAnim - 55) / 15) * (0.33-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.33 + (((tickAnim - 70) / 10) * (0-(0.33)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-5 + (((tickAnim - 18) / 22) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 40) / 18) * (-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*20-(0)));
            yy = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 18) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = -4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*20 + (((tickAnim - 58) / 12) * (-19.56-(-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*20)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -19.56 + (((tickAnim - 70) / 10) * (0-(-19.56)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-10 + (((tickAnim - 18) / 22) * (0-(-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-10)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 40) / 18) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*30-(0)));
            yy = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 18) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*30 + (((tickAnim - 58) / 22) * (0-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*30)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*-5 + (((tickAnim - 18) / 22) * (-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*5-(-3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*-5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*5 + (((tickAnim - 40) / 15) * (-12.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*20-(-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -12.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*20 + (((tickAnim - 55) / 15) * (13.82-(-12.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*20)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 13.82 + (((tickAnim - 70) / 10) * (0-(13.82)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            yy = -0.275 + (((tickAnim - 55) / 15) * (-0.03-(-0.275)));
            zz = 0 + (((tickAnim - 55) / 15) * (0.3-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = -0.03 + (((tickAnim - 70) / 10) * (0-(-0.03)));
            zz = 0.3 + (((tickAnim - 70) / 10) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 6.5 + (((tickAnim - 7) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 40) / 7) * (6.5-(0)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 6.5 + (((tickAnim - 47) / 5) * (0-(6.5)));
            yy = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 2) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 2.25 + (((tickAnim - 15) / 11) * (-15.75-(2.25)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = -15.75 + (((tickAnim - 26) / 14) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (2.25-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 2.25 + (((tickAnim - 55) / 13) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 55) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 13) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 2.25 + (((tickAnim - 68) / 12) * (0-(2.25)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 7) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 22) * (1-(1)));
            zz = 1 + (((tickAnim - 7) / 22) * (1.1-(1)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 29) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 29) / 11) * (1-(1)));
            zz = 1.1 + (((tickAnim - 29) / 11) * (1-(1.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 40) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 7) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 47) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 47) / 21) * (1-(1)));
            zz = 1 + (((tickAnim - 47) / 21) * (1.1-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 68) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 68) / 12) * (1-(1)));
            zz = 1.1 + (((tickAnim - 68) / 12) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 37 + (((tickAnim - 26) / 14) * (0-(37)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 40) / 7) * (23.6-(0)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 23.6 + (((tickAnim - 47) / 6) * (24.84-(23.6)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 24.84 + (((tickAnim - 53) / 7) * (19.75-(24.84)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 19.75 + (((tickAnim - 60) / 20) * (0-(19.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.615-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            yy = 0.615 + (((tickAnim - 7) / 19) * (1.625-(0.615)));
            zz = 0 + (((tickAnim - 7) / 19) * (-1.525-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 1.625 + (((tickAnim - 26) / 14) * (0-(1.625)));
            zz = -1.525 + (((tickAnim - 26) / 14) * (0-(-1.525)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 7) * (0.615-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = 0.615 + (((tickAnim - 47) / 6) * (1.255-(0.615)));
            zz = 0 + (((tickAnim - 47) / 6) * (-0.3-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 1.255 + (((tickAnim - 53) / 7) * (1.45-(1.255)));
            zz = -0.3 + (((tickAnim - 53) / 7) * (0-(-0.3)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 1.45 + (((tickAnim - 60) / 20) * (0-(1.45)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1.1-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 7) / 19) * (1-(1)));
            yy = 1.1 + (((tickAnim - 7) / 19) * (1.3-(1.1)));
            zz = 1 + (((tickAnim - 7) / 19) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 26) / 14) * (1-(1)));
            yy = 1.3 + (((tickAnim - 26) / 14) * (1-(1.3)));
            zz = 1 + (((tickAnim - 26) / 14) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 40) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 7) * (1.1-(1)));
            zz = 1 + (((tickAnim - 40) / 7) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 47) / 13) * (1-(1)));
            yy = 1.1 + (((tickAnim - 47) / 13) * (1.3-(1.1)));
            zz = 1 + (((tickAnim - 47) / 13) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 60) / 20) * (1-(1)));
            yy = 1.3 + (((tickAnim - 60) / 20) * (1-(1.3)));
            zz = 1 + (((tickAnim - 60) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 26) / 14) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (-5.44-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -5.44 + (((tickAnim - 53) / 7) * (-7.5-(-5.44)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 60) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0.4-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 26) / 14) * (0-(0.575)));
            zz = 0.4 + (((tickAnim - 26) / 14) * (0-(0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0.435-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0.225-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0.435 + (((tickAnim - 53) / 7) * (0.575-(0.435)));
            zz = 0.225 + (((tickAnim - 53) / 7) * (0.4-(0.225)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 60) / 20) * (0-(0.575)));
            zz = 0.4 + (((tickAnim - 60) / 20) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(xx);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(yy);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 7) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 19) * (1.1-(1)));
            zz = 1 + (((tickAnim - 7) / 19) * (1.1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 26) / 14) * (1-(1)));
            yy = 1.1 + (((tickAnim - 26) / 14) * (1-(1.1)));
            zz = 1.1 + (((tickAnim - 26) / 14) * (1-(1.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 40) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 7) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 47) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 47) / 6) * (1.0438-(1)));
            zz = 1 + (((tickAnim - 47) / 6) * (1.2438-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 53) / 7) * (1-(1)));
            yy = 1.0438 + (((tickAnim - 53) / 7) * (1.1-(1.0438)));
            zz = 1.2438 + (((tickAnim - 53) / 7) * (1.1-(1.2438)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 60) / 20) * (1-(1)));
            yy = 1.1 + (((tickAnim - 60) / 20) * (1-(1.1)));
            zz = 1.1 + (((tickAnim - 60) / 20) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 14.25 + (((tickAnim - 26) / 14) * (0-(14.25)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (7.41-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 7.41 + (((tickAnim - 53) / 7) * (14.25-(7.41)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 14.25 + (((tickAnim - 60) / 20) * (0-(14.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat4, throat4.rotateAngleX + (float) Math.toRadians(xx), throat4.rotateAngleY + (float) Math.toRadians(yy), throat4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (-1.075-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = -0.3 + (((tickAnim - 26) / 14) * (0-(-0.3)));
            zz = -1.075 + (((tickAnim - 26) / 14) * (0-(-1.075)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0.01-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (-0.77-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0.01 + (((tickAnim - 53) / 7) * (-0.3-(0.01)));
            zz = -0.77 + (((tickAnim - 53) / 7) * (-1.075-(-0.77)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = -0.3 + (((tickAnim - 60) / 20) * (0-(-0.3)));
            zz = -1.075 + (((tickAnim - 60) / 20) * (0-(-1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat4.rotationPointX = this.throat4.rotationPointX + (float)(xx);
        this.throat4.rotationPointY = this.throat4.rotationPointY - (float)(yy);
        this.throat4.rotationPointZ = this.throat4.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 7) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 7) / 19) * (1.5-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 26) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 26) / 14) * (1-(1)));
            zz = 1.5 + (((tickAnim - 26) / 14) * (1-(1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 40) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 7) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 47) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 47) / 6) * (1-(1)));
            zz = 1 + (((tickAnim - 47) / 6) * (1.5188-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 53) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 7) * (1-(1)));
            zz = 1.5188 + (((tickAnim - 53) / 7) * (1.5-(1.5188)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 60) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 60) / 20) * (1-(1)));
            zz = 1.5 + (((tickAnim - 60) / 20) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat4.setScale((float)xx, (float)yy, (float)zz);
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -17.23236 + (((tickAnim - 0) / 13) * (7.12557-(-17.23236)));
            yy = -1.00374 + (((tickAnim - 0) / 13) * (-0.21714-(-1.00374)));
            zz = -2.01381 + (((tickAnim - 0) / 13) * (1.73648-(-2.01381)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 7.12557 + (((tickAnim - 13) / 10) * (29.75-(7.12557)));
            yy = -0.21714 + (((tickAnim - 13) / 10) * (0-(-0.21714)));
            zz = 1.73648 + (((tickAnim - 13) / 10) * (0-(1.73648)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 29.75 + (((tickAnim - 23) / 22) * (84.5676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150-(29.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (-1.00374-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (-2.01381-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 84.5676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150 + (((tickAnim - 45) / 5) * (-17.23236-(84.5676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150)));
            yy = -1.00374 + (((tickAnim - 45) / 5) * (-1.00374-(-1.00374)));
            zz = -2.01381 + (((tickAnim - 45) / 5) * (-2.01381-(-2.01381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -3.72859 + (((tickAnim - 0) / 23) * (8.52141-(-3.72859)));
            yy = 1.31255 + (((tickAnim - 0) / 23) * (1.31255-(1.31255)));
            zz = 0.91635 + (((tickAnim - 0) / 23) * (0.91635-(0.91635)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 8.52141 + (((tickAnim - 23) / 7) * (-17.4347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100-(8.52141)));
            yy = 1.31255 + (((tickAnim - 23) / 7) * (1.31255-(1.31255)));
            zz = 0.91635 + (((tickAnim - 23) / 7) * (0.91635-(0.91635)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -17.4347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100 + (((tickAnim - 30) / 15) * (20.24868-(-17.4347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100)));
            yy = 1.31255 + (((tickAnim - 30) / 15) * (1.31255-(1.31255)));
            zz = 0.91635 + (((tickAnim - 30) / 15) * (0.91635-(0.91635)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 20.24868 + (((tickAnim - 45) / 5) * (-3.72859-(20.24868)));
            yy = 1.31255 + (((tickAnim - 45) / 5) * (1.31255-(1.31255)));
            zz = 0.91635 + (((tickAnim - 45) / 5) * (0.91635-(0.91635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -0.7 + (((tickAnim - 0) / 23) * (-0.7-(-0.7)));
            zz = -0.025 + (((tickAnim - 0) / 23) * (-0.025-(-0.025)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = -0.7 + (((tickAnim - 23) / 27) * (-0.7-(-0.7)));
            zz = -0.025 + (((tickAnim - 23) / 27) * (-0.025-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 13.25 + (((tickAnim - 0) / 23) * (-6.25-(13.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -6.25 + (((tickAnim - 23) / 1) * (-4.05-(-6.25)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -4.05 + (((tickAnim - 24) / 6) * (80.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-250-(-4.05)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 80.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-250 + (((tickAnim - 30) / 13) * (-53.66-(80.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-250)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -53.66 + (((tickAnim - 43) / 7) * (13.25-(-53.66)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 23) * (0.125-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 23) / 10) * (0.91-(0.125)));
            zz = 0 + (((tickAnim - 23) / 10) * (1.3-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0.91 + (((tickAnim - 33) / 10) * (1.285-(0.91)));
            zz = 1.3 + (((tickAnim - 33) / 10) * (1.3-(1.3)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.285 + (((tickAnim - 43) / 7) * (-0.475-(1.285)));
            zz = 1.3 + (((tickAnim - 43) / 7) * (0-(1.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.23653 + (((tickAnim - 0) / 8) * (-4.4059-(12.23653)));
            yy = 0.48013 + (((tickAnim - 0) / 8) * (-0.21953-(0.48013)));
            zz = -3.21438 + (((tickAnim - 0) / 8) * (-2.19939-(-3.21438)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -4.4059 + (((tickAnim - 8) / 4) * (-14.68354-(-4.4059)));
            yy = -0.21953 + (((tickAnim - 8) / 4) * (-0.08232-(-0.21953)));
            zz = -2.19939 + (((tickAnim - 8) / 4) * (-0.82476-(-2.19939)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -14.68354 + (((tickAnim - 12) / 2) * (-20.25-(-14.68354)));
            yy = -0.08232 + (((tickAnim - 12) / 2) * (0-(-0.08232)));
            zz = -0.82476 + (((tickAnim - 12) / 2) * (0-(-0.82476)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -20.25 + (((tickAnim - 14) / 6) * (30.91173-(-20.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (3.43331-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (2.05364-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 30.91173 + (((tickAnim - 20) / 3) * (52.75-(30.91173)));
            yy = 3.43331 + (((tickAnim - 20) / 3) * (0-(3.43331)));
            zz = 2.05364 + (((tickAnim - 20) / 3) * (0-(2.05364)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 52.75 + (((tickAnim - 23) / 3) * (76.34385-(52.75)));
            yy = 0 + (((tickAnim - 23) / 3) * (-1.76127-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0.45701-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 76.34385 + (((tickAnim - 26) / 7) * (83.78154-(76.34385)));
            yy = -1.76127 + (((tickAnim - 26) / 7) * (-5.28381-(-1.76127)));
            zz = 0.45701 + (((tickAnim - 26) / 7) * (1.37103-(0.45701)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 83.78154 + (((tickAnim - 33) / 10) * (83.78154-(83.78154)));
            yy = -5.28381 + (((tickAnim - 33) / 10) * (-5.28381-(-5.28381)));
            zz = 1.37103 + (((tickAnim - 33) / 10) * (1.37103-(1.37103)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 83.78154 + (((tickAnim - 43) / 7) * (12.23653-(83.78154)));
            yy = -5.28381 + (((tickAnim - 43) / 7) * (0.48013-(-5.28381)));
            zz = 1.37103 + (((tickAnim - 43) / 7) * (-3.21438-(1.37103)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 3) * (0.96-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.07-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.96 + (((tickAnim - 3) / 5) * (1.775-(0.96)));
            zz = -0.07 + (((tickAnim - 3) / 5) * (-0.16-(-0.07)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.775 + (((tickAnim - 8) / 4) * (0.41-(1.775)));
            zz = -0.16 + (((tickAnim - 8) / 4) * (-0.06-(-0.16)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.41 + (((tickAnim - 12) / 2) * (-1.025-(0.41)));
            zz = -0.06 + (((tickAnim - 12) / 2) * (0-(-0.06)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -1.025 + (((tickAnim - 14) / 4) * (-1.555-(-1.025)));
            zz = 0 + (((tickAnim - 14) / 4) * (-0.34-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -1.555 + (((tickAnim - 18) / 5) * (-1.15-(-1.555)));
            zz = -0.34 + (((tickAnim - 18) / 5) * (-0.85-(-0.34)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = -1.15 + (((tickAnim - 23) / 10) * (0-(-1.15)));
            zz = -0.85 + (((tickAnim - 23) / 10) * (-0.075-(-0.85)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = -0.075 + (((tickAnim - 33) / 10) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (-0.225-(0)));
            zz = -0.075 + (((tickAnim - 43) / 7) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 29.75 + (((tickAnim - 0) / 23) * (39.5676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150-(29.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 39.5676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150 + (((tickAnim - 23) / 5) * (-17.23236-(39.5676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -17.23236 + (((tickAnim - 28) / 11) * (7.12557-(-17.23236)));
            yy = 0 + (((tickAnim - 28) / 11) * (0.21714-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (-1.73648-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 7.12557 + (((tickAnim - 39) / 11) * (29.75-(7.12557)));
            yy = 0.21714 + (((tickAnim - 39) / 11) * (0-(0.21714)));
            zz = -1.73648 + (((tickAnim - 39) / 11) * (0-(-1.73648)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.52141 + (((tickAnim - 0) / 8) * (9.0653+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100-(8.52141)));
            yy = 1.31255 + (((tickAnim - 0) / 8) * (1.31255-(1.31255)));
            zz = 0.91635 + (((tickAnim - 0) / 8) * (0.91635-(0.91635)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 9.0653+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100 + (((tickAnim - 8) / 15) * (20.24868-(9.0653+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100)));
            yy = 1.31255 + (((tickAnim - 8) / 15) * (1.31255-(1.31255)));
            zz = 0.91635 + (((tickAnim - 8) / 15) * (0.91635-(0.91635)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 20.24868 + (((tickAnim - 23) / 5) * (-3.72859-(20.24868)));
            yy = 1.31255 + (((tickAnim - 23) / 5) * (1.31255-(1.31255)));
            zz = 0.91635 + (((tickAnim - 23) / 5) * (0.91635-(0.91635)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -3.72859 + (((tickAnim - 28) / 22) * (8.52141-(-3.72859)));
            yy = 1.31255 + (((tickAnim - 28) / 22) * (1.31255-(1.31255)));
            zz = 0.91635 + (((tickAnim - 28) / 22) * (0.91635-(0.91635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = -0.7 + (((tickAnim - 0) / 28) * (-0.7-(-0.7)));
            zz = -0.025 + (((tickAnim - 0) / 28) * (-0.025-(-0.025)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -0.7 + (((tickAnim - 28) / 22) * (-0.7-(-0.7)));
            zz = -0.025 + (((tickAnim - 28) / 22) * (-0.025-(-0.025)));
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
            xx = -6.25 + (((tickAnim - 0) / 2) * (-4.05-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -4.05 + (((tickAnim - 2) / 6) * (-16.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-250-(-4.05)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -16.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-250 + (((tickAnim - 8) / 12) * (-53.66-(-16.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-250)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -53.66 + (((tickAnim - 20) / 8) * (13.25-(-53.66)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 28) / 22) * (-6.25-(13.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 10) * (0.91-(0.125)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.91 + (((tickAnim - 10) / 10) * (1.285-(0.91)));
            zz = 1.3 + (((tickAnim - 10) / 10) * (1.3-(1.3)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 1.285 + (((tickAnim - 20) / 8) * (-0.475-(1.285)));
            zz = 1.3 + (((tickAnim - 20) / 8) * (0-(1.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -0.475 + (((tickAnim - 28) / 22) * (0.125-(-0.475)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 52.90153 + (((tickAnim - 0) / 4) * (76.34385-(52.90153)));
            yy = -3.62755 + (((tickAnim - 0) / 4) * (-1.76127-(-3.62755)));
            zz = -4.78241 + (((tickAnim - 0) / 4) * (0.45701-(-4.78241)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 76.34385 + (((tickAnim - 4) / 6) * (83.78154-(76.34385)));
            yy = -1.76127 + (((tickAnim - 4) / 6) * (5.28381-(-1.76127)));
            zz = 0.45701 + (((tickAnim - 4) / 6) * (-1.37103-(0.45701)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 83.78154 + (((tickAnim - 10) / 10) * (83.78154-(83.78154)));
            yy = 5.28381 + (((tickAnim - 10) / 10) * (5.28381-(5.28381)));
            zz = -1.37103 + (((tickAnim - 10) / 10) * (-1.37103-(-1.37103)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 83.78154 + (((tickAnim - 20) / 8) * (12.23653-(83.78154)));
            yy = 5.28381 + (((tickAnim - 20) / 8) * (-0.48013-(5.28381)));
            zz = -1.37103 + (((tickAnim - 20) / 8) * (3.21438-(-1.37103)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 12.23653 + (((tickAnim - 28) / 7) * (-4.4059-(12.23653)));
            yy = -0.48013 + (((tickAnim - 28) / 7) * (0.21953-(-0.48013)));
            zz = 3.21438 + (((tickAnim - 28) / 7) * (2.19939-(3.21438)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -4.4059 + (((tickAnim - 35) / 4) * (-14.68354-(-4.4059)));
            yy = 0.21953 + (((tickAnim - 35) / 4) * (-0.08232-(0.21953)));
            zz = 2.19939 + (((tickAnim - 35) / 4) * (-0.82476-(2.19939)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -14.68354 + (((tickAnim - 39) / 3) * (-20.25-(-14.68354)));
            yy = -0.08232 + (((tickAnim - 39) / 3) * (0-(-0.08232)));
            zz = -0.82476 + (((tickAnim - 39) / 3) * (0-(-0.82476)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -20.25 + (((tickAnim - 42) / 8) * (52.90153-(-20.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (-3.62755-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (-4.78241-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 10) * (0-(-1.15)));
            zz = -0.475 + (((tickAnim - 0) / 10) * (-0.075-(-0.475)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.075 + (((tickAnim - 10) / 10) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (-0.225-(0)));
            zz = -0.075 + (((tickAnim - 20) / 8) * (0-(-0.075)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 28) / 3) * (1.26-(-0.225)));
            zz = 0 + (((tickAnim - 28) / 3) * (-0.07-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 1.26 + (((tickAnim - 31) / 4) * (2.125-(1.26)));
            zz = -0.07 + (((tickAnim - 31) / 4) * (-0.16-(-0.07)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 2.125 + (((tickAnim - 35) / 4) * (0-(2.125)));
            zz = -0.16 + (((tickAnim - 35) / 4) * (0-(-0.16)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (-1.625-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = -1.625 + (((tickAnim - 42) / 3) * (-1.555-(-1.625)));
            zz = 0 + (((tickAnim - 42) / 3) * (-0.34-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -1.555 + (((tickAnim - 45) / 5) * (-1.15-(-1.555)));
            zz = -0.34 + (((tickAnim - 45) / 5) * (-0.475-(-0.34)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 0) / 4) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (16.5-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 16.5 + (((tickAnim - 10) / 18) * (0-(16.5)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 28) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 14) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (-46-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -46 + (((tickAnim - 46) / 4) * (-27.5-(-46)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoe, righttoe.rotateAngleX + (float) Math.toRadians(xx), righttoe.rotateAngleY + (float) Math.toRadians(yy), righttoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 4) * (0-(-0.125)));
            zz = 0.475 + (((tickAnim - 0) / 4) * (0-(0.475)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0.45 + (((tickAnim - 10) / 18) * (0-(0.45)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 28) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 14) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0.475-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoe.rotationPointX = this.righttoe.rotationPointX + (float)(xx);
        this.righttoe.rotationPointY = this.righttoe.rotationPointY - (float)(yy);
        this.righttoe.rotationPointZ = this.righttoe.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-120))*3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-90))*-4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-20))*-0.85);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-175))*-0.75);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -32.75 + (((tickAnim - 18) / 5) * (-27.5-(-32.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -27.5 + (((tickAnim - 23) / 1) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (16.5-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 16.5 + (((tickAnim - 33) / 17) * (0-(16.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoe, lefttoe.rotateAngleX + (float) Math.toRadians(xx), lefttoe.rotateAngleY + (float) Math.toRadians(yy), lefttoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0.475-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 23) / 1) * (0-(-0.125)));
            zz = 0.475 + (((tickAnim - 23) / 1) * (0-(0.475)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0.45-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0.45 + (((tickAnim - 33) / 17) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoe.rotationPointX = this.lefttoe.rotationPointX + (float)(xx);
        this.lefttoe.rotationPointY = this.lefttoe.rotationPointY - (float)(yy);
        this.lefttoe.rotationPointZ = this.lefttoe.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*-3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-90))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-80))*-1), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-140))*-1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-280))*-1), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-160))*-1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*2), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-180))*-1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-300))*2), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*-1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-180))*-2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-20))*-3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-90))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-130))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*-4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*-3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-20))*-3), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-60))*3), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*3), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers2, neckfeathers2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*-5), neckfeathers2.rotateAngleY + (float) Math.toRadians(0), neckfeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers3, neckfeathers3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*-5), neckfeathers3.rotateAngleY + (float) Math.toRadians(0), neckfeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers, neckfeathers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*-5), neckfeathers.rotateAngleY + (float) Math.toRadians(0), neckfeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headcrestside3, headcrestside3.rotateAngleX + (float) Math.toRadians(0), headcrestside3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*-5), headcrestside3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headcrestside, headcrestside.rotateAngleX + (float) Math.toRadians(0), headcrestside.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*5), headcrestside.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headcrestside2, headcrestside2.rotateAngleX + (float) Math.toRadians(0), headcrestside2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*5), headcrestside2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headcrestside4, headcrestside4.rotateAngleX + (float) Math.toRadians(0), headcrestside4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*-5), headcrestside4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headcresttop, headcresttop.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*-5), headcresttop.rotateAngleY + (float) Math.toRadians(0), headcresttop.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-450))*3), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0.15);


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(6.5), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(0);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(0.25);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(0);


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-20))*-3), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*3), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-3), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYutyrannus entity = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -22.5 + (((tickAnim - 0) / 11) * (31-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 31 + (((tickAnim - 11) / 11) * (-22.5-(31)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -0.75 + (((tickAnim - 0) / 11) * (17.5-(-0.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 17.5 + (((tickAnim - 11) / 3) * (177.83+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-255-(17.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 177.83+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-255 + (((tickAnim - 14) / 8) * (-0.75-(177.83+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-255)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 2) * (-0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25 + (((tickAnim - 2) / 2) * (-0.72-(-0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = -0.72 + (((tickAnim - 4) / 7) * (-0.5-(-0.72)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = -0.5 + (((tickAnim - 11) / 11) * (-0.85-(-0.5)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 16 + (((tickAnim - 0) / 11) * (-12-(16)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -12 + (((tickAnim - 11) / 4) * (-56.67-(-12)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -56.67 + (((tickAnim - 15) / 3) * (-56.67-(-56.67)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -56.67 + (((tickAnim - 18) / 4) * (16-(-56.67)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.825-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 11) / 4) * (1.45-(0.875)));
            zz = 0.825 + (((tickAnim - 11) / 4) * (1.23-(0.825)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.45 + (((tickAnim - 15) / 3) * (1.45-(1.45)));
            zz = 1.23 + (((tickAnim - 15) / 3) * (1.23-(1.23)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.45 + (((tickAnim - 18) / 4) * (0-(1.45)));
            zz = 1.23 + (((tickAnim - 18) / 4) * (0-(1.23)));
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
            xx = 10.25 + (((tickAnim - 0) / 5) * (-12.75-(10.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -12.75 + (((tickAnim - 5) / 3) * (48.72676-(-12.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (-1.69765-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-1.23546-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 48.72676 + (((tickAnim - 8) / 3) * (65.5-(48.72676)));
            yy = -1.69765 + (((tickAnim - 8) / 3) * (0-(-1.69765)));
            zz = -1.23546 + (((tickAnim - 8) / 3) * (0-(-1.23546)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 65.5 + (((tickAnim - 11) / 4) * (81.63-(65.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 81.63 + (((tickAnim - 15) / 3) * (81.63-(81.63)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 81.63 + (((tickAnim - 18) / 4) * (7.25-(81.63)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 5) * (1.105+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.105+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 5) / 3) * (-0.735-(1.105+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.735 + (((tickAnim - 8) / 3) * (0-(-0.735)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 31 + (((tickAnim - 0) / 11) * (-22.5-(31)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -22.5 + (((tickAnim - 11) / 11) * (31-(-22.5)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (70.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-255-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 70.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-255 + (((tickAnim - 3) / 8) * (-0.75-(70.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-255)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -0.75 + (((tickAnim - 11) / 11) * (17.5-(-0.75)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 11) * (-0.85-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.85 + (((tickAnim - 11) / 2) * (-1.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.45-(-0.85)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -1.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.45 + (((tickAnim - 13) / 2) * (-0.72-(-1.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.45)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -0.72 + (((tickAnim - 15) / 7) * (-0.5-(-0.72)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12 + (((tickAnim - 0) / 4) * (-56.67-(-12)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -56.67 + (((tickAnim - 4) / 4) * (-56.67-(-56.67)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -56.67 + (((tickAnim - 8) / 3) * (16-(-56.67)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 16 + (((tickAnim - 11) / 11) * (-12-(16)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 4) * (1.45-(0.875)));
            zz = 0.825 + (((tickAnim - 0) / 4) * (1.23-(0.825)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.45 + (((tickAnim - 4) / 4) * (1.45-(1.45)));
            zz = 1.23 + (((tickAnim - 4) / 4) * (1.23-(1.23)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.45 + (((tickAnim - 8) / 3) * (0-(1.45)));
            zz = 1.23 + (((tickAnim - 8) / 3) * (0-(1.23)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (0.875-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0.825-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 65.5 + (((tickAnim - 0) / 4) * (81.63-(65.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 81.63 + (((tickAnim - 4) / 4) * (81.63-(81.63)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 81.63 + (((tickAnim - 8) / 3) * (9-(81.63)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 9 + (((tickAnim - 11) / 5) * (-12.75-(9)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -12.75 + (((tickAnim - 16) / 2) * (48.72676-(-12.75)));
            yy = 0 + (((tickAnim - 16) / 2) * (-1.69765-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-1.23546-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 48.72676 + (((tickAnim - 18) / 4) * (65.5-(48.72676)));
            yy = -1.69765 + (((tickAnim - 18) / 4) * (0-(-1.69765)));
            zz = -1.23546 + (((tickAnim - 18) / 4) * (0-(-1.23546)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.025 + (((tickAnim - 0) / 11) * (-1.2-(-0.025)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = -1.2 + (((tickAnim - 11) / 5) * (5.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(-1.2)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 5.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 16) / 2) * (-0.76-(5.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.76 + (((tickAnim - 18) / 4) * (-0.025-(-0.76)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 24.75 + (((tickAnim - 0) / 11) * (0-(24.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (-72.64-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -72.64 + (((tickAnim - 18) / 4) * (24.75-(-72.64)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoe, righttoe.rotateAngleX + (float) Math.toRadians(xx), righttoe.rotateAngleY + (float) Math.toRadians(yy), righttoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0.425 + (((tickAnim - 0) / 11) * (0-(0.425)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (-0.055-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (1.04-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.055 + (((tickAnim - 17) / 1) * (-0.055-(-0.055)));
            zz = 1.04 + (((tickAnim - 17) / 1) * (1.04-(1.04)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = -0.055 + (((tickAnim - 18) / 0) * (-0.85-(-0.055)));
            zz = 1.04 + (((tickAnim - 18) / 0) * (0.43-(1.04)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.85 + (((tickAnim - 18) / 2) * (-0.095-(-0.85)));
            zz = 0.43 + (((tickAnim - 18) / 2) * (0.255-(0.43)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.095 + (((tickAnim - 20) / 2) * (0-(-0.095)));
            zz = 0.255 + (((tickAnim - 20) / 2) * (0.425-(0.255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoe.rotationPointX = this.righttoe.rotationPointX + (float)(xx);
        this.righttoe.rotationPointY = this.righttoe.rotationPointY - (float)(yy);
        this.righttoe.rotationPointZ = this.righttoe.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5+30))*-4.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55 + (((tickAnim - 0) / 2) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55 + (((tickAnim - 0) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25 + (((tickAnim - 2) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55 + (((tickAnim - 2) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55 + (((tickAnim - 3) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55 + (((tickAnim - 3) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55 + (((tickAnim - 11) / 2) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55 + (((tickAnim - 11) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25 + (((tickAnim - 13) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-10))*0.55-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55 + (((tickAnim - 13) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*332/0.5-50))*-0.55)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-72.64-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -72.64 + (((tickAnim - 8) / 3) * (24.75-(-72.64)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 24.75 + (((tickAnim - 11) / 11) * (0-(24.75)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoe, lefttoe.rotateAngleX + (float) Math.toRadians(xx), lefttoe.rotateAngleY + (float) Math.toRadians(yy), lefttoe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (-0.055-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (1.04-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = -0.055 + (((tickAnim - 6) / 1) * (-0.055-(-0.055)));
            zz = 1.04 + (((tickAnim - 6) / 1) * (1.04-(1.04)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.055 + (((tickAnim - 7) / 1) * (-0.85-(-0.055)));
            zz = 1.04 + (((tickAnim - 7) / 1) * (0.43-(1.04)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.85 + (((tickAnim - 8) / 1) * (-0.095-(-0.85)));
            zz = 0.43 + (((tickAnim - 8) / 1) * (0.255-(0.43)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.095 + (((tickAnim - 9) / 2) * (0-(-0.095)));
            zz = 0.255 + (((tickAnim - 9) / 2) * (0.425-(0.255)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0.425 + (((tickAnim - 11) / 11) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoe.rotationPointX = this.lefttoe.rotationPointX + (float)(xx);
        this.lefttoe.rotationPointY = this.lefttoe.rotationPointY - (float)(yy);
        this.lefttoe.rotationPointZ = this.lefttoe.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5))*1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332))*2), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-50))*1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-50))*4), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-100))*4), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-9.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-250))*4), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-150))*8), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*6));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-550))*8), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*8));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-450))*-12), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-250))*16), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*12));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-20))*4.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+90))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332))*2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-80))*-4.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-150))*2.5));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-80))*-4), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-150))*2.5));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-130))*7), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-180))*-7), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-80))*-4), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-150))*2.5));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-130))*7), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-180))*-7), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(6.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-150))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-100))*1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-200))*-4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-250))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers2, neckfeathers2.rotateAngleX + (float) Math.toRadians(-10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-450))*6), neckfeathers2.rotateAngleY + (float) Math.toRadians(0), neckfeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers3, neckfeathers3.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-450))*6), neckfeathers3.rotateAngleY + (float) Math.toRadians(0), neckfeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-350))*-4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers, neckfeathers.rotateAngleX + (float) Math.toRadians(-6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-450))*6), neckfeathers.rotateAngleY + (float) Math.toRadians(0), neckfeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-450))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headcresttop, headcresttop.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-450))*6), headcresttop.rotateAngleY + (float) Math.toRadians(0), headcresttop.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(9.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-450))*-1), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(23.1236967295+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-500))*-2), throat2.rotateAngleY + (float) Math.toRadians(5.09755), throat2.rotateAngleZ + (float) Math.toRadians(-0.49137));
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(0);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(0.55);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(0);


        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(-24.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-550))*-3), throat3.rotateAngleY + (float) Math.toRadians(0), throat3.rotateAngleZ + (float) Math.toRadians(0));
        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(0);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(0.2);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(1.4);


        this.setRotateAngle(throat4, throat4.rotateAngleX + (float) Math.toRadians(18.75), throat4.rotateAngleY + (float) Math.toRadians(0), throat4.rotateAngleZ + (float) Math.toRadians(0));
        this.throat4.rotationPointX = this.throat4.rotationPointX + (float)(0);
        this.throat4.rotationPointY = this.throat4.rotationPointY - (float)(-0.325);
        this.throat4.rotationPointZ = this.throat4.rotationPointZ + (float)(-0.9);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraYutyrannus ee = (EntityPrehistoricFloraYutyrannus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise anim = RUMBLE
            animRumble(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar/threat anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraYutyrannus e = (EntityPrehistoricFloraYutyrannus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
