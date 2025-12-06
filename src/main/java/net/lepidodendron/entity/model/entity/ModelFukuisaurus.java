package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFukuisaurus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer opposablePinkie3;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer opposablePinkie2;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer neck;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;

    private ModelAnimator animator;

    public ModelFukuisaurus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 5.0F, -1.25F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -3.0F, 0.0F, -2.0F, 6, 9, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -2.45F, 4.75F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 47, 0.0F, 0.0F, -1.0F, 3, 4, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -2.425F, -0.25F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 51, 0.0F, 0.0F, -1.0F, 3, 4, 5, 0.01F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-3.0F, 2.5F, 1.75F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3491F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 36, 0, -1.5F, -1.5F, -1.75F, 3, 9, 6, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 7.3F, -1.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.0297F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 59, -1.0F, -0.5111F, -0.5207F, 2, 9, 3, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(1.0F, 8.5889F, 0.6293F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6981F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 20, -2.0F, -1.1F, -0.9F, 2, 4, 2, -0.01F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-1.5F, 2.75F, 0.0F);
        this.rightleg3.addChild(rightleg4);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 36, 15, -1.0F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(1.0F, 0.5F, -2.0F);
        this.rightleg4.addChild(rightleg5);
        this.rightleg5.cubeList.add(new ModelBox(rightleg5, 29, 52, -2.0F, -0.5F, -1.75F, 3, 1, 2, -0.01F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(3.0F, 2.5F, 1.75F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3491F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 36, 0, -1.5F, -1.5F, -1.75F, 3, 9, 6, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 7.3F, -1.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.0297F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 59, -1.0F, -0.5111F, -0.5207F, 2, 9, 3, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(-1.0F, 8.5889F, 0.6293F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6981F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 20, 0.0F, -1.1F, -0.9F, 2, 4, 2, -0.01F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(1.5F, 2.75F, 0.0F);
        this.leftleg3.addChild(leftleg4);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 36, 15, -2.0F, 0.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(-1.0F, 0.5F, -2.0F);
        this.leftleg4.addChild(leftleg5);
        this.leftleg5.cubeList.add(new ModelBox(leftleg5, 29, 52, -1.0F, -0.5F, -1.75F, 3, 1, 2, -0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 9.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 49, -2.5F, -1.0F, -1.0F, 5, 6, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 51, 31, -2.0F, -1.0F, 3.0F, 4, 4, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 41, -1.0F, -2.0F, -1.0F, 2, 2, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.1F, 0.35F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 33, -1.0F, -2.0F, -1.0F, 2, 2, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 2.1F, 0.25F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 29, -2.0F, -3.0F, -1.0F, 3, 3, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 8.15F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.1F, 0.5F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 38, -1.0F, -2.0F, -1.0F, 2, 2, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 8.5F);
        this.tail3.addChild(tail4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.6F, 0.5F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 9, 0.0F, -1.0F, -1.0F, 1, 1, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 20, -3.5F, -2.0F, -8.0F, 7, 9, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 55, 39, -2.0F, -4.35F, -2.425F, 4, 3, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -4.475F, -7.5F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 43, -1.0F, 1.0F, -1.0F, 4, 3, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.5F, -8.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.4363F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 38, 21, -3.0F, -0.8254F, -4.4275F, 6, 5, 5, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.1746F, -6.4275F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6109F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 51, 12, -3.0F, -5.0F, 2.0F, 6, 5, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.1246F, -4.4275F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 56, -2.0F, -2.0F, 1.0F, 3, 2, 5, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(2.5F, 2.8746F, -4.9275F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.2142F, 0.0966F, -0.1301F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 0, 0, -1.0F, -0.1F, -1.55F, 2, 7, 3, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.1F, 5.9F, 0.225F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8088F, 0.2702F, -0.0829F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 13, 38, -0.175F, -0.5567F, -0.8047F, 1, 5, 2, 0.0F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 38, -0.6F, -0.5567F, -0.8047F, 1, 5, 2, -0.01F, true));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.0F, 4.4433F, 0.1953F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.4363F, 0.0F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 37, 21, -0.25F, -0.25F, -1.0F, 1, 3, 2, 0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, 2.55F, 0.0F);
        this.leftarm3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3054F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 35, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.75F, -0.05F, -1.3F);
        this.leftarm3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 60, -1.0F, 0.0F, -1.0F, 1, 1, 2, -0.01F, true));

        this.opposablePinkie3 = new AdvancedModelRenderer(this);
        this.opposablePinkie3.setRotationPoint(0.25F, 0.0F, 1.0F);
        this.leftarm3.addChild(opposablePinkie3);
        this.setRotateAngle(opposablePinkie3, -0.7854F, 0.0F, 0.0F);
        this.opposablePinkie3.cubeList.add(new ModelBox(opposablePinkie3, 45, 15, -0.5F, 0.0F, -0.65F, 1, 1, 2, -0.01F, true));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-2.5F, 2.8746F, -4.9275F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.2142F, -0.0966F, 0.1301F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 0, 0, -1.0F, -0.1F, -1.55F, 2, 7, 3, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.1F, 5.9F, 0.225F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.8088F, -0.2702F, 0.0829F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 13, 38, -0.825F, -0.5567F, -0.8047F, 1, 5, 2, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 38, -0.4F, -0.5567F, -0.8047F, 1, 5, 2, -0.01F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(0.0F, 4.4433F, 0.1953F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, -0.4363F, 0.0F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 37, 21, -0.75F, -0.25F, -1.0F, 1, 3, 2, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.25F, 2.55F, 0.0F);
        this.rightarm3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3054F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 35, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.75F, -0.05F, -1.3F);
        this.rightarm3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 60, 0.0F, 0.0F, -1.0F, 1, 1, 2, -0.01F, false));

        this.opposablePinkie2 = new AdvancedModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.25F, 0.0F, 1.0F);
        this.rightarm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, -0.7854F, 0.0F, 0.0F);
        this.opposablePinkie2.cubeList.add(new ModelBox(opposablePinkie2, 45, 15, -0.5F, 0.0F, -0.65F, 1, 1, 2, -0.01F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.9246F, -4.4275F);
        this.chest.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 26, 41, -2.5F, -1.75F, -2.0F, 5, 5, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 3.25F, -2.0F);
        this.neck4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 21, -2.0F, -5.0F, 0.0F, 5, 5, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.neck4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 56, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.6F, -1.75F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.6109F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 54, 0, -2.0F, -1.5F, -2.5F, 4, 4, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.25F, -2.5F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.7418F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 34, 52, -1.5F, -1.5F, -3.75F, 3, 3, 5, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.5F, -2.75F);
        this.neck2.addChild(throat);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.throat.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 0, -1.0F, -1.0F, -5.0F, 2, 1, 5, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.1F, -3.35F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.3927F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 55, 20, -1.5F, -1.475F, -2.85F, 3, 3, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.75F, -2.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.6545F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 54, 8, -0.5F, 0.4F, -5.8F, 1, 1, 3, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.225F, 1.025F, -2.575F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.288F, 0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 18, -1.0F, -2.0F, -3.0F, 1, 1, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 59, 8, -1.0F, -2.0F, -3.0F, 1, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5F, -0.15F, -0.675F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 0, -1.0F, -1.0F, -3.4F, 1, 0, 2, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 0, -3.0F, -1.0F, -3.4F, 1, 0, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.55F, 0.85F, -1.775F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.2618F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 0, -1.0F, -1.45F, -1.9F, 1, 1, 1, 0.02F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 59, -1.0F, -1.75F, -2.0F, 1, 2, 2, 0.01F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 1.4F, -3.8F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.1745F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 31, -1.0F, -1.0F, -2.5F, 1, 1, 3, 0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.575F, 1.65F, -4.65F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 5, -1.1F, -1.0F, -1.0F, 0, 1, 3, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 5, -2.05F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.55F, 2.25F, -5.75F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1309F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 7, -0.03F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.55F, 2.25F, -5.75F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.1309F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 29, 3, -0.01F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 1.4F, -3.8F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1745F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 31, 0.0F, -1.0F, -2.5F, 1, 1, 3, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.1F, -2.5F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2443F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 17, 38, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.65F, -3.75F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.8116F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 60, 26, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.02F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.55F, 0.85F, -1.775F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1745F, -0.2618F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 23, 0, 0.0F, -1.45F, -1.9F, 1, 1, 1, 0.02F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 10, 59, 0.0F, -1.75F, -2.0F, 1, 2, 2, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.85F, -0.675F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 26, -1.0F, -2.0F, -3.0F, 2, 1, 2, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.225F, 1.025F, -2.575F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.288F, -0.1745F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 59, 8, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 1.875F, -0.7F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2094F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 0, -2.0F, -3.0F, -1.0F, 3, 3, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.55F, 2.25F, -5.75F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.1309F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 7, 0.03F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.55F, 2.25F, -5.75F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1745F, -0.1309F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 29, 3, 0.01F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.0F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 60, -1.5F, -2.0F, -2.0F, 2, 3, 1, 0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 0, -2.0F, -1.0F, -1.0F, 3, 2, 2, 0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 43, -1.0F, 0.0F, -4.9F, 1, 1, 3, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 4, -1.0F, -0.25F, -4.55F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 4, 0.0F, -0.25F, -4.55F, 0, 1, 3, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.525F, 0.975F, -2.5F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.1745F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 23, 6, -1.0F, -1.0F, -2.5F, 1, 1, 4, 0.01F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.05F, 0.25F, -4.75F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.1309F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 23, 25, -0.02F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 29, 25, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.05F, 0.25F, -4.75F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.1309F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 23, 25, 0.02F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 29, 25, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, 1.0F, -4.85F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1745F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 23, 2, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.525F, 0.975F, -2.5F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.1745F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 23, 6, 0.0F, -1.0F, -2.5F, 1, 1, 4, 0.01F, false));

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
        this.hips.offsetX = 0.15F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(125);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.4F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.2F, 4.2F, -0.4F);
        this.setRotateAngle(throat, -0.0654F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.1004F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg2, 1.0297F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, -0.048F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm3, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(rightarm2, -1.376F, -0.052F, 0.0829F);
        this.setRotateAngle(rightarm, 0.3451F, -0.0966F, 0.1301F);
        this.setRotateAngle(opposablePinkie3, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(opposablePinkie2, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, -0.0698F, -0.1047F, 0.0F);
        this.setRotateAngle(neck3, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.6327F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.3098F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg2, 1.0297F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, -0.0218F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(leftarm2, -1.5769F, 0.2397F, -0.084F);
        this.setRotateAngle(leftarm, 0.3451F, 0.0966F, -0.1301F);
        this.setRotateAngle(jaw, 0.1963F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r37, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r34, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r33, 0.1745F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r31, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.288F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, 0.1745F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r27, 0.8116F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r24, 0.1745F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r20, 0.1745F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.288F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.3104F, -0.0623F, -0.02F);
        this.setRotateAngle(body, -0.0259F, -0.1177F, -0.0052F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(throat, -0.0654F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.1004F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg2, 1.0297F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, -0.048F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm3, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(rightarm2, -1.376F, -0.052F, 0.0829F);
        this.setRotateAngle(rightarm, 0.3451F, -0.0966F, 0.1301F);
        this.setRotateAngle(opposablePinkie3, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(opposablePinkie2, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, -0.0698F, -0.1047F, 0.0F);
        this.setRotateAngle(neck3, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.6327F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.3098F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg2, 1.0297F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, -0.0218F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(leftarm2, -1.5769F, 0.2397F, -0.084F);
        this.setRotateAngle(leftarm, 0.3451F, 0.0966F, -0.1301F);
        this.setRotateAngle(jaw, 0.1963F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.2836F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r37, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r34, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r33, 0.1745F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r31, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.288F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, 0.1745F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r27, 0.8116F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r24, 0.1745F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r20, 0.1745F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.288F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.3104F, -0.0623F, -0.02F);
        this.setRotateAngle(body, -0.0259F, -0.1177F, -0.0052F);
        this.hips.offsetY = -0.16F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.chest.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(chest, 0.3104F, -0.0623F, -0.02F);
        this.setRotateAngle(neck4, -0.0698F, -0.1047F, 0.0F);
        this.setRotateAngle(neck3, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.6327F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.3098F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.1963F, 0.0F, 0.0F);
        this.chest.offsetY = -0F;
        this.chest.offsetX = -0F;
        this.chest.offsetZ = 0.035F;
        this.chest.render(0.01F);
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

        EntityPrehistoricFloraFukuisaurus walker = (EntityPrehistoricFloraFukuisaurus) e;

        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2, this.tail3, this.tail4};
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

        EntityPrehistoricFloraFukuisaurus ee = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;

        if ((!ee.isQuad() && ee.getAnimation() != ee.TOBI_ANIMATION) || ee.getAnimation() == ee.TOQUAD_ANIMATION) {
            //Bipedal Pose

            //And now the pose:
            this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(chest, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3054F);
            this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
            this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, 0.288F, 0.1745F, 0.0F);
            this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, 0.1745F, 0.2618F, 0.0F);
            this.setRotateAngle(cube_r21, 0.0F, 0.1745F, 0.0F);
            this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r23, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(cube_r24, 0.1745F, 0.1309F, 0.0F);
            this.setRotateAngle(cube_r25, 0.0F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r26, 0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r27, 0.8116F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r28, 0.1745F, -0.2618F, 0.0F);
            this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r30, 0.288F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r31, 0.2094F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r32, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(cube_r33, 0.1745F, -0.1309F, 0.0F);
            this.setRotateAngle(cube_r34, 0.0F, 0.1745F, 0.0F);
            this.setRotateAngle(cube_r35, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(cube_r36, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(cube_r37, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r38, 0.0F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(leftarm, 0.3451F, 0.0966F, -0.1301F);
            this.setRotateAngle(leftarm2, -1.376F, 0.052F, -0.0829F);
            this.setRotateAngle(leftarm3, 0.0F, 0.1745F, 0.0F);
            this.setRotateAngle(leftleg, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg2, 1.0297F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg3, -0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(neck, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.7418F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie2, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie3, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(rightarm, 0.3451F, -0.0966F, 0.1301F);
            this.setRotateAngle(rightarm2, -1.376F, -0.052F, 0.0829F);
            this.setRotateAngle(rightarm3, 0.0F, -0.1745F, 0.0F);
            this.setRotateAngle(rightleg, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg2, 1.0297F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg3, -0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);




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
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuisaurus entity = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (44-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 44 + (((tickAnim - 10) / 10) * (0-(44)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.625 + (((tickAnim - 10) / 10) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37.5 + (((tickAnim - 10) / 10) * (0-(37.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 5) / 5) * (0-(22.5)));
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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.55-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 5) * (0-(0.25)));
            zz = 0.55 + (((tickAnim - 5) / 5) * (0-(0.55)));
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
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-17-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17 + (((tickAnim - 8) / 2) * (-12-(-17)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12 + (((tickAnim - 10) / 10) * (0-(-12)));
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
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (11-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 8) / 2) * (0-(11)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuisaurus entity = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.75 + (((tickAnim - 20) / 10) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 30) / 20) * (0-(-7.75)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-6.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.95-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.275 + (((tickAnim - 20) / 10) * (-6.275-(-6.275)));
            zz = 0.95 + (((tickAnim - 20) / 10) * (0.95-(0.95)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.275 + (((tickAnim - 30) / 20) * (0-(-6.275)));
            zz = 0.95 + (((tickAnim - 30) / 20) * (0-(0.95)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.5 + (((tickAnim - 20) / 10) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 30) / 20) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 20) / 10) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 30) / 20) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -5.75 + (((tickAnim - 11) / 9) * (12.25-(-5.75)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.25 + (((tickAnim - 20) / 10) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 30) / 20) * (0-(12.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (19.25-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19.25 + (((tickAnim - 20) / 10) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 19.25 + (((tickAnim - 30) / 3) * (9.29-(19.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 9.29 + (((tickAnim - 33) / 6) * (0-(9.29)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 43) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33.25 + (((tickAnim - 20) / 10) * (33.25-(33.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 33.25 + (((tickAnim - 30) / 20) * (0-(33.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-51.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -51.75 + (((tickAnim - 20) / 10) * (-51.75-(-51.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -51.75 + (((tickAnim - 30) / 20) * (0-(-51.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 20) / 10) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 30) / 20) * (0-(27.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.075-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.425 + (((tickAnim - 20) / 10) * (0.425-(0.425)));
            zz = -0.075 + (((tickAnim - 20) / 10) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.425 + (((tickAnim - 30) / 20) * (0-(0.425)));
            zz = -0.075 + (((tickAnim - 30) / 20) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13 + (((tickAnim - 20) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 30) / 20) * (0-(-13)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.25 + (((tickAnim - 20) / 10) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 30) / 20) * (0-(34.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -29.5 + (((tickAnim - 20) / 10) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -29.5 + (((tickAnim - 30) / 20) * (0-(-29.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.65-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.8 + (((tickAnim - 20) / 10) * (0.8-(0.8)));
            zz = 0.65 + (((tickAnim - 20) / 10) * (0.65-(0.65)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.8 + (((tickAnim - 30) / 20) * (0-(0.8)));
            zz = 0.65 + (((tickAnim - 30) / 20) * (0-(0.65)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 20) / 10) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 30) / 20) * (0-(17.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (2.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.55-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.325 + (((tickAnim - 20) / 10) * (2.325-(2.325)));
            zz = -0.55 + (((tickAnim - 20) / 10) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.325 + (((tickAnim - 30) / 20) * (0-(2.325)));
            zz = -0.55 + (((tickAnim - 30) / 20) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13 + (((tickAnim - 20) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 30) / 20) * (0-(-13)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.25 + (((tickAnim - 20) / 10) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 30) / 20) * (0-(34.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -29.5 + (((tickAnim - 20) / 10) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -29.5 + (((tickAnim - 30) / 20) * (0-(-29.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.65-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.8 + (((tickAnim - 20) / 10) * (0.8-(0.8)));
            zz = 0.65 + (((tickAnim - 20) / 10) * (0.65-(0.65)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.8 + (((tickAnim - 30) / 20) * (0-(0.8)));
            zz = 0.65 + (((tickAnim - 30) / 20) * (0-(0.65)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 20) / 10) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 30) / 20) * (0-(17.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (2.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.55-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.325 + (((tickAnim - 20) / 10) * (2.325-(2.325)));
            zz = -0.55 + (((tickAnim - 20) / 10) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.325 + (((tickAnim - 30) / 20) * (0-(2.325)));
            zz = -0.55 + (((tickAnim - 30) / 20) * (0-(-0.55)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33.25 + (((tickAnim - 20) / 10) * (33.25-(33.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 33.25 + (((tickAnim - 30) / 20) * (0-(33.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-51.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -51.75 + (((tickAnim - 20) / 10) * (-51.75-(-51.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -51.75 + (((tickAnim - 30) / 20) * (0-(-51.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 20) / 10) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 30) / 20) * (0-(27.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.075-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.425 + (((tickAnim - 20) / 10) * (0.425-(0.425)));
            zz = -0.075 + (((tickAnim - 20) / 10) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.425 + (((tickAnim - 30) / 20) * (0-(0.425)));
            zz = -0.075 + (((tickAnim - 30) / 20) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuisaurus entity = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 21 + (((tickAnim - 20) / 15) * (-3.25-(21)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 35) / 15) * (0-(-3.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 21.5 + (((tickAnim - 20) / 15) * (-16.5-(21.5)));
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
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 11.75 + (((tickAnim - 20) / 8) * (-27.25-(11.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 28) / 7) * (-1.75-(-27.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 35) / 15) * (0-(-1.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (42.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 42.25 + (((tickAnim - 20) / 8) * (57.78-(42.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 57.78 + (((tickAnim - 28) / 7) * (22.5-(57.78)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 35) / 15) * (0-(22.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (1.775-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.225-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 1.775 + (((tickAnim - 24) / 4) * (2.1-(1.775)));
            zz = -0.225 + (((tickAnim - 24) / 4) * (-0.175-(-0.225)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 2.1 + (((tickAnim - 28) / 7) * (1.2-(2.1)));
            zz = -0.175 + (((tickAnim - 28) / 7) * (0-(-0.175)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.2 + (((tickAnim - 35) / 15) * (0-(1.2)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuisaurus entity = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -6.5 + (((tickAnim - 17) / 13) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.2-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0.2 + (((tickAnim - 17) / 13) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 17) / 13) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.375-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0.375 + (((tickAnim - 17) / 13) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 11 + (((tickAnim - 17) / 13) * (0-(11)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.375-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0.075 + (((tickAnim - 17) / 13) * (0-(0.075)));
            zz = 0.375 + (((tickAnim - 17) / 13) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -8.5 + (((tickAnim - 17) / 13) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 17) / 13) * (0-(15)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuisaurus entity = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;
        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 40) / 120) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 160) / 40) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1 + (((tickAnim - 40) / 120) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1 + (((tickAnim - 160) / 40) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 40) / 120) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 160) / 40) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 40) / 120) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 160) / 40) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = 7.75 + (((tickAnim - 60) / 107) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 7.75 + (((tickAnim - 167) / 33) * (0-(7.75)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = -4.25 + (((tickAnim - 60) / 107) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -4.25 + (((tickAnim - 167) / 33) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = -16 + (((tickAnim - 60) / 107) * (-16-(-16)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -16 + (((tickAnim - 167) / 33) * (0-(-16)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = 12.5 + (((tickAnim - 60) / 107) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 12.5 + (((tickAnim - 167) / 33) * (0-(12.5)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = -4.25 + (((tickAnim - 60) / 107) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -4.25 + (((tickAnim - 167) / 33) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = -16 + (((tickAnim - 60) / 107) * (-16-(-16)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -16 + (((tickAnim - 167) / 33) * (0-(-16)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = 12.5 + (((tickAnim - 60) / 107) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 12.5 + (((tickAnim - 167) / 33) * (0-(12.5)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 17.75 + (((tickAnim - 60) / 25) * (2.5-(17.75)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 85) / 35) * (17.75-(2.5)));
            yy = 0 + (((tickAnim - 85) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 35) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 17.75 + (((tickAnim - 120) / 15) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = 17.75 + (((tickAnim - 135) / 8) * (23-(17.75)));
            yy = 0 + (((tickAnim - 135) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 8) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 23 + (((tickAnim - 143) / 7) * (11.5-(23)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 11.5 + (((tickAnim - 150) / 10) * (7.25-(11.5)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 167) {
            xx = 7.25 + (((tickAnim - 160) / 7) * (11.5-(7.25)));
            yy = 0 + (((tickAnim - 160) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 7) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 11.5 + (((tickAnim - 167) / 33) * (0-(11.5)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            yy = -0.25 + (((tickAnim - 60) / 25) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 85) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 35) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 85) / 35) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = -0.25 + (((tickAnim - 120) / 15) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 135) / 15) * (0-(0)));
            yy = -0.25 + (((tickAnim - 135) / 15) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 135) / 15) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 167) {
            xx = 0 + (((tickAnim - 150) / 17) * (0-(0)));
            yy = -0.25 + (((tickAnim - 150) / 17) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 150) / 17) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            yy = -0.25 + (((tickAnim - 167) / 33) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 30 + (((tickAnim - 60) / 25) * (22-(30)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 120) {
            xx = 22 + (((tickAnim - 85) / 35) * (7-(22)));
            yy = 0 + (((tickAnim - 85) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 35) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 7 + (((tickAnim - 120) / 30) * (30-(7)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 167) {
            xx = 30 + (((tickAnim - 150) / 17) * (30-(30)));
            yy = 0 + (((tickAnim - 150) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 17) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 30 + (((tickAnim - 167) / 33) * (0-(30)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 21.5 + (((tickAnim - 60) / 25) * (27-(21.5)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 120) {
            xx = 27 + (((tickAnim - 85) / 35) * (20.25-(27)));
            yy = 0 + (((tickAnim - 85) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 35) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 20.25 + (((tickAnim - 120) / 30) * (21.5-(20.25)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 167) {
            xx = 21.5 + (((tickAnim - 150) / 17) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 150) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 17) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 21.5 + (((tickAnim - 167) / 33) * (0-(21.5)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.525-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 167) {
            xx = 0 + (((tickAnim - 40) / 127) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 127) * (0-(0)));
            zz = 0.525 + (((tickAnim - 40) / 127) * (0.525-(0.525)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0.525 + (((tickAnim - 167) / 33) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.92-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 6.92 + (((tickAnim - 40) / 20) * (-12.5-(6.92)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = -12.5 + (((tickAnim - 60) / 25) * (12.25-(-12.5)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 12.25 + (((tickAnim - 85) / 6) * (12.17-(12.25)));
            yy = 0 + (((tickAnim - 85) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 6) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = 12.17 + (((tickAnim - 91) / 7) * (12.5-(12.17)));
            yy = 0 + (((tickAnim - 91) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 7) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 98) / 22) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 12.5 + (((tickAnim - 120) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 135) / 8) * (-11.94-(0)));
            yy = 0 + (((tickAnim - 135) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 8) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = -11.94 + (((tickAnim - 143) / 7) * (-3.25-(-11.94)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -3.25 + (((tickAnim - 150) / 10) * (0.06-(-3.25)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 167) {
            xx = 0.06 + (((tickAnim - 160) / 7) * (-3.25-(0.06)));
            yy = 0 + (((tickAnim - 160) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 7) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -3.25 + (((tickAnim - 167) / 33) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 40) / 12) * (10-(0)));
            yy = 0 + (((tickAnim - 40) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 12) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 52) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 85) / 6) * (4-(0)));
            yy = 0 + (((tickAnim - 85) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 6) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = 4 + (((tickAnim - 91) / 7) * (0-(4)));
            yy = 0 + (((tickAnim - 91) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 7) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 135) / 8) * (9.5-(0)));
            yy = 0 + (((tickAnim - 135) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 8) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 9.5 + (((tickAnim - 143) / 7) * (0-(9.5)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 167) {
            xx = 9.5 + (((tickAnim - 160) / 7) * (0-(9.5)));
            yy = 0 + (((tickAnim - 160) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalkBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuisaurus entity = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+40))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*0.3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-25))*0.4);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-55))*-0.6);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 36.75 + (((tickAnim - 0) / 15) * (-18-(36.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -18 + (((tickAnim - 15) / 15) * (36.75-(-18)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.75 + (((tickAnim - 0) / 3) * (5.96-(-10.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 5.96 + (((tickAnim - 3) / 12) * (-15.5-(5.96)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -15.5 + (((tickAnim - 15) / 15) * (-10.75-(-15.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (-45.78-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -45.78 + (((tickAnim - 4) / 6) * (-45.78-(-45.78)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -45.78 + (((tickAnim - 10) / 5) * (0-(-45.78)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.575-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 4) / 6) * (0.975-(0.975)));
            zz = 0.575 + (((tickAnim - 4) / 6) * (0.575-(0.575)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.975 + (((tickAnim - 10) / 5) * (0-(0.975)));
            zz = 0.575 + (((tickAnim - 10) / 5) * (0-(0.575)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
            xx = 64.5 + (((tickAnim - 0) / 4) * (89.67-(64.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 89.67 + (((tickAnim - 4) / 6) * (89.67-(89.67)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 89.67 + (((tickAnim - 10) / 5) * (34.5-(89.67)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 34.5 + (((tickAnim - 15) / 6) * (7.17-(34.5)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 7.17 + (((tickAnim - 21) / 9) * (64.5-(7.17)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.155-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.55-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.155 + (((tickAnim - 10) / 5) * (0.75-(1.155)));
            zz = -0.55 + (((tickAnim - 10) / 5) * (0-(-0.55)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 15) / 2) * (0.9-(0.75)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 17) / 1) * (0.775-(0.9)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 18) / 3) * (0.71-(0.775)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.71 + (((tickAnim - 21) / 4) * (1.54-(0.71)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.54 + (((tickAnim - 25) / 5) * (0-(1.54)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 16.75 + (((tickAnim - 0) / 15) * (0-(16.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (-42-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -42 + (((tickAnim - 25) / 5) * (16.75-(-42)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -18 + (((tickAnim - 0) / 15) * (36.75-(-18)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 36.75 + (((tickAnim - 15) / 15) * (-18-(36.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -15.5 + (((tickAnim - 0) / 15) * (-10.75-(-15.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10.75 + (((tickAnim - 15) / 3) * (5.96-(-10.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 5.96 + (((tickAnim - 18) / 12) * (-15.5-(5.96)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 10 + (((tickAnim - 15) / 4) * (-45.78-(10)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -45.78 + (((tickAnim - 19) / 6) * (-45.78-(-45.78)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -45.78 + (((tickAnim - 25) / 5) * (0-(-45.78)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0.975-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0.575-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 19) / 6) * (0.975-(0.975)));
            zz = 0.575 + (((tickAnim - 19) / 6) * (0.575-(0.575)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.975 + (((tickAnim - 25) / 5) * (0-(0.975)));
            zz = 0.575 + (((tickAnim - 25) / 5) * (0-(0.575)));
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
            xx = 34.5 + (((tickAnim - 0) / 6) * (7.17-(34.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 7.17 + (((tickAnim - 6) / 9) * (64.5-(7.17)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 64.5 + (((tickAnim - 15) / 4) * (89.67-(64.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 89.67 + (((tickAnim - 19) / 6) * (89.67-(89.67)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 89.67 + (((tickAnim - 25) / 5) * (34.5-(89.67)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 2) * (0.9-(0.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 2) / 1) * (0.775-(0.9)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 3) / 3) * (0.71-(0.775)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.71 + (((tickAnim - 6) / 4) * (1.54-(0.71)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.54 + (((tickAnim - 10) / 5) * (0-(1.54)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (1.155-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (-0.55-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.155 + (((tickAnim - 25) / 5) * (0.75-(1.155)));
            zz = -0.55 + (((tickAnim - 25) / 5) * (0-(-0.55)));
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
            xx = 0 + (((tickAnim - 6) / 4) * (-42-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -42 + (((tickAnim - 10) / 5) * (16.75-(-42)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 16.75 + (((tickAnim - 15) / 15) * (0-(16.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+40))), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+100))*-1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*-0.3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+180))*2.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*1.5));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+100))*3), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+20))*2.5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(23.8563+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+50))*-5), rightarm3.rotateAngleY + (float) Math.toRadians(7.10436), rightarm3.rotateAngleZ + (float) Math.toRadians(-18.5587));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+100))*3), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+20))*2.5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(23.8563+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+50))*-5), leftarm3.rotateAngleY + (float) Math.toRadians(-7.10436), leftarm3.rotateAngleZ + (float) Math.toRadians(18.5587));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+250))*-2.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+300))*2.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+510))*2.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalkQuad(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuisaurus entity = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 9.75 + (((tickAnim - 0) / 4) * (-2.25-(9.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = -2.25 + (((tickAnim - 4) / 22) * (35.25-(-2.25)));
            yy = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 22) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 35.25 + (((tickAnim - 26) / 9) * (9.75-(35.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -43 + (((tickAnim - 0) / 4) * (-30.5-(-43)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = -30.5 + (((tickAnim - 4) / 22) * (0-(-30.5)));
            yy = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 22) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (-43-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 4) * (0-(1.2)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 22) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (1.2-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
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
            xx = -45.5 + (((tickAnim - 0) / 4) * (-13.25-(-45.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = -13.25 + (((tickAnim - 4) / 22) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 22) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-52.18-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -52.18 + (((tickAnim - 30) / 5) * (-45.5-(-52.18)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 4) * (0.55-(0.875)));
            zz = 0.425 + (((tickAnim - 0) / 4) * (0-(0.425)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            yy = 0.55 + (((tickAnim - 4) / 22) * (0-(0.55)));
            zz = 0 + (((tickAnim - 4) / 22) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (1.225-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0.565-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 30) / 5) * (0.875-(1.225)));
            zz = 0.565 + (((tickAnim - 30) / 5) * (0.425-(0.565)));
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
            xx = 100.25 + (((tickAnim - 0) / 4) * (48.25-(100.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 48.25 + (((tickAnim - 4) / 9) * (12.8-(48.25)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 12.8 + (((tickAnim - 13) / 7) * (66.94155-(12.8)));
            yy = 0 + (((tickAnim - 13) / 7) * (1.51108-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-2.69765-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 66.94155 + (((tickAnim - 20) / 6) * (65.5-(66.94155)));
            yy = 1.51108 + (((tickAnim - 20) / 6) * (0-(1.51108)));
            zz = -2.69765 + (((tickAnim - 20) / 6) * (0-(-2.69765)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 65.5 + (((tickAnim - 26) / 9) * (100.25-(65.5)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.45-(0)));
            zz = -0.275 + (((tickAnim - 0) / 4) * (-0.375-(-0.275)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 4) / 5) * (1.015-(0.45)));
            zz = -0.375 + (((tickAnim - 4) / 5) * (-0.36-(-0.375)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.015 + (((tickAnim - 9) / 4) * (0.725-(1.015)));
            zz = -0.36 + (((tickAnim - 9) / 4) * (0-(-0.36)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.725 + (((tickAnim - 13) / 4) * (0.91-(0.725)));
            zz = 0 + (((tickAnim - 13) / 4) * (-0.21-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.91 + (((tickAnim - 17) / 3) * (0-(0.91)));
            zz = -0.21 + (((tickAnim - 17) / 3) * (-0.425-(-0.21)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0.625-(0)));
            zz = -0.425 + (((tickAnim - 20) / 6) * (-0.3-(-0.425)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0.625 + (((tickAnim - 26) / 9) * (0-(0.625)));
            zz = -0.3 + (((tickAnim - 26) / 9) * (-0.275-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-78.48-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -78.48 + (((tickAnim - 20) / 6) * (34.25-(-78.48)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 34.25 + (((tickAnim - 26) / 9) * (0-(34.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (-0.08-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.08 + (((tickAnim - 20) / 3) * (0-(-0.08)));
            zz = 0.3 + (((tickAnim - 20) / 3) * (0-(0.3)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 26) / 9) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg5.rotationPointX = this.rightleg5.rotationPointX + (float)(xx);
        this.rightleg5.rotationPointY = this.rightleg5.rotationPointY - (float)(yy);
        this.rightleg5.rotationPointZ = this.rightleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 15.75 + (((tickAnim - 0) / 12) * (35.25-(15.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 35.25 + (((tickAnim - 12) / 12) * (-2.25-(35.25)));
            yy = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -2.25 + (((tickAnim - 24) / 11) * (15.75-(-2.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -21.73646 + (((tickAnim - 0) / 12) * (0-(-21.73646)));
            yy = 0.13979 + (((tickAnim - 0) / 12) * (0-(0.13979)));
            zz = -0.0252 + (((tickAnim - 0) / 12) * (0-(-0.0252)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 12) / 12) * (-30.5-(0)));
            yy = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -30.5 + (((tickAnim - 24) / 11) * (-21.73646-(-30.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0.13979-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (-0.0252-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 12) * (0-(0.6)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 12) * (0.8-(0)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0.8 + (((tickAnim - 24) / 11) * (0.6-(0.8)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 15.25 + (((tickAnim - 0) / 12) * (0-(15.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (-46.55-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -46.55 + (((tickAnim - 16) / 3) * (-46.55-(-46.55)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -46.55 + (((tickAnim - 19) / 5) * (2.25-(-46.55)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 24) / 11) * (15.25-(2.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 12) * (0-(0.575)));
            zz = 0.275 + (((tickAnim - 0) / 12) * (0-(0.275)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (1.065-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0.55-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.065 + (((tickAnim - 16) / 3) * (1.065-(1.065)));
            zz = 0.55 + (((tickAnim - 16) / 3) * (0.55-(0.55)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 1.065 + (((tickAnim - 19) / 5) * (0.55-(1.065)));
            zz = 0.55 + (((tickAnim - 19) / 5) * (0-(0.55)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0.55 + (((tickAnim - 24) / 11) * (0.575-(0.55)));
            zz = 0 + (((tickAnim - 24) / 11) * (0.275-(0)));
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
            xx = -6.5 + (((tickAnim - 0) / 6) * (75-(-6.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 75 + (((tickAnim - 6) / 6) * (65.5-(75)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 65.5 + (((tickAnim - 12) / 4) * (87.67825-(65.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (-0.18193-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0.93545-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 87.67825 + (((tickAnim - 16) / 3) * (87.67825-(87.67825)));
            yy = -0.18193 + (((tickAnim - 16) / 3) * (-0.18193-(-0.18193)));
            zz = 0.93545 + (((tickAnim - 16) / 3) * (0.93545-(0.93545)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 87.67825 + (((tickAnim - 19) / 5) * (32.08423-(87.67825)));
            yy = -0.18193 + (((tickAnim - 19) / 5) * (-0.34112-(-0.18193)));
            zz = 0.93545 + (((tickAnim - 19) / 5) * (1.75397-(0.93545)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 32.08423 + (((tickAnim - 24) / 11) * (-6.5-(32.08423)));
            yy = -0.34112 + (((tickAnim - 24) / 11) * (0-(-0.34112)));
            zz = 1.75397 + (((tickAnim - 24) / 11) * (0-(1.75397)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.33-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 3) / 3) * (-0.44-(0.475)));
            zz = -0.33 + (((tickAnim - 3) / 3) * (-0.575-(-0.33)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -0.44 + (((tickAnim - 6) / 6) * (0.625-(-0.44)));
            zz = -0.575 + (((tickAnim - 6) / 6) * (-0.3-(-0.575)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 12) / 4) * (1.08-(0.625)));
            zz = -0.3 + (((tickAnim - 12) / 4) * (-0.515-(-0.3)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.08 + (((tickAnim - 16) / 3) * (1.08-(1.08)));
            zz = -0.515 + (((tickAnim - 16) / 3) * (-0.515-(-0.515)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 1.08 + (((tickAnim - 19) / 5) * (0.35-(1.08)));
            zz = -0.515 + (((tickAnim - 19) / 5) * (0-(-0.515)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.35 + (((tickAnim - 24) / 6) * (0.585-(0.35)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.585 + (((tickAnim - 30) / 5) * (0-(0.585)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (-95.37-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -95.37 + (((tickAnim - 6) / 6) * (34.25-(-95.37)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 34.25 + (((tickAnim - 12) / 12) * (0-(34.25)));
            yy = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -0.07 + (((tickAnim - 6) / 6) * (-0.15-(-0.07)));
            zz = 0.2 + (((tickAnim - 6) / 6) * (0-(0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            yy = -0.15 + (((tickAnim - 12) / 12) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -40 + (((tickAnim - 0) / 19) * (2.5-(-40)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 2.5 + (((tickAnim - 19) / 14) * (-45.5-(2.5)));
            yy = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 14) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -45.5 + (((tickAnim - 33) / 2) * (-40-(-45.5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 4.75 + (((tickAnim - 0) / 19) * (22.25-(4.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 22.25 + (((tickAnim - 19) / 7) * (-31.75-(22.25)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -31.75 + (((tickAnim - 26) / 7) * (-3.25-(-31.75)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -3.25 + (((tickAnim - 33) / 2) * (4.75-(-3.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 7) * (0.755-(0.5)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0.755 + (((tickAnim - 7) / 7) * (0-(0.755)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 7) * (0.09-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0.555-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 0.09 + (((tickAnim - 26) / 7) * (0-(0.09)));
            zz = 0.555 + (((tickAnim - 26) / 7) * (0-(0.555)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 32.82195 + (((tickAnim - 0) / 19) * (6-(32.82195)));
            yy = -21.14846 + (((tickAnim - 0) / 19) * (0-(-21.14846)));
            zz = 23.62759 + (((tickAnim - 0) / 19) * (0-(23.62759)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 6 + (((tickAnim - 19) / 7) * (59.05502-(6)));
            yy = 0 + (((tickAnim - 19) / 7) * (-29.40487-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (23.28639-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 59.05502 + (((tickAnim - 26) / 7) * (51.07195-(59.05502)));
            yy = -29.40487 + (((tickAnim - 26) / 7) * (-21.14846-(-29.40487)));
            zz = 23.28639 + (((tickAnim - 26) / 7) * (23.62759-(23.28639)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 51.07195 + (((tickAnim - 33) / 2) * (32.82195-(51.07195)));
            yy = -21.14846 + (((tickAnim - 33) / 2) * (-21.14846-(-21.14846)));
            zz = 23.62759 + (((tickAnim - 33) / 2) * (23.62759-(23.62759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.175 + (((tickAnim - 0) / 7) * (0.09-(0.175)));
            yy = 0.375 + (((tickAnim - 0) / 7) * (0.6-(0.375)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.09 + (((tickAnim - 7) / 7) * (0-(0.09)));
            yy = 0.6 + (((tickAnim - 7) / 7) * (0.225-(0.6)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0.08-(0)));
            yy = 0.225 + (((tickAnim - 14) / 7) * (0.955-(0.225)));
            zz = 0 + (((tickAnim - 14) / 7) * (-0.09-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0.08 + (((tickAnim - 21) / 5) * (0.18-(0.08)));
            yy = 0.955 + (((tickAnim - 21) / 5) * (0.855-(0.955)));
            zz = -0.09 + (((tickAnim - 21) / 5) * (-0.2-(-0.09)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0.18 + (((tickAnim - 26) / 7) * (0.175-(0.18)));
            yy = 0.855 + (((tickAnim - 26) / 7) * (0.375-(0.855)));
            zz = -0.2 + (((tickAnim - 26) / 7) * (0-(-0.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0.175 + (((tickAnim - 33) / 2) * (0.175-(0.175)));
            yy = 0.375 + (((tickAnim - 33) / 2) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 0) / 3) * (2.5-(2)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 3) / 13) * (-45.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 13) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = -45.5 + (((tickAnim - 16) / 19) * (2-(-45.5)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.25 + (((tickAnim - 0) / 3) * (22.25-(20.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 22.25 + (((tickAnim - 3) / 6) * (-31.75-(22.25)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -31.75 + (((tickAnim - 9) / 7) * (-3.25-(-31.75)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = -3.25 + (((tickAnim - 16) / 19) * (20.25-(-3.25)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 9) * (0.09-(-0.5)));
            zz = -0.175 + (((tickAnim - 0) / 9) * (0.555-(-0.175)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0.09 + (((tickAnim - 9) / 7) * (0-(0.09)));
            zz = 0.555 + (((tickAnim - 9) / 7) * (0-(0.555)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 10) * (0.25-(0)));
            zz = 0 + (((tickAnim - 16) / 10) * (0.085-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0.25 + (((tickAnim - 26) / 9) * (-0.5-(0.25)));
            zz = 0.085 + (((tickAnim - 26) / 9) * (-0.175-(0.085)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 6 + (((tickAnim - 3) / 6) * (59.05502-(6)));
            yy = 0 + (((tickAnim - 3) / 6) * (29.40487-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (-23.28639-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 59.05502 + (((tickAnim - 9) / 7) * (51.07195-(59.05502)));
            yy = 29.40487 + (((tickAnim - 9) / 7) * (21.14846-(29.40487)));
            zz = -23.28639 + (((tickAnim - 9) / 7) * (-23.62759-(-23.28639)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 51.07195 + (((tickAnim - 16) / 10) * (16.25-(51.07195)));
            yy = 21.14846 + (((tickAnim - 16) / 10) * (0-(21.14846)));
            zz = -23.62759 + (((tickAnim - 16) / 10) * (0-(-23.62759)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 16.25 + (((tickAnim - 26) / 9) * (0-(16.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.08-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.955-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.09-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.08 + (((tickAnim - 4) / 5) * (0.18-(0.08)));
            yy = 0.955 + (((tickAnim - 4) / 5) * (0.855-(0.955)));
            zz = -0.09 + (((tickAnim - 4) / 5) * (-0.2-(-0.09)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0.18 + (((tickAnim - 9) / 7) * (0.175-(0.18)));
            yy = 0.855 + (((tickAnim - 9) / 7) * (0.375-(0.855)));
            zz = -0.2 + (((tickAnim - 9) / 7) * (0-(-0.2)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0.175 + (((tickAnim - 16) / 6) * (0.07-(0.175)));
            yy = 0.375 + (((tickAnim - 16) / 6) * (0.935-(0.375)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0.07 + (((tickAnim - 22) / 4) * (0-(0.07)));
            yy = 0.935 + (((tickAnim - 22) / 4) * (0.6-(0.935)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0.6 + (((tickAnim - 26) / 9) * (0-(0.6)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-80))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-80))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+30))*0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+120))*0.4);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-250))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-300))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*6));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-100))*-1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-80))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*1.7), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*-2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*-1.7), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-300))*-1.7), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-400))*-1.7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuisaurus entity = (EntityPrehistoricFloraFukuisaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 36 + (((tickAnim - 0) / 8) * (-25.25-(36)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -25.25 + (((tickAnim - 8) / 7) * (36-(-25.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 8.5 + (((tickAnim - 0) / 1) * (12.61-(8.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = 12.61 + (((tickAnim - 1) / 7) * (-19.75-(12.61)));
            yy = 0 + (((tickAnim - 1) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -19.75 + (((tickAnim - 8) / 7) * (8.5-(-19.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -47.25 + (((tickAnim - 3) / 2) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -47.25 + (((tickAnim - 5) / 3) * (16.5-(-47.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 16.5 + (((tickAnim - 8) / 7) * (0-(16.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.17-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.17 + (((tickAnim - 3) / 2) * (1.17-(1.17)));
            zz = 0.625 + (((tickAnim - 3) / 2) * (0.625-(0.625)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.17 + (((tickAnim - 5) / 3) * (-0.25-(1.17)));
            zz = 0.625 + (((tickAnim - 5) / 3) * (0-(0.625)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
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
            xx = 73 + (((tickAnim - 0) / 3) * (95.42-(73)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 95.42 + (((tickAnim - 3) / 2) * (95.42-(95.42)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 95.42 + (((tickAnim - 5) / 3) * (28.5-(95.42)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28.5 + (((tickAnim - 8) / 2) * (5-(28.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 10) / 3) * (72.75-(5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 72.75 + (((tickAnim - 13) / 2) * (73-(72.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 3) * (0.865-(0.325)));
            zz = -0.35 + (((tickAnim - 0) / 3) * (-0.455-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.865 + (((tickAnim - 3) / 2) * (0.865-(0.865)));
            zz = -0.455 + (((tickAnim - 3) / 2) * (-0.455-(-0.455)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.865 + (((tickAnim - 5) / 3) * (0.075-(0.865)));
            zz = -0.455 + (((tickAnim - 5) / 3) * (0-(-0.455)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 8) / 1) * (1.95-(0.075)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.08-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.95 + (((tickAnim - 9) / 1) * (1.535-(1.95)));
            zz = -0.08 + (((tickAnim - 9) / 1) * (-0.12-(-0.08)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.535 + (((tickAnim - 10) / 2) * (0.99-(1.535)));
            zz = -0.12 + (((tickAnim - 10) / 2) * (-0.18-(-0.12)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.99 + (((tickAnim - 12) / 1) * (-0.36-(0.99)));
            zz = -0.18 + (((tickAnim - 12) / 1) * (-0.23-(-0.18)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.36 + (((tickAnim - 13) / 2) * (0.325-(-0.36)));
            zz = -0.23 + (((tickAnim - 13) / 2) * (-0.35-(-0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 0) / 8) * (0-(25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-88.75-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -88.75 + (((tickAnim - 13) / 2) * (25-(-88.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -25.25 + (((tickAnim - 0) / 8) * (36-(-25.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 36 + (((tickAnim - 8) / 7) * (-25.25-(36)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -19.75 + (((tickAnim - 0) / 8) * (8.5-(-19.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 8) / 0) * (12.61-(8.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 12.61 + (((tickAnim - 8) / 7) * (-19.75-(12.61)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.5 + (((tickAnim - 0) / 8) * (0-(16.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -47.25 + (((tickAnim - 10) / 3) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -47.25 + (((tickAnim - 13) / 2) * (16.5-(-47.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 8) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.17-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.625-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.17 + (((tickAnim - 10) / 3) * (1.17-(1.17)));
            zz = 0.625 + (((tickAnim - 10) / 3) * (0.625-(0.625)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.17 + (((tickAnim - 13) / 2) * (-0.25-(1.17)));
            zz = 0.625 + (((tickAnim - 13) / 2) * (0-(0.625)));
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
            xx = 28.5 + (((tickAnim - 0) / 3) * (5-(28.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 3) / 2) * (72.75-(5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 72.75 + (((tickAnim - 5) / 3) * (73-(72.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 73 + (((tickAnim - 8) / 2) * (95.42-(73)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 95.42 + (((tickAnim - 10) / 3) * (95.42-(95.42)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 95.42 + (((tickAnim - 13) / 2) * (28.5-(95.42)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 2) * (1.95-(0.075)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.08-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.95 + (((tickAnim - 2) / 1) * (1.535-(1.95)));
            zz = -0.08 + (((tickAnim - 2) / 1) * (-0.12-(-0.08)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.535 + (((tickAnim - 3) / 1) * (0.99-(1.535)));
            zz = -0.12 + (((tickAnim - 3) / 1) * (-0.18-(-0.12)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.99 + (((tickAnim - 4) / 1) * (-0.36-(0.99)));
            zz = -0.18 + (((tickAnim - 4) / 1) * (-0.23-(-0.18)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.36 + (((tickAnim - 5) / 3) * (0.325-(-0.36)));
            zz = -0.23 + (((tickAnim - 5) / 3) * (-0.35-(-0.23)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 8) / 2) * (0.865-(0.325)));
            zz = -0.35 + (((tickAnim - 8) / 2) * (-0.455-(-0.35)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.865 + (((tickAnim - 10) / 3) * (0.865-(0.865)));
            zz = -0.455 + (((tickAnim - 10) / 3) * (-0.455-(-0.455)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.865 + (((tickAnim - 13) / 2) * (0.075-(0.865)));
            zz = -0.455 + (((tickAnim - 13) / 2) * (0-(-0.455)));
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
            xx = 0 + (((tickAnim - 3) / 2) * (-88.75-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -88.75 + (((tickAnim - 5) / 3) * (25-(-88.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 8) / 7) * (0-(25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*9), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-140))*6), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+120))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-190))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+180))*4));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0.025);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.7);


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+100))*5), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+20))*5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(23.8563+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+50))*-5), rightarm3.rotateAngleY + (float) Math.toRadians(7.10436), rightarm3.rotateAngleZ + (float) Math.toRadians(-18.5587));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+100))*5), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+20))*5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(23.8563+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+50))*-5), leftarm3.rotateAngleY + (float) Math.toRadians(-7.10436), leftarm3.rotateAngleZ + (float) Math.toRadians(18.5587));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-220))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0.35);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-280))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-350))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraFukuisaurus e = (EntityPrehistoricFloraFukuisaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.TOQUAD_ANIMATION);
        animator.startKeyframe(e.getToBiTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, -((0.0436F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((0.3491F)-(0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3054F)-(-0.3054F)));
        animator.rotate(cube_r12, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3054F)-(0.3054F)));
        animator.rotate(cube_r14, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.6109F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((0.288F)-(0.288F)), -((0.1745F)-(0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((0.1745F)-(0.1745F)), -((0.2618F)-(0.2618F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((0.0F)-(0.0F)), -((0.1745F)-(0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((0.0F)-(0.0F)), -((0.1309F)-(0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((0.1745F)-(0.1745F)), -((0.1309F)-(0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r25, -((0.0F)-(0.0F)), -((-0.1745F)-(-0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r26, -((0.2443F)-(0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r27, -((0.8116F)-(0.8116F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r28, -((0.1745F)-(0.1745F)), -((-0.2618F)-(-0.2618F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r29, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r30, -((0.288F)-(0.288F)), -((-0.1745F)-(-0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r31, -((0.2094F)-(0.2094F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r32, -((0.0F)-(0.0F)), -((-0.1309F)-(-0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r33, -((0.1745F)-(0.1745F)), -((-0.1309F)-(-0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r34, -((0.0F)-(0.0F)), -((0.1745F)-(0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r35, -((0.0F)-(0.0F)), -((0.1309F)-(0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r36, -((0.0F)-(0.0F)), -((-0.1309F)-(-0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r37, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r38, -((0.0F)-(0.0F)), -((-0.1745F)-(-0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((-0.6109F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.6545F)-(0.6545F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftarm, -((0.3451F)-(0.2142F)), -((0.0966F)-(0.0966F)),-((-0.1301F)-(-0.1301F)));
        animator.rotate(leftarm2, -((-1.376F)-(-0.8088F)), -((0.052F)-(0.2702F)),-((-0.0829F)-(-0.0829F)));
        animator.rotate(leftarm3, -((0.0F)-(0.0F)), -((0.1745F)-(0.4363F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg2, -((1.0297F)-(1.0297F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg3, -((-0.6981F)-(-0.6981F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.7418F)-(-0.7418F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((-0.6109F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, -((-0.7854F)-(-0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie3, -((-0.7854F)-(-0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightarm, -((0.3451F)-(0.2142F)), -((-0.0966F)-(-0.0966F)),-((0.1301F)-(0.1301F)));
        animator.rotate(rightarm2, -((-1.376F)-(-0.8088F)), -((-0.052F)-(-0.2702F)),-((0.0829F)-(0.0829F)));
        animator.rotate(rightarm3, -((0.0F)-(0.0F)), -((-0.1745F)-(-0.4363F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg2, -((1.0297F)-(1.0297F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg3, -((-0.6981F)-(-0.6981F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((-0.0436F)-(-0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));




        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.TOBI_ANIMATION);
        animator.startKeyframe(e.getToQuadTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, ((0.0436F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((0.3491F)-(0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3054F)-(-0.3054F)));
        animator.rotate(cube_r12, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3054F)-(0.3054F)));
        animator.rotate(cube_r14, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.6109F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((0.288F)-(0.288F)), ((0.1745F)-(0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((0.1745F)-(0.1745F)), ((0.2618F)-(0.2618F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((0.0F)-(0.0F)), ((0.1745F)-(0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((0.0F)-(0.0F)), ((0.1309F)-(0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((0.1745F)-(0.1745F)), ((0.1309F)-(0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r25, ((0.0F)-(0.0F)), ((-0.1745F)-(-0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r26, ((0.2443F)-(0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r27, ((0.8116F)-(0.8116F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r28, ((0.1745F)-(0.1745F)), ((-0.2618F)-(-0.2618F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r29, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r30, ((0.288F)-(0.288F)), ((-0.1745F)-(-0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r31, ((0.2094F)-(0.2094F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r32, ((0.0F)-(0.0F)), ((-0.1309F)-(-0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r33, ((0.1745F)-(0.1745F)), ((-0.1309F)-(-0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r34, ((0.0F)-(0.0F)), ((0.1745F)-(0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r35, ((0.0F)-(0.0F)), ((0.1309F)-(0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r36, ((0.0F)-(0.0F)), ((-0.1309F)-(-0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r37, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r38, ((0.0F)-(0.0F)), ((-0.1745F)-(-0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((-0.6109F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.6545F)-(0.6545F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftarm, ((0.3451F)-(0.2142F)), ((0.0966F)-(0.0966F)),((-0.1301F)-(-0.1301F)));
        animator.rotate(leftarm2, ((-1.376F)-(-0.8088F)), ((0.052F)-(0.2702F)),((-0.0829F)-(-0.0829F)));
        animator.rotate(leftarm3, ((0.0F)-(0.0F)), ((0.1745F)-(0.4363F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg2, ((1.0297F)-(1.0297F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg3, ((-0.6981F)-(-0.6981F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.7418F)-(-0.7418F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((-0.6109F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, ((-0.7854F)-(-0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie3, ((-0.7854F)-(-0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightarm, ((0.3451F)-(0.2142F)), ((-0.0966F)-(-0.0966F)),((0.1301F)-(0.1301F)));
        animator.rotate(rightarm2, ((-1.376F)-(-0.8088F)), ((-0.052F)-(-0.2702F)),((0.0829F)-(0.0829F)));
        animator.rotate(rightarm3, ((0.0F)-(0.0F)), ((-0.1745F)-(-0.4363F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg2, ((1.0297F)-(1.0297F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg3, ((-0.6981F)-(-0.6981F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((-0.0436F)-(-0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));




        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
