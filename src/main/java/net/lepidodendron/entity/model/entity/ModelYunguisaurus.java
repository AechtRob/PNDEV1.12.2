package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYunguisaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYunguisaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Yunguisaurus;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended neck4;
    private final AdvancedModelRendererExtended neck5;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended leftfrontflipper;
    private final AdvancedModelRendererExtended leftfrontflipperbase;
    private final AdvancedModelRendererExtended leftfrontflippertip;
    private final AdvancedModelRendererExtended rightfrontflipper;
    private final AdvancedModelRendererExtended rightfrontflipperbase;
    private final AdvancedModelRendererExtended rightfrontflippertip;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended leftbackflipper;
    private final AdvancedModelRendererExtended leftbackflipperbase;
    private final AdvancedModelRendererExtended leftbackflippertip;
    private final AdvancedModelRendererExtended rightbackflipper;
    private final AdvancedModelRendererExtended rightbackflipperbase;
    private final AdvancedModelRendererExtended rightbackflippertip;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tail6;

    private ModelAnimator animator;

    public ModelYunguisaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Yunguisaurus = new AdvancedModelRendererExtended(this);
        this.Yunguisaurus.setRotationPoint(0.5F, 24.0F, 7.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Yunguisaurus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -8.0F, -16.0F, 11, 8, 17, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(-0.5F, -7.25F, -15.5F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 26, -4.5F, -0.5F, -5.0F, 9, 7, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.25F, -4.5F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 31, 26, -4.0F, -0.5F, -6.0F, 8, 6, 6, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.25F, -5.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 24, 39, -3.0F, -0.5F, -7.0F, 6, 5, 7, 0.0F, false));

        this.neck4 = new AdvancedModelRendererExtended(this);
        this.neck4.setRotationPoint(0.0F, 0.625F, -5.75F);
        this.neck3.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 54, 19, -2.0F, -1.0029F, -7.249F, 4, 4, 7, -0.01F, false));

        this.neck5 = new AdvancedModelRendererExtended(this);
        this.neck5.setRotationPoint(0.0F, 0.9971F, -6.249F);
        this.neck4.addChild(neck5);
        this.neck5.cubeList.add(new ModelBox(neck5, 18, 52, -2.0F, -2.0F, -7.0F, 4, 4, 7, -0.02F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.0005F, -6.2446F);
        this.neck5.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 67, 0, -2.0F, -1.9982F, -2.9902F, 4, 3, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 69, 46, -2.0F, 0.0018F, -5.9902F, 4, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 26, 1.7056F, 1.0018F, -6.2402F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 26, -1.7056F, 1.0018F, -6.2402F, 0, 1, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 68, 38, -1.5F, 0.0018F, -9.9902F, 3, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 59, 1.2056F, 1.0018F, -9.9902F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 59, -1.2056F, 1.0018F, -9.9902F, 0, 1, 3, 0.0F, true));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-0.0444F, -0.1115F, -7.9517F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1876F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 26, -0.9556F, -0.55F, -2.1F, 2, 1, 3, -0.011F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 26, -0.9556F, -0.55F, -1.575F, 2, 1, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-1.5444F, -0.6311F, -3.579F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0987F, -0.163F, -0.0758F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 13, -0.4556F, -0.325F, -1.6F, 1, 1, 2, -0.01F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(1.5444F, -0.6311F, -3.579F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0987F, 0.163F, 0.0758F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 13, -0.5444F, -0.325F, -1.6F, 1, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-0.0444F, -1.9766F, -3.0052F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2662F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 66, -1.4556F, 0.0011F, -3.9025F, 3, 2, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.4556F, 1.0018F, -9.4902F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.3054F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 40, -0.0444F, -0.5F, 2.5F, 0, 2, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(1.4556F, 1.0018F, -9.4902F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, -0.3054F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 40, 0.0444F, -0.5F, 2.5F, 0, 2, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-1.4556F, 1.0018F, -8.4902F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 0, -0.0444F, -0.825F, -0.5F, 0, 3, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(1.4556F, 1.0018F, -8.4902F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 0, 0.0444F, -0.825F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-0.0444F, 1.0018F, -9.9902F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 14, -1.4556F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-1.9556F, 1.0018F, -3.4902F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.3054F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 40, -0.0444F, -1.0F, -0.75F, 0, 2, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(1.9556F, 1.0018F, -3.4902F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3054F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 40, 0.0444F, -1.0F, -0.75F, 0, 2, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(-0.5444F, 1.5018F, -0.7402F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 61, 7, -1.4556F, -0.5F, -5.25F, 4, 1, 6, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 34, 52, 2.25F, -1.5F, -4.5F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 34, 52, -1.1612F, -1.5F, -4.5F, 0, 1, 3, 0.0F, true));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 70, 15, -0.9556F, -3.0F, -1.5F, 3, 3, 3, -0.03F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 54, 46, -0.9556F, -0.5F, -9.25F, 3, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 57, 13, 1.75F, -1.5F, -8.25F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 57, 13, -0.6612F, -1.5F, -8.25F, 0, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-0.9112F, -0.5F, -8.75F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, -0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 6, -0.0444F, -1.5F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(2.0F, -0.5F, -8.75F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.1745F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 6, 0.0444F, -1.5F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-0.9112F, -0.5F, -6.75F);
        this.lowerjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, -0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 40, -0.0444F, -1.825F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(2.0F, -0.5F, -6.75F);
        this.lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 40, 0.0444F, -1.825F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.5F, -0.5F, -9.25F);
        this.lowerjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, -1.4556F, -2.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-1.4112F, -0.5F, -4.75F);
        this.lowerjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, -0.2618F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 13, -0.0444F, -1.5F, -0.25F, 0, 2, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(2.5F, -0.5F, -4.75F);
        this.lowerjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.2618F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 13, 0.0444F, -1.5F, -0.25F, 0, 2, 1, 0.0F, false));

        this.leftfrontflipper = new AdvancedModelRendererExtended(this);
        this.leftfrontflipper.setRotationPoint(4.5F, 4.5F, -2.0F);
        this.neck.addChild(leftfrontflipper);
        this.setRotateAngle(leftfrontflipper, -0.0888F, 0.46F, 0.1586F);
        this.leftfrontflipper.cubeList.add(new ModelBox(leftfrontflipper, 0, 7, -1.5F, -1.5F, -1.5F, 4, 3, 3, 0.0F, false));

        this.leftfrontflipperbase = new AdvancedModelRendererExtended(this);
        this.leftfrontflipperbase.setRotationPoint(2.5F, 0.0F, -1.5F);
        this.leftfrontflipper.addChild(leftfrontflipperbase);
        this.setRotateAngle(leftfrontflipperbase, 0.0F, -0.1745F, 0.0F);
        this.leftfrontflipperbase.cubeList.add(new ModelBox(leftfrontflipperbase, 60, 31, 0.0152F, -1.0F, 0.1736F, 7, 2, 4, 0.0F, false));

        this.leftfrontflippertip = new AdvancedModelRendererExtended(this);
        this.leftfrontflippertip.setRotationPoint(7.0152F, 0.0F, 0.1736F);
        this.leftfrontflipperbase.addChild(leftfrontflippertip);
        this.setRotateAngle(leftfrontflippertip, 0.0F, -0.2182F, 0.0F);
        this.leftfrontflippertip.cubeList.add(new ModelBox(leftfrontflippertip, 0, 40, 0.0F, -0.5F, 0.0F, 8, 1, 4, 0.0F, false));

        this.rightfrontflipper = new AdvancedModelRendererExtended(this);
        this.rightfrontflipper.setRotationPoint(-4.5F, 4.5F, -2.0F);
        this.neck.addChild(rightfrontflipper);
        this.setRotateAngle(rightfrontflipper, -0.0888F, -0.46F, -0.1586F);
        this.rightfrontflipper.cubeList.add(new ModelBox(rightfrontflipper, 0, 7, -2.5F, -1.5F, -1.5F, 4, 3, 3, 0.0F, true));

        this.rightfrontflipperbase = new AdvancedModelRendererExtended(this);
        this.rightfrontflipperbase.setRotationPoint(-2.5F, 0.0F, -1.5F);
        this.rightfrontflipper.addChild(rightfrontflipperbase);
        this.setRotateAngle(rightfrontflipperbase, 0.0F, 0.1745F, 0.0F);
        this.rightfrontflipperbase.cubeList.add(new ModelBox(rightfrontflipperbase, 60, 31, -7.0152F, -1.0F, 0.1736F, 7, 2, 4, 0.0F, true));

        this.rightfrontflippertip = new AdvancedModelRendererExtended(this);
        this.rightfrontflippertip.setRotationPoint(-7.0152F, 0.0F, 0.1736F);
        this.rightfrontflipperbase.addChild(rightfrontflippertip);
        this.setRotateAngle(rightfrontflippertip, 0.0F, 0.2182F, 0.0F);
        this.rightfrontflippertip.cubeList.add(new ModelBox(rightfrontflippertip, 0, 40, -8.0F, -0.5F, 0.0F, 8, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(-0.5F, -7.25F, -0.5F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 40, 0, -4.0F, -0.5F, 0.0F, 8, 7, 5, 0.0F, false));

        this.leftbackflipper = new AdvancedModelRendererExtended(this);
        this.leftbackflipper.setRotationPoint(4.5F, 4.5F, 2.0F);
        this.tail.addChild(leftbackflipper);
        this.setRotateAngle(leftbackflipper, -0.2115F, -0.4205F, 0.1277F);
        this.leftbackflipper.cubeList.add(new ModelBox(leftbackflipper, 0, 0, -1.5F, -1.5F, -1.5F, 4, 3, 3, 0.0F, false));

        this.leftbackflipperbase = new AdvancedModelRendererExtended(this);
        this.leftbackflipperbase.setRotationPoint(2.5F, 0.0F, -1.5F);
        this.leftbackflipper.addChild(leftbackflipperbase);
        this.setRotateAngle(leftbackflipperbase, 0.0F, -0.1745F, 0.0F);
        this.leftbackflipperbase.cubeList.add(new ModelBox(leftbackflipperbase, 53, 64, 0.0F, -1.0F, 0.0F, 6, 2, 4, 0.0F, false));

        this.leftbackflippertip = new AdvancedModelRendererExtended(this);
        this.leftbackflippertip.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.leftbackflipperbase.addChild(leftbackflippertip);
        this.setRotateAngle(leftbackflippertip, 0.0F, -0.2182F, 0.0F);
        this.leftbackflippertip.cubeList.add(new ModelBox(leftbackflippertip, 44, 39, 0.0F, -0.5F, 0.0F, 9, 1, 5, 0.0F, false));

        this.rightbackflipper = new AdvancedModelRendererExtended(this);
        this.rightbackflipper.setRotationPoint(-4.5F, 4.5F, 2.0F);
        this.tail.addChild(rightbackflipper);
        this.setRotateAngle(rightbackflipper, -0.2115F, 0.4205F, -0.1277F);
        this.rightbackflipper.cubeList.add(new ModelBox(rightbackflipper, 0, 0, -2.5F, -1.5F, -1.5F, 4, 3, 3, 0.0F, true));

        this.rightbackflipperbase = new AdvancedModelRendererExtended(this);
        this.rightbackflipperbase.setRotationPoint(-2.5F, 0.0F, -1.5F);
        this.rightbackflipper.addChild(rightbackflipperbase);
        this.setRotateAngle(rightbackflipperbase, 0.0F, 0.1745F, 0.0F);
        this.rightbackflipperbase.cubeList.add(new ModelBox(rightbackflipperbase, 53, 64, -6.0F, -1.0F, 0.0F, 6, 2, 4, 0.0F, true));

        this.rightbackflippertip = new AdvancedModelRendererExtended(this);
        this.rightbackflippertip.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.rightbackflipperbase.addChild(rightbackflippertip);
        this.setRotateAngle(rightbackflippertip, 0.0F, 0.2182F, 0.0F);
        this.rightbackflippertip.cubeList.add(new ModelBox(rightbackflippertip, 44, 39, -9.0F, -0.5F, 0.0F, 9, 1, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.5246F, 4.4591F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 46, -3.0F, 0.1496F, -0.9591F, 6, 6, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.1746F, 3.7909F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 59, -2.0F, 0.1F, 0.0F, 4, 5, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.175F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0175F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 57, 52, -1.5F, 0.0F, 0.001F, 3, 4, 7, -0.01F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.5436F, 0.175F, 6.001F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 34, 59, -1.5436F, 0.0F, 0.0F, 2, 3, 7, 0.0F, false));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(-0.5F, 0.075F, 6.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 41, 46, -0.5436F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Yunguisaurus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(neck2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.neck.offsetY = -0.04F;
        this.neck.offsetX = 0.0F;
        this.neck.offsetZ = 0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.05F, -0.07F, 0.0F);
        this.setRotateAngle(neck2, -0.05F, -0.08F, 0.0F);
        this.setRotateAngle(neck3, -0.05F, -0.1F, 0.0F);
        this.setRotateAngle(neck4, -0.05F, -0.17F, 0.0F);
        this.setRotateAngle(neck5, -0.05F, -0.2F, 0.0F);
        this.setRotateAngle(head, -0.1F, -0.23F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftfrontflipper, -0.3F, 0.2F, 0.0F);
        this.setRotateAngle(leftfrontflipperbase, 0.0F, 0.05F, 0.05F);
        this.setRotateAngle(leftfrontflippertip, 0.0F, -0.08F, 0.02F);
        this.setRotateAngle(rightfrontflipper, -0.3F, -0.2F, 0.0F);
        this.setRotateAngle(rightfrontflipperbase, 0.0F, -0.05F, 0.05F);
        this.setRotateAngle(rightfrontflippertip, 0.0F, 0.08F, 0.02F);
        this.setRotateAngle(tail, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, 0.1F, -0.05F);
        this.setRotateAngle(tail3, 0.1F, 0.1F, -0.05F);
        this.setRotateAngle(tail4, 0.1F, 0.1F, -0.1F);
        this.setRotateAngle(tail5, 0.1F, 0.2F, -0.1F);
        this.setRotateAngle(tail6, 0.1F, 0.2F, -0.1F);
        this.setRotateAngle(leftbackflipper, 0.0F, -0.3F, 0.2F);
        this.setRotateAngle(leftbackflipperbase, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(leftbackflippertip, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(rightbackflipper, 0.0F, 0.3F, -0.2F);
        this.setRotateAngle(rightbackflipperbase, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(rightbackflippertip, 0.0F, 0.4F, 0.0F);
        this.Yunguisaurus.offsetY = -0.5F;
        this.Yunguisaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.8F);
        this.setRotateAngle(neck, 0.0F, -0.1F, -0.1F);
        this.setRotateAngle(neck2, 0.0F, -0.1F, -0.1F);
        this.setRotateAngle(neck3, 0.0F, -0.1F, -0.1F);
        this.setRotateAngle(neck4, 0.0F, -0.1F, -0.1F);
        this.setRotateAngle(neck5, 0.0F, -0.1F, -0.1F);
        this.setRotateAngle(head, 0.0F, -0.1F, -0.1F);
        this.setRotateAngle(lowerjaw, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(leftfrontflipper, 0.0F, 0.0F, 0.3F);
        this.setRotateAngle(leftfrontflipperbase, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(leftfrontflippertip, 0.0F, 0.0F, -0.1F);
        this.setRotateAngle(rightfrontflipper, 0.0F, 0.0F, -0.3F);
        this.setRotateAngle(rightfrontflipperbase, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(rightfrontflippertip, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(tail, 0.0F, 0.05F, 0.03F);
        this.setRotateAngle(tail2, 0.0F, 0.05F, 0.03F);
        this.setRotateAngle(tail3, 0.0F, 0.05F, 0.03F);
        this.setRotateAngle(tail4, 0.0F, 0.05F, 0.03F);
        this.setRotateAngle(tail5, 0.0F, 0.05F, 0.03F);
        this.setRotateAngle(tail6, 0.0F, 0.05F, 0.03F);
        this.setRotateAngle(leftbackflipper, 0.0F, 0.0F, 0.3F);
        this.setRotateAngle(leftbackflipperbase, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(leftbackflippertip, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(rightbackflipper, 0.0F, 0.0F, -0.3F);
        this.setRotateAngle(rightbackflipperbase, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(rightbackflippertip, 0.0F, 0.0F, -0.1F);
        this.Yunguisaurus.offsetY = 0.0F;
        this.Yunguisaurus.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Yunguisaurus.offsetY = -0.4F;
        this.Yunguisaurus.offsetX = -0.23F;
        this.Yunguisaurus.rotateAngleY = (float)Math.toRadians(-210);
        this.Yunguisaurus.rotateAngleX = (float)Math.toRadians(20);
        this.Yunguisaurus.rotateAngleZ = (float)Math.toRadians(5);
        this.Yunguisaurus.scaleChildren = true;
        float scaler = 0.46F;
        this.Yunguisaurus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.3F, 1.3F, 0.0F);
        this.setRotateAngle(neck, -0.1F, -0.3F, 0.0F);
        this.setRotateAngle(neck2, -0.05F, -0.2F, 0.0F);
        this.setRotateAngle(neck3, -0.05F, -0.2F, 0.0F);
        this.setRotateAngle(neck4, -0.1F, -0.2F, 0.0F);
        this.setRotateAngle(neck5, -0.1F, -0.2F, 0.0F);
        this.setRotateAngle(head, -0.1F, -0.2F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftfrontflipper, -0.5F, 0.2F, 0.0F);
        this.setRotateAngle(leftfrontflipperbase, 0.0F, 0.05F, 0.05F);
        this.setRotateAngle(leftfrontflippertip, 0.0F, -0.08F, 0.02F);
        this.setRotateAngle(rightfrontflipper, -0.3F, -0.2F, 0.0F);
        this.setRotateAngle(rightfrontflipperbase, 0.0F, -0.05F, 0.05F);
        this.setRotateAngle(rightfrontflippertip, 0.0F, 0.08F, 0.02F);
        this.setRotateAngle(tail, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.1F, -0.05F);
        this.setRotateAngle(tail3, 0.2F, 0.1F, -0.05F);
        this.setRotateAngle(tail4, 0.2F, 0.1F, -0.1F);
        this.setRotateAngle(tail5, 0.1F, 0.2F, -0.1F);
        this.setRotateAngle(tail6, 0.1F, 0.2F, -0.1F);
        this.setRotateAngle(leftbackflipper, 0.0F, -0.3F, 0.2F);
        this.setRotateAngle(leftbackflipperbase, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(leftbackflippertip, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(rightbackflipper, 0.0F, 0.3F, -0.2F);
        this.setRotateAngle(rightbackflipperbase, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(rightbackflippertip, 0.0F, 0.4F, 0.0F);
        //End of pose, now render the model:
        this.Yunguisaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Yunguisaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Yunguisaurus.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraYunguisaurus ee = (EntityPrehistoricFloraYunguisaurus) entitylivingbaseIn;
        if (ee.isReallyInWater()) {
            if (ee.getIsFast()) {
                animSwimmingFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYunguisaurus entity = (EntityPrehistoricFloraYunguisaurus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Yunguisaurus, Yunguisaurus.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1), Yunguisaurus.rotateAngleY + (float) Math.toRadians(0), Yunguisaurus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+80))*-3));
        this.Yunguisaurus.rotationPointX = this.Yunguisaurus.rotationPointX + (float)(0);
        this.Yunguisaurus.rotationPointY = this.Yunguisaurus.rotationPointY - (float)(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1);
        this.Yunguisaurus.rotationPointZ = this.Yunguisaurus.rotationPointZ + (float)(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+60))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+50))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-180))*-1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-160))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*3));


        this.setRotateAngle(leftfrontflipper, leftfrontflipper.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+260))*-20), leftfrontflipper.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20), leftfrontflipper.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*20));


        this.setRotateAngle(leftfrontflipperbase, leftfrontflipperbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+290))*-5), leftfrontflipperbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*10), leftfrontflipperbase.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*15));


        this.setRotateAngle(leftfrontflippertip, leftfrontflippertip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+320))*-5), leftfrontflippertip.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*10), leftfrontflippertip.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*15));


        this.setRotateAngle(rightfrontflipper, rightfrontflipper.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20), rightfrontflipper.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20), rightfrontflipper.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*-20));


        this.setRotateAngle(rightfrontflipperbase, rightfrontflipperbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5), rightfrontflipperbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-10), rightfrontflipperbase.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15));


        this.setRotateAngle(rightfrontflippertip, rightfrontflippertip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+300))*-5), rightfrontflippertip.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*-10), rightfrontflippertip.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*-15));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*-3));


        this.setRotateAngle(leftbackflipper, leftbackflipper.rotateAngleX + (float) Math.toRadians(12.7466+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*20), leftbackflipper.rotateAngleY + (float) Math.toRadians(19.8863+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+80))*-20), leftbackflipper.rotateAngleZ + (float) Math.toRadians(8.4706+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*-15));


        this.setRotateAngle(leftbackflipperbase, leftbackflipperbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*5), leftbackflipperbase.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+110))*-15), leftbackflipperbase.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-80))*-10));


        this.setRotateAngle(leftbackflippertip, leftbackflippertip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*5), leftbackflippertip.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+140))*-15), leftbackflippertip.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-110))*-10));

        this.setRotateAngle(rightbackflipper, rightbackflipper.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightbackflipperbase, rightbackflipperbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*5), rightbackflipperbase.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*15), rightbackflipperbase.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10));


        this.setRotateAngle(rightbackflippertip, rightbackflippertip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*5), rightbackflippertip.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+160))*15), rightbackflippertip.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*10));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*2.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-10))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*2.5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-80))*2.5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-80))*-3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-85))*2.5), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-85))*-3));


    }

    public void animSwimmingFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYunguisaurus entity = (EntityPrehistoricFloraYunguisaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Yunguisaurus, Yunguisaurus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*3), Yunguisaurus.rotateAngleY + (float) Math.toRadians(0), Yunguisaurus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-5));
        this.Yunguisaurus.rotationPointX = this.Yunguisaurus.rotationPointX + (float)(0);
        this.Yunguisaurus.rotationPointY = this.Yunguisaurus.rotationPointY - (float)(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.5);
        this.Yunguisaurus.rotationPointZ = this.Yunguisaurus.rotationPointZ + (float)(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*4);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*3)));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-20))*3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-3), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*2));


        this.setRotateAngle(leftfrontflipper, leftfrontflipper.rotateAngleX + (float) Math.toRadians(18.3075+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*30), leftfrontflipper.rotateAngleY + (float) Math.toRadians(-9.8073+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*40), leftfrontflipper.rotateAngleZ + (float) Math.toRadians(8.8425+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20));


        this.setRotateAngle(leftfrontflipperbase, leftfrontflipperbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*5), leftfrontflipperbase.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*5), leftfrontflipperbase.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*10));


        this.setRotateAngle(leftfrontflippertip, leftfrontflippertip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5), leftfrontflippertip.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*5), leftfrontflippertip.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10));


        this.setRotateAngle(rightfrontflipper, rightfrontflipper.rotateAngleX + (float) Math.toRadians(14.7401+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30), rightfrontflipper.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-39.9948), rightfrontflipper.rotateAngleZ + (float) Math.toRadians(-4.7797+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-20));


        this.setRotateAngle(rightfrontflipperbase, rightfrontflipperbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5), rightfrontflipperbase.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-5), rightfrontflipperbase.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*-10));


        this.setRotateAngle(rightfrontflippertip, rightfrontflippertip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*5), rightfrontflippertip.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*-5), rightfrontflippertip.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*-10));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*2.5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3));

        this.setRotateAngle(leftbackflipper, leftbackflipper.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftbackflipperbase, leftbackflipperbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-5), leftbackflipperbase.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*-5), leftbackflipperbase.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*-10));


        this.setRotateAngle(leftbackflippertip, leftbackflippertip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-5), leftbackflippertip.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-5), leftbackflippertip.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-210))*-10));

        this.setRotateAngle(rightbackflipper, rightbackflipper.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightbackflipperbase, rightbackflipperbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-5), rightbackflipperbase.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*5), rightbackflipperbase.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*10));


        this.setRotateAngle(rightbackflippertip, rightbackflippertip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-5), rightbackflippertip.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*5), rightbackflippertip.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*10));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-210))*5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-210))*-3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-240))*5), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-240))*-3));


    }

    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYunguisaurus entity = (EntityPrehistoricFloraYunguisaurus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1-(0)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 20) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 20) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1 + (((tickAnim - 60) / 40) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 60) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 60) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 100) / 60) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 100) / 60) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(0)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 20) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 20) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 60) / 40) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 60) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 60) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 100) / 60) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 100) / 60) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*-1), neck2.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*3), neck2.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*-3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-60))*1), neck3.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*-5), neck3.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-90))*-3));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1), neck4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-1)), neck4.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1), neck5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2)), neck5.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), head.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*5)), head.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3));


        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), lowerjaw.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-200))*1)), lowerjaw.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-200))*3)));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = 2.5 + (((tickAnim - 0) / 60) * (2.5-(2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = 2.5 + (((tickAnim - 60) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 90) / 30) * (2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = 2.5 + (((tickAnim - 120) / 40) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontflipper, leftfrontflipper.rotateAngleX + (float) Math.toRadians(xx), leftfrontflipper.rotateAngleY + (float) Math.toRadians(yy), leftfrontflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)));
            zz = -7.5 + (((tickAnim - 0) / 60) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)));
            zz = -7.5 + (((tickAnim - 60) / 30) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(-7.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 90) / 30) * (-7.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)));
            zz = -7.5 + (((tickAnim - 120) / 40) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontflipperbase, leftfrontflipperbase.rotateAngleX + (float) Math.toRadians(xx), leftfrontflipperbase.rotateAngleY + (float) Math.toRadians(yy), leftfrontflipperbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            zz = -2.5 + (((tickAnim - 0) / 120) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            zz = -2.5 + (((tickAnim - 120) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-2.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 140) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 140) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 140) / 20) * (-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontflipper, rightfrontflipper.rotateAngleX + (float) Math.toRadians(xx), rightfrontflipper.rotateAngleY + (float) Math.toRadians(yy), rightfrontflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)));
            zz = 7.5 + (((tickAnim - 0) / 120) * (7.5-(7.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)));
            zz = 7.5 + (((tickAnim - 120) / 20) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontflipperbase, rightfrontflipperbase.rotateAngleX + (float) Math.toRadians(xx), rightfrontflipperbase.rotateAngleY + (float) Math.toRadians(yy), rightfrontflipperbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)));
            zz = 10 + (((tickAnim - 0) / 20) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 20) / 20) * (10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)));
            zz = 10 + (((tickAnim - 40) / 120) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper, leftbackflipper.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)));
            zz = -10 + (((tickAnim - 0) / 20) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 20) / 20) * (-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)));
            zz = -10 + (((tickAnim - 40) / 120) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipperbase, leftbackflipperbase.rotateAngleX + (float) Math.toRadians(xx), leftbackflipperbase.rotateAngleY + (float) Math.toRadians(yy), leftbackflipperbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = -10 + (((tickAnim - 0) / 79) * (-10-(-10)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = -10 + (((tickAnim - 79) / 21) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(-10)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 100) / 20) * (-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = -10 + (((tickAnim - 120) / 40) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper, rightbackflipper.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = 10 + (((tickAnim - 0) / 79) * (10-(10)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = 10 + (((tickAnim - 79) / 21) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(10)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 100) / 20) * (10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = 10 + (((tickAnim - 120) / 40) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipperbase, rightbackflipperbase.rotateAngleX + (float) Math.toRadians(xx), rightbackflipperbase.rotateAngleY + (float) Math.toRadians(yy), rightbackflipperbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 60) / 70) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 60) / 70) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 130) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 130) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 30) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 60) / 70) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 70) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 130) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 130) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 0) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 30) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 60) / 70) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3 + (((tickAnim - 60) / 70) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 130) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 130) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*3), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-3)), tail5.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*3), tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-3)), tail6.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3));


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYunguisaurus entity = (EntityPrehistoricFloraYunguisaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 10) / 10) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5))-(0));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5 + (((tickAnim - 10) / 10) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5) + (((tickAnim - 10) / 3) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15 + (((tickAnim - 13) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10) + (((tickAnim - 13) / 7) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 0) / 10) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1 + (((tickAnim - 13) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontflipper, leftfrontflipper.rotateAngleX + (float) Math.toRadians(xx), leftfrontflipper.rotateAngleY + (float) Math.toRadians(yy), leftfrontflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontflipper, rightfrontflipper.rotateAngleX + (float) Math.toRadians(xx), rightfrontflipper.rotateAngleY + (float) Math.toRadians(yy), rightfrontflipper.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;
        //this.body.offsetZ = 0.50F;

        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, neck3);
        this.faceTarget(f3, f4, 5, neck4);
        this.faceTarget(f3, f4, 5, neck5);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};

        EntityPrehistoricFloraYunguisaurus ee = (EntityPrehistoricFloraYunguisaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);

    }
}

