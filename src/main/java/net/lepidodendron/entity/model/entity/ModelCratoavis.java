package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCratoavis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCratoavis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer armRight1;
    private final AdvancedModelRenderer tertialsRightToHide;
    private final AdvancedModelRenderer armRight2;
    private final AdvancedModelRenderer secondariesRightToHide;
    private final AdvancedModelRenderer armRight3;
    private final AdvancedModelRenderer primariesRight;
    private final AdvancedModelRenderer primaryRight6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer primaryRight5;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer primaryRight4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer primaryRight3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer primaryRight2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer primaryRight1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer armLeft1;
    private final AdvancedModelRenderer tertialsLeftToHide;
    private final AdvancedModelRenderer armLeft2;
    private final AdvancedModelRenderer secondariesLeftToHide;
    private final AdvancedModelRenderer armLeft3;
    private final AdvancedModelRenderer primariesLeft;
    private final AdvancedModelRenderer primaryLeft6;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer primaryLeft5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer primaryLeft4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer primaryLeft3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer primaryLeft2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer primaryLeft1;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tailFeathers;
    private final AdvancedModelRenderer tailFeatherLeft1;
    private final AdvancedModelRenderer tailFeatherLeft2;
    private final AdvancedModelRenderer tailFeatherRight1;
    private final AdvancedModelRenderer tailFeatherRight2;
    private final AdvancedModelRenderer legRight1;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legRight2;
    private final AdvancedModelRenderer legRight3;
    private final AdvancedModelRenderer legRight4;
    private final AdvancedModelRenderer legLeft1;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer legLeft2;
    private final AdvancedModelRenderer legLeft3;
    private final AdvancedModelRenderer legLeft4;

    private ModelAnimator animator;

    public ModelCratoavis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 18.1F, 1.6F);
        this.setRotateAngle(base, -0.2618F, 0.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 38, 0, -1.5F, -1.35F, 0.55F, 3, 2, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.45F, 3.45F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5498F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 41, -2.0F, -0.1F, -3.9F, 3, 2, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.7F, -1.85F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 0, -2.0F, 3.6F, -1.0F, 4, 5, 5, 0.02F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.0F, -2.7F);
        this.base.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 2.0596F, -0.8138F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 38, -1.0F, 1.4F, -1.875F, 3, 1, 4, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 1.6847F, -0.397F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, -1.0F, -2.1F, -2.375F, 3, 1, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 2.027F, -0.9898F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 29, -1.0F, -2.1F, -2.175F, 3, 4, 4, 0.0F, false));

        this.armRight1 = new AdvancedModelRenderer(this);
        this.armRight1.setRotationPoint(-2.0498F, 1.4528F, -1.3429F);
        this.chest.addChild(armRight1);
        this.setRotateAngle(armRight1, -0.3101F, -0.0538F, 0.1261F);
        this.armRight1.cubeList.add(new ModelBox(armRight1, 0, 51, -0.7186F, -1.7149F, -0.9922F, 1, 2, 3, 0.01F, true));
        this.armRight1.cubeList.add(new ModelBox(armRight1, 51, 8, -0.1186F, -1.7149F, -0.9922F, 1, 2, 3, 0.0F, true));

        this.tertialsRightToHide = new AdvancedModelRenderer(this);
        this.tertialsRightToHide.setRotationPoint(-1.1186F, 0.2851F, -0.9922F);
        this.armRight1.addChild(tertialsRightToHide);
        this.tertialsRightToHide.cubeList.add(new ModelBox(tertialsRightToHide, 16, 44, 0.7F, -7.0F, 0.0F, 1, 7, 3, 0.0F, true));

        this.armRight2 = new AdvancedModelRenderer(this);
        this.armRight2.setRotationPoint(0.0564F, -0.0996F, 1.8683F);
        this.armRight1.addChild(armRight2);
        this.setRotateAngle(armRight2, -2.6616F, 0.0F, 0.0F);
        this.armRight2.cubeList.add(new ModelBox(armRight2, 51, 14, -0.5F, -0.7352F, -0.2857F, 1, 1, 3, 0.0F, true));

        this.secondariesRightToHide = new AdvancedModelRenderer(this);
        this.secondariesRightToHide.setRotationPoint(-0.41F, -0.7352F, 0.7143F);
        this.armRight2.addChild(secondariesRightToHide);
        this.secondariesRightToHide.cubeList.add(new ModelBox(secondariesRightToHide, 0, 24, 0.01F, -6.0F, -4.0F, 1, 6, 6, 0.0F, true));

        this.armRight3 = new AdvancedModelRenderer(this);
        this.armRight3.setRotationPoint(-0.25F, -0.5273F, 2.7104F);
        this.armRight2.addChild(armRight3);
        this.setRotateAngle(armRight3, 2.7925F, 0.0F, 0.0F);
        this.armRight3.cubeList.add(new ModelBox(armRight3, 18, 55, 0.025F, -0.288F, -0.2588F, 0, 1, 3, 0.0F, true));

        this.primariesRight = new AdvancedModelRenderer(this);
        this.primariesRight.setRotationPoint(0.325F, 0.462F, 0.4912F);
        this.armRight3.addChild(primariesRight);


        this.primaryRight6 = new AdvancedModelRenderer(this);
        this.primaryRight6.setRotationPoint(-0.3253F, 0.212F, 2.2292F);
        this.primariesRight.addChild(primaryRight6);
        this.setRotateAngle(primaryRight6, -0.0436F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0347F, 0.7993F, 3.9794F);
        this.primaryRight6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.035F, -3.6F, -3.7F, 0, 2, 9, 0.0F, true));

        this.primaryRight5 = new AdvancedModelRenderer(this);
        this.primaryRight5.setRotationPoint(-0.35F, 0.1701F, 2.253F);
        this.primariesRight.addChild(primaryRight5);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.01F, 1.0741F, 1.9358F);
        this.primaryRight5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 12, -0.01F, -3.4F, -1.7F, 0, 2, 9, 0.0F, true));

        this.primaryRight4 = new AdvancedModelRenderer(this);
        this.primaryRight4.setRotationPoint(-0.375F, 0.1452F, 2.2196F);
        this.primariesRight.addChild(primaryRight4);
        this.setRotateAngle(primaryRight4, -0.1004F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.32F, 0.968F, 1.7862F);
        this.primaryRight4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 22, -0.32F, -3.425F, -1.4F, 0, 2, 8, 0.0F, true));

        this.primaryRight3 = new AdvancedModelRenderer(this);
        this.primaryRight3.setRotationPoint(-0.4F, 0.1772F, 2.2235F);
        this.primariesRight.addChild(primaryRight3);
        this.setRotateAngle(primaryRight3, 0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.33F, 2.4866F, 1.5219F);
        this.primaryRight3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 11, -0.33F, -4.7F, -1.0F, 0, 2, 8, 0.0F, true));

        this.primaryRight2 = new AdvancedModelRenderer(this);
        this.primaryRight2.setRotationPoint(-0.415F, 0.1414F, 1.8812F);
        this.primariesRight.addChild(primaryRight2);
        this.setRotateAngle(primaryRight2, 0.1745F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.315F, 2.1821F, 0.7043F);
        this.primaryRight2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 11, -0.315F, -4.2F, -0.3F, 0, 2, 7, 0.0F, true));

        this.primaryRight1 = new AdvancedModelRenderer(this);
        this.primaryRight1.setRotationPoint(-0.425F, 0.0215F, 1.1703F);
        this.primariesRight.addChild(primaryRight1);
        this.setRotateAngle(primaryRight1, 0.2182F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.325F, 1.2265F, 0.221F);
        this.primaryRight1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 33, -0.35F, -4.2F, 0.0F, 0, 3, 7, 0.0F, true));

        this.armLeft1 = new AdvancedModelRenderer(this);
        this.armLeft1.setRotationPoint(2.0498F, 1.4528F, -1.3429F);
        this.chest.addChild(armLeft1);
        this.setRotateAngle(armLeft1, -0.3101F, 0.0538F, -0.1261F);
        this.armLeft1.cubeList.add(new ModelBox(armLeft1, 0, 51, -0.2814F, -1.7149F, -0.9922F, 1, 2, 3, 0.01F, false));
        this.armLeft1.cubeList.add(new ModelBox(armLeft1, 51, 8, -0.8814F, -1.7149F, -0.9922F, 1, 2, 3, 0.0F, false));

        this.tertialsLeftToHide = new AdvancedModelRenderer(this);
        this.tertialsLeftToHide.setRotationPoint(1.1186F, 0.2851F, -0.9922F);
        this.armLeft1.addChild(tertialsLeftToHide);
        this.tertialsLeftToHide.cubeList.add(new ModelBox(tertialsLeftToHide, 16, 44, -1.7F, -7.0F, 0.0F, 1, 7, 3, 0.0F, false));

        this.armLeft2 = new AdvancedModelRenderer(this);
        this.armLeft2.setRotationPoint(-0.0564F, -0.0996F, 1.8683F);
        this.armLeft1.addChild(armLeft2);
        this.setRotateAngle(armLeft2, -2.6616F, 0.0F, 0.0F);
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 51, 14, -0.5F, -0.7352F, -0.2857F, 1, 1, 3, 0.0F, false));

        this.secondariesLeftToHide = new AdvancedModelRenderer(this);
        this.secondariesLeftToHide.setRotationPoint(0.41F, -0.7352F, 0.7143F);
        this.armLeft2.addChild(secondariesLeftToHide);
        this.secondariesLeftToHide.cubeList.add(new ModelBox(secondariesLeftToHide, 0, 24, -1.01F, -6.0F, -4.0F, 1, 6, 6, 0.0F, false));

        this.armLeft3 = new AdvancedModelRenderer(this);
        this.armLeft3.setRotationPoint(0.25F, -0.5273F, 2.7104F);
        this.armLeft2.addChild(armLeft3);
        this.setRotateAngle(armLeft3, 2.7925F, 0.0F, 0.0F);
        this.armLeft3.cubeList.add(new ModelBox(armLeft3, 18, 55, -0.025F, -0.288F, -0.2588F, 0, 1, 3, 0.0F, false));

        this.primariesLeft = new AdvancedModelRenderer(this);
        this.primariesLeft.setRotationPoint(-0.325F, 0.462F, 0.4912F);
        this.armLeft3.addChild(primariesLeft);


        this.primaryLeft6 = new AdvancedModelRenderer(this);
        this.primaryLeft6.setRotationPoint(0.3253F, 0.212F, 2.2292F);
        this.primariesLeft.addChild(primaryLeft6);
        this.setRotateAngle(primaryLeft6, -0.0436F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0347F, 0.7993F, 3.9794F);
        this.primaryLeft6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.035F, -3.6F, -3.7F, 0, 2, 9, 0.0F, false));

        this.primaryLeft5 = new AdvancedModelRenderer(this);
        this.primaryLeft5.setRotationPoint(0.35F, 0.1701F, 2.253F);
        this.primariesLeft.addChild(primaryLeft5);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.01F, 1.0741F, 1.9358F);
        this.primaryLeft5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 12, 0.01F, -3.4F, -1.7F, 0, 2, 9, 0.0F, false));

        this.primaryLeft4 = new AdvancedModelRenderer(this);
        this.primaryLeft4.setRotationPoint(0.375F, 0.1452F, 2.2196F);
        this.primariesLeft.addChild(primaryLeft4);
        this.setRotateAngle(primaryLeft4, -0.1004F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.32F, 0.968F, 1.7862F);
        this.primaryLeft4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 22, 0.32F, -3.425F, -1.4F, 0, 2, 8, 0.0F, false));

        this.primaryLeft3 = new AdvancedModelRenderer(this);
        this.primaryLeft3.setRotationPoint(0.4F, 0.1772F, 2.2235F);
        this.primariesLeft.addChild(primaryLeft3);
        this.setRotateAngle(primaryLeft3, 0.0436F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.33F, 2.4866F, 1.5219F);
        this.primaryLeft3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 11, 0.33F, -4.7F, -1.0F, 0, 2, 8, 0.0F, false));

        this.primaryLeft2 = new AdvancedModelRenderer(this);
        this.primaryLeft2.setRotationPoint(0.415F, 0.1414F, 1.8812F);
        this.primariesLeft.addChild(primaryLeft2);
        this.setRotateAngle(primaryLeft2, 0.1745F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.315F, 2.1821F, 0.7043F);
        this.primaryLeft2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 11, 0.315F, -4.2F, -0.3F, 0, 2, 7, 0.0F, false));

        this.primaryLeft1 = new AdvancedModelRenderer(this);
        this.primaryLeft1.setRotationPoint(0.425F, 0.0215F, 1.1703F);
        this.primariesLeft.addChild(primaryLeft1);
        this.setRotateAngle(primaryLeft1, 0.2182F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.325F, 1.2265F, 0.221F);
        this.primaryLeft1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 33, 0.35F, -4.2F, 0.0F, 0, 3, 7, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.5989F, -2.5261F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0873F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.727F, 1.5102F);
        this.neck1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.0908F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 50, -1.0F, 1.4272F, -3.5085F, 2, 1, 3, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.727F, 1.5102F);
        this.neck1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.8727F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 49, -1.0F, -0.8F, -3.8F, 2, 2, 3, -0.02F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.3659F, -0.5136F);
        this.neck1.addChild(neck2);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.8155F, -0.5295F);
        this.neck2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1484F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 42, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.1F, -0.0323F, -0.6803F);
        this.neck2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.4538F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 50, -0.9F, -0.7701F, -1.2078F, 2, 1, 3, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.8036F, -1.1367F);
        this.neck2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.0734F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 4, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.03F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.1F, -0.0323F, -0.6803F);
        this.neck2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.5498F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 0, -1.1F, -0.45F, -1.2F, 2, 1, 2, -0.04F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0603F, -1.7544F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.098F, -2.0323F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.8814F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 55, -1.0F, 0.0405F, 0.1227F, 2, 1, 2, 0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.098F, -2.0323F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1833F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 8, -1.0F, -1.0556F, 1.5691F, 2, 1, 1, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.414F, -0.5796F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.5236F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 45, 8, -1.05F, -0.903F, -0.7379F, 1, 1, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 45, 8, 0.05F, -0.903F, -0.7379F, 1, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 53, 24, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.414F, -0.5796F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.7854F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 51, 0.0F, -1.0F, -2.4F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.614F, -0.3796F);
        this.head.addChild(jaw);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.2F, -0.2F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3927F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 55, 0.0F, -0.1F, -2.2F, 1, 1, 2, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.614F, -0.7546F);
        this.head.addChild(throat);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.2F, 0.175F);
        this.throat.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.4363F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 36, 29, -1.0F, 0.2395F, 0.1147F, 2, 1, 2, -0.05F, false));

        this.tailFeathers = new AdvancedModelRenderer(this);
        this.tailFeathers.setRotationPoint(-0.0434F, -1.241F, 5.4997F);
        this.base.addChild(tailFeathers);


        this.tailFeatherLeft1 = new AdvancedModelRenderer(this);
        this.tailFeatherLeft1.setRotationPoint(0.7F, 0.0F, 0.0F);
        this.tailFeathers.addChild(tailFeatherLeft1);
        this.setRotateAngle(tailFeatherLeft1, 0.0873F, 0.0873F, 0.0F);
        this.tailFeatherLeft1.cubeList.add(new ModelBox(tailFeatherLeft1, 36, 21, -0.4973F, 0.0039F, -0.5478F, 1, 0, 7, 0.0F, false));

        this.tailFeatherLeft2 = new AdvancedModelRenderer(this);
        this.tailFeatherLeft2.setRotationPoint(0.0027F, 0.0039F, 6.4522F);
        this.tailFeatherLeft1.addChild(tailFeatherLeft2);
        this.setRotateAngle(tailFeatherLeft2, 0.1309F, 0.0F, 0.0F);
        this.tailFeatherLeft2.cubeList.add(new ModelBox(tailFeatherLeft2, 28, 33, -0.5F, -0.025F, 0.0F, 1, 0, 7, 0.0F, false));
        this.tailFeatherLeft2.cubeList.add(new ModelBox(tailFeatherLeft2, 28, 33, -0.5F, 0.025F, 0.0F, 1, 0, 7, 0.0F, false));
        this.tailFeatherLeft2.cubeList.add(new ModelBox(tailFeatherLeft2, 0, 44, -1.0F, 0.0F, 0.0F, 2, 0, 6, 0.0F, false));

        this.tailFeatherRight1 = new AdvancedModelRenderer(this);
        this.tailFeatherRight1.setRotationPoint(-0.6132F, 0.0F, 0.0F);
        this.tailFeathers.addChild(tailFeatherRight1);
        this.setRotateAngle(tailFeatherRight1, 0.0873F, -0.0873F, 0.0F);
        this.tailFeatherRight1.cubeList.add(new ModelBox(tailFeatherRight1, 36, 21, -0.5027F, 0.0039F, -0.5478F, 1, 0, 7, 0.0F, true));

        this.tailFeatherRight2 = new AdvancedModelRenderer(this);
        this.tailFeatherRight2.setRotationPoint(-0.0027F, 0.0039F, 6.4522F);
        this.tailFeatherRight1.addChild(tailFeatherRight2);
        this.setRotateAngle(tailFeatherRight2, 0.1309F, 0.0F, 0.0F);
        this.tailFeatherRight2.cubeList.add(new ModelBox(tailFeatherRight2, 28, 33, -0.5F, -0.025F, 0.0F, 1, 0, 7, 0.0F, true));
        this.tailFeatherRight2.cubeList.add(new ModelBox(tailFeatherRight2, 28, 33, -0.5F, 0.05F, 0.0F, 1, 0, 7, 0.0F, true));
        this.tailFeatherRight2.cubeList.add(new ModelBox(tailFeatherRight2, 0, 44, -1.0F, 0.0F, 0.0F, 2, 0, 6, 0.0F, true));

        this.legRight1 = new AdvancedModelRenderer(this);
        this.legRight1.setRotationPoint(-1.425F, 0.295F, 0.0479F);
        this.base.addChild(legRight1);
        this.setRotateAngle(legRight1, 0.829F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -3.3F, -0.15F);
        this.legRight1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5236F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 53, 19, -0.3F, 2.45F, -4.1F, 1, 1, 3, -0.01F, true));

        this.legRight2 = new AdvancedModelRenderer(this);
        this.legRight2.setRotationPoint(0.2F, 1.45F, -1.55F);
        this.legRight1.addChild(legRight2);
        this.legRight2.cubeList.add(new ModelBox(legRight2, 13, 24, -0.5F, -0.5F, -0.9F, 1, 3, 1, 0.0F, true));

        this.legRight3 = new AdvancedModelRenderer(this);
        this.legRight3.setRotationPoint(0.0F, 2.2984F, -0.1517F);
        this.legRight2.addChild(legRight3);
        this.setRotateAngle(legRight3, -1.1781F, 0.0F, 0.0F);
        this.legRight3.cubeList.add(new ModelBox(legRight3, 16, 32, -0.5F, 0.0F, -0.9F, 1, 2, 1, -0.01F, true));

        this.legRight4 = new AdvancedModelRenderer(this);
        this.legRight4.setRotationPoint(-0.2F, 1.75F, -0.45F);
        this.legRight3.addChild(legRight4);
        this.setRotateAngle(legRight4, 0.6109F, 0.0F, 0.0F);
        this.legRight4.cubeList.add(new ModelBox(legRight4, 45, 44, 0.2F, -0.25F, -2.65F, 1, 1, 4, -0.01F, true));
        this.legRight4.cubeList.add(new ModelBox(legRight4, 25, 55, -0.775F, -0.25F, -1.65F, 1, 1, 2, -0.01F, true));

        this.legLeft1 = new AdvancedModelRenderer(this);
        this.legLeft1.setRotationPoint(1.425F, 0.295F, 0.0479F);
        this.base.addChild(legLeft1);
        this.setRotateAngle(legLeft1, 0.829F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -3.3F, -0.15F);
        this.legLeft1.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.5236F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 53, 19, -0.7F, 2.45F, -4.1F, 1, 1, 3, -0.01F, false));

        this.legLeft2 = new AdvancedModelRenderer(this);
        this.legLeft2.setRotationPoint(-0.2F, 1.45F, -1.55F);
        this.legLeft1.addChild(legLeft2);
        this.legLeft2.cubeList.add(new ModelBox(legLeft2, 13, 24, -0.5F, -0.5F, -0.9F, 1, 3, 1, 0.0F, false));

        this.legLeft3 = new AdvancedModelRenderer(this);
        this.legLeft3.setRotationPoint(0.0F, 2.2984F, -0.1517F);
        this.legLeft2.addChild(legLeft3);
        this.setRotateAngle(legLeft3, -1.1781F, 0.0F, 0.0F);
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 16, 32, -0.5F, 0.0F, -0.9F, 1, 2, 1, -0.01F, false));

        this.legLeft4 = new AdvancedModelRenderer(this);
        this.legLeft4.setRotationPoint(0.2F, 1.75F, -0.45F);
        this.legLeft3.addChild(legLeft4);
        this.setRotateAngle(legLeft4, 0.6109F, 0.0F, 0.0F);
        this.legLeft4.cubeList.add(new ModelBox(legLeft4, 45, 44, -1.2F, -0.25F, -2.65F, 1, 1, 4, -0.01F, false));
        this.legLeft4.cubeList.add(new ModelBox(legLeft4, 25, 55, -0.225F, -0.25F, -1.65F, 1, 1, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.base.offsetY = -0.1F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -2.30F;
        this.base.offsetX = 1.55F;
        this.base.offsetZ = 2.05F;
        this.base.rotateAngleY = (float)Math.toRadians(230);
        this.base.rotateAngleX = (float)Math.toRadians(9);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 2.2F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraCratoavis ee = (EntityPrehistoricFloraCratoavis) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};
        AdvancedModelRenderer[] Tail = {this.tailFeathers};


        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.5F, -0.02F, 0.5F, f2, 0.4F);
            this.chainWave(Tail, 0.5F, -0.01F, 0.5F, f2, 0.4F);

        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.head.setScale(1,1,1);
