package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraJeholotriton;
import net.lepidodendron.entity.EntityPrehistoricFloraMarmorerpeton;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJeholotriton extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended legright;
    private final AdvancedModelRendererExtended legright2;
    private final AdvancedModelRendererExtended legright3;
    private final AdvancedModelRendererExtended legleft;
    private final AdvancedModelRendererExtended legleft2;
    private final AdvancedModelRendererExtended legleft3;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended leftallgill;
    private final AdvancedModelRendererExtended GillL3;
    private final AdvancedModelRendererExtended GillL2;
    private final AdvancedModelRendererExtended GillL;
    private final AdvancedModelRendererExtended rightallgill;
    private final AdvancedModelRendererExtended GillL4;
    private final AdvancedModelRendererExtended GillL5;
    private final AdvancedModelRendererExtended GillL6;
    private final AdvancedModelRendererExtended Upperjaw;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended armright;
    private final AdvancedModelRendererExtended armright2;
    private final AdvancedModelRendererExtended armright3;
    private final AdvancedModelRendererExtended armleft;
    private final AdvancedModelRendererExtended armleft2;
    private final AdvancedModelRendererExtended armleft3;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;

    private ModelAnimator animator;

    public ModelJeholotriton() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 20, -3.0F, -2.05F, 10.0F, 6, 2, 4, -0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -2.8F, 11.5F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 14, -2.0F, -0.05F, -1.5F, 4, 1, 4, -0.01F, false));

        this.legright = new AdvancedModelRendererExtended(this);
        this.legright.setRotationPoint(-3.25F, -0.75F, 11.15F);
        this.Hips.addChild(legright);
        this.setRotateAngle(legright, -0.0873F, -0.3054F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 47, 47, -2.0F, -0.25F, -0.85F, 3, 1, 1, 0.01F, true));
        this.legright.cubeList.add(new ModelBox(legright, 46, 13, -2.0F, -0.25F, -0.25F, 3, 1, 1, 0.0F, true));

        this.legright2 = new AdvancedModelRendererExtended(this);
        this.legright2.setRotationPoint(-1.75F, 0.25F, 0.3F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 1.4399F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 34, 37, -2.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));
        this.legright2.cubeList.add(new ModelBox(legright2, 23, 36, -2.25F, -0.5F, -0.75F, 3, 1, 1, -0.02F, true));

        this.legright3 = new AdvancedModelRendererExtended(this);
        this.legright3.setRotationPoint(-2.0F, 0.25F, 0.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, -0.48F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 42, 3, -2.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));
        this.legright3.cubeList.add(new ModelBox(legright3, 41, 29, -2.5F, 0.05F, -1.5F, 3, 0, 3, 0.0F, true));

        this.legleft = new AdvancedModelRendererExtended(this);
        this.legleft.setRotationPoint(3.25F, -0.75F, 11.15F);
        this.Hips.addChild(legleft);
        this.setRotateAngle(legleft, -0.0873F, 0.3054F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 47, 47, -1.0F, -0.25F, -0.85F, 3, 1, 1, 0.01F, false));
        this.legleft.cubeList.add(new ModelBox(legleft, 46, 13, -1.0F, -0.25F, -0.25F, 3, 1, 1, 0.0F, false));

        this.legleft2 = new AdvancedModelRendererExtended(this);
        this.legleft2.setRotationPoint(1.75F, 0.25F, 0.3F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, -1.4399F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 34, 37, -0.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 23, 36, -0.75F, -0.5F, -0.75F, 3, 1, 1, -0.02F, false));

        this.legleft3 = new AdvancedModelRendererExtended(this);
        this.legleft3.setRotationPoint(2.0F, 0.25F, 0.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.48F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 42, 3, -0.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));
        this.legleft3.cubeList.add(new ModelBox(legleft3, 41, 29, -0.5F, 0.05F, -1.5F, 3, 0, 3, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.Hips.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -4.5F, -2.75F, -8.0F, 9, 3, 7, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 11, -4.5F, -3.5F, -8.0F, 9, 1, 7, -0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 26, 0, -3.5F, -3.0F, -1.0F, 7, 3, 2, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -7.5F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 21, 20, -3.5F, -3.0F, -3.0F, 7, 3, 3, 0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Chest.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 28, 6, -2.0F, -2.01F, -4.1F, 4, 2, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 19, 27, -2.0F, -2.875F, -4.1F, 4, 2, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-2.5F, 0.0F, 1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2094F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 37, -0.3F, -2.0F, -4.275F, 2, 2, 4, 0.015F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(2.5F, 0.0F, 1.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2094F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 37, -1.7F, -2.0F, -4.275F, 2, 2, 4, 0.015F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, -1.025F, -3.15F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 10, 43, -1.0F, -0.0346F, -3.7471F, 2, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-3.1745F, 0.4554F, -0.4146F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 11, 0.0433F, -0.5F, 0.021F, 2, 1, 1, -0.01F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(3.1745F, 0.4554F, -0.4146F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 11, -2.0433F, -0.5F, 0.021F, 2, 1, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.9654F, -3.7471F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5672F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 23, 0.0F, -1.01F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.0F, 0.9654F, -3.7471F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.5672F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 23, -2.0F, -1.01F, 0.0F, 2, 1, 4, 0.012F, false));

        this.leftallgill = new AdvancedModelRendererExtended(this);
        this.leftallgill.setRotationPoint(3.3F, -1.6F, -2.55F);
        this.Head.addChild(leftallgill);


        this.GillL3 = new AdvancedModelRendererExtended(this);
        this.GillL3.setRotationPoint(-0.05F, 0.875F, 1.375F);
        this.leftallgill.addChild(GillL3);
        this.setRotateAngle(GillL3, 0.4557F, -0.6993F, -0.1116F);
        this.GillL3.cubeList.add(new ModelBox(GillL3, 45, 0, -0.5288F, -1.0858F, -0.5707F, 3, 0, 2, 0.0F, false));

        this.GillL2 = new AdvancedModelRendererExtended(this);
        this.GillL2.setRotationPoint(-0.7F, -0.3F, -0.4F);
        this.leftallgill.addChild(GillL2);
        this.setRotateAngle(GillL2, 0.5464F, -0.5114F, -0.2245F);
        this.GillL2.cubeList.add(new ModelBox(GillL2, 44, 44, -0.0537F, -0.0289F, -0.7236F, 3, 0, 2, 0.0F, false));

        this.GillL = new AdvancedModelRendererExtended(this);
        this.GillL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftallgill.addChild(GillL);
        this.setRotateAngle(GillL, 0.6624F, -0.4069F, -0.0368F);
        this.GillL.cubeList.add(new ModelBox(GillL, 39, 20, -0.5F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.rightallgill = new AdvancedModelRendererExtended(this);
        this.rightallgill.setRotationPoint(-3.3F, -1.6F, -2.55F);
        this.Head.addChild(rightallgill);


        this.GillL4 = new AdvancedModelRendererExtended(this);
        this.GillL4.setRotationPoint(0.05F, 0.875F, 1.375F);
        this.rightallgill.addChild(GillL4);
        this.setRotateAngle(GillL4, 0.4557F, 0.6993F, 0.1116F);
        this.GillL4.cubeList.add(new ModelBox(GillL4, 45, 0, -2.4712F, -1.0858F, -0.5707F, 3, 0, 2, 0.0F, true));

        this.GillL5 = new AdvancedModelRendererExtended(this);
        this.GillL5.setRotationPoint(0.7F, -0.3F, -0.4F);
        this.rightallgill.addChild(GillL5);
        this.setRotateAngle(GillL5, 0.5464F, 0.5114F, 0.2245F);
        this.GillL5.cubeList.add(new ModelBox(GillL5, 44, 44, -2.9463F, -0.0289F, -0.7236F, 3, 0, 2, 0.0F, true));

        this.GillL6 = new AdvancedModelRendererExtended(this);
        this.GillL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightallgill.addChild(GillL6);
        this.setRotateAngle(GillL6, 0.6624F, 0.4069F, 0.0368F);
        this.GillL6.cubeList.add(new ModelBox(GillL6, 39, 20, -2.5F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.Upperjaw = new AdvancedModelRendererExtended(this);
        this.Upperjaw.setRotationPoint(0.0F, -1.25F, -4.0F);
        this.Head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 0, 45, -1.0F, -0.75F, -3.0F, 2, 1, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-1.0F, -0.75F, 0.0F);
        this.Upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3491F, 0.4363F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 27, -1.15F, -0.6F, -0.775F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(1.0F, -0.75F, 0.0F);
        this.Upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3491F, -0.4363F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 27, 0.15F, -0.6F, -0.775F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.9774F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 27, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(1.0F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.9774F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 27, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3665F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 35, -1.15F, -1.0F, 1.6F, 2, 1, 3, 0.005F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(1.0F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3665F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 35, -0.85F, -1.0F, 1.6F, 2, 1, 3, 0.005F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -0.75F, -3.0F);
        this.Upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2967F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 44, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.armright = new AdvancedModelRendererExtended(this);
        this.armright.setRotationPoint(-3.15F, -0.75F, -1.4F);
        this.Chest.addChild(armright);
        this.setRotateAngle(armright, 0.0542F, 0.394F, -0.0507F);
        this.armright.cubeList.add(new ModelBox(armright, 17, 20, -2.0F, -0.25F, -0.25F, 2, 1, 1, 0.0F, true));

        this.armright2 = new AdvancedModelRendererExtended(this);
        this.armright2.setRotationPoint(-2.0F, 0.25F, 0.05F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, -1.0908F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 0, 14, -1.5F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.armright3 = new AdvancedModelRendererExtended(this);
        this.armright3.setRotationPoint(-1.25F, 0.25F, 0.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.0F, -0.4363F, 0.0F);
        this.armright3.cubeList.add(new ModelBox(armright3, 42, 7, -1.75F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));
        this.armright3.cubeList.add(new ModelBox(armright3, 26, 14, -1.75F, 0.05F, -1.5F, 2, 0, 3, 0.0F, true));

        this.armleft = new AdvancedModelRendererExtended(this);
        this.armleft.setRotationPoint(3.15F, -0.75F, -1.4F);
        this.Chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.0542F, -0.394F, 0.0507F);
        this.armleft.cubeList.add(new ModelBox(armleft, 17, 20, 0.0F, -0.25F, -0.25F, 2, 1, 1, 0.0F, false));

        this.armleft2 = new AdvancedModelRendererExtended(this);
        this.armleft2.setRotationPoint(2.0F, 0.25F, 0.05F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, 1.0908F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 0, 14, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.armleft3 = new AdvancedModelRendererExtended(this);
        this.armleft3.setRotationPoint(1.25F, 0.25F, 0.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.0F, 0.4363F, 0.0F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 42, 7, -0.25F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));
        this.armleft3.cubeList.add(new ModelBox(armleft3, 26, 14, -0.25F, 0.05F, -1.5F, 2, 0, 3, 0.0F, false));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, -1.5F, 14.0F);
        this.Hips.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 27, -2.0F, -1.0F, -0.25F, 4, 2, 5, 0.01F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 21, 43, 0.0F, -2.0F, 1.75F, 0, 4, 3, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 0, 0.0F, -1.5F, -0.25F, 0, 3, 2, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 13, 35, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 28, 37, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 31, 28, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 35, 0.0F, -1.5F, 0.0F, 0, 3, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticPlinth(float f) {
        this.Jaw.rotateAngleX = (float) Math.toRadians(23);
        this.Hips.render(0.01F);
    }
    public void renderStaticFloor(float f) {
        this.Hips.render(0.01F);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Hips.offsetY = -0.05F;

        EntityPrehistoricFloraJeholotriton greer = (EntityPrehistoricFloraJeholotriton) e;

        this.faceTarget(f3, f4, 12, Head);

        float speed = 0.35F;

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Torso = {this.Body, this.Chest};
        greer.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] LeftArm = {this.armleft, this.armleft2};
        AdvancedModelRenderer[] RightArm = {this.armright, this.armright2};

        AdvancedModelRenderer[] LeftLeg = {this.legleft, this.legleft2};
        AdvancedModelRenderer[] RightLeg = {this.legright, this.legright2};

        if (greer.isReallyInWater()) { //swim animation
            if(!greer.isAtBottom()) {
                this.setRotateAngle(armleft, (float) Math.toRadians(0), -(float) Math.toRadians(47.5), -(float) Math.toRadians(7.5));
                this.setRotateAngle(armright, (float) Math.toRadians(0), (float) Math.toRadians(47.5), (float) Math.toRadians(7.5));
                this.setRotateAngle(armleft2, -(float) Math.toRadians(0.3472), -(float) Math.toRadians(20.021), -(float) Math.toRadians(-7.3741));
                this.setRotateAngle(armright2, -(float) Math.toRadians(0.3472), (float) Math.toRadians(20.021), -(float) Math.toRadians(-7.3741));
                this.setRotateAngle(legleft, -(float) Math.toRadians(-1.0631), -(float) Math.toRadians(45.0107), -(float) Math.toRadians(6.6325));
                this.setRotateAngle(legright, -(float) Math.toRadians(-1.0631), (float) Math.toRadians(45.0107), -(float) Math.toRadians(6.6325));
                this.setRotateAngle(legleft2, -(float) Math.toRadians(1.8636), -(float) Math.toRadians(25.0156), -(float) Math.toRadians(-1.0555));
                this.setRotateAngle(legright2, -(float) Math.toRadians(1.8636), (float) Math.toRadians(25.0156), -(float) Math.toRadians(-1.0555));
                this.setRotateAngle(legleft3, -(float) Math.toRadians(2.7647), -(float) Math.toRadians(-25.0981), -(float) Math.toRadians(-5.4974));
                this.setRotateAngle(legright3, -(float) Math.toRadians(2.7647), (float) Math.toRadians(-25.0981), -(float) Math.toRadians(-5.4974));

                if (f3 == 0.0F || !greer.getIsMoving()) {
                    return;
                }

                this.chainSwingExtended(LeftArm, speed, -0.2F, 0F, 3.0F, f2, 0.7F);
                this.chainSwingExtended(RightArm, speed, 0.2F, 0F, 0, f2, 0.7F);

                this.chainSwingExtended(LeftLeg, speed, 0.2F, 0F, 3.0F, f2, 0.7F);
                this.chainSwingExtended(RightLeg, speed, -0.2F, 0F, 0, f2, 0.7F);

                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 1.2F, 0.3F, -3, f2, 0.8F);
                this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
            } else {//bottom walking
                speed = speed *0.5F;
                if (greer.getIsFast()) {
                    speed = speed * 1.33F;
                }
                if (f3 == 0.0F || !greer.getIsMoving()) {
                    return;
                }
                this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);

                //this.chainSwingExtended(LeftArm, speed, 0.6F,0F,3.0F, f2, 0.7F);
                //this.chainSwingExtended(RightArm, speed, -0.6F,0F,0, f2, 0.7F);
                this.swing(armleft, speed, 0.6F, false, 3.0f, -0, f2, 0.7F);
                this.swing(armright, speed, -0.6F, false, 0f, -0, f2, 0.7F);
                this.swing(armleft2, speed, -0.4F, true, 0f, -0, f2, 0.7F);
                this.swing(armright2, speed, -0.4F, true, 0f, -0, f2, 0.7F);


                this.chainSwingExtended(LeftLeg, speed, 0.4F,0F,3.0F, f2, 0.7F);
                this.chainSwingExtended(RightLeg, speed , -0.4F,0F,0, f2, 0.7F);

                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 0.45F, 0.2F, -3, f2, 0.8F);
                this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
            }


        }
        else {
            speed = speed *0.5F;
            if (greer.getIsFast()) {
                speed = speed * 1.33F;
            }
            if (f3 == 0.0F || !greer.getIsMoving()) {
                return;
            }
            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);

            //this.chainSwingExtended(LeftArm, speed, 0.6F,0F,3.0F, f2, 0.7F);
            //this.chainSwingExtended(RightArm, speed, -0.6F,0F,0, f2, 0.7F);
            this.swing(armleft, speed, 0.6F, false, 3.0f, -0, f2, 0.7F);
            this.swing(armright, speed, -0.6F, false, 0f, -0, f2, 0.7F);
            this.swing(armleft2, speed, -0.4F, true, 0f, -0, f2, 0.7F);
            this.swing(armright2, speed, -0.4F, true, 0f, -0, f2, 0.7F);


            this.chainSwingExtended(LeftLeg, speed, 0.4F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightLeg, speed , -0.4F,0F,0, f2, 0.7F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.45F, 0.2F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
