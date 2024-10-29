package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPentecopterus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;


public class ModelPentecopterus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer talson;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legRs1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer legRss1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legRs2;
    private final AdvancedModelRenderer legRss2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer legRsss2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legRs3;
    private final AdvancedModelRenderer legRss3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legRs4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legRs5;
    private final AdvancedModelRenderer legRss5;
    private final AdvancedModelRenderer legRsss5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legLs1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer legLss1;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legLs2;
    private final AdvancedModelRenderer legLss2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer legLsss2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legLs3;
    private final AdvancedModelRenderer legLss3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legLs4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legLs5;
    private final AdvancedModelRenderer legLss5;
    private final AdvancedModelRenderer legLsss5;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private ModelAnimator animator;



    public ModelPentecopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.75F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 16, -3.0F, -0.25F, -8.0F, 6, 1, 6, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 17, 27, -3.0F, -1.25F, -7.0F, 6, 1, 5, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.5F, -0.225F, -2.5F, 11, 1, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 6, -5.0F, -1.25F, -2.5F, 10, 1, 4, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 46, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 43, 43, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 1.25F, -4.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6109F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 48, 0.0F, -1.0F, -0.25F, 1, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 1.25F, -4.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6109F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 48, -1.0F, -1.0F, -0.25F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.25F, 1.25F, -4.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 27, 0.0F, -2.75F, -0.55F, 2, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, 0.75F, -8.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 23, -3.0F, -1.0F, 0.0F, 3, 1, 6, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, 0.75F, -8.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4189F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, -3.4F, -2.0F, 0.9F, 3, 1, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.25F, 1.25F, -4.5F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5672F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 27, -2.0F, -2.75F, -0.55F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0F, 0.75F, -8.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.4189F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 37, 0.4F, -2.0F, 0.9F, 3, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0F, 0.75F, -8.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 23, 0.0F, -1.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 24, 33, -5.0F, -0.75F, 0.0F, 10, 2, 2, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 18, 48, -0.5F, 0.5F, 1.5F, 1, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 33, -5.0F, -0.75F, 0.0F, 10, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 26, 10, -5.5F, -0.75F, 0.0F, 11, 2, 2, 0.03F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 24, 6, -5.5F, -0.75F, 0.0F, 11, 2, 2, 0.02F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 15, 23, -5.5F, -0.75F, 0.0F, 11, 2, 2, 0.01F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 11, -5.5F, -0.75F, 0.0F, 11, 2, 3, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 16, -5.0F, -0.75F, 0.0F, 10, 2, 3, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 27, 0, -4.5F, -0.75F, 0.0F, 9, 2, 3, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 11, 37, -3.5F, -0.75F, 0.0F, 7, 2, 2, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 0, 29, -3.0F, -0.75F, 0.0F, 6, 2, 2, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 14, 41, -2.5F, -0.75F, 0.0F, 5, 2, 2, 0.0F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body12.addChild(body13);
        this.body13.cubeList.add(new ModelBox(body13, 29, 37, -2.0F, -0.75F, 0.0F, 4, 2, 3, 0.0F, false));

        this.talson = new AdvancedModelRenderer(this);
        this.talson.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body13.addChild(talson);
        this.talson.cubeList.add(new ModelBox(talson, 0, 21, -2.0F, -0.5F, -0.5F, 4, 1, 7, 0.01F, false));
        this.talson.cubeList.add(new ModelBox(talson, 0, 48, -1.0F, -0.5F, 5.75F, 2, 1, 2, 0.0F, false));
        this.talson.cubeList.add(new ModelBox(talson, 47, 47, -0.5F, -0.5F, 7.75F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.5F, 10.75F);
        this.talson.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.288F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 14, -1.0F, -1.0F, -5.0F, 1, 1, 5, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.5F, 10.75F);
        this.talson.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.288F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 14, 0.0F, -1.0F, -5.0F, 1, 1, 5, -0.01F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, 0.5F, -3.0F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0873F, -0.3927F, -0.2618F);
        this.legR1.cubeList.add(new ModelBox(legR1, 47, 38, -2.5F, -0.25F, -0.6F, 3, 1, 2, 0.01F, false));

        this.legRs1 = new AdvancedModelRenderer(this);
        this.legRs1.setRotationPoint(-2.5F, 0.25F, 0.25F);
        this.legR1.addChild(legRs1);
        this.setRotateAngle(legRs1, 0.0F, -0.7418F, 0.0F);
        this.legRs1.cubeList.add(new ModelBox(legRs1, 6, 48, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legRs1.cubeList.add(new ModelBox(legRs1, 0, 11, -1.4F, 0.0F, -1.5F, 1, 0, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, 0.5F, -0.5F);
        this.legRs1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3927F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 21, -0.4F, -0.5F, -4.25F, 1, 0, 5, 0.0F, false));

        this.legRss1 = new AdvancedModelRenderer(this);
        this.legRss1.setRotationPoint(-2.5F, 0.0F, -0.1F);
        this.legRs1.addChild(legRss1);
        this.setRotateAngle(legRss1, 0.0F, -0.2182F, 0.0F);
        this.legRss1.cubeList.add(new ModelBox(legRss1, 48, 5, -2.5F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));
        this.legRss1.cubeList.add(new ModelBox(legRss1, 48, 0, -2.5F, -0.5F, -1.1F, 3, 1, 1, -0.015F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.5F, 0.5F, 0.0F);
        this.legRss1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3927F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 22, -1.5F, -0.5F, -0.8F, 2, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, 0.5F, -2.25F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.2618F, -0.0873F);
        this.legR2.cubeList.add(new ModelBox(legR2, 44, 20, -4.5F, -0.25F, -0.6F, 5, 1, 2, 0.01F, false));

        this.legRs2 = new AdvancedModelRenderer(this);
        this.legRs2.setRotationPoint(-4.5F, 0.25F, 0.25F);
        this.legR2.addChild(legRs2);
        this.setRotateAngle(legRs2, 0.0F, -0.6109F, 0.0F);
        this.legRs2.cubeList.add(new ModelBox(legRs2, 47, 25, -2.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.legRss2 = new AdvancedModelRenderer(this);
        this.legRss2.setRotationPoint(-2.5F, 0.0F, -0.1F);
        this.legRs2.addChild(legRss2);
        this.setRotateAngle(legRss2, 0.0F, -0.3491F, 0.0F);
        this.legRss2.cubeList.add(new ModelBox(legRss2, 32, 43, -4.5F, -0.5F, -1.0F, 5, 1, 2, -0.01F, false));
        this.legRss2.cubeList.add(new ModelBox(legRss2, 27, 37, -2.5F, -0.5F, -1.975F, 1, 1, 1, 0.0F, false));
        this.legRss2.cubeList.add(new ModelBox(legRss2, 0, 37, -4.5F, -0.5F, -1.975F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.25F, 0.5F, 0.0F);
        this.legRss2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3054F, -0.2182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 21, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.legRss2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.2618F, -0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.25F, -0.5F, 0.0F);
        this.legRss2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3054F, 0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 21, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -0.5F, 0.0F);
        this.legRss2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.2618F, 0.3491F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 22, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legRsss2 = new AdvancedModelRenderer(this);
        this.legRsss2.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.legRss2.addChild(legRsss2);
        this.setRotateAngle(legRsss2, 0.0F, -0.1309F, 0.0F);
        this.legRsss2.cubeList.add(new ModelBox(legRsss2, 47, 23, -4.5F, -0.5F, -0.25F, 5, 1, 1, -0.02F, false));
        this.legRsss2.cubeList.add(new ModelBox(legRsss2, 22, 33, -2.25F, -0.5F, -1.225F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.25F, 0.5F, 0.0F);
        this.legRsss2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1745F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 14, -6.0F, 0.0F, -1.25F, 6, 0, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.25F, -0.5F, 0.0F);
        this.legRsss2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.2618F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 30, -6.0F, 0.0F, -1.25F, 6, 0, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.5F, 0.5F, 0.25F);
        this.legRsss2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.7854F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 29, -0.3F, -0.5F, -2.65F, 2, 0, 3, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, 0.5F, -1.25F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.2182F, -0.2618F);
        this.legR3.cubeList.add(new ModelBox(legR3, 40, 47, -3.5F, -0.25F, -0.35F, 4, 1, 1, 0.01F, false));

        this.legRs3 = new AdvancedModelRenderer(this);
        this.legRs3.setRotationPoint(-3.5F, 0.25F, -0.25F);
        this.legR3.addChild(legRs3);
        this.setRotateAngle(legRs3, 0.0F, -0.2618F, 0.0F);
        this.legRs3.cubeList.add(new ModelBox(legRs3, 46, 35, -2.5F, -0.5F, -0.75F, 3, 1, 2, 0.0F, false));
        this.legRs3.cubeList.add(new ModelBox(legRs3, 0, 8, -2.5F, -0.5F, -1.25F, 1, 1, 1, -0.02F, false));

        this.legRss3 = new AdvancedModelRenderer(this);
        this.legRss3.setRotationPoint(-2.5F, 0.0F, -0.1F);
        this.legRs3.addChild(legRss3);
        this.setRotateAngle(legRss3, 0.0F, -0.3491F, 0.0F);
        this.legRss3.cubeList.add(new ModelBox(legRss3, 38, 20, -2.5F, -0.5F, -0.25F, 3, 1, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.5F, 0.0F, 0.5F);
        this.legRss3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.6545F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 2, -2.0F, 0.0F, -0.75F, 2, 0, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.legRss3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6109F, -0.1309F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 43, 14, -5.0F, 0.0F, -1.5F, 5, 0, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.25F, -0.5F, 0.5F);
        this.legRss3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.6109F, 0.1309F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 43, 16, -5.0F, 0.0F, -1.5F, 5, 0, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.legRss3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.829F, -0.3491F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 1, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -0.5F, 0.5F);
        this.legRss3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.829F, 0.3491F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 3, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.25F, 0.5F, 0.25F);
        this.legRss3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -1.0036F, -0.3491F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 21, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.25F, -0.5F, 0.25F);
        this.legRss3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -1.0036F, 0.3491F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 27, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, 0.5F, -0.75F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.3927F, -0.3491F);
        this.legR4.cubeList.add(new ModelBox(legR4, 23, 47, -4.5F, -0.25F, -0.35F, 5, 1, 1, 0.01F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 46, -4.5F, 0.25F, -0.35F, 5, 1, 1, 0.0F, false));

        this.legRs4 = new AdvancedModelRenderer(this);
        this.legRs4.setRotationPoint(-4.5F, 0.25F, 0.0F);
        this.legR4.addChild(legRs4);
        this.setRotateAngle(legRs4, 0.0F, 0.0873F, 0.0F);
        this.legRs4.cubeList.add(new ModelBox(legRs4, 46, 33, -5.0F, -0.5F, -0.35F, 5, 1, 1, 0.0F, false));
        this.legRs4.cubeList.add(new ModelBox(legRs4, 12, 46, -5.0F, 0.3F, -0.35F, 5, 1, 1, -0.01F, false));
        this.legRs4.cubeList.add(new ModelBox(legRs4, 0, 0, -6.75F, 0.0F, -0.35F, 2, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.0F, 0.5F, 0.25F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, -0.0873F, 0.6545F, -0.3927F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 43, -4.5F, -0.25F, -0.6F, 5, 1, 2, 0.01F, false));

        this.legRs5 = new AdvancedModelRenderer(this);
        this.legRs5.setRotationPoint(-4.5F, 0.25F, 0.0F);
        this.legR5.addChild(legRs5);
        this.setRotateAngle(legRs5, 0.0F, 0.2618F, 0.0F);
        this.legRs5.cubeList.add(new ModelBox(legRs5, 44, 30, -4.0F, -0.5F, -0.7F, 4, 1, 2, 0.0F, false));

        this.legRss5 = new AdvancedModelRenderer(this);
        this.legRss5.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legRs5.addChild(legRss5);
        this.setRotateAngle(legRss5, 0.0F, 0.7418F, 0.0F);
        this.legRss5.cubeList.add(new ModelBox(legRss5, 24, 42, -1.75F, -0.5F, -2.95F, 2, 1, 4, -0.01F, false));
        this.legRss5.cubeList.add(new ModelBox(legRss5, 0, 6, -1.25F, -0.5F, -3.85F, 1, 1, 1, -0.02F, false));

        this.legRsss5 = new AdvancedModelRenderer(this);
        this.legRsss5.setRotationPoint(-1.25F, 0.5F, 1.0F);
        this.legRss5.addChild(legRsss5);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legRsss5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.6109F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 39, 38, -0.35F, -1.0F, -4.45F, 2, 1, 4, -0.02F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.0F, 0.0F, -4.0F);
        this.legRsss5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 1.2217F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 24, -0.6F, -1.0F, -1.7F, 1, 1, 2, -0.03F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.0F, 0.5F, -3.0F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0873F, 0.3927F, 0.2618F);
        this.legL1.cubeList.add(new ModelBox(legL1, 47, 38, -0.5F, -0.25F, -0.6F, 3, 1, 2, 0.01F, true));

        this.legLs1 = new AdvancedModelRenderer(this);
        this.legLs1.setRotationPoint(2.5F, 0.25F, 0.25F);
        this.legL1.addChild(legLs1);
        this.setRotateAngle(legLs1, 0.0F, 0.7418F, 0.0F);
        this.legLs1.cubeList.add(new ModelBox(legLs1, 6, 48, -0.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.legLs1.cubeList.add(new ModelBox(legLs1, 0, 11, 0.4F, 0.0F, -1.5F, 1, 0, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.0F, 0.5F, -0.5F);
        this.legLs1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.3927F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 21, -0.6F, -0.5F, -4.25F, 1, 0, 5, 0.0F, true));

        this.legLss1 = new AdvancedModelRenderer(this);
        this.legLss1.setRotationPoint(2.5F, 0.0F, -0.1F);
        this.legLs1.addChild(legLss1);
        this.setRotateAngle(legLss1, 0.0F, 0.2182F, 0.0F);
        this.legLss1.cubeList.add(new ModelBox(legLss1, 48, 5, -0.5F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));
        this.legLss1.cubeList.add(new ModelBox(legLss1, 48, 0, -0.5F, -0.5F, -1.1F, 3, 1, 1, -0.015F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.5F, 0.5F, 0.0F);
        this.legLss1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.3927F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 22, -0.5F, -0.5F, -0.8F, 2, 0, 1, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, 0.5F, -2.25F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.2618F, 0.0873F);
        this.legL2.cubeList.add(new ModelBox(legL2, 44, 20, -0.5F, -0.25F, -0.6F, 5, 1, 2, 0.01F, true));

        this.legLs2 = new AdvancedModelRenderer(this);
        this.legLs2.setRotationPoint(4.5F, 0.25F, 0.25F);
        this.legL2.addChild(legLs2);
        this.setRotateAngle(legLs2, 0.0F, 0.6109F, 0.0F);
        this.legLs2.cubeList.add(new ModelBox(legLs2, 47, 25, -0.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.legLss2 = new AdvancedModelRenderer(this);
        this.legLss2.setRotationPoint(2.5F, 0.0F, -0.1F);
        this.legLs2.addChild(legLss2);
        this.setRotateAngle(legLss2, 0.0F, 0.3491F, 0.0F);
        this.legLss2.cubeList.add(new ModelBox(legLss2, 32, 43, -0.5F, -0.5F, -1.0F, 5, 1, 2, -0.01F, true));
        this.legLss2.cubeList.add(new ModelBox(legLss2, 27, 37, 1.5F, -0.5F, -1.975F, 1, 1, 1, 0.0F, true));
        this.legLss2.cubeList.add(new ModelBox(legLss2, 0, 37, 3.5F, -0.5F, -1.975F, 1, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(3.25F, 0.5F, 0.0F);
        this.legLss2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.3054F, 0.2182F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 21, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.legLss2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.2618F, 0.2182F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(3.25F, -0.5F, 0.0F);
        this.legLss2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.3054F, -0.3491F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 20, 21, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0F, -0.5F, 0.0F);
        this.legLss2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.2618F, -0.3491F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 22, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legLsss2 = new AdvancedModelRenderer(this);
        this.legLsss2.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.legLss2.addChild(legLsss2);
        this.setRotateAngle(legLsss2, 0.0F, 0.1309F, 0.0F);
        this.legLsss2.cubeList.add(new ModelBox(legLsss2, 47, 23, -0.5F, -0.5F, -0.25F, 5, 1, 1, -0.02F, true));
        this.legLsss2.cubeList.add(new ModelBox(legLsss2, 22, 33, 1.25F, -0.5F, -1.225F, 1, 1, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.25F, 0.5F, 0.0F);
        this.legLsss2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.1745F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 26, 14, 0.0F, 0.0F, -1.25F, 6, 0, 2, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.25F, -0.5F, 0.0F);
        this.legLsss2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.2618F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 32, 30, 0.0F, 0.0F, -1.25F, 6, 0, 2, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(4.5F, 0.5F, 0.25F);
        this.legLsss2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.7854F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 13, 29, -1.7F, -0.5F, -2.65F, 2, 0, 3, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, 0.5F, -1.25F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.2182F, 0.2618F);
        this.legL3.cubeList.add(new ModelBox(legL3, 40, 47, -0.5F, -0.25F, -0.35F, 4, 1, 1, 0.01F, true));

        this.legLs3 = new AdvancedModelRenderer(this);
        this.legLs3.setRotationPoint(3.5F, 0.25F, -0.25F);
        this.legL3.addChild(legLs3);
        this.setRotateAngle(legLs3, 0.0F, 0.2618F, 0.0F);
        this.legLs3.cubeList.add(new ModelBox(legLs3, 46, 35, -0.5F, -0.5F, -0.75F, 3, 1, 2, 0.0F, true));
        this.legLs3.cubeList.add(new ModelBox(legLs3, 0, 8, 1.5F, -0.5F, -1.25F, 1, 1, 1, -0.02F, true));

        this.legLss3 = new AdvancedModelRenderer(this);
        this.legLss3.setRotationPoint(2.5F, 0.0F, -0.1F);
        this.legLs3.addChild(legLss3);
        this.setRotateAngle(legLss3, 0.0F, 0.3491F, 0.0F);
        this.legLss3.cubeList.add(new ModelBox(legLss3, 38, 20, -0.5F, -0.5F, -0.25F, 3, 1, 1, -0.01F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(2.5F, 0.0F, 0.5F);
        this.legLss3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.6545F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 2, 0.0F, 0.0F, -0.75F, 2, 0, 1, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.legLss3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.6109F, 0.1309F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 43, 14, 0.0F, 0.0F, -1.5F, 5, 0, 2, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.25F, -0.5F, 0.5F);
        this.legLss3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.6109F, -0.1309F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 43, 16, 0.0F, 0.0F, -1.5F, 5, 0, 2, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.legLss3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.829F, 0.3491F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 1, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0F, -0.5F, 0.5F);
        this.legLss3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.829F, -0.3491F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 3, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.25F, 0.5F, 0.25F);
        this.legLss3.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 1.0036F, 0.3491F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 14, 21, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.25F, -0.5F, 0.25F);
        this.legLss3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 1.0036F, -0.3491F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 27, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, 0.5F, -0.75F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.3927F, 0.3491F);
        this.legL4.cubeList.add(new ModelBox(legL4, 23, 47, -0.5F, -0.25F, -0.35F, 5, 1, 1, 0.01F, true));
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 46, -0.5F, 0.25F, -0.35F, 5, 1, 1, 0.0F, true));

        this.legLs4 = new AdvancedModelRenderer(this);
        this.legLs4.setRotationPoint(4.5F, 0.25F, 0.0F);
        this.legL4.addChild(legLs4);
        this.setRotateAngle(legLs4, 0.0F, -0.0873F, 0.0F);
        this.legLs4.cubeList.add(new ModelBox(legLs4, 46, 33, 0.0F, -0.5F, -0.35F, 5, 1, 1, 0.0F, true));
        this.legLs4.cubeList.add(new ModelBox(legLs4, 12, 46, 0.0F, 0.3F, -0.35F, 5, 1, 1, -0.01F, true));
        this.legLs4.cubeList.add(new ModelBox(legLs4, 0, 0, 4.75F, 0.0F, -0.35F, 2, 0, 1, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.0F, 0.5F, 0.25F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, -0.0873F, -0.6545F, 0.3927F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 43, -0.5F, -0.25F, -0.6F, 5, 1, 2, 0.01F, true));

        this.legLs5 = new AdvancedModelRenderer(this);
        this.legLs5.setRotationPoint(4.5F, 0.25F, 0.0F);
        this.legL5.addChild(legLs5);
        this.setRotateAngle(legLs5, 0.0F, -0.2618F, 0.0F);
        this.legLs5.cubeList.add(new ModelBox(legLs5, 44, 30, 0.0F, -0.5F, -0.7F, 4, 1, 2, 0.0F, true));

        this.legLss5 = new AdvancedModelRenderer(this);
        this.legLss5.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legLs5.addChild(legLss5);
        this.setRotateAngle(legLss5, 0.0F, -0.7418F, 0.0F);
        this.legLss5.cubeList.add(new ModelBox(legLss5, 24, 42, -0.25F, -0.5F, -2.95F, 2, 1, 4, -0.01F, true));
        this.legLss5.cubeList.add(new ModelBox(legLss5, 0, 6, 0.25F, -0.5F, -3.85F, 1, 1, 1, -0.02F, true));

        this.legLsss5 = new AdvancedModelRenderer(this);
        this.legLsss5.setRotationPoint(1.25F, 0.5F, 1.0F);
        this.legLss5.addChild(legLsss5);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(2.0F, 0.0F, -4.0F);
        this.legLsss5.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -1.2217F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 24, -0.4F, -1.0F, -1.7F, 1, 1, 2, -0.03F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legLsss5.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.6109F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 39, 38, -1.65F, -1.0F, -4.45F, 2, 1, 4, -0.02F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.2F, 0.0F, 0.2F);
        this.body.offsetZ = -0.03F;
        this.body.offsetY = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.05F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.6F;
        this.body.offsetX = 0.55F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 2.5F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
       // this.body.offsetZ = 0.4F;
        //this.body.offsetY = -0.2F;
        this.body.offsetZ = -0.35F;


        AdvancedModelRenderer[] fishBody = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.talson};
        AdvancedModelRenderer[] fishTail = {this.body13, this.talson};



        //mouthparts:
        this.walk(legL1, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(legR1, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraPentecopterus slimon = (EntityPrehistoricFloraPentecopterus) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = -0.2F;
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPentecopterus ee = (EntityPrehistoricFloraPentecopterus) entitylivingbaseIn;
        //Swimming pose:
        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
                    //Walk pose:
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    if ((ee.getAnimation() != ee.SWIM_ANIMATION)) {
                        if (ee.getIsFast()) {
                            animFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                        } else {
                            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        }
                    }
                }
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    if (ee.isReallySwimming()) {
                        //Swim static pose:
                        animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        //Walk static pose:
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                }
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }

    public void animFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPentecopterus entity = (EntityPrehistoricFloraPentecopterus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));
        this.body.rotationPointX = this.body.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+100+150))*2);
        this.body.rotationPointY = this.body.rotationPointY - (float)(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+150-90)));
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25))*2.5), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15))*1.5), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-30))*3), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*2))*1.5), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-60))*4), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*3))*1.5), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-90))*5), body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*4))*1.5), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-120))*6), body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*5))*1.5), body6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body7, body7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-150))*7), body7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*6))*1.5), body7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body8, body8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-180))*8), body8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*7))*1.5), body8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body9, body9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-210))*9), body9.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*8))*1.5), body9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body10, body10.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-220))*10), body10.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*9))*1.5), body10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body11, body11.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-230))*8), body11.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*10))*1.5), body11.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body12, body12.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-240))*7), body12.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*11))*1.5), body12.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body13, body13.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-250))*6), body13.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*12))*1.5), body13.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(talson, talson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-280))*30), talson.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+280-15*13))*1.5), talson.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(0), legRs5.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+30))*25), legRs5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRss5, legRss5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+150))*5), legRss5.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-50))*20), legRss5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-240))*50));
        this.setRotateAngle(legRsss5, legRsss5.rotateAngleX + (float) Math.toRadians(0), legRsss5.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-40))*25), legRsss5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(0), legLs5.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+120-90))*25), legLs5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLss5, legLss5.rotateAngleX + (float) Math.toRadians(xx), legLss5.rotateAngleY + (float) Math.toRadians(yy), legLss5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(legLsss5, legLsss5.rotateAngleX + (float) Math.toRadians(0), legLsss5.rotateAngleY + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+50-90))*25), legLsss5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(0), legR1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-130))), legR1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRs1, legRs1.rotateAngleX + (float) Math.toRadians(0), legRs1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-160))*2.5), legRs1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRss1, legRss1.rotateAngleX + (float) Math.toRadians(0), legRss1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-190))*5), legRss1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(0), legR2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-100))), legR2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRs2, legRs2.rotateAngleX + (float) Math.toRadians(0), legRs2.rotateAngleY + (float) Math.toRadians(35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-130))), legRs2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRss2, legRss2.rotateAngleX + (float) Math.toRadians(0), legRss2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-160))*2.5), legRss2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRsss2, legRsss2.rotateAngleX + (float) Math.toRadians(0), legRsss2.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-190))*5), legRsss2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(22.5), legR3.rotateAngleY + (float) Math.toRadians(0), legR3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRs3, legRs3.rotateAngleX + (float) Math.toRadians(0), legRs3.rotateAngleY + (float) Math.toRadians(-67.5), legRs3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(-87.73421), legR4.rotateAngleY + (float) Math.toRadians(36.10029), legR4.rotateAngleZ + (float) Math.toRadians(-47.26579));
        this.setRotateAngle(legRs4, legRs4.rotateAngleX + (float) Math.toRadians(0), legRs4.rotateAngleY + (float) Math.toRadians(0), legRs4.rotateAngleZ + (float) Math.toRadians(-135));
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(0), legL1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-130))), legL1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLs1, legLs1.rotateAngleX + (float) Math.toRadians(0), legLs1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-160))*2.5), legLs1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLss1, legLss1.rotateAngleX + (float) Math.toRadians(0), legLss1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-190))*5), legLss1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(0), legL2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-100))), legL2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLs2, legLs2.rotateAngleX + (float) Math.toRadians(0), legLs2.rotateAngleY + (float) Math.toRadians(-35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-130))), legLs2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLss2, legLss2.rotateAngleX + (float) Math.toRadians(0), legLss2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-160))*2.5), legLss2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLsss2, legLsss2.rotateAngleX + (float) Math.toRadians(0), legLsss2.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-190))*5), legLsss2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(22.5), legL3.rotateAngleY + (float) Math.toRadians(0), legL3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLs3, legLs3.rotateAngleX + (float) Math.toRadians(0), legLs3.rotateAngleY + (float) Math.toRadians(67.5), legLs3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(-87.73421), legL4.rotateAngleY + (float) Math.toRadians(-36.10029), legL4.rotateAngleZ + (float) Math.toRadians(47.26579));
        this.setRotateAngle(legLs4, legLs4.rotateAngleX + (float) Math.toRadians(0), legLs4.rotateAngleY + (float) Math.toRadians(0), legLs4.rotateAngleZ + (float) Math.toRadians(135));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPentecopterus entity = (EntityPrehistoricFloraPentecopterus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (69.98107-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.43523-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-17.51893-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 69.98107 + (((tickAnim - 15) / 4) * (42.51645-(69.98107)));
            yy = -0.43523 + (((tickAnim - 15) / 4) * (0.11191-(-0.43523)));
            zz = -17.51893 + (((tickAnim - 15) / 4) * (-7.50705-(-17.51893)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 42.51645 + (((tickAnim - 19) / 6) * (-8.62682-(42.51645)));
            yy = 0.11191 + (((tickAnim - 19) / 6) * (-0.43161-(0.11191)));
            zz = -7.50705 + (((tickAnim - 19) / 6) * (10.34423-(-7.50705)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -8.62682 + (((tickAnim - 25) / 3) * (-19.10233-(-8.62682)));
            yy = -0.43161 + (((tickAnim - 25) / 3) * (7.37592-(-0.43161)));
            zz = 10.34423 + (((tickAnim - 25) / 3) * (3.35423-(10.34423)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -19.10233 + (((tickAnim - 28) / 12) * (0-(-19.10233)));
            yy = 7.37592 + (((tickAnim - 28) / 12) * (0-(7.37592)));
            zz = 3.35423 + (((tickAnim - 28) / 12) * (0-(3.35423)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (13-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (14-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 13 + (((tickAnim - 15) / 4) * (9-(13)));
            zz = 14 + (((tickAnim - 15) / 4) * (5.67-(14)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 9 + (((tickAnim - 19) / 3) * (3-(9)));
            zz = 5.67 + (((tickAnim - 19) / 3) * (0-(5.67)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 3 + (((tickAnim - 22) / 3) * (2-(3)));
            zz = 0 + (((tickAnim - 22) / 3) * (-2-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (-1-(0)));
            yy = 2 + (((tickAnim - 25) / 6) * (1-(2)));
            zz = -2 + (((tickAnim - 25) / 6) * (-5-(-2)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 31) / 9) * (0-(-1)));
            yy = 1 + (((tickAnim - 31) / 9) * (0-(1)));
            zz = -5 + (((tickAnim - 31) / 9) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.01365-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.41476-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.64743-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = -15.01365 + (((tickAnim - 10) / 18) * (7.50113-(-15.01365)));
            yy = 2.41476 + (((tickAnim - 10) / 18) * (-0.99144-(2.41476)));
            zz = -0.64743 + (((tickAnim - 10) / 18) * (-0.13054-(-0.64743)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 7.50113 + (((tickAnim - 28) / 9) * (-10.42-(7.50113)));
            yy = -0.99144 + (((tickAnim - 28) / 9) * (0-(-0.99144)));
            zz = -0.13054 + (((tickAnim - 28) / 9) * (0-(-0.13054)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -10.42 + (((tickAnim - 37) / 3) * (0-(-10.42)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.50738-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.95257-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.43305-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = -12.50738 + (((tickAnim - 10) / 18) * (7.50113-(-12.50738)));
            yy = 1.95257 + (((tickAnim - 10) / 18) * (-0.99144-(1.95257)));
            zz = -0.43305 + (((tickAnim - 10) / 18) * (-0.13054-(-0.43305)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 7.50113 + (((tickAnim - 28) / 9) * (-5.42-(7.50113)));
            yy = -0.99144 + (((tickAnim - 28) / 9) * (0-(-0.99144)));
            zz = -0.13054 + (((tickAnim - 28) / 9) * (0-(-0.13054)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -5.42 + (((tickAnim - 37) / 3) * (0-(-5.42)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.00149-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.98481-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.17367-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -10.00149 + (((tickAnim - 10) / 12) * (4.67-(-10.00149)));
            yy = 0.98481 + (((tickAnim - 10) / 12) * (0-(0.98481)));
            zz = -0.17367 + (((tickAnim - 10) / 12) * (0-(-0.17367)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 4.67 + (((tickAnim - 22) / 6) * (7.50113-(4.67)));
            yy = 0 + (((tickAnim - 22) / 6) * (-0.99144-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (-0.13054-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 7.50113 + (((tickAnim - 28) / 12) * (0-(7.50113)));
            yy = -0.99144 + (((tickAnim - 28) / 12) * (0-(-0.99144)));
            zz = -0.13054 + (((tickAnim - 28) / 12) * (0-(-0.13054)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.00218-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.96592-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.25884-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -15.00218 + (((tickAnim - 10) / 12) * (8.15-(-15.00218)));
            yy = 0.96592 + (((tickAnim - 10) / 12) * (0-(0.96592)));
            zz = -0.25884 + (((tickAnim - 10) / 12) * (0-(-0.25884)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 8.15 + (((tickAnim - 22) / 6) * (7.50113-(8.15)));
            yy = 0 + (((tickAnim - 22) / 6) * (-0.99144-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (-0.13054-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 7.50113 + (((tickAnim - 28) / 12) * (0-(7.50113)));
            yy = -0.99144 + (((tickAnim - 28) / 12) * (0-(-0.99144)));
            zz = -0.13054 + (((tickAnim - 28) / 12) * (0-(-0.13054)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(xx), body5.rotateAngleY + (float) Math.toRadians(yy), body5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4 + (((tickAnim - 5) / 5) * (-17.25224-(-4)));
            yy = 0 + (((tickAnim - 5) / 5) * (2.86526-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.88937-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -17.25224 + (((tickAnim - 10) / 12) * (7.47-(-17.25224)));
            yy = 2.86526 + (((tickAnim - 10) / 12) * (0-(2.86526)));
            zz = -0.88937 + (((tickAnim - 10) / 12) * (0-(-0.88937)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 7.47 + (((tickAnim - 22) / 6) * (7.50452-(7.47)));
            yy = 0 + (((tickAnim - 22) / 6) * (-1.98288-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (-0.26116-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 7.50452 + (((tickAnim - 28) / 12) * (0-(7.50452)));
            yy = -1.98288 + (((tickAnim - 28) / 12) * (0-(-1.98288)));
            zz = -0.26116 + (((tickAnim - 28) / 12) * (0-(-0.26116)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(xx), body6.rotateAngleY + (float) Math.toRadians(yy), body6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 5) / 5) * (-15.00873-(-15)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.93183-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.51783-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -15.00873 + (((tickAnim - 10) / 12) * (8.15-(-15.00873)));
            yy = 1.93183 + (((tickAnim - 10) / 12) * (0-(1.93183)));
            zz = -0.51783 + (((tickAnim - 10) / 12) * (0-(-0.51783)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 8.15 + (((tickAnim - 22) / 6) * (7.5181-(8.15)));
            yy = 0 + (((tickAnim - 22) / 6) * (-3.96572-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (-0.52294-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 7.5181 + (((tickAnim - 28) / 12) * (0-(7.5181)));
            yy = -3.96572 + (((tickAnim - 28) / 12) * (0-(-3.96572)));
            zz = -0.52294 + (((tickAnim - 28) / 12) * (0-(-0.52294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body7, body7.rotateAngleX + (float) Math.toRadians(xx), body7.rotateAngleY + (float) Math.toRadians(yy), body7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 5) / 5) * (-20.05692-(-15)));
            yy = 0 + (((tickAnim - 5) / 5) * (4.22811-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-1.54189-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = -20.05692 + (((tickAnim - 10) / 18) * (7.51018-(-20.05692)));
            yy = 4.22811 + (((tickAnim - 10) / 18) * (-2.97431-(4.22811)));
            zz = -1.54189 + (((tickAnim - 10) / 18) * (-0.39193-(-1.54189)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 7.51018 + (((tickAnim - 28) / 12) * (0-(7.51018)));
            yy = -2.97431 + (((tickAnim - 28) / 12) * (0-(-2.97431)));
            zz = -0.39193 + (((tickAnim - 28) / 12) * (0-(-0.39193)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body8, body8.rotateAngleX + (float) Math.toRadians(xx), body8.rotateAngleY + (float) Math.toRadians(yy), body8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 5) / 5) * (-30.16025-(-12.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (5.62614-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-3.26049-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = -30.16025 + (((tickAnim - 10) / 18) * (7.51018-(-30.16025)));
            yy = 5.62614 + (((tickAnim - 10) / 18) * (-2.97431-(5.62614)));
            zz = -3.26049 + (((tickAnim - 10) / 18) * (-0.39193-(-3.26049)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 7.51018 + (((tickAnim - 28) / 12) * (0-(7.51018)));
            yy = -2.97431 + (((tickAnim - 28) / 12) * (0-(-2.97431)));
            zz = -0.39193 + (((tickAnim - 28) / 12) * (0-(-0.39193)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body9, body9.rotateAngleX + (float) Math.toRadians(xx), body9.rotateAngleY + (float) Math.toRadians(yy), body9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 5) / 5) * (-20.00631-(2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.40952-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.51313-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -20.00631 + (((tickAnim - 10) / 5) * (-23.41-(-20.00631)));
            yy = 1.40952 + (((tickAnim - 10) / 5) * (0-(1.40952)));
            zz = -0.51313 + (((tickAnim - 10) / 5) * (0-(-0.51313)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -23.41 + (((tickAnim - 15) / 13) * (7.51018-(-23.41)));
            yy = 0 + (((tickAnim - 15) / 13) * (-2.97431-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (-0.39193-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 7.51018 + (((tickAnim - 28) / 5) * (11.67-(7.51018)));
            yy = -2.97431 + (((tickAnim - 28) / 5) * (0-(-2.97431)));
            zz = -0.39193 + (((tickAnim - 28) / 5) * (0-(-0.39193)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 11.67 + (((tickAnim - 33) / 7) * (0-(11.67)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body10, body10.rotateAngleX + (float) Math.toRadians(xx), body10.rotateAngleY + (float) Math.toRadians(yy), body10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 5) / 5) * (-15.07887-(15)));
            yy = 0 + (((tickAnim - 5) / 5) * (5.79484-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-1.55823-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.07887 + (((tickAnim - 10) / 5) * (-23.41-(-15.07887)));
            yy = 5.79484 + (((tickAnim - 10) / 5) * (0-(5.79484)));
            zz = -1.55823 + (((tickAnim - 10) / 5) * (0-(-1.55823)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -23.41 + (((tickAnim - 15) / 13) * (7.50452-(-23.41)));
            yy = 0 + (((tickAnim - 15) / 13) * (-1.98288-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (-0.26116-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 7.50452 + (((tickAnim - 28) / 5) * (16.67-(7.50452)));
            yy = -1.98288 + (((tickAnim - 28) / 5) * (0-(-1.98288)));
            zz = -0.26116 + (((tickAnim - 28) / 5) * (0-(-0.26116)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 16.67 + (((tickAnim - 33) / 7) * (0-(16.67)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body11, body11.rotateAngleX + (float) Math.toRadians(xx), body11.rotateAngleY + (float) Math.toRadians(yy), body11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 5) / 5) * (-15.07887-(7.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (5.79484-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-1.55823-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.07887 + (((tickAnim - 10) / 5) * (-23.41-(-15.07887)));
            yy = 5.79484 + (((tickAnim - 10) / 5) * (0-(5.79484)));
            zz = -1.55823 + (((tickAnim - 10) / 5) * (0-(-1.55823)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -23.41 + (((tickAnim - 15) / 13) * (7.50452-(-23.41)));
            yy = 0 + (((tickAnim - 15) / 13) * (-1.98288-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (-0.26116-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 7.50452 + (((tickAnim - 28) / 5) * (16.67-(7.50452)));
            yy = -1.98288 + (((tickAnim - 28) / 5) * (0-(-1.98288)));
            zz = -0.26116 + (((tickAnim - 28) / 5) * (0-(-0.26116)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 16.67 + (((tickAnim - 33) / 7) * (0-(16.67)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body12, body12.rotateAngleX + (float) Math.toRadians(xx), body12.rotateAngleY + (float) Math.toRadians(yy), body12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 5) / 5) * (-15.10752-(10)));
            yy = 0 + (((tickAnim - 5) / 5) * (6.76035-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-1.82019-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.10752 + (((tickAnim - 10) / 5) * (-23.41-(-15.10752)));
            yy = 6.76035 + (((tickAnim - 10) / 5) * (0-(6.76035)));
            zz = -1.82019 + (((tickAnim - 10) / 5) * (0-(-1.82019)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -23.41 + (((tickAnim - 15) / 13) * (7.5181-(-23.41)));
            yy = 0 + (((tickAnim - 15) / 13) * (-3.96572-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (-0.52294-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 7.5181 + (((tickAnim - 28) / 5) * (16.67-(7.5181)));
            yy = -3.96572 + (((tickAnim - 28) / 5) * (0-(-3.96572)));
            zz = -0.52294 + (((tickAnim - 28) / 5) * (0-(-0.52294)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 16.67 + (((tickAnim - 33) / 7) * (0-(16.67)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body13, body13.rotateAngleX + (float) Math.toRadians(xx), body13.rotateAngleY + (float) Math.toRadians(yy), body13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 5) / 5) * (-15.01966-(25)));
            yy = 0 + (((tickAnim - 5) / 5) * (2.89769-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.77712-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.01966 + (((tickAnim - 10) / 5) * (-23.41-(-15.01966)));
            yy = 2.89769 + (((tickAnim - 10) / 5) * (0-(2.89769)));
            zz = -0.77712 + (((tickAnim - 10) / 5) * (0-(-0.77712)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -23.41 + (((tickAnim - 15) / 13) * (7.51018-(-23.41)));
            yy = 0 + (((tickAnim - 15) / 13) * (-2.97431-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (-0.39193-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 7.51018 + (((tickAnim - 28) / 5) * (16.67-(7.51018)));
            yy = -2.97431 + (((tickAnim - 28) / 5) * (0-(-2.97431)));
            zz = -0.39193 + (((tickAnim - 28) / 5) * (0-(-0.39193)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 16.67 + (((tickAnim - 33) / 7) * (0-(16.67)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(talson, talson.rotateAngleX + (float) Math.toRadians(xx), talson.rotateAngleY + (float) Math.toRadians(yy), talson.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 35 + (((tickAnim - 0) / 8) * (17.5-(35)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 8) / 3) * (60-(17.5)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 60 + (((tickAnim - 11) / 4) * (40-(60)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 40 + (((tickAnim - 15) / 3) * (89.17-(40)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 89.17 + (((tickAnim - 18) / 0) * (95-(89.17)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 95 + (((tickAnim - 18) / 4) * (-7.5-(95)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (-12.03828-(0)));
            yy = -7.5 + (((tickAnim - 22) / 6) * (-22.51824-(-7.5)));
            zz = 0 + (((tickAnim - 22) / 6) * (43.07256-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -12.03828 + (((tickAnim - 28) / 5) * (28.82426-(-12.03828)));
            yy = -22.51824 + (((tickAnim - 28) / 5) * (-17.5377-(-22.51824)));
            zz = 43.07256 + (((tickAnim - 28) / 5) * (16.56933-(43.07256)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 28.82426 + (((tickAnim - 33) / 7) * (0-(28.82426)));
            yy = -17.5377 + (((tickAnim - 33) / 7) * (35-(-17.5377)));
            zz = 16.56933 + (((tickAnim - 33) / 7) * (0-(16.56933)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs2, legRs2.rotateAngleX + (float) Math.toRadians(xx), legRs2.rotateAngleY + (float) Math.toRadians(yy), legRs2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 5 + (((tickAnim - 0) / 15) * (22.5-(5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 22.5 + (((tickAnim - 15) / 7) * (-12.5-(22.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = -12.5 + (((tickAnim - 22) / 11) * (-58.23-(-12.5)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -58.23 + (((tickAnim - 33) / 7) * (5-(-58.23)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss2, legRss2.rotateAngleX + (float) Math.toRadians(xx), legRss2.rotateAngleY + (float) Math.toRadians(yy), legRss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 10 + (((tickAnim - 0) / 18) * (-3.75-(10)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -3.75 + (((tickAnim - 18) / 2) * (10.63-(-3.75)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 10.63 + (((tickAnim - 20) / 2) * (-65-(10.63)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = -65 + (((tickAnim - 22) / 5) * (-73.96-(-65)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = -73.96 + (((tickAnim - 27) / 13) * (10-(-73.96)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRsss2, legRsss2.rotateAngleX + (float) Math.toRadians(xx), legRsss2.rotateAngleY + (float) Math.toRadians(yy), legRsss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -35 + (((tickAnim - 0) / 8) * (-27.5-(-35)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -27.5 + (((tickAnim - 8) / 10) * (-91.25-(-27.5)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = -91.25 + (((tickAnim - 18) / 0) * (-90-(-91.25)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -90 + (((tickAnim - 18) / 4) * (-7.5-(-90)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (57.23902-(0)));
            yy = -7.5 + (((tickAnim - 22) / 6) * (4.24589-(-7.5)));
            zz = 0 + (((tickAnim - 22) / 6) * (-15.0005-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 57.23902 + (((tickAnim - 28) / 5) * (22.72961-(57.23902)));
            yy = 4.24589 + (((tickAnim - 28) / 5) * (14.31379-(4.24589)));
            zz = -15.0005 + (((tickAnim - 28) / 5) * (-27.85808-(-15.0005)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 22.72961 + (((tickAnim - 33) / 7) * (0-(22.72961)));
            yy = 14.31379 + (((tickAnim - 33) / 7) * (-35-(14.31379)));
            zz = -27.85808 + (((tickAnim - 33) / 7) * (0-(-27.85808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs2, legLs2.rotateAngleX + (float) Math.toRadians(xx), legLs2.rotateAngleY + (float) Math.toRadians(yy), legLs2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 15) * (-22.5-(-5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -22.5 + (((tickAnim - 15) / 3) * (-16.25-(-22.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -16.25 + (((tickAnim - 18) / 4) * (30-(-16.25)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 30 + (((tickAnim - 22) / 11) * (41.25-(30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 41.25 + (((tickAnim - 33) / 7) * (-5-(41.25)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss2, legLss2.rotateAngleX + (float) Math.toRadians(xx), legLss2.rotateAngleY + (float) Math.toRadians(yy), legLss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -10 + (((tickAnim - 0) / 18) * (0-(-10)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-15-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -15 + (((tickAnim - 20) / 2) * (60-(-15)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 60 + (((tickAnim - 22) / 5) * (70-(60)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 70 + (((tickAnim - 27) / 13) * (-10-(70)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLsss2, legLsss2.rotateAngleX + (float) Math.toRadians(xx), legLsss2.rotateAngleY + (float) Math.toRadians(yy), legLsss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 0) / 18) * (9.09566-(22.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (20.61578-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-8.27339-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 9.09566 + (((tickAnim - 18) / 9) * (24.25045-(9.09566)));
            yy = 20.61578 + (((tickAnim - 18) / 9) * (-34.82924-(20.61578)));
            zz = -8.27339 + (((tickAnim - 18) / 9) * (-49.856-(-8.27339)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 24.25045 + (((tickAnim - 27) / 13) * (22.5-(24.25045)));
            yy = -34.82924 + (((tickAnim - 27) / 13) * (0-(-34.82924)));
            zz = -49.856 + (((tickAnim - 27) / 13) * (0-(-49.856)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -67.5 + (((tickAnim - 0) / 18) * (17.5-(-67.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 17.5 + (((tickAnim - 18) / 15) * (-34.84-(17.5)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -34.84 + (((tickAnim - 33) / 7) * (-67.5-(-34.84)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs3, legRs3.rotateAngleX + (float) Math.toRadians(xx), legRs3.rotateAngleY + (float) Math.toRadians(yy), legRs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (40.74-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            yy = 40.74 + (((tickAnim - 21) / 12) * (-45-(40.74)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -45 + (((tickAnim - 33) / 7) * (0-(-45)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss3, legRss3.rotateAngleX + (float) Math.toRadians(xx), legRss3.rotateAngleY + (float) Math.toRadians(yy), legRss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 0) / 18) * (9.09566-(22.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (-20.61578-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (8.27339-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 9.09566 + (((tickAnim - 18) / 9) * (24.25045-(9.09566)));
            yy = -20.61578 + (((tickAnim - 18) / 9) * (34.82924-(-20.61578)));
            zz = 8.27339 + (((tickAnim - 18) / 9) * (49.856-(8.27339)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 24.25045 + (((tickAnim - 27) / 13) * (22.5-(24.25045)));
            yy = 34.82924 + (((tickAnim - 27) / 13) * (0-(34.82924)));
            zz = 49.856 + (((tickAnim - 27) / 13) * (0-(49.856)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 67.5 + (((tickAnim - 0) / 18) * (-17.5-(67.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -17.5 + (((tickAnim - 18) / 15) * (34.84-(-17.5)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 34.84 + (((tickAnim - 33) / 7) * (67.5-(34.84)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs3, legLs3.rotateAngleX + (float) Math.toRadians(xx), legLs3.rotateAngleY + (float) Math.toRadians(yy), legLs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-40.74-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            yy = -40.74 + (((tickAnim - 21) / 12) * (45-(-40.74)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 45 + (((tickAnim - 33) / 7) * (0-(45)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss3, legLss3.rotateAngleX + (float) Math.toRadians(xx), legLss3.rotateAngleY + (float) Math.toRadians(yy), legLss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-31.3065-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-25.03615-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (21.24872-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.3065 + (((tickAnim - 16) / 3) * (-30.41016-(-31.3065)));
            yy = -25.03615 + (((tickAnim - 16) / 3) * (-41.30248-(-25.03615)));
            zz = 21.24872 + (((tickAnim - 16) / 3) * (32.95874-(21.24872)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -30.41016 + (((tickAnim - 19) / 8) * (15.21075-(-30.41016)));
            yy = -41.30248 + (((tickAnim - 19) / 8) * (16.51052-(-41.30248)));
            zz = 32.95874 + (((tickAnim - 19) / 8) * (15.60718-(32.95874)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 15.21075 + (((tickAnim - 27) / 4) * (8.16627-(15.21075)));
            yy = 16.51052 + (((tickAnim - 27) / 4) * (-24.4993-(16.51052)));
            zz = 15.60718 + (((tickAnim - 27) / 4) * (7.14722-(15.60718)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 8.16627 + (((tickAnim - 31) / 9) * (0-(8.16627)));
            yy = -24.4993 + (((tickAnim - 31) / 9) * (0-(-24.4993)));
            zz = 7.14722 + (((tickAnim - 31) / 9) * (0-(7.14722)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -22.5 + (((tickAnim - 16) / 11) * (22.5-(-22.5)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 22.5 + (((tickAnim - 27) / 4) * (64.21-(22.5)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 64.21 + (((tickAnim - 31) / 9) * (0-(64.21)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(xx), legRs5.rotateAngleY + (float) Math.toRadians(yy), legRs5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legRss5, legRss5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+150+100))*5), legRss5.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-50+100))*20), legRss5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-240+100))*50));


        this.setRotateAngle(legRsss5, legRsss5.rotateAngleX + (float) Math.toRadians(0), legRsss5.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-40+100))*25), legRsss5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-31.3065-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (25.03615-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-21.24872-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.3065 + (((tickAnim - 16) / 3) * (-30.41016-(-31.3065)));
            yy = 25.03615 + (((tickAnim - 16) / 3) * (41.30248-(25.03615)));
            zz = -21.24872 + (((tickAnim - 16) / 3) * (-32.95874-(-21.24872)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -30.41016 + (((tickAnim - 19) / 8) * (15.21075-(-30.41016)));
            yy = 41.30248 + (((tickAnim - 19) / 8) * (-16.51052-(41.30248)));
            zz = -32.95874 + (((tickAnim - 19) / 8) * (-15.60718-(-32.95874)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 15.21075 + (((tickAnim - 27) / 4) * (8.16627-(15.21075)));
            yy = -16.51052 + (((tickAnim - 27) / 4) * (24.4993-(-16.51052)));
            zz = -15.60718 + (((tickAnim - 27) / 4) * (-7.14722-(-15.60718)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 8.16627 + (((tickAnim - 31) / 9) * (0-(8.16627)));
            yy = 24.4993 + (((tickAnim - 31) / 9) * (0-(24.4993)));
            zz = -7.14722 + (((tickAnim - 31) / 9) * (0-(-7.14722)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legLss5, legLss5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+150+100))*5), legLss5.rotateAngleY + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-50+100))*20), legLss5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-240+100))*50));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 22.5 + (((tickAnim - 15) / 7) * (-22.5-(22.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = -22.5 + (((tickAnim - 22) / 5) * (-61.87-(-22.5)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = -61.87 + (((tickAnim - 27) / 13) * (0-(-61.87)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(xx), legR1.rotateAngleY + (float) Math.toRadians(yy), legR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 22.5 + (((tickAnim - 15) / 7) * (22.5-(22.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 22.5 + (((tickAnim - 22) / 18) * (0-(22.5)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs1, legRs1.rotateAngleX + (float) Math.toRadians(xx), legRs1.rotateAngleY + (float) Math.toRadians(yy), legRs1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-52.5-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            yy = -52.5 + (((tickAnim - 22) / 9) * (-45-(-52.5)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -45 + (((tickAnim - 31) / 9) * (0-(-45)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss1, legRss1.rotateAngleX + (float) Math.toRadians(xx), legRss1.rotateAngleY + (float) Math.toRadians(yy), legRss1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(-87.73421), legR4.rotateAngleY + (float) Math.toRadians(36.10029), legR4.rotateAngleZ + (float) Math.toRadians(-47.26579));


        this.setRotateAngle(legRs4, legRs4.rotateAngleX + (float) Math.toRadians(0), legRs4.rotateAngleY + (float) Math.toRadians(0), legRs4.rotateAngleZ + (float) Math.toRadians(-135));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -22.5 + (((tickAnim - 15) / 7) * (22.5-(-22.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 22.5 + (((tickAnim - 22) / 5) * (61.88-(22.5)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 61.88 + (((tickAnim - 27) / 13) * (0-(61.88)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(xx), legL1.rotateAngleY + (float) Math.toRadians(yy), legL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -22.5 + (((tickAnim - 15) / 7) * (-22.5-(-22.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = -22.5 + (((tickAnim - 22) / 18) * (0-(-22.5)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs1, legLs1.rotateAngleX + (float) Math.toRadians(xx), legLs1.rotateAngleY + (float) Math.toRadians(yy), legLs1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (52.5-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            yy = 52.5 + (((tickAnim - 22) / 9) * (45-(52.5)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 45 + (((tickAnim - 31) / 9) * (0-(45)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss1, legLss1.rotateAngleX + (float) Math.toRadians(xx), legLss1.rotateAngleY + (float) Math.toRadians(yy), legLss1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(-87.73421), legL4.rotateAngleY + (float) Math.toRadians(-36.10029), legL4.rotateAngleZ + (float) Math.toRadians(47.26579));


        this.setRotateAngle(legLs4, legLs4.rotateAngleX + (float) Math.toRadians(0), legLs4.rotateAngleY + (float) Math.toRadians(0), legLs4.rotateAngleZ + (float) Math.toRadians(135));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = 22.5 + (((tickAnim - 16) / 11) * (-22.5-(22.5)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = -22.5 + (((tickAnim - 27) / 4) * (-64.21-(-22.5)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -64.21 + (((tickAnim - 31) / 9) * (0-(-64.21)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(xx), legLs5.rotateAngleY + (float) Math.toRadians(yy), legLs5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legLsss5, legLsss5.rotateAngleX + (float) Math.toRadians(0), legLsss5.rotateAngleY + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-40+100))*25), legLsss5.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPentecopterus entity = (EntityPrehistoricFloraPentecopterus) entitylivingbaseIn;
        int animCycle = 80;

        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 9.99404 + (((tickAnim - 0) / 8) * (15.59826-(9.99404)));
            yy = 1.27563 + (((tickAnim - 0) / 8) * (2.94227-(1.27563)));
            zz = -2.23672 + (((tickAnim - 0) / 8) * (-2.39794-(-2.23672)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.59826 + (((tickAnim - 8) / 5) * (15.03548-(15.59826)));
            yy = 2.94227 + (((tickAnim - 8) / 5) * (1.0796-(2.94227)));
            zz = -2.39794 + (((tickAnim - 8) / 5) * (3.08461-(-2.39794)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 15.03548 + (((tickAnim - 13) / 5) * (12.60133-(15.03548)));
            yy = 1.0796 + (((tickAnim - 13) / 5) * (2.35412-(1.0796)));
            zz = 3.08461 + (((tickAnim - 13) / 5) * (0.48732-(3.08461)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 12.60133 + (((tickAnim - 18) / 9) * (11.84669-(12.60133)));
            yy = 2.35412 + (((tickAnim - 18) / 9) * (4.82518-(2.35412)));
            zz = 0.48732 + (((tickAnim - 18) / 9) * (-2.26111-(0.48732)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 11.84669 + (((tickAnim - 27) / 7) * (10.46242-(11.84669)));
            yy = 4.82518 + (((tickAnim - 27) / 7) * (0.78566-(4.82518)));
            zz = -2.26111 + (((tickAnim - 27) / 7) * (1.20876-(-2.26111)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 10.46242 + (((tickAnim - 34) / 9) * (12.37977-(10.46242)));
            yy = 0.78566 + (((tickAnim - 34) / 9) * (-1.92369-(0.78566)));
            zz = 1.20876 + (((tickAnim - 34) / 9) * (-2.87267-(1.20876)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 12.37977 + (((tickAnim - 43) / 7) * (16.37182-(12.37977)));
            yy = -1.92369 + (((tickAnim - 43) / 7) * (-4.60466-(-1.92369)));
            zz = -2.87267 + (((tickAnim - 43) / 7) * (1.07811-(-2.87267)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 16.37182 + (((tickAnim - 50) / 5) * (14.85226-(16.37182)));
            yy = -4.60466 + (((tickAnim - 50) / 5) * (-4.8282-(-4.60466)));
            zz = 1.07811 + (((tickAnim - 50) / 5) * (-0.5624-(1.07811)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = 14.85226 + (((tickAnim - 55) / 7) * (12.46267-(14.85226)));
            yy = -4.8282 + (((tickAnim - 55) / 7) * (-0.97302-(-4.8282)));
            zz = -0.5624 + (((tickAnim - 55) / 7) * (4.39375-(-0.5624)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 12.46267 + (((tickAnim - 62) / 6) * (13.99915-(12.46267)));
            yy = -0.97302 + (((tickAnim - 62) / 6) * (0.5288-(-0.97302)));
            zz = 4.39375 + (((tickAnim - 62) / 6) * (-0.86795-(4.39375)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 13.99915 + (((tickAnim - 68) / 5) * (12.64267-(13.99915)));
            yy = 0.5288 + (((tickAnim - 68) / 5) * (0.11952-(0.5288)));
            zz = -0.86795 + (((tickAnim - 68) / 5) * (0.60696-(-0.86795)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 12.64267 + (((tickAnim - 73) / 7) * (9.99404-(12.64267)));
            yy = 0.11952 + (((tickAnim - 73) / 7) * (1.27563-(0.11952)));
            zz = 0.60696 + (((tickAnim - 73) / 7) * (-2.23672-(0.60696)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.3-(0)));
            yy = 4 + (((tickAnim - 0) / 18) * (4.7-(4)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = -0.3 + (((tickAnim - 18) / 25) * (0.4-(-0.3)));
            yy = 4.7 + (((tickAnim - 18) / 25) * (4.2-(4.7)));
            zz = 0 + (((tickAnim - 18) / 25) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 62) {
            xx = 0.4 + (((tickAnim - 43) / 19) * (-0.5-(0.4)));
            yy = 4.2 + (((tickAnim - 43) / 19) * (4.4-(4.2)));
            zz = 0 + (((tickAnim - 43) / 19) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = -0.5 + (((tickAnim - 62) / 18) * (0-(-0.5)));
            yy = 4.4 + (((tickAnim - 62) / 18) * (4-(4.4)));
            zz = 0 + (((tickAnim - 62) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110))*0.5 + (((tickAnim - 0) / 43) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110))-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110)) + (((tickAnim - 43) / 37) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110))*0.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30))*0.5 + (((tickAnim - 0) / 43) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30))-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30)) + (((tickAnim - 43) / 37) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30))*0.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*2))*0.5 + (((tickAnim - 0) / 43) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*2))-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*2))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*2))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*2))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*2))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*2)) + (((tickAnim - 43) / 37) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*2))*0.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*2)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*2)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*2))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*2)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*3))*0.5 + (((tickAnim - 0) / 43) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*3))-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*3))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*3))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*3))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*3))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*3)) + (((tickAnim - 43) / 37) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*3))*0.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*3)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*3)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*3))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*3)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(xx), body5.rotateAngleY + (float) Math.toRadians(yy), body5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4))*0.5 + (((tickAnim - 0) / 43) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4))-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*4))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*4))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*4))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4)) + (((tickAnim - 43) / 37) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4))*0.5-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*4)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*4))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*4)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(xx), body6.rotateAngleY + (float) Math.toRadians(yy), body6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4))*0.5 + (((tickAnim - 0) / 43) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4))-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*5))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*5))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*5))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4)) + (((tickAnim - 43) / 37) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4))*0.5-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*4)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*5)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*5)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body7, body7.rotateAngleX + (float) Math.toRadians(xx), body7.rotateAngleY + (float) Math.toRadians(yy), body7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*5))*0.5 + (((tickAnim - 0) / 43) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*5))-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*5))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*6))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*6))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*6))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*5)) + (((tickAnim - 43) / 37) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*5))*0.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*5)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*6)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*6))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*6)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body8, body8.rotateAngleX + (float) Math.toRadians(xx), body8.rotateAngleY + (float) Math.toRadians(yy), body8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))*0.5 + (((tickAnim - 0) / 43) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*7))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*7))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*7))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6)) + (((tickAnim - 43) / 37) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))*0.5-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*7)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*7))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*7)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body9, body9.rotateAngleX + (float) Math.toRadians(xx), body9.rotateAngleY + (float) Math.toRadians(yy), body9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))*0.5 + (((tickAnim - 0) / 43) * (4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))-(4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*8))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*8))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*8))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6)) + (((tickAnim - 43) / 37) * (4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))*0.5-(4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*8)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*8))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*8)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body10, body10.rotateAngleX + (float) Math.toRadians(xx), body10.rotateAngleY + (float) Math.toRadians(yy), body10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5 + (((tickAnim - 0) / 43) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6))-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*9))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*9))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*9))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6)) + (((tickAnim - 43) / 37) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*6)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*9)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*9))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*9)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body11, body11.rotateAngleX + (float) Math.toRadians(xx), body11.rotateAngleY + (float) Math.toRadians(yy), body11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5 + (((tickAnim - 0) / 43) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*10))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*10))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*10))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7)) + (((tickAnim - 43) / 37) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*10)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*10))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*10)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body12, body12.rotateAngleX + (float) Math.toRadians(xx), body12.rotateAngleY + (float) Math.toRadians(yy), body12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5 + (((tickAnim - 0) / 43) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*11))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*11))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*11))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7)) + (((tickAnim - 43) / 37) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*11)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*11))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*11)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body13, body13.rotateAngleX + (float) Math.toRadians(xx), body13.rotateAngleY + (float) Math.toRadians(yy), body13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5 + (((tickAnim - 0) / 43) * (8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))-(8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*12))*0.5 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*12))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*12))*0.5)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7)) + (((tickAnim - 43) / 37) * (8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7))*0.5-(8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-110-30*7)))));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*12)) + (((tickAnim - 43) / 37) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*12))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-40-30*12)))));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(talson, talson.rotateAngleX + (float) Math.toRadians(xx), talson.rotateAngleY + (float) Math.toRadians(yy), talson.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 6.27697 + (((tickAnim - 0) / 10) * (32.79839-(6.27697)));
            yy = -25.71463 + (((tickAnim - 0) / 10) * (5.77043-(-25.71463)));
            zz = 5.32437 + (((tickAnim - 0) / 10) * (17.42021-(5.32437)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.79839 + (((tickAnim - 10) / 10) * (6.27697-(32.79839)));
            yy = 5.77043 + (((tickAnim - 10) / 10) * (-25.71463-(5.77043)));
            zz = 17.42021 + (((tickAnim - 10) / 10) * (5.32437-(17.42021)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.27697 + (((tickAnim - 20) / 10) * (32.79839-(6.27697)));
            yy = -25.71463 + (((tickAnim - 20) / 10) * (5.77043-(-25.71463)));
            zz = 5.32437 + (((tickAnim - 20) / 10) * (17.42021-(5.32437)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 32.79839 + (((tickAnim - 30) / 10) * (6.27697-(32.79839)));
            yy = 5.77043 + (((tickAnim - 30) / 10) * (-25.71463-(5.77043)));
            zz = 17.42021 + (((tickAnim - 30) / 10) * (5.32437-(17.42021)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.27697 + (((tickAnim - 40) / 10) * (32.79839-(6.27697)));
            yy = -25.71463 + (((tickAnim - 40) / 10) * (5.77043-(-25.71463)));
            zz = 5.32437 + (((tickAnim - 40) / 10) * (17.42021-(5.32437)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 32.79839 + (((tickAnim - 50) / 10) * (6.27697-(32.79839)));
            yy = 5.77043 + (((tickAnim - 50) / 10) * (-25.71463-(5.77043)));
            zz = 17.42021 + (((tickAnim - 50) / 10) * (5.32437-(17.42021)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 6.27697 + (((tickAnim - 60) / 10) * (32.79839-(6.27697)));
            yy = -25.71463 + (((tickAnim - 60) / 10) * (5.77043-(-25.71463)));
            zz = 5.32437 + (((tickAnim - 60) / 10) * (17.42021-(5.32437)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 32.79839 + (((tickAnim - 70) / 10) * (6.27697-(32.79839)));
            yy = 5.77043 + (((tickAnim - 70) / 10) * (-25.71463-(5.77043)));
            zz = 17.42021 + (((tickAnim - 70) / 10) * (5.32437-(17.42021)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.74 + (((tickAnim - 0) / 3) * (0.82753-(-11.74)));
            yy = 2.63 + (((tickAnim - 0) / 3) * (7.35152-(2.63)));
            zz = 12.77 + (((tickAnim - 0) / 3) * (11.59088-(12.77)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0.82753 + (((tickAnim - 3) / 6) * (-20.5431-(0.82753)));
            yy = 7.35152 + (((tickAnim - 3) / 6) * (-5.58586-(7.35152)));
            zz = 11.59088 + (((tickAnim - 3) / 6) * (15.5364-(11.59088)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -20.5431 + (((tickAnim - 9) / 4) * (-36.87412-(-20.5431)));
            yy = -5.58586 + (((tickAnim - 9) / 4) * (-6.81616-(-5.58586)));
            zz = 15.5364 + (((tickAnim - 9) / 4) * (15.12345-(15.5364)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -36.87412 + (((tickAnim - 13) / 7) * (-11.74-(-36.87412)));
            yy = -6.81616 + (((tickAnim - 13) / 7) * (2.63-(-6.81616)));
            zz = 15.12345 + (((tickAnim - 13) / 7) * (12.77-(15.12345)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -11.74 + (((tickAnim - 20) / 3) * (0.82753-(-11.74)));
            yy = 2.63 + (((tickAnim - 20) / 3) * (7.35152-(2.63)));
            zz = 12.77 + (((tickAnim - 20) / 3) * (11.59088-(12.77)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0.82753 + (((tickAnim - 23) / 6) * (-20.5431-(0.82753)));
            yy = 7.35152 + (((tickAnim - 23) / 6) * (-5.58586-(7.35152)));
            zz = 11.59088 + (((tickAnim - 23) / 6) * (15.5364-(11.59088)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -20.5431 + (((tickAnim - 29) / 4) * (-36.87412-(-20.5431)));
            yy = -5.58586 + (((tickAnim - 29) / 4) * (-6.81616-(-5.58586)));
            zz = 15.5364 + (((tickAnim - 29) / 4) * (15.12345-(15.5364)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -36.87412 + (((tickAnim - 33) / 7) * (-11.74-(-36.87412)));
            yy = -6.81616 + (((tickAnim - 33) / 7) * (2.63-(-6.81616)));
            zz = 15.12345 + (((tickAnim - 33) / 7) * (12.77-(15.12345)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -11.74 + (((tickAnim - 40) / 3) * (0.82753-(-11.74)));
            yy = 2.63 + (((tickAnim - 40) / 3) * (7.35152-(2.63)));
            zz = 12.77 + (((tickAnim - 40) / 3) * (11.59088-(12.77)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0.82753 + (((tickAnim - 43) / 6) * (-20.5431-(0.82753)));
            yy = 7.35152 + (((tickAnim - 43) / 6) * (-5.58586-(7.35152)));
            zz = 11.59088 + (((tickAnim - 43) / 6) * (15.5364-(11.59088)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -20.5431 + (((tickAnim - 49) / 4) * (-36.87412-(-20.5431)));
            yy = -5.58586 + (((tickAnim - 49) / 4) * (-6.81616-(-5.58586)));
            zz = 15.5364 + (((tickAnim - 49) / 4) * (15.12345-(15.5364)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -36.87412 + (((tickAnim - 53) / 7) * (-11.74-(-36.87412)));
            yy = -6.81616 + (((tickAnim - 53) / 7) * (2.63-(-6.81616)));
            zz = 15.12345 + (((tickAnim - 53) / 7) * (12.77-(15.12345)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -11.74 + (((tickAnim - 60) / 3) * (0.82753-(-11.74)));
            yy = 2.63 + (((tickAnim - 60) / 3) * (7.35152-(2.63)));
            zz = 12.77 + (((tickAnim - 60) / 3) * (11.59088-(12.77)));
        }
        else if (tickAnim >= 63 && tickAnim < 69) {
            xx = 0.82753 + (((tickAnim - 63) / 6) * (-20.5431-(0.82753)));
            yy = 7.35152 + (((tickAnim - 63) / 6) * (-5.58586-(7.35152)));
            zz = 11.59088 + (((tickAnim - 63) / 6) * (15.5364-(11.59088)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = -20.5431 + (((tickAnim - 69) / 4) * (-36.87412-(-20.5431)));
            yy = -5.58586 + (((tickAnim - 69) / 4) * (-6.81616-(-5.58586)));
            zz = 15.5364 + (((tickAnim - 69) / 4) * (15.12345-(15.5364)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -36.87412 + (((tickAnim - 73) / 7) * (-11.74-(-36.87412)));
            yy = -6.81616 + (((tickAnim - 73) / 7) * (2.63-(-6.81616)));
            zz = 15.12345 + (((tickAnim - 73) / 7) * (12.77-(15.12345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(0), legR1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*2.5), legR1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legRs1, legRs1.rotateAngleX + (float) Math.toRadians(0), legRs1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-90))*5), legRs1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legRss1, legRss1.rotateAngleX + (float) Math.toRadians(0), legRss1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))*10), legRss1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legRs2, legRs2.rotateAngleX + (float) Math.toRadians(-10), legRs2.rotateAngleY + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*2.5), legRs2.rotateAngleZ + (float) Math.toRadians(30));


        this.setRotateAngle(legRss2, legRss2.rotateAngleX + (float) Math.toRadians(0), legRss2.rotateAngleY + (float) Math.toRadians(-40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+85))), legRss2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legRsss2, legRsss2.rotateAngleX + (float) Math.toRadians(0), legRsss2.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+55))*0.5), legRsss2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 12.5 + (((tickAnim - 10) / 5) * (22.5-(12.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 22.5 + (((tickAnim - 15) / 5) * (0-(22.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (22.5-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 22.5 + (((tickAnim - 35) / 5) * (0-(22.5)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (12.5-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 12.5 + (((tickAnim - 50) / 5) * (22.5-(12.5)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 22.5 + (((tickAnim - 55) / 5) * (0-(22.5)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 5) * (22.5-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 22.5 + (((tickAnim - 75) / 5) * (0-(22.5)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs3, legRs3.rotateAngleX + (float) Math.toRadians(xx), legRs3.rotateAngleY + (float) Math.toRadians(yy), legRs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-30-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 10) / 5) * (-10-(-30)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 15) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-30-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 30) / 5) * (-10-(-30)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (-30-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 50) / 5) * (-10-(-30)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 55) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (-30-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 70) / 5) * (-10-(-30)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 75) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss3, legRss3.rotateAngleX + (float) Math.toRadians(xx), legRss3.rotateAngleY + (float) Math.toRadians(yy), legRss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 3) * (-45-(-45)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -45 + (((tickAnim - 3) / 5) * (-22.5-(-45)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -22.5 + (((tickAnim - 8) / 5) * (-45-(-22.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 13) / 10) * (-45-(-45)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = -45 + (((tickAnim - 23) / 5) * (-22.5-(-45)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = -22.5 + (((tickAnim - 28) / 5) * (-45-(-22.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 33) / 10) * (-45-(-45)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = -45 + (((tickAnim - 43) / 5) * (-22.5-(-45)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = -22.5 + (((tickAnim - 48) / 5) * (-45-(-22.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 53) / 10) * (-45-(-45)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            zz = -45 + (((tickAnim - 63) / 5) * (-22.5-(-45)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = -22.5 + (((tickAnim - 68) / 5) * (-45-(-22.5)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = -45 + (((tickAnim - 73) / 7) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs4, legRs4.rotateAngleX + (float) Math.toRadians(xx), legRs4.rotateAngleY + (float) Math.toRadians(yy), legRs4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -72.01 + (((tickAnim - 0) / 2) * (-73.48432-(-72.01)));
            yy = -3.5 + (((tickAnim - 0) / 2) * (-2.55672-(-3.5)));
            zz = 21.03 + (((tickAnim - 0) / 2) * (20.27807-(21.03)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = -73.48432 + (((tickAnim - 2) / 10) * (-61.01346-(-73.48432)));
            yy = -2.55672 + (((tickAnim - 2) / 10) * (5.32426-(-2.55672)));
            zz = 20.27807 + (((tickAnim - 2) / 10) * (-5.01355-(20.27807)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -61.01346 + (((tickAnim - 12) / 5) * (-69.05901-(-61.01346)));
            yy = 5.32426 + (((tickAnim - 12) / 5) * (-5.38095-(5.32426)));
            zz = -5.01355 + (((tickAnim - 12) / 5) * (22.52641-(-5.01355)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -69.05901 + (((tickAnim - 17) / 5) * (-73.48432-(-69.05901)));
            yy = -5.38095 + (((tickAnim - 17) / 5) * (-2.55672-(-5.38095)));
            zz = 22.52641 + (((tickAnim - 17) / 5) * (20.27807-(22.52641)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = -73.48432 + (((tickAnim - 22) / 10) * (-61.01346-(-73.48432)));
            yy = -2.55672 + (((tickAnim - 22) / 10) * (5.32426-(-2.55672)));
            zz = 20.27807 + (((tickAnim - 22) / 10) * (-5.01355-(20.27807)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -61.01346 + (((tickAnim - 32) / 5) * (-69.05901-(-61.01346)));
            yy = 5.32426 + (((tickAnim - 32) / 5) * (-5.38095-(5.32426)));
            zz = -5.01355 + (((tickAnim - 32) / 5) * (22.52641-(-5.01355)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -69.05901 + (((tickAnim - 37) / 5) * (-73.48432-(-69.05901)));
            yy = -5.38095 + (((tickAnim - 37) / 5) * (-2.55672-(-5.38095)));
            zz = 22.52641 + (((tickAnim - 37) / 5) * (20.27807-(22.52641)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = -73.48432 + (((tickAnim - 42) / 10) * (-61.01346-(-73.48432)));
            yy = -2.55672 + (((tickAnim - 42) / 10) * (5.32426-(-2.55672)));
            zz = 20.27807 + (((tickAnim - 42) / 10) * (-5.01355-(20.27807)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = -61.01346 + (((tickAnim - 52) / 5) * (-69.05901-(-61.01346)));
            yy = 5.32426 + (((tickAnim - 52) / 5) * (-5.38095-(5.32426)));
            zz = -5.01355 + (((tickAnim - 52) / 5) * (22.52641-(-5.01355)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = -69.05901 + (((tickAnim - 57) / 5) * (-73.48432-(-69.05901)));
            yy = -5.38095 + (((tickAnim - 57) / 5) * (-2.55672-(-5.38095)));
            zz = 22.52641 + (((tickAnim - 57) / 5) * (20.27807-(22.52641)));
        }
        else if (tickAnim >= 62 && tickAnim < 72) {
            xx = -73.48432 + (((tickAnim - 62) / 10) * (-61.01346-(-73.48432)));
            yy = -2.55672 + (((tickAnim - 62) / 10) * (5.32426-(-2.55672)));
            zz = 20.27807 + (((tickAnim - 62) / 10) * (-5.01355-(20.27807)));
        }
        else if (tickAnim >= 72 && tickAnim < 77) {
            xx = -61.01346 + (((tickAnim - 72) / 5) * (-69.05901-(-61.01346)));
            yy = 5.32426 + (((tickAnim - 72) / 5) * (-5.38095-(5.32426)));
            zz = -5.01355 + (((tickAnim - 72) / 5) * (22.52641-(-5.01355)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = -69.05901 + (((tickAnim - 77) / 3) * (-72.01-(-69.05901)));
            yy = -5.38095 + (((tickAnim - 77) / 3) * (-3.5-(-5.38095)));
            zz = 22.52641 + (((tickAnim - 77) / 3) * (21.03-(22.52641)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 65 + (((tickAnim - 0) / 2) * (75-(65)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 2) / 10) * (0-(0)));
            yy = 75 + (((tickAnim - 2) / 10) * (-6-(75)));
            zz = 0 + (((tickAnim - 2) / 10) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -6 + (((tickAnim - 12) / 5) * (45-(-6)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 17) / 5) * (75-(45)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            yy = 75 + (((tickAnim - 22) / 10) * (-6-(75)));
            zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = -6 + (((tickAnim - 32) / 5) * (45-(-6)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 37) / 5) * (75-(45)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            yy = 75 + (((tickAnim - 42) / 10) * (-6-(75)));
            zz = 0 + (((tickAnim - 42) / 10) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 52) / 5) * (0-(0)));
            yy = -6 + (((tickAnim - 52) / 5) * (45-(-6)));
            zz = 0 + (((tickAnim - 52) / 5) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 57) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 57) / 5) * (75-(45)));
            zz = 0 + (((tickAnim - 57) / 5) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 62) / 10) * (0-(0)));
            yy = 75 + (((tickAnim - 62) / 10) * (-6-(75)));
            zz = 0 + (((tickAnim - 62) / 10) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 72) / 5) * (0-(0)));
            yy = -6 + (((tickAnim - 72) / 5) * (45-(-6)));
            zz = 0 + (((tickAnim - 72) / 5) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 45 + (((tickAnim - 77) / 3) * (65-(45)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(xx), legRs5.rotateAngleY + (float) Math.toRadians(yy), legRs5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -66.67 + (((tickAnim - 0) / 2) * (-77.5-(-66.67)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 2) / 10) * (0-(0)));
            yy = -77.5 + (((tickAnim - 2) / 10) * (0-(-77.5)));
            zz = 0 + (((tickAnim - 2) / 10) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (-45-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 17) / 5) * (-77.5-(-45)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            yy = -77.5 + (((tickAnim - 22) / 10) * (0-(-77.5)));
            zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (-45-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 37) / 5) * (-77.5-(-45)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            yy = -77.5 + (((tickAnim - 42) / 10) * (0-(-77.5)));
            zz = 0 + (((tickAnim - 42) / 10) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 52) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 5) * (-45-(0)));
            zz = 0 + (((tickAnim - 52) / 5) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 57) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 57) / 5) * (-77.5-(-45)));
            zz = 0 + (((tickAnim - 57) / 5) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 62) / 10) * (0-(0)));
            yy = -77.5 + (((tickAnim - 62) / 10) * (0-(-77.5)));
            zz = 0 + (((tickAnim - 62) / 10) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 72) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 5) * (-45-(0)));
            zz = 0 + (((tickAnim - 72) / 5) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = -45 + (((tickAnim - 77) / 3) * (-66.67-(-45)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss5, legRss5.rotateAngleX + (float) Math.toRadians(xx), legRss5.rotateAngleY + (float) Math.toRadians(yy), legRss5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -3.33 + (((tickAnim - 0) / 2) * (0-(-3.33)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 5) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 7) / 5) * (2.5-(-7.5)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 2.5 + (((tickAnim - 12) / 5) * (-10-(2.5)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 17) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 27) / 5) * (2.5-(-7.5)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 2.5 + (((tickAnim - 32) / 5) * (-10-(2.5)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 37) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 5) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 47) / 5) * (2.5-(-7.5)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 52) / 5) * (0-(0)));
            yy = 2.5 + (((tickAnim - 52) / 5) * (-10-(2.5)));
            zz = 0 + (((tickAnim - 52) / 5) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 57) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 57) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 57) / 5) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 62) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 5) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 62) / 5) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 67) / 5) * (2.5-(-7.5)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 72) / 5) * (0-(0)));
            yy = 2.5 + (((tickAnim - 72) / 5) * (-10-(2.5)));
            zz = 0 + (((tickAnim - 72) / 5) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = -10 + (((tickAnim - 77) / 3) * (-3.33-(-10)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRsss5, legRsss5.rotateAngleX + (float) Math.toRadians(xx), legRsss5.rotateAngleY + (float) Math.toRadians(yy), legRsss5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(0), legL1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2.5), legL1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legLs1, legLs1.rotateAngleX + (float) Math.toRadians(0), legLs1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*5), legLs1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legLss1, legLss1.rotateAngleX + (float) Math.toRadians(0), legLss1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-30))*10), legLss1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legLs2, legLs2.rotateAngleX + (float) Math.toRadians(-10), legLs2.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-85))*2.5), legLs2.rotateAngleZ + (float) Math.toRadians(-30));


        this.setRotateAngle(legLss2, legLss2.rotateAngleX + (float) Math.toRadians(0), legLss2.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+85))), legLss2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legLsss2, legLsss2.rotateAngleX + (float) Math.toRadians(0), legLsss2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+55))*0.5), legLsss2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 32.79839 + (((tickAnim - 0) / 10) * (6.27697-(32.79839)));
            yy = -5.77043 + (((tickAnim - 0) / 10) * (25.71463-(-5.77043)));
            zz = -17.42021 + (((tickAnim - 0) / 10) * (-5.32437-(-17.42021)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.27697 + (((tickAnim - 10) / 10) * (32.79839-(6.27697)));
            yy = 25.71463 + (((tickAnim - 10) / 10) * (-5.77043-(25.71463)));
            zz = -5.32437 + (((tickAnim - 10) / 10) * (-17.42021-(-5.32437)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 32.79839 + (((tickAnim - 20) / 10) * (6.27697-(32.79839)));
            yy = -5.77043 + (((tickAnim - 20) / 10) * (25.71463-(-5.77043)));
            zz = -17.42021 + (((tickAnim - 20) / 10) * (-5.32437-(-17.42021)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 6.27697 + (((tickAnim - 30) / 10) * (32.79839-(6.27697)));
            yy = 25.71463 + (((tickAnim - 30) / 10) * (-5.77043-(25.71463)));
            zz = -5.32437 + (((tickAnim - 30) / 10) * (-17.42021-(-5.32437)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32.79839 + (((tickAnim - 40) / 10) * (6.27697-(32.79839)));
            yy = -5.77043 + (((tickAnim - 40) / 10) * (25.71463-(-5.77043)));
            zz = -17.42021 + (((tickAnim - 40) / 10) * (-5.32437-(-17.42021)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.27697 + (((tickAnim - 50) / 10) * (32.79839-(6.27697)));
            yy = 25.71463 + (((tickAnim - 50) / 10) * (-5.77043-(25.71463)));
            zz = -5.32437 + (((tickAnim - 50) / 10) * (-17.42021-(-5.32437)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 32.79839 + (((tickAnim - 60) / 10) * (6.27697-(32.79839)));
            yy = -5.77043 + (((tickAnim - 60) / 10) * (25.71463-(-5.77043)));
            zz = -17.42021 + (((tickAnim - 60) / 10) * (-5.32437-(-17.42021)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 6.27697 + (((tickAnim - 70) / 10) * (32.79839-(6.27697)));
            yy = 25.71463 + (((tickAnim - 70) / 10) * (-5.77043-(25.71463)));
            zz = -5.32437 + (((tickAnim - 70) / 10) * (-17.42021-(-5.32437)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -12.5 + (((tickAnim - 0) / 5) * (-22.5-(-12.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -22.5 + (((tickAnim - 5) / 5) * (0-(-22.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -12.5 + (((tickAnim - 20) / 5) * (-22.5-(-12.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -22.5 + (((tickAnim - 25) / 5) * (0-(-22.5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -12.5 + (((tickAnim - 40) / 5) * (-22.5-(-12.5)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -22.5 + (((tickAnim - 45) / 5) * (0-(-22.5)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = -12.5 + (((tickAnim - 60) / 5) * (-22.5-(-12.5)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = -22.5 + (((tickAnim - 65) / 5) * (0-(-22.5)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs3, legLs3.rotateAngleX + (float) Math.toRadians(xx), legLs3.rotateAngleY + (float) Math.toRadians(yy), legLs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 30 + (((tickAnim - 0) / 5) * (10-(30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 5) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (30-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 30 + (((tickAnim - 20) / 5) * (10-(30)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 25) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (30-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 30 + (((tickAnim - 40) / 5) * (10-(30)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 45) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (30-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 30 + (((tickAnim - 60) / 5) * (10-(30)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 65) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (30-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss3, legLss3.rotateAngleX + (float) Math.toRadians(xx), legLss3.rotateAngleY + (float) Math.toRadians(yy), legLss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -23.81 + (((tickAnim - 0) / 3) * (-36.87412-(-23.81)));
            yy = 5.83 + (((tickAnim - 0) / 3) * (6.81616-(5.83)));
            zz = -15.45 + (((tickAnim - 0) / 3) * (-15.12345-(-15.45)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -36.87412 + (((tickAnim - 3) / 7) * (-11.74-(-36.87412)));
            yy = 6.81616 + (((tickAnim - 3) / 7) * (-2.63-(6.81616)));
            zz = -15.12345 + (((tickAnim - 3) / 7) * (-12.77-(-15.12345)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11.74 + (((tickAnim - 10) / 3) * (0.82753-(-11.74)));
            yy = -2.63 + (((tickAnim - 10) / 3) * (-7.35152-(-2.63)));
            zz = -12.77 + (((tickAnim - 10) / 3) * (-11.59088-(-12.77)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0.82753 + (((tickAnim - 13) / 6) * (-20.5431-(0.82753)));
            yy = -7.35152 + (((tickAnim - 13) / 6) * (5.58586-(-7.35152)));
            zz = -11.59088 + (((tickAnim - 13) / 6) * (-15.5364-(-11.59088)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -20.5431 + (((tickAnim - 19) / 1) * (-23.81-(-20.5431)));
            yy = 5.58586 + (((tickAnim - 19) / 1) * (5.83-(5.58586)));
            zz = -15.5364 + (((tickAnim - 19) / 1) * (-15.45-(-15.5364)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -23.81 + (((tickAnim - 20) / 3) * (-36.87412-(-23.81)));
            yy = 5.83 + (((tickAnim - 20) / 3) * (6.81616-(5.83)));
            zz = -15.45 + (((tickAnim - 20) / 3) * (-15.12345-(-15.45)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -36.87412 + (((tickAnim - 23) / 7) * (-11.74-(-36.87412)));
            yy = 6.81616 + (((tickAnim - 23) / 7) * (-2.63-(6.81616)));
            zz = -15.12345 + (((tickAnim - 23) / 7) * (-12.77-(-15.12345)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -11.74 + (((tickAnim - 30) / 3) * (0.82753-(-11.74)));
            yy = -2.63 + (((tickAnim - 30) / 3) * (-7.35152-(-2.63)));
            zz = -12.77 + (((tickAnim - 30) / 3) * (-11.59088-(-12.77)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0.82753 + (((tickAnim - 33) / 6) * (-20.5431-(0.82753)));
            yy = -7.35152 + (((tickAnim - 33) / 6) * (5.58586-(-7.35152)));
            zz = -11.59088 + (((tickAnim - 33) / 6) * (-15.5364-(-11.59088)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -20.5431 + (((tickAnim - 39) / 1) * (-23.81-(-20.5431)));
            yy = 5.58586 + (((tickAnim - 39) / 1) * (5.83-(5.58586)));
            zz = -15.5364 + (((tickAnim - 39) / 1) * (-15.45-(-15.5364)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -23.81 + (((tickAnim - 40) / 3) * (-36.87412-(-23.81)));
            yy = 5.83 + (((tickAnim - 40) / 3) * (6.81616-(5.83)));
            zz = -15.45 + (((tickAnim - 40) / 3) * (-15.12345-(-15.45)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -36.87412 + (((tickAnim - 43) / 7) * (-11.74-(-36.87412)));
            yy = 6.81616 + (((tickAnim - 43) / 7) * (-2.63-(6.81616)));
            zz = -15.12345 + (((tickAnim - 43) / 7) * (-12.77-(-15.12345)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -11.74 + (((tickAnim - 50) / 3) * (0.82753-(-11.74)));
            yy = -2.63 + (((tickAnim - 50) / 3) * (-7.35152-(-2.63)));
            zz = -12.77 + (((tickAnim - 50) / 3) * (-11.59088-(-12.77)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 0.82753 + (((tickAnim - 53) / 6) * (-20.5431-(0.82753)));
            yy = -7.35152 + (((tickAnim - 53) / 6) * (5.58586-(-7.35152)));
            zz = -11.59088 + (((tickAnim - 53) / 6) * (-15.5364-(-11.59088)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = -20.5431 + (((tickAnim - 59) / 1) * (-23.81-(-20.5431)));
            yy = 5.58586 + (((tickAnim - 59) / 1) * (5.83-(5.58586)));
            zz = -15.5364 + (((tickAnim - 59) / 1) * (-15.45-(-15.5364)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -23.81 + (((tickAnim - 60) / 3) * (-36.87412-(-23.81)));
            yy = 5.83 + (((tickAnim - 60) / 3) * (6.81616-(5.83)));
            zz = -15.45 + (((tickAnim - 60) / 3) * (-15.12345-(-15.45)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -36.87412 + (((tickAnim - 63) / 7) * (-11.74-(-36.87412)));
            yy = 6.81616 + (((tickAnim - 63) / 7) * (-2.63-(6.81616)));
            zz = -15.12345 + (((tickAnim - 63) / 7) * (-12.77-(-15.12345)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = -11.74 + (((tickAnim - 70) / 3) * (0.82753-(-11.74)));
            yy = -2.63 + (((tickAnim - 70) / 3) * (-7.35152-(-2.63)));
            zz = -12.77 + (((tickAnim - 70) / 3) * (-11.59088-(-12.77)));
        }
        else if (tickAnim >= 73 && tickAnim < 79) {
            xx = 0.82753 + (((tickAnim - 73) / 6) * (-20.5431-(0.82753)));
            yy = -7.35152 + (((tickAnim - 73) / 6) * (5.58586-(-7.35152)));
            zz = -11.59088 + (((tickAnim - 73) / 6) * (-15.5364-(-11.59088)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = -20.5431 + (((tickAnim - 79) / 1) * (-23.81-(-20.5431)));
            yy = 5.58586 + (((tickAnim - 79) / 1) * (5.83-(5.58586)));
            zz = -15.5364 + (((tickAnim - 79) / 1) * (-15.45-(-15.5364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 30 + (((tickAnim - 0) / 3) * (45-(30)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 3) / 10) * (45-(45)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 13) / 5) * (22.5-(45)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 22.5 + (((tickAnim - 18) / 5) * (45-(22.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 23) / 10) * (45-(45)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 33) / 5) * (22.5-(45)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 22.5 + (((tickAnim - 38) / 5) * (45-(22.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 43) / 10) * (45-(45)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 53) / 5) * (22.5-(45)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 22.5 + (((tickAnim - 58) / 5) * (45-(22.5)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 63) / 10) * (45-(45)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 73) / 5) * (22.5-(45)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 22.5 + (((tickAnim - 78) / 2) * (30-(22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs4, legLs4.rotateAngleX + (float) Math.toRadians(xx), legLs4.rotateAngleY + (float) Math.toRadians(yy), legLs4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -63.09 + (((tickAnim - 0) / 2) * (-61.01346-(-63.09)));
            yy = -4.01 + (((tickAnim - 0) / 2) * (-5.32426-(-4.01)));
            zz = 0.8 + (((tickAnim - 0) / 2) * (5.01355-(0.8)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -61.01346 + (((tickAnim - 2) / 5) * (-69.05901-(-61.01346)));
            yy = -5.32426 + (((tickAnim - 2) / 5) * (5.38095-(-5.32426)));
            zz = 5.01355 + (((tickAnim - 2) / 5) * (-22.52641-(5.01355)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -69.05901 + (((tickAnim - 7) / 5) * (-73.48432-(-69.05901)));
            yy = 5.38095 + (((tickAnim - 7) / 5) * (2.55672-(5.38095)));
            zz = -22.52641 + (((tickAnim - 7) / 5) * (-20.27807-(-22.52641)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -73.48432 + (((tickAnim - 12) / 10) * (-61.01346-(-73.48432)));
            yy = 2.55672 + (((tickAnim - 12) / 10) * (-5.32426-(2.55672)));
            zz = -20.27807 + (((tickAnim - 12) / 10) * (5.01355-(-20.27807)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -61.01346 + (((tickAnim - 22) / 5) * (-69.05901-(-61.01346)));
            yy = -5.32426 + (((tickAnim - 22) / 5) * (5.38095-(-5.32426)));
            zz = 5.01355 + (((tickAnim - 22) / 5) * (-22.52641-(5.01355)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -69.05901 + (((tickAnim - 27) / 5) * (-73.48432-(-69.05901)));
            yy = 5.38095 + (((tickAnim - 27) / 5) * (2.55672-(5.38095)));
            zz = -22.52641 + (((tickAnim - 27) / 5) * (-20.27807-(-22.52641)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = -73.48432 + (((tickAnim - 32) / 10) * (-61.01346-(-73.48432)));
            yy = 2.55672 + (((tickAnim - 32) / 10) * (-5.32426-(2.55672)));
            zz = -20.27807 + (((tickAnim - 32) / 10) * (5.01355-(-20.27807)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -61.01346 + (((tickAnim - 42) / 5) * (-69.05901-(-61.01346)));
            yy = -5.32426 + (((tickAnim - 42) / 5) * (5.38095-(-5.32426)));
            zz = 5.01355 + (((tickAnim - 42) / 5) * (-22.52641-(5.01355)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = -69.05901 + (((tickAnim - 47) / 5) * (-73.48432-(-69.05901)));
            yy = 5.38095 + (((tickAnim - 47) / 5) * (2.55672-(5.38095)));
            zz = -22.52641 + (((tickAnim - 47) / 5) * (-20.27807-(-22.52641)));
        }
        else if (tickAnim >= 52 && tickAnim < 62) {
            xx = -73.48432 + (((tickAnim - 52) / 10) * (-61.01346-(-73.48432)));
            yy = 2.55672 + (((tickAnim - 52) / 10) * (-5.32426-(2.55672)));
            zz = -20.27807 + (((tickAnim - 52) / 10) * (5.01355-(-20.27807)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = -61.01346 + (((tickAnim - 62) / 5) * (-69.05901-(-61.01346)));
            yy = -5.32426 + (((tickAnim - 62) / 5) * (5.38095-(-5.32426)));
            zz = 5.01355 + (((tickAnim - 62) / 5) * (-22.52641-(5.01355)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = -69.05901 + (((tickAnim - 67) / 5) * (-73.48432-(-69.05901)));
            yy = 5.38095 + (((tickAnim - 67) / 5) * (2.55672-(5.38095)));
            zz = -22.52641 + (((tickAnim - 67) / 5) * (-20.27807-(-22.52641)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = -73.48432 + (((tickAnim - 72) / 8) * (-63.09-(-73.48432)));
            yy = 2.55672 + (((tickAnim - 72) / 8) * (-4.01-(2.55672)));
            zz = -20.27807 + (((tickAnim - 72) / 8) * (0.8-(-20.27807)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -7.5 + (((tickAnim - 0) / 2) * (6-(-7.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 6 + (((tickAnim - 2) / 5) * (-45-(6)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 7) / 5) * (-75-(-45)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = -75 + (((tickAnim - 12) / 10) * (6-(-75)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 6 + (((tickAnim - 22) / 5) * (-45-(6)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 27) / 5) * (-75-(-45)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = -75 + (((tickAnim - 32) / 10) * (6-(-75)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = 6 + (((tickAnim - 42) / 5) * (-45-(6)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 47) / 5) * (-75-(-45)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 52) / 10) * (0-(0)));
            yy = -75 + (((tickAnim - 52) / 10) * (6-(-75)));
            zz = 0 + (((tickAnim - 52) / 10) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 62) / 5) * (0-(0)));
            yy = 6 + (((tickAnim - 62) / 5) * (-45-(6)));
            zz = 0 + (((tickAnim - 62) / 5) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 67) / 5) * (-75-(-45)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = -75 + (((tickAnim - 72) / 8) * (-7.5-(-75)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(xx), legLs5.rotateAngleY + (float) Math.toRadians(yy), legLs5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 12.92 + (((tickAnim - 0) / 2) * (0-(12.92)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 5) * (45-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 7) / 5) * (77.5-(45)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = 77.5 + (((tickAnim - 12) / 10) * (0-(77.5)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (45-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 27) / 5) * (77.5-(45)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = 77.5 + (((tickAnim - 32) / 10) * (0-(77.5)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 5) * (45-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 47) / 5) * (77.5-(45)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 52) / 10) * (0-(0)));
            yy = 77.5 + (((tickAnim - 52) / 10) * (0-(77.5)));
            zz = 0 + (((tickAnim - 52) / 10) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 62) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 5) * (45-(0)));
            zz = 0 + (((tickAnim - 62) / 5) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 67) / 5) * (77.5-(45)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = 77.5 + (((tickAnim - 72) / 8) * (12.92-(77.5)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss5, legLss5.rotateAngleX + (float) Math.toRadians(xx), legLss5.rotateAngleY + (float) Math.toRadians(yy), legLss5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.83 + (((tickAnim - 0) / 2) * (-2.5-(0.83)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = -2.5 + (((tickAnim - 2) / 5) * (10-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 7) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (7.5-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 7.5 + (((tickAnim - 17) / 5) * (-2.5-(7.5)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = -2.5 + (((tickAnim - 22) / 5) * (10-(-2.5)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 27) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (7.5-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = 7.5 + (((tickAnim - 37) / 5) * (-2.5-(7.5)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = -2.5 + (((tickAnim - 42) / 5) * (10-(-2.5)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 47) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 52) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 5) * (7.5-(0)));
            zz = 0 + (((tickAnim - 52) / 5) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 57) / 5) * (0-(0)));
            yy = 7.5 + (((tickAnim - 57) / 5) * (-2.5-(7.5)));
            zz = 0 + (((tickAnim - 57) / 5) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 62) / 5) * (0-(0)));
            yy = -2.5 + (((tickAnim - 62) / 5) * (10-(-2.5)));
            zz = 0 + (((tickAnim - 62) / 5) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 67) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 72) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 5) * (7.5-(0)));
            zz = 0 + (((tickAnim - 72) / 5) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 7.5 + (((tickAnim - 77) / 3) * (0.83-(7.5)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLsss5, legLsss5.rotateAngleX + (float) Math.toRadians(xx), legLsss5.rotateAngleY + (float) Math.toRadians(yy), legLsss5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPentecopterus entity = (EntityPrehistoricFloraPentecopterus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+120))), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+190))*2), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+130))*5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+100))*1);
        this.body.rotationPointY = this.body.rotationPointY - (float)(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+150-90))*0.5);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25))*2.5), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+160))*0.1), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-30))*3), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+130))*0.1), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-60))*4), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+100))*0.1), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-90))*5), body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+70))*0.1), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-120))*6), body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+40))*0.1), body6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body7, body7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-150))*7), body7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25+10))*0.1), body7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body8, body8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-180))*8), body8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-20))*0.1), body8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body9, body9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-210))*9), body9.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-50))*0.1), body9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body10, body10.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-220))*10), body10.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-80))*0.1), body10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body11, body11.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-230))*8), body11.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-110))*0.1), body11.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body12, body12.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-240))*7), body12.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-140))*0.1), body12.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body13, body13.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-250))*6), body13.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-170))*0.1), body13.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(talson, talson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-280))*30), talson.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-200))*0.1), talson.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+140))*1), legR5.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+90))*15), legR5.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-90))*20));
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(0), legRs5.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+30))*25), legRs5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRss5, legRss5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+150))*5), legRss5.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-50))*20), legRss5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-240))*50));
        this.setRotateAngle(legRsss5, legRsss5.rotateAngleX + (float) Math.toRadians(0), legRsss5.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-40))*25), legRsss5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+140))*1), legL5.rotateAngleY + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+90))*15), legL5.rotateAngleZ + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-90))*20));
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(0), legLs5.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+30))*25), legLs5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLss5, legLss5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25+150))*5), legLss5.rotateAngleY + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-50))*20), legLss5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-240))*50));
        this.setRotateAngle(legLsss5, legLsss5.rotateAngleX + (float) Math.toRadians(0), legLsss5.rotateAngleY + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-40))*25), legLsss5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(0), legR1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-130))), legR1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRs1, legRs1.rotateAngleX + (float) Math.toRadians(0), legRs1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-160))*2.5), legRs1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRss1, legRss1.rotateAngleX + (float) Math.toRadians(0), legRss1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-190))*5), legRss1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(0), legR2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-100))), legR2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRs2, legRs2.rotateAngleX + (float) Math.toRadians(0), legRs2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-130))), legRs2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRss2, legRss2.rotateAngleX + (float) Math.toRadians(0), legRss2.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-160))*2.5), legRss2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRsss2, legRsss2.rotateAngleX + (float) Math.toRadians(0), legRsss2.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-190))*5), legRsss2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(22.5), legR3.rotateAngleY + (float) Math.toRadians(0), legR3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legRs3, legRs3.rotateAngleX + (float) Math.toRadians(0), legRs3.rotateAngleY + (float) Math.toRadians(-67.5), legRs3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(-87.73421), legR4.rotateAngleY + (float) Math.toRadians(36.10029), legR4.rotateAngleZ + (float) Math.toRadians(-47.26579));
        this.setRotateAngle(legRs4, legRs4.rotateAngleX + (float) Math.toRadians(0), legRs4.rotateAngleY + (float) Math.toRadians(0), legRs4.rotateAngleZ + (float) Math.toRadians(-135));
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(0), legL1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-130))), legL1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLs1, legLs1.rotateAngleX + (float) Math.toRadians(0), legLs1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-160))*2.5), legLs1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLss1, legLss1.rotateAngleX + (float) Math.toRadians(0), legLss1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-190))*5), legLss1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(0), legL2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-100))), legL2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLs2, legLs2.rotateAngleX + (float) Math.toRadians(0), legLs2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-130))), legLs2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLss2, legLss2.rotateAngleX + (float) Math.toRadians(0), legLss2.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-160))*2.5), legLss2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLsss2, legLsss2.rotateAngleX + (float) Math.toRadians(0), legLsss2.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-190))*5), legLsss2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(22.5), legL3.rotateAngleY + (float) Math.toRadians(0), legL3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLs3, legLs3.rotateAngleX + (float) Math.toRadians(0), legLs3.rotateAngleY + (float) Math.toRadians(67.5), legLs3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(-87.73421), legL4.rotateAngleY + (float) Math.toRadians(-36.10029), legL4.rotateAngleZ + (float) Math.toRadians(47.26579));
        this.setRotateAngle(legLs4, legLs4.rotateAngleX + (float) Math.toRadians(0), legLs4.rotateAngleY + (float) Math.toRadians(0), legLs4.rotateAngleZ + (float) Math.toRadians(135));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPentecopterus e = (EntityPrehistoricFloraPentecopterus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