//        this.feathers.setScale(1,1,1);
//        this.feathers2.setScale(1,1,1);
//        this.feathers3.setScale(1,1,1);
//        this.feathers4.setScale(1,1,1);
        EntityPrehistoricFloraCratoavis ee = (EntityPrehistoricFloraCratoavis) entitylivingbaseIn;

        if (ee.getIsFlying() || ee.getIsLaunching()) {

            this.tertialsLeftToHide.setScale((float)1,(float)1,(float)1);
            this.tertialsRightToHide.setScale((float)1,(float)1,(float)1);
            this.secondariesLeftToHide.setScale((float)1,(float)1,(float)1);
            this.secondariesRightToHide.setScale((float)1,(float)1,(float)1);



        } else {
            this.tertialsLeftToHide.setScale((float)1,(float)0,(float)0);
            this.tertialsRightToHide.setScale((float)1,(float)0,(float)0);
            this.secondariesLeftToHide.setScale((float)1,(float)0,(float)0);
            this.secondariesRightToHide.setScale((float)1,(float)0,(float)0);

        }

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else {
                    if (ee.getIsLaunching()) {
                        animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            if (ee.getIsLaunching()) {
                animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                //Is gliding:
                animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCratoavis entity = (EntityPrehistoricFloraCratoavis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 10) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 0.2625 + (((tickAnim - 0) / 20) * (0.2625-(0.2625)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.tertialsRightToHide.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.secondariesRightToHide.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 0.2625 + (((tickAnim - 0) / 20) * (0.2625-(0.2625)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.tertialsLeftToHide.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.secondariesLeftToHide.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 24.25 + (((tickAnim - 10) / 10) * (0-(24.25)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 5) / 3) * (-30-(13.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30 + (((tickAnim - 8) / 2) * (-23.5-(-30)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.5 + (((tickAnim - 10) / 10) * (0-(-23.5)));
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
            xx = 0 + (((tickAnim - 5) / 3) * (50.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 50.25 + (((tickAnim - 8) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (33.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33.5 + (((tickAnim - 8) / 2) * (13-(33.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 10) / 10) * (0-(13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCratoavis entity = (EntityPrehistoricFloraCratoavis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 8) / 4) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -12.5 + (((tickAnim - 12) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 23) / 5) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 28) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 39) / 11) * (0-(24)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 8) / 4) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -41.75 + (((tickAnim - 12) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 23) / 5) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -41.75 + (((tickAnim - 28) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -17 + (((tickAnim - 39) / 6) * (-43.85-(-17)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -43.85 + (((tickAnim - 45) / 5) * (0-(-43.85)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 12) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 28) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0.525-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = 0.65 + (((tickAnim - 45) / 5) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft3.rotationPointX = this.legLeft3.rotationPointX + (float)(xx);
        this.legLeft3.rotationPointY = this.legLeft3.rotationPointY - (float)(yy);
        this.legLeft3.rotationPointZ = this.legLeft3.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCratoavis entity = (EntityPrehistoricFloraCratoavis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.94956-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.51444-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.17562-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.94956 + (((tickAnim - 20) / 10) * (21.94956-(21.94956)));
            yy = -0.51444 + (((tickAnim - 20) / 10) * (-0.51444-(-0.51444)));
            zz = 0.17562 + (((tickAnim - 20) / 10) * (0.17562-(0.17562)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21.94956 + (((tickAnim - 30) / 20) * (0-(21.94956)));
            yy = -0.51444 + (((tickAnim - 30) / 20) * (0-(-0.51444)));
            zz = 0.17562 + (((tickAnim - 30) / 20) * (0-(0.17562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -3.525 + (((tickAnim - 20) / 10) * (-3.525-(-3.525)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.525 + (((tickAnim - 30) / 20) * (0-(-3.525)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 20) / 10) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 30) / 20) * (0-(-10.25)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 4.75 + (((tickAnim - 20) / 10) * (4.75-(4.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 4.75 + (((tickAnim - 30) / 20) * (0-(4.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(xx), armRight1.rotateAngleY + (float) Math.toRadians(yy), armRight1.rotateAngleZ + (float) Math.toRadians(zz));



        this.tertialsRightToHide.setScale((float)1,(float)0.3,(float)1);


        this.secondariesRightToHide.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -4 + (((tickAnim - 20) / 10) * (-4-(-4)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(xx), armLeft1.rotateAngleY + (float) Math.toRadians(yy), armLeft1.rotateAngleZ + (float) Math.toRadians(zz));



        this.tertialsLeftToHide.setScale((float)1,(float)0.1,(float)1);


        this.secondariesLeftToHide.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 36.75 + (((tickAnim - 20) / 10) * (36.75-(36.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 36.75 + (((tickAnim - 30) / 20) * (0-(36.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.325 + (((tickAnim - 20) / 10) * (1.325-(1.325)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.325 + (((tickAnim - 30) / 20) * (0-(1.325)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight2.rotationPointX = this.legRight2.rotationPointX + (float)(xx);
        this.legRight2.rotationPointY = this.legRight2.rotationPointY - (float)(yy);
        this.legRight2.rotationPointZ = this.legRight2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-69.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -69.75 + (((tickAnim - 20) / 10) * (-69.75-(-69.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -69.75 + (((tickAnim - 30) / 20) * (0-(-69.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 20) / 10) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 30) / 20) * (0-(12.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight4, legRight4.rotateAngleX + (float) Math.toRadians(xx), legRight4.rotateAngleY + (float) Math.toRadians(yy), legRight4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 36.75 + (((tickAnim - 20) / 10) * (36.75-(36.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 36.75 + (((tickAnim - 30) / 20) * (0-(36.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.325 + (((tickAnim - 20) / 10) * (1.325-(1.325)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.325 + (((tickAnim - 30) / 20) * (0-(1.325)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft2.rotationPointX = this.legLeft2.rotationPointX + (float)(xx);
        this.legLeft2.rotationPointY = this.legLeft2.rotationPointY - (float)(yy);
        this.legLeft2.rotationPointZ = this.legLeft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-69.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -69.75 + (((tickAnim - 20) / 10) * (-69.75-(-69.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -69.75 + (((tickAnim - 30) / 20) * (0-(-69.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 20) / 10) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 30) / 20) * (0-(12.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft4, legLeft4.rotateAngleX + (float) Math.toRadians(xx), legLeft4.rotateAngleY + (float) Math.toRadians(yy), legLeft4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCratoavis entity = (EntityPrehistoricFloraCratoavis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -4.75 + (((tickAnim - 12) / 3) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -4.75 + (((tickAnim - 15) / 3) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -4.75 + (((tickAnim - 18) / 4) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -4.75 + (((tickAnim - 22) / 11) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -4.75 + (((tickAnim - 33) / 2) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -4.75 + (((tickAnim - 35) / 3) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -4.75 + (((tickAnim - 38) / 2) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -4.75 + (((tickAnim - 40) / 3) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -4.75 + (((tickAnim - 43) / 2) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 45) / 5) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.tertialsRightToHide.setScale((float)1,(float)0.1475,(float)1);


        this.secondariesRightToHide.setScale((float)1,(float)0,(float)1);


        this.tertialsLeftToHide.setScale((float)1,(float)0.1475,(float)1);


        this.secondariesLeftToHide.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3.25 + (((tickAnim - 12) / 3) * (1.25-(-3.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.25 + (((tickAnim - 15) / 3) * (17-(1.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 17 + (((tickAnim - 18) / 4) * (14.75-(17)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 14.75 + (((tickAnim - 22) / 11) * (-3.25-(14.75)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -3.25 + (((tickAnim - 33) / 2) * (1.25-(-3.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1.25 + (((tickAnim - 35) / 3) * (17-(1.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 17 + (((tickAnim - 38) / 2) * (-3.25-(17)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -3.25 + (((tickAnim - 40) / 3) * (1.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 1.25 + (((tickAnim - 43) / 2) * (17-(1.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 45) / 5) * (0-(17)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 12) / 3) * (-6-(-6)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -6 + (((tickAnim - 15) / 3) * (-3.75-(-6)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -3.75 + (((tickAnim - 18) / 4) * (-6-(-3.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -6 + (((tickAnim - 22) / 11) * (-6-(-6)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -6 + (((tickAnim - 33) / 2) * (-6-(-6)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -6 + (((tickAnim - 35) / 3) * (-3.75-(-6)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 38) / 2) * (-6-(-3.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -6 + (((tickAnim - 40) / 3) * (-6-(-6)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -6 + (((tickAnim - 43) / 2) * (-3.75-(-6)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 45) / 5) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -5.5 + (((tickAnim - 12) / 3) * (2-(-5.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2 + (((tickAnim - 15) / 3) * (-16.25-(2)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -16.25 + (((tickAnim - 18) / 4) * (2-(-16.25)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 2 + (((tickAnim - 22) / 11) * (-5.5-(2)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -5.5 + (((tickAnim - 33) / 2) * (2-(-5.5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 2 + (((tickAnim - 35) / 3) * (-16.25-(2)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -16.25 + (((tickAnim - 38) / 2) * (-5.5-(-16.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -5.5 + (((tickAnim - 40) / 3) * (2-(-5.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2 + (((tickAnim - 43) / 2) * (-16.25-(2)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -16.25 + (((tickAnim - 45) / 5) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 38.75 + (((tickAnim - 12) / 3) * (0-(38.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (37.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 37.5 + (((tickAnim - 18) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (38.75-(0)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 38.75 + (((tickAnim - 33) / 2) * (0-(38.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (37.5-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 37.5 + (((tickAnim - 38) / 2) * (38.75-(37.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 38.75 + (((tickAnim - 40) / 3) * (0-(38.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 45) / 5) * (0-(37.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 28 + (((tickAnim - 12) / 3) * (28-(28)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 28 + (((tickAnim - 15) / 3) * (43.25-(28)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 43.25 + (((tickAnim - 18) / 4) * (28-(43.25)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 28 + (((tickAnim - 22) / 11) * (28-(28)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 28 + (((tickAnim - 33) / 2) * (28-(28)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 28 + (((tickAnim - 35) / 3) * (43.25-(28)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 43.25 + (((tickAnim - 38) / 2) * (28-(43.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 28 + (((tickAnim - 40) / 3) * (28-(28)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 28 + (((tickAnim - 43) / 2) * (43.25-(28)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 43.25 + (((tickAnim - 45) / 5) * (0-(43.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (2.0475-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 12) / 3) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 12) / 3) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 12) / 3) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 15) / 3) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 15) / 3) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 18) / 4) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 18) / 4) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 18) / 4) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 22) / 11) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 22) / 11) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 22) / 11) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 33) / 2) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 33) / 2) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 33) / 2) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 35) / 3) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 35) / 3) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 35) / 3) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 38) / 2) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 38) / 2) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 38) / 2) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 40) / 3) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 40) / 3) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 40) / 3) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 43) / 2) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 43) / 2) * (2.0475-(2.0475)));
            zz = 1 + (((tickAnim - 43) / 2) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 45) / 5) * (1-(1)));
            yy = 2.0475 + (((tickAnim - 45) / 5) * (1-(2.0475)));
            zz = 1 + (((tickAnim - 45) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animLaunching(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCratoavis entity = (EntityPrehistoricFloraCratoavis) entitylivingbaseIn;
        int animCycle = 6;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-150))*-5), base.rotateAngleY + (float) Math.toRadians(0), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-100))*1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-150))*-0.5);


        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(-90.3264781502+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-150))*10), armRight1.rotateAngleY + (float) Math.toRadians(-0.160928972+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-50))*20), armRight1.rotateAngleZ + (float) Math.toRadians(82.2463529651+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-280))*35));
        this.armRight1.rotationPointX = this.armRight1.rotationPointX + (float)(0);
        this.armRight1.rotationPointY = this.armRight1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-150))*-0.5);
        this.armRight1.rotationPointZ = this.armRight1.rotationPointZ + (float)(0);


        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(134+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-220))*-5), armRight2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*15), armRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-220))*25));


        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(-121+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-250))*20), armRight3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*25), armRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20));


        this.setRotateAngle(primaryRight6, primaryRight6.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-260))*20), primaryRight6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*25), primaryRight6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20));


        this.setRotateAngle(primaryRight5, primaryRight5.rotateAngleX + (float) Math.toRadians(10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-280))*20), primaryRight5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*25), primaryRight5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20));


        this.setRotateAngle(primaryRight4, primaryRight4.rotateAngleX + (float) Math.toRadians(24+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20), primaryRight4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*25), primaryRight4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20));


        this.setRotateAngle(primaryRight3, primaryRight3.rotateAngleX + (float) Math.toRadians(48.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20), primaryRight3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*25), primaryRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20));


        this.setRotateAngle(primaryRight2, primaryRight2.rotateAngleX + (float) Math.toRadians(67.75), primaryRight2.rotateAngleY + (float) Math.toRadians(0), primaryRight2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryRight1, primaryRight1.rotateAngleX + (float) Math.toRadians(79.5), primaryRight1.rotateAngleY + (float) Math.toRadians(0), primaryRight1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(-74.5765+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-150))*10), armLeft1.rotateAngleY + (float) Math.toRadians(0.1609+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-50))*-20), armLeft1.rotateAngleZ + (float) Math.toRadians(-82.2464+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-280))*-35));
        this.armLeft1.rotationPointX = this.armLeft1.rotationPointX + (float)(0);
        this.armLeft1.rotationPointY = this.armLeft1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-150))*-0.5);
        this.armLeft1.rotationPointZ = this.armLeft1.rotationPointZ + (float)(0);


        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(134+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-220))*5), armLeft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*-15), armLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-220))*-25));


        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(-121+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-250))*20), armLeft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*-25), armLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*-20));


        this.setRotateAngle(primaryLeft6, primaryLeft6.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-260))*20), primaryLeft6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*-25), primaryLeft6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*-20));


        this.setRotateAngle(primaryLeft5, primaryLeft5.rotateAngleX + (float) Math.toRadians(10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-280))*20), primaryLeft5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*-25), primaryLeft5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*-20));


        this.setRotateAngle(primaryLeft4, primaryLeft4.rotateAngleX + (float) Math.toRadians(24+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20), primaryLeft4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*-25), primaryLeft4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*-20));


        this.setRotateAngle(primaryLeft3, primaryLeft3.rotateAngleX + (float) Math.toRadians(48.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*20), primaryLeft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-200))*-25), primaryLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-320))*-20));


        this.setRotateAngle(primaryLeft2, primaryLeft2.rotateAngleX + (float) Math.toRadians(67.75), primaryLeft2.rotateAngleY + (float) Math.toRadians(0), primaryLeft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryLeft1, primaryLeft1.rotateAngleX + (float) Math.toRadians(79.5), primaryLeft1.rotateAngleY + (float) Math.toRadians(0), primaryLeft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-190))*-8), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(-0.425);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-230))*8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-24.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-280))*-10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(26.75), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0.2);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0.5);


        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-150))*-8), tailFeathers.rotateAngleY + (float) Math.toRadians(0), tailFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeatherLeft1, tailFeatherLeft1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-250))*-12), tailFeatherLeft1.rotateAngleY + (float) Math.toRadians(0), tailFeatherLeft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeatherLeft2, tailFeatherLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-250))*-12), tailFeatherLeft2.rotateAngleY + (float) Math.toRadians(0), tailFeatherLeft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeatherRight1, tailFeatherRight1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-250))*-12), tailFeatherRight1.rotateAngleY + (float) Math.toRadians(0), tailFeatherRight1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeatherRight2, tailFeatherRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1080-250))*-12), tailFeatherRight2.rotateAngleY + (float) Math.toRadians(0), tailFeatherRight2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legRight1, legRight1.rotateAngleX + (float) Math.toRadians(22.25), legRight1.rotateAngleY + (float) Math.toRadians(0), legRight1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(-13.75), legRight2.rotateAngleY + (float) Math.toRadians(0), legRight2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(-23.25), legRight3.rotateAngleY + (float) Math.toRadians(0), legRight3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legLeft1, legLeft1.rotateAngleX + (float) Math.toRadians(26), legLeft1.rotateAngleY + (float) Math.toRadians(0), legLeft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(-13.75), legLeft2.rotateAngleY + (float) Math.toRadians(0), legLeft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(-23.25), legLeft3.rotateAngleY + (float) Math.toRadians(0), legLeft3.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCratoavis entity = (EntityPrehistoricFloraCratoavis) entitylivingbaseIn;
        int animCycle = 53;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5 + (((tickAnim - 0) / 23) * (8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5-(8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5 + (((tickAnim - 23) / 0) * (53.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-50-(8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 53.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-50 + (((tickAnim - 23) / 11) * (8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10))*50-(53.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-50)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10))*50 + (((tickAnim - 34) / 1) * (14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5-(8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10))*50)));
            yy = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5 + (((tickAnim - 35) / 15) * (8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5-(14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1 + (((tickAnim - 0) / 23) * (2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1 + (((tickAnim - 23) / 0) * (3.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-100))*5-(2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 23) / 0) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 3.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-100))*5 + (((tickAnim - 23) / 11) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-100))*-5-(3.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-100))*5)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-100))*-5 + (((tickAnim - 34) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-100))*-5)));
            zz = 0 + (((tickAnim - 34) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-100))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10 + (((tickAnim - 0) / 23) * (-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10-(-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10)));
            yy = -0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20 + (((tickAnim - 0) / 23) * (-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20-(-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20)));
            zz = 82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35 + (((tickAnim - 0) / 23) * (82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35-(82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10 + (((tickAnim - 23) / 3) * (0-(-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10)));
            yy = -0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20 + (((tickAnim - 23) / 3) * (0-(-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20)));
            zz = 82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35 + (((tickAnim - 23) / 3) * (0-(82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = -90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10 + (((tickAnim - 35) / 18) * (-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10-(-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10)));
            yy = -0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20 + (((tickAnim - 35) / 18) * (-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20-(-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*20)));
            zz = 82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35 + (((tickAnim - 35) / 18) * (82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35-(82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(xx), armRight1.rotateAngleY + (float) Math.toRadians(yy), armRight1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armRight1.rotationPointX = this.armRight1.rotationPointX + (float)(xx);
        this.armRight1.rotationPointY = this.armRight1.rotationPointY - (float)(yy);
        this.armRight1.rotationPointZ = this.armRight1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5 + (((tickAnim - 0) / 23) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5 + (((tickAnim - 23) / 3) * (0-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5 + (((tickAnim - 35) / 18) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20 + (((tickAnim - 0) / 23) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20 + (((tickAnim - 23) / 3) * (0-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20 + (((tickAnim - 35) / 18) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(xx), armRight3.rotateAngleY + (float) Math.toRadians(yy), armRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20 + (((tickAnim - 0) / 23) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20 + (((tickAnim - 23) / 3) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20 + (((tickAnim - 35) / 18) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight6, primaryRight6.rotateAngleX + (float) Math.toRadians(xx), primaryRight6.rotateAngleY + (float) Math.toRadians(yy), primaryRight6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20 + (((tickAnim - 0) / 23) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20 + (((tickAnim - 23) / 3) * (0-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20 + (((tickAnim - 35) / 18) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight5, primaryRight5.rotateAngleX + (float) Math.toRadians(xx), primaryRight5.rotateAngleY + (float) Math.toRadians(yy), primaryRight5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 18) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight4, primaryRight4.rotateAngleX + (float) Math.toRadians(xx), primaryRight4.rotateAngleY + (float) Math.toRadians(yy), primaryRight4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 18) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight3, primaryRight3.rotateAngleX + (float) Math.toRadians(xx), primaryRight3.rotateAngleY + (float) Math.toRadians(yy), primaryRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 67.75 + (((tickAnim - 0) / 23) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 67.75 + (((tickAnim - 23) / 3) * (0-(67.75)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (67.75-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 67.75 + (((tickAnim - 35) / 18) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight2, primaryRight2.rotateAngleX + (float) Math.toRadians(xx), primaryRight2.rotateAngleY + (float) Math.toRadians(yy), primaryRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 79.5 + (((tickAnim - 0) / 23) * (79.5-(79.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 79.5 + (((tickAnim - 23) / 3) * (-6.75-(79.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -6.75 + (((tickAnim - 26) / 6) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 32) / 3) * (79.5-(-6.75)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 79.5 + (((tickAnim - 35) / 18) * (79.5-(79.5)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight1, primaryRight1.rotateAngleX + (float) Math.toRadians(xx), primaryRight1.rotateAngleY + (float) Math.toRadians(yy), primaryRight1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10 + (((tickAnim - 0) / 23) * (-74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10-(-74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10)));
            yy = 0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20 + (((tickAnim - 0) / 23) * (0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20-(0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20)));
            zz = -82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35 + (((tickAnim - 0) / 23) * (-82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35-(-82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10 + (((tickAnim - 23) / 3) * (0-(-74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10)));
            yy = 0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20 + (((tickAnim - 23) / 3) * (0-(0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20)));
            zz = -82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35 + (((tickAnim - 23) / 3) * (0-(-82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (-82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = -74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10 + (((tickAnim - 35) / 18) * (-74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10-(-74.5765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*10)));
            yy = 0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20 + (((tickAnim - 35) / 18) * (0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20-(0.1609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-50))*-20)));
            zz = -82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35 + (((tickAnim - 35) / 18) * (-82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35-(-82.2464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(xx), armLeft1.rotateAngleY + (float) Math.toRadians(yy), armLeft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-0.5)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armLeft1.rotationPointX = this.armLeft1.rotationPointX + (float)(xx);
        this.armLeft1.rotationPointY = this.armLeft1.rotationPointY - (float)(yy);
        this.armLeft1.rotationPointZ = this.armLeft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5 + (((tickAnim - 0) / 23) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5 + (((tickAnim - 23) / 3) * (0-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5 + (((tickAnim - 35) / 15) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-220))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20 + (((tickAnim - 0) / 23) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20 + (((tickAnim - 23) / 3) * (0-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20 + (((tickAnim - 35) / 15) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(xx), armLeft3.rotateAngleY + (float) Math.toRadians(yy), armLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20 + (((tickAnim - 0) / 23) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20 + (((tickAnim - 23) / 3) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20 + (((tickAnim - 35) / 15) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft6, primaryLeft6.rotateAngleX + (float) Math.toRadians(xx), primaryLeft6.rotateAngleY + (float) Math.toRadians(yy), primaryLeft6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20 + (((tickAnim - 0) / 23) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20 + (((tickAnim - 23) / 3) * (0-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20 + (((tickAnim - 35) / 15) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft5, primaryLeft5.rotateAngleX + (float) Math.toRadians(xx), primaryLeft5.rotateAngleY + (float) Math.toRadians(yy), primaryLeft5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 15) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft4, primaryLeft4.rotateAngleX + (float) Math.toRadians(xx), primaryLeft4.rotateAngleY + (float) Math.toRadians(yy), primaryLeft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 0) / 23) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 23) / 3) * (0-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20 + (((tickAnim - 35) / 15) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20 + (((tickAnim - 35) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-320))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft3, primaryLeft3.rotateAngleX + (float) Math.toRadians(xx), primaryLeft3.rotateAngleY + (float) Math.toRadians(yy), primaryLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 67.75 + (((tickAnim - 0) / 23) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 67.75 + (((tickAnim - 23) / 3) * (0-(67.75)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (67.75-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 67.75 + (((tickAnim - 35) / 15) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft2, primaryLeft2.rotateAngleX + (float) Math.toRadians(xx), primaryLeft2.rotateAngleY + (float) Math.toRadians(yy), primaryLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 79.5 + (((tickAnim - 0) / 23) * (79.5-(79.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 79.5 + (((tickAnim - 23) / 3) * (-11.5-(79.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -11.5 + (((tickAnim - 26) / 6) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -11.5 + (((tickAnim - 32) / 3) * (79.5-(-11.5)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 79.5 + (((tickAnim - 35) / 18) * (79.5-(79.5)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft1, primaryLeft1.rotateAngleX + (float) Math.toRadians(xx), primaryLeft1.rotateAngleY + (float) Math.toRadians(yy), primaryLeft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8 + (((tickAnim - 23) / 3) * (14.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 14.25 + (((tickAnim - 26) / 6) * (-1-(14.25)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8-(-1)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-190))*-8)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 23) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 23) / 12) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            yy = -0.425 + (((tickAnim - 35) / 18) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8 + (((tickAnim - 0) / 23) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8 + (((tickAnim - 23) / 3) * (17.5-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 17.5 + (((tickAnim - 26) / 6) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 32) / 3) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8-(17.5)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8 + (((tickAnim - 35) / 18) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-230))*8)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10 + (((tickAnim - 0) / 23) * (-24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10-(-24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10 + (((tickAnim - 23) / 3) * (-37.5-(-24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -37.5 + (((tickAnim - 26) / 6) * (-36.75-(-37.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -36.75 + (((tickAnim - 32) / 3) * (-24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10-(-36.75)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = -24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10 + (((tickAnim - 35) / 18) * (-24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10-(-24.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-280))*-10)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 26.75 + (((tickAnim - 0) / 23) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 23) * (0.2-(0.2)));
            zz = 0.5 + (((tickAnim - 0) / 23) * (0.5-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8 + (((tickAnim - 0) / 23) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8 + (((tickAnim - 23) / 3) * (-30.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*20-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -30.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*20 + (((tickAnim - 26) / 6) * (-7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20-(-30.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*20)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20 + (((tickAnim - 32) / 3) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8-(-7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8 + (((tickAnim - 35) / 18) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-150))*-8)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(xx), tailFeathers.rotateAngleY + (float) Math.toRadians(yy), tailFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeatherLeft1, tailFeatherLeft1.rotateAngleX + (float) Math.toRadians(xx), tailFeatherLeft1.rotateAngleY + (float) Math.toRadians(yy), tailFeatherLeft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeatherLeft2, tailFeatherLeft2.rotateAngleX + (float) Math.toRadians(xx), tailFeatherLeft2.rotateAngleY + (float) Math.toRadians(yy), tailFeatherLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeatherRight1, tailFeatherRight1.rotateAngleX + (float) Math.toRadians(xx), tailFeatherRight1.rotateAngleY + (float) Math.toRadians(yy), tailFeatherRight1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 0) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 23) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12 + (((tickAnim - 35) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1080-250))*-12)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeatherRight2, tailFeatherRight2.rotateAngleX + (float) Math.toRadians(xx), tailFeatherRight2.rotateAngleY + (float) Math.toRadians(yy), tailFeatherRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 22.25 + (((tickAnim - 0) / 23) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight1, legRight1.rotateAngleX + (float) Math.toRadians(xx), legRight1.rotateAngleY + (float) Math.toRadians(yy), legRight1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -13.75 + (((tickAnim - 0) / 23) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -23.25 + (((tickAnim - 0) / 23) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 26 + (((tickAnim - 0) / 23) * (26-(26)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft1, legLeft1.rotateAngleX + (float) Math.toRadians(xx), legLeft1.rotateAngleY + (float) Math.toRadians(yy), legLeft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -13.75 + (((tickAnim - 0) / 23) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -23.25 + (((tickAnim - 0) / 23) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 23) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 23) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 3) * (0.2625-(1)));
            zz = 1 + (((tickAnim - 23) / 3) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 26) / 6) * (1-(1)));
            yy = 0.2625 + (((tickAnim - 26) / 6) * (0.2625-(0.2625)));
            zz = 1 + (((tickAnim - 26) / 6) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 32) / 3) * (1-(1)));
            yy = 0.2625 + (((tickAnim - 32) / 3) * (1-(0.2625)));
            zz = 1 + (((tickAnim - 32) / 3) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 35) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 18) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 18) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.tertialsRightToHide.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 23 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 23) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 23) / 3) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 26) / 6) * (1-(1)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 1 + (((tickAnim - 26) / 6) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 32) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 32) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 32) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.secondariesRightToHide.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 23) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 23) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 23) / 3) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 26) / 6) * (1-(1)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 1 + (((tickAnim - 26) / 6) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 32) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 32) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 32) / 3) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 35) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.tertialsLeftToHide.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 23 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 23) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 23) / 3) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 26) / 6) * (1-(1)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 1 + (((tickAnim - 26) / 6) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 32) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 32) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 32) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.secondariesLeftToHide.setScale((float)xx, (float)yy, (float)zz);
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCratoavis entity = (EntityPrehistoricFloraCratoavis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*0.5), base.rotateAngleY + (float) Math.toRadians(0), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*0.3);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*0.159);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*0.2);


        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-2), armRight1.rotateAngleY + (float) Math.toRadians(0), armRight1.rotateAngleZ + (float) Math.toRadians(0));


        this.tertialsRightToHide.setScale((float)1,(float)0,(float)1);


        this.secondariesRightToHide.setScale((float)1,(float)0,(float)1);


        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-2), armLeft1.rotateAngleY + (float) Math.toRadians(0), armLeft1.rotateAngleZ + (float) Math.toRadians(0));


        this.tertialsLeftToHide.setScale((float)1,(float)0,(float)1);


        this.secondariesLeftToHide.setScale((float)0.7,(float)0,(float)1);


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-400))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-400))*-2), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-2), tailFeathers.rotateAngleY + (float) Math.toRadians(0), tailFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeatherLeft1, tailFeatherLeft1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*4), tailFeatherLeft1.rotateAngleY + (float) Math.toRadians(0), tailFeatherLeft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeatherLeft2, tailFeatherLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*6), tailFeatherLeft2.rotateAngleY + (float) Math.toRadians(0), tailFeatherLeft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeatherRight1, tailFeatherRight1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*4), tailFeatherRight1.rotateAngleY + (float) Math.toRadians(0), tailFeatherRight1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeatherRight2, tailFeatherRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*6), tailFeatherRight2.rotateAngleY + (float) Math.toRadians(0), tailFeatherRight2.rotateAngleZ + (float) Math.toRadians(0));






        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 11.25 + (((tickAnim - 5) / 2) * (31.88-(11.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 31.88 + (((tickAnim - 7) / 3) * (0-(31.88)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0.15 + (((tickAnim - 7) / 3) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight2.rotationPointX = this.legRight2.rotationPointX + (float)(xx);
        this.legRight2.rotationPointY = this.legRight2.rotationPointY - (float)(yy);
        this.legRight2.rotationPointZ = this.legRight2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24 + (((tickAnim - 0) / 3) * (-3.25-(24)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.25 + (((tickAnim - 3) / 2) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-51.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -51.75 + (((tickAnim - 8) / 0) * (-51.75-(-51.75)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -51.75 + (((tickAnim - 8) / 2) * (24-(-51.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 0) * (-0.6-(-0.6)));
            zz = -0.175 + (((tickAnim - 8) / 0) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 2) * (0-(-0.6)));
            zz = -0.175 + (((tickAnim - 8) / 2) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight3.rotationPointX = this.legRight3.rotationPointX + (float)(xx);
        this.legRight3.rotationPointY = this.legRight3.rotationPointY - (float)(yy);
        this.legRight3.rotationPointZ = this.legRight3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.9-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5.9 + (((tickAnim - 3) / 2) * (-22-(-5.9)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -22 + (((tickAnim - 5) / 2) * (27-(-22)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 27 + (((tickAnim - 7) / 1) * (44.75-(27)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 44.75 + (((tickAnim - 8) / 2) * (0-(44.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight4, legRight4.rotateAngleX + (float) Math.toRadians(xx), legRight4.rotateAngleY + (float) Math.toRadians(yy), legRight4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.775-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.775 + (((tickAnim - 7) / 1) * (0-(0.775)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight4.rotationPointX = this.legRight4.rotationPointX + (float)(xx);
        this.legRight4.rotationPointY = this.legRight4.rotationPointY - (float)(yy);
        this.legRight4.rotationPointZ = this.legRight4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 32.5 + (((tickAnim - 0) / 5) * (-24.25-(32.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -24.25 + (((tickAnim - 5) / 5) * (32.5-(-24.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft1, legLeft1.rotateAngleX + (float) Math.toRadians(xx), legLeft1.rotateAngleY + (float) Math.toRadians(yy), legLeft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 11.25 + (((tickAnim - 0) / 2) * (31.88-(11.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 31.88 + (((tickAnim - 2) / 3) * (0-(31.88)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (11.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0.15 + (((tickAnim - 2) / 3) * (0-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft2.rotationPointX = this.legLeft2.rotationPointX + (float)(xx);
        this.legLeft2.rotationPointY = this.legLeft2.rotationPointY - (float)(yy);
        this.legLeft2.rotationPointZ = this.legLeft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-51.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -51.75 + (((tickAnim - 3) / 0) * (-51.75-(-51.75)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -51.75 + (((tickAnim - 3) / 2) * (24-(-51.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 24 + (((tickAnim - 5) / 3) * (0.25-(24)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.25 + (((tickAnim - 8) / 2) * (0-(0.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 0) * (-0.6-(-0.6)));
            zz = -0.175 + (((tickAnim - 3) / 0) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 2) * (0-(-0.6)));
            zz = -0.175 + (((tickAnim - 3) / 2) * (0-(-0.175)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft3.rotationPointX = this.legLeft3.rotationPointX + (float)(xx);
        this.legLeft3.rotationPointY = this.legLeft3.rotationPointY - (float)(yy);
        this.legLeft3.rotationPointZ = this.legLeft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -22 + (((tickAnim - 0) / 2) * (27-(-22)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 27 + (((tickAnim - 2) / 1) * (44.75-(27)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 44.75 + (((tickAnim - 3) / 2) * (0-(44.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-22-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft4, legLeft4.rotateAngleX + (float) Math.toRadians(xx), legLeft4.rotateAngleY + (float) Math.toRadians(yy), legLeft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.775 + (((tickAnim - 2) / 1) * (0-(0.775)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft4.rotationPointX = this.legLeft4.rotationPointX + (float)(xx);
        this.legLeft4.rotationPointY = this.legLeft4.rotationPointY - (float)(yy);
        this.legLeft4.rotationPointZ = this.legLeft4.rotationPointZ + (float)(zz);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
