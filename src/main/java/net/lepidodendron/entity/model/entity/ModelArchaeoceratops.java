package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeoceratops;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArchaeoceratops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer quills;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer quills2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer upperbody2;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
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
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer horn2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;

    private ModelAnimator animator;

    public ModelArchaeoceratops() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.5F, -4.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.0F, -3.5F, -2.5F, 6, 8, 8, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(3.0F, -13.333F, -0.6436F);
        this.body.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.2182F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 42, 12, -1.5F, -0.5276F, -1.7847F, 3, 6, 4, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 5.7169F, -1.0471F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6545F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 53, -1.0F, -0.9944F, -0.1212F, 2, 6, 3, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.25F, 1.125F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.48F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 20, 58, -1.0F, 0.1084F, -0.6345F, 2, 4, 2, -0.01F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 3.6084F, 0.3655F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0436F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 32, 49, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-3.0F, -13.333F, -0.6436F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.2182F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 42, 12, -1.5F, -0.5276F, -1.7847F, 3, 6, 4, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 5.7169F, -1.0471F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6545F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 53, -1.0F, -0.9944F, -0.1212F, 2, 6, 3, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.25F, 1.125F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.48F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 20, 58, -1.0F, 0.1084F, -0.6345F, 2, 4, 2, -0.01F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 3.6084F, 0.3655F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0436F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 32, 49, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -15.6164F, 1.0237F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 29, 0, -2.5F, 0.0F, 0.0F, 5, 6, 5, 0.0F, false));

        this.quills = new AdvancedModelRenderer(this);
        this.quills.setRotationPoint(0.0F, 0.2997F, 0.0131F);
        this.tail.addChild(quills);
        this.quills.cubeList.add(new ModelBox(quills, 15, 42, -1.5F, -3.2997F, -0.0131F, 3, 3, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.2997F, -0.2631F);
        this.quills.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 41, -0.5F, -6.0F, 0.25F, 2, 6, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3382F, 4.7555F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 17, -1.5F, -0.0872F, -0.2538F, 3, 4, 7, 0.0F, false));

        this.quills2 = new AdvancedModelRenderer(this);
        this.quills2.setRotationPoint(0.0F, -0.0872F, 0.2462F);
        this.tail2.addChild(quills2);
        this.quills2.cubeList.add(new ModelBox(quills2, 0, 31, -1.0F, -2.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -0.0217F, 2.5458F);
        this.quills2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 29, 1.0F, -4.9783F, -2.7958F, 1, 5, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0872F, 5.7462F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 38, 39, -1.0F, 0.0F, 0.0F, 2, 3, 6, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 49, 49, -0.5F, 0.1305F, -0.0086F, 1, 2, 6, 0.0F, false));

        this.upperbody2 = new AdvancedModelRenderer(this);
        this.upperbody2.setRotationPoint(0.0F, -16.0F, -6.3F);
        this.body.addChild(upperbody2);
        this.setRotateAngle(upperbody2, 0.0436F, 0.0F, 0.0F);


        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 0.2843F, 0.0154F);
        this.upperbody2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.191F, 0.0724F);
        this.upperbody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 17, -2.0F, -0.066F, -6.046F, 4, 7, 6, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(1.5F, 5.8359F, -2.3415F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.9497F, -0.1289F, -0.4518F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 55, 39, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.25F, 0.25F, 3.5F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.4363F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 63, -0.5F, -0.5F, -1.0F, 1, 3, 2, -0.01F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.5F, 2.5F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 29, 63, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.5F, 5.8359F, -2.3415F);
        this.upperbody.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.9497F, 0.1289F, 0.4518F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 55, 39, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.25F, 0.25F, 3.5F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.4363F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 63, -0.5F, -0.5F, -1.0F, 1, 3, 2, -0.01F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.5F, 2.5F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 29, 63, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 4.7105F, -4.445F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 38, 29, -1.0F, -2.8444F, -4.921F, 3, 3, 6, -0.003F, false));
        this.neck.cubeList.add(new ModelBox(neck, 50, 0, -1.0F, 0.1306F, -3.921F, 3, 1, 5, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 15, 51, -0.5F, 1.0556F, -3.921F, 2, 1, 5, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.751F, -2.8837F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5672F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 55, 23, -1.0F, -1.775F, -6.0F, 2, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 57, 7, -1.5F, -2.775F, -3.0F, 3, 3, 2, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 50, 63, -1.0F, -3.3723F, -3.8035F, 2, 2, 1, 0.006F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.1688F, -7.5888F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 2.1249F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 46, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.6839F, -6.2833F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8596F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 64, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5081F, -2.8528F, -4.9174F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5859F, 0.0671F, -0.1111F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 64, -1.0F, 0.1F, -0.825F, 1, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -3.3723F, -3.8035F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5978F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 46, -1.0F, 0.325F, -1.625F, 1, 1, 1, 0.003F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 46, 1.0F, 0.325F, -1.625F, 1, 1, 1, 0.003F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 13, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5081F, -2.8528F, -4.9174F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5859F, -0.0671F, 0.1111F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 64, 0.0F, 0.1F, -0.825F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -4.2444F, -0.3377F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3155F, -0.2494F, -0.0804F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 56, -0.95F, -0.025F, -3.9F, 1, 2, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, -4.2444F, -0.3377F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3155F, 0.2494F, 0.0804F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 56, -0.05F, -0.025F, -3.9F, 1, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.275F, -1.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 23, -1.5F, -0.575F, -1.6F, 3, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0059F, -0.075F, -4.4382F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.0349F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 42, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.971F, -0.075F, -5.4376F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4363F, -0.0349F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 53, 0.275F, -0.5F, -0.35F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.971F, -0.075F, -5.4376F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4363F, 0.0349F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 53, -0.275F, -0.5F, -0.35F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0059F, -0.075F, -4.4382F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0349F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 42, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -0.775F, -3.0F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1658F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 41, 58, 0.0F, -1.0F, -3.0F, 1, 2, 3, -0.003F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.5F, -0.775F, -3.0F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1658F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 58, -1.0F, -1.0F, -3.0F, 1, 2, 3, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.225F, -6.0F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 46, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(1.25F, -1.0187F, -3.9541F);
        this.head.addChild(horn);
        this.setRotateAngle(horn, 0.7818F, 0.3838F, -0.8494F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.45F, 0.25F, -0.15F);
        this.horn.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, -0.2182F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 59, 58, -0.5F, -0.25F, 0.0F, 1, 3, 2, -0.003F, false));

        this.horn2 = new AdvancedModelRenderer(this);
        this.horn2.setRotationPoint(-1.25F, -1.0187F, -3.9541F);
        this.head.addChild(horn2);
        this.setRotateAngle(horn2, 0.7818F, -0.3838F, 0.8494F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.45F, 0.25F, -0.15F);
        this.horn2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.2182F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 59, 58, -0.5F, -0.25F, 0.0F, 1, 3, 2, -0.003F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.2153F, -0.9877F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 57, 19, -1.5F, 0.0097F, -2.0124F, 3, 1, 2, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 12, -1.0F, 0.0097F, -5.0124F, 2, 1, 3, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, -0.9903F, -2.0124F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.0785F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 58, 0.275F, -1.0F, -2.0F, 0, 2, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, -0.9903F, -2.0124F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0785F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 11, 58, -0.275F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0059F, 0.2597F, -3.4505F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.1222F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 50, 7, 0.1F, -0.5F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0059F, 0.2597F, -3.4505F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.1222F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 50, 7, -0.1F, -0.5F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5F, -0.9903F, -2.0124F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.1658F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 50, 58, 0.0F, 1.0F, -3.0F, 1, 1, 3, -0.003F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.5F, -0.9903F, -2.0124F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.1658F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 50, 58, -1.0F, 1.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.0097F, -5.0124F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.6109F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 49, -0.5F, -0.95F, -0.975F, 1, 1, 1, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 1.727F, -2.088F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2182F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 57, 29, -0.5F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.0097F, -2.0124F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 57, 34, -1.5F, -1.275F, -0.1F, 3, 1, 2, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.0F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.6F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.4F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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

        EntityPrehistoricFloraArchaeoceratops EntityArchaeoceratops = (EntityPrehistoricFloraArchaeoceratops) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityArchaeoceratops.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityArchaeoceratops.getAnimation() == EntityArchaeoceratops.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityArchaeoceratops.isReallyInWater()) {

                if (f3 == 0.0F || !EntityArchaeoceratops.getIsMoving()) {
                    if (EntityArchaeoceratops.getAnimation() != EntityArchaeoceratops.EAT_ANIMATION
                        && EntityArchaeoceratops.getAnimation() != EntityArchaeoceratops.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm3, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityArchaeoceratops.getIsFast()) { //Running


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
        EntityPrehistoricFloraArchaeoceratops ee = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;

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
            else {
                //moving in water
                //
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeoceratops entity = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.25 + (((tickAnim - 5) / 3) * (2.25-(-3.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 8) / 4) * (0-(2.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -7.25 + (((tickAnim - 4) / 4) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (5.75-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.75 + (((tickAnim - 12) / 3) * (0-(5.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -9 + (((tickAnim - 4) / 4) * (-1.25-(-9)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.25 + (((tickAnim - 8) / 4) * (2.25-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 12) / 3) * (0-(2.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11 + (((tickAnim - 4) / 4) * (-28.25-(11)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -28.25 + (((tickAnim - 8) / 4) * (-11.75-(-28.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -11.75 + (((tickAnim - 12) / 3) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.5 + (((tickAnim - 5) / 3) * (-31.75-(16.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -31.75 + (((tickAnim - 8) / 4) * (-4-(-31.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -4 + (((tickAnim - 12) / 3) * (0-(-4)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 5) / 3) * (2-(-4.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2 + (((tickAnim - 8) / 4) * (0-(2)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (35.19771-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.50626-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (6.82524-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 35.19771 + (((tickAnim - 5) / 10) * (0-(35.19771)));
            yy = 5.50626 + (((tickAnim - 5) / 10) * (0-(5.50626)));
            zz = 6.82524 + (((tickAnim - 5) / 10) * (0-(6.82524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 18 + (((tickAnim - 5) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(0), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (-27.25-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -27.25 + (((tickAnim - 8) / 4) * (-6-(-27.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 12) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 1 + (((tickAnim - 8) / 7) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 31 + (((tickAnim - 5) / 10) * (0-(31)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-33.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 5) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = -33.25 + (((tickAnim - 5) / 10) * (0-(-33.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(0), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10.75 + (((tickAnim - 5) / 3) * (20.75-(-10.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 20.75 + (((tickAnim - 8) / 4) * (-7.75-(20.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -7.75 + (((tickAnim - 12) / 3) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 5) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (29.5-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 29.5 + (((tickAnim - 12) / 3) * (0-(29.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeoceratops entity = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;
        int animCycle = 102;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 37) {
            xx = -2.5 + (((tickAnim - 11) / 26) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 26) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 83) {
            xx = -2.5 + (((tickAnim - 37) / 46) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 37) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 46) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 103) {
            xx = -2.5 + (((tickAnim - 83) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 83) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.85-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 11) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 72) * (0-(0)));
            zz = -0.85 + (((tickAnim - 11) / 72) * (-0.7-(-0.85)));
        }
        else if (tickAnim >= 83 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 83) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 20) * (0-(0)));
            zz = -0.7 + (((tickAnim - 83) / 20) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.12-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -10.12 + (((tickAnim - 8) / 5) * (-9-(-10.12)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -9 + (((tickAnim - 13) / 25) * (-9-(-9)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = -9 + (((tickAnim - 38) / 21) * (-9-(-9)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 88) {
            xx = -9 + (((tickAnim - 59) / 29) * (-9-(-9)));
            yy = 0 + (((tickAnim - 59) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 29) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = -9 + (((tickAnim - 88) / 6) * (0-(-9)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 0) / 94) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 94) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.90351-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.50263-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.66569-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -10.90351 + (((tickAnim - 8) / 5) * (-11.7427-(-10.90351)));
            yy = -0.50263 + (((tickAnim - 8) / 5) * (-1.34035-(-0.50263)));
            zz = -0.66569 + (((tickAnim - 8) / 5) * (-1.77516-(-0.66569)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -11.7427 + (((tickAnim - 13) / 25) * (-11.7427-(-11.7427)));
            yy = -1.34035 + (((tickAnim - 13) / 25) * (-1.34035-(-1.34035)));
            zz = -1.77516 + (((tickAnim - 13) / 25) * (-1.77516-(-1.77516)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = -11.7427 + (((tickAnim - 38) / 21) * (-11.7427-(-11.7427)));
            yy = -1.34035 + (((tickAnim - 38) / 21) * (-1.34035-(-1.34035)));
            zz = -1.77516 + (((tickAnim - 38) / 21) * (-1.77516-(-1.77516)));
        }
        else if (tickAnim >= 59 && tickAnim < 85) {
            xx = -11.7427 + (((tickAnim - 59) / 26) * (-11.7427-(-11.7427)));
            yy = -1.34035 + (((tickAnim - 59) / 26) * (-1.34035-(-1.34035)));
            zz = -1.77516 + (((tickAnim - 59) / 26) * (-1.77516-(-1.77516)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = -11.7427 + (((tickAnim - 85) / 3) * (-11.7427-(-11.7427)));
            yy = -1.34035 + (((tickAnim - 85) / 3) * (-1.34035-(-1.34035)));
            zz = -1.77516 + (((tickAnim - 85) / 3) * (-1.77516-(-1.77516)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = -11.7427 + (((tickAnim - 88) / 6) * (0-(-11.7427)));
            yy = -1.34035 + (((tickAnim - 88) / 6) * (0-(-1.34035)));
            zz = -1.77516 + (((tickAnim - 88) / 6) * (0-(-1.77516)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 5) * (0-(0.35)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 59) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 26) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 85) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 3) * (0.525-(0)));
            zz = 0 + (((tickAnim - 85) / 3) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            yy = 0.525 + (((tickAnim - 88) / 6) * (0-(0.525)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.56-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17.56 + (((tickAnim - 8) / 5) * (13.5-(17.56)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 13.5 + (((tickAnim - 13) / 25) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 13.5 + (((tickAnim - 38) / 21) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 85) {
            xx = 13.5 + (((tickAnim - 59) / 26) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 59) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 26) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = 13.5 + (((tickAnim - 85) / 3) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 85) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 3) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 13.5 + (((tickAnim - 88) / 6) * (0-(13.5)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 8) / 5) * (0-(0.95)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 59) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 26) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 85) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 3) * (0.6-(0)));
            zz = 0 + (((tickAnim - 85) / 3) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 88) / 3) * (0.41-(0.6)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            yy = 0.41 + (((tickAnim - 91) / 3) * (0-(0.41)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (23.63-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 23.63 + (((tickAnim - 8) / 5) * (9-(23.63)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 9 + (((tickAnim - 13) / 25) * (13-(9)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 13 + (((tickAnim - 38) / 21) * (9-(13)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 9 + (((tickAnim - 59) / 11) * (9.5-(9)));
            yy = 0 + (((tickAnim - 59) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 11) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 9.5 + (((tickAnim - 70) / 7) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 70) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 7) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 82) {
            xx = 9.5 + (((tickAnim - 77) / 5) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 77) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 5) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 86) {
            xx = 9.5 + (((tickAnim - 82) / 4) * (12.25-(9.5)));
            yy = 0 + (((tickAnim - 82) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 4) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 12.25 + (((tickAnim - 86) / 2) * (17.75-(12.25)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 17.75 + (((tickAnim - 88) / 6) * (0-(17.75)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 25) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            yy = 0.15 + (((tickAnim - 38) / 21) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 59) / 11) * (0-(0)));
            yy = 0.15 + (((tickAnim - 59) / 11) * (0.1-(0.15)));
            zz = 0 + (((tickAnim - 59) / 11) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 70) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 70) / 7) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 70) / 7) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 77) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 77) / 5) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 77) / 5) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 82) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 82) / 4) * (0.15-(0.1)));
            zz = 0 + (((tickAnim - 82) / 4) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 86) / 2) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            yy = 0.15 + (((tickAnim - 88) / 6) * (0-(0.15)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 16 + (((tickAnim - 20) / 18) * (16-(16)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 16 + (((tickAnim - 38) / 21) * (16-(16)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 72) {
            xx = 16 + (((tickAnim - 59) / 13) * (16-(16)));
            yy = 0 + (((tickAnim - 59) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 13) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 88) {
            xx = 16 + (((tickAnim - 72) / 16) * (16-(16)));
            yy = 0 + (((tickAnim - 72) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 16) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 16 + (((tickAnim - 88) / 10) * (-3.44-(16)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -3.44 + (((tickAnim - 98) / 5) * (0-(-3.44)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 3) / 10) * (2.35-(-4.5)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 2.35 + (((tickAnim - 13) / 7) * (-7.5-(2.35)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -7.5 + (((tickAnim - 20) / 18) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = -7.5 + (((tickAnim - 38) / 21) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 72) {
            xx = -7.5 + (((tickAnim - 59) / 13) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 59) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 13) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 88) {
            xx = -7.5 + (((tickAnim - 72) / 16) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 72) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 16) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = -7.5 + (((tickAnim - 88) / 10) * (-14.42-(-7.5)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -14.42 + (((tickAnim - 98) / 5) * (0-(-14.42)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 10) * (1.075-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            yy = 1.075 + (((tickAnim - 98) / 5) * (0-(1.075)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (2.58-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 2.58 + (((tickAnim - 3) / 10) * (3.14-(2.58)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.14 + (((tickAnim - 13) / 7) * (-5.5-(3.14)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -5.5 + (((tickAnim - 20) / 18) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = -5.5 + (((tickAnim - 38) / 21) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 72) {
            xx = -5.5 + (((tickAnim - 59) / 13) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 59) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 13) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 88) {
            xx = -5.5 + (((tickAnim - 72) / 16) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 72) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 16) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = -5.5 + (((tickAnim - 88) / 10) * (8.53-(-5.5)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 8.53 + (((tickAnim - 98) / 5) * (0-(8.53)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.375 + (((tickAnim - 3) / 10) * (0-(0.375)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 72) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 16) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 98) / 5) * (0-(0.4)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (7.32-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 7.32 + (((tickAnim - 3) / 10) * (-4.41-(7.32)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -4.41 + (((tickAnim - 13) / 7) * (-0.25-(-4.41)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -0.25 + (((tickAnim - 20) / 18) * (0.75-(-0.25)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 0.75 + (((tickAnim - 38) / 21) * (-0.25-(0.75)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 72) {
            xx = -0.25 + (((tickAnim - 59) / 13) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 59) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 13) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 88) {
            xx = -0.25 + (((tickAnim - 72) / 16) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 72) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 16) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = -0.25 + (((tickAnim - 88) / 10) * (15.07-(-0.25)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 15.07 + (((tickAnim - 98) / 5) * (0-(15.07)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 37) {
            xx = -6.5 + (((tickAnim - 11) / 26) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 26) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 60) {
            xx = -6.5 + (((tickAnim - 37) / 23) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 37) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 23) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 103) {
            xx = -6.5 + (((tickAnim - 60) / 43) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 60) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1.85-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 1.85 + (((tickAnim - 4) / 9) * (-4-(1.85)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -4 + (((tickAnim - 13) / 10) * (-0.5-(-4)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -0.5 + (((tickAnim - 23) / 14) * (-4-(-0.5)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 60) {
            xx = -4 + (((tickAnim - 37) / 23) * (-0.5-(-4)));
            yy = 0 + (((tickAnim - 37) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 23) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = -0.5 + (((tickAnim - 60) / 6) * (-5.03-(-0.5)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = -5.03 + (((tickAnim - 66) / 2) * (-0.5-(-5.03)));
            yy = 0 + (((tickAnim - 66) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 2) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -0.5 + (((tickAnim - 68) / 3) * (-5.03-(-0.5)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = -5.03 + (((tickAnim - 71) / 2) * (-4-(-5.03)));
            yy = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 2) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -4 + (((tickAnim - 73) / 4) * (-0.5-(-4)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = -0.5 + (((tickAnim - 77) / 6) * (-5.03-(-0.5)));
            yy = 0 + (((tickAnim - 77) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 6) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = -5.03 + (((tickAnim - 83) / 2) * (-0.5-(-5.03)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = -0.5 + (((tickAnim - 85) / 3) * (-5.03-(-0.5)));
            yy = 0 + (((tickAnim - 85) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 3) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = -5.03 + (((tickAnim - 88) / 2) * (-4-(-5.03)));
            yy = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 2) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = -4 + (((tickAnim - 90) / 3) * (-5.03-(-4)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = -5.03 + (((tickAnim - 93) / 2) * (-4-(-5.03)));
            yy = 0 + (((tickAnim - 93) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 2) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 103) {
            xx = -4 + (((tickAnim - 95) / 8) * (0-(-4)));
            yy = 0 + (((tickAnim - 95) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6.15-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 6.15 + (((tickAnim - 4) / 9) * (-2.5-(6.15)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -2.5 + (((tickAnim - 13) / 10) * (0.5-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0.5 + (((tickAnim - 23) / 14) * (-2.5-(0.5)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = -2.5 + (((tickAnim - 37) / 11) * (0.5-(-2.5)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 61) {
            xx = 0.5 + (((tickAnim - 48) / 13) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 48) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 13) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 67) {
            xx = 0.5 + (((tickAnim - 61) / 6) * (-4.56-(0.5)));
            yy = 0 + (((tickAnim - 61) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 6) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = -4.56 + (((tickAnim - 67) / 2) * (0.5-(-4.56)));
            yy = 0 + (((tickAnim - 67) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 2) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 72) {
            xx = 0.5 + (((tickAnim - 69) / 3) * (-4.56-(0.5)));
            yy = 0 + (((tickAnim - 69) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 3) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = -4.56 + (((tickAnim - 72) / 2) * (-2.5-(-4.56)));
            yy = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 2) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = -2.5 + (((tickAnim - 74) / 9) * (0.5-(-2.5)));
            yy = 0 + (((tickAnim - 74) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 9) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 0.5 + (((tickAnim - 83) / 5) * (-4.56-(0.5)));
            yy = 0 + (((tickAnim - 83) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -4.56 + (((tickAnim - 88) / 3) * (0.5-(-4.56)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 0.5 + (((tickAnim - 91) / 2) * (-4.56-(0.5)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = -4.56 + (((tickAnim - 93) / 3) * (-2.5-(-4.56)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = -2.5 + (((tickAnim - 96) / 7) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.02-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -2.02 + (((tickAnim - 4) / 9) * (-10.25-(-2.02)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -10.25 + (((tickAnim - 13) / 10) * (-7.5-(-10.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -7.5 + (((tickAnim - 23) / 14) * (-10.25-(-7.5)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = -10.25 + (((tickAnim - 37) / 11) * (-7.5-(-10.25)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 48) / 12) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = -7.5 + (((tickAnim - 60) / 6) * (-12.95-(-7.5)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = -12.95 + (((tickAnim - 66) / 2) * (-7.5-(-12.95)));
            yy = 0 + (((tickAnim - 66) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 2) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -7.5 + (((tickAnim - 68) / 3) * (-12.95-(-7.5)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = -12.95 + (((tickAnim - 71) / 2) * (-10.25-(-12.95)));
            yy = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 2) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 83) {
            xx = -10.25 + (((tickAnim - 73) / 10) * (-7.5-(-10.25)));
            yy = 0 + (((tickAnim - 73) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 10) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = -7.5 + (((tickAnim - 83) / 5) * (-12.95-(-7.5)));
            yy = 0 + (((tickAnim - 83) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -12.95 + (((tickAnim - 88) / 3) * (-7.5-(-12.95)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = -7.5 + (((tickAnim - 91) / 2) * (-12.95-(-7.5)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = -12.95 + (((tickAnim - 93) / 3) * (-10.25-(-12.95)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = -10.25 + (((tickAnim - 96) / 7) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (8.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 37) {
            xx = -17.25 + (((tickAnim - 11) / 26) * (-17.25-(-17.25)));
            yy = 8.5 + (((tickAnim - 11) / 26) * (8.5-(8.5)));
            zz = 0 + (((tickAnim - 11) / 26) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 37) / 13) * (-15.75-(-17.25)));
            yy = 8.5 + (((tickAnim - 37) / 13) * (-4-(8.5)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = -15.75 + (((tickAnim - 50) / 7) * (-15.75-(-15.75)));
            yy = -4 + (((tickAnim - 50) / 7) * (-4-(-4)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = -15.75 + (((tickAnim - 57) / 6) * (-17.25-(-15.75)));
            yy = -4 + (((tickAnim - 57) / 6) * (8.5-(-4)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 88) {
            xx = -17.25 + (((tickAnim - 63) / 25) * (-17.25-(-17.25)));
            yy = 8.5 + (((tickAnim - 63) / 25) * (8.5-(8.5)));
            zz = 0 + (((tickAnim - 63) / 25) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 103) {
            xx = -17.25 + (((tickAnim - 88) / 15) * (0-(-17.25)));
            yy = 8.5 + (((tickAnim - 88) / 15) * (0-(8.5)));
            zz = 0 + (((tickAnim - 88) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (1.375-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            zz = 1.375 + (((tickAnim - 11) / 26) * (1.375-(1.375)));
        }
        else if (tickAnim >= 37 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 37) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 26) * (0-(0)));
            zz = 1.375 + (((tickAnim - 37) / 26) * (1.375-(1.375)));
        }
        else if (tickAnim >= 63 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 63) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 25) * (0-(0)));
            zz = 1.375 + (((tickAnim - 63) / 25) * (1.375-(1.375)));
        }
        else if (tickAnim >= 88 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            zz = 1.375 + (((tickAnim - 88) / 15) * (0-(1.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(xx);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(yy);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (14.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            zz = 14.5 + (((tickAnim - 11) / 26) * (14.5-(14.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 37) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 66) * (0-(0)));
            zz = 14.5 + (((tickAnim - 37) / 66) * (0-(14.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(xx);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(yy);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-14.75-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            zz = -14.75 + (((tickAnim - 11) / 26) * (-14.75-(-14.75)));
        }
        else if (tickAnim >= 37 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 37) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 66) * (0-(0)));
            zz = -14.75 + (((tickAnim - 37) / 66) * (0-(-14.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (1.30745-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (9.35135-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (8.90423-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 43) {
            xx = 1.30745 + (((tickAnim - 11) / 32) * (1.30745-(1.30745)));
            yy = 9.35135 + (((tickAnim - 11) / 32) * (9.35135-(9.35135)));
            zz = 8.90423 + (((tickAnim - 11) / 32) * (8.90423-(8.90423)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 1.30745 + (((tickAnim - 43) / 7) * (0.80922-(1.30745)));
            yy = 9.35135 + (((tickAnim - 43) / 7) * (-7.46856-(9.35135)));
            zz = 8.90423 + (((tickAnim - 43) / 7) * (-6.89202-(8.90423)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0.80922 + (((tickAnim - 50) / 7) * (0.80922-(0.80922)));
            yy = -7.46856 + (((tickAnim - 50) / 7) * (-7.46856-(-7.46856)));
            zz = -6.89202 + (((tickAnim - 50) / 7) * (-6.89202-(-6.89202)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 0.80922 + (((tickAnim - 57) / 6) * (0-(0.80922)));
            yy = -7.46856 + (((tickAnim - 57) / 6) * (0-(-7.46856)));
            zz = -6.89202 + (((tickAnim - 57) / 6) * (0-(-6.89202)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (3.5-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = 3.5 + (((tickAnim - 65) / 12) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 65) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 12) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 79) {
            xx = 3.5 + (((tickAnim - 77) / 2) * (0-(3.5)));
            yy = 0 + (((tickAnim - 77) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 2) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 79) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 9) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 43) {
            xx = -0.15 + (((tickAnim - 11) / 32) * (-0.15-(-0.15)));
            yy = 0 + (((tickAnim - 11) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 32) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 63) {
            xx = -0.15 + (((tickAnim - 43) / 20) * (0-(-0.15)));
            yy = 0 + (((tickAnim - 43) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 20) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 16) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 79) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 9) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (7.5-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 18) / 2) * (0-(7.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (7.5-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 22) / 1) * (0-(7.5)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (7.5-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 31) / 2) * (0-(7.5)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (7.5-(0)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 7.5 + (((tickAnim - 34) / 2) * (0-(7.5)));
            yy = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (-6-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 50) / 2) * (5.25-(0)));
            yy = -6 + (((tickAnim - 50) / 2) * (-6-(-6)));
            zz = 0 + (((tickAnim - 50) / 2) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = 5.25 + (((tickAnim - 52) / 1) * (0-(5.25)));
            yy = -6 + (((tickAnim - 52) / 1) * (-6-(-6)));
            zz = 0 + (((tickAnim - 52) / 1) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (5.25-(0)));
            yy = -6 + (((tickAnim - 53) / 2) * (-6-(-6)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 5.25 + (((tickAnim - 55) / 2) * (0-(5.25)));
            yy = -6 + (((tickAnim - 55) / 2) * (-6-(-6)));
            zz = 0 + (((tickAnim - 55) / 2) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            yy = -6 + (((tickAnim - 57) / 6) * (0-(-6)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (-10.39607-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (6.31568-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (-0.94648-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -10.39607 + (((tickAnim - 65) / 3) * (-7.64607-(-10.39607)));
            yy = 6.31568 + (((tickAnim - 65) / 3) * (6.31568-(6.31568)));
            zz = -0.94648 + (((tickAnim - 65) / 3) * (-0.94648-(-0.94648)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = -7.64607 + (((tickAnim - 68) / 2) * (-10.39607-(-7.64607)));
            yy = 6.31568 + (((tickAnim - 68) / 2) * (6.31568-(6.31568)));
            zz = -0.94648 + (((tickAnim - 68) / 2) * (-0.94648-(-0.94648)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = -10.39607 + (((tickAnim - 70) / 3) * (-7.64607-(-10.39607)));
            yy = 6.31568 + (((tickAnim - 70) / 3) * (6.31568-(6.31568)));
            zz = -0.94648 + (((tickAnim - 70) / 3) * (-0.94648-(-0.94648)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -7.64607 + (((tickAnim - 73) / 4) * (-10.39607-(-7.64607)));
            yy = 6.31568 + (((tickAnim - 73) / 4) * (6.31568-(6.31568)));
            zz = -0.94648 + (((tickAnim - 73) / 4) * (-0.94648-(-0.94648)));
        }
        else if (tickAnim >= 77 && tickAnim < 79) {
            xx = -10.39607 + (((tickAnim - 77) / 2) * (0-(-10.39607)));
            yy = 6.31568 + (((tickAnim - 77) / 2) * (0-(6.31568)));
            zz = -0.94648 + (((tickAnim - 77) / 2) * (0-(-0.94648)));
        }
        else if (tickAnim >= 79 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 79) / 3) * (6.25-(0)));
            yy = 0 + (((tickAnim - 79) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 3) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 84) {
            xx = 6.25 + (((tickAnim - 82) / 2) * (0-(6.25)));
            yy = 0 + (((tickAnim - 82) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 2) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 4) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 88) / 7) * (12-(0)));
            yy = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 7) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 103) {
            xx = 12 + (((tickAnim - 95) / 8) * (0-(12)));
            yy = 0 + (((tickAnim - 95) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 16) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 79) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 9) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeoceratops entity = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;
        int animCycle = 154;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 25) / 15) * (5-(4)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 5 + (((tickAnim - 40) / 25) * (4-(5)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 4 + (((tickAnim - 65) / 15) * (4-(4)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 92) {
            xx = 4 + (((tickAnim - 80) / 12) * (5-(4)));
            yy = 0 + (((tickAnim - 80) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 12) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 5 + (((tickAnim - 92) / 12) * (5-(5)));
            yy = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 12) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 114) {
            xx = 5 + (((tickAnim - 104) / 10) * (4-(5)));
            yy = 0 + (((tickAnim - 104) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 10) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = 4 + (((tickAnim - 114) / 10) * (-2.75-(4)));
            yy = 0 + (((tickAnim - 114) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = -2.75 + (((tickAnim - 124) / 11) * (-4-(-2.75)));
            yy = 0 + (((tickAnim - 124) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 11) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = -4 + (((tickAnim - 135) / 10) * (-4-(-4)));
            yy = 0 + (((tickAnim - 135) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 10) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = -4 + (((tickAnim - 145) / 5) * (0-(-4)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 0) / 124) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 124) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 124) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 124) / 21) * (0-(0)));
            yy = -0.2 + (((tickAnim - 124) / 21) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 124) / 21) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 145) / 9) * (0-(0)));
            yy = -0.2 + (((tickAnim - 145) / 9) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 145) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(0), leftleg.rotateAngleY + (float) Math.toRadians(0), leftleg.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 114) {
            xx = -3.5 + (((tickAnim - 25) / 89) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 25) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 89) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = -3.5 + (((tickAnim - 114) / 10) * (3.25-(-3.5)));
            yy = 0 + (((tickAnim - 114) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = 3.25 + (((tickAnim - 124) / 11) * (4-(3.25)));
            yy = 0 + (((tickAnim - 124) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 11) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 150) {
            xx = 4 + (((tickAnim - 135) / 15) * (4-(4)));
            yy = 0 + (((tickAnim - 135) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 15) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = 4 + (((tickAnim - 150) / 4) * (0-(4)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -2.75 + (((tickAnim - 25) / 23) * (-3.75-(-2.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -3.75 + (((tickAnim - 48) / 17) * (3.5-(-3.75)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 3.5 + (((tickAnim - 65) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 80) / 3) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = -1.25 + (((tickAnim - 83) / 3) * (-1.18537-(-1.25)));
            yy = 0 + (((tickAnim - 83) / 3) * (0.16319-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (-0.17073-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 95) {
            xx = -1.18537 + (((tickAnim - 86) / 9) * (-2.93537-(-1.18537)));
            yy = 0.16319 + (((tickAnim - 86) / 9) * (0.16319-(0.16319)));
            zz = -0.17073 + (((tickAnim - 86) / 9) * (-0.17073-(-0.17073)));
        }
        else if (tickAnim >= 95 && tickAnim < 114) {
            xx = -2.93537 + (((tickAnim - 95) / 19) * (-3.18537-(-2.93537)));
            yy = 0.16319 + (((tickAnim - 95) / 19) * (0.16319-(0.16319)));
            zz = -0.17073 + (((tickAnim - 95) / 19) * (-0.17073-(-0.17073)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = -3.18537 + (((tickAnim - 114) / 10) * (4.81463-(-3.18537)));
            yy = 0.16319 + (((tickAnim - 114) / 10) * (0.16319-(0.16319)));
            zz = -0.17073 + (((tickAnim - 114) / 10) * (-0.17073-(-0.17073)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = 4.81463 + (((tickAnim - 124) / 11) * (2.06463-(4.81463)));
            yy = 0.16319 + (((tickAnim - 124) / 11) * (0.16319-(0.16319)));
            zz = -0.17073 + (((tickAnim - 124) / 11) * (-0.17073-(-0.17073)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = 2.06463 + (((tickAnim - 135) / 8) * (-0.18537-(2.06463)));
            yy = 0.16319 + (((tickAnim - 135) / 8) * (0.16319-(0.16319)));
            zz = -0.17073 + (((tickAnim - 135) / 8) * (-0.17073-(-0.17073)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = -0.18537 + (((tickAnim - 143) / 7) * (-0.18537-(-0.18537)));
            yy = 0.16319 + (((tickAnim - 143) / 7) * (0.16319-(0.16319)));
            zz = -0.17073 + (((tickAnim - 143) / 7) * (-0.17073-(-0.17073)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = -0.18537 + (((tickAnim - 150) / 4) * (0-(-0.18537)));
            yy = 0.16319 + (((tickAnim - 150) / 4) * (0-(0.16319)));
            zz = -0.17073 + (((tickAnim - 150) / 4) * (0-(-0.17073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -4 + (((tickAnim - 25) / 23) * (-8-(-4)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -8 + (((tickAnim - 48) / 17) * (0.25-(-8)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0.25 + (((tickAnim - 65) / 15) * (-2.25-(0.25)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -2.25 + (((tickAnim - 80) / 3) * (-2.75-(-2.25)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = -2.75 + (((tickAnim - 83) / 3) * (2.75-(-2.75)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 95) {
            xx = 2.75 + (((tickAnim - 86) / 9) * (-6.25-(2.75)));
            yy = 0 + (((tickAnim - 86) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 9) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 114) {
            xx = -6.25 + (((tickAnim - 95) / 19) * (-2-(-6.25)));
            yy = 0 + (((tickAnim - 95) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 19) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = -2 + (((tickAnim - 114) / 10) * (-6.92025-(-2)));
            yy = 0 + (((tickAnim - 114) / 10) * (1.19064-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (-1.44428-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = -6.92025 + (((tickAnim - 124) / 11) * (-8.67025-(-6.92025)));
            yy = 1.19064 + (((tickAnim - 124) / 11) * (1.19064-(1.19064)));
            zz = -1.44428 + (((tickAnim - 124) / 11) * (-1.44428-(-1.44428)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = -8.67025 + (((tickAnim - 135) / 8) * (-5.17025-(-8.67025)));
            yy = 1.19064 + (((tickAnim - 135) / 8) * (1.19064-(1.19064)));
            zz = -1.44428 + (((tickAnim - 135) / 8) * (-1.44428-(-1.44428)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = -5.17025 + (((tickAnim - 143) / 7) * (-6.17025-(-5.17025)));
            yy = 1.19064 + (((tickAnim - 143) / 7) * (1.19064-(1.19064)));
            zz = -1.44428 + (((tickAnim - 143) / 7) * (-1.44428-(-1.44428)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = -6.17025 + (((tickAnim - 150) / 4) * (0-(-6.17025)));
            yy = 1.19064 + (((tickAnim - 150) / 4) * (0-(1.19064)));
            zz = -1.44428 + (((tickAnim - 150) / 4) * (0-(-1.44428)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -12.75 + (((tickAnim - 25) / 23) * (-21.75-(-12.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -21.75 + (((tickAnim - 48) / 17) * (-9.5-(-21.75)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -9.5 + (((tickAnim - 65) / 15) * (4.75-(-9.5)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 4.75 + (((tickAnim - 80) / 3) * (-14.25-(4.75)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = -14.25 + (((tickAnim - 83) / 3) * (1.25-(-14.25)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 95) {
            xx = 1.25 + (((tickAnim - 86) / 9) * (-18-(1.25)));
            yy = 0 + (((tickAnim - 86) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 9) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 114) {
            xx = -18 + (((tickAnim - 95) / 19) * (-10-(-18)));
            yy = 0 + (((tickAnim - 95) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 19) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = -10 + (((tickAnim - 114) / 10) * (-3.75-(-10)));
            yy = 0 + (((tickAnim - 114) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = -3.75 + (((tickAnim - 124) / 11) * (-5.25-(-3.75)));
            yy = 0 + (((tickAnim - 124) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 11) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = -5.25 + (((tickAnim - 135) / 8) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 135) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 8) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = -5.25 + (((tickAnim - 143) / 7) * (-11.75-(-5.25)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = -11.75 + (((tickAnim - 150) / 4) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -15.5 + (((tickAnim - 25) / 23) * (-25.75-(-15.5)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -25.75 + (((tickAnim - 48) / 17) * (-7-(-25.75)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -7 + (((tickAnim - 65) / 15) * (-9.75-(-7)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -9.75 + (((tickAnim - 80) / 3) * (-15-(-9.75)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 84) {
            xx = -15 + (((tickAnim - 83) / 1) * (-22.05-(-15)));
            yy = 0 + (((tickAnim - 83) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 1) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 86) {
            xx = -22.05 + (((tickAnim - 84) / 2) * (-2.5-(-22.05)));
            yy = 0 + (((tickAnim - 84) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 2) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 95) {
            xx = -2.5 + (((tickAnim - 86) / 9) * (-18-(-2.5)));
            yy = 0 + (((tickAnim - 86) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 9) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -18 + (((tickAnim - 95) / 10) * (-20.68-(-18)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 114) {
            xx = -20.68 + (((tickAnim - 105) / 9) * (-4.25-(-20.68)));
            yy = 0 + (((tickAnim - 105) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 9) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = -4.25 + (((tickAnim - 114) / 10) * (7.5-(-4.25)));
            yy = 0 + (((tickAnim - 114) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = 7.5 + (((tickAnim - 124) / 11) * (2.5-(7.5)));
            yy = 0 + (((tickAnim - 124) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 11) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = 2.5 + (((tickAnim - 135) / 8) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 135) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 8) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 2.5 + (((tickAnim - 143) / 7) * (-20-(2.5)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = -20 + (((tickAnim - 150) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(0), upperbody2.rotateAngleY + (float) Math.toRadians(0), upperbody2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 14.25 + (((tickAnim - 25) / 15) * (19-(14.25)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 19 + (((tickAnim - 40) / 25) * (12.75-(19)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 12.75 + (((tickAnim - 65) / 15) * (19.5-(12.75)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = 19.5 + (((tickAnim - 80) / 4) * (19.25-(19.5)));
            yy = 0 + (((tickAnim - 80) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 4) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 19.25 + (((tickAnim - 84) / 4) * (19.5-(19.25)));
            yy = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 4) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 19.5 + (((tickAnim - 88) / 7) * (15.5-(19.5)));
            yy = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 7) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 104) {
            xx = 15.5 + (((tickAnim - 95) / 9) * (22.75-(15.5)));
            yy = 0 + (((tickAnim - 95) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 9) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 114) {
            xx = 22.75 + (((tickAnim - 104) / 10) * (15-(22.75)));
            yy = 0 + (((tickAnim - 104) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 10) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = 15 + (((tickAnim - 114) / 10) * (-8.84667-(15)));
            yy = 0 + (((tickAnim - 114) / 10) * (9.08501-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (-0.47791-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = -8.84667 + (((tickAnim - 124) / 11) * (-10.34667-(-8.84667)));
            yy = 9.08501 + (((tickAnim - 124) / 11) * (9.08501-(9.08501)));
            zz = -0.47791 + (((tickAnim - 124) / 11) * (-0.47791-(-0.47791)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = -10.34667 + (((tickAnim - 135) / 10) * (-10.34667-(-10.34667)));
            yy = 9.08501 + (((tickAnim - 135) / 10) * (9.08501-(9.08501)));
            zz = -0.47791 + (((tickAnim - 135) / 10) * (-0.47791-(-0.47791)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = -10.34667 + (((tickAnim - 145) / 5) * (4.80241-(-10.34667)));
            yy = 9.08501 + (((tickAnim - 145) / 5) * (9.08501-(9.08501)));
            zz = -0.47791 + (((tickAnim - 145) / 5) * (-0.47791-(-0.47791)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = 4.80241 + (((tickAnim - 150) / 4) * (0-(4.80241)));
            yy = 9.08501 + (((tickAnim - 150) / 4) * (0-(9.08501)));
            zz = -0.47791 + (((tickAnim - 150) / 4) * (0-(-0.47791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));

        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(0);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(0);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.22134-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (3.64028-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (16.7086-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 1.22134 + (((tickAnim - 25) / 15) * (0-(1.22134)));
            yy = 3.64028 + (((tickAnim - 25) / 15) * (0-(3.64028)));
            zz = 16.7086 + (((tickAnim - 25) / 15) * (0-(16.7086)));
        }
        else if (tickAnim >= 40 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 40) / 66) * (-2.71016-(0)));
            yy = 0 + (((tickAnim - 40) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 66) * (0.64504-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 124) {
            xx = -2.71016 + (((tickAnim - 106) / 18) * (46.25-(-2.71016)));
            yy = 0 + (((tickAnim - 106) / 18) * (0-(0)));
            zz = 0.64504 + (((tickAnim - 106) / 18) * (0-(0.64504)));
        }
        else if (tickAnim >= 124 && tickAnim < 154) {
            xx = 46.25 + (((tickAnim - 124) / 30) * (0-(46.25)));
            yy = 0 + (((tickAnim - 124) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (27.25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 40) / 114) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 114) * (0-(0)));
            zz = 27.25 + (((tickAnim - 40) / 114) * (0-(27.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 25) / 15) * (36.25-(7.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 36.25 + (((tickAnim - 40) / 8) * (31.5-(36.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 31.5 + (((tickAnim - 48) / 17) * (22.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130+120))*-15-(31.5)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 22.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130+120))*-15 + (((tickAnim - 65) / 15) * (34-(22.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130+120))*-15)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = 34 + (((tickAnim - 80) / 4) * (29.25-(34)));
            yy = 0 + (((tickAnim - 80) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 4) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 29.25 + (((tickAnim - 84) / 4) * (34-(29.25)));
            yy = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 4) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 34 + (((tickAnim - 88) / 7) * (14.25-(34)));
            yy = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 7) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 14.25 + (((tickAnim - 95) / 10) * (35-(14.25)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 114) {
            xx = 35 + (((tickAnim - 105) / 9) * (11.75-(35)));
            yy = 0 + (((tickAnim - 105) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 9) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = 11.75 + (((tickAnim - 114) / 10) * (-0.34259-(11.75)));
            yy = 0 + (((tickAnim - 114) / 10) * (6.82656-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (-1.55223-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = -0.34259 + (((tickAnim - 124) / 11) * (-0.34259-(-0.34259)));
            yy = 6.82656 + (((tickAnim - 124) / 11) * (6.82656-(6.82656)));
            zz = -1.55223 + (((tickAnim - 124) / 11) * (-1.55223-(-1.55223)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -0.34259 + (((tickAnim - 135) / 3) * (-0.34259-(-0.34259)));
            yy = 6.82656 + (((tickAnim - 135) / 3) * (6.82656-(6.82656)));
            zz = -1.55223 + (((tickAnim - 135) / 3) * (-1.55223-(-1.55223)));
        }
        else if (tickAnim >= 138 && tickAnim < 140) {
            xx = -0.34259 + (((tickAnim - 138) / 2) * (-0.34259-(-0.34259)));
            yy = 6.82656 + (((tickAnim - 138) / 2) * (6.82656-(6.82656)));
            zz = -1.55223 + (((tickAnim - 138) / 2) * (-1.55223-(-1.55223)));
        }
        else if (tickAnim >= 140 && tickAnim < 143) {
            xx = -0.34259 + (((tickAnim - 140) / 3) * (-0.34259-(-0.34259)));
            yy = 6.82656 + (((tickAnim - 140) / 3) * (6.82656-(6.82656)));
            zz = -1.55223 + (((tickAnim - 140) / 3) * (-1.55223-(-1.55223)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = -0.34259 + (((tickAnim - 143) / 2) * (-3.75-(-0.34259)));
            yy = 6.82656 + (((tickAnim - 143) / 2) * (0-(6.82656)));
            zz = -1.55223 + (((tickAnim - 143) / 2) * (0-(-1.55223)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = -3.75 + (((tickAnim - 145) / 5) * (-24.25-(-3.75)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = -24.25 + (((tickAnim - 150) / 4) * (0-(-24.25)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 0) / 145) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 145) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(0), rightleg.rotateAngleY + (float) Math.toRadians(0), rightleg.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 114) {
            xx = -3.5 + (((tickAnim - 25) / 89) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 25) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 89) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = -3.5 + (((tickAnim - 114) / 10) * (3.25-(-3.5)));
            yy = 0 + (((tickAnim - 114) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = 3.25 + (((tickAnim - 124) / 11) * (4-(3.25)));
            yy = 0 + (((tickAnim - 124) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 11) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 150) {
            xx = 4 + (((tickAnim - 135) / 15) * (4-(4)));
            yy = 0 + (((tickAnim - 135) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 15) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = 4 + (((tickAnim - 150) / 4) * (0-(4)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-19.75-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = -19.75 + (((tickAnim - 25) / 15) * (0-(-19.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 40) / 66) * (-2.71016-(0)));
            yy = 0 + (((tickAnim - 40) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 66) * (0.64504-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 124) {
            xx = -2.71016 + (((tickAnim - 106) / 18) * (32.75-(-2.71016)));
            yy = 0 + (((tickAnim - 106) / 18) * (0-(0)));
            zz = 0.64504 + (((tickAnim - 106) / 18) * (0-(0.64504)));
        }
        else if (tickAnim >= 124 && tickAnim < 154) {
            xx = 32.75 + (((tickAnim - 124) / 30) * (0-(32.75)));
            yy = 0 + (((tickAnim - 124) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-28-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 40) / 114) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 114) * (0-(0)));
            zz = -28 + (((tickAnim - 40) / 114) * (0-(-28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 17 + (((tickAnim - 25) / 15) * (-16.75-(17)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -16.75 + (((tickAnim - 40) / 8) * (-8.25-(-16.75)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -8.25 + (((tickAnim - 48) / 17) * (7.75-(-8.25)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 7.75 + (((tickAnim - 65) / 15) * (-7.5-(7.75)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = -7.5 + (((tickAnim - 80) / 4) * (-3-(-7.5)));
            yy = 0 + (((tickAnim - 80) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 4) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = -3 + (((tickAnim - 84) / 4) * (1.75-(-3)));
            yy = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 4) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 1.75 + (((tickAnim - 88) / 7) * (16.5-(1.75)));
            yy = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 7) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 104) {
            xx = 16.5 + (((tickAnim - 95) / 9) * (-6.5-(16.5)));
            yy = 0 + (((tickAnim - 95) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 9) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 114) {
            xx = -6.5 + (((tickAnim - 104) / 10) * (20.25-(-6.5)));
            yy = 0 + (((tickAnim - 104) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 10) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = 20.25 + (((tickAnim - 114) / 10) * (2.193-(20.25)));
            yy = 0 + (((tickAnim - 114) / 10) * (-1.75487-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (-3.18422-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 135) {
            xx = 2.193 + (((tickAnim - 124) / 11) * (2.193-(2.193)));
            yy = -1.75487 + (((tickAnim - 124) / 11) * (-1.75487-(-1.75487)));
            zz = -3.18422 + (((tickAnim - 124) / 11) * (-3.18422-(-3.18422)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 2.193 + (((tickAnim - 135) / 3) * (2.193-(2.193)));
            yy = -1.75487 + (((tickAnim - 135) / 3) * (-1.75487-(-1.75487)));
            zz = -3.18422 + (((tickAnim - 135) / 3) * (-3.18422-(-3.18422)));
        }
        else if (tickAnim >= 138 && tickAnim < 140) {
            xx = 2.193 + (((tickAnim - 138) / 2) * (2.193-(2.193)));
            yy = -1.75487 + (((tickAnim - 138) / 2) * (-1.75487-(-1.75487)));
            zz = -3.18422 + (((tickAnim - 138) / 2) * (-3.18422-(-3.18422)));
        }
        else if (tickAnim >= 140 && tickAnim < 143) {
            xx = 2.193 + (((tickAnim - 140) / 3) * (2.193-(2.193)));
            yy = -1.75487 + (((tickAnim - 140) / 3) * (-1.75487-(-1.75487)));
            zz = -3.18422 + (((tickAnim - 140) / 3) * (-3.18422-(-3.18422)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = 2.193 + (((tickAnim - 143) / 2) * (2.175-(2.193)));
            yy = -1.75487 + (((tickAnim - 143) / 2) * (-0.3158-(-1.75487)));
            zz = -3.18422 + (((tickAnim - 143) / 2) * (-2.18825-(-3.18422)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 2.175 + (((tickAnim - 145) / 5) * (16.86047-(2.175)));
            yy = -0.3158 + (((tickAnim - 145) / 5) * (1.73291-(-0.3158)));
            zz = -2.18825 + (((tickAnim - 145) / 5) * (-7.79148-(-2.18825)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = 16.86047 + (((tickAnim - 150) / 4) * (0-(16.86047)));
            yy = 1.73291 + (((tickAnim - 150) / 4) * (0-(1.73291)));
            zz = -7.79148 + (((tickAnim - 150) / 4) * (0-(-7.79148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 40) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 74) * (0-(0)));
            zz = 0.5 + (((tickAnim - 40) / 74) * (0-(0.5)));
        }
        else if (tickAnim >= 114 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 114) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 21) * (0.8-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 135) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 10) * (0-(0)));
            zz = 0.8 + (((tickAnim - 135) / 10) * (0.8-(0.8)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0.8 + (((tickAnim - 145) / 5) * (0-(0.8)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (19.75-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 19.75 + (((tickAnim - 40) / 8) * (0-(19.75)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 65) / 8) * (19.5-(0)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 19.5 + (((tickAnim - 73) / 7) * (0-(19.5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 80) / 4) * (13.5-(0)));
            yy = 0 + (((tickAnim - 80) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 4) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 13.5 + (((tickAnim - 84) / 4) * (0-(13.5)));
            yy = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 4) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 7) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 95) / 4) * (13.25-(0)));
            yy = 0 + (((tickAnim - 95) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 4) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 104) {
            xx = 13.25 + (((tickAnim - 99) / 5) * (0-(13.25)));
            yy = 0 + (((tickAnim - 99) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 5) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 104) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeoceratops entity = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 5) / 5) * (-3-(11)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3 + (((tickAnim - 10) / 5) * (1.5-(-3)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 15) / 5) * (0-(1.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.25 + (((tickAnim - 5) / 5) * (3.25-(34.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 3.25 + (((tickAnim - 10) / 5) * (0-(3.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 18) / 2) * (0-(1.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (-0.55-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.55 + (((tickAnim - 5) / 5) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.25 + (((tickAnim - 5) / 5) * (0-(8.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (1-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (0-(1)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -16 + (((tickAnim - 5) / 15) * (0-(-16)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -12.25 + (((tickAnim - 5) / 15) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 5) / 15) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 5) / 15) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -19.5 + (((tickAnim - 5) / 5) * (-16.5-(-19.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -16.5 + (((tickAnim - 10) / 5) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.25 + (((tickAnim - 18) / 2) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.625-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0.625 + (((tickAnim - 5) / 15) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.75 + (((tickAnim - 3) / 2) * (0-(30.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23 + (((tickAnim - 8) / 2) * (0-(23)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (7.25-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.25 + (((tickAnim - 18) / 2) * (0-(7.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeoceratops entity = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -13.25 + (((tickAnim - 10) / 25) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 35) / 15) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -4.125 + (((tickAnim - 10) / 25) * (-4.125-(-4.125)));
            zz = 0.45 + (((tickAnim - 10) / 25) * (0.45-(0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.125 + (((tickAnim - 35) / 15) * (0-(-4.125)));
            zz = 0.45 + (((tickAnim - 35) / 15) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 10) / 25) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
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
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -14.25 + (((tickAnim - 10) / 25) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 35) / 15) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 1.35 + (((tickAnim - 10) / 25) * (1.35-(1.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 1.35 + (((tickAnim - 35) / 15) * (0-(1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -0.25 + (((tickAnim - 10) / 25) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 35) / 15) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.50276-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.24935-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.07431-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 3.50276 + (((tickAnim - 10) / 25) * (3.50276-(3.50276)));
            yy = -4.24935 + (((tickAnim - 10) / 25) * (-4.24935-(-4.24935)));
            zz = -0.07431 + (((tickAnim - 10) / 25) * (-0.07431-(-0.07431)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.50276 + (((tickAnim - 35) / 15) * (0-(3.50276)));
            yy = -4.24935 + (((tickAnim - 35) / 15) * (0-(-4.24935)));
            zz = -0.07431 + (((tickAnim - 35) / 15) * (0-(-0.07431)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.46609-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.49226-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.35309-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 6.46609 + (((tickAnim - 10) / 25) * (6.46609-(6.46609)));
            yy = -10.49226 + (((tickAnim - 10) / 25) * (-10.49226-(-10.49226)));
            zz = -2.35309 + (((tickAnim - 10) / 25) * (-2.35309-(-2.35309)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 6.46609 + (((tickAnim - 35) / 5) * (-19.25-(6.46609)));
            yy = -10.49226 + (((tickAnim - 35) / 5) * (0-(-10.49226)));
            zz = -2.35309 + (((tickAnim - 35) / 5) * (0-(-2.35309)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 40) / 10) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.95882-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.89494-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.72902-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 5.95882 + (((tickAnim - 10) / 25) * (5.95882-(5.95882)));
            yy = -7.89494 + (((tickAnim - 10) / 25) * (-7.89494-(-7.89494)));
            zz = -2.72902 + (((tickAnim - 10) / 25) * (-2.72902-(-2.72902)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.95882 + (((tickAnim - 35) / 15) * (0-(5.95882)));
            yy = -7.89494 + (((tickAnim - 35) / 15) * (0-(-7.89494)));
            zz = -2.72902 + (((tickAnim - 35) / 15) * (0-(-2.72902)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 10) / 25) * (17-(17)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 35) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-92.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -92.25 + (((tickAnim - 10) / 25) * (-92.25-(-92.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -92.25 + (((tickAnim - 35) / 15) * (0-(-92.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (81.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 81.75 + (((tickAnim - 10) / 25) * (81.75-(81.75)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 81.75 + (((tickAnim - 35) / 15) * (0-(81.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 10) / 25) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 35) / 15) * (0-(10.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-27.84846-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.84302-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (19.80055-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -27.84846 + (((tickAnim - 10) / 25) * (-27.84846-(-27.84846)));
            yy = 1.84302 + (((tickAnim - 10) / 25) * (1.84302-(1.84302)));
            zz = 19.80055 + (((tickAnim - 10) / 25) * (19.80055-(19.80055)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.84846 + (((tickAnim - 35) / 15) * (0-(-27.84846)));
            yy = 1.84302 + (((tickAnim - 35) / 15) * (0-(1.84302)));
            zz = 19.80055 + (((tickAnim - 35) / 15) * (0-(19.80055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (48-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 48 + (((tickAnim - 10) / 25) * (48-(48)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 48 + (((tickAnim - 35) / 15) * (0-(48)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 1.25 + (((tickAnim - 10) / 25) * (1.25-(1.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 1.25 + (((tickAnim - 35) / 15) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.9588-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.8949-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.729-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -5.9588 + (((tickAnim - 10) / 25) * (-5.9588-(-5.9588)));
            yy = 7.8949 + (((tickAnim - 10) / 25) * (7.8949-(7.8949)));
            zz = 2.729 + (((tickAnim - 10) / 25) * (2.729-(2.729)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.9588 + (((tickAnim - 35) / 15) * (0-(-5.9588)));
            yy = 7.8949 + (((tickAnim - 35) / 15) * (0-(7.8949)));
            zz = 2.729 + (((tickAnim - 35) / 15) * (0-(2.729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 10) / 25) * (17-(17)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 35) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-78.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -78.25 + (((tickAnim - 10) / 25) * (-78.25-(-78.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -78.25 + (((tickAnim - 35) / 15) * (0-(-78.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (83-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 83 + (((tickAnim - 10) / 25) * (83-(83)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 83 + (((tickAnim - 35) / 15) * (0-(83)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-31.74456-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.24529-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-26.08453-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -31.74456 + (((tickAnim - 10) / 25) * (-31.74456-(-31.74456)));
            yy = -7.24529 + (((tickAnim - 10) / 25) * (-7.24529-(-7.24529)));
            zz = -26.08453 + (((tickAnim - 10) / 25) * (-26.08453-(-26.08453)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -31.74456 + (((tickAnim - 35) / 15) * (0-(-31.74456)));
            yy = -7.24529 + (((tickAnim - 35) / 15) * (0-(-7.24529)));
            zz = -26.08453 + (((tickAnim - 35) / 15) * (0-(-26.08453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 39.75 + (((tickAnim - 10) / 25) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 35) / 15) * (0-(39.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 13.5 + (((tickAnim - 10) / 25) * (13.5-(13.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 13.5 + (((tickAnim - 35) / 15) * (0-(13.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeoceratops entity = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.13098-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.99714-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.99657-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = -0.13098 + (((tickAnim - 7) / 15) * (-0.13098-(-0.13098)));
            yy = -2.99714 + (((tickAnim - 7) / 15) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 7) / 15) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.13098 + (((tickAnim - 22) / 8) * (-10.13098-(-0.13098)));
            yy = -2.99714 + (((tickAnim - 22) / 8) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 22) / 8) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10.13098 + (((tickAnim - 30) / 10) * (-10.13098-(-10.13098)));
            yy = -2.99714 + (((tickAnim - 30) / 10) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 30) / 10) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10.13098 + (((tickAnim - 40) / 10) * (0-(-10.13098)));
            yy = -2.99714 + (((tickAnim - 40) / 10) * (0-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 40) / 10) * (0-(-0.99657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (1.1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 1.1 + (((tickAnim - 30) / 10) * (1.1-(1.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 1.1 + (((tickAnim - 40) / 10) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 8.75 + (((tickAnim - 7) / 5) * (8.72192-(8.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (-6.98494-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.4601-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 8.72192 + (((tickAnim - 12) / 5) * (8.75-(8.72192)));
            yy = -6.98494 + (((tickAnim - 12) / 5) * (0-(-6.98494)));
            zz = 0.4601 + (((tickAnim - 12) / 5) * (0-(0.4601)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 8.75 + (((tickAnim - 17) / 5) * (8.72192-(8.75)));
            yy = 0 + (((tickAnim - 17) / 5) * (-6.98494-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.4601-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 8.72192 + (((tickAnim - 22) / 8) * (14-(8.72192)));
            yy = -6.98494 + (((tickAnim - 22) / 8) * (0-(-6.98494)));
            zz = 0.4601 + (((tickAnim - 22) / 8) * (0-(0.4601)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 14 + (((tickAnim - 30) / 10) * (14-(14)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 40) / 10) * (0-(14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.72217-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-19.06236-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (9.8817-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 9.72217 + (((tickAnim - 7) / 15) * (9.72217-(9.72217)));
            yy = -19.06236 + (((tickAnim - 7) / 15) * (-19.06236-(-19.06236)));
            zz = 9.8817 + (((tickAnim - 7) / 15) * (9.8817-(9.8817)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 9.72217 + (((tickAnim - 22) / 8) * (32-(9.72217)));
            yy = -19.06236 + (((tickAnim - 22) / 8) * (0-(-19.06236)));
            zz = 9.8817 + (((tickAnim - 22) / 8) * (0-(9.8817)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 32 + (((tickAnim - 30) / 10) * (32-(32)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 40) / 10) * (0-(32)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.87181-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-6.38431-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (1.22344-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.87181 + (((tickAnim - 10) / 4) * (-1.48425-(-0.87181)));
            yy = -6.38431 + (((tickAnim - 10) / 4) * (0.94633-(-6.38431)));
            zz = 1.22344 + (((tickAnim - 10) / 4) * (-0.25154-(1.22344)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -1.48425 + (((tickAnim - 14) / 4) * (-2.16671-(-1.48425)));
            yy = 0.94633 + (((tickAnim - 14) / 4) * (-2.99794-(0.94633)));
            zz = -0.25154 + (((tickAnim - 14) / 4) * (0.61229-(-0.25154)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -2.16671 + (((tickAnim - 18) / 3) * (-2.55327-(-2.16671)));
            yy = -2.99794 + (((tickAnim - 18) / 3) * (-0.54032-(-2.99794)));
            zz = 0.61229 + (((tickAnim - 18) / 3) * (0.07863-(0.61229)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -2.55327 + (((tickAnim - 21) / 9) * (-3.75-(-2.55327)));
            yy = -0.54032 + (((tickAnim - 21) / 9) * (0-(-0.54032)));
            zz = 0.07863 + (((tickAnim - 21) / 9) * (0-(0.07863)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 30) / 10) * (4.38-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.38 + (((tickAnim - 40) / 10) * (0-(4.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.65527-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (11.73268-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-0.64223-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.65527 + (((tickAnim - 10) / 4) * (-1.11408-(-0.65527)));
            yy = 11.73268 + (((tickAnim - 10) / 4) * (-7.1518-(11.73268)));
            zz = -0.64223 + (((tickAnim - 10) / 4) * (0.52722-(-0.64223)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -1.11408 + (((tickAnim - 14) / 4) * (-1.6654-(-1.11408)));
            yy = -7.1518 + (((tickAnim - 14) / 4) * (11.65879-(-7.1518)));
            zz = 0.52722 + (((tickAnim - 14) / 4) * (-0.832-(0.52722)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -1.6654 + (((tickAnim - 18) / 3) * (-1.88911-(-1.6654)));
            yy = 11.65879 + (((tickAnim - 18) / 3) * (2.51258-(11.65879)));
            zz = -0.832 + (((tickAnim - 18) / 3) * (-0.14102-(-0.832)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -1.88911 + (((tickAnim - 21) / 4) * (-2.28614-(-1.88911)));
            yy = 2.51258 + (((tickAnim - 21) / 4) * (-3.11384-(2.51258)));
            zz = -0.14102 + (((tickAnim - 21) / 4) * (0.29827-(-0.14102)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.28614 + (((tickAnim - 25) / 5) * (-2.75-(-2.28614)));
            yy = -3.11384 + (((tickAnim - 25) / 5) * (0-(-3.11384)));
            zz = 0.29827 + (((tickAnim - 25) / 5) * (0-(0.29827)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 30) / 5) * (-5.06-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.06 + (((tickAnim - 35) / 5) * (7.38-(-5.06)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.38 + (((tickAnim - 40) / 10) * (0-(7.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0.72921-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (13.51852-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (2.53613-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.72921 + (((tickAnim - 10) / 4) * (0.84218-(0.72921)));
            yy = 13.51852 + (((tickAnim - 10) / 4) * (-2.32002-(13.51852)));
            zz = 2.53613 + (((tickAnim - 10) / 4) * (-0.50631-(2.53613)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.84218 + (((tickAnim - 14) / 4) * (1.40434-(0.84218)));
            yy = -2.32002 + (((tickAnim - 14) / 4) * (11.35802-(-2.32002)));
            zz = -0.50631 + (((tickAnim - 14) / 4) * (2.24121-(-0.50631)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.40434 + (((tickAnim - 18) / 3) * (1.4276-(1.40434)));
            yy = 11.35802 + (((tickAnim - 18) / 3) * (1.41344-(11.35802)));
            zz = 2.24121 + (((tickAnim - 18) / 3) * (0.23216-(2.24121)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1.4276 + (((tickAnim - 21) / 4) * (1.72126-(1.4276)));
            yy = 1.41344 + (((tickAnim - 21) / 4) * (-4.37002-(1.41344)));
            zz = 0.23216 + (((tickAnim - 21) / 4) * (-0.93857-(0.23216)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.72126 + (((tickAnim - 25) / 5) * (2-(1.72126)));
            yy = -4.37002 + (((tickAnim - 25) / 5) * (0-(-4.37002)));
            zz = -0.93857 + (((tickAnim - 25) / 5) * (0-(-0.93857)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 30) / 5) * (-8-(2)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -8 + (((tickAnim - 35) / 3) * (-11.16-(-8)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -11.16 + (((tickAnim - 38) / 2) * (3.67-(-11.16)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.67 + (((tickAnim - 40) / 10) * (0-(3.67)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -16 + (((tickAnim - 7) / 5) * (39-(-16)));
            yy = -6.75 + (((tickAnim - 7) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 39 + (((tickAnim - 12) / 5) * (-16-(39)));
            yy = -6.75 + (((tickAnim - 12) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -16 + (((tickAnim - 17) / 5) * (39-(-16)));
            yy = -6.75 + (((tickAnim - 17) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 39 + (((tickAnim - 22) / 8) * (39-(39)));
            yy = -6.75 + (((tickAnim - 22) / 8) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 39 + (((tickAnim - 30) / 10) * (39-(39)));
            yy = -6.75 + (((tickAnim - 30) / 10) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 39 + (((tickAnim - 40) / 10) * (0-(39)));
            yy = -6.75 + (((tickAnim - 40) / 10) * (0-(-6.75)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -28.25 + (((tickAnim - 7) / 5) * (5-(-28.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 12) / 2) * (-35.33-(5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -35.33 + (((tickAnim - 14) / 3) * (-28.25-(-35.33)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -28.25 + (((tickAnim - 17) / 7) * (-7.57-(-28.25)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -7.57 + (((tickAnim - 24) / 6) * (-27.75-(-7.57)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.75 + (((tickAnim - 30) / 10) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -27.75 + (((tickAnim - 40) / 3) * (-3.8408-(-27.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (1.24062-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0.61371-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -3.8408 + (((tickAnim - 43) / 2) * (-23.93159-(-3.8408)));
            yy = 1.24062 + (((tickAnim - 43) / 2) * (2.48123-(1.24062)));
            zz = 0.61371 + (((tickAnim - 43) / 2) * (1.22742-(0.61371)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -23.93159 + (((tickAnim - 45) / 5) * (0-(-23.93159)));
            yy = 2.48123 + (((tickAnim - 45) / 5) * (0-(2.48123)));
            zz = 1.22742 + (((tickAnim - 45) / 5) * (0-(1.22742)));
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
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0.675-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 43) / 7) * (0-(0.675)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-50.87-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -50.87 + (((tickAnim - 3) / 4) * (16.75-(-50.87)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 16.75 + (((tickAnim - 7) / 5) * (-12.25-(16.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -12.25 + (((tickAnim - 12) / 2) * (-66.38-(-12.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -66.38 + (((tickAnim - 14) / 3) * (16.75-(-66.38)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 16.75 + (((tickAnim - 17) / 5) * (-12.25-(16.75)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -12.25 + (((tickAnim - 22) / 2) * (3.15-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 3.15 + (((tickAnim - 24) / 6) * (12.25-(3.15)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.25 + (((tickAnim - 30) / 10) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 12.25 + (((tickAnim - 40) / 3) * (-74.43-(12.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -74.43 + (((tickAnim - 43) / 2) * (-70.12-(-74.43)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -70.12 + (((tickAnim - 45) / 5) * (0-(-70.12)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 12) / 1) * (0.53-(0.275)));
            zz = 0.425 + (((tickAnim - 12) / 1) * (0.98-(0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.53 + (((tickAnim - 13) / 1) * (0-(0.53)));
            zz = 0.98 + (((tickAnim - 13) / 1) * (0-(0.98)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.525-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0.175 + (((tickAnim - 22) / 8) * (0-(0.175)));
            zz = 0.525 + (((tickAnim - 22) / 8) * (0-(0.525)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (97-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 97 + (((tickAnim - 3) / 4) * (34-(97)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 34 + (((tickAnim - 7) / 2) * (1-(34)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 9) / 3) * (90-(1)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 90 + (((tickAnim - 12) / 1) * (75.63-(90)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 75.63 + (((tickAnim - 13) / 1) * (104.08-(75.63)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 104.08 + (((tickAnim - 14) / 3) * (34-(104.08)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 34 + (((tickAnim - 17) / 2) * (0-(34)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 5.5 + (((tickAnim - 22) / 2) * (29.18-(5.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 29.18 + (((tickAnim - 24) / 6) * (-13-(29.18)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -13 + (((tickAnim - 30) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -13 + (((tickAnim - 40) / 3) * (91.44-(-13)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 91.44 + (((tickAnim - 43) / 2) * (85.13-(91.44)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 85.13 + (((tickAnim - 45) / 5) * (0-(85.13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -0.525 + (((tickAnim - 3) / 4) * (0-(-0.525)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (1.025-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.025 + (((tickAnim - 12) / 1) * (2.02-(1.025)));
            zz = -0.425 + (((tickAnim - 12) / 1) * (-0.07-(-0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 2.02 + (((tickAnim - 13) / 1) * (0-(2.02)));
            zz = -0.07 + (((tickAnim - 13) / 1) * (0-(-0.07)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0.225-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0.225 + (((tickAnim - 22) / 8) * (-0.3-(0.225)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 10) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 40) / 10) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 4 + (((tickAnim - 7) / 5) * (4.00547-(4)));
            yy = 0 + (((tickAnim - 7) / 5) * (2.99269-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.20946-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 4.00547 + (((tickAnim - 12) / 5) * (4-(4.00547)));
            yy = 2.99269 + (((tickAnim - 12) / 5) * (0-(2.99269)));
            zz = 0.20946 + (((tickAnim - 12) / 5) * (0-(0.20946)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 4 + (((tickAnim - 17) / 5) * (4.00547-(4)));
            yy = 0 + (((tickAnim - 17) / 5) * (2.99269-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.20946-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 4.00547 + (((tickAnim - 22) / 8) * (12.80454-(4.00547)));
            yy = 2.99269 + (((tickAnim - 22) / 8) * (0.1591-(2.99269)));
            zz = 0.20946 + (((tickAnim - 22) / 8) * (-1.84832-(0.20946)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.80454 + (((tickAnim - 30) / 10) * (12.80454-(12.80454)));
            yy = 0.1591 + (((tickAnim - 30) / 10) * (0.1591-(0.1591)));
            zz = -1.84832 + (((tickAnim - 30) / 10) * (-1.84832-(-1.84832)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.80454 + (((tickAnim - 40) / 10) * (0-(12.80454)));
            yy = 0.1591 + (((tickAnim - 40) / 10) * (0-(0.1591)));
            zz = -1.84832 + (((tickAnim - 40) / 10) * (0-(-1.84832)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-14.816-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (-5.53413-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (13.07071-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -14.816 + (((tickAnim - 30) / 3) * (-20.60939-(-14.816)));
            yy = -5.53413 + (((tickAnim - 30) / 3) * (-4.97969-(-5.53413)));
            zz = 13.07071 + (((tickAnim - 30) / 3) * (10.37938-(13.07071)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -20.60939 + (((tickAnim - 33) / 2) * (-21.76135-(-20.60939)));
            yy = -4.97969 + (((tickAnim - 33) / 2) * (1.39283-(-4.97969)));
            zz = 10.37938 + (((tickAnim - 33) / 2) * (15.03848-(10.37938)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -21.76135 + (((tickAnim - 35) / 3) * (-20.60939-(-21.76135)));
            yy = 1.39283 + (((tickAnim - 35) / 3) * (-4.97969-(1.39283)));
            zz = 15.03848 + (((tickAnim - 35) / 3) * (10.37938-(15.03848)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -20.60939 + (((tickAnim - 38) / 2) * (-19.48676-(-20.60939)));
            yy = -4.97969 + (((tickAnim - 38) / 2) * (0.89436-(-4.97969)));
            zz = 10.37938 + (((tickAnim - 38) / 2) * (18.36383-(10.37938)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.48676 + (((tickAnim - 40) / 10) * (0-(-19.48676)));
            yy = 0.89436 + (((tickAnim - 40) / 10) * (0-(0.89436)));
            zz = 18.36383 + (((tickAnim - 40) / 10) * (0-(18.36383)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (52.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 52.75 + (((tickAnim - 30) / 3) * (28.06276-(52.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (-18.27011-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (23.99775-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 28.06276 + (((tickAnim - 33) / 2) * (34.5-(28.06276)));
            yy = -18.27011 + (((tickAnim - 33) / 2) * (0-(-18.27011)));
            zz = 23.99775 + (((tickAnim - 33) / 2) * (0-(23.99775)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 34.5 + (((tickAnim - 35) / 3) * (28.06276-(34.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (-18.27011-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (23.99775-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 28.06276 + (((tickAnim - 38) / 2) * (34.5-(28.06276)));
            yy = -18.27011 + (((tickAnim - 38) / 2) * (0-(-18.27011)));
            zz = 23.99775 + (((tickAnim - 38) / 2) * (0-(23.99775)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 40) / 10) * (0-(34.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.225 + (((tickAnim - 30) / 20) * (0-(0.225)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (-53-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = -53 + (((tickAnim - 30) / 3) * (18-(-53)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 18 + (((tickAnim - 33) / 2) * (-53-(18)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = -53 + (((tickAnim - 35) / 3) * (18-(-53)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 18 + (((tickAnim - 38) / 2) * (-53-(18)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -53 + (((tickAnim - 40) / 10) * (0-(-53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.25 + (((tickAnim - 30) / 10) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 40) / 10) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -14.25 + (((tickAnim - 30) / 10) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 40) / 10) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (27.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 27.75 + (((tickAnim - 30) / 10) * (27.75-(27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 27.75 + (((tickAnim - 40) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (6.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 30) / 10) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 40) / 10) * (0-(6.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 30) / 10) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 40) / 10) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-19.83971-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (-0.56748-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-8.79922-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -19.83971 + (((tickAnim - 33) / 2) * (-19.56461-(-19.83971)));
            yy = -0.56748 + (((tickAnim - 33) / 2) * (2.2205-(-0.56748)));
            zz = -8.79922 + (((tickAnim - 33) / 2) * (-13.39838-(-8.79922)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -19.56461 + (((tickAnim - 35) / 3) * (-20.54881-(-19.56461)));
            yy = 2.2205 + (((tickAnim - 35) / 3) * (-0.93565-(2.2205)));
            zz = -13.39838 + (((tickAnim - 35) / 3) * (-12.80936-(-13.39838)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -20.54881 + (((tickAnim - 38) / 2) * (-16.31461-(-20.54881)));
            yy = -0.93565 + (((tickAnim - 38) / 2) * (2.2205-(-0.93565)));
            zz = -12.80936 + (((tickAnim - 38) / 2) * (-13.39838-(-12.80936)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -16.31461 + (((tickAnim - 40) / 10) * (0-(-16.31461)));
            yy = 2.2205 + (((tickAnim - 40) / 10) * (0-(2.2205)));
            zz = -13.39838 + (((tickAnim - 40) / 10) * (0-(-13.39838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (34.25-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 34.25 + (((tickAnim - 33) / 2) * (32.02777-(34.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (36.34287-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (-21.02882-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 32.02777 + (((tickAnim - 35) / 3) * (34.25-(32.02777)));
            yy = 36.34287 + (((tickAnim - 35) / 3) * (0-(36.34287)));
            zz = -21.02882 + (((tickAnim - 35) / 3) * (0-(-21.02882)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 34.25 + (((tickAnim - 38) / 2) * (32.02777-(34.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (36.34287-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (-21.02882-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32.02777 + (((tickAnim - 40) / 10) * (0-(32.02777)));
            yy = 36.34287 + (((tickAnim - 40) / 10) * (0-(36.34287)));
            zz = -21.02882 + (((tickAnim - 40) / 10) * (0-(-21.02882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-8.90956-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (5.67589-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (30.72319-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -8.90956 + (((tickAnim - 33) / 2) * (0-(-8.90956)));
            yy = 5.67589 + (((tickAnim - 33) / 2) * (0-(5.67589)));
            zz = 30.72319 + (((tickAnim - 33) / 2) * (0-(30.72319)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-8.90956-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (5.67589-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (30.72319-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -8.90956 + (((tickAnim - 38) / 2) * (0-(-8.90956)));
            yy = 5.67589 + (((tickAnim - 38) / 2) * (0-(5.67589)));
            zz = 30.72319 + (((tickAnim - 38) / 2) * (0-(30.72319)));
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
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.40385-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-23.68749-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-6.25637-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 3.40385 + (((tickAnim - 7) / 15) * (3.40385-(3.40385)));
            yy = -23.68749 + (((tickAnim - 7) / 15) * (-23.68749-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 7) / 15) * (-6.25637-(-6.25637)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 3.40385 + (((tickAnim - 22) / 18) * (3.40385-(3.40385)));
            yy = -23.68749 + (((tickAnim - 22) / 18) * (-23.68749-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 22) / 18) * (-6.25637-(-6.25637)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.40385 + (((tickAnim - 40) / 10) * (0-(3.40385)));
            yy = -23.68749 + (((tickAnim - 40) / 10) * (0-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 40) / 10) * (0-(-6.25637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeoceratops entity = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.14088 + (((tickAnim - 0) / 5) * (1.3909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.4))*1-(1.14088)));
            yy = 0.8976 + (((tickAnim - 0) / 5) * (-0.89762-(0.8976)));
            zz = 2.09762 + (((tickAnim - 0) / 5) * (-2.49762-(2.09762)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.3909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.4))*1 + (((tickAnim - 5) / 5) * (1.14088-(1.3909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.4))*1)));
            yy = -0.89762 + (((tickAnim - 5) / 5) * (0.8976-(-0.89762)));
            zz = -2.49762 + (((tickAnim - 5) / 5) * (2.09762-(-2.49762)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.25 + (((tickAnim - 0) / 3) * (0-(-0.25)));
            yy = -0.4 + (((tickAnim - 0) / 3) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.25-(0)));
            yy = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1 + (((tickAnim - 3) / 2) * (-0.4-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.25 + (((tickAnim - 5) / 3) * (0-(0.25)));
            yy = -0.4 + (((tickAnim - 5) / 3) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1-(-0.4)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.25-(0)));
            yy = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1 + (((tickAnim - 8) / 2) * (-0.4-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+60))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+60))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*6), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*6), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*-2), upperbody.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+140))*2.5), upperbody.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+210))*6), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+200))*1), neck.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.12507 + (((tickAnim - 0) / 5) * (37.5-(-7.12507)));
            yy = -11.15065 + (((tickAnim - 0) / 5) * (0-(-11.15065)));
            zz = 0.64325 + (((tickAnim - 0) / 5) * (0-(0.64325)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 37.5 + (((tickAnim - 5) / 3) * (-18.24974-(37.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (-14.32357-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (2.56449-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.24974 + (((tickAnim - 8) / 2) * (-7.12507-(-18.24974)));
            yy = -14.32357 + (((tickAnim - 8) / 2) * (-11.15065-(-14.32357)));
            zz = 2.56449 + (((tickAnim - 8) / 2) * (0.64325-(2.56449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42.5 + (((tickAnim - 0) / 1) * (-16.67-(-42.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -16.67 + (((tickAnim - 1) / 2) * (7.5-(-16.67)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 3) / 0) * (27.49173-(7.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.49173 + (((tickAnim - 3) / 2) * (10-(27.49173)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (40-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (-42.5-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 5 + (((tickAnim - 0) / 1) * (-29.17-(5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -29.17 + (((tickAnim - 1) / 2) * (0-(-29.17)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (-90-(5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -90 + (((tickAnim - 8) / 2) * (5-(-90)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 42.5 + (((tickAnim - 0) / 1) * (44.17-(42.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.17 + (((tickAnim - 1) / 1) * (11.84-(44.17)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 11.84 + (((tickAnim - 2) / 1) * (-2-(11.84)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2 + (((tickAnim - 3) / 2) * (117.5-(-2)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 117.5 + (((tickAnim - 5) / 3) * (162.5-(117.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 162.5 + (((tickAnim - 8) / 1) * (40.5-(162.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 40.5 + (((tickAnim - 9) / 1) * (42.5-(40.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+90))*2.5), upperbody2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+110))*-2.5), upperbody2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -8.08117 + (((tickAnim - 0) / 1) * (-5.58098-(-8.08117)));
            yy = -7.9547 + (((tickAnim - 0) / 1) * (-7.954-(-7.9547)));
            zz = 17.3186 + (((tickAnim - 0) / 1) * (17.3189-(17.3186)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -5.58098 + (((tickAnim - 1) / 4) * (-8.08-(-5.58098)));
            yy = -7.954 + (((tickAnim - 1) / 4) * (-7.95-(-7.954)));
            zz = 17.3189 + (((tickAnim - 1) / 4) * (17.32-(17.3189)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -8.08 + (((tickAnim - 5) / 1) * (-5.58098-(-8.08)));
            yy = -7.95 + (((tickAnim - 5) / 1) * (-7.954-(-7.95)));
            zz = 17.32 + (((tickAnim - 5) / 1) * (17.3189-(17.32)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -5.58098 + (((tickAnim - 6) / 4) * (-8.08-(-5.58098)));
            yy = -7.954 + (((tickAnim - 6) / 4) * (-7.95-(-7.954)));
            zz = 17.3189 + (((tickAnim - 6) / 4) * (17.32-(17.3189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.5 + (((tickAnim - 0) / 2) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 2) / 3) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -17.5 + (((tickAnim - 5) / 2) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 7) / 3) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.5 + (((tickAnim - 0) / 3) * (-18.24974-(37.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (14.32357-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.56449-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.24974 + (((tickAnim - 3) / 2) * (-7.12507-(-18.24974)));
            yy = 14.32357 + (((tickAnim - 3) / 2) * (11.15065-(14.32357)));
            zz = -2.56449 + (((tickAnim - 3) / 2) * (-0.64325-(-2.56449)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.12507 + (((tickAnim - 5) / 5) * (37.5-(-7.12507)));
            yy = 11.15065 + (((tickAnim - 5) / 5) * (0-(11.15065)));
            zz = -0.64325 + (((tickAnim - 5) / 5) * (0-(-0.64325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (40-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 40 + (((tickAnim - 3) / 2) * (-42.5-(40)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -42.5 + (((tickAnim - 5) / 1) * (-16.67-(-42.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16.67 + (((tickAnim - 6) / 2) * (7.5-(-16.67)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 8) / 0) * (27.49173-(7.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 27.49173 + (((tickAnim - 8) / 2) * (10-(27.49173)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 0) / 3) * (-90-(5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -90 + (((tickAnim - 3) / 2) * (5-(-90)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 5 + (((tickAnim - 5) / 1) * (-29.17-(5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -29.17 + (((tickAnim - 6) / 2) * (0-(-29.17)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 117.5 + (((tickAnim - 0) / 3) * (162.5-(117.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 162.5 + (((tickAnim - 3) / 1) * (36.75-(162.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 36.75 + (((tickAnim - 4) / 1) * (42.5-(36.75)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 42.5 + (((tickAnim - 5) / 1) * (42.92-(42.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 42.92 + (((tickAnim - 6) / 2) * (-10-(42.92)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 8) / 2) * (117.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -8.08117 + (((tickAnim - 0) / 1) * (-5.58098-(-8.08117)));
            yy = 7.95475 + (((tickAnim - 0) / 1) * (7.95396-(7.95475)));
            zz = -17.31864 + (((tickAnim - 0) / 1) * (-17.31886-(-17.31864)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -5.58098 + (((tickAnim - 1) / 4) * (-8.08-(-5.58098)));
            yy = 7.95396 + (((tickAnim - 1) / 4) * (7.95-(7.95396)));
            zz = -17.31886 + (((tickAnim - 1) / 4) * (-17.32-(-17.31886)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -8.08 + (((tickAnim - 5) / 1) * (-5.58098-(-8.08)));
            yy = 7.95 + (((tickAnim - 5) / 1) * (7.95396-(7.95)));
            zz = -17.32 + (((tickAnim - 5) / 1) * (-17.31886-(-17.32)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -5.58098 + (((tickAnim - 6) / 4) * (-8.08-(-5.58098)));
            yy = 7.95396 + (((tickAnim - 6) / 4) * (7.95-(7.95396)));
            zz = -17.31886 + (((tickAnim - 6) / 4) * (-17.32-(-17.31886)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.51016 + (((tickAnim - 0) / 2) * (-10-(-17.51016)));
            yy = 0.3914 + (((tickAnim - 0) / 2) * (0-(0.3914)));
            zz = -2.97438 + (((tickAnim - 0) / 2) * (0-(-2.97438)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 2) / 3) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -17.5 + (((tickAnim - 5) / 2) * (-10-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 7) / 3) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+360))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.225);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeoceratops entity = (EntityPrehistoricFloraArchaeoceratops) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.89088 + (((tickAnim - 0) / 8) * (-3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(1.89088)));
            yy = 0.8976 + (((tickAnim - 0) / 8) * (-0.44881-(0.8976)));
            zz = 2.09762 + (((tickAnim - 0) / 8) * (-1.34881-(2.09762)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 8) / 2) * (1.39088-(-3.1341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -0.44881 + (((tickAnim - 8) / 2) * (-0.89762-(-0.44881)));
            zz = -1.34881 + (((tickAnim - 8) / 2) * (-2.49762-(-1.34881)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 1.39088 + (((tickAnim - 10) / 8) * (-5.0591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8-(1.39088)));
            yy = -0.89762 + (((tickAnim - 10) / 8) * (-0.44881-(-0.89762)));
            zz = -2.49762 + (((tickAnim - 10) / 8) * (0.97619-(-2.49762)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.0591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8 + (((tickAnim - 18) / 2) * (1.89088-(-5.0591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8)));
            yy = -0.44881 + (((tickAnim - 18) / 2) * (0.8976-(-0.44881)));
            zz = 0.97619 + (((tickAnim - 18) / 2) * (2.09762-(0.97619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.25 + (((tickAnim - 0) / 5) * (0-(-0.25)));
            yy = -0.4 + (((tickAnim - 0) / 5) * (-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*3-(0)));
            yy = -0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1 + (((tickAnim - 5) / 5) * (-0.4-(-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*3 + (((tickAnim - 10) / 5) * (0-(-2.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*3)));
            yy = -0.4 + (((tickAnim - 10) / 5) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-0.25-(0)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1 + (((tickAnim - 15) / 5) * (-0.4-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*3), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-2), upperbody.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+140))*2.5), upperbody.rotateAngleZ + (float) Math.toRadians(0));
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(0);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(0);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(0.375);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+210))*3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+200))*1), neck.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -18.21181 + (((tickAnim - 0) / 10) * (30-(-18.21181)));
            yy = -10.7617 + (((tickAnim - 0) / 10) * (0-(-10.7617)));
            zz = 2.0366 + (((tickAnim - 0) / 10) * (0-(2.0366)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 10) / 3) * (15.83-(30)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 15.83 + (((tickAnim - 13) / 4) * (-15.23749-(15.83)));
            yy = 0 + (((tickAnim - 13) / 4) * (-14.4352-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (1.8163-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.23749 + (((tickAnim - 17) / 3) * (-18.21181-(-15.23749)));
            yy = -14.4352 + (((tickAnim - 17) / 3) * (-10.7617-(-14.4352)));
            zz = 1.8163 + (((tickAnim - 17) / 3) * (2.0366-(1.8163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.5 + (((tickAnim - 0) / 3) * (-5-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 5) / 5) * (17.5-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 10) / 3) * (34.08-(17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 34.08 + (((tickAnim - 13) / 4) * (19.17-(34.08)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.17 + (((tickAnim - 17) / 3) * (-32.5-(19.17)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 0) / 3) * (-13.75-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.75 + (((tickAnim - 3) / 2) * (7.5-(-13.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 5) / 5) * (5-(7.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 10) / 3) * (-72.5-(5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -72.5 + (((tickAnim - 13) / 4) * (-78.75-(-72.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -78.75 + (((tickAnim - 17) / 3) * (20-(-78.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.40191 + (((tickAnim - 0) / 3) * (26.32596-(29.40191)));
            yy = 2.6472 + (((tickAnim - 0) / 3) * (1.3236-(2.6472)));
            zz = -4.2433 + (((tickAnim - 0) / 3) * (-2.1216-(-4.2433)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.32596 + (((tickAnim - 3) / 2) * (-6.75-(26.32596)));
            yy = 1.3236 + (((tickAnim - 3) / 2) * (0-(1.3236)));
            zz = -2.1216 + (((tickAnim - 3) / 2) * (0-(-2.1216)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6.75 + (((tickAnim - 5) / 5) * (79-(-6.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 79 + (((tickAnim - 10) / 3) * (150.83-(79)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 150.83 + (((tickAnim - 13) / 4) * (135.42-(150.83)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 135.42 + (((tickAnim - 17) / 1) * (62.46-(135.42)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 62.46 + (((tickAnim - 18) / 2) * (29.40191-(62.46)));
            yy = 0 + (((tickAnim - 18) / 2) * (2.6472-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-4.2433-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.125-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 15) / 2) * (0-(0.125)));
            zz = -0.125 + (((tickAnim - 15) / 2) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+90))*2), upperbody2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+110))*-2.5), upperbody2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 21.53694 + (((tickAnim - 0) / 2) * (23.56876-(21.53694)));
            yy = -3.64475 + (((tickAnim - 0) / 2) * (-3.61362-(-3.64475)));
            zz = 2.17857 + (((tickAnim - 0) / 2) * (0.76681-(2.17857)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.56876 + (((tickAnim - 2) / 1) * (23.41364-(23.56876)));
            yy = -3.61362 + (((tickAnim - 2) / 1) * (0.21917-(-3.61362)));
            zz = 0.76681 + (((tickAnim - 2) / 1) * (-1.05012-(0.76681)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 23.41364 + (((tickAnim - 3) / 7) * (20.45249-(23.41364)));
            yy = 0.21917 + (((tickAnim - 3) / 7) * (-0.05696-(0.21917)));
            zz = -1.05012 + (((tickAnim - 3) / 7) * (5.82408-(-1.05012)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20.45249 + (((tickAnim - 10) / 10) * (21.53694-(20.45249)));
            yy = -0.05696 + (((tickAnim - 10) / 10) * (-3.64475-(-0.05696)));
            zz = 5.82408 + (((tickAnim - 10) / 10) * (2.17857-(5.82408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.5 + (((tickAnim - 0) / 3) * (6.5-(13.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 6.5 + (((tickAnim - 3) / 7) * (25.25-(6.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.25 + (((tickAnim - 10) / 3) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25.25 + (((tickAnim - 13) / 7) * (13.5-(25.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 0) / 3) * (15.83-(30)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 15.83 + (((tickAnim - 3) / 4) * (-15.23749-(15.83)));
            yy = 0 + (((tickAnim - 3) / 4) * (14.4352-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-1.81626-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.23749 + (((tickAnim - 7) / 3) * (-18.21181-(-15.23749)));
            yy = 14.4352 + (((tickAnim - 7) / 3) * (10.76174-(14.4352)));
            zz = -1.81626 + (((tickAnim - 7) / 3) * (-2.03659-(-1.81626)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.21181 + (((tickAnim - 10) / 10) * (30-(-18.21181)));
            yy = 10.76174 + (((tickAnim - 10) / 10) * (0-(10.76174)));
            zz = -2.03659 + (((tickAnim - 10) / 10) * (0-(-2.03659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (32.58-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 32.58 + (((tickAnim - 3) / 4) * (19.17-(32.58)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 19.17 + (((tickAnim - 7) / 3) * (-32.5-(19.17)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -32.5 + (((tickAnim - 10) / 3) * (-5-(-32.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 13) / 2) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 15) / 5) * (17.5-(-2.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 0) / 3) * (-72.5-(5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -72.5 + (((tickAnim - 3) / 4) * (-78.75-(-72.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -78.75 + (((tickAnim - 7) / 3) * (20-(-78.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (-13.75-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -13.75 + (((tickAnim - 13) / 2) * (7.5-(-13.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 15) / 5) * (5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 70.5 + (((tickAnim - 0) / 3) * (150.83-(70.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 150.83 + (((tickAnim - 3) / 4) * (135.42-(150.83)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 135.42 + (((tickAnim - 7) / 1) * (62.46-(135.42)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 62.46 + (((tickAnim - 8) / 2) * (29.40191-(62.46)));
            yy = 0 + (((tickAnim - 8) / 2) * (-2.64718-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (4.24326-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.40191 + (((tickAnim - 10) / 3) * (26.32596-(29.40191)));
            yy = -2.64718 + (((tickAnim - 10) / 3) * (-1.32359-(-2.64718)));
            zz = 4.24326 + (((tickAnim - 10) / 3) * (2.12163-(4.24326)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 26.32596 + (((tickAnim - 13) / 2) * (-6.75-(26.32596)));
            yy = -1.32359 + (((tickAnim - 13) / 2) * (0-(-1.32359)));
            zz = 2.12163 + (((tickAnim - 13) / 2) * (0-(2.12163)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 15) / 5) * (70.5-(-6.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.125-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 5) / 2) * (0-(0.125)));
            zz = -0.125 + (((tickAnim - 5) / 2) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 21.53694 + (((tickAnim - 0) / 2) * (22.73899-(21.53694)));
            yy = -3.64475 + (((tickAnim - 0) / 2) * (-5.52998-(-3.64475)));
            zz = 2.17857 + (((tickAnim - 0) / 2) * (1.41178-(2.17857)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 22.73899 + (((tickAnim - 2) / 1) * (20.99316-(22.73899)));
            yy = -5.52998 + (((tickAnim - 2) / 1) * (-9.20133-(-5.52998)));
            zz = 1.41178 + (((tickAnim - 2) / 1) * (-2.24462-(1.41178)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 20.99316 + (((tickAnim - 3) / 7) * (17.40674-(20.99316)));
            yy = -9.20133 + (((tickAnim - 3) / 7) * (-14.98384-(-9.20133)));
            zz = -2.24462 + (((tickAnim - 3) / 7) * (-6.65178-(-2.24462)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.40674 + (((tickAnim - 10) / 10) * (21.53694-(17.40674)));
            yy = -14.98384 + (((tickAnim - 10) / 10) * (-3.64475-(-14.98384)));
            zz = -6.65178 + (((tickAnim - 10) / 10) * (2.17857-(-6.65178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.5 + (((tickAnim - 0) / 3) * (6.5-(13.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 6.5 + (((tickAnim - 3) / 7) * (16.75-(6.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16.75 + (((tickAnim - 10) / 3) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 16.75 + (((tickAnim - 13) / 7) * (13.5-(16.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+360))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraArchaeoceratops e = (EntityPrehistoricFloraArchaeoceratops) entity;
        animator.update(entity);


    }
}
