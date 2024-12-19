package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGoldringia extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Root;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended siphon;
    private final AdvancedModelRendererExtended eyeR;
    private final AdvancedModelRendererExtended eyeL;
    private final AdvancedModelRendererExtended cirrisR;
    private final AdvancedModelRendererExtended cirri;
    private final AdvancedModelRendererExtended cirria;
    private final AdvancedModelRendererExtended cirri2;
    private final AdvancedModelRendererExtended cirria2;
    private final AdvancedModelRendererExtended cirri3;
    private final AdvancedModelRendererExtended cirria3;
    private final AdvancedModelRendererExtended cirri4;
    private final AdvancedModelRendererExtended cirria4;
    private final AdvancedModelRendererExtended cirri5;
    private final AdvancedModelRendererExtended cirria5;
    private final AdvancedModelRendererExtended cirri6;
    private final AdvancedModelRendererExtended cirria6;
    private final AdvancedModelRendererExtended cirrisL;
    private final AdvancedModelRendererExtended cirri7;
    private final AdvancedModelRendererExtended cirria7;
    private final AdvancedModelRendererExtended cirri8;
    private final AdvancedModelRendererExtended cirria8;
    private final AdvancedModelRendererExtended cirri9;
    private final AdvancedModelRendererExtended cirria9;
    private final AdvancedModelRendererExtended cirri10;
    private final AdvancedModelRendererExtended cirria10;
    private final AdvancedModelRendererExtended cirri11;
    private final AdvancedModelRendererExtended cirria11;
    private final AdvancedModelRendererExtended cirri12;
    private final AdvancedModelRendererExtended cirria12;
    private final AdvancedModelRendererExtended Shell;
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
    private final AdvancedModelRendererExtended Shell2;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended Shell3;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended Shell4;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended Shell5;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended Shell6;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended cube_r33;
    private final AdvancedModelRendererExtended Shell7;
    private final AdvancedModelRendererExtended cube_r34;
    private final AdvancedModelRendererExtended cube_r35;
    private final AdvancedModelRendererExtended Shell8;
    private final AdvancedModelRendererExtended Shell9;

    public ModelGoldringia() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.Root = new AdvancedModelRendererExtended(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -2.75F, 10.0F);
        this.Root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 49, -3.0F, -5.75F, -3.25F, 6, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.5F, -6.225F, -2.75F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 1, -3.5F, -0.5F, 0.0F, 6, 1, 5, 0.04F, false));

        this.siphon = new AdvancedModelRendererExtended(this);
        this.siphon.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(siphon);
        this.setRotateAngle(siphon, -0.0873F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 63, 0, -1.0F, -0.75F, -0.25F, 2, 2, 4, 0.0F, false));

        this.eyeR = new AdvancedModelRendererExtended(this);
        this.eyeR.setRotationPoint(-1.0F, -4.1F, -2.25F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, -0.2182F, 0.0F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 14, -2.6F, -1.0F, -0.25F, 1, 2, 2, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 3, 19, -2.6F, 0.0F, 0.25F, 1, 1, 1, 0.01F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 18, -2.6F, -0.5F, 0.25F, 1, 1, 1, 0.02F, false));

        this.eyeL = new AdvancedModelRendererExtended(this);
        this.eyeL.setRotationPoint(1.0F, -4.1F, -2.25F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, -0.2182F, 0.0F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 0, 1.6F, -1.0F, -0.25F, 1, 2, 2, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 3, 5, 1.6F, 0.0F, 0.25F, 1, 1, 1, 0.01F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 4, 1.6F, -0.5F, 0.25F, 1, 1, 1, 0.02F, false));

        this.cirrisR = new AdvancedModelRendererExtended(this);
        this.cirrisR.setRotationPoint(-1.25F, -5.75F, -0.25F);
        this.body.addChild(cirrisR);


        this.cirri = new AdvancedModelRendererExtended(this);
        this.cirri.setRotationPoint(-0.25F, 1.0F, 0.0F);
        this.cirrisR.addChild(cirri);
        this.setRotateAngle(cirri, -0.3491F, -0.1309F, 0.0F);
        this.cirri.cubeList.add(new ModelBox(cirri, 41, 69, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria = new AdvancedModelRendererExtended(this);
        this.cirria.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri.addChild(cirria);
        this.setRotateAngle(cirria, -0.2618F, 0.0F, 0.0F);
        this.cirria.cubeList.add(new ModelBox(cirria, 61, 37, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri2 = new AdvancedModelRendererExtended(this);
        this.cirri2.setRotationPoint(-1.25F, 1.0F, 0.0F);
        this.cirrisR.addChild(cirri2);
        this.setRotateAngle(cirri2, -0.3927F, -0.2182F, 0.0F);
        this.cirri2.cubeList.add(new ModelBox(cirri2, 69, 31, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria2 = new AdvancedModelRendererExtended(this);
        this.cirria2.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri2.addChild(cirria2);
        this.setRotateAngle(cirria2, -0.2618F, 0.0F, 0.0F);
        this.cirria2.cubeList.add(new ModelBox(cirria2, 58, 36, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri3 = new AdvancedModelRendererExtended(this);
        this.cirri3.setRotationPoint(-1.25F, 2.0F, 0.0F);
        this.cirrisR.addChild(cirri3);
        this.setRotateAngle(cirri3, -0.4363F, -0.3054F, 0.0F);
        this.cirri3.cubeList.add(new ModelBox(cirri3, 12, 69, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria3 = new AdvancedModelRendererExtended(this);
        this.cirria3.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri3.addChild(cirria3);
        this.setRotateAngle(cirria3, -0.2618F, 0.0F, 0.0F);
        this.cirria3.cubeList.add(new ModelBox(cirria3, 58, 35, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri4 = new AdvancedModelRendererExtended(this);
        this.cirri4.setRotationPoint(-1.25F, 3.0F, 0.0F);
        this.cirrisR.addChild(cirri4);
        this.setRotateAngle(cirri4, -0.48F, -0.3927F, 0.0F);
        this.cirri4.cubeList.add(new ModelBox(cirri4, 35, 68, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria4 = new AdvancedModelRendererExtended(this);
        this.cirria4.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri4.addChild(cirria4);
        this.setRotateAngle(cirria4, -0.2618F, 0.0F, 0.0F);
        this.cirria4.cubeList.add(new ModelBox(cirria4, 44, 7, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri5 = new AdvancedModelRendererExtended(this);
        this.cirri5.setRotationPoint(-1.25F, 4.0F, 0.0F);
        this.cirrisR.addChild(cirri5);
        this.setRotateAngle(cirri5, -0.5672F, -0.48F, 0.0F);
        this.cirri5.cubeList.add(new ModelBox(cirri5, 68, 11, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria5 = new AdvancedModelRendererExtended(this);
        this.cirria5.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri5.addChild(cirria5);
        this.setRotateAngle(cirria5, -0.2618F, 0.0F, 0.0F);
        this.cirria5.cubeList.add(new ModelBox(cirria5, 44, 6, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri6 = new AdvancedModelRendererExtended(this);
        this.cirri6.setRotationPoint(0.65F, 0.75F, 0.0F);
        this.cirrisR.addChild(cirri6);
        this.setRotateAngle(cirri6, -0.3491F, -0.0873F, 0.0F);
        this.cirri6.cubeList.add(new ModelBox(cirri6, 65, 66, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria6 = new AdvancedModelRendererExtended(this);
        this.cirria6.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri6.addChild(cirria6);
        this.setRotateAngle(cirria6, -0.2618F, 0.0F, 0.0F);
        this.cirria6.cubeList.add(new ModelBox(cirria6, 33, 15, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirrisL = new AdvancedModelRendererExtended(this);
        this.cirrisL.setRotationPoint(1.25F, -5.75F, -0.25F);
        this.body.addChild(cirrisL);


        this.cirri7 = new AdvancedModelRendererExtended(this);
        this.cirri7.setRotationPoint(0.25F, 1.0F, 0.0F);
        this.cirrisL.addChild(cirri7);
        this.setRotateAngle(cirri7, -0.3491F, 0.1309F, 0.0F);
        this.cirri7.cubeList.add(new ModelBox(cirri7, 29, 66, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria7 = new AdvancedModelRendererExtended(this);
        this.cirria7.setRotationPoint(0.0F, -0.25F, 3.25F);
        this.cirri7.addChild(cirria7);
        this.setRotateAngle(cirria7, -0.2618F, 0.0F, 0.0F);
        this.cirria7.cubeList.add(new ModelBox(cirria7, 23, 15, 0.0F, -0.25F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri8 = new AdvancedModelRendererExtended(this);
        this.cirri8.setRotationPoint(1.25F, 1.0F, 0.0F);
        this.cirrisL.addChild(cirri8);
        this.setRotateAngle(cirri8, -0.3927F, 0.2182F, 0.0F);
        this.cirri8.cubeList.add(new ModelBox(cirri8, 68, 6, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria8 = new AdvancedModelRendererExtended(this);
        this.cirria8.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri8.addChild(cirria8);
        this.setRotateAngle(cirria8, -0.2618F, 0.0F, 0.0F);
        this.cirria8.cubeList.add(new ModelBox(cirria8, 44, 5, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri9 = new AdvancedModelRendererExtended(this);
        this.cirri9.setRotationPoint(1.25F, 2.0F, 0.0F);
        this.cirrisL.addChild(cirri9);
        this.setRotateAngle(cirri9, -0.4363F, 0.3054F, 0.0F);
        this.cirri9.cubeList.add(new ModelBox(cirri9, 67, 61, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria9 = new AdvancedModelRendererExtended(this);
        this.cirria9.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri9.addChild(cirria9);
        this.setRotateAngle(cirria9, -0.2618F, 0.0F, 0.0F);
        this.cirria9.cubeList.add(new ModelBox(cirria9, 42, 22, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri10 = new AdvancedModelRendererExtended(this);
        this.cirri10.setRotationPoint(1.25F, 3.0F, 0.0F);
        this.cirrisL.addChild(cirri10);
        this.setRotateAngle(cirri10, -0.48F, 0.3927F, 0.0F);
        this.cirri10.cubeList.add(new ModelBox(cirri10, 67, 40, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria10 = new AdvancedModelRendererExtended(this);
        this.cirria10.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri10.addChild(cirria10);
        this.setRotateAngle(cirria10, -0.2618F, 0.0F, 0.0F);
        this.cirria10.cubeList.add(new ModelBox(cirria10, 42, 21, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri11 = new AdvancedModelRendererExtended(this);
        this.cirri11.setRotationPoint(1.25F, 4.0F, 0.0F);
        this.cirrisL.addChild(cirri11);
        this.setRotateAngle(cirri11, -0.5672F, 0.48F, 0.0F);
        this.cirri11.cubeList.add(new ModelBox(cirri11, 67, 26, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria11 = new AdvancedModelRendererExtended(this);
        this.cirria11.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri11.addChild(cirria11);
        this.setRotateAngle(cirria11, -0.2618F, 0.0F, 0.0F);
        this.cirria11.cubeList.add(new ModelBox(cirria11, 42, 20, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri12 = new AdvancedModelRendererExtended(this);
        this.cirri12.setRotationPoint(-0.65F, 0.75F, 0.0F);
        this.cirrisL.addChild(cirri12);
        this.setRotateAngle(cirri12, -0.3491F, 0.0873F, 0.0F);
        this.cirri12.cubeList.add(new ModelBox(cirri12, 6, 67, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria12 = new AdvancedModelRendererExtended(this);
        this.cirria12.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri12.addChild(cirria12);
        this.setRotateAngle(cirria12, -0.2618F, 0.0F, 0.0F);
        this.cirria12.cubeList.add(new ModelBox(cirria12, 32, 34, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.Shell = new AdvancedModelRendererExtended(this);
        this.Shell.setRotationPoint(0.0F, -2.5F, 8.0F);
        this.Root.addChild(Shell);
        this.setRotateAngle(Shell, 0.0873F, 0.0F, 0.0F);
        this.Shell.cubeList.add(new ModelBox(Shell, 0, 14, -4.0F, -7.0F, -7.0F, 8, 7, 7, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -7.0F, -3.0F);
        this.Shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5672F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 0, -4.0F, 0.0F, 0.0F, 8, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -7.0F, -5.5F);
        this.Shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 39, -4.0F, 0.0F, 0.0F, 8, 2, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 5, -4.0F, -2.0F, 0.0F, 8, 2, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 44, -4.0F, -2.0F, 0.0F, 8, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-4.0F, -0.75F, -8.5F);
        this.Shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.228F, -0.5498F, 0.1008F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 58, 0.0F, -7.0F, 0.0F, 2, 7, 3, 0.01F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-4.0F, 0.0F, -5.0F);
        this.Shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.5672F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 59, 0.0F, -7.0F, 0.0F, 2, 7, 3, 0.01F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-4.0F, -3.5F, -3.0F);
        this.Shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5847F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 60, 0.0F, -3.5F, 0.0F, 2, 7, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(4.0F, -0.75F, -8.5F);
        this.Shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.228F, 0.5498F, -0.1008F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 58, -2.0F, -7.0F, 0.0F, 2, 7, 3, 0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(4.0F, 0.0F, -5.0F);
        this.Shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5672F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 59, -2.0F, -7.0F, 0.0F, 2, 7, 3, 0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(4.0F, -3.5F, -3.0F);
        this.Shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.5847F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 60, -2.0F, -3.5F, 0.0F, 2, 7, 3, 0.0F, false));

        this.Shell2 = new AdvancedModelRendererExtended(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.5236F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -4.0F, -7.0F, -7.0F, 8, 7, 7, -0.04F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -7.0F, -5.0F);
        this.Shell2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 33, -4.0F, 0.0F, -1.0F, 8, 2, 4, 0.04F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-3.45F, -0.75F, -7.625F);
        this.Shell2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1177F, -0.6211F, 0.0761F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 62, 0.0F, -6.0F, 0.0F, 2, 6, 3, 0.01F, true));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-4.0F, 0.25F, -5.0F);
        this.Shell2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1148F, -0.5628F, -0.0514F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 53, 49, 0.0F, -7.0F, -1.0F, 2, 7, 4, 0.01F, true));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(3.45F, -0.75F, -7.625F);
        this.Shell2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1177F, 0.6211F, -0.0761F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 62, -2.0F, -6.0F, 0.0F, 2, 6, 3, 0.01F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(4.0F, 0.25F, -5.0F);
        this.Shell2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1148F, 0.5628F, 0.0514F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 49, -2.0F, -7.0F, -1.0F, 2, 7, 4, 0.01F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -0.225F, -5.0F);
        this.Shell2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5672F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 42, 20, -4.0F, -2.0F, 0.0F, 8, 2, 3, 0.06F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Shell2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3927F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 44, -4.0F, -2.0F, 0.0F, 8, 2, 3, 0.04F, false));

        this.Shell3 = new AdvancedModelRendererExtended(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.6981F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 23, 7, -3.5F, -6.0F, -7.0F, 7, 6, 7, -0.01F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.5F, -6.0F, -7.0F);
        this.Shell3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4363F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 49, -4.0F, 0.0F, 0.0F, 7, 2, 3, 0.01F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.5F, -6.0F, -5.0F);
        this.Shell3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.7418F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 49, 25, -4.0F, 0.0F, 0.0F, 7, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-3.5F, 0.0F, -7.0F);
        this.Shell3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0262F, -0.3054F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 61, 0.0F, -6.0F, 0.0F, 2, 6, 3, 0.01F, true));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(-3.5F, 0.15F, -3.775F);
        this.Shell3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3629F, -0.5743F, -0.1871F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 65, 49, 0.0F, -6.0F, 0.0F, 2, 6, 3, 0.01F, true));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(3.5F, 0.0F, -7.0F);
        this.Shell3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0262F, 0.3054F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 23, 61, -2.0F, -6.0F, 0.0F, 2, 6, 3, 0.01F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(3.5F, 0.15F, -3.775F);
        this.Shell3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3629F, 0.5743F, 0.1871F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 65, 49, -2.0F, -6.0F, 0.0F, 2, 6, 3, 0.01F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.0F, -7.0F);
        this.Shell3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.5236F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 50, 44, -3.0F, -2.0F, 0.0F, 7, 2, 3, 0.04F, false));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.0F, -4.0F);
        this.Shell3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.4363F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 51, 10, -3.0F, -2.0F, 0.0F, 7, 2, 3, 0.01F, false));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.0F, -1.0F);
        this.Shell3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 51, 15, -3.0F, -2.0F, 0.0F, 7, 2, 3, 0.0F, false));

        this.Shell4 = new AdvancedModelRendererExtended(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.6981F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 23, 21, -3.0F, -5.0F, -7.0F, 6, 5, 7, 0.0F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.Shell4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5672F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 30, -2.0F, -2.0F, 0.0F, 6, 2, 3, 0.04F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.Shell4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.48F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 35, 53, -2.0F, -2.0F, 0.0F, 6, 2, 3, 0.01F, false));

        this.Shell5 = new AdvancedModelRendererExtended(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.6327F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 0, 28, -2.5F, -5.0F, -7.0F, 5, 5, 7, 0.0F, false));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(-1.5F, 0.0F, -5.0F);
        this.Shell5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.5672F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 54, -1.0F, -2.0F, 0.0F, 5, 2, 3, 0.04F, false));

        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(-1.5F, 0.0F, -2.0F);
        this.Shell5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3927F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 57, -1.0F, -2.0F, 0.0F, 5, 2, 3, 0.01F, false));

        this.Shell6 = new AdvancedModelRendererExtended(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7854F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 17, 33, -2.0F, -4.0F, -7.0F, 4, 4, 7, 0.0F, false));

        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(-1.0F, 0.0F, -5.0F);
        this.Shell6.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.48F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 58, 35, -1.0F, -2.0F, 0.0F, 4, 2, 3, 0.04F, false));

        this.cube_r33 = new AdvancedModelRendererExtended(this);
        this.cube_r33.setRotationPoint(-1.0F, 0.0F, -1.5F);
        this.Shell6.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 57, 60, -1.0F, -2.0F, 0.0F, 4, 2, 3, 0.01F, false));

        this.Shell7 = new AdvancedModelRendererExtended(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.8814F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 38, 44, -1.5F, -3.0F, -6.0F, 3, 3, 6, 0.0F, false));

        this.cube_r34 = new AdvancedModelRendererExtended(this);
        this.cube_r34.setRotationPoint(-1.5F, 0.0F, -5.0F);
        this.Shell7.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2618F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 64, 20, 0.0F, -2.0F, 0.0F, 3, 2, 3, 0.04F, false));

        this.cube_r35 = new AdvancedModelRendererExtended(this);
        this.cube_r35.setRotationPoint(-1.5F, 0.0F, -2.0F);
        this.Shell7.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0873F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 57, 65, 0.0F, -2.0F, 0.0F, 3, 2, 3, 0.01F, false));

        this.Shell8 = new AdvancedModelRendererExtended(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.829F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 26, 54, -1.0F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.Shell9 = new AdvancedModelRendererExtended(this);
        this.Shell9.setRotationPoint(-0.25F, 0.0F, -5.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -1.0472F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 0, 33, 0.25F, -4.0F, -7.0F, 0, 4, 7, 0.0F, false));

        //2

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.Root.offsetY = -0.2F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.Root.offsetY = 0.1F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -2.0F;
        this.Root.offsetX = -1.338F;
        this.Root.rotateAngleY = (float)Math.toRadians(200);
        this.Root.rotateAngleX = (float)Math.toRadians(8);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 1.63F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        float zOffset = 0.35F;

        this.resetToDefaultPose();
        //this.Shell1.offsetY = 1.25F;
        //left
        AdvancedModelRendererExtended[] tentacle1 = {this.cirri, this.cirria};
        AdvancedModelRendererExtended[] tentacle2 = {this.cirri2, this.cirria2};
        AdvancedModelRendererExtended[] tentacle3 = {this.cirri3, this.cirria3};
        AdvancedModelRendererExtended[] tentacle4 = {this.cirri4, this.cirria4};
        AdvancedModelRendererExtended[] tentacle5 = {this.cirri5, this.cirria5};
        AdvancedModelRendererExtended[] tentacle6 = {this.cirri6, this.cirria6};
        //right
        AdvancedModelRendererExtended[] tentacle7 = {this.cirri7, this.cirria7};
        AdvancedModelRendererExtended[] tentacle8 = {this.cirri8, this.cirria8};
        AdvancedModelRendererExtended[] tentacle9 = {this.cirri9, this.cirria9};
        AdvancedModelRendererExtended[] tentacle10 = {this.cirri10, this.cirria10};
        AdvancedModelRendererExtended[] tentacle11 = {this.cirri11, this.cirria11};
        AdvancedModelRendererExtended[] tentacle12 = {this.cirri12, this.cirria12};

        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.2F;
        }

        //Left:
        this.chainWave(tentacle1, speed, 0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle2, speed, 0.3F, -2, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle3, speed, 0.3F, -2, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle4, speed, 0.3F, -2, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle5, speed, 0.3F, -2, f2, 1F);

        this.chainWave(tentacle6, speed, 0.3F, -2, f2, 1F);

        //Right:
        this.chainWave(tentacle7, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle8, speed, 0.3F, -2, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle9, speed, 0.3F, -2, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle10, speed, 0.3F, -2, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle11, speed, 0.3F, -2, f2, 1F);

        this.chainWave(tentacle12, speed, 0.3F, -2, f2, 1F);

        this.swing(cirrisR, (float) (speed), 0.20F, true, 0, 0, f2, 1);
        this.swing(cirrisL, (float) (speed), 0.20F, false, 0, 0, f2, 1);



        if (e.isInWater()) {
            this.bob(Root, 0.1F, 2.0F, false, f2, 2);
            this.Root.offsetZ = this.moveBoxExtended(speed, 0.40F, false, 3, f2, 1) + zOffset;
        }
        else {
            this.Root.rotateAngleZ = (float) Math.toRadians(90);
            this.Root.offsetY = 0.08F;
            this.Root.offsetZ = zOffset;
        }

    }

}
