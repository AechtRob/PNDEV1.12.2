package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLusovenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLusovenator extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer HEADPART;
    private final AdvancedModelRenderer HEADPART2;
    private final AdvancedModelRenderer HEADPART3;
    private final AdvancedModelRenderer HEADPART5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer HEADPART6;
    private final AdvancedModelRenderer HEADPART7;
    private final AdvancedModelRenderer HEADPART8;
    private final AdvancedModelRenderer HEADPART4;
    private final AdvancedModelRenderer HEADPART9;
    private final AdvancedModelRenderer HEADPART10;
    private final AdvancedModelRenderer HEADPART12;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer JAWPART;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer throatpouch;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer righttoes;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer lefttoes;

    private ModelAnimator animator;

    public ModelLusovenator() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -5.5F, 2.0F);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 35, -4.0F, -6.1F, -3.75F, 8, 13, 13, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.5F, 9.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 57, 0, -3.0F, -3.35F, -1.75F, 6, 9, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 10.25F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 63, 58, -2.5F, -2.85F, -1.0F, 5, 6, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 62, -2.0F, -2.85F, -1.0F, 4, 5, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.75F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 53, 77, -1.5F, -0.85F, -1.0F, 3, 3, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 9.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3054F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 80, 43, -1.0F, -0.85F, -1.0F, 2, 2, 9, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3491F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 82, 0, -0.5F, -0.75F, -1.0F, 1, 1, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.5F, -3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2618F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.5F, -4.0F, -16.25F, 11, 17, 17, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.0F, -16.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 0, -1.5F, 1.25F, 0.75F, 3, 1, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 70, 77, -3.0F, 1.25F, 0.25F, 6, 1, 7, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 73, 0.0F, 0.25F, 1.25F, 0, 2, 10, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.25F, -16.25F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1745F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 43, 35, -4.0F, -3.25F, -8.75F, 8, 12, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 89, 17, -2.0F, -0.75F, -4.25F, 4, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 0, 0.0F, -2.0F, -3.0F, 0, 2, 4, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-4.0F, 5.0F, -5.75F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.6545F, -0.3491F, 0.0436F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 57, 22, -1.5F, -1.0F, -1.5F, 3, 6, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.5F, 1.5F);
        this.rightarm.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 70, 22, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.8727F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 62, -1.0F, -0.5F, -1.5F, 2, 5, 3, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.75F, 1.5F);
        this.rightarm2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 11, 0.0F, -3.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.5F, 4.5F, 0.0F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, -0.3054F);
        this.righthand.cubeList.add(new ModelBox(righthand, 0, 35, 0.0F, 0.0F, -2.5F, 2, 5, 4, 0.0F, true));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(4.0F, 5.0F, -5.75F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.6545F, 0.3491F, -0.0436F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 57, 22, -1.5F, -1.0F, -1.5F, 3, 6, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, 1.5F);
        this.leftarm.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 70, 22, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8727F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 62, -1.0F, -0.5F, -1.5F, 2, 5, 3, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.75F, 1.5F);
        this.leftarm2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 11, 0.0F, -3.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.5F, 4.5F, 0.0F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.3054F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 0, 35, -2.0F, 0.0F, -2.5F, 2, 5, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.5672F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 79, -2.5F, -2.25F, -5.75F, 5, 8, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.75F, -3.5F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 11, -1.0F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.75F, -3.5F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 35, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3F, -5.75F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 23, 86, -2.0F, -2.25F, -4.0F, 4, 7, 5, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 97, 63, 0.0F, -3.25F, -3.5F, 0, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.0F, -3.5F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 94, 84, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 4.75F, 1.0F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 94, 41, -2.0F, -5.0F, 0.0F, 4, 5, 2, -0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.1F, -3.75F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1309F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 86, 55, -1.5F, -2.25F, -3.5F, 3, 7, 4, 0.02F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 44, 35, 0.0F, -4.25F, -3.5F, 0, 2, 4, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 82, 96, -1.0F, -3.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.05F, -2.75F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.5236F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 20, 62, -1.5F, -2.25F, -2.5F, 3, 6, 3, 0.01F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 54, 58, 0.0F, -4.25F, -1.5F, 0, 2, 2, 0.0F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 71, 96, -1.0F, -3.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.95F, -2.1F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 80, 86, -2.5F, -2.3F, -3.3F, 4, 5, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 14, -1.5F, 2.25F, 1.0F, 2, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 80, 43, -0.5F, 1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.25F, -1.75F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 63, 66, -2.0F, -0.05F, -0.05F, 3, 1, 2, 0.0F, false));

        this.HEADPART = new AdvancedModelRenderer(this);
        this.HEADPART.setRotationPoint(0.0F, -2.25F, -3.3F);
        this.head.addChild(HEADPART);
        this.setRotateAngle(HEADPART, 0.1833F, 0.0F, 0.0F);
        this.HEADPART.cubeList.add(new ModelBox(HEADPART, 40, 83, -1.5F, -0.05F, -4.0F, 2, 3, 4, -0.01F, false));

        this.HEADPART2 = new AdvancedModelRenderer(this);
        this.HEADPART2.setRotationPoint(0.0F, 0.0F, -3.95F);
        this.HEADPART.addChild(HEADPART2);
        this.setRotateAngle(HEADPART2, 0.2618F, 0.0F, 0.0F);
        this.HEADPART2.cubeList.add(new ModelBox(HEADPART2, 15, 96, -1.5F, -0.05F, -3.0F, 2, 3, 3, -0.02F, false));

        this.HEADPART3 = new AdvancedModelRenderer(this);
        this.HEADPART3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.HEADPART2.addChild(HEADPART3);
        this.setRotateAngle(HEADPART3, 0.3665F, 0.0F, 0.0F);
        this.HEADPART3.cubeList.add(new ModelBox(HEADPART3, 33, 62, -1.5F, -0.05F, -1.95F, 2, 2, 2, -0.03F, false));

        this.HEADPART5 = new AdvancedModelRenderer(this);
        this.HEADPART5.setRotationPoint(0.0F, 3.2F, -11.25F);
        this.head.addChild(HEADPART5);
        this.setRotateAngle(HEADPART5, 0.0436F, 0.0F, 0.0F);
        this.HEADPART5.cubeList.add(new ModelBox(HEADPART5, 57, 99, -1.5F, -2.05F, 0.05F, 2, 2, 2, 0.0F, false));
        this.HEADPART5.cubeList.add(new ModelBox(HEADPART5, 94, 10, -2.0F, -3.05F, 1.65F, 3, 3, 3, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.55F, 0.6F);
        this.HEADPART5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0262F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 14, -1.5F, -1.1F, 1.85F, 2, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.55F, 0.6F);
        this.HEADPART5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 0, -1.0F, -1.35F, 0.0F, 1, 1, 1, 0.0F, false));

        this.HEADPART6 = new AdvancedModelRenderer(this);
        this.HEADPART6.setRotationPoint(0.5F, -3.45F, 1.65F);
        this.HEADPART5.addChild(HEADPART6);
        this.setRotateAngle(HEADPART6, 0.4648F, 0.0757F, 0.245F);
        this.HEADPART6.cubeList.add(new ModelBox(HEADPART6, 26, 99, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.HEADPART7 = new AdvancedModelRenderer(this);
        this.HEADPART7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART6.addChild(HEADPART7);
        this.setRotateAngle(HEADPART7, -0.3491F, 0.0F, 0.0F);
        this.HEADPART7.cubeList.add(new ModelBox(HEADPART7, 98, 69, -1.0F, 0.0F, 0.0F, 1, 2, 3, -0.01F, false));

        this.HEADPART8 = new AdvancedModelRenderer(this);
        this.HEADPART8.setRotationPoint(0.0F, 1.3F, 2.7F);
        this.HEADPART7.addChild(HEADPART8);
        this.setRotateAngle(HEADPART8, 0.7854F, 0.0F, 0.0F);
        this.HEADPART8.cubeList.add(new ModelBox(HEADPART8, 39, 98, -1.0F, -0.7F, -1.2F, 1, 3, 3, 0.0F, false));

        this.HEADPART4 = new AdvancedModelRenderer(this);
        this.HEADPART4.setRotationPoint(-1.5F, -3.45F, 1.65F);
        this.HEADPART5.addChild(HEADPART4);
        this.setRotateAngle(HEADPART4, 0.4648F, -0.0757F, -0.245F);
        this.HEADPART4.cubeList.add(new ModelBox(HEADPART4, 26, 99, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.HEADPART9 = new AdvancedModelRenderer(this);
        this.HEADPART9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART4.addChild(HEADPART9);
        this.setRotateAngle(HEADPART9, -0.3491F, 0.0F, 0.0F);
        this.HEADPART9.cubeList.add(new ModelBox(HEADPART9, 98, 69, 0.0F, 0.0F, 0.0F, 1, 2, 3, -0.01F, true));

        this.HEADPART10 = new AdvancedModelRenderer(this);
        this.HEADPART10.setRotationPoint(0.0F, 1.3F, 2.7F);
        this.HEADPART9.addChild(HEADPART10);
        this.setRotateAngle(HEADPART10, 0.7854F, 0.0F, 0.0F);
        this.HEADPART10.cubeList.add(new ModelBox(HEADPART10, 39, 98, 0.0F, -0.7F, -1.2F, 1, 3, 3, 0.0F, true));

        this.HEADPART12 = new AdvancedModelRenderer(this);
        this.HEADPART12.setRotationPoint(0.0F, -0.05F, 4.55F);
        this.HEADPART5.addChild(HEADPART12);
        this.setRotateAngle(HEADPART12, 0.1309F, 0.0F, 0.0F);
        this.HEADPART12.cubeList.add(new ModelBox(HEADPART12, 91, 24, -2.0F, -3.0F, 0.0F, 3, 3, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.45F, -0.05F);
        this.HEADPART12.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, -1.5F, -0.8F, 1.4F, 2, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.45F, -0.05F);
        this.HEADPART12.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 14, -1.5F, -1.0F, -0.3F, 2, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 2.35F);
        this.HEADPART12.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.9163F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 93, 92, -2.0F, -3.15F, -0.5F, 3, 3, 4, -0.03F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.25F, 0.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 91, 33, -2.5F, -0.25F, -3.8F, 4, 3, 4, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.25F, -3.75F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4363F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 94, -2.5F, -2.9F, 0.0F, 4, 3, 3, -0.02F, false));

        this.JAWPART = new AdvancedModelRenderer(this);
        this.JAWPART.setRotationPoint(0.0F, -0.25F, -3.6F);
        this.jaw.addChild(JAWPART);
        this.setRotateAngle(JAWPART, -0.0436F, 0.0F, 0.0F);
        this.JAWPART.cubeList.add(new ModelBox(JAWPART, 30, 35, -2.0F, 0.0F, -6.5F, 3, 2, 7, -0.02F, false));
        this.JAWPART.cubeList.add(new ModelBox(JAWPART, 49, 83, -1.5F, 0.0F, -8.1F, 2, 1, 2, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 2.0F, -4.5F);
        this.JAWPART.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 91, -2.0F, -1.0F, -0.4F, 3, 1, 5, -0.03F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.0F, -8.1F);
        this.JAWPART.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5236F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 17, 79, -1.5F, -1.0F, 0.0F, 2, 1, 2, -0.02F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -6.25F);
        this.JAWPART.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 14, -1.5F, -0.4F, 2.25F, 2, 1, 1, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 14, -1.5F, -0.4F, 0.45F, 2, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, -6.25F);
        this.JAWPART.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 11, 0, -1.0F, -0.4F, -1.25F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.JAWPART.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6981F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 93, 0, -2.0F, 0.25F, 0.0F, 3, 3, 4, -0.04F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.75F, -3.8F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 56, 0, -1.5F, -3.0F, 0.0F, 2, 3, 4, 0.0F, false));

        this.throatpouch = new AdvancedModelRenderer(this);
        this.throatpouch.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.throat.addChild(throatpouch);
        this.setRotateAngle(throatpouch, -0.2618F, 0.0F, 0.0F);
        this.throatpouch.cubeList.add(new ModelBox(throatpouch, 48, 98, -1.0F, -2.0F, 0.0F, 1, 3, 3, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, -0.3491F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 59, 91, -2.0F, -3.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.1745F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 34, 58, -2.5F, -4.0F, -3.25F, 5, 15, 9, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.rightleg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7418F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 70, 22, -2.0F, -2.0F, -2.0F, 4, 14, 6, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 12.0F, -0.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5672F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 0, -1.5F, -2.0F, -1.25F, 3, 9, 4, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightLeg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.1745F, 0.0F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 90, 77, -2.5F, 0.0F, -2.25F, 5, 2, 4, 0.0F, true));

        this.righttoes = new AdvancedModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 1.0F, -1.75F);
        this.rightfoot.addChild(righttoes);
        this.righttoes.cubeList.add(new ModelBox(righttoes, 54, 58, -2.5F, -1.0F, -4.5F, 5, 2, 5, 0.01F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.1745F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 34, 58, -2.5F, -4.0F, -3.25F, 5, 15, 9, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7418F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 70, 22, -2.0F, -2.0F, -2.0F, 4, 14, 6, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 12.0F, -0.5F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.5672F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 0, -1.5F, -2.0F, -1.25F, 3, 9, 4, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.1745F, 0.0F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 90, 77, -2.5F, 0.0F, -2.25F, 5, 2, 4, 0.0F, false));

        this.lefttoes = new AdvancedModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 1.0F, -1.75F);
        this.leftfoot.addChild(lefttoes);
        this.lefttoes.cubeList.add(new ModelBox(lefttoes, 54, 58, -2.5F, -1.0F, -4.5F, 5, 2, 5, 0.01F, false));

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


        EntityPrehistoricFloraLusovenator EntityLusovenator = (EntityPrehistoricFloraLusovenator) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.lefthand};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.righthand};

        EntityLusovenator.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityLusovenator.getAnimation() == EntityLusovenator.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityLusovenator.isReallyInWater()) {
                //this.Root.offsetY = -10F;

                if (f3 == 0.0F || !EntityLusovenator.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.2F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.13F * 0.35F, 0.12F, f2, 1F);

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

                if (EntityLusovenator.getIsFast()) { //Running


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
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 15) / 10) * (-18.8408-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10) + (((tickAnim - 15) / 10) * (2.64451-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10) + (((tickAnim - 15) / 10) * (0.43509-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10))));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -18.8408 + (((tickAnim - 25) / 5) * (0-(-18.8408)));
            yy = 2.64451 + (((tickAnim - 25) / 5) * (0-(2.64451)));
            zz = 0.43509 + (((tickAnim - 25) / 5) * (0-(0.43509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20 + (((tickAnim - 15) / 10) * (-9.12983-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 10) * (0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 10) * (0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -9.12983 + (((tickAnim - 25) / 5) * (0-(-9.12983)));
            yy = 0.8262 + (((tickAnim - 25) / 5) * (0-(0.8262)));
            zz = 0.8262 + (((tickAnim - 25) / 5) * (0-(0.8262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*15 + (((tickAnim - 15) / 10) * (18.96677-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*15)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 10) * (-0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5) + (((tickAnim - 15) / 10) * (0.10877-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5))));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 18.96677 + (((tickAnim - 25) / 5) * (0-(18.96677)));
            yy = -0.8262 + (((tickAnim - 25) / 5) * (0-(-0.8262)));
            zz = 0.10877 + (((tickAnim - 25) / 5) * (0-(0.10877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (12.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 20) / 10) * (0-(12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-29.83-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -29.83 + (((tickAnim - 10) / 10) * (15.33-(-29.83)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 15.33 + (((tickAnim - 20) / 5) * (20.17-(15.33)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.17 + (((tickAnim - 25) / 5) * (0-(20.17)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (49.53-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 49.53 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1-(49.53)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
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
            yy = 0 + (((tickAnim - 0) / 25) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (13-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -10 + (((tickAnim - 25) / 25) * (0-(-10)));
            zz = 13 + (((tickAnim - 25) / 25) * (0-(13)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 25) / 25) * (0-(7.5)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 25) / 25) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.89092-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.03989-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.0312-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -4.89092 + (((tickAnim - 25) / 25) * (0-(-4.89092)));
            yy = 1.03989 + (((tickAnim - 25) / 25) * (0-(1.03989)));
            zz = -0.0312 + (((tickAnim - 25) / 25) * (0-(-0.0312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 25) / 25) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 25) / 25) * (0-(-2.5)));
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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -50 + (((tickAnim - 25) / 25) * (0-(-50)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 25) / 25) * (0-(42.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 25) / 25) * (0-(25)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -50 + (((tickAnim - 25) / 25) * (0-(-50)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 25) / 25) * (0-(42.5)));
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
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 25) / 25) * (0-(25)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2 + (((tickAnim - 20) / 30) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*3) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2 + (((tickAnim - 20) / 30) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.25 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.25 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25 + (((tickAnim - 10) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25 + (((tickAnim - 10) / 10) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5 + (((tickAnim - 20) / 30) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1 + (((tickAnim - 20) / 30) * (0-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10 + (((tickAnim - 20) / 30) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30 + (((tickAnim - 20) / 30) * (0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*0.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*0.5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20 + (((tickAnim - 15) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10 + (((tickAnim - 25) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30 + (((tickAnim - 15) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15 + (((tickAnim - 25) / 15) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-15 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-15)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*1 + (((tickAnim - 0) / 15) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*1)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10 + (((tickAnim - 15) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5 + (((tickAnim - 25) / 15) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-1 + (((tickAnim - 0) / 15) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-1)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30 + (((tickAnim - 15) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10 + (((tickAnim - 25) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-6.13397-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-1.53376-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.53376-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -6.13397 + (((tickAnim - 30) / 50) * (0-(-6.13397)));
            yy = -1.53376 + (((tickAnim - 30) / 50) * (0-(-1.53376)));
            zz = 1.53376 + (((tickAnim - 30) / 50) * (0-(1.53376)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-4.70577-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.53376-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.53376-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -4.70577 + (((tickAnim - 30) / 50) * (0-(-4.70577)));
            yy = 1.53376 + (((tickAnim - 30) / 50) * (0-(1.53376)));
            zz = -1.53376 + (((tickAnim - 30) / 50) * (0-(-1.53376)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20 + (((tickAnim - 20) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5) + (((tickAnim - 20) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5) + (((tickAnim - 20) / 10) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5 + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5));
            zz = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5 + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }






        if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 30) / 50) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 12.5 + (((tickAnim - 30) / 50) * (0-(12.5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 30) / 50) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.75 + (((tickAnim - 18) / 2) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*20-(-0.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*20 + (((tickAnim - 20) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-0.5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-0.5 + (((tickAnim - 30) / 50) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-0.5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5 + (((tickAnim - 30) / 40) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5 + (((tickAnim - 70) / 10) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-47.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = -47.5 + (((tickAnim - 30) / 11) * (0-(-47.5)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 16) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 57) / 10) * (-47.5-(0)));
            yy = 0 + (((tickAnim - 57) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 10) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = -47.5 + (((tickAnim - 67) / 11) * (0-(-47.5)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatpouch, throatpouch.rotateAngleX + (float) Math.toRadians(xx), throatpouch.rotateAngleY + (float) Math.toRadians(yy), throatpouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 20) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 3) * (1.6-(1)));
            zz = 1 + (((tickAnim - 20) / 3) * (1.2-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 23) / 2) * (0.8667-(1)));
            yy = 1.6 + (((tickAnim - 23) / 2) * (1.6333-(1.6)));
            zz = 1.2 + (((tickAnim - 23) / 2) * (1.0667-(1.2)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0.8667 + (((tickAnim - 25) / 3) * (1-(0.8667)));
            yy = 1.6333 + (((tickAnim - 25) / 3) * (1.6-(1.6333)));
            zz = 1.0667 + (((tickAnim - 25) / 3) * (1.2-(1.0667)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 1 + (((tickAnim - 28) / 11) * (1-(1)));
            yy = 1.6 + (((tickAnim - 28) / 11) * (1-(1.6)));
            zz = 1.2 + (((tickAnim - 28) / 11) * (1-(1.2)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 39) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 39) / 3) * (1.6-(1)));
            zz = 1 + (((tickAnim - 39) / 3) * (1.2-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 42) / 2) * (0.8667-(1)));
            yy = 1.6 + (((tickAnim - 42) / 2) * (1.6333-(1.6)));
            zz = 1.2 + (((tickAnim - 42) / 2) * (1.0667-(1.2)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 0.8667 + (((tickAnim - 44) / 3) * (1-(0.8667)));
            yy = 1.6333 + (((tickAnim - 44) / 3) * (1.6-(1.6333)));
            zz = 1.0667 + (((tickAnim - 44) / 3) * (1.2-(1.0667)));
        }
        else if (tickAnim >= 47 && tickAnim < 61) {
            xx = 1 + (((tickAnim - 47) / 14) * (1-(1)));
            yy = 1.6 + (((tickAnim - 47) / 14) * (1-(1.6)));
            zz = 1.2 + (((tickAnim - 47) / 14) * (1-(1.2)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 61) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 61) / 2) * (1.6-(1)));
            zz = 1 + (((tickAnim - 61) / 2) * (1.2-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = 1 + (((tickAnim - 63) / 3) * (0.8667-(1)));
            yy = 1.6 + (((tickAnim - 63) / 3) * (1.6333-(1.6)));
            zz = 1.2 + (((tickAnim - 63) / 3) * (1.0667-(1.2)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = 0.8667 + (((tickAnim - 66) / 2) * (1-(0.8667)));
            yy = 1.6333 + (((tickAnim - 66) / 2) * (1.6-(1.6333)));
            zz = 1.0667 + (((tickAnim - 66) / 2) * (1.2-(1.0667)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (-5.74-(0)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5.74 + (((tickAnim - 25) / 15) * (-5.74-(-5.74)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -5.74 + (((tickAnim - 40) / 6) * (-7.5-(-5.74)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = -7.5 + (((tickAnim - 46) / 8) * (1.22-(-7.5)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 1.22 + (((tickAnim - 54) / 26) * (0-(1.22)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 12) / 16) * (5-(5)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 28) / 15) * (5-(5)));
            yy = 0 + (((tickAnim - 28) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 15) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 5 + (((tickAnim - 43) / 5) * (-7.5-(5)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 57) {
            xx = -7.5 + (((tickAnim - 48) / 9) * (-8.78-(-7.5)));
            yy = 0 + (((tickAnim - 48) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 9) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 80) {
            xx = -8.78 + (((tickAnim - 57) / 23) * (0-(-8.78)));
            yy = 0 + (((tickAnim - 57) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20 + (((tickAnim - 20) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5) + (((tickAnim - 20) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5) + (((tickAnim - 20) / 10) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5 + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5));
            zz = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5 + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }






        if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (17.86-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 17.86 + (((tickAnim - 18) / 17) * (15-(17.86)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 61) {
            xx = 15 + (((tickAnim - 35) / 26) * (22.5-(15)));
            yy = 0 + (((tickAnim - 35) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 26) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 80) {
            xx = 22.5 + (((tickAnim - 61) / 19) * (0-(22.5)));
            yy = 0 + (((tickAnim - 61) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 19) * (0-(0)));
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
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (-3.71-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -3.71 + (((tickAnim - 20) / 8) * (-3.71-(-3.71)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -3.71 + (((tickAnim - 28) / 10) * (22.5-(-3.71)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 22.5 + (((tickAnim - 38) / 8) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 22.5 + (((tickAnim - 46) / 8) * (27.01-(22.5)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 67) {
            xx = 27.01 + (((tickAnim - 54) / 13) * (27.01-(27.01)));
            yy = 0 + (((tickAnim - 54) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 13) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 27.01 + (((tickAnim - 67) / 6) * (23.51-(27.01)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 23.51 + (((tickAnim - 73) / 7) * (0-(23.51)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.12-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -3.12 + (((tickAnim - 18) / 10) * (36.25-(-3.12)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 36.25 + (((tickAnim - 28) / 12) * (10-(36.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 10 + (((tickAnim - 40) / 15) * (-13.75-(10)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -13.75 + (((tickAnim - 55) / 25) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (-3.33-(0)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = -3.33 + (((tickAnim - 24) / 12) * (-19.62-(-3.33)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -19.62 + (((tickAnim - 36) / 7) * (-25-(-19.62)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = -25 + (((tickAnim - 43) / 12) * (-21.67-(-25)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = -21.67 + (((tickAnim - 55) / 7) * (-30.89-(-21.67)));
            yy = 0 + (((tickAnim - 55) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 7) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = -30.89 + (((tickAnim - 62) / 18) * (0-(-30.89)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 18) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-9.37-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -9.37 + (((tickAnim - 28) / 10) * (15.31-(-9.37)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = 15.31 + (((tickAnim - 38) / 9) * (10-(15.31)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 47) / 13) * (10-(10)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 10 + (((tickAnim - 60) / 7) * (-5.83-(10)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = -5.83 + (((tickAnim - 67) / 13) * (0-(-5.83)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 13) / 6) * (7.95-(20)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 7.95 + (((tickAnim - 19) / 8) * (0-(7.95)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (35-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 35 + (((tickAnim - 31) / 7) * (7.95-(35)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 7.95 + (((tickAnim - 38) / 8) * (0-(7.95)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 46) / 13) * (42.91-(0)));
            yy = 0 + (((tickAnim - 46) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 13) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 42.91 + (((tickAnim - 59) / 21) * (0-(42.91)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1 + (((tickAnim - 0) / 20) * (-22.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -22.5 + (((tickAnim - 20) / 11) * (-25.9-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 58) {
            xx = -25.9 + (((tickAnim - 31) / 27) * (-15.84-(-25.9)));
            yy = 0 + (((tickAnim - 31) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 27) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -15.84 + (((tickAnim - 58) / 22) * (0-(-15.84)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = 32.5 + (((tickAnim - 26) / 20) * (53-(32.5)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = 53 + (((tickAnim - 46) / 34) * (0-(53)));
            yy = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 0) / 10) * (0-(7.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -32.5 + (((tickAnim - 16) / 7) * (-12.5-(-32.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 23) / 12) * (7.5-(-12.5)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 7.5 + (((tickAnim - 35) / 6) * (-12.5-(7.5)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = -12.5 + (((tickAnim - 41) / 7) * (7.5-(-12.5)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = 7.5 + (((tickAnim - 48) / 11) * (-40-(7.5)));
            yy = 0 + (((tickAnim - 48) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 11) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 65) {
            xx = -40 + (((tickAnim - 59) / 6) * (-20-(-40)));
            yy = 0 + (((tickAnim - 59) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 6) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = -20 + (((tickAnim - 65) / 4) * (-35-(-20)));
            yy = 0 + (((tickAnim - 65) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 4) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -35 + (((tickAnim - 69) / 11) * (7.5-(-35)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatpouch, throatpouch.rotateAngleX + (float) Math.toRadians(xx), throatpouch.rotateAngleY + (float) Math.toRadians(yy), throatpouch.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLookAround(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 31) {
            xx = 5 + (((tickAnim - 16) / 15) * (0-(5)));
            yy = 12.5 + (((tickAnim - 16) / 15) * (20-(12.5)));
            zz = 0 + (((tickAnim - 16) / 15) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 31) / 13) * (5-(0)));
            yy = 20 + (((tickAnim - 31) / 13) * (17.77778-(20)));
            zz = 0 + (((tickAnim - 31) / 13) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 73) {
            xx = 5 + (((tickAnim - 44) / 29) * (-5.08545-(5)));
            yy = 17.77778 + (((tickAnim - 44) / 29) * (22.49033-(17.77778)));
            zz = 0 + (((tickAnim - 44) / 29) * (-0.23575-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 114) {
            xx = -5.08545 + (((tickAnim - 73) / 41) * (-6.92201-(-5.08545)));
            yy = 22.49033 + (((tickAnim - 73) / 41) * (-2.80916-(22.49033)));
            zz = -0.23575 + (((tickAnim - 73) / 41) * (6.36104-(-0.23575)));
        }
        else if (tickAnim >= 114 && tickAnim < 148) {
            xx = -6.92201 + (((tickAnim - 114) / 34) * (-6.92201-(-6.92201)));
            yy = -2.80916 + (((tickAnim - 114) / 34) * (-2.80916-(-2.80916)));
            zz = 6.36104 + (((tickAnim - 114) / 34) * (6.36104-(6.36104)));
        }
        else if (tickAnim >= 148 && tickAnim < 200) {
            xx = -6.92201 + (((tickAnim - 148) / 52) * (0-(-6.92201)));
            yy = -2.80916 + (((tickAnim - 148) / 52) * (0-(-2.80916)));
            zz = 6.36104 + (((tickAnim - 148) / 52) * (0-(6.36104)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 20) / 15) * (0-(5)));
            yy = 12.5 + (((tickAnim - 20) / 15) * (20-(12.5)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (5-(0)));
            yy = 20 + (((tickAnim - 35) / 13) * (17.77778-(20)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 78) {
            xx = 5 + (((tickAnim - 48) / 30) * (-5.08545-(5)));
            yy = 17.77778 + (((tickAnim - 48) / 30) * (22.49033-(17.77778)));
            zz = 0 + (((tickAnim - 48) / 30) * (-0.23575-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 118) {
            xx = -5.08545 + (((tickAnim - 78) / 40) * (11.19379-(-5.08545)));
            yy = 22.49033 + (((tickAnim - 78) / 40) * (0.9637-(22.49033)));
            zz = -0.23575 + (((tickAnim - 78) / 40) * (-1.99777-(-0.23575)));
        }
        else if (tickAnim >= 118 && tickAnim < 152) {
            xx = 11.19379 + (((tickAnim - 118) / 34) * (11.19379-(11.19379)));
            yy = 0.9637 + (((tickAnim - 118) / 34) * (0.9637-(0.9637)));
            zz = -1.99777 + (((tickAnim - 118) / 34) * (-1.99777-(-1.99777)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = 11.19379 + (((tickAnim - 152) / 48) * (0-(11.19379)));
            yy = 0.9637 + (((tickAnim - 152) / 48) * (0-(0.9637)));
            zz = -1.99777 + (((tickAnim - 152) / 48) * (0-(-1.99777)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 5 + (((tickAnim - 27) / 15) * (0-(5)));
            yy = 12.5 + (((tickAnim - 27) / 15) * (20-(12.5)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (5-(0)));
            yy = 20 + (((tickAnim - 42) / 13) * (17.77778-(20)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 84) {
            xx = 5 + (((tickAnim - 55) / 29) * (-5.08545-(5)));
            yy = 17.77778 + (((tickAnim - 55) / 29) * (22.49033-(17.77778)));
            zz = 0 + (((tickAnim - 55) / 29) * (-0.23575-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 124) {
            xx = -5.08545 + (((tickAnim - 84) / 40) * (11.82731-(-5.08545)));
            yy = 22.49033 + (((tickAnim - 84) / 40) * (-30.00592-(22.49033)));
            zz = -0.23575 + (((tickAnim - 84) / 40) * (2.06398-(-0.23575)));
        }
        else if (tickAnim >= 124 && tickAnim < 159) {
            xx = 11.82731 + (((tickAnim - 124) / 35) * (11.82731-(11.82731)));
            yy = -30.00592 + (((tickAnim - 124) / 35) * (-30.00592-(-30.00592)));
            zz = 2.06398 + (((tickAnim - 124) / 35) * (2.06398-(2.06398)));
        }
        else if (tickAnim >= 159 && tickAnim < 200) {
            xx = 11.82731 + (((tickAnim - 159) / 41) * (0-(11.82731)));
            yy = -30.00592 + (((tickAnim - 159) / 41) * (0-(-30.00592)));
            zz = 2.06398 + (((tickAnim - 159) / 41) * (0-(2.06398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-0.88045-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (9.96156-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-5.07673-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 46) {
            xx = -0.88045 + (((tickAnim - 23) / 23) * (0-(-0.88045)));
            yy = 9.96156 + (((tickAnim - 23) / 23) * (20-(9.96156)));
            zz = -5.07673 + (((tickAnim - 23) / 23) * (0-(-5.07673)));
        }
        else if (tickAnim >= 46 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 46) / 13) * (5-(0)));
            yy = 20 + (((tickAnim - 46) / 13) * (17.77778-(20)));
            zz = 0 + (((tickAnim - 46) / 13) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 88) {
            xx = 5 + (((tickAnim - 59) / 29) * (-5.08545-(5)));
            yy = 17.77778 + (((tickAnim - 59) / 29) * (22.49033-(17.77778)));
            zz = 0 + (((tickAnim - 59) / 29) * (-0.23575-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 106) {
            xx = -5.08545 + (((tickAnim - 88) / 18) * (9.94975-(-5.08545)));
            yy = 22.49033 + (((tickAnim - 88) / 18) * (5.67085-(22.49033)));
            zz = -0.23575 + (((tickAnim - 88) / 18) * (2.58516-(-0.23575)));
        }
        else if (tickAnim >= 106 && tickAnim < 117) {
            xx = 9.94975 + (((tickAnim - 106) / 11) * (-9.98368-(9.94975)));
            yy = 5.67085 + (((tickAnim - 106) / 11) * (-4.42084-(5.67085)));
            zz = 2.58516 + (((tickAnim - 106) / 11) * (4.27771-(2.58516)));
        }
        else if (tickAnim >= 117 && tickAnim < 132) {
            xx = -9.98368 + (((tickAnim - 117) / 15) * (5.48847-(-9.98368)));
            yy = -4.42084 + (((tickAnim - 117) / 15) * (-12.83058-(-4.42084)));
            zz = 4.27771 + (((tickAnim - 117) / 15) * (5.68817-(4.27771)));
        }
        else if (tickAnim >= 132 && tickAnim < 167) {
            xx = 5.48847 + (((tickAnim - 132) / 35) * (0.65299-(5.48847)));
            yy = -12.83058 + (((tickAnim - 132) / 35) * (0.82081-(-12.83058)));
            zz = 5.68817 + (((tickAnim - 132) / 35) * (-2.49281-(5.68817)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 0.65299 + (((tickAnim - 167) / 33) * (0-(0.65299)));
            yy = 0.82081 + (((tickAnim - 167) / 33) * (0-(0.82081)));
            zz = -2.49281 + (((tickAnim - 167) / 33) * (0-(-2.49281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 68) {
            xx = 10 + (((tickAnim - 54) / 14) * (5-(10)));
            yy = 20 + (((tickAnim - 54) / 14) * (17.77778-(20)));
            zz = 0 + (((tickAnim - 54) / 14) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 97) {
            xx = 5 + (((tickAnim - 68) / 29) * (-5.08545-(5)));
            yy = 17.77778 + (((tickAnim - 68) / 29) * (22.49033-(17.77778)));
            zz = 0 + (((tickAnim - 68) / 29) * (-0.23575-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 145) {
            xx = -5.08545 + (((tickAnim - 97) / 48) * (11.82731-(-5.08545)));
            yy = 22.49033 + (((tickAnim - 97) / 48) * (-30.00592-(22.49033)));
            zz = -0.23575 + (((tickAnim - 97) / 48) * (2.06398-(-0.23575)));
        }
        else if (tickAnim >= 145 && tickAnim < 178) {
            xx = 11.82731 + (((tickAnim - 145) / 33) * (12.98397-(11.82731)));
            yy = -30.00592 + (((tickAnim - 145) / 33) * (-16.20105-(-30.00592)));
            zz = 2.06398 + (((tickAnim - 145) / 33) * (-2.94069-(2.06398)));
        }
        else if (tickAnim >= 178 && tickAnim < 200) {
            xx = 12.98397 + (((tickAnim - 178) / 22) * (0-(12.98397)));
            yy = -16.20105 + (((tickAnim - 178) / 22) * (0-(-16.20105)));
            zz = -2.94069 + (((tickAnim - 178) / 22) * (0-(-2.94069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (-2.23-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 39) / 16) * (0-(0)));
            yy = -2.23 + (((tickAnim - 39) / 16) * (-3.81-(-2.23)));
            zz = 0 + (((tickAnim - 39) / 16) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 55) / 24) * (0-(0)));
            yy = -3.81 + (((tickAnim - 55) / 24) * (-3.3-(-3.81)));
            zz = 0 + (((tickAnim - 55) / 24) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 79) / 11) * (0-(0)));
            yy = -3.3 + (((tickAnim - 79) / 11) * (0.62-(-3.3)));
            zz = 0 + (((tickAnim - 79) / 11) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 90) / 7) * (0-(0)));
            yy = 0.62 + (((tickAnim - 90) / 7) * (-5.18-(0.62)));
            zz = 0 + (((tickAnim - 90) / 7) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 97) / 22) * (0-(0)));
            yy = -5.18 + (((tickAnim - 97) / 22) * (1.75-(-5.18)));
            zz = 0 + (((tickAnim - 97) / 22) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 119) / 19) * (0-(0)));
            yy = 1.75 + (((tickAnim - 119) / 19) * (12.5-(1.75)));
            zz = 0 + (((tickAnim - 119) / 19) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 138) / 11) * (0-(0)));
            yy = 12.5 + (((tickAnim - 138) / 11) * (17.73-(12.5)));
            zz = 0 + (((tickAnim - 138) / 11) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 149) / 51) * (0-(0)));
            yy = 17.73 + (((tickAnim - 149) / 51) * (0-(17.73)));
            zz = 0 + (((tickAnim - 149) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-15-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 38) / 28) * (0-(0)));
            yy = -15 + (((tickAnim - 38) / 28) * (-19.81-(-15)));
            zz = 0 + (((tickAnim - 38) / 28) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 66) / 36) * (0-(0)));
            yy = -19.81 + (((tickAnim - 66) / 36) * (-17.15-(-19.81)));
            zz = 0 + (((tickAnim - 66) / 36) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 102) / 20) * (0-(0)));
            yy = -17.15 + (((tickAnim - 102) / 20) * (3.97-(-17.15)));
            zz = 0 + (((tickAnim - 102) / 20) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 122) / 26) * (0-(0)));
            yy = 3.97 + (((tickAnim - 122) / 26) * (12.62-(3.97)));
            zz = 0 + (((tickAnim - 122) / 26) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 148) / 52) * (0-(0)));
            yy = 12.62 + (((tickAnim - 148) / 52) * (0-(12.62)));
            zz = 0 + (((tickAnim - 148) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+20))*-2), hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*3)), hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+80))*2)));

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -1.7 + (((tickAnim - 0) / 12) * (-0.5-(-1.7)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -0.5 + (((tickAnim - 12) / 13) * (-1.7-(-0.5)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -1.7 + (((tickAnim - 25) / 13) * (-0.5-(-1.7)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.5 + (((tickAnim - 38) / 12) * (-1.7-(-0.5)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*2), tail.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5)), tail.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-2), tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*-5)), tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-90))*-2), tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*-5)), tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-120))*-1), tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*-5)), tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*2)));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-140))*-1), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*-5)), tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*2)));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-140))*-1), tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-170))*-5)), tail6.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-170))*2)));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-80))*1), body.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-20))*-3)), body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+70))*1), chest.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2)), chest.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2)));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*5), rightarm.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*5)), rightarm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*-5)));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*-5)));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-5), leftarm.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5)), leftarm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*5)));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*-5)));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*3), neck.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*2)), neck.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*1), neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*2)), neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*-1)));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-1), neck3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*2)), neck3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*-1)));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+60))*-1), head.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*2)), head.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*-1)));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*-1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -32.61223 + (((tickAnim - 0) / 10) * (2.3333-(-32.61223)));
            yy = 6.26128 + (((tickAnim - 0) / 10) * (2.96177-(6.26128)));
            zz = -2.4035 + (((tickAnim - 0) / 10) * (-2.4838-(-2.4035)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 2.3333 + (((tickAnim - 10) / 13) * (20.01859-(2.3333)));
            yy = 2.96177 + (((tickAnim - 10) / 13) * (-1.30541-(2.96177)));
            zz = -2.4838 + (((tickAnim - 10) / 13) * (-9.89636-(-2.4838)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 20.01859 + (((tickAnim - 23) / 10) * (5-(20.01859)));
            yy = -1.30541 + (((tickAnim - 23) / 10) * (5-(-1.30541)));
            zz = -9.89636 + (((tickAnim - 23) / 10) * (5-(-9.89636)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 33) / 10) * (-27.5-(5)));
            yy = 5 + (((tickAnim - 33) / 10) * (5-(5)));
            zz = 5 + (((tickAnim - 33) / 10) * (5-(5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (-32.61223-(-27.5)));
            yy = 5 + (((tickAnim - 43) / 7) * (6.26128-(5)));
            zz = 5 + (((tickAnim - 43) / 7) * (-2.4035-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 5) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-1)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 5) / 5) * (-0.75-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.75 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-0.75)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 17) / 6) * (-1.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = -1.3 + (((tickAnim - 23) / 10) * (1-(-1.3)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 33) / 10) * (1-(1)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 43) / 7) * (-1-(1)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 0) / 10) * (10-(7.5)));
            yy = -2.5 + (((tickAnim - 0) / 10) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 0) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 10) / 13) * (5-(10)));
            yy = 0 + (((tickAnim - 10) / 13) * (2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (2.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 23) / 10) * (45-(5)));
            yy = 2.5 + (((tickAnim - 23) / 10) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 23) / 10) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 45 + (((tickAnim - 33) / 10) * (42.5-(45)));
            yy = 2.5 + (((tickAnim - 33) / 10) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 33) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 43) / 7) * (7.5-(42.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (-2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 0) / 10) * (-10-(22.5)));
            yy = 2.5 + (((tickAnim - 0) / 10) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 0) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 10) / 13) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 23) / 10) * (-15-(27.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -15 + (((tickAnim - 33) / 10) * (-40-(-15)));
            yy = -2.5 + (((tickAnim - 33) / 10) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 33) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -40 + (((tickAnim - 43) / 7) * (22.5-(-40)));
            yy = 0 + (((tickAnim - 43) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (-2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.12165 + (((tickAnim - 0) / 5) * (3.52955-(17.12165)));
            yy = -4.98093 + (((tickAnim - 0) / 5) * (-3.24136-(-4.98093)));
            zz = 8.6822 + (((tickAnim - 0) / 5) * (6.72594-(8.6822)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.52955 + (((tickAnim - 5) / 5) * (-5.06255-(3.52955)));
            yy = -3.24136 + (((tickAnim - 5) / 5) * (-1.50179-(-3.24136)));
            zz = 6.72594 + (((tickAnim - 5) / 5) * (4.76968-(6.72594)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -5.06255 + (((tickAnim - 10) / 7) * (0-(-5.06255)));
            yy = -1.50179 + (((tickAnim - 10) / 7) * (0-(-1.50179)));
            zz = 4.76968 + (((tickAnim - 10) / 7) * (0-(4.76968)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (40.23749-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (4.55749-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (5.96275-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 40.23749 + (((tickAnim - 23) / 7) * (52.5-(40.23749)));
            yy = 4.55749 + (((tickAnim - 23) / 7) * (0-(4.55749)));
            zz = 5.96275 + (((tickAnim - 23) / 7) * (0-(5.96275)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 52.5 + (((tickAnim - 30) / 13) * (45-(52.5)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 45 + (((tickAnim - 43) / 7) * (17.12165-(45)));
            yy = 0 + (((tickAnim - 43) / 7) * (-4.98093-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (8.6822-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 0) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -23.75 + (((tickAnim - 17) / 6) * (-87.5-(-23.75)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -87.5 + (((tickAnim - 23) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 40 + (((tickAnim - 30) / 13) * (50-(40)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 50 + (((tickAnim - 43) / 7) * (-5-(50)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 20.01859 + (((tickAnim - 0) / 10) * (5-(20.01859)));
            yy = 1.30541 + (((tickAnim - 0) / 10) * (-5-(1.30541)));
            zz = 9.89636 + (((tickAnim - 0) / 10) * (-5-(9.89636)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (-27.5-(5)));
            yy = -5 + (((tickAnim - 10) / 10) * (-5-(-5)));
            zz = -5 + (((tickAnim - 10) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -27.5 + (((tickAnim - 20) / 7) * (-32.61223-(-27.5)));
            yy = -5 + (((tickAnim - 20) / 7) * (-6.26128-(-5)));
            zz = -5 + (((tickAnim - 20) / 7) * (2.4035-(-5)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -32.61223 + (((tickAnim - 27) / 10) * (2.3333-(-32.61223)));
            yy = -6.26128 + (((tickAnim - 27) / 10) * (-2.96177-(-6.26128)));
            zz = 2.4035 + (((tickAnim - 27) / 10) * (2.4838-(2.4035)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 2.3333 + (((tickAnim - 37) / 13) * (20.01859-(2.3333)));
            yy = -2.96177 + (((tickAnim - 37) / 13) * (1.30541-(-2.96177)));
            zz = 2.4838 + (((tickAnim - 37) / 13) * (9.89636-(2.4838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.3 + (((tickAnim - 0) / 10) * (1-(-1.3)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 20) / 7) * (-1-(1)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 27) / 5) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-1)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 32) / 5) * (-0.75-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = -0.75 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-0.75)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 43) / 7) * (-1.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 0) / 10) * (45-(5)));
            yy = -2.5 + (((tickAnim - 0) / 10) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 0) / 10) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 45 + (((tickAnim - 10) / 10) * (42.5-(45)));
            yy = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 42.5 + (((tickAnim - 20) / 7) * (7.5-(42.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 7.5 + (((tickAnim - 27) / 10) * (10-(7.5)));
            yy = 2.5 + (((tickAnim - 27) / 10) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 27) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 37) / 13) * (5-(10)));
            yy = 0 + (((tickAnim - 37) / 13) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (-2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 43) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
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




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 0) / 10) * (-15-(27.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 10) / 10) * (-40-(-15)));
            yy = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -40 + (((tickAnim - 20) / 7) * (22.5-(-40)));
            yy = 0 + (((tickAnim - 20) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 22.5 + (((tickAnim - 27) / 10) * (-10-(22.5)));
            yy = -2.5 + (((tickAnim - 27) / 10) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 27) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 37) / 13) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 43) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 40.23749 + (((tickAnim - 0) / 7) * (52.5-(40.23749)));
            yy = -4.55749 + (((tickAnim - 0) / 7) * (0-(-4.55749)));
            zz = -5.96275 + (((tickAnim - 0) / 7) * (0-(-5.96275)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 52.5 + (((tickAnim - 7) / 13) * (45-(52.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 45 + (((tickAnim - 20) / 7) * (17.12165-(45)));
            yy = 0 + (((tickAnim - 20) / 7) * (4.98093-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-8.6822-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 17.12165 + (((tickAnim - 27) / 5) * (3.52955-(17.12165)));
            yy = 4.98093 + (((tickAnim - 27) / 5) * (3.24136-(4.98093)));
            zz = -8.6822 + (((tickAnim - 27) / 5) * (-6.72594-(-8.6822)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 3.52955 + (((tickAnim - 32) / 5) * (-5.06255-(3.52955)));
            yy = 3.24136 + (((tickAnim - 32) / 5) * (1.50179-(3.24136)));
            zz = -6.72594 + (((tickAnim - 32) / 5) * (-4.76968-(-6.72594)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -5.06255 + (((tickAnim - 37) / 6) * (0-(-5.06255)));
            yy = 1.50179 + (((tickAnim - 37) / 6) * (0-(1.50179)));
            zz = -4.76968 + (((tickAnim - 37) / 6) * (0-(-4.76968)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (40.23749-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (-4.55749-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (-5.96275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -87.5 + (((tickAnim - 0) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 7) / 13) * (50-(40)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 50 + (((tickAnim - 20) / 7) * (-5-(50)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -5 + (((tickAnim - 27) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 43) / 7) * (-87.5-(-23.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLusovenator entity = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*2), hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*3)), hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 3) * (0-(-1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-1-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -1 + (((tickAnim - 5) / 7) * (-0.7-(-1)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 12) / 2) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (-1-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 17) / 3) * (-1-(-1)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2), tail.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2)), tail.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-1), tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3)), tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*1), tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5)), tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+130))*1), tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*5)), tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*1), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5)), tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+160))*1), tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5)), tail6.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2)));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-20))*-1.9414), body.rotateAngleY + (float) Math.toRadians(-0.6772-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2)), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-20))*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2), chest.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3)), chest.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2.5), rightarm.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*2.5)), rightarm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2.5)));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-5)));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), leftarm.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5)), leftarm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2.5)));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5)));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+10))*3), neck.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2)), neck.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2)));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*3), neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1)), neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1)));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-3), neck3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-3)), neck3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2)));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*1), head.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2)), head.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1)));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -44.88224 + (((tickAnim - 0) / 3) * (-13.23647-(-44.88224)));
            yy = -0.52168 + (((tickAnim - 0) / 3) * (0.43129-(-0.52168)));
            zz = 2.4416 + (((tickAnim - 0) / 3) * (-2.46021-(2.4416)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -13.23647 + (((tickAnim - 3) / 4) * (6.65789-(-13.23647)));
            yy = 0.43129 + (((tickAnim - 3) / 4) * (0.97754-(0.43129)));
            zz = -2.46021 + (((tickAnim - 3) / 4) * (-6.03074-(-2.46021)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 6.65789 + (((tickAnim - 7) / 3) * (22.5-(6.65789)));
            yy = 0.97754 + (((tickAnim - 7) / 3) * (0-(0.97754)));
            zz = -6.03074 + (((tickAnim - 7) / 3) * (0-(-6.03074)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 22.5 + (((tickAnim - 10) / 7) * (-32.5-(22.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -32.5 + (((tickAnim - 17) / 3) * (-44.88224-(-32.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.52168-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (2.4416-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 0) / 3) * (-2.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 3) / 7) * (42.5-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 42.5 + (((tickAnim - 10) / 4) * (37.5-(42.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 37.5 + (((tickAnim - 14) / 6) * (12.5-(37.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.99749 + (((tickAnim - 0) / 3) * (11.87159-(-4.99749)));
            yy = 0.03916 + (((tickAnim - 0) / 3) * (0.16724-(0.03916)));
            zz = 1.21285 + (((tickAnim - 0) / 3) * (1.04489-(1.21285)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 11.87159 + (((tickAnim - 3) / 3) * (-12.85854-(11.87159)));
            yy = 0.16724 + (((tickAnim - 3) / 3) * (0.33801-(0.16724)));
            zz = 1.04489 + (((tickAnim - 3) / 3) * (0.82094-(1.04489)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -12.85854 + (((tickAnim - 6) / 4) * (12.4788-(-12.85854)));
            yy = 0.33801 + (((tickAnim - 6) / 4) * (0.55147-(0.33801)));
            zz = 0.82094 + (((tickAnim - 6) / 4) * (0.54101-(0.82094)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 12.4788 + (((tickAnim - 10) / 6) * (-70.2157-(12.4788)));
            yy = 0.55147 + (((tickAnim - 10) / 6) * (0.25262-(0.55147)));
            zz = 0.54101 + (((tickAnim - 10) / 6) * (0.93292-(0.54101)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -70.2157 + (((tickAnim - 16) / 4) * (-4.99749-(-70.2157)));
            yy = 0.25262 + (((tickAnim - 16) / 4) * (0.03916-(0.25262)));
            zz = 0.93292 + (((tickAnim - 16) / 4) * (1.21285-(0.93292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 72.5 + (((tickAnim - 0) / 3) * (3.11794-(72.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.56773-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.43472-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 3.11794 + (((tickAnim - 3) / 1) * (33.44669-(3.11794)));
            yy = -0.56773 + (((tickAnim - 3) / 1) * (-0.56722-(-0.56773)));
            zz = 2.43472 + (((tickAnim - 3) / 1) * (3.70044-(2.43472)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 33.44669 + (((tickAnim - 4) / 2) * (63.67811-(33.44669)));
            yy = -0.56722 + (((tickAnim - 4) / 2) * (-0.0408-(-0.56722)));
            zz = 3.70044 + (((tickAnim - 4) / 2) * (2.49967-(3.70044)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 63.67811 + (((tickAnim - 6) / 1) * (61.96447-(63.67811)));
            yy = -0.0408 + (((tickAnim - 6) / 1) * (1.30863-(-0.0408)));
            zz = 2.49967 + (((tickAnim - 6) / 1) * (4.81942-(2.49967)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 61.96447 + (((tickAnim - 7) / 3) * (55-(61.96447)));
            yy = 1.30863 + (((tickAnim - 7) / 3) * (0-(1.30863)));
            zz = 4.81942 + (((tickAnim - 7) / 3) * (0-(4.81942)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 55 + (((tickAnim - 10) / 10) * (72.5-(55)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-39.03-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -39.03 + (((tickAnim - 4) / 2) * (-63.06-(-39.03)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -63.06 + (((tickAnim - 6) / 4) * (55-(-63.06)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 55 + (((tickAnim - 10) / 8) * (100-(55)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 100 + (((tickAnim - 18) / 2) * (25-(100)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 22.5 + (((tickAnim - 0) / 7) * (-32.5-(22.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -32.5 + (((tickAnim - 7) / 3) * (-44.88224-(-32.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.52168-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-2.4416-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -44.88224 + (((tickAnim - 10) / 3) * (-13.23647-(-44.88224)));
            yy = 0.52168 + (((tickAnim - 10) / 3) * (-0.43129-(0.52168)));
            zz = -2.4416 + (((tickAnim - 10) / 3) * (2.46021-(-2.4416)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -13.23647 + (((tickAnim - 13) / 4) * (6.65789-(-13.23647)));
            yy = -0.43129 + (((tickAnim - 13) / 4) * (-0.97754-(-0.43129)));
            zz = 2.46021 + (((tickAnim - 13) / 4) * (6.03074-(2.46021)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 6.65789 + (((tickAnim - 17) / 3) * (22.5-(6.65789)));
            yy = -0.97754 + (((tickAnim - 17) / 3) * (0-(-0.97754)));
            zz = 6.03074 + (((tickAnim - 17) / 3) * (0-(6.03074)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 42.5 + (((tickAnim - 0) / 4) * (37.5-(42.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 37.5 + (((tickAnim - 4) / 6) * (12.5-(37.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 10) / 3) * (-2.5-(12.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 13) / 7) * (42.5-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.4788 + (((tickAnim - 0) / 6) * (-70.2157-(12.4788)));
            yy = -0.55147 + (((tickAnim - 0) / 6) * (-0.25262-(-0.55147)));
            zz = -0.54101 + (((tickAnim - 0) / 6) * (-0.93292-(-0.54101)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -70.2157 + (((tickAnim - 6) / 4) * (-4.99749-(-70.2157)));
            yy = -0.25262 + (((tickAnim - 6) / 4) * (-0.03916-(-0.25262)));
            zz = -0.93292 + (((tickAnim - 6) / 4) * (-1.21285-(-0.93292)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -4.99749 + (((tickAnim - 10) / 3) * (11.87159-(-4.99749)));
            yy = -0.03916 + (((tickAnim - 10) / 3) * (-0.16724-(-0.03916)));
            zz = -1.21285 + (((tickAnim - 10) / 3) * (-1.04489-(-1.21285)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.87159 + (((tickAnim - 13) / 3) * (-12.85854-(11.87159)));
            yy = -0.16724 + (((tickAnim - 13) / 3) * (-0.33801-(-0.16724)));
            zz = -1.04489 + (((tickAnim - 13) / 3) * (-0.82094-(-1.04489)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -12.85854 + (((tickAnim - 16) / 4) * (12.4788-(-12.85854)));
            yy = -0.33801 + (((tickAnim - 16) / 4) * (-0.55147-(-0.33801)));
            zz = -0.82094 + (((tickAnim - 16) / 4) * (-0.54101-(-0.82094)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 55 + (((tickAnim - 0) / 10) * (72.5-(55)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 72.5 + (((tickAnim - 10) / 3) * (3.11794-(72.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.56773-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.43472-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 3.11794 + (((tickAnim - 13) / 1) * (33.44669-(3.11794)));
            yy = 0.56773 + (((tickAnim - 13) / 1) * (0.56722-(0.56773)));
            zz = -2.43472 + (((tickAnim - 13) / 1) * (-3.70044-(-2.43472)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 33.44669 + (((tickAnim - 14) / 2) * (63.67811-(33.44669)));
            yy = 0.56722 + (((tickAnim - 14) / 2) * (0.0408-(0.56722)));
            zz = -3.70044 + (((tickAnim - 14) / 2) * (-2.49967-(-3.70044)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 63.67811 + (((tickAnim - 16) / 1) * (61.96447-(63.67811)));
            yy = 0.0408 + (((tickAnim - 16) / 1) * (-1.30863-(0.0408)));
            zz = -2.49967 + (((tickAnim - 16) / 1) * (-4.81942-(-2.49967)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 61.96447 + (((tickAnim - 17) / 3) * (55-(61.96447)));
            yy = -1.30863 + (((tickAnim - 17) / 3) * (0-(-1.30863)));
            zz = -4.81942 + (((tickAnim - 17) / 3) * (0-(-4.81942)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 55 + (((tickAnim - 0) / 8) * (100-(55)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 100 + (((tickAnim - 8) / 2) * (25-(100)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 10) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (-39.03-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -39.03 + (((tickAnim - 14) / 2) * (-63.06-(-39.03)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -63.06 + (((tickAnim - 16) / 4) * (55-(-63.06)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-2), throat.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2)), throat.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1)));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLusovenator ee = (EntityPrehistoricFloraLusovenator) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animLookAround(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLusovenator e = (EntityPrehistoricFloraLusovenator) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Neck4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
