package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOuranosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelOuranosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer heads;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer nasalLeft;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer nasalRight;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelOuranosaurus() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -9.675F, 17.0F);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.3F, 11.4F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3316F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 0, -0.5F, -0.1602F, -0.115F, 1, 8, 6, 0.008F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.3F, -4.4F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 69, 72, -1.0F, -0.0485F, -0.0421F, 2, 1, 20, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.4F, -5.0F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 92, -0.5F, -10.0F, 0.2F, 1, 8, 15, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -5.5F, -2.0F, 0.2F, 11, 19, 20, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(6.5F, 1.0F, 0.1F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2705F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.255F, -0.4575F);
        this.leftLeg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 91, 9, -2.5F, -7.0F, -5.0F, 5, 19, 11, 0.003F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 14.5652F, -6.3822F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.021F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 15.7947F, -0.0463F);
        this.leftLeg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 116, -1.9F, -15.735F, -1.5686F, 4, 18, 5, -0.003F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 18.2799F, 2.4066F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.829F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 136, 92, -1.5F, -0.7163F, -3.6585F, 3, 9, 4, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.5F, 8.2694F, -0.847F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1484F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 68, -2.0F, -2.4696F, -4.8933F, 5, 3, 6, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.0347F, -4.993F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 63, 20, -2.0F, -2.4F, -2.9F, 5, 3, 4, -0.003F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.5F, 1.0F, 0.1F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2705F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.255F, -0.4575F);
        this.rightLeg.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 91, 9, -2.5F, -7.0F, -5.0F, 5, 19, 11, 0.003F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 14.5652F, -6.3822F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.021F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 15.7947F, -0.0463F);
        this.rightLeg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 116, -2.1F, -15.735F, -1.5686F, 4, 18, 5, -0.003F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 18.2799F, 2.4066F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.829F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 136, 92, -1.5F, -0.7163F, -3.6585F, 3, 9, 4, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.5F, 8.2694F, -0.847F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1484F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 68, -3.0F, -2.4696F, -4.8933F, 5, 3, 6, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.0347F, -4.993F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 63, 20, -3.0F, -2.4F, -2.9F, 5, 3, 4, -0.003F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 42, 60, -6.0F, -2.5754F, -11.0398F, 12, 20, 11, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -11.0306F, -19.569F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4014F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 83, 0, -1.5F, 6.8112F, -6.0337F, 3, 5, 6, 0.003F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.5F, -0.1888F, -6.0337F, 1, 12, 6, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.4306F, -16.969F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0175F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 134, 47, -1.5F, -0.2618F, -0.0886F, 3, 5, 8, -0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -12.2306F, -11.769F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 118, 125, -0.5F, -0.0615F, -7.9236F, 1, 12, 8, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.5754F, -11.0398F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3316F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 29, -6.5F, -1.8F, -10.0F, 13, 19, 11, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -10.1754F, 0.9602F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1571F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 127, -1.5F, 6.9F, -9.0F, 3, 4, 9, -0.003F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 89, 96, -0.5F, -0.1F, -13.0F, 1, 11, 13, -0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 16.8246F, -0.0398F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 0, -6.0F, -3.4F, -15.0F, 12, 4, 15, -0.007F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.6246F, -20.7398F);
        this.body.addChild(chest);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.2402F, -13.6384F);
        this.chest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.85F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 136, -1.5F, -0.1295F, -9.124F, 3, 9, 4, -0.006F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 97, 125, -0.5F, -0.1295F, -9.124F, 1, 9, 9, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 5.4402F, -12.0383F);
        this.chest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7679F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 113, 0, -1.5F, -0.3856F, 0.1267F, 3, 9, 9, 0.008F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.7598F, -9.8384F);
        this.chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.0647F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 78, 113, -0.5F, -0.0594F, -8.0886F, 1, 14, 8, 0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -10.5598F, -4.0383F);
        this.chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.576F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 66, 136, -1.5F, 6.9687F, -7.0225F, 3, 7, 7, -0.004F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 127, -0.5F, -0.0313F, -7.0225F, 1, 14, 7, 0.012F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 18.1402F, -2.2384F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1047F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 61, 94, -6.0F, -5.8682F, -0.0599F, 12, 6, 8, -0.009F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 4.5403F, -4.4383F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6807F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 40, -6.0F, -0.9145F, -6.9089F, 12, 13, 14, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(5.4F, 15.4402F, -3.1383F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2871F, 0.2302F, -0.133F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5155F, 15.1874F, 11.8638F);
        this.leftArm.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3316F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 40, -0.4581F, -18.7734F, -8.7276F, 2, 10, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.9949F, 8.7659F, 1.684F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6639F, 0.4759F, -0.2443F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 39, 40, -1.6014F, -0.0364F, -1.2918F, 2, 11, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.0583F, 10.7999F, -0.2572F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3228F, 0.2204F, 0.5468F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 46, 92, -0.5184F, 0.004F, -1.0952F, 1, 4, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.0184F, 0.1522F, -1.1149F);
        this.leftArm3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.576F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 96, 0, -0.5F, -0.1301F, -1.9608F, 1, 1, 2, -0.004F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-11.3033F, 10.1279F, 10.8945F);
        this.leftArm3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.3054F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 94, 94, 12.3544F, -3.1239F, -11.9897F, 1, 1, 2, 0.004F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-5.4F, 15.4402F, -3.1383F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.2871F, -0.2302F, 0.133F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5155F, 15.1874F, 11.8638F);
        this.rightArm.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3316F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 40, -1.5419F, -18.7734F, -8.7276F, 2, 10, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.974F, 8.8159F, 1.684F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6639F, -0.4759F, 0.2443F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 39, 40, -0.4195F, -0.0364F, -1.2918F, 2, 11, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0583F, 10.7999F, -0.2572F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3228F, -0.2204F, -0.5468F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 46, 92, -0.5024F, 0.004F, -1.0952F, 1, 4, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.0024F, 0.1522F, -1.1149F);
        this.rightArm3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.576F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 96, 0, -0.5F, -0.1301F, -1.9608F, 1, 1, 2, -0.004F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(11.2825F, 10.1279F, 10.8945F);
        this.rightArm3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3054F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 94, 94, -13.3544F, -3.1239F, -11.9897F, 1, 1, 2, 0.004F, true));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 9.3402F, -7.7384F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 7.3F, -2.0F);
        this.neck4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.192F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 94, 70, -4.0F, -7.996F, -0.0489F, 8, 8, 8, -0.009F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -1.3F, -6.1F);
        this.neck4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.8378F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 76, -1.0F, -0.4127F, 0.0361F, 2, 3, 3, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 3.9F, -4.1F);
        this.neck4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5411F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 113, 40, -4.0F, -4.0F, 0.0F, 8, 8, 6, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.8F, -3.7F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.0436F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -3.8F, -3.9F);
        this.neck3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.192F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 83, -1.0F, -0.4973F, -0.3815F, 2, 3, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.6F, -4.4F);
        this.neck3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1222F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 121, 106, -2.5F, -3.1F, 0.0F, 5, 6, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4F, -3.9F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1309F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -3.9F, -4.3F);
        this.neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2443F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 109, 125, -1.0F, -0.9219F, -0.04F, 2, 2, 5, -0.003F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -3.9F, -4.3F);
        this.neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5934F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 136, 11, -1.5F, -1.022F, -0.04F, 3, 5, 8, -0.003F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.1F, -3.7F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.2618F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 78, -1.0F, 1.2028F, -5.5858F, 2, 2, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -2.9305F, -3.2914F);
        this.neck.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.384F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 66, 109, -1.5F, -0.081F, 0.06F, 3, 5, 4, 0.0F, false));

        this.heads = new AdvancedModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -0.6305F, -3.1414F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, 0.0436F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 6.4872F, -10.8962F);
        this.heads.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.3526F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 23, 76, -1.5F, -0.9192F, 0.0073F, 3, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 7.1872F, -12.8962F);
        this.heads.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1658F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 37, 68, -1.5F, -0.4167F, -0.0756F, 3, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 7.4872F, -12.3962F);
        this.heads.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.7767F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 105, 94, -1.5F, -0.5811F, -0.122F, 3, 1, 2, 0.003F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 6.8286F, -12.9369F);
        this.heads.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.9163F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 94, 87, -1.5F, -0.0228F, 0.0845F, 3, 1, 3, 0.009F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 5.5872F, -12.3962F);
        this.heads.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.3003F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 82, 24, -1.0F, -0.0734F, -1.8529F, 2, 1, 2, 0.009F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.0F, -1.1128F, -6.6962F);
        this.heads.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.096F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 17, 68, -2.0F, -0.0248F, 0.0957F, 2, 1, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.0F, -0.3128F, -6.9962F);
        this.heads.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 1.1606F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 46, 68, -2.0F, -0.0687F, -0.051F, 2, 1, 1, 0.004F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.6F, -0.3128F, -6.9962F);
        this.heads.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.829F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 46, 92, -1.6F, -0.0687F, -8.051F, 2, 1, 8, 0.003F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 2.5872F, -5.7962F);
        this.heads.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1833F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 78, 20, -2.0F, -0.9408F, 0.0493F, 4, 1, 2, -0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.3F, 0.8872F, -6.1962F);
        this.heads.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.7069F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 43, 116, -1.8F, -0.4223F, -6.5617F, 3, 1, 3, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 10, 127, -2.1F, -0.4223F, -3.5617F, 3, 1, 4, 0.008F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 10, 127, -1.5F, -0.4223F, -3.5617F, 3, 1, 4, 0.006F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.3F, 3.9872F, -8.7962F);
        this.heads.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.4102F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 129, 0, -1.5F, -1.0284F, 0.0587F, 3, 1, 4, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 77, 115, -1.38F, -0.1284F, 0.1587F, 0, 1, 4, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 94, 70, -1.2F, -0.7284F, 0.1587F, 0, 1, 3, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 94, 70, 1.8F, -0.7284F, 0.1587F, 0, 1, 3, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 59, 92, -1.4F, -0.1284F, 0.1587F, 0, 1, 4, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 59, 92, 2.0F, -0.1284F, 0.1587F, 0, 1, 4, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 77, 115, 1.98F, -0.1284F, 0.1587F, 0, 1, 4, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 129, 0, -0.9F, -1.0284F, 0.0587F, 3, 1, 4, 0.003F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.5F, 1.8682F, -4.7465F);
        this.heads.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2356F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 0, 0.0F, -0.2F, -1.3F, 0, 1, 2, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 0, 3.0F, -0.2F, -1.3F, 0, 1, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -2.3128F, -1.9962F);
        this.heads.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0087F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 104, -2.0F, -0.0598F, 0.0244F, 4, 4, 2, -0.004F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, -0.9128F, -4.9962F);
        this.heads.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.4451F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 102, 40, -2.0F, 0.0021F, -0.6389F, 4, 1, 4, -0.003F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -0.9128F, -1.9962F);
        this.heads.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.3054F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 102, 0, -2.0F, -1.0F, -3.0F, 4, 4, 4, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 129, 125, -2.0F, -1.0F, -5.0F, 4, 3, 2, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -0.5792F, -3.3343F);
        this.heads.addChild(eye);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.6F, 0.5187F, -0.6999F);
        this.eye.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2531F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 15, 10, 0.45F, -0.7F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 15, 10, -2.65F, -0.7F, -0.5F, 1, 1, 1, 0.0F, true));

        this.nasalLeft = new AdvancedModelRenderer(this);
        this.nasalLeft.setRotationPoint(0.2865F, 3.7802F, -9.2407F);
        this.heads.addChild(nasalLeft);
        this.setRotateAngle(nasalLeft, -0.1454F, 0.4644F, -0.4831F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.4927F, 1.2302F, -1.1464F);
        this.nasalLeft.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.7572F, -0.3775F, 0.3719F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 9, 0, -0.8268F, -0.7F, -1.8F, 1, 1, 4, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 16, 111, -0.2268F, -0.7F, -1.8F, 1, 1, 4, -0.01F, false));

        this.nasalRight = new AdvancedModelRenderer(this);
        this.nasalRight.setRotationPoint(-0.2865F, 3.7802F, -9.2407F);
        this.heads.addChild(nasalRight);
        this.setRotateAngle(nasalRight, -0.1454F, -0.4644F, 0.4831F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.4927F, 1.2302F, -1.1464F);
        this.nasalRight.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.7572F, 0.3775F, -0.3719F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 9, 0, -0.1732F, -0.7F, -1.8F, 1, 1, 4, 0.0F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 16, 111, -0.7732F, -0.7F, -1.8F, 1, 1, 4, -0.01F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0872F, -0.4962F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 0.2564F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 66, -1.0F, 0.6425F, -12.5591F, 2, 1, 2, 0.003F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, -0.2F, -8.1F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2793F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 46, 102, -2.0F, -0.024F, -3.0002F, 3, 1, 3, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.8F, -0.4F, -4.1F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0524F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 15, 13, -0.87F, -1.2336F, -0.0052F, 0, 1, 1, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 78, 60, -0.91F, -1.0336F, -4.0052F, 0, 1, 4, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 16, 104, -0.6F, -0.2336F, -3.9052F, 0, 1, 5, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 16, 104, 2.2F, -0.2336F, -3.9052F, 0, 1, 5, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 78, 60, 2.51F, -1.0336F, -4.0052F, 0, 1, 4, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 9, 0, 2.49F, -1.2336F, -0.0052F, 0, 1, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 15, 13, 2.47F, -1.2336F, -0.0052F, 0, 1, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 97, 121, -0.92F, -1.0336F, -4.0052F, 0, 1, 4, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 111, -1.0F, -0.0336F, -4.0052F, 2, 1, 4, 0.007F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 97, 121, 2.52F, -1.0336F, -4.0052F, 0, 1, 4, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 111, 0.6F, -0.0336F, -4.0052F, 2, 1, 4, 0.003F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.8F, 1.0F, -4.1F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0873F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 64, 127, -1.0F, -1.0283F, -3.8832F, 2, 1, 4, 0.0F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 64, 127, 0.6F, -1.0283F, -3.8832F, 2, 1, 4, -0.004F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5F, 1.6F, -10.9F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1222F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 113, 55, -2.0F, -0.9575F, 0.0409F, 3, 1, 3, -0.005F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.8F, 1.3F, -3.8F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.1745F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 85, -1.8F, -2.2546F, -0.121F, 2, 2, 4, -0.003F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.9F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0175F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 23, 68, -2.9F, -1.1F, -4.1F, 4, 2, 5, -0.005F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.1F, 14.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.192F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 79, -4.0F, -3.4184F, -5.2714F, 8, 11, 13, -0.003F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, -10.8184F, 0.4286F);
        this.tail.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.2967F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 124, 19, -0.5F, 0.1F, -0.1F, 1, 11, 9, -0.005F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.8184F, 7.7286F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0087F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 88, 46, -2.5F, -2.6F, -1.0F, 5, 9, 14, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, -7.2F, 0.9F);
        this.tail2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.2618F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 104, -0.5F, -0.1F, 0.1F, 1, 9, 13, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0262F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 105, 87, -1.5F, -1.6F, -1.0F, 3, 6, 12, -0.003F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, -3.9F, 1.1F);
        this.tail3.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.1222F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 124, 76, -0.5F, 0.1F, -1.0F, 1, 4, 11, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0087F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 49, 109, -1.0F, -1.6F, -1.0F, 2, 5, 12, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.tail4.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.0873F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 119, 58, -0.5F, -0.1F, -1.0F, 1, 2, 12, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 104, 107, -0.5F, -1.6F, -1.1F, 1, 3, 14, -0.003F, false));

        this.nasalLeft.scaleChildren = true;
        this.nasalRight.scaleChildren = true;

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

        EntityPrehistoricFloraOuranosaurus walker = (EntityPrehistoricFloraOuranosaurus) e;

        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck, this.heads};

        walker.tailBuffer.applyChainSwingBuffer(tailFull);

        float speed = 0.2F;

        //Animations:

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 4, heads);

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
        EntityPrehistoricFloraOuranosaurus ee = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;

        if ((!ee.isQuad() && ee.getAnimation() != ee.TOBI_ANIMATION) || ee.getAnimation() == ee.TOQUAD_ANIMATION) {
            //Bipedal Pose

            //And now the pose:
            this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(chest, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, -0.1571F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, 1.85F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, 0.7679F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 1.0647F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, 0.576F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, 0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, 0.6807F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, 0.576F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.3054F);
            this.setRotateAngle(cube_r23, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r24, 0.576F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3054F);
            this.setRotateAngle(cube_r26, -0.192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r27, 0.8378F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r28, 0.5411F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r29, 0.192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r30, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r31, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r32, -0.5934F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r33, -0.384F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r34, 1.3526F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r35, -0.1658F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r36, 0.7767F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r37, 0.9163F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r38, 1.3003F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r39, 0.096F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r40, 1.1606F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r41, 0.829F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r42, 0.1833F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r43, 0.7069F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r44, 0.4102F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r45, 0.2356F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r46, 0.0087F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r47, 0.4451F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r48, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r49, 0.2531F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r50, 0.7572F, -0.3775F, 0.3719F);
            this.setRotateAngle(cube_r51, 0.7572F, 0.3775F, -0.3719F);
            this.setRotateAngle(cube_r52, 0.2793F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r53, 0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r54, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r55, 0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r56, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r57, 0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r58, -0.2967F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r59, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r60, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r61, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.4014F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(heads, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(hips, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, 0.2564F, 0.0F, 0.0F);
            this.setRotateAngle(leftArm, 1.0724F, 0.276F, -0.307F);
            this.setRotateAngle(leftArm2, -1.2839F, 0.5902F, -0.0909F);
            this.setRotateAngle(leftArm3, 0.2294F, 0.3165F, 0.1985F);
            this.setRotateAngle(leftLeg, -0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg2, 1.021F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg4, 0.1484F, 0.0F, 0.0F);
            this.setRotateAngle(nasalLeft, -0.1454F, 0.4644F, -0.4831F);
            this.setRotateAngle(nasalRight, -0.1454F, -0.4644F, 0.4831F);
            this.setRotateAngle(neck, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(neck4, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm, 1.0724F, -0.276F, 0.307F);
            this.setRotateAngle(rightArm2, -1.2839F, -0.5902F, 0.0909F);
            this.setRotateAngle(rightArm3, 0.2294F, -0.3165F, -0.1985F);
            this.setRotateAngle(rightLeg, -0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg2, 1.021F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg4, 0.1484F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.192F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.0087F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.1134F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, 0.096F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);




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
            animBiEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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



    }

    public void animBiEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.75 + (((tickAnim - 8) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 8) / 7) * (0-(2)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.75 + (((tickAnim - 8) / 7) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 17 + (((tickAnim - 8) / 7) * (0-(17)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.05-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 7) * (0-(0.425)));
            zz = 1.05 + (((tickAnim - 8) / 7) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.25 + (((tickAnim - 8) / 7) * (0-(4.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 8) / 2) * (10.5-(6)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10.5 + (((tickAnim - 10) / 5) * (0-(10.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 8) / 2) * (38.58-(35)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 38.58 + (((tickAnim - 10) / 5) * (0-(38.58)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 8.75 + (((tickAnim - 8) / 7) * (0-(8.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(heads, heads.rotateAngleX + (float) Math.toRadians(xx), heads.rotateAngleY + (float) Math.toRadians(yy), heads.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0.425 + (((tickAnim - 8) / 7) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.heads.rotationPointX = this.heads.rotationPointX + (float)(xx);
        this.heads.rotationPointY = this.heads.rotationPointY - (float)(yy);
        this.heads.rotationPointZ = this.heads.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.75 + (((tickAnim - 8) / 7) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -14.25 + (((tickAnim - 5) / 8) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-54.24056-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-8.13508-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-10.92184-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -54.24056 + (((tickAnim - 5) / 3) * (-21.25-(-54.24056)));
            yy = -8.13508 + (((tickAnim - 5) / 3) * (0-(-8.13508)));
            zz = -10.92184 + (((tickAnim - 5) / 3) * (0-(-10.92184)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -21.25 + (((tickAnim - 8) / 5) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.04846-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-27.39017-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-11.83079-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 3.04846 + (((tickAnim - 5) / 3) * (5.0769-(3.04846)));
            yy = -27.39017 + (((tickAnim - 5) / 3) * (-9.00589-(-27.39017)));
            zz = -11.83079 + (((tickAnim - 5) / 3) * (32.18413-(-11.83079)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5.0769 + (((tickAnim - 8) / 5) * (0-(5.0769)));
            yy = -9.00589 + (((tickAnim - 8) / 5) * (0-(-9.00589)));
            zz = 32.18413 + (((tickAnim - 8) / 5) * (0-(32.18413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.35 + (((tickAnim - 5) / 3) * (0-(-0.35)));
            yy = 0.7 + (((tickAnim - 5) / 3) * (0-(0.7)));
            zz = 0.425 + (((tickAnim - 5) / 3) * (0-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-10.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -10.25 + (((tickAnim - 5) / 3) * (47.12-(-10.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 47.12 + (((tickAnim - 8) / 5) * (0-(47.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 5) / 3) * (-4.79-(-4.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -4.79 + (((tickAnim - 8) / 5) * (0-(-4.79)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (-18.14-(-10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -18.14 + (((tickAnim - 8) / 5) * (0-(-18.14)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 5) / 3) * (6.57-(10.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.57 + (((tickAnim - 8) / 5) * (0-(6.57)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 5) / 3) * (25.86-(20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.86 + (((tickAnim - 8) / 5) * (0-(25.86)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(heads, heads.rotateAngleX + (float) Math.toRadians(xx), heads.rotateAngleY + (float) Math.toRadians(yy), heads.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.525-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 5) / 3) * (0.06-(0.1)));
            zz = 0.525 + (((tickAnim - 5) / 3) * (1.015-(0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.06 + (((tickAnim - 8) / 5) * (0-(0.06)));
            zz = 1.015 + (((tickAnim - 8) / 5) * (0-(1.015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.heads.rotationPointX = this.heads.rotationPointX + (float)(xx);
        this.heads.rotationPointY = this.heads.rotationPointY - (float)(yy);
        this.heads.rotationPointZ = this.heads.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-63.09465-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (9.18673-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (8.95204-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -63.09465 + (((tickAnim - 6) / 3) * (-42.13-(-63.09465)));
            yy = 9.18673 + (((tickAnim - 6) / 3) * (0-(9.18673)));
            zz = 8.95204 + (((tickAnim - 6) / 3) * (0-(8.95204)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -42.13 + (((tickAnim - 9) / 4) * (0-(-42.13)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.04846-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (27.3902-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (11.8308-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 2.04846 + (((tickAnim - 6) / 3) * (-10-(2.04846)));
            yy = 27.3902 + (((tickAnim - 6) / 3) * (0-(27.3902)));
            zz = 11.8308 + (((tickAnim - 6) / 3) * (0-(11.8308)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 9) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.425-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -0.35 + (((tickAnim - 6) / 3) * (0-(-0.35)));
            yy = 0.7 + (((tickAnim - 6) / 3) * (0-(0.7)));
            zz = 0.425 + (((tickAnim - 6) / 3) * (0-(0.425)));
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
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (11-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 11 + (((tickAnim - 5) / 3) * (-53.75-(11)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -53.75 + (((tickAnim - 8) / 5) * (0-(-53.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = -23.5 + (((tickAnim - 0) / 15) * (24.75-(-23.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 24.75 + (((tickAnim - 15) / 13) * (-23.5-(24.75)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = -23.5 + (((tickAnim - 28) / 13) * (24.75-(-23.5)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 24.75 + (((tickAnim - 41) / 9) * (-23.5-(24.75)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 0) / 15) * (20.75-(-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 20.75 + (((tickAnim - 15) / 13) * (-5-(20.75)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = -5 + (((tickAnim - 28) / 13) * (20.75-(-5)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 41) / 9) * (-5-(20.75)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 21.5 + (((tickAnim - 0) / 15) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 21.5 + (((tickAnim - 15) / 4) * (-40-(21.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -40 + (((tickAnim - 19) / 5) * (-37.1-(-40)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -37.1 + (((tickAnim - 24) / 4) * (21.5-(-37.1)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 21.5 + (((tickAnim - 28) / 13) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 21.5 + (((tickAnim - 41) / 4) * (-50.75-(21.5)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -50.75 + (((tickAnim - 45) / 3) * (-50.75-(-50.75)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -50.75 + (((tickAnim - 48) / 2) * (21.5-(-50.75)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 31.25 + (((tickAnim - 0) / 6) * (-21-(31.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -21 + (((tickAnim - 6) / 9) * (66.25-(-21)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 66.25 + (((tickAnim - 15) / 4) * (83.58-(66.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 83.58 + (((tickAnim - 19) / 5) * (91-(83.58)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 91 + (((tickAnim - 24) / 4) * (31.25-(91)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 31.25 + (((tickAnim - 28) / 4) * (-15.5-(31.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -15.5 + (((tickAnim - 32) / 9) * (66.25-(-15.5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 66.25 + (((tickAnim - 41) / 7) * (82.8-(66.25)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 82.8 + (((tickAnim - 48) / 2) * (31.25-(82.8)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = -1.05 + (((tickAnim - 6) / 9) * (0-(-1.05)));
            zz = 0 + (((tickAnim - 6) / 9) * (-1.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (1.9-(0)));
            zz = -1.65 + (((tickAnim - 15) / 4) * (-2.075-(-1.65)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 1.9 + (((tickAnim - 19) / 5) * (0.76-(1.9)));
            zz = -2.075 + (((tickAnim - 19) / 5) * (-1.98-(-2.075)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.76 + (((tickAnim - 24) / 4) * (0-(0.76)));
            zz = -1.98 + (((tickAnim - 24) / 4) * (0-(-1.98)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            yy = -1.05 + (((tickAnim - 32) / 9) * (0-(-1.05)));
            zz = 0 + (((tickAnim - 32) / 9) * (-1.65-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = -1.65 + (((tickAnim - 41) / 7) * (-1.7-(-1.65)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = -1.7 + (((tickAnim - 48) / 2) * (0-(-1.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -23.5 + (((tickAnim - 0) / 6) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (-45.98919-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (-0.7785-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (-0.1724-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -45.98919 + (((tickAnim - 11) / 4) * (16.25-(-45.98919)));
            yy = -0.7785 + (((tickAnim - 11) / 4) * (0-(-0.7785)));
            zz = -0.1724 + (((tickAnim - 11) / 4) * (0-(-0.1724)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 16.25 + (((tickAnim - 15) / 4) * (0-(16.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -23.5 + (((tickAnim - 28) / 4) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (-45.98919-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (-0.7785-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-0.1724-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -45.98919 + (((tickAnim - 37) / 4) * (16.25-(-45.98919)));
            yy = -0.7785 + (((tickAnim - 37) / 4) * (0-(-0.7785)));
            zz = -0.1724 + (((tickAnim - 37) / 4) * (0-(-0.1724)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 16.25 + (((tickAnim - 41) / 7) * (0-(16.25)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0.465-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (-0.325-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.465 + (((tickAnim - 11) / 4) * (-0.2-(0.465)));
            zz = -0.325 + (((tickAnim - 11) / 4) * (0-(-0.325)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 4) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0.465-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-0.325-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            yy = 0.465 + (((tickAnim - 37) / 4) * (-0.2-(0.465)));
            zz = -0.325 + (((tickAnim - 37) / 4) * (0-(-0.325)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 41) / 7) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 2 + (((tickAnim - 0) / 15) * (3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(2)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 15) / 22) * (0-(0)));
            yy = 3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 15) / 22) * (5.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            zz = 0 + (((tickAnim - 15) / 22) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 5.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 37) / 13) * (2-(5.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.09735 + (((tickAnim - 0) / 15) * (0.32476-(0.09735)));
            yy = -3.68329 + (((tickAnim - 0) / 15) * (0.0173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-3.68329)));
            zz = -1.50167 + (((tickAnim - 0) / 15) * (-3.20859-(-1.50167)));
        }
        else if (tickAnim >= 15 && tickAnim < 37) {
            xx = 0.32476 + (((tickAnim - 15) / 22) * (0.32476-(0.32476)));
            yy = 0.0173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 15) / 22) * (-2.6327+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5-(0.0173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            zz = -3.20859 + (((tickAnim - 15) / 22) * (-3.20859-(-3.20859)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0.32476 + (((tickAnim - 37) / 13) * (0.09735-(0.32476)));
            yy = -2.6327+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5 + (((tickAnim - 37) / 13) * (-3.68329-(-2.6327+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5)));
            zz = -3.20859 + (((tickAnim - 37) / 13) * (-1.50167-(-3.20859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.12586 + (((tickAnim - 0) / 15) * (0.91379-(0.12586)));
            yy = -5.74863 + (((tickAnim - 0) / 15) * (0.465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-5.74863)));
            zz = -1.25632 + (((tickAnim - 0) / 15) * (-5.58886-(-1.25632)));
        }
        else if (tickAnim >= 15 && tickAnim < 37) {
            xx = 0.91379 + (((tickAnim - 15) / 22) * (0.91379-(0.91379)));
            yy = 0.465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 15) / 22) * (-4.385+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0.465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -5.58886 + (((tickAnim - 15) / 22) * (-5.58886-(-5.58886)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0.91379 + (((tickAnim - 37) / 13) * (0.12586-(0.91379)));
            yy = -4.385+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 37) / 13) * (-5.74863-(-4.385+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = -5.58886 + (((tickAnim - 37) / 13) * (-1.25632-(-5.58886)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.39852 + (((tickAnim - 0) / 15) * (6.89852-(0.39852)));
            yy = -6.48782 + (((tickAnim - 0) / 15) * (-6.48782-(-6.48782)));
            zz = -3.52259 + (((tickAnim - 0) / 15) * (-3.52259-(-3.52259)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 6.89852 + (((tickAnim - 15) / 13) * (0.39852-(6.89852)));
            yy = -6.48782 + (((tickAnim - 15) / 13) * (-6.48782-(-6.48782)));
            zz = -3.52259 + (((tickAnim - 15) / 13) * (-3.52259-(-3.52259)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0.39852 + (((tickAnim - 28) / 9) * (6.89852-(0.39852)));
            yy = -6.48782 + (((tickAnim - 28) / 9) * (-6.48782-(-6.48782)));
            zz = -3.52259 + (((tickAnim - 28) / 9) * (-3.52259-(-3.52259)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 6.89852 + (((tickAnim - 37) / 13) * (0.39852-(6.89852)));
            yy = -6.48782 + (((tickAnim - 37) / 13) * (-6.48782-(-6.48782)));
            zz = -3.52259 + (((tickAnim - 37) / 13) * (-3.52259-(-3.52259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 11.76991 + (((tickAnim - 0) / 15) * (17.51991-(11.76991)));
            yy = -11.02959 + (((tickAnim - 0) / 15) * (-11.02959-(-11.02959)));
            zz = -2.28518 + (((tickAnim - 0) / 15) * (-2.28518-(-2.28518)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 17.51991 + (((tickAnim - 15) / 13) * (11.76991-(17.51991)));
            yy = -11.02959 + (((tickAnim - 15) / 13) * (-11.02959-(-11.02959)));
            zz = -2.28518 + (((tickAnim - 15) / 13) * (-2.28518-(-2.28518)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 11.76991 + (((tickAnim - 28) / 9) * (17.51991-(11.76991)));
            yy = -11.02959 + (((tickAnim - 28) / 9) * (-11.02959-(-11.02959)));
            zz = -2.28518 + (((tickAnim - 28) / 9) * (-2.28518-(-2.28518)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 17.51991 + (((tickAnim - 37) / 13) * (11.76991-(17.51991)));
            yy = -11.02959 + (((tickAnim - 37) / 13) * (-11.02959-(-11.02959)));
            zz = -2.28518 + (((tickAnim - 37) / 13) * (-2.28518-(-2.28518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -15 + (((tickAnim - 0) / 15) * (-15-(-15)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = -15 + (((tickAnim - 15) / 13) * (-15-(-15)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = -15 + (((tickAnim - 28) / 9) * (-15-(-15)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = -15 + (((tickAnim - 37) / 13) * (-15-(-15)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -10.5 + (((tickAnim - 0) / 15) * (-10.5-(-10.5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = -10.5 + (((tickAnim - 15) / 13) * (-10.5-(-10.5)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = -10.5 + (((tickAnim - 28) / 9) * (-10.5-(-10.5)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = -10.5 + (((tickAnim - 37) / 13) * (-10.5-(-10.5)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(heads, heads.rotateAngleX + (float) Math.toRadians(xx), heads.rotateAngleY + (float) Math.toRadians(yy), heads.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5))*2), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+120))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+120))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+120))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+120))*-7), tail5.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10.75 + (((tickAnim - 15) / 20) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10.75 + (((tickAnim - 35) / 15) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-8.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.85-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -8.1 + (((tickAnim - 15) / 20) * (-8.1-(-8.1)));
            zz = 3.85 + (((tickAnim - 15) / 20) * (3.85-(3.85)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -8.1 + (((tickAnim - 35) / 15) * (0-(-8.1)));
            zz = 3.85 + (((tickAnim - 35) / 15) * (0-(3.85)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11 + (((tickAnim - 15) / 20) * (-11-(-11)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11 + (((tickAnim - 35) / 15) * (0-(-11)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 23 + (((tickAnim - 15) / 20) * (23-(23)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 35) / 15) * (0-(23)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -24.75 + (((tickAnim - 15) / 20) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 35) / 15) * (0-(-24.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 15) / 20) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 35) / 15) * (0-(25.25)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.1 + (((tickAnim - 15) / 20) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 35) / 15) * (0-(1.1)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.5 + (((tickAnim - 15) / 20) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.65 + (((tickAnim - 15) / 20) * (0.65-(0.65)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.65 + (((tickAnim - 35) / 15) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 15) / 20) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 35) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
            zz = 0.65 + (((tickAnim - 15) / 20) * (0.65-(0.65)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
            zz = 0.65 + (((tickAnim - 35) / 15) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 21 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 21) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 21) / 5) * (0.01-(1)));
            zz = 1 + (((tickAnim - 21) / 5) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 26) / 4) * (1-(1)));
            yy = 0.01 + (((tickAnim - 26) / 4) * (1-(0.01)));
            zz = 1 + (((tickAnim - 26) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11 + (((tickAnim - 15) / 20) * (-11-(-11)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11 + (((tickAnim - 35) / 15) * (0-(-11)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 23 + (((tickAnim - 15) / 20) * (23-(23)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 35) / 15) * (0-(23)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -24.75 + (((tickAnim - 15) / 20) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 35) / 15) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 15) / 20) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 35) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.1 + (((tickAnim - 15) / 20) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 35) / 15) * (0-(1.1)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 33) {
            xx = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 8) / 25) * (0-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 8) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 25) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (-0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*2-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = -0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*2 + (((tickAnim - 43) / 12) * (0-(-0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*2)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 45) {
            xx = 12.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 8) / 37) * (5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(12.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 8) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 37) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 45) / 10) * (0-(5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 45) {
            xx = 10.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 8) / 37) * (3.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(10.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 8) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 37) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 45) / 10) * (0-(3.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -3.35 + (((tickAnim - 0) / 8) * (-22.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(-3.35)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 45) {
            xx = -22.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 8) / 37) * (-5.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(-22.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = 0 + (((tickAnim - 8) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 37) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -5.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 45) / 10) * (-3.35-(-5.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (17.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 33) {
            xx = 17.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-25 + (((tickAnim - 9) / 24) * (2.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(17.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-25)));
            yy = 0 + (((tickAnim - 9) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 24) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 55) {
            xx = 2.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 33) / 22) * (0-(2.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 33) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(heads, heads.rotateAngleX + (float) Math.toRadians(xx), heads.rotateAngleY + (float) Math.toRadians(yy), heads.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 8) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 25) * (0-(0)));
            zz = 0.35 + (((tickAnim - 8) / 25) * (0.325-(0.35)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0.325 + (((tickAnim - 33) / 10) * (0.35-(0.325)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0.35 + (((tickAnim - 43) / 12) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.heads.rotationPointX = this.heads.rotationPointX + (float)(xx);
        this.heads.rotationPointY = this.heads.rotationPointY - (float)(yy);
        this.heads.rotationPointZ = this.heads.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.425-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.6-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 36) {
            xx = 0.425 + (((tickAnim - 9) / 27) * (0.425-(0.425)));
            yy = 0 + (((tickAnim - 9) / 27) * (0-(0)));
            zz = -0.6 + (((tickAnim - 9) / 27) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 0.425 + (((tickAnim - 36) / 10) * (0.425-(0.425)));
            yy = 0 + (((tickAnim - 36) / 10) * (0-(0)));
            zz = -0.6 + (((tickAnim - 36) / 10) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 0.425 + (((tickAnim - 46) / 9) * (0-(0.425)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = -0.6 + (((tickAnim - 46) / 9) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.nasalLeft.rotationPointX = this.nasalLeft.rotationPointX + (float)(xx);
        this.nasalLeft.rotationPointY = this.nasalLeft.rotationPointY - (float)(yy);
        this.nasalLeft.rotationPointZ = this.nasalLeft.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 9) * (1.1-(1)));
            zz = 1 + (((tickAnim - 0) / 9) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 9) / 27) * (1-(1)));
            yy = 1.1 + (((tickAnim - 9) / 27) * (0.7725-(1.1)));
            zz = 1 + (((tickAnim - 9) / 27) * (0.7575-(1)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 1 + (((tickAnim - 36) / 10) * (1-(1)));
            yy = 0.7725 + (((tickAnim - 36) / 10) * (1.1-(0.7725)));
            zz = 0.7575 + (((tickAnim - 36) / 10) * (1-(0.7575)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 46) / 9) * (1-(1)));
            yy = 1.1 + (((tickAnim - 46) / 9) * (1-(1.1)));
            zz = 1 + (((tickAnim - 46) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nasalLeft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 9) / 19) * (10.35-(0)));
            yy = 0 + (((tickAnim - 9) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 19) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 10.35 + (((tickAnim - 28) / 8) * (11.35-(10.35)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 11.35 + (((tickAnim - 36) / 12) * (0-(11.35)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.6-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 36) {
            xx = -0.425 + (((tickAnim - 9) / 27) * (-0.425-(-0.425)));
            yy = 0 + (((tickAnim - 9) / 27) * (0-(0)));
            zz = -0.6 + (((tickAnim - 9) / 27) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = -0.425 + (((tickAnim - 36) / 10) * (-0.425-(-0.425)));
            yy = 0 + (((tickAnim - 36) / 10) * (0-(0)));
            zz = -0.6 + (((tickAnim - 36) / 10) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = -0.425 + (((tickAnim - 46) / 9) * (0-(-0.425)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = -0.6 + (((tickAnim - 46) / 9) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.nasalRight.rotationPointX = this.nasalRight.rotationPointX + (float)(xx);
        this.nasalRight.rotationPointY = this.nasalRight.rotationPointY - (float)(yy);
        this.nasalRight.rotationPointZ = this.nasalRight.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 9) * (1.1-(1)));
            zz = 1 + (((tickAnim - 0) / 9) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 9) / 27) * (1-(1)));
            yy = 1.1 + (((tickAnim - 9) / 27) * (0.7725-(1.1)));
            zz = 1 + (((tickAnim - 9) / 27) * (0.7575-(1)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 1 + (((tickAnim - 36) / 10) * (1-(1)));
            yy = 0.7725 + (((tickAnim - 36) / 10) * (1.1-(0.7725)));
            zz = 0.7575 + (((tickAnim - 36) / 10) * (1-(0.7575)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 46) / 9) * (1-(1)));
            yy = 1.1 + (((tickAnim - 46) / 9) * (1-(1.1)));
            zz = 1 + (((tickAnim - 46) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nasalRight.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (8.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 8.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9 + (((tickAnim - 13) / 7) * (0-(8.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-5 + (((tickAnim - 13) / 7) * (0-(4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*3 + (((tickAnim - 13) / 7) * (0-(-2.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*3)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5 + (((tickAnim - 13) / 7) * (0-(0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 13) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(heads, heads.rotateAngleX + (float) Math.toRadians(xx), heads.rotateAngleY + (float) Math.toRadians(yy), heads.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.55183-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-14.6302-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (23.10244-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 3.55183 + (((tickAnim - 12) / 8) * (0-(3.55183)));
            yy = -14.6302 + (((tickAnim - 12) / 8) * (0-(-14.6302)));
            zz = 23.10244 + (((tickAnim - 12) / 8) * (0-(23.10244)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(nasalLeft, nasalLeft.rotateAngleX + (float) Math.toRadians(xx), nasalLeft.rotateAngleY + (float) Math.toRadians(yy), nasalLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.2-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0.35 + (((tickAnim - 12) / 8) * (0-(0.35)));
            yy = 0.325 + (((tickAnim - 12) / 8) * (0-(0.325)));
            zz = -0.2 + (((tickAnim - 12) / 8) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.nasalLeft.rotationPointX = this.nasalLeft.rotationPointX + (float)(xx);
        this.nasalLeft.rotationPointY = this.nasalLeft.rotationPointY - (float)(yy);
        this.nasalLeft.rotationPointZ = this.nasalLeft.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.08-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1.1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.08 + (((tickAnim - 12) / 8) * (1-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.08)));
            yy = 1 + (((tickAnim - 12) / 8) * (1-(1)));
            zz = 1.1 + (((tickAnim - 12) / 8) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nasalLeft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (8.9-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 8.9 + (((tickAnim - 12) / 8) * (0-(8.9)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.55183-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (14.6302-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-23.10244-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 3.55183 + (((tickAnim - 12) / 8) * (0-(3.55183)));
            yy = 14.6302 + (((tickAnim - 12) / 8) * (0-(14.6302)));
            zz = -23.10244 + (((tickAnim - 12) / 8) * (0-(-23.10244)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(nasalRight, nasalRight.rotateAngleX + (float) Math.toRadians(xx), nasalRight.rotateAngleY + (float) Math.toRadians(yy), nasalRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.2-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -0.35 + (((tickAnim - 12) / 8) * (0-(-0.35)));
            yy = 0.325 + (((tickAnim - 12) / 8) * (0-(0.325)));
            zz = -0.2 + (((tickAnim - 12) / 8) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.nasalRight.rotationPointX = this.nasalRight.rotationPointX + (float)(xx);
        this.nasalRight.rotationPointY = this.nasalRight.rotationPointY - (float)(yy);
        this.nasalRight.rotationPointZ = this.nasalRight.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.08-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1.1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.08 + (((tickAnim - 12) / 8) * (1-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.08)));
            yy = 1 + (((tickAnim - 12) / 8) * (1-(1)));
            zz = 1.1 + (((tickAnim - 12) / 8) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nasalRight.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 280;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 11.25 + (((tickAnim - 40) / 202) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 11.25 + (((tickAnim - 242) / 38) * (0-(11.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 3.25 + (((tickAnim - 40) / 202) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 3.25 + (((tickAnim - 242) / 38) * (0-(3.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 1.25 + (((tickAnim - 40) / 202) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 1.25 + (((tickAnim - 242) / 38) * (0-(1.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 7.75 + (((tickAnim - 40) / 202) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 7.75 + (((tickAnim - 242) / 38) * (0-(7.75)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 5 + (((tickAnim - 40) / 202) * (5-(5)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 5 + (((tickAnim - 242) / 38) * (0-(5)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -26.75 + (((tickAnim - 40) / 202) * (-26.75-(-26.75)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -26.75 + (((tickAnim - 242) / 38) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 1.25 + (((tickAnim - 40) / 202) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 1.25 + (((tickAnim - 242) / 38) * (0-(1.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0.25 + (((tickAnim - 40) / 202) * (0.25-(0.25)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0.25 + (((tickAnim - 242) / 38) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 2 + (((tickAnim - 40) / 202) * (2-(2)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 2 + (((tickAnim - 242) / 38) * (0-(2)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.4-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            yy = 0.175 + (((tickAnim - 40) / 202) * (0.175-(0.175)));
            zz = 0.4 + (((tickAnim - 40) / 202) * (0.4-(0.4)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            yy = 0.175 + (((tickAnim - 242) / 38) * (0-(0.175)));
            zz = 0.4 + (((tickAnim - 242) / 38) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-64.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -64.75 + (((tickAnim - 35) / 5) * (-67.25-(-64.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -67.25 + (((tickAnim - 40) / 202) * (-67.25-(-67.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -67.25 + (((tickAnim - 242) / 38) * (0-(-67.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 41.25 + (((tickAnim - 35) / 5) * (41.25-(41.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 41.25 + (((tickAnim - 40) / 202) * (41.25-(41.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 41.25 + (((tickAnim - 242) / 38) * (0-(41.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 35) / 5) * (1.25-(0.425)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            yy = 1.25 + (((tickAnim - 40) / 202) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            yy = 1.25 + (((tickAnim - 242) / 38) * (0-(1.25)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.5 + (((tickAnim - 40) / 10) * (-6.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10-(1.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = -6.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10 + (((tickAnim - 50) / 8) * (-4.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10-(-6.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 82) {
            xx = -4.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10 + (((tickAnim - 58) / 24) * (0-(-4.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10)));
            yy = 0 + (((tickAnim - 58) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 24) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 82) / 63) * (-2.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            yy = 0 + (((tickAnim - 82) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 63) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -2.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 145) / 25) * (0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-2.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 195) {
            xx = 0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 170) / 25) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*0.5-(0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 170) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 25) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 220) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*0.5 + (((tickAnim - 195) / 25) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*0.5)));
            yy = 0 + (((tickAnim - 195) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 25) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 245) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*2 + (((tickAnim - 220) / 25) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*2-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*2)));
            yy = 0 + (((tickAnim - 220) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 25) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*2 + (((tickAnim - 245) / 35) * (0-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*2)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0.1-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 50) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 32) * (0-(0)));
            zz = 0.1 + (((tickAnim - 50) / 32) * (0.1-(0.1)));
        }
        else if (tickAnim >= 82 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 82) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 28) * (0.125-(0)));
            zz = 0.1 + (((tickAnim - 82) / 28) * (0.425-(0.1)));
        }
        else if (tickAnim >= 110 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 110) / 35) * (0-(0)));
            yy = 0.125 + (((tickAnim - 110) / 35) * (0.125-(0.125)));
            zz = 0.425 + (((tickAnim - 110) / 35) * (0.425-(0.425)));
        }
        else if (tickAnim >= 145 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 145) / 50) * (0-(0)));
            yy = 0.125 + (((tickAnim - 145) / 50) * (0.525-(0.125)));
            zz = 0.425 + (((tickAnim - 145) / 50) * (0.425-(0.425)));
        }
        else if (tickAnim >= 195 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 195) / 50) * (0-(0)));
            yy = 0.525 + (((tickAnim - 195) / 50) * (0-(0.525)));
            zz = 0.425 + (((tickAnim - 195) / 50) * (0-(0.425)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 40) / 10) * (19-(13.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 68) {
            xx = 19 + (((tickAnim - 50) / 18) * (36.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*15-(19)));
            yy = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 18) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 82) {
            xx = 36.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*15 + (((tickAnim - 68) / 14) * (19-(36.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*15)));
            yy = 0 + (((tickAnim - 68) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 14) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 195) {
            xx = 19 + (((tickAnim - 82) / 113) * (24.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(19)));
            yy = 0 + (((tickAnim - 82) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 113) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 222) {
            xx = 24.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 195) / 27) * (31.82-(24.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 195) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 27) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 243) {
            xx = 31.82 + (((tickAnim - 222) / 21) * (27.84-(31.82)));
            yy = 0 + (((tickAnim - 222) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 21) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 280) {
            xx = 27.84 + (((tickAnim - 243) / 37) * (0-(27.84)));
            yy = 0 + (((tickAnim - 243) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 58) * (1.345-(0)));
            zz = 0 + (((tickAnim - 0) / 58) * (1.53-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 58) / 23) * (0-(0)));
            yy = 1.345 + (((tickAnim - 58) / 23) * (1.345-(1.345)));
            zz = 1.53 + (((tickAnim - 58) / 23) * (1.53-(1.53)));
        }
        else if (tickAnim >= 81 && tickAnim < 181) {
            xx = 0 + (((tickAnim - 81) / 100) * (0-(0)));
            yy = 1.345 + (((tickAnim - 81) / 100) * (0.475-(1.345)));
            zz = 1.53 + (((tickAnim - 81) / 100) * (1.2-(1.53)));
        }
        else if (tickAnim >= 181 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 181) / 14) * (0-(0)));
            yy = 0.475 + (((tickAnim - 181) / 14) * (0.475-(0.475)));
            zz = 1.2 + (((tickAnim - 181) / 14) * (0.875-(1.2)));
        }
        else if (tickAnim >= 195 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 195) / 27) * (0-(0)));
            yy = 0.475 + (((tickAnim - 195) / 27) * (1.135-(0.475)));
            zz = 0.875 + (((tickAnim - 195) / 27) * (1.255-(0.875)));
        }
        else if (tickAnim >= 222 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 222) / 21) * (0-(0)));
            yy = 1.135 + (((tickAnim - 222) / 21) * (1.15-(1.135)));
            zz = 1.255 + (((tickAnim - 222) / 21) * (1.175-(1.255)));
        }
        else if (tickAnim >= 243 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 243) / 37) * (0-(0)));
            yy = 1.15 + (((tickAnim - 243) / 37) * (0-(1.15)));
            zz = 1.175 + (((tickAnim - 243) / 37) * (0-(1.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 40) / 10) * (22.25-(14.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 82) {
            xx = 22.25 + (((tickAnim - 50) / 32) * (24.36-(22.25)));
            yy = 0 + (((tickAnim - 50) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 32) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 170) {
            xx = 24.36 + (((tickAnim - 82) / 88) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5-(24.36)));
            yy = 0 + (((tickAnim - 82) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 88) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 195) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5 + (((tickAnim - 170) / 25) * (-8.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5)));
            yy = 0 + (((tickAnim - 170) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 25) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 220) {
            xx = -8.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5 + (((tickAnim - 195) / 25) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5-(-8.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5)));
            yy = 0 + (((tickAnim - 195) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 25) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 245) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5 + (((tickAnim - 220) / 25) * (16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5)));
            yy = 0 + (((tickAnim - 220) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 25) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5 + (((tickAnim - 245) / 35) * (0-(16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+120))*5)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.25-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 50) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 32) * (0-(0)));
            zz = 0.25 + (((tickAnim - 50) / 32) * (0.25-(0.25)));
        }
        else if (tickAnim >= 82 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 82) / 138) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 138) * (0-(0)));
            zz = 0.25 + (((tickAnim - 82) / 138) * (0-(0.25)));
        }
        else if (tickAnim >= 220 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 220) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 25) * (0.3-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0.3 + (((tickAnim - 245) / 35) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 11.25 + (((tickAnim - 50) / 30) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 11.25 + (((tickAnim - 80) / 30) * (2-(11.25)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 169) {
            xx = 2 + (((tickAnim - 110) / 59) * (0-(2)));
            yy = 0 + (((tickAnim - 110) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 59) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 169) / 53) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 169) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 53) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 280) {
            xx = -14.75 + (((tickAnim - 222) / 58) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 222) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 110 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 110) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = -6.75 + (((tickAnim - 50) / 8) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 58) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 58) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 10) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 82) {
            xx = 12.75 + (((tickAnim - 68) / 14) * (4.75-(12.75)));
            yy = 0 + (((tickAnim - 68) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 14) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 110) {
            xx = 4.75 + (((tickAnim - 82) / 28) * (0-(4.75)));
            yy = 0 + (((tickAnim - 82) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 28) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5))-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 132) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5)) + (((tickAnim - 120) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5)))));
            yy = 0 + (((tickAnim - 120) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 12) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 132) / 36) * (-27.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 132) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 36) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 182) {
            xx = -27.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 168) / 14) * (-24.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5))*0.5-(-27.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 168) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 14) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 222) {
            xx = -24.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5))*0.5 + (((tickAnim - 182) / 40) * (19.75-(-24.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5))*0.5)));
            yy = 0 + (((tickAnim - 182) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 40) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 280) {
            xx = 19.75 + (((tickAnim - 222) / 58) * (0-(19.75)));
            yy = 0 + (((tickAnim - 222) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(heads, heads.rotateAngleX + (float) Math.toRadians(xx), heads.rotateAngleY + (float) Math.toRadians(yy), heads.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 55) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 14) * (0.45-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 69) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 13) * (0-(0)));
            zz = 0.45 + (((tickAnim - 69) / 13) * (0.25-(0.45)));
        }
        else if (tickAnim >= 82 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 82) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 28) * (0-(0)));
            zz = 0.25 + (((tickAnim - 82) / 28) * (0-(0.25)));
        }
        else if (tickAnim >= 110 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 110) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 58) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 168) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 54) * (0.8-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 222) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 222) / 58) * (0-(0)));
            zz = 0.8 + (((tickAnim - 222) / 58) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.heads.rotationPointX = this.heads.rotationPointX + (float)(xx);
        this.heads.rotationPointY = this.heads.rotationPointY - (float)(yy);
        this.heads.rotationPointZ = this.heads.rotationPointZ + (float)(zz);




        if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (11-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 11 + (((tickAnim - 50) / 8) * (0-(11)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 58) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 11) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 69) / 9) * (10.5-(0)));
            yy = 0 + (((tickAnim - 69) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 9) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = 10.5 + (((tickAnim - 78) / 6) * (0-(10.5)));
            yy = 0 + (((tickAnim - 78) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 6) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 84) / 144) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 144) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 144) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 236) {
            xx = 0 + (((tickAnim - 228) / 8) * (11.75-(0)));
            yy = 0 + (((tickAnim - 228) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 8) * (0-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = 11.75 + (((tickAnim - 236) / 4) * (1-(11.75)));
            yy = 0 + (((tickAnim - 236) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 236) / 4) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 1 + (((tickAnim - 240) / 40) * (0-(1)));
            yy = 0 + (((tickAnim - 240) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -2 + (((tickAnim - 40) / 202) * (-2-(-2)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -2 + (((tickAnim - 242) / 38) * (0-(-2)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -12 + (((tickAnim - 40) / 202) * (-12-(-12)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -12 + (((tickAnim - 242) / 38) * (0-(-12)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -2.25 + (((tickAnim - 40) / 202) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -2.25 + (((tickAnim - 242) / 38) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -9 + (((tickAnim - 40) / 202) * (-9-(-9)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -9 + (((tickAnim - 242) / 38) * (0-(-9)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = -0.5 + (((tickAnim - 40) / 130) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1-(-0.5)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 242) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1 + (((tickAnim - 170) / 72) * (-0.5-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1)));
            yy = 0 + (((tickAnim - 170) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 72) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -0.5 + (((tickAnim - 242) / 38) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(eye, eye.rotateAngleX + (float) Math.toRadians(0), eye.rotateAngleY + (float) Math.toRadians(0), eye.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 56 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 56) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 56) / 9) * (0-(1)));
            zz = 1 + (((tickAnim - 56) / 9) * (1-(1)));
        }
        else if (tickAnim >= 65 && tickAnim < 71) {
            xx = 1 + (((tickAnim - 65) / 6) * (1-(1)));
            yy = 0 + (((tickAnim - 65) / 6) * (1-(0)));
            zz = 1 + (((tickAnim - 65) / 6) * (1-(1)));
        }
        else if (tickAnim >= 71 && tickAnim < 160) {
            xx = 1 + (((tickAnim - 71) / 89) * (1-(1)));
            yy = 1 + (((tickAnim - 71) / 89) * (1-(1)));
            zz = 1 + (((tickAnim - 71) / 89) * (1-(1)));
        }
        else if (tickAnim >= 160 && tickAnim < 167) {
            xx = 1 + (((tickAnim - 160) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 160) / 7) * (0-(1)));
            zz = 1 + (((tickAnim - 160) / 7) * (1-(1)));
        }
        else if (tickAnim >= 167 && tickAnim < 170) {
            xx = 1 + (((tickAnim - 167) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 167) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 167) / 3) * (1-(1)));
        }
        else if (tickAnim >= 170 && tickAnim < 210) {
            xx = 1 + (((tickAnim - 170) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 170) / 40) * (1-(1)));
            zz = 1 + (((tickAnim - 170) / 40) * (1-(1)));
        }
        else if (tickAnim >= 210 && tickAnim < 217) {
            xx = 1 + (((tickAnim - 210) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 210) / 7) * (0-(1)));
            zz = 1 + (((tickAnim - 210) / 7) * (1-(1)));
        }
        else if (tickAnim >= 217 && tickAnim < 220) {
            xx = 1 + (((tickAnim - 217) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 217) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 217) / 3) * (1-(1)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = 1 + (((tickAnim - 220) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 220) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 220) / 15) * (1-(1)));
        }
        else if (tickAnim >= 235 && tickAnim < 242) {
            xx = 1 + (((tickAnim - 235) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 235) / 7) * (0-(1)));
            zz = 1 + (((tickAnim - 235) / 7) * (1-(1)));
        }
        else if (tickAnim >= 242 && tickAnim < 245) {
            xx = 1 + (((tickAnim - 242) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 242) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 242) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -10 + (((tickAnim - 40) / 202) * (-10-(-10)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -10 + (((tickAnim - 242) / 38) * (0-(-10)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -1.25 + (((tickAnim - 40) / 202) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -1.25 + (((tickAnim - 242) / 38) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 242 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 242 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(0), rightLeg5.rotateAngleY + (float) Math.toRadians(0), rightLeg5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -35.5 + (((tickAnim - 40) / 202) * (-35.5-(-35.5)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -35.5 + (((tickAnim - 242) / 38) * (0-(-35.5)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(0);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(0);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 25.25 + (((tickAnim - 40) / 202) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 40) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 202) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 25.25 + (((tickAnim - 242) / 38) * (0-(25.25)));
            yy = 0 + (((tickAnim - 242) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = 0.8 + (((tickAnim - 40) / 202) * (0.8-(0.8)));
            yy = -0.05 + (((tickAnim - 40) / 202) * (-0.05-(-0.05)));
            zz = -0.25 + (((tickAnim - 40) / 202) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = 0.8 + (((tickAnim - 242) / 38) * (0-(0.8)));
            yy = -0.05 + (((tickAnim - 242) / 38) * (0-(-0.05)));
            zz = -0.25 + (((tickAnim - 242) / 38) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.06081-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (15.0084-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (6.63198-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 242) {
            xx = -2.06081 + (((tickAnim - 40) / 202) * (-2.06081-(-2.06081)));
            yy = 15.0084 + (((tickAnim - 40) / 202) * (15.0084-(15.0084)));
            zz = 6.63198 + (((tickAnim - 40) / 202) * (6.63198-(6.63198)));
        }
        else if (tickAnim >= 242 && tickAnim < 280) {
            xx = -2.06081 + (((tickAnim - 242) / 38) * (0-(-2.06081)));
            yy = 15.0084 + (((tickAnim - 242) / 38) * (0-(15.0084)));
            zz = 6.63198 + (((tickAnim - 242) / 38) * (0-(6.63198)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalkBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -8.25 + (((tickAnim - 0) / 18) * (28.25-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 28.25 + (((tickAnim - 18) / 10) * (1.6726-(28.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (-2.48479-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0.27544-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 1.6726 + (((tickAnim - 28) / 5) * (-8.25-(1.6726)));
            yy = -2.48479 + (((tickAnim - 28) / 5) * (0-(-2.48479)));
            zz = 0.27544 + (((tickAnim - 28) / 5) * (0-(0.27544)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -21 + (((tickAnim - 0) / 18) * (11-(-21)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11 + (((tickAnim - 18) / 15) * (-21-(11)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.625-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 23) / 7) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 3) * (0-(0.625)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -8 + (((tickAnim - 0) / 18) * (0.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0.5 + (((tickAnim - 18) / 6) * (-44.36-(0.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -44.36 + (((tickAnim - 24) / 5) * (-51.18-(-44.36)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -51.18 + (((tickAnim - 29) / 4) * (-8-(-51.18)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 38.25 + (((tickAnim - 0) / 7) * (4.11-(38.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 4.11 + (((tickAnim - 7) / 11) * (78.75-(4.11)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 78.75 + (((tickAnim - 18) / 5) * (77.39-(78.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 77.39 + (((tickAnim - 23) / 6) * (82.57-(77.39)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 82.57 + (((tickAnim - 29) / 4) * (38.25-(82.57)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0.9 + (((tickAnim - 7) / 5) * (3.505-(0.9)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.13-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 3.505 + (((tickAnim - 12) / 6) * (3.025-(3.505)));
            zz = 0.13 + (((tickAnim - 12) / 6) * (0.275-(0.13)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 3.025 + (((tickAnim - 18) / 5) * (4.08-(3.025)));
            zz = 0.275 + (((tickAnim - 18) / 5) * (0.075-(0.275)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 4.08 + (((tickAnim - 23) / 6) * (2.18-(4.08)));
            zz = 0.075 + (((tickAnim - 23) / 6) * (0.075-(0.075)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 2.18 + (((tickAnim - 29) / 4) * (0-(2.18)));
            zz = 0.075 + (((tickAnim - 29) / 4) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-25))), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5))*0.32), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+20))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5))*0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5+20))*-1);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (-51-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -51 + (((tickAnim - 12) / 6) * (20-(-51)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 20 + (((tickAnim - 18) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.325 + (((tickAnim - 18) / 15) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5+100))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+80))*0.2));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0.225);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5+170))*1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+160))*0.3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.175);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-30))*2.5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5+120))*4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5))*1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+30))*-2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-30))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-170))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-230))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-25))*0.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+20))*0.1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-55))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5-90))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+20))*0.1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-75))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5-180))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+20))*0.1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-105))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5-200))*7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+20))*0.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-120))*3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5-220))*10), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5+30))*1));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 28.25 + (((tickAnim - 0) / 11) * (0.43173-(28.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (2.23042-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.29627-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.43173 + (((tickAnim - 11) / 4) * (-8.25-(0.43173)));
            yy = 2.23042 + (((tickAnim - 11) / 4) * (0-(2.23042)));
            zz = -0.29627 + (((tickAnim - 11) / 4) * (0-(-0.29627)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -8.25 + (((tickAnim - 15) / 18) * (28.25-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 11 + (((tickAnim - 0) / 15) * (-21-(11)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -21 + (((tickAnim - 15) / 18) * (11-(-21)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.625 + (((tickAnim - 5) / 8) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 13) / 2) * (0-(0.625)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
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
            xx = 0.5 + (((tickAnim - 0) / 6) * (-47-(0.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -47 + (((tickAnim - 6) / 5) * (-53-(-47)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -53 + (((tickAnim - 11) / 4) * (-8-(-53)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -8 + (((tickAnim - 15) / 18) * (0.5-(-8)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 78.75 + (((tickAnim - 0) / 5) * (81.5-(78.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 81.5 + (((tickAnim - 5) / 6) * (82-(81.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 82 + (((tickAnim - 11) / 4) * (38.25-(82)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 38.25 + (((tickAnim - 15) / 8) * (7.25-(38.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 23) / 10) * (78.75-(7.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 3.025 + (((tickAnim - 0) / 5) * (3.025-(3.025)));
            zz = 0.25 + (((tickAnim - 0) / 5) * (-0.14-(0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 3.025 + (((tickAnim - 5) / 6) * (1.29-(3.025)));
            zz = -0.14 + (((tickAnim - 5) / 6) * (-0.01-(-0.14)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1.29 + (((tickAnim - 11) / 4) * (-0.2-(1.29)));
            zz = -0.01 + (((tickAnim - 11) / 4) * (0.425-(-0.01)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 8) * (1.2-(-0.2)));
            zz = 0.425 + (((tickAnim - 15) / 8) * (0-(0.425)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 1.2 + (((tickAnim - 23) / 10) * (3.025-(1.2)));
            zz = 0 + (((tickAnim - 23) / 10) * (0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 0) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (-58.64-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -58.64 + (((tickAnim - 28) / 5) * (20-(-58.64)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 15) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5-30))*2.5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*221.5/0.5+120))*4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 23;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485))*3.2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+90))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485))*-1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485))*1);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -10.25 + (((tickAnim - 0) / 11) * (29.75-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 29.75 + (((tickAnim - 11) / 8) * (0.66208-(29.75)));
            yy = 0 + (((tickAnim - 11) / 8) * (-3.00735-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0.13538-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0.66208 + (((tickAnim - 19) / 4) * (-10.25-(0.66208)));
            yy = -3.00735 + (((tickAnim - 19) / 4) * (0-(-3.00735)));
            zz = 0.13538 + (((tickAnim - 19) / 4) * (0-(0.13538)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -30.5 + (((tickAnim - 0) / 11) * (24.25-(-30.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 24.25 + (((tickAnim - 11) / 12) * (-30.5-(24.25)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0.175-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 20) / 3) * (0-(0.175)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -13.75 + (((tickAnim - 11) / 4) * (-45.39-(-13.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -45.39 + (((tickAnim - 15) / 4) * (-48.64-(-45.39)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -48.64 + (((tickAnim - 19) / 4) * (0-(-48.64)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.25 + (((tickAnim - 0) / 3) * (20.25486-(37.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.68533-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.06796-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 20.25486 + (((tickAnim - 3) / 1) * (4.5-(20.25486)));
            yy = 1.68533 + (((tickAnim - 3) / 1) * (0-(1.68533)));
            zz = -3.06796 + (((tickAnim - 3) / 1) * (0-(-3.06796)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 4) / 4) * (57.87302-(4.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (2.27646-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-0.67484-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 57.87302 + (((tickAnim - 8) / 3) * (62.5-(57.87302)));
            yy = 2.27646 + (((tickAnim - 8) / 3) * (0-(2.27646)));
            zz = -0.67484 + (((tickAnim - 8) / 3) * (0-(-0.67484)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 62.5 + (((tickAnim - 11) / 4) * (81.32-(62.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 81.32 + (((tickAnim - 15) / 4) * (81.32-(81.32)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 81.32 + (((tickAnim - 19) / 4) * (37.25-(81.32)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 3) * (4.585-(1)));
            zz = -1.025 + (((tickAnim - 0) / 3) * (-0.33-(-1.025)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 4.585 + (((tickAnim - 3) / 1) * (2.475-(4.585)));
            zz = -0.33 + (((tickAnim - 3) / 1) * (-0.435-(-0.33)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 2.475 + (((tickAnim - 4) / 4) * (0.265-(2.475)));
            zz = -0.435 + (((tickAnim - 4) / 4) * (-1.04-(-0.435)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.265 + (((tickAnim - 8) / 3) * (0-(0.265)));
            zz = -1.04 + (((tickAnim - 8) / 3) * (-1.65-(-1.04)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (1.275-(0)));
            zz = -1.65 + (((tickAnim - 11) / 4) * (-1.85-(-1.65)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 1.275 + (((tickAnim - 15) / 4) * (1.275-(1.275)));
            zz = -1.85 + (((tickAnim - 15) / 4) * (-1.85-(-1.85)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.275 + (((tickAnim - 19) / 4) * (1-(1.275)));
            zz = -1.85 + (((tickAnim - 19) / 4) * (-1.025-(-1.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -47.25 + (((tickAnim - 8) / 3) * (21.5-(-47.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 21.5 + (((tickAnim - 11) / 12) * (0-(21.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.42-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-0.475-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.42 + (((tickAnim - 8) / 3) * (-0.25-(0.42)));
            zz = -0.475 + (((tickAnim - 8) / 3) * (0-(-0.475)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 11) / 4) * (-0.16-(-0.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.16 + (((tickAnim - 15) / 8) * (0-(-0.16)));
            zz = 0.575 + (((tickAnim - 15) / 8) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-60))*-2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-170))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+120))*1));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0.325);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.675);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-220))*2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+250))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-220))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-80))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-50))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-60))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-80))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+20))*0.1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-90))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-120))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+20))*0.2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-140))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-170))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+20))*0.3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-180))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-200))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+20))*0.3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-220))*3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-240))*13), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+20))*0.4));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-170))*-4), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+120))*1));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 29.75 + (((tickAnim - 0) / 8) * (-1.32603-(29.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.92968-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.9493-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.32603 + (((tickAnim - 8) / 4) * (-10.25-(-1.32603)));
            yy = 1.92968 + (((tickAnim - 8) / 4) * (0-(1.92968)));
            zz = 0.9493 + (((tickAnim - 8) / 4) * (0-(0.9493)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -10.25 + (((tickAnim - 12) / 11) * (29.75-(-10.25)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 24.25 + (((tickAnim - 0) / 12) * (-30.5-(24.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -30.5 + (((tickAnim - 12) / 11) * (24.25-(-30.5)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 4) * (0-(0.475)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -10.5 + (((tickAnim - 0) / 4) * (-42.92-(-10.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -42.92 + (((tickAnim - 4) / 4) * (-51.17-(-42.92)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -51.17 + (((tickAnim - 8) / 4) * (0-(-51.17)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 62.5 + (((tickAnim - 0) / 4) * (78.08-(62.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 78.08 + (((tickAnim - 4) / 4) * (73.67-(78.08)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 73.67 + (((tickAnim - 8) / 4) * (37.25-(73.67)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 37.25 + (((tickAnim - 12) / 3) * (16.73296-(37.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (-0.95958-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (2.03521-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 16.73296 + (((tickAnim - 15) / 3) * (60.75-(16.73296)));
            yy = -0.95958 + (((tickAnim - 15) / 3) * (0-(-0.95958)));
            zz = 2.03521 + (((tickAnim - 15) / 3) * (0-(2.03521)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 60.75 + (((tickAnim - 18) / 5) * (62.5-(60.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.825-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.145-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 2.825 + (((tickAnim - 4) / 8) * (0.85-(2.825)));
            zz = -0.145 + (((tickAnim - 4) / 8) * (-0.05-(-0.145)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 12) / 1) * (3.48-(0.85)));
            zz = -0.05 + (((tickAnim - 12) / 1) * (-0.03-(-0.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 3.48 + (((tickAnim - 13) / 1) * (4.945-(3.48)));
            zz = -0.03 + (((tickAnim - 13) / 1) * (-0.02-(-0.03)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 4.945 + (((tickAnim - 14) / 1) * (3.95-(4.945)));
            zz = -0.02 + (((tickAnim - 14) / 1) * (0-(-0.02)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 3.95 + (((tickAnim - 15) / 3) * (3.315-(3.95)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 3.315 + (((tickAnim - 18) / 5) * (0-(3.315)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21.5 + (((tickAnim - 0) / 4) * (10-(21.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 4) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-64-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -64 + (((tickAnim - 18) / 5) * (21.5-(-64)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 12) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.595-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.595 + (((tickAnim - 18) / 5) * (-0.25-(0.595)));
            zz = -0.2 + (((tickAnim - 18) / 5) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*299/0.485-170))*-4), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+120))*1));

    }
    public void animWalkQuad(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOuranosaurus entity = (EntityPrehistoricFloraOuranosaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5))*0.8), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+20))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*1.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-20))*-0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-20))*0.5);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -6.25 + (((tickAnim - 0) / 5) * (-14.5-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = -14.5 + (((tickAnim - 5) / 19) * (10-(-14.5)));
            yy = 0 + (((tickAnim - 5) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 19) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 24) / 11) * (-6.25-(10)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.5 + (((tickAnim - 0) / 5) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = -13.5 + (((tickAnim - 5) / 19) * (22.75-(-13.5)));
            yy = 0 + (((tickAnim - 5) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 19) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 22.75 + (((tickAnim - 24) / 11) * (-13.5-(22.75)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.275 + (((tickAnim - 0) / 5) * (0-(1.275)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 12) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = -0.05 + (((tickAnim - 24) / 11) * (1.275-(-0.05)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -38 + (((tickAnim - 0) / 5) * (2.25-(-38)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 5) / 7) * (-2.88-(2.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = -2.88 + (((tickAnim - 12) / 12) * (-34.5-(-2.88)));
            yy = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -34.5 + (((tickAnim - 24) / 5) * (-47.03-(-34.5)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -47.03 + (((tickAnim - 29) / 6) * (-38-(-47.03)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 86 + (((tickAnim - 0) / 5) * (26-(86)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 26 + (((tickAnim - 5) / 7) * (14.69-(26)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 14.69 + (((tickAnim - 12) / 12) * (85.5-(14.69)));
            yy = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 85.5 + (((tickAnim - 24) / 11) * (86-(85.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 2.2 + (((tickAnim - 0) / 5) * (-0.125-(2.2)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 5) / 7) * (-0.46-(-0.125)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            yy = -0.46 + (((tickAnim - 12) / 12) * (1.475-(-0.46)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 1.475 + (((tickAnim - 24) / 5) * (3.06-(1.475)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 3.06 + (((tickAnim - 29) / 6) * (2.2-(3.06)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-43.52-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -43.52 + (((tickAnim - 18) / 6) * (6-(-43.52)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 6 + (((tickAnim - 24) / 11) * (0-(6)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 4 + (((tickAnim - 0) / 12) * (-47.75-(4)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = -47.75 + (((tickAnim - 12) / 23) * (4-(-47.75)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 33.91911 + (((tickAnim - 0) / 8) * (6.74192-(33.91911)));
            yy = 5.87275 + (((tickAnim - 0) / 8) * (-0.89011-(5.87275)));
            zz = 16.62684 + (((tickAnim - 0) / 8) * (17.67285-(16.62684)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 6.74192 + (((tickAnim - 8) / 4) * (37.38027-(6.74192)));
            yy = -0.89011 + (((tickAnim - 8) / 4) * (-3.78848-(-0.89011)));
            zz = 17.67285 + (((tickAnim - 8) / 4) * (18.12114-(17.67285)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 37.38027 + (((tickAnim - 12) / 23) * (33.91911-(37.38027)));
            yy = -3.78848 + (((tickAnim - 12) / 23) * (5.87275-(-3.78848)));
            zz = 18.12114 + (((tickAnim - 12) / 23) * (16.62684-(18.12114)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.475 + (((tickAnim - 0) / 5) * (-0.58-(-0.475)));
            yy = -0.4 + (((tickAnim - 0) / 5) * (1.975-(-0.4)));
            zz = 0.225 + (((tickAnim - 0) / 5) * (0.2-(0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.58 + (((tickAnim - 5) / 3) * (-0.48-(-0.58)));
            yy = 1.975 + (((tickAnim - 5) / 3) * (0.8-(1.975)));
            zz = 0.2 + (((tickAnim - 5) / 3) * (0.42-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.48 + (((tickAnim - 8) / 4) * (-0.48-(-0.48)));
            yy = 0.8 + (((tickAnim - 8) / 4) * (-0.45-(0.8)));
            zz = 0.42 + (((tickAnim - 8) / 4) * (0.5-(0.42)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -0.48 + (((tickAnim - 12) / 5) * (-0.48-(-0.48)));
            yy = -0.45 + (((tickAnim - 12) / 5) * (0.04-(-0.45)));
            zz = 0.5 + (((tickAnim - 12) / 5) * (0.44-(0.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -0.48 + (((tickAnim - 17) / 3) * (-0.48-(-0.48)));
            yy = 0.04 + (((tickAnim - 17) / 3) * (0.93-(0.04)));
            zz = 0.44 + (((tickAnim - 17) / 3) * (0.4-(0.44)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -0.48 + (((tickAnim - 20) / 7) * (-0.48-(-0.48)));
            yy = 0.93 + (((tickAnim - 20) / 7) * (1.385-(0.93)));
            zz = 0.4 + (((tickAnim - 20) / 7) * (0.32-(0.4)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -0.48 + (((tickAnim - 27) / 8) * (-0.475-(-0.48)));
            yy = 1.385 + (((tickAnim - 27) / 8) * (-0.4-(1.385)));
            zz = 0.32 + (((tickAnim - 27) / 8) * (0.225-(0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -12.15024 + (((tickAnim - 0) / 7) * (-0.34913-(-12.15024)));
            yy = -0.90211 + (((tickAnim - 0) / 7) * (-16.21818-(-0.90211)));
            zz = -15.56778 + (((tickAnim - 0) / 7) * (33.62273-(-15.56778)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -0.34913 + (((tickAnim - 7) / 5) * (10.91166-(-0.34913)));
            yy = -16.21818 + (((tickAnim - 7) / 5) * (-3.32747-(-16.21818)));
            zz = 33.62273 + (((tickAnim - 7) / 5) * (-11.12038-(33.62273)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 10.91166 + (((tickAnim - 12) / 23) * (-12.15024-(10.91166)));
            yy = -3.32747 + (((tickAnim - 12) / 23) * (-0.90211-(-3.32747)));
            zz = -11.12038 + (((tickAnim - 12) / 23) * (-15.56778-(-11.12038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 5) * (0.555-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.555 + (((tickAnim - 5) / 3) * (0.305-(0.555)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-0.4-(0)));
            yy = 0.305 + (((tickAnim - 8) / 4) * (-0.03-(0.305)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -0.4 + (((tickAnim - 12) / 8) * (0-(-0.4)));
            yy = -0.03 + (((tickAnim - 12) / 8) * (0.245-(-0.03)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.245 + (((tickAnim - 20) / 3) * (0.755-(0.245)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.755 + (((tickAnim - 23) / 4) * (0.3-(0.755)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0.3 + (((tickAnim - 27) / 8) * (-0.125-(0.3)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-100))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-280))*2));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.375);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-70))*1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-350))*3));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5))*0.1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*1.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*0.1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5))*0.2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-80))*2), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*0.1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5))*0.2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*3), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*0.2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-120))*0.7), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-180))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-130))*0.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-190))*1.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+120))*0.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.375);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-90))*-2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-120))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*0.1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+30))*0.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*0.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+50))*2), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-180))*8), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*1));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 9.75 + (((tickAnim - 0) / 7) * (15.5-(9.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 15.5 + (((tickAnim - 7) / 11) * (-6.26055-(15.5)));
            yy = 0 + (((tickAnim - 7) / 11) * (2.18074-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (-0.55411-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -6.26055 + (((tickAnim - 18) / 3) * (-13.5-(-6.26055)));
            yy = 2.18074 + (((tickAnim - 18) / 3) * (0-(2.18074)));
            zz = -0.55411 + (((tickAnim - 18) / 3) * (0-(-0.55411)));
        }
        else if (tickAnim >= 21 && tickAnim < 35) {
            xx = -13.5 + (((tickAnim - 21) / 14) * (9.75-(-13.5)));
            yy = 0 + (((tickAnim - 21) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.5 + (((tickAnim - 0) / 7) * (20.58-(1.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 20.58 + (((tickAnim - 7) / 14) * (-12.5-(20.58)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 21) / 14) * (1.5-(-12.5)));
            yy = 0 + (((tickAnim - 21) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
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
            xx = 2 + (((tickAnim - 0) / 7) * (-16-(2)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -16 + (((tickAnim - 7) / 5) * (-42.24-(-16)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -42.24 + (((tickAnim - 12) / 5) * (-45.94-(-42.24)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -45.94 + (((tickAnim - 17) / 4) * (1.82351-(-45.94)));
            yy = 0 + (((tickAnim - 17) / 4) * (0.14262-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0.4396-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 35) {
            xx = 1.82351 + (((tickAnim - 21) / 14) * (2-(1.82351)));
            yy = 0.14262 + (((tickAnim - 21) / 14) * (0-(0.14262)));
            zz = 0.4396 + (((tickAnim - 21) / 14) * (0-(0.4396)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 21) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 0) / 7) * (87.02-(25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 87.02 + (((tickAnim - 7) / 7) * (79.76-(87.02)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 79.76 + (((tickAnim - 14) / 3) * (81.21-(79.76)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 81.21 + (((tickAnim - 17) / 4) * (24.25-(81.21)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 24.25 + (((tickAnim - 21) / 7) * (6.5-(24.25)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 28) / 7) * (25-(6.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.825 + (((tickAnim - 0) / 7) * (2.15-(0.825)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.125-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 2.15 + (((tickAnim - 7) / 10) * (2.4-(2.15)));
            zz = 0.125 + (((tickAnim - 7) / 10) * (-0.22-(0.125)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 2.4 + (((tickAnim - 17) / 4) * (0-(2.4)));
            zz = -0.22 + (((tickAnim - 17) / 4) * (0.4-(-0.22)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0.965-(0)));
            zz = 0.4 + (((tickAnim - 21) / 7) * (0.2-(0.4)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.965 + (((tickAnim - 28) / 7) * (0.825-(0.965)));
            zz = 0.2 + (((tickAnim - 28) / 7) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -29.75 + (((tickAnim - 0) / 3) * (-55-(-29.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -55 + (((tickAnim - 3) / 4) * (0-(-55)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (7-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 7 + (((tickAnim - 14) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.235-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 5) / 2) * (0-(0.575)));
            zz = -0.235 + (((tickAnim - 5) / 2) * (0.55-(-0.235)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0.55 + (((tickAnim - 7) / 14) * (0-(0.55)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
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
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -18.25 + (((tickAnim - 0) / 14) * (4-(-18.25)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 4 + (((tickAnim - 14) / 13) * (-47.75-(4)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -47.75 + (((tickAnim - 27) / 8) * (-18.25-(-47.75)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 21.94244 + (((tickAnim - 0) / 14) * (33.91-(21.94244)));
            yy = -3.69071 + (((tickAnim - 0) / 14) * (5.87-(-3.69071)));
            zz = -12.1734 + (((tickAnim - 0) / 14) * (-16.62-(-12.1734)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 33.91 + (((tickAnim - 14) / 9) * (6.089-(33.91)));
            yy = 5.87 + (((tickAnim - 14) / 9) * (4.407-(5.87)));
            zz = -16.62 + (((tickAnim - 14) / 9) * (-17.67-(-16.62)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 6.089 + (((tickAnim - 23) / 4) * (37.38-(6.089)));
            yy = 4.407 + (((tickAnim - 23) / 4) * (3.78-(4.407)));
            zz = -17.67 + (((tickAnim - 23) / 4) * (-18.12-(-17.67)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 37.38 + (((tickAnim - 27) / 8) * (21.94244-(37.38)));
            yy = 3.78 + (((tickAnim - 27) / 8) * (-3.69071-(3.78)));
            zz = -18.12 + (((tickAnim - 27) / 8) * (-12.1734-(-18.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0.55 + (((tickAnim - 0) / 14) * (0.475-(0.55)));
            yy = 0.7 + (((tickAnim - 0) / 14) * (-0.4-(0.7)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.225-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.475 + (((tickAnim - 14) / 6) * (0.48-(0.475)));
            yy = -0.4 + (((tickAnim - 14) / 6) * (0.905-(-0.4)));
            zz = 0.225 + (((tickAnim - 14) / 6) * (0.33-(0.225)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.48 + (((tickAnim - 20) / 3) * (0.48-(0.48)));
            yy = 0.905 + (((tickAnim - 20) / 3) * (0.41-(0.905)));
            zz = 0.33 + (((tickAnim - 20) / 3) * (0.42-(0.33)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0.48 + (((tickAnim - 23) / 4) * (0.48-(0.48)));
            yy = 0.41 + (((tickAnim - 23) / 4) * (-0.02-(0.41)));
            zz = 0.42 + (((tickAnim - 23) / 4) * (0.5-(0.42)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0.48 + (((tickAnim - 27) / 8) * (0.55-(0.48)));
            yy = -0.02 + (((tickAnim - 27) / 8) * (0.7-(-0.02)));
            zz = 0.5 + (((tickAnim - 27) / 8) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -4.75 + (((tickAnim - 0) / 14) * (-5.61077-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (6.64625-(0)));
            zz = 10.75 + (((tickAnim - 0) / 14) * (15.22775-(10.75)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -5.61077 + (((tickAnim - 14) / 9) * (3.47197-(-5.61077)));
            yy = 6.64625 + (((tickAnim - 14) / 9) * (20.66858-(6.64625)));
            zz = 15.22775 + (((tickAnim - 14) / 9) * (-21.03695-(15.22775)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 3.47197 + (((tickAnim - 23) / 4) * (10-(3.47197)));
            yy = 20.66858 + (((tickAnim - 23) / 4) * (3.32-(20.66858)));
            zz = -21.03695 + (((tickAnim - 23) / 4) * (11-(-21.03695)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 27) / 8) * (-4.75-(10)));
            yy = 3.32 + (((tickAnim - 27) / 8) * (0-(3.32)));
            zz = 11 + (((tickAnim - 27) / 8) * (10.75-(11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.18-(0)));
            yy = 0.15 + (((tickAnim - 0) / 6) * (1.19-(0.15)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.09-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0.18 + (((tickAnim - 6) / 8) * (0.475-(0.18)));
            yy = 1.19 + (((tickAnim - 6) / 8) * (-0.175-(1.19)));
            zz = 0.09 + (((tickAnim - 6) / 8) * (0.225-(0.09)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.475 + (((tickAnim - 14) / 6) * (0.39-(0.475)));
            yy = -0.175 + (((tickAnim - 14) / 6) * (0.5-(-0.175)));
            zz = 0.225 + (((tickAnim - 14) / 6) * (0.1-(0.225)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.39 + (((tickAnim - 20) / 3) * (0.325-(0.39)));
            yy = 0.5 + (((tickAnim - 20) / 3) * (0-(0.5)));
            zz = 0.1 + (((tickAnim - 20) / 3) * (0-(0.1)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0.325 + (((tickAnim - 23) / 4) * (0.3-(0.325)));
            yy = 0 + (((tickAnim - 23) / 4) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0.3 + (((tickAnim - 27) / 8) * (0-(0.3)));
            yy = -0.2 + (((tickAnim - 27) / 8) * (0.15-(-0.2)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOuranosaurus e = (EntityPrehistoricFloraOuranosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.TOQUAD_ANIMATION);
        animator.startKeyframe(e.getToBiTransitionLength()); //move to this keyframe over the right length, this is the UNPOSE
        animator.rotate(body, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((0.0436F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.3316F)-(-0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.1396F)-(0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((-0.1571F)-(-0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((1.85F)-(1.85F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((0.7679F)-(0.7679F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((1.0647F)-(1.0647F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((0.576F)-(0.576F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((0.6807F)-(0.6807F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((0.576F)-(0.576F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r23, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((0.576F)-(0.576F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r25, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3054F)-(0.3054F)));
        animator.rotate(cube_r26, -((-0.192F)-(-0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r27, -((0.8378F)-(0.8378F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r28, -((0.5411F)-(0.5411F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r29, -((0.192F)-(0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r30, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r31, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r32, -((-0.5934F)-(-0.5934F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r33, -((-0.384F)-(-0.384F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r34, -((1.3526F)-(1.3526F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r35, -((-0.1658F)-(-0.1658F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r36, -((0.7767F)-(0.7767F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r37, -((0.9163F)-(0.9163F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r38, -((1.3003F)-(1.3003F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r39, -((0.096F)-(0.096F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.1047F)-(-0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r40, -((1.1606F)-(1.1606F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r41, -((0.829F)-(0.829F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r42, -((0.1833F)-(0.1833F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r43, -((0.7069F)-(0.7069F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r44, -((0.4102F)-(0.4102F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r45, -((0.2356F)-(0.2356F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r46, -((0.0087F)-(0.0087F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r47, -((0.4451F)-(0.4451F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r48, -((0.3054F)-(0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r49, -((0.2531F)-(0.2531F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r50, -((0.7572F)-(0.7572F)), -((-0.3775F)-(-0.3775F)),-((0.3719F)-(0.3719F)));
        animator.rotate(cube_r51, -((0.7572F)-(0.7572F)), -((0.3775F)-(0.3775F)),-((-0.3719F)-(-0.3719F)));
        animator.rotate(cube_r52, -((0.2793F)-(0.2793F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r53, -((0.0524F)-(0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r54, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r55, -((0.1222F)-(0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r56, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r57, -((0.0175F)-(0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r58, -((-0.2967F)-(-0.2967F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r59, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((-0.1047F)-(-0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r60, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r61, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.4014F)-(0.4014F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.0175F)-(0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(heads, -((-0.0873F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((-0.2618F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((0.2564F)-(0.2564F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftArm, -((1.0724F)-(0.2871F)), -((0.276F)-(0.2302F)),-((-0.307F)-(-0.133F)));
        animator.rotate(leftArm2, -((-1.2839F)-(-0.6639F)), -((0.5902F)-(0.4759F)),-((-0.0909F)-(-0.2443F)));
        animator.rotate(leftArm3, -((0.2294F)-(0.3228F)), -((0.3165F)-(0.2204F)),-((0.1985F)-(0.5468F)));
        animator.rotate(leftLeg, -((-0.1396F)-(-0.2705F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, -((1.021F)-(1.021F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, -((-0.7854F)-(-0.829F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, -((0.1484F)-(0.1484F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(nasalLeft, -((-0.1454F)-(-0.1454F)), -((0.4644F)-(0.4644F)),-((-0.4831F)-(-0.4831F)));
        animator.rotate(nasalRight, -((-0.1454F)-(-0.1454F)), -((-0.4644F)-(-0.4644F)),-((0.4831F)-(0.4831F)));
        animator.rotate(neck, -((0.1309F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.0436F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((-0.0F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck4, -((-0.0F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightArm, -((1.0724F)-(0.2871F)), -((-0.276F)-(-0.2302F)),-((0.307F)-(0.133F)));
        animator.rotate(rightArm2, -((-1.2839F)-(-0.6639F)), -((-0.5902F)-(-0.4759F)),-((0.0909F)-(0.2443F)));
        animator.rotate(rightArm3, -((0.2294F)-(0.3228F)), -((-0.3165F)-(-0.2204F)),-((-0.1985F)-(-0.5468F)));
        animator.rotate(rightLeg, -((-0.1396F)-(-0.2705F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, -((1.021F)-(1.021F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, -((-0.7854F)-(-0.829F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, -((0.1484F)-(0.1484F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.192F)-(-0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((0.0087F)-(0.0087F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((0.1134F)-(0.0262F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((0.096F)-(0.0087F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((0.1745F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));







        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.TOBI_ANIMATION);
        animator.startKeyframe(e.getToQuadTransitionLength()); //move to this keyframe over the right length, this is the DOPOSE

        animator.rotate(body, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((0.0436F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.3316F)-(-0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.1396F)-(0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((-0.1571F)-(-0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((1.85F)-(1.85F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((0.7679F)-(0.7679F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((1.0647F)-(1.0647F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((0.576F)-(0.576F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((0.6807F)-(0.6807F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((0.576F)-(0.576F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r23, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((0.576F)-(0.576F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r25, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3054F)-(0.3054F)));
        animator.rotate(cube_r26, ((-0.192F)-(-0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r27, ((0.8378F)-(0.8378F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r28, ((0.5411F)-(0.5411F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r29, ((0.192F)-(0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r30, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r31, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r32, ((-0.5934F)-(-0.5934F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r33, ((-0.384F)-(-0.384F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r34, ((1.3526F)-(1.3526F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r35, ((-0.1658F)-(-0.1658F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r36, ((0.7767F)-(0.7767F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r37, ((0.9163F)-(0.9163F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r38, ((1.3003F)-(1.3003F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r39, ((0.096F)-(0.096F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.1047F)-(-0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r40, ((1.1606F)-(1.1606F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r41, ((0.829F)-(0.829F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r42, ((0.1833F)-(0.1833F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r43, ((0.7069F)-(0.7069F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r44, ((0.4102F)-(0.4102F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r45, ((0.2356F)-(0.2356F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r46, ((0.0087F)-(0.0087F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r47, ((0.4451F)-(0.4451F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r48, ((0.3054F)-(0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r49, ((0.2531F)-(0.2531F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r50, ((0.7572F)-(0.7572F)), ((-0.3775F)-(-0.3775F)),((0.3719F)-(0.3719F)));
        animator.rotate(cube_r51, ((0.7572F)-(0.7572F)), ((0.3775F)-(0.3775F)),((-0.3719F)-(-0.3719F)));
        animator.rotate(cube_r52, ((0.2793F)-(0.2793F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r53, ((0.0524F)-(0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r54, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r55, ((0.1222F)-(0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r56, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r57, ((0.0175F)-(0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r58, ((-0.2967F)-(-0.2967F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r59, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((-0.1047F)-(-0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r60, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r61, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.4014F)-(0.4014F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.0175F)-(0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(heads, ((-0.0873F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((-0.2618F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((0.2564F)-(0.2564F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftArm, ((1.0724F)-(0.2871F)), ((0.276F)-(0.2302F)),((-0.307F)-(-0.133F)));
        animator.rotate(leftArm2, ((-1.2839F)-(-0.6639F)), ((0.5902F)-(0.4759F)),((-0.0909F)-(-0.2443F)));
        animator.rotate(leftArm3, ((0.2294F)-(0.3228F)), ((0.3165F)-(0.2204F)),((0.1985F)-(0.5468F)));
        animator.rotate(leftLeg, ((-0.1396F)-(-0.2705F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, ((1.021F)-(1.021F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, ((-0.7854F)-(-0.829F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, ((0.1484F)-(0.1484F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(nasalLeft, ((-0.1454F)-(-0.1454F)), ((0.4644F)-(0.4644F)),((-0.4831F)-(-0.4831F)));
        animator.rotate(nasalRight, ((-0.1454F)-(-0.1454F)), ((-0.4644F)-(-0.4644F)),((0.4831F)-(0.4831F)));
        animator.rotate(neck, ((0.1309F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.0436F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((-0.0F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck4, ((-0.0F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightArm, ((1.0724F)-(0.2871F)), ((-0.276F)-(-0.2302F)),((0.307F)-(0.133F)));
        animator.rotate(rightArm2, ((-1.2839F)-(-0.6639F)), ((-0.5902F)-(-0.4759F)),((0.0909F)-(0.2443F)));
        animator.rotate(rightArm3, ((0.2294F)-(0.3228F)), ((-0.3165F)-(-0.2204F)),((-0.1985F)-(-0.5468F)));
        animator.rotate(rightLeg, ((-0.1396F)-(-0.2705F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, ((1.021F)-(1.021F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, ((-0.7854F)-(-0.829F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, ((0.1484F)-(0.1484F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.192F)-(-0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((0.0087F)-(0.0087F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((0.1134F)-(0.0262F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((0.096F)-(0.0087F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((0.1745F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
