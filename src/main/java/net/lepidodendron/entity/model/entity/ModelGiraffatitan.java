package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGiraffatitan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGiraffatitan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer neck7;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer LIP_r1;
    private final AdvancedModelRenderer LIP_r2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer CREST;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer UNIMPORTANT;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer LIP_r3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer LIP_r4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer moveableFlesh;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer RotateInAnimToHideWhenMouthCloses;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r31;

    private ModelAnimator animator;

    public ModelGiraffatitan() {
        this.textureWidth = 512;
        this.textureHeight = 512;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(-0.5F, -30.8F, 38.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 100, 118, -16.5F, -5.5F, -25.0F, 34, 31, 33, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -14.0111F, -2.4302F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5149F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 235, 151, -12.5F, -0.0732F, -3.3257F, 26, 14, 17, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.5F, 4.0F, 7.5F);
        this.hips.addChild(tail1);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 13.0F, 2.0F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 266, 27, -10.5F, -22.4F, -10.925F, 23, 16, 13, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 13.0F, 2.0F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 204, 40, -9.0F, -12.0F, -11.5F, 20, 14, 21, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.7F, 8.075F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.5236F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 135, 274, -9.0F, -9.1495F, -2.4949F, 18, 17, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -4.1495F, 10.5051F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 256, -7.0F, -4.3682F, -3.0408F, 14, 14, 20, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.8682F, 16.9592F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 276, 265, -5.0F, -3.1309F, -2.9971F, 10, 10, 20, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1309F, 17.0029F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 49, 271, -3.0F, -2.5F, -3.0F, 6, 7, 20, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 156, 183, -1.5F, -2.0F, -3.0F, 3, 4, 17, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.75F, 14.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 97, 84, -0.5F, -1.0F, -1.0F, 1, 2, 17, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -14.5F, -3.5F);
        this.hips.addChild(body);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -20.3897F, -25.8791F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7156F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 151, -13.0F, -0.0027F, -2.301F, 26, 16, 33, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 10.0F, -22.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -19.5F, -20.225F, -22.45F, 40, 43, 39, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -20.5F, -26.2F);
        this.body.addChild(chest);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -9.4451F, -22.816F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5672F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 189, 183, -11.0F, -4.2254F, 0.1591F, 23, 19, 25, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 19.8293F, -24.3726F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 83, -15.0F, -19.7F, -20.2F, 30, 31, 36, 0.004F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 25.9F, -46.0F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6327F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 159, 0, -13.5F, -11.9821F, -0.2875F, 28, 12, 27, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(-0.5F, -5.5315F, -23.0953F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -1.0472F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 86, 183, -8.0F, -6.0267F, -30.8664F, 18, 15, 33, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 24.9733F, -31.6914F);
        this.neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 118, 42, -10.0F, -17.5F, -0.1F, 22, 17, 41, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0267F, -29.7914F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 201, -6.5F, -1.8198F, -23.0595F, 15, 27, 27, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 6.2802F, -22.0595F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 202, 101, -5.5F, -5.9003F, -21.9397F, 13, 23, 26, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.4003F, -19.9397F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 164, 228, -4.5F, -4.5F, -24.0F, 11, 20, 25, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.5F, -22.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.0873F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 255, 76, -3.5F, -3.1933F, -22.4282F, 9, 17, 23, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, 0.8067F, -20.4282F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.1309F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 198, 274, -3.0F, -3.1895F, -18.341F, 8, 14, 19, 0.0F, false));

        this.neck7 = new AdvancedModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, 0.0605F, -16.591F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.2618F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 2.8744F, -5.8465F);
        this.neck7.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0175F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 243, 0, -3.5F, -6.0F, -7.0F, 7, 12, 14, 0.0F, false));

        this.neck8 = new AdvancedModelRenderer(this);
        this.neck8.setRotationPoint(1.0F, 0.2244F, -12.3965F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.5236F, 0.0F, 0.0F);
        this.neck8.cubeList.add(new ModelBox(neck8, 148, 232, -3.0F, -2.916F, -10.516F, 6, 8, 12, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.316F, -9.166F);
        this.neck8.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.0824F, -9.7805F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.0908F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 156, 106, -3.0F, -3.38F, 0.006F, 5, 3, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 6.8976F, -10.6311F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.1694F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 160, -2.0F, -1.5F, -0.5F, 4, 3, 1, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 6.0675F, -8.4934F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.2479F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 97, 94, -2.5F, 0.9283F, -3.1199F, 5, 3, 3, 0.0F, false));

        this.LIP_r1 = new AdvancedModelRenderer(this);
        this.LIP_r1.setRotationPoint(-0.5F, 6.5675F, -9.0934F);
        this.head.addChild(LIP_r1);
        this.setRotateAngle(LIP_r1, -1.117F, 0.0F, 0.0F);
        this.LIP_r1.cubeList.add(new ModelBox(LIP_r1, 23, 114, -2.5F, 0.0864F, -1.0095F, 5, 3, 1, -0.012F, false));

        this.LIP_r2 = new AdvancedModelRenderer(this);
        this.LIP_r2.setRotationPoint(0.0F, 6.6824F, -9.3305F);
        this.head.addChild(LIP_r2);
        this.setRotateAngle(LIP_r2, -1.2217F, 0.0F, 0.0F);
        this.LIP_r2.cubeList.add(new ModelBox(LIP_r2, 143, 21, -3.5F, -5.0495F, -0.9801F, 6, 5, 1, -0.012F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0824F, -2.9805F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.2217F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 120, 104, -3.5F, -0.8296F, 0.5957F, 6, 9, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.0824F, -2.9805F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.5533F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 95, -3.5F, -3.0F, -3.0F, 7, 5, 7, 0.0F, false));

        this.CREST = new AdvancedModelRenderer(this);
        this.CREST.setRotationPoint(-0.5F, 4.3529F, -13.0825F);
        this.head.addChild(CREST);
        this.setRotateAngle(CREST, -1.0472F, 0.0F, 0.0F);
        this.CREST.cubeList.add(new ModelBox(CREST, 86, 151, -1.5F, -4.9F, 0.0F, 3, 5, 2, 0.02F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.CREST.addChild(bone2);
        this.setRotateAngle(bone2, 0.6981F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 158, 21, -1.5F, -1.4F, -0.05F, 3, 2, 2, 0.01F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -1.4F, 0.0F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, 0.3927F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 22, 95, -1.5F, -2.25F, -0.05F, 3, 3, 3, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, -2.25F, -0.05F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, -0.48F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 120, 6, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.01F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, -0.6545F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 120, 0, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.6981F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 17, 157, -1.5F, -2.0F, 0.0F, 3, 2, 2, -0.01F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.bone6.addChild(bone7);
        this.setRotateAngle(bone7, -0.1309F, 0.0F, 0.0F);
        this.bone7.cubeList.add(new ModelBox(bone7, 139, 111, -2.5F, -4.0F, 0.0F, 5, 4, 2, 0.01F, false));

        this.UNIMPORTANT = new AdvancedModelRenderer(this);
        this.UNIMPORTANT.setRotationPoint(-0.5F, 3.7229F, -10.5925F);
        this.head.addChild(UNIMPORTANT);
        this.setRotateAngle(UNIMPORTANT, -0.9948F, 0.0F, 0.0F);
        this.UNIMPORTANT.cubeList.add(new ModelBox(UNIMPORTANT, 120, 31, -2.5F, -4.25F, -0.15F, 5, 4, 2, 0.0F, false));

        this.bone8 = new AdvancedModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.UNIMPORTANT.addChild(bone8);
        this.setRotateAngle(bone8, 0.5323F, 0.0F, 0.0F);
        this.bone8.cubeList.add(new ModelBox(bone8, 139, 101, -2.5F, -4.95F, 0.0F, 5, 6, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.8324F, 0.5195F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -1.213F, 0.0F, 0.0F);


        this.LIP_r3 = new AdvancedModelRenderer(this);
        this.LIP_r3.setRotationPoint(-0.5F, 10.4252F, -0.9632F);
        this.jaw.addChild(LIP_r3);
        this.setRotateAngle(LIP_r3, 0.1309F, 0.0F, 0.0F);
        this.LIP_r3.cubeList.add(new ModelBox(LIP_r3, 141, 29, -3.0F, -6.2647F, -0.0598F, 6, 6, 2, -0.03F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 9.7252F, -0.5632F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 151, -3.0F, -5.636F, -0.1156F, 6, 6, 2, -0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 9.939F, 1.2859F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0785F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 97, 83, -3.0F, -7.7F, -1.85F, 6, 8, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 10.1252F, -0.7632F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0785F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 156, 101, -2.5F, -3.264F, -0.5509F, 5, 3, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 10.269F, 0.3859F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 86, 159, -2.0F, -0.6078F, -1.6F, 4, 3, 1, -0.01F, false));

        this.LIP_r4 = new AdvancedModelRenderer(this);
        this.LIP_r4.setRotationPoint(-0.5F, 10.519F, -0.7141F);
        this.jaw.addChild(LIP_r4);
        this.setRotateAngle(LIP_r4, 0.1658F, 0.0F, 0.0F);
        this.LIP_r4.cubeList.add(new ModelBox(LIP_r4, 154, 111, -2.5F, -0.478F, -0.2413F, 5, 3, 1, -0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 10.519F, 0.5859F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2531F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 17, 151, -2.5F, -0.7535F, -1.0499F, 5, 3, 2, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.5385F, -0.8976F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.5236F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 120, 21, -3.5F, -0.6236F, -0.418F, 7, 5, 4, -0.01F, false));

        this.moveableFlesh = new AdvancedModelRenderer(this);
        this.moveableFlesh.setRotationPoint(-0.5F, 5.3673F, -1.1049F);
        this.jaw.addChild(moveableFlesh);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.9509F, -0.6615F);
        this.moveableFlesh.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.6109F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 108, -3.0F, -0.5F, -1.25F, 6, 2, 3, -0.04F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(-0.5F, 9.7612F, 1.3859F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0436F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -9.1F, -5.8F);
        this.throat.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 108, -2.0F, 5.95F, -7.3F, 4, 2, 7, 0.0F, false));

        this.RotateInAnimToHideWhenMouthCloses = new AdvancedModelRenderer(this);
        this.RotateInAnimToHideWhenMouthCloses.setRotationPoint(0.0F, -5.2542F, -0.5816F);
        this.throat.addChild(RotateInAnimToHideWhenMouthCloses);


        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -5.25F, 1.0F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, -0.2618F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -3.9812F, -6.2083F);
        this.throat2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 97, 104, -2.0F, 2.35F, -2.05F, 4, 5, 7, 0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(15.5F, 23.5F, -30.8F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.1309F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 237, 228, -7.0F, -5.0F, -8.0F, 13, 40, 16, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, 33.0F, 4.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.4363F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, -4.5F, 0.0F, -9.0F, 9, 25, 10, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.0F, 24.0F, -8.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3054F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 281, 117, -6.0F, -1.0F, 0.0F, 10, 15, 8, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-8.0F, 8.0F, 4.0F);
        this.leftArm3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.48F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 1.5F, -2.05F, -2.0F, 2, 7, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-14.5F, 23.5F, -30.8F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.1309F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 237, 228, -6.0F, -5.0F, -8.0F, 13, 40, 16, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, 33.0F, 4.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4363F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -4.5F, 0.0F, -9.0F, 9, 25, 10, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.0F, 24.0F, -8.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3054F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 281, 117, -4.0F, -1.0F, 0.0F, 10, 15, 8, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(8.0F, 8.0F, 4.0F);
        this.rightArm3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.48F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -3.5F, -2.05F, -2.0F, 2, 7, 2, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(16.0F, 2.75F, -3.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1745F, 0.0F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 2.9289F, -0.6493F);
        this.leftLeg.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0279F, -0.014F, 0.0159F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 85, 232, -6.5F, -9.0F, -11.0F, 12, 35, 19, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 27.9289F, -6.6493F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4363F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 286, 183, -5.5F, -2.0F, -2.0F, 10, 27, 11, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 23.0F, 3.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2618F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 120, 0, -7.0F, -2.0F, -7.0F, 13, 7, 13, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.0F, -7.0F);
        this.leftLeg3.addChild(leftLeg4);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.leftLeg4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.2182F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 83, -6.0F, -4.0F, -2.5F, 11, 7, 4, -0.01F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-15.0F, 2.75F, -3.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1745F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.9289F, -0.6493F);
        this.rightLeg.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0279F, 0.014F, -0.0159F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 85, 232, -5.5F, -9.0F, -11.0F, 12, 35, 19, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 27.9289F, -6.6493F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4363F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 286, 183, -4.5F, -2.0F, -2.0F, 10, 27, 11, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 23.0F, 3.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2618F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 120, 0, -6.0F, -2.0F, -7.0F, 13, 7, 13, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.0F, -7.0F);
        this.rightLeg3.addChild(rightLeg4);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.rightLeg4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.2182F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 83, -5.0F, -4.0F, -2.5F, 11, 7, 4, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(chest, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -1.15F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.23F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.25F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neck6, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neck7, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(neck8, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, -1.0F, 0.0F, 0.0F);
        this.leftArm.setScale(0,0,0);
        this.rightArm.setScale(0,0,0);
        this.leftArm.scaleChildren = true;
        this.rightArm.scaleChildren = true;
        this.chest.offsetZ = 0.35F;
        this.chest.offsetY = -0.1F;
        this.chest.render(0.01f);
        this.leftArm.setScale(1,1,1);
        this.rightArm.setScale(1,1,1);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(body, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(chest, -0.03F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck6, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck7, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck8, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.25F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, -1.0F, 0.0F, 0.0F);
        this.setRotateAngle(throat, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail7, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm3, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, 0.0F);
        this.hips.offsetY = -0.07F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 2.1F;
        this.hips.offsetX = -0.45F;
        this.hips.rotateAngleY = (float)Math.toRadians(210);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-4);
        this.hips.scaleChildren = true;
        float scaler = 0.485F;
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
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraGiraffatitan Giraffatitan = (EntityPrehistoricFloraGiraffatitan) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = Giraffatitan.getJuvenile();

        if (isBaby) {
            this.neck8.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck8.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck8.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck8.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.neck7, this.neck8, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Giraffatitan.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Giraffatitan.getTravelSpeed()/2;

        if (!Giraffatitan.isInWater()) {

            if (f3 == 0.0F || !Giraffatitan.getIsMoving()) {
                if (Giraffatitan.getAnimation() != Giraffatitan.EAT_ANIMATION
                        && Giraffatitan.getAnimation() != Giraffatitan.DRINK_ANIMATION
                        && Giraffatitan.getAnimation() != Giraffatitan.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Giraffatitan.getAnimation() != Giraffatitan.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Giraffatitan.getAnimation() != Giraffatitan.EAT_ANIMATION
                    && Giraffatitan.getAnimation() != Giraffatitan.DRINK_ANIMATION
                    && Giraffatitan.getAnimation() != Giraffatitan.ATTACK_ANIMATION
                    && Giraffatitan.getAnimation() != Giraffatitan.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Giraffatitan.getIsFast()) { //Running
//                    float speed = masterSpeed / 2F;
//                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

            } else { //Walking
//                    float speed = masterSpeed / 1.50F;
//                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
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
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGiraffatitan ee = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The drink anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animLeafGrazeUpwards(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
//        else if (ee.getAnimation() == ee.TAIL_ANIMATION) { //The leaves grazing anim
//            animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }


    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 190;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 6.25 + (((tickAnim - 80) / 40) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 6.25 + (((tickAnim - 120) / 70) * (0-(6.25)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0.7 + (((tickAnim - 80) / 40) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 0.7 + (((tickAnim - 120) / 70) * (0-(0.7)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -2.25 + (((tickAnim - 48) / 32) * (17.5-(-2.25)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 17.5 + (((tickAnim - 80) / 40) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = 17.5 + (((tickAnim - 120) / 37) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 172) {
            xx = 17.5 + (((tickAnim - 157) / 15) * (-0.25-(17.5)));
            yy = 0 + (((tickAnim - 157) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 15) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = -0.25 + (((tickAnim - 172) / 18) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 172) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 172) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 80 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 80) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 80) / 2) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 82) / 38) * (0-(0)));
            yy = -0.2 + (((tickAnim - 82) / 38) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 82) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = -4.25 + (((tickAnim - 48) / 15) * (23.12-(-4.25)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 23.12 + (((tickAnim - 63) / 17) * (-18.75-(23.12)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -18.75 + (((tickAnim - 80) / 40) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = -18.75 + (((tickAnim - 120) / 37) * (-11.5-(-18.75)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = -11.5 + (((tickAnim - 157) / 8) * (-21.27-(-11.5)));
            yy = 0 + (((tickAnim - 157) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 8) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 172) {
            xx = -21.27 + (((tickAnim - 165) / 7) * (-2.9-(-21.27)));
            yy = 0 + (((tickAnim - 165) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 7) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = -2.9 + (((tickAnim - 172) / 18) * (0-(-2.9)));
            yy = 0 + (((tickAnim - 172) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 172) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (1.975-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = 1.975 + (((tickAnim - 63) / 17) * (0-(1.975)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 157) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 157) / 8) * (5.35-(0)));
            zz = 0 + (((tickAnim - 157) / 8) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 172) {
            xx = 0 + (((tickAnim - 165) / 7) * (0-(0)));
            yy = 5.35 + (((tickAnim - 165) / 7) * (0.175-(5.35)));
            zz = 0 + (((tickAnim - 165) / 7) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 172) / 18) * (0-(0)));
            yy = 0.175 + (((tickAnim - 172) / 18) * (0-(0.175)));
            zz = 0 + (((tickAnim - 172) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 4 + (((tickAnim - 48) / 15) * (30.21-(4)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 30.21 + (((tickAnim - 63) / 17) * (-4-(30.21)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -4 + (((tickAnim - 80) / 40) * (-4-(-4)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = -4 + (((tickAnim - 120) / 37) * (-8-(-4)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = -8 + (((tickAnim - 157) / 8) * (34.85923-(-8)));
            yy = 0 + (((tickAnim - 157) / 8) * (2.21404-(0)));
            zz = 0 + (((tickAnim - 157) / 8) * (-0.34135-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 172) {
            xx = 34.85923 + (((tickAnim - 165) / 7) * (1.20777-(34.85923)));
            yy = 2.21404 + (((tickAnim - 165) / 7) * (0.66421-(2.21404)));
            zz = -0.34135 + (((tickAnim - 165) / 7) * (-0.10241-(-0.34135)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = 1.20777 + (((tickAnim - 172) / 18) * (0-(1.20777)));
            yy = 0.66421 + (((tickAnim - 172) / 18) * (0-(0.66421)));
            zz = -0.10241 + (((tickAnim - 172) / 18) * (0-(-0.10241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -1.25 + (((tickAnim - 120) / 70) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -1.5 + (((tickAnim - 120) / 70) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-2.46168-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (-0.27574-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (-0.33196-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -2.46168 + (((tickAnim - 120) / 70) * (0-(-2.46168)));
            yy = -0.27574 + (((tickAnim - 120) / 70) * (0-(-0.27574)));
            zz = -0.33196 + (((tickAnim - 120) / 70) * (0-(-0.33196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -5 + (((tickAnim - 120) / 70) * (0-(-5)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 18.75 + (((tickAnim - 80) / 40) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 18.75 + (((tickAnim - 120) / 70) * (0-(18.75)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (2.25-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 1.675 + (((tickAnim - 80) / 40) * (1.675-(1.675)));
            zz = 2.25 + (((tickAnim - 80) / 40) * (2.25-(2.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 1.675 + (((tickAnim - 120) / 70) * (0-(1.675)));
            zz = 2.25 + (((tickAnim - 120) / 70) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 10.75 + (((tickAnim - 80) / 40) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 10.75 + (((tickAnim - 120) / 70) * (0-(10.75)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.65-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 1.1 + (((tickAnim - 80) / 40) * (1.1-(1.1)));
            zz = 0.65 + (((tickAnim - 80) / 40) * (0.65-(0.65)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 1.1 + (((tickAnim - 120) / 70) * (0-(1.1)));
            zz = 0.65 + (((tickAnim - 120) / 70) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (15.57-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 62) {
            xx = 15.57 + (((tickAnim - 50) / 12) * (20.83-(15.57)));
            yy = 0 + (((tickAnim - 50) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 12) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 72) {
            xx = 20.83 + (((tickAnim - 62) / 10) * (22.42-(20.83)));
            yy = 0 + (((tickAnim - 62) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 10) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 22.42 + (((tickAnim - 72) / 8) * (21.75-(22.42)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 21.75 + (((tickAnim - 80) / 40) * (21-(21.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 21 + (((tickAnim - 120) / 70) * (0-(21)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (1.8-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = -1.05 + (((tickAnim - 80) / 40) * (-1.05-(-1.05)));
            zz = 1.8 + (((tickAnim - 80) / 40) * (1.8-(1.8)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = -1.05 + (((tickAnim - 120) / 70) * (0-(-1.05)));
            zz = 1.8 + (((tickAnim - 120) / 70) * (0-(1.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (13.21148-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.42981-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.46761-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 13.21148 + (((tickAnim - 80) / 40) * (11.46148-(13.21148)));
            yy = -0.42981 + (((tickAnim - 80) / 40) * (-0.42981-(-0.42981)));
            zz = 0.46761 + (((tickAnim - 80) / 40) * (0.46761-(0.46761)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 11.46148 + (((tickAnim - 120) / 70) * (0-(11.46148)));
            yy = -0.42981 + (((tickAnim - 120) / 70) * (0-(-0.42981)));
            zz = 0.46761 + (((tickAnim - 120) / 70) * (0-(0.46761)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 24.25 + (((tickAnim - 80) / 40) * (23-(24.25)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 23 + (((tickAnim - 120) / 70) * (0-(23)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 17 + (((tickAnim - 80) / 40) * (19.5-(17)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 19.5 + (((tickAnim - 120) / 70) * (0-(19.5)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 7.75 + (((tickAnim - 80) / 40) * (11-(7.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 11 + (((tickAnim - 120) / 70) * (0-(11)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-12.25728-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.49696-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.67798-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -12.25728 + (((tickAnim - 80) / 40) * (-6-(-12.25728)));
            yy = 0.49696 + (((tickAnim - 80) / 40) * (0-(0.49696)));
            zz = -1.67798 + (((tickAnim - 80) / 40) * (0-(-1.67798)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = -6 + (((tickAnim - 120) / 23) * (-0.97-(-6)));
            yy = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 190) {
            xx = -0.97 + (((tickAnim - 143) / 47) * (0-(-0.97)));
            yy = 0 + (((tickAnim - 143) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.66527-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.63145-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-10.0697-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.66527 + (((tickAnim - 10) / 10) * (-7.33054-(-8.66527)));
            yy = -2.63145 + (((tickAnim - 10) / 10) * (-5.2629-(-2.63145)));
            zz = -10.0697 + (((tickAnim - 10) / 10) * (-20.13939-(-10.0697)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -7.33054 + (((tickAnim - 20) / 60) * (-42.0692-(-7.33054)));
            yy = -5.2629 + (((tickAnim - 20) / 60) * (-12.29628-(-5.2629)));
            zz = -20.13939 + (((tickAnim - 20) / 60) * (-11.23604-(-20.13939)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -42.0692 + (((tickAnim - 80) / 40) * (-42.0692-(-42.0692)));
            yy = -12.29628 + (((tickAnim - 80) / 40) * (-12.29628-(-12.29628)));
            zz = -11.23604 + (((tickAnim - 80) / 40) * (-11.23604-(-11.23604)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -42.0692 + (((tickAnim - 120) / 20) * (-33.20373-(-42.0692)));
            yy = -12.29628 + (((tickAnim - 120) / 20) * (-8.97379-(-12.29628)));
            zz = -11.23604 + (((tickAnim - 120) / 20) * (-11.7357-(-11.23604)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = -33.20373 + (((tickAnim - 140) / 8) * (-19.65143-(-33.20373)));
            yy = -8.97379 + (((tickAnim - 140) / 8) * (-5.13396-(-8.97379)));
            zz = -11.7357 + (((tickAnim - 140) / 8) * (-13.35205-(-11.7357)));
        }
        else if (tickAnim >= 148 && tickAnim < 157) {
            xx = -19.65143 + (((tickAnim - 148) / 9) * (-17.25-(-19.65143)));
            yy = -5.13396 + (((tickAnim - 148) / 9) * (0-(-5.13396)));
            zz = -13.35205 + (((tickAnim - 148) / 9) * (0-(-13.35205)));
        }
        else if (tickAnim >= 157 && tickAnim < 190) {
            xx = -17.25 + (((tickAnim - 157) / 33) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 157) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (-2.875-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -2.875 + (((tickAnim - 20) / 2) * (-2.29-(-2.875)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -2.29 + (((tickAnim - 22) / 1) * (-1.8-(-2.29)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -1.8 + (((tickAnim - 23) / 2) * (-1.515-(-1.8)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -1.515 + (((tickAnim - 25) / 2) * (-1.525-(-1.515)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 27) / 53) * (0-(0)));
            yy = -1.525 + (((tickAnim - 27) / 53) * (7.1-(-1.525)));
            zz = 0 + (((tickAnim - 27) / 53) * (-1.025-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 7.1 + (((tickAnim - 80) / 40) * (7.1-(7.1)));
            zz = -1.025 + (((tickAnim - 80) / 40) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 7.1 + (((tickAnim - 120) / 20) * (6.36-(7.1)));
            zz = -1.025 + (((tickAnim - 120) / 20) * (0-(-1.025)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            yy = 6.36 + (((tickAnim - 140) / 17) * (11.75-(6.36)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 157) / 33) * (0-(0)));
            yy = 11.75 + (((tickAnim - 157) / 33) * (0-(11.75)));
            zz = 0 + (((tickAnim - 157) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19.50315-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.97085-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (11.85467-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.50315 + (((tickAnim - 10) / 10) * (-24.4756-(-19.50315)));
            yy = -5.97085 + (((tickAnim - 10) / 10) * (8.32854-(-5.97085)));
            zz = 11.85467 + (((tickAnim - 10) / 10) * (18.95711-(11.85467)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -24.4756 + (((tickAnim - 20) / 60) * (-31.24006-(-24.4756)));
            yy = 8.32854 + (((tickAnim - 20) / 60) * (0.11574-(8.32854)));
            zz = 18.95711 + (((tickAnim - 20) / 60) * (11.99584-(18.95711)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -31.24006 + (((tickAnim - 80) / 40) * (-31.24006-(-31.24006)));
            yy = 0.11574 + (((tickAnim - 80) / 40) * (0.11574-(0.11574)));
            zz = 11.99584 + (((tickAnim - 80) / 40) * (11.99584-(11.99584)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -31.24006 + (((tickAnim - 120) / 20) * (-14.23634-(-31.24006)));
            yy = 0.11574 + (((tickAnim - 120) / 20) * (-0.86875-(0.11574)));
            zz = 11.99584 + (((tickAnim - 120) / 20) * (12.94847-(11.99584)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = -14.23634 + (((tickAnim - 140) / 8) * (-20.63161-(-14.23634)));
            yy = -0.86875 + (((tickAnim - 140) / 8) * (2.21077-(-0.86875)));
            zz = 12.94847 + (((tickAnim - 140) / 8) * (16.67196-(12.94847)));
        }
        else if (tickAnim >= 148 && tickAnim < 157) {
            xx = -20.63161 + (((tickAnim - 148) / 9) * (0-(-20.63161)));
            yy = 2.21077 + (((tickAnim - 148) / 9) * (0-(2.21077)));
            zz = 16.67196 + (((tickAnim - 148) / 9) * (0-(16.67196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 10) / 70) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 70) * (2.695-(1)));
            zz = 0 + (((tickAnim - 10) / 70) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 2.695 + (((tickAnim - 80) / 40) * (2.695-(2.695)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 2.695 + (((tickAnim - 120) / 20) * (4.8-(2.695)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            yy = 4.8 + (((tickAnim - 140) / 17) * (0-(4.8)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 49 + (((tickAnim - 10) / 10) * (25.5-(49)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 25.5 + (((tickAnim - 20) / 60) * (42.1812-(25.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (-4.06086-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (1.94055-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 42.1812 + (((tickAnim - 80) / 40) * (42.1812-(42.1812)));
            yy = -4.06086 + (((tickAnim - 80) / 40) * (-4.06086-(-4.06086)));
            zz = 1.94055 + (((tickAnim - 80) / 40) * (1.94055-(1.94055)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 42.1812 + (((tickAnim - 120) / 20) * (24-(42.1812)));
            yy = -4.06086 + (((tickAnim - 120) / 20) * (0-(-4.06086)));
            zz = 1.94055 + (((tickAnim - 120) / 20) * (0-(1.94055)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = 24 + (((tickAnim - 140) / 8) * (49.86-(24)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 157) {
            xx = 49.86 + (((tickAnim - 148) / 9) * (0-(49.86)));
            yy = 0 + (((tickAnim - 148) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (15.09197-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (12.08175-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (3.23057-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 15.09197 + (((tickAnim - 63) / 17) * (0-(15.09197)));
            yy = 12.08175 + (((tickAnim - 63) / 17) * (0-(12.08175)));
            zz = 3.23057 + (((tickAnim - 63) / 17) * (0-(3.23057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = -0.325 + (((tickAnim - 63) / 17) * (0-(-0.325)));
            zz = 0.65 + (((tickAnim - 63) / 17) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 190) {
            xx = -4.25 + (((tickAnim - 80) / 110) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 80) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 110) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 190) {
            xx = -2.5 + (((tickAnim - 80) / 110) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 80) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 110) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 68) {
            xx = 4 + (((tickAnim - 33) / 35) * (7.86-(4)));
            yy = 0 + (((tickAnim - 33) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 35) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 7.86 + (((tickAnim - 68) / 12) * (2.25-(7.86)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 97) {
            xx = 2.25 + (((tickAnim - 80) / 17) * (5.64-(2.25)));
            yy = 0 + (((tickAnim - 80) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 17) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 190) {
            xx = 5.64 + (((tickAnim - 97) / 93) * (0-(5.64)));
            yy = 0 + (((tickAnim - 97) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 93) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 33) / 35) * (0-(0)));
            yy = 0.275 + (((tickAnim - 33) / 35) * (1.31-(0.275)));
            zz = 0 + (((tickAnim - 33) / 35) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 1.31 + (((tickAnim - 68) / 12) * (0.275-(1.31)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 80) / 17) * (0-(0)));
            yy = 0.275 + (((tickAnim - 80) / 17) * (0.98-(0.275)));
            zz = 0 + (((tickAnim - 80) / 17) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 97) / 14) * (0-(0)));
            yy = 0.98 + (((tickAnim - 97) / 14) * (2.155-(0.98)));
            zz = 0 + (((tickAnim - 97) / 14) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 111) / 79) * (0-(0)));
            yy = 2.155 + (((tickAnim - 111) / 79) * (0-(2.155)));
            zz = 0 + (((tickAnim - 111) / 79) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-21.4997-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.02727-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.2497-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 97) {
            xx = -21.4997 + (((tickAnim - 80) / 17) * (-9.93733-(-21.4997)));
            yy = -0.02727 + (((tickAnim - 80) / 17) * (-0.01591-(-0.02727)));
            zz = -1.2497 + (((tickAnim - 80) / 17) * (-0.72899-(-1.2497)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = -9.93733 + (((tickAnim - 97) / 14) * (-12.39502-(-9.93733)));
            yy = -0.01591 + (((tickAnim - 97) / 14) * (-0.00625-(-0.01591)));
            zz = -0.72899 + (((tickAnim - 97) / 14) * (-0.28639-(-0.72899)));
        }
        else if (tickAnim >= 111 && tickAnim < 120) {
            xx = -12.39502 + (((tickAnim - 111) / 9) * (-5.75-(-12.39502)));
            yy = -0.00625 + (((tickAnim - 111) / 9) * (0-(-0.00625)));
            zz = -0.28639 + (((tickAnim - 111) / 9) * (0-(-0.28639)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = -5.75 + (((tickAnim - 120) / 23) * (4.7-(-5.75)));
            yy = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 190) {
            xx = 4.7 + (((tickAnim - 143) / 47) * (0-(4.7)));
            yy = 0 + (((tickAnim - 143) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (2.75-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 80) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 110) * (0-(0)));
            zz = 2.75 + (((tickAnim - 80) / 110) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (21.25-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 97) {
            xx = 21.25 + (((tickAnim - 80) / 17) * (0.9-(21.25)));
            yy = 0 + (((tickAnim - 80) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 17) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = 0.9 + (((tickAnim - 97) / 14) * (17.35-(0.9)));
            yy = 0 + (((tickAnim - 97) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 14) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 120) {
            xx = 17.35 + (((tickAnim - 111) / 9) * (0-(17.35)));
            yy = 0 + (((tickAnim - 111) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 9) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 20) / 10) * (-21.62985-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (11.09116-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (9.83778-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.62985 + (((tickAnim - 30) / 10) * (-40.59112-(-21.62985)));
            yy = 11.09116 + (((tickAnim - 30) / 10) * (13.91564-(11.09116)));
            zz = 9.83778 + (((tickAnim - 30) / 10) * (15.54709-(9.83778)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -40.59112 + (((tickAnim - 40) / 40) * (-48.34112-(-40.59112)));
            yy = 13.91564 + (((tickAnim - 40) / 40) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 40) / 40) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -48.34112 + (((tickAnim - 80) / 40) * (-48.34112-(-48.34112)));
            yy = 13.91564 + (((tickAnim - 80) / 40) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 80) / 40) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -48.34112 + (((tickAnim - 120) / 10) * (-33.27088-(-48.34112)));
            yy = 13.91564 + (((tickAnim - 120) / 10) * (3.33577-(13.91564)));
            zz = 15.54709 + (((tickAnim - 120) / 10) * (12.33981-(15.54709)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -33.27088 + (((tickAnim - 130) / 10) * (-23.75-(-33.27088)));
            yy = 3.33577 + (((tickAnim - 130) / 10) * (0-(3.33577)));
            zz = 12.33981 + (((tickAnim - 130) / 10) * (0-(12.33981)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = -23.75 + (((tickAnim - 140) / 50) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.785-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 5.785 + (((tickAnim - 20) / 10) * (5.32-(5.785)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 5.32 + (((tickAnim - 30) / 10) * (2.475-(5.32)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 2.475 + (((tickAnim - 40) / 2) * (2.615-(2.475)));
            zz = 0 + (((tickAnim - 40) / 2) * (-0.24-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 2.615 + (((tickAnim - 42) / 1) * (3.33-(2.615)));
            zz = -0.24 + (((tickAnim - 42) / 1) * (-0.48-(-0.24)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 3.33 + (((tickAnim - 43) / 2) * (3.555-(3.33)));
            zz = -0.48 + (((tickAnim - 43) / 2) * (-0.72-(-0.48)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = 3.555 + (((tickAnim - 45) / 2) * (3.995-(3.555)));
            zz = -0.72 + (((tickAnim - 45) / 2) * (-0.95-(-0.72)));
        }
        else if (tickAnim >= 47 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 47) / 33) * (0-(0)));
            yy = 3.995 + (((tickAnim - 47) / 33) * (11.125-(3.995)));
            zz = -0.95 + (((tickAnim - 47) / 33) * (-5.65-(-0.95)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 11.125 + (((tickAnim - 80) / 40) * (11.125-(11.125)));
            zz = -5.65 + (((tickAnim - 80) / 40) * (-5.65-(-5.65)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            yy = 11.125 + (((tickAnim - 120) / 10) * (18.25-(11.125)));
            zz = -5.65 + (((tickAnim - 120) / 10) * (0-(-5.65)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            yy = 18.25 + (((tickAnim - 130) / 10) * (16.775-(18.25)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            yy = 16.775 + (((tickAnim - 140) / 50) * (0-(16.775)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-9.89182-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (5.88873-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-14.25674-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.89182 + (((tickAnim - 30) / 10) * (-3.24284-(-9.89182)));
            yy = 5.88873 + (((tickAnim - 30) / 10) * (-5.17504-(5.88873)));
            zz = -14.25674 + (((tickAnim - 30) / 10) * (-17.70737-(-14.25674)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -3.24284 + (((tickAnim - 40) / 40) * (-29.71715-(-3.24284)));
            yy = -5.17504 + (((tickAnim - 40) / 40) * (-4.20264-(-5.17504)));
            zz = -17.70737 + (((tickAnim - 40) / 40) * (-17.08704-(-17.70737)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -29.71715 + (((tickAnim - 80) / 40) * (-29.71715-(-29.71715)));
            yy = -4.20264 + (((tickAnim - 80) / 40) * (-4.20264-(-4.20264)));
            zz = -17.08704 + (((tickAnim - 80) / 40) * (-17.08704-(-17.08704)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -29.71715 + (((tickAnim - 120) / 10) * (-15.69522-(-29.71715)));
            yy = -4.20264 + (((tickAnim - 120) / 10) * (-9.55078-(-4.20264)));
            zz = -17.08704 + (((tickAnim - 120) / 10) * (-11.97888-(-17.08704)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -15.69522 + (((tickAnim - 130) / 10) * (-6.25-(-15.69522)));
            yy = -9.55078 + (((tickAnim - 130) / 10) * (0-(-9.55078)));
            zz = -11.97888 + (((tickAnim - 130) / 10) * (0-(-11.97888)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = -6.25 + (((tickAnim - 140) / 50) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (54.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 54.5 + (((tickAnim - 30) / 8) * (19.19311-(54.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (2.5448-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (-1.92053-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 19.19311 + (((tickAnim - 38) / 2) * (27.42414-(19.19311)));
            yy = 2.5448 + (((tickAnim - 38) / 2) * (3.39307-(2.5448)));
            zz = -1.92053 + (((tickAnim - 38) / 2) * (-2.56071-(-1.92053)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 27.42414 + (((tickAnim - 40) / 40) * (43.41634-(27.42414)));
            yy = 3.39307 + (((tickAnim - 40) / 40) * (4.15332-(3.39307)));
            zz = -2.56071 + (((tickAnim - 40) / 40) * (-2.30689-(-2.56071)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 43.41634 + (((tickAnim - 80) / 40) * (43.41634-(43.41634)));
            yy = 4.15332 + (((tickAnim - 80) / 40) * (4.15332-(4.15332)));
            zz = -2.30689 + (((tickAnim - 80) / 40) * (-2.30689-(-2.30689)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 43.41634 + (((tickAnim - 120) / 10) * (41.75-(43.41634)));
            yy = 4.15332 + (((tickAnim - 120) / 10) * (0-(4.15332)));
            zz = -2.30689 + (((tickAnim - 120) / 10) * (0-(-2.30689)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 41.75 + (((tickAnim - 130) / 10) * (7-(41.75)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = 7 + (((tickAnim - 140) / 50) * (0-(7)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -3.5 + (((tickAnim - 80) / 40) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -3.5 + (((tickAnim - 120) / 70) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -4.75 + (((tickAnim - 80) / 40) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -4.75 + (((tickAnim - 120) / 70) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 1.5 + (((tickAnim - 80) / 40) * (4-(1.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 4 + (((tickAnim - 120) / 70) * (0-(4)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 252;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (5.5-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 5.5 + (((tickAnim - 101) / 38) * (-25.25-(5.5)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = -25.25 + (((tickAnim - 139) / 30) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = -25.25 + (((tickAnim - 169) / 25) * (5.5-(-25.25)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 5.5 + (((tickAnim - 194) / 14) * (14.25-(5.5)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 253) {
            xx = 14.25 + (((tickAnim - 208) / 45) * (0-(14.25)));
            yy = 0 + (((tickAnim - 208) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (-19.475-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 38) * (0.625-(0)));
            zz = -19.475 + (((tickAnim - 101) / 38) * (-22-(-19.475)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 139) / 15) * (0.625-(0.625)));
            zz = -22 + (((tickAnim - 139) / 15) * (-22-(-22)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 154) / 15) * (0.625-(0.625)));
            zz = -22 + (((tickAnim - 154) / 15) * (-22-(-22)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            yy = 0.625 + (((tickAnim - 169) / 25) * (2.63-(0.625)));
            zz = -22 + (((tickAnim - 169) / 25) * (-28.07-(-22)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            yy = 2.63 + (((tickAnim - 194) / 14) * (2.63-(2.63)));
            zz = -28.07 + (((tickAnim - 194) / 14) * (-28.07-(-28.07)));
        }
        else if (tickAnim >= 208 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 208) / 45) * (0-(0)));
            yy = 2.63 + (((tickAnim - 208) / 45) * (0-(2.63)));
            zz = -28.07 + (((tickAnim - 208) / 45) * (0-(-28.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (-46.5-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = -46.5 + (((tickAnim - 91) / 10) * (-52.5-(-46.5)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = -52.5 + (((tickAnim - 101) / 38) * (2.25-(-52.5)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 2.25 + (((tickAnim - 139) / 15) * (7-(2.25)));
            yy = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 7 + (((tickAnim - 154) / 15) * (7-(7)));
            yy = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 7 + (((tickAnim - 169) / 25) * (-7-(7)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = -7 + (((tickAnim - 194) / 14) * (-14.5-(-7)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 236) {
            xx = -14.5 + (((tickAnim - 208) / 28) * (-22.75-(-14.5)));
            yy = 0 + (((tickAnim - 208) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 28) * (0-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 253) {
            xx = -22.75 + (((tickAnim - 236) / 17) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 236) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 236) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 78) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 78) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 13) * (-7.64-(0)));
            zz = 0 + (((tickAnim - 78) / 13) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            yy = -7.64 + (((tickAnim - 91) / 10) * (-7.64-(-7.64)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            yy = -7.64 + (((tickAnim - 101) / 38) * (-2.65-(-7.64)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            yy = -2.65 + (((tickAnim - 139) / 15) * (-3.425-(-2.65)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            yy = -3.425 + (((tickAnim - 154) / 15) * (-3.425-(-3.425)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            yy = -3.425 + (((tickAnim - 169) / 25) * (0-(-3.425)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 236) {
            xx = 0 + (((tickAnim - 208) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 28) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 208) / 28) * (-4.1-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 236) / 17) * (0-(0)));
            yy = -0.525 + (((tickAnim - 236) / 17) * (0-(-0.525)));
            zz = -4.1 + (((tickAnim - 236) / 17) * (0-(-4.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 74) / 9) * (-14.05-(0)));
            yy = 0 + (((tickAnim - 74) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 9) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 91) {
            xx = -14.05 + (((tickAnim - 83) / 8) * (7.25-(-14.05)));
            yy = 0 + (((tickAnim - 83) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 8) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 7.25 + (((tickAnim - 91) / 10) * (20.5-(7.25)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 20.5 + (((tickAnim - 101) / 38) * (4-(20.5)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 148) {
            xx = 4 + (((tickAnim - 139) / 9) * (12.89-(4)));
            yy = 0 + (((tickAnim - 139) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 9) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 154) {
            xx = 12.89 + (((tickAnim - 148) / 6) * (2.75-(12.89)));
            yy = 0 + (((tickAnim - 148) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 6) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 2.75 + (((tickAnim - 154) / 15) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 2.75 + (((tickAnim - 169) / 25) * (-17.5-(2.75)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = -17.5 + (((tickAnim - 194) / 14) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 236) {
            xx = -17.5 + (((tickAnim - 208) / 28) * (-9.5-(-17.5)));
            yy = 0 + (((tickAnim - 208) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 28) * (0-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 243) {
            xx = -9.5 + (((tickAnim - 236) / 7) * (27.29-(-9.5)));
            yy = 0 + (((tickAnim - 236) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 236) / 7) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 253) {
            xx = 27.29 + (((tickAnim - 243) / 10) * (0-(27.29)));
            yy = 0 + (((tickAnim - 243) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 74) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 9) * (5.85-(0)));
            zz = 0 + (((tickAnim - 74) / 9) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 83) / 8) * (0.575-(0)));
            yy = 5.85 + (((tickAnim - 83) / 8) * (-3.72-(5.85)));
            zz = 0 + (((tickAnim - 83) / 8) * (3.35-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0.575 + (((tickAnim - 91) / 10) * (0.575-(0.575)));
            yy = -3.72 + (((tickAnim - 91) / 10) * (-0.82-(-3.72)));
            zz = 3.35 + (((tickAnim - 91) / 10) * (8.525-(3.35)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 0.575 + (((tickAnim - 101) / 38) * (0-(0.575)));
            yy = -0.82 + (((tickAnim - 101) / 38) * (-2.7-(-0.82)));
            zz = 8.525 + (((tickAnim - 101) / 38) * (1.775-(8.525)));
        }
        else if (tickAnim >= 139 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 139) / 9) * (0-(0)));
            yy = -2.7 + (((tickAnim - 139) / 9) * (0.61-(-2.7)));
            zz = 1.775 + (((tickAnim - 139) / 9) * (0-(1.775)));
        }
        else if (tickAnim >= 148 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 148) / 6) * (0-(0)));
            yy = 0.61 + (((tickAnim - 148) / 6) * (-0.75-(0.61)));
            zz = 0 + (((tickAnim - 148) / 6) * (3.6-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            yy = -0.75 + (((tickAnim - 154) / 15) * (-0.575-(-0.75)));
            zz = 3.6 + (((tickAnim - 154) / 15) * (3.6-(3.6)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            yy = -0.575 + (((tickAnim - 169) / 25) * (0.28-(-0.575)));
            zz = 3.6 + (((tickAnim - 169) / 25) * (0-(3.6)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            yy = 0.28 + (((tickAnim - 194) / 14) * (0.28-(0.28)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 236) {
            xx = 0 + (((tickAnim - 208) / 28) * (0.175-(0)));
            yy = 0.28 + (((tickAnim - 208) / 28) * (-4.45-(0.28)));
            zz = 0 + (((tickAnim - 208) / 28) * (1.75-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 253) {
            xx = 0.175 + (((tickAnim - 236) / 17) * (0-(0.175)));
            yy = -4.45 + (((tickAnim - 236) / 17) * (0-(-4.45)));
            zz = 1.75 + (((tickAnim - 236) / 17) * (0-(1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 74) / 9) * (41.53-(0)));
            yy = 0 + (((tickAnim - 74) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 9) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 91) {
            xx = 41.53 + (((tickAnim - 83) / 8) * (36-(41.53)));
            yy = 0 + (((tickAnim - 83) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 8) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 36 + (((tickAnim - 91) / 10) * (27-(36)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 27 + (((tickAnim - 101) / 38) * (19.25-(27)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 148) {
            xx = 19.25 + (((tickAnim - 139) / 9) * (25.89-(19.25)));
            yy = 0 + (((tickAnim - 139) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 9) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 154) {
            xx = 25.89 + (((tickAnim - 148) / 6) * (14.25-(25.89)));
            yy = 0 + (((tickAnim - 148) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 6) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 14.25 + (((tickAnim - 154) / 15) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 14.25 + (((tickAnim - 169) / 25) * (19.25-(14.25)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 19.25 + (((tickAnim - 194) / 14) * (18.25-(19.25)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 236) {
            xx = 18.25 + (((tickAnim - 208) / 28) * (28.25-(18.25)));
            yy = 0 + (((tickAnim - 208) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 28) * (0-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 243) {
            xx = 28.25 + (((tickAnim - 236) / 7) * (38.29-(28.25)));
            yy = 0 + (((tickAnim - 236) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 236) / 7) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 253) {
            xx = 38.29 + (((tickAnim - 243) / 10) * (0-(38.29)));
            yy = 0 + (((tickAnim - 243) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (-1.75-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            yy = -1.75 + (((tickAnim - 91) / 10) * (0.125-(-1.75)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            yy = 0.125 + (((tickAnim - 101) / 38) * (-1.35-(0.125)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            yy = -1.35 + (((tickAnim - 139) / 15) * (0.625-(-1.35)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 154) / 15) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            yy = 0.625 + (((tickAnim - 169) / 25) * (-1.2-(0.625)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            yy = -1.2 + (((tickAnim - 194) / 14) * (-0.725-(-1.2)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 236) {
            xx = 0 + (((tickAnim - 208) / 28) * (0-(0)));
            yy = -0.725 + (((tickAnim - 208) / 28) * (1.875-(-0.725)));
            zz = 0 + (((tickAnim - 208) / 28) * (0-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 236) / 17) * (0-(0)));
            yy = 1.875 + (((tickAnim - 236) / 17) * (0-(1.875)));
            zz = 0 + (((tickAnim - 236) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 0) / 101) * (-7.0181-(0)));
            yy = 0 + (((tickAnim - 0) / 101) * (-1.03872-(0)));
            zz = 0 + (((tickAnim - 0) / 101) * (2.99599-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = -7.0181 + (((tickAnim - 101) / 38) * (12.5-(-7.0181)));
            yy = -1.03872 + (((tickAnim - 101) / 38) * (0-(-1.03872)));
            zz = 2.99599 + (((tickAnim - 101) / 38) * (0-(2.99599)));
        }
        else if (tickAnim >= 139 && tickAnim < 212) {
            xx = 12.5 + (((tickAnim - 139) / 73) * (3.1535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(12.5)));
            yy = 0 + (((tickAnim - 139) / 73) * (-5.64574-(0)));
            zz = 0 + (((tickAnim - 139) / 73) * (4.33451-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 3.1535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 212) / 41) * (0-(3.1535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = -5.64574 + (((tickAnim - 212) / 41) * (0-(-5.64574)));
            zz = 4.33451 + (((tickAnim - 212) / 41) * (0-(4.33451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 74) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 65) * (0.7-(0)));
            zz = 0 + (((tickAnim - 74) / 65) * (-0.425-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            yy = 0.7 + (((tickAnim - 139) / 30) * (0.98-(0.7)));
            zz = -0.425 + (((tickAnim - 139) / 30) * (-0.625-(-0.425)));
        }
        else if (tickAnim >= 169 && tickAnim < 212) {
            xx = 0 + (((tickAnim - 169) / 43) * (0-(0)));
            yy = 0.98 + (((tickAnim - 169) / 43) * (0-(0.98)));
            zz = -0.625 + (((tickAnim - 169) / 43) * (0-(-0.625)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 74) / 27) * (3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 101) / 38) * (9.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = 9.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 139) / 30) * (10.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(9.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 10.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 169) / 25) * (3.65356-(10.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 169) / 25) * (-1.55626-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (-0.13628-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 212) {
            xx = 3.65356 + (((tickAnim - 194) / 18) * (4.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(3.65356)));
            yy = -1.55626 + (((tickAnim - 194) / 18) * (-3.18334-(-1.55626)));
            zz = -0.13628 + (((tickAnim - 194) / 18) * (-2.00336-(-0.13628)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 4.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 212) / 41) * (0-(4.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = -3.18334 + (((tickAnim - 212) / 41) * (0-(-3.18334)));
            zz = -2.00336 + (((tickAnim - 212) / 41) * (0-(-2.00336)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 139) {
            xx = 0.25 + (((tickAnim - 74) / 65) * (0.5-(0.25)));
            yy = 0 + (((tickAnim - 74) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 65) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = 0.5 + (((tickAnim - 139) / 30) * (7.25-(0.5)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 7.25 + (((tickAnim - 169) / 25) * (4.69348-(7.25)));
            yy = 0 + (((tickAnim - 169) / 25) * (-1.64981-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0.24683-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 212) {
            xx = 4.69348 + (((tickAnim - 194) / 18) * (5.7433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(4.69348)));
            yy = -1.64981 + (((tickAnim - 194) / 18) * (-3.32552-(-1.64981)));
            zz = 0.24683 + (((tickAnim - 194) / 18) * (-0.51453-(0.24683)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 5.7433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 212) / 41) * (0-(5.7433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = -3.32552 + (((tickAnim - 212) / 41) * (0-(-3.32552)));
            zz = -0.51453 + (((tickAnim - 212) / 41) * (0-(-0.51453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 74) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 65) * (-1.775-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 212) {
            xx = 0 + (((tickAnim - 139) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 73) * (0-(0)));
            zz = -1.775 + (((tickAnim - 139) / 73) * (0-(-1.775)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (1.5-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 1.5 + (((tickAnim - 101) / 38) * (4.5-(1.5)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = 4.5 + (((tickAnim - 139) / 30) * (8.75-(4.5)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 8.75 + (((tickAnim - 169) / 25) * (2.3-(8.75)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 212) {
            xx = 2.3 + (((tickAnim - 194) / 18) * (5.4995+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(2.3)));
            yy = 0 + (((tickAnim - 194) / 18) * (0.04065-(0)));
            zz = 0 + (((tickAnim - 194) / 18) * (-1.24934-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 5.4995+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 212) / 41) * (0-(5.4995+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
            yy = 0.04065 + (((tickAnim - 212) / 41) * (0-(0.04065)));
            zz = -1.24934 + (((tickAnim - 212) / 41) * (0-(-1.24934)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 0) / 139) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 139) * (-2.025-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = -2.025 + (((tickAnim - 139) / 30) * (-2.63-(-2.025)));
        }
        else if (tickAnim >= 169 && tickAnim < 212) {
            xx = 0 + (((tickAnim - 169) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 169) / 43) * (0-(0)));
            zz = -2.63 + (((tickAnim - 169) / 43) * (0-(-2.63)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = -2.5 + (((tickAnim - 74) / 27) * (-6.5-(-2.5)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = -6.5 + (((tickAnim - 101) / 38) * (-6-(-6.5)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = -6 + (((tickAnim - 139) / 30) * (-0.5-(-6)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = -0.5 + (((tickAnim - 169) / 25) * (-5.55-(-0.5)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 212) {
            xx = -5.55 + (((tickAnim - 194) / 18) * (-0.2012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-5.55)));
            yy = 0 + (((tickAnim - 194) / 18) * (0.11323-(0)));
            zz = 0 + (((tickAnim - 194) / 18) * (-1.24486-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = -0.2012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 212) / 41) * (0-(-0.2012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0.11323 + (((tickAnim - 212) / 41) * (0-(0.11323)));
            zz = -1.24486 + (((tickAnim - 212) / 41) * (0-(-1.24486)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 0) / 139) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 139) * (-1.205-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = -1.205 + (((tickAnim - 139) / 30) * (-2.575-(-1.205)));
        }
        else if (tickAnim >= 169 && tickAnim < 212) {
            xx = 0 + (((tickAnim - 169) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 169) / 43) * (0-(0)));
            zz = -2.575 + (((tickAnim - 169) / 43) * (0-(-2.575)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = -1 + (((tickAnim - 74) / 27) * (-16.45506-(-1)));
            yy = 0 + (((tickAnim - 74) / 27) * (-0.66491-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (-0.19557-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = -16.45506 + (((tickAnim - 101) / 21) * (-5-(-16.45506)));
            yy = -0.66491 + (((tickAnim - 101) / 21) * (0-(-0.66491)));
            zz = -0.19557 + (((tickAnim - 101) / 21) * (0-(-0.19557)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = -5 + (((tickAnim - 122) / 17) * (-10.75-(-5)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = -10.75 + (((tickAnim - 139) / 30) * (-0.7-(-10.75)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 190) {
            xx = -0.7 + (((tickAnim - 169) / 21) * (-2.94-(-0.7)));
            yy = 0 + (((tickAnim - 169) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 21) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 212) {
            xx = -2.94 + (((tickAnim - 190) / 22) * (3.24088-(-2.94)));
            yy = 0 + (((tickAnim - 190) / 22) * (0.54278-(0)));
            zz = 0 + (((tickAnim - 190) / 22) * (-1.92497-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 3.24088 + (((tickAnim - 212) / 41) * (0-(3.24088)));
            yy = 0.54278 + (((tickAnim - 212) / 41) * (0-(0.54278)));
            zz = -1.92497 + (((tickAnim - 212) / 41) * (0-(-1.92497)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 212 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck6.rotationPointX = this.neck6.rotationPointX + (float)(xx);
        this.neck6.rotationPointY = this.neck6.rotationPointY - (float)(yy);
        this.neck6.rotationPointZ = this.neck6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = -3 + (((tickAnim - 74) / 27) * (-13.75-(-3)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = -13.75 + (((tickAnim - 101) / 38) * (-1.75-(-13.75)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = -1.75 + (((tickAnim - 139) / 30) * (-4.25-(-1.75)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 190) {
            xx = -4.25 + (((tickAnim - 169) / 21) * (6.91-(-4.25)));
            yy = 0 + (((tickAnim - 169) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 21) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 212) {
            xx = 6.91 + (((tickAnim - 190) / 22) * (11.24539-(6.91)));
            yy = 0 + (((tickAnim - 190) / 22) * (0.45302-(0)));
            zz = 0 + (((tickAnim - 190) / 22) * (-1.16503-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 11.24539 + (((tickAnim - 212) / 41) * (0-(11.24539)));
            yy = 0.45302 + (((tickAnim - 212) / 41) * (0-(0.45302)));
            zz = -1.16503 + (((tickAnim - 212) / 41) * (0-(-1.16503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = -6.5 + (((tickAnim - 74) / 27) * (-5.5-(-6.5)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = -5.5 + (((tickAnim - 101) / 38) * (-5.25-(-5.5)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = -5.25 + (((tickAnim - 139) / 30) * (-12.83-(-5.25)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 190) {
            xx = -12.83 + (((tickAnim - 169) / 21) * (5.62-(-12.83)));
            yy = 0 + (((tickAnim - 169) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 21) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 212) {
            xx = 5.62 + (((tickAnim - 190) / 22) * (1.75-(5.62)));
            yy = 0 + (((tickAnim - 190) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 22) * (0-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 1.75 + (((tickAnim - 212) / 41) * (0-(1.75)));
            yy = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 0) / 122) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 122) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 122) / 17) * (2.5-(0)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 164) {
            xx = 2.5 + (((tickAnim - 139) / 25) * (2.25-(2.5)));
            yy = 0 + (((tickAnim - 139) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 25) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 177) {
            xx = 2.25 + (((tickAnim - 164) / 13) * (2.5-(2.25)));
            yy = 0 + (((tickAnim - 164) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 13) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 253) {
            xx = 2.5 + (((tickAnim - 177) / 76) * (0-(2.5)));
            yy = 0 + (((tickAnim - 177) / 76) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 76) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (2.25-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = 2.25 + (((tickAnim - 101) / 21) * (-19-(2.25)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = -19 + (((tickAnim - 122) / 17) * (-4.75-(-19)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 158) {
            xx = -4.75 + (((tickAnim - 139) / 19) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 139) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 19) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 169) {
            xx = -4.75 + (((tickAnim - 158) / 11) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 158) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 11) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 182) {
            xx = -4.75 + (((tickAnim - 169) / 13) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 169) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 13) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 217) {
            xx = 0 + (((tickAnim - 182) / 35) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 182) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 35) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 253) {
            xx = -2.75 + (((tickAnim - 217) / 36) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 217) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 0) / 122) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 122) * (-2.15-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = -2.15 + (((tickAnim - 122) / 17) * (0-(-2.15)));
        }
        else if (tickAnim >= 139 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 139) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 19) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 158) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 158) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (3.5-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = 3.5 + (((tickAnim - 101) / 21) * (-12-(3.5)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = -12 + (((tickAnim - 122) / 17) * (-7.25-(-12)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 158) {
            xx = -7.25 + (((tickAnim - 139) / 19) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 139) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 19) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 169) {
            xx = -7.25 + (((tickAnim - 158) / 11) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 158) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 11) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 182) {
            xx = -7.25 + (((tickAnim - 169) / 13) * (-5.25-(-7.25)));
            yy = 0 + (((tickAnim - 169) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 13) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 217) {
            xx = -5.25 + (((tickAnim - 182) / 35) * (-2.75-(-5.25)));
            yy = 0 + (((tickAnim - 182) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 35) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 253) {
            xx = -2.75 + (((tickAnim - 217) / 36) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 217) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (4.75-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = 4.75 + (((tickAnim - 101) / 21) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = 4.75 + (((tickAnim - 122) / 17) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 158) {
            xx = 4.75 + (((tickAnim - 139) / 19) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 139) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 19) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 169) {
            xx = 4.75 + (((tickAnim - 158) / 11) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 158) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 11) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 182) {
            xx = 4.75 + (((tickAnim - 169) / 13) * (-3.5-(4.75)));
            yy = 0 + (((tickAnim - 169) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 13) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 217) {
            xx = -3.5 + (((tickAnim - 182) / 35) * (-0.5-(-3.5)));
            yy = 0 + (((tickAnim - 182) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 35) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 253) {
            xx = -0.5 + (((tickAnim - 217) / 36) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 217) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (3.25-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = 3.25 + (((tickAnim - 101) / 21) * (7.75-(3.25)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = 7.75 + (((tickAnim - 122) / 17) * (2.75-(7.75)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 158) {
            xx = 2.75 + (((tickAnim - 139) / 19) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 139) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 19) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 169) {
            xx = 2.75 + (((tickAnim - 158) / 11) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 158) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 11) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 182) {
            xx = 2.75 + (((tickAnim - 169) / 13) * (-5.75-(2.75)));
            yy = 0 + (((tickAnim - 169) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 13) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 187) {
            xx = -5.75 + (((tickAnim - 182) / 5) * (-8.5-(-5.75)));
            yy = 0 + (((tickAnim - 182) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 5) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 198) {
            xx = -8.5 + (((tickAnim - 187) / 11) * (0.5-(-8.5)));
            yy = 0 + (((tickAnim - 187) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 11) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 217) {
            xx = 0.5 + (((tickAnim - 198) / 19) * (-0.51-(0.5)));
            yy = 0 + (((tickAnim - 198) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 19) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 253) {
            xx = -0.51 + (((tickAnim - 217) / 36) * (0-(-0.51)));
            yy = 0 + (((tickAnim - 217) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 74) / 8) * (-1.87-(0)));
            yy = 0 + (((tickAnim - 74) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 8) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 101) {
            xx = -1.87 + (((tickAnim - 82) / 19) * (2.25-(-1.87)));
            yy = 0 + (((tickAnim - 82) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 19) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = 2.25 + (((tickAnim - 101) / 21) * (15.25-(2.25)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = 15.25 + (((tickAnim - 122) / 17) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 158) {
            xx = 15.25 + (((tickAnim - 139) / 19) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 139) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 19) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 169) {
            xx = 15.25 + (((tickAnim - 158) / 11) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 158) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 11) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 182) {
            xx = 15.25 + (((tickAnim - 169) / 13) * (-7.5-(15.25)));
            yy = 0 + (((tickAnim - 169) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 13) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 187) {
            xx = -7.5 + (((tickAnim - 182) / 5) * (-9.75-(-7.5)));
            yy = 0 + (((tickAnim - 182) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 5) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 198) {
            xx = -9.75 + (((tickAnim - 187) / 11) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 187) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 11) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 217) {
            xx = -9.75 + (((tickAnim - 198) / 19) * (-2.48-(-9.75)));
            yy = 0 + (((tickAnim - 198) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 19) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 253) {
            xx = -2.48 + (((tickAnim - 217) / 36) * (0-(-2.48)));
            yy = 0 + (((tickAnim - 217) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 74) / 8) * (-6.19-(0)));
            yy = 0 + (((tickAnim - 74) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 8) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 101) {
            xx = -6.19 + (((tickAnim - 82) / 19) * (-6-(-6.19)));
            yy = 0 + (((tickAnim - 82) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 19) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = -6 + (((tickAnim - 101) / 21) * (15.75-(-6)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = 15.75 + (((tickAnim - 122) / 17) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 158) {
            xx = 15.75 + (((tickAnim - 139) / 19) * (19.27338-(15.75)));
            yy = 0 + (((tickAnim - 139) / 19) * (2.84897-(0)));
            zz = 0 + (((tickAnim - 139) / 19) * (0.94027-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 169) {
            xx = 19.27338 + (((tickAnim - 158) / 11) * (19.27338-(19.27338)));
            yy = 2.84897 + (((tickAnim - 158) / 11) * (2.84897-(2.84897)));
            zz = 0.94027 + (((tickAnim - 158) / 11) * (0.94027-(0.94027)));
        }
        else if (tickAnim >= 169 && tickAnim < 182) {
            xx = 19.27338 + (((tickAnim - 169) / 13) * (7.75-(19.27338)));
            yy = 2.84897 + (((tickAnim - 169) / 13) * (0-(2.84897)));
            zz = 0.94027 + (((tickAnim - 169) / 13) * (0-(0.94027)));
        }
        else if (tickAnim >= 182 && tickAnim < 187) {
            xx = 7.75 + (((tickAnim - 182) / 5) * (-4.25-(7.75)));
            yy = 0 + (((tickAnim - 182) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 5) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 191) {
            xx = -4.25 + (((tickAnim - 187) / 4) * (-5.62-(-4.25)));
            yy = 0 + (((tickAnim - 187) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 4) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 198) {
            xx = -5.62 + (((tickAnim - 191) / 7) * (-3.09-(-5.62)));
            yy = 0 + (((tickAnim - 191) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 7) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 217) {
            xx = -3.09 + (((tickAnim - 198) / 19) * (12.81-(-3.09)));
            yy = 0 + (((tickAnim - 198) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 19) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 253) {
            xx = 12.81 + (((tickAnim - 217) / 36) * (0-(12.81)));
            yy = 0 + (((tickAnim - 217) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 74) / 8) * (-7.39-(0)));
            yy = 0 + (((tickAnim - 74) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 8) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 101) {
            xx = -7.39 + (((tickAnim - 82) / 19) * (-8.5-(-7.39)));
            yy = 0 + (((tickAnim - 82) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 19) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 113) {
            xx = -8.5 + (((tickAnim - 101) / 12) * (13.53-(-8.5)));
            yy = 0 + (((tickAnim - 101) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 12) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = 13.53 + (((tickAnim - 113) / 9) * (8.75-(13.53)));
            yy = 0 + (((tickAnim - 113) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 9) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = 8.75 + (((tickAnim - 122) / 17) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 158) {
            xx = 8.75 + (((tickAnim - 139) / 19) * (2.25366-(8.75)));
            yy = 0 + (((tickAnim - 139) / 19) * (3.99863-(0)));
            zz = 0 + (((tickAnim - 139) / 19) * (0.10488-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 169) {
            xx = 2.25366 + (((tickAnim - 158) / 11) * (2.25366-(2.25366)));
            yy = 3.99863 + (((tickAnim - 158) / 11) * (3.99863-(3.99863)));
            zz = 0.10488 + (((tickAnim - 158) / 11) * (0.10488-(0.10488)));
        }
        else if (tickAnim >= 169 && tickAnim < 182) {
            xx = 2.25366 + (((tickAnim - 169) / 13) * (22.75-(2.25366)));
            yy = 3.99863 + (((tickAnim - 169) / 13) * (0-(3.99863)));
            zz = 0.10488 + (((tickAnim - 169) / 13) * (0-(0.10488)));
        }
        else if (tickAnim >= 182 && tickAnim < 187) {
            xx = 22.75 + (((tickAnim - 182) / 5) * (21-(22.75)));
            yy = 0 + (((tickAnim - 182) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 5) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 191) {
            xx = 21 + (((tickAnim - 187) / 4) * (5.28-(21)));
            yy = 0 + (((tickAnim - 187) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 4) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 198) {
            xx = 5.28 + (((tickAnim - 191) / 7) * (-3.16-(5.28)));
            yy = 0 + (((tickAnim - 191) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 7) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 205) {
            xx = -3.16 + (((tickAnim - 198) / 7) * (1.34-(-3.16)));
            yy = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 7) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 217) {
            xx = 1.34 + (((tickAnim - 205) / 12) * (10.93-(1.34)));
            yy = 0 + (((tickAnim - 205) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 12) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 253) {
            xx = 10.93 + (((tickAnim - 217) / 36) * (0-(10.93)));
            yy = 0 + (((tickAnim - 217) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 217) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (4.75-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 123) {
            xx = 4.75 + (((tickAnim - 101) / 22) * (0.56-(4.75)));
            yy = 0 + (((tickAnim - 101) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 22) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 148) {
            xx = 0.56 + (((tickAnim - 123) / 25) * (0-(0.56)));
            yy = 0 + (((tickAnim - 123) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 25) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 148) / 46) * (3.25-(0)));
            yy = 0 + (((tickAnim - 148) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 46) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 3.25 + (((tickAnim - 194) / 14) * (10.25-(3.25)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 253) {
            xx = 10.25 + (((tickAnim - 208) / 45) * (0-(10.25)));
            yy = 0 + (((tickAnim - 208) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 74) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 74) * (1.1-(0)));
            zz = 0 + (((tickAnim - 74) / 74) * (-0.025-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 148) / 105) * (0-(0)));
            yy = 1.1 + (((tickAnim - 148) / 105) * (0-(1.1)));
            zz = -0.025 + (((tickAnim - 148) / 105) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (6.5-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 6.5 + (((tickAnim - 101) / 38) * (0-(6.5)));
            yy = 0 + (((tickAnim - 101) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 38) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 139) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 55) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 221) {
            xx = -3.25 + (((tickAnim - 208) / 13) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 208) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 13) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 221) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 221) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 0) / 139) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 139) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 139) / 82) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 82) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 82) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 221) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 221) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 50) / 24) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 50) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 24) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = -22.25 + (((tickAnim - 74) / 27) * (-1.48634-(-22.25)));
            yy = 0 + (((tickAnim - 74) / 27) * (-5.188-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (-16.73634-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 114) {
            xx = -1.48634 + (((tickAnim - 101) / 13) * (-13.20082-(-1.48634)));
            yy = -5.188 + (((tickAnim - 101) / 13) * (-1.41491-(-5.188)));
            zz = -16.73634 + (((tickAnim - 101) / 13) * (-4.56446-(-16.73634)));
        }
        else if (tickAnim >= 114 && tickAnim < 119) {
            xx = -13.20082 + (((tickAnim - 114) / 5) * (-9-(-13.20082)));
            yy = -1.41491 + (((tickAnim - 114) / 5) * (0-(-1.41491)));
            zz = -4.56446 + (((tickAnim - 114) / 5) * (0-(-4.56446)));
        }
        else if (tickAnim >= 119 && tickAnim < 139) {
            xx = -9 + (((tickAnim - 119) / 20) * (2.46271-(-9)));
            yy = 0 + (((tickAnim - 119) / 20) * (0.86717-(0)));
            zz = 0 + (((tickAnim - 119) / 20) * (-4.92442-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = 2.46271 + (((tickAnim - 139) / 30) * (6.67072-(2.46271)));
            yy = 0.86717 + (((tickAnim - 139) / 30) * (0.59249-(0.86717)));
            zz = -4.92442 + (((tickAnim - 139) / 30) * (-6.88062-(-4.92442)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 6.67072 + (((tickAnim - 169) / 25) * (-21.77474-(6.67072)));
            yy = 0.59249 + (((tickAnim - 169) / 25) * (0.34673-(0.59249)));
            zz = -6.88062 + (((tickAnim - 169) / 25) * (-8.6309-(-6.88062)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = -21.77474 + (((tickAnim - 194) / 14) * (-15.77474-(-21.77474)));
            yy = 0.34673 + (((tickAnim - 194) / 14) * (0.34673-(0.34673)));
            zz = -8.6309 + (((tickAnim - 194) / 14) * (-8.6309-(-8.6309)));
        }
        else if (tickAnim >= 208 && tickAnim < 218) {
            xx = -15.77474 + (((tickAnim - 208) / 10) * (-28.19306-(-15.77474)));
            yy = 0.34673 + (((tickAnim - 208) / 10) * (0.1576-(0.34673)));
            zz = -8.6309 + (((tickAnim - 208) / 10) * (-3.92314-(-8.6309)));
        }
        else if (tickAnim >= 218 && tickAnim < 226) {
            xx = -28.19306 + (((tickAnim - 218) / 8) * (-33.5-(-28.19306)));
            yy = 0.1576 + (((tickAnim - 218) / 8) * (0-(0.1576)));
            zz = -3.92314 + (((tickAnim - 218) / 8) * (0-(-3.92314)));
        }
        else if (tickAnim >= 226 && tickAnim < 233) {
            xx = -33.5 + (((tickAnim - 226) / 7) * (-14.62-(-33.5)));
            yy = 0 + (((tickAnim - 226) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 226) / 7) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 239) {
            xx = -14.62 + (((tickAnim - 233) / 6) * (1.5-(-14.62)));
            yy = 0 + (((tickAnim - 233) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 6) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 1.5 + (((tickAnim - 239) / 14) * (0-(1.5)));
            yy = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 50) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 69) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 119) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 75) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 196) {
            xx = 0 + (((tickAnim - 194) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 194) / 2) * (0.04-(0)));
            zz = 0 + (((tickAnim - 194) / 2) * (0-(0)));
        }
        else if (tickAnim >= 196 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 196) / 2) * (0-(0)));
            yy = 0.04 + (((tickAnim - 196) / 2) * (0.9-(0.04)));
            zz = 0 + (((tickAnim - 196) / 2) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 198) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 198) / 1) * (1.19-(0.9)));
            zz = 0 + (((tickAnim - 198) / 1) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 199) / 2) * (0-(0)));
            yy = 1.19 + (((tickAnim - 199) / 2) * (1.775-(1.19)));
            zz = 0 + (((tickAnim - 199) / 2) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 201) / 2) * (0-(0)));
            yy = 1.775 + (((tickAnim - 201) / 2) * (1.995-(1.775)));
            zz = 0 + (((tickAnim - 201) / 2) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 203) / 1) * (0-(0)));
            yy = 1.995 + (((tickAnim - 203) / 1) * (2.735-(1.995)));
            zz = 0 + (((tickAnim - 203) / 1) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 204) / 4) * (0-(0)));
            yy = 2.735 + (((tickAnim - 204) / 4) * (2.75-(2.735)));
            zz = 0 + (((tickAnim - 204) / 4) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 208) / 10) * (0-(0)));
            yy = 2.75 + (((tickAnim - 208) / 10) * (5.015-(2.75)));
            zz = 0 + (((tickAnim - 208) / 10) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 226) {
            xx = 0 + (((tickAnim - 218) / 8) * (0-(0)));
            yy = 5.015 + (((tickAnim - 218) / 8) * (3.825-(5.015)));
            zz = 0 + (((tickAnim - 218) / 8) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 226) / 13) * (0-(0)));
            yy = 3.825 + (((tickAnim - 226) / 13) * (0-(3.825)));
            zz = 0 + (((tickAnim - 226) / 13) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 50) / 12) * (-11.68103-(0)));
            yy = 0 + (((tickAnim - 50) / 12) * (0.9938-(0)));
            zz = 0 + (((tickAnim - 50) / 12) * (6.74839-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 74) {
            xx = -11.68103 + (((tickAnim - 62) / 12) * (16.25-(-11.68103)));
            yy = 0.9938 + (((tickAnim - 62) / 12) * (0-(0.9938)));
            zz = 6.74839 + (((tickAnim - 62) / 12) * (0-(6.74839)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 16.25 + (((tickAnim - 74) / 27) * (-38.71735-(16.25)));
            yy = 0 + (((tickAnim - 74) / 27) * (0.69282-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (15.86945-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 114) {
            xx = -38.71735 + (((tickAnim - 101) / 13) * (24.75012-(-38.71735)));
            yy = 0.69282 + (((tickAnim - 101) / 13) * (-0.00763-(0.69282)));
            zz = 15.86945 + (((tickAnim - 101) / 13) * (7.00002-(15.86945)));
        }
        else if (tickAnim >= 114 && tickAnim < 133) {
            xx = 24.75012 + (((tickAnim - 114) / 19) * (-17.5-(24.75012)));
            yy = -0.00763 + (((tickAnim - 114) / 19) * (0-(-0.00763)));
            zz = 7.00002 + (((tickAnim - 114) / 19) * (0-(7.00002)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -17.5 + (((tickAnim - 133) / 6) * (-17.57623-(-17.5)));
            yy = 0 + (((tickAnim - 133) / 6) * (-5.04974-(0)));
            zz = 0 + (((tickAnim - 133) / 6) * (10.04153-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = -17.57623 + (((tickAnim - 139) / 30) * (-14.43514-(-17.57623)));
            yy = -5.04974 + (((tickAnim - 139) / 30) * (-2.01786-(-5.04974)));
            zz = 10.04153 + (((tickAnim - 139) / 30) * (8.62122-(10.04153)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = -14.43514 + (((tickAnim - 169) / 25) * (0-(-14.43514)));
            yy = -2.01786 + (((tickAnim - 169) / 25) * (0-(-2.01786)));
            zz = 8.62122 + (((tickAnim - 169) / 25) * (10.25-(8.62122)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (-37.53217-(0)));
            yy = 0 + (((tickAnim - 194) / 14) * (1.38475-(0)));
            zz = 10.25 + (((tickAnim - 194) / 14) * (7.58845-(10.25)));
        }
        else if (tickAnim >= 208 && tickAnim < 226) {
            xx = -37.53217 + (((tickAnim - 208) / 18) * (0-(-37.53217)));
            yy = 1.38475 + (((tickAnim - 208) / 18) * (0-(1.38475)));
            zz = 7.58845 + (((tickAnim - 208) / 18) * (0-(7.58845)));
        }
        else if (tickAnim >= 226 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 226) / 7) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 226) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 226) / 7) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 239) {
            xx = -11.25 + (((tickAnim - 233) / 6) * (-12.75-(-11.25)));
            yy = 0 + (((tickAnim - 233) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 6) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = -12.75 + (((tickAnim - 239) / 14) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 50) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 24) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 50) / 24) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            yy = -1.125 + (((tickAnim - 74) / 27) * (2.525-(-1.125)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 101) / 10) * (0-(0)));
            yy = 2.525 + (((tickAnim - 101) / 10) * (2.17-(2.525)));
            zz = 0 + (((tickAnim - 101) / 10) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 111) / 3) * (0-(0)));
            yy = 2.17 + (((tickAnim - 111) / 3) * (-0.15-(2.17)));
            zz = 0 + (((tickAnim - 111) / 3) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 114) / 19) * (0-(0)));
            yy = -0.15 + (((tickAnim - 114) / 19) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 114) / 19) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 133) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 61) * (4.125-(0)));
            zz = 0 + (((tickAnim - 133) / 61) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            yy = 4.125 + (((tickAnim - 194) / 14) * (3.675-(4.125)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 226) {
            xx = 0 + (((tickAnim - 208) / 18) * (0-(0)));
            yy = 3.675 + (((tickAnim - 208) / 18) * (-0.925-(3.675)));
            zz = 0 + (((tickAnim - 208) / 18) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 226) / 7) * (0-(0)));
            yy = -0.925 + (((tickAnim - 226) / 7) * (2.55-(-0.925)));
            zz = 0 + (((tickAnim - 226) / 7) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 233) / 6) * (0-(0)));
            yy = 2.55 + (((tickAnim - 233) / 6) * (2.925-(2.55)));
            zz = 0 + (((tickAnim - 233) / 6) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            yy = 2.925 + (((tickAnim - 239) / 14) * (0-(2.925)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 50) / 12) * (34.75-(0)));
            yy = 0 + (((tickAnim - 50) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 12) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 74) {
            xx = 34.75 + (((tickAnim - 62) / 12) * (4.5-(34.75)));
            yy = 0 + (((tickAnim - 62) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 12) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 4.5 + (((tickAnim - 74) / 27) * (25.5-(4.5)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 114) {
            xx = 25.5 + (((tickAnim - 101) / 13) * (-11.25-(25.5)));
            yy = 0 + (((tickAnim - 101) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 13) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 133) {
            xx = -11.25 + (((tickAnim - 114) / 19) * (39.5-(-11.25)));
            yy = 0 + (((tickAnim - 114) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 19) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 189) {
            xx = 39.5 + (((tickAnim - 133) / 56) * (5.41-(39.5)));
            yy = 0 + (((tickAnim - 133) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 56) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 194) {
            xx = 5.41 + (((tickAnim - 189) / 5) * (11-(5.41)));
            yy = 0 + (((tickAnim - 189) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 5) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 11 + (((tickAnim - 194) / 14) * (39.75-(11)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 226) {
            xx = 39.75 + (((tickAnim - 208) / 18) * (21-(39.75)));
            yy = 0 + (((tickAnim - 208) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 18) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 233) {
            xx = 21 + (((tickAnim - 226) / 7) * (43.75-(21)));
            yy = 0 + (((tickAnim - 226) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 226) / 7) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 239) {
            xx = 43.75 + (((tickAnim - 233) / 6) * (4.75-(43.75)));
            yy = 0 + (((tickAnim - 233) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 6) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 4.75 + (((tickAnim - 239) / 14) * (0-(4.75)));
            yy = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 0) / 101) * (-7.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 101) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 101) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 130) {
            xx = -7.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 101) / 29) * (-6.21-(-7.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 101) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 29) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 139) {
            xx = -6.21 + (((tickAnim - 130) / 9) * (-5.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(-6.21)));
            yy = 0 + (((tickAnim - 130) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 9) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = -5.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 139) / 30) * (1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(-5.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 139) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 30) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 176) {
            xx = 1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 169) / 7) * (-3.28-(1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 169) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 7) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 212) {
            xx = -3.28 + (((tickAnim - 176) / 36) * (0-(-3.28)));
            yy = 0 + (((tickAnim - 176) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 36) * (0-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 212) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 0) / 139) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 139) * (-0.375-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 139) / 114) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 114) * (0-(0)));
            zz = -0.375 + (((tickAnim - 139) / 114) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 62) {
            xx = -0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 49) / 13) * (4-(-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 49) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 13) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 74) {
            xx = 4 + (((tickAnim - 62) / 12) * (0-(4)));
            yy = 0 + (((tickAnim - 62) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 12) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 74) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 65) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 139) / 24) * (15-(0)));
            yy = 0 + (((tickAnim - 139) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 24) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 169) {
            xx = 15 + (((tickAnim - 163) / 6) * (0-(15)));
            yy = 0 + (((tickAnim - 163) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (8.5-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 8.5 + (((tickAnim - 91) / 10) * (-27.48634-(8.5)));
            yy = 0 + (((tickAnim - 91) / 10) * (-5.188-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (16.7363-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = -27.48634 + (((tickAnim - 101) / 21) * (-8.99679-(-27.48634)));
            yy = -5.188 + (((tickAnim - 101) / 21) * (0.09809-(-5.188)));
            zz = 16.7363 + (((tickAnim - 101) / 21) * (3.74872-(16.7363)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = -8.99679 + (((tickAnim - 122) / 17) * (-2.77177-(-8.99679)));
            yy = 0.09809 + (((tickAnim - 122) / 17) * (-0.45475-(0.09809)));
            zz = 3.74872 + (((tickAnim - 122) / 17) * (5.48123-(3.74872)));
        }
        else if (tickAnim >= 139 && tickAnim < 169) {
            xx = -2.77177 + (((tickAnim - 139) / 30) * (-2.55111-(-2.77177)));
            yy = -0.45475 + (((tickAnim - 139) / 30) * (-0.03175-(-0.45475)));
            zz = 5.48123 + (((tickAnim - 139) / 30) * (7.14354-(5.48123)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = -2.55111 + (((tickAnim - 169) / 25) * (-21.77474-(-2.55111)));
            yy = -0.03175 + (((tickAnim - 169) / 25) * (0.34673-(-0.03175)));
            zz = 7.14354 + (((tickAnim - 169) / 25) * (8.63088-(7.14354)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = -21.77474 + (((tickAnim - 194) / 14) * (-20.27474-(-21.77474)));
            yy = 0.34673 + (((tickAnim - 194) / 14) * (0.34673-(0.34673)));
            zz = 8.63088 + (((tickAnim - 194) / 14) * (8.63088-(8.63088)));
        }
        else if (tickAnim >= 208 && tickAnim < 218) {
            xx = -20.27474 + (((tickAnim - 208) / 10) * (-30-(-20.27474)));
            yy = 0.34673 + (((tickAnim - 208) / 10) * (0-(0.34673)));
            zz = 8.63088 + (((tickAnim - 208) / 10) * (0-(8.63088)));
        }
        else if (tickAnim >= 218 && tickAnim < 222) {
            xx = -30 + (((tickAnim - 218) / 4) * (5.91-(-30)));
            yy = 0 + (((tickAnim - 218) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 4) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 226) {
            xx = 5.91 + (((tickAnim - 222) / 4) * (11.25-(5.91)));
            yy = 0 + (((tickAnim - 222) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 4) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 253) {
            xx = 11.25 + (((tickAnim - 226) / 27) * (0-(11.25)));
            yy = 0 + (((tickAnim - 226) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 226) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (2.045-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            yy = 2.045 + (((tickAnim - 91) / 10) * (2.045-(2.045)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            yy = 2.045 + (((tickAnim - 101) / 21) * (0-(2.045)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 122) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 72) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 196) {
            xx = 0 + (((tickAnim - 194) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 194) / 2) * (0.04-(0)));
            zz = 0 + (((tickAnim - 194) / 2) * (0-(0)));
        }
        else if (tickAnim >= 196 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 196) / 2) * (0-(0)));
            yy = 0.04 + (((tickAnim - 196) / 2) * (0.9-(0.04)));
            zz = 0 + (((tickAnim - 196) / 2) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 198) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 198) / 1) * (1.19-(0.9)));
            zz = 0 + (((tickAnim - 198) / 1) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 199) / 2) * (0-(0)));
            yy = 1.19 + (((tickAnim - 199) / 2) * (1.775-(1.19)));
            zz = 0 + (((tickAnim - 199) / 2) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 201) / 2) * (0-(0)));
            yy = 1.775 + (((tickAnim - 201) / 2) * (1.995-(1.775)));
            zz = 0 + (((tickAnim - 201) / 2) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 203) / 1) * (0-(0)));
            yy = 1.995 + (((tickAnim - 203) / 1) * (2.735-(1.995)));
            zz = 0 + (((tickAnim - 203) / 1) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 204) / 4) * (0-(0)));
            yy = 2.735 + (((tickAnim - 204) / 4) * (2.825-(2.735)));
            zz = 0 + (((tickAnim - 204) / 4) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 208) / 10) * (0-(0)));
            yy = 2.825 + (((tickAnim - 208) / 10) * (8.35-(2.825)));
            zz = 0 + (((tickAnim - 208) / 10) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 226) {
            xx = 0 + (((tickAnim - 218) / 8) * (0-(0)));
            yy = 8.35 + (((tickAnim - 218) / 8) * (0-(8.35)));
            zz = 0 + (((tickAnim - 218) / 8) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 226) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 226) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 226) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (-22-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = -22 + (((tickAnim - 91) / 5) * (-30.64771-(-22)));
            yy = 0 + (((tickAnim - 91) / 5) * (4.88384-(0)));
            zz = 0 + (((tickAnim - 91) / 5) * (-7.45212-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 101) {
            xx = -30.64771 + (((tickAnim - 96) / 5) * (-29.04542-(-30.64771)));
            yy = 4.88384 + (((tickAnim - 96) / 5) * (9.76769-(4.88384)));
            zz = -7.45212 + (((tickAnim - 96) / 5) * (-14.90425-(-7.45212)));
        }
        else if (tickAnim >= 101 && tickAnim < 114) {
            xx = -29.04542 + (((tickAnim - 101) / 13) * (22.25-(-29.04542)));
            yy = 9.76769 + (((tickAnim - 101) / 13) * (0-(9.76769)));
            zz = -14.90425 + (((tickAnim - 101) / 13) * (-8.75-(-14.90425)));
        }
        else if (tickAnim >= 114 && tickAnim < 139) {
            xx = 22.25 + (((tickAnim - 114) / 25) * (-0.90548-(22.25)));
            yy = 0 + (((tickAnim - 114) / 25) * (3.05403-(0)));
            zz = -8.75 + (((tickAnim - 114) / 25) * (-12.03687-(-8.75)));
        }
        else if (tickAnim >= 139 && tickAnim < 194) {
            xx = -0.90548 + (((tickAnim - 139) / 55) * (0-(-0.90548)));
            yy = 3.05403 + (((tickAnim - 139) / 55) * (0-(3.05403)));
            zz = -12.03687 + (((tickAnim - 139) / 55) * (-10.25-(-12.03687)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = -10.25 + (((tickAnim - 194) / 14) * (-10.25-(-10.25)));
        }
        else if (tickAnim >= 208 && tickAnim < 222) {
            xx = -34.25 + (((tickAnim - 208) / 14) * (-15.7-(-34.25)));
            yy = 0 + (((tickAnim - 208) / 14) * (0-(0)));
            zz = -10.25 + (((tickAnim - 208) / 14) * (0-(-10.25)));
        }
        else if (tickAnim >= 222 && tickAnim < 226) {
            xx = -15.7 + (((tickAnim - 222) / 4) * (-25-(-15.7)));
            yy = 0 + (((tickAnim - 222) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 4) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 239) {
            xx = -25 + (((tickAnim - 226) / 13) * (-25-(-25)));
            yy = 0 + (((tickAnim - 226) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 226) / 13) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = -25 + (((tickAnim - 239) / 14) * (0-(-25)));
            yy = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 91) / 5) * (1.01-(0)));
            yy = 0 + (((tickAnim - 91) / 5) * (1.775-(0)));
            zz = 0 + (((tickAnim - 91) / 5) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 101) {
            xx = 1.01 + (((tickAnim - 96) / 5) * (2.025-(1.01)));
            yy = 1.775 + (((tickAnim - 96) / 5) * (0-(1.775)));
            zz = 0 + (((tickAnim - 96) / 5) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 114) {
            xx = 2.025 + (((tickAnim - 101) / 13) * (0-(2.025)));
            yy = 0 + (((tickAnim - 101) / 13) * (-1.625-(0)));
            zz = 0 + (((tickAnim - 101) / 13) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 114) / 80) * (0-(0)));
            yy = -1.625 + (((tickAnim - 114) / 80) * (3.85-(-1.625)));
            zz = 0 + (((tickAnim - 114) / 80) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            yy = 3.85 + (((tickAnim - 194) / 14) * (4.125-(3.85)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 226) {
            xx = 0 + (((tickAnim - 208) / 18) * (0-(0)));
            yy = 4.125 + (((tickAnim - 208) / 18) * (4.19-(4.125)));
            zz = 0 + (((tickAnim - 208) / 18) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 226) / 13) * (0-(0)));
            yy = 4.19 + (((tickAnim - 226) / 13) * (0-(4.19)));
            zz = 0 + (((tickAnim - 226) / 13) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (5-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 5 + (((tickAnim - 91) / 5) * (47.88-(5)));
            yy = 0 + (((tickAnim - 91) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 5) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 101) {
            xx = 47.88 + (((tickAnim - 96) / 5) * (37.25-(47.88)));
            yy = 0 + (((tickAnim - 96) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 5) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 114) {
            xx = 37.25 + (((tickAnim - 101) / 13) * (-7.5-(37.25)));
            yy = 0 + (((tickAnim - 101) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 13) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 122) {
            xx = -7.5 + (((tickAnim - 114) / 8) * (-4.25-(-7.5)));
            yy = 0 + (((tickAnim - 114) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 8) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 139) {
            xx = -4.25 + (((tickAnim - 122) / 17) * (27.5-(-4.25)));
            yy = 0 + (((tickAnim - 122) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 17) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 189) {
            xx = 27.5 + (((tickAnim - 139) / 50) * (1.4-(27.5)));
            yy = 0 + (((tickAnim - 139) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 50) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 194) {
            xx = 1.4 + (((tickAnim - 189) / 5) * (11-(1.4)));
            yy = 0 + (((tickAnim - 189) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 5) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 11 + (((tickAnim - 194) / 14) * (40.5-(11)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 222) {
            xx = 40.5 + (((tickAnim - 208) / 14) * (42.09-(40.5)));
            yy = 0 + (((tickAnim - 208) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 14) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 226) {
            xx = 42.09 + (((tickAnim - 222) / 4) * (16.75-(42.09)));
            yy = 0 + (((tickAnim - 222) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 4) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 239) {
            xx = 16.75 + (((tickAnim - 226) / 13) * (10.87-(16.75)));
            yy = 0 + (((tickAnim - 226) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 226) / 13) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 10.87 + (((tickAnim - 239) / 14) * (0-(10.87)));
            yy = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (11.81-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 113) {
            xx = 11.81 + (((tickAnim - 101) / 12) * (-37.75-(11.81)));
            yy = 0 + (((tickAnim - 101) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 12) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 139) {
            xx = -37.75 + (((tickAnim - 113) / 26) * (-5.25-(-37.75)));
            yy = 0 + (((tickAnim - 113) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 26) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = -5.25 + (((tickAnim - 139) / 15) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = -5.25 + (((tickAnim - 154) / 15) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = -5.25 + (((tickAnim - 169) / 25) * (-15.47-(-5.25)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = -15.47 + (((tickAnim - 194) / 14) * (-27.75-(-15.47)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 219) {
            xx = -27.75 + (((tickAnim - 208) / 11) * (11.75-(-27.75)));
            yy = 0 + (((tickAnim - 208) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 11) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 253) {
            xx = 11.75 + (((tickAnim - 219) / 34) * (0-(11.75)));
            yy = 0 + (((tickAnim - 219) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (-2.105-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 101) / 12) * (0-(0)));
            yy = -2.105 + (((tickAnim - 101) / 12) * (-7.64-(-2.105)));
            zz = 0 + (((tickAnim - 101) / 12) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 113) / 26) * (0-(0)));
            yy = -7.64 + (((tickAnim - 113) / 26) * (-3.45-(-7.64)));
            zz = 0 + (((tickAnim - 113) / 26) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            yy = -3.45 + (((tickAnim - 139) / 15) * (-3.45-(-3.45)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            yy = -3.45 + (((tickAnim - 154) / 15) * (-3.45-(-3.45)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 169) / 50) * (0-(0)));
            yy = -3.45 + (((tickAnim - 169) / 50) * (-2.75-(-3.45)));
            zz = 0 + (((tickAnim - 169) / 50) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 219) / 34) * (0-(0)));
            yy = -2.75 + (((tickAnim - 219) / 34) * (0-(-2.75)));
            zz = 0 + (((tickAnim - 219) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 74) / 9) * (4.25-(0)));
            yy = 0 + (((tickAnim - 74) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 9) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 91) {
            xx = 4.25 + (((tickAnim - 83) / 8) * (8.47-(4.25)));
            yy = 0 + (((tickAnim - 83) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 8) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 8.47 + (((tickAnim - 91) / 10) * (6.72-(8.47)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = 6.72 + (((tickAnim - 101) / 7) * (-21.05-(6.72)));
            yy = 0 + (((tickAnim - 101) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 7) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = -21.05 + (((tickAnim - 108) / 5) * (14.0282-(-21.05)));
            yy = 0 + (((tickAnim - 108) / 5) * (0.28292-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0.23931-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 139) {
            xx = 14.0282 + (((tickAnim - 113) / 26) * (5.5-(14.0282)));
            yy = 0.28292 + (((tickAnim - 113) / 26) * (0-(0.28292)));
            zz = 0.23931 + (((tickAnim - 113) / 26) * (0-(0.23931)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 5.5 + (((tickAnim - 139) / 15) * (4.25-(5.5)));
            yy = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 4.25 + (((tickAnim - 154) / 15) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 4.25 + (((tickAnim - 169) / 25) * (-18.48-(4.25)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = -18.48 + (((tickAnim - 194) / 14) * (-7.25-(-18.48)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 213) {
            xx = -7.25 + (((tickAnim - 208) / 5) * (24.5-(-7.25)));
            yy = 0 + (((tickAnim - 208) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 5) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 24.5 + (((tickAnim - 213) / 6) * (1.5-(24.5)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 253) {
            xx = 1.5 + (((tickAnim - 219) / 34) * (0-(1.5)));
            yy = 0 + (((tickAnim - 219) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (-1.775-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            yy = -1.775 + (((tickAnim - 91) / 10) * (-2-(-1.775)));
            zz = 0 + (((tickAnim - 91) / 10) * (2.225-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 101) / 7) * (0-(0)));
            yy = -2 + (((tickAnim - 101) / 7) * (8.575-(-2)));
            zz = 2.225 + (((tickAnim - 101) / 7) * (0-(2.225)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 108) / 5) * (-0.075-(0)));
            yy = 8.575 + (((tickAnim - 108) / 5) * (-1.77-(8.575)));
            zz = 0 + (((tickAnim - 108) / 5) * (5.775-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 139) {
            xx = -0.075 + (((tickAnim - 113) / 26) * (0-(-0.075)));
            yy = -1.77 + (((tickAnim - 113) / 26) * (-1.8-(-1.77)));
            zz = 5.775 + (((tickAnim - 113) / 26) * (3.875-(5.775)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            yy = -1.8 + (((tickAnim - 139) / 15) * (-2.275-(-1.8)));
            zz = 3.875 + (((tickAnim - 139) / 15) * (5.025-(3.875)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            yy = -2.275 + (((tickAnim - 154) / 15) * (-2.275-(-2.275)));
            zz = 5.025 + (((tickAnim - 154) / 15) * (5.025-(5.025)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            yy = -2.275 + (((tickAnim - 169) / 25) * (0.105-(-2.275)));
            zz = 5.025 + (((tickAnim - 169) / 25) * (0-(5.025)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (-0.45-(0)));
            yy = 0.105 + (((tickAnim - 194) / 14) * (-1.175-(0.105)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 213) {
            xx = -0.45 + (((tickAnim - 208) / 5) * (0-(-0.45)));
            yy = -1.175 + (((tickAnim - 208) / 5) * (1.94-(-1.175)));
            zz = 0 + (((tickAnim - 208) / 5) * (0.49-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            yy = 1.94 + (((tickAnim - 213) / 6) * (-1.85-(1.94)));
            zz = 0.49 + (((tickAnim - 213) / 6) * (3.025-(0.49)));
        }
        else if (tickAnim >= 219 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 219) / 34) * (0-(0)));
            yy = -1.85 + (((tickAnim - 219) / 34) * (0-(-1.85)));
            zz = 3.025 + (((tickAnim - 219) / 34) * (0-(3.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 74) / 27) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 74) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 27) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = -14.25 + (((tickAnim - 101) / 7) * (38-(-14.25)));
            yy = 0 + (((tickAnim - 101) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 7) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 38 + (((tickAnim - 108) / 5) * (28.25-(38)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 139) {
            xx = 28.25 + (((tickAnim - 113) / 26) * (25.25-(28.25)));
            yy = 0 + (((tickAnim - 113) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 26) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 25.25 + (((tickAnim - 139) / 15) * (26.25-(25.25)));
            yy = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 26.25 + (((tickAnim - 154) / 15) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 26.25 + (((tickAnim - 169) / 25) * (28.25-(26.25)));
            yy = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 28.25 + (((tickAnim - 194) / 14) * (20.75-(28.25)));
            yy = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 213) {
            xx = 20.75 + (((tickAnim - 208) / 5) * (32.25-(20.75)));
            yy = 0 + (((tickAnim - 208) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 5) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 32.25 + (((tickAnim - 213) / 6) * (-22.75-(32.25)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 253) {
            xx = -22.75 + (((tickAnim - 219) / 34) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 219) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (1.025-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0.425-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            yy = 1.025 + (((tickAnim - 91) / 10) * (1.025-(1.025)));
            zz = 0.425 + (((tickAnim - 91) / 10) * (0.425-(0.425)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 101) / 7) * (0-(0)));
            yy = 1.025 + (((tickAnim - 101) / 7) * (-0.85-(1.025)));
            zz = 0.425 + (((tickAnim - 101) / 7) * (0-(0.425)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 108) / 5) * (-0.525-(-0.85)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 113) / 26) * (0-(0)));
            yy = -0.525 + (((tickAnim - 113) / 26) * (-2.4-(-0.525)));
            zz = 0 + (((tickAnim - 113) / 26) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            yy = -2.4 + (((tickAnim - 139) / 15) * (-1.3-(-2.4)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 154) / 15) * (0-(0)));
            yy = -1.3 + (((tickAnim - 154) / 15) * (-1.3-(-1.3)));
            zz = 0 + (((tickAnim - 154) / 15) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 169) / 25) * (0-(0)));
            yy = -1.3 + (((tickAnim - 169) / 25) * (-0.07-(-1.3)));
            zz = 0 + (((tickAnim - 169) / 25) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 194) / 14) * (0-(0)));
            yy = -0.07 + (((tickAnim - 194) / 14) * (-0.05-(-0.07)));
            zz = 0 + (((tickAnim - 194) / 14) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 208) / 11) * (0-(0)));
            yy = -0.05 + (((tickAnim - 208) / 11) * (-0.515-(-0.05)));
            zz = 0 + (((tickAnim - 208) / 11) * (-0.125-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 219) / 10) * (0-(0)));
            yy = -0.515 + (((tickAnim - 219) / 10) * (0.915-(-0.515)));
            zz = -0.125 + (((tickAnim - 219) / 10) * (-0.09-(-0.125)));
        }
        else if (tickAnim >= 229 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 229) / 14) * (0-(0)));
            yy = 0.915 + (((tickAnim - 229) / 14) * (1.075-(0.915)));
            zz = -0.09 + (((tickAnim - 229) / 14) * (-0.04-(-0.09)));
        }
        else if (tickAnim >= 243 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 243) / 10) * (0-(0)));
            yy = 1.075 + (((tickAnim - 243) / 10) * (0-(1.075)));
            zz = -0.04 + (((tickAnim - 243) / 10) * (0-(-0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 86;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = -0.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-1 + (((tickAnim - 20) / 47) * (-2.25-(-0.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-1)));
            yy = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 47) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 87) {
            xx = -2.25 + (((tickAnim - 67) / 20) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 67) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 66) {
            xx = 1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 21) / 45) * (-3.14-(1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 21) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 45) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 87) {
            xx = -3.14 + (((tickAnim - 66) / 21) * (0-(-3.14)));
            yy = 0 + (((tickAnim - 66) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 65) {
            xx = 1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 22) / 43) * (3-(1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 22) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 43) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 87) {
            xx = 3 + (((tickAnim - 65) / 22) * (0-(3)));
            yy = 0 + (((tickAnim - 65) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 22) / 41) * (-2.5-(1)));
            yy = 0 + (((tickAnim - 22) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 41) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 87) {
            xx = -2.5 + (((tickAnim - 63) / 24) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 63) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 62) {
            xx = 0.75 + (((tickAnim - 22) / 40) * (-2.75-(0.75)));
            yy = 0 + (((tickAnim - 22) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 40) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 87) {
            xx = -2.75 + (((tickAnim - 62) / 25) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 62) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 60) {
            xx = 1.5 + (((tickAnim - 22) / 38) * (-5-(1.5)));
            yy = 0 + (((tickAnim - 22) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 38) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 87) {
            xx = -5 + (((tickAnim - 60) / 27) * (0-(-5)));
            yy = 0 + (((tickAnim - 60) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (3.7495-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.11884-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-0.48567-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 59) {
            xx = 3.7495 + (((tickAnim - 22) / 37) * (-1.44857-(3.7495)));
            yy = 0.11884 + (((tickAnim - 22) / 37) * (0.06967-(0.11884)));
            zz = -0.48567 + (((tickAnim - 22) / 37) * (-0.2847-(-0.48567)));
        }
        else if (tickAnim >= 59 && tickAnim < 87) {
            xx = -1.44857 + (((tickAnim - 59) / 28) * (0-(-1.44857)));
            yy = 0.06967 + (((tickAnim - 59) / 28) * (0-(0.06967)));
            zz = -0.2847 + (((tickAnim - 59) / 28) * (0-(-0.2847)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck7.rotationPointX = this.neck7.rotationPointX + (float)(0);
        this.neck7.rotationPointY = this.neck7.rotationPointY - (float)(0);
        this.neck7.rotationPointZ = this.neck7.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (2.22926-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1.04638-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-2.27061-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 57) {
            xx = 2.22926 + (((tickAnim - 22) / 35) * (-0.52074-(2.22926)));
            yy = 1.04638 + (((tickAnim - 22) / 35) * (1.04638-(1.04638)));
            zz = -2.27061 + (((tickAnim - 22) / 35) * (-2.27061-(-2.27061)));
        }
        else if (tickAnim >= 57 && tickAnim < 87) {
            xx = -0.52074 + (((tickAnim - 57) / 30) * (0-(-0.52074)));
            yy = 1.04638 + (((tickAnim - 57) / 30) * (0-(1.04638)));
            zz = -2.27061 + (((tickAnim - 57) / 30) * (0-(-2.27061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 22) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 35) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 57) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck8.rotationPointX = this.neck8.rotationPointX + (float)(xx);
        this.neck8.rotationPointY = this.neck8.rotationPointY - (float)(yy);
        this.neck8.rotationPointZ = this.neck8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            yy = 0.875 + (((tickAnim - 53) / 34) * (0-(0.875)));
            zz = 0 + (((tickAnim - 53) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (2.4651-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1.03449-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-3.86412-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 53) {
            xx = 2.4651 + (((tickAnim - 22) / 31) * (-3.0349-(2.4651)));
            yy = 1.03449 + (((tickAnim - 22) / 31) * (1.03449-(1.03449)));
            zz = -3.86412 + (((tickAnim - 22) / 31) * (-3.86412-(-3.86412)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = -3.0349 + (((tickAnim - 53) / 34) * (0-(-3.0349)));
            yy = 1.03449 + (((tickAnim - 53) / 34) * (0-(1.03449)));
            zz = -3.86412 + (((tickAnim - 53) / 34) * (0-(-3.86412)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 22) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 31) * (0.525-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            zz = 0.525 + (((tickAnim - 53) / 34) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 46) {
            xx = 5.25 + (((tickAnim - 22) / 24) * (20.25-(5.25)));
            yy = 0 + (((tickAnim - 22) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 24) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 87) {
            xx = 20.25 + (((tickAnim - 46) / 41) * (0-(20.25)));
            yy = 0 + (((tickAnim - 46) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 22) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 24) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.15))*0.1-(0)));
            zz = 0 + (((tickAnim - 22) / 24) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 46) / 41) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.15))*0.1 + (((tickAnim - 46) / 41) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.15))*0.1)));
            zz = 0 + (((tickAnim - 46) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 18) / 15) * (-9-(-9)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 33) / 17) * (0-(-9)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            zz = 2.5 + (((tickAnim - 18) / 15) * (2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            zz = 2.5 + (((tickAnim - 33) / 17) * (0-(2.5)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -4.5 + (((tickAnim - 18) / 15) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4.5 + (((tickAnim - 33) / 17) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.75 + (((tickAnim - 18) / 15) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.75 + (((tickAnim - 33) / 17) * (0-(0.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5.5 + (((tickAnim - 18) / 15) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 33) / 17) * (0-(-5.5)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (8.15711-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7.76937-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.49499-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.15711 + (((tickAnim - 18) / 15) * (8.15711-(8.15711)));
            yy = -7.76937 + (((tickAnim - 18) / 15) * (-7.76937-(-7.76937)));
            zz = -2.49499 + (((tickAnim - 18) / 15) * (-2.49499-(-2.49499)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.15711 + (((tickAnim - 33) / 17) * (0-(8.15711)));
            yy = -7.76937 + (((tickAnim - 33) / 17) * (0-(-7.76937)));
            zz = -2.49499 + (((tickAnim - 33) / 17) * (0-(-2.49499)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.55-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-12.45498-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.74871-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 2.55 + (((tickAnim - 18) / 15) * (2.55-(2.55)));
            yy = -12.45498 + (((tickAnim - 18) / 15) * (-12.45498-(-12.45498)));
            zz = -2.74871 + (((tickAnim - 18) / 15) * (-2.74871-(-2.74871)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.55 + (((tickAnim - 33) / 17) * (0-(2.55)));
            yy = -12.45498 + (((tickAnim - 33) / 17) * (0-(-12.45498)));
            zz = -2.74871 + (((tickAnim - 33) / 17) * (0-(-2.74871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.79361-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.35142-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.14792-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4.79361 + (((tickAnim - 18) / 15) * (4.79361-(4.79361)));
            yy = -4.35142 + (((tickAnim - 18) / 15) * (-4.35142-(-4.35142)));
            zz = -1.14792 + (((tickAnim - 18) / 15) * (-1.14792-(-1.14792)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4.79361 + (((tickAnim - 33) / 17) * (0-(4.79361)));
            yy = -4.35142 + (((tickAnim - 33) / 17) * (0-(-4.35142)));
            zz = -1.14792 + (((tickAnim - 33) / 17) * (0-(-1.14792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.28571-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-7.85714-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.28571 + (((tickAnim - 13) / 5) * (0.75-(1.28571)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -7.85714 + (((tickAnim - 13) / 5) * (-11-(-7.85714)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0.75 + (((tickAnim - 18) / 15) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -11 + (((tickAnim - 18) / 15) * (-11-(-11)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0.75 + (((tickAnim - 33) / 3) * (-3.56656-(0.75)));
            yy = 0 + (((tickAnim - 33) / 3) * (-1.18273-(0)));
            zz = -11 + (((tickAnim - 33) / 3) * (7.80462-(-11)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -3.56656 + (((tickAnim - 36) / 3) * (-4.47737-(-3.56656)));
            yy = -1.18273 + (((tickAnim - 36) / 3) * (-0.90444-(-1.18273)));
            zz = 7.80462 + (((tickAnim - 36) / 3) * (5.96824-(7.80462)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -4.47737 + (((tickAnim - 39) / 11) * (0-(-4.47737)));
            yy = -0.90444 + (((tickAnim - 39) / 11) * (0-(-0.90444)));
            zz = 5.96824 + (((tickAnim - 39) / 11) * (0-(5.96824)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 18) / 15) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 33) / 17) * (0-(8.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 8) / 5) * (13-(13)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 13) / 20) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 33) / 8) * (0-(13)));
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
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.5 + (((tickAnim - 7) / 4) * (3-(-17.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 11) / 22) * (3-(3)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 33) / 4) * (-20-(3)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -20 + (((tickAnim - 37) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 37 + (((tickAnim - 7) / 4) * (-8-(37)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = -8 + (((tickAnim - 11) / 22) * (-8-(-8)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -8 + (((tickAnim - 33) / 4) * (45.33-(-8)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 45.33 + (((tickAnim - 37) / 4) * (0-(45.33)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.92693-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.25553-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.84354-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.92693 + (((tickAnim - 18) / 15) * (-9.92693-(-9.92693)));
            yy = -3.25553 + (((tickAnim - 18) / 15) * (-3.25553-(-3.25553)));
            zz = -0.84354 + (((tickAnim - 18) / 15) * (-0.84354-(-0.84354)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.92693 + (((tickAnim - 33) / 17) * (0-(-9.92693)));
            yy = -3.25553 + (((tickAnim - 33) / 17) * (0-(-3.25553)));
            zz = -0.84354 + (((tickAnim - 33) / 17) * (0-(-0.84354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 34.25 + (((tickAnim - 18) / 15) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 33) / 17) * (0-(34.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
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
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 18) / 15) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 33) / 17) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.375-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.375 + (((tickAnim - 18) / 15) * (1.375-(1.375)));
            zz = 0.5 + (((tickAnim - 18) / 15) * (0.5-(0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.375 + (((tickAnim - 33) / 17) * (0-(1.375)));
            zz = 0.5 + (((tickAnim - 33) / 17) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.29-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.29 + (((tickAnim - 13) / 5) * (8-(-3.29)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 18) / 15) * (8-(8)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 8 + (((tickAnim - 33) / 3) * (-0.54267-(8)));
            yy = 0 + (((tickAnim - 33) / 3) * (-7.7499-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0.03947-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -0.54267 + (((tickAnim - 36) / 3) * (-8.74513-(-0.54267)));
            yy = -7.7499 + (((tickAnim - 36) / 3) * (-5.60464-(-7.7499)));
            zz = 0.03947 + (((tickAnim - 36) / 3) * (5.80039-(0.03947)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -8.74513 + (((tickAnim - 39) / 11) * (0-(-8.74513)));
            yy = -5.60464 + (((tickAnim - 39) / 11) * (0-(-5.60464)));
            zz = 5.80039 + (((tickAnim - 39) / 11) * (0-(5.80039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (13-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 13) / 28) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 28) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 41) / 9) * (0-(13)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 8) / 5) * (-24-(-5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -24 + (((tickAnim - 13) / 5) * (3-(-24)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = 3 + (((tickAnim - 18) / 23) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 3 + (((tickAnim - 41) / 5) * (-20.33-(3)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -20.33 + (((tickAnim - 46) / 4) * (0-(-20.33)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 8) / 5) * (35-(14)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 35 + (((tickAnim - 13) / 5) * (-8-(35)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = -8 + (((tickAnim - 18) / 23) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = -8 + (((tickAnim - 41) / 5) * (41.22-(-8)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 41.22 + (((tickAnim - 46) / 4) * (0-(41.22)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.83745-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (4.49559-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.61069-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.83745 + (((tickAnim - 18) / 15) * (-9.83745-(-9.83745)));
            yy = 4.49559 + (((tickAnim - 18) / 15) * (4.49559-(4.49559)));
            zz = 1.61069 + (((tickAnim - 18) / 15) * (1.61069-(1.61069)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.83745 + (((tickAnim - 33) / 17) * (0-(-9.83745)));
            yy = 4.49559 + (((tickAnim - 33) / 17) * (0-(4.49559)));
            zz = 1.61069 + (((tickAnim - 33) / 17) * (0-(1.61069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 34.25 + (((tickAnim - 18) / 15) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 33) / 17) * (0-(34.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 18) / 15) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 33) / 17) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.375-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.375 + (((tickAnim - 18) / 15) * (1.375-(1.375)));
            zz = 0.5 + (((tickAnim - 18) / 15) * (0.5-(0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.375 + (((tickAnim - 33) / 17) * (0-(1.375)));
            zz = 0.5 + (((tickAnim - 33) / 17) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
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
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*2 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*0.5 + (((tickAnim - 28) / 22) * (0-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*0.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1 + (((tickAnim - 28) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1 + (((tickAnim - 28) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.454+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.1963+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*1.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*0.5 + (((tickAnim - 28) / 22) * (0-(0.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*0.5)));
            yy = -0.454+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*2 + (((tickAnim - 28) / 22) * (0-(-0.454+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*2)));
            zz = -0.1963+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*1.5 + (((tickAnim - 28) / 22) * (0-(-0.1963+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*2 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (8.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.5519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.8816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*1.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*2.5 + (((tickAnim - 28) / 22) * (0-(8.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*2.5)));
            yy = 1.5519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*2 + (((tickAnim - 28) / 22) * (0-(1.5519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*2)));
            zz = -0.8816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*1.5 + (((tickAnim - 28) / 22) * (0-(-0.8816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-90))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (5.7606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.9329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.8144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 5.7606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*5 + (((tickAnim - 28) / 22) * (0-(5.7606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*5)));
            yy = 1.9329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*1 + (((tickAnim - 28) / 22) * (0-(1.9329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*1)));
            zz = -0.8144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*1 + (((tickAnim - 28) / 22) * (0-(-0.8144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-110))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (5.7606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.9329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.8144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 5.7606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*5 + (((tickAnim - 28) / 22) * (0-(5.7606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*5)));
            yy = 1.9329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*1 + (((tickAnim - 28) / 22) * (0-(1.9329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*1)));
            zz = -0.8144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*1 + (((tickAnim - 28) / 22) * (0-(-0.8144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-130))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 13.5 + (((tickAnim - 15) / 16) * (-9.61143-(13.5)));
            yy = 0 + (((tickAnim - 15) / 16) * (-2.12196-(0)));
            zz = 0 + (((tickAnim - 15) / 16) * (0.24409-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -9.61143 + (((tickAnim - 31) / 4) * (-8.13-(-9.61143)));
            yy = -2.12196 + (((tickAnim - 31) / 4) * (0-(-2.12196)));
            zz = 0.24409 + (((tickAnim - 31) / 4) * (0-(0.24409)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.13 + (((tickAnim - 35) / 15) * (0-(-8.13)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.925 + (((tickAnim - 15) / 20) * (-0.095-(-0.925)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = -0.095 + (((tickAnim - 35) / 2) * (-0.03-(-0.095)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = -0.03 + (((tickAnim - 37) / 1) * (0.11-(-0.03)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.11 + (((tickAnim - 38) / 2) * (-0.11-(0.11)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = -0.11 + (((tickAnim - 40) / 2) * (0.11-(-0.11)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.11 + (((tickAnim - 42) / 8) * (0-(0.11)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.25 + (((tickAnim - 15) / 20) * (-18.5-(13.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 35) / 15) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (5.725-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 5.725 + (((tickAnim - 25) / 10) * (0-(5.725)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
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
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 10.25 + (((tickAnim - 15) / 10) * (35.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 35.25 + (((tickAnim - 25) / 7) * (16.77-(35.25)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 16.77 + (((tickAnim - 32) / 3) * (26-(16.77)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 26 + (((tickAnim - 35) / 15) * (0-(26)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-31.41032-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (14.84252-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.8905-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -31.41032 + (((tickAnim - 15) / 10) * (0-(-31.41032)));
            yy = 14.84252 + (((tickAnim - 15) / 10) * (0-(14.84252)));
            zz = -8.8905 + (((tickAnim - 15) / 10) * (0-(-8.8905)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (-9.71717-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (12.07945-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (-2.05234-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -9.71717 + (((tickAnim - 32) / 3) * (0-(-9.71717)));
            yy = 12.07945 + (((tickAnim - 32) / 3) * (0-(12.07945)));
            zz = -2.05234 + (((tickAnim - 32) / 3) * (0-(-2.05234)));
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
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.375-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 1.15 + (((tickAnim - 15) / 10) * (0-(1.15)));
            zz = -4.375 + (((tickAnim - 15) / 10) * (0-(-4.375)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
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
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(0)));
            yy = 0.025 + (((tickAnim - 0) / 10) * (-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3-(0.025)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 10) / 10) * (0-(1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = -1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3 + (((tickAnim - 10) / 10) * (0.025-(-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



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
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.5 + (((tickAnim - 5) / 5) * (-3.5-(-1.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3.5 + (((tickAnim - 10) / 10) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -2 + (((tickAnim - 5) / 5) * (-4.25-(-2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -4.25 + (((tickAnim - 10) / 10) * (0-(-4.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 5) / 5) * (-3-(-1.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3 + (((tickAnim - 10) / 10) * (0-(-3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 2.25 + (((tickAnim - 5) / 5) * (0-(2.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.67-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.67 + (((tickAnim - 14) / 6) * (0-(-0.67)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 3) / 7) * (-2.75-(2)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -2.75 + (((tickAnim - 10) / 4) * (-3.1-(-2.75)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.1 + (((tickAnim - 14) / 6) * (0-(-3.1)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 3.25 + (((tickAnim - 3) / 7) * (-2.5-(3.25)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -2.5 + (((tickAnim - 10) / 4) * (-3.75-(-2.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.75 + (((tickAnim - 14) / 6) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.04782-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.04575-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-3.16853-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.04782 + (((tickAnim - 9) / 11) * (0-(0.04782)));
            yy = -1.04575 + (((tickAnim - 9) / 11) * (0-(-1.04575)));
            zz = -3.16853 + (((tickAnim - 9) / 11) * (0-(-3.16853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 1.75 + (((tickAnim - 9) / 11) * (0-(1.75)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 11) * (0-(0.5)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -1 + (((tickAnim - 9) / 11) * (0-(-1)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5.47518-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.04361-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.62565-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 5.47518 + (((tickAnim - 9) / 11) * (0-(5.47518)));
            yy = -0.04361 + (((tickAnim - 9) / 11) * (0-(-0.04361)));
            zz = 0.62565 + (((tickAnim - 9) / 11) * (0-(0.62565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -3.25 + (((tickAnim - 9) / 11) * (0-(-3.25)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -1.75 + (((tickAnim - 9) / 11) * (0-(-1.75)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.94957-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.98102-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-16.4683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 12.94957 + (((tickAnim - 5) / 8) * (-36.77887-(12.94957)));
            yy = 0.98102 + (((tickAnim - 5) / 8) * (-12.54388-(0.98102)));
            zz = -16.4683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3 + (((tickAnim - 5) / 8) * (2.18366-(-16.4683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -36.77887 + (((tickAnim - 13) / 7) * (0-(-36.77887)));
            yy = -12.54388 + (((tickAnim - 13) / 7) * (0-(-12.54388)));
            zz = 2.18366 + (((tickAnim - 13) / 7) * (0-(2.18366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 2.675 + (((tickAnim - 8) / 5) * (2.675-(2.675)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 2.675 + (((tickAnim - 13) / 7) * (0-(2.675)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6.96853-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-19.77546-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (9.93468-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -6.96853 + (((tickAnim - 5) / 8) * (-22.03309-(-6.96853)));
            yy = -19.77546 + (((tickAnim - 5) / 8) * (-7.65226-(-19.77546)));
            zz = 9.93468 + (((tickAnim - 5) / 8) * (23.89096-(9.93468)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -22.03309 + (((tickAnim - 13) / 7) * (0-(-22.03309)));
            yy = -7.65226 + (((tickAnim - 13) / 7) * (0-(-7.65226)));
            zz = 23.89096 + (((tickAnim - 13) / 7) * (0-(23.89096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 23 + (((tickAnim - 5) / 8) * (0-(23)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 5) / 8) * (0-(0.55)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.5 + (((tickAnim - 5) / 5) * (3-(1.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 10) / 10) * (0-(3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 5) / 8) * (11-(4.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 13) / 7) * (0-(11)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.23091-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.56052-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.46018-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.23091 + (((tickAnim - 10) / 10) * (0-(0.23091)));
            yy = -0.56052 + (((tickAnim - 10) / 10) * (0-(-0.56052)));
            zz = 0.46018 + (((tickAnim - 10) / 10) * (0-(0.46018)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 5) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 1.5 + (((tickAnim - 5) / 5) * (0-(1.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 15) / 5) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 5) / 9) * (-0.56-(5)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -0.56 + (((tickAnim - 14) / 6) * (0-(-0.56)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 131;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 6.25 + (((tickAnim - 80) / 5) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 6.25 + (((tickAnim - 85) / 47) * (0-(6.25)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 80) / 5) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = 0.7 + (((tickAnim - 85) / 47) * (0-(0.7)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -2.25 + (((tickAnim - 48) / 32) * (17.5-(-2.25)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 17.5 + (((tickAnim - 80) / 5) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 17.5 + (((tickAnim - 85) / 32) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 17.5 + (((tickAnim - 117) / 8) * (0-(17.5)));
            yy = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 80 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 80) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 80) / 2) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 82) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 82) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 82) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = -4.25 + (((tickAnim - 48) / 15) * (23.12-(-4.25)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 23.12 + (((tickAnim - 63) / 17) * (-18.75-(23.12)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -18.75 + (((tickAnim - 80) / 5) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -18.75 + (((tickAnim - 85) / 32) * (-11-(-18.75)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -11 + (((tickAnim - 117) / 8) * (-6.27-(-11)));
            yy = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = -6.27 + (((tickAnim - 125) / 7) * (0-(-6.27)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (1.975-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = 1.975 + (((tickAnim - 63) / 17) * (0-(1.975)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 8) * (4.45-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            yy = 4.45 + (((tickAnim - 125) / 7) * (0-(4.45)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 4 + (((tickAnim - 48) / 15) * (30.21-(4)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 30.21 + (((tickAnim - 63) / 17) * (-4-(30.21)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -4 + (((tickAnim - 80) / 5) * (-4-(-4)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -4 + (((tickAnim - 85) / 32) * (-4-(-4)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -4 + (((tickAnim - 117) / 8) * (34.85923-(-4)));
            yy = 0 + (((tickAnim - 117) / 8) * (2.21404-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (-0.34135-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 129) {
            xx = 34.85923 + (((tickAnim - 125) / 4) * (-0.04223-(34.85923)));
            yy = 2.21404 + (((tickAnim - 125) / 4) * (0.66421-(2.21404)));
            zz = -0.34135 + (((tickAnim - 125) / 4) * (-0.10241-(-0.34135)));
        }
        else if (tickAnim >= 129 && tickAnim < 132) {
            xx = -0.04223 + (((tickAnim - 129) / 3) * (0-(-0.04223)));
            yy = 0.66421 + (((tickAnim - 129) / 3) * (0-(0.66421)));
            zz = -0.10241 + (((tickAnim - 129) / 3) * (0-(-0.10241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -1.25 + (((tickAnim - 85) / 47) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -1.5 + (((tickAnim - 85) / 47) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-2.46168-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (-0.27574-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-0.33196-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -2.46168 + (((tickAnim - 85) / 47) * (0-(-2.46168)));
            yy = -0.27574 + (((tickAnim - 85) / 47) * (0-(-0.27574)));
            zz = -0.33196 + (((tickAnim - 85) / 47) * (0-(-0.33196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -5 + (((tickAnim - 85) / 47) * (0-(-5)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 18.75 + (((tickAnim - 80) / 5) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 18.75 + (((tickAnim - 85) / 47) * (0-(18.75)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (2.25-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 1.675 + (((tickAnim - 80) / 5) * (1.675-(1.675)));
            zz = 2.25 + (((tickAnim - 80) / 5) * (2.25-(2.25)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = 1.675 + (((tickAnim - 85) / 47) * (0-(1.675)));
            zz = 2.25 + (((tickAnim - 85) / 47) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 10.75 + (((tickAnim - 80) / 5) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 10.75 + (((tickAnim - 85) / 47) * (0-(10.75)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.65-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 1.1 + (((tickAnim - 80) / 5) * (1.1-(1.1)));
            zz = 0.65 + (((tickAnim - 80) / 5) * (0.65-(0.65)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = 1.1 + (((tickAnim - 85) / 47) * (0-(1.1)));
            zz = 0.65 + (((tickAnim - 85) / 47) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 0) / 58) * (15.57-(0)));
            yy = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 58) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 15.57 + (((tickAnim - 58) / 8) * (18.58-(15.57)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 74) {
            xx = 18.58 + (((tickAnim - 66) / 8) * (19.92-(18.58)));
            yy = 0 + (((tickAnim - 66) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 8) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 19.92 + (((tickAnim - 74) / 6) * (19.25-(19.92)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 19.25 + (((tickAnim - 80) / 5) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 19.25 + (((tickAnim - 85) / 47) * (0-(19.25)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (1.1-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 80) / 5) * (-0.5-(-0.5)));
            zz = 1.1 + (((tickAnim - 80) / 5) * (1.1-(1.1)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = -0.5 + (((tickAnim - 85) / 47) * (0-(-0.5)));
            zz = 1.1 + (((tickAnim - 85) / 47) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (11.46148-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.42981-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.46761-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 11.46148 + (((tickAnim - 80) / 5) * (11.46148-(11.46148)));
            yy = -0.42981 + (((tickAnim - 80) / 5) * (-0.42981-(-0.42981)));
            zz = 0.46761 + (((tickAnim - 80) / 5) * (0.46761-(0.46761)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 11.46148 + (((tickAnim - 85) / 47) * (0-(11.46148)));
            yy = -0.42981 + (((tickAnim - 85) / 47) * (0-(-0.42981)));
            zz = 0.46761 + (((tickAnim - 85) / 47) * (0-(0.46761)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 23 + (((tickAnim - 80) / 5) * (23-(23)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 23 + (((tickAnim - 85) / 47) * (0-(23)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 7 + (((tickAnim - 80) / 5) * (7-(7)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 7 + (((tickAnim - 85) / 47) * (0-(7)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 11 + (((tickAnim - 80) / 5) * (11-(11)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 11 + (((tickAnim - 85) / 47) * (0-(11)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-6.00728-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.49696-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.67798-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -6.00728 + (((tickAnim - 80) / 5) * (-6-(-6.00728)));
            yy = 0.49696 + (((tickAnim - 80) / 5) * (0-(0.49696)));
            zz = -1.67798 + (((tickAnim - 80) / 5) * (0-(-1.67798)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -6 + (((tickAnim - 85) / 47) * (0-(-6)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.66527-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.63145-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-10.0697-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.66527 + (((tickAnim - 10) / 10) * (-7.33054-(-8.66527)));
            yy = -2.63145 + (((tickAnim - 10) / 10) * (-5.2629-(-2.63145)));
            zz = -10.0697 + (((tickAnim - 10) / 10) * (-20.13939-(-10.0697)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -7.33054 + (((tickAnim - 20) / 60) * (-42.0692-(-7.33054)));
            yy = -5.2629 + (((tickAnim - 20) / 60) * (-12.29628-(-5.2629)));
            zz = -20.13939 + (((tickAnim - 20) / 60) * (-11.23604-(-20.13939)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -42.0692 + (((tickAnim - 80) / 5) * (-42.0692-(-42.0692)));
            yy = -12.29628 + (((tickAnim - 80) / 5) * (-12.29628-(-12.29628)));
            zz = -11.23604 + (((tickAnim - 80) / 5) * (-11.23604-(-11.23604)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -42.0692 + (((tickAnim - 85) / 20) * (-31.20373-(-42.0692)));
            yy = -12.29628 + (((tickAnim - 85) / 20) * (-8.97379-(-12.29628)));
            zz = -11.23604 + (((tickAnim - 85) / 20) * (-11.7357-(-11.23604)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = -31.20373 + (((tickAnim - 105) / 8) * (-19.65143-(-31.20373)));
            yy = -8.97379 + (((tickAnim - 105) / 8) * (-5.13396-(-8.97379)));
            zz = -11.7357 + (((tickAnim - 105) / 8) * (-13.35205-(-11.7357)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = -19.65143 + (((tickAnim - 113) / 9) * (-8.75-(-19.65143)));
            yy = -5.13396 + (((tickAnim - 113) / 9) * (0-(-5.13396)));
            zz = -13.35205 + (((tickAnim - 113) / 9) * (0-(-13.35205)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = -8.75 + (((tickAnim - 122) / 10) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (-2.875-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -2.875 + (((tickAnim - 20) / 2) * (-2.29-(-2.875)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -2.29 + (((tickAnim - 22) / 1) * (-1.8-(-2.29)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -1.8 + (((tickAnim - 23) / 2) * (-1.515-(-1.8)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -1.515 + (((tickAnim - 25) / 2) * (-1.525-(-1.515)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 27) / 53) * (0-(0)));
            yy = -1.525 + (((tickAnim - 27) / 53) * (7.1-(-1.525)));
            zz = 0 + (((tickAnim - 27) / 53) * (-1.025-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 7.1 + (((tickAnim - 80) / 5) * (7.1-(7.1)));
            zz = -1.025 + (((tickAnim - 80) / 5) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 7.1 + (((tickAnim - 85) / 20) * (6.36-(7.1)));
            zz = -1.025 + (((tickAnim - 85) / 20) * (0-(-1.025)));
        }
        else if (tickAnim >= 105 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 105) / 17) * (0-(0)));
            yy = 6.36 + (((tickAnim - 105) / 17) * (5.3-(6.36)));
            zz = 0 + (((tickAnim - 105) / 17) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            yy = 5.3 + (((tickAnim - 122) / 10) * (0-(5.3)));
            zz = 0 + (((tickAnim - 122) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19.50315-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.97085-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (11.85467-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.50315 + (((tickAnim - 10) / 10) * (-24.4756-(-19.50315)));
            yy = -5.97085 + (((tickAnim - 10) / 10) * (8.32854-(-5.97085)));
            zz = 11.85467 + (((tickAnim - 10) / 10) * (18.95711-(11.85467)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -24.4756 + (((tickAnim - 20) / 60) * (-31.24006-(-24.4756)));
            yy = 8.32854 + (((tickAnim - 20) / 60) * (0.11574-(8.32854)));
            zz = 18.95711 + (((tickAnim - 20) / 60) * (11.99584-(18.95711)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -31.24006 + (((tickAnim - 80) / 5) * (-31.24006-(-31.24006)));
            yy = 0.11574 + (((tickAnim - 80) / 5) * (0.11574-(0.11574)));
            zz = 11.99584 + (((tickAnim - 80) / 5) * (11.99584-(11.99584)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -31.24006 + (((tickAnim - 85) / 20) * (-0.73634-(-31.24006)));
            yy = 0.11574 + (((tickAnim - 85) / 20) * (-0.86875-(0.11574)));
            zz = 11.99584 + (((tickAnim - 85) / 20) * (12.94847-(11.99584)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = -0.73634 + (((tickAnim - 105) / 8) * (-20.63161-(-0.73634)));
            yy = -0.86875 + (((tickAnim - 105) / 8) * (2.21077-(-0.86875)));
            zz = 12.94847 + (((tickAnim - 105) / 8) * (16.67196-(12.94847)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = -20.63161 + (((tickAnim - 113) / 9) * (0-(-20.63161)));
            yy = 2.21077 + (((tickAnim - 113) / 9) * (0-(2.21077)));
            zz = 16.67196 + (((tickAnim - 113) / 9) * (0-(16.67196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 10) / 70) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 70) * (2.695-(1)));
            zz = 0 + (((tickAnim - 10) / 70) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 2.695 + (((tickAnim - 80) / 5) * (2.695-(2.695)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 2.695 + (((tickAnim - 85) / 20) * (4.225-(2.695)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 105) / 17) * (0-(0)));
            yy = 4.225 + (((tickAnim - 105) / 17) * (0-(4.225)));
            zz = 0 + (((tickAnim - 105) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 49 + (((tickAnim - 10) / 10) * (25.5-(49)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 25.5 + (((tickAnim - 20) / 60) * (42.1812-(25.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (-4.06086-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (1.94055-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 42.1812 + (((tickAnim - 80) / 5) * (42.1812-(42.1812)));
            yy = -4.06086 + (((tickAnim - 80) / 5) * (-4.06086-(-4.06086)));
            zz = 1.94055 + (((tickAnim - 80) / 5) * (1.94055-(1.94055)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 42.1812 + (((tickAnim - 85) / 20) * (14-(42.1812)));
            yy = -4.06086 + (((tickAnim - 85) / 20) * (0-(-4.06086)));
            zz = 1.94055 + (((tickAnim - 85) / 20) * (0-(1.94055)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 14 + (((tickAnim - 105) / 8) * (49.86-(14)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = 49.86 + (((tickAnim - 113) / 9) * (0-(49.86)));
            yy = 0 + (((tickAnim - 113) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (15.09197-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (12.08175-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (3.23057-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 15.09197 + (((tickAnim - 63) / 17) * (0-(15.09197)));
            yy = 12.08175 + (((tickAnim - 63) / 17) * (0-(12.08175)));
            zz = 3.23057 + (((tickAnim - 63) / 17) * (0-(3.23057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = -0.325 + (((tickAnim - 63) / 17) * (0-(-0.325)));
            zz = 0.65 + (((tickAnim - 63) / 17) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-13.7497-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.02727-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.2497-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -13.7497 + (((tickAnim - 80) / 5) * (-5.75-(-13.7497)));
            yy = -0.02727 + (((tickAnim - 80) / 5) * (0-(-0.02727)));
            zz = -1.2497 + (((tickAnim - 80) / 5) * (0-(-1.2497)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -5.75 + (((tickAnim - 85) / 47) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (1.675-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 80) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 52) * (0-(0)));
            zz = 1.675 + (((tickAnim - 80) / 52) * (0-(1.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (21.25-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 21.25 + (((tickAnim - 80) / 5) * (0-(21.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 20) / 10) * (-21.62985-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (11.09116-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (9.83778-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.62985 + (((tickAnim - 30) / 10) * (-40.59112-(-21.62985)));
            yy = 11.09116 + (((tickAnim - 30) / 10) * (13.91564-(11.09116)));
            zz = 9.83778 + (((tickAnim - 30) / 10) * (15.54709-(9.83778)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -40.59112 + (((tickAnim - 40) / 40) * (-48.34112-(-40.59112)));
            yy = 13.91564 + (((tickAnim - 40) / 40) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 40) / 40) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -48.34112 + (((tickAnim - 80) / 5) * (-48.34112-(-48.34112)));
            yy = 13.91564 + (((tickAnim - 80) / 5) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 80) / 5) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = -48.34112 + (((tickAnim - 85) / 10) * (-33.27088-(-48.34112)));
            yy = 13.91564 + (((tickAnim - 85) / 10) * (3.33577-(13.91564)));
            zz = 15.54709 + (((tickAnim - 85) / 10) * (12.33981-(15.54709)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -33.27088 + (((tickAnim - 95) / 10) * (-19.25-(-33.27088)));
            yy = 3.33577 + (((tickAnim - 95) / 10) * (0-(3.33577)));
            zz = 12.33981 + (((tickAnim - 95) / 10) * (0-(12.33981)));
        }
        else if (tickAnim >= 105 && tickAnim < 132) {
            xx = -19.25 + (((tickAnim - 105) / 27) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 105) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.785-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 5.785 + (((tickAnim - 20) / 10) * (5.32-(5.785)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 5.32 + (((tickAnim - 30) / 10) * (2.475-(5.32)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 2.475 + (((tickAnim - 40) / 2) * (2.615-(2.475)));
            zz = 0 + (((tickAnim - 40) / 2) * (-0.24-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 2.615 + (((tickAnim - 42) / 1) * (3.33-(2.615)));
            zz = -0.24 + (((tickAnim - 42) / 1) * (-0.48-(-0.24)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 3.33 + (((tickAnim - 43) / 2) * (3.555-(3.33)));
            zz = -0.48 + (((tickAnim - 43) / 2) * (-0.72-(-0.48)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = 3.555 + (((tickAnim - 45) / 2) * (3.995-(3.555)));
            zz = -0.72 + (((tickAnim - 45) / 2) * (-0.95-(-0.72)));
        }
        else if (tickAnim >= 47 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 47) / 33) * (0-(0)));
            yy = 3.995 + (((tickAnim - 47) / 33) * (11.125-(3.995)));
            zz = -0.95 + (((tickAnim - 47) / 33) * (-5.65-(-0.95)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 11.125 + (((tickAnim - 80) / 5) * (11.125-(11.125)));
            zz = -5.65 + (((tickAnim - 80) / 5) * (-5.65-(-5.65)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = 11.125 + (((tickAnim - 85) / 10) * (18.25-(11.125)));
            zz = -5.65 + (((tickAnim - 85) / 10) * (0-(-5.65)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            yy = 18.25 + (((tickAnim - 95) / 10) * (13.05-(18.25)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 105) / 27) * (0-(0)));
            yy = 13.05 + (((tickAnim - 105) / 27) * (0-(13.05)));
            zz = 0 + (((tickAnim - 105) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-9.89182-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (5.88873-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-14.25674-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.89182 + (((tickAnim - 30) / 10) * (-3.24284-(-9.89182)));
            yy = 5.88873 + (((tickAnim - 30) / 10) * (-5.17504-(5.88873)));
            zz = -14.25674 + (((tickAnim - 30) / 10) * (-17.70737-(-14.25674)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -3.24284 + (((tickAnim - 40) / 40) * (-29.71715-(-3.24284)));
            yy = -5.17504 + (((tickAnim - 40) / 40) * (-4.20264-(-5.17504)));
            zz = -17.70737 + (((tickAnim - 40) / 40) * (-17.08704-(-17.70737)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -29.71715 + (((tickAnim - 80) / 5) * (-29.71715-(-29.71715)));
            yy = -4.20264 + (((tickAnim - 80) / 5) * (-4.20264-(-4.20264)));
            zz = -17.08704 + (((tickAnim - 80) / 5) * (-17.08704-(-17.08704)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = -29.71715 + (((tickAnim - 85) / 10) * (-15.69522-(-29.71715)));
            yy = -4.20264 + (((tickAnim - 85) / 10) * (-9.55078-(-4.20264)));
            zz = -17.08704 + (((tickAnim - 85) / 10) * (-11.97888-(-17.08704)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -15.69522 + (((tickAnim - 95) / 10) * (0-(-15.69522)));
            yy = -9.55078 + (((tickAnim - 95) / 10) * (0-(-9.55078)));
            zz = -11.97888 + (((tickAnim - 95) / 10) * (0-(-11.97888)));
        }
        else if (tickAnim >= 105 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 105) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (54.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 54.5 + (((tickAnim - 30) / 8) * (19.19311-(54.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (2.5448-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (-1.92053-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 19.19311 + (((tickAnim - 38) / 2) * (27.42414-(19.19311)));
            yy = 2.5448 + (((tickAnim - 38) / 2) * (3.39307-(2.5448)));
            zz = -1.92053 + (((tickAnim - 38) / 2) * (-2.56071-(-1.92053)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 27.42414 + (((tickAnim - 40) / 40) * (43.41634-(27.42414)));
            yy = 3.39307 + (((tickAnim - 40) / 40) * (4.15332-(3.39307)));
            zz = -2.56071 + (((tickAnim - 40) / 40) * (-2.30689-(-2.56071)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 43.41634 + (((tickAnim - 80) / 5) * (43.41634-(43.41634)));
            yy = 4.15332 + (((tickAnim - 80) / 5) * (4.15332-(4.15332)));
            zz = -2.30689 + (((tickAnim - 80) / 5) * (-2.30689-(-2.30689)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 43.41634 + (((tickAnim - 85) / 10) * (41.75-(43.41634)));
            yy = 4.15332 + (((tickAnim - 85) / 10) * (0-(4.15332)));
            zz = -2.30689 + (((tickAnim - 85) / 10) * (0-(-2.30689)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 41.75 + (((tickAnim - 95) / 10) * (0-(41.75)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 105) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -3.5 + (((tickAnim - 80) / 5) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -3.5 + (((tickAnim - 85) / 47) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -4.75 + (((tickAnim - 80) / 5) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -4.75 + (((tickAnim - 85) / 47) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 1.5 + (((tickAnim - 80) / 5) * (4-(1.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 4 + (((tickAnim - 85) / 47) * (0-(4)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 53;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 2.25 + (((tickAnim - 0) / 26) * (17.25-(2.25)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 17.25 + (((tickAnim - 26) / 9) * (-1.75958-(17.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (-1.64439-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0.574-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -1.75958 + (((tickAnim - 35) / 5) * (-8.73-(-1.75958)));
            yy = -1.64439 + (((tickAnim - 35) / 5) * (0-(-1.64439)));
            zz = 0.574 + (((tickAnim - 35) / 5) * (0-(0.574)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -8.73 + (((tickAnim - 40) / 13) * (2.25-(-8.73)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = -0.725 + (((tickAnim - 26) / 14) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 42) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 45) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 0) / 13) * (-3.19-(-11)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -3.19 + (((tickAnim - 13) / 13) * (14.25-(-3.19)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 14.25 + (((tickAnim - 26) / 9) * (-16.77-(14.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -16.77 + (((tickAnim - 35) / 5) * (-12.5-(-16.77)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -12.5 + (((tickAnim - 40) / 13) * (-11-(-12.5)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 1.425 + (((tickAnim - 0) / 13) * (0-(1.425)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 13) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = -1.15 + (((tickAnim - 26) / 9) * (5.975-(-1.15)));
            zz = 0 + (((tickAnim - 26) / 9) * (-1.25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 5.975 + (((tickAnim - 35) / 5) * (0-(5.975)));
            zz = -1.25 + (((tickAnim - 35) / 5) * (0-(-1.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (1.425-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8.75 + (((tickAnim - 0) / 12) * (-1.84-(8.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -1.84 + (((tickAnim - 12) / 6) * (2.71-(-1.84)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 2.71 + (((tickAnim - 18) / 8) * (9.25-(2.71)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 26) / 9) * (29.71-(9.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 29.71 + (((tickAnim - 35) / 5) * (20.5-(29.71)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 20.5 + (((tickAnim - 40) / 13) * (8.75-(20.5)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0.775 + (((tickAnim - 26) / 14) * (0-(0.775)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -24.5 + (((tickAnim - 0) / 40) * (14.75-(-24.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 14.75 + (((tickAnim - 40) / 8) * (-6.76678-(14.75)));
            yy = 0 + (((tickAnim - 40) / 8) * (0.0128-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (-0.99992-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -6.76678 + (((tickAnim - 48) / 5) * (-24.5-(-6.76678)));
            yy = 0.0128 + (((tickAnim - 48) / 5) * (0-(0.0128)));
            zz = -0.99992 + (((tickAnim - 48) / 5) * (0-(-0.99992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 2) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 5) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = -1.25 + (((tickAnim - 40) / 13) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 20.5 + (((tickAnim - 0) / 40) * (7-(20.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 7 + (((tickAnim - 40) / 8) * (-1.07469-(7)));
            yy = 0 + (((tickAnim - 40) / 8) * (0.40262-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (2.4123-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -1.07469 + (((tickAnim - 48) / 5) * (20.5-(-1.07469)));
            yy = 0.40262 + (((tickAnim - 48) / 5) * (0-(0.40262)));
            zz = 2.4123 + (((tickAnim - 48) / 5) * (0-(2.4123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 13) * (0.08-(-0.675)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = 0.08 + (((tickAnim - 13) / 27) * (0-(0.08)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (2.55-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 2.55 + (((tickAnim - 48) / 5) * (-0.675-(2.55)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 3.75 + (((tickAnim - 0) / 27) * (-13.25-(3.75)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -13.25 + (((tickAnim - 27) / 13) * (-4.5-(-13.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -4.5 + (((tickAnim - 40) / 8) * (18.63-(-4.5)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 18.63 + (((tickAnim - 48) / 4) * (-2.3-(18.63)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = -2.3 + (((tickAnim - 52) / 1) * (3.75-(-2.3)));
            yy = 0 + (((tickAnim - 52) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 13) * (1.45-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = 1.45 + (((tickAnim - 13) / 14) * (0.9-(1.45)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 27) / 26) * (0-(0)));
            yy = 0.9 + (((tickAnim - 27) / 26) * (-0.225-(0.9)));
            zz = 0 + (((tickAnim - 27) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (-26.98145-(0)));
            yy = 0 + (((tickAnim - 12) / 16) * (9.33254-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (-2.83504-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -26.98145 + (((tickAnim - 28) / 8) * (9.73563-(-26.98145)));
            yy = 9.33254 + (((tickAnim - 28) / 8) * (12.57226-(9.33254)));
            zz = -2.83504 + (((tickAnim - 28) / 8) * (2.1388-(-2.83504)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 9.73563 + (((tickAnim - 36) / 4) * (0-(9.73563)));
            yy = 12.57226 + (((tickAnim - 36) / 4) * (0-(12.57226)));
            zz = 2.1388 + (((tickAnim - 36) / 4) * (0-(2.1388)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 16) * (0.35-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (-2.175-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 28) / 8) * (-0.35-(0.35)));
            zz = -2.175 + (((tickAnim - 28) / 8) * (0-(-2.175)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 36) / 4) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-140))*-0.8), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-120))*1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-168))*0.5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-250))*-3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+70))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5))*-1.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5))*-0.8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-20))*-0.3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-260))*-1.8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+260))*-1.1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-20))*0.1), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-270))*-2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+270))*-1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-20))*0.3), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-280))*-3), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*-2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-20))*0.5), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-280))*-7), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*-2.5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-20))*2), tail7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-290))*-8), tail7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+290))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-50))*0.6), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-260))*0.9));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+68))*0.8), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5+150))*0.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.15), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5+280))*1), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.1));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.3), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.05));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.2), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.1));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.2), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.2));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.2), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.7), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.5));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 0) / 13) * (14.5-(3.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 14.5 + (((tickAnim - 13) / 8) * (-6.76678-(14.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (-0.0128-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0.99992-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -6.76678 + (((tickAnim - 21) / 6) * (-24.5-(-6.76678)));
            yy = -0.0128 + (((tickAnim - 21) / 6) * (0-(-0.0128)));
            zz = 0.99992 + (((tickAnim - 21) / 6) * (0-(0.99992)));
        }
        else if (tickAnim >= 27 && tickAnim < 53) {
            xx = -24.5 + (((tickAnim - 27) / 26) * (3.25-(-24.5)));
            yy = 0 + (((tickAnim - 27) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 13) * (-1.2-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = -1.2 + (((tickAnim - 13) / 14) * (0-(-1.2)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 28) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 32) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 33) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 20) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 33) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 13.25 + (((tickAnim - 0) / 13) * (7-(13.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 13) / 7) * (-1.07469-(7)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.40262-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-2.41229-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -1.07469 + (((tickAnim - 20) / 7) * (20.5-(-1.07469)));
            yy = 0.40262 + (((tickAnim - 20) / 7) * (0-(0.40262)));
            zz = -2.41229 + (((tickAnim - 20) / 7) * (0-(-2.41229)));
        }
        else if (tickAnim >= 27 && tickAnim < 53) {
            xx = 20.5 + (((tickAnim - 27) / 26) * (13.25-(20.5)));
            yy = 0 + (((tickAnim - 27) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (2.55-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 2.55 + (((tickAnim - 20) / 7) * (-0.675-(2.55)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -0.675 + (((tickAnim - 27) / 5) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 32) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -14.25 + (((tickAnim - 0) / 13) * (-10.46-(-14.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -10.46 + (((tickAnim - 13) / 7) * (17.38-(-10.46)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 17.38 + (((tickAnim - 20) / 5) * (-1.05-(17.38)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -1.05 + (((tickAnim - 25) / 2) * (3.75-(-1.05)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 3.75 + (((tickAnim - 27) / 15) * (-7.38-(3.75)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -7.38 + (((tickAnim - 42) / 11) * (-14.25-(-7.38)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 1.525 + (((tickAnim - 0) / 27) * (-0.27-(1.525)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            yy = -0.27 + (((tickAnim - 27) / 15) * (2.285-(-0.27)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            yy = 2.285 + (((tickAnim - 42) / 11) * (1.525-(2.285)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 17.25 + (((tickAnim - 0) / 10) * (-4.05359-(17.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.86025-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.73461-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -4.05359 + (((tickAnim - 10) / 4) * (-10.25-(-4.05359)));
            yy = 1.86025 + (((tickAnim - 10) / 4) * (0-(1.86025)));
            zz = -0.73461 + (((tickAnim - 10) / 4) * (0-(-0.73461)));
        }
        else if (tickAnim >= 14 && tickAnim < 53) {
            xx = -10.25 + (((tickAnim - 14) / 39) * (17.25-(-10.25)));
            yy = 0 + (((tickAnim - 14) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 10) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 18) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 21) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 23) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 30) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 23) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.25 + (((tickAnim - 0) / 10) * (-9.81-(14.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -9.81 + (((tickAnim - 10) / 4) * (-12.5-(-9.81)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 36) {
            xx = -12.5 + (((tickAnim - 14) / 22) * (6.64-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 22) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 6.64 + (((tickAnim - 36) / 17) * (14.25-(6.64)));
            yy = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 10) * (4.445-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.04-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 4.445 + (((tickAnim - 10) / 4) * (-1.8-(4.445)));
            zz = -1.04 + (((tickAnim - 10) / 4) * (0-(-1.04)));
        }
        else if (tickAnim >= 14 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 14) / 22) * (0-(0)));
            yy = -1.8 + (((tickAnim - 14) / 22) * (-1.52-(-1.8)));
            zz = 0 + (((tickAnim - 14) / 22) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            yy = -1.52 + (((tickAnim - 36) / 17) * (-1.15-(-1.52)));
            zz = 0 + (((tickAnim - 36) / 17) * (0-(0)));
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
            xx = 10.25 + (((tickAnim - 0) / 10) * (22.82-(10.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 22.82 + (((tickAnim - 10) / 4) * (21.75-(22.82)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 36) {
            xx = 21.75 + (((tickAnim - 14) / 22) * (-7.06-(21.75)));
            yy = 0 + (((tickAnim - 14) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 22) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = -7.06 + (((tickAnim - 36) / 17) * (10.25-(-7.06)));
            yy = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.17-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.11-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 14) / 22) * (0-(0)));
            yy = 1.17 + (((tickAnim - 14) / 22) * (0.725-(1.17)));
            zz = 0.11 + (((tickAnim - 14) / 22) * (0.25-(0.11)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            yy = 0.725 + (((tickAnim - 36) / 17) * (0-(0.725)));
            zz = 0.25 + (((tickAnim - 36) / 17) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -32.77116 + (((tickAnim - 0) / 10) * (8.51597-(-32.77116)));
            yy = -10.0264 + (((tickAnim - 0) / 10) * (-5.93432-(-10.0264)));
            zz = 4.32692 + (((tickAnim - 0) / 10) * (-0.88692-(4.32692)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 8.51597 + (((tickAnim - 10) / 8) * (0-(8.51597)));
            yy = -5.93432 + (((tickAnim - 10) / 8) * (-6.75-(-5.93432)));
            zz = -0.88692 + (((tickAnim - 10) / 8) * (0-(-0.88692)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -6.75 + (((tickAnim - 18) / 10) * (-8-(-6.75)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -8 + (((tickAnim - 28) / 8) * (-8-(-8)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 36) / 17) * (-32.77116-(0)));
            yy = -8 + (((tickAnim - 36) / 17) * (-10.0264-(-8)));
            zz = 0 + (((tickAnim - 36) / 17) * (4.32692-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 10) * (-0.275-(1.3)));
            zz = -2.225 + (((tickAnim - 0) / 10) * (0.5-(-2.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 8) * (0-(-0.275)));
            zz = 0.5 + (((tickAnim - 10) / 8) * (0-(0.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (-0.67-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -0.11 + (((tickAnim - 28) / 8) * (-0.11-(-0.11)));
            zz = -0.67 + (((tickAnim - 28) / 8) * (-0.545-(-0.67)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            yy = -0.11 + (((tickAnim - 36) / 17) * (1.3-(-0.11)));
            zz = -0.545 + (((tickAnim - 36) / 17) * (-2.225-(-0.545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGiraffatitan entity = (EntityPrehistoricFloraGiraffatitan) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 2.25 + (((tickAnim - 0) / 13) * (17.25-(2.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 17.25 + (((tickAnim - 13) / 4) * (-1.75958-(17.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (-1.64439-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.574-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -1.75958 + (((tickAnim - 17) / 2) * (-8.73-(-1.75958)));
            yy = -1.64439 + (((tickAnim - 17) / 2) * (0-(-1.64439)));
            zz = 0.574 + (((tickAnim - 17) / 2) * (0-(0.574)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -8.73 + (((tickAnim - 19) / 6) * (2.25-(-8.73)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = -0.725 + (((tickAnim - 13) / 6) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 21) / 2) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = -0.7 + (((tickAnim - 24) / 1) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -11 + (((tickAnim - 0) / 6) * (-3.19-(-11)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -3.19 + (((tickAnim - 6) / 7) * (14.25-(-3.19)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 14.25 + (((tickAnim - 13) / 4) * (-16.77-(14.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -16.77 + (((tickAnim - 17) / 2) * (-12.5-(-16.77)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 19) / 6) * (-11-(-12.5)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.425 + (((tickAnim - 0) / 6) * (0-(1.425)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -1.15 + (((tickAnim - 13) / 4) * (5.975-(-1.15)));
            zz = 0 + (((tickAnim - 13) / 4) * (-1.25-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 5.975 + (((tickAnim - 17) / 2) * (0-(5.975)));
            zz = -1.25 + (((tickAnim - 17) / 2) * (0-(-1.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (1.425-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 8.75 + (((tickAnim - 0) / 6) * (-1.84-(8.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -1.84 + (((tickAnim - 6) / 2) * (2.71-(-1.84)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.71 + (((tickAnim - 8) / 5) * (9.25-(2.71)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 9.25 + (((tickAnim - 13) / 3) * (29.71-(9.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 29.71 + (((tickAnim - 16) / 2) * (10.11-(29.71)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 10.11 + (((tickAnim - 18) / 1) * (20.5-(10.11)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 20.5 + (((tickAnim - 19) / 6) * (8.75-(20.5)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.775 + (((tickAnim - 13) / 6) * (0-(0.775)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-26.98145-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (9.33254-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-2.83504-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -26.98145 + (((tickAnim - 13) / 4) * (9.73563-(-26.98145)));
            yy = 9.33254 + (((tickAnim - 13) / 4) * (12.57226-(9.33254)));
            zz = -2.83504 + (((tickAnim - 13) / 4) * (2.1388-(-2.83504)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 9.73563 + (((tickAnim - 17) / 2) * (0-(9.73563)));
            yy = 12.57226 + (((tickAnim - 17) / 2) * (0-(12.57226)));
            zz = 2.1388 + (((tickAnim - 17) / 2) * (0-(2.1388)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.35-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-2.175-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 4) * (-0.35-(0.35)));
            zz = -2.175 + (((tickAnim - 13) / 4) * (0-(-2.175)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 17) / 2) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -27.5 + (((tickAnim - 0) / 19) * (14.75-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 14.75 + (((tickAnim - 19) / 4) * (-6.76678-(14.75)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.0128-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-0.99992-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -6.76678 + (((tickAnim - 23) / 2) * (-27.5-(-6.76678)));
            yy = 0.0128 + (((tickAnim - 23) / 2) * (0-(0.0128)));
            zz = -0.99992 + (((tickAnim - 23) / 2) * (0-(-0.99992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 2) * (0.47-(0.9)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.47 + (((tickAnim - 2) / 1) * (1.475-(0.47)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.475 + (((tickAnim - 3) / 2) * (0.47-(1.475)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.47 + (((tickAnim - 5) / 2) * (0-(0.47)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0.7-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 19) / 6) * (0.9-(0.7)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 17.75 + (((tickAnim - 0) / 19) * (7-(17.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 7 + (((tickAnim - 19) / 4) * (-1.07469-(7)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.40262-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (2.4123-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -1.07469 + (((tickAnim - 23) / 2) * (20.5-(-1.07469)));
            yy = 0.40262 + (((tickAnim - 23) / 2) * (0-(0.40262)));
            zz = 2.4123 + (((tickAnim - 23) / 2) * (0-(2.4123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 7) * (0.08-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 7) / 12) * (0-(0)));
            yy = 0.08 + (((tickAnim - 7) / 12) * (0-(0.08)));
            zz = 0 + (((tickAnim - 7) / 12) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (2.55-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 2.55 + (((tickAnim - 23) / 2) * (-0.675-(2.55)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 0) / 13) * (-13.25-(9.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -13.25 + (((tickAnim - 13) / 6) * (-4.5-(-13.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -4.5 + (((tickAnim - 19) / 4) * (18.63-(-4.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 18.63 + (((tickAnim - 23) / 1) * (-2.3-(18.63)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -2.3 + (((tickAnim - 24) / 1) * (3.75-(-2.3)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 7) * (2.9-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 2.9 + (((tickAnim - 7) / 3) * (2.28-(2.9)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 2.28 + (((tickAnim - 10) / 3) * (2.425-(2.28)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 2.425 + (((tickAnim - 13) / 12) * (-0.225-(2.425)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*0.25), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-85))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.75-125))*0.469);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.75-120))*0.4);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-180))*-3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.04+68))*1.3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+150))*1.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*-0.45), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+130))*1.4));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(3.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(-2.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*0.5), neck6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*0.1), neck6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-160))*-1));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(-4-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*0.5), neck8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*0.1), neck8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-160))*-1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*-0.25), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-85))*-0.5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05))*0.3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25))*2), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*-0.3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-85))*1.5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*1.3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*1.8), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-130))*3), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*2), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-140))*4), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-140))*-3));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-95))*5), tail7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*5), tail7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*-4));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(-1.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*0.5), neck7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*0), neck7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-160))*-0.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*-1), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*0.1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-160))*-1.0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-90))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3.25 + (((tickAnim - 0) / 6) * (14.5-(3.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 14.5 + (((tickAnim - 6) / 4) * (-6.76678-(14.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.0128-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0.99992-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -6.76678 + (((tickAnim - 10) / 3) * (-28-(-6.76678)));
            yy = -0.0128 + (((tickAnim - 10) / 3) * (0-(-0.0128)));
            zz = 0.99992 + (((tickAnim - 10) / 3) * (0-(0.99992)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -28 + (((tickAnim - 13) / 12) * (3.25-(-28)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.075 + (((tickAnim - 0) / 6) * (-0.025-(1.075)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.025 + (((tickAnim - 6) / 7) * (0.75-(-0.025)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 13) / 1) * (0.3-(0.75)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 14) / 2) * (1.55-(0.3)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.55 + (((tickAnim - 16) / 2) * (0.3-(1.55)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 1) * (0.75-(0.3)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.75 + (((tickAnim - 19) / 6) * (1.075-(0.75)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 13.25 + (((tickAnim - 0) / 7) * (7-(13.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 7 + (((tickAnim - 7) / 2) * (-1.07469-(7)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.40262-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-2.41229-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -1.07469 + (((tickAnim - 9) / 4) * (20.5-(-1.07469)));
            yy = 0.40262 + (((tickAnim - 9) / 4) * (0-(0.40262)));
            zz = -2.41229 + (((tickAnim - 9) / 4) * (0-(-2.41229)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 20.5 + (((tickAnim - 13) / 12) * (13.25-(20.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (2.55-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 2.55 + (((tickAnim - 9) / 4) * (-0.675-(2.55)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.675 + (((tickAnim - 13) / 2) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -14.25 + (((tickAnim - 0) / 7) * (-10.46-(-14.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -10.46 + (((tickAnim - 7) / 2) * (17.38-(-10.46)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 17.38 + (((tickAnim - 9) / 3) * (-1.05-(17.38)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -1.05 + (((tickAnim - 12) / 1) * (3.75-(-1.05)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.75 + (((tickAnim - 13) / 7) * (-7.38-(3.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -7.38 + (((tickAnim - 20) / 5) * (-14.25-(-7.38)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 1.525 + (((tickAnim - 0) / 13) * (-0.27-(1.525)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.27 + (((tickAnim - 13) / 7) * (1.36-(-0.27)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.36 + (((tickAnim - 20) / 5) * (1.525-(1.36)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.25 + (((tickAnim - 0) / 5) * (-4.05359-(17.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.86025-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.73461-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.05359 + (((tickAnim - 5) / 2) * (-10.25-(-4.05359)));
            yy = 1.86025 + (((tickAnim - 5) / 2) * (0-(1.86025)));
            zz = -0.73461 + (((tickAnim - 5) / 2) * (0-(-0.73461)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -10.25 + (((tickAnim - 7) / 18) * (17.25-(-10.25)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 5) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 12) / 1) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.25 + (((tickAnim - 0) / 5) * (-9.81-(14.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -9.81 + (((tickAnim - 5) / 2) * (-12.5-(-9.81)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -12.5 + (((tickAnim - 7) / 10) * (6.64-(-12.5)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 6.64 + (((tickAnim - 17) / 8) * (14.25-(6.64)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 5) * (4.445-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.04-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 4.445 + (((tickAnim - 5) / 2) * (-1.8-(4.445)));
            zz = -1.04 + (((tickAnim - 5) / 2) * (0-(-1.04)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = -1.8 + (((tickAnim - 7) / 10) * (-1.52-(-1.8)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -1.52 + (((tickAnim - 17) / 8) * (-1.15-(-1.52)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.25 + (((tickAnim - 0) / 3) * (22.82-(10.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22.82 + (((tickAnim - 3) / 2) * (1.68-(22.82)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1.68 + (((tickAnim - 5) / 2) * (21.75-(1.68)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 21.75 + (((tickAnim - 7) / 10) * (-7.06-(21.75)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -7.06 + (((tickAnim - 17) / 8) * (10.25-(-7.06)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.17-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.11-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 1.17 + (((tickAnim - 7) / 10) * (0.725-(1.17)));
            zz = 0.11 + (((tickAnim - 7) / 10) * (0.25-(0.11)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.725 + (((tickAnim - 17) / 8) * (0-(0.725)));
            zz = 0.25 + (((tickAnim - 17) / 8) * (0-(0.25)));
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
            xx = -32.77116 + (((tickAnim - 0) / 5) * (8.51597-(-32.77116)));
            yy = -10.0264 + (((tickAnim - 0) / 5) * (-5.93432-(-10.0264)));
            zz = 4.32692 + (((tickAnim - 0) / 5) * (-0.88692-(4.32692)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.51597 + (((tickAnim - 5) / 3) * (0-(8.51597)));
            yy = -5.93432 + (((tickAnim - 5) / 3) * (-6.75-(-5.93432)));
            zz = -0.88692 + (((tickAnim - 5) / 3) * (0-(-0.88692)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -6.75 + (((tickAnim - 8) / 5) * (-8-(-6.75)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -8 + (((tickAnim - 13) / 4) * (-8-(-8)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (-32.77116-(0)));
            yy = -8 + (((tickAnim - 17) / 8) * (-10.0264-(-8)));
            zz = 0 + (((tickAnim - 17) / 8) * (4.32692-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 5) * (-0.275-(1.3)));
            zz = -2.225 + (((tickAnim - 0) / 5) * (0.5-(-2.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 3) * (0-(-0.275)));
            zz = 0.5 + (((tickAnim - 5) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.67-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.11 + (((tickAnim - 13) / 4) * (-0.11-(-0.11)));
            zz = -0.67 + (((tickAnim - 13) / 4) * (-0.545-(-0.67)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -0.11 + (((tickAnim - 17) / 8) * (1.3-(-0.11)));
            zz = -0.545 + (((tickAnim - 17) / 8) * (-2.225-(-0.545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(9), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));



    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGiraffatitan e = (EntityPrehistoricFloraGiraffatitan) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
