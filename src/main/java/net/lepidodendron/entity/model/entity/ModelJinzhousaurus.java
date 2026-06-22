package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraJinzhousaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelJinzhousaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer rightleg5;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer leftleg5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer opposablePinkie3;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer opposablePinkie2;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r51;

    private ModelAnimator animator;

    public ModelJinzhousaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 3.8F, 11.0F);
        this.setRotateAngle(hips, 0.1658F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0669F, 2.7194F, 5.5335F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3534F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 68, -2.0F, -10.0F, -11.0F, 4, 3, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0669F, -0.1556F, 0.1335F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1527F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 13, -2.0F, -10.0F, -11.0F, 4, 3, 8, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0669F, 3.0194F, -0.6665F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.5F, -9.95F, -11.8F, 7, 9, 18, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0669F, 4.7444F, -0.4915F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 27, -3.0F, -7.0F, -9.825F, 6, 7, 16, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0669F, -3.4806F, 7.3335F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3491F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 78, 0, -3.0F, -1.25F, -2.0F, 6, 7, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 74, 94, -2.5F, -1.25F, 4.0F, 5, 5, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.425F, 0.0F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 68, -1.5F, -3.0F, -2.0F, 3, 3, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1789F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 66, 81, -2.0F, -1.0F, -1.0F, 4, 4, 7, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1484F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 92, 94, -1.0F, -1.0F, -1.0F, 2, 2, 7, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 86, 60, -1.5F, -0.75F, -1.0F, 3, 3, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 91, -1.0F, -1.0F, -1.0F, 2, 1, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 90, 24, -1.0F, -1.0F, -1.0F, 2, 2, 8, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 6.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2618F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 88, 71, -0.5F, -0.5F, -1.0F, 1, 1, 10, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.9331F, -5.8306F, -3.6415F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.7199F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 50, 0, -3.0F, -2.0F, -1.75F, 5, 15, 9, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.5F, 12.275F, 0.225F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.1432F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 1, 72, -0.5F, -0.7412F, -0.9788F, 3, 15, 5, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(1.5F, 13.6088F, 0.6712F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.5672F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 32, 57, -2.0F, -1.1F, -1.9F, 3, 4, 4, -0.01F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-1.5F, 2.75F, 0.0F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.0175F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 56, 101, -1.0F, -1.0F, -3.0F, 4, 2, 4, 0.0F, false));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(1.0F, 0.0F, -2.75F);
        this.rightleg4.addChild(rightleg5);
        this.rightleg5.cubeList.add(new ModelBox(rightleg5, 102, 0, -2.0F, -1.0F, -3.75F, 4, 2, 4, -0.01F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(3.0669F, -5.8306F, -3.6415F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.7199F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 50, 0, -2.0F, -2.0F, -1.75F, 5, 15, 9, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(1.5F, 12.275F, 0.225F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.1432F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 1, 72, -2.5F, -0.7412F, -0.9788F, 3, 15, 5, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(-1.5F, 13.6088F, 0.6712F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.5672F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 32, 57, -1.0F, -1.1F, -1.9F, 3, 4, 4, -0.01F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(1.5F, 2.75F, 0.0F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.0175F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 56, 101, -3.0F, -1.0F, -3.0F, 4, 2, 4, 0.0F, true));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(-1.0F, 0.0F, -2.75F);
        this.leftleg4.addChild(leftleg5);
        this.leftleg5.cubeList.add(new ModelBox(leftleg5, 102, 0, -2.0F, -1.0F, -3.75F, 4, 2, 4, -0.01F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0669F, -7.8306F, -10.3915F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0349F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 27, -4.5F, -1.75F, -11.25F, 9, 16, 14, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.475F, 6.225F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 81, -2.5F, -3.0F, -11.0F, 5, 3, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.2F, 0.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1833F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 50, -2.5F, -3.0F, -11.0F, 5, 3, 7, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.25F, -10.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1745F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 6.65F, 2.1F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5411F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 57, -3.5F, 1.175F, -9.45F, 7, 6, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.175F, -0.625F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3272F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 81, -2.0F, -2.975F, -6.25F, 4, 2, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.25F, -0.625F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1222F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 46, 50, -4.0F, -2.925F, -6.25F, 8, 10, 8, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(3.5F, 6.1246F, -6.9275F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.336F, 0.1745F, 0.0F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 0, 92, -1.5F, -0.1F, -2.55F, 3, 9, 4, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.1F, 8.275F, 0.15F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.117F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 102, 6, -0.925F, -0.8241F, -1.8328F, 2, 7, 3, 0.0F, true));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.0F, 6.1009F, -0.3328F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.4843F, 0.0873F, 0.0F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 50, 102, -0.25F, -0.25F, -1.0F, 1, 4, 2, 0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.25F, 3.05F, 0.0F);
        this.leftarm3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 65, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.02F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.75F, -0.05F, -1.3F);
        this.leftarm3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 74, 24, -1.0F, 0.0F, -1.0F, 1, 1, 2, -0.01F, true));

        this.opposablePinkie3 = new AdvancedModelRenderer(this);
        this.opposablePinkie3.setRotationPoint(0.25F, 0.0F, 1.0F);
        this.leftarm3.addChild(opposablePinkie3);
        this.setRotateAngle(opposablePinkie3, -0.8727F, 0.0F, 0.0F);
        this.opposablePinkie3.cubeList.add(new ModelBox(opposablePinkie3, 18, 107, -0.5F, 0.0F, -0.65F, 1, 1, 3, -0.01F, true));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-3.5F, 6.1246F, -6.9275F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.336F, -0.1745F, 0.0F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 0, 92, -1.5F, -0.1F, -2.55F, 3, 9, 4, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.1F, 8.275F, 0.15F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.117F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 102, 6, -1.075F, -0.8241F, -1.8328F, 2, 7, 3, 0.0F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(0.0F, 6.1009F, -0.3328F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.4843F, -0.0873F, 0.0F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 50, 102, -0.75F, -0.25F, -1.0F, 1, 4, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.25F, 3.05F, 0.0F);
        this.rightarm3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.3054F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 65, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.75F, -0.05F, -1.3F);
        this.rightarm3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 74, 24, 0.0F, 0.0F, -1.0F, 1, 1, 2, -0.01F, false));

        this.opposablePinkie2 = new AdvancedModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.25F, 0.0F, 1.0F);
        this.rightarm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, -0.8727F, 0.0F, 0.0F);
        this.opposablePinkie2.cubeList.add(new ModelBox(opposablePinkie2, 18, 107, -0.5F, 0.0F, -0.65F, 1, 1, 3, -0.01F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 2.575F, -6.35F);
        this.chest.addChild(neck4);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.neck4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 90, 34, -2.5F, -3.05F, -9.25F, 5, 10, 3, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.625F, -1.9F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.2923F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 88, 82, -2.0F, -1.875F, -4.25F, 4, 6, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 4.65F, -4.475F);
        this.neck3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 92, -1.5F, -3.05F, 0.0F, 3, 3, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.25F, -4.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.7418F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 38, 91, -1.5F, -1.9F, -3.25F, 3, 5, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 3.175F, -2.8F);
        this.neck2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1222F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 100, -1.0F, -1.05F, -0.25F, 2, 1, 6, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2836F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 18, 72, -1.0F, -1.75F, -3.25F, 2, 5, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 58, 24, -1.0F, -2.65F, -3.275F, 2, 1, 2, -0.02F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.8F, 0.55F);
        this.neck.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4058F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 24, -1.0F, -0.05F, -2.05F, 2, 1, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.175F, -2.975F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.425F, -2.5F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0087F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 65, -1.0F, 0.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.25F, -0.925F, -2.7F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1658F, 0.1745F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 78, 65, 0.0F, -1.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.3F, -0.3F, -4.45F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.1309F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 107, -0.5F, -1.0F, -2.0F, 1, 2, 3, 0.01F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.25F, 2.15F, -7.85F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.3875F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 90, 47, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 90, 47, -1.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.1F, -0.05F, -4.2F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0785F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 106, 39, 0.5F, 0.0F, -2.0F, 0, 1, 4, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 106, 39, -0.3F, 0.0F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.225F, 2.875F, -2.525F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1222F, 0.0873F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 102, 47, 0.525F, -2.5F, -3.825F, 0, 1, 5, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.25F, 2.875F, -2.525F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1222F, 0.0873F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 102, 0.525F, -2.5F, -3.825F, 0, 1, 5, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.35F, -4.2F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1222F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 107, -0.5F, 0.0F, -2.0F, 1, 1, 3, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.6F, -7.55F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.2566F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 74, 92, -0.5F, -0.175F, 0.0F, 1, 1, 1, 0.01F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 14, 92, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.0F, -7.425F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.8639F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 84, 24, -0.5F, -1.0F, 0.0F, 1, 2, 1, -0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.4F, -6.925F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.6458F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 80, 24, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.3F, -0.3F, -4.45F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1309F, -0.1309F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 10, 107, -0.5F, -1.0F, -2.0F, 1, 2, 3, 0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.55F, -4.55F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2531F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 78, 60, -0.5F, -1.0F, -2.0F, 1, 2, 3, 0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.25F, -0.925F, -2.7F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1658F, -0.1745F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 78, 65, -1.0F, -1.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.975F, -2.7F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1658F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 56, 107, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -0.3F, -0.025F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0873F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 30, 102, -1.0F, -2.0F, -2.0F, 2, 4, 3, 0.02F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.225F, 2.875F, -2.525F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1222F, -0.0873F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 102, 47, -0.525F, -2.5F, -3.825F, 0, 1, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.25F, 2.875F, -2.525F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1222F, -0.0873F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 40, 102, -0.525F, -2.5F, -3.825F, 0, 1, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7F, -0.075F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0262F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 102, 53, -1.0F, -2.15F, -2.0F, 2, 3, 3, -0.02F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 1.375F, -2.6F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1222F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 106, 34, 0.375F, -2.5F, -3.1F, 0, 1, 4, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 106, 34, -0.375F, -2.5F, -3.1F, 0, 1, 4, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 66, 24, -1.0F, -2.0F, -0.55F, 2, 1, 2, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 102, 16, -0.5F, -2.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.225F, 0.975F, -2.45F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1222F, 0.0873F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 82, 103, 0.5F, -2.5F, -3.6F, 0, 1, 5, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.25F, 0.975F, -2.45F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1222F, 0.0873F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 72, 103, 0.5F, -2.5F, -3.6F, 0, 1, 5, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.575F, 1.375F, -2.6F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1222F, 0.1745F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 102, 107, -0.5F, -2.0F, -3.15F, 1, 1, 3, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 2.0F, -2.9F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0349F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 106, -1.0F, -2.0F, -1.45F, 2, 1, 3, -0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.225F, 0.975F, -2.45F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1222F, -0.0873F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 82, 103, -0.5F, -2.5F, -3.6F, 0, 1, 5, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.25F, 0.975F, -2.45F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1222F, -0.0873F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 72, 103, -0.5F, -2.5F, -3.6F, 0, 1, 5, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.575F, 1.375F, -2.6F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1222F, -0.1745F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 102, 107, -0.5F, -2.0F, -3.15F, 1, 1, 3, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 1.15F, -7.725F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.6938F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 82, 92, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 1.3F, -6.75F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1353F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 78, 92, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.875F, -2.8F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1047F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 92, 103, -0.5F, -1.0F, -4.0F, 1, 1, 4, -0.01F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 1.55F, -0.6F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.3927F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 102, 103, -1.0F, -1.0F, -1.925F, 2, 1, 3, -0.025F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -1.1623F, -2.6592F);
        this.head.addChild(eyes);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.075F, -0.5377F, 0.4592F);
        this.eyes.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0785F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 14, 94, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 14, 94, 0.15F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.hips.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.hips.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.5F;
        this.hips.offsetX = 0.2F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(135);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.4F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.2F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraJinzhousaurus walker = (EntityPrehistoricFloraJinzhousaurus) e;
        this.hips.offsetZ = -0.5F;
        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck, this.head};

        walker.tailBuffer.applyChainSwingBuffer(tailFull);

        float speed = 0.2F;

        //Animations:

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 4, head);

        if (walker.getAnimation() == walker.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!walker.isReallyInWater()) {

                if (f3 == 0.0F || !walker.getIsMoving()) {
                    if (walker.getAnimation() != walker.EAT_ANIMATION
                            && (!walker.isAnimationDirectionLocked(walker.getAnimation()))) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(tailFull, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(tailFull, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    return;
                }

                if (walker.getIsFast()) { //Running


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
        EntityPrehistoricFloraJinzhousaurus ee = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;

        if ((!ee.isQuad() && ee.getAnimation() != ee.TOBI_ANIMATION) || ee.getAnimation() == ee.TOQUAD_ANIMATION) {
            //Bipedal Pose

            //And now the pose:
            this.setRotateAngle(chest, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.3534F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, -0.5411F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.3272F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
            this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.3054F);
            this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.1527F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, -0.4058F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, -0.0087F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r22, 0.1658F, 0.1745F, 0.0F);
            this.setRotateAngle(cube_r23, 0.1309F, 0.1309F, 0.0F);
            this.setRotateAngle(cube_r24, 1.3875F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r25, 0.0785F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r26, 0.1222F, 0.0873F, 0.0F);
            this.setRotateAngle(cube_r27, 0.1222F, 0.0873F, 0.0F);
            this.setRotateAngle(cube_r28, 0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r29, 1.2566F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r30, 0.8639F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r31, 0.6458F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r32, 0.1309F, -0.1309F, 0.0F);
            this.setRotateAngle(cube_r33, 0.2531F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r34, 0.1658F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r35, 0.1658F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r36, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r37, 0.1222F, -0.0873F, 0.0F);
            this.setRotateAngle(cube_r38, 0.1222F, -0.0873F, 0.0F);
            this.setRotateAngle(cube_r39, 0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.1658F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r40, 0.1222F, 0.0873F, 0.0F);
            this.setRotateAngle(cube_r41, 0.1222F, 0.0873F, 0.0F);
            this.setRotateAngle(cube_r42, 0.1222F, 0.1745F, 0.0F);
            this.setRotateAngle(cube_r43, 0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r44, 0.1222F, -0.0873F, 0.0F);
            this.setRotateAngle(cube_r45, 0.1222F, -0.0873F, 0.0F);
            this.setRotateAngle(cube_r46, 0.1222F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r47, -0.6938F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r48, -0.1353F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r49, 0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r50, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r51, 0.0785F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, -0.1484F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.1833F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, -0.0262F, 0.0F, 0.0F);
            this.setRotateAngle(leftarm, 0.829F, 0.1745F, 0.0F);
            this.setRotateAngle(leftarm2, -1.5272F, 0.0F, 0.0F);
            this.setRotateAngle(leftarm3, 0.3054F, 0.0873F, 0.0F);
            this.setRotateAngle(leftleg, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg2, 0.9861F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg3, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg4, 0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(neck, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.7418F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie2, -0.8727F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie3, -0.8727F, 0.0F, 0.0F);
            this.setRotateAngle(rightarm, 0.829F, -0.1745F, 0.0F);
            this.setRotateAngle(rightarm2, -1.5272F, 0.0F, 0.0F);
            this.setRotateAngle(rightarm3, 0.3054F, -0.0873F, 0.0F);
            this.setRotateAngle(rightleg, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg2, 0.9861F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg3, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg4, 0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.2662F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, -0.2618F, 0.0F, 0.0F);



        }

                //Is Walking:
        if (ee.getIsMoving() && !ee.isQuad()) {
            if(ee.getIsFast()) {
                animRunBi(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalkBi(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else if(ee.getIsMoving() && ee.isQuad()){
            animWalkQuad(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }




        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-8.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20 + (((tickAnim - 30) / 20) * (0-(-8.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 30) / 20) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.075-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.075 + (((tickAnim - 30) / 20) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 4 + (((tickAnim - 15) / 15) * (11.025-(4)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 11.025 + (((tickAnim - 30) / 4) * (11.025-(11.025)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 11.025 + (((tickAnim - 34) / 16) * (0-(11.025)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.66323-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.47595-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.81792-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.66323 + (((tickAnim - 15) / 15) * (22.25-(3.66323)));
            yy = 2.47595 + (((tickAnim - 15) / 15) * (0-(2.47595)));
            zz = -6.81792 + (((tickAnim - 15) / 15) * (0-(-6.81792)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 22.25 + (((tickAnim - 30) / 11) * (-1.55-(22.25)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -1.55 + (((tickAnim - 41) / 9) * (0-(-1.55)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyes, eyes.rotateAngleX + (float) Math.toRadians(xx), eyes.rotateAngleY + (float) Math.toRadians(yy), eyes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0.1 + (((tickAnim - 15) / 35) * (0-(0.1)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = -0.05 + (((tickAnim - 15) / 35) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyes.rotationPointX = this.eyes.rotationPointX + (float)(xx);
        this.eyes.rotationPointY = this.eyes.rotationPointY - (float)(yy);
        this.eyes.rotationPointZ = this.eyes.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (0.4-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            yy = 0.4 + (((tickAnim - 15) / 15) * (0-(0.4)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            yy = 0 + (((tickAnim - 30) / 20) * (1-(0)));
            zz = 1 + (((tickAnim - 30) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);
    }
    
    
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.25 + (((tickAnim - 10) / 10) * (0-(8.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-21.48261-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (11.59819-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-19.75241-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.48261 + (((tickAnim - 10) / 10) * (0-(-21.48261)));
            yy = 11.59819 + (((tickAnim - 10) / 10) * (0-(11.59819)));
            zz = -19.75241 + (((tickAnim - 10) / 10) * (0-(-19.75241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.75 + (((tickAnim - 10) / 10) * (0-(-30.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37.75 + (((tickAnim - 10) / 10) * (0-(37.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.25 + (((tickAnim - 10) / 3) * (25.94-(25.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25.94 + (((tickAnim - 13) / 7) * (0-(25.94)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 13.5 + (((tickAnim - 10) / 3) * (19.25-(13.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 13) / 7) * (0-(19.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 10) / 10) * (0-(-0.525)));
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




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (8.75-(6)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 8.75 + (((tickAnim - 13) / 7) * (0-(8.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 10) / 10) * (0-(1.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.25 + (((tickAnim - 10) / 3) * (0-(12.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-21.48261-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-11.59819-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (19.75241-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.48261 + (((tickAnim - 10) / 10) * (0-(-21.48261)));
            yy = -11.59819 + (((tickAnim - 10) / 10) * (0-(-11.59819)));
            zz = 19.75241 + (((tickAnim - 10) / 10) * (0-(19.75241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.75 + (((tickAnim - 10) / 10) * (0-(-30.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37.75 + (((tickAnim - 10) / 10) * (0-(37.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 210;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 210) {
            xx = 9 + (((tickAnim - 66) / 144) * (0-(9)));
            yy = 0 + (((tickAnim - 66) / 144) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 144) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (90.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 90.25 + (((tickAnim - 10) / 15) * (0-(90.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (87.5-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 87.5 + (((tickAnim - 200) / 10) * (0-(87.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 3) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 3) / 3) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 6) / 2) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 6) / 2) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 6) / 2) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 39) {
            xx = 1 + (((tickAnim - 8) / 31) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 31) * (1-(1)));
            zz = 1 + (((tickAnim - 8) / 31) * (1-(1)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 39) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 39) / 3) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 39) / 3) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 42) / 2) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 42) / 2) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 42) / 2) * (1-(1)));
        }
        else if (tickAnim >= 44 && tickAnim < 56) {
            xx = 1 + (((tickAnim - 44) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 44) / 12) * (0.115-(1)));
            zz = 1 + (((tickAnim - 44) / 12) * (1-(1)));
        }
        else if (tickAnim >= 56 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 56) / 19) * (1-(1)));
            yy = 0.115 + (((tickAnim - 56) / 19) * (1-(0.115)));
            zz = 1 + (((tickAnim - 56) / 19) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 1 + (((tickAnim - 75) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 9) * (1-(1)));
            zz = 1 + (((tickAnim - 75) / 9) * (1-(1)));
        }
        else if (tickAnim >= 84 && tickAnim < 87) {
            xx = 1 + (((tickAnim - 84) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 84) / 3) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 84) / 3) * (1-(1)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = 1 + (((tickAnim - 87) / 2) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 87) / 2) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 87) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-1.95-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = -1.95 + (((tickAnim - 25) / 150) * (-1.95-(-1.95)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = -1.95 + (((tickAnim - 175) / 35) * (0-(-1.95)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2 + (((tickAnim - 25) / 41) * (3.75-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = 3.75 + (((tickAnim - 66) / 54) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2-(3.75)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 210) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2 + (((tickAnim - 120) / 90) * (0-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2)));
            yy = 0 + (((tickAnim - 120) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 90) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = -3.75 + (((tickAnim - 25) / 41) * (-2-(-3.75)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = -2 + (((tickAnim - 66) / 54) * (-3.75-(-2)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 210) {
            xx = -3.75 + (((tickAnim - 120) / 90) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 120) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 90) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = -2.75 + (((tickAnim - 25) / 41) * (-1-(-2.75)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = -1 + (((tickAnim - 66) / 54) * (-2.75-(-1)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -2.75 + (((tickAnim - 120) / 50) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 170) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = -2.75 + (((tickAnim - 25) / 41) * (3-(-2.75)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = 3 + (((tickAnim - 66) / 54) * (-2.75-(3)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -2.75 + (((tickAnim - 120) / 50) * (3-(-2.75)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 210) {
            xx = 3 + (((tickAnim - 170) / 40) * (0-(3)));
            yy = 0 + (((tickAnim - 170) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = -6 + (((tickAnim - 25) / 41) * (7-(-6)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = 7 + (((tickAnim - 66) / 54) * (-6-(7)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -6 + (((tickAnim - 120) / 50) * (3-(-6)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 210) {
            xx = 3 + (((tickAnim - 170) / 40) * (0-(3)));
            yy = 0 + (((tickAnim - 170) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 7.75 + (((tickAnim - 25) / 150) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 7.75 + (((tickAnim - 175) / 35) * (0-(7.75)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = -6.25 + (((tickAnim - 25) / 150) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = -6.25 + (((tickAnim - 175) / 35) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 6.5 + (((tickAnim - 25) / 150) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 6.5 + (((tickAnim - 175) / 35) * (0-(6.5)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = -0.175 + (((tickAnim - 25) / 150) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 175) / 35) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 6.25 + (((tickAnim - 25) / 150) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 6.25 + (((tickAnim - 175) / 35) * (0-(6.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.6-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0.6 + (((tickAnim - 25) / 150) * (0.6-(0.6)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0.6 + (((tickAnim - 175) / 35) * (0-(0.6)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -16.75 + (((tickAnim - 10) / 15) * (-52.52058-(-16.75)));
            yy = 0 + (((tickAnim - 10) / 15) * (-7.30482-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (-11.43126-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = -52.52058 + (((tickAnim - 25) / 150) * (-52.52058-(-52.52058)));
            yy = -7.30482 + (((tickAnim - 25) / 150) * (-7.30482-(-7.30482)));
            zz = -11.43126 + (((tickAnim - 25) / 150) * (-11.43126-(-11.43126)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -52.52058 + (((tickAnim - 175) / 25) * (30.86-(-52.52058)));
            yy = -7.30482 + (((tickAnim - 175) / 25) * (0-(-7.30482)));
            zz = -11.43126 + (((tickAnim - 175) / 25) * (0-(-11.43126)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 30.86 + (((tickAnim - 200) / 10) * (0-(30.86)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -22 + (((tickAnim - 10) / 15) * (0-(-22)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (-35-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = -35 + (((tickAnim - 200) / 10) * (0-(-35)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0.9 + (((tickAnim - 10) / 15) * (0-(0.9)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0.5-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 0.5 + (((tickAnim - 200) / 10) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.73909-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-18.2897-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (38.20819-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 19.73909 + (((tickAnim - 10) / 15) * (33.15066-(19.73909)));
            yy = -18.2897 + (((tickAnim - 10) / 15) * (-16.37506-(-18.2897)));
            zz = 38.20819 + (((tickAnim - 10) / 15) * (23.14097-(38.20819)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 33.15066 + (((tickAnim - 25) / 150) * (33.15066-(33.15066)));
            yy = -16.37506 + (((tickAnim - 25) / 150) * (-16.37506-(-16.37506)));
            zz = 23.14097 + (((tickAnim - 25) / 150) * (23.14097-(23.14097)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 33.15066 + (((tickAnim - 175) / 25) * (17.73705-(33.15066)));
            yy = -16.37506 + (((tickAnim - 175) / 25) * (-18.45514-(-16.37506)));
            zz = 23.14097 + (((tickAnim - 175) / 25) * (36.69697-(23.14097)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 17.73705 + (((tickAnim - 200) / 10) * (0-(17.73705)));
            yy = -18.45514 + (((tickAnim - 200) / 10) * (0-(-18.45514)));
            zz = 36.69697 + (((tickAnim - 200) / 10) * (0-(36.69697)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 17 + (((tickAnim - 25) / 8) * (22-(17)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 22 + (((tickAnim - 33) / 7) * (17-(22)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 17 + (((tickAnim - 40) / 30) * (-14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(17)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 71) {
            xx = -14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 70) / 1) * (-5.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
            yy = 0 + (((tickAnim - 70) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 1) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 104) {
            xx = -5.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 71) / 33) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-5.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 71) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 33) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 130) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 104) / 26) * (22-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 104) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 26) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 22 + (((tickAnim - 130) / 10) * (16.25-(22)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 156) {
            xx = 16.25 + (((tickAnim - 140) / 16) * (-3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*15-(16.25)));
            yy = 0 + (((tickAnim - 140) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 16) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 175) {
            xx = -3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*15 + (((tickAnim - 156) / 19) * (15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15-(-3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*15)));
            yy = 0 + (((tickAnim - 156) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 19) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15 + (((tickAnim - 175) / 35) * (0-(15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 40) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 19) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 40) / 19) * (0.375-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 59) / 12) * (0-(0)));
            yy = -0.2 + (((tickAnim - 59) / 12) * (-0.2-(-0.2)));
            zz = 0.375 + (((tickAnim - 59) / 12) * (0.375-(0.375)));
        }
        else if (tickAnim >= 71 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 71) / 33) * (0-(0)));
            yy = -0.2 + (((tickAnim - 71) / 33) * (0-(-0.2)));
            zz = 0.375 + (((tickAnim - 71) / 33) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 18 + (((tickAnim - 25) / 8) * (27.5-(18)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 27.5 + (((tickAnim - 33) / 7) * (18-(27.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 18 + (((tickAnim - 40) / 6) * (13-(18)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 92) {
            xx = 13 + (((tickAnim - 46) / 46) * (-15.1513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(13)));
            yy = 0 + (((tickAnim - 46) / 46) * (6.58319-(0)));
            zz = 0 + (((tickAnim - 46) / 46) * (-0.88526-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 130) {
            xx = -15.1513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 92) / 38) * (27.5-(-15.1513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 6.58319 + (((tickAnim - 92) / 38) * (0-(6.58319)));
            zz = -0.88526 + (((tickAnim - 92) / 38) * (0-(-0.88526)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 27.5 + (((tickAnim - 130) / 25) * (22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15-(27.5)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15 + (((tickAnim - 155) / 20) * (27.75-(22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 27.75 + (((tickAnim - 175) / 35) * (0-(27.75)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-1.85-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 33) / 23) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 23) * (-0.25-(-0.25)));
            zz = -1.85 + (((tickAnim - 33) / 23) * (0-(-1.85)));
        }
        else if (tickAnim >= 56 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 56) / 15) * (0-(0)));
            yy = -0.25 + (((tickAnim - 56) / 15) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 56) / 15) * (0.9-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 71) / 11) * (0-(0)));
            yy = -0.25 + (((tickAnim - 71) / 11) * (-0.35-(-0.25)));
            zz = 0.9 + (((tickAnim - 71) / 11) * (1.3-(0.9)));
        }
        else if (tickAnim >= 82 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 82) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 82) / 10) * (-0.25-(-0.35)));
            zz = 1.3 + (((tickAnim - 82) / 10) * (0.9-(1.3)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            yy = -0.25 + (((tickAnim - 92) / 12) * (0-(-0.25)));
            zz = 0.9 + (((tickAnim - 92) / 12) * (0-(0.9)));
        }
        else if (tickAnim >= 104 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 104) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 26) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 104) / 26) * (-1.975-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 130) / 80) * (0-(0)));
            yy = -0.25 + (((tickAnim - 130) / 80) * (0-(-0.25)));
            zz = -1.975 + (((tickAnim - 130) / 80) * (0-(-1.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 9 + (((tickAnim - 33) / 7) * (18.25-(9)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 18.25 + (((tickAnim - 40) / 35) * (0-(18.25)));
            yy = 0 + (((tickAnim - 40) / 35) * (15-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (-0.075-(0)));
            yy = 15 + (((tickAnim - 75) / 20) * (15-(15)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = -0.075 + (((tickAnim - 95) / 35) * (9-(-0.075)));
            yy = 15 + (((tickAnim - 95) / 35) * (0-(15)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 9 + (((tickAnim - 130) / 25) * (-3-(9)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = -3 + (((tickAnim - 155) / 20) * (12-(-3)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 12 + (((tickAnim - 175) / 35) * (0-(12)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0.025-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 33) / 7) * (-0.125-(-0.125)));
            zz = 0.025 + (((tickAnim - 33) / 7) * (0.175-(0.025)));
        }
        else if (tickAnim >= 40 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 40) / 16) * (0-(0)));
            yy = -0.125 + (((tickAnim - 40) / 16) * (-0.125-(-0.125)));
            zz = 0.175 + (((tickAnim - 40) / 16) * (0.025-(0.175)));
        }
        else if (tickAnim >= 56 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 56) / 19) * (0-(0)));
            yy = -0.125 + (((tickAnim - 56) / 19) * (0-(-0.125)));
            zz = 0.025 + (((tickAnim - 56) / 19) * (0-(0.025)));
        }
        else if (tickAnim >= 75 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 75) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 55) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 75) / 55) * (0.025-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 130) / 80) * (0-(0)));
            yy = -0.125 + (((tickAnim - 130) / 80) * (0-(-0.125)));
            zz = 0.025 + (((tickAnim - 130) / 80) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 13.5 + (((tickAnim - 15) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -22.75 + (((tickAnim - 33) / 7) * (-10.75-(-22.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -10.75 + (((tickAnim - 40) / 6) * (-3.5-(-10.75)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = -3.5 + (((tickAnim - 46) / 10) * (-6-(-3.5)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 75) {
            xx = -6 + (((tickAnim - 56) / 19) * (0-(-6)));
            yy = 0 + (((tickAnim - 56) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 19) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 75) / 19) * (0.57-(0)));
            yy = 0 + (((tickAnim - 75) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 19) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 130) {
            xx = 0.57 + (((tickAnim - 94) / 36) * (-22.75-(0.57)));
            yy = 0 + (((tickAnim - 94) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 36) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -22.75 + (((tickAnim - 130) / 10) * (-2-(-22.75)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 155) {
            xx = -2 + (((tickAnim - 140) / 15) * (3.5-(-2)));
            yy = 0 + (((tickAnim - 140) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 15) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 3.5 + (((tickAnim - 155) / 20) * (-19.5-(3.5)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 189) {
            xx = -19.5 + (((tickAnim - 175) / 14) * (-4.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-19.5)));
            yy = 0 + (((tickAnim - 175) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 14) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 210) {
            xx = -4.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 189) / 21) * (0-(-4.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 189) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 15) / 195) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 195) * (0-(0)));
            zz = 0.125 + (((tickAnim - 15) / 195) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (17.25-(0)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 17.25 + (((tickAnim - 28) / 5) * (0-(17.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 13) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 56) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 54) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (17.25-(0)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 17.25 + (((tickAnim - 125) / 5) * (0-(17.25)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 130) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 35) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 165) / 8) * (16.5-(0)));
            yy = 0 + (((tickAnim - 165) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 8) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 175) {
            xx = 16.5 + (((tickAnim - 173) / 2) * (0-(16.5)));
            yy = 0 + (((tickAnim - 173) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = -10.25 + (((tickAnim - 25) / 150) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = -10.25 + (((tickAnim - 175) / 35) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0.9 + (((tickAnim - 25) / 150) * (0.9-(0.9)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0.9 + (((tickAnim - 175) / 35) * (0-(0.9)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 13.25 + (((tickAnim - 25) / 150) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 13.25 + (((tickAnim - 175) / 35) * (0-(13.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 10.25 + (((tickAnim - 25) / 150) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 10.25 + (((tickAnim - 175) / 35) * (0-(10.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 8.5 + (((tickAnim - 25) / 150) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 8.5 + (((tickAnim - 175) / 35) * (0-(8.5)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = -32.75 + (((tickAnim - 25) / 150) * (-32.75-(-32.75)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = -32.75 + (((tickAnim - 175) / 35) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -14.5 + (((tickAnim - 18) / 15) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (-6.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (5.075-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -6.975 + (((tickAnim - 18) / 15) * (-6.975-(-6.975)));
            zz = 5.075 + (((tickAnim - 18) / 15) * (5.075-(5.075)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -6.975 + (((tickAnim - 33) / 17) * (0-(-6.975)));
            zz = 5.075 + (((tickAnim - 33) / 17) * (0-(5.075)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -3.25 + (((tickAnim - 18) / 15) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 33) / 17) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -6.5 + (((tickAnim - 18) / 15) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 33) / 17) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -8 + (((tickAnim - 18) / 15) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 33) / 17) * (0-(-8)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 30.25 + (((tickAnim - 18) / 15) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 30.25 + (((tickAnim - 33) / 17) * (0-(30.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 33) / 17) * (0-(-14.25)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 23.75 + (((tickAnim - 18) / 15) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 23.75 + (((tickAnim - 33) / 17) * (0-(23.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.75 + (((tickAnim - 18) / 15) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.75 + (((tickAnim - 33) / 17) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-47-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -47 + (((tickAnim - 18) / 15) * (-47-(-47)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -47 + (((tickAnim - 33) / 17) * (0-(-47)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.2 + (((tickAnim - 18) / 15) * (1.2-(1.2)));
            zz = 0.425 + (((tickAnim - 18) / 15) * (0.425-(0.425)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.2 + (((tickAnim - 33) / 17) * (0-(1.2)));
            zz = 0.425 + (((tickAnim - 33) / 17) * (0-(0.425)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 53.25 + (((tickAnim - 18) / 15) * (53.25-(53.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 33) / 17) * (0-(53.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.525 + (((tickAnim - 18) / 15) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.525 + (((tickAnim - 33) / 17) * (0-(0.525)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.5 + (((tickAnim - 18) / 15) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 33) / 17) * (0-(6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 9 + (((tickAnim - 18) / 15) * (9-(9)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 33) / 17) * (0-(9)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




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
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 33) / 17) * (0-(-14.25)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 23.75 + (((tickAnim - 18) / 15) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 23.75 + (((tickAnim - 33) / 17) * (0-(23.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.75 + (((tickAnim - 18) / 15) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.75 + (((tickAnim - 33) / 17) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-47-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -47 + (((tickAnim - 18) / 15) * (-47-(-47)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -47 + (((tickAnim - 33) / 17) * (0-(-47)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.2 + (((tickAnim - 18) / 15) * (1.2-(1.2)));
            zz = 0.425 + (((tickAnim - 18) / 15) * (0.425-(0.425)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.2 + (((tickAnim - 33) / 17) * (0-(1.2)));
            zz = 0.425 + (((tickAnim - 33) / 17) * (0-(0.425)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 53.25 + (((tickAnim - 18) / 15) * (53.25-(53.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 33) / 17) * (0-(53.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.525 + (((tickAnim - 18) / 15) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.525 + (((tickAnim - 33) / 17) * (0-(0.525)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 33.25 + (((tickAnim - 23) / 17) * (-2.66-(33.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -2.66 + (((tickAnim - 40) / 10) * (0-(-2.66)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (22.5-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 40) / 10) * (0-(22.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(0);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(0);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (-63.25-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -63.25 + (((tickAnim - 40) / 10) * (0-(-63.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1 + (((tickAnim - 33) / 17) * (0-(1)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 54.25 + (((tickAnim - 23) / 10) * (99.23-(54.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 99.23 + (((tickAnim - 33) / 17) * (0-(99.23)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (1.85-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.85 + (((tickAnim - 33) / 17) * (0-(1.85)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -38.5 + (((tickAnim - 17) / 6) * (0-(-38.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 22.25 + (((tickAnim - 33) / 17) * (0-(22.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.2-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0.2 + (((tickAnim - 17) / 6) * (0-(0.2)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10 + (((tickAnim - 0) / 25) * (6.9299-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+130))*-10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.02272-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 6.9299-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+130))*-10 + (((tickAnim - 25) / 20) * (0-(6.9299-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+130))*-10)));
            yy = -1.02272 + (((tickAnim - 25) / 20) * (0-(-1.02272)));
            zz = 22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30 + (((tickAnim - 25) / 20) * (0-(22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10 + (((tickAnim - 0) / 25) * (6.9299-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+80))*-10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.02272-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 6.9299-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+80))*-10 + (((tickAnim - 25) / 20) * (0-(6.9299-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+80))*-10)));
            yy = -1.02272 + (((tickAnim - 25) / 20) * (0-(-1.02272)));
            zz = 22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30 + (((tickAnim - 25) / 20) * (0-(22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.325-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0.325 + (((tickAnim - 25) / 20) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10 + (((tickAnim - 0) / 25) * (-4.8201-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-30-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.02272-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -4.8201-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-30 + (((tickAnim - 25) / 20) * (0-(-4.8201-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-30)));
            yy = -1.02272 + (((tickAnim - 25) / 20) * (0-(-1.02272)));
            zz = 22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30 + (((tickAnim - 25) / 20) * (0-(22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-50))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-50))*-1 + (((tickAnim - 25) / 20) * (0-(-6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-50))*-1)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (7.85-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 7.85 + (((tickAnim - 3) / 5) * (2.8-(7.85)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 2.8 + (((tickAnim - 8) / 17) * (10.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5))*-3-(2.8)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 10.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5))*-3 + (((tickAnim - 25) / 20) * (0-(10.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5))*-3)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 9) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 3.75 + (((tickAnim - 9) / 9) * (0-(3.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -6.75 + (((tickAnim - 9) / 9) * (0-(-6.75)));
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
            xx = 0 + (((tickAnim - 0) / 9) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 9) / 9) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-34.04294-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.03309-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-34.72554-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -34.04294 + (((tickAnim - 5) / 5) * (-73.36729-(-34.04294)));
            yy = 2.03309 + (((tickAnim - 5) / 5) * (21.10509-(2.03309)));
            zz = -34.72554 + (((tickAnim - 5) / 5) * (-0.15136-(-34.72554)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -73.36729 + (((tickAnim - 10) / 8) * (0-(-73.36729)));
            yy = 21.10509 + (((tickAnim - 10) / 8) * (0-(21.10509)));
            zz = -0.15136 + (((tickAnim - 10) / 8) * (0-(-0.15136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.88686-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-10.34423-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-13.88246-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 5.88686 + (((tickAnim - 5) / 8) * (1.06222-(5.88686)));
            yy = -10.34423 + (((tickAnim - 5) / 8) * (7.87741-(-10.34423)));
            zz = -13.88246 + (((tickAnim - 5) / 8) * (7.87266-(-13.88246)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.06222 + (((tickAnim - 13) / 5) * (0-(1.06222)));
            yy = 7.87741 + (((tickAnim - 13) / 5) * (0-(7.87741)));
            zz = 7.87266 + (((tickAnim - 13) / 5) * (0-(7.87266)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-14-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = -14 + (((tickAnim - 4) / 3) * (-18.75-(-14)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0.52627-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (9.52561-(0)));
            zz = -18.75 + (((tickAnim - 7) / 3) * (37.7221-(-18.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.52627 + (((tickAnim - 10) / 3) * (0-(0.52627)));
            yy = 9.52561 + (((tickAnim - 10) / 3) * (0-(9.52561)));
            zz = 37.7221 + (((tickAnim - 10) / 3) * (21-(37.7221)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 21 + (((tickAnim - 13) / 5) * (0-(21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -10.5 + (((tickAnim - 9) / 9) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -7.75 + (((tickAnim - 9) / 9) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 13.25 + (((tickAnim - 9) / 9) * (0-(13.25)));
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
            xx = 0 + (((tickAnim - 0) / 9) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 15.75 + (((tickAnim - 9) / 9) * (0-(15.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 9) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 9) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5+150))*5), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5+50))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5+150))*-1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5+100))*2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5+250))*3), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5+300))*-5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-50))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5+350))*8), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-100))*-7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5+400))*15), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-150))*-9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-110))*4), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+100))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+200))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-180))*-4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+250))*-2));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-220))*4), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+250))*-2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-290))*8), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+250))*-2));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-290))*-8), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+250))*-2));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-220))*-4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-250))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-350))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.25);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-400))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-400))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14.5 + (((tickAnim - 0) / 8) * (25.5-(-14.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 25.5 + (((tickAnim - 8) / 10) * (-14.5-(25.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 0) / 8) * (18.25-(-7)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 18.25 + (((tickAnim - 8) / 4) * (104.17-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(18.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 104.17-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 12) / 6) * (-7-(104.17-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 21.25 + (((tickAnim - 0) / 8) * (13-(21.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 13 + (((tickAnim - 8) / 4) * (-54.75-(13)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -54.75 + (((tickAnim - 12) / 2) * (-81.5-(-54.75)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -81.5 + (((tickAnim - 14) / 4) * (21.25-(-81.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.975 + (((tickAnim - 0) / 8) * (0-(-0.975)));
            zz = 0.25 + (((tickAnim - 0) / 8) * (0.2-(0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.85-(0)));
            zz = 0.2 + (((tickAnim - 8) / 4) * (0.22-(0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 12) / 2) * (0.85-(0.85)));
            zz = 0.22 + (((tickAnim - 12) / 2) * (0.22-(0.22)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 14) / 4) * (-0.975-(0.85)));
            zz = 0.22 + (((tickAnim - 14) / 4) * (0.25-(0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 32.99256 + (((tickAnim - 0) / 2) * (-10.1-(32.99256)));
            yy = -0.26089 + (((tickAnim - 0) / 2) * (0-(-0.26089)));
            zz = 2.52045 + (((tickAnim - 0) / 2) * (0-(2.52045)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10.1 + (((tickAnim - 2) / 1) * (-17.71-(-10.1)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -17.71 + (((tickAnim - 3) / 2) * (1.45-(-17.71)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.45 + (((tickAnim - 5) / 3) * (33-(1.45)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 33 + (((tickAnim - 8) / 4) * (79-(33)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 79 + (((tickAnim - 12) / 2) * (73.5-(79)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 73.5 + (((tickAnim - 14) / 4) * (32.99256-(73.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (-0.26089-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (2.52045-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 0) / 2) * (-0.295-(1.075)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.06-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.295 + (((tickAnim - 2) / 3) * (1.645-(-0.295)));
            zz = 0.06 + (((tickAnim - 2) / 3) * (0.995-(0.06)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.645 + (((tickAnim - 5) / 3) * (0.6-(1.645)));
            zz = 0.995 + (((tickAnim - 5) / 3) * (0.2-(0.995)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 8) / 4) * (1.08-(0.6)));
            zz = 0.2 + (((tickAnim - 8) / 4) * (0.03-(0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.08 + (((tickAnim - 12) / 2) * (1.08-(1.08)));
            zz = 0.03 + (((tickAnim - 12) / 2) * (0.03-(0.03)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.08 + (((tickAnim - 14) / 4) * (1.075-(1.08)));
            zz = 0.03 + (((tickAnim - 14) / 4) * (0-(0.03)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-39.07-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -39.07 + (((tickAnim - 5) / 3) * (29-(-39.07)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 29 + (((tickAnim - 8) / 10) * (0-(29)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 25.5 + (((tickAnim - 0) / 9) * (-14.5-(25.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -14.5 + (((tickAnim - 9) / 9) * (25.5-(-14.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.25 + (((tickAnim - 0) / 3) * (50.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(18.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 50.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 3) / 6) * (-7-(50.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -7 + (((tickAnim - 9) / 9) * (18.25-(-7)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13 + (((tickAnim - 0) / 3) * (-54.75-(13)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -54.75 + (((tickAnim - 3) / 3) * (-81.5-(-54.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -81.5 + (((tickAnim - 6) / 3) * (21.25-(-81.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 21.25 + (((tickAnim - 9) / 9) * (13-(21.25)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.85-(0)));
            zz = 0.2 + (((tickAnim - 0) / 3) * (0.22-(0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 3) / 3) * (0.85-(0.85)));
            zz = 0.22 + (((tickAnim - 3) / 3) * (0.22-(0.22)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 6) / 3) * (-0.975-(0.85)));
            zz = 0.22 + (((tickAnim - 6) / 3) * (0.25-(0.22)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -0.975 + (((tickAnim - 9) / 9) * (0-(-0.975)));
            zz = 0.25 + (((tickAnim - 9) / 9) * (0.2-(0.25)));
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
            xx = 33 + (((tickAnim - 0) / 3) * (79-(33)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 79 + (((tickAnim - 3) / 3) * (73.5-(79)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 73.5 + (((tickAnim - 6) / 3) * (32.99256-(73.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (-0.26089-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (2.52045-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 32.99256 + (((tickAnim - 9) / 2) * (-16.6-(32.99256)));
            yy = -0.26089 + (((tickAnim - 9) / 2) * (0-(-0.26089)));
            zz = 2.52045 + (((tickAnim - 9) / 2) * (0-(2.52045)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -16.6 + (((tickAnim - 11) / 1) * (-17.71-(-16.6)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -17.71 + (((tickAnim - 12) / 2) * (1.45-(-17.71)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1.45 + (((tickAnim - 14) / 4) * (33-(1.45)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 3) * (1.08-(0.6)));
            zz = 0.2 + (((tickAnim - 0) / 3) * (0.03-(0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.08 + (((tickAnim - 3) / 3) * (1.08-(1.08)));
            zz = 0.03 + (((tickAnim - 3) / 3) * (0.03-(0.03)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 1.08 + (((tickAnim - 6) / 3) * (1.075-(1.08)));
            zz = 0.03 + (((tickAnim - 6) / 3) * (0-(0.03)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 9) / 2) * (0.305-(1.075)));
            zz = 0 + (((tickAnim - 9) / 2) * (0.06-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.305 + (((tickAnim - 11) / 3) * (1.645-(0.305)));
            zz = 0.06 + (((tickAnim - 11) / 3) * (0.995-(0.06)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.645 + (((tickAnim - 14) / 4) * (0.6-(1.645)));
            zz = 0.995 + (((tickAnim - 14) / 4) * (0.2-(0.995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 29 + (((tickAnim - 0) / 9) * (0-(29)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-39.07-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -39.07 + (((tickAnim - 14) / 4) * (29-(-39.07)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-220))*4), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+250))*-2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-290))*8), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+250))*-2));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-290))*-8), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+250))*-2));

    }
    public void animWalkQuad(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*1), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-10))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*-1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*1.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*3), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-350))*4), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 26.25 + (((tickAnim - 0) / 6) * (25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(26.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 6) / 7) * (-12-(25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -12 + (((tickAnim - 13) / 22) * (26.25-(-12)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-46.99-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -46.99-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100 + (((tickAnim - 4) / 9) * (-7.5-(-46.99-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 13) / 22) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-69.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -69.25 + (((tickAnim - 6) / 3) * (-56.25-(-69.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -56.25 + (((tickAnim - 9) / 4) * (0-(-56.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.03-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.6-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 1.03 + (((tickAnim - 6) / 3) * (1.02-(1.03)));
            zz = 0.6 + (((tickAnim - 6) / 3) * (0-(0.6)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.02 + (((tickAnim - 9) / 4) * (0-(1.02)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 38.75 + (((tickAnim - 0) / 6) * (79.26-(38.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 79.26 + (((tickAnim - 6) / 3) * (70.75-(79.26)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 70.75 + (((tickAnim - 9) / 4) * (19-(70.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 19 + (((tickAnim - 13) / 6) * (7.25-(19)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 7.25 + (((tickAnim - 19) / 5) * (-3.75-(7.25)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -3.75 + (((tickAnim - 24) / 5) * (23.37-(-3.75)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 23.37 + (((tickAnim - 29) / 6) * (38.75-(23.37)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.865 + (((tickAnim - 0) / 6) * (1.865-(1.865)));
            zz = 0.825 + (((tickAnim - 0) / 6) * (0.525-(0.825)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 1.865 + (((tickAnim - 6) / 7) * (0.925-(1.865)));
            zz = 0.525 + (((tickAnim - 6) / 7) * (0-(0.525)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 13) / 3) * (1.16-(0.925)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.16 + (((tickAnim - 16) / 3) * (0.425-(1.16)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 19) / 5) * (-0.425-(0.425)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 24) / 5) * (0.36-(-0.425)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0.36 + (((tickAnim - 29) / 6) * (1.865-(0.36)));
            zz = 0 + (((tickAnim - 29) / 6) * (0.825-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 30.25 + (((tickAnim - 6) / 3) * (0-(30.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (-35.96-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -35.96 + (((tickAnim - 29) / 6) * (0-(-35.96)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0.01-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -0.32 + (((tickAnim - 29) / 6) * (0-(-0.32)));
            zz = 0.01 + (((tickAnim - 29) / 6) * (0-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg5.rotationPointX = this.rightleg5.rotationPointX + (float)(xx);
        this.rightleg5.rotationPointY = this.rightleg5.rotationPointY - (float)(yy);
        this.rightleg5.rotationPointZ = this.rightleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-90))*-2), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-90))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-180))*2), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-90))*-0.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18.59684 + (((tickAnim - 0) / 5) * (-32.75-(-18.59684)));
            yy = 2.38013 + (((tickAnim - 0) / 5) * (0-(2.38013)));
            zz = -2.2857 + (((tickAnim - 0) / 5) * (0-(-2.2857)));
        }
        else if (tickAnim >= 5 && tickAnim < 28) {
            xx = -32.75 + (((tickAnim - 5) / 23) * (13-(-32.75)));
            yy = 0 + (((tickAnim - 5) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 23) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 13 + (((tickAnim - 28) / 7) * (-18.59684-(13)));
            yy = 0 + (((tickAnim - 28) / 7) * (2.38013-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-2.2857-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -21.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 0) / 5) * (18.86607-(-21.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.29652-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.80108-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 28) {
            xx = 18.86607 + (((tickAnim - 5) / 23) * (19.5-(18.86607)));
            yy = -0.29652 + (((tickAnim - 5) / 23) * (0-(-0.29652)));
            zz = -0.80108 + (((tickAnim - 5) / 23) * (0-(-0.80108)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 28) / 7) * (328.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(19.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 5) * (0-(-0.325)));
            zz = 0.225 + (((tickAnim - 0) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (1.1-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (-0.02-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            yy = 1.1 + (((tickAnim - 12) / 16) * (-0.5-(1.1)));
            zz = -0.02 + (((tickAnim - 12) / 16) * (-0.225-(-0.02)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 28) / 7) * (-0.325-(-0.5)));
            zz = -0.225 + (((tickAnim - 28) / 7) * (0.225-(-0.225)));
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
            xx = 12.5 + (((tickAnim - 0) / 3) * (7.1-(12.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.1 + (((tickAnim - 3) / 2) * (12-(7.1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 12 + (((tickAnim - 5) / 7) * (1.46-(12)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 1.46 + (((tickAnim - 12) / 16) * (0-(1.46)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (30.75-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 30.75 + (((tickAnim - 30) / 5) * (12.5-(30.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.43 + (((tickAnim - 0) / 5) * (0-(0.43)));
            zz = -0.12 + (((tickAnim - 0) / 5) * (-0.475-(-0.12)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0.35-(0)));
            zz = -0.475 + (((tickAnim - 5) / 7) * (0-(-0.475)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            yy = 0.35 + (((tickAnim - 12) / 16) * (0-(0.35)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.15-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (-0.7-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 30) / 5) * (0.43-(0.15)));
            zz = -0.7 + (((tickAnim - 30) / 5) * (-0.12-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*-2), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-90))*0.5), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*-0.15);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-280))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -11.5 + (((tickAnim - 0) / 12) * (13-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 13 + (((tickAnim - 12) / 7) * (-18.59684-(13)));
            yy = 0 + (((tickAnim - 12) / 7) * (-2.38013-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (2.2857-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -18.59684 + (((tickAnim - 19) / 5) * (-32.75-(-18.59684)));
            yy = -2.38013 + (((tickAnim - 19) / 5) * (0-(-2.38013)));
            zz = 2.2857 + (((tickAnim - 19) / 5) * (0-(2.2857)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -32.75 + (((tickAnim - 24) / 11) * (-11.5-(-32.75)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 20.75 + (((tickAnim - 0) / 12) * (19.5-(20.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 19.5 + (((tickAnim - 12) / 7) * (94.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(19.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 94.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 19) / 5) * (16.25-(94.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 16.25 + (((tickAnim - 24) / 11) * (20.75-(16.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 12) * (-0.5-(0.7)));
            zz = 0.075 + (((tickAnim - 0) / 12) * (-0.225-(0.075)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 12) / 7) * (-0.325-(-0.5)));
            zz = -0.225 + (((tickAnim - 12) / 7) * (0.225-(-0.225)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 19) / 5) * (0-(-0.325)));
            zz = 0.225 + (((tickAnim - 19) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (1.055-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0.04-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 1.055 + (((tickAnim - 30) / 5) * (0.7-(1.055)));
            zz = 0.04 + (((tickAnim - 30) / 5) * (0.075-(0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -10 + (((tickAnim - 0) / 12) * (0-(-10)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (30.75-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 30.75 + (((tickAnim - 14) / 4) * (12.5-(30.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 12.5 + (((tickAnim - 18) / 3) * (-1.5-(12.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -1.5 + (((tickAnim - 21) / 3) * (17-(-1.5)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 24) / 11) * (-10-(17)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 12) * (0-(0.525)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0.15-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (-0.7-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 14) / 4) * (0.43-(0.15)));
            zz = -0.7 + (((tickAnim - 14) / 4) * (-0.12-(-0.7)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0.43 + (((tickAnim - 18) / 6) * (0-(0.43)));
            zz = -0.12 + (((tickAnim - 18) / 6) * (-0.475-(-0.12)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0.525-(0)));
            zz = -0.475 + (((tickAnim - 24) / 11) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -1.5 + (((tickAnim - 0) / 16) * (26.25-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 26.25 + (((tickAnim - 16) / 6) * (54.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(26.25)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 54.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 22) / 6) * (-12-(54.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -12 + (((tickAnim - 28) / 7) * (-1.5-(-12)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -2 + (((tickAnim - 0) / 16) * (0-(-2)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (24.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 24.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100 + (((tickAnim - 20) / 8) * (-7.5-(24.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 28) / 7) * (-2-(-7.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -2.25 + (((tickAnim - 0) / 16) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (-69.25-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -69.25 + (((tickAnim - 22) / 3) * (-56.25-(-69.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -56.25 + (((tickAnim - 25) / 3) * (0-(-56.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 5) * (-0.255-(0.175)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            yy = -0.255 + (((tickAnim - 5) / 11) * (0-(-0.255)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (1.03-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0.6-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.03 + (((tickAnim - 22) / 3) * (1.02-(1.03)));
            zz = 0.6 + (((tickAnim - 22) / 3) * (0-(0.6)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 1.02 + (((tickAnim - 25) / 3) * (0-(1.02)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0.175-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
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
            xx = 4 + (((tickAnim - 0) / 5) * (-3.75-(4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.75 + (((tickAnim - 5) / 5) * (23.37-(-3.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 23.37 + (((tickAnim - 10) / 6) * (38.75-(23.37)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 38.75 + (((tickAnim - 16) / 6) * (79.26-(38.75)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 79.26 + (((tickAnim - 22) / 3) * (70.75-(79.26)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 70.75 + (((tickAnim - 25) / 3) * (19-(70.75)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 19 + (((tickAnim - 28) / 7) * (4-(19)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 5) * (-0.675-(0.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.675 + (((tickAnim - 5) / 5) * (0.36-(-0.675)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0.36 + (((tickAnim - 10) / 6) * (1.865-(0.36)));
            zz = 0 + (((tickAnim - 10) / 6) * (0.825-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 1.865 + (((tickAnim - 16) / 6) * (1.865-(1.865)));
            zz = 0.825 + (((tickAnim - 16) / 6) * (0.525-(0.825)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 1.865 + (((tickAnim - 22) / 6) * (0.575-(1.865)));
            zz = 0.525 + (((tickAnim - 22) / 6) * (0-(0.525)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 28) / 4) * (0.985-(0.575)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.985 + (((tickAnim - 32) / 3) * (0.25-(0.985)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-35.96-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -35.96 + (((tickAnim - 10) / 6) * (0-(-35.96)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (30.25-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 30.25 + (((tickAnim - 22) / 3) * (0-(30.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.01-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.32 + (((tickAnim - 10) / 6) * (0-(-0.32)));
            zz = 0.01 + (((tickAnim - 10) / 6) * (0-(0.01)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);
    }
    public void animWalkBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraJinzhousaurus entity = (EntityPrehistoricFloraJinzhousaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*1), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-10))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*-2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*2.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*3), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*4), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-350))*5), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-90))*-2), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-90))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-180))*2), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-90))*-0.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-180))*2), leftarm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-90))*-0.5), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*-4), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*-8), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*-2), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-90))*0.5), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*-0.15);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-280))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -1.5 + (((tickAnim - 0) / 16) * (26.25-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 26.25 + (((tickAnim - 16) / 6) * (54.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(26.25)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 54.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 22) / 6) * (-12-(54.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -12 + (((tickAnim - 28) / 7) * (-1.5-(-12)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -2 + (((tickAnim - 0) / 16) * (0-(-2)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (24.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 24.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100 + (((tickAnim - 20) / 8) * (-7.5-(24.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 28) / 7) * (-2-(-7.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -2.25 + (((tickAnim - 0) / 16) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (-69.25-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -69.25 + (((tickAnim - 22) / 3) * (-56.25-(-69.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -56.25 + (((tickAnim - 25) / 3) * (0-(-56.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 5) * (-0.255-(0.175)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            yy = -0.255 + (((tickAnim - 5) / 11) * (0-(-0.255)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (1.03-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0.6-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.03 + (((tickAnim - 22) / 3) * (1.02-(1.03)));
            zz = 0.6 + (((tickAnim - 22) / 3) * (0-(0.6)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 1.02 + (((tickAnim - 25) / 3) * (0-(1.02)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0.175-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
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
            xx = 4 + (((tickAnim - 0) / 5) * (-3.75-(4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.75 + (((tickAnim - 5) / 5) * (23.37-(-3.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 23.37 + (((tickAnim - 10) / 6) * (56.25-(23.37)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 56.25 + (((tickAnim - 16) / 6) * (63.51-(56.25)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 63.51 + (((tickAnim - 22) / 3) * (70.75-(63.51)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 70.75 + (((tickAnim - 25) / 3) * (19-(70.75)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 19 + (((tickAnim - 28) / 7) * (4-(19)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 5) * (0.2-(0.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 5) / 5) * (2.31-(0.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 2.31 + (((tickAnim - 10) / 6) * (2.34-(2.31)));
            zz = 0 + (((tickAnim - 10) / 6) * (0.825-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 2.34 + (((tickAnim - 16) / 6) * (1.865-(2.34)));
            zz = 0.825 + (((tickAnim - 16) / 6) * (0.525-(0.825)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 1.865 + (((tickAnim - 22) / 6) * (-0.2-(1.865)));
            zz = 0.525 + (((tickAnim - 22) / 6) * (0.3-(0.525)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 28) / 4) * (0.595-(-0.2)));
            zz = 0.3 + (((tickAnim - 28) / 4) * (0.15-(0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.595 + (((tickAnim - 32) / 3) * (0.25-(0.595)));
            zz = 0.15 + (((tickAnim - 32) / 3) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-35.96-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -35.96 + (((tickAnim - 10) / 6) * (-82-(-35.96)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -82 + (((tickAnim - 16) / 6) * (30.25-(-82)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 30.25 + (((tickAnim - 22) / 3) * (0-(30.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.01-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.32 + (((tickAnim - 10) / 6) * (-0.725-(-0.32)));
            zz = 0.01 + (((tickAnim - 10) / 6) * (-0.575-(0.01)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 16) / 3) * (0-(-0.725)));
            zz = -0.575 + (((tickAnim - 16) / 3) * (0-(-0.575)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 26.25 + (((tickAnim - 0) / 6) * (25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(26.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 6) / 7) * (-12-(25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -12 + (((tickAnim - 13) / 22) * (26.25-(-12)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-46.99-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -46.99-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100 + (((tickAnim - 4) / 9) * (-7.5-(-46.99-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 13) / 22) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-69.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -69.25 + (((tickAnim - 6) / 3) * (-56.25-(-69.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -56.25 + (((tickAnim - 9) / 4) * (0-(-56.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.03-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.6-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 1.03 + (((tickAnim - 6) / 3) * (1.02-(1.03)));
            zz = 0.6 + (((tickAnim - 6) / 3) * (0-(0.6)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.02 + (((tickAnim - 9) / 4) * (0-(1.02)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 56.25 + (((tickAnim - 0) / 6) * (63.51-(56.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 63.51 + (((tickAnim - 6) / 3) * (70.75-(63.51)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 70.75 + (((tickAnim - 9) / 4) * (19-(70.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 19 + (((tickAnim - 13) / 6) * (4.75-(19)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 4.75 + (((tickAnim - 19) / 5) * (-3.75-(4.75)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -3.75 + (((tickAnim - 24) / 5) * (23.37-(-3.75)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 23.37 + (((tickAnim - 29) / 6) * (56.25-(23.37)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.865 + (((tickAnim - 0) / 6) * (1.865-(1.865)));
            zz = 0.825 + (((tickAnim - 0) / 6) * (0.525-(0.825)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 1.865 + (((tickAnim - 6) / 7) * (-0.2-(1.865)));
            zz = 0.525 + (((tickAnim - 6) / 7) * (0.3-(0.525)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 3) * (0.575-(-0.2)));
            zz = 0.3 + (((tickAnim - 13) / 3) * (0-(0.3)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 16) / 3) * (0.35-(0.575)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 19) / 5) * (0.25-(0.35)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 24) / 5) * (2.51-(0.25)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 2.51 + (((tickAnim - 29) / 6) * (1.865-(2.51)));
            zz = 0 + (((tickAnim - 29) / 6) * (0.825-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -82 + (((tickAnim - 0) / 6) * (30.25-(-82)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 30.25 + (((tickAnim - 6) / 3) * (0-(30.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (-35.96-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -35.96 + (((tickAnim - 29) / 6) * (-82-(-35.96)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 3) * (0-(-0.725)));
            zz = -0.575 + (((tickAnim - 0) / 3) * (0-(-0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0.01-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -0.32 + (((tickAnim - 29) / 6) * (-0.725-(-0.32)));
            zz = 0.01 + (((tickAnim - 29) / 6) * (-0.575-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg5.rotationPointX = this.rightleg5.rotationPointX + (float)(xx);
        this.rightleg5.rotationPointY = this.rightleg5.rotationPointY - (float)(yy);
        this.rightleg5.rotationPointZ = this.rightleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-180))*2), rightarm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-90))*-0.5), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*-4), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*-8), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraJinzhousaurus e = (EntityPrehistoricFloraJinzhousaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.TOBI_ANIMATION);
        animator.startKeyframe(e.getToBiTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, ((-0.0698F)-(-0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0349F)-(0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.0175F)-(0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((-0.1396F)-(-0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((0.0349F)-(0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.0524F)-(-0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((0.3229F)-(0.3229F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((0.2007F)-(0.2007F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((0.5934F)-(0.5934F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.0175F)-(-0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((0.4712F)-(0.4712F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((0.4712F)-(0.4712F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((0.1396F)-(0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r25, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3054F)-(0.3054F)));
        animator.rotate(cube_r26, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r27, ((0.1396F)-(0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r28, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r29, ((0.4887F)-(0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.192F)-(-0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r30, ((0.4887F)-(0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r31, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r32, ((-0.0524F)-(-0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r33, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r34, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r35, ((-0.2269F)-(-0.2269F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r36, ((-0.4189F)-(-0.4189F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r37, ((-0.1571F)-(-0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r38, ((-0.1396F)-(-0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r39, ((-0.2793F)-(-0.2793F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.0561F)-(0.0561F)), ((0.0026F)-(0.0026F)),((0.025F)-(0.025F)));
        animator.rotate(cube_r40, ((-0.0611F)-(-0.0611F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r41, ((0.1658F)-(0.1658F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r42, ((0.096F)-(0.096F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r43, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r44, ((0.3142F)-(0.3142F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r45, ((-0.4887F)-(-0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r46, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r47, ((-1.6144F)-(-1.6144F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r48, ((0.9948F)-(0.9948F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r49, ((-0.2967F)-(-0.2967F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((-0.192F)-(-0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r50, ((0.0524F)-(0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r51, ((0.6283F)-(0.6283F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.0561F)-(0.0561F)), ((-0.0026F)-(-0.0026F)),((-0.025F)-(-0.025F)));
        animator.rotate(cube_r7, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((-0.0698F)-(-0.0698F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.1396F)-(0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.288F)-(0.288F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((-0.1396F)-(-0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((-0.0347F)-(-0.0347F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftarm, ((0.7549F)-(0.48F)), ((0.0F)-(0.0F)),((-0.1745F)-(-0.1745F)));
        animator.rotate(leftarm2, ((-1.2449F)-(-0.778F)), ((0.4728F)-(0.4728F)),((-0.1272F)-(-0.1272F)));
        animator.rotate(leftarm3, ((0.6236F)-(0.2294F)), ((0.2241F)-(0.3165F)),((0.3982F)-(0.1985F)));
        animator.rotate(leftleg, ((0.1091F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg2, ((0.7243F)-(0.7243F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg3, ((-0.7854F)-(-0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg4, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.2967F)-(-0.2967F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((0.3796F)-(0.2793F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, ((0.7069F)-(1.1781F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie3, ((0.7069F)-(1.1781F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightarm, ((0.7549F)-(0.48F)), ((0.0F)-(0.0F)),((0.1745F)-(0.1745F)));
        animator.rotate(rightarm2, ((-1.2449F)-(-0.778F)), ((-0.4728F)-(-0.4728F)),((0.1272F)-(0.1272F)));
        animator.rotate(rightarm3, ((0.6236F)-(0.2294F)), ((-0.2241F)-(-0.3165F)),((-0.3982F)-(-0.1985F)));
        animator.rotate(rightleg, ((0.1091F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg2, ((0.7243F)-(0.7243F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg3, ((-0.7854F)-(-0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg4, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.096F)-(-0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((-0.0175F)-(-0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((0.0087F)-(0.0087F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((-0.0175F)-(-0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((-0.1047F)-(-0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));

       


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.TOQUAD_ANIMATION);
        animator.startKeyframe(e.getToQuadTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, -((-0.0698F)-(-0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.0349F)-(0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.0175F)-(0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((-0.1396F)-(-0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((0.0349F)-(0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.0524F)-(-0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((0.3229F)-(0.3229F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((0.2007F)-(0.2007F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((0.5934F)-(0.5934F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.0175F)-(-0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((0.4712F)-(0.4712F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((0.4712F)-(0.4712F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((0.1396F)-(0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r25, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3054F)-(0.3054F)));
        animator.rotate(cube_r26, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r27, -((0.1396F)-(0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r28, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r29, -((0.4887F)-(0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.192F)-(-0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r30, -((0.4887F)-(0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r31, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r32, -((-0.0524F)-(-0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r33, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r34, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r35, -((-0.2269F)-(-0.2269F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r36, -((-0.4189F)-(-0.4189F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r37, -((-0.1571F)-(-0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r38, -((-0.1396F)-(-0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r39, -((-0.2793F)-(-0.2793F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.0561F)-(0.0561F)), -((0.0026F)-(0.0026F)),-((0.025F)-(0.025F)));
        animator.rotate(cube_r40, -((-0.0611F)-(-0.0611F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r41, -((0.1658F)-(0.1658F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r42, -((0.096F)-(0.096F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r43, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r44, -((0.3142F)-(0.3142F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r45, -((-0.4887F)-(-0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r46, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r47, -((-1.6144F)-(-1.6144F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r48, -((0.9948F)-(0.9948F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r49, -((-0.2967F)-(-0.2967F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((-0.192F)-(-0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r50, -((0.0524F)-(0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r51, -((0.6283F)-(0.6283F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

        animator.rotate(cube_r6, -((0.0561F)-(0.0561F)), -((-0.0026F)-(-0.0026F)),-((-0.025F)-(-0.025F)));

        animator.rotate(cube_r7, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((-0.0698F)-(-0.0698F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.1396F)-(0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.288F)-(0.288F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((-0.1396F)-(-0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((-0.0347F)-(-0.0347F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftarm, -((0.7549F)-(0.48F)), -((0.0F)-(0.0F)),-((-0.1745F)-(-0.1745F)));
        animator.rotate(leftarm2, -((-1.2449F)-(-0.778F)), -((0.4728F)-(0.4728F)),-((-0.1272F)-(-0.1272F)));
        animator.rotate(leftarm3, -((0.6236F)-(0.2294F)), -((0.2241F)-(0.3165F)),-((0.3982F)-(0.1985F)));
        animator.rotate(leftleg, -((0.1091F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg2, -((0.7243F)-(0.7243F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg3, -((-0.7854F)-(-0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg4, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.2967F)-(-0.2967F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((0.3796F)-(0.2793F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, -((0.7069F)-(1.1781F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie3, -((0.7069F)-(1.1781F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightarm, -((0.7549F)-(0.48F)), -((0.0F)-(0.0F)),-((0.1745F)-(0.1745F)));
        animator.rotate(rightarm2, -((-1.2449F)-(-0.778F)), -((-0.4728F)-(-0.4728F)),-((0.1272F)-(0.1272F)));
        animator.rotate(rightarm3, -((0.6236F)-(0.2294F)), -((-0.2241F)-(-0.3165F)),-((-0.3982F)-(-0.1985F)));
        animator.rotate(rightleg, -((0.1091F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg2, -((0.7243F)-(0.7243F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg3, -((-0.7854F)-(-0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg4, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.096F)-(-0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((-0.0175F)-(-0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((0.0087F)-(0.0087F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((-0.0175F)-(-0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((-0.1047F)-(-0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

      


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
