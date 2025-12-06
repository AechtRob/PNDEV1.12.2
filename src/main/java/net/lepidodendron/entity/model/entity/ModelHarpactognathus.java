package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHarpactognathus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelHarpactognathus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended rightwing;
    private final AdvancedModelRendererExtended rightwing2;
    private final AdvancedModelRendererExtended wingmembranebeg;
    private final AdvancedModelRendererExtended wingmembranebeg7;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended rightwing3;
    private final AdvancedModelRendererExtended wingmembranemiddle;
    private final AdvancedModelRendererExtended wingmembranebeg8;
    private final AdvancedModelRendererExtended rightwing4;
    private final AdvancedModelRendererExtended wingmembraneend;
    private final AdvancedModelRendererExtended wingmembranebeg9;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended righthand;
    private final AdvancedModelRendererExtended leftwing;
    private final AdvancedModelRendererExtended leftwing2;
    private final AdvancedModelRendererExtended wingmembranebeg2;
    private final AdvancedModelRendererExtended wingmembranebeg4;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended leftwing3;
    private final AdvancedModelRendererExtended wingmembranemiddle2;
    private final AdvancedModelRendererExtended wingmembranebeg5;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended leftwing4;
    private final AdvancedModelRendererExtended wingmembraneend2;
    private final AdvancedModelRendererExtended wingmembranebeg6;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended lefthand;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended cube_r22;
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

    public ModelHarpactognathus() {

        this.textureWidth = 80;
        this.textureHeight = 100;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.625F, 0.5F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 11.75F, 1.3F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.1309F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 29, 0, -3.5F, -1.25F, -9.0F, 7, 7, 9, 0.0F, false));

        this.rightwing = new AdvancedModelRendererExtended(this);
        this.rightwing.setRotationPoint(-2.1F, 2.55F, -8.6F);
        this.chest.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.0172F, -0.0861F, -0.3931F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 0, 29, -6.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, false));

        this.rightwing2 = new AdvancedModelRendererExtended(this);
        this.rightwing2.setRotationPoint(-5.2F, 0.1F, -0.7F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, 0.0403F, -0.1119F, 0.8802F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 28, 51, -0.5F, 0.0F, 0.0F, 1, 10, 3, 0.0F, false));

        this.wingmembranebeg = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg.setRotationPoint(9.3F, 11.6F, 7.0F);
        this.rightwing2.addChild(wingmembranebeg);
        this.wingmembranebeg.cubeList.add(new ModelBox(wingmembranebeg, 0, 41, -9.8F, -12.6F, -4.0F, 1, 11, 5, 0.0F, false));

        this.wingmembranebeg7 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg7.setRotationPoint(9.8843F, -3.982F, 4.6029F);
        this.rightwing2.addChild(wingmembranebeg7);
        this.setRotateAngle(wingmembranebeg7, 0.3921F, -0.1862F, 0.4211F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-7.0343F, 6.182F, -0.9529F);
        this.wingmembranebeg7.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3553F, 0.196F, 0.0128F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 65, 1.0F, -10.0F, -5.0F, 0, 12, 10, 0.0F, true));

        this.rightwing3 = new AdvancedModelRendererExtended(this);
        this.rightwing3.setRotationPoint(-0.075F, 9.9F, 0.05F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.0F, 0.0F, -0.1745F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 27, 32, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, false));

        this.wingmembranemiddle = new AdvancedModelRendererExtended(this);
        this.wingmembranemiddle.setRotationPoint(0.4F, -0.4F, 6.7F);
        this.rightwing3.addChild(wingmembranemiddle);
        this.wingmembranemiddle.cubeList.add(new ModelBox(wingmembranemiddle, 0, 57, -0.9F, -6.575F, -6.7F, 1, 4, 9, -0.01F, false));

        this.wingmembranebeg8 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg8.setRotationPoint(-0.125F, -3.425F, 4.125F);
        this.rightwing3.addChild(wingmembranebeg8);
        this.setRotateAngle(wingmembranebeg8, -1.5708F, 0.0F, 0.1309F);
        this.wingmembranebeg8.cubeList.add(new ModelBox(wingmembranebeg8, 60, 57, 1.0F, -3.0F, -7.125F, 0, 7, 10, 0.0F, true));

        this.rightwing4 = new AdvancedModelRendererExtended(this);
        this.rightwing4.setRotationPoint(0.1F, 0.0F, 8.7F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.4399F, 0.0F, 0.0F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 27, 0.0F, false));

        this.wingmembraneend = new AdvancedModelRendererExtended(this);
        this.wingmembraneend.setRotationPoint(0.3F, -0.4F, 6.0F);
        this.rightwing4.addChild(wingmembraneend);
        this.wingmembraneend.cubeList.add(new ModelBox(wingmembraneend, 0, 64, -0.8F, -5.575F, -6.0F, 1, 4, 27, -0.01F, false));

        this.wingmembranebeg9 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg9.setRotationPoint(0.0031F, -2.1436F, 11.0F);
        this.rightwing4.addChild(wingmembranebeg9);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-1.2281F, 0.8686F, 2.0F);
        this.wingmembranebeg9.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.1178F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 41, 1.0F, -4.0F, -13.0F, 0, 4, 22, 0.0F, true));

        this.righthand = new AdvancedModelRendererExtended(this);
        this.righthand.setRotationPoint(0.0F, -0.4F, 0.55F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, -0.0466F, 0.5498F, 2.9766F);
        this.righthand.cubeList.add(new ModelBox(righthand, 45, 56, -1.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.leftwing = new AdvancedModelRendererExtended(this);
        this.leftwing.setRotationPoint(2.1F, 2.55F, -8.6F);
        this.chest.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.0172F, 0.0861F, 0.3931F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 0, 29, -2.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, true));

        this.leftwing2 = new AdvancedModelRendererExtended(this);
        this.leftwing2.setRotationPoint(5.2F, 0.1F, -0.7F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, 0.0403F, 0.1119F, -0.8802F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 28, 51, -0.5F, 0.0F, 0.0F, 1, 10, 3, 0.0F, true));

        this.wingmembranebeg2 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg2.setRotationPoint(-9.3F, 11.6F, 7.0F);
        this.leftwing2.addChild(wingmembranebeg2);
        this.wingmembranebeg2.cubeList.add(new ModelBox(wingmembranebeg2, 0, 41, 8.8F, -12.6F, -4.0F, 1, 11, 5, 0.0F, true));

        this.wingmembranebeg4 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg4.setRotationPoint(-3.6907F, -3.982F, 5.5029F);
        this.leftwing2.addChild(wingmembranebeg4);
        this.setRotateAngle(wingmembranebeg4, -0.0706F, -0.4088F, 0.1761F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(3.8546F, 1.3043F, -0.6637F);
        this.wingmembranebeg4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1331F, 0.1385F, -1.0172F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 65, -1.0F, -10.0F, -5.0F, 0, 12, 10, 0.0F, false));

        this.leftwing3 = new AdvancedModelRendererExtended(this);
        this.leftwing3.setRotationPoint(0.075F, 9.9F, 0.05F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.0F, 0.0F, 0.1745F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 27, 32, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, true));

        this.wingmembranemiddle2 = new AdvancedModelRendererExtended(this);
        this.wingmembranemiddle2.setRotationPoint(-0.4F, -0.4F, 6.7F);
        this.leftwing3.addChild(wingmembranemiddle2);
        this.wingmembranemiddle2.cubeList.add(new ModelBox(wingmembranemiddle2, 0, 57, -0.1F, -6.575F, -6.7F, 1, 4, 9, -0.01F, true));

        this.wingmembranebeg5 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg5.setRotationPoint(-0.8828F, -5.5961F, 3.5877F);
        this.leftwing3.addChild(wingmembranebeg5);
        this.setRotateAngle(wingmembranebeg5, 0.0F, 0.0F, -0.1309F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.0F, 2.0199F, 0.4123F);
        this.wingmembranebeg5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.6144F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 57, -1.0F, -3.0F, -7.0F, 0, 7, 10, 0.0F, false));

        this.leftwing4 = new AdvancedModelRendererExtended(this);
        this.leftwing4.setRotationPoint(-0.1F, 0.0F, 8.7F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.4399F, 0.0F, 0.0F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 27, 0.0F, true));

        this.wingmembraneend2 = new AdvancedModelRendererExtended(this);
        this.wingmembraneend2.setRotationPoint(-0.3F, -0.4F, 6.0F);
        this.leftwing4.addChild(wingmembraneend2);
        this.wingmembraneend2.cubeList.add(new ModelBox(wingmembraneend2, 0, 64, -0.2F, -5.575F, -6.0F, 1, 4, 27, -0.01F, true));

        this.wingmembranebeg6 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg6.setRotationPoint(-0.0031F, -2.1436F, 11.0F);
        this.leftwing4.addChild(wingmembranebeg6);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(1.2281F, 1.8686F, 2.0F);
        this.wingmembranebeg6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.1178F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 41, -1.0F, -4.0F, -13.0F, 0, 4, 22, 0.0F, false));

        this.lefthand = new AdvancedModelRendererExtended(this);
        this.lefthand.setRotationPoint(0.0F, -0.4F, 0.55F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, -0.0383F, -0.504F, -2.9933F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 45, 56, -0.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.25F, -8.8F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 29, 16, -2.5F, -1.3543F, -3.1585F, 5, 5, 5, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 25, 44, -2.0F, 2.3457F, -3.1585F, 4, 2, 5, -0.01F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -0.1543F, -2.6585F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 52, 0, -1.5F, 1.9154F, -3.1529F, 3, 2, 4, -0.04F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 16, -2.0F, -0.9346F, -5.2529F, 4, 4, 6, -0.03F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, -0.3346F, -4.7779F);
        this.neck2.addChild(head2);
        this.setRotateAngle(head2, 0.8727F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 51, 29, -2.0F, -0.75F, -3.0F, 4, 3, 3, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 17, 1.025F, 0.55F, -3.75F, 1, 1, 2, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 17, -2.025F, 0.55F, -3.75F, 1, 1, 2, 0.0F, true));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 2.25F, -3.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1309F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 38, 29, -1.5F, -2.0F, -5.0F, 3, 2, 7, 0.002F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.head3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1484F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 41, -1.5F, -0.2404F, -0.1691F, 3, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.head3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 41, -1.5F, -0.2904F, -6.0691F, 3, 2, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-1.5F, 0.0F, -4.5F);
        this.head3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -0.025F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(1.5F, 0.0F, -4.5F);
        this.head3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.0873F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -0.025F, -0.5F, 0, 1, 1, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, 1.0F, -4.825F);
        this.head3.addChild(head4);
        this.head4.cubeList.add(new ModelBox(head4, 22, 51, -1.0F, -2.0F, -2.1F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, -2.1F);
        this.head4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 29, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.001F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-0.975F, -1.0F, -1.1F);
        this.head4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.1309F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 13, -0.025F, -0.5F, -2.2F, 0, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-0.975F, -1.2563F, -3.7804F);
        this.head4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4331F, 0.0552F, 0.1188F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 2, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.975F, -1.2563F, -3.7804F);
        this.head4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4331F, -0.0552F, -0.1188F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 2, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.975F, -1.0F, -1.1F);
        this.head4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.1309F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 13, 0.025F, -0.5F, -2.2F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, -3.4631F, -0.2747F);
        this.head4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2051F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, -4.36F, -3.9066F, 0, 5, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -3.4631F, -0.2747F);
        this.head4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 0, -0.5F, 0.04F, -3.8816F, 1, 1, 4, -0.001F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-0.001F, -2.0008F, -7.0012F);
        this.head4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.144F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 50, 50, -0.999F, 0.0F, 2.925F, 2, 1, 5, -0.001F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.25F, -2.0F);
        this.head2.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 36, -1.0F, 0.85F, -9.725F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 16, -2.0F, 0.0F, -1.0F, 4, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 55, -1.5F, -0.7F, -1.0F, 3, 1, 3, -0.02F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 1.3686F, -3.9877F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1091F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 16, -1.5F, -0.45F, -2.0F, 3, 1, 4, -0.01F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 38, -1.5F, -1.15F, -1.5F, 3, 2, 4, -0.01F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(-0.875F, 0.95F, -8.725F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1309F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.2F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.875F, 0.95F, -8.725F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.1309F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -0.2F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 38, 38, -1.0F, -0.025F, -6.95F, 2, 1, 2, -0.02F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 1, 0.925F, -0.425F, -6.95F, 0, 1, 2, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 1, -0.925F, -0.425F, -6.95F, 0, 1, 2, 0.0F, true));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 44, 21, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 56, -1.0F, -1.85F, -0.9F, 2, 2, 2, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, -0.35F, -0.8F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.2419F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -3.0F, -0.8644F, 0.0486F, 6, 6, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 1.0606F, 3.8486F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0853F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 39, 47, -2.0F, -1.4545F, 0.001F, 4, 4, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.1955F, 3.601F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1023F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 49, -1.0F, -1.0911F, 0.0021F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.1661F, 5.9021F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1328F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 21, -0.5F, -0.5342F, -0.7492F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.0342F, 3.9508F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 55, 20, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 14, 11, 0.0F, -1.5F, 5.0F, 0, 3, 5, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 39, 38, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.rightleg = new AdvancedModelRendererExtended(this);
        this.rightleg.setRotationPoint(-2.0F, 1.6856F, 1.9486F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, 0.0F, 0.3927F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 29, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.rightleg2 = new AdvancedModelRendererExtended(this);
        this.rightleg2.setRotationPoint(-0.1F, 4.45F, -0.225F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.829F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 22, 5, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.rightfoot = new AdvancedModelRendererExtended(this);
        this.rightfoot.setRotationPoint(0.0F, 6.6F, 0.45F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.4404F, -0.274F, -0.2849F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 52, 44, -1.1954F, -0.2176F, -4.6667F, 2, 1, 5, 0.0F, false));

        this.rightlegwing = new AdvancedModelRendererExtended(this);
        this.rightlegwing.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.rightleg2.addChild(rightlegwing);
        this.rightlegwing.cubeList.add(new ModelBox(rightlegwing, 26, 26, 0.0F, 0.0F, 0.0F, 0, 7, 3, 0.001F, false));

        this.rightlegwing2 = new AdvancedModelRendererExtended(this);
        this.rightlegwing2.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.rightleg.addChild(rightlegwing2);
        this.rightlegwing2.cubeList.add(new ModelBox(rightlegwing2, 0, 29, -0.5F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRendererExtended(this);
        this.leftleg.setRotationPoint(2.0F, 1.6856F, 1.9486F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, 0.0F, -0.3927F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 29, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.leftleg2 = new AdvancedModelRendererExtended(this);
        this.leftleg2.setRotationPoint(0.1F, 4.45F, -0.225F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.829F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 22, 5, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, true));

        this.leftfoot = new AdvancedModelRendererExtended(this);
        this.leftfoot.setRotationPoint(0.0F, 6.6F, 0.45F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.4404F, 0.274F, 0.2849F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 52, 44, -0.8046F, -0.2176F, -4.6667F, 2, 1, 5, 0.0F, true));

        this.leftlegwing = new AdvancedModelRendererExtended(this);
        this.leftlegwing.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.leftleg2.addChild(leftlegwing);
        this.leftlegwing.cubeList.add(new ModelBox(leftlegwing, 26, 26, 0.0F, 0.0F, 0.0F, 0, 7, 3, 0.001F, true));

        this.leftlegwing2 = new AdvancedModelRendererExtended(this);
        this.leftlegwing2.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.leftleg.addChild(leftlegwing2);
        this.leftlegwing2.cubeList.add(new ModelBox(leftlegwing2, 0, 29, -0.5F, 0.0F, 0.0F, 1, 5, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {

        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.root.offsetY = 0.03F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.root.offsetY = -0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.8F;
        this.root.offsetX = 0F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(10);
        this.root.rotateAngleZ = (float)Math.toRadians(2);
        this.root.scaleChildren = true;
        float scaler = 1.2F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.4F, 3.8F, -0.2F);
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
        EntityPrehistoricFloraHarpactognathus ee = (EntityPrehistoricFloraHarpactognathus) entitylivingbaseIn;

        if (ee.getAnimation() == ee.UNFLY_ANIMATION) {

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
            this.wingmembranemiddle.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembraneend.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranemiddle2.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembraneend2.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranebeg.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranebeg2.setScale((float) 1, (float) 1, (float) 1);
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
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHarpactognathus entity = (EntityPrehistoricFloraHarpactognathus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4 + (((tickAnim - 5) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -14.75 + (((tickAnim - 5) / 5) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.45-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.45 + (((tickAnim - 5) / 5) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.12 + (((tickAnim - 3) / 2) * (-4.25-(-4.12)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.25 + (((tickAnim - 5) / 5) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.25 + (((tickAnim - 5) / 5) * (0-(21.25)));
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

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHarpactognathus entity = (EntityPrehistoricFloraHarpactognathus) entitylivingbaseIn;

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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-7.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-7.5 + (((tickAnim - 5) / 15) * (2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-7.5)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2 + (((tickAnim - 20) / 5) * (6.25-(2)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (0.7831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.47929-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-25.6765-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0.7831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (0.635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(0.7831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
            yy = 1.47929 + (((tickAnim - 5) / 30) * (1.01349-(1.47929)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-25.6765 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-23.2121-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-25.6765)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(0.635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
            yy = 1.01349 + (((tickAnim - 35) / 5) * (0-(1.01349)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-23.2121 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-23.2121)));
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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (0.3238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.53316-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (3.9775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0.3238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 15) * (15.44119-(0.3238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
            yy = -0.53316 + (((tickAnim - 5) / 15) * (-1.98626-(-0.53316)));
            zz = 3.9775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 15) * (23.58621-(3.9775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 15.44119 + (((tickAnim - 20) / 15) * (0.2478+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(15.44119)));
            yy = -1.98626 + (((tickAnim - 20) / 15) * (-0.35793-(-1.98626)));
            zz = 23.58621 + (((tickAnim - 20) / 15) * (2.9888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(23.58621)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.2478+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(0.2478+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
            yy = -0.35793 + (((tickAnim - 35) / 5) * (0-(-0.35793)));
            zz = 2.9888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(2.9888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
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




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.94398-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-11.16751-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (17.2734-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.94398 + (((tickAnim - 7) / 6) * (0-(-1.94398)));
            yy = -11.16751 + (((tickAnim - 7) / 6) * (-21.25-(-11.16751)));
            zz = 17.2734 + (((tickAnim - 7) / 6) * (13.75-(17.2734)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = -21.25 + (((tickAnim - 13) / 27) * (0-(-21.25)));
            zz = 13.75 + (((tickAnim - 13) / 27) * (0-(13.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg4, wingmembranebeg4.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg4.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.065-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.32-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.065 + (((tickAnim - 7) / 6) * (-1.575-(-1.065)));
            yy = 1.575 + (((tickAnim - 7) / 6) * (0.475-(1.575)));
            zz = -1.32 + (((tickAnim - 7) / 6) * (-2.475-(-1.32)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -1.575 + (((tickAnim - 13) / 27) * (0-(-1.575)));
            yy = 0.475 + (((tickAnim - 13) / 27) * (0-(0.475)));
            zz = -2.475 + (((tickAnim - 13) / 27) * (0-(-2.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg4.rotationPointX = this.wingmembranebeg4.rotationPointX + (float)(xx);
        this.wingmembranebeg4.rotationPointY = this.wingmembranebeg4.rotationPointY - (float)(yy);
        this.wingmembranebeg4.rotationPointZ = this.wingmembranebeg4.rotationPointZ + (float)(zz);


    }


    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHarpactognathus entity = (EntityPrehistoricFloraHarpactognathus) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.75 + (((tickAnim - 0) / 6) * (-8.9697-(12.75)));
            yy = 24.5 + (((tickAnim - 0) / 6) * (7.61051-(24.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (41.2617+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -8.9697 + (((tickAnim - 6) / 6) * (-0.56984-(-8.9697)));
            yy = 7.61051 + (((tickAnim - 6) / 6) * (-8.52448-(7.61051)));
            zz = 41.2617+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30 + (((tickAnim - 6) / 6) * (-21.47848-(41.2617+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -0.56984 + (((tickAnim - 12) / 13) * (12.75-(-0.56984)));
            yy = -8.52448 + (((tickAnim - 12) / 13) * (24.5-(-8.52448)));
            zz = -21.47848 + (((tickAnim - 12) / 13) * (0-(-21.47848)));
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




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-3.4573-(0)));
            yy = -4.25 + (((tickAnim - 0) / 6) * (-1.02227-(-4.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (-41.18967-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -3.4573 + (((tickAnim - 6) / 6) * (0-(-3.4573)));
            yy = -1.02227 + (((tickAnim - 6) / 6) * (0-(-1.02227)));
            zz = -41.18967 + (((tickAnim - 6) / 6) * (19.75-(-41.18967)));
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
        this.wingmembranebeg.rotationPointY = this.wingmembranebeg.rotationPointY - (float)(1.425);
        this.wingmembranebeg.rotationPointZ = this.wingmembranebeg.rotationPointZ + (float)(0.775);
        this.wingmembranebeg.setScale((float)1,(float)0.8,(float)1.2);


        this.wingmembranemiddle.rotationPointX = this.wingmembranemiddle.rotationPointX + (float)(0);
        this.wingmembranemiddle.rotationPointY = this.wingmembranemiddle.rotationPointY - (float)(-0.1);
        this.wingmembranemiddle.rotationPointZ = this.wingmembranemiddle.rotationPointZ + (float)(0);
        this.wingmembranemiddle.setScale((float)1,(float)0.4,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 6.25 + (((tickAnim - 0) / 12) * (-2.75-(6.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -2.75 + (((tickAnim - 12) / 13) * (6.25-(-2.75)));
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
            xx = 8 + (((tickAnim - 0) / 8) * (1.51645-(8)));
            yy = -18.75 + (((tickAnim - 0) / 8) * (-14.08199-(-18.75)));
            zz = 0 + (((tickAnim - 0) / 8) * (-59.69663-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1.51645 + (((tickAnim - 8) / 4) * (1.53449-(1.51645)));
            yy = -14.08199 + (((tickAnim - 8) / 4) * (-15.74068-(-14.08199)));
            zz = -59.69663 + (((tickAnim - 8) / 4) * (-0.3278-(-59.69663)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 1.53449 + (((tickAnim - 12) / 6) * (14.4052-(1.53449)));
            yy = -15.74068 + (((tickAnim - 12) / 6) * (-10.65986-(-15.74068)));
            zz = -0.3278 + (((tickAnim - 12) / 6) * (9.7612-(-0.3278)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 14.4052 + (((tickAnim - 18) / 7) * (8-(14.4052)));
            yy = -10.65986 + (((tickAnim - 18) / 7) * (-18.75-(-10.65986)));
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
            yy = -0.275 + (((tickAnim - 0) / 8) * (-0.325-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.275 + (((tickAnim - 8) / 4) * (-0.805-(-0.275)));
            yy = -0.325 + (((tickAnim - 8) / 4) * (-0.105-(-0.325)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.805 + (((tickAnim - 12) / 3) * (-0.81-(-0.805)));
            yy = -0.105 + (((tickAnim - 12) / 3) * (0.405-(-0.105)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.81 + (((tickAnim - 15) / 3) * (-0.82-(-0.81)));
            yy = 0.405 + (((tickAnim - 15) / 3) * (1.675-(0.405)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.82 + (((tickAnim - 18) / 4) * (-0.82-(-0.82)));
            yy = 1.675 + (((tickAnim - 18) / 4) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -0.82 + (((tickAnim - 22) / 3) * (-0.825-(-0.82)));
            yy = 1.675 + (((tickAnim - 22) / 3) * (-0.275-(1.675)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278+30))*7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.3);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-80))*8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*-5), head2.rotateAngleY + (float) Math.toRadians(0), head2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -19.45446 + (((tickAnim - 0) / 14) * (25-(-19.45446)));
            yy = -0.82496 + (((tickAnim - 0) / 14) * (0-(-0.82496)));
            zz = -2.14851 + (((tickAnim - 0) / 14) * (0-(-2.14851)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 25 + (((tickAnim - 14) / 4) * (-13.06831-(25)));
            yy = 0 + (((tickAnim - 14) / 4) * (-0.03983-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (-5.91503-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -13.06831 + (((tickAnim - 18) / 4) * (-28.70446-(-13.06831)));
            yy = -0.03983 + (((tickAnim - 18) / 4) * (-0.82496-(-0.03983)));
            zz = -5.91503 + (((tickAnim - 18) / 4) * (-2.14851-(-5.91503)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -28.70446 + (((tickAnim - 22) / 3) * (-19.45446-(-28.70446)));
            yy = -0.82496 + (((tickAnim - 22) / 3) * (-0.82496-(-0.82496)));
            zz = -2.14851 + (((tickAnim - 22) / 3) * (-2.14851-(-2.14851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -0.725 + (((tickAnim - 14) / 8) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -25.28664 + (((tickAnim - 0) / 14) * (0-(-25.28664)));
            yy = 2.68661 + (((tickAnim - 0) / 14) * (0-(2.68661)));
            zz = -6.48117 + (((tickAnim - 0) / 14) * (0-(-6.48117)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-35.30111-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (-7.27848-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (9.29417-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -35.30111 + (((tickAnim - 18) / 4) * (-39.85365-(-35.30111)));
            yy = -7.27848 + (((tickAnim - 18) / 4) * (-0.09563-(-7.27848)));
            zz = 9.29417 + (((tickAnim - 18) / 4) * (-8.38342-(9.29417)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -39.85365 + (((tickAnim - 22) / 3) * (-25.28664-(-39.85365)));
            yy = -0.09563 + (((tickAnim - 22) / 3) * (2.68661-(-0.09563)));
            zz = -8.38342 + (((tickAnim - 22) / 3) * (-6.48117-(-8.38342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 0) / 3) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 11) * (0.8-(0)));
            zz = 0 + (((tickAnim - 3) / 11) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0.9-(0)));
            yy = 0.8 + (((tickAnim - 14) / 4) * (2.775-(0.8)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.9 + (((tickAnim - 18) / 4) * (0-(0.9)));
            yy = 2.775 + (((tickAnim - 18) / 4) * (0-(2.775)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (-0.7-(0)));
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45.97817 + (((tickAnim - 0) / 3) * (36.33207-(45.97817)));
            yy = 20.19347 + (((tickAnim - 0) / 3) * (15.36115-(20.19347)));
            zz = 4.00063 + (((tickAnim - 0) / 3) * (2.38367-(4.00063)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 36.33207 + (((tickAnim - 3) / 2) * (21.07206-(36.33207)));
            yy = 15.36115 + (((tickAnim - 3) / 2) * (12.57126-(15.36115)));
            zz = 2.38367 + (((tickAnim - 3) / 2) * (5.87874-(2.38367)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 21.07206 + (((tickAnim - 5) / 3) * (3.63802-(21.07206)));
            yy = 12.57126 + (((tickAnim - 5) / 3) * (5.38768-(12.57126)));
            zz = 5.87874 + (((tickAnim - 5) / 3) * (2.51946-(5.87874)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 3.63802 + (((tickAnim - 8) / 6) * (-5.5-(3.63802)));
            yy = 5.38768 + (((tickAnim - 8) / 6) * (0-(5.38768)));
            zz = 2.51946 + (((tickAnim - 8) / 6) * (0-(2.51946)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -5.5 + (((tickAnim - 14) / 4) * (58.46528-(-5.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (9.6032-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (-5.08311-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 58.46528 + (((tickAnim - 18) / 1) * (89.02337-(58.46528)));
            yy = 9.6032 + (((tickAnim - 18) / 1) * (13.43569-(9.6032)));
            zz = -5.08311 + (((tickAnim - 18) / 1) * (10.93955-(-5.08311)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 89.02337 + (((tickAnim - 19) / 3) * (54.50867-(89.02337)));
            yy = 13.43569 + (((tickAnim - 19) / 3) * (16.93122-(13.43569)));
            zz = 10.93955 + (((tickAnim - 19) / 3) * (12.01918-(10.93955)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 54.50867 + (((tickAnim - 22) / 3) * (45.97817-(54.50867)));
            yy = 16.93122 + (((tickAnim - 22) / 3) * (20.19347-(16.93122)));
            zz = 12.01918 + (((tickAnim - 22) / 3) * (4.00063-(12.01918)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.3 + (((tickAnim - 0) / 3) * (0-(0.3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0.775-(0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0.06-(0)));
            yy = 0.775 + (((tickAnim - 5) / 3) * (0.39-(0.775)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0.06 + (((tickAnim - 8) / 6) * (0-(0.06)));
            yy = 0.39 + (((tickAnim - 8) / 6) * (0.225-(0.39)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 14) / 2) * (1.7-(0.225)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (-0.2-(0)));
            yy = 1.7 + (((tickAnim - 16) / 2) * (1.65-(1.7)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.2 + (((tickAnim - 18) / 1) * (0.22-(-0.2)));
            yy = 1.65 + (((tickAnim - 18) / 1) * (1.065-(1.65)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0.22 + (((tickAnim - 19) / 3) * (0-(0.22)));
            yy = 1.065 + (((tickAnim - 19) / 3) * (0-(1.065)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0.3-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
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



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278+20))*-4), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+20))*3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+5))*5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278))*0.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.75 + (((tickAnim - 0) / 8) * (1-(-10.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 8) / 4) * (7-(1)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 7 + (((tickAnim - 12) / 13) * (-10.75-(7)));
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


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 20 + (((tickAnim - 0) / 9) * (-19.45446-(20)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.82496-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-2.14851-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -19.45446 + (((tickAnim - 9) / 16) * (20-(-19.45446)));
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
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 4) * (-44.66939-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-11.16563-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (13.41642-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -44.66939 + (((tickAnim - 4) / 5) * (-29.78664-(-44.66939)));
            yy = -11.16563 + (((tickAnim - 4) / 5) * (2.68661-(-11.16563)));
            zz = 13.41642 + (((tickAnim - 4) / 5) * (6.4812-(13.41642)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -29.78664 + (((tickAnim - 9) / 16) * (0-(-29.78664)));
            yy = 2.68661 + (((tickAnim - 9) / 16) * (0-(2.68661)));
            zz = 6.4812 + (((tickAnim - 9) / 16) * (0-(6.4812)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.725-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.375 + (((tickAnim - 4) / 5) * (0-(0.375)));
            yy = 1.725 + (((tickAnim - 4) / 5) * (-0.7-(1.725)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = -0.7 + (((tickAnim - 9) / 8) * (1.175-(-0.7)));
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
            xx = -6 + (((tickAnim - 0) / 4) * (67.15038-(-6)));
            yy = 0 + (((tickAnim - 0) / 4) * (-9.09966-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-13.59506-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 67.15038 + (((tickAnim - 4) / 3) * (28.18887-(67.15038)));
            yy = -9.09966 + (((tickAnim - 4) / 3) * (-4.99322-(-9.09966)));
            zz = -13.59506 + (((tickAnim - 4) / 3) * (-0.26738-(-13.59506)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 28.18887 + (((tickAnim - 7) / 2) * (48.47817-(28.18887)));
            yy = -4.99322 + (((tickAnim - 7) / 2) * (-20.1935-(-4.99322)));
            zz = -0.26738 + (((tickAnim - 7) / 2) * (4.00063-(-0.26738)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 48.47817 + (((tickAnim - 9) / 4) * (38.02776-(48.47817)));
            yy = -20.1935 + (((tickAnim - 9) / 4) * (-13.75729-(-20.1935)));
            zz = 4.00063 + (((tickAnim - 9) / 4) * (3.85014-(4.00063)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 38.02776 + (((tickAnim - 13) / 4) * (18.61956-(38.02776)));
            yy = -13.75729 + (((tickAnim - 13) / 4) * (-5.97863-(-13.75729)));
            zz = 3.85014 + (((tickAnim - 13) / 4) * (4.67159-(3.85014)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 18.61956 + (((tickAnim - 17) / 8) * (-6-(18.61956)));
            yy = -5.97863 + (((tickAnim - 17) / 8) * (0-(-5.97863)));
            zz = 4.67159 + (((tickAnim - 17) / 8) * (0-(4.67159)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.015-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.55-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.015 + (((tickAnim - 4) / 3) * (-0.19-(0.015)));
            yy = 1.55 + (((tickAnim - 4) / 3) * (0.475-(1.55)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.19 + (((tickAnim - 7) / 2) * (-0.3-(-0.19)));
            yy = 0.475 + (((tickAnim - 7) / 2) * (0-(0.475)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.3 + (((tickAnim - 9) / 4) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -0.125 + (((tickAnim - 17) / 4) * (0-(-0.125)));
            yy = -0.3 + (((tickAnim - 17) / 4) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -0.27421 + (((tickAnim - 0) / 12) * (10.56049-(-0.27421)));
            yy = 10.20248 + (((tickAnim - 0) / 12) * (-32.52396-(10.20248)));
            zz = 22.40926 + (((tickAnim - 0) / 12) * (-0.25193-(22.40926)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 10.56049 + (((tickAnim - 12) / 7) * (-12.31838-(10.56049)));
            yy = -32.52396 + (((tickAnim - 12) / 7) * (-1.41146-(-32.52396)));
            zz = -0.25193 + (((tickAnim - 12) / 7) * (-5.3421+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30-(-0.25193)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -12.31838 + (((tickAnim - 19) / 6) * (-0.27421-(-12.31838)));
            yy = -1.41146 + (((tickAnim - 19) / 6) * (10.20248-(-1.41146)));
            zz = -5.3421+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30 + (((tickAnim - 19) / 6) * (22.40926-(-5.3421+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30)));
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




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = -19.75 + (((tickAnim - 0) / 12) * (-0.61-(-19.75)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (-1.21894-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0.90375-(0)));
            zz = -0.61 + (((tickAnim - 12) / 7) * (33.77635-(-0.61)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -1.21894 + (((tickAnim - 19) / 6) * (0-(-1.21894)));
            yy = 0.90375 + (((tickAnim - 19) / 6) * (0-(0.90375)));
            zz = 33.77635 + (((tickAnim - 19) / 6) * (-19.75-(33.77635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembranebeg2.rotationPointX = this.wingmembranebeg2.rotationPointX + (float)(0);
        this.wingmembranebeg2.rotationPointY = this.wingmembranebeg2.rotationPointY - (float)(1);
        this.wingmembranebeg2.rotationPointZ = this.wingmembranebeg2.rotationPointZ + (float)(0.725);
        this.wingmembranebeg2.setScale((float)1,(float)0.8,(float)1.1925);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 11 + (((tickAnim - 0) / 12) * (-8.75-(11)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -8.75 + (((tickAnim - 12) / 7) * (3-(-8.75)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 3 + (((tickAnim - 19) / 6) * (11-(3)));
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



        this.wingmembranemiddle2.rotationPointX = this.wingmembranemiddle2.rotationPointX + (float)(0);
        this.wingmembranemiddle2.rotationPointY = this.wingmembranemiddle2.rotationPointY - (float)(-0.05);
        this.wingmembranemiddle2.rotationPointZ = this.wingmembranemiddle2.rotationPointZ + (float)(0);
        this.wingmembranemiddle2.setScale((float)1,(float)0.4,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1.25 + (((tickAnim - 0) / 12) * (6.75-(1.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 6.75 + (((tickAnim - 12) / 7) * (12.75-(6.75)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 12.75 + (((tickAnim - 19) / 6) * (1.25-(12.75)));
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


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.85 + (((tickAnim - 0) / 2) * (0.7-(0.85)));
            yy = -0.45 + (((tickAnim - 0) / 2) * (-0.135-(-0.45)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0.7 + (((tickAnim - 2) / 4) * (0.69-(0.7)));
            yy = -0.135 + (((tickAnim - 2) / 4) * (1.165-(-0.135)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
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
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0.3 + (((tickAnim - 19) / 4) * (0.62-(0.3)));
            yy = -0.2 + (((tickAnim - 19) / 4) * (0.61-(-0.2)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0.62 + (((tickAnim - 23) / 2) * (0.85-(0.62)));
            yy = 0.61 + (((tickAnim - 23) / 2) * (-0.45-(0.61)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 18 + (((tickAnim - 0) / 12) * (0-(18)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-28.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = -28.5 + (((tickAnim - 18) / 7) * (18-(-28.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg4, wingmembranebeg4.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg4.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1.225 + (((tickAnim - 0) / 12) * (-0.3-(1.225)));
            yy = 0.175 + (((tickAnim - 0) / 12) * (0-(0.175)));
            zz = 1.45 + (((tickAnim - 0) / 12) * (-0.6-(1.45)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -0.3 + (((tickAnim - 12) / 6) * (-1.85-(-0.3)));
            yy = 0 + (((tickAnim - 12) / 6) * (-2.1-(0)));
            zz = -0.6 + (((tickAnim - 12) / 6) * (1.825-(-0.6)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -1.85 + (((tickAnim - 18) / 7) * (1.225-(-1.85)));
            yy = -2.1 + (((tickAnim - 18) / 7) * (0.175-(-2.1)));
            zz = 1.825 + (((tickAnim - 18) / 7) * (1.45-(1.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg4.rotationPointX = this.wingmembranebeg4.rotationPointX + (float)(xx);
        this.wingmembranebeg4.rotationPointY = this.wingmembranebeg4.rotationPointY - (float)(yy);
        this.wingmembranebeg4.rotationPointZ = this.wingmembranebeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0.3598 + (((tickAnim - 0) / 6) * (3.9228-(-0.3598)));
            yy = 6.94135 + (((tickAnim - 0) / 6) * (-3.97816-(6.94135)));
            zz = 20.11477 + (((tickAnim - 0) / 6) * (50.37453-(20.11477)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 3.9228 + (((tickAnim - 6) / 6) * (-0.22799-(3.9228)));
            yy = -3.97816 + (((tickAnim - 6) / 6) * (7.88485-(-3.97816)));
            zz = 50.37453 + (((tickAnim - 6) / 6) * (17.79587-(50.37453)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -0.22799 + (((tickAnim - 12) / 13) * (-0.3598-(-0.22799)));
            yy = 7.88485 + (((tickAnim - 12) / 13) * (6.94135-(7.88485)));
            zz = 17.79587 + (((tickAnim - 12) / 13) * (20.11477-(17.79587)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg7, wingmembranebeg7.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg7.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.2 + (((tickAnim - 0) / 6) * (-0.075-(0.2)));
            yy = -2.5 + (((tickAnim - 0) / 6) * (-7.7-(-2.5)));
            zz = -1.075 + (((tickAnim - 0) / 6) * (3.22-(-1.075)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -0.075 + (((tickAnim - 6) / 6) * (0.25-(-0.075)));
            yy = -7.7 + (((tickAnim - 6) / 6) * (-2-(-7.7)));
            zz = 3.22 + (((tickAnim - 6) / 6) * (0.5-(3.22)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.25 + (((tickAnim - 12) / 13) * (0.2-(0.25)));
            yy = -2 + (((tickAnim - 12) / 13) * (-2.5-(-2)));
            zz = 0.5 + (((tickAnim - 12) / 13) * (-1.075-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg7.rotationPointX = this.wingmembranebeg7.rotationPointX + (float)(xx);
        this.wingmembranebeg7.rotationPointY = this.wingmembranebeg7.rotationPointY - (float)(yy);
        this.wingmembranebeg7.rotationPointZ = this.wingmembranebeg7.rotationPointZ + (float)(zz);



        this.setRotateAngle(wingmembranebeg5, wingmembranebeg5.rotateAngleX + (float) Math.toRadians(-8), wingmembranebeg5.rotateAngleY + (float) Math.toRadians(0), wingmembranebeg5.rotateAngleZ + (float) Math.toRadians(0));
        this.wingmembranebeg5.rotationPointX = this.wingmembranebeg5.rotationPointX + (float)(0);
        this.wingmembranebeg5.rotationPointY = this.wingmembranebeg5.rotationPointY - (float)(-1.75);
        this.wingmembranebeg5.rotationPointZ = this.wingmembranebeg5.rotationPointZ + (float)(1.2);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingmembranebeg8, wingmembranebeg8.rotateAngleX + (float) Math.toRadians(xx), wingmembranebeg8.rotateAngleY + (float) Math.toRadians(yy), wingmembranebeg8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -0.675 + (((tickAnim - 6) / 6) * (-0.67-(-0.675)));
            zz = 0 + (((tickAnim - 6) / 6) * (1.15-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -0.67 + (((tickAnim - 12) / 13) * (0-(-0.67)));
            zz = 1.15 + (((tickAnim - 12) / 13) * (0-(1.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingmembranebeg8.rotationPointX = this.wingmembranebeg8.rotationPointX + (float)(xx);
        this.wingmembranebeg8.rotationPointY = this.wingmembranebeg8.rotationPointY - (float)(yy);
        this.wingmembranebeg8.rotationPointZ = this.wingmembranebeg8.rotationPointZ + (float)(zz);



        this.wingmembranebeg6.rotationPointX = this.wingmembranebeg6.rotationPointX + (float)(0);
        this.wingmembranebeg6.rotationPointY = this.wingmembranebeg6.rotationPointY - (float)(-0.225);
        this.wingmembranebeg6.rotationPointZ = this.wingmembranebeg6.rotationPointZ + (float)(0);


        this.wingmembranebeg9.rotationPointX = this.wingmembranebeg9.rotationPointX + (float)(0);
        this.wingmembranebeg9.rotationPointY = this.wingmembranebeg9.rotationPointY - (float)(-1.175);
        this.wingmembranebeg9.rotationPointZ = this.wingmembranebeg9.rotationPointZ + (float)(0);



    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHarpactognathus entity = (EntityPrehistoricFloraHarpactognathus) entitylivingbaseIn;

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
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
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
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-1 + (((tickAnim - 0) / 30) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.75-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.75 + (((tickAnim - 60) / 10) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-1-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
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
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 30) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
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
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 10) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
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
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.9092 + (((tickAnim - 0) / 30) * (-8.0104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.9092)));
            yy = 2.9623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (1.5012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2.9623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 37.4914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*35 + (((tickAnim - 0) / 30) * (44.6977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(37.4914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*35)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -8.0104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-4.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-8.0104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 1.5012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (7.2448+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(1.5012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = 44.6977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (41.1614+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(44.6977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -4.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.8565-(-4.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 7.2448+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (3.0438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(7.2448+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 41.1614+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (36.4933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*25-(41.1614+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.8565 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.9092-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.8565)));
            yy = 3.0438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (2.9623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(3.0438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = 36.4933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*25 + (((tickAnim - 70) / 10) * (37.4914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*35-(36.4933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*25)));
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
            xx = -3.4789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (-6.4107+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-3.4789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0989 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-4.4971-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0989)));
            zz = 26.9121-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*33 + (((tickAnim - 0) / 30) * (39.6794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1-(26.9121-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*33)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -6.4107+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5.9268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-6.4107+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-4.4971 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.768-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-4.4971)));
            zz = 39.6794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1 + (((tickAnim - 30) / 30) * (29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1-(39.6794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5.9268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-4.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-5.9268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.768 + (((tickAnim - 60) / 10) * (-0.1781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.768)));
            zz = 29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1 + (((tickAnim - 60) / 10) * (28.0805-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -4.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-3.4789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-4.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -0.1781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0989-(-0.1781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074)));
            zz = 28.0805-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 70) / 10) * (26.9121-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*33-(28.0805-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -79.96258 + (((tickAnim - 0) / 30) * (-83.74403-(-79.96258)));
            yy = -4.92385 + (((tickAnim - 0) / 30) * (-1.9696+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-4.92385)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.8474-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -83.74403 + (((tickAnim - 30) / 30) * (-81-(-83.74403)));
            yy = -1.9696+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-1.9696+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.8474 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.8474)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -81 + (((tickAnim - 60) / 10) * (-88-(-81)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -88 + (((tickAnim - 70) / 10) * (-79.96258-(-88)));
            yy = 0 + (((tickAnim - 70) / 10) * (-4.92385-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -70 + (((tickAnim - 0) / 30) * (-71-(-70)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -71 + (((tickAnim - 30) / 30) * (-70-(-71)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -70 + (((tickAnim - 60) / 10) * (-67.5-(-70)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -67.5 + (((tickAnim - 70) / 10) * (-70-(-67.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15 + (((tickAnim - 70) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.116 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-10.2992-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.116)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.3969 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.0099-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.3969)));
            zz = 52.047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (69.817-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1-(52.047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-10.2992 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.9981-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-10.2992)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.0099 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.1701-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.0099)));
            zz = 69.817-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1 + (((tickAnim - 30) / 30) * (64.1295-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1-(69.817-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.9981 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.1095-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.9981)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.1701 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.366-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.1701)));
            zz = 64.1295-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1 + (((tickAnim - 60) / 10) * (52.2948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(64.1295-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.1095 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.116-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.1095)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.366 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.3969-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.366)));
            zz = 52.2948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 70) / 10) * (52.047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(52.2948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.9092 + (((tickAnim - 0) / 30) * (-8.0104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.9092)));
            yy = -2.9623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (1.5012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-2.9623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -37.4914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-35 + (((tickAnim - 0) / 30) * (-44.6977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-37.4914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-35)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -8.0104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-4.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-8.0104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 1.5012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-7.2448+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(1.5012+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -44.6977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 30) / 30) * (-41.1614+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-44.6977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -4.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.8565-(-4.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -7.2448+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (3.0438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-7.2448+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -41.1614+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 60) / 10) * (-36.4933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-25-(-41.1614+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.8565 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.9092-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-6.8565)));
            yy = 3.0438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (-2.9623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(3.0438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -36.4933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-25 + (((tickAnim - 70) / 10) * (-37.4914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-35-(-36.4933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-25)));
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
            xx = -3.4789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (-6.4107+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-3.4789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0989 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-4.4971-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0989)));
            zz = -26.9121-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-33 + (((tickAnim - 0) / 30) * (-39.6794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1-(-26.9121-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-33)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -6.4107+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5.9268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-6.4107+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-4.4971 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.768-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-4.4971)));
            zz = -39.6794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1 + (((tickAnim - 30) / 30) * (-29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1-(-39.6794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5.9268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-4.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-5.9268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.768 + (((tickAnim - 60) / 10) * (-0.1781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.768)));
            zz = -29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1 + (((tickAnim - 60) / 10) * (-28.0805-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(-29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -4.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-3.4789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-4.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -0.1781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0989-(-0.1781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.6074)));
            zz = -28.0805-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 70) / 10) * (-26.9121-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-33-(-28.0805-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -79.96258 + (((tickAnim - 0) / 30) * (-83.74403-(-79.96258)));
            yy = -4.92385 + (((tickAnim - 0) / 30) * (-1.9696+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-4.92385)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.8474-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -83.74403 + (((tickAnim - 30) / 30) * (-81-(-83.74403)));
            yy = -1.9696+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-1.9696+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.8474 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.8474)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -81 + (((tickAnim - 60) / 10) * (-88-(-81)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
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
            xx = -70 + (((tickAnim - 0) / 30) * (-71-(-70)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -71 + (((tickAnim - 30) / 30) * (-70-(-71)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -70 + (((tickAnim - 60) / 10) * (-67.5-(-70)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -67.5 + (((tickAnim - 70) / 10) * (-70-(-67.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15 + (((tickAnim - 70) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(wingmembranebeg4, wingmembranebeg4.rotateAngleX + (float) Math.toRadians(-9.48984), wingmembranebeg4.rotateAngleY + (float) Math.toRadians(23.3483), wingmembranebeg4.rotateAngleZ + (float) Math.toRadians(41.91884));
        this.wingmembranebeg4.rotationPointX = this.wingmembranebeg4.rotationPointX + (float)(2.45);
        this.wingmembranebeg4.rotationPointY = this.wingmembranebeg4.rotationPointY - (float)(-7.55);
        this.wingmembranebeg4.rotationPointZ = this.wingmembranebeg4.rotationPointZ + (float)(5.025);


        this.setRotateAngle(wingmembranebeg5, wingmembranebeg5.rotateAngleX + (float) Math.toRadians(92.28641), wingmembranebeg5.rotateAngleY + (float) Math.toRadians(-2.76025), wingmembranebeg5.rotateAngleZ + (float) Math.toRadians(5.24497));
        this.wingmembranebeg5.rotationPointX = this.wingmembranebeg5.rotationPointX + (float)(0.925);
        this.wingmembranebeg5.rotationPointY = this.wingmembranebeg5.rotationPointY - (float)(3);
        this.wingmembranebeg5.rotationPointZ = this.wingmembranebeg5.rotationPointZ + (float)(2.375);


        this.wingmembranebeg6.rotationPointX = this.wingmembranebeg6.rotationPointX + (float)(0);
        this.wingmembranebeg6.rotationPointY = this.wingmembranebeg6.rotationPointY - (float)(5.7);
        this.wingmembranebeg6.rotationPointZ = this.wingmembranebeg6.rotationPointZ + (float)(1.15);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.116 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-10.6492-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.116)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.3969 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.0023-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.3969)));
            zz = -52.047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 0) / 30) * (-59.811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1-(-52.047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-10.6492 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.9981-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-10.6492)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.0023 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.1701-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.0023)));
            zz = -59.811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1 + (((tickAnim - 30) / 30) * (-64.1295-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1-(-59.811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.9981 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.1095-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.9981)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.1701 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.366-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.1701)));
            zz = -64.1295-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1 + (((tickAnim - 60) / 10) * (-52.2948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-64.1295-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.1095 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.116-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5.1095)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.366 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.3969-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.366)));
            zz = -52.2948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (-52.047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(-52.2948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(0), leftleg2.rotateAngleZ + (float) Math.toRadians(-13.5));


        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(61.25), leftfoot.rotateAngleY + (float) Math.toRadians(0), leftfoot.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(-17), head2.rotateAngleY + (float) Math.toRadians(0), head2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(13.5));


        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(61.25), rightfoot.rotateAngleY + (float) Math.toRadians(0), rightfoot.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(wingmembranebeg7, wingmembranebeg7.rotateAngleX + (float) Math.toRadians(-22.25697), wingmembranebeg7.rotateAngleY + (float) Math.toRadians(7.36231), wingmembranebeg7.rotateAngleZ + (float) Math.toRadians(-20.48711));
        this.wingmembranebeg7.rotationPointX = this.wingmembranebeg7.rotationPointX + (float)(-2.975);
        this.wingmembranebeg7.rotationPointY = this.wingmembranebeg7.rotationPointY - (float)(-6.25);
        this.wingmembranebeg7.rotationPointZ = this.wingmembranebeg7.rotationPointZ + (float)(5.925);


        this.setRotateAngle(wingmembranebeg8, wingmembranebeg8.rotateAngleX + (float) Math.toRadians(83.32533), wingmembranebeg8.rotateAngleY + (float) Math.toRadians(1.31185), wingmembranebeg8.rotateAngleZ + (float) Math.toRadians(7.1305));
        this.wingmembranebeg8.rotationPointX = this.wingmembranebeg8.rotationPointX + (float)(0.3);
        this.wingmembranebeg8.rotationPointY = this.wingmembranebeg8.rotationPointY - (float)(4.825);
        this.wingmembranebeg8.rotationPointZ = this.wingmembranebeg8.rotationPointZ + (float)(4.35);


        this.wingmembranebeg9.rotationPointX = this.wingmembranebeg9.rotationPointX + (float)(0);
        this.wingmembranebeg9.rotationPointY = this.wingmembranebeg9.rotationPointY - (float)(4);
        this.wingmembranebeg9.rotationPointZ = this.wingmembranebeg9.rotationPointZ + (float)(0);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);



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
