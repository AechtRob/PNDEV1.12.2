package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYinlong;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYinlong extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer quill;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer quill2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer upperbody2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
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
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;

    private ModelAnimator animator;

    public ModelYinlong() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 25.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -15.6F, -0.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 0, -1.5F, -3.0F, -0.75F, 3, 3, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 16, -2.5F, 0.0F, -0.75F, 5, 7, 6, 0.0F, false));

        this.quill = new AdvancedModelRenderer(this);
        this.quill.setRotationPoint(0.0F, -15.6F, -0.25F);
        this.body.addChild(quill);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.quill.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 28, 0.0F, -6.0F, -0.75F, 0, 6, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -14.4533F, 4.3792F);
        this.body.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 38, -0.5F, -2.1467F, 0.4708F, 1, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 9, -2.0F, -0.0872F, -1.5038F, 4, 5, 7, 0.0F, false));

        this.quill2 = new AdvancedModelRenderer(this);
        this.quill2.setRotationPoint(-0.05F, -0.1467F, 0.7458F);
        this.tail2.addChild(quill2);
        this.quill2.cubeList.add(new ModelBox(quill2, 0, 35, 0.0F, -5.0F, -0.25F, 0, 5, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0872F, 4.4962F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 34, -1.5F, 0.0F, 0.0F, 3, 3, 6, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 9, 33, -1.0F, 0.1305F, -0.0086F, 2, 2, 7, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1305F, 6.9914F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 39, 28, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.5F, -10.6565F, -0.5191F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3927F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 29, -1.5F, -2.9435F, -2.7309F, 3, 6, 5, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 2.8221F, -2.4795F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.829F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 26, 43, -1.0F, 0.0056F, -0.1212F, 2, 5, 3, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.25F, 1.125F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.48F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 47, 6, -1.0F, 0.1084F, -0.6345F, 2, 4, 2, -0.01F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 3.6084F, 0.3655F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0436F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 36, 9, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.5F, -10.6565F, -0.5191F);
        this.body.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3927F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 29, -1.5F, -2.9435F, -2.7309F, 3, 6, 5, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 2.8221F, -2.4795F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.829F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 26, 43, -1.0F, 0.0056F, -0.1212F, 2, 5, 3, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.25F, 1.125F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.48F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 47, 6, -1.0F, 0.1084F, -0.6345F, 2, 4, 2, -0.01F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 3.6084F, 0.3655F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0436F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 36, 9, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, true));

        this.upperbody2 = new AdvancedModelRenderer(this);
        this.upperbody2.setRotationPoint(0.0F, -15.6473F, -0.3713F);
        this.body.addChild(upperbody2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.1473F, -3.6287F);
        this.upperbody2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.0F, -3.5F, -4.5F, 6, 8, 8, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.2867F, -8.001F);
        this.upperbody2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.191F, 0.0724F);
        this.upperbody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 25, -2.0F, 0.934F, -0.121F, 4, 6, 2, -0.03F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 21, -2.0F, -0.066F, -6.046F, 4, 7, 6, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.5F, 5.809F, -3.1776F);
        this.upperbody.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.7132F, -0.3751F, 0.3069F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 40, 0, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.25F, 0.25F, 3.5F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.4363F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 16, -0.5F, -0.5F, -1.0F, 1, 3, 2, -0.01F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.5F, 2.5F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 22, 21, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(1.5F, 5.809F, -3.1776F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.7132F, 0.3751F, -0.3069F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 40, 0, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.25F, 0.25F, 3.5F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.4363F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 16, -0.5F, -0.5F, -1.0F, 1, 3, 2, -0.01F, true));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.5F, 2.5F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 22, 21, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 4.809F, -4.4276F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 38, 16, -1.0F, -2.8444F, -3.921F, 3, 5, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -2.8444F, -3.921F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 14, 42, -2.0F, 0.2F, -1.8F, 4, 5, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 47, -2.0F, 0.2F, -3.8F, 4, 3, 2, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 48, 0, -1.0F, 1.2F, -6.8F, 2, 2, 2, -0.0013F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 5, -1.0F, 2.2F, -5.8F, 2, 1, 2, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 40, -0.5F, 2.225F, -7.425F, 1, 1, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.2F, 1.75F, -4.775F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3054F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 16, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.2F, 1.75F, -4.775F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 16, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.675F, -8.15F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.9199F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 11, -0.5F, -0.0262F, -0.9755F, 1, 1, 1, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.95F, -7.475F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.829F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 38, -0.5F, -0.009F, -0.991F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.2F, -6.8F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.829F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 0, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 2.45F, -6.55F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5323F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 25, -0.625F, -0.5F, -0.85F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 2.45F, -6.55F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.5323F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 25, -0.375F, -0.5F, -0.85F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.7F, 2.2F, -3.7F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3447F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 26, -0.3158F, -1.0F, -3.0089F, 1, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.7F, 2.2F, -3.7F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3447F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 38, -0.6842F, -1.0F, -3.0089F, 1, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.75F, 3.0206F, -6.3631F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.9928F, 0.1205F, -0.1823F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.275F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.75F, 3.0206F, -6.3631F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.9928F, -0.1205F, 0.1823F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.275F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.4805F, 1.2817F, -5.7503F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5019F, 0.2922F, 0.2496F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 32, -0.1109F, -0.4849F, -0.2682F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4805F, 1.2817F, -5.7503F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5019F, -0.2922F, -0.2496F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 32, -0.8891F, -0.4849F, -0.2682F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.2093F, 0.1976F, -4.655F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4574F, 0.1974F, 0.1482F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 31, -0.3682F, 0.0525F, -0.9637F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.2093F, 0.1976F, -4.655F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4574F, -0.1974F, -0.1482F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 31, -0.6318F, 0.0525F, -0.9637F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, 0.7627F, -3.5073F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0579F, 0.2589F, 0.1546F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 29, -0.4F, -0.5467F, -1.1242F, 1, 1, 1, -0.01F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 0.7627F, -3.5073F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0579F, -0.2589F, -0.1546F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 29, -0.6F, -0.5467F, -1.1242F, 1, 1, 1, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.2F, -3.775F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2923F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 45, -1.0F, 0.075F, -3.2F, 2, 1, 4, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 2.7F, -4.175F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0873F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 18, -0.175F, -0.2F, -1.15F, 0, 1, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 2.7F, -4.175F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.0873F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 18, 0.175F, -0.2F, -1.15F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 0.6385F, -1.1822F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5269F, 0.1704F, 0.0381F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -1.0F, -1.5F, -0.35F, 2, 2, 2, -0.02F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 0.6385F, -1.1822F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.5269F, -0.1704F, -0.0381F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -1.0F, -1.5F, -0.35F, 2, 2, 2, -0.02F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.3F, -1.8F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.48F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 0, -2.0F, -0.425F, -2.0F, 4, 2, 3, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.2201F, -1.8326F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 35, -2.0F, -0.0201F, -1.9674F, 4, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 31, -1.0F, -0.0201F, -3.5924F, 2, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 49, 15, -1.0F, -0.0201F, -4.9674F, 2, 1, 2, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.7047F, -5.1894F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.9992F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 9, -0.5F, -0.85F, -0.65F, 1, 1, 1, -0.03F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.5799F, -2.1174F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1047F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 36, 45, -2.0F, -0.9805F, 0.0529F, 4, 1, 3, -0.02F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.4799F, -3.1924F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 29, -1.5F, -1.0246F, 0.0825F, 3, 1, 2, 0.02F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.8799F, -1.9674F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2182F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 12, 49, -1.0F, -1.15F, -3.25F, 2, 1, 2, 0.02F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.5F, 0.4799F, -1.8424F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.336F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 18, -0.5F, -0.5F, -2.925F, 1, 1, 3, 0.001F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5F, 0.4799F, -1.8424F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.336F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 18, -0.5F, -0.5F, -2.925F, 1, 1, 3, 0.001F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.9799F, -1.9674F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0873F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 4, 1.0F, -1.3F, -1.125F, 0, 1, 3, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.9799F, -1.9674F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.0873F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 4, -1.0F, -1.3F, -1.125F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.35F, 0.3299F, -0.8674F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0268F, 0.1725F, -0.155F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, 0.3588F, -2.6613F, -2.675F, 0, 3, 4, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.35F, 0.3299F, -0.8674F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0268F, -0.1725F, 0.155F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 0, -0.3588F, -2.6613F, -2.675F, 0, 3, 4, 0.0F, false));


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
        float scaler = 1.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.5323F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, -0.5323F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, -0.3447F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.3447F, 0.0F);
        this.setRotateAngle(cube_r14, -0.9928F, 0.1205F, -0.1823F);
        this.setRotateAngle(cube_r15, -0.9928F, -0.1205F, 0.1823F);
        this.setRotateAngle(cube_r16, 0.5019F, 0.2922F, 0.2496F);
        this.setRotateAngle(cube_r17, 0.5019F, -0.2922F, -0.2496F);
        this.setRotateAngle(cube_r18, 0.4574F, 0.1974F, 0.1482F);
        this.setRotateAngle(cube_r19, 0.4574F, -0.1974F, -0.1482F);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0579F, 0.2589F, 0.1546F);
        this.setRotateAngle(cube_r21, 0.0579F, -0.2589F, -0.1546F);
        this.setRotateAngle(cube_r22, 0.2923F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r25, 0.5269F, 0.1704F, 0.0381F);
        this.setRotateAngle(cube_r26, 0.5269F, -0.1704F, -0.0381F);
        this.setRotateAngle(cube_r27, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.9992F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0F, 0.336F, 0.0F);
        this.setRotateAngle(cube_r33, 0.0F, -0.336F, 0.0F);
        this.setRotateAngle(cube_r34, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r36, -0.0268F, 0.1725F, -0.155F);
        this.setRotateAngle(cube_r37, -0.0268F, -0.1725F, 0.155F);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r7, 1.9199F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm, -1.1495F, 0.3751F, -0.3069F);
        this.setRotateAngle(leftarm2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(leftleg, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg2, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm, -1.0622F, -0.3751F, 0.3069F);
        this.setRotateAngle(rightarm2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(rightleg, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg2, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.2191F, 0.0843F, -0.0226F);
        this.setRotateAngle(tail3, -0.176F, 0.1289F, -0.0229F);
        this.setRotateAngle(tail4, 0.0879F, 0.0859F, 0.0152F);
        this.setRotateAngle(tail5, -0.132F, 0.1298F, -0.0172F);
        this.setRotateAngle(upperbody, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(upperbody2, -0.1309F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.5323F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, -0.5323F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, -0.3447F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.3447F, 0.0F);
        this.setRotateAngle(cube_r14, -0.9928F, 0.1205F, -0.1823F);
        this.setRotateAngle(cube_r15, -0.9928F, -0.1205F, 0.1823F);
        this.setRotateAngle(cube_r16, 0.5019F, 0.2922F, 0.2496F);
        this.setRotateAngle(cube_r17, 0.5019F, -0.2922F, -0.2496F);
        this.setRotateAngle(cube_r18, 0.4574F, 0.1974F, 0.1482F);
        this.setRotateAngle(cube_r19, 0.4574F, -0.1974F, -0.1482F);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0579F, 0.2589F, 0.1546F);
        this.setRotateAngle(cube_r21, 0.0579F, -0.2589F, -0.1546F);
        this.setRotateAngle(cube_r22, 0.2923F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r25, 0.5269F, 0.1704F, 0.0381F);
        this.setRotateAngle(cube_r26, 0.5269F, -0.1704F, -0.0381F);
        this.setRotateAngle(cube_r27, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.9992F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0F, 0.336F, 0.0F);
        this.setRotateAngle(cube_r33, 0.0F, -0.336F, 0.0F);
        this.setRotateAngle(cube_r34, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r36, -0.0268F, 0.1725F, -0.155F);
        this.setRotateAngle(cube_r37, -0.0268F, -0.1725F, 0.155F);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r7, 1.9199F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm, -1.1495F, 0.3751F, -0.3069F);
        this.setRotateAngle(leftarm2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(leftleg, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg2, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm, -1.0622F, -0.3751F, 0.3069F);
        this.setRotateAngle(rightarm2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(rightleg, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg2, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.2191F, 0.0843F, -0.0226F);
        this.setRotateAngle(tail3, -0.176F, 0.1289F, -0.0229F);
        this.setRotateAngle(tail4, 0.0879F, 0.0859F, 0.0152F);
        this.setRotateAngle(tail5, -0.132F, 0.1298F, -0.0172F);
        this.setRotateAngle(upperbody, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(upperbody2, -0.1309F, 0.0F, 0.0F);

        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.054F;
        this.body.render(0.01F);
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

        EntityPrehistoricFloraYinlong EntityYinlong = (EntityPrehistoricFloraYinlong) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityYinlong.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityYinlong.getAnimation() == EntityYinlong.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityYinlong.isReallyInWater()) {

                if (f3 == 0.0F || !EntityYinlong.getIsMoving()) {
                    if (EntityYinlong.getAnimation() != EntityYinlong.EAT_ANIMATION
                        && EntityYinlong.getAnimation() != EntityYinlong.DRINK_ANIMATION) {
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

                if (EntityYinlong.getIsFast()) { //Running


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
        EntityPrehistoricFloraYinlong ee = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

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
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (-30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = -30D + (((tickAnim - 3D) / 17D) * (0D-(-30D)));
            yy = 0D + (((tickAnim - 3D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 17D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 20D + (((tickAnim - 4D) / 9D) * (-5D-(20D)));
            yy = 0D + (((tickAnim - 4D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 13D) / 7D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (1D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 1D + (((tickAnim - 3D) / 5D) * (0D-(1D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
        }
        this.neck.offsetX = (float) Math.toRadians(xx);
        this.neck.offsetY = (float) Math.toRadians(yy);
        this.neck.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20D + (((tickAnim - 13D) / 7D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 1D) / 4D) * (25D-(0D)));
            yy = 0D + (((tickAnim - 1D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25D + (((tickAnim - 5D) / 5D) * (0D-(25D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
        public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (-20D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -20D + (((tickAnim - 20D) / 13D) * (-20D-(-20D)));
            yy = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -20D + (((tickAnim - 33D) / 17D) * (0D-(-20D)));
            yy = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 11D) * (-1.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 11D) * (1D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 11D) / 9D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 11D) / 9D) * (-3.5D-(-1.5D)));
            zz = 1D + (((tickAnim - 11D) / 9D) * (1.5D-(1D)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
            yy = -3.5D + (((tickAnim - 20D) / 13D) * (-3.5D-(-3.5D)));
            zz = 1.5D + (((tickAnim - 20D) / 13D) * (1.5D-(1.5D)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 33D) / 10D) * (0D-(0D)));
            yy = -3.5D + (((tickAnim - 33D) / 10D) * (-1D-(-3.5D)));
            zz = 1.5D + (((tickAnim - 33D) / 10D) * (0.64D-(1.5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 43D) / 7D) * (0D-(-1D)));
            zz = 0.64D + (((tickAnim - 43D) / 7D) * (0D-(0.64D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 0D) / 11D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 20D + (((tickAnim - 11D) / 11D) * (24.33D-(20D)));
            yy = 0D + (((tickAnim - 11D) / 11D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 24.33D + (((tickAnim - 22D) / 1D) * (25D-(24.33D)));
            yy = -2.5D + (((tickAnim - 22D) / 1D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 22D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 25D + (((tickAnim - 23D) / 2D) * (22.69D-(25D)));
            yy = 0D + (((tickAnim - 23D) / 2D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 22.69D + (((tickAnim - 25D) / 2D) * (17.66D-(22.69D)));
            yy = 2.5D + (((tickAnim - 25D) / 2D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 25D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 17.66D + (((tickAnim - 27D) / 1D) * (12.62D-(17.66D)));
            yy = 0D + (((tickAnim - 27D) / 1D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.62D + (((tickAnim - 28D) / 2D) * (7.59D-(12.62D)));
            yy = -2.5D + (((tickAnim - 28D) / 2D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 7.59D + (((tickAnim - 30D) / 2D) * (2.55D-(7.59D)));
            yy = 0D + (((tickAnim - 30D) / 2D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 2.55D + (((tickAnim - 32D) / 1D) * (-2.48D-(2.55D)));
            yy = 2.5D + (((tickAnim - 32D) / 1D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 32D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -2.48D + (((tickAnim - 33D) / 1D) * (-5D-(-2.48D)));
            yy = 0D + (((tickAnim - 33D) / 1D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -5D + (((tickAnim - 34D) / 1D) * (-4.72D-(-5D)));
            yy = -1D + (((tickAnim - 34D) / 1D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 34D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -4.72D + (((tickAnim - 35D) / 1D) * (-4.44D-(-4.72D)));
            yy = 0D + (((tickAnim - 35D) / 1D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = -4.44D + (((tickAnim - 36D) / 1D) * (-4.16D-(-4.44D)));
            yy = 1D + (((tickAnim - 36D) / 1D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 36D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -4.16D + (((tickAnim - 37D) / 1D) * (-3.88D-(-4.16D)));
            yy = 0D + (((tickAnim - 37D) / 1D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -3.88D + (((tickAnim - 38D) / 0D) * (-3.6D-(-3.88D)));
            yy = -1D + (((tickAnim - 38D) / 0D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 38D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -3.6D + (((tickAnim - 38D) / 11D) * (0D-(-3.6D)));
            yy = 0D + (((tickAnim - 38D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 11D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 0D) / 21D) * (-30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 21D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 21D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -30D + (((tickAnim - 21D) / 12D) * (-30D-(-30D)));
            yy = 0D + (((tickAnim - 21D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -30D + (((tickAnim - 33D) / 17D) * (0D-(-30D)));
            yy = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 0D) / 22D) * (30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 22D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 22D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 34) {
            xx = 30D + (((tickAnim - 22D) / 12D) * (30D-(30D)));
            yy = 0D + (((tickAnim - 22D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 30D + (((tickAnim - 34D) / 8D) * (22.5D-(30D)));
            yy = 0D + (((tickAnim - 34D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 22.5D + (((tickAnim - 42D) / 8D) * (0D-(22.5D)));
            yy = 0D + (((tickAnim - 42D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 0D) / 21D) * (-40D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 21D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 21D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -40D + (((tickAnim - 21D) / 12D) * (-40D-(-40D)));
            yy = 0D + (((tickAnim - 21D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -40D + (((tickAnim - 33D) / 6D) * (-26D-(-40D)));
            yy = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -26D + (((tickAnim - 39D) / 11D) * (0D-(-26D)));
            yy = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (60D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 60D + (((tickAnim - 20D) / 13D) * (60D-(60D)));
            yy = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 60D + (((tickAnim - 33D) / 6D) * (40D-(60D)));
            yy = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 40D + (((tickAnim - 39D) / 11D) * (0D-(40D)));
            yy = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 0D) / 21D) * (-30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 21D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 21D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -30D + (((tickAnim - 21D) / 12D) * (-30D-(-30D)));
            yy = 0D + (((tickAnim - 21D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -30D + (((tickAnim - 33D) / 17D) * (0D-(-30D)));
            yy = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 0D) / 22D) * (30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 22D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 22D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 34) {
            xx = 30D + (((tickAnim - 22D) / 12D) * (30D-(30D)));
            yy = 0D + (((tickAnim - 22D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 30D + (((tickAnim - 34D) / 8D) * (22.5D-(30D)));
            yy = 0D + (((tickAnim - 34D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 22.5D + (((tickAnim - 42D) / 8D) * (0D-(22.5D)));
            yy = 0D + (((tickAnim - 42D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 0D) / 21D) * (-40D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 21D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 21D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -40D + (((tickAnim - 21D) / 12D) * (-40D-(-40D)));
            yy = 0D + (((tickAnim - 21D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -40D + (((tickAnim - 33D) / 6D) * (-26D-(-40D)));
            yy = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -26D + (((tickAnim - 39D) / 11D) * (0D-(-26D)));
            yy = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (60D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 60D + (((tickAnim - 20D) / 13D) * (60D-(60D)));
            yy = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 60D + (((tickAnim - 33D) / 6D) * (40D-(60D)));
            yy = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 40D + (((tickAnim - 39D) / 11D) * (0D-(40D)));
            yy = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (15D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 15D + (((tickAnim - 20D) / 8D) * (15D-(15D)));
            yy = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 15D + (((tickAnim - 28D) / 4D) * (20D-(15D)));
            yy = 0D + (((tickAnim - 28D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 20D + (((tickAnim - 32D) / 6D) * (20D-(20D)));
            yy = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 20D + (((tickAnim - 38D) / 2D) * (17D-(20D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 17D + (((tickAnim - 40D) / 3D) * (20D-(17D)));
            yy = 0D + (((tickAnim - 40D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 20D + (((tickAnim - 43D) / 7D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (15D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15D + (((tickAnim - 8D) / 5D) * (20D-(15D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20D + (((tickAnim - 13D) / 7D) * (15D-(20D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 15D + (((tickAnim - 20D) / 13D) * (15D-(15D)));
            yy = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 15D + (((tickAnim - 33D) / 17D) * (0D-(15D)));
            yy = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (-40D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -40D + (((tickAnim - 20D) / 13D) * (-40D-(-40D)));
            yy = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -40D + (((tickAnim - 33D) / 17D) * (0D-(-40D)));
            yy = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -10D + (((tickAnim - 20D) / 8D) * (-12D-(-10D)));
            yy = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -12D + (((tickAnim - 28D) / 5D) * (5D-(-12D)));
            yy = 0D + (((tickAnim - 28D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 5D + (((tickAnim - 33D) / 6D) * (-10D-(5D)));
            yy = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -10D + (((tickAnim - 39D) / 11D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 0D) / 11D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 10D + (((tickAnim - 11D) / 12D) * (15D-(10D)));
            yy = 0D + (((tickAnim - 11D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 15D + (((tickAnim - 23D) / 11D) * (5D-(15D)));
            yy = 0D + (((tickAnim - 23D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 49) {
            xx = 5D + (((tickAnim - 34D) / 15D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 34D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 0D) / 11D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 2D + (((tickAnim - 11D) / 12D) * (2D-(2D)));
            yy = 0D + (((tickAnim - 11D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 2D + (((tickAnim - 23D) / 11D) * (10D-(2D)));
            yy = 0D + (((tickAnim - 23D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 49) {
            xx = 10D + (((tickAnim - 34D) / 15D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 34D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 0D) / 11D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 2D + (((tickAnim - 11D) / 12D) * (2D-(2D)));
            yy = 0D + (((tickAnim - 11D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 2D + (((tickAnim - 23D) / 11D) * (25D-(2D)));
            yy = 0D + (((tickAnim - 23D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 49) {
            xx = 25D + (((tickAnim - 34D) / 15D) * (0D-(25D)));
            yy = 0D + (((tickAnim - 34D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (-30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -30D + (((tickAnim - 20D) / 13D) * (-30D-(-30D)));
            yy = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -30D + (((tickAnim - 33D) / 17D) * (0D-(-30D)));
            yy = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 17D) * (0D-(0D)));
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -10D + (((tickAnim - 20D) / 8D) * (-12D-(-10D)));
            yy = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -12D + (((tickAnim - 28D) / 5D) * (-15D-(-12D)));
            yy = 0D + (((tickAnim - 28D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -15D + (((tickAnim - 33D) / 6D) * (-10D-(-15D)));
            yy = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -10D + (((tickAnim - 39D) / 11D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 39D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

        public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 24D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 24D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 24D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 27D) / 1D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -10D + (((tickAnim - 28D) / 2D) * (30D-(-10D)));
            yy = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 30D + (((tickAnim - 30D) / 3D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -10D + (((tickAnim - 33D) / 2D) * (30D-(-10D)));
            yy = 0D + (((tickAnim - 33D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 30D + (((tickAnim - 35D) / 3D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 35D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -10D + (((tickAnim - 38D) / 2D) * (30D-(-10D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 30D + (((tickAnim - 40D) / 4D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 40D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = -10D + (((tickAnim - 44D) / 2D) * (30D-(-10D)));
            yy = 0D + (((tickAnim - 44D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 30D + (((tickAnim - 46D) / 4D) * (0D-(30D)));
            yy = 0D + (((tickAnim - 46D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 46D) / 4D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 24D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 24D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 24D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 27D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 28D) / 2D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 10D + (((tickAnim - 30D) / 3D) * (-5D-(10D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -5D + (((tickAnim - 33D) / 2D) * (10D-(-5D)));
            yy = 0D + (((tickAnim - 33D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 10D + (((tickAnim - 35D) / 3D) * (-5D-(10D)));
            yy = 0D + (((tickAnim - 35D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 38D) / 2D) * (10D-(-5D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 10D + (((tickAnim - 40D) / 4D) * (-5D-(10D)));
            yy = 0D + (((tickAnim - 40D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = -5D + (((tickAnim - 44D) / 2D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 44D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 46D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 46D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 46D) / 4D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 24D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 24D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 24D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 28D) / 2D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -10D + (((tickAnim - 30D) / 2D) * (10D-(-10D)));
            yy = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 10D + (((tickAnim - 32D) / 3D) * (-10D-(10D)));
            yy = 0D + (((tickAnim - 32D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 32D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -10D + (((tickAnim - 35D) / 2D) * (10D-(-10D)));
            yy = 0D + (((tickAnim - 35D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 10D + (((tickAnim - 37D) / 3D) * (-10D-(10D)));
            yy = 0D + (((tickAnim - 37D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -10D + (((tickAnim - 40D) / 2D) * (10D-(-10D)));
            yy = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 10D + (((tickAnim - 42D) / 3D) * (-10D-(10D)));
            yy = 0D + (((tickAnim - 42D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = -10D + (((tickAnim - 45D) / 2D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 49) {
            xx = 0D + (((tickAnim - 47D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 47D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 47D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 24D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 24D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 24D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 28D) / 1D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 5D + (((tickAnim - 29D) / 2D) * (20D-(5D)));
            yy = 0D + (((tickAnim - 29D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 29D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 20D + (((tickAnim - 31D) / 2D) * (-20D-(20D)));
            yy = 0D + (((tickAnim - 31D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 31D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -20D + (((tickAnim - 33D) / 1D) * (5D-(-20D)));
            yy = 0D + (((tickAnim - 33D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 5D + (((tickAnim - 34D) / 2D) * (20D-(5D)));
            yy = 0D + (((tickAnim - 34D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 20D + (((tickAnim - 36D) / 2D) * (-20D-(20D)));
            yy = 0D + (((tickAnim - 36D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 36D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -20D + (((tickAnim - 38D) / 1D) * (5D-(-20D)));
            yy = 0D + (((tickAnim - 38D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 5D + (((tickAnim - 39D) / 2D) * (20D-(5D)));
            yy = 0D + (((tickAnim - 39D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 39D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 20D + (((tickAnim - 41D) / 2D) * (-20D-(20D)));
            yy = 0D + (((tickAnim - 41D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 41D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = -20D + (((tickAnim - 43D) / 1D) * (0D-(-20D)));
            yy = 0D + (((tickAnim - 43D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = 0D + (((tickAnim - 44D) / 2D) * (-20D-(0D)));
            yy = 0D + (((tickAnim - 44D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -20D + (((tickAnim - 46D) / 2D) * (0D-(-20D)));
            yy = 0D + (((tickAnim - 46D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 46D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -10D + (((tickAnim - 4D) / 2D) * (30D-(-10D)));
            yy = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 30D + (((tickAnim - 6D) / 3D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 6D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -10D + (((tickAnim - 9D) / 2D) * (30D-(-10D)));
            yy = 0D + (((tickAnim - 9D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 30D + (((tickAnim - 11D) / 3D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -10D + (((tickAnim - 14D) / 2D) * (30D-(-10D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 30D + (((tickAnim - 16D) / 4D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -10D + (((tickAnim - 20D) / 2D) * (30D-(-10D)));
            yy = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 30D + (((tickAnim - 22D) / 4D) * (0D-(30D)));
            yy = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 10D + (((tickAnim - 6D) / 3D) * (-5D-(10D)));
            yy = 0D + (((tickAnim - 6D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -5D + (((tickAnim - 9D) / 2D) * (10D-(-5D)));
            yy = 0D + (((tickAnim - 9D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 10D + (((tickAnim - 11D) / 3D) * (-5D-(10D)));
            yy = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -5D + (((tickAnim - 14D) / 2D) * (10D-(-5D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 16D) / 4D) * (-5D-(10D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -5D + (((tickAnim - 20D) / 2D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -10D + (((tickAnim - 6D) / 2D) * (10D-(-10D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 10D + (((tickAnim - 8D) / 3D) * (-10D-(10D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 11D) / 2D) * (10D-(-10D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 10D + (((tickAnim - 13D) / 3D) * (-10D-(10D)));
            yy = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 16D) / 2D) * (10D-(-10D)));
            yy = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 10D + (((tickAnim - 18D) / 3D) * (-10D-(10D)));
            yy = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -10D + (((tickAnim - 21D) / 2D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 23D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 5D + (((tickAnim - 5D) / 2D) * (20D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 20D + (((tickAnim - 7D) / 1D) * (-20D-(20D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20D + (((tickAnim - 8D) / 2D) * (5D-(-20D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 5D + (((tickAnim - 10D) / 2D) * (20D-(5D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 20D + (((tickAnim - 12D) / 1D) * (-20D-(20D)));
            yy = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -20D + (((tickAnim - 13D) / 2D) * (5D-(-20D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 5D + (((tickAnim - 15D) / 2D) * (20D-(5D)));
            yy = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 20D + (((tickAnim - 17D) / 1D) * (-20D-(20D)));
            yy = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20D + (((tickAnim - 18D) / 2D) * (0D-(-20D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 20D) / 2D) * (-20D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -20D + (((tickAnim - 22D) / 1D) * (0D-(-20D)));
            yy = 0D + (((tickAnim - 22D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


    }
        public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 10D + (((tickAnim - 10D) / 4D) * (10D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 10D + (((tickAnim - 14D) / 16D) * (10D-(10D)));
            yy = 0D + (((tickAnim - 14D) / 16D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 16D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10D + (((tickAnim - 30D) / 10D) * (10D-(10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 56) {
            xx = 10D + (((tickAnim - 40D) / 16D) * (10D-(10D)));
            yy = 0D + (((tickAnim - 40D) / 16D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 16D) * (0D-(0D)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = 10D + (((tickAnim - 56D) / 14D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 56D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 56D) / 14D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 10D) / 4D) * (15D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 15D + (((tickAnim - 14D) / 13D) * (5D-(15D)));
            yy = 0D + (((tickAnim - 14D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 5D + (((tickAnim - 27D) / 3D) * (15D-(5D)));
            yy = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15D + (((tickAnim - 30D) / 10D) * (15D-(15D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 15D + (((tickAnim - 40D) / 13D) * (5D-(15D)));
            yy = 0D + (((tickAnim - 40D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 5D + (((tickAnim - 53D) / 3D) * (15D-(5D)));
            yy = 0D + (((tickAnim - 53D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 53D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = 15D + (((tickAnim - 56D) / 14D) * (0D-(15D)));
            yy = 0D + (((tickAnim - 56D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 56D) / 14D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 20D + (((tickAnim - 8D) / 6D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 8D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 14D) / 4D) * (25D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (-10D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 25D + (((tickAnim - 18D) / 6D) * (25D-(25D)));
            yy = -10D + (((tickAnim - 18D) / 6D) * (-10D-(-10D)));
            zz = 0D + (((tickAnim - 18D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 25D + (((tickAnim - 24D) / 3D) * (35D-(25D)));
            yy = -10D + (((tickAnim - 24D) / 3D) * (-10D-(-10D)));
            zz = 0D + (((tickAnim - 24D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 35D + (((tickAnim - 27D) / 2D) * (25D-(35D)));
            yy = -10D + (((tickAnim - 27D) / 2D) * (-10D-(-10D)));
            zz = 0D + (((tickAnim - 27D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 25D + (((tickAnim - 29D) / 3D) * (25D-(25D)));
            yy = -10D + (((tickAnim - 29D) / 3D) * (-10D-(-10D)));
            zz = 0D + (((tickAnim - 29D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 25D + (((tickAnim - 32D) / 8D) * (0D-(25D)));
            yy = -10D + (((tickAnim - 32D) / 8D) * (0D-(-10D)));
            zz = 0D + (((tickAnim - 32D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 40D) / 4D) * (25D-(0D)));
            yy = 0D + (((tickAnim - 40D) / 4D) * (10D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 25D + (((tickAnim - 44D) / 6D) * (25D-(25D)));
            yy = 10D + (((tickAnim - 44D) / 6D) * (10D-(10D)));
            zz = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 25D + (((tickAnim - 50D) / 3D) * (35D-(25D)));
            yy = 10D + (((tickAnim - 50D) / 3D) * (10D-(10D)));
            zz = 0D + (((tickAnim - 50D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 35D + (((tickAnim - 53D) / 2D) * (25D-(35D)));
            yy = 10D + (((tickAnim - 53D) / 2D) * (10D-(10D)));
            zz = 0D + (((tickAnim - 53D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 25D + (((tickAnim - 55D) / 3D) * (25D-(25D)));
            yy = 10D + (((tickAnim - 55D) / 3D) * (10D-(10D)));
            zz = 0D + (((tickAnim - 55D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 25D + (((tickAnim - 58D) / 12D) * (0D-(25D)));
            yy = 10D + (((tickAnim - 58D) / 12D) * (0D-(10D)));
            zz = 0D + (((tickAnim - 58D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 20D + (((tickAnim - 7D) / 13D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 3D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 23D) / 2D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 23D) / 2D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 23D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 25D) / 2D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 2D) * (-3.33D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 10D + (((tickAnim - 27D) / 1D) * (0D-(10D)));
            yy = -3.33D + (((tickAnim - 27D) / 1D) * (-5D-(-3.33D)));
            zz = 0D + (((tickAnim - 27D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
            yy = -5D + (((tickAnim - 28D) / 2D) * (0D-(-5D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 46) {
            xx = 0D + (((tickAnim - 30D) / 16D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 16D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 16D) * (0D-(0D)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 46D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 46D) / 2D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 46D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0D + (((tickAnim - 48D) / 3D) * (0D-(0D)));
            yy = -5D + (((tickAnim - 48D) / 3D) * (0D-(-5D)));
            zz = 0D + (((tickAnim - 48D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 51D) / 2D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 51D) / 2D) * (3.33D-(0D)));
            zz = 0D + (((tickAnim - 51D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 53) {
            xx = 10D + (((tickAnim - 53D) / 0D) * (0D-(10D)));
            yy = 3.33D + (((tickAnim - 53D) / 0D) * (5D-(3.33D)));
            zz = 0D + (((tickAnim - 53D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 0D + (((tickAnim - 53D) / 3D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 53D) / 3D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 53D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 0D + (((tickAnim - 56D) / 5D) * (25D-(0D)));
            yy = 0D + (((tickAnim - 56D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 56D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 61 && tickAnim < 65) {
            xx = 25D + (((tickAnim - 61D) / 4D) * (0D-(25D)));
            yy = 0D + (((tickAnim - 61D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 61D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0D + (((tickAnim - 65D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 65D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 65D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 20D + (((tickAnim - 20D) / 3D) * (20D-(20D)));
            yy = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 20D + (((tickAnim - 23D) / 2D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 23D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0D + (((tickAnim - 28D) / 3D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 28D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 20D + (((tickAnim - 31D) / 2D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 31D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 31D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 0D + (((tickAnim - 33D) / 13D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 33D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 20D + (((tickAnim - 46D) / 3D) * (20D-(20D)));
            yy = 0D + (((tickAnim - 46D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 46D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 20D + (((tickAnim - 49D) / 2D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 49D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 49D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 51D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 51D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 51D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0D + (((tickAnim - 53D) / 4D) * (20D-(0D)));
            yy = 0D + (((tickAnim - 53D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 53D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 20D + (((tickAnim - 57D) / 2D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 57D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 57D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 0D + (((tickAnim - 59D) / 11D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 59D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 59D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = -2D + (((tickAnim - 0D) / 5D) * (1.5D-(-2D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 1.5D + (((tickAnim - 5D) / 5D) * (-2D-(1.5D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = -0.2D + (((tickAnim - 0D) / 2D) * (-0.2D-(-0.2D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = -0.2D + (((tickAnim - 2D) / 1D) * (0.5D-(-0.2D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 3D) / 1D) * (0.2D-(0.5D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            yy = 0.2D + (((tickAnim - 4D) / 1D) * (0D-(0.2D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (-0.2D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            yy = -0.2D + (((tickAnim - 7D) / 1D) * (0.5D-(-0.2D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 8D) / 1D) * (0.2D-(0.5D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            yy = 0.2D + (((tickAnim - 9D) / 1D) * (-0.2D-(0.2D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.5D + (((tickAnim - 0D) / 3D) * (-18.24974D-(37.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (14.32357D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-2.56449D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.24974D + (((tickAnim - 3D) / 2D) * (-7.12507D-(-18.24974D)));
            yy = 14.32357D + (((tickAnim - 3D) / 2D) * (11.15065D-(14.32357D)));
            zz = -2.56449D + (((tickAnim - 3D) / 2D) * (-0.64325D-(-2.56449D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.12507D + (((tickAnim - 5D) / 5D) * (37.5D-(-7.12507D)));
            yy = 11.15065D + (((tickAnim - 5D) / 5D) * (0D-(11.15065D)));
            zz = -0.64325D + (((tickAnim - 5D) / 5D) * (0D-(-0.64325D)));
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10D + (((tickAnim - 0D) / 3D) * (40D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 40D + (((tickAnim - 3D) / 2D) * (-42.5D-(40D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -42.5D + (((tickAnim - 5D) / 1D) * (-16.67D-(-42.5D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16.67D + (((tickAnim - 6D) / 2D) * (7.5D-(-16.67D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 7.5D + (((tickAnim - 8D) / 0D) * (27.49173D-(7.5D)));
            yy = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 27.49173D + (((tickAnim - 8D) / 2D) * (10D-(27.49173D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5D + (((tickAnim - 0D) / 3D) * (-90D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -90D + (((tickAnim - 3D) / 2D) * (5D-(-90D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 5D + (((tickAnim - 5D) / 1D) * (-29.17D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -29.17D + (((tickAnim - 6D) / 2D) * (0D-(-29.17D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 117.5D + (((tickAnim - 0D) / 3D) * (162.5D-(117.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 162.5D + (((tickAnim - 3D) / 1D) * (60D-(162.5D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 60D + (((tickAnim - 4D) / 1D) * (42.5D-(60D)));
            yy = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 42.5D + (((tickAnim - 5D) / 1D) * (49.17D-(42.5D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 49.17D + (((tickAnim - 6D) / 2D) * (-10D-(49.17D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10D + (((tickAnim - 8D) / 2D) * (117.5D-(-10D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.12507D + (((tickAnim - 0D) / 5D) * (37.5D-(-7.12507D)));
            yy = -11.15065D + (((tickAnim - 0D) / 5D) * (0D-(-11.15065D)));
            zz = 0.64325D + (((tickAnim - 0D) / 5D) * (0D-(0.64325D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 37.5D + (((tickAnim - 5D) / 3D) * (-18.24974D-(37.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (-14.32357D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (2.56449D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.24974D + (((tickAnim - 8D) / 2D) * (-7.12507D-(-18.24974D)));
            yy = -14.32357D + (((tickAnim - 8D) / 2D) * (-11.15065D-(-14.32357D)));
            zz = 2.56449D + (((tickAnim - 8D) / 2D) * (0.64325D-(2.56449D)));
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42.5D + (((tickAnim - 0D) / 1D) * (-16.67D-(-42.5D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -16.67D + (((tickAnim - 1D) / 2D) * (7.5D-(-16.67D)));
            yy = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 7.5D + (((tickAnim - 3D) / 0D) * (27.49173D-(7.5D)));
            yy = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.49173D + (((tickAnim - 3D) / 2D) * (10D-(27.49173D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10D + (((tickAnim - 5D) / 3D) * (40D-(10D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40D + (((tickAnim - 8D) / 2D) * (-42.5D-(40D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 5D + (((tickAnim - 0D) / 1D) * (-29.17D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -29.17D + (((tickAnim - 1D) / 2D) * (0D-(-29.17D)));
            yy = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5D + (((tickAnim - 5D) / 3D) * (-90D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -90D + (((tickAnim - 8D) / 2D) * (5D-(-90D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 42.5D + (((tickAnim - 0D) / 1D) * (49.17D-(42.5D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 49.17D + (((tickAnim - 1D) / 2D) * (-10D-(49.17D)));
            yy = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10D + (((tickAnim - 3D) / 2D) * (117.5D-(-10D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 117.5D + (((tickAnim - 5D) / 3D) * (162.5D-(117.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 162.5D + (((tickAnim - 8D) / 1D) * (60D-(162.5D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 60D + (((tickAnim - 9D) / 1D) * (42.5D-(60D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2D + (((tickAnim - 3D) / 2D) * (0D-(2D)));
            yy = -2D + (((tickAnim - 3D) / 2D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2D + (((tickAnim - 8D) / 2D) * (0D-(2D)));
            yy = 2D + (((tickAnim - 8D) / 2D) * (0D-(2D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2D + (((tickAnim - 3D) / 2D) * (0D-(2D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2D + (((tickAnim - 8D) / 2D) * (0D-(2D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5D + (((tickAnim - 0D) / 4D) * (-11D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -11D + (((tickAnim - 4D) / 1D) * (-5D-(-11D)));
            yy = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5D + (((tickAnim - 5D) / 2D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5D + (((tickAnim - 0D) / 5D) * (-9.77D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -9.77D + (((tickAnim - 5D) / 1D) * (-11D-(-9.77D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -11D + (((tickAnim - 6D) / 1D) * (-5D-(-11D)));
            yy = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -5D + (((tickAnim - 7D) / 1D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5D + (((tickAnim - 0D) / 3D) * (-11D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -11D + (((tickAnim - 3D) / 0D) * (-10D-(-11D)));
            yy = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -10D + (((tickAnim - 3D) / 1D) * (-5D-(-10D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5D + (((tickAnim - 4D) / 1D) * (-1.25D-(-5D)));
            yy = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -1.25D + (((tickAnim - 5D) / 1D) * (0D-(-1.25D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 6D) / 4D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5D + (((tickAnim - 0D) / 2D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 2D) / 3D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 2D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 5D + (((tickAnim - 5D) / 4D) * (-11D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -11D + (((tickAnim - 9D) / 1D) * (-10D-(-11D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -9.77D + (((tickAnim - 0D) / 1D) * (-11D-(-9.77D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -11D + (((tickAnim - 1D) / 1D) * (-5D-(-11D)));
            yy = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -5D + (((tickAnim - 2D) / 1D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5D + (((tickAnim - 5D) / 5D) * (-9.77D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.25D + (((tickAnim - 0D) / 1D) * (0D-(-1.25D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 1D) / 4D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 1D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5D + (((tickAnim - 5D) / 3D) * (-11D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -11D + (((tickAnim - 8D) / 1D) * (-5D-(-11D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -5D + (((tickAnim - 9D) / 1D) * (-1.25D-(-5D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6D + (((tickAnim - 0D) / 3D) * (-4D-(-6D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4D + (((tickAnim - 3D) / 2D) * (-6D-(-4D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6D + (((tickAnim - 5D) / 3D) * (-4D-(-6D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4D + (((tickAnim - 8D) / 2D) * (-6D-(-4D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10D + (((tickAnim - 0D) / 3D) * (4D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4D + (((tickAnim - 3D) / 2D) * (10D-(4D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10D + (((tickAnim - 5D) / 3D) * (4D-(10D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4D + (((tickAnim - 8D) / 2D) * (10D-(4D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2D + (((tickAnim - 3D) / 2D) * (0D-(2D)));
            yy = -2D + (((tickAnim - 3D) / 2D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2D + (((tickAnim - 8D) / 2D) * (0D-(2D)));
            yy = 2D + (((tickAnim - 8D) / 2D) * (0D-(2D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.67D + (((tickAnim - 0D) / 1D) * (0D-(0.67D)));
            yy = 0.67D + (((tickAnim - 0D) / 1D) * (0D-(0.67D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 1D) / 2D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 1D) / 2D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2D + (((tickAnim - 3D) / 3D) * (0D-(2D)));
            yy = -2D + (((tickAnim - 3D) / 3D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 3D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2D + (((tickAnim - 8D) / 2D) * (0.67D-(2D)));
            yy = 2D + (((tickAnim - 8D) / 2D) * (0.67D-(2D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2D + (((tickAnim - 0D) / 3D) * (-2D-(2D)));
            yy = 2D + (((tickAnim - 0D) / 3D) * (0D-(2D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2D + (((tickAnim - 3D) / 2D) * (2D-(-2D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2D + (((tickAnim - 5D) / 3D) * (-2D-(2D)));
            yy = -2D + (((tickAnim - 5D) / 3D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2D + (((tickAnim - 8D) / 2D) * (2D-(-2D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (-4D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4D + (((tickAnim - 3D) / 2D) * (0D-(-4D)));
            yy = -2D + (((tickAnim - 3D) / 2D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (-8D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8D + (((tickAnim - 8D) / 2D) * (0D-(-8D)));
            yy = 2D + (((tickAnim - 8D) / 2D) * (0D-(2D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1D + (((tickAnim - 0D) / 3D) * (-1D-(1D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1D + (((tickAnim - 3D) / 2D) * (1D-(-1D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1D + (((tickAnim - 5D) / 3D) * (-1D-(1D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1D + (((tickAnim - 8D) / 2D) * (1D-(-1D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(quill, quill.rotateAngleX + (float) Math.toRadians(xx), quill.rotateAngleY + (float) Math.toRadians(yy), quill.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2D + (((tickAnim - 0D) / 3D) * (-2D-(2D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2D + (((tickAnim - 3D) / 2D) * (2D-(-2D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2D + (((tickAnim - 5D) / 3D) * (-2D-(2D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2D + (((tickAnim - 8D) / 2D) * (2D-(-2D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(quill2, quill2.rotateAngleX + (float) Math.toRadians(xx), quill2.rotateAngleY + (float) Math.toRadians(yy), quill2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = -2D + (((tickAnim - 0D) / 10D) * (2D-(-2D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 2D + (((tickAnim - 10D) / 10D) * (-2D-(2D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 0D) / 3D) * (-0.2D-(-1D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 3D) / 3D) * (0D-(0D)));
            yy = -0.2D + (((tickAnim - 3D) / 3D) * (0.5D-(-0.2D)));
            zz = 0D + (((tickAnim - 3D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 6D) / 2D) * (0.2D-(0.5D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = 0.2D + (((tickAnim - 8D) / 2D) * (-1D-(0.2D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 10D) / 3D) * (-0.2D-(-1D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
            yy = -0.2D + (((tickAnim - 13D) / 3D) * (0.5D-(-0.2D)));
            zz = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 16D) / 2D) * (0.2D-(0.5D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0.2D + (((tickAnim - 18D) / 2D) * (-1D-(0.2D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30D + (((tickAnim - 0D) / 3D) * (15.83D-(30D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 15.83D + (((tickAnim - 3D) / 4D) * (-15.23749D-(15.83D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (14.4352D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (-1.81626D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.23749D + (((tickAnim - 7D) / 3D) * (-18.21181D-(-15.23749D)));
            yy = 14.4352D + (((tickAnim - 7D) / 3D) * (10.76174D-(14.4352D)));
            zz = -1.81626D + (((tickAnim - 7D) / 3D) * (-2.03659D-(-1.81626D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.21181D + (((tickAnim - 10D) / 10D) * (30D-(-18.21181D)));
            yy = 10.76174D + (((tickAnim - 10D) / 10D) * (0D-(10.76174D)));
            zz = -2.03659D + (((tickAnim - 10D) / 10D) * (0D-(-2.03659D)));
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5D + (((tickAnim - 0D) / 3D) * (43.33D-(17.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 10D + (((tickAnim - 0D) / 3D) * (0D-(10D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 43.33D + (((tickAnim - 3D) / 4D) * (19.17D-(43.33D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (-5D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 19.17D + (((tickAnim - 7D) / 3D) * (-32.5D-(19.17D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 7D) / 3D) * (-10D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -32.5D + (((tickAnim - 10D) / 3D) * (-5D-(-32.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = -10D + (((tickAnim - 10D) / 3D) * (0D-(-10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5D + (((tickAnim - 13D) / 2D) * (-2.5D-(-5D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 15D) / 5D) * (17.5D-(-2.5D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (10D-(0D)));
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5D + (((tickAnim - 0D) / 3D) * (-72.5D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -72.5D + (((tickAnim - 3D) / 4D) * (-78.75D-(-72.5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -78.75D + (((tickAnim - 7D) / 3D) * (20D-(-78.75D)));
            yy = -5D + (((tickAnim - 7D) / 3D) * (-5D-(-5D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20D + (((tickAnim - 10D) / 3D) * (-13.75D-(20D)));
            yy = -5D + (((tickAnim - 10D) / 3D) * (-5D-(-5D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -13.75D + (((tickAnim - 13D) / 2D) * (7.5D-(-13.75D)));
            yy = -5D + (((tickAnim - 13D) / 2D) * (0D-(-5D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.5D + (((tickAnim - 15D) / 5D) * (5D-(7.5D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5D + (((tickAnim - 0D) / 3D) * (150.83D-(7.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 150.83D + (((tickAnim - 3D) / 4D) * (135.42D-(150.83D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 135.42D + (((tickAnim - 7D) / 1D) * (62.46D-(135.42D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 62.46D + (((tickAnim - 8D) / 2D) * (29.40191D-(62.46D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (-2.64718D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (4.24326D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.40191D + (((tickAnim - 10D) / 3D) * (26.32596D-(29.40191D)));
            yy = -2.64718D + (((tickAnim - 10D) / 3D) * (-1.32359D-(-2.64718D)));
            zz = 4.24326D + (((tickAnim - 10D) / 3D) * (2.12163D-(4.24326D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 26.32596D + (((tickAnim - 13D) / 2D) * (-6.75D-(26.32596D)));
            yy = -1.32359D + (((tickAnim - 13D) / 2D) * (0D-(-1.32359D)));
            zz = 2.12163D + (((tickAnim - 13D) / 2D) * (0D-(2.12163D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -6.75D + (((tickAnim - 15D) / 3D) * (-14.62D-(-6.75D)));
            yy = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -14.62D + (((tickAnim - 18D) / 2D) * (7.5D-(-14.62D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -18.21181D + (((tickAnim - 0D) / 10D) * (30D-(-18.21181D)));
            yy = -10.7617D + (((tickAnim - 0D) / 10D) * (0D-(-10.7617D)));
            zz = 2.0366D + (((tickAnim - 0D) / 10D) * (0D-(2.0366D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30D + (((tickAnim - 10D) / 3D) * (15.83D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 15.83D + (((tickAnim - 13D) / 4D) * (-15.23749D-(15.83D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (-14.4352D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (1.8163D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.23749D + (((tickAnim - 17D) / 3D) * (-18.21181D-(-15.23749D)));
            yy = -14.4352D + (((tickAnim - 17D) / 3D) * (-10.7617D-(-14.4352D)));
            zz = 1.8163D + (((tickAnim - 17D) / 3D) * (2.0366D-(1.8163D)));
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.5D + (((tickAnim - 0D) / 3D) * (-5D-(-32.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 10D + (((tickAnim - 0D) / 3D) * (0D-(10D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5D + (((tickAnim - 3D) / 2D) * (-2.5D-(-5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 5D) / 5D) * (17.5D-(-2.5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (-10D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5D + (((tickAnim - 10D) / 3D) * (43.33D-(17.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = -10D + (((tickAnim - 10D) / 3D) * (0D-(-10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 43.33D + (((tickAnim - 13D) / 4D) * (19.17D-(43.33D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (5D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.17D + (((tickAnim - 17D) / 3D) * (-32.5D-(19.17D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 17D) / 3D) * (10D-(5D)));
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20D + (((tickAnim - 0D) / 3D) * (-13.75D-(20D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.75D + (((tickAnim - 3D) / 2D) * (7.5D-(-13.75D)));
            yy = 5D + (((tickAnim - 3D) / 2D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.5D + (((tickAnim - 5D) / 5D) * (5D-(7.5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5D + (((tickAnim - 10D) / 3D) * (-72.5D-(5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -72.5D + (((tickAnim - 13D) / 4D) * (-78.75D-(-72.5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -78.75D + (((tickAnim - 17D) / 3D) * (20D-(-78.75D)));
            yy = 5D + (((tickAnim - 17D) / 3D) * (5D-(5D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.40191D + (((tickAnim - 0D) / 3D) * (26.32596D-(29.40191D)));
            yy = 2.6472D + (((tickAnim - 0D) / 3D) * (1.3236D-(2.6472D)));
            zz = -4.2433D + (((tickAnim - 0D) / 3D) * (-2.1216D-(-4.2433D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.32596D + (((tickAnim - 3D) / 2D) * (-6.75D-(26.32596D)));
            yy = 1.3236D + (((tickAnim - 3D) / 2D) * (0D-(1.3236D)));
            zz = -2.1216D + (((tickAnim - 3D) / 2D) * (0D-(-2.1216D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.75D + (((tickAnim - 5D) / 3D) * (-14.62D-(-6.75D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -14.62D + (((tickAnim - 8D) / 2D) * (7.5D-(-14.62D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.5D + (((tickAnim - 10D) / 3D) * (150.83D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 150.83D + (((tickAnim - 13D) / 4D) * (135.42D-(150.83D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 135.42D + (((tickAnim - 17D) / 1D) * (62.46D-(135.42D)));
            yy = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 62.46D + (((tickAnim - 18D) / 2D) * (29.40191D-(62.46D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (2.6472D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (-4.2433D-(0D)));
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2D + (((tickAnim - 5D) / 5D) * (0D-(2D)));
            yy = -2D + (((tickAnim - 5D) / 5D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2D + (((tickAnim - 15D) / 5D) * (0D-(2D)));
            yy = 2D + (((tickAnim - 15D) / 5D) * (0D-(2D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 2D + (((tickAnim - 6D) / 4D) * (0D-(2D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 10D) / 6D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2D + (((tickAnim - 16D) / 4D) * (0D-(2D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2D + (((tickAnim - 0D) / 8D) * (-7D-(2D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -7D + (((tickAnim - 8D) / 1D) * (-6D-(-7D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -6D + (((tickAnim - 9D) / 1D) * (-2D-(-6D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2D + (((tickAnim - 10D) / 3D) * (0D-(-2D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 13D) / 7D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2D + (((tickAnim - 0D) / 10D) * (-4D-(2D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -4D + (((tickAnim - 10D) / 1D) * (-6D-(-4D)));
            yy = 0D + (((tickAnim - 10D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -6D + (((tickAnim - 11D) / 2D) * (-5D-(-6D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -5D + (((tickAnim - 13D) / 0D) * (-2D-(-5D)));
            yy = 0D + (((tickAnim - 13D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -2D + (((tickAnim - 13D) / 4D) * (0D-(-2D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5D + (((tickAnim - 0D) / 5D) * (-11D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -11D + (((tickAnim - 5D) / 2D) * (-10D-(-11D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -10D + (((tickAnim - 7D) / 1D) * (-5D-(-10D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5D + (((tickAnim - 8D) / 2D) * (-1.25D-(-5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -1.25D + (((tickAnim - 10D) / 1D) * (0D-(-1.25D)));
            yy = 0D + (((tickAnim - 10D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 11D) / 9D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 9D) * (0D-(0D)));
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2D + (((tickAnim - 0D) / 3D) * (0D-(-2D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 3D) / 7D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 2D + (((tickAnim - 10D) / 8D) * (-7D-(2D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -7D + (((tickAnim - 18D) / 1D) * (-6D-(-7D)));
            yy = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -6D + (((tickAnim - 19D) / 1D) * (-2D-(-6D)));
            yy = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -4D + (((tickAnim - 0D) / 1D) * (-6D-(-4D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -6D + (((tickAnim - 1D) / 2D) * (-5D-(-6D)));
            yy = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -5D + (((tickAnim - 3D) / 0D) * (-2D-(-5D)));
            yy = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2D + (((tickAnim - 3D) / 4D) * (0D-(-2D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2D + (((tickAnim - 10D) / 10D) * (-4D-(2D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.25D + (((tickAnim - 0D) / 1D) * (0D-(-1.25D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 1D) / 9D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 1D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5D + (((tickAnim - 10D) / 5D) * (-11D-(5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -11D + (((tickAnim - 15D) / 2D) * (-10D-(-11D)));
            yy = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 17D) / 1D) * (-5D-(-10D)));
            yy = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 18D) / 2D) * (-1.25D-(-5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -6D + (((tickAnim - 0D) / 6D) * (-4D-(-6D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -4D + (((tickAnim - 6D) / 4D) * (-6D-(-4D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -6D + (((tickAnim - 10D) / 6D) * (-4D-(-6D)));
            yy = 0D + (((tickAnim - 10D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4D + (((tickAnim - 16D) / 4D) * (-6D-(-4D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10D + (((tickAnim - 0D) / 6D) * (4D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 4D + (((tickAnim - 6D) / 4D) * (10D-(4D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 10D + (((tickAnim - 10D) / 6D) * (4D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 4D + (((tickAnim - 16D) / 4D) * (10D-(4D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2D + (((tickAnim - 5D) / 5D) * (0D-(2D)));
            yy = -2D + (((tickAnim - 5D) / 5D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2D + (((tickAnim - 15D) / 5D) * (0D-(2D)));
            yy = 2D + (((tickAnim - 15D) / 5D) * (0D-(2D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.67D + (((tickAnim - 0D) / 3D) * (0D-(0.67D)));
            yy = 0.67D + (((tickAnim - 0D) / 3D) * (0D-(0.67D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 2D + (((tickAnim - 7D) / 5D) * (0D-(2D)));
            yy = -2D + (((tickAnim - 7D) / 5D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 12D) / 5D) * (2D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 5D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 2D + (((tickAnim - 17D) / 3D) * (0.67D-(2D)));
            yy = 2D + (((tickAnim - 17D) / 3D) * (0.67D-(2D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2D + (((tickAnim - 0D) / 5D) * (-2D-(2D)));
            yy = 2D + (((tickAnim - 0D) / 5D) * (0D-(2D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2D + (((tickAnim - 5D) / 5D) * (2D-(-2D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2D + (((tickAnim - 10D) / 5D) * (-2D-(2D)));
            yy = -2D + (((tickAnim - 10D) / 5D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2D + (((tickAnim - 15D) / 5D) * (2D-(-2D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (-4D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4D + (((tickAnim - 5D) / 5D) * (0D-(-4D)));
            yy = -2D + (((tickAnim - 5D) / 5D) * (0D-(-2D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (-8D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (2D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -8D + (((tickAnim - 15D) / 5D) * (0D-(-8D)));
            yy = 2D + (((tickAnim - 15D) / 5D) * (0D-(2D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1D + (((tickAnim - 0D) / 5D) * (-1D-(1D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1D + (((tickAnim - 5D) / 5D) * (1D-(-1D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1D + (((tickAnim - 10D) / 5D) * (-1D-(1D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1D + (((tickAnim - 15D) / 5D) * (1D-(-1D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(quill, quill.rotateAngleX + (float) Math.toRadians(xx), quill.rotateAngleY + (float) Math.toRadians(yy), quill.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2D + (((tickAnim - 0D) / 5D) * (-2D-(2D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2D + (((tickAnim - 5D) / 5D) * (2D-(-2D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2D + (((tickAnim - 10D) / 5D) * (-2D-(2D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2D + (((tickAnim - 15D) / 5D) * (2D-(-2D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(quill2, quill2.rotateAngleX + (float) Math.toRadians(xx), quill2.rotateAngleY + (float) Math.toRadians(yy), quill2.rotateAngleZ + (float) Math.toRadians(zz));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraYinlong e = (EntityPrehistoricFloraYinlong) entity;
        animator.update(entity);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

    }
}
