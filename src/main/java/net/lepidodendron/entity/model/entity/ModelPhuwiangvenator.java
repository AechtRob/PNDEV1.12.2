package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPhuwiangvenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPhuwiangvenator extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
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
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelPhuwiangvenator() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -5.75F, 5.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 10.5461F, -4.2886F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2138F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 22, -5.0F, -4.0F, -1.0F, 6, 4, 12, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.5F, 6.6461F, -5.0886F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -6.0F, -9.0F, -1.0F, 7, 9, 13, 0.01F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-3.5F, 3.6461F, -1.3386F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3054F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 70, -2.0F, -2.0F, -1.0F, 4, 11, 6, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 8.75F, -0.5F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6545F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 72, 12, -1.5F, 0.0F, -0.25F, 3, 12, 4, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 12.0F, 2.0F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6109F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 20, 70, -1.0F, -0.25F, -1.75F, 2, 7, 2, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.2618F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 78, 79, -1.5F, -0.25F, -2.75F, 3, 2, 4, 0.0F, false));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(1.0F, 0.75F, -2.5F);
        this.rightleg4.addChild(rightleg5);
        this.rightleg5.cubeList.add(new ModelBox(rightleg5, 20, 79, -3.0F, -1.0F, -3.6F, 4, 2, 4, 0.01F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(3.5F, 3.6461F, -1.3386F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3054F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 70, -2.0F, -2.0F, -1.0F, 4, 11, 6, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 8.75F, -0.5F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6545F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 72, 12, -1.5F, 0.0F, -0.25F, 3, 12, 4, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 12.0F, 2.0F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6109F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 20, 70, -1.0F, -0.25F, -1.75F, 2, 7, 2, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.2618F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 78, 79, -1.5F, -0.25F, -2.75F, 3, 2, 4, 0.0F, true));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(-1.0F, 0.75F, -2.5F);
        this.leftleg4.addChild(leftleg5);
        this.leftleg5.cubeList.add(new ModelBox(leftleg5, 20, 79, -1.0F, -1.0F, -3.6F, 4, 2, 4, 0.01F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 3.7461F, -5.0386F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, 5.4F, -8.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 38, -6.0F, -5.0F, -1.0F, 7, 5, 10, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, 3.725F, -7.8F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1134F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -7.0F, -9.0F, -1.0F, 8, 9, 10, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.6F, -9.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1745F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 4.1F, -6.1F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 68, -5.0F, -4.0F, -1.0F, 6, 4, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.5F, 3.6F, -6.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 41, -6.0F, -7.0F, -1.0F, 7, 7, 8, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-3.0F, 3.4F, -5.35F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.6981F, 0.0F, 0.2618F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 30, 85, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 4.25F, 0.3F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.8727F, -0.1309F, -0.0873F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 58, 85, -0.99F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.5F, 3.75F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0436F, 0.0F, -0.1745F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 30, 41, -0.5F, -0.25F, -1.0F, 1, 6, 1, 0.0F, false));
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 66, 17, -0.5F, -0.25F, 0.0F, 1, 4, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.75F, 0.35F);
        this.rightarm3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 48, 0.02F, 1.0F, -1.0F, 1, 4, 1, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(3.0F, 3.4F, -5.35F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.6981F, 0.0F, -0.2618F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 30, 85, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 4.25F, 0.3F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8727F, 0.1309F, 0.0873F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 58, 85, -1.01F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.5F, 3.75F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0436F, 0.0F, 0.1745F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 30, 41, -0.5F, -0.25F, -1.0F, 1, 6, 1, 0.0F, true));
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 66, 17, -0.5F, -0.25F, 0.0F, 1, 4, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.75F, 0.35F);
        this.leftarm3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 48, -1.02F, 1.0F, -1.0F, 1, 4, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.5F, -5.75F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.6109F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 70, 0, -2.5F, -2.5F, -4.5F, 5, 6, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.25F, -4.25F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.48F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 70, 38, -2.0F, -2.1F, -4.75F, 4, 5, 6, -0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -4.75F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3491F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 72, 28, -1.5F, -2.0F, -3.25F, 3, 5, 4, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.75F, 0.25F);
        this.neck3.addChild(throat);
        this.setRotateAngle(throat, 0.2618F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 84, 55, -1.0F, -1.0F, -2.75F, 2, 2, 4, -0.01F, false));
        this.throat.cubeList.add(new ModelBox(throat, 66, 85, 0.0F, 0.9F, -2.75F, 0, 2, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 36, 79, -1.5F, -0.25F, -2.75F, 3, 2, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 17, -1.5F, -1.1F, -2.75F, 3, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.65F, 0.1F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 20, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.425F, -1.55F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 49, -1.0F, -1.0F, -1.9F, 2, 1, 3, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 2.15F, -9.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.1868F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 68, 0.0F, -0.95F, -0.025F, 1, 1, 1, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.65F, 1.25F, -7.775F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2487F, 0.2138F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 85, 0.0F, -1.0F, 1.85F, 1, 1, 4, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.65F, 1.25F, -7.775F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2487F, -0.2138F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 85, -1.0F, -1.0F, 1.85F, 1, 1, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.45F, -4.625F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.24F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 84, 71, -1.0F, -1.0F, -1.925F, 2, 1, 4, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 1.825F, -9.275F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3142F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 86, 23, 0.0F, -0.05F, 0.95F, 1, 1, 2, -0.02F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 74, 85, 0.0F, -0.95F, 0.025F, 1, 1, 3, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 2.5F, -8.25F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 54, 17, -2.0F, -1.925F, 2.0F, 2, 1, 4, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 2.975F, -7.75F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 86, 12, 0.0F, -1.0F, -1.425F, 1, 1, 3, -0.015F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 41, 1.25F, -1.0F, 2.5F, 0, 1, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 41, -0.25F, -1.0F, 2.5F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 2.475F, -8.25F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 85, -1.0F, -0.925F, -1.475F, 1, 1, 4, 0.015F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 79, -1.5F, -0.925F, 2.0F, 2, 1, 5, 0.02F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.5F, 0.5F, -1.75F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 84, 76, -2.0F, -1.0F, -1.0F, 3, 1, 2, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.75F, 1.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.096F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 64, 79, -1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 84, 49, -1.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 2.15F, -8.25F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2967F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 82, 85, 0.0F, -1.175F, -1.75F, 1, 1, 3, -0.02F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 2.85F, -9.0F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 84, 66, -1.0F, -1.0F, 1.925F, 2, 1, 4, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 2.9F, -8.325F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.24F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 54, 70, 0.0F, -0.55F, -2.2F, 1, 1, 1, -0.02F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 2.35F, -8.4F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2094F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 86, 16, 0.0F, -0.55F, -1.35F, 1, 1, 3, -0.015F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 85, 0.0F, -1.0F, -2.2F, 1, 1, 4, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.525F, -8.4F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3403F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 84, 61, -1.0F, -1.0F, 1.3F, 2, 1, 4, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 2.5461F, 7.4114F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 40, 0, -2.5F, -3.0F, -1.5F, 5, 7, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 53, -2.0F, -2.75F, -1.5F, 4, 5, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.75F, 8.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 58, 53, -1.5F, -1.75F, -1.0F, 3, 3, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.75F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 58, 66, -1.0F, -0.75F, -1.0F, 2, 2, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2618F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 56, -0.5F, -0.25F, -0.25F, 1, 1, 13, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck3, 0.1963F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1572F, -0.0431F, 0.0068F);
        this.setRotateAngle(neck1, -0.1747F, 0.0473F, -0.0083F);
        this.setRotateAngle(jaw, 0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.2138F, 0.0F, 0.0F);
        this.neck1.offsetY = -0F;
        this.neck1.offsetX = -0F;
        this.neck1.offsetZ = 0.02F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {


        this.hips.offsetY = -0.14F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.6F;
        this.hips.offsetX = 0.1F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(240);
        this.hips.rotateAngleX = (float)Math.toRadians(-0);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
        this.hips.scaleChildren = true;
        float scaler = 0.45F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraPhuwiangvenator EntityMegalosaurus = (EntityPrehistoricFloraPhuwiangvenator) e;
//        this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
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

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraPhuwiangvenator ee = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisp(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }
    public void animDisp(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangvenator entity = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;
        int animCycle = 151;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 1) / 87) * (-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 1) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 87) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 151) {
            xx = -30 + (((tickAnim - 88) / 63) * (-20.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-20-(-30)));
            yy = 0 + (((tickAnim - 88) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 63) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 152) {
            xx = -20.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-20 + (((tickAnim - 151) / 1) * (0-(-20.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-20)));
            yy = 0 + (((tickAnim - 151) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 21) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 67) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 21) / 67) * (1.35-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 88) / 16) * (0-(0)));
            yy = -1.25 + (((tickAnim - 88) / 16) * (-1.25-(-1.25)));
            zz = 1.35 + (((tickAnim - 88) / 16) * (1-(1.35)));
        }
        else if (tickAnim >= 104 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 104) / 48) * (0-(0)));
            yy = -1.25 + (((tickAnim - 104) / 48) * (0-(-1.25)));
            zz = 1 + (((tickAnim - 104) / 48) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 1) / 87) * (30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 1) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 87) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 151) {
            xx = 30 + (((tickAnim - 88) / 63) * (19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*20-(30)));
            yy = 0 + (((tickAnim - 88) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 63) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 152) {
            xx = 19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*20 + (((tickAnim - 151) / 1) * (0-(19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*20)));
            yy = 0 + (((tickAnim - 151) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 1) / 87) * (30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 1) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 87) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 151) {
            xx = 30 + (((tickAnim - 88) / 63) * (19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*20-(30)));
            yy = 0 + (((tickAnim - 88) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 63) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 152) {
            xx = 19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*20 + (((tickAnim - 151) / 1) * (0-(19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*20)));
            yy = 0 + (((tickAnim - 151) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (-33.28807-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (14.40477-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (52.42693-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = -33.28807 + (((tickAnim - 88) / 64) * (0-(-33.28807)));
            yy = 14.40477 + (((tickAnim - 88) / 64) * (0-(14.40477)));
            zz = 52.42693 + (((tickAnim - 88) / 64) * (0-(52.42693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (-33.28807-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (-14.40477-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (-52.42693-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = -33.28807 + (((tickAnim - 88) / 64) * (0-(-33.28807)));
            yy = -14.40477 + (((tickAnim - 88) / 64) * (0-(-14.40477)));
            zz = -52.42693 + (((tickAnim - 88) / 64) * (0-(-52.42693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = -6.75 + (((tickAnim - 18) / 70) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 88) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 64) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1 + (((tickAnim - 88) / 64) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = -1 + (((tickAnim - 18) / 70) * (0-(-1)));
            yy = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 88) / 37) * (21.25-(0)));
            yy = 0 + (((tickAnim - 88) / 37) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 88) / 37) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 125 && tickAnim < 152) {
            xx = 21.25 + (((tickAnim - 125) / 27) * (0-(21.25)));
            yy = 0 + (((tickAnim - 125) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = 17 + (((tickAnim - 18) / 70) * (0-(17)));
            yy = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*3-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 88) / 37) * (19.75-(0)));
            yy = 0 + (((tickAnim - 88) / 37) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*3 + (((tickAnim - 88) / 37) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*3)));
        }
        else if (tickAnim >= 125 && tickAnim < 152) {
            xx = 19.75 + (((tickAnim - 125) / 27) * (0-(19.75)));
            yy = 0 + (((tickAnim - 125) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.6-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            zz = 0.6 + (((tickAnim - 18) / 70) * (0-(0.6)));
        }
        else if (tickAnim >= 88 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 88) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 37) * (0.7-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 125) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 27) * (0-(0)));
            zz = 0.7 + (((tickAnim - 125) / 27) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = -22.5 + (((tickAnim - 18) / 70) * (-15-(-22.5)));
            yy = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = -15 + (((tickAnim - 88) / 64) * (0-(-15)));
            yy = 0 + (((tickAnim - 88) / 64) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 88) / 64) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            yy = -1.775 + (((tickAnim - 18) / 70) * (-0.95-(-1.775)));
            zz = 0.425 + (((tickAnim - 18) / 70) * (0-(0.425)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 88) / 64) * (0-(0)));
            yy = -0.95 + (((tickAnim - 88) / 64) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 88) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = 18.75 + (((tickAnim - 18) / 70) * (28.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*55-(18.75)));
            yy = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*1-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 125) {
            xx = 28.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*55 + (((tickAnim - 88) / 37) * (19-(28.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*55)));
            yy = 0 + (((tickAnim - 88) / 37) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*1 + (((tickAnim - 88) / 37) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*1)));
        }
        else if (tickAnim >= 125 && tickAnim < 152) {
            xx = 19 + (((tickAnim - 125) / 27) * (0-(19)));
            yy = 0 + (((tickAnim - 125) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.625-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            yy = 0.025 + (((tickAnim - 18) / 70) * (0-(0.025)));
            zz = 0.625 + (((tickAnim - 18) / 70) * (0-(0.625)));
        }
        else if (tickAnim >= 88 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 88) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 18) * (0.765-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 106) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 19) * (0-(0)));
            zz = 0.765 + (((tickAnim - 106) / 19) * (0.7-(0.765)));
        }
        else if (tickAnim >= 125 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 125) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 27) * (0-(0)));
            zz = 0.7 + (((tickAnim - 125) / 27) * (0-(0.7)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 8.5 + (((tickAnim - 10) / 8) * (0-(8.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 152) {
            xx = 7 + (((tickAnim - 18) / 134) * (0-(7)));
            yy = 0 + (((tickAnim - 18) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 134) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = 5.75 + (((tickAnim - 88) / 64) * (0-(5.75)));
            yy = 0 + (((tickAnim - 88) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.7602-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.78515-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.48334-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 88) {
            xx = -0.7602 + (((tickAnim - 18) / 70) * (20.23541-(-0.7602)));
            yy = -0.78515 + (((tickAnim - 18) / 70) * (-3.7473-(-0.78515)));
            zz = 0.48334 + (((tickAnim - 18) / 70) * (2.30687-(0.48334)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = 20.23541 + (((tickAnim - 88) / 64) * (0-(20.23541)));
            yy = -3.7473 + (((tickAnim - 88) / 64) * (0-(-3.7473)));
            zz = 2.30687 + (((tickAnim - 88) / 64) * (0-(2.30687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-12.81-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 59) {
            xx = -12.81 + (((tickAnim - 18) / 41) * (5.71-(-12.81)));
            yy = 0 + (((tickAnim - 18) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 41) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 88) {
            xx = 5.71 + (((tickAnim - 59) / 29) * (9.25-(5.71)));
            yy = 0 + (((tickAnim - 59) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 29) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = 9.25 + (((tickAnim - 88) / 64) * (0-(9.25)));
            yy = 0 + (((tickAnim - 88) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-0.62-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 88) {
            xx = -0.62 + (((tickAnim - 59) / 29) * (22.75-(-0.62)));
            yy = 0 + (((tickAnim - 59) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 29) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 152) {
            xx = 22.75 + (((tickAnim - 88) / 64) * (0-(22.75)));
            yy = 0 + (((tickAnim - 88) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangvenator entity = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 8.5 + (((tickAnim - 4) / 5) * (11.25-(8.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 11.25 + (((tickAnim - 9) / 4) * (0-(11.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -15.75 + (((tickAnim - 4) / 5) * (18.5-(-15.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 18.5 + (((tickAnim - 9) / 4) * (0-(18.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.125-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 1.125 + (((tickAnim - 4) / 5) * (0-(1.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 18.75 + (((tickAnim - 4) / 5) * (-7.25-(18.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -7.25 + (((tickAnim - 9) / 4) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.8-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0.8 + (((tickAnim - 4) / 5) * (0-(0.8)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -10.75 + (((tickAnim - 4) / 3) * (-23.37-(-10.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -23.37 + (((tickAnim - 7) / 2) * (-15.5-(-23.37)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -15.5 + (((tickAnim - 9) / 4) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 5) / 3) * (27.13-(11.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 27.13 + (((tickAnim - 8) / 2) * (0-(27.13)));
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
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangvenator entity = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 34.75 + (((tickAnim - 10) / 10) * (0-(34.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 10) / 10) * (0-(0.35)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 34.5 + (((tickAnim - 10) / 10) * (0-(34.5)));
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
            yy = 0 + (((tickAnim - 0) / 10) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 10) / 10) * (0-(-0.1)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18 + (((tickAnim - 5) / 5) * (0-(18)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.575-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.575 + (((tickAnim - 5) / 5) * (0-(0.575)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 24 + (((tickAnim - 5) / 5) * (0-(24)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangvenator entity = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 33.25 + (((tickAnim - 25) / 25) * (0-(33.25)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 22.25 + (((tickAnim - 25) / 25) * (0-(22.25)));
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
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (-56.75-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -56.75 + (((tickAnim - 38) / 5) * (-56.75-(-56.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -56.75 + (((tickAnim - 43) / 7) * (0-(-56.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -12 + (((tickAnim - 6) / 9) * (57.43-(-12)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 57.43 + (((tickAnim - 15) / 10) * (28.25-(57.43)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 28.25 + (((tickAnim - 25) / 13) * (74.63-(28.25)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 74.63 + (((tickAnim - 38) / 5) * (74.63-(74.63)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 74.63 + (((tickAnim - 43) / 7) * (0-(74.63)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.95 + (((tickAnim - 6) / 4) * (-0.71-(-0.95)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.21-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.71 + (((tickAnim - 10) / 5) * (-1.425-(-0.71)));
            zz = -0.21 + (((tickAnim - 10) / 5) * (-0.775-(-0.21)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -1.425 + (((tickAnim - 15) / 10) * (0-(-1.425)));
            zz = -0.775 + (((tickAnim - 15) / 10) * (0-(-0.775)));
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
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-40.32-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -40.32 + (((tickAnim - 10) / 5) * (-50.75-(-40.32)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -50.75 + (((tickAnim - 15) / 10) * (30-(-50.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 30 + (((tickAnim - 25) / 25) * (0-(30)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 9) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 10) * (0-(-0.275)));
            zz = 0.575 + (((tickAnim - 15) / 10) * (0-(0.575)));
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
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangvenator entity = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9 + (((tickAnim - 20) / 10) * (-9-(-9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 30) / 20) * (0-(-9)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-11.925-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -11.925 + (((tickAnim - 20) / 10) * (-11.925-(-11.925)));
            zz = 1.5 + (((tickAnim - 20) / 10) * (1.5-(1.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -11.925 + (((tickAnim - 30) / 20) * (0-(-11.925)));
            zz = 1.5 + (((tickAnim - 30) / 20) * (0-(1.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -20.5 + (((tickAnim - 20) / 10) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -20.5 + (((tickAnim - 30) / 20) * (0-(-20.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (50.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 50.25 + (((tickAnim - 20) / 10) * (50.25-(50.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 50.25 + (((tickAnim - 30) / 20) * (0-(50.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-95.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -95.75 + (((tickAnim - 20) / 10) * (-95.75-(-95.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -95.75 + (((tickAnim - 30) / 20) * (0-(-95.75)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.8-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.7 + (((tickAnim - 20) / 10) * (-0.7-(-0.7)));
            zz = -0.8 + (((tickAnim - 20) / 10) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.7 + (((tickAnim - 30) / 20) * (0-(-0.7)));
            zz = -0.8 + (((tickAnim - 30) / 20) * (0-(-0.8)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (74.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 74.5 + (((tickAnim - 20) / 10) * (74.5-(74.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 74.5 + (((tickAnim - 30) / 20) * (0-(74.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 20) / 10) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.4 + (((tickAnim - 30) / 20) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -20.5 + (((tickAnim - 20) / 10) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -20.5 + (((tickAnim - 30) / 20) * (0-(-20.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (50.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 50.25 + (((tickAnim - 20) / 10) * (50.25-(50.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 50.25 + (((tickAnim - 30) / 20) * (0-(50.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-95.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -95.75 + (((tickAnim - 20) / 10) * (-95.75-(-95.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -95.75 + (((tickAnim - 30) / 20) * (0-(-95.75)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.8-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.7 + (((tickAnim - 20) / 10) * (-0.7-(-0.7)));
            zz = -0.8 + (((tickAnim - 20) / 10) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.7 + (((tickAnim - 30) / 20) * (0-(-0.7)));
            zz = -0.8 + (((tickAnim - 30) / 20) * (0-(-0.8)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (74.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 74.5 + (((tickAnim - 20) / 10) * (74.5-(74.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 74.5 + (((tickAnim - 30) / 20) * (0-(74.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 20) / 10) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.4 + (((tickAnim - 30) / 20) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 20) / 10) * (3-(3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 30) / 20) * (0-(3)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.025 + (((tickAnim - 20) / 10) * (-0.025-(-0.025)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.025 + (((tickAnim - 30) / 20) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 26 + (((tickAnim - 20) / 10) * (26-(26)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 26 + (((tickAnim - 30) / 20) * (0-(26)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3 + (((tickAnim - 20) / 10) * (-3-(-3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 30) / 20) * (0-(-3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.4 + (((tickAnim - 20) / 10) * (0.4-(0.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.4 + (((tickAnim - 30) / 20) * (0-(0.4)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 20) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -6.75 + (((tickAnim - 30) / 9) * (-0.66-(-6.75)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -0.66 + (((tickAnim - 39) / 11) * (0-(-0.66)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (3.77-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 3.77 + (((tickAnim - 9) / 11) * (-12.5-(3.77)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 20) / 10) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -12.5 + (((tickAnim - 30) / 9) * (0.23-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0.23 + (((tickAnim - 39) / 11) * (0-(0.23)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.015-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.2-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.015 + (((tickAnim - 9) / 11) * (0.2-(0.015)));
            zz = 0.2 + (((tickAnim - 9) / 11) * (0-(0.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 10) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 9) * (0-(0.2)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7 + (((tickAnim - 20) / 10) * (-7-(-7)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 30) / 20) * (0-(-7)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-8.98-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -8.98 + (((tickAnim - 12) / 8) * (-13.25-(-8.98)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.25 + (((tickAnim - 20) / 10) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 30) / 20) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (3-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 20) / 10) * (3-(3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 30) / 20) * (0-(3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (16.25-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16.25 + (((tickAnim - 20) / 10) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 16.25 + (((tickAnim - 30) / 9) * (0-(16.25)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (31.75-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 31.75 + (((tickAnim - 20) / 10) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 31.75 + (((tickAnim - 30) / 6) * (0-(31.75)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangvenator entity = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.82-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 2.82 + (((tickAnim - 8) / 15) * (-7.5-(2.82)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780))*1-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 23) / 17) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780))*1 + (((tickAnim - 23) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.49-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -5.49 + (((tickAnim - 8) / 15) * (-0.75-(-5.49)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780-50))*4-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -0.75 + (((tickAnim - 23) / 17) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780-50))*4 + (((tickAnim - 23) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780-50))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.675-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = -0.15 + (((tickAnim - 23) / 17) * (0-(-0.15)));
            zz = 0.675 + (((tickAnim - 23) / 17) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4.62-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -4.62 + (((tickAnim - 8) / 15) * (-3.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-10-(-4.62)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780-150))*-5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -3.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-10 + (((tickAnim - 23) / 17) * (0-(-3.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-10)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780-150))*-5 + (((tickAnim - 23) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*780-150))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.175-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 0.15 + (((tickAnim - 23) / 17) * (0-(0.15)));
            zz = 0.175 + (((tickAnim - 23) / 17) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-250))*8-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-250))*8 + (((tickAnim - 23) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-250))*8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.43-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 4.43 + (((tickAnim - 8) / 15) * (-7.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-25-(4.43)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -7.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-25 + (((tickAnim - 23) / 17) * (0-(-7.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0.175 + (((tickAnim - 8) / 15) * (0-(0.175)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.87-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.87 + (((tickAnim - 8) / 5) * (0-(12.87)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (10.75-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 27) / 8) * (0-(10.75)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPhuwiangvenator entity = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-20))*6), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-80))*-1.25);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 44.22881 + (((tickAnim - 0) / 5) * (-22.93894-(44.22881)));
            yy = 8.30169 + (((tickAnim - 0) / 5) * (-2.50825-(8.30169)));
            zz = -3.32494 + (((tickAnim - 0) / 5) * (-2.78858-(-3.32494)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -22.93894 + (((tickAnim - 5) / 2) * (-19.43894-(-22.93894)));
            yy = -2.50825 + (((tickAnim - 5) / 2) * (-2.50825-(-2.50825)));
            zz = -2.78858 + (((tickAnim - 5) / 2) * (-2.78858-(-2.78858)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -19.43894 + (((tickAnim - 7) / 6) * (44.22881-(-19.43894)));
            yy = -2.50825 + (((tickAnim - 7) / 6) * (8.30169-(-2.50825)));
            zz = -2.78858 + (((tickAnim - 7) / 6) * (-3.32494-(-2.78858)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 26.5 + (((tickAnim - 0) / 2) * (50.37-(26.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 50.37 + (((tickAnim - 2) / 5) * (0-(50.37)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (26.5-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.225-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.375 + (((tickAnim - 7) / 6) * (0-(-0.375)));
            zz = 0.225 + (((tickAnim - 7) / 6) * (0-(0.225)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-58.31-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -58.31 + (((tickAnim - 3) / 1) * (-58.31-(-58.31)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -58.31 + (((tickAnim - 4) / 3) * (-28.5-(-58.31)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -28.5 + (((tickAnim - 7) / 1) * (-1.62-(-28.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -1.62 + (((tickAnim - 8) / 5) * (0-(-1.62)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.475-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 7) / 6) * (0-(-0.075)));
            zz = 0.475 + (((tickAnim - 7) / 6) * (0-(0.475)));
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
            xx = 45 + (((tickAnim - 0) / 7) * (66.75-(45)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 66.75 + (((tickAnim - 7) / 1) * (-4.03451-(66.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.85605-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (2.86547-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -4.03451 + (((tickAnim - 8) / 1) * (-15.02214-(-4.03451)));
            yy = -0.85605 + (((tickAnim - 8) / 1) * (-0.58904-(-0.85605)));
            zz = 2.86547 + (((tickAnim - 8) / 1) * (2.44145-(2.86547)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -15.02214 + (((tickAnim - 9) / 2) * (50.99046-(-15.02214)));
            yy = -0.58904 + (((tickAnim - 9) / 2) * (0.56224-(-0.58904)));
            zz = 2.44145 + (((tickAnim - 9) / 2) * (3.52015-(2.44145)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 50.99046 + (((tickAnim - 11) / 2) * (45-(50.99046)));
            yy = 0.56224 + (((tickAnim - 11) / 2) * (0-(0.56224)));
            zz = 3.52015 + (((tickAnim - 11) / 2) * (0-(3.52015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 7) * (0-(-0.25)));
            zz = -0.225 + (((tickAnim - 0) / 7) * (0-(-0.225)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 8) / 1) * (-0.9-(-0.4)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.9 + (((tickAnim - 9) / 1) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 9) / 1) * (-0.34-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (-1.08-(0)));
            zz = -0.34 + (((tickAnim - 10) / 1) * (-0.69-(-0.34)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -1.08 + (((tickAnim - 11) / 2) * (-0.25-(-1.08)));
            zz = -0.69 + (((tickAnim - 11) / 2) * (-0.225-(-0.69)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 24.5 + (((tickAnim - 0) / 7) * (17-(24.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 17 + (((tickAnim - 7) / 1) * (0-(17)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (-80.95-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -80.95 + (((tickAnim - 11) / 2) * (24.5-(-80.95)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 11) / 2) * (0-(-0.5)));
            zz = -0.5 + (((tickAnim - 11) / 2) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg5.rotationPointX = this.rightleg5.rotationPointX + (float)(xx);
        this.rightleg5.rotationPointY = this.rightleg5.rotationPointY - (float)(yy);
        this.rightleg5.rotationPointZ = this.rightleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -19.43894 + (((tickAnim - 0) / 7) * (44.22881-(-19.43894)));
            yy = 2.50825 + (((tickAnim - 0) / 7) * (-8.30169-(2.50825)));
            zz = 2.78858 + (((tickAnim - 0) / 7) * (3.32494-(2.78858)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 44.22881 + (((tickAnim - 7) / 5) * (-33.93894-(44.22881)));
            yy = -8.30169 + (((tickAnim - 7) / 5) * (2.50825-(-8.30169)));
            zz = 3.32494 + (((tickAnim - 7) / 5) * (2.78858-(3.32494)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -33.93894 + (((tickAnim - 12) / 1) * (-19.43894-(-33.93894)));
            yy = 2.50825 + (((tickAnim - 12) / 1) * (2.50825-(2.50825)));
            zz = 2.78858 + (((tickAnim - 12) / 1) * (2.78858-(2.78858)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 26.5 + (((tickAnim - 7) / 1) * (50.37-(26.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 50.37 + (((tickAnim - 8) / 5) * (0-(50.37)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 7) * (0-(-0.375)));
            zz = 0.225 + (((tickAnim - 0) / 7) * (0-(0.225)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.75 + (((tickAnim - 0) / 2) * (-1.62-(-17.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -1.62 + (((tickAnim - 2) / 5) * (0-(-1.62)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-58.31-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -58.31 + (((tickAnim - 10) / 1) * (-58.31-(-58.31)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -58.31 + (((tickAnim - 11) / 2) * (-17.75-(-58.31)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 7) * (0-(-0.075)));
            zz = 0.475 + (((tickAnim - 0) / 7) * (0-(0.475)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.475-(0)));
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
            xx = 66.75 + (((tickAnim - 0) / 2) * (-2.02214-(66.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.58904-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-2.44145-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.02214 + (((tickAnim - 2) / 1) * (-14.77214-(-2.02214)));
            yy = 0.58904 + (((tickAnim - 2) / 1) * (0.58904-(0.58904)));
            zz = -2.44145 + (((tickAnim - 2) / 1) * (-2.44145-(-2.44145)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -14.77214 + (((tickAnim - 3) / 1) * (50.99046-(-14.77214)));
            yy = 0.58904 + (((tickAnim - 3) / 1) * (-0.56224-(0.58904)));
            zz = -2.44145 + (((tickAnim - 3) / 1) * (-3.52015-(-2.44145)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 50.99046 + (((tickAnim - 4) / 3) * (45-(50.99046)));
            yy = -0.56224 + (((tickAnim - 4) / 3) * (0-(-0.56224)));
            zz = -3.52015 + (((tickAnim - 4) / 3) * (0-(-3.52015)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 45 + (((tickAnim - 7) / 3) * (92.34-(45)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 92.34 + (((tickAnim - 10) / 3) * (66.75-(92.34)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 2) / 1) * (-0.725-(-0.4)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.725 + (((tickAnim - 3) / 0) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 3) / 0) * (-0.34-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-1.08-(0)));
            zz = -0.34 + (((tickAnim - 3) / 1) * (-0.69-(-0.34)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -1.08 + (((tickAnim - 4) / 3) * (-0.25-(-1.08)));
            zz = -0.69 + (((tickAnim - 4) / 3) * (-0.225-(-0.69)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 7) / 6) * (0-(-0.25)));
            zz = -0.225 + (((tickAnim - 7) / 6) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.5 + (((tickAnim - 0) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-78.45-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -78.45 + (((tickAnim - 4) / 3) * (24.5-(-78.45)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 24.5 + (((tickAnim - 7) / 6) * (2.5-(24.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-0.15-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 4) / 3) * (0-(-0.55)));
            zz = -0.15 + (((tickAnim - 4) / 3) * (0-(-0.15)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-140))*4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-250))*6), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(21+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-250))*6), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(-26.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-350))*6), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(0);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(0);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(0.475);


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(21+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-250))*6), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(-26.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-350))*6), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(0);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(0);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(0.475);


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(22.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-350))*-4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-340))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-380))*6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-17.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-380))*-6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0.075);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(-0.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*-2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-90))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-90))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-90))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-200))*6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-90))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-250))*7), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*15), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-90))*3));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPhuwiangvenator entity = (EntityPrehistoricFloraPhuwiangvenator) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-90))*2.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-140))*0.59);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-180))*0.5);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 21.97881 + (((tickAnim - 0) / 13) * (-24.43894-(21.97881)));
            yy = 8.30169 + (((tickAnim - 0) / 13) * (-2.50825-(8.30169)));
            zz = -3.32494 + (((tickAnim - 0) / 13) * (-2.78858-(-3.32494)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -24.43894 + (((tickAnim - 13) / 15) * (21.97881-(-24.43894)));
            yy = -2.50825 + (((tickAnim - 13) / 15) * (8.30169-(-2.50825)));
            zz = -2.78858 + (((tickAnim - 13) / 15) * (-3.32494-(-2.78858)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.25 + (((tickAnim - 0) / 5) * (51.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-65-(19.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 51.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-65 + (((tickAnim - 5) / 8) * (5.5-(51.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-65)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 5.5 + (((tickAnim - 13) / 15) * (19.25-(5.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = -0.375 + (((tickAnim - 13) / 15) * (0-(-0.375)));
            zz = 0.225 + (((tickAnim - 13) / 15) * (0-(0.225)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (-53.12-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -53.12 + (((tickAnim - 7) / 3) * (-53.12-(-53.12)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -53.12 + (((tickAnim - 10) / 3) * (2.25-(-53.12)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 2.25 + (((tickAnim - 13) / 15) * (0-(2.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 13) / 15) * (0-(-0.3)));
            zz = 0.2 + (((tickAnim - 13) / 15) * (0-(0.2)));
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
            xx = 45 + (((tickAnim - 0) / 3) * (71.58-(45)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 71.58 + (((tickAnim - 3) / 4) * (73.87-(71.58)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 73.87 + (((tickAnim - 7) / 3) * (73.87-(73.87)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 73.87 + (((tickAnim - 10) / 3) * (16.96844-(73.87)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.31338-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (4.06129-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16.96844 + (((tickAnim - 13) / 5) * (0-(16.96844)));
            yy = 1.31338 + (((tickAnim - 13) / 5) * (0-(1.31338)));
            zz = 4.06129 + (((tickAnim - 13) / 5) * (0-(4.06129)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (41.83438-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.47033-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (2.58585-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 41.83438 + (((tickAnim - 23) / 5) * (45-(41.83438)));
            yy = 0.47033 + (((tickAnim - 23) / 5) * (0-(0.47033)));
            zz = 2.58585 + (((tickAnim - 23) / 5) * (0-(2.58585)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 7) * (0.765-(-0.25)));
            zz = -0.225 + (((tickAnim - 0) / 7) * (-0.09-(-0.225)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.765 + (((tickAnim - 7) / 3) * (0.765-(0.765)));
            zz = -0.09 + (((tickAnim - 7) / 3) * (-0.09-(-0.09)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.765 + (((tickAnim - 10) / 3) * (-0.775-(0.765)));
            zz = -0.09 + (((tickAnim - 10) / 3) * (0.55-(-0.09)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.775 + (((tickAnim - 13) / 3) * (0.335-(-0.775)));
            zz = 0.55 + (((tickAnim - 13) / 3) * (0.22-(0.55)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.335 + (((tickAnim - 16) / 2) * (0.225-(0.335)));
            zz = 0.22 + (((tickAnim - 16) / 2) * (0-(0.22)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 18) / 2) * (0.01-(0.225)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.06-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 20) / 3) * (-1.225-(0.01)));
            zz = -0.06 + (((tickAnim - 20) / 3) * (-0.25-(-0.06)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -1.225 + (((tickAnim - 23) / 5) * (-0.25-(-1.225)));
            zz = -0.25 + (((tickAnim - 23) / 5) * (-0.225-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 24.5 + (((tickAnim - 0) / 13) * (0-(24.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-63.5-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -63.5 + (((tickAnim - 23) / 5) * (24.5-(-63.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.475-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 23) / 5) * (0-(-0.175)));
            zz = 0.475 + (((tickAnim - 23) / 5) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg5.rotationPointX = this.rightleg5.rotationPointX + (float)(xx);
        this.rightleg5.rotationPointY = this.rightleg5.rotationPointY - (float)(yy);
        this.rightleg5.rotationPointZ = this.rightleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -24.43894 + (((tickAnim - 0) / 14) * (21.97881-(-24.43894)));
            yy = 2.50825 + (((tickAnim - 0) / 14) * (-8.30169-(2.50825)));
            zz = 2.78858 + (((tickAnim - 0) / 14) * (3.32494-(2.78858)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 21.97881 + (((tickAnim - 14) / 14) * (-24.43894-(21.97881)));
            yy = -8.30169 + (((tickAnim - 14) / 14) * (2.50825-(-8.30169)));
            zz = 3.32494 + (((tickAnim - 14) / 14) * (2.78858-(3.32494)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 5.5 + (((tickAnim - 0) / 14) * (19.25-(5.5)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 19.25 + (((tickAnim - 14) / 4) * (-3.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*65-(19.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -3.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*65 + (((tickAnim - 18) / 10) * (5.5-(-3.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*65)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 14) * (0-(-0.375)));
            zz = 0.225 + (((tickAnim - 0) / 14) * (0-(0.225)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 2.25 + (((tickAnim - 0) / 14) * (0-(2.25)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (-53.12-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -53.12 + (((tickAnim - 21) / 3) * (-53.12-(-53.12)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -53.12 + (((tickAnim - 24) / 4) * (2.25-(-53.12)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 14) * (0-(-0.3)));
            zz = 0.2 + (((tickAnim - 0) / 14) * (0-(0.2)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 19.96844 + (((tickAnim - 0) / 4) * (0-(19.96844)));
            yy = -1.31338 + (((tickAnim - 0) / 4) * (0-(-1.31338)));
            zz = -4.06129 + (((tickAnim - 0) / 4) * (-3.25-(-4.06129)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (41.83438-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0.47033-(0)));
            zz = -3.25 + (((tickAnim - 4) / 5) * (2.58585-(-3.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 41.83438 + (((tickAnim - 9) / 5) * (45-(41.83438)));
            yy = 0.47033 + (((tickAnim - 9) / 5) * (0-(0.47033)));
            zz = 2.58585 + (((tickAnim - 9) / 5) * (0-(2.58585)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 45 + (((tickAnim - 14) / 3) * (71.58-(45)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 71.58 + (((tickAnim - 17) / 4) * (73.87-(71.58)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 73.87 + (((tickAnim - 21) / 3) * (73.87-(73.87)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 73.87 + (((tickAnim - 24) / 4) * (16.96844-(73.87)));
            yy = 0 + (((tickAnim - 24) / 4) * (-1.31338-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (-4.06129-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.775 + (((tickAnim - 0) / 3) * (0.335-(-0.775)));
            zz = 0.55 + (((tickAnim - 0) / 3) * (0.22-(0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.335 + (((tickAnim - 3) / 1) * (0.225-(0.335)));
            zz = 0.22 + (((tickAnim - 3) / 1) * (0-(0.22)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 4) / 3) * (0.01-(0.225)));
            zz = 0 + (((tickAnim - 4) / 3) * (-0.06-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 7) / 2) * (-1.225-(0.01)));
            zz = -0.06 + (((tickAnim - 7) / 2) * (-0.25-(-0.06)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -1.225 + (((tickAnim - 9) / 5) * (-0.25-(-1.225)));
            zz = -0.25 + (((tickAnim - 9) / 5) * (-0.225-(-0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 14) / 7) * (0.765-(-0.25)));
            zz = -0.225 + (((tickAnim - 14) / 7) * (-0.09-(-0.225)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0.765 + (((tickAnim - 21) / 3) * (0.765-(0.765)));
            zz = -0.09 + (((tickAnim - 21) / 3) * (-0.09-(-0.09)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.765 + (((tickAnim - 24) / 4) * (-0.775-(0.765)));
            zz = -0.09 + (((tickAnim - 24) / 4) * (0.55-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (-63.5-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -63.5 + (((tickAnim - 9) / 5) * (24.5-(-63.5)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 24.5 + (((tickAnim - 14) / 14) * (0-(24.5)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0.475-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 9) / 5) * (0-(-0.175)));
            zz = 0.475 + (((tickAnim - 9) / 5) * (0-(0.475)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-250))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-300))*2), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-350))*4), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-300))*2), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-350))*4), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-350))*-3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-400))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-450))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0.15);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-200))*3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-250))*3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-1));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPhuwiangvenator e = (EntityPrehistoricFloraPhuwiangvenator) entity;
        animator.update(entity);

    }
}
