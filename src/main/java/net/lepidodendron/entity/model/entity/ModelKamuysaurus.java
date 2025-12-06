package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKamuysaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKamuysaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer opposablePinkie2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer opposablePinkie3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer nasalSac;
    private final AdvancedModelRenderer nasalSac2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelKamuysaurus() {
        this.textureWidth = 150;
        this.textureHeight = 150;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -14.1385F, 1.6637F);
        this.setRotateAngle(hips, 0.1658F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 90, -3.5F, -5.993F, -8.627F, 7, 6, 11, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 132, 106, 0.0F, -6.993F, -5.877F, 0, 1, 7, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -6.0F, -2.168F, -8.727F, 12, 19, 20, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.668F, 4.523F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 130, 0.0F, 0.0F, -2.0F, 0, 1, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 98, 0, -3.0F, 1.0F, -2.0F, 6, 6, 10, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(5.5F, 2.682F, 0.773F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4887F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 64, 0, -3.25F, -1.8181F, -3.2897F, 6, 21, 11, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 17.5051F, 1.898F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0908F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 98, 32, -2.3F, -2.8215F, -3.4244F, 4, 19, 7, 0.01F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 15.1012F, 0.7146F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0908F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 40, 72, -2.3F, -0.6792F, -1.455F, 4, 8, 3, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 7.2738F, 0.0949F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3229F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 18, 130, -3.0F, -0.7696F, -2.3933F, 6, 2, 3, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.5967F, -2.3348F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 130, 20, -3.0F, -1.4F, -2.6F, 6, 2, 3, -0.003F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.5F, 2.682F, 0.773F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4887F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 64, 0, -2.75F, -1.8181F, -3.2897F, 6, 21, 11, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 17.5051F, 1.898F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0908F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 98, 32, -1.7F, -2.8215F, -3.4244F, 4, 19, 7, 0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 15.1012F, 0.7146F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0908F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 40, 72, -1.7F, -0.6792F, -1.455F, 4, 8, 3, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 7.2738F, 0.0949F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3229F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 18, 130, -3.0F, -0.7696F, -2.3933F, 6, 2, 3, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.5967F, -2.3348F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 130, 20, -3.0F, -1.4F, -2.6F, 6, 2, 3, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.694F, -4.2634F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0175F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.4F, 0.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0611F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 140, 0.0F, -2.0F, -8.0F, 0, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.4F, 0.25F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0611F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 83, -4.0F, -2.0F, -9.0F, 8, 5, 6, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.5F, -5.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 136, 138, 0.0F, -3.0F, -8.0F, 0, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 107, -4.0F, -2.0F, -9.0F, 8, 5, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.75F, -5.75F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 39, -7.0F, -2.0F, -9.0F, 14, 19, 14, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.8127F, -14.7881F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, 9.25F, -7.65F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 126, 138, -2.0F, -8.85F, 5.0F, 0, 1, 5, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 118, -5.0F, -8.0F, 4.0F, 6, 5, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 5.65F, -3.15F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 142, 32, -1.0F, -9.0F, 3.75F, 0, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 120, 32, -4.5F, -8.0F, 3.0F, 7, 8, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 10.8F, -6.25F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 105, -5.0F, -9.0F, -2.0F, 10, 9, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 9.3F, -3.25F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 72, -5.0F, -8.0F, -2.0F, 11, 9, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 13.25F, -3.8F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 86, -4.0F, -6.0F, -5.0F, 9, 6, 10, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-5.8258F, 10.4192F, -5.3054F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.4309F, -0.0255F, 0.076F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 112, 129, -1.5263F, -1.7876F, -1.6246F, 3, 11, 4, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3068F, 8.0901F, 1.5259F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3686F, -0.9908F, 1.0802F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 130, 0, -0.9091F, 0.3921F, -1.8717F, 2, 11, 3, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.1197F, 10.6878F, -0.6494F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2109F, -0.3983F, -0.157F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 28, 107, -0.3233F, 0.049F, -1.0433F, 1, 7, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(11.4616F, 9.1729F, 10.4465F);
        this.rightArm3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3054F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 106, 83, -12.0848F, 0.8221F, -11.4975F, 1, 1, 2, 0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.1767F, 0.049F, -0.5433F);
        this.rightArm3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1222F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 90, -0.5F, 0.0F, -0.5F, 1, 5, 1, -0.006F, false));

        this.opposablePinkie2 = new AdvancedModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.1322F, 0.1729F, 0.6955F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.1222F, 0.0F, 0.0F);
        this.opposablePinkie2.cubeList.add(new ModelBox(opposablePinkie2, 36, 96, -0.4055F, 0.0179F, -0.5517F, 1, 4, 1, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(5.8258F, 10.4192F, -5.3054F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.4309F, 0.0255F, -0.076F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 112, 129, -1.4737F, -1.7876F, -1.6246F, 3, 11, 4, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3068F, 8.0901F, 1.5259F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3686F, 0.9908F, -1.0802F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 130, 0, -1.0909F, 0.3921F, -1.8717F, 2, 11, 3, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.1197F, 10.6878F, -0.6494F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2109F, 0.3983F, 0.157F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 28, 107, -0.6767F, 0.049F, -1.0433F, 1, 7, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-11.4616F, 9.1729F, 10.4465F);
        this.leftArm3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 106, 83, 11.0848F, 0.8221F, -11.4975F, 1, 1, 2, 0.02F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.1767F, 0.049F, -0.5433F);
        this.leftArm3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1222F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 90, -0.5F, 0.0F, -0.5F, 1, 5, 1, -0.006F, true));

        this.opposablePinkie3 = new AdvancedModelRenderer(this);
        this.opposablePinkie3.setRotationPoint(-0.1322F, 0.1729F, 0.6955F);
        this.leftArm3.addChild(opposablePinkie3);
        this.setRotateAngle(opposablePinkie3, 0.1222F, 0.0F, 0.0F);
        this.opposablePinkie3.cubeList.add(new ModelBox(opposablePinkie3, 36, 96, -0.5945F, 0.0179F, -0.5517F, 1, 4, 1, 0.0F, true));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 5.966F, -6.8882F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.0087F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, -0.6465F, -0.5446F);
        this.neck4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 141, -1.0F, -5.75F, -1.75F, 0, 1, 3, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 32, -4.0F, -5.0F, -1.75F, 6, 3, 4, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.0035F, -1.7946F);
        this.neck4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 106, 116, -4.0F, -5.0F, -2.0F, 8, 8, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.5772F, -1.8376F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.1745F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -2.3F, -5.25F);
        this.neck3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 101, -1.0F, -5.75F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 126, 129, -3.5F, -5.0F, 0.0F, 5, 4, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -0.45F, -5.6F);
        this.neck3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 119, -4.0F, -5.0F, -1.0F, 7, 6, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.4F, -4.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.5236F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -4.0013F, -2.0488F);
        this.neck2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 83, 1.0F, -1.7F, -0.9F, 0, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 84, 32, -1.0F, -1.0F, -1.0F, 4, 3, 3, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.4737F, -1.8988F);
        this.neck2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 129, -3.0F, -5.0F, -3.0F, 6, 6, 5, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.9991F, -2.6096F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -8.1694F, -0.7822F);
        this.neck.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 141, 0.0F, 4.25F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -6.1694F, -0.7822F);
        this.neck.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 98, 58, -2.0F, 3.0F, -3.4F, 4, 2, 5, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -0.6944F, -1.2822F);
        this.neck.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 92, 129, -3.0F, -1.0F, -4.0F, 5, 5, 5, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.8201F, -4.2787F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 130, 25, -2.5F, -0.5292F, -2.4316F, 5, 4, 3, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 50, 141, -1.5F, 0.4708F, -5.9316F, 3, 3, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 132, 114, -2.0F, 0.4708F, -4.9316F, 4, 3, 3, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.5292F, -9.5066F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.5621F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 94, 83, -2.5F, -1.625F, -6.525F, 5, 2, 1, 0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.2792F, -9.5066F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.5621F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 40, 83, -2.5F, -0.725F, -6.525F, 5, 2, 1, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0387F, 3.3817F, -5.5712F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0344F, 0.1212F, 0.0143F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 18, 140, 0.0F, -0.5F, -1.3F, 0, 1, 4, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.225F, 1.7708F, -5.4316F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.5367F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 140, 6, 1.5F, 0.55F, -4.225F, 0, 2, 4, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 140, 1.525F, 0.55F, -4.225F, 0, 2, 4, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 140, -1.075F, 0.55F, -4.225F, 0, 2, 4, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 140, 6, -1.05F, 0.55F, -4.225F, 0, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0387F, 3.3817F, -5.5712F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0344F, -0.1212F, -0.0143F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 140, 0.0F, -0.5F, -1.3F, 0, 1, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.2042F, -9.3066F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.3875F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 64, 116, -2.5F, -0.725F, -6.525F, 5, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 2.9458F, -3.6566F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1222F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 132, -1.5F, 0.275F, -6.675F, 2, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -0.0542F, -5.6566F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.7767F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 42, 141, -1.5F, -0.725F, -6.675F, 2, 2, 2, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.7708F, -5.4316F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4931F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 130, 94, -1.5F, 0.3F, -4.975F, 3, 1, 5, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.3708F, -5.4316F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.6676F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 116, 58, -0.5F, -0.7F, -4.675F, 1, 2, 4, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.4708F, -5.4316F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5585F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 140, -0.5F, -0.725F, -1.525F, 2, 3, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 36, 130, -1.5F, -0.725F, 0.475F, 4, 3, 2, -0.01F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 34, 141, -1.0F, -0.725F, -0.525F, 3, 3, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0F, 3.4708F, 1.4684F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2182F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 18, 135, -3.5F, -4.05F, -1.0F, 5, 4, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -0.0292F, -0.4316F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1745F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 48, 119, -2.0F, -2.0F, -3.0F, 4, 3, 4, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-1.025F, 1.4708F, -3.0816F);
        this.head.addChild(righteye);
        this.righteye.cubeList.add(new ModelBox(righteye, 28, 116, -1.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(1.025F, 1.4708F, -3.0816F);
        this.head.addChild(lefteye);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 28, 116, 0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.nasalSac = new AdvancedModelRenderer(this);
        this.nasalSac.setRotationPoint(-1.3F, 4.0708F, -8.6316F);
        this.head.addChild(nasalSac);
        this.setRotateAngle(nasalSac, 0.5503F, -0.2967F, 0.4868F);
        this.nasalSac.cubeList.add(new ModelBox(nasalSac, 30, 135, -0.2248F, -1.7873F, 0.0013F, 1, 2, 4, -0.01F, false));

        this.nasalSac2 = new AdvancedModelRenderer(this);
        this.nasalSac2.setRotationPoint(1.3F, 4.0708F, -8.6316F);
        this.head.addChild(nasalSac2);
        this.setRotateAngle(nasalSac2, 0.5503F, 0.2967F, -0.4868F);
        this.nasalSac2.cubeList.add(new ModelBox(nasalSac2, 30, 135, -0.7752F, -1.7873F, 0.0013F, 1, 2, 4, -0.01F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.8006F, 0.6661F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 130, 14, -2.5F, -0.3488F, -3.1624F, 5, 2, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 132, 120, -2.0F, -2.3488F, -2.6624F, 4, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 133, 101, -2.0F, -0.3488F, -5.6124F, 4, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 135, 107, -1.5F, -0.3488F, -6.6124F, 3, 2, 1, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.1F, 3.6512F, -11.1624F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0873F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 132, 125, -1.4F, -2.05F, -0.225F, 3, 1, 3, 0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.1F, 3.4262F, -9.9624F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2618F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 48, 126, -1.4F, -2.0F, -0.5F, 3, 1, 2, -0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.6F, -0.6323F, -5.4659F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0785F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 70, 140, -0.4F, 0.0287F, -1.8798F, 0, 1, 4, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 70, 140, -2.8F, 0.0287F, -1.8798F, 0, 1, 4, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.15F, 2.7762F, -8.1374F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3927F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 26, 141, 1.375F, -3.0F, 0.25F, 0, 1, 4, 0.0F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 78, 140, 1.4F, -3.0F, 0.25F, 0, 1, 4, 0.0F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 26, 141, -1.075F, -3.0F, 0.25F, 0, 1, 4, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 78, 140, -1.1F, -3.0F, 0.25F, 0, 1, 4, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.5F, -0.3488F, -5.5624F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0873F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 140, 0, -0.125F, -2.0F, -1.0F, 0, 2, 4, 0.0F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 40, 135, -0.1F, -2.0F, -1.0F, 0, 2, 4, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.1F, 2.7762F, -8.1374F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.48F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 64, 111, -1.4F, -2.0F, -0.2F, 3, 2, 3, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.5F, -0.3488F, -5.5624F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.0873F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 140, 0, 0.125F, -2.0F, -1.0F, 0, 2, 4, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 40, 135, 0.1F, -2.0F, -1.0F, 0, 2, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8886F, 7.3385F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 56, 39, -4.0F, -2.2901F, 2.9202F, 8, 13, 13, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0F, -0.9901F, 20.1702F);
        this.tail.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.2182F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 102, 139, -1.0F, -2.85F, -10.0F, 0, 1, 5, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 120, 44, -3.0F, -2.0F, -11.0F, 4, 5, 7, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -3.1401F, 13.6702F);
        this.tail.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0436F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 92, 139, 0.0F, -3.0F, -9.0F, 0, 1, 5, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, -3.1401F, 13.9202F);
        this.tail.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0436F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 118, -2.0F, -2.0F, -11.0F, 5, 5, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2099F, 14.9202F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 56, 65, -3.0F, -1.0F, -0.5F, 6, 8, 13, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.0F, -0.925F, 1.25F);
        this.tail2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1309F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 126, 56, -1.0F, -3.75F, 0.0F, 0, 1, 11, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 76, 102, -2.5F, -3.0F, -1.0F, 3, 4, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.096F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 40, 86, -2.0F, -0.6F, -2.0F, 4, 5, 14, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.0F, 2.15F, 10.0F);
        this.tail3.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0436F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 126, 68, 1.0F, -4.6F, -9.75F, 0, 1, 11, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 98, 16, 0.0F, -4.0F, -12.0F, 2, 2, 14, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0397F, 12.0011F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 94, 65, -1.0F, -1.6397F, -1.0011F, 2, 4, 14, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 129, 0.0F, -2.1397F, 0.7489F, 0, 1, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0052F, 14.0608F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 106, 102, -0.5F, -1.25F, -2.0F, 1, 2, 12, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 88, 118, 0.0F, -1.75F, -1.2F, 0, 1, 9, 0.0F, false));

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
        this.hips.offsetY = 0.7F;
        this.hips.offsetX = -0.2F;
        this.hips.offsetZ = 1.2F;
        this.hips.rotateAngleY = (float)Math.toRadians(125);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.47F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        //this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);

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

        EntityPrehistoricFloraKamuysaurus walker = (EntityPrehistoricFloraKamuysaurus) e;

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
        EntityPrehistoricFloraKamuysaurus ee = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;

        if ((!ee.isQuad() && ee.getAnimation() != ee.TOBI_ANIMATION) || ee.getAnimation() == ee.TOQUAD_ANIMATION) {
            //Bipedal Pose

            //And now the pose:
            this.setRotateAngle(body, 0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3054F);
            this.setRotateAngle(cube_r12, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
            this.setRotateAngle(cube_r14, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0611F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r24, 1.5621F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r25, 1.5621F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r26, 0.0344F, 0.1212F, 0.0143F);
            this.setRotateAngle(cube_r27, 0.5367F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r28, 0.0344F, -0.1212F, -0.0143F);
            this.setRotateAngle(cube_r29, 1.3875F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.0611F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r30, 0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r31, 0.7767F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r32, 0.4931F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r33, 0.6676F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r34, 0.5585F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r35, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r36, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r37, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r38, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r39, 0.0785F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r40, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r41, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(cube_r42, 0.48F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r43, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(cube_r44, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r45, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r46, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r47, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r48, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(hips, -0.0092F, 0.0F, -0.0208F);
            this.setRotateAngle(leftArm, 0.684F, 0.0255F, -0.076F);
            this.setRotateAngle(leftArm2, -1.4547F, 0.3175F, -1.2137F);
            this.setRotateAngle(leftArm3, 0.1193F, 0.1598F, 0.8815F);
            this.setRotateAngle(leftLeg, -0.3185F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg2, 1.0908F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg3, -1.0908F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg4, 0.3229F, 0.0F, 0.0F);
            this.setRotateAngle(nasalSac, 0.5503F, -0.2967F, 0.4868F);
            this.setRotateAngle(nasalSac2, 0.5503F, 0.2967F, -0.4868F);
            this.setRotateAngle(neck, 0.0785F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(neck4, 0.0087F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie2, 0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie3, 0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm, 0.684F, -0.0255F, 0.076F);
            this.setRotateAngle(rightArm2, -1.5044F, -0.2951F, 1.1581F);
            this.setRotateAngle(rightArm3, 0.2503F, -0.1328F, -0.9418F);
            this.setRotateAngle(rightLeg, -0.3272F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg2, 1.0908F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg3, -1.0908F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg4, 0.3229F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, -0.096F, 0.0F, 0.0F);




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
        EntityPrehistoricFloraKamuysaurus entity = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 10) / 10) * (0-(7)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 10) / 10) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.925 + (((tickAnim - 10) / 10) * (0-(0.925)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 10) / 10) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.925 + (((tickAnim - 10) / 10) * (0-(0.925)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.25 + (((tickAnim - 10) / 10) * (0-(7.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.5 + (((tickAnim - 10) / 10) * (0-(13.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.5 + (((tickAnim - 10) / 10) * (0-(18.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (31.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.13 + (((tickAnim - 5) / 5) * (12.75-(31.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.75 + (((tickAnim - 10) / 10) * (0-(12.75)));
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
            yy = 0 + (((tickAnim - 0) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.85-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0.45 + (((tickAnim - 5) / 15) * (0-(0.45)));
            zz = 0.85 + (((tickAnim - 5) / 15) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 5) / 5) * (0-(10)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKamuysaurus entity = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14.75 + (((tickAnim - 20) / 10) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -14.75 + (((tickAnim - 30) / 20) * (0-(-14.75)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-9.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (8.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -9.35 + (((tickAnim - 20) / 10) * (-9.35-(-9.35)));
            zz = 8.975 + (((tickAnim - 20) / 10) * (8.975-(8.975)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -9.35 + (((tickAnim - 30) / 20) * (0-(-9.35)));
            zz = 8.975 + (((tickAnim - 30) / 20) * (0-(8.975)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16 + (((tickAnim - 20) / 10) * (-16-(-16)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 30) / 20) * (0-(-16)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28.73977-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.27125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.93907-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 28.73977 + (((tickAnim - 20) / 10) * (28.73977-(28.73977)));
            yy = -2.27125 + (((tickAnim - 20) / 10) * (-2.27125-(-2.27125)));
            zz = -6.93907 + (((tickAnim - 20) / 10) * (-6.93907-(-6.93907)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 28.73977 + (((tickAnim - 30) / 20) * (0-(28.73977)));
            yy = -2.27125 + (((tickAnim - 30) / 20) * (0-(-2.27125)));
            zz = -6.93907 + (((tickAnim - 30) / 20) * (0-(-6.93907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.375-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.05-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.375 + (((tickAnim - 20) / 10) * (1.375-(1.375)));
            zz = -2.05 + (((tickAnim - 20) / 10) * (-2.05-(-2.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.375 + (((tickAnim - 30) / 20) * (0-(1.375)));
            zz = -2.05 + (((tickAnim - 30) / 20) * (0-(-2.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -36.5 + (((tickAnim - 20) / 10) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -36.5 + (((tickAnim - 30) / 20) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.975 + (((tickAnim - 20) / 10) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.975 + (((tickAnim - 30) / 20) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 37.5 + (((tickAnim - 20) / 10) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 30) / 20) * (0-(37.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.275 + (((tickAnim - 20) / 10) * (1.275-(1.275)));
            zz = -0.2 + (((tickAnim - 20) / 10) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.275 + (((tickAnim - 30) / 20) * (0-(1.275)));
            zz = -0.2 + (((tickAnim - 30) / 20) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16 + (((tickAnim - 20) / 10) * (-16-(-16)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 30) / 20) * (0-(-16)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28.73977-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.27125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.93907-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 28.73977 + (((tickAnim - 20) / 10) * (28.73977-(28.73977)));
            yy = 2.27125 + (((tickAnim - 20) / 10) * (2.27125-(2.27125)));
            zz = 6.93907 + (((tickAnim - 20) / 10) * (6.93907-(6.93907)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 28.73977 + (((tickAnim - 30) / 20) * (0-(28.73977)));
            yy = 2.27125 + (((tickAnim - 30) / 20) * (0-(2.27125)));
            zz = 6.93907 + (((tickAnim - 30) / 20) * (0-(6.93907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.375-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.05-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.375 + (((tickAnim - 20) / 10) * (1.375-(1.375)));
            zz = -2.05 + (((tickAnim - 20) / 10) * (-2.05-(-2.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.375 + (((tickAnim - 30) / 20) * (0-(1.375)));
            zz = -2.05 + (((tickAnim - 30) / 20) * (0-(-2.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -36.25 + (((tickAnim - 20) / 10) * (-36.25-(-36.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -36.25 + (((tickAnim - 30) / 20) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.975 + (((tickAnim - 20) / 10) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.975 + (((tickAnim - 30) / 20) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 37.5 + (((tickAnim - 20) / 10) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 30) / 20) * (0-(37.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.275 + (((tickAnim - 20) / 10) * (1.275-(1.275)));
            zz = -0.2 + (((tickAnim - 20) / 10) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.275 + (((tickAnim - 30) / 20) * (0-(1.275)));
            zz = -0.2 + (((tickAnim - 30) / 20) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.5 + (((tickAnim - 20) / 10) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 30) / 20) * (0-(-1.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.75 + (((tickAnim - 20) / 10) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 30) / 20) * (0-(-3.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17 + (((tickAnim - 20) / 10) * (17-(17)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 30) / 20) * (0-(17)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.39242-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (34.3531-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (4.33505-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.39242 + (((tickAnim - 20) / 10) * (-7.39242-(-7.39242)));
            yy = 34.3531 + (((tickAnim - 20) / 10) * (34.3531-(34.3531)));
            zz = 4.33505 + (((tickAnim - 20) / 10) * (4.33505-(4.33505)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.39242 + (((tickAnim - 30) / 20) * (0-(-7.39242)));
            yy = 34.3531 + (((tickAnim - 30) / 20) * (0-(34.3531)));
            zz = 4.33505 + (((tickAnim - 30) / 20) * (0-(4.33505)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-39.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -39.75 + (((tickAnim - 20) / 10) * (-39.75-(-39.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -39.75 + (((tickAnim - 30) / 20) * (0-(-39.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17 + (((tickAnim - 20) / 10) * (17-(17)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 30) / 20) * (0-(17)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.39242-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-34.3531-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.33505-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.39242 + (((tickAnim - 20) / 10) * (-7.39242-(-7.39242)));
            yy = -34.3531 + (((tickAnim - 20) / 10) * (-34.3531-(-34.3531)));
            zz = -4.33505 + (((tickAnim - 20) / 10) * (-4.33505-(-4.33505)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.39242 + (((tickAnim - 30) / 20) * (0-(-7.39242)));
            yy = -34.3531 + (((tickAnim - 30) / 20) * (0-(-34.3531)));
            zz = -4.33505 + (((tickAnim - 30) / 20) * (0-(-4.33505)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (39.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 39.75 + (((tickAnim - 20) / 10) * (39.75-(39.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 39.75 + (((tickAnim - 30) / 20) * (0-(39.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 20) / 10) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 30) / 20) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.75 + (((tickAnim - 20) / 10) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 30) / 20) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9 + (((tickAnim - 20) / 10) * (9-(9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 30) / 20) * (0-(9)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11.25 + (((tickAnim - 20) / 10) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 30) / 20) * (0-(11.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.5 + (((tickAnim - 20) / 10) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 30) / 20) * (0-(10.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2 + (((tickAnim - 20) / 10) * (-2-(-2)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 30) / 20) * (0-(-2)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 10) / 10) * (-11.5-(-11.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -11.5 + (((tickAnim - 20) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 14) / 6) * (3-(-1.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 20) / 10) * (3-(3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 30) / 7) * (0-(3)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (16.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16.25 + (((tickAnim - 20) / 10) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 16.25 + (((tickAnim - 30) / 7) * (0-(16.25)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 20) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 15 + (((tickAnim - 30) / 7) * (-6.88376-(15)));
            yy = 0 + (((tickAnim - 30) / 7) * (-0.02155-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (-0.00179-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -6.88376 + (((tickAnim - 37) / 6) * (-12.18921-(-6.88376)));
            yy = -0.02155 + (((tickAnim - 37) / 6) * (-0.00699-(-0.02155)));
            zz = -0.00179 + (((tickAnim - 37) / 6) * (-0.00058-(-0.00179)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -12.18921 + (((tickAnim - 43) / 7) * (0-(-12.18921)));
            yy = -0.00699 + (((tickAnim - 43) / 7) * (0-(-0.00699)));
            zz = -0.00058 + (((tickAnim - 43) / 7) * (0-(-0.00058)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKamuysaurus entity = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 20) / 30) * (0-(24.5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19.5 + (((tickAnim - 20) / 10) * (13.25-(-19.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 30) / 20) * (0-(13.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.25 + (((tickAnim - 20) / 10) * (20.42-(27.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20.42 + (((tickAnim - 30) / 10) * (-31.81-(20.42)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -31.81 + (((tickAnim - 40) / 10) * (0-(-31.81)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (53.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 53.5 + (((tickAnim - 20) / 10) * (66.17-(53.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 66.17 + (((tickAnim - 30) / 10) * (82.45-(66.17)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 82.45 + (((tickAnim - 40) / 10) * (0-(82.45)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 1.125 + (((tickAnim - 20) / 20) * (1.87-(1.125)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.55-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1.87 + (((tickAnim - 40) / 10) * (0-(1.87)));
            zz = -0.55 + (((tickAnim - 40) / 10) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-58.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -58.5 + (((tickAnim - 20) / 10) * (9.25-(-58.5)));
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
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(0);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(0);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(0);


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKamuysaurus entity = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -6.25 + (((tickAnim - 20) / 15) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5.75 + (((tickAnim - 20) / 15) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 5.25 + (((tickAnim - 20) / 15) * (0-(5.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 9 + (((tickAnim - 20) / 15) * (-15.75-(9)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -15.75 + (((tickAnim - 35) / 25) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 20) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (3.09-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 3.09 + (((tickAnim - 45) / 8) * (-9-(3.09)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -9 + (((tickAnim - 53) / 7) * (0-(-9)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (2.8825-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.8825 + (((tickAnim - 20) / 15) * (1-(2.8825)));
            yy = 1 + (((tickAnim - 20) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 15) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 35) / 10) * (2.8825-(1)));
            yy = 1 + (((tickAnim - 35) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 10) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 2.8825 + (((tickAnim - 45) / 8) * (1-(2.8825)));
            yy = 1 + (((tickAnim - 45) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 45) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nasalSac.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (2.8825-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.8825 + (((tickAnim - 20) / 15) * (1-(2.8825)));
            yy = 1 + (((tickAnim - 20) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 15) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 35) / 10) * (2.8825-(1)));
            yy = 1 + (((tickAnim - 35) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 10) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 2.8825 + (((tickAnim - 45) / 8) * (1-(2.8825)));
            yy = 1 + (((tickAnim - 45) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 45) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nasalSac2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 9.25 + (((tickAnim - 35) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (9.25-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 9.25 + (((tickAnim - 53) / 7) * (0-(9.25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKamuysaurus entity = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;
        int animCycle = 353;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = 4.75 + (((tickAnim - 60) / 261) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 4.75 + (((tickAnim - 321) / 32) * (0-(4.75)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -5.25 + (((tickAnim - 60) / 261) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -5.25 + (((tickAnim - 321) / 32) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -5.25 + (((tickAnim - 60) / 261) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -5.25 + (((tickAnim - 321) / 32) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = 7 + (((tickAnim - 60) / 261) * (7-(7)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 7 + (((tickAnim - 321) / 32) * (0-(7)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = 5.5 + (((tickAnim - 60) / 261) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 5.5 + (((tickAnim - 321) / 32) * (0-(5.5)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -17 + (((tickAnim - 60) / 261) * (-17-(-17)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -17 + (((tickAnim - 321) / 32) * (0-(-17)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.87027-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (47.61659-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (7.76227-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -5.87027 + (((tickAnim - 60) / 261) * (-5.87027-(-5.87027)));
            yy = 47.61659 + (((tickAnim - 60) / 261) * (47.61659-(47.61659)));
            zz = 7.76227 + (((tickAnim - 60) / 261) * (7.76227-(7.76227)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -5.87027 + (((tickAnim - 321) / 32) * (0-(-5.87027)));
            yy = 47.61659 + (((tickAnim - 321) / 32) * (0-(47.61659)));
            zz = 7.76227 + (((tickAnim - 321) / 32) * (0-(7.76227)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-39.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = -39.25 + (((tickAnim - 60) / 261) * (-39.25-(-39.25)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = -39.25 + (((tickAnim - 321) / 32) * (0-(-39.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-0.43-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (1.235-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = -0.43 + (((tickAnim - 31) / 29) * (-0.25-(-0.43)));
            yy = 1.235 + (((tickAnim - 31) / 29) * (0.6-(1.235)));
            zz = 0 + (((tickAnim - 31) / 29) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -0.25 + (((tickAnim - 60) / 261) * (-0.25-(-0.25)));
            yy = 0.6 + (((tickAnim - 60) / 261) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 338) {
            xx = -0.25 + (((tickAnim - 321) / 17) * (0.28-(-0.25)));
            yy = 0.6 + (((tickAnim - 321) / 17) * (1.35-(0.6)));
            zz = 0 + (((tickAnim - 321) / 17) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 353) {
            xx = 0.28 + (((tickAnim - 338) / 15) * (0-(0.28)));
            yy = 1.35 + (((tickAnim - 338) / 15) * (0-(1.35)));
            zz = 0 + (((tickAnim - 338) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -38.75 + (((tickAnim - 60) / 261) * (-38.75-(-38.75)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -38.75 + (((tickAnim - 321) / 32) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6.45439-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-37.01046-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-5.67008-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -6.45439 + (((tickAnim - 60) / 261) * (-6.45439-(-6.45439)));
            yy = -37.01046 + (((tickAnim - 60) / 261) * (-37.01046-(-37.01046)));
            zz = -5.67008 + (((tickAnim - 60) / 261) * (-5.67008-(-5.67008)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -6.45439 + (((tickAnim - 321) / 32) * (0-(-6.45439)));
            yy = -37.01046 + (((tickAnim - 321) / 32) * (0-(-37.01046)));
            zz = -5.67008 + (((tickAnim - 321) / 32) * (0-(-5.67008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-6.12784-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-4.57706-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (5.70328-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -6.12784 + (((tickAnim - 28) / 32) * (-0.87626-(-6.12784)));
            yy = -4.57706 + (((tickAnim - 28) / 32) * (-15.9203-(-4.57706)));
            zz = 5.70328 + (((tickAnim - 28) / 32) * (53.61725-(5.70328)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -0.87626 + (((tickAnim - 60) / 261) * (-0.87626-(-0.87626)));
            yy = -15.9203 + (((tickAnim - 60) / 261) * (-15.9203-(-15.9203)));
            zz = 53.61725 + (((tickAnim - 60) / 261) * (53.61725-(53.61725)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -0.87626 + (((tickAnim - 321) / 32) * (0-(-0.87626)));
            yy = -15.9203 + (((tickAnim - 321) / 32) * (0-(-15.9203)));
            zz = 53.61725 + (((tickAnim - 321) / 32) * (0-(53.61725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0.27-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.55-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0.27 + (((tickAnim - 28) / 32) * (0.575-(0.27)));
            yy = 1.55 + (((tickAnim - 28) / 32) * (0-(1.55)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = 0.575 + (((tickAnim - 60) / 261) * (0.575-(0.575)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 338) {
            xx = 0.575 + (((tickAnim - 321) / 17) * (0.28-(0.575)));
            yy = 0 + (((tickAnim - 321) / 17) * (1.35-(0)));
            zz = 0 + (((tickAnim - 321) / 17) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 353) {
            xx = 0.28 + (((tickAnim - 338) / 15) * (0-(0.28)));
            yy = 1.35 + (((tickAnim - 338) / 15) * (0-(1.35)));
            zz = 0 + (((tickAnim - 338) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 14.25 + (((tickAnim - 60) / 15) * (10.25-(14.25)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 10.25 + (((tickAnim - 75) / 15) * (8.25-(10.25)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 8.25 + (((tickAnim - 90) / 20) * (14.25-(8.25)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 14.25 + (((tickAnim - 110) / 15) * (10.25-(14.25)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 10.25 + (((tickAnim - 125) / 15) * (8.25-(10.25)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 178) {
            xx = 8.25 + (((tickAnim - 140) / 38) * (-5.5-(8.25)));
            yy = 0 + (((tickAnim - 140) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 38) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 215) {
            xx = -5.5 + (((tickAnim - 178) / 37) * (14.25-(-5.5)));
            yy = 0 + (((tickAnim - 178) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 37) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 14.25 + (((tickAnim - 215) / 15) * (10.25-(14.25)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 10.25 + (((tickAnim - 230) / 15) * (8.25-(10.25)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 265) {
            xx = 8.25 + (((tickAnim - 245) / 20) * (14.25-(8.25)));
            yy = 0 + (((tickAnim - 245) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 20) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 14.25 + (((tickAnim - 265) / 15) * (10.25-(14.25)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = 10.25 + (((tickAnim - 280) / 15) * (8.25-(10.25)));
            yy = 0 + (((tickAnim - 280) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 15) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 321) {
            xx = 8.25 + (((tickAnim - 295) / 26) * (-4-(8.25)));
            yy = 0 + (((tickAnim - 295) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 26) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -4 + (((tickAnim - 321) / 32) * (0-(-4)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.325-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 60) / 15) * (-0.22-(-0.225)));
            zz = 0.325 + (((tickAnim - 60) / 15) * (0.155-(0.325)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = -0.22 + (((tickAnim - 75) / 15) * (-0.145-(-0.22)));
            zz = 0.155 + (((tickAnim - 75) / 15) * (0.16-(0.155)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            yy = -0.145 + (((tickAnim - 90) / 20) * (-0.225-(-0.145)));
            zz = 0.16 + (((tickAnim - 90) / 20) * (0.325-(0.16)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 110) / 15) * (-0.22-(-0.225)));
            zz = 0.325 + (((tickAnim - 110) / 15) * (0.155-(0.325)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = -0.22 + (((tickAnim - 125) / 15) * (-0.145-(-0.22)));
            zz = 0.155 + (((tickAnim - 125) / 15) * (0.16-(0.155)));
        }
        else if (tickAnim >= 140 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 140) / 38) * (0-(0)));
            yy = -0.145 + (((tickAnim - 140) / 38) * (0-(-0.145)));
            zz = 0.16 + (((tickAnim - 140) / 38) * (0-(0.16)));
        }
        else if (tickAnim >= 178 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 178) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 37) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 178) / 37) * (0.325-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 215) / 15) * (-0.22-(-0.225)));
            zz = 0.325 + (((tickAnim - 215) / 15) * (0.155-(0.325)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            yy = -0.22 + (((tickAnim - 230) / 15) * (-0.145-(-0.22)));
            zz = 0.155 + (((tickAnim - 230) / 15) * (0.16-(0.155)));
        }
        else if (tickAnim >= 245 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 245) / 20) * (0-(0)));
            yy = -0.145 + (((tickAnim - 245) / 20) * (-0.225-(-0.145)));
            zz = 0.16 + (((tickAnim - 245) / 20) * (0.325-(0.16)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 265) / 15) * (-0.22-(-0.225)));
            zz = 0.325 + (((tickAnim - 265) / 15) * (0.155-(0.325)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 280) / 15) * (0-(0)));
            yy = -0.22 + (((tickAnim - 280) / 15) * (-0.145-(-0.22)));
            zz = 0.155 + (((tickAnim - 280) / 15) * (0.16-(0.155)));
        }
        else if (tickAnim >= 295 && tickAnim < 321) {
            xx = 0 + (((tickAnim - 295) / 26) * (0-(0)));
            yy = -0.145 + (((tickAnim - 295) / 26) * (0-(-0.145)));
            zz = 0.16 + (((tickAnim - 295) / 26) * (0-(0.16)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 22.25 + (((tickAnim - 60) / 15) * (19-(22.25)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 19 + (((tickAnim - 75) / 15) * (15.25-(19)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 15.25 + (((tickAnim - 90) / 20) * (22.25-(15.25)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 22.25 + (((tickAnim - 110) / 15) * (19-(22.25)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 19 + (((tickAnim - 125) / 15) * (15.25-(19)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 178) {
            xx = 15.25 + (((tickAnim - 140) / 38) * (0-(15.25)));
            yy = 0 + (((tickAnim - 140) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 38) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 178) / 37) * (22.25-(0)));
            yy = 0 + (((tickAnim - 178) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 37) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 22.25 + (((tickAnim - 215) / 15) * (19-(22.25)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 19 + (((tickAnim - 230) / 15) * (15.25-(19)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 265) {
            xx = 15.25 + (((tickAnim - 245) / 20) * (22.25-(15.25)));
            yy = 0 + (((tickAnim - 245) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 20) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 22.25 + (((tickAnim - 265) / 15) * (19-(22.25)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = 19 + (((tickAnim - 280) / 15) * (15.25-(19)));
            yy = 0 + (((tickAnim - 280) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 15) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 321) {
            xx = 15.25 + (((tickAnim - 295) / 26) * (9.25-(15.25)));
            yy = 0 + (((tickAnim - 295) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 26) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 9.25 + (((tickAnim - 321) / 32) * (0-(9.25)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.625-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 60) / 15) * (0.675-(0.8)));
            zz = 0.625 + (((tickAnim - 60) / 15) * (0.08-(0.625)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 0.675 + (((tickAnim - 75) / 35) * (0.8-(0.675)));
            zz = 0.08 + (((tickAnim - 75) / 35) * (0.625-(0.08)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 110) / 15) * (0.675-(0.8)));
            zz = 0.625 + (((tickAnim - 110) / 15) * (0.08-(0.625)));
        }
        else if (tickAnim >= 125 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 125) / 53) * (0-(0)));
            yy = 0.675 + (((tickAnim - 125) / 53) * (0-(0.675)));
            zz = 0.08 + (((tickAnim - 125) / 53) * (0-(0.08)));
        }
        else if (tickAnim >= 178 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 178) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 37) * (0.8-(0)));
            zz = 0 + (((tickAnim - 178) / 37) * (0.625-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 215) / 15) * (0.675-(0.8)));
            zz = 0.625 + (((tickAnim - 215) / 15) * (0.08-(0.625)));
        }
        else if (tickAnim >= 230 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 230) / 35) * (0-(0)));
            yy = 0.675 + (((tickAnim - 230) / 35) * (0.8-(0.675)));
            zz = 0.08 + (((tickAnim - 230) / 35) * (0.625-(0.08)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 265) / 15) * (0.675-(0.8)));
            zz = 0.625 + (((tickAnim - 265) / 15) * (0.08-(0.625)));
        }
        else if (tickAnim >= 280 && tickAnim < 321) {
            xx = 0 + (((tickAnim - 280) / 41) * (0-(0)));
            yy = 0.675 + (((tickAnim - 280) / 41) * (0.8-(0.675)));
            zz = 0.08 + (((tickAnim - 280) / 41) * (0.625-(0.08)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            yy = 0.8 + (((tickAnim - 321) / 32) * (0-(0.8)));
            zz = 0.625 + (((tickAnim - 321) / 32) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 22.75 + (((tickAnim - 75) / 15) * (16-(22.75)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 125) {
            xx = 16 + (((tickAnim - 90) / 35) * (22.75-(16)));
            yy = 0 + (((tickAnim - 90) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 35) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 22.75 + (((tickAnim - 125) / 15) * (16-(22.75)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 230) {
            xx = 16 + (((tickAnim - 140) / 90) * (22.75-(16)));
            yy = 0 + (((tickAnim - 140) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 90) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 22.75 + (((tickAnim - 230) / 15) * (16-(22.75)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 16 + (((tickAnim - 245) / 35) * (22.75-(16)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = 22.75 + (((tickAnim - 280) / 15) * (16-(22.75)));
            yy = 0 + (((tickAnim - 280) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 15) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 321) {
            xx = 16 + (((tickAnim - 295) / 26) * (10-(16)));
            yy = 0 + (((tickAnim - 295) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 26) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 10 + (((tickAnim - 321) / 32) * (0-(10)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0.15-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 75) / 50) * (0-(0)));
            yy = 0.1 + (((tickAnim - 75) / 50) * (0.1-(0.1)));
            zz = 0.15 + (((tickAnim - 75) / 50) * (0.15-(0.15)));
        }
        else if (tickAnim >= 125 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 125) / 105) * (0-(0)));
            yy = 0.1 + (((tickAnim - 125) / 105) * (0.1-(0.1)));
            zz = 0.15 + (((tickAnim - 125) / 105) * (0.15-(0.15)));
        }
        else if (tickAnim >= 230 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 230) / 50) * (0-(0)));
            yy = 0.1 + (((tickAnim - 230) / 50) * (0.1-(0.1)));
            zz = 0.15 + (((tickAnim - 230) / 50) * (0.15-(0.15)));
        }
        else if (tickAnim >= 280 && tickAnim < 353) {
            xx = 0 + (((tickAnim - 280) / 73) * (0-(0)));
            yy = 0.1 + (((tickAnim - 280) / 73) * (0-(0.1)));
            zz = 0.15 + (((tickAnim - 280) / 73) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 6.75 + (((tickAnim - 75) / 15) * (9.25-(6.75)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 125) {
            xx = 9.25 + (((tickAnim - 90) / 35) * (6.75-(9.25)));
            yy = 0 + (((tickAnim - 90) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 35) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 6.75 + (((tickAnim - 125) / 15) * (9.25-(6.75)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 178) {
            xx = 9.25 + (((tickAnim - 140) / 38) * (25.25-(9.25)));
            yy = 0 + (((tickAnim - 140) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 38) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 230) {
            xx = 25.25 + (((tickAnim - 178) / 52) * (6.75-(25.25)));
            yy = 0 + (((tickAnim - 178) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 52) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 6.75 + (((tickAnim - 230) / 15) * (9.25-(6.75)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 9.25 + (((tickAnim - 245) / 35) * (6.75-(9.25)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = 6.75 + (((tickAnim - 280) / 15) * (9.25-(6.75)));
            yy = 0 + (((tickAnim - 280) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 15) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 321) {
            xx = 9.25 + (((tickAnim - 295) / 26) * (7-(9.25)));
            yy = 0 + (((tickAnim - 295) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 26) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 7 + (((tickAnim - 321) / 32) * (0-(7)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 140) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 38) * (0.775-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 178) / 117) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 117) * (0-(0)));
            zz = 0.775 + (((tickAnim - 178) / 117) * (0-(0.775)));
        }
        else if (tickAnim >= 295 && tickAnim < 321) {
            xx = 0 + (((tickAnim - 295) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 26) * (0.775-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0.775 + (((tickAnim - 321) / 32) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-22.3-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = -22.3 + (((tickAnim - 68) / 7) * (-14.5-(-22.3)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -14.5 + (((tickAnim - 75) / 15) * (-2.75-(-14.5)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 118) {
            xx = -2.75 + (((tickAnim - 90) / 28) * (-22.3-(-2.75)));
            yy = 0 + (((tickAnim - 90) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 28) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = -22.3 + (((tickAnim - 118) / 7) * (-14.5-(-22.3)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -14.5 + (((tickAnim - 125) / 15) * (-2.75-(-14.5)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 178) {
            xx = -2.75 + (((tickAnim - 140) / 38) * (8.5-(-2.75)));
            yy = 0 + (((tickAnim - 140) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 38) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 223) {
            xx = 8.5 + (((tickAnim - 178) / 45) * (-22.3-(8.5)));
            yy = 0 + (((tickAnim - 178) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 45) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 230) {
            xx = -22.3 + (((tickAnim - 223) / 7) * (-14.5-(-22.3)));
            yy = 0 + (((tickAnim - 223) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 7) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = -14.5 + (((tickAnim - 230) / 15) * (-2.75-(-14.5)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 273) {
            xx = -2.75 + (((tickAnim - 245) / 28) * (-22.3-(-2.75)));
            yy = 0 + (((tickAnim - 245) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 28) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 280) {
            xx = -22.3 + (((tickAnim - 273) / 7) * (-14.5-(-22.3)));
            yy = 0 + (((tickAnim - 273) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 7) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = -14.5 + (((tickAnim - 280) / 15) * (-2.75-(-14.5)));
            yy = 0 + (((tickAnim - 280) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 15) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 321) {
            xx = -2.75 + (((tickAnim - 295) / 26) * (8.5-(-2.75)));
            yy = 0 + (((tickAnim - 295) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 26) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = 8.5 + (((tickAnim - 321) / 32) * (0-(8.5)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (12.75-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 12.75 + (((tickAnim - 68) / 7) * (0-(12.75)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 75) / 8) * (4.75-(0)));
            yy = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 4.75 + (((tickAnim - 83) / 5) * (0-(4.75)));
            yy = 0 + (((tickAnim - 83) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 88) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 22) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (12.75-(0)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 12.75 + (((tickAnim - 118) / 7) * (0-(12.75)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 125) / 8) * (4.75-(0)));
            yy = 0 + (((tickAnim - 125) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 8) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 4.75 + (((tickAnim - 133) / 5) * (0-(4.75)));
            yy = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 5) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 138) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 77) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 215) / 8) * (12.75-(0)));
            yy = 0 + (((tickAnim - 215) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 8) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 230) {
            xx = 12.75 + (((tickAnim - 223) / 7) * (0-(12.75)));
            yy = 0 + (((tickAnim - 223) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 7) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 230) / 8) * (4.75-(0)));
            yy = 0 + (((tickAnim - 230) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 8) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 243) {
            xx = 4.75 + (((tickAnim - 238) / 5) * (0-(4.75)));
            yy = 0 + (((tickAnim - 238) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 5) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 243) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 243) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 22) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 265) / 8) * (12.75-(0)));
            yy = 0 + (((tickAnim - 265) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 8) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 280) {
            xx = 12.75 + (((tickAnim - 273) / 7) * (0-(12.75)));
            yy = 0 + (((tickAnim - 273) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 7) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 280) / 8) * (4.75-(0)));
            yy = 0 + (((tickAnim - 280) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 8) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 293) {
            xx = 4.75 + (((tickAnim - 288) / 5) * (0-(4.75)));
            yy = 0 + (((tickAnim - 288) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 5) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 321) {
            xx = 0 + (((tickAnim - 293) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 60) / 261) * (-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 321) / 32) * (0-(-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5 + (((tickAnim - 60) / 261) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5 + (((tickAnim - 321) / 32) * (0-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*0.5 + (((tickAnim - 60) / 261) * (-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*0.5-(-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*0.5)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*0.5 + (((tickAnim - 321) / 32) * (0-(-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*0.5)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.5 + (((tickAnim - 60) / 261) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.5-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.5)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.5 + (((tickAnim - 321) / 32) * (0-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.5)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 321) {
            xx = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*0.5 + (((tickAnim - 60) / 261) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*0.5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*0.5)));
            yy = 0 + (((tickAnim - 60) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 261) * (0-(0)));
        }
        else if (tickAnim >= 321 && tickAnim < 353) {
            xx = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*0.5 + (((tickAnim - 321) / 32) * (0-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*0.5)));
            yy = 0 + (((tickAnim - 321) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 321) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalkBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKamuysaurus entity = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;
        int animCycle = 54;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5))*0.7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*1.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-10))*0.4);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-80))*-1.0);



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 8.75 + (((tickAnim - 0) / 14) * (22-(8.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 22 + (((tickAnim - 14) / 17) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(22)));
            yy = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 31) / 7) * (-5.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = -5.5 + (((tickAnim - 38) / 16) * (8.75-(-5.5)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -9 + (((tickAnim - 0) / 14) * (-10.35-(-9)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10.35 + (((tickAnim - 14) / 4) * (19.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(-10.35)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 19.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 18) / 13) * (-19.5-(19.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -19.5 + (((tickAnim - 31) / 7) * (-28-(-19.5)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = -28 + (((tickAnim - 38) / 16) * (-9-(-28)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.725 + (((tickAnim - 0) / 14) * (0-(0.725)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 17) * (2.875-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (-0.975-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 2.875 + (((tickAnim - 31) / 7) * (2.125-(2.875)));
            zz = -0.975 + (((tickAnim - 31) / 7) * (-0.825-(-0.975)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            yy = 2.125 + (((tickAnim - 38) / 16) * (0.725-(2.125)));
            zz = -0.825 + (((tickAnim - 38) / 16) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-0.31-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.31 + (((tickAnim - 18) / 5) * (-31.7-(-0.31)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -31.7 + (((tickAnim - 23) / 8) * (-34.5-(-31.7)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -34.5 + (((tickAnim - 31) / 7) * (17.5-(-34.5)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = 17.5 + (((tickAnim - 38) / 16) * (0-(17.5)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 3.75 + (((tickAnim - 0) / 14) * (58.5-(3.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 58.5 + (((tickAnim - 14) / 2) * (58.5-(58.5)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 58.5 + (((tickAnim - 16) / 7) * (89.24-(58.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 89.24 + (((tickAnim - 23) / 8) * (89.5-(89.24)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 89.5 + (((tickAnim - 31) / 7) * (16.5-(89.5)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = 16.5 + (((tickAnim - 38) / 16) * (3.75-(16.5)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.2-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 14) / 2) * (0-(0.6)));
            zz = -0.2 + (((tickAnim - 14) / 2) * (0-(-0.2)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (1.66-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-0.23-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.66 + (((tickAnim - 20) / 3) * (1.325-(1.66)));
            zz = -0.23 + (((tickAnim - 20) / 3) * (-0.375-(-0.23)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 1.325 + (((tickAnim - 23) / 8) * (0-(1.325)));
            zz = -0.375 + (((tickAnim - 23) / 8) * (0-(-0.375)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (1.25-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 1.25 + (((tickAnim - 46) / 8) * (0-(1.25)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -36.5 + (((tickAnim - 14) / 2) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (13.25-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 13.25 + (((tickAnim - 23) / 8) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 13.25 + (((tickAnim - 31) / 7) * (0-(13.25)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 16) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 0) / 7) * (-5.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 36) {
            xx = -5.5 + (((tickAnim - 7) / 29) * (22-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 29) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 54) {
            xx = 22 + (((tickAnim - 36) / 18) * (14.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*15-(22)));
            yy = 0 + (((tickAnim - 36) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -19.5 + (((tickAnim - 0) / 7) * (-28-(-19.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 36) {
            xx = -28 + (((tickAnim - 7) / 29) * (-8-(-28)));
            yy = 0 + (((tickAnim - 7) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 29) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -8 + (((tickAnim - 36) / 4) * (19.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25-(-8)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 19.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25 + (((tickAnim - 40) / 14) * (-19.5-(19.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25)));
            yy = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 2.875 + (((tickAnim - 0) / 7) * (2.125-(2.875)));
            zz = -0.975 + (((tickAnim - 0) / 7) * (-0.825-(-0.975)));
        }
        else if (tickAnim >= 7 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 7) / 29) * (0-(0)));
            yy = 2.125 + (((tickAnim - 7) / 29) * (0-(2.125)));
            zz = -0.825 + (((tickAnim - 7) / 29) * (0-(-0.825)));
        }
        else if (tickAnim >= 36 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 36) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 18) * (2.875-(0)));
            zz = 0 + (((tickAnim - 36) / 18) * (-0.975-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -34.5 + (((tickAnim - 0) / 7) * (7.75-(-34.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 36) {
            xx = 7.75 + (((tickAnim - 7) / 29) * (0-(7.75)));
            yy = 0 + (((tickAnim - 7) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 29) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (-0.31-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -0.31 + (((tickAnim - 40) / 6) * (-31.7-(-0.31)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = -31.7 + (((tickAnim - 46) / 8) * (-34.5-(-31.7)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 89.5 + (((tickAnim - 0) / 7) * (27.25-(89.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 27.25 + (((tickAnim - 7) / 11) * (11.5-(27.25)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 11.5 + (((tickAnim - 18) / 18) * (58.5-(11.5)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 58.5 + (((tickAnim - 36) / 2) * (58.5-(58.5)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 58.5 + (((tickAnim - 38) / 8) * (89.24-(58.5)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 89.24 + (((tickAnim - 46) / 8) * (89.5-(89.24)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (1.05-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 1.05 + (((tickAnim - 18) / 9) * (1.445-(1.05)));
            zz = 0 + (((tickAnim - 18) / 9) * (-0.1-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            yy = 1.445 + (((tickAnim - 27) / 9) * (-0.175-(1.445)));
            zz = -0.1 + (((tickAnim - 27) / 9) * (-0.2-(-0.1)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 36) / 2) * (0-(-0.175)));
            zz = -0.2 + (((tickAnim - 36) / 2) * (0-(-0.2)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (-0.375-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = -0.375 + (((tickAnim - 46) / 8) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 13.25 + (((tickAnim - 0) / 7) * (0-(13.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (-38.21-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -38.21 + (((tickAnim - 27) / 9) * (-36.5-(-38.21)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -36.5 + (((tickAnim - 36) / 2) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (13.25-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 13.25 + (((tickAnim - 46) / 8) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-50))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-70))*-1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-150))*-1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-100))*2));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-150))*-1), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-250))*3), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-250))*-3));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-350))*-3));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-150))*-1), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-250))*-3), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-250))*-3));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-350))*-3));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-200))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-250))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-300))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-350))*-1.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-450))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+100))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-50))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-50))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-100))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+200))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-150))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-150))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+250))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-200))*5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-200))*2));


    }
    public void animWalkQuad(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKamuysaurus entity = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;
        int animCycle = 54;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5))*0.7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*1.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-10))*0.4);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-80))*-0.8);



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 8.75 + (((tickAnim - 0) / 14) * (22-(8.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 22 + (((tickAnim - 14) / 17) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(22)));
            yy = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 31) / 7) * (-5.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = -5.5 + (((tickAnim - 38) / 16) * (8.75-(-5.5)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -9 + (((tickAnim - 0) / 14) * (-10.35-(-9)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10.35 + (((tickAnim - 14) / 4) * (19.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(-10.35)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 19.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 18) / 13) * (-19.5-(19.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -19.5 + (((tickAnim - 31) / 7) * (-28-(-19.5)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = -28 + (((tickAnim - 38) / 16) * (-9-(-28)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.725 + (((tickAnim - 0) / 14) * (0-(0.725)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 17) * (2.875-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (-0.975-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 2.875 + (((tickAnim - 31) / 7) * (2.125-(2.875)));
            zz = -0.975 + (((tickAnim - 31) / 7) * (-0.825-(-0.975)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            yy = 2.125 + (((tickAnim - 38) / 16) * (0.725-(2.125)));
            zz = -0.825 + (((tickAnim - 38) / 16) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-0.31-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.31 + (((tickAnim - 18) / 5) * (-31.7-(-0.31)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -31.7 + (((tickAnim - 23) / 8) * (-34.5-(-31.7)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -34.5 + (((tickAnim - 31) / 7) * (7.75-(-34.5)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = 7.75 + (((tickAnim - 38) / 16) * (0-(7.75)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 3.75 + (((tickAnim - 0) / 14) * (58.5-(3.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 58.5 + (((tickAnim - 14) / 2) * (58.5-(58.5)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 58.5 + (((tickAnim - 16) / 7) * (89.24-(58.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 89.24 + (((tickAnim - 23) / 8) * (89.5-(89.24)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 89.5 + (((tickAnim - 31) / 7) * (27.25-(89.5)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = 27.25 + (((tickAnim - 38) / 16) * (3.75-(27.25)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.2-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 14) / 2) * (0-(-0.175)));
            zz = -0.2 + (((tickAnim - 14) / 2) * (0-(-0.2)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (1.66-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-0.23-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.66 + (((tickAnim - 20) / 3) * (1.325-(1.66)));
            zz = -0.23 + (((tickAnim - 20) / 3) * (-0.375-(-0.23)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 1.325 + (((tickAnim - 23) / 8) * (0-(1.325)));
            zz = -0.375 + (((tickAnim - 23) / 8) * (0-(-0.375)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0.85-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0.85 + (((tickAnim - 46) / 8) * (0-(0.85)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -36.5 + (((tickAnim - 14) / 2) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (13.25-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 13.25 + (((tickAnim - 23) / 8) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 13.25 + (((tickAnim - 31) / 7) * (0-(13.25)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 16) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 0) / 7) * (-5.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 36) {
            xx = -5.5 + (((tickAnim - 7) / 29) * (22-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 29) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 54) {
            xx = 22 + (((tickAnim - 36) / 18) * (14.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*15-(22)));
            yy = 0 + (((tickAnim - 36) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -19.5 + (((tickAnim - 0) / 7) * (-28-(-19.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 36) {
            xx = -28 + (((tickAnim - 7) / 29) * (-8-(-28)));
            yy = 0 + (((tickAnim - 7) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 29) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -8 + (((tickAnim - 36) / 4) * (19.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25-(-8)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 19.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25 + (((tickAnim - 40) / 14) * (-19.5-(19.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25)));
            yy = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 2.875 + (((tickAnim - 0) / 7) * (2.125-(2.875)));
            zz = -0.975 + (((tickAnim - 0) / 7) * (-0.825-(-0.975)));
        }
        else if (tickAnim >= 7 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 7) / 29) * (0-(0)));
            yy = 2.125 + (((tickAnim - 7) / 29) * (0-(2.125)));
            zz = -0.825 + (((tickAnim - 7) / 29) * (0-(-0.825)));
        }
        else if (tickAnim >= 36 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 36) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 18) * (2.875-(0)));
            zz = 0 + (((tickAnim - 36) / 18) * (-0.975-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -34.5 + (((tickAnim - 0) / 7) * (7.75-(-34.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 36) {
            xx = 7.75 + (((tickAnim - 7) / 29) * (0-(7.75)));
            yy = 0 + (((tickAnim - 7) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 29) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (-0.31-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -0.31 + (((tickAnim - 40) / 6) * (-31.7-(-0.31)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = -31.7 + (((tickAnim - 46) / 8) * (-34.5-(-31.7)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 89.5 + (((tickAnim - 0) / 7) * (27.25-(89.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 27.25 + (((tickAnim - 7) / 11) * (11.5-(27.25)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 11.5 + (((tickAnim - 18) / 18) * (58.5-(11.5)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 58.5 + (((tickAnim - 36) / 2) * (58.5-(58.5)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 58.5 + (((tickAnim - 38) / 8) * (89.24-(58.5)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 89.24 + (((tickAnim - 46) / 8) * (89.5-(89.24)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (1.05-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 1.05 + (((tickAnim - 18) / 18) * (-0.175-(1.05)));
            zz = 0 + (((tickAnim - 18) / 18) * (-0.2-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 36) / 2) * (0-(-0.175)));
            zz = -0.2 + (((tickAnim - 36) / 2) * (0-(-0.2)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (-0.375-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = -0.375 + (((tickAnim - 46) / 8) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 13.25 + (((tickAnim - 0) / 7) * (0-(13.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (-38.21-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -38.21 + (((tickAnim - 27) / 9) * (-36.5-(-38.21)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -36.5 + (((tickAnim - 36) / 2) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (13.25-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 13.25 + (((tickAnim - 46) / 8) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-50))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-70))*-1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-150))*-1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-100))*2));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 9.25 + (((tickAnim - 0) / 14) * (-40.5-(9.25)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 54) {
            xx = -40.5 + (((tickAnim - 14) / 40) * (9.25-(-40.5)));
            yy = 0 + (((tickAnim - 14) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.80967 + (((tickAnim - 0) / 7) * (-3.10839-(-0.80967)));
            yy = 3.94315 + (((tickAnim - 0) / 7) * (34.37603-(3.94315)));
            zz = 0.99675 + (((tickAnim - 0) / 7) * (8.37499-(0.99675)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -3.10839 + (((tickAnim - 7) / 7) * (5.52255-(-3.10839)));
            yy = 34.37603 + (((tickAnim - 7) / 7) * (-2.15636-(34.37603)));
            zz = 8.37499 + (((tickAnim - 7) / 7) * (-1.20759-(8.37499)));
        }
        else if (tickAnim >= 14 && tickAnim < 54) {
            xx = 5.52255 + (((tickAnim - 14) / 40) * (-0.80967-(5.52255)));
            yy = -2.15636 + (((tickAnim - 14) / 40) * (3.94315-(-2.15636)));
            zz = -1.20759 + (((tickAnim - 14) / 40) * (0.99675-(-1.20759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 14) * (0-(-0.3)));
            zz = -0.525 + (((tickAnim - 0) / 14) * (0-(-0.525)));
        }
        else if (tickAnim >= 14 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 14) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 40) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 14) / 40) * (-0.525-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = -17 + (((tickAnim - 0) / 7) * (-63.66-(-17)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = -63.66 + (((tickAnim - 7) / 7) * (-26.75-(-63.66)));
        }
        else if (tickAnim >= 14 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 14) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 40) * (0-(0)));
            zz = -26.75 + (((tickAnim - 14) / 40) * (-17-(-26.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.22 + (((tickAnim - 0) / 7) * (-0.425-(-0.22)));
            yy = -0.345 + (((tickAnim - 0) / 7) * (-0.425-(-0.345)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.425 + (((tickAnim - 7) / 7) * (0-(-0.425)));
            yy = -0.425 + (((tickAnim - 7) / 7) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (1.405-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 1.405 + (((tickAnim - 28) / 6) * (0.775-(1.405)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = 0.775 + (((tickAnim - 34) / 12) * (1.195-(0.775)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (-0.22-(0)));
            yy = 1.195 + (((tickAnim - 46) / 8) * (-0.345-(1.195)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = -27.25 + (((tickAnim - 0) / 32) * (9.25-(-27.25)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 9.25 + (((tickAnim - 32) / 14) * (-40.5-(9.25)));
            yy = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 14) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = -40.5 + (((tickAnim - 46) / 8) * (-27.25-(-40.5)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 2.48467 + (((tickAnim - 0) / 32) * (-0.80967-(2.48467)));
            yy = -9.53151 + (((tickAnim - 0) / 32) * (3.94315-(-9.53151)));
            zz = -3.21265 + (((tickAnim - 0) / 32) * (0.99675-(-3.21265)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -0.80967 + (((tickAnim - 32) / 6) * (-3.10839-(-0.80967)));
            yy = 3.94315 + (((tickAnim - 32) / 6) * (-34.37603-(3.94315)));
            zz = 0.99675 + (((tickAnim - 32) / 6) * (8.37499-(0.99675)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -3.10839 + (((tickAnim - 38) / 8) * (5.52255-(-3.10839)));
            yy = -34.37603 + (((tickAnim - 38) / 8) * (-2.15636-(-34.37603)));
            zz = 8.37499 + (((tickAnim - 38) / 8) * (-1.20759-(8.37499)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 5.52255 + (((tickAnim - 46) / 8) * (2.48467-(5.52255)));
            yy = -2.15636 + (((tickAnim - 46) / 8) * (-9.53151-(-2.15636)));
            zz = -1.20759 + (((tickAnim - 46) / 8) * (-3.21265-(-1.20759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (-0.525-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            yy = -0.3 + (((tickAnim - 32) / 14) * (0-(-0.3)));
            zz = -0.525 + (((tickAnim - 32) / 14) * (0-(-0.525)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 33.75 + (((tickAnim - 0) / 14) * (10.26-(33.75)));
        }
        else if (tickAnim >= 14 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 14) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 18) * (0-(0)));
            zz = 10.26 + (((tickAnim - 14) / 18) * (17-(10.26)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 17 + (((tickAnim - 32) / 6) * (63.66-(17)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 63.66 + (((tickAnim - 38) / 8) * (26.75-(63.66)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 26.75 + (((tickAnim - 46) / 8) * (33.75-(26.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 32) {
            xx = -0.1 + (((tickAnim - 14) / 18) * (-0.22-(-0.1)));
            yy = 0.9 + (((tickAnim - 14) / 18) * (-0.345-(0.9)));
            zz = 0 + (((tickAnim - 14) / 18) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -0.22 + (((tickAnim - 32) / 6) * (-0.425-(-0.22)));
            yy = -0.345 + (((tickAnim - 32) / 6) * (-0.425-(-0.345)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -0.425 + (((tickAnim - 38) / 8) * (0-(-0.425)));
            yy = -0.425 + (((tickAnim - 38) / 8) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-200))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-250))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-300))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-350))*-1.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5-450))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+100))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-50))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-50))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-100))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+200))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-150))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-150))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133/0.5+250))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-200))*5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*133-200))*2));


    }
    public void animRunBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKamuysaurus entity = (EntityPrehistoricFloraKamuysaurus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5))*-1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-10))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-80))*-1.5);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -22.25 + (((tickAnim - 0) / 11) * (25.75-(-22.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 25.75 + (((tickAnim - 11) / 11) * (-22.25-(25.75)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -18.25 + (((tickAnim - 0) / 11) * (-0.25-(-18.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.25 + (((tickAnim - 11) / 2) * (18.5-(-0.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.5 + (((tickAnim - 13) / 7) * (-32.4-(18.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -32.4 + (((tickAnim - 20) / 2) * (-18.25-(-32.4)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0.9);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 17 + (((tickAnim - 0) / 11) * (10.75-(17)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 10.75 + (((tickAnim - 11) / 5) * (-22.37-(10.75)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -22.37 + (((tickAnim - 16) / 3) * (-22.37-(-22.37)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -22.37 + (((tickAnim - 19) / 3) * (17-(-22.37)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 16) / 6) * (0-(0.45)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24.5 + (((tickAnim - 0) / 2) * (15.84-(24.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 15.84 + (((tickAnim - 2) / 1) * (7.93-(15.84)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 7.93 + (((tickAnim - 3) / 5) * (52.72-(7.93)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 52.72 + (((tickAnim - 8) / 3) * (60.75-(52.72)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 60.75 + (((tickAnim - 11) / 5) * (76.13-(60.75)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 76.13 + (((tickAnim - 16) / 3) * (64.81-(76.13)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 64.81 + (((tickAnim - 19) / 3) * (24.5-(64.81)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 2) * (0.3-(0.225)));
            zz = 0.35 + (((tickAnim - 0) / 2) * (0.075-(0.35)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 2) / 1) * (0.925-(0.3)));
            zz = 0.075 + (((tickAnim - 2) / 1) * (0-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 3) / 3) * (2.16-(0.925)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.16 + (((tickAnim - 6) / 2) * (1.685-(2.16)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.685 + (((tickAnim - 8) / 3) * (0-(1.685)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (2.55-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (-0.575-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 2.55 + (((tickAnim - 16) / 6) * (-0.45-(2.55)));
            zz = -0.575 + (((tickAnim - 16) / 6) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-70.25-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -70.25 + (((tickAnim - 8) / 3) * (21-(-70.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 21 + (((tickAnim - 11) / 11) * (0-(21)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 25.75 + (((tickAnim - 0) / 11) * (-22.25-(25.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -22.25 + (((tickAnim - 11) / 11) * (25.75-(-22.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.25 + (((tickAnim - 0) / 2) * (21.13-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 21.13 + (((tickAnim - 2) / 6) * (-33.75-(21.13)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -33.75 + (((tickAnim - 8) / 3) * (-18.25-(-33.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -18.25 + (((tickAnim - 11) / 11) * (-0.25-(-18.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 11) * (0-(0.9)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (0.9-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10.75 + (((tickAnim - 0) / 6) * (-22.37-(10.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -22.37 + (((tickAnim - 6) / 2) * (-22.37-(-22.37)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -22.37 + (((tickAnim - 8) / 3) * (17-(-22.37)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 17 + (((tickAnim - 11) / 11) * (10.75-(17)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0.525);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 60.75 + (((tickAnim - 0) / 6) * (76.13-(60.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 76.13 + (((tickAnim - 6) / 2) * (64.81-(76.13)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 64.81 + (((tickAnim - 8) / 3) * (24.5-(64.81)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 24.5 + (((tickAnim - 11) / 3) * (11.26-(24.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 11.26 + (((tickAnim - 14) / 2) * (1.18-(11.26)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 1.18 + (((tickAnim - 16) / 3) * (52.72-(1.18)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 52.72 + (((tickAnim - 19) / 3) * (60.75-(52.72)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.55-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.575-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 2.55 + (((tickAnim - 6) / 5) * (0-(2.55)));
            zz = -0.575 + (((tickAnim - 6) / 5) * (0-(-0.575)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.8-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 14) / 2) * (1.025-(0.8)));
            zz = 0.125 + (((tickAnim - 14) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.025 + (((tickAnim - 16) / 2) * (1.94-(1.025)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 1.94 + (((tickAnim - 18) / 1) * (1.06-(1.94)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.06 + (((tickAnim - 19) / 3) * (0-(1.06)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 21 + (((tickAnim - 0) / 11) * (0-(21)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (-71.5-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -71.5 + (((tickAnim - 19) / 3) * (21-(-71.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = -0.225 + (((tickAnim - 19) / 3) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-50))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-70))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-150))*-3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-100))*2));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-200))*3), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-250))*5), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-350))*-3));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-200))*3), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-250))*-5), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-350))*5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-200))*-2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-250))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-300))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-350))*-1.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-450))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5+100))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-50))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-50))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5+150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-100))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5+200))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-150))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-150))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5+250))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-200))*5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-200))*2));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKamuysaurus e = (EntityPrehistoricFloraKamuysaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.TOQUAD_ANIMATION);
        animator.startKeyframe(e.getToBiTransitionLength()); //move to this keyframe over the right length, this is the UNPOSE

        animator.rotate(body, -((0.0175F)-(0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((-0.5236F)-(-0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3054F)-(0.3054F)));
        animator.rotate(cube_r12, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r14, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((-0.4363F)-(-0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.0611F)-(0.0611F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((-0.3927F)-(-0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((1.5621F)-(1.5621F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r25, -((1.5621F)-(1.5621F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r26, -((0.0344F)-(0.0344F)), -((0.1212F)-(0.1212F)),-((0.0143F)-(0.0143F)));
        animator.rotate(cube_r27, -((0.5367F)-(0.5367F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r28, -((0.0344F)-(0.0344F)), -((-0.1212F)-(-0.1212F)),-((-0.0143F)-(-0.0143F)));
        animator.rotate(cube_r29, -((1.3875F)-(1.3875F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.0611F)-(0.0611F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r30, -((0.1222F)-(0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r31, -((0.7767F)-(0.7767F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r32, -((0.4931F)-(0.4931F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r33, -((0.6676F)-(0.6676F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r34, -((0.5585F)-(0.5585F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r35, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r36, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r37, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r38, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r39, -((0.0785F)-(0.0785F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r40, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r41, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r42, -((0.48F)-(0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r43, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r44, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r45, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r46, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r47, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r48, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.5672F)-(0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.3054F)-(0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((-0.0092F)-(0.1658F)), -((0.0F)-(0.0F)),-((-0.0208F)-(0.0F)));
        animator.rotate(leftArm, -((0.684F)-(0.4309F)), -((0.0255F)-(0.0255F)),-((-0.076F)-(-0.076F)));
        animator.rotate(leftArm2, -((-1.4547F)-(-1.3686F)), -((0.3175F)-(0.9908F)),-((-1.2137F)-(-1.0802F)));
        animator.rotate(leftArm3, -((0.1193F)-(0.2109F)), -((0.1598F)-(0.3983F)),-((0.8815F)-(0.157F)));
        animator.rotate(leftLeg, -((-0.3185F)-(-0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, -((1.0908F)-(1.0908F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, -((-1.0908F)-(-1.0908F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, -((0.3229F)-(0.3229F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(nasalSac, -((0.5503F)-(0.5503F)), -((-0.2967F)-(-0.2967F)),-((0.4868F)-(0.4868F)));
        animator.rotate(nasalSac2, -((0.5503F)-(0.5503F)), -((0.2967F)-(0.2967F)),-((-0.4868F)-(-0.4868F)));
        animator.rotate(neck, -((0.0785F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.5236F)-(-0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck4, -((0.0087F)-(0.0087F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, -((0.1222F)-(0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie3, -((0.1222F)-(0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightArm, -((0.684F)-(0.4309F)), -((-0.0255F)-(-0.0255F)),-((0.076F)-(0.076F)));
        animator.rotate(rightArm2, -((-1.5044F)-(-1.3686F)), -((-0.2951F)-(-0.9908F)),-((1.1581F)-(1.0802F)));
        animator.rotate(rightArm3, -((0.2503F)-(0.2109F)), -((-0.1328F)-(-0.3983F)),-((-0.9418F)-(-0.157F)));
        animator.rotate(rightLeg, -((-0.3272F)-(-0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, -((1.0908F)-(1.0908F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, -((-1.0908F)-(-1.0908F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, -((0.3229F)-(0.3229F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((-0.096F)-(-0.096F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));




        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.TOBI_ANIMATION);
        animator.startKeyframe(e.getToQuadTransitionLength()); //move to this keyframe over the right length, this is the DOPOSE

        animator.rotate(body, ((0.0175F)-(0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((-0.5236F)-(-0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3054F)-(0.3054F)));
        animator.rotate(cube_r12, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r14, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((-0.4363F)-(-0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.0611F)-(0.0611F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((-0.3927F)-(-0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((1.5621F)-(1.5621F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r25, ((1.5621F)-(1.5621F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r26, ((0.0344F)-(0.0344F)), ((0.1212F)-(0.1212F)),((0.0143F)-(0.0143F)));
        animator.rotate(cube_r27, ((0.5367F)-(0.5367F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r28, ((0.0344F)-(0.0344F)), ((-0.1212F)-(-0.1212F)),((-0.0143F)-(-0.0143F)));
        animator.rotate(cube_r29, ((1.3875F)-(1.3875F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.0611F)-(0.0611F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r30, ((0.1222F)-(0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r31, ((0.7767F)-(0.7767F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r32, ((0.4931F)-(0.4931F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r33, ((0.6676F)-(0.6676F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r34, ((0.5585F)-(0.5585F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r35, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r36, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r37, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r38, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r39, ((0.0785F)-(0.0785F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r40, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r41, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r42, ((0.48F)-(0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r43, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r44, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r45, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r46, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r47, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r48, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.5672F)-(0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.3054F)-(0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((-0.0092F)-(0.1658F)), ((0.0F)-(0.0F)),((-0.0208F)-(0.0F)));
        animator.rotate(leftArm, ((0.684F)-(0.4309F)), ((0.0255F)-(0.0255F)),((-0.076F)-(-0.076F)));
        animator.rotate(leftArm2, ((-1.4547F)-(-1.3686F)), ((0.3175F)-(0.9908F)),((-1.2137F)-(-1.0802F)));
        animator.rotate(leftArm3, ((0.1193F)-(0.2109F)), ((0.1598F)-(0.3983F)),((0.8815F)-(0.157F)));
        animator.rotate(leftLeg, ((-0.3185F)-(-0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, ((1.0908F)-(1.0908F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, ((-1.0908F)-(-1.0908F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, ((0.3229F)-(0.3229F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(nasalSac, ((0.5503F)-(0.5503F)), ((-0.2967F)-(-0.2967F)),((0.4868F)-(0.4868F)));
        animator.rotate(nasalSac2, ((0.5503F)-(0.5503F)), ((0.2967F)-(0.2967F)),((-0.4868F)-(-0.4868F)));
        animator.rotate(neck, ((0.0785F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.5236F)-(-0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck4, ((0.0087F)-(0.0087F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, ((0.1222F)-(0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie3, ((0.1222F)-(0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightArm, ((0.684F)-(0.4309F)), ((-0.0255F)-(-0.0255F)),((0.076F)-(0.076F)));
        animator.rotate(rightArm2, ((-1.5044F)-(-1.3686F)), ((-0.2951F)-(-0.9908F)),((1.1581F)-(1.0802F)));
        animator.rotate(rightArm3, ((0.2503F)-(0.2109F)), ((-0.1328F)-(-0.3983F)),((-0.9418F)-(-0.157F)));
        animator.rotate(rightLeg, ((-0.3272F)-(-0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, ((1.0908F)-(1.0908F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, ((-1.0908F)-(-1.0908F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, ((0.3229F)-(0.3229F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((-0.096F)-(-0.096F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));




        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
