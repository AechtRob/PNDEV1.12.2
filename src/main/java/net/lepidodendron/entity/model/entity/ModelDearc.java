package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDearc;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelDearc extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended rightwing;
    private final AdvancedModelRendererExtended rightwing2;
    private final AdvancedModelRendererExtended wingmembranebeg;
    private final AdvancedModelRendererExtended wingmembranebeg5;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended rightwing3;
    private final AdvancedModelRendererExtended wingmembranemiddle;
    private final AdvancedModelRendererExtended wingmembranemiddle5;
    private final AdvancedModelRendererExtended rightwing4;
    private final AdvancedModelRendererExtended wingmembraneend;
    private final AdvancedModelRendererExtended wingmembraneend5;
    private final AdvancedModelRendererExtended righthand;
    private final AdvancedModelRendererExtended leftwing;
    private final AdvancedModelRendererExtended leftwing2;
    private final AdvancedModelRendererExtended wingmembranebeg2;
    private final AdvancedModelRendererExtended wingmembranebeg6;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended leftwing3;
    private final AdvancedModelRendererExtended wingmembranemiddle2;
    private final AdvancedModelRendererExtended wingmembranemiddle3;
    private final AdvancedModelRendererExtended leftwing4;
    private final AdvancedModelRendererExtended wingmembraneend2;
    private final AdvancedModelRendererExtended wingmembraneend3;
    private final AdvancedModelRendererExtended lefthand;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended throat;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended rightleg;
    private final AdvancedModelRendererExtended rightleg2;
    private final AdvancedModelRendererExtended rightfoot;
    private final AdvancedModelRendererExtended rightlegwing;
    private final AdvancedModelRendererExtended rightlegwing2;
    private final AdvancedModelRendererExtended leftleg;
    private final AdvancedModelRendererExtended leftleg2;
    private final AdvancedModelRendererExtended leftfoot;
    private final AdvancedModelRendererExtended leftlegwing;
    private final AdvancedModelRendererExtended leftlegwing2;

    private ModelAnimator animator;

    public ModelDearc() {

        this.textureWidth = 128;
        this.textureHeight = 100;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 13.25F, 0.5F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 1.25F, -5.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0305F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 33, -3.5F, -3.25F, -2.0F, 7, 8, 9, 0.0F, false));

        this.rightwing = new AdvancedModelRendererExtended(this);
        this.rightwing.setRotationPoint(-2.1F, -0.45F, -1.6F);
        this.chest.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.0F, -0.2182F, 0.0F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 33, 0, -6.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, false));

        this.rightwing2 = new AdvancedModelRendererExtended(this);
        this.rightwing2.setRotationPoint(-5.2F, 0.1F, -0.7F);
        this.rightwing.addChild(rightwing2);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 12, 50, -0.5F, 0.0F, 0.0F, 1, 10, 3, 0.0F, false));

        this.wingmembranebeg = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg.setRotationPoint(9.3F, 11.6F, 7.0F);
        this.rightwing2.addChild(wingmembranebeg);
        this.wingmembranebeg.cubeList.add(new ModelBox(wingmembranebeg, 0, 50, -9.8F, -12.6F, -4.0F, 1, 11, 5, 0.0F, false));

        this.wingmembranebeg5 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg5.setRotationPoint(14.6F, 4.0F, 8.0F);
        this.rightwing2.addChild(wingmembranebeg5);
        this.setRotateAngle(wingmembranebeg5, -1.5625F, 0.7387F, 0.4478F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.65F, 13.025F, 4.725F);
        this.wingmembranebeg5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2938F, -0.0295F, 0.0363F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 46, -9.3F, -13.75F, -4.0F, 0, 12, 8, 0.0F, false));

        this.rightwing3 = new AdvancedModelRendererExtended(this);
        this.rightwing3.setRotationPoint(-0.075F, 9.9F, 0.05F);
        this.rightwing2.addChild(rightwing3);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 12, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, false));

        this.wingmembranemiddle = new AdvancedModelRendererExtended(this);
        this.wingmembranemiddle.setRotationPoint(1.4F, -0.4F, 6.7F);
        this.rightwing3.addChild(wingmembranemiddle);
        this.wingmembranemiddle.cubeList.add(new ModelBox(wingmembranemiddle, 0, 66, -1.9F, -6.575F, -6.7F, 1, 4, 9, -0.01F, false));

        this.wingmembranemiddle5 = new AdvancedModelRendererExtended(this);
        this.wingmembranemiddle5.setRotationPoint(13.35F, -0.9F, 6.7F);
        this.rightwing3.addChild(wingmembranemiddle5);
        this.wingmembranemiddle5.cubeList.add(new ModelBox(wingmembranemiddle5, 92, 76, -13.35F, -9.575F, -5.7F, 0, 4, 9, 0.0F, false));

        this.rightwing4 = new AdvancedModelRendererExtended(this);
        this.rightwing4.setRotationPoint(0.1F, 0.0F, 8.7F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.1345F, 0.0F, 0.0F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 31, 0.0F, false));

        this.wingmembraneend = new AdvancedModelRendererExtended(this);
        this.wingmembraneend.setRotationPoint(0.3F, -1.4F, 30.0F);
        this.rightwing4.addChild(wingmembraneend);
        this.wingmembraneend.cubeList.add(new ModelBox(wingmembraneend, 0, 61, -0.8F, -4.575F, -30.0F, 1, 4, 31, -0.01F, false));

        this.wingmembraneend5 = new AdvancedModelRendererExtended(this);
        this.wingmembraneend5.setRotationPoint(14.55F, -6.475F, 7.5F);
        this.rightwing4.addChild(wingmembraneend5);
        this.wingmembraneend5.cubeList.add(new ModelBox(wingmembraneend5, 80, 77, -14.55F, 2.0F, -7.5F, 0, 4, 15, 0.0F, false));

        this.righthand = new AdvancedModelRendererExtended(this);
        this.righthand.setRotationPoint(0.0F, -0.4F, 0.55F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, 0.0127F, 0.5165F, 3.1322F);
        this.righthand.cubeList.add(new ModelBox(righthand, 33, 5, -1.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.leftwing = new AdvancedModelRendererExtended(this);
        this.leftwing.setRotationPoint(2.1F, -0.45F, -1.6F);
        this.chest.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.0F, 0.2182F, 0.0F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 33, 0, -2.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, true));

        this.leftwing2 = new AdvancedModelRendererExtended(this);
        this.leftwing2.setRotationPoint(5.2F, 0.1F, -0.7F);
        this.leftwing.addChild(leftwing2);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 12, 50, -0.5F, 0.0F, 0.0F, 1, 10, 3, 0.0F, true));

        this.wingmembranebeg2 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg2.setRotationPoint(-9.3F, 11.6F, 7.0F);
        this.leftwing2.addChild(wingmembranebeg2);
        this.wingmembranebeg2.cubeList.add(new ModelBox(wingmembranebeg2, 0, 50, 8.8F, -12.6F, -4.0F, 1, 11, 5, 0.0F, true));

        this.wingmembranebeg6 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg6.setRotationPoint(0.0F, 4.0F, 8.0F);
        this.leftwing2.addChild(wingmembranebeg6);
        this.setRotateAngle(wingmembranebeg6, -1.5625F, -0.7387F, -0.4478F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.9413F, -10.4F, -3.55F);
        this.wingmembranebeg6.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3176F, 0.116F, 0.0244F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 66, 46, -0.4F, 0.4397F, -5.1614F, 0, 12, 8, 0.0F, true));

        this.leftwing3 = new AdvancedModelRendererExtended(this);
        this.leftwing3.setRotationPoint(0.075F, 9.9F, 0.05F);
        this.leftwing2.addChild(leftwing3);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 12, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, true));

        this.wingmembranemiddle2 = new AdvancedModelRendererExtended(this);
        this.wingmembranemiddle2.setRotationPoint(-1.4F, -0.4F, 6.7F);
        this.leftwing3.addChild(wingmembranemiddle2);
        this.wingmembranemiddle2.cubeList.add(new ModelBox(wingmembranemiddle2, 0, 66, 0.9F, -6.575F, -6.7F, 1, 4, 9, -0.01F, true));

        this.wingmembranemiddle3 = new AdvancedModelRendererExtended(this);
        this.wingmembranemiddle3.setRotationPoint(-1.4F, -0.9F, 6.7F);
        this.leftwing3.addChild(wingmembranemiddle3);
        this.wingmembranemiddle3.cubeList.add(new ModelBox(wingmembranemiddle3, 92, 76, 1.4F, -9.575F, -5.7F, 0, 4, 9, 0.0F, true));

        this.leftwing4 = new AdvancedModelRendererExtended(this);
        this.leftwing4.setRotationPoint(-0.1F, 0.0F, 8.7F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.1345F, 0.0F, 0.0F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 31, 0.0F, true));

        this.wingmembraneend2 = new AdvancedModelRendererExtended(this);
        this.wingmembraneend2.setRotationPoint(-0.3F, -1.4F, 30.0F);
        this.leftwing4.addChild(wingmembraneend2);
        this.wingmembraneend2.cubeList.add(new ModelBox(wingmembraneend2, 0, 61, -0.2F, -4.575F, -30.0F, 1, 4, 31, -0.01F, true));

        this.wingmembraneend3 = new AdvancedModelRendererExtended(this);
        this.wingmembraneend3.setRotationPoint(0.0F, -6.475F, 7.5F);
        this.leftwing4.addChild(wingmembraneend3);
        this.wingmembraneend3.cubeList.add(new ModelBox(wingmembraneend3, 80, 77, 0.0F, 2.0F, -7.5F, 0, 4, 15, 0.0F, true));

        this.lefthand = new AdvancedModelRendererExtended(this);
        this.lefthand.setRotationPoint(0.0F, -0.4F, 0.55F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0127F, -0.5165F, -3.1322F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 33, 5, -0.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -0.75F, -1.3F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 32, 33, -2.5F, -2.0F, -4.0F, 5, 7, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -0.8F, -3.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 32, 44, -2.0F, -1.0F, -5.0F, 4, 6, 5, -0.03F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, -0.15F, -4.525F);
        this.neck2.addChild(head2);
        this.setRotateAngle(head2, 0.3927F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 50, 45, -2.0F, -1.0F, -3.0F, 4, 3, 3, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1309F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 33, 12, -1.5F, -2.0F, -5.0F, 3, 2, 7, 0.002F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.head3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.096F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 24, -1.5F, -0.0404F, -6.0691F, 3, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.5F, 0.0F, -3.5F);
        this.head3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.1309F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 17, 0.0F, -0.5F, -1.4F, 0, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.0F, -3.5F);
        this.head3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.1309F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 17, 0.0F, -0.5F, -1.4F, 0, 1, 3, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, 1.0F, -4.825F);
        this.head3.addChild(head4);
        this.head4.cubeList.add(new ModelBox(head4, 36, 55, -1.0F, -2.0F, -4.1F, 2, 1, 4, 0.0F, false));
        this.head4.cubeList.add(new ModelBox(head4, 52, 52, -0.5F, -1.9927F, -8.9156F, 1, 1, 5, -0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.5F, -0.9927F, -8.4156F);
        this.head4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, -0.2618F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 16, 0.0F, -0.425F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.5F, -0.9927F, -6.4156F);
        this.head4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, -0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 11, 0.0F, -0.15F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.5F, -0.9927F, -4.4156F);
        this.head4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1411F, -0.013F, -0.2054F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 11, 0.0F, -0.325F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(1.0F, -0.9927F, -2.4156F);
        this.head4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, -0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -0.15F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(1.0F, -1.0F, -0.85F);
        this.head4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.0873F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -0.5F, -0.825F, 0, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-1.0F, -0.9927F, -2.4156F);
        this.head4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -0.15F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.9927F, -4.4156F);
        this.head4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1411F, 0.013F, 0.2054F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 11, 0.0F, -0.325F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.9927F, -6.4156F);
        this.head4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.2618F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 11, 0.0F, -0.15F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.9927F, -8.4156F);
        this.head4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5236F, 0.0F, 0.2618F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 16, 0.0F, -0.425F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-1.0F, -1.0F, -0.85F);
        this.head4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.0873F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, -0.5F, -0.825F, 0, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -3.2881F, -4.1747F);
        this.head4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1963F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 24, -0.5F, 0.8055F, -1.9924F, 1, 1, 2, -0.02F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -3.2881F, -4.1747F);
        this.head4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1222F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 51, -0.5F, 0.3805F, -4.8924F, 1, 1, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, -3.7131F, -0.2747F);
        this.head4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1353F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 33, 0, -0.5F, 0.2877F, -3.9154F, 1, 1, 4, -0.001F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(-0.001F, -2.0008F, -7.0012F);
        this.head4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.144F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 18, -0.999F, 0.0F, 2.8F, 2, 1, 5, -0.001F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.head2.addChild(jaw);
        this.setRotateAngle(jaw, 0.0044F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 26, -2.0F, 0.0F, -1.0F, 4, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 23, 33, -1.5F, -0.7F, -1.0F, 3, 1, 3, -0.02F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 53, 33, -0.5F, -0.05F, -13.725F, 1, 1, 5, -0.02F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 53, 39, -1.0F, -0.025F, -8.95F, 2, 1, 4, -0.02F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 44, 25, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 23, 26, -1.5F, 0.0F, -2.5F, 3, 1, 1, -0.001F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 17, -1.0F, -1.85F, -0.9F, 2, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.475F, -0.0644F, -12.1511F);
        this.jaw2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6545F, 0.0F, 0.2618F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 11, 0.0F, -2.3F, -0.5F, 0, 3, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.5F, -0.0676F, -10.1195F);
        this.jaw2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4363F, 0.0F, 0.48F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 0, -0.025F, -1.7486F, -0.5371F, 0, 2, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.975F, 0.025F, -8.45F);
        this.jaw2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.2618F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 16, 0.0F, -1.4F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.925F, -0.154F, -6.4299F);
        this.jaw2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0692F, 0.0F, 0.6557F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 1, 0.125F, -0.5F, -0.125F, 0, 1, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(1.5F, 0.0F, -4.0F);
        this.jaw2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3927F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 2, 0.0F, -0.375F, -0.5F, 0, 1, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(-1.5F, 0.0F, -4.0F);
        this.jaw2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.3927F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 2, 0.0F, -0.375F, -0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(-0.925F, -0.154F, -6.4299F);
        this.jaw2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0692F, 0.0F, -0.6557F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 1, -0.125F, -0.5F, -0.125F, 0, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(-0.975F, 0.025F, -8.45F);
        this.jaw2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2618F, 0.0F, -0.2618F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 17, 16, 0.0F, -1.4F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(-0.475F, -0.0644F, -12.1511F);
        this.jaw2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.6545F, 0.0F, -0.2618F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 11, 0.0F, -2.3F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(-0.5F, -0.0676F, -10.1195F);
        this.jaw2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4363F, 0.0F, -0.48F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 17, 0, 0.025F, -1.7486F, -0.5371F, 0, 2, 1, 0.0F, false));

        this.throat = new AdvancedModelRendererExtended(this);
        this.throat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw2.addChild(throat);


        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(0.0F, 1.525F, 0.3F);
        this.throat.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2487F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 46, 12, -1.5F, -1.15F, -1.5F, 3, 2, 4, -0.01F, false));

        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(0.0F, 0.9436F, -3.1377F);
        this.throat.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2487F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 17, 0, -1.5F, -0.45F, -2.0F, 3, 1, 4, -0.01F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, -0.95F, 5.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0412F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -3.0F, -1.9962F, 1.0F, 6, 7, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.0712F, 4.8F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.0654F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 33, 21, -2.0F, -1.4545F, 0.001F, 4, 5, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.1955F, 3.601F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 18, -1.0F, -1.0911F, 0.0021F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.1661F, 5.9021F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0698F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 55, 24, -0.5F, -0.5342F, -0.7492F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.0342F, 3.9508F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0654F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 55, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1091F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 11, 4, 0.0F, -2.5F, 0.0F, 0, 5, 8, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 45, 38, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.rightleg = new AdvancedModelRendererExtended(this);
        this.rightleg.setRotationPoint(-2.0F, 1.3038F, 2.9F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.1F, -0.0083F, 0.4752F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 33, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.rightleg2 = new AdvancedModelRendererExtended(this);
        this.rightleg2.setRotationPoint(-0.1F, 4.95F, 0.2F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.8575F, 0.1001F, -0.3975F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 26, 16, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.rightfoot = new AdvancedModelRendererExtended(this);
        this.rightfoot.setRotationPoint(0.0F, 6.6F, 0.45F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.8626F, -0.1396F, 0.0351F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 20, 50, -1.1954F, -0.2176F, -4.6667F, 2, 1, 5, 0.0F, false));

        this.rightlegwing = new AdvancedModelRendererExtended(this);
        this.rightlegwing.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.rightleg2.addChild(rightlegwing);
        this.rightlegwing.cubeList.add(new ModelBox(rightlegwing, 22, 2, 0.0F, 0.0F, 0.0F, 0, 7, 3, 0.001F, false));

        this.rightlegwing2 = new AdvancedModelRendererExtended(this);
        this.rightlegwing2.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.rightleg.addChild(rightlegwing2);
        this.rightlegwing2.cubeList.add(new ModelBox(rightlegwing2, 0, 12, -0.5F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRendererExtended(this);
        this.leftleg.setRotationPoint(2.0F, 1.3038F, 2.9F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.1F, -0.0083F, -0.4752F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 33, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.leftleg2 = new AdvancedModelRendererExtended(this);
        this.leftleg2.setRotationPoint(0.1F, 4.95F, 0.2F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.8575F, -0.1001F, 0.3975F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 26, 16, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, true));

        this.leftfoot = new AdvancedModelRendererExtended(this);
        this.leftfoot.setRotationPoint(0.0F, 6.6F, 0.45F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.8626F, 0.1396F, -0.0351F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 20, 50, -0.8046F, -0.2176F, -4.6667F, 2, 1, 5, 0.0F, true));

        this.leftlegwing = new AdvancedModelRendererExtended(this);
        this.leftlegwing.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.leftleg2.addChild(leftlegwing);
        this.leftlegwing.cubeList.add(new ModelBox(leftlegwing, 22, 2, 0.0F, 0.0F, 0.0F, 0, 7, 3, 0.001F, true));

        this.leftlegwing2 = new AdvancedModelRendererExtended(this);
        this.leftlegwing2.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.leftleg.addChild(leftlegwing2);
        this.leftlegwing2.cubeList.add(new ModelBox(leftlegwing2, 0, 12, -0.5F, 0.0F, 0.0F, 1, 5, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(head2, 0.6F, -0.0F, -0.2F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing, -0.0F, 0.4F, -0.4F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(leftwing3, -1.3F, 0.0F, 0.5F);
        this.setRotateAngle(leftwing4, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(lefthand, 0.0F,-0.0F, 1.5F);
        this.setRotateAngle(rightwing, 0.0F, -0.4F, 0.4F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(rightwing3, -1.3F, 0.0F, -0.5F);
        this.setRotateAngle(rightwing4, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(righthand, 0.0F,0.0F, 0.0F);
        this.body1.setScale(0,0,0);
        this.body1.setScale(0,0,0);
        this.body1.scaleChildren = true;
        this.root.offsetY = -0.15F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = -0.09F;
        this.root.render(0.01F);
        this.body1.setScale(1,1,1);
        this.body1.setScale(1,1,1);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.1F, 0.0F, -0.1F);
        this.setRotateAngle(neck2, 0.0F, -0.3F, 0.1F);
        this.setRotateAngle(head2, -0.2F, 0.4F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.3F, -0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, -0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(tail5, 0.1F, -0.4F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.1F, -0.2F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(leftwing3, 0.0F, 0.0F, 0.03F);
        this.setRotateAngle(leftwing4, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, -0.1F, 0.3F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing3, 0.0F, 0.0F, -0.02F);
        this.setRotateAngle(rightwing4, 1.0F, 0.0F, 0.0F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.root.offsetY = -0.01F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.1F;
        this.root.offsetX = 0.5F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(10);
        this.root.rotateAngleZ = (float)Math.toRadians(2);
        this.root.scaleChildren = true;
        float scaler = 1.5F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(chest, 0.0F, 1.0F, 0.0F);
        this.setRotateAngle(body1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.1F, 0.0F, -0.1F);
        this.setRotateAngle(neck2, 0.0F, -0.3F, 0.1F);
        this.setRotateAngle(head2, -0.2F, 0.4F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.5F, -0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.4F, -0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(tail5, 0.1F, -0.4F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.1F, -0.2F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(leftwing3, 0.0F, 0.0F, 0.03F);
        this.setRotateAngle(leftwing4, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, -0.1F, 0.3F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing3, 0.0F, 0.0F, -0.02F);
        this.setRotateAngle(rightwing4, 1.0F, 0.0F, 0.0F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;
        if (flier.isReallyFlying() || flier.getAnimation() == flier.UNFLY_ANIMATION) {
            //flight pose

        } else if (flier.getAttachmentPos() != null) {
            if (flier.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose

            }
        }

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.48F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 8, neck);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head2);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 8, head2);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDearc ee = (EntityPrehistoricFloraDearc) entitylivingbaseIn;

        if (ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //Special case here as we don't have the models done properly :/

        }
        else if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {

            //flight pose
            //Already baked into the animations based on the default pose for this model
        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose
                //Rhampho does not climb
            }
        }

        if (ee.getAttachmentPos() == null) { //set wing membranes to their proper scale for flight
            this.wingmembranebeg.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranemiddle.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembraneend.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranebeg2.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranemiddle2.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembraneend2.setScale((float) 1, (float) 1, (float) 1);
            this.throat.setScale((float) 1, (float) 1, (float) 1);
        }

        if (ee.getAttachmentPos() == null && ee.getAnimation() != ee.FLY_ANIMATION) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Flying fast
                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else { //Flying regular
                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
            else { //Flying regular but stright upwards
                animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Walking fast
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else { //Walking regular
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
            else if (!ee.getHeadCollided()){
                //Climbing
                //animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                //Rhampho does not climb
            }
        }

        if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) { //The noise anim
            animPreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.RELAX_ANIMATION) { //The noise anim
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDearc entity = (EntityPrehistoricFloraDearc) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 5) / 4) * (0-(1)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0.25 + (((tickAnim - 5) / 4) * (0-(0.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -18.5 + (((tickAnim - 5) / 4) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 20 + (((tickAnim - 5) / 2) * (0-(20)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (4.25-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 4.25 + (((tickAnim - 8) / 0) * (0-(4.25)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (4.25-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 4.25 + (((tickAnim - 9) / 1) * (0-(4.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDearc entity = (EntityPrehistoricFloraDearc) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-0.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*7.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*7.5 + (((tickAnim - 5) / 15) * (8.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*7.5)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 8.5 + (((tickAnim - 20) / 5) * (6.25-(8.5)));
            yy = 10 + (((tickAnim - 20) / 5) * (-10-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (-5-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 25) / 10) * (3.25-(6.25)));
            yy = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
            zz = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 3.25 + (((tickAnim - 35) / 5) * (0-(3.25)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5 + (((tickAnim - 5) / 15) * (-12-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12 + (((tickAnim - 20) / 5) * (-11.69148-(-12)));
            yy = 10 + (((tickAnim - 20) / 5) * (-7.64497-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (1.13144-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -11.69148 + (((tickAnim - 25) / 10) * (-11.69148-(-11.69148)));
            yy = -7.64497 + (((tickAnim - 25) / 10) * (-7.64497-(-7.64497)));
            zz = 1.13144 + (((tickAnim - 25) / 10) * (1.13144-(1.13144)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -11.69148 + (((tickAnim - 35) / 5) * (0-(-11.69148)));
            yy = -7.64497 + (((tickAnim - 35) / 5) * (0-(-7.64497)));
            zz = 1.13144 + (((tickAnim - 35) / 5) * (0-(1.13144)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.875-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = -0.4 + (((tickAnim - 5) / 30) * (-0.4-(-0.4)));
            zz = 0.875 + (((tickAnim - 5) / 30) * (0.875-(0.875)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 35) / 5) * (0-(-0.4)));
            zz = 0.875 + (((tickAnim - 35) / 5) * (0-(0.875)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembranemiddle.setScale((float)1,(float)0.3,(float)1);


        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(17), rightwing4.rotateAngleY + (float) Math.toRadians(0), rightwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.wingmembraneend.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 2) * (0-(0.425)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing.rotationPointX = this.leftwing.rotationPointX + (float)(xx);
        this.leftwing.rotationPointY = this.leftwing.rotationPointY - (float)(yy);
        this.leftwing.rotationPointZ = this.leftwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembranemiddle2.setScale((float)1,(float)0.3,(float)1);


        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(16), leftwing4.rotateAngleY + (float) Math.toRadians(0), leftwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.wingmembraneend2.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 5) / 15) * (14.36-(12)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 14.36 + (((tickAnim - 20) / 5) * (0-(14.36)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2 + (((tickAnim - 5) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2 + (((tickAnim - 25) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 18) / 22) * (0-(3.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 18) / 22) * (0-(3.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animPreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDearc entity = (EntityPrehistoricFloraDearc) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.5 + (((tickAnim - 8) / 2) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -3.5 + (((tickAnim - 10) / 30) * (-5.25-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 10) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5.25 + (((tickAnim - 40) / 5) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 40) / 5) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            yy = 0.65 + (((tickAnim - 8) / 32) * (0.65-(0.65)));
            zz = 0 + (((tickAnim - 8) / 32) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0.65 + (((tickAnim - 40) / 20) * (0-(0.65)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-4.9898-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-4.4256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-9.1848-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-4.9898 + (((tickAnim - 20) / 5) * (12.7514+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-4.9898)));
            yy = -4.4256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.6183-(-4.4256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-9.1848 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-16.5255-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-9.1848)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 12.7514+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 25) / 15) * (-0.0086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(12.7514+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.6183 + (((tickAnim - 25) / 15) * (6.86568-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.6183)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-16.5255 + (((tickAnim - 25) / 15) * (-5.25573-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-16.5255)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -0.0086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 40) / 5) * (0-(-0.0086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            yy = 6.86568 + (((tickAnim - 40) / 5) * (0-(6.86568)));
            zz = -5.25573 + (((tickAnim - 40) / 5) * (0-(-5.25573)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*6 + (((tickAnim - 8) / 2) * (0.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*6)));
            yy = -7 + (((tickAnim - 8) / 2) * (-18.99074-(-7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10.6042-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20 + (((tickAnim - 10) / 10) * (0.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20-(0.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20)));
            yy = -18.99074 + (((tickAnim - 10) / 10) * (-18.99074-(-18.99074)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10.6042 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10.6042-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10.6042)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20 + (((tickAnim - 20) / 5) * (21.0293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5-(0.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20)));
            yy = -18.99074 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-37.5342-(-18.99074)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10.6042 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-3.3121-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10.6042)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 21.0293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5 + (((tickAnim - 25) / 15) * (15.1445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5-(21.0293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-37.5342 + (((tickAnim - 25) / 15) * (-58.2447-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-37.5342)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-3.3121 + (((tickAnim - 25) / 15) * (-23.58162-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-3.3121)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 15.1445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5 + (((tickAnim - 40) / 5) * (0-(15.1445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5)));
            yy = -58.2447 + (((tickAnim - 40) / 5) * (0-(-58.2447)));
            zz = -23.58162 + (((tickAnim - 40) / 5) * (0-(-23.58162)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.72025-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.08038-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (-7.0208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.72025 + (((tickAnim - 8) / 2) * (4.72025-(4.72025)));
            yy = 0.08038 + (((tickAnim - 8) / 2) * (0.08038-(0.08038)));
            zz = -7.0208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (-7.0208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(-7.0208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 4.72025 + (((tickAnim - 10) / 30) * (7.44774-(4.72025)));
            yy = 0.08038 + (((tickAnim - 10) / 30) * (0.92092-(0.08038)));
            zz = -7.0208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 10) / 30) * (-3.1259+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-7.0208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 7.44774 + (((tickAnim - 40) / 5) * (0-(7.44774)));
            yy = 0.92092 + (((tickAnim - 40) / 5) * (0-(0.92092)));
            zz = -3.1259+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(-3.1259+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembranemiddle.setScale((float)1,(float)0.3,(float)1);


        this.wingmembraneend.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5)));
        }











        if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25 + (((tickAnim - 10) / 3) * (-0.0738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.26121-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-51.4993-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.0738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5 + (((tickAnim - 13) / 12) * (-1.6061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468-(-0.0738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5)));
            yy = 0.26121 + (((tickAnim - 13) / 12) * (-2.02862-(0.26121)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-51.4993 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-33.0737-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-51.4993)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -1.6061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468 + (((tickAnim - 25) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5-(-1.6061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468)));
            yy = -2.02862 + (((tickAnim - 25) / 15) * (0-(-2.02862)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-33.0737 + (((tickAnim - 25) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-33.0737)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembranemiddle2.setScale((float)1,(float)0.3,(float)1);


        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(15), leftwing4.rotateAngleY + (float) Math.toRadians(0), leftwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.wingmembraneend2.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-1 + (((tickAnim - 8) / 2) * (-21.2839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-1)));
            yy = 0 + (((tickAnim - 8) / 2) * (-29.51736-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*6.7211-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.2839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 10) / 10) * (8.4403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(-21.2839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = -29.51736 + (((tickAnim - 10) / 10) * (-35.63611-(-29.51736)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*6.7211 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-35.8589-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*6.7211)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 8.4403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 20) / 5) * (23.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5-(8.4403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = -35.63611 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15-(-35.63611)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-35.8589 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-35.8589)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 23.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5 + (((tickAnim - 25) / 15) * (30.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5-(23.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 25) / 15) * (-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 30.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5 + (((tickAnim - 40) / 5) * (0-(30.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5)));
            yy = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
            zz = -10 + (((tickAnim - 40) / 5) * (0-(-10)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10 + (((tickAnim - 25) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10 + (((tickAnim - 40) / 5) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (50.13587-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (-14.26331-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-56.00391-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = 50.13587 + (((tickAnim - 14) / 26) * (0-(50.13587)));
            yy = -14.26331 + (((tickAnim - 14) / 26) * (0-(-14.26331)));
            zz = -56.00391 + (((tickAnim - 14) / 26) * (0-(-56.00391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg6, wingmembranebeg6.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg6.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-3.05-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-0.55-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = -3.05 + (((tickAnim - 14) / 26) * (0-(-3.05)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = -0.55 + (((tickAnim - 14) / 26) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg6.rotationPointX = this.wingmembranebeg6.rotationPointX + (float)(xx);
        this.wingmembranebeg6.rotationPointY = this.wingmembranebeg6.rotationPointY - (float)(yy);
        this.wingmembranebeg6.rotationPointZ = this.wingmembranebeg6.rotationPointZ + (float)(zz);



    }

    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDearc entity = (EntityPrehistoricFloraDearc) entitylivingbaseIn;
        int animCycle = 113;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+80))*30-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = -10.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+80))*30 + (((tickAnim - 15) / 23) * (-52.5-(-10.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+80))*30)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -52.5 + (((tickAnim - 38) / 5) * (-45-(-52.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -45 + (((tickAnim - 43) / 5) * (-51.5-(-45)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -51.5 + (((tickAnim - 48) / 5) * (-45-(-51.5)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -45 + (((tickAnim - 53) / 5) * (-48.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.9))*-1-(-45)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = -48.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.9))*-1 + (((tickAnim - 58) / 32) * (-53.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*0.5-(-48.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.9))*-1)));
            yy = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 32) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = -53.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*0.5 + (((tickAnim - 90) / 12) * (-13.47588-(-53.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*0.5)));
            yy = 0 + (((tickAnim - 90) / 12) * (4.52521-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (8.3617-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = -13.47588 + (((tickAnim - 102) / 11) * (0-(-13.47588)));
            yy = 4.52521 + (((tickAnim - 102) / 11) * (0-(4.52521)));
            zz = 8.3617 + (((tickAnim - 102) / 11) * (0-(8.3617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (6.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-25))*-7-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            yy = 6.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-25))*-7 + (((tickAnim - 15) / 19) * (6.955-(6.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-25))*-7)));
            zz = 0 + (((tickAnim - 15) / 19) * (3.62-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 6.955 + (((tickAnim - 34) / 4) * (6.95-(6.955)));
            zz = 3.62 + (((tickAnim - 34) / 4) * (3.47-(3.62)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 6.95 + (((tickAnim - 38) / 5) * (6.95-(6.95)));
            zz = 3.47 + (((tickAnim - 38) / 5) * (4.47-(3.47)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            yy = 6.95 + (((tickAnim - 43) / 5) * (6.95-(6.95)));
            zz = 4.47 + (((tickAnim - 43) / 5) * (3.47-(4.47)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 6.95 + (((tickAnim - 48) / 5) * (6.95-(6.95)));
            zz = 3.47 + (((tickAnim - 48) / 5) * (4.47-(3.47)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            yy = 6.95 + (((tickAnim - 53) / 5) * (6.955-(6.95)));
            zz = 4.47 + (((tickAnim - 53) / 5) * (3.62-(4.47)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            yy = 6.955 + (((tickAnim - 58) / 32) * (6.955-(6.955)));
            zz = 3.62 + (((tickAnim - 58) / 32) * (3.62-(3.62)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            yy = 6.955 + (((tickAnim - 90) / 12) * (2.555-(6.955)));
            zz = 3.62 + (((tickAnim - 90) / 12) * (1.81-(3.62)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            yy = 2.555 + (((tickAnim - 102) / 11) * (0-(2.555)));
            zz = 1.81 + (((tickAnim - 102) / 11) * (0-(1.81)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.29726-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-5.75291-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (15.95435-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = 5.29726 + (((tickAnim - 13) / 21) * (-3.06367-(5.29726)));
            yy = -5.75291 + (((tickAnim - 13) / 21) * (-3.2147-(-5.75291)));
            zz = 15.95435 + (((tickAnim - 13) / 21) * (18.6912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-30-(15.95435)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -3.06367 + (((tickAnim - 34) / 3) * (2.57492-(-3.06367)));
            yy = -3.2147 + (((tickAnim - 34) / 3) * (-8.0075-(-3.2147)));
            zz = 18.6912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-30 + (((tickAnim - 34) / 3) * (36.5641-(18.6912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-30)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 2.57492 + (((tickAnim - 37) / 2) * (6.40033-(2.57492)));
            yy = -8.0075 + (((tickAnim - 37) / 2) * (-4.38089-(-8.0075)));
            zz = 36.5641 + (((tickAnim - 37) / 2) * (46.0301+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40-(36.5641)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 6.40033 + (((tickAnim - 39) / 4) * (-10.65342-(6.40033)));
            yy = -4.38089 + (((tickAnim - 39) / 4) * (-17.4589-(-4.38089)));
            zz = 46.0301+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40 + (((tickAnim - 39) / 4) * (64.9454+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*80-(46.0301+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -10.65342 + (((tickAnim - 43) / 3) * (-3.06367-(-10.65342)));
            yy = -17.4589 + (((tickAnim - 43) / 3) * (-3.2147-(-17.4589)));
            zz = 64.9454+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*80 + (((tickAnim - 43) / 3) * (29.8662-(64.9454+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*80)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -3.06367 + (((tickAnim - 46) / 2) * (2.57492-(-3.06367)));
            yy = -3.2147 + (((tickAnim - 46) / 2) * (-8.0075-(-3.2147)));
            zz = 29.8662 + (((tickAnim - 46) / 2) * (36.5641-(29.8662)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 2.57492 + (((tickAnim - 48) / 2) * (2.72744-(2.57492)));
            yy = -8.0075 + (((tickAnim - 48) / 2) * (-5.3196-(-8.0075)));
            zz = 36.5641 + (((tickAnim - 48) / 2) * (23.1279-(36.5641)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 2.72744 + (((tickAnim - 50) / 3) * (-10.65342-(2.72744)));
            yy = -5.3196 + (((tickAnim - 50) / 3) * (-17.4589-(-5.3196)));
            zz = 23.1279 + (((tickAnim - 50) / 3) * (-11.9046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(23.1279)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -10.65342 + (((tickAnim - 53) / 7) * (-8.03321-(-10.65342)));
            yy = -17.4589 + (((tickAnim - 53) / 7) * (-8.50206-(-17.4589)));
            zz = -11.9046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 53) / 7) * (6.5567+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30-(-11.9046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = -8.03321 + (((tickAnim - 60) / 12) * (1.33161-(-8.03321)));
            yy = -8.50206 + (((tickAnim - 60) / 12) * (-8.89289-(-8.50206)));
            zz = 6.5567+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30 + (((tickAnim - 60) / 12) * (17.7413+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*20-(6.5567+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30)));
        }
        else if (tickAnim >= 72 && tickAnim < 88) {
            xx = 1.33161 + (((tickAnim - 72) / 16) * (-1.12646-(1.33161)));
            yy = -8.89289 + (((tickAnim - 72) / 16) * (-5.49782-(-8.89289)));
            zz = 17.7413+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*20 + (((tickAnim - 72) / 16) * (27.46635-(17.7413+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*20)));
        }
        else if (tickAnim >= 88 && tickAnim < 113) {
            xx = -1.12646 + (((tickAnim - 88) / 25) * (0-(-1.12646)));
            yy = -5.49782 + (((tickAnim - 88) / 25) * (0-(-5.49782)));
            zz = 27.46635 + (((tickAnim - 88) / 25) * (0-(27.46635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 13) / 21) * (0-(0)));
            yy = -0.9 + (((tickAnim - 13) / 21) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 13) / 21) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing.rotationPointX = this.rightwing.rotationPointX + (float)(xx);
        this.rightwing.rotationPointY = this.rightwing.rotationPointY - (float)(yy);
        this.rightwing.rotationPointZ = this.rightwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-16.95-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-10.367-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0.04003-(0)));
            zz = -16.95 + (((tickAnim - 13) / 12) * (81.03869-(-16.95)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -10.367 + (((tickAnim - 25) / 9) * (-6.8749-(-10.367)));
            yy = 0.04003 + (((tickAnim - 25) / 9) * (-1.6081-(0.04003)));
            zz = 81.03869 + (((tickAnim - 25) / 9) * (102.3933-(81.03869)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -6.8749 + (((tickAnim - 34) / 3) * (-6.65272-(-6.8749)));
            yy = -1.6081 + (((tickAnim - 34) / 3) * (2.84039-(-1.6081)));
            zz = 102.3933 + (((tickAnim - 34) / 3) * (109.4598-(102.3933)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -6.65272 + (((tickAnim - 37) / 2) * (-4.74098-(-6.65272)));
            yy = 2.84039 + (((tickAnim - 37) / 2) * (5.46641-(2.84039)));
            zz = 109.4598 + (((tickAnim - 37) / 2) * (83.5211-(109.4598)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -4.74098 + (((tickAnim - 39) / 4) * (-2.16237-(-4.74098)));
            yy = 5.46641 + (((tickAnim - 39) / 4) * (-4.4929-(5.46641)));
            zz = 83.5211 + (((tickAnim - 39) / 4) * (88.1608-(83.5211)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -2.16237 + (((tickAnim - 43) / 3) * (-6.8749-(-2.16237)));
            yy = -4.4929 + (((tickAnim - 43) / 3) * (1.6081-(-4.4929)));
            zz = 88.1608 + (((tickAnim - 43) / 3) * (102.3933-(88.1608)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -6.8749 + (((tickAnim - 46) / 2) * (-6.65272-(-6.8749)));
            yy = 1.6081 + (((tickAnim - 46) / 2) * (2.84039-(1.6081)));
            zz = 102.3933 + (((tickAnim - 46) / 2) * (109.4598-(102.3933)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = -6.65272 + (((tickAnim - 48) / 3) * (-4.74098-(-6.65272)));
            yy = 2.84039 + (((tickAnim - 48) / 3) * (5.46641-(2.84039)));
            zz = 109.4598 + (((tickAnim - 48) / 3) * (83.5211-(109.4598)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -4.74098 + (((tickAnim - 51) / 5) * (-2.16237-(-4.74098)));
            yy = 5.46641 + (((tickAnim - 51) / 5) * (-4.4929-(5.46641)));
            zz = 83.5211 + (((tickAnim - 51) / 5) * (88.1608-(83.5211)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = -2.16237 + (((tickAnim - 56) / 2) * (-11.3749-(-2.16237)));
            yy = -4.4929 + (((tickAnim - 56) / 2) * (-1.6081-(-4.4929)));
            zz = 88.1608 + (((tickAnim - 56) / 2) * (102.3933-(88.1608)));
        }
        else if (tickAnim >= 58 && tickAnim < 72) {
            xx = -11.3749 + (((tickAnim - 58) / 14) * (-12.6249-(-11.3749)));
            yy = -1.6081 + (((tickAnim - 58) / 14) * (-1.6081-(-1.6081)));
            zz = 102.3933 + (((tickAnim - 58) / 14) * (102.3933-(102.3933)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = -12.6249 + (((tickAnim - 72) / 18) * (-12.6249-(-12.6249)));
            yy = -1.6081 + (((tickAnim - 72) / 18) * (-1.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.8-(-1.6081)));
            zz = 102.3933 + (((tickAnim - 72) / 18) * (102.3933-(102.3933)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = -12.6249 + (((tickAnim - 90) / 23) * (0-(-12.6249)));
            yy = -1.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.8 + (((tickAnim - 90) / 23) * (0-(-1.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.8)));
            zz = 102.3933 + (((tickAnim - 90) / 23) * (0-(102.3933)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 13) / 21) * (0-(0)));
            yy = -0.95 + (((tickAnim - 13) / 21) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 13) / 21) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing2.rotationPointX = this.rightwing2.rotationPointX + (float)(xx);
        this.rightwing2.rotationPointY = this.rightwing2.rotationPointY - (float)(yy);
        this.rightwing2.rotationPointZ = this.rightwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = -5.5 + (((tickAnim - 13) / 21) * (-74.4768-(-5.5)));
            yy = 0 + (((tickAnim - 13) / 21) * (0.9344-(0)));
            zz = 0 + (((tickAnim - 13) / 21) * (-21.2225-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -74.4768 + (((tickAnim - 34) / 3) * (-74.64254-(-74.4768)));
            yy = 0.9344 + (((tickAnim - 34) / 3) * (-0.9344-(0.9344)));
            zz = -21.2225 + (((tickAnim - 34) / 3) * (-21.2225-(-21.2225)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -74.64254 + (((tickAnim - 37) / 2) * (-76.61872-(-74.64254)));
            yy = -0.9344 + (((tickAnim - 37) / 2) * (-4.2599-(-0.9344)));
            zz = -21.2225 + (((tickAnim - 37) / 2) * (25.4818-(-21.2225)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -76.61872 + (((tickAnim - 39) / 4) * (-87.75513-(-76.61872)));
            yy = -4.2599 + (((tickAnim - 39) / 4) * (0.9344-(-4.2599)));
            zz = 25.4818 + (((tickAnim - 39) / 4) * (-21.2225-(25.4818)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -87.75513 + (((tickAnim - 43) / 3) * (-74.4768-(-87.75513)));
            yy = 0.9344 + (((tickAnim - 43) / 3) * (0.9344-(0.9344)));
            zz = -21.2225 + (((tickAnim - 43) / 3) * (-21.2225-(-21.2225)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -74.4768 + (((tickAnim - 46) / 2) * (-74.64254-(-74.4768)));
            yy = 0.9344 + (((tickAnim - 46) / 2) * (-0.9344-(0.9344)));
            zz = -21.2225 + (((tickAnim - 46) / 2) * (-21.2225-(-21.2225)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -74.64254 + (((tickAnim - 48) / 2) * (-76.61872-(-74.64254)));
            yy = -0.9344 + (((tickAnim - 48) / 2) * (-4.2599-(-0.9344)));
            zz = -21.2225 + (((tickAnim - 48) / 2) * (25.4818-(-21.2225)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -76.61872 + (((tickAnim - 50) / 5) * (-87.75513-(-76.61872)));
            yy = -4.2599 + (((tickAnim - 50) / 5) * (0.9344-(-4.2599)));
            zz = 25.4818 + (((tickAnim - 50) / 5) * (-21.2225-(25.4818)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -87.75513 + (((tickAnim - 55) / 3) * (-74.79575-(-87.75513)));
            yy = 0.9344 + (((tickAnim - 55) / 3) * (-1.02742-(0.9344)));
            zz = -21.2225 + (((tickAnim - 55) / 3) * (-5.68662-(-21.2225)));
        }
        else if (tickAnim >= 58 && tickAnim < 72) {
            xx = -74.79575 + (((tickAnim - 58) / 14) * (-72.79575-(-74.79575)));
            yy = -1.02742 + (((tickAnim - 58) / 14) * (-1.02742-(-1.02742)));
            zz = -5.68662 + (((tickAnim - 58) / 14) * (-5.68662-(-5.68662)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = -72.79575 + (((tickAnim - 72) / 18) * (-72.79575-(-72.79575)));
            yy = -1.02742 + (((tickAnim - 72) / 18) * (-1.0274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*1.5-(-1.02742)));
            zz = -5.68662 + (((tickAnim - 72) / 18) * (-5.68662-(-5.68662)));
        }
        else if (tickAnim >= 90 && tickAnim < 99) {
            xx = -72.79575 + (((tickAnim - 90) / 9) * (-24.51139-(-72.79575)));
            yy = -1.0274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*1.5 + (((tickAnim - 90) / 9) * (0.84528-(-1.0274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*1.5)));
            zz = -5.68662 + (((tickAnim - 90) / 9) * (2.08502-(-5.68662)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = -24.51139 + (((tickAnim - 99) / 14) * (0-(-24.51139)));
            yy = 0.84528 + (((tickAnim - 99) / 14) * (0-(0.84528)));
            zz = 2.08502 + (((tickAnim - 99) / 14) * (0-(2.08502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 0.3 + (((tickAnim - 0) / 15) * (0.3-(0.3)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 15) / 19) * (1-(1)));
            yy = 0.3 + (((tickAnim - 15) / 19) * (1-(0.3)));
            zz = 1 + (((tickAnim - 15) / 19) * (1-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 34) / 56) * (1-(1)));
            yy = 1 + (((tickAnim - 34) / 56) * (1-(1)));
            zz = 1 + (((tickAnim - 34) / 56) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 90) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 23) * (0.3-(1)));
            zz = 1 + (((tickAnim - 90) / 23) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.wingmembranemiddle.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 15.75 + (((tickAnim - 13) / 7) * (-16.44279-(15.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (-8.78786-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-19.23434-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -16.44279 + (((tickAnim - 20) / 13) * (-42.37798-(-16.44279)));
            yy = -8.78786 + (((tickAnim - 20) / 13) * (26.9234-(-8.78786)));
            zz = -19.23434 + (((tickAnim - 20) / 13) * (2.2682-(-19.23434)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -42.37798 + (((tickAnim - 33) / 4) * (-44.81138-(-42.37798)));
            yy = 26.9234 + (((tickAnim - 33) / 4) * (-6.40297-(26.9234)));
            zz = 2.2682 + (((tickAnim - 33) / 4) * (6.06893-(2.2682)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -44.81138 + (((tickAnim - 37) / 3) * (-61.47357-(-44.81138)));
            yy = -6.40297 + (((tickAnim - 37) / 3) * (-19.3425-(-6.40297)));
            zz = 6.06893 + (((tickAnim - 37) / 3) * (2.30843-(6.06893)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -61.47357 + (((tickAnim - 40) / 3) * (-60.36994-(-61.47357)));
            yy = -19.3425 + (((tickAnim - 40) / 3) * (44.0299-(-19.3425)));
            zz = 2.30843 + (((tickAnim - 40) / 3) * (2.0826-(2.30843)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -60.36994 + (((tickAnim - 43) / 3) * (-42.37798-(-60.36994)));
            yy = 44.0299 + (((tickAnim - 43) / 3) * (26.9234-(44.0299)));
            zz = 2.0826 + (((tickAnim - 43) / 3) * (2.2682-(2.0826)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -42.37798 + (((tickAnim - 46) / 2) * (-44.81138-(-42.37798)));
            yy = 26.9234 + (((tickAnim - 46) / 2) * (-6.40297-(26.9234)));
            zz = 2.2682 + (((tickAnim - 46) / 2) * (-6.0689-(2.2682)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -44.81138 + (((tickAnim - 48) / 2) * (-61.47357-(-44.81138)));
            yy = -6.40297 + (((tickAnim - 48) / 2) * (-19.3425-(-6.40297)));
            zz = -6.0689 + (((tickAnim - 48) / 2) * (2.30843-(-6.0689)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -61.47357 + (((tickAnim - 50) / 5) * (-60.36994-(-61.47357)));
            yy = -19.3425 + (((tickAnim - 50) / 5) * (44.0299-(-19.3425)));
            zz = 2.30843 + (((tickAnim - 50) / 5) * (-2.08257-(2.30843)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = -60.36994 + (((tickAnim - 55) / 17) * (-38.01409-(-60.36994)));
            yy = 44.0299 + (((tickAnim - 55) / 17) * (6.22929-(44.0299)));
            zz = -2.08257 + (((tickAnim - 55) / 17) * (4.90408-(-2.08257)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = -38.01409 + (((tickAnim - 72) / 18) * (-38.01409-(-38.01409)));
            yy = 6.22929 + (((tickAnim - 72) / 18) * (6.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+40))*1-(6.22929)));
            zz = 4.90408 + (((tickAnim - 72) / 18) * (4.90408-(4.90408)));
        }
        else if (tickAnim >= 90 && tickAnim < 99) {
            xx = -38.01409 + (((tickAnim - 90) / 9) * (-23.36404-(-38.01409)));
            yy = 6.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+40))*1 + (((tickAnim - 90) / 9) * (-8.1356-(6.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+40))*1)));
            zz = 4.90408 + (((tickAnim - 90) / 9) * (-7.5119-(4.90408)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = -23.36404 + (((tickAnim - 99) / 14) * (0-(-23.36404)));
            yy = -8.1356 + (((tickAnim - 99) / 14) * (0-(-8.1356)));
            zz = -7.5119 + (((tickAnim - 99) / 14) * (0-(-7.5119)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 0.1 + (((tickAnim - 0) / 15) * (0.1-(0.1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 15) / 19) * (1-(1)));
            yy = 0.1 + (((tickAnim - 15) / 19) * (1-(0.1)));
            zz = 1 + (((tickAnim - 15) / 19) * (1-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 34) / 56) * (1-(1)));
            yy = 1 + (((tickAnim - 34) / 56) * (1-(1)));
            zz = 1 + (((tickAnim - 34) / 56) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 90) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 23) * (0.1-(1)));
            zz = 1 + (((tickAnim - 90) / 23) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.wingmembraneend.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.85755-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (15.45014-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-21.47396-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = -3.85755 + (((tickAnim - 13) / 21) * (-3.06367-(-3.85755)));
            yy = 15.45014 + (((tickAnim - 13) / 21) * (3.21471-(15.45014)));
            zz = -21.47396 + (((tickAnim - 13) / 21) * (-29.86618-(-21.47396)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -3.06367 + (((tickAnim - 34) / 3) * (2.57492-(-3.06367)));
            yy = 3.21471 + (((tickAnim - 34) / 3) * (8.00749-(3.21471)));
            zz = -29.86618 + (((tickAnim - 34) / 3) * (-36.56407-(-29.86618)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 2.57492 + (((tickAnim - 37) / 2) * (2.72744-(2.57492)));
            yy = 8.00749 + (((tickAnim - 37) / 2) * (5.31959-(8.00749)));
            zz = -36.56407 + (((tickAnim - 37) / 2) * (-13.67792-(-36.56407)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 2.72744 + (((tickAnim - 39) / 4) * (-10.65342-(2.72744)));
            yy = 5.31959 + (((tickAnim - 39) / 4) * (17.45893-(5.31959)));
            zz = -13.67792 + (((tickAnim - 39) / 4) * (15.1046-(-13.67792)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -10.65342 + (((tickAnim - 43) / 3) * (-3.15816-(-10.65342)));
            yy = 17.45893 + (((tickAnim - 43) / 3) * (8.45698-(17.45893)));
            zz = 15.1046 + (((tickAnim - 43) / 3) * (-30.16622-(15.1046)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -3.15816 + (((tickAnim - 46) / 2) * (2.57492-(-3.15816)));
            yy = 8.45698 + (((tickAnim - 46) / 2) * (8.00749-(8.45698)));
            zz = -30.16622 + (((tickAnim - 46) / 2) * (-36.56407-(-30.16622)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 2.57492 + (((tickAnim - 48) / 2) * (2.72744-(2.57492)));
            yy = 8.00749 + (((tickAnim - 48) / 2) * (5.31959-(8.00749)));
            zz = -36.56407 + (((tickAnim - 48) / 2) * (-26.20292-(-36.56407)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 2.72744 + (((tickAnim - 50) / 4) * (-10.65342-(2.72744)));
            yy = 5.31959 + (((tickAnim - 50) / 4) * (17.45893-(5.31959)));
            zz = -26.20292 + (((tickAnim - 50) / 4) * (15.1046-(-26.20292)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = -10.65342 + (((tickAnim - 54) / 7) * (-3.18552-(-10.65342)));
            yy = 17.45893 + (((tickAnim - 54) / 7) * (9.7051-(17.45893)));
            zz = 15.1046 + (((tickAnim - 54) / 7) * (-19.6156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*20-(15.1046)));
        }
        else if (tickAnim >= 61 && tickAnim < 72) {
            xx = -3.18552 + (((tickAnim - 61) / 11) * (-4.52501-(-3.18552)));
            yy = 9.7051 + (((tickAnim - 61) / 11) * (7.79024-(9.7051)));
            zz = -19.6156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*20 + (((tickAnim - 61) / 11) * (1.0401+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(-19.6156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*20)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = -4.52501 + (((tickAnim - 72) / 18) * (-0.49131-(-4.52501)));
            yy = 7.79024 + (((tickAnim - 72) / 18) * (8.26236-(7.79024)));
            zz = 1.0401+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 72) / 18) * (-17.58981-(1.0401+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = -0.49131 + (((tickAnim - 90) / 12) * (9.46641-(-0.49131)));
            yy = 8.26236 + (((tickAnim - 90) / 12) * (1.23933-(8.26236)));
            zz = -17.58981 + (((tickAnim - 90) / 12) * (27.13404-(-17.58981)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 9.46641 + (((tickAnim - 102) / 11) * (0-(9.46641)));
            yy = 1.23933 + (((tickAnim - 102) / 11) * (0-(1.23933)));
            zz = 27.13404 + (((tickAnim - 102) / 11) * (0-(27.13404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 13) / 21) * (0-(0)));
            yy = -0.75 + (((tickAnim - 13) / 21) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 13) / 21) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing.rotationPointX = this.leftwing.rotationPointX + (float)(xx);
        this.leftwing.rotationPointY = this.leftwing.rotationPointY - (float)(yy);
        this.leftwing.rotationPointZ = this.leftwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.11737-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.22074-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (13.74977-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0.11737 + (((tickAnim - 13) / 12) * (-9.59776-(0.11737)));
            yy = -0.22074 + (((tickAnim - 13) / 12) * (-2.63631-(-0.22074)));
            zz = 13.74977 + (((tickAnim - 13) / 12) * (-78.29521-(13.74977)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -9.59776 + (((tickAnim - 25) / 9) * (-6.8749-(-9.59776)));
            yy = -2.63631 + (((tickAnim - 25) / 9) * (-1.6081-(-2.63631)));
            zz = -78.29521 + (((tickAnim - 25) / 9) * (-102.39327-(-78.29521)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -6.8749 + (((tickAnim - 34) / 3) * (-6.65272-(-6.8749)));
            yy = -1.6081 + (((tickAnim - 34) / 3) * (2.84039-(-1.6081)));
            zz = -102.39327 + (((tickAnim - 34) / 3) * (-109.45981-(-102.39327)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -6.65272 + (((tickAnim - 37) / 2) * (-4.74098-(-6.65272)));
            yy = 2.84039 + (((tickAnim - 37) / 2) * (5.46641-(2.84039)));
            zz = -109.45981 + (((tickAnim - 37) / 2) * (-83.52115-(-109.45981)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -4.74098 + (((tickAnim - 39) / 4) * (-2.16237-(-4.74098)));
            yy = 5.46641 + (((tickAnim - 39) / 4) * (-4.4929-(5.46641)));
            zz = -83.52115 + (((tickAnim - 39) / 4) * (-88.16082-(-83.52115)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -2.16237 + (((tickAnim - 43) / 3) * (-6.8749-(-2.16237)));
            yy = -4.4929 + (((tickAnim - 43) / 3) * (-1.6081-(-4.4929)));
            zz = -88.16082 + (((tickAnim - 43) / 3) * (-102.39327-(-88.16082)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -6.8749 + (((tickAnim - 46) / 2) * (-6.65272-(-6.8749)));
            yy = -1.6081 + (((tickAnim - 46) / 2) * (2.84039-(-1.6081)));
            zz = -102.39327 + (((tickAnim - 46) / 2) * (-109.45981-(-102.39327)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -6.65272 + (((tickAnim - 48) / 2) * (-4.74098-(-6.65272)));
            yy = 2.84039 + (((tickAnim - 48) / 2) * (5.46641-(2.84039)));
            zz = -109.45981 + (((tickAnim - 48) / 2) * (-83.52115-(-109.45981)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -4.74098 + (((tickAnim - 50) / 3) * (-2.16237-(-4.74098)));
            yy = 5.46641 + (((tickAnim - 50) / 3) * (-4.4929-(5.46641)));
            zz = -83.52115 + (((tickAnim - 50) / 3) * (-88.16082-(-83.52115)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -2.16237 + (((tickAnim - 53) / 7) * (-11.3749-(-2.16237)));
            yy = -4.4929 + (((tickAnim - 53) / 7) * (1.6081-(-4.4929)));
            zz = -88.16082 + (((tickAnim - 53) / 7) * (-102.3933-(-88.16082)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = -11.3749 + (((tickAnim - 60) / 12) * (-12.6249-(-11.3749)));
            yy = 1.6081 + (((tickAnim - 60) / 12) * (-1.6081-(1.6081)));
            zz = -102.3933 + (((tickAnim - 60) / 12) * (-102.3933-(-102.3933)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = -12.6249 + (((tickAnim - 72) / 18) * (-12.6249-(-12.6249)));
            yy = -1.6081 + (((tickAnim - 72) / 18) * (-1.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.8-(-1.6081)));
            zz = -102.3933 + (((tickAnim - 72) / 18) * (-102.3933-(-102.3933)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = -12.6249 + (((tickAnim - 90) / 12) * (14.40968-(-12.6249)));
            yy = -1.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.8 + (((tickAnim - 90) / 12) * (-4.9159-(-1.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.8)));
            zz = -102.3933 + (((tickAnim - 90) / 12) * (-35.71127-(-102.3933)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 14.40968 + (((tickAnim - 102) / 11) * (0-(14.40968)));
            yy = -4.9159 + (((tickAnim - 102) / 11) * (0-(-4.9159)));
            zz = -35.71127 + (((tickAnim - 102) / 11) * (0-(-35.71127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 13) / 21) * (0-(0)));
            yy = -0.95 + (((tickAnim - 13) / 21) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 13) / 21) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 30) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(xx);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(yy);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 34) {
            xx = -10.75 + (((tickAnim - 13) / 21) * (-74.4768-(-10.75)));
            yy = 0 + (((tickAnim - 13) / 21) * (-0.93437-(0)));
            zz = 0 + (((tickAnim - 13) / 21) * (21.2225-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -74.4768 + (((tickAnim - 34) / 3) * (-74.64254-(-74.4768)));
            yy = -0.93437 + (((tickAnim - 34) / 3) * (2.47319-(-0.93437)));
            zz = 21.2225 + (((tickAnim - 34) / 3) * (8.93336-(21.2225)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -74.64254 + (((tickAnim - 37) / 2) * (-76.61872-(-74.64254)));
            yy = 2.47319 + (((tickAnim - 37) / 2) * (4.25987-(2.47319)));
            zz = 8.93336 + (((tickAnim - 37) / 2) * (-25.48182-(8.93336)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -76.61872 + (((tickAnim - 39) / 4) * (-87.75513-(-76.61872)));
            yy = 4.25987 + (((tickAnim - 39) / 4) * (1.08611-(4.25987)));
            zz = -25.48182 + (((tickAnim - 39) / 4) * (18.86001-(-25.48182)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -87.75513 + (((tickAnim - 43) / 3) * (-74.4768-(-87.75513)));
            yy = 1.08611 + (((tickAnim - 43) / 3) * (-0.93437-(1.08611)));
            zz = 18.86001 + (((tickAnim - 43) / 3) * (21.2225-(18.86001)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -74.4768 + (((tickAnim - 46) / 2) * (-74.64254-(-74.4768)));
            yy = -0.93437 + (((tickAnim - 46) / 2) * (2.47319-(-0.93437)));
            zz = 21.2225 + (((tickAnim - 46) / 2) * (8.93336-(21.2225)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -74.64254 + (((tickAnim - 48) / 2) * (-76.61872-(-74.64254)));
            yy = 2.47319 + (((tickAnim - 48) / 2) * (4.25987-(2.47319)));
            zz = 8.93336 + (((tickAnim - 48) / 2) * (-25.48182-(8.93336)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -76.61872 + (((tickAnim - 50) / 4) * (-87.75513-(-76.61872)));
            yy = 4.25987 + (((tickAnim - 50) / 4) * (1.08611-(4.25987)));
            zz = -25.48182 + (((tickAnim - 50) / 4) * (18.86001-(-25.48182)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -87.75513 + (((tickAnim - 54) / 6) * (-74.79575-(-87.75513)));
            yy = 1.08611 + (((tickAnim - 54) / 6) * (-1.02742-(1.08611)));
            zz = 18.86001 + (((tickAnim - 54) / 6) * (-5.68662-(18.86001)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = -74.79575 + (((tickAnim - 60) / 12) * (-73.29575-(-74.79575)));
            yy = -1.02742 + (((tickAnim - 60) / 12) * (-1.02742-(-1.02742)));
            zz = -5.68662 + (((tickAnim - 60) / 12) * (-5.68662-(-5.68662)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = -73.29575 + (((tickAnim - 72) / 18) * (-73.29575-(-73.29575)));
            yy = -1.02742 + (((tickAnim - 72) / 18) * (-1.0274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*1.5-(-1.02742)));
            zz = -5.68662 + (((tickAnim - 72) / 18) * (-5.68662-(-5.68662)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = -73.29575 + (((tickAnim - 90) / 12) * (1.1202-(-73.29575)));
            yy = -1.0274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*1.5 + (((tickAnim - 90) / 12) * (-0.40101-(-1.0274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*1.5)));
            zz = -5.68662 + (((tickAnim - 90) / 12) * (1.15523-(-5.68662)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 1.1202 + (((tickAnim - 102) / 11) * (0-(1.1202)));
            yy = -0.40101 + (((tickAnim - 102) / 11) * (0-(-0.40101)));
            zz = 1.15523 + (((tickAnim - 102) / 11) * (0-(1.15523)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 12) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            yy = -0.375 + (((tickAnim - 102) / 11) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing3.rotationPointX = this.leftwing3.rotationPointX + (float)(xx);
        this.leftwing3.rotationPointY = this.leftwing3.rotationPointY - (float)(yy);
        this.leftwing3.rotationPointZ = this.leftwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 0.3 + (((tickAnim - 0) / 15) * (0.3-(0.3)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 15) / 19) * (1-(1)));
            yy = 0.3 + (((tickAnim - 15) / 19) * (1-(0.3)));
            zz = 1 + (((tickAnim - 15) / 19) * (1-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 34) / 56) * (1-(1)));
            yy = 1 + (((tickAnim - 34) / 56) * (1-(1)));
            zz = 1 + (((tickAnim - 34) / 56) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 1 + (((tickAnim - 90) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 10) * (0.3825-(1)));
            zz = 1 + (((tickAnim - 90) / 10) * (1-(1)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 100) / 13) * (1-(1)));
            yy = 0.3825 + (((tickAnim - 100) / 13) * (0.3-(0.3825)));
            zz = 1 + (((tickAnim - 100) / 13) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.wingmembranemiddle2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.5 + (((tickAnim - 13) / 7) * (-11.61043-(18.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (8.30954-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (21.49042-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -11.61043 + (((tickAnim - 20) / 13) * (-42.37798-(-11.61043)));
            yy = 8.30954 + (((tickAnim - 20) / 13) * (-26.92335-(8.30954)));
            zz = 21.49042 + (((tickAnim - 20) / 13) * (-2.26817-(21.49042)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -42.37798 + (((tickAnim - 33) / 4) * (-44.81138-(-42.37798)));
            yy = -26.92335 + (((tickAnim - 33) / 4) * (-6.40297-(-26.92335)));
            zz = -2.26817 + (((tickAnim - 33) / 4) * (6.06893-(-2.26817)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -44.81138 + (((tickAnim - 37) / 3) * (-61.47357-(-44.81138)));
            yy = -6.40297 + (((tickAnim - 37) / 3) * (19.34253-(-6.40297)));
            zz = 6.06893 + (((tickAnim - 37) / 3) * (2.30843-(6.06893)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -61.47357 + (((tickAnim - 40) / 3) * (-60.36994-(-61.47357)));
            yy = 19.34253 + (((tickAnim - 40) / 3) * (-44.02991-(19.34253)));
            zz = 2.30843 + (((tickAnim - 40) / 3) * (-2.08257-(2.30843)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -60.36994 + (((tickAnim - 43) / 3) * (-42.37798-(-60.36994)));
            yy = -44.02991 + (((tickAnim - 43) / 3) * (-26.92335-(-44.02991)));
            zz = -2.08257 + (((tickAnim - 43) / 3) * (-2.26817-(-2.08257)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -42.37798 + (((tickAnim - 46) / 2) * (-44.81138-(-42.37798)));
            yy = -26.92335 + (((tickAnim - 46) / 2) * (-6.40297-(-26.92335)));
            zz = -2.26817 + (((tickAnim - 46) / 2) * (6.06893-(-2.26817)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -44.81138 + (((tickAnim - 48) / 2) * (-61.47357-(-44.81138)));
            yy = -6.40297 + (((tickAnim - 48) / 2) * (19.34253-(-6.40297)));
            zz = 6.06893 + (((tickAnim - 48) / 2) * (2.30843-(6.06893)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -61.47357 + (((tickAnim - 50) / 6) * (-60.36994-(-61.47357)));
            yy = 19.34253 + (((tickAnim - 50) / 6) * (-44.02991-(19.34253)));
            zz = 2.30843 + (((tickAnim - 50) / 6) * (-2.08257-(2.30843)));
        }
        else if (tickAnim >= 56 && tickAnim < 72) {
            xx = -60.36994 + (((tickAnim - 56) / 16) * (-40.51409-(-60.36994)));
            yy = -44.02991 + (((tickAnim - 56) / 16) * (-6.2293-(-44.02991)));
            zz = -2.08257 + (((tickAnim - 56) / 16) * (4.90408-(-2.08257)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = -40.51409 + (((tickAnim - 72) / 18) * (-40.51409-(-40.51409)));
            yy = -6.2293 + (((tickAnim - 72) / 18) * (-6.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+40))*1-(-6.2293)));
            zz = 4.90408 + (((tickAnim - 72) / 18) * (4.90408-(4.90408)));
        }
        else if (tickAnim >= 90 && tickAnim < 95) {
            xx = -40.51409 + (((tickAnim - 90) / 5) * (-16.88963-(-40.51409)));
            yy = -6.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+40))*1 + (((tickAnim - 90) / 5) * (7.46572-(-6.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+40))*1)));
            zz = 4.90408 + (((tickAnim - 90) / 5) * (15.23547-(4.90408)));
        }
        else if (tickAnim >= 95 && tickAnim < 98) {
            xx = -16.88963 + (((tickAnim - 95) / 3) * (5.74118-(-16.88963)));
            yy = 7.46572 + (((tickAnim - 95) / 3) * (10.41634-(7.46572)));
            zz = 15.23547 + (((tickAnim - 95) / 3) * (13.66529-(15.23547)));
        }
        else if (tickAnim >= 98 && tickAnim < 102) {
            xx = 5.74118 + (((tickAnim - 98) / 4) * (-7.56455-(5.74118)));
            yy = 10.41634 + (((tickAnim - 98) / 4) * (6.18462-(10.41634)));
            zz = 13.66529 + (((tickAnim - 98) / 4) * (-1.80403-(13.66529)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = -7.56455 + (((tickAnim - 102) / 11) * (0-(-7.56455)));
            yy = 6.18462 + (((tickAnim - 102) / 11) * (0-(6.18462)));
            zz = -1.80403 + (((tickAnim - 102) / 11) * (0-(-1.80403)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 0.1 + (((tickAnim - 0) / 15) * (0.1-(0.1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 15) / 19) * (1-(1)));
            yy = 0.1 + (((tickAnim - 15) / 19) * (1-(0.1)));
            zz = 1 + (((tickAnim - 15) / 19) * (1-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 34) / 56) * (1-(1)));
            yy = 1 + (((tickAnim - 34) / 56) * (1-(1)));
            zz = 1 + (((tickAnim - 34) / 56) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 1 + (((tickAnim - 90) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 12) * (-0.0175-(1)));
            zz = 1 + (((tickAnim - 90) / 12) * (1-(1)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 102) / 11) * (1-(1)));
            yy = -0.0175 + (((tickAnim - 102) / 11) * (0.1-(-0.0175)));
            zz = 1 + (((tickAnim - 102) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.wingmembraneend2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = -7 + (((tickAnim - 15) / 19) * (4.5-(-7)));
            yy = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 19) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 58) {
            xx = 4.5 + (((tickAnim - 34) / 24) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 34) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 24) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 4.5 + (((tickAnim - 58) / 32) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 32) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 4.5 + (((tickAnim - 90) / 12) * (3.63-(4.5)));
            yy = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 3.63 + (((tickAnim - 102) / 11) * (0-(3.63)));
            yy = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.625-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 15) / 98) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 98) * (0-(0)));
            zz = 0.625 + (((tickAnim - 15) / 98) * (0-(0.625)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -0.25 + (((tickAnim - 15) / 6) * (-8.69-(-0.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = -8.69 + (((tickAnim - 21) / 13) * (-6-(-8.69)));
            yy = 0 + (((tickAnim - 21) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -6 + (((tickAnim - 34) / 4) * (3.5-(-6)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 3.5 + (((tickAnim - 38) / 5) * (-13.75-(3.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -13.75 + (((tickAnim - 43) / 5) * (-5.25-(-13.75)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -5.25 + (((tickAnim - 48) / 5) * (-7.75-(-5.25)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -7.75 + (((tickAnim - 53) / 5) * (-6-(-7.75)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = -6 + (((tickAnim - 58) / 32) * (-6-(-6)));
            yy = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 32) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = -6 + (((tickAnim - 90) / 12) * (10.63-(-6)));
            yy = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 10.63 + (((tickAnim - 102) / 11) * (0-(10.63)));
            yy = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0.85-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 21) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 37) * (0-(0)));
            zz = 0.85 + (((tickAnim - 21) / 37) * (0.85-(0.85)));
        }
        else if (tickAnim >= 58 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 58) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 14) * (0-(0)));
            zz = 0.85 + (((tickAnim - 58) / 14) * (0.85-(0.85)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 72) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 18) * (0-(0)));
            zz = 0.85 + (((tickAnim - 72) / 18) * (0.85-(0.85)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            zz = 0.85 + (((tickAnim - 90) / 12) * (0-(0.85)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 10.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 15) / 6) * (30.355+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40-(10.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 53) {
            xx = 30.355+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40 + (((tickAnim - 21) / 32) * (37.75-(30.355+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40)));
            yy = 0 + (((tickAnim - 21) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 32) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 37.75 + (((tickAnim - 53) / 5) * (41-(37.75)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 41 + (((tickAnim - 58) / 32) * (41-(41)));
            yy = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 32) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 41 + (((tickAnim - 90) / 12) * (42.5-(41)));
            yy = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 42.5 + (((tickAnim - 102) / 11) * (0-(42.5)));
            yy = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));

        this.head2.rotationPointX = this.head2.rotationPointX + (float)(0);
        this.head2.rotationPointY = this.head2.rotationPointY - (float)(0);
        this.head2.rotationPointZ = this.head2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 34) {
            xx = -10.75 + (((tickAnim - 11) / 23) * (-2.75-(-10.75)));
            yy = 0 + (((tickAnim - 11) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 23) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -2.75 + (((tickAnim - 34) / 4) * (5.22-(-2.75)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 5.22 + (((tickAnim - 38) / 5) * (-12.75-(5.22)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -12.75 + (((tickAnim - 43) / 5) * (2.47-(-12.75)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 2.47 + (((tickAnim - 48) / 5) * (-12.75-(2.47)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -12.75 + (((tickAnim - 53) / 5) * (-2.75-(-12.75)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 77) {
            xx = -2.75 + (((tickAnim - 58) / 19) * (0.75-(-2.75)));
            yy = 0 + (((tickAnim - 58) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 19) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 90) {
            xx = 0.75 + (((tickAnim - 77) / 13) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 77) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 13) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 0.75 + (((tickAnim - 90) / 12) * (-28.62-(0.75)));
            yy = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = -28.62 + (((tickAnim - 102) / 11) * (0-(-28.62)));
            yy = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 14) / 20) * (0-(0)));
            yy = 0.7 + (((tickAnim - 14) / 20) * (0-(0.7)));
            zz = 0 + (((tickAnim - 14) / 20) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 32) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 12) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            yy = -0.125 + (((tickAnim - 102) / 11) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body1.rotationPointX = this.body1.rotationPointX + (float)(xx);
        this.body1.rotationPointY = this.body1.rotationPointY - (float)(yy);
        this.body1.rotationPointZ = this.body1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (34.31-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 34) {
            xx = 34.31 + (((tickAnim - 22) / 12) * (23.75-(34.31)));
            yy = 0 + (((tickAnim - 22) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 12) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 23.75 + (((tickAnim - 34) / 9) * (29.25-(23.75)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 29.25 + (((tickAnim - 43) / 10) * (27.99-(29.25)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 27.99 + (((tickAnim - 53) / 3) * (23.75-(27.99)));
            yy = 0 + (((tickAnim - 53) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 3) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 23.75 + (((tickAnim - 56) / 34) * (31.5-(23.75)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 31.5 + (((tickAnim - 90) / 12) * (18-(31.5)));
            yy = 0 + (((tickAnim - 90) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 12) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 18 + (((tickAnim - 102) / 11) * (0-(18)));
            yy = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 20 + (((tickAnim - 34) / 9) * (21.25-(20)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 56) {
            xx = 21.25 + (((tickAnim - 43) / 13) * (20-(21.25)));
            yy = 0 + (((tickAnim - 43) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 13) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 102) {
            xx = 20 + (((tickAnim - 56) / 46) * (7.19-(20)));
            yy = 0 + (((tickAnim - 56) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 46) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 7.19 + (((tickAnim - 102) / 11) * (0-(7.19)));
            yy = 0 + (((tickAnim - 102) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 10.5 + (((tickAnim - 34) / 9) * (12.25-(10.5)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 56) {
            xx = 12.25 + (((tickAnim - 43) / 13) * (10.5-(12.25)));
            yy = 0 + (((tickAnim - 43) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 13) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 10.5 + (((tickAnim - 56) / 34) * (11.88-(10.5)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 11.88 + (((tickAnim - 90) / 23) * (0-(11.88)));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (21.45713-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (7.58487-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-27.78928-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 21.45713 + (((tickAnim - 15) / 16) * (45.83658-(21.45713)));
            yy = 7.58487 + (((tickAnim - 15) / 16) * (1.96106-(7.58487)));
            zz = -27.78928 + (((tickAnim - 15) / 16) * (-31.12325-(-27.78928)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 45.83658 + (((tickAnim - 31) / 3) * (45.31866-(45.83658)));
            yy = 1.96106 + (((tickAnim - 31) / 3) * (3.1947-(1.96106)));
            zz = -31.12325 + (((tickAnim - 31) / 3) * (-29.13144-(-31.12325)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 45.31866 + (((tickAnim - 34) / 9) * (43.27841-(45.31866)));
            yy = 3.1947 + (((tickAnim - 34) / 9) * (0.95434-(3.1947)));
            zz = -29.13144 + (((tickAnim - 34) / 9) * (-27.18078-(-29.13144)));
        }
        else if (tickAnim >= 43 && tickAnim < 69) {
            xx = 43.27841 + (((tickAnim - 43) / 26) * (41.92381-(43.27841)));
            yy = 0.95434 + (((tickAnim - 43) / 26) * (2.21209-(0.95434)));
            zz = -27.18078 + (((tickAnim - 43) / 26) * (-28.27589-(-27.18078)));
        }
        else if (tickAnim >= 69 && tickAnim < 90) {
            xx = 41.92381 + (((tickAnim - 69) / 21) * (41.92381-(41.92381)));
            yy = 2.21209 + (((tickAnim - 69) / 21) * (2.21209-(2.21209)));
            zz = -28.27589 + (((tickAnim - 69) / 21) * (-28.27589-(-28.27589)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 41.92381 + (((tickAnim - 90) / 12) * (23.15006-(41.92381)));
            yy = 2.21209 + (((tickAnim - 90) / 12) * (19.19108-(2.21209)));
            zz = -28.27589 + (((tickAnim - 90) / 12) * (-50.92263-(-28.27589)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 23.15006 + (((tickAnim - 102) / 11) * (0-(23.15006)));
            yy = 19.19108 + (((tickAnim - 102) / 11) * (0-(19.19108)));
            zz = -50.92263 + (((tickAnim - 102) / 11) * (0-(-50.92263)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 8) / 1) * (-0.54-(-0.4)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.54 + (((tickAnim - 9) / 2) * (-0.485-(-0.54)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.485 + (((tickAnim - 11) / 4) * (0.7-(-0.485)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 15) / 3) * (1.66-(0.7)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.66 + (((tickAnim - 18) / 2) * (1.035-(1.66)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            yy = 1.035 + (((tickAnim - 20) / 14) * (0-(1.035)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 34) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 56) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (10.09179-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-1.1664-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (9.0618-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.09179 + (((tickAnim - 15) / 5) * (30.67831-(10.09179)));
            yy = -1.1664 + (((tickAnim - 15) / 5) * (10.65656-(-1.1664)));
            zz = 9.0618 + (((tickAnim - 15) / 5) * (-8.66021-(9.0618)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 30.67831 + (((tickAnim - 20) / 11) * (-4.36729-(30.67831)));
            yy = 10.65656 + (((tickAnim - 20) / 11) * (12.43337-(10.65656)));
            zz = -8.66021 + (((tickAnim - 20) / 11) * (-12.2453-(-8.66021)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -4.36729 + (((tickAnim - 31) / 3) * (0.15033-(-4.36729)));
            yy = 12.43337 + (((tickAnim - 31) / 3) * (12.64487-(12.43337)));
            zz = -12.2453 + (((tickAnim - 31) / 3) * (-12.70516-(-12.2453)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0.15033 + (((tickAnim - 34) / 4) * (-1.97467-(0.15033)));
            yy = 12.64487 + (((tickAnim - 34) / 4) * (12.64487-(12.64487)));
            zz = -12.70516 + (((tickAnim - 34) / 4) * (-12.70516-(-12.70516)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -1.97467 + (((tickAnim - 38) / 5) * (3.57819-(-1.97467)));
            yy = 12.64487 + (((tickAnim - 38) / 5) * (18.20122-(12.64487)));
            zz = -12.70516 + (((tickAnim - 38) / 5) * (-15.82119-(-12.70516)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 3.57819 + (((tickAnim - 43) / 5) * (1.02423-(3.57819)));
            yy = 18.20122 + (((tickAnim - 43) / 5) * (13.79763-(18.20122)));
            zz = -15.82119 + (((tickAnim - 43) / 5) * (-13.67319-(-15.82119)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 1.02423 + (((tickAnim - 48) / 4) * (5.07648-(1.02423)));
            yy = 13.79763 + (((tickAnim - 48) / 4) * (17.32623-(13.79763)));
            zz = -13.67319 + (((tickAnim - 48) / 4) * (-16.08893-(-13.67319)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 5.07648 + (((tickAnim - 52) / 3) * (5.364-(5.07648)));
            yy = 17.32623 + (((tickAnim - 52) / 3) * (19.51468-(17.32623)));
            zz = -16.08893 + (((tickAnim - 52) / 3) * (-18.21785-(-16.08893)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 5.364 + (((tickAnim - 55) / 3) * (5.82596-(5.364)));
            yy = 19.51468 + (((tickAnim - 55) / 3) * (19.50813-(19.51468)));
            zz = -18.21785 + (((tickAnim - 55) / 3) * (-18.85284-(-18.21785)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = 5.82596 + (((tickAnim - 58) / 10) * (1.74789-(5.82596)));
            yy = 19.50813 + (((tickAnim - 58) / 10) * (18.50064-(19.50813)));
            zz = -18.85284 + (((tickAnim - 58) / 10) * (-17.98358-(-18.85284)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 1.74789 + (((tickAnim - 68) / 12) * (5.6582-(1.74789)));
            yy = 18.50064 + (((tickAnim - 68) / 12) * (18.9992-(18.50064)));
            zz = -17.98358 + (((tickAnim - 68) / 12) * (-18.16932-(-17.98358)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 5.6582 + (((tickAnim - 80) / 10) * (6.61704-(5.6582)));
            yy = 18.9992 + (((tickAnim - 80) / 10) * (19.42653-(18.9992)));
            zz = -18.16932 + (((tickAnim - 80) / 10) * (-18.32854-(-18.16932)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 6.61704 + (((tickAnim - 90) / 12) * (8.20656-(6.61704)));
            yy = 19.42653 + (((tickAnim - 90) / 12) * (-0.02207-(19.42653)));
            zz = -18.32854 + (((tickAnim - 90) / 12) * (38.86785-(-18.32854)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 8.20656 + (((tickAnim - 102) / 11) * (0-(8.20656)));
            yy = -0.02207 + (((tickAnim - 102) / 11) * (0-(-0.02207)));
            zz = 38.86785 + (((tickAnim - 102) / 11) * (0-(38.86785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (-0.085-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (-0.22-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = -0.085 + (((tickAnim - 31) / 7) * (0.175-(-0.085)));
            zz = -0.22 + (((tickAnim - 31) / 7) * (-0.275-(-0.22)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 38) / 5) * (0.03-(0.175)));
            zz = -0.275 + (((tickAnim - 38) / 5) * (0.12-(-0.275)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (-0.035-(0)));
            yy = 0.03 + (((tickAnim - 43) / 5) * (0.03-(0.03)));
            zz = 0.12 + (((tickAnim - 43) / 5) * (0.15-(0.12)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -0.035 + (((tickAnim - 48) / 4) * (-0.25-(-0.035)));
            yy = 0.03 + (((tickAnim - 48) / 4) * (0.23-(0.03)));
            zz = 0.15 + (((tickAnim - 48) / 4) * (-0.075-(0.15)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = -0.25 + (((tickAnim - 52) / 3) * (-0.55-(-0.25)));
            yy = 0.23 + (((tickAnim - 52) / 3) * (0.12-(0.23)));
            zz = -0.075 + (((tickAnim - 52) / 3) * (-0.025-(-0.075)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -0.55 + (((tickAnim - 55) / 3) * (-0.625-(-0.55)));
            yy = 0.12 + (((tickAnim - 55) / 3) * (0-(0.12)));
            zz = -0.025 + (((tickAnim - 55) / 3) * (-0.085-(-0.025)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = -0.625 + (((tickAnim - 58) / 32) * (-0.625-(-0.625)));
            yy = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            zz = -0.085 + (((tickAnim - 58) / 32) * (-0.435-(-0.085)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = -0.625 + (((tickAnim - 90) / 23) * (0-(-0.625)));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = -0.435 + (((tickAnim - 90) / 23) * (0-(-0.435)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-5.82319-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (14.77287-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-3.49665-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5.82319 + (((tickAnim - 13) / 2) * (-5.35979-(-5.82319)));
            yy = 14.77287 + (((tickAnim - 13) / 2) * (22.1593-(14.77287)));
            zz = -3.49665 + (((tickAnim - 13) / 2) * (-5.24498-(-3.49665)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5.35979 + (((tickAnim - 15) / 5) * (-21.831-(-5.35979)));
            yy = 22.1593 + (((tickAnim - 15) / 5) * (29.41192-(22.1593)));
            zz = -5.24498 + (((tickAnim - 15) / 5) * (-13.95208-(-5.24498)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -21.831 + (((tickAnim - 20) / 8) * (3.92372-(-21.831)));
            yy = 29.41192 + (((tickAnim - 20) / 8) * (40.62539-(29.41192)));
            zz = -13.95208 + (((tickAnim - 20) / 8) * (-9.6158-(-13.95208)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 3.92372 + (((tickAnim - 28) / 3) * (6.50108-(3.92372)));
            yy = 40.62539 + (((tickAnim - 28) / 3) * (38.09914-(40.62539)));
            zz = -9.6158 + (((tickAnim - 28) / 3) * (-4.00868-(-9.6158)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 6.50108 + (((tickAnim - 31) / 3) * (2.75223-(6.50108)));
            yy = 38.09914 + (((tickAnim - 31) / 3) * (32.12919-(38.09914)));
            zz = -4.00868 + (((tickAnim - 31) / 3) * (-4.49304-(-4.00868)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 2.75223 + (((tickAnim - 34) / 14) * (3.75223-(2.75223)));
            yy = 32.12919 + (((tickAnim - 34) / 14) * (32.12919-(32.12919)));
            zz = -4.49304 + (((tickAnim - 34) / 14) * (-4.49304-(-4.49304)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 3.75223 + (((tickAnim - 48) / 5) * (4.85827-(3.75223)));
            yy = 32.12919 + (((tickAnim - 48) / 5) * (35.11551-(32.12919)));
            zz = -4.49304 + (((tickAnim - 48) / 5) * (-1.06506-(-4.49304)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 4.85827 + (((tickAnim - 53) / 5) * (-3.29159-(4.85827)));
            yy = 35.11551 + (((tickAnim - 53) / 5) * (32.94823-(35.11551)));
            zz = -1.06506 + (((tickAnim - 53) / 5) * (-3.23053-(-1.06506)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -3.29159 + (((tickAnim - 58) / 10) * (-0.9649-(-3.29159)));
            yy = 32.94823 + (((tickAnim - 58) / 10) * (33.39168-(32.94823)));
            zz = -3.23053 + (((tickAnim - 58) / 10) * (-2.78313-(-3.23053)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -0.9649 + (((tickAnim - 68) / 12) * (-2.58375-(-0.9649)));
            yy = 33.39168 + (((tickAnim - 68) / 12) * (33.90905-(33.39168)));
            zz = -2.78313 + (((tickAnim - 68) / 12) * (-2.26116-(-2.78313)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -2.58375 + (((tickAnim - 80) / 10) * (-2.75706-(-2.58375)));
            yy = 33.90905 + (((tickAnim - 80) / 10) * (34.3525-(33.90905)));
            zz = -2.26116 + (((tickAnim - 80) / 10) * (-1.81376-(-2.26116)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = -2.75706 + (((tickAnim - 90) / 12) * (7.20103-(-2.75706)));
            yy = 34.3525 + (((tickAnim - 90) / 12) * (3.35592-(34.3525)));
            zz = -1.81376 + (((tickAnim - 90) / 12) * (-16.38673-(-1.81376)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 7.20103 + (((tickAnim - 102) / 11) * (0-(7.20103)));
            yy = 3.35592 + (((tickAnim - 102) / 11) * (0-(3.35592)));
            zz = -16.38673 + (((tickAnim - 102) / 11) * (0-(-16.38673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.25-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.31-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.25 + (((tickAnim - 13) / 2) * (0-(0.25)));
            yy = -0.31 + (((tickAnim - 13) / 2) * (-0.075-(-0.31)));
            zz = -0.225 + (((tickAnim - 13) / 2) * (0-(-0.225)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0.23-(0)));
            yy = -0.075 + (((tickAnim - 15) / 5) * (0.08-(-0.075)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.135-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.23 + (((tickAnim - 20) / 3) * (0.39-(0.23)));
            yy = 0.08 + (((tickAnim - 20) / 3) * (0.185-(0.08)));
            zz = -0.135 + (((tickAnim - 20) / 3) * (0.15-(-0.135)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.39 + (((tickAnim - 23) / 5) * (0.56-(0.39)));
            yy = 0.185 + (((tickAnim - 23) / 5) * (-0.46-(0.185)));
            zz = 0.15 + (((tickAnim - 23) / 5) * (0-(0.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0.56 + (((tickAnim - 28) / 3) * (0.23-(0.56)));
            yy = -0.46 + (((tickAnim - 28) / 3) * (-0.765-(-0.46)));
            zz = 0 + (((tickAnim - 28) / 3) * (0.15-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0.23 + (((tickAnim - 31) / 2) * (0.12-(0.23)));
            yy = -0.765 + (((tickAnim - 31) / 2) * (-1.035-(-0.765)));
            zz = 0.15 + (((tickAnim - 31) / 2) * (0.08-(0.15)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0.12 + (((tickAnim - 33) / 1) * (0-(0.12)));
            yy = -1.035 + (((tickAnim - 33) / 1) * (-0.95-(-1.035)));
            zz = 0.08 + (((tickAnim - 33) / 1) * (0-(0.08)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            yy = -0.95 + (((tickAnim - 34) / 14) * (-0.7-(-0.95)));
            zz = 0 + (((tickAnim - 34) / 14) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            yy = -0.7 + (((tickAnim - 48) / 10) * (-0.95-(-0.7)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            yy = -0.95 + (((tickAnim - 58) / 32) * (-0.95-(-0.95)));
            zz = 0 + (((tickAnim - 58) / 32) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            yy = -0.95 + (((tickAnim - 90) / 23) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 6.25 + (((tickAnim - 90) / 23) * (0-(6.25)));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 2.75 + (((tickAnim - 90) / 23) * (0-(2.75)));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (-7.07774-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (-16.4988-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (-103.9614-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 97) {
            xx = -7.07774 + (((tickAnim - 36) / 61) * (-7.07774-(-7.07774)));
            yy = -16.4988 + (((tickAnim - 36) / 61) * (-16.4988-(-16.4988)));
            zz = -103.9614 + (((tickAnim - 36) / 61) * (-103.9614-(-103.9614)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = -7.07774 + (((tickAnim - 97) / 14) * (-3.57695-(-7.07774)));
            yy = -16.4988 + (((tickAnim - 97) / 14) * (-13.59801-(-16.4988)));
            zz = -103.9614 + (((tickAnim - 97) / 14) * (-71.82561-(-103.9614)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = -3.57695 + (((tickAnim - 111) / 2) * (0-(-3.57695)));
            yy = -13.59801 + (((tickAnim - 111) / 2) * (0-(-13.59801)));
            zz = -71.82561 + (((tickAnim - 111) / 2) * (0-(-71.82561)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 36) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 61) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 97) / 14) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 97) / 14) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 97) / 14) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = -0.25 + (((tickAnim - 111) / 2) * (0-(-0.25)));
            yy = -0.9 + (((tickAnim - 111) / 2) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (-7.07774-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (16.49884-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (103.96139-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 97) {
            xx = -7.07774 + (((tickAnim - 36) / 61) * (-7.07774-(-7.07774)));
            yy = 16.49884 + (((tickAnim - 36) / 61) * (16.49884-(16.49884)));
            zz = 103.96139 + (((tickAnim - 36) / 61) * (103.96139-(103.96139)));
        }
        else if (tickAnim >= 97 && tickAnim < 102) {
            xx = -7.07774 + (((tickAnim - 97) / 5) * (-7.28531-(-7.07774)));
            yy = 16.49884 + (((tickAnim - 97) / 5) * (19.62793-(16.49884)));
            zz = 103.96139 + (((tickAnim - 97) / 5) * (42.54676-(103.96139)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = -7.28531 + (((tickAnim - 102) / 11) * (0-(-7.28531)));
            yy = 19.62793 + (((tickAnim - 102) / 11) * (0-(19.62793)));
            zz = 42.54676 + (((tickAnim - 102) / 11) * (0-(42.54676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 36) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 61) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 97) / 5) * (0.575-(0)));
            yy = 0 + (((tickAnim - 97) / 5) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 97) / 5) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 0.575 + (((tickAnim - 102) / 11) * (0-(0.575)));
            yy = -0.65 + (((tickAnim - 102) / 11) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 102) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (21.45713-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-7.5849-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (27.7893-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 21.45713 + (((tickAnim - 15) / 16) * (45.83658-(21.45713)));
            yy = -7.5849 + (((tickAnim - 15) / 16) * (1.96106-(-7.5849)));
            zz = 27.7893 + (((tickAnim - 15) / 16) * (31.1233-(27.7893)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 45.83658 + (((tickAnim - 31) / 3) * (45.31866-(45.83658)));
            yy = 1.96106 + (((tickAnim - 31) / 3) * (3.1947-(1.96106)));
            zz = 31.1233 + (((tickAnim - 31) / 3) * (29.1314-(31.1233)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 45.31866 + (((tickAnim - 34) / 9) * (43.27841-(45.31866)));
            yy = 3.1947 + (((tickAnim - 34) / 9) * (0.95434-(3.1947)));
            zz = 29.1314 + (((tickAnim - 34) / 9) * (27.1808-(29.1314)));
        }
        else if (tickAnim >= 43 && tickAnim < 69) {
            xx = 43.27841 + (((tickAnim - 43) / 26) * (41.92381-(43.27841)));
            yy = 0.95434 + (((tickAnim - 43) / 26) * (2.21209-(0.95434)));
            zz = 27.1808 + (((tickAnim - 43) / 26) * (28.2759-(27.1808)));
        }
        else if (tickAnim >= 69 && tickAnim < 90) {
            xx = 41.92381 + (((tickAnim - 69) / 21) * (41.92381-(41.92381)));
            yy = 2.21209 + (((tickAnim - 69) / 21) * (2.21209-(2.21209)));
            zz = 28.2759 + (((tickAnim - 69) / 21) * (28.2759-(28.2759)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 41.92381 + (((tickAnim - 90) / 12) * (22.48317-(41.92381)));
            yy = 2.21209 + (((tickAnim - 90) / 12) * (-5.58865-(2.21209)));
            zz = 28.2759 + (((tickAnim - 90) / 12) * (22.04468-(28.2759)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 22.48317 + (((tickAnim - 102) / 11) * (0-(22.48317)));
            yy = -5.58865 + (((tickAnim - 102) / 11) * (0-(-5.58865)));
            zz = 22.04468 + (((tickAnim - 102) / 11) * (0-(22.04468)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 8) / 1) * (-0.54-(-0.4)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.54 + (((tickAnim - 9) / 2) * (-0.485-(-0.54)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.485 + (((tickAnim - 11) / 4) * (0.7-(-0.485)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 15) / 3) * (1.66-(0.7)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.66 + (((tickAnim - 18) / 2) * (1.035-(1.66)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            yy = 1.035 + (((tickAnim - 20) / 14) * (0-(1.035)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 34) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 56) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (10.09179-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-1.1664-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-9.0618-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.09179 + (((tickAnim - 15) / 5) * (30.67831-(10.09179)));
            yy = -1.1664 + (((tickAnim - 15) / 5) * (-10.6566-(-1.1664)));
            zz = -9.0618 + (((tickAnim - 15) / 5) * (8.6602-(-9.0618)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 30.67831 + (((tickAnim - 20) / 11) * (-4.36729-(30.67831)));
            yy = -10.6566 + (((tickAnim - 20) / 11) * (-12.4334-(-10.6566)));
            zz = 8.6602 + (((tickAnim - 20) / 11) * (12.2453-(8.6602)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -4.36729 + (((tickAnim - 31) / 3) * (2.01456-(-4.36729)));
            yy = -12.4334 + (((tickAnim - 31) / 3) * (-19.00089-(-12.4334)));
            zz = 12.2453 + (((tickAnim - 31) / 3) * (18.00801-(12.2453)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 2.01456 + (((tickAnim - 34) / 4) * (-1.97467-(2.01456)));
            yy = -19.00089 + (((tickAnim - 34) / 4) * (-12.6449-(-19.00089)));
            zz = 18.00801 + (((tickAnim - 34) / 4) * (12.7052-(18.00801)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -1.97467 + (((tickAnim - 38) / 5) * (3.57819-(-1.97467)));
            yy = -12.6449 + (((tickAnim - 38) / 5) * (-18.2012-(-12.6449)));
            zz = 12.7052 + (((tickAnim - 38) / 5) * (15.8212-(12.7052)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 3.57819 + (((tickAnim - 43) / 5) * (1.02423-(3.57819)));
            yy = -18.2012 + (((tickAnim - 43) / 5) * (-13.7976-(-18.2012)));
            zz = 15.8212 + (((tickAnim - 43) / 5) * (13.6732-(15.8212)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 1.02423 + (((tickAnim - 48) / 4) * (5.07648-(1.02423)));
            yy = -13.7976 + (((tickAnim - 48) / 4) * (-17.3262-(-13.7976)));
            zz = 13.6732 + (((tickAnim - 48) / 4) * (16.0889-(13.6732)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 5.07648 + (((tickAnim - 52) / 3) * (5.364-(5.07648)));
            yy = -17.3262 + (((tickAnim - 52) / 3) * (-19.5147-(-17.3262)));
            zz = 16.0889 + (((tickAnim - 52) / 3) * (18.2178-(16.0889)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 5.364 + (((tickAnim - 55) / 3) * (5.56548-(5.364)));
            yy = -19.5147 + (((tickAnim - 55) / 3) * (-20.93865-(-19.5147)));
            zz = 18.2178 + (((tickAnim - 55) / 3) * (19.89404-(18.2178)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = 5.56548 + (((tickAnim - 58) / 10) * (1.74789-(5.56548)));
            yy = -20.93865 + (((tickAnim - 58) / 10) * (-18.5006-(-20.93865)));
            zz = 19.89404 + (((tickAnim - 58) / 10) * (17.9836-(19.89404)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 1.74789 + (((tickAnim - 68) / 12) * (5.6582-(1.74789)));
            yy = -18.5006 + (((tickAnim - 68) / 12) * (-18.9992-(-18.5006)));
            zz = 17.9836 + (((tickAnim - 68) / 12) * (18.1693-(17.9836)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 5.6582 + (((tickAnim - 80) / 10) * (6.61704-(5.6582)));
            yy = -18.9992 + (((tickAnim - 80) / 10) * (-19.4265-(-18.9992)));
            zz = 18.1693 + (((tickAnim - 80) / 10) * (18.3285-(18.1693)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 6.61704 + (((tickAnim - 90) / 12) * (9.68002-(6.61704)));
            yy = -19.4265 + (((tickAnim - 90) / 12) * (-4.6746-(-19.4265)));
            zz = 18.3285 + (((tickAnim - 90) / 12) * (-26.535-(18.3285)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 9.68002 + (((tickAnim - 102) / 11) * (0-(9.68002)));
            yy = -4.6746 + (((tickAnim - 102) / 11) * (0-(-4.6746)));
            zz = -26.535 + (((tickAnim - 102) / 11) * (0-(-26.535)));
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
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (-0.085-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (-0.22-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = -0.085 + (((tickAnim - 31) / 7) * (-0.175-(-0.085)));
            zz = -0.22 + (((tickAnim - 31) / 7) * (-0.275-(-0.22)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 38) / 5) * (0.03-(-0.175)));
            zz = -0.275 + (((tickAnim - 38) / 5) * (0.12-(-0.275)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0.035-(0)));
            yy = 0.03 + (((tickAnim - 43) / 5) * (0.03-(0.03)));
            zz = 0.12 + (((tickAnim - 43) / 5) * (0.15-(0.12)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 0.035 + (((tickAnim - 48) / 4) * (0.225-(0.035)));
            yy = 0.03 + (((tickAnim - 48) / 4) * (0.23-(0.03)));
            zz = 0.15 + (((tickAnim - 48) / 4) * (-0.075-(0.15)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 0.225 + (((tickAnim - 52) / 3) * (0.55-(0.225)));
            yy = 0.23 + (((tickAnim - 52) / 3) * (0.12-(0.23)));
            zz = -0.075 + (((tickAnim - 52) / 3) * (-0.025-(-0.075)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0.55 + (((tickAnim - 55) / 3) * (0.625-(0.55)));
            yy = 0.12 + (((tickAnim - 55) / 3) * (0-(0.12)));
            zz = -0.025 + (((tickAnim - 55) / 3) * (-0.085-(-0.025)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 0.625 + (((tickAnim - 58) / 32) * (0.625-(0.625)));
            yy = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            zz = -0.085 + (((tickAnim - 58) / 32) * (-0.435-(-0.085)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 0.625 + (((tickAnim - 90) / 23) * (0-(0.625)));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = -0.435 + (((tickAnim - 90) / 23) * (0-(-0.435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-5.8232-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-14.7729-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (3.4967-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5.8232 + (((tickAnim - 13) / 2) * (-5.3598-(-5.8232)));
            yy = -14.7729 + (((tickAnim - 13) / 2) * (-22.1593-(-14.7729)));
            zz = 3.4967 + (((tickAnim - 13) / 2) * (5.245-(3.4967)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5.3598 + (((tickAnim - 15) / 5) * (-21.831-(-5.3598)));
            yy = -22.1593 + (((tickAnim - 15) / 5) * (-29.4119-(-22.1593)));
            zz = 5.245 + (((tickAnim - 15) / 5) * (13.9521-(5.245)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -21.831 + (((tickAnim - 20) / 8) * (3.9237-(-21.831)));
            yy = -29.4119 + (((tickAnim - 20) / 8) * (-40.6254-(-29.4119)));
            zz = 13.9521 + (((tickAnim - 20) / 8) * (9.6158-(13.9521)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 3.9237 + (((tickAnim - 28) / 3) * (6.50108-(3.9237)));
            yy = -40.6254 + (((tickAnim - 28) / 3) * (-38.0991-(-40.6254)));
            zz = 9.6158 + (((tickAnim - 28) / 3) * (4.0087-(9.6158)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 6.50108 + (((tickAnim - 31) / 3) * (2.75223-(6.50108)));
            yy = -38.0991 + (((tickAnim - 31) / 3) * (-32.1292-(-38.0991)));
            zz = 4.0087 + (((tickAnim - 31) / 3) * (4.493-(4.0087)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 2.75223 + (((tickAnim - 34) / 14) * (3.75223-(2.75223)));
            yy = -32.1292 + (((tickAnim - 34) / 14) * (-32.1292-(-32.1292)));
            zz = 4.493 + (((tickAnim - 34) / 14) * (4.493-(4.493)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 3.75223 + (((tickAnim - 48) / 5) * (4.85827-(3.75223)));
            yy = -32.1292 + (((tickAnim - 48) / 5) * (-35.1155-(-32.1292)));
            zz = 4.493 + (((tickAnim - 48) / 5) * (1.0651-(4.493)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 4.85827 + (((tickAnim - 53) / 5) * (-3.29159-(4.85827)));
            yy = -35.1155 + (((tickAnim - 53) / 5) * (-32.9482-(-35.1155)));
            zz = 1.0651 + (((tickAnim - 53) / 5) * (3.2305-(1.0651)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -3.29159 + (((tickAnim - 58) / 10) * (-0.9649-(-3.29159)));
            yy = -32.9482 + (((tickAnim - 58) / 10) * (-33.3917-(-32.9482)));
            zz = 3.2305 + (((tickAnim - 58) / 10) * (2.7831-(3.2305)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -0.9649 + (((tickAnim - 68) / 12) * (-2.58375-(-0.9649)));
            yy = -33.3917 + (((tickAnim - 68) / 12) * (-33.909-(-33.3917)));
            zz = 2.7831 + (((tickAnim - 68) / 12) * (2.2612-(2.7831)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -2.58375 + (((tickAnim - 80) / 10) * (-2.75706-(-2.58375)));
            yy = -33.909 + (((tickAnim - 80) / 10) * (-34.3525-(-33.909)));
            zz = 2.2612 + (((tickAnim - 80) / 10) * (1.8138-(2.2612)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = -2.75706 + (((tickAnim - 90) / 12) * (7.20103-(-2.75706)));
            yy = -34.3525 + (((tickAnim - 90) / 12) * (-3.3559-(-34.3525)));
            zz = 1.8138 + (((tickAnim - 90) / 12) * (16.3867-(1.8138)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 7.20103 + (((tickAnim - 102) / 11) * (0-(7.20103)));
            yy = -3.3559 + (((tickAnim - 102) / 11) * (0-(-3.3559)));
            zz = 16.3867 + (((tickAnim - 102) / 11) * (0-(16.3867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.25-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.31-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.25 + (((tickAnim - 13) / 2) * (0-(0.25)));
            yy = -0.31 + (((tickAnim - 13) / 2) * (-0.075-(-0.31)));
            zz = -0.225 + (((tickAnim - 13) / 2) * (-0.15-(-0.225)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-0.18-(0)));
            yy = -0.075 + (((tickAnim - 15) / 5) * (0.07-(-0.075)));
            zz = -0.15 + (((tickAnim - 15) / 5) * (-0.135-(-0.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.18 + (((tickAnim - 20) / 3) * (-0.31-(-0.18)));
            yy = 0.07 + (((tickAnim - 20) / 3) * (0.185-(0.07)));
            zz = -0.135 + (((tickAnim - 20) / 3) * (0.225-(-0.135)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.31 + (((tickAnim - 23) / 5) * (-0.465-(-0.31)));
            yy = 0.185 + (((tickAnim - 23) / 5) * (-0.24-(0.185)));
            zz = 0.225 + (((tickAnim - 23) / 5) * (0.2-(0.225)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -0.465 + (((tickAnim - 28) / 3) * (-0.23-(-0.465)));
            yy = -0.24 + (((tickAnim - 28) / 3) * (-0.765-(-0.24)));
            zz = 0.2 + (((tickAnim - 28) / 3) * (0.15-(0.2)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -0.23 + (((tickAnim - 31) / 2) * (0.12-(-0.23)));
            yy = -0.765 + (((tickAnim - 31) / 2) * (-1.035-(-0.765)));
            zz = 0.15 + (((tickAnim - 31) / 2) * (0.08-(0.15)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0.12 + (((tickAnim - 33) / 1) * (0-(0.12)));
            yy = -1.035 + (((tickAnim - 33) / 1) * (-0.95-(-1.035)));
            zz = 0.08 + (((tickAnim - 33) / 1) * (0-(0.08)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            yy = -0.95 + (((tickAnim - 34) / 14) * (-0.7-(-0.95)));
            zz = 0 + (((tickAnim - 34) / 14) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            yy = -0.7 + (((tickAnim - 48) / 10) * (-0.95-(-0.7)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 58) / 32) * (0-(0)));
            yy = -0.95 + (((tickAnim - 58) / 32) * (-0.95-(-0.95)));
            zz = 0 + (((tickAnim - 58) / 32) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            yy = -0.95 + (((tickAnim - 90) / 23) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (27.89036-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-14.45494-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (16.43469-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 27.89036 + (((tickAnim - 18) / 7) * (61.11274-(27.89036)));
            yy = -14.45494 + (((tickAnim - 18) / 7) * (-24.99379-(-14.45494)));
            zz = 16.43469 + (((tickAnim - 18) / 7) * (-28.32899-(16.43469)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 61.11274 + (((tickAnim - 25) / 10) * (74.54558-(61.11274)));
            yy = -24.99379 + (((tickAnim - 25) / 10) * (-38.58491-(-24.99379)));
            zz = -28.32899 + (((tickAnim - 25) / 10) * (-42.21896-(-28.32899)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 74.54558 + (((tickAnim - 35) / 7) * (75.01921-(74.54558)));
            yy = -38.58491 + (((tickAnim - 35) / 7) * (-36.44595-(-38.58491)));
            zz = -42.21896 + (((tickAnim - 35) / 7) * (-29.57904-(-42.21896)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 75.01921 + (((tickAnim - 42) / 5) * (74.28072-(75.01921)));
            yy = -36.44595 + (((tickAnim - 42) / 5) * (-38.20301-(-36.44595)));
            zz = -29.57904 + (((tickAnim - 42) / 5) * (-32.83397-(-29.57904)));
        }
        else if (tickAnim >= 47 && tickAnim < 67) {
            xx = 74.28072 + (((tickAnim - 47) / 20) * (74.54558-(74.28072)));
            yy = -38.20301 + (((tickAnim - 47) / 20) * (-38.58491-(-38.20301)));
            zz = -32.83397 + (((tickAnim - 47) / 20) * (-42.21896-(-32.83397)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = 74.54558 + (((tickAnim - 67) / 23) * (74.54558-(74.54558)));
            yy = -38.58491 + (((tickAnim - 67) / 23) * (-38.58491-(-38.58491)));
            zz = -42.21896 + (((tickAnim - 67) / 23) * (-42.21896-(-42.21896)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 74.54558 + (((tickAnim - 90) / 12) * (63.90504-(74.54558)));
            yy = -38.58491 + (((tickAnim - 90) / 12) * (-8.99256-(-38.58491)));
            zz = -42.21896 + (((tickAnim - 90) / 12) * (20.1396-(-42.21896)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 63.90504 + (((tickAnim - 102) / 11) * (0-(63.90504)));
            yy = -8.99256 + (((tickAnim - 102) / 11) * (0-(-8.99256)));
            zz = 20.1396 + (((tickAnim - 102) / 11) * (0-(20.1396)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg5, wingmembranebeg5.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg5.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-1.225-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (3.175-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (1.84-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.225 + (((tickAnim - 18) / 2) * (-1.26-(-1.225)));
            yy = 3.175 + (((tickAnim - 18) / 2) * (7.44-(3.175)));
            zz = 1.84 + (((tickAnim - 18) / 2) * (0.775-(1.84)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -1.26 + (((tickAnim - 20) / 5) * (-6.015-(-1.26)));
            yy = 7.44 + (((tickAnim - 20) / 5) * (15.285-(7.44)));
            zz = 0.775 + (((tickAnim - 20) / 5) * (1.4-(0.775)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -6.015 + (((tickAnim - 25) / 10) * (-8.8-(-6.015)));
            yy = 15.285 + (((tickAnim - 25) / 10) * (18.45-(15.285)));
            zz = 1.4 + (((tickAnim - 25) / 10) * (2.05-(1.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -8.8 + (((tickAnim - 35) / 2) * (-9.705-(-8.8)));
            yy = 18.45 + (((tickAnim - 35) / 2) * (18.6-(18.45)));
            zz = 2.05 + (((tickAnim - 35) / 2) * (2.08-(2.05)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -9.705 + (((tickAnim - 37) / 5) * (-6.51-(-9.705)));
            yy = 18.6 + (((tickAnim - 37) / 5) * (16.26-(18.6)));
            zz = 2.08 + (((tickAnim - 37) / 5) * (2.165-(2.08)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -6.51 + (((tickAnim - 42) / 5) * (-7.105-(-6.51)));
            yy = 16.26 + (((tickAnim - 42) / 5) * (14.32-(16.26)));
            zz = 2.165 + (((tickAnim - 42) / 5) * (1.9-(2.165)));
        }
        else if (tickAnim >= 47 && tickAnim < 67) {
            xx = -7.105 + (((tickAnim - 47) / 20) * (-8.8-(-7.105)));
            yy = 14.32 + (((tickAnim - 47) / 20) * (18.45-(14.32)));
            zz = 1.9 + (((tickAnim - 47) / 20) * (2.05-(1.9)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = -8.8 + (((tickAnim - 67) / 23) * (-8.8-(-8.8)));
            yy = 18.45 + (((tickAnim - 67) / 23) * (18.45-(18.45)));
            zz = 2.05 + (((tickAnim - 67) / 23) * (2.05-(2.05)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = -8.8 + (((tickAnim - 90) / 12) * (-2.325-(-8.8)));
            yy = 18.45 + (((tickAnim - 90) / 12) * (5.875-(18.45)));
            zz = 2.05 + (((tickAnim - 90) / 12) * (-0.825-(2.05)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = -2.325 + (((tickAnim - 102) / 11) * (0-(-2.325)));
            yy = 5.875 + (((tickAnim - 102) / 11) * (0-(5.875)));
            zz = -0.825 + (((tickAnim - 102) / 11) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg5.rotationPointX = this.wingmembranebeg5.rotationPointX + (float)(xx);
        this.wingmembranebeg5.rotationPointY = this.wingmembranebeg5.rotationPointY - (float)(yy);
        this.wingmembranebeg5.rotationPointZ = this.wingmembranebeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (54.77207-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (5.90235-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-53.29388-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 54.77207 + (((tickAnim - 14) / 11) * (71.01618-(54.77207)));
            yy = 5.90235 + (((tickAnim - 14) / 11) * (34.9235-(5.90235)));
            zz = -53.29388 + (((tickAnim - 14) / 11) * (26.32058-(-53.29388)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 71.01618 + (((tickAnim - 25) / 10) * (68.13051-(71.01618)));
            yy = 34.9235 + (((tickAnim - 25) / 10) * (27.27835-(34.9235)));
            zz = 26.32058 + (((tickAnim - 25) / 10) * (43.91714-(26.32058)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 68.13051 + (((tickAnim - 35) / 2) * (68.56374-(68.13051)));
            yy = 27.27835 + (((tickAnim - 35) / 2) * (29.4695-(27.27835)));
            zz = 43.91714 + (((tickAnim - 35) / 2) * (42.40556-(43.91714)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 68.56374 + (((tickAnim - 37) / 2) * (74.48548-(68.56374)));
            yy = 29.4695 + (((tickAnim - 37) / 2) * (25.2939-(29.4695)));
            zz = 42.40556 + (((tickAnim - 37) / 2) * (18.9092-(42.40556)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 74.48548 + (((tickAnim - 39) / 2) * (70.29513-(74.48548)));
            yy = 25.2939 + (((tickAnim - 39) / 2) * (32.97954-(25.2939)));
            zz = 18.9092 + (((tickAnim - 39) / 2) * (36.43182-(18.9092)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 70.29513 + (((tickAnim - 41) / 10) * (71.77734-(70.29513)));
            yy = 32.97954 + (((tickAnim - 41) / 10) * (28.76607-(32.97954)));
            zz = 36.43182 + (((tickAnim - 41) / 10) * (28.75474-(36.43182)));
        }
        else if (tickAnim >= 51 && tickAnim < 65) {
            xx = 71.77734 + (((tickAnim - 51) / 14) * (78.70827-(71.77734)));
            yy = 28.76607 + (((tickAnim - 51) / 14) * (28.22795-(28.76607)));
            zz = 28.75474 + (((tickAnim - 51) / 14) * (34.23901-(28.75474)));
        }
        else if (tickAnim >= 65 && tickAnim < 90) {
            xx = 78.70827 + (((tickAnim - 65) / 25) * (80.63051-(78.70827)));
            yy = 28.22795 + (((tickAnim - 65) / 25) * (27.27835-(28.22795)));
            zz = 34.23901 + (((tickAnim - 65) / 25) * (43.91714-(34.23901)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 80.63051 + (((tickAnim - 90) / 12) * (61.74568-(80.63051)));
            yy = 27.27835 + (((tickAnim - 90) / 12) * (17.34222-(27.27835)));
            zz = 43.91714 + (((tickAnim - 90) / 12) * (-55.54833-(43.91714)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 61.74568 + (((tickAnim - 102) / 11) * (0-(61.74568)));
            yy = 17.34222 + (((tickAnim - 102) / 11) * (0-(17.34222)));
            zz = -55.54833 + (((tickAnim - 102) / 11) * (0-(-55.54833)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg6, wingmembranebeg6.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg6.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-0.43-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (3.3-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (4.175-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -0.43 + (((tickAnim - 14) / 11) * (1.185-(-0.43)));
            yy = 3.3 + (((tickAnim - 14) / 11) * (6.365-(3.3)));
            zz = 4.175 + (((tickAnim - 14) / 11) * (5.15-(4.175)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 1.185 + (((tickAnim - 25) / 10) * (0.425-(1.185)));
            yy = 6.365 + (((tickAnim - 25) / 10) * (6.175-(6.365)));
            zz = 5.15 + (((tickAnim - 25) / 10) * (6.05-(5.15)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0.425 + (((tickAnim - 35) / 4) * (-0.82-(0.425)));
            yy = 6.175 + (((tickAnim - 35) / 4) * (5.68-(6.175)));
            zz = 6.05 + (((tickAnim - 35) / 4) * (6.05-(6.05)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -0.82 + (((tickAnim - 39) / 4) * (1.13-(-0.82)));
            yy = 5.68 + (((tickAnim - 39) / 4) * (4.93-(5.68)));
            zz = 6.05 + (((tickAnim - 39) / 4) * (6.05-(6.05)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 1.13 + (((tickAnim - 43) / 8) * (-0.005-(1.13)));
            yy = 4.93 + (((tickAnim - 43) / 8) * (5.475-(4.93)));
            zz = 6.05 + (((tickAnim - 43) / 8) * (6.05-(6.05)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -0.005 + (((tickAnim - 51) / 4) * (1.09-(-0.005)));
            yy = 5.475 + (((tickAnim - 51) / 4) * (5.5-(5.475)));
            zz = 6.05 + (((tickAnim - 51) / 4) * (6.05-(6.05)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 1.09 + (((tickAnim - 55) / 10) * (-0.075-(1.09)));
            yy = 5.5 + (((tickAnim - 55) / 10) * (7.45-(5.5)));
            zz = 6.05 + (((tickAnim - 55) / 10) * (5.6-(6.05)));
        }
        else if (tickAnim >= 65 && tickAnim < 90) {
            xx = -0.075 + (((tickAnim - 65) / 25) * (0.425-(-0.075)));
            yy = 7.45 + (((tickAnim - 65) / 25) * (7.425-(7.45)));
            zz = 5.6 + (((tickAnim - 65) / 25) * (5.575-(5.6)));
        }
        else if (tickAnim >= 90 && tickAnim < 102) {
            xx = 0.425 + (((tickAnim - 90) / 12) * (0.06-(0.425)));
            yy = 7.425 + (((tickAnim - 90) / 12) * (3.25-(7.425)));
            zz = 5.575 + (((tickAnim - 90) / 12) * (6.26-(5.575)));
        }
        else if (tickAnim >= 102 && tickAnim < 113) {
            xx = 0.06 + (((tickAnim - 102) / 11) * (0-(0.06)));
            yy = 3.25 + (((tickAnim - 102) / 11) * (0-(3.25)));
            zz = 6.26 + (((tickAnim - 102) / 11) * (0-(6.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg6.rotationPointX = this.wingmembranebeg6.rotationPointX + (float)(xx);
        this.wingmembranebeg6.rotationPointY = this.wingmembranebeg6.rotationPointY - (float)(yy);
        this.wingmembranebeg6.rotationPointZ = this.wingmembranebeg6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-16.71715-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (13.54374-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-10.09658-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -16.71715 + (((tickAnim - 35) / 3) * (-15.85215-(-16.71715)));
            yy = 13.54374 + (((tickAnim - 35) / 3) * (-4.57652-(13.54374)));
            zz = -10.09658 + (((tickAnim - 35) / 3) * (-12.26751-(-10.09658)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -15.85215 + (((tickAnim - 38) / 0) * (-14.82362-(-15.85215)));
            yy = -4.57652 + (((tickAnim - 38) / 0) * (-14.10159-(-4.57652)));
            zz = -12.26751 + (((tickAnim - 38) / 0) * (-14.98858-(-12.26751)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -14.82362 + (((tickAnim - 38) / 1) * (-11.25583-(-14.82362)));
            yy = -14.10159 + (((tickAnim - 38) / 1) * (-27.62354-(-14.10159)));
            zz = -14.98858 + (((tickAnim - 38) / 1) * (-10.47711-(-14.98858)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -11.25583 + (((tickAnim - 39) / 1) * (-10.15056-(-11.25583)));
            yy = -27.62354 + (((tickAnim - 39) / 1) * (-13.3052-(-27.62354)));
            zz = -10.47711 + (((tickAnim - 39) / 1) * (-13.15793-(-10.47711)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -10.15056 + (((tickAnim - 40) / 2) * (-9.66373-(-10.15056)));
            yy = -13.3052 + (((tickAnim - 40) / 2) * (-0.68347-(-13.3052)));
            zz = -13.15793 + (((tickAnim - 40) / 2) * (-14.99587-(-13.15793)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -9.66373 + (((tickAnim - 42) / 1) * (-6.87779-(-9.66373)));
            yy = -0.68347 + (((tickAnim - 42) / 1) * (18.04418-(-0.68347)));
            zz = -14.99587 + (((tickAnim - 42) / 1) * (-7.4433-(-14.99587)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -6.87779 + (((tickAnim - 43) / 4) * (-15.22322-(-6.87779)));
            yy = 18.04418 + (((tickAnim - 43) / 4) * (16.98276-(18.04418)));
            zz = -7.4433 + (((tickAnim - 43) / 4) * (-7.00546-(-7.4433)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -15.22322 + (((tickAnim - 47) / 3) * (-11.97592-(-15.22322)));
            yy = 16.98276 + (((tickAnim - 47) / 3) * (-16.02115-(16.98276)));
            zz = -7.00546 + (((tickAnim - 47) / 3) * (-3.71522-(-7.00546)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -11.97592 + (((tickAnim - 50) / 3) * (-6.09014-(-11.97592)));
            yy = -16.02115 + (((tickAnim - 50) / 3) * (-1.65727-(-16.02115)));
            zz = -3.71522 + (((tickAnim - 50) / 3) * (-6.33501-(-3.71522)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = -6.09014 + (((tickAnim - 53) / 1) * (-4.98086-(-6.09014)));
            yy = -1.65727 + (((tickAnim - 53) / 1) * (16.71655-(-1.65727)));
            zz = -6.33501 + (((tickAnim - 53) / 1) * (-0.82964-(-6.33501)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = -4.98086 + (((tickAnim - 54) / 7) * (-14.06322-(-4.98086)));
            yy = 16.71655 + (((tickAnim - 54) / 7) * (-6.10714-(16.71655)));
            zz = -0.82964 + (((tickAnim - 54) / 7) * (2.74579-(-0.82964)));
        }
        else if (tickAnim >= 61 && tickAnim < 67) {
            xx = -14.06322 + (((tickAnim - 61) / 6) * (-15.56274-(-14.06322)));
            yy = -6.10714 + (((tickAnim - 61) / 6) * (1.57306-(-6.10714)));
            zz = 2.74579 + (((tickAnim - 61) / 6) * (0.71662-(2.74579)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = -15.56274 + (((tickAnim - 67) / 23) * (-14.20168-(-15.56274)));
            yy = 1.57306 + (((tickAnim - 67) / 23) * (-1.15304-(1.57306)));
            zz = 0.71662 + (((tickAnim - 67) / 23) * (-0.06229-(0.71662)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = -14.20168 + (((tickAnim - 90) / 23) * (0-(-14.20168)));
            yy = -1.15304 + (((tickAnim - 90) / 23) * (0-(-1.15304)));
            zz = -0.06229 + (((tickAnim - 90) / 23) * (0-(-0.06229)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranemiddle3, wingmembranemiddle3.rotateAngleX + (float) Math.toRadians(xx), wingmembranemiddle3.rotateAngleY + (float) Math.toRadians(yy), wingmembranemiddle3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.08-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.74-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0.08 + (((tickAnim - 13) / 22) * (-1.4-(0.08)));
            yy = -1.525 + (((tickAnim - 13) / 22) * (2.075-(-1.525)));
            zz = -1.74 + (((tickAnim - 13) / 22) * (-10.85-(-1.74)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -1.4 + (((tickAnim - 35) / 3) * (0.815-(-1.4)));
            yy = 2.075 + (((tickAnim - 35) / 3) * (2.01-(2.075)));
            zz = -10.85 + (((tickAnim - 35) / 3) * (-11.25-(-10.85)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0.815 + (((tickAnim - 38) / 0) * (2.61-(0.815)));
            yy = 2.01 + (((tickAnim - 38) / 0) * (1.915-(2.01)));
            zz = -11.25 + (((tickAnim - 38) / 0) * (-11.38-(-11.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 2.61 + (((tickAnim - 38) / 1) * (2.805-(2.61)));
            yy = 1.915 + (((tickAnim - 38) / 1) * (1.89-(1.915)));
            zz = -11.38 + (((tickAnim - 38) / 1) * (-11.25-(-11.38)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 2.805 + (((tickAnim - 39) / 1) * (2.695-(2.805)));
            yy = 1.89 + (((tickAnim - 39) / 1) * (1.72-(1.89)));
            zz = -11.25 + (((tickAnim - 39) / 1) * (-11.22-(-11.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 2.695 + (((tickAnim - 40) / 1) * (1.31-(2.695)));
            yy = 1.72 + (((tickAnim - 40) / 1) * (1.275-(1.72)));
            zz = -11.22 + (((tickAnim - 40) / 1) * (-11.59-(-11.22)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 1.31 + (((tickAnim - 41) / 1) * (1.065-(1.31)));
            yy = 1.275 + (((tickAnim - 41) / 1) * (0.96-(1.275)));
            zz = -11.59 + (((tickAnim - 41) / 1) * (-11.46-(-11.59)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 1.065 + (((tickAnim - 42) / 1) * (-0.475-(1.065)));
            yy = 0.96 + (((tickAnim - 42) / 1) * (0.775-(0.96)));
            zz = -11.46 + (((tickAnim - 42) / 1) * (-11.13-(-11.46)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = -0.475 + (((tickAnim - 43) / 0) * (-0.72-(-0.475)));
            yy = 0.775 + (((tickAnim - 43) / 0) * (1.02-(0.775)));
            zz = -11.13 + (((tickAnim - 43) / 0) * (-10.1-(-11.13)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -0.72 + (((tickAnim - 43) / 4) * (-1.265-(-0.72)));
            yy = 1.02 + (((tickAnim - 43) / 4) * (1.995-(1.02)));
            zz = -10.1 + (((tickAnim - 43) / 4) * (-10.02-(-10.1)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -1.265 + (((tickAnim - 47) / 3) * (2-(-1.265)));
            yy = 1.995 + (((tickAnim - 47) / 3) * (1.9-(1.995)));
            zz = -10.02 + (((tickAnim - 47) / 3) * (-10.57-(-10.02)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 2 + (((tickAnim - 50) / 3) * (0.345-(2)));
            yy = 1.9 + (((tickAnim - 50) / 3) * (1.405-(1.9)));
            zz = -10.57 + (((tickAnim - 50) / 3) * (-10.525-(-10.57)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = 0.345 + (((tickAnim - 53) / 1) * (-1.51-(0.345)));
            yy = 1.405 + (((tickAnim - 53) / 1) * (0.895-(1.405)));
            zz = -10.525 + (((tickAnim - 53) / 1) * (-10.74-(-10.525)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -1.51 + (((tickAnim - 54) / 2) * (-0.82-(-1.51)));
            yy = 0.895 + (((tickAnim - 54) / 2) * (0.87-(0.895)));
            zz = -10.74 + (((tickAnim - 54) / 2) * (-10.44-(-10.74)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = -0.82 + (((tickAnim - 56) / 5) * (0.39-(-0.82)));
            yy = 0.87 + (((tickAnim - 56) / 5) * (2.515-(0.87)));
            zz = -10.44 + (((tickAnim - 56) / 5) * (-11.19-(-10.44)));
        }
        else if (tickAnim >= 61 && tickAnim < 67) {
            xx = 0.39 + (((tickAnim - 61) / 6) * (0.6-(0.39)));
            yy = 2.515 + (((tickAnim - 61) / 6) * (2.755-(2.515)));
            zz = -11.19 + (((tickAnim - 61) / 6) * (-12.065-(-11.19)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = 0.6 + (((tickAnim - 67) / 23) * (0.52-(0.6)));
            yy = 2.755 + (((tickAnim - 67) / 23) * (2.65-(2.755)));
            zz = -12.065 + (((tickAnim - 67) / 23) * (-11.69-(-12.065)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0.52 + (((tickAnim - 90) / 10) * (0.21-(0.52)));
            yy = 2.65 + (((tickAnim - 90) / 10) * (-2.29-(2.65)));
            zz = -11.69 + (((tickAnim - 90) / 10) * (-1.43-(-11.69)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 0.21 + (((tickAnim - 100) / 13) * (0-(0.21)));
            yy = -2.29 + (((tickAnim - 100) / 13) * (0-(-2.29)));
            zz = -1.43 + (((tickAnim - 100) / 13) * (0-(-1.43)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranemiddle3.rotationPointX = this.wingmembranemiddle3.rotationPointX + (float)(xx);
        this.wingmembranemiddle3.rotationPointY = this.wingmembranemiddle3.rotationPointY - (float)(yy);
        this.wingmembranemiddle3.rotationPointZ = this.wingmembranemiddle3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-13.06893-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-3.9518-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-5.73136-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = -13.06893 + (((tickAnim - 14) / 21) * (-26.66388-(-13.06893)));
            yy = -3.9518 + (((tickAnim - 14) / 21) * (10.73084-(-3.9518)));
            zz = -5.73136 + (((tickAnim - 14) / 21) * (-19.33874-(-5.73136)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -26.66388 + (((tickAnim - 35) / 3) * (-24.23324-(-26.66388)));
            yy = 10.73084 + (((tickAnim - 35) / 3) * (-7.38576-(10.73084)));
            zz = -19.33874 + (((tickAnim - 35) / 3) * (-20.22282-(-19.33874)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -24.23324 + (((tickAnim - 38) / 2) * (-10.39337-(-24.23324)));
            yy = -7.38576 + (((tickAnim - 38) / 2) * (-18.63642-(-7.38576)));
            zz = -20.22282 + (((tickAnim - 38) / 2) * (-12.83449-(-20.22282)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -10.39337 + (((tickAnim - 40) / 2) * (-5.95455-(-10.39337)));
            yy = -18.63642 + (((tickAnim - 40) / 2) * (19.63262-(-18.63642)));
            zz = -12.83449 + (((tickAnim - 40) / 2) * (-11.52748-(-12.83449)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -5.95455 + (((tickAnim - 42) / 1) * (-10.53776-(-5.95455)));
            yy = 19.63262 + (((tickAnim - 42) / 1) * (42.50163-(19.63262)));
            zz = -11.52748 + (((tickAnim - 42) / 1) * (-14.54061-(-11.52748)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -10.53776 + (((tickAnim - 43) / 2) * (-21.79543-(-10.53776)));
            yy = 42.50163 + (((tickAnim - 43) / 2) * (29.41014-(42.50163)));
            zz = -14.54061 + (((tickAnim - 43) / 2) * (-11.66274-(-14.54061)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = -21.79543 + (((tickAnim - 45) / 2) * (-25.72853-(-21.79543)));
            yy = 29.41014 + (((tickAnim - 45) / 2) * (17.437-(29.41014)));
            zz = -11.66274 + (((tickAnim - 45) / 2) * (-6.84526-(-11.66274)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -25.72853 + (((tickAnim - 47) / 3) * (-16.13972-(-25.72853)));
            yy = 17.437 + (((tickAnim - 47) / 3) * (-16.44867-(17.437)));
            zz = -6.84526 + (((tickAnim - 47) / 3) * (4.8305-(-6.84526)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -16.13972 + (((tickAnim - 50) / 3) * (-9.14397-(-16.13972)));
            yy = -16.44867 + (((tickAnim - 50) / 3) * (2.50835-(-16.44867)));
            zz = 4.8305 + (((tickAnim - 50) / 3) * (-9.52021-(4.8305)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = -9.14397 + (((tickAnim - 53) / 1) * (-9.50439-(-9.14397)));
            yy = 2.50835 + (((tickAnim - 53) / 1) * (20.70599-(2.50835)));
            zz = -9.52021 + (((tickAnim - 53) / 1) * (-12.26546-(-9.52021)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -9.50439 + (((tickAnim - 54) / 2) * (-14.00462-(-9.50439)));
            yy = 20.70599 + (((tickAnim - 54) / 2) * (36.13067-(20.70599)));
            zz = -12.26546 + (((tickAnim - 54) / 2) * (-15.10791-(-12.26546)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = -14.00462 + (((tickAnim - 56) / 14) * (-32.74149-(-14.00462)));
            yy = 36.13067 + (((tickAnim - 56) / 14) * (9.00571-(36.13067)));
            zz = -15.10791 + (((tickAnim - 56) / 14) * (-8.01217-(-15.10791)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -32.74149 + (((tickAnim - 70) / 20) * (-36.13003-(-32.74149)));
            yy = 9.00571 + (((tickAnim - 70) / 20) * (4.84923-(9.00571)));
            zz = -8.01217 + (((tickAnim - 70) / 20) * (-4.31424-(-8.01217)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = -36.13003 + (((tickAnim - 90) / 8) * (-0.45426-(-36.13003)));
            yy = 4.84923 + (((tickAnim - 90) / 8) * (4.48338-(4.84923)));
            zz = -4.31424 + (((tickAnim - 90) / 8) * (-3.98876-(-4.31424)));
        }
        else if (tickAnim >= 98 && tickAnim < 113) {
            xx = -0.45426 + (((tickAnim - 98) / 15) * (0-(-0.45426)));
            yy = 4.48338 + (((tickAnim - 98) / 15) * (0-(4.48338)));
            zz = -3.98876 + (((tickAnim - 98) / 15) * (0-(-3.98876)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembraneend3, wingmembraneend3.rotateAngleX + (float) Math.toRadians(xx), wingmembraneend3.rotateAngleY + (float) Math.toRadians(yy), wingmembraneend3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-0.825-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (3.65-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = -0.825 + (((tickAnim - 14) / 21) * (-2.925-(-0.825)));
            yy = 0.9 + (((tickAnim - 14) / 21) * (5.55-(0.9)));
            zz = 3.65 + (((tickAnim - 14) / 21) * (-4.75-(3.65)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -2.925 + (((tickAnim - 35) / 3) * (-2.755-(-2.925)));
            yy = 5.55 + (((tickAnim - 35) / 3) * (3.795-(5.55)));
            zz = -4.75 + (((tickAnim - 35) / 3) * (-4.6-(-4.75)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.755 + (((tickAnim - 38) / 2) * (-0.21-(-2.755)));
            yy = 3.795 + (((tickAnim - 38) / 2) * (4.47-(3.795)));
            zz = -4.6 + (((tickAnim - 38) / 2) * (-7.95-(-4.6)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -0.21 + (((tickAnim - 40) / 2) * (-1.46-(-0.21)));
            yy = 4.47 + (((tickAnim - 40) / 2) * (6.045-(4.47)));
            zz = -7.95 + (((tickAnim - 40) / 2) * (-7.97-(-7.95)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -1.46 + (((tickAnim - 42) / 1) * (-2.165-(-1.46)));
            yy = 6.045 + (((tickAnim - 42) / 1) * (5.87-(6.045)));
            zz = -7.97 + (((tickAnim - 42) / 1) * (-7.88-(-7.97)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = -2.165 + (((tickAnim - 43) / 0) * (-2.14-(-2.165)));
            yy = 5.87 + (((tickAnim - 43) / 0) * (6.625-(5.87)));
            zz = -7.88 + (((tickAnim - 43) / 0) * (-7.79-(-7.88)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -2.14 + (((tickAnim - 43) / 2) * (-0.915-(-2.14)));
            yy = 6.625 + (((tickAnim - 43) / 2) * (5.92-(6.625)));
            zz = -7.79 + (((tickAnim - 43) / 2) * (-4.875-(-7.79)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = -0.915 + (((tickAnim - 45) / 2) * (-0.89-(-0.915)));
            yy = 5.92 + (((tickAnim - 45) / 2) * (5.38-(5.92)));
            zz = -4.875 + (((tickAnim - 45) / 2) * (-3.735-(-4.875)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -0.89 + (((tickAnim - 47) / 3) * (0.4-(-0.89)));
            yy = 5.38 + (((tickAnim - 47) / 3) * (5.11-(5.38)));
            zz = -3.735 + (((tickAnim - 47) / 3) * (-6.6-(-3.735)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0.4 + (((tickAnim - 50) / 3) * (-1.545-(0.4)));
            yy = 5.11 + (((tickAnim - 50) / 3) * (5.41-(5.11)));
            zz = -6.6 + (((tickAnim - 50) / 3) * (-7.515-(-6.6)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = -1.545 + (((tickAnim - 53) / 1) * (-2.025-(-1.545)));
            yy = 5.41 + (((tickAnim - 53) / 1) * (5.46-(5.41)));
            zz = -7.515 + (((tickAnim - 53) / 1) * (-7.985-(-7.515)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -2.025 + (((tickAnim - 54) / 2) * (-1.52-(-2.025)));
            yy = 5.46 + (((tickAnim - 54) / 2) * (5.31-(5.46)));
            zz = -7.985 + (((tickAnim - 54) / 2) * (-7.185-(-7.985)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = -1.52 + (((tickAnim - 56) / 14) * (-0.4-(-1.52)));
            yy = 5.31 + (((tickAnim - 56) / 14) * (4.875-(5.31)));
            zz = -7.185 + (((tickAnim - 56) / 14) * (-4.285-(-7.185)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -0.4 + (((tickAnim - 70) / 20) * (-0.395-(-0.4)));
            yy = 4.875 + (((tickAnim - 70) / 20) * (4.345-(4.875)));
            zz = -4.285 + (((tickAnim - 70) / 20) * (-3.335-(-4.285)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = -0.395 + (((tickAnim - 90) / 8) * (-0.56-(-0.395)));
            yy = 4.345 + (((tickAnim - 90) / 8) * (1.78-(4.345)));
            zz = -3.335 + (((tickAnim - 90) / 8) * (1.705-(-3.335)));
        }
        else if (tickAnim >= 98 && tickAnim < 113) {
            xx = -0.56 + (((tickAnim - 98) / 15) * (0-(-0.56)));
            yy = 1.78 + (((tickAnim - 98) / 15) * (0-(1.78)));
            zz = 1.705 + (((tickAnim - 98) / 15) * (0-(1.705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembraneend3.rotationPointX = this.wingmembraneend3.rotationPointX + (float)(xx);
        this.wingmembraneend3.rotationPointY = this.wingmembraneend3.rotationPointY - (float)(yy);
        this.wingmembraneend3.rotationPointZ = this.wingmembraneend3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-20.36852-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-11.89913-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (26.65459-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -20.36852 + (((tickAnim - 35) / 3) * (-16.64872-(-20.36852)));
            yy = -11.89913 + (((tickAnim - 35) / 3) * (-10.22263-(-11.89913)));
            zz = 26.65459 + (((tickAnim - 35) / 3) * (7.33369-(26.65459)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -16.64872 + (((tickAnim - 38) / 0) * (-14.75501-(-16.64872)));
            yy = -10.22263 + (((tickAnim - 38) / 0) * (7.26586-(-10.22263)));
            zz = 7.33369 + (((tickAnim - 38) / 0) * (2.10889-(7.33369)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -14.75501 + (((tickAnim - 38) / 1) * (-17.73201-(-14.75501)));
            yy = 7.26586 + (((tickAnim - 38) / 1) * (20.88917-(7.26586)));
            zz = 2.10889 + (((tickAnim - 38) / 1) * (-2.20762-(2.10889)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -17.73201 + (((tickAnim - 39) / 1) * (-16.66239-(-17.73201)));
            yy = 20.88917 + (((tickAnim - 39) / 1) * (9.18952-(20.88917)));
            zz = -2.20762 + (((tickAnim - 39) / 1) * (1.565-(-2.20762)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -16.66239 + (((tickAnim - 40) / 1) * (-17.84615-(-16.66239)));
            yy = 9.18952 + (((tickAnim - 40) / 1) * (4.8681-(9.18952)));
            zz = 1.565 + (((tickAnim - 40) / 1) * (14.01655-(1.565)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = -17.84615 + (((tickAnim - 41) / 1) * (-11.24169-(-17.84615)));
            yy = 4.8681 + (((tickAnim - 41) / 1) * (-5.01677-(4.8681)));
            zz = 14.01655 + (((tickAnim - 41) / 1) * (19.79443-(14.01655)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -11.24169 + (((tickAnim - 42) / 1) * (-13.81303-(-11.24169)));
            yy = -5.01677 + (((tickAnim - 42) / 1) * (-14.49198-(-5.01677)));
            zz = 19.79443 + (((tickAnim - 42) / 1) * (25.71227-(19.79443)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = -13.81303 + (((tickAnim - 43) / 0) * (-15.91926-(-13.81303)));
            yy = -14.49198 + (((tickAnim - 43) / 0) * (-15.22286-(-14.49198)));
            zz = 25.71227 + (((tickAnim - 43) / 0) * (29.44946-(25.71227)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -15.91926 + (((tickAnim - 43) / 4) * (-24.41888-(-15.91926)));
            yy = -15.22286 + (((tickAnim - 43) / 4) * (-9.75215-(-15.22286)));
            zz = 29.44946 + (((tickAnim - 43) / 4) * (27.65-(29.44946)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -24.41888 + (((tickAnim - 47) / 3) * (-6.57689-(-24.41888)));
            yy = -9.75215 + (((tickAnim - 47) / 3) * (27.77212-(-9.75215)));
            zz = 27.65 + (((tickAnim - 47) / 3) * (11.13705-(27.65)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -6.57689 + (((tickAnim - 50) / 3) * (-11.70284-(-6.57689)));
            yy = 27.77212 + (((tickAnim - 50) / 3) * (6.93529-(27.77212)));
            zz = 11.13705 + (((tickAnim - 50) / 3) * (14.68557-(11.13705)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = -11.70284 + (((tickAnim - 53) / 3) * (-11.52776-(-11.70284)));
            yy = 6.93529 + (((tickAnim - 53) / 3) * (-17.48435-(6.93529)));
            zz = 14.68557 + (((tickAnim - 53) / 3) * (18.66599-(14.68557)));
        }
        else if (tickAnim >= 56 && tickAnim < 67) {
            xx = -11.52776 + (((tickAnim - 56) / 11) * (-13.42518-(-11.52776)));
            yy = -17.48435 + (((tickAnim - 56) / 11) * (-8.76187-(-17.48435)));
            zz = 18.66599 + (((tickAnim - 56) / 11) * (14.24954-(18.66599)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = -13.42518 + (((tickAnim - 67) / 23) * (-22.01333-(-13.42518)));
            yy = -8.76187 + (((tickAnim - 67) / 23) * (-7.35425-(-8.76187)));
            zz = 14.24954 + (((tickAnim - 67) / 23) * (23.28449-(14.24954)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = -22.01333 + (((tickAnim - 90) / 23) * (0-(-22.01333)));
            yy = -7.35425 + (((tickAnim - 90) / 23) * (0-(-7.35425)));
            zz = 23.28449 + (((tickAnim - 90) / 23) * (0-(23.28449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranemiddle5, wingmembranemiddle5.rotateAngleX + (float) Math.toRadians(xx), wingmembranemiddle5.rotateAngleY + (float) Math.toRadians(yy), wingmembranemiddle5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.74-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.35-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.98-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -0.74 + (((tickAnim - 13) / 22) * (-1.55-(-0.74)));
            yy = -1.35 + (((tickAnim - 13) / 22) * (-2.8-(-1.35)));
            zz = -0.98 + (((tickAnim - 13) / 22) * (-7.925-(-0.98)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -1.55 + (((tickAnim - 35) / 3) * (-0.295-(-1.55)));
            yy = -2.8 + (((tickAnim - 35) / 3) * (0.875-(-2.8)));
            zz = -7.925 + (((tickAnim - 35) / 3) * (-8.795-(-7.925)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -0.295 + (((tickAnim - 38) / 0) * (-0.97-(-0.295)));
            yy = 0.875 + (((tickAnim - 38) / 0) * (1.9-(0.875)));
            zz = -8.795 + (((tickAnim - 38) / 0) * (-12.79-(-8.795)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -0.97 + (((tickAnim - 38) / 1) * (-2.895-(-0.97)));
            yy = 1.9 + (((tickAnim - 38) / 1) * (2.85-(1.9)));
            zz = -12.79 + (((tickAnim - 38) / 1) * (-15.04-(-12.79)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -2.895 + (((tickAnim - 39) / 1) * (-1.32-(-2.895)));
            yy = 2.85 + (((tickAnim - 39) / 1) * (1.35-(2.85)));
            zz = -15.04 + (((tickAnim - 39) / 1) * (-13.59-(-15.04)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -1.32 + (((tickAnim - 40) / 1) * (-1.795-(-1.32)));
            yy = 1.35 + (((tickAnim - 40) / 1) * (-1.775-(1.35)));
            zz = -13.59 + (((tickAnim - 40) / 1) * (-13.44-(-13.59)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = -1.795 + (((tickAnim - 41) / 1) * (-1.69-(-1.795)));
            yy = -1.775 + (((tickAnim - 41) / 1) * (-3.38-(-1.775)));
            zz = -13.44 + (((tickAnim - 41) / 1) * (-10.225-(-13.44)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -1.69 + (((tickAnim - 42) / 1) * (-1.73-(-1.69)));
            yy = -3.38 + (((tickAnim - 42) / 1) * (-4.59-(-3.38)));
            zz = -10.225 + (((tickAnim - 42) / 1) * (-8.98-(-10.225)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = -1.73 + (((tickAnim - 43) / 0) * (-2.82-(-1.73)));
            yy = -4.59 + (((tickAnim - 43) / 0) * (-4.05-(-4.59)));
            zz = -8.98 + (((tickAnim - 43) / 0) * (-7.915-(-8.98)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -2.82 + (((tickAnim - 43) / 4) * (-1.82-(-2.82)));
            yy = -4.05 + (((tickAnim - 43) / 4) * (-2.975-(-4.05)));
            zz = -7.915 + (((tickAnim - 43) / 4) * (-9.59-(-7.915)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -1.82 + (((tickAnim - 47) / 3) * (-4.87-(-1.82)));
            yy = -2.975 + (((tickAnim - 47) / 3) * (-0.4-(-2.975)));
            zz = -9.59 + (((tickAnim - 47) / 3) * (-15.465-(-9.59)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -4.87 + (((tickAnim - 50) / 3) * (-2.035-(-4.87)));
            yy = -0.4 + (((tickAnim - 50) / 3) * (-1.445-(-0.4)));
            zz = -15.465 + (((tickAnim - 50) / 3) * (-13.58-(-15.465)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = -2.035 + (((tickAnim - 53) / 1) * (-0.66-(-2.035)));
            yy = -1.445 + (((tickAnim - 53) / 1) * (-1.985-(-1.445)));
            zz = -13.58 + (((tickAnim - 53) / 1) * (-10.455-(-13.58)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -0.66 + (((tickAnim - 54) / 2) * (-1.42-(-0.66)));
            yy = -1.985 + (((tickAnim - 54) / 2) * (-2.22-(-1.985)));
            zz = -10.455 + (((tickAnim - 54) / 2) * (-6.69-(-10.455)));
        }
        else if (tickAnim >= 56 && tickAnim < 67) {
            xx = -1.42 + (((tickAnim - 56) / 11) * (-1.125-(-1.42)));
            yy = -2.22 + (((tickAnim - 56) / 11) * (-0.905-(-2.22)));
            zz = -6.69 + (((tickAnim - 56) / 11) * (-9.38-(-6.69)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = -1.125 + (((tickAnim - 67) / 23) * (-2.62-(-1.125)));
            yy = -0.905 + (((tickAnim - 67) / 23) * (-1.945-(-0.905)));
            zz = -9.38 + (((tickAnim - 67) / 23) * (-10.915-(-9.38)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = -2.62 + (((tickAnim - 90) / 23) * (0-(-2.62)));
            yy = -1.945 + (((tickAnim - 90) / 23) * (0-(-1.945)));
            zz = -10.915 + (((tickAnim - 90) / 23) * (0-(-10.915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranemiddle5.rotationPointX = this.wingmembranemiddle5.rotationPointX + (float)(xx);
        this.wingmembranemiddle5.rotationPointY = this.wingmembranemiddle5.rotationPointY - (float)(yy);
        this.wingmembranemiddle5.rotationPointZ = this.wingmembranemiddle5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-18.66956-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-1.30555-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (16.4092-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -18.66956 + (((tickAnim - 35) / 3) * (-23.39676-(-18.66956)));
            yy = -1.30555 + (((tickAnim - 35) / 3) * (-1.09886-(-1.30555)));
            zz = 16.4092 + (((tickAnim - 35) / 3) * (-9.57283-(16.4092)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -23.39676 + (((tickAnim - 38) / 2) * (-13.66391-(-23.39676)));
            yy = -1.09886 + (((tickAnim - 38) / 2) * (13.70482-(-1.09886)));
            zz = -9.57283 + (((tickAnim - 38) / 2) * (-16.11743-(-9.57283)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -13.66391 + (((tickAnim - 40) / 2) * (-7.78136-(-13.66391)));
            yy = 13.70482 + (((tickAnim - 40) / 2) * (-24.73036-(13.70482)));
            zz = -16.11743 + (((tickAnim - 40) / 2) * (3.56406-(-16.11743)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -7.78136 + (((tickAnim - 42) / 1) * (-0.91542-(-7.78136)));
            yy = -24.73036 + (((tickAnim - 42) / 1) * (-32.49145-(-24.73036)));
            zz = 3.56406 + (((tickAnim - 42) / 1) * (3.95479-(3.56406)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = -0.91542 + (((tickAnim - 43) / 0) * (-15.77425-(-0.91542)));
            yy = -32.49145 + (((tickAnim - 43) / 0) * (-29.38774-(-32.49145)));
            zz = 3.95479 + (((tickAnim - 43) / 0) * (25.76737-(3.95479)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -15.77425 + (((tickAnim - 43) / 2) * (-23.90067-(-15.77425)));
            yy = -29.38774 + (((tickAnim - 43) / 2) * (-19.40744-(-29.38774)));
            zz = 25.76737 + (((tickAnim - 43) / 2) * (18.60199-(25.76737)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = -23.90067 + (((tickAnim - 45) / 2) * (-22.52708-(-23.90067)));
            yy = -19.40744 + (((tickAnim - 45) / 2) * (-9.42715-(-19.40744)));
            zz = 18.60199 + (((tickAnim - 45) / 2) * (11.43661-(18.60199)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -22.52708 + (((tickAnim - 47) / 3) * (-6.57189-(-22.52708)));
            yy = -9.42715 + (((tickAnim - 47) / 3) * (16.4221-(-9.42715)));
            zz = 11.43661 + (((tickAnim - 47) / 3) * (0.83392-(11.43661)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -6.57189 + (((tickAnim - 50) / 3) * (-12.41201-(-6.57189)));
            yy = 16.4221 + (((tickAnim - 50) / 3) * (-7.41961-(16.4221)));
            zz = 0.83392 + (((tickAnim - 50) / 3) * (5.96195-(0.83392)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = -12.41201 + (((tickAnim - 53) / 1) * (-13.97034-(-12.41201)));
            yy = -7.41961 + (((tickAnim - 53) / 1) * (-26.82732-(-7.41961)));
            zz = 5.96195 + (((tickAnim - 53) / 1) * (10.7304-(5.96195)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -13.97034 + (((tickAnim - 54) / 2) * (-14.36118-(-13.97034)));
            yy = -26.82732 + (((tickAnim - 54) / 2) * (-35.54642-(-26.82732)));
            zz = 10.7304 + (((tickAnim - 54) / 2) * (12.64905-(10.7304)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = -14.36118 + (((tickAnim - 56) / 14) * (-16.70977-(-14.36118)));
            yy = -35.54642 + (((tickAnim - 56) / 14) * (-11.43979-(-35.54642)));
            zz = 12.64905 + (((tickAnim - 56) / 14) * (5.85078-(12.64905)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -16.70977 + (((tickAnim - 70) / 20) * (-22.68899-(-16.70977)));
            yy = -11.43979 + (((tickAnim - 70) / 20) * (-5.05468-(-11.43979)));
            zz = 5.85078 + (((tickAnim - 70) / 20) * (5.2271-(5.85078)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = -22.68899 + (((tickAnim - 90) / 23) * (0-(-22.68899)));
            yy = -5.05468 + (((tickAnim - 90) / 23) * (0-(-5.05468)));
            zz = 5.2271 + (((tickAnim - 90) / 23) * (0-(5.2271)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembraneend5, wingmembraneend5.rotateAngleX + (float) Math.toRadians(xx), wingmembraneend5.rotateAngleY + (float) Math.toRadians(yy), wingmembraneend5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.825-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.64-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.41-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.825 + (((tickAnim - 15) / 20) * (1.3-(0.825)));
            yy = -0.64 + (((tickAnim - 15) / 20) * (1.475-(-0.64)));
            zz = -2.41 + (((tickAnim - 15) / 20) * (-2.5-(-2.41)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1.3 + (((tickAnim - 35) / 3) * (-2.925-(1.3)));
            yy = 1.475 + (((tickAnim - 35) / 3) * (7.55-(1.475)));
            zz = -2.5 + (((tickAnim - 35) / 3) * (-4.85-(-2.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.925 + (((tickAnim - 38) / 2) * (-3.695-(-2.925)));
            yy = 7.55 + (((tickAnim - 38) / 2) * (8.425-(7.55)));
            zz = -4.85 + (((tickAnim - 38) / 2) * (-9.725-(-4.85)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -3.695 + (((tickAnim - 40) / 2) * (-0.395-(-3.695)));
            yy = 8.425 + (((tickAnim - 40) / 2) * (4.505-(8.425)));
            zz = -9.725 + (((tickAnim - 40) / 2) * (-2.65-(-9.725)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -0.395 + (((tickAnim - 42) / 1) * (1.055-(-0.395)));
            yy = 4.505 + (((tickAnim - 42) / 1) * (5.2-(4.505)));
            zz = -2.65 + (((tickAnim - 42) / 1) * (-0.745-(-2.65)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = 1.055 + (((tickAnim - 43) / 0) * (0.185-(1.055)));
            yy = 5.2 + (((tickAnim - 43) / 0) * (1.42-(5.2)));
            zz = -0.745 + (((tickAnim - 43) / 0) * (0.89-(-0.745)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0.185 + (((tickAnim - 43) / 2) * (0.82-(0.185)));
            yy = 1.42 + (((tickAnim - 43) / 2) * (1.245-(1.42)));
            zz = 0.89 + (((tickAnim - 43) / 2) * (0.36-(0.89)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0.82 + (((tickAnim - 45) / 2) * (1.03-(0.82)));
            yy = 1.245 + (((tickAnim - 45) / 2) * (2.85-(1.245)));
            zz = 0.36 + (((tickAnim - 45) / 2) * (-1.225-(0.36)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 1.03 + (((tickAnim - 47) / 3) * (-0.945-(1.03)));
            yy = 2.85 + (((tickAnim - 47) / 3) * (5.285-(2.85)));
            zz = -1.225 + (((tickAnim - 47) / 3) * (-10.71-(-1.225)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -0.945 + (((tickAnim - 50) / 3) * (1.775-(-0.945)));
            yy = 5.285 + (((tickAnim - 50) / 3) * (3.48-(5.285)));
            zz = -10.71 + (((tickAnim - 50) / 3) * (-6.38-(-10.71)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = 1.775 + (((tickAnim - 53) / 1) * (0.99-(1.775)));
            yy = 3.48 + (((tickAnim - 53) / 1) * (2.835-(3.48)));
            zz = -6.38 + (((tickAnim - 53) / 1) * (-0.995-(-6.38)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = 0.99 + (((tickAnim - 54) / 2) * (-0.515-(0.99)));
            yy = 2.835 + (((tickAnim - 54) / 2) * (3.64-(2.835)));
            zz = -0.995 + (((tickAnim - 54) / 2) * (1.385-(-0.995)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = -0.515 + (((tickAnim - 56) / 14) * (-0.655-(-0.515)));
            yy = 3.64 + (((tickAnim - 56) / 14) * (5.09-(3.64)));
            zz = 1.385 + (((tickAnim - 56) / 14) * (-1.28-(1.385)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -0.655 + (((tickAnim - 70) / 20) * (-0.04-(-0.655)));
            yy = 5.09 + (((tickAnim - 70) / 20) * (4.64-(5.09)));
            zz = -1.28 + (((tickAnim - 70) / 20) * (-1.665-(-1.28)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = -0.04 + (((tickAnim - 90) / 23) * (0-(-0.04)));
            yy = 4.64 + (((tickAnim - 90) / 23) * (0-(4.64)));
            zz = -1.665 + (((tickAnim - 90) / 23) * (0-(-1.665)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembraneend5.rotationPointX = this.wingmembraneend5.rotationPointX + (float)(xx);
        this.wingmembraneend5.rotationPointY = this.wingmembraneend5.rotationPointY - (float)(yy);
        this.wingmembraneend5.rotationPointZ = this.wingmembraneend5.rotationPointZ + (float)(zz);




    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDearc entity = (EntityPrehistoricFloraDearc) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.75 + (((tickAnim - 0) / 6) * (-12.7612-(5.75)));
            yy = 24.5 + (((tickAnim - 0) / 6) * (15.08787-(24.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (16.0651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -12.7612 + (((tickAnim - 6) / 6) * (-1.10564-(-12.7612)));
            yy = 15.08787 + (((tickAnim - 6) / 6) * (-0.28029-(15.08787)));
            zz = 16.0651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30 + (((tickAnim - 6) / 6) * (-19.18249-(16.0651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -1.10564 + (((tickAnim - 12) / 13) * (5.75-(-1.10564)));
            yy = -0.28029 + (((tickAnim - 12) / 13) * (24.5-(-0.28029)));
            zz = -19.18249 + (((tickAnim - 12) / 13) * (0-(-19.18249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -1.75 + (((tickAnim - 0) / 12) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.65-(0)));
            zz = 0.8 + (((tickAnim - 0) / 12) * (-0.875-(0.8)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (-1.75-(0)));
            yy = 0.65 + (((tickAnim - 12) / 13) * (0-(0.65)));
            zz = -0.875 + (((tickAnim - 12) / 13) * (0.8-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing.rotationPointX = this.rightwing.rotationPointX + (float)(xx);
        this.rightwing.rotationPointY = this.rightwing.rotationPointY - (float)(yy);
        this.rightwing.rotationPointZ = this.rightwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -4.25 + (((tickAnim - 0) / 12) * (0-(-4.25)));
            zz = 0 + (((tickAnim - 0) / 12) * (19.75-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (-4.25-(0)));
            zz = 19.75 + (((tickAnim - 12) / 13) * (0-(19.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembranebeg.rotationPointX = this.wingmembranebeg.rotationPointX + (float)(0);
        this.wingmembranebeg.rotationPointY = this.wingmembranebeg.rotationPointY - (float)(0);
        this.wingmembranebeg.rotationPointZ = this.wingmembranebeg.rotationPointZ + (float)(0.775);
        this.wingmembranebeg.setScale((float)1,(float)1,(float)1.2);


        this.wingmembranemiddle.rotationPointX = this.wingmembranemiddle.rotationPointX + (float)(0);
        this.wingmembranemiddle.rotationPointY = this.wingmembranemiddle.rotationPointY - (float)(-0.1);
        this.wingmembranemiddle.rotationPointZ = this.wingmembranemiddle.rotationPointZ + (float)(0);
        this.wingmembranemiddle.setScale((float)1,(float)0.4,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 11 + (((tickAnim - 0) / 12) * (4-(11)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 4 + (((tickAnim - 12) / 13) * (11-(4)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0.05 + (((tickAnim - 0) / 25) * (-0.05-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing4.rotationPointX = this.rightwing4.rotationPointX + (float)(xx);
        this.rightwing4.rotationPointY = this.rightwing4.rotationPointY - (float)(yy);
        this.rightwing4.rotationPointZ = this.rightwing4.rotationPointZ + (float)(zz);



        this.wingmembraneend.setScale((float)1,(float)0.1,(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.51645-(0)));
            yy = -10.25 + (((tickAnim - 0) / 8) * (-14.08199-(-10.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (-59.69663-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1.51645 + (((tickAnim - 8) / 4) * (0.20649-(1.51645)));
            yy = -14.08199 + (((tickAnim - 8) / 4) * (-10.2456-(-14.08199)));
            zz = -59.69663 + (((tickAnim - 8) / 4) * (-0.57322-(-59.69663)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0.20649 + (((tickAnim - 12) / 6) * (3.4052-(0.20649)));
            yy = -10.2456 + (((tickAnim - 12) / 6) * (-10.65986-(-10.2456)));
            zz = -0.57322 + (((tickAnim - 12) / 6) * (9.7612-(-0.57322)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 3.4052 + (((tickAnim - 18) / 7) * (0-(3.4052)));
            yy = -10.65986 + (((tickAnim - 18) / 7) * (-10.25-(-10.65986)));
            zz = 9.7612 + (((tickAnim - 18) / 7) * (0-(9.7612)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.825 + (((tickAnim - 0) / 8) * (-0.275-(-0.825)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.275 + (((tickAnim - 8) / 4) * (-0.805-(-0.275)));
            yy = -0.325 + (((tickAnim - 8) / 4) * (0.895-(-0.325)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -0.805 + (((tickAnim - 12) / 6) * (-0.82-(-0.805)));
            yy = 0.895 + (((tickAnim - 12) / 6) * (0.975-(0.895)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.82 + (((tickAnim - 18) / 7) * (-0.825-(-0.82)));
            yy = 0.975 + (((tickAnim - 18) / 7) * (0-(0.975)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -1.08476 + (((tickAnim - 0) / 12) * (10.56049-(-1.08476)));
            yy = 6.21852 + (((tickAnim - 0) / 12) * (-32.52396-(6.21852)));
            zz = 19.30843 + (((tickAnim - 0) / 12) * (-0.25193-(19.30843)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 10.56049 + (((tickAnim - 12) / 7) * (-14.54991-(10.56049)));
            yy = -32.52396 + (((tickAnim - 12) / 7) * (-16.05565-(-32.52396)));
            zz = -0.25193 + (((tickAnim - 12) / 7) * (7.2736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30-(-0.25193)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -14.54991 + (((tickAnim - 19) / 6) * (-1.08476-(-14.54991)));
            yy = -16.05565 + (((tickAnim - 19) / 6) * (6.21852-(-16.05565)));
            zz = 7.2736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30 + (((tickAnim - 19) / 6) * (19.30843-(7.2736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (1.7-(0)));
            yy = 0.65 + (((tickAnim - 0) / 12) * (0-(0.65)));
            zz = -1.1 + (((tickAnim - 0) / 12) * (0.625-(-1.1)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 1.7 + (((tickAnim - 12) / 13) * (0-(1.7)));
            yy = 0 + (((tickAnim - 12) / 13) * (0.65-(0)));
            zz = 0.625 + (((tickAnim - 12) / 13) * (-1.1-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing.rotationPointX = this.leftwing.rotationPointX + (float)(xx);
        this.leftwing.rotationPointY = this.leftwing.rotationPointY - (float)(yy);
        this.leftwing.rotationPointZ = this.leftwing.rotationPointZ + (float)(zz);



        this.wingmembranebeg2.rotationPointX = this.wingmembranebeg2.rotationPointX + (float)(0);
        this.wingmembranebeg2.rotationPointY = this.wingmembranebeg2.rotationPointY - (float)(0);
        this.wingmembranebeg2.rotationPointZ = this.wingmembranebeg2.rotationPointZ + (float)(0.725);
        this.wingmembranebeg2.setScale((float)1,(float)1,(float)1.1925);


        this.wingmembranemiddle2.rotationPointX = this.wingmembranemiddle2.rotationPointX + (float)(0);
        this.wingmembranemiddle2.rotationPointY = this.wingmembranemiddle2.rotationPointY - (float)(-0.05);
        this.wingmembranemiddle2.rotationPointZ = this.wingmembranemiddle2.rotationPointZ + (float)(0);
        this.wingmembranemiddle2.setScale((float)1,(float)0.4,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 4 + (((tickAnim - 0) / 12) * (22.25-(4)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 22.25 + (((tickAnim - 12) / 7) * (12.75-(22.25)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 12.75 + (((tickAnim - 19) / 6) * (4-(12.75)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembraneend2.setScale((float)1,(float)0.1,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-3.25-(0)));
            yy = 15.5 + (((tickAnim - 0) / 12) * (15.5-(15.5)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -3.25 + (((tickAnim - 12) / 7) * (-2.14763-(-3.25)));
            yy = 15.5 + (((tickAnim - 12) / 7) * (11.64358-(15.5)));
            zz = 0 + (((tickAnim - 12) / 7) * (58.40192-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -2.14763 + (((tickAnim - 19) / 6) * (0-(-2.14763)));
            yy = 11.64358 + (((tickAnim - 19) / 6) * (15.5-(11.64358)));
            zz = 58.40192 + (((tickAnim - 19) / 6) * (0-(58.40192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.85 + (((tickAnim - 0) / 6) * (0.69-(0.85)));
            yy = 0.525 + (((tickAnim - 0) / 6) * (1.165-(0.525)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0.69 + (((tickAnim - 6) / 6) * (0.52-(0.69)));
            yy = 1.165 + (((tickAnim - 6) / 6) * (-0.045-(1.165)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0.52 + (((tickAnim - 12) / 7) * (0.3-(0.52)));
            yy = -0.045 + (((tickAnim - 12) / 7) * (-0.2-(-0.045)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0.3 + (((tickAnim - 19) / 6) * (0.85-(0.3)));
            yy = -0.2 + (((tickAnim - 19) / 6) * (0.525-(-0.2)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278+30))*7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.3);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-80))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278))*-5), head2.rotateAngleY + (float) Math.toRadians(0), head2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -38.20446 + (((tickAnim - 0) / 11) * (0-(-38.20446)));
            yy = -0.82496 + (((tickAnim - 0) / 11) * (0-(-0.82496)));
            zz = -2.14851 + (((tickAnim - 0) / 11) * (0-(-2.14851)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (-32.54295-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (3.6981-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (10.42386-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -32.54295 + (((tickAnim - 17) / 5) * (-44.45446-(-32.54295)));
            yy = 3.6981 + (((tickAnim - 17) / 5) * (-0.82496-(3.6981)));
            zz = 10.42386 + (((tickAnim - 17) / 5) * (-2.14851-(10.42386)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -44.45446 + (((tickAnim - 22) / 3) * (-38.20446-(-44.45446)));
            yy = -0.82496 + (((tickAnim - 22) / 3) * (-0.82496-(-0.82496)));
            zz = -2.14851 + (((tickAnim - 22) / 3) * (-2.14851-(-2.14851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = -0.725 + (((tickAnim - 11) / 11) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -29.75312 + (((tickAnim - 0) / 11) * (0-(-29.75312)));
            yy = -2.44753 + (((tickAnim - 0) / 11) * (0-(-2.44753)));
            zz = 9.46796 + (((tickAnim - 0) / 11) * (0-(9.46796)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (-35.30111-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (-7.27848-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (9.29417-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -35.30111 + (((tickAnim - 17) / 5) * (-40.25312-(-35.30111)));
            yy = -7.27848 + (((tickAnim - 17) / 5) * (-2.44753-(-7.27848)));
            zz = 9.29417 + (((tickAnim - 17) / 5) * (9.46796-(9.29417)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -40.25312 + (((tickAnim - 22) / 3) * (-29.75312-(-40.25312)));
            yy = -2.44753 + (((tickAnim - 22) / 3) * (-2.44753-(-2.44753)));
            zz = 9.46796 + (((tickAnim - 22) / 3) * (9.46796-(9.46796)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0.8 + (((tickAnim - 11) / 6) * (1.425-(0.8)));
            zz = 0 + (((tickAnim - 11) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 1.425 + (((tickAnim - 17) / 5) * (0-(1.425)));
            zz = -0.525 + (((tickAnim - 17) / 5) * (0-(-0.525)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 66.00674 + (((tickAnim - 0) / 5) * (30.86621-(66.00674)));
            yy = 16.64197 + (((tickAnim - 0) / 5) * (8.81836-(16.64197)));
            zz = -11.17448 + (((tickAnim - 0) / 5) * (-9.76891-(-11.17448)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 30.86621 + (((tickAnim - 5) / 6) * (0-(30.86621)));
            yy = 8.81836 + (((tickAnim - 5) / 6) * (0-(8.81836)));
            zz = -9.76891 + (((tickAnim - 5) / 6) * (0-(-9.76891)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (87.96528-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (9.6032-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (-5.08311-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 87.96528 + (((tickAnim - 17) / 2) * (58.06501-(87.96528)));
            yy = 9.6032 + (((tickAnim - 17) / 2) * (11.21148-(9.6032)));
            zz = -5.08311 + (((tickAnim - 17) / 2) * (-26.5998-(-5.08311)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 58.06501 + (((tickAnim - 19) / 3) * (82.18055-(58.06501)));
            yy = 11.21148 + (((tickAnim - 19) / 3) * (19.2064-(11.21148)));
            zz = -26.5998 + (((tickAnim - 19) / 3) * (-10.16623-(-26.5998)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 82.18055 + (((tickAnim - 22) / 3) * (66.00674-(82.18055)));
            yy = 19.2064 + (((tickAnim - 22) / 3) * (16.64197-(19.2064)));
            zz = -10.16623 + (((tickAnim - 22) / 3) * (-11.17448-(-10.16623)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.3 + (((tickAnim - 0) / 3) * (0.21-(0.3)));
            yy = 2 + (((tickAnim - 0) / 3) * (2.455-(2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.21 + (((tickAnim - 3) / 2) * (0.15-(0.21)));
            yy = 2.455 + (((tickAnim - 3) / 2) * (2.585-(2.455)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.15 + (((tickAnim - 5) / 3) * (0.06-(0.15)));
            yy = 2.585 + (((tickAnim - 5) / 3) * (1.465-(2.585)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.06 + (((tickAnim - 8) / 3) * (0-(0.06)));
            yy = 1.465 + (((tickAnim - 8) / 3) * (0.225-(1.465)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0.08-(0)));
            yy = 0.225 + (((tickAnim - 11) / 2) * (2.225-(0.225)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.08 + (((tickAnim - 13) / 4) * (0.3-(0.08)));
            yy = 2.225 + (((tickAnim - 13) / 4) * (3.46-(2.225)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0.3 + (((tickAnim - 17) / 2) * (0.22-(0.3)));
            yy = 3.46 + (((tickAnim - 17) / 2) * (1.065-(3.46)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0.22 + (((tickAnim - 19) / 3) * (0.3-(0.22)));
            yy = 1.065 + (((tickAnim - 19) / 3) * (1.125-(1.065)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0.3 + (((tickAnim - 22) / 3) * (0.3-(0.3)));
            yy = 1.125 + (((tickAnim - 22) / 3) * (2-(1.125)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = -19.75 + (((tickAnim - 0) / 12) * (-0.61-(-19.75)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = -0.61 + (((tickAnim - 12) / 7) * (-14.25-(-0.61)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = -14.25 + (((tickAnim - 19) / 6) * (-19.75-(-14.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 7 + (((tickAnim - 0) / 12) * (-8.75-(7)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -8.75 + (((tickAnim - 12) / 7) * (-1.25-(-8.75)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -1.25 + (((tickAnim - 19) / 6) * (7-(-1.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0.175 + (((tickAnim - 0) / 25) * (0.175-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing3.rotationPointX = this.leftwing3.rotationPointX + (float)(xx);
        this.leftwing3.rotationPointY = this.leftwing3.rotationPointY - (float)(yy);
        this.leftwing3.rotationPointZ = this.leftwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-19.72869-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.93062-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-11.01792-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -19.72869 + (((tickAnim - 4) / 5) * (-40.20446-(-19.72869)));
            yy = -2.93062 + (((tickAnim - 4) / 5) * (-0.82496-(-2.93062)));
            zz = -11.01792 + (((tickAnim - 4) / 5) * (-2.14851-(-11.01792)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -40.20446 + (((tickAnim - 9) / 16) * (0-(-40.20446)));
            yy = -0.82496 + (((tickAnim - 9) / 16) * (0-(-0.82496)));
            zz = -2.14851 + (((tickAnim - 9) / 16) * (0-(-2.14851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            yy = 0.475 + (((tickAnim - 9) / 16) * (0-(0.475)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-41.56025-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-9.60148-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-10.42836-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -41.56025 + (((tickAnim - 4) / 5) * (-36.25-(-41.56025)));
            yy = -9.60148 + (((tickAnim - 4) / 5) * (0-(-9.60148)));
            zz = -10.42836 + (((tickAnim - 4) / 5) * (0-(-10.42836)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -36.25 + (((tickAnim - 9) / 16) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.2 + (((tickAnim - 4) / 5) * (0-(0.2)));
            yy = 2.675 + (((tickAnim - 4) / 5) * (0.075-(2.675)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = 0.075 + (((tickAnim - 9) / 8) * (1.175-(0.075)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 1.175 + (((tickAnim - 17) / 8) * (0-(1.175)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (87.47499-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (8.25711-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (7.44598-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 87.47499 + (((tickAnim - 4) / 3) * (51.40717-(87.47499)));
            yy = 8.25711 + (((tickAnim - 4) / 3) * (-7.84301-(8.25711)));
            zz = 7.44598 + (((tickAnim - 4) / 3) * (23.99552-(7.44598)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 51.40717 + (((tickAnim - 7) / 2) * (72.57387-(51.40717)));
            yy = -7.84301 + (((tickAnim - 7) / 2) * (-15.46319-(-7.84301)));
            zz = 23.99552 + (((tickAnim - 7) / 2) * (7.33722-(23.99552)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 72.57387 + (((tickAnim - 9) / 8) * (38.59655-(72.57387)));
            yy = -15.46319 + (((tickAnim - 9) / 8) * (-6.71085-(-15.46319)));
            zz = 7.33722 + (((tickAnim - 9) / 8) * (8.05177-(7.33722)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 38.59655 + (((tickAnim - 17) / 8) * (0-(38.59655)));
            yy = -6.71085 + (((tickAnim - 17) / 8) * (0-(-6.71085)));
            zz = 8.05177 + (((tickAnim - 17) / 8) * (0-(8.05177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.01-(0)));
            yy = 0.8 + (((tickAnim - 0) / 3) * (2.61-(0.8)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.01 + (((tickAnim - 3) / 1) * (0.015-(0.01)));
            yy = 2.61 + (((tickAnim - 3) / 1) * (1.95-(2.61)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.015 + (((tickAnim - 4) / 3) * (-0.19-(0.015)));
            yy = 1.95 + (((tickAnim - 4) / 3) * (0.475-(1.95)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.19 + (((tickAnim - 7) / 2) * (-0.325-(-0.19)));
            yy = 0.475 + (((tickAnim - 7) / 2) * (0.775-(0.475)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.325 + (((tickAnim - 9) / 4) * (-0.29-(-0.325)));
            yy = 0.775 + (((tickAnim - 9) / 4) * (1.41-(0.775)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.29 + (((tickAnim - 13) / 4) * (-0.26-(-0.29)));
            yy = 1.41 + (((tickAnim - 13) / 4) * (1.525-(1.41)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -0.26 + (((tickAnim - 17) / 4) * (-0.13-(-0.26)));
            yy = 1.525 + (((tickAnim - 17) / 4) * (0.91-(1.525)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -0.13 + (((tickAnim - 21) / 4) * (0-(-0.13)));
            yy = 0.91 + (((tickAnim - 21) / 4) * (0.8-(0.91)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278+20))*-4), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+20))*3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+5))*5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278))*0.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.75 + (((tickAnim - 8) / 4) * (7-(-1.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 7 + (((tickAnim - 12) / 13) * (0-(7)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.175-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0.175 + (((tickAnim - 12) / 13) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*4), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-4), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));
        this.body1.rotationPointX = this.body1.rotationPointX + (float)(0);
        this.body1.rotationPointY = this.body1.rotationPointY - (float)(0);
        this.body1.rotationPointZ = this.body1.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.throat.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278))*0.005),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278))*0.05),(float)1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.1071 + (((tickAnim - 0) / 5) * (-11.58827-(2.1071)));
            yy = -0.11114 + (((tickAnim - 0) / 5) * (26.64496-(-0.11114)));
            zz = -10.15827 + (((tickAnim - 0) / 5) * (1.26365-(-10.15827)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -11.58827 + (((tickAnim - 5) / 6) * (-10.4589-(-11.58827)));
            yy = 26.64496 + (((tickAnim - 5) / 6) * (51.54379-(26.64496)));
            zz = 1.26365 + (((tickAnim - 5) / 6) * (7.85067-(1.26365)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.4589 + (((tickAnim - 11) / 2) * (-13.34122-(-10.4589)));
            yy = 51.54379 + (((tickAnim - 11) / 2) * (51.69634-(51.54379)));
            zz = 7.85067 + (((tickAnim - 11) / 2) * (16.21591-(7.85067)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -13.34122 + (((tickAnim - 13) / 4) * (-13.34122-(-13.34122)));
            yy = 51.69634 + (((tickAnim - 13) / 4) * (51.69634-(51.69634)));
            zz = 16.21591 + (((tickAnim - 13) / 4) * (16.21591-(16.21591)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -13.34122 + (((tickAnim - 17) / 1) * (7.34848-(-13.34122)));
            yy = 51.69634 + (((tickAnim - 17) / 1) * (43.38193-(51.69634)));
            zz = 16.21591 + (((tickAnim - 17) / 1) * (11.47439-(16.21591)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 7.34848 + (((tickAnim - 18) / 1) * (5.46262-(7.34848)));
            yy = 43.38193 + (((tickAnim - 18) / 1) * (42.75044-(43.38193)));
            zz = 11.47439 + (((tickAnim - 18) / 1) * (7.38746-(11.47439)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 5.46262 + (((tickAnim - 19) / 1) * (-0.07446-(5.46262)));
            yy = 42.75044 + (((tickAnim - 19) / 1) * (36.8157-(42.75044)));
            zz = 7.38746 + (((tickAnim - 19) / 1) * (6.80664-(7.38746)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.07446 + (((tickAnim - 20) / 5) * (2.1071-(-0.07446)));
            yy = 36.8157 + (((tickAnim - 20) / 5) * (-0.11114-(36.8157)));
            zz = 6.80664 + (((tickAnim - 20) / 5) * (-10.15827-(6.80664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg6, wingmembranebeg6.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg6.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.475 + (((tickAnim - 0) / 5) * (-4.27-(-3.475)));
            yy = 0.75 + (((tickAnim - 0) / 5) * (0.38-(0.75)));
            zz = -3.35 + (((tickAnim - 0) / 5) * (-4.33-(-3.35)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -4.27 + (((tickAnim - 5) / 6) * (-2.97-(-4.27)));
            yy = 0.38 + (((tickAnim - 5) / 6) * (-2.06-(0.38)));
            zz = -4.33 + (((tickAnim - 5) / 6) * (-5.6-(-4.33)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -2.97 + (((tickAnim - 11) / 1) * (-2.97-(-2.97)));
            yy = -2.06 + (((tickAnim - 11) / 1) * (-2.06-(-2.06)));
            zz = -5.6 + (((tickAnim - 11) / 1) * (-5.6-(-5.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.97 + (((tickAnim - 12) / 1) * (-4.095-(-2.97)));
            yy = -2.06 + (((tickAnim - 12) / 1) * (-0.435-(-2.06)));
            zz = -5.6 + (((tickAnim - 12) / 1) * (-5.6-(-5.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -4.095 + (((tickAnim - 13) / 4) * (-4.095-(-4.095)));
            yy = -0.435 + (((tickAnim - 13) / 4) * (0.815-(-0.435)));
            zz = -5.6 + (((tickAnim - 13) / 4) * (-5.6-(-5.6)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -4.095 + (((tickAnim - 17) / 1) * (-4.67-(-4.095)));
            yy = 0.815 + (((tickAnim - 17) / 1) * (1.19-(0.815)));
            zz = -5.6 + (((tickAnim - 17) / 1) * (-3.65-(-5.6)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -4.67 + (((tickAnim - 18) / 1) * (-4.67-(-4.67)));
            yy = 1.19 + (((tickAnim - 18) / 1) * (1.49-(1.19)));
            zz = -3.65 + (((tickAnim - 18) / 1) * (-4.15-(-3.65)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -4.67 + (((tickAnim - 19) / 1) * (-4.67-(-4.67)));
            yy = 1.49 + (((tickAnim - 19) / 1) * (1.49-(1.49)));
            zz = -4.15 + (((tickAnim - 19) / 1) * (-4.15-(-4.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -4.67 + (((tickAnim - 20) / 5) * (-3.475-(-4.67)));
            yy = 1.49 + (((tickAnim - 20) / 5) * (0.75-(1.49)));
            zz = -4.15 + (((tickAnim - 20) / 5) * (-3.35-(-4.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg6.rotationPointX = this.wingmembranebeg6.rotationPointX + (float)(xx);
        this.wingmembranebeg6.rotationPointY = this.wingmembranebeg6.rotationPointY - (float)(yy);
        this.wingmembranebeg6.rotationPointZ = this.wingmembranebeg6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -26.95486 + (((tickAnim - 0) / 11) * (-10.12674-(-26.95486)));
            yy = -51.68963 + (((tickAnim - 0) / 11) * (-51.68963-(-51.68963)));
            zz = -1.58198 + (((tickAnim - 0) / 11) * (-1.58198-(-1.58198)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.12674 + (((tickAnim - 11) / 2) * (-13.95486-(-10.12674)));
            yy = -51.68963 + (((tickAnim - 11) / 2) * (-51.68963-(-51.68963)));
            zz = -1.58198 + (((tickAnim - 11) / 2) * (-1.58198-(-1.58198)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -13.95486 + (((tickAnim - 13) / 4) * (-13.95486-(-13.95486)));
            yy = -51.68963 + (((tickAnim - 13) / 4) * (-51.68963-(-51.68963)));
            zz = -1.58198 + (((tickAnim - 13) / 4) * (-1.58198-(-1.58198)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -13.95486 + (((tickAnim - 17) / 8) * (-16.20486-(-13.95486)));
            yy = -51.68963 + (((tickAnim - 17) / 8) * (-51.68963-(-51.68963)));
            zz = -1.58198 + (((tickAnim - 17) / 8) * (-1.58198-(-1.58198)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg5, wingmembranebeg5.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg5.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -1.025 + (((tickAnim - 0) / 8) * (-0.475-(-1.025)));
            yy = -0.2 + (((tickAnim - 0) / 8) * (0.8-(-0.2)));
            zz = 4.35 + (((tickAnim - 0) / 8) * (4.925-(4.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.475 + (((tickAnim - 8) / 3) * (-0.475-(-0.475)));
            yy = 0.8 + (((tickAnim - 8) / 3) * (0.475-(0.8)));
            zz = 4.925 + (((tickAnim - 8) / 3) * (4.925-(4.925)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.475 + (((tickAnim - 11) / 2) * (-0.475-(-0.475)));
            yy = 0.475 + (((tickAnim - 11) / 2) * (0.225-(0.475)));
            zz = 4.925 + (((tickAnim - 11) / 2) * (4.925-(4.925)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.475 + (((tickAnim - 13) / 4) * (-0.475-(-0.475)));
            yy = 0.225 + (((tickAnim - 13) / 4) * (0.3-(0.225)));
            zz = 4.925 + (((tickAnim - 13) / 4) * (4.175-(4.925)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -0.475 + (((tickAnim - 17) / 2) * (-0.475-(-0.475)));
            yy = 0.3 + (((tickAnim - 17) / 2) * (-0.175-(0.3)));
            zz = 4.175 + (((tickAnim - 17) / 2) * (3.75-(4.175)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -0.475 + (((tickAnim - 19) / 3) * (-0.475-(-0.475)));
            yy = -0.175 + (((tickAnim - 19) / 3) * (-0.55-(-0.175)));
            zz = 3.75 + (((tickAnim - 19) / 3) * (3.325-(3.75)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -0.475 + (((tickAnim - 22) / 3) * (-1.025-(-0.475)));
            yy = -0.55 + (((tickAnim - 22) / 3) * (-0.2-(-0.55)));
            zz = 3.325 + (((tickAnim - 22) / 3) * (4.35-(3.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg5.rotationPointX = this.wingmembranebeg5.rotationPointX + (float)(xx);
        this.wingmembranebeg5.rotationPointY = this.wingmembranebeg5.rotationPointY - (float)(yy);
        this.wingmembranebeg5.rotationPointZ = this.wingmembranebeg5.rotationPointZ + (float)(zz);



    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDearc entity = (EntityPrehistoricFloraDearc) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.8 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.8 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.8 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.8 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 0) / 30) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.75-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.75 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.75)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 70) / 10) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 30) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 10) * (-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 60) / 10) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2939 + (((tickAnim - 0) / 30) * (-3.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2939)));
            yy = -1.3648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (-10.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-1.3648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -20.2397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-35 + (((tickAnim - 0) / 30) * (-25.3655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-20.2397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-35)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -3.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-2.2143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-3.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -10.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-17.3589+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-10.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -25.3655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 30) / 30) * (-19.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-25.3655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.2143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.7882-(-2.2143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -17.3589+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-6.2231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-17.3589+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -19.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 60) / 10) * (-15.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-25-(-19.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.7882 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2939-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.7882)));
            yy = -6.2231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (-1.3648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-6.2231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -15.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-25 + (((tickAnim - 70) / 10) * (-20.2397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-35-(-15.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing.rotationPointX = this.leftwing.rotationPointX + (float)(xx);
        this.leftwing.rotationPointY = this.leftwing.rotationPointY - (float)(yy);
        this.leftwing.rotationPointZ = this.leftwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.4648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (-6.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-2.4648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.6301 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.6301)));
            zz = -73.356-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-33 + (((tickAnim - 0) / 30) * (-77.9664+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1-(-73.356-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-33)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -6.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-6.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-7.2618-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
            zz = -77.9664+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1 + (((tickAnim - 30) / 30) * (-82.2181-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1-(-77.9664+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-3.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-5.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-7.2618 + (((tickAnim - 60) / 10) * (-3.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-7.2618)));
            zz = -82.2181-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1 + (((tickAnim - 60) / 10) * (-69.4943-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(-82.2181-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -3.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-2.4648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-3.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -3.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.6301-(-3.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074)));
            zz = -69.4943-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 70) / 10) * (-73.356-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-33-(-69.4943-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -79.96258 + (((tickAnim - 0) / 30) * (-85.11835-(-79.96258)));
            yy = -4.92385 + (((tickAnim - 0) / 30) * (-4.3834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-4.92385)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30 + (((tickAnim - 0) / 30) * (11.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -85.11835 + (((tickAnim - 30) / 30) * (-81.70507-(-85.11835)));
            yy = -4.3834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (-3.5043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-4.3834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 11.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*1 + (((tickAnim - 30) / 30) * (8.417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*1-(11.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -81.70507 + (((tickAnim - 60) / 10) * (-88-(-81.70507)));
            yy = -3.5043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(-3.5043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 8.417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*1 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(8.417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -88 + (((tickAnim - 70) / 10) * (-79.96258-(-88)));
            yy = 0 + (((tickAnim - 70) / 10) * (-4.92385-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -62.5 + (((tickAnim - 0) / 30) * (-57-(-62.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -57 + (((tickAnim - 30) / 30) * (-57-(-57)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -57 + (((tickAnim - 60) / 10) * (-53-(-57)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -53 + (((tickAnim - 70) / 10) * (-62.5-(-53)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15 + (((tickAnim - 70) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2939 + (((tickAnim - 0) / 30) * (-3.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2939)));
            yy = 1.3648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (10.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(1.3648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 20.2397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*35 + (((tickAnim - 0) / 30) * (25.3655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(20.2397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*35)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -3.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-2.2143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-3.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 10.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (17.3589+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(10.7286+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = 25.3655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (19.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(25.3655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.2143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.7882-(-2.2143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 17.3589+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (6.2231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(17.3589+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 19.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (15.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*25-(19.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.7882 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2939-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.7882)));
            yy = 6.2231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 70) / 10) * (1.3648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(6.2231+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 15.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*25 + (((tickAnim - 70) / 10) * (20.2397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*35-(15.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing.rotationPointX = this.rightwing.rotationPointX + (float)(xx);
        this.rightwing.rotationPointY = this.rightwing.rotationPointY - (float)(yy);
        this.rightwing.rotationPointZ = this.rightwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.4648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (-6.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-2.4648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.6301 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.6301)));
            zz = 73.356-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*33 + (((tickAnim - 0) / 30) * (77.9664+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1-(73.356-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*33)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -6.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-6.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*7.2618-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            zz = 77.9664+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1 + (((tickAnim - 30) / 30) * (82.2181-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1-(77.9664+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-3.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-5.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*7.2618 + (((tickAnim - 60) / 10) * (-3.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*7.2618)));
            zz = 82.2181-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1 + (((tickAnim - 60) / 10) * (69.4943-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(82.2181-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -3.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-2.4648+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-3.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -3.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.6301-(-3.0287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074)));
            zz = 69.4943-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 70) / 10) * (73.356-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*33-(69.4943-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -79.96258 + (((tickAnim - 0) / 30) * (-85.11835-(-79.96258)));
            yy = 4.9238 + (((tickAnim - 0) / 30) * (4.3834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(4.9238)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30 + (((tickAnim - 0) / 30) * (-11.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -85.11835 + (((tickAnim - 30) / 30) * (-81.70507-(-85.11835)));
            yy = 4.3834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (3.5043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(4.3834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = -11.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-1 + (((tickAnim - 30) / 30) * (-8.417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-1-(-11.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -81.70507 + (((tickAnim - 60) / 10) * (-88-(-81.70507)));
            yy = 3.5043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(3.5043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = -8.417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-1 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-8.417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -88 + (((tickAnim - 70) / 10) * (-79.96258-(-88)));
            yy = 0 + (((tickAnim - 70) / 10) * (4.9238-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -62.5 + (((tickAnim - 0) / 30) * (-57-(-62.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -57 + (((tickAnim - 30) / 30) * (-57-(-57)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -57 + (((tickAnim - 60) / 10) * (-53-(-57)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -53 + (((tickAnim - 70) / 10) * (-62.5-(-53)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15 + (((tickAnim - 70) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 68.93059 + (((tickAnim - 0) / 29) * (70.97289-(68.93059)));
            yy = 34.1057 + (((tickAnim - 0) / 29) * (37.44351-(34.1057)));
            zz = 21.55542 + (((tickAnim - 0) / 29) * (27.74978-(21.55542)));
        }
        else if (tickAnim >= 29 && tickAnim < 62) {
            xx = 70.97289 + (((tickAnim - 29) / 33) * (70.97289-(70.97289)));
            yy = 37.44351 + (((tickAnim - 29) / 33) * (37.44351-(37.44351)));
            zz = 27.74978 + (((tickAnim - 29) / 33) * (27.74978-(27.74978)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 70.97289 + (((tickAnim - 62) / 18) * (68.93059-(70.97289)));
            yy = 37.44351 + (((tickAnim - 62) / 18) * (34.1057-(37.44351)));
            zz = 27.74978 + (((tickAnim - 62) / 18) * (21.55542-(27.74978)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg6, wingmembranebeg6.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg6.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0.925 + (((tickAnim - 0) / 29) * (0.92-(0.925)));
            yy = -3.75 + (((tickAnim - 0) / 29) * (-4.95-(-3.75)));
            zz = 5.1 + (((tickAnim - 0) / 29) * (5.12-(5.1)));
        }
        else if (tickAnim >= 29 && tickAnim < 62) {
            xx = 0.92 + (((tickAnim - 29) / 33) * (0.92-(0.92)));
            yy = -4.95 + (((tickAnim - 29) / 33) * (-4.95-(-4.95)));
            zz = 5.12 + (((tickAnim - 29) / 33) * (5.12-(5.12)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0.92 + (((tickAnim - 62) / 18) * (0.925-(0.92)));
            yy = -4.95 + (((tickAnim - 62) / 18) * (-3.75-(-4.95)));
            zz = 5.12 + (((tickAnim - 62) / 18) * (5.1-(5.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg6.rotationPointX = this.wingmembranebeg6.rotationPointX + (float)(xx);
        this.wingmembranebeg6.rotationPointY = this.wingmembranebeg6.rotationPointY - (float)(yy);
        this.wingmembranebeg6.rotationPointZ = this.wingmembranebeg6.rotationPointZ + (float)(zz);



        this.wingmembraneend3.rotationPointX = this.wingmembraneend3.rotationPointX + (float)(0);
        this.wingmembraneend3.rotationPointY = this.wingmembraneend3.rotationPointY - (float)(4.45);
        this.wingmembraneend3.rotationPointZ = this.wingmembraneend3.rotationPointZ + (float)(1);


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(0), leftleg.rotateAngleY + (float) Math.toRadians(0), leftleg.rotateAngleZ + (float) Math.toRadians(-71.5));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(-34), leftleg2.rotateAngleY + (float) Math.toRadians(0), leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(102.63987), leftfoot.rotateAngleY + (float) Math.toRadians(-4.46282), leftfoot.rotateAngleZ + (float) Math.toRadians(-6.05999));



        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 64.47858 + (((tickAnim - 0) / 29) * (71.97858-(64.47858)));
            yy = -34.57231 + (((tickAnim - 0) / 29) * (-34.57231-(-34.57231)));
            zz = -26.53117 + (((tickAnim - 0) / 29) * (-26.53117-(-26.53117)));
        }
        else if (tickAnim >= 29 && tickAnim < 80) {
            xx = 71.97858 + (((tickAnim - 29) / 51) * (64.47858-(71.97858)));
            yy = -34.57231 + (((tickAnim - 29) / 51) * (-34.57231-(-34.57231)));
            zz = -26.53117 + (((tickAnim - 29) / 51) * (-26.53117-(-26.53117)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg5, wingmembranebeg5.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg5.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = -6 + (((tickAnim - 0) / 29) * (-6-(-6)));
            yy = 6.3 + (((tickAnim - 0) / 29) * (5.8-(6.3)));
            zz = 2.05 + (((tickAnim - 0) / 29) * (0.175-(2.05)));
        }
        else if (tickAnim >= 29 && tickAnim < 80) {
            xx = -6 + (((tickAnim - 29) / 51) * (-6-(-6)));
            yy = 5.8 + (((tickAnim - 29) / 51) * (6.3-(5.8)));
            zz = 0.175 + (((tickAnim - 29) / 51) * (2.05-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg5.rotationPointX = this.wingmembranebeg5.rotationPointX + (float)(xx);
        this.wingmembranebeg5.rotationPointY = this.wingmembranebeg5.rotationPointY - (float)(yy);
        this.wingmembranebeg5.rotationPointZ = this.wingmembranebeg5.rotationPointZ + (float)(zz);



        this.wingmembranemiddle5.rotationPointX = this.wingmembranemiddle5.rotationPointX + (float)(0);
        this.wingmembranemiddle5.rotationPointY = this.wingmembranemiddle5.rotationPointY - (float)(-0.625);
        this.wingmembranemiddle5.rotationPointZ = this.wingmembranemiddle5.rotationPointZ + (float)(0);


        this.wingmembraneend5.rotationPointX = this.wingmembraneend5.rotationPointX + (float)(0);
        this.wingmembraneend5.rotationPointY = this.wingmembraneend5.rotationPointY - (float)(4.45);
        this.wingmembraneend5.rotationPointZ = this.wingmembraneend5.rotationPointZ + (float)(0);


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(0), rightleg.rotateAngleY + (float) Math.toRadians(0), rightleg.rotateAngleZ + (float) Math.toRadians(75.5));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(-34), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(102.63987), rightfoot.rotateAngleY + (float) Math.toRadians(4.4628), rightfoot.rotateAngleZ + (float) Math.toRadians(6.06));
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Head, 0,0,-0.5F);
        //animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Head, 0,0,-0.5F);
        //animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
