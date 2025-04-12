package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOrnitholestes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelOrnitholestes extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer toeright;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer toeleft;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer upperarmright;
    private final AdvancedModelRenderer lowerarmright;
    private final AdvancedModelRenderer handright;
    private final AdvancedModelRenderer fingerright2;
    private final AdvancedModelRenderer fingerright;
    private final AdvancedModelRenderer upperarmleft;
    private final AdvancedModelRenderer lowerarmleft;
    private final AdvancedModelRenderer handleft;
    private final AdvancedModelRenderer fingerleft2;
    private final AdvancedModelRenderer fingerleft;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer throatPouch;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private ModelAnimator animator;

    public ModelOrnitholestes() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -16.6222F, 7.1837F);
        this.base.addChild(hips);
        this.hips.cubeList.add(new ModelBox(hips, 37, 53, -2.5F, -3.1778F, -2.4837F, 5, 6, 5, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 57, 53, -2.5F, 2.7972F, -2.4837F, 5, 1, 5, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.1778F, 2.5163F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 0, -2.5F, -0.5F, -5.0F, 5, 2, 5, -0.01F, false));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-1.25F, -1.6778F, -0.2337F);
        this.hips.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.2182F, 0.0F, 0.0F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 0, 0, -2.5F, -1.5F, -1.75F, 3, 9, 4, 0.0F, false));
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 14, 0, -1.75F, -1.5F, 2.25F, 0, 7, 1, 0.0F, false));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(-1.0F, 7.0F, -1.0F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.8727F, 0.0F, 0.0F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 0, 20, -1.0F, 0.0F, -0.75F, 2, 8, 3, 0.0F, false));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 7.5F, 1.0F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.9163F, 0.0F, 0.0F);
        this.footright.cubeList.add(new ModelBox(footright, 0, 36, -1.0F, 0.0F, -1.25F, 2, 6, 2, -0.01F, false));

        this.toeright = new AdvancedModelRenderer(this);
        this.toeright.setRotationPoint(0.0F, 5.55F, 0.25F);
        this.footright.addChild(toeright);
        this.setRotateAngle(toeright, -1.309F, 0.0F, 0.0F);
        this.toeright.cubeList.add(new ModelBox(toeright, 38, 0, -1.5F, 0.0F, -0.25F, 3, 5, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 2.5F, -0.25F);
        this.toeright.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, -0.0436F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 63, -0.5F, -0.5F, -0.15F, 1, 3, 2, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(1.25F, -1.6778F, -0.2337F);
        this.hips.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.2182F, 0.0F, 0.0F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 0, 0, -0.5F, -1.5F, -1.75F, 3, 9, 4, 0.0F, true));
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 14, 0, 1.75F, -1.5F, 2.25F, 0, 7, 1, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(1.0F, 7.0F, -1.0F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.8727F, 0.0F, 0.0F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 0, 20, -1.0F, 0.0F, -0.75F, 2, 8, 3, 0.0F, true));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 7.5F, 1.0F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.9163F, 0.0F, 0.0F);
        this.footleft.cubeList.add(new ModelBox(footleft, 0, 36, -1.0F, 0.0F, -1.25F, 2, 6, 2, -0.01F, true));

        this.toeleft = new AdvancedModelRenderer(this);
        this.toeleft.setRotationPoint(0.0F, 5.55F, 0.25F);
        this.footleft.addChild(toeleft);
        this.setRotateAngle(toeleft, -1.309F, 0.0F, 0.0F);
        this.toeleft.cubeList.add(new ModelBox(toeleft, 38, 0, -1.5F, 0.0F, -0.25F, 3, 5, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 2.5F, -0.25F);
        this.toeleft.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0436F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 63, -0.5F, -0.5F, -0.15F, 1, 3, 2, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.1778F, 2.5163F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 18, 43, -2.0F, -1.25F, -0.5F, 4, 4, 8, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 51, -1.5F, 2.75F, -0.5F, 3, 2, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3F, 7.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1484F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 31, -1.5F, -1.25F, -0.5F, 3, 3, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, -1.5F, -0.25F, -0.5F, 3, 5, 10, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 24, -1.0F, -1.0F, -0.5F, 2, 2, 12, 0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 20, -1.5F, 0.0F, -0.5F, 3, 4, 12, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 0, -0.5F, -0.75F, -0.5F, 1, 1, 14, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -1.5F, -0.25F, -0.5F, 3, 4, 16, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.7778F, -0.9837F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 34, 15, -2.5F, -2.902F, -8.1584F, 5, 8, 8, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 44, -2.5F, 5.098F, -8.1584F, 5, 1, 8, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.152F, -6.9084F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 38, 0, -2.0F, -2.75F, -8.0F, 4, 5, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.25F, -7.8F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 31, -2.0F, 0.1143F, -0.1686F, 4, 1, 7, -0.002F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 13, -2.0F, -2.8857F, -0.1686F, 4, 3, 7, -0.01F, false));

        this.upperarmright = new AdvancedModelRenderer(this);
        this.upperarmright.setRotationPoint(-2.0F, 1.9F, -5.5F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, -0.5236F, -0.3491F, 0.0F);
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 22, 0, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 0, 8, -0.15F, -2.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.lowerarmright = new AdvancedModelRenderer(this);
        this.lowerarmright.setRotationPoint(-0.25F, -0.25F, 4.35F);
        this.upperarmright.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, -1.8326F, 0.2618F, 0.0F);
        this.lowerarmright.cubeList.add(new ModelBox(lowerarmright, 18, 20, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));
        this.lowerarmright.cubeList.add(new ModelBox(lowerarmright, 16, 28, 0.2F, -5.0F, -1.0F, 0, 5, 10, 0.0F, false));

        this.handright = new AdvancedModelRenderer(this);
        this.handright.setRotationPoint(-0.05F, 0.25F, 4.0F);
        this.lowerarmright.addChild(handright);
        this.setRotateAngle(handright, 0.6981F, -0.1309F, 0.0F);
        this.handright.cubeList.add(new ModelBox(handright, 26, 58, -0.55F, -0.65F, -0.3F, 1, 1, 7, 0.0F, false));

        this.fingerright2 = new AdvancedModelRenderer(this);
        this.fingerright2.setRotationPoint(0.05F, 0.15F, -0.25F);
        this.handright.addChild(fingerright2);
        this.setRotateAngle(fingerright2, -0.3927F, 0.0F, 0.0F);
        this.fingerright2.cubeList.add(new ModelBox(fingerright2, 52, 53, -0.55F, -0.65F, -0.05F, 1, 1, 3, 0.0F, false));

        this.fingerright = new AdvancedModelRenderer(this);
        this.fingerright.setRotationPoint(0.05F, -0.25F, 0.0F);
        this.handright.addChild(fingerright);
        this.setRotateAngle(fingerright, 0.1309F, 0.0F, 0.0F);
        this.fingerright.cubeList.add(new ModelBox(fingerright, 34, 31, -0.55F, -0.65F, -0.05F, 1, 1, 4, 0.0F, false));

        this.upperarmleft = new AdvancedModelRenderer(this);
        this.upperarmleft.setRotationPoint(2.0F, 1.9F, -5.5F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, -0.5236F, 0.3491F, 0.0F);
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 22, 0, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 0, 8, 0.15F, -2.0F, 0.0F, 0, 2, 5, 0.0F, true));

        this.lowerarmleft = new AdvancedModelRenderer(this);
        this.lowerarmleft.setRotationPoint(0.25F, -0.25F, 4.35F);
        this.upperarmleft.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, -1.8326F, -0.2618F, 0.0F);
        this.lowerarmleft.cubeList.add(new ModelBox(lowerarmleft, 18, 20, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));
        this.lowerarmleft.cubeList.add(new ModelBox(lowerarmleft, 16, 28, -0.2F, -5.0F, -1.0F, 0, 5, 10, 0.0F, true));

        this.handleft = new AdvancedModelRenderer(this);
        this.handleft.setRotationPoint(0.05F, 0.25F, 4.0F);
        this.lowerarmleft.addChild(handleft);
        this.setRotateAngle(handleft, 0.6981F, 0.1309F, 0.0F);
        this.handleft.cubeList.add(new ModelBox(handleft, 26, 58, -0.45F, -0.65F, -0.3F, 1, 1, 7, 0.0F, true));

        this.fingerleft2 = new AdvancedModelRenderer(this);
        this.fingerleft2.setRotationPoint(-0.05F, 0.15F, -0.25F);
        this.handleft.addChild(fingerleft2);
        this.setRotateAngle(fingerleft2, -0.3927F, 0.0F, 0.0F);
        this.fingerleft2.cubeList.add(new ModelBox(fingerleft2, 52, 53, -0.45F, -0.65F, -0.05F, 1, 1, 3, 0.0F, true));

        this.fingerleft = new AdvancedModelRenderer(this);
        this.fingerleft.setRotationPoint(-0.05F, -0.25F, 0.0F);
        this.handleft.addChild(fingerleft);
        this.setRotateAngle(fingerleft, 0.1309F, 0.0F, 0.0F);
        this.fingerleft.cubeList.add(new ModelBox(fingerleft, 34, 31, -0.45F, -0.65F, -0.05F, 1, 1, 4, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -1.0F, -4.4F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2618F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 52, 59, -1.5F, -1.75F, -5.0F, 3, 4, 5, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 34, 44, -1.5F, 2.25F, -5.0F, 3, 1, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -4.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.6545F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 15, 55, -1.0F, -1.25F, -5.0F, 2, 3, 7, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 22, 7, -1.0F, 1.75F, -3.0F, 2, 1, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.075F, -4.7F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0524F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0531F, -0.637F);
        this.neck3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 20, -1.0F, -0.1299F, 0.059F, 2, 1, 1, -0.03F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.9736F, -2.3931F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6458F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 26, -1.0F, -0.6405F, -0.2188F, 2, 3, 3, -0.025F, false));

        this.throatPouch = new AdvancedModelRenderer(this);
        this.throatPouch.setRotationPoint(0.0F, 2.6892F, -0.951F);
        this.neck3.addChild(throatPouch);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throatPouch.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6458F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 51, -1.0F, -1.8785F, -0.338F, 2, 2, 2, -0.04F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.1486F, -2.1681F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.9599F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 60, 45, -1.0F, -0.9184F, -1.9459F, 2, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 38, -1.0F, 0.0816F, -2.9459F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 60, 41, -0.5F, 0.0816F, -5.6959F, 1, 1, 3, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 31, -1.0F, -0.6684F, -2.9459F, 2, 1, 1, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2624F, -4.7084F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4014F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.5F, -0.024F, -1.0417F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6789F, -2.9153F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 20, -0.5F, -0.0858F, -1.8815F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.0816F, -5.6959F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 55, -1.0F, -1.01F, 0.0F, 1, 1, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 11, -0.1F, -0.81F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.0816F, -5.6959F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1309F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 11, 0.1F, -0.81F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 55, 0.0F, -1.01F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.9184F, -1.9459F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1571F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 6, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0566F, -0.4459F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 20, -1.0F, 0.0F, -2.5F, 2, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 27, -1.0F, -1.75F, -1.825F, 2, 2, 2, -0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.8F, -2.45F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1232F, 0.1299F, 0.016F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 55, -0.6476F, -0.795F, -2.6769F, 1, 1, 3, -0.01F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 10, 0.2524F, -0.995F, -2.6769F, 0, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.8F, -2.45F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1232F, -0.1299F, -0.016F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 10, -0.2524F, -0.995F, -2.6769F, 0, 1, 3, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 55, -0.3524F, -0.795F, -2.6769F, 1, 1, 3, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.8F, -2.45F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1222F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 60, 23, -1.0F, -0.8F, -2.7F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(upperlegright, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegleft, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmright, -0.5236F, -0.3491F, 0.0F);
        this.setRotateAngle(upperarmleft, -0.5236F, 0.3491F, 0.0F);
        this.setRotateAngle(toeright, -1.309F, 0.0F, 0.0F);
        this.setRotateAngle(toeleft, -1.309F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegright, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegleft, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmright, -1.8326F, 0.2618F, 0.0F);
        this.setRotateAngle(lowerarmleft, -1.8326F, -0.2618F, 0.0F);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(handright, 0.6981F, -0.1309F, 0.0F);
        this.setRotateAngle(handleft, 0.6981F, 0.1309F, 0.0F);
        this.setRotateAngle(footright, -0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(footleft, -0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(fingerright2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(fingerright, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(fingerleft2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(fingerleft, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0436F);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, -0.0436F);
        this.setRotateAngle(cube_r15, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1232F, -0.1299F, -0.016F);
        this.setRotateAngle(cube_r13, 0.1232F, 0.1299F, 0.016F);
        this.setRotateAngle(cube_r12, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.offsetY = -0.01F;
        this.body.offsetZ = -0.03F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(upperlegright, -1.9648F, 0.1739F, -0.0154F);
        this.setRotateAngle(upperlegleft, -1.9648F, -0.1739F, 0.0154F);
        this.setRotateAngle(upperarmright, -0.7946F, -0.0046F, -0.1925F);
        this.setRotateAngle(upperarmleft, -0.3164F, 0.0816F, 0.1514F);
        this.setRotateAngle(toeright, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(toeleft, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0721F, 0.6049F, 0.0911F);
        this.setRotateAngle(tail3, -0.1306F, 0.4833F, 0.0121F);
        this.setRotateAngle(tail2, 0.2676F, 0.339F, 0.0848F);
        this.setRotateAngle(tail1, -0.0447F, 0.1298F, -0.0172F);
        this.setRotateAngle(neck3, 0.1202F, -0.038F, -0.0486F);
        this.setRotateAngle(neck2, -0.5416F, -0.1658F, -0.1021F);
        this.setRotateAngle(neck1, -0.3905F, -0.0973F, -0.007F);
        this.setRotateAngle(lowerlegright, 1.6144F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegleft, 1.6144F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmright, -2.0354F, 0.1619F, -0.3425F);
        this.setRotateAngle(lowerarmleft, -1.9009F, -0.0118F, -0.0707F);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.9486F, 0.1782F, -0.1265F);
        this.setRotateAngle(handright, 0.6219F, 0.5297F, 0.6892F);
        this.setRotateAngle(handleft, 1.3196F, -0.8527F, -1.3515F);
        this.setRotateAngle(footright, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(footleft, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(fingerright2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(fingerright, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(fingerleft2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(fingerleft, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0436F);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, -0.0436F);
        this.setRotateAngle(cube_r15, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1232F, -0.1299F, -0.016F);
        this.setRotateAngle(cube_r13, 0.1232F, 0.1299F, 0.016F);
        this.setRotateAngle(cube_r12, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1134F, 0.0F, 0.0F);
        this.hips.offsetY = 0.295F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = 0.1F;
        this.base.offsetX = 0.55F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(240);
        this.base.rotateAngleX = (float)Math.toRadians(-0);
        this.base.rotateAngleZ = (float)Math.toRadians(3);
        this.base.scaleChildren = true;
        float scaler = 0.575F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.0F, 4.0F, 0.0F);
        this.setRotateAngle(upperlegright, -1.9648F, 0.1739F, -0.0154F);
        this.setRotateAngle(upperlegleft, -1.9648F, -0.1739F, 0.0154F);
        this.setRotateAngle(upperarmright, -0.7946F, -0.0046F, -0.1925F);
        this.setRotateAngle(upperarmleft, -0.3164F, 0.0816F, 0.1514F);
        this.setRotateAngle(toeright, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(toeleft, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0721F, 0.6049F, 0.0911F);
        this.setRotateAngle(tail3, -0.1306F, 0.4833F, 0.0121F);
        this.setRotateAngle(tail2, 0.2676F, 0.339F, 0.0848F);
        this.setRotateAngle(tail1, -0.0447F, 0.1298F, -0.0172F);
        this.setRotateAngle(neck3, 0.1202F, -0.038F, -0.0486F);
        this.setRotateAngle(neck2, -0.5416F, -0.1658F, -0.1021F);
        this.setRotateAngle(neck1, -0.3905F, -0.0973F, -0.007F);
        this.setRotateAngle(lowerlegright, 1.6144F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegleft, 1.6144F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmright, -2.0354F, 0.1619F, -0.3425F);
        this.setRotateAngle(lowerarmleft, -1.9009F, -0.0118F, -0.0707F);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.9486F, 0.1782F, -0.1265F);
        this.setRotateAngle(handright, 0.6219F, 0.5297F, 0.6892F);
        this.setRotateAngle(handleft, 1.3196F, -0.8527F, -1.3515F);
        this.setRotateAngle(footright, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(footleft, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(fingerright2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(fingerright, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(fingerleft2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(fingerleft, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0436F);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, -0.0436F);
        this.setRotateAngle(cube_r15, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1232F, -0.1299F, -0.016F);
        this.setRotateAngle(cube_r13, 0.1232F, 0.1299F, 0.016F);
        this.setRotateAngle(cube_r12, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1134F, 0.0F, 0.0F);
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraOrnitholestes EntityMegalosaurus = (EntityPrehistoricFloraOrnitholestes) e;
        this.base.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.upperarmleft, this.lowerarmleft, this.handleft};
        AdvancedModelRenderer[] ArmR = {this.upperarmright, this.lowerarmright, this.handright};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.jaw, 0.1F, 0.05F, true, 3F, 0.05F, f2, 1F);

                    this.walk(this.upperarmleft, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.upperarmright, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.upperarmleft, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.upperarmright, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraOrnitholestes ee = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animClean(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-15.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-15.25 + (((tickAnim - 15) / 10) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-15.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25 + (((tickAnim - 15) / 10) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -0.55 + (((tickAnim - 15) / 10) * (10.75-(-0.55)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10.75 + (((tickAnim - 25) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10 + (((tickAnim - 15) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10 + (((tickAnim - 25) / 15) * (0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10 + (((tickAnim - 15) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5 + (((tickAnim - 25) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 15) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5 + (((tickAnim - 25) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 35) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.25 + (((tickAnim - 4) / 8) * (10.25-(5.25)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 12) / 18) * (0-(10.25)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 3 + (((tickAnim - 4) / 8) * (6.75-(3)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 6.75 + (((tickAnim - 12) / 18) * (0-(6.75)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 3 + (((tickAnim - 4) / 8) * (14.5-(3)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 14.5 + (((tickAnim - 12) / 7) * (12.04-(14.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 12.04 + (((tickAnim - 19) / 6) * (8.06-(12.04)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 8.06 + (((tickAnim - 25) / 5) * (0-(8.06)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -6.25 + (((tickAnim - 11) / 19) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 11) / 9) * (-11.75-(-9.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -11.75 + (((tickAnim - 20) / 10) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 11) / 9) * (-19.75-(-11.75)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19.75 + (((tickAnim - 20) / 10) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.5 + (((tickAnim - 11) / 2) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -0.5 + (((tickAnim - 16) / 2) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -0.5 + (((tickAnim - 21) / 9) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 11) / 9) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.25 + (((tickAnim - 20) / 10) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 11) / 19) * (0-(10.75)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -2.425 + (((tickAnim - 9) / 9) * (-4.47-(-2.425)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -4.47 + (((tickAnim - 18) / 13) * (-4.47-(-4.47)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 31) / 11) * (0-(0)));
            yy = -4.47 + (((tickAnim - 31) / 11) * (-2.425-(-4.47)));
            zz = 0 + (((tickAnim - 31) / 11) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -2.425 + (((tickAnim - 42) / 8) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 4.5 + (((tickAnim - 19) / 9) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 4.5 + (((tickAnim - 28) / 22) * (0-(4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0.875 + (((tickAnim - 19) / 9) * (0.875-(0.875)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0.875 + (((tickAnim - 28) / 22) * (0-(0.875)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.67 + (((tickAnim - 4) / 8) * (14.84-(5.67)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.84 + (((tickAnim - 12) / 4) * (19.56-(14.84)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19.56 + (((tickAnim - 16) / 3) * (21.5-(19.56)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.55-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -9.55 + (((tickAnim - 4) / 8) * (-24.15-(-9.55)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -24.15 + (((tickAnim - 12) / 4) * (-31.21-(-24.15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.21 + (((tickAnim - 16) / 3) * (-34.75-(-31.21)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footright.rotationPointX = this.footright.rotationPointX + (float)(xx);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(yy);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 4) / 15) * (13.75-(3.49)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 0) {
            xx = 11.63 + (((tickAnim - 39) / -39) * (-(11.63)));
            yy = 0 + (((tickAnim - 39) / -39) * (-(0)));
            zz = 0 + (((tickAnim - 39) / -39) * (-(0)));
        }

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -15.25 + (((tickAnim - 0) / 18) * (6.25-(-15.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.25 + (((tickAnim - 18) / 15) * (29-(6.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 33) / 17) * (-15.25-(29)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = -0.475 + (((tickAnim - 18) / 32) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -9.25 + (((tickAnim - 0) / 11) * (-2.76-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -2.76 + (((tickAnim - 11) / 7) * (-2-(-2.76)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 18) / 15) * (12.75-(-2)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 12.75 + (((tickAnim - 33) / 9) * (22.06-(12.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 22.06 + (((tickAnim - 42) / 8) * (-9.25-(22.06)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.75 + (((tickAnim - 5) / 6) * (-3.82-(0.75)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -3.82 + (((tickAnim - 11) / 7) * (-1-(-3.82)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1 + (((tickAnim - 18) / 15) * (17-(-1)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 17 + (((tickAnim - 33) / 4) * (-8.94-(17)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -8.94 + (((tickAnim - 37) / 5) * (-41.28-(-8.94)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -41.28 + (((tickAnim - 42) / 8) * (0-(-41.28)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 28.25 + (((tickAnim - 0) / 5) * (14-(28.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 14 + (((tickAnim - 5) / 6) * (8.93-(14)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 8.93 + (((tickAnim - 11) / 3) * (2.59-(8.93)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.59 + (((tickAnim - 14) / 4) * (-2.75-(2.59)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 18) / 2) * (-7.67-(-2.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -7.67 + (((tickAnim - 20) / 4) * (-10.11-(-7.67)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -10.11 + (((tickAnim - 24) / 4) * (-1.92-(-10.11)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.92 + (((tickAnim - 28) / 5) * (24.75-(-1.92)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 24.75 + (((tickAnim - 33) / 9) * (35.36-(24.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 35.36 + (((tickAnim - 42) / 4) * (13.72-(35.36)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 13.72 + (((tickAnim - 46) / 4) * (28.25-(13.72)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toeleft, toeleft.rotateAngleX + (float) Math.toRadians(xx), toeleft.rotateAngleY + (float) Math.toRadians(yy), toeleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 0) / 50) * (-2-(-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 0) / 50) * (4-(4)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.28486 + (((tickAnim - 0) / 50) * (-0.28486-(-0.28486)));
            yy = -8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 0) / 50) * (-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = 4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.8609 + (((tickAnim - 0) / 50) * (-0.8609-(-0.8609)));
            yy = -18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1 + (((tickAnim - 0) / 50) * (-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1-(-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1)));
            zz = -0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 0) / 50) * (-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.14987 + (((tickAnim - 0) / 50) * (-2.14987-(-2.14987)));
            yy = 2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 0) / 50) * (2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animClean(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-102.78252-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-29.55548-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (18.89343-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -102.78252 + (((tickAnim - 13) / 4) * (-100.78252-(-102.78252)));
            yy = -29.55548 + (((tickAnim - 13) / 4) * (-29.55548-(-29.55548)));
            zz = 18.89343 + (((tickAnim - 13) / 4) * (18.89343-(18.89343)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -100.78252 + (((tickAnim - 17) / 2) * (-102.78252-(-100.78252)));
            yy = -29.55548 + (((tickAnim - 17) / 2) * (-29.55548-(-29.55548)));
            zz = 18.89343 + (((tickAnim - 17) / 2) * (18.89343-(18.89343)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -102.78252 + (((tickAnim - 19) / 3) * (-100.78252-(-102.78252)));
            yy = -29.55548 + (((tickAnim - 19) / 3) * (-29.55548-(-29.55548)));
            zz = 18.89343 + (((tickAnim - 19) / 3) * (18.89343-(18.89343)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -100.78252 + (((tickAnim - 22) / 11) * (-93.63409-(-100.78252)));
            yy = -29.55548 + (((tickAnim - 22) / 11) * (-16.6632-(-29.55548)));
            zz = 18.89343 + (((tickAnim - 22) / 11) * (-8.4529-(18.89343)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -93.63409 + (((tickAnim - 33) / 5) * (-93.71061-(-93.63409)));
            yy = -16.6632 + (((tickAnim - 33) / 5) * (-24.89236-(-16.6632)));
            zz = -8.4529 + (((tickAnim - 33) / 5) * (-2.97889-(-8.4529)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = -93.71061 + (((tickAnim - 38) / 13) * (-93.61729-(-93.71061)));
            yy = -24.89236 + (((tickAnim - 38) / 13) * (-22.8115-(-24.89236)));
            zz = -2.97889 + (((tickAnim - 38) / 13) * (-4.36775-(-2.97889)));
        }
        else if (tickAnim >= 51 && tickAnim < 64) {
            xx = -93.61729 + (((tickAnim - 51) / 13) * (0-(-93.61729)));
            yy = -22.8115 + (((tickAnim - 51) / 13) * (0-(-22.8115)));
            zz = -4.36775 + (((tickAnim - 51) / 13) * (0-(-4.36775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));

        this.upperarmleft.rotationPointX = this.upperarmleft.rotationPointX + (float)(-0.525);
        this.upperarmleft.rotationPointY = this.upperarmleft.rotationPointY - (float)(0);
        this.upperarmleft.rotationPointZ = this.upperarmleft.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -20.75 + (((tickAnim - 13) / 3) * (-20.55722-(-20.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (-2.84678-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-7.74647-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -20.55722 + (((tickAnim - 16) / 2) * (-20.75-(-20.55722)));
            yy = -2.84678 + (((tickAnim - 16) / 2) * (0-(-2.84678)));
            zz = -7.74647 + (((tickAnim - 16) / 2) * (0-(-7.74647)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20.75 + (((tickAnim - 18) / 2) * (-20.55722-(-20.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (-2.84678-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-7.74647-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -20.55722 + (((tickAnim - 20) / 3) * (-20.75-(-20.55722)));
            yy = -2.84678 + (((tickAnim - 20) / 3) * (0-(-2.84678)));
            zz = -7.74647 + (((tickAnim - 20) / 3) * (0-(-7.74647)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -20.75 + (((tickAnim - 23) / 10) * (9.88784-(-20.75)));
            yy = 0 + (((tickAnim - 23) / 10) * (-8.99432-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (-6.36861-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = 9.88784 + (((tickAnim - 33) / 18) * (10.23407-(9.88784)));
            yy = -8.99432 + (((tickAnim - 33) / 18) * (3.45969-(-8.99432)));
            zz = -6.36861 + (((tickAnim - 33) / 18) * (-7.49649-(-6.36861)));
        }
        else if (tickAnim >= 51 && tickAnim < 64) {
            xx = 10.23407 + (((tickAnim - 51) / 13) * (0-(10.23407)));
            yy = 3.45969 + (((tickAnim - 51) / 13) * (0-(3.45969)));
            zz = -7.49649 + (((tickAnim - 51) / 13) * (0-(-7.49649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-22.5-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -22.5 + (((tickAnim - 14) / 4) * (0-(-22.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 31) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fingerleft2, fingerleft2.rotateAngleX + (float) Math.toRadians(xx), fingerleft2.rotateAngleY + (float) Math.toRadians(yy), fingerleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -17.5 + (((tickAnim - 14) / 4) * (-25-(-17.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -25 + (((tickAnim - 18) / 4) * (-7.5-(-25)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            yy = -7.5 + (((tickAnim - 22) / 9) * (0-(-7.5)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 31) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fingerleft, fingerleft.rotateAngleX + (float) Math.toRadians(xx), fingerleft.rotateAngleY + (float) Math.toRadians(yy), fingerleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20.00668-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.96156-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.39033-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20.00668 + (((tickAnim - 13) / 7) * (20.00668-(20.00668)));
            yy = -1.96156 + (((tickAnim - 13) / 7) * (-1.96156-(-1.96156)));
            zz = -0.39033 + (((tickAnim - 13) / 7) * (-0.39033-(-0.39033)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20.00668 + (((tickAnim - 20) / 10) * (-0.40646-(20.00668)));
            yy = -1.96156 + (((tickAnim - 20) / 10) * (8.63217-(-1.96156)));
            zz = -0.39033 + (((tickAnim - 20) / 10) * (-10.92067-(-0.39033)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -0.40646 + (((tickAnim - 30) / 9) * (9.59354-(-0.40646)));
            yy = 8.63217 + (((tickAnim - 30) / 9) * (8.63217-(8.63217)));
            zz = -10.92067 + (((tickAnim - 30) / 9) * (-10.92067-(-10.92067)));
        }
        else if (tickAnim >= 39 && tickAnim < 51) {
            xx = 9.59354 + (((tickAnim - 39) / 12) * (9.59354-(9.59354)));
            yy = 8.63217 + (((tickAnim - 39) / 12) * (8.63217-(8.63217)));
            zz = -10.92067 + (((tickAnim - 39) / 12) * (-10.92067-(-10.92067)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 9.59354 + (((tickAnim - 51) / 9) * (0-(9.59354)));
            yy = 8.63217 + (((tickAnim - 51) / 9) * (0-(8.63217)));
            zz = -10.92067 + (((tickAnim - 51) / 9) * (0-(-10.92067)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 60) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20.00706-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-21.8308-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.5299-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 20.00706 + (((tickAnim - 13) / 4) * (22.71559-(20.00706)));
            yy = -21.8308 + (((tickAnim - 13) / 4) * (-23.684-(-21.8308)));
            zz = 9.5299 + (((tickAnim - 13) / 4) * (2.55335-(9.5299)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 22.71559 + (((tickAnim - 17) / 1) * (19.11641-(22.71559)));
            yy = -23.684 + (((tickAnim - 17) / 1) * (-21.03404-(-23.684)));
            zz = 2.55335 + (((tickAnim - 17) / 1) * (12.04358-(2.55335)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 19.11641 + (((tickAnim - 18) / 0) * (21.34874-(19.11641)));
            yy = -21.03404 + (((tickAnim - 18) / 0) * (-22.77248-(-21.03404)));
            zz = 12.04358 + (((tickAnim - 18) / 0) * (6.05052-(12.04358)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 21.34874 + (((tickAnim - 18) / 2) * (20.00706-(21.34874)));
            yy = -22.77248 + (((tickAnim - 18) / 2) * (-21.8308-(-22.77248)));
            zz = 6.05052 + (((tickAnim - 18) / 2) * (9.5299-(6.05052)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20.00706 + (((tickAnim - 20) / 10) * (35.39468-(20.00706)));
            yy = -21.8308 + (((tickAnim - 20) / 10) * (-18.1224-(-21.8308)));
            zz = 9.5299 + (((tickAnim - 20) / 10) * (-8.40481-(9.5299)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 35.39468 + (((tickAnim - 30) / 9) * (42.64468-(35.39468)));
            yy = -18.1224 + (((tickAnim - 30) / 9) * (-18.1224-(-18.1224)));
            zz = -8.40481 + (((tickAnim - 30) / 9) * (-8.40481-(-8.40481)));
        }
        else if (tickAnim >= 39 && tickAnim < 51) {
            xx = 42.64468 + (((tickAnim - 39) / 12) * (42.64468-(42.64468)));
            yy = -18.1224 + (((tickAnim - 39) / 12) * (-18.1224-(-18.1224)));
            zz = -8.40481 + (((tickAnim - 39) / 12) * (-8.40481-(-8.40481)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 42.64468 + (((tickAnim - 51) / 9) * (0-(42.64468)));
            yy = -18.1224 + (((tickAnim - 51) / 9) * (0-(-18.1224)));
            zz = -8.40481 + (((tickAnim - 51) / 9) * (0-(-8.40481)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 60) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (24.7442-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-6.82874-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.945-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 24.7442 + (((tickAnim - 13) / 7) * (24.7442-(24.7442)));
            yy = -6.82874 + (((tickAnim - 13) / 7) * (-6.82874-(-6.82874)));
            zz = 2.945 + (((tickAnim - 13) / 7) * (2.945-(2.945)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.7442 + (((tickAnim - 20) / 10) * (24.43121-(24.7442)));
            yy = -6.82874 + (((tickAnim - 20) / 10) * (-14.701-(-6.82874)));
            zz = 2.945 + (((tickAnim - 20) / 10) * (-2.69969-(2.945)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 24.43121 + (((tickAnim - 30) / 9) * (33.18121-(24.43121)));
            yy = -14.701 + (((tickAnim - 30) / 9) * (-14.701-(-14.701)));
            zz = -2.69969 + (((tickAnim - 30) / 9) * (-2.69969-(-2.69969)));
        }
        else if (tickAnim >= 39 && tickAnim < 51) {
            xx = 33.18121 + (((tickAnim - 39) / 12) * (33.18121-(33.18121)));
            yy = -14.701 + (((tickAnim - 39) / 12) * (-14.701-(-14.701)));
            zz = -2.69969 + (((tickAnim - 39) / 12) * (-2.69969-(-2.69969)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 33.18121 + (((tickAnim - 51) / 9) * (0-(33.18121)));
            yy = -14.701 + (((tickAnim - 51) / 9) * (0-(-14.701)));
            zz = -2.69969 + (((tickAnim - 51) / 9) * (0-(-2.69969)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 60) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 2) * (15-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 62) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 62) / 2) * (-17.5-(15)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 64) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 5) * (0-(0)));
            zz = -17.5 + (((tickAnim - 64) / 5) * (0-(-17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (5.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 5.25 + (((tickAnim - 13) / 7) * (5.25-(5.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (23.83015-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-3.58223-(0)));
            zz = 5.25 + (((tickAnim - 20) / 10) * (10.67734-(5.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 23.83015 + (((tickAnim - 30) / 9) * (23.99598-(23.83015)));
            yy = -3.58223 + (((tickAnim - 30) / 9) * (0.55192-(-3.58223)));
            zz = 10.67734 + (((tickAnim - 30) / 9) * (4.41609-(10.67734)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 23.99598 + (((tickAnim - 39) / 3) * (23.95079-(23.99598)));
            yy = 0.55192 + (((tickAnim - 39) / 3) * (-1.93094-(0.55192)));
            zz = 4.41609 + (((tickAnim - 39) / 3) * (8.16971-(4.41609)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 23.95079 + (((tickAnim - 42) / 2) * (23.99598-(23.95079)));
            yy = -1.93094 + (((tickAnim - 42) / 2) * (0.55192-(-1.93094)));
            zz = 8.16971 + (((tickAnim - 42) / 2) * (4.41609-(8.16971)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 23.99598 + (((tickAnim - 44) / 4) * (23.95079-(23.99598)));
            yy = 0.55192 + (((tickAnim - 44) / 4) * (-1.93094-(0.55192)));
            zz = 4.41609 + (((tickAnim - 44) / 4) * (8.16971-(4.41609)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 23.95079 + (((tickAnim - 48) / 3) * (23.99598-(23.95079)));
            yy = -1.93094 + (((tickAnim - 48) / 3) * (0.55192-(-1.93094)));
            zz = 8.16971 + (((tickAnim - 48) / 3) * (4.41609-(8.16971)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 23.99598 + (((tickAnim - 51) / 9) * (0-(23.99598)));
            yy = 0.55192 + (((tickAnim - 51) / 9) * (0-(0.55192)));
            zz = 4.41609 + (((tickAnim - 51) / 9) * (0-(4.41609)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 60) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 2) * (10-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 62) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 62) / 2) * (-3.33-(10)));
        }
        else if (tickAnim >= 64 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 64) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 3) * (0-(0)));
            zz = -3.33 + (((tickAnim - 64) / 3) * (3.34-(-3.33)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 67) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 2) * (0-(0)));
            zz = 3.34 + (((tickAnim - 67) / 2) * (0-(3.34)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (10-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 10 + (((tickAnim - 38) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 46) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 48) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 10 + (((tickAnim - 52) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 52) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 3) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 10) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -3.1 + (((tickAnim - 10) / 10) * (-5.2-(-3.1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.45938-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (-0.78175-(0)));
            zz = -5.2 + (((tickAnim - 20) / 10) * (-5.94904-(-5.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -7.45938 + (((tickAnim - 30) / 10) * (-7.5-(-7.45938)));
            yy = -0.78175 + (((tickAnim - 30) / 10) * (0-(-0.78175)));
            zz = -5.94904 + (((tickAnim - 30) / 10) * (-5.1-(-5.94904)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 40) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = -5.1 + (((tickAnim - 40) / 20) * (0-(-5.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -0.4 + (((tickAnim - 10) / 20) * (-0.9-(-0.4)));
            yy = 0.4 + (((tickAnim - 10) / 20) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.9 + (((tickAnim - 30) / 20) * (-0.4-(-0.9)));
            yy = 0.4 + (((tickAnim - 30) / 20) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -0.4 + (((tickAnim - 50) / 10) * (0-(-0.4)));
            yy = 0.4 + (((tickAnim - 50) / 10) * (0-(0.4)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5017-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.13072-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.49429-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.5017 + (((tickAnim - 10) / 10) * (6.25725-(7.5017)));
            yy = 0.13072 + (((tickAnim - 10) / 10) * (0.28293-(0.13072)));
            zz = 1.49429 + (((tickAnim - 10) / 10) * (2.73505-(1.49429)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.25725 + (((tickAnim - 20) / 10) * (5.00773-(6.25725)));
            yy = 0.28293 + (((tickAnim - 20) / 10) * (0.30458-(0.28293)));
            zz = 2.73505 + (((tickAnim - 20) / 10) * (2.73244-(2.73505)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5.00773 + (((tickAnim - 30) / 10) * (4.7591-(5.00773)));
            yy = 0.30458 + (((tickAnim - 30) / 10) * (0.38022-(0.30458)));
            zz = 2.73244 + (((tickAnim - 30) / 10) * (2.72225-(2.73244)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 4.7591 + (((tickAnim - 40) / 2) * (4.04964-(4.7591)));
            yy = 0.38022 + (((tickAnim - 40) / 2) * (0.35303-(0.38022)));
            zz = 2.72225 + (((tickAnim - 40) / 2) * (2.47371-(2.72225)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 4.04964 + (((tickAnim - 42) / 8) * (3.50233-(4.04964)));
            yy = 0.35303 + (((tickAnim - 42) / 8) * (0.21704-(0.35303)));
            zz = 2.47371 + (((tickAnim - 42) / 8) * (1.23102-(2.47371)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 3.50233 + (((tickAnim - 50) / 10) * (0-(3.50233)));
            yy = 0.21704 + (((tickAnim - 50) / 10) * (0-(0.21704)));
            zz = 1.23102 + (((tickAnim - 50) / 10) * (0-(1.23102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 42) {
            xx = -2.5 + (((tickAnim - 10) / 32) * (0.5-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 32) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0.5 + (((tickAnim - 42) / 8) * (-2.5-(0.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 50) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 10) / 20) * (6-(2.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 30) / 20) * (4-(6)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 4 + (((tickAnim - 50) / 10) * (0-(4)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (-3-(0)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 2.5 + (((tickAnim - 10) / 20) * (4-(2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -3 + (((tickAnim - 30) / 30) * (0-(-3)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 4 + (((tickAnim - 30) / 30) * (0-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toeright, toeright.rotateAngleX + (float) Math.toRadians(xx), toeright.rotateAngleY + (float) Math.toRadians(yy), toeright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.0012-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.13917-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.99027-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 8.0012 + (((tickAnim - 10) / 7) * (-23.71191-(8.0012)));
            yy = 0.13917 + (((tickAnim - 10) / 7) * (-25.5152-(0.13917)));
            zz = 0.99027 + (((tickAnim - 10) / 7) * (3.14256-(0.99027)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -23.71191 + (((tickAnim - 17) / 6) * (-13.71191-(-23.71191)));
            yy = -25.5152 + (((tickAnim - 17) / 6) * (-25.5152-(-25.5152)));
            zz = 3.14256 + (((tickAnim - 17) / 6) * (3.14256-(3.14256)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -13.71191 + (((tickAnim - 23) / 5) * (-1.2937-(-13.71191)));
            yy = -25.5152 + (((tickAnim - 23) / 5) * (-26.18129-(-25.5152)));
            zz = 3.14256 + (((tickAnim - 23) / 5) * (-8.0005-(3.14256)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -1.2937 + (((tickAnim - 28) / 3) * (-15.45812-(-1.2937)));
            yy = -26.18129 + (((tickAnim - 28) / 3) * (-24.98173-(-26.18129)));
            zz = -8.0005 + (((tickAnim - 28) / 3) * (-1.32886-(-8.0005)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -15.45812 + (((tickAnim - 31) / 2) * (-13.71191-(-15.45812)));
            yy = -24.98173 + (((tickAnim - 31) / 2) * (-25.5152-(-24.98173)));
            zz = -1.32886 + (((tickAnim - 31) / 2) * (3.14256-(-1.32886)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -13.71191 + (((tickAnim - 33) / 4) * (2.41833-(-13.71191)));
            yy = -25.5152 + (((tickAnim - 33) / 4) * (-26.75177-(-25.5152)));
            zz = 3.14256 + (((tickAnim - 33) / 4) * (-10.71958-(3.14256)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 2.41833 + (((tickAnim - 37) / 2) * (-29.75981-(2.41833)));
            yy = -26.75177 + (((tickAnim - 37) / 2) * (-26.00983-(-26.75177)));
            zz = -10.71958 + (((tickAnim - 37) / 2) * (-2.4023-(-10.71958)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = -29.75981 + (((tickAnim - 39) / 2) * (-13.71191-(-29.75981)));
            yy = -26.00983 + (((tickAnim - 39) / 2) * (-25.5152-(-26.00983)));
            zz = -2.4023 + (((tickAnim - 39) / 2) * (3.14256-(-2.4023)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -13.71191 + (((tickAnim - 41) / 2) * (-7.58167-(-13.71191)));
            yy = -25.5152 + (((tickAnim - 41) / 2) * (-26.75177-(-25.5152)));
            zz = 3.14256 + (((tickAnim - 41) / 2) * (-10.71958-(3.14256)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -7.58167 + (((tickAnim - 43) / 4) * (-17.77506-(-7.58167)));
            yy = -26.75177 + (((tickAnim - 43) / 4) * (-16.64318-(-26.75177)));
            zz = -10.71958 + (((tickAnim - 43) / 4) * (-9.27899-(-10.71958)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -17.77506 + (((tickAnim - 47) / 3) * (4.5012-(-17.77506)));
            yy = -16.64318 + (((tickAnim - 47) / 3) * (0.13917-(-16.64318)));
            zz = -9.27899 + (((tickAnim - 47) / 3) * (0.99027-(-9.27899)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 4.5012 + (((tickAnim - 50) / 10) * (0-(4.5012)));
            yy = 0.13917 + (((tickAnim - 50) / 10) * (0-(0.13917)));
            zz = 0.99027 + (((tickAnim - 50) / 10) * (0-(0.99027)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -5 + (((tickAnim - 10) / 7) * (37.5-(-5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 37.5 + (((tickAnim - 17) / 6) * (-17.5-(37.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17.5 + (((tickAnim - 23) / 5) * (12.5-(-17.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 12.5 + (((tickAnim - 28) / 5) * (-17.5-(12.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -17.5 + (((tickAnim - 33) / 4) * (30-(-17.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 30 + (((tickAnim - 37) / 4) * (-17.5-(30)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = -17.5 + (((tickAnim - 41) / 1) * (20.83-(-17.5)));
            yy = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 20.83 + (((tickAnim - 42) / 1) * (52.5-(20.83)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 52.5 + (((tickAnim - 43) / 4) * (36.25-(52.5)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 36.25 + (((tickAnim - 47) / 3) * (-5-(36.25)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 50) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 5.5 + (((tickAnim - 10) / 7) * (-50-(5.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -50 + (((tickAnim - 17) / 6) * (-17.5-(-50)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17.5 + (((tickAnim - 23) / 5) * (-50-(-17.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -50 + (((tickAnim - 28) / 5) * (-17.5-(-50)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -17.5 + (((tickAnim - 33) / 4) * (-40-(-17.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -40 + (((tickAnim - 37) / 4) * (-17.5-(-40)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = -17.5 + (((tickAnim - 41) / 1) * (-45.83-(-17.5)));
            yy = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -45.83 + (((tickAnim - 42) / 1) * (2.5-(-45.83)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 2.5 + (((tickAnim - 43) / 4) * (-28.75-(2.5)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -28.75 + (((tickAnim - 47) / 3) * (5.5-(-28.75)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5.5 + (((tickAnim - 50) / 10) * (0-(5.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (122.5-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 122.5 + (((tickAnim - 17) / 6) * (87.5-(122.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 87.5 + (((tickAnim - 23) / 5) * (122.5-(87.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 122.5 + (((tickAnim - 28) / 5) * (87.5-(122.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 87.5 + (((tickAnim - 33) / 4) * (142.5-(87.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 142.5 + (((tickAnim - 37) / 4) * (87.5-(142.5)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 87.5 + (((tickAnim - 41) / 2) * (122.5-(87.5)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 122.5 + (((tickAnim - 43) / 4) * (111.25-(122.5)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 111.25 + (((tickAnim - 47) / 1) * (30.63-(111.25)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 30.63 + (((tickAnim - 48) / 2) * (0-(30.63)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
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
        this.setRotateAngle(toeleft, toeleft.rotateAngleX + (float) Math.toRadians(xx), toeleft.rotateAngleY + (float) Math.toRadians(yy), toeleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 10) / 50) * (0-(5)));
            yy = 0 + (((tickAnim - 10) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.57779-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-14.2906-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.60659-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 10.57779 + (((tickAnim - 10) / 17) * (11.85-(10.57779)));
            yy = -14.2906 + (((tickAnim - 10) / 17) * (-18.23-(-14.2906)));
            zz = -4.60659 + (((tickAnim - 10) / 17) * (-8.74-(-4.60659)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 11.85 + (((tickAnim - 27) / 11) * (21.76-(11.85)));
            yy = -18.23 + (((tickAnim - 27) / 11) * (-17.94-(-18.23)));
            zz = -8.74 + (((tickAnim - 27) / 11) * (-8.45-(-8.74)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 21.76 + (((tickAnim - 38) / 12) * (11.17-(21.76)));
            yy = -17.94 + (((tickAnim - 38) / 12) * (-16.12-(-17.94)));
            zz = -8.45 + (((tickAnim - 38) / 12) * (-6.53-(-8.45)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 11.17 + (((tickAnim - 50) / 10) * (0-(11.17)));
            yy = -16.12 + (((tickAnim - 50) / 10) * (0-(-16.12)));
            zz = -6.53 + (((tickAnim - 50) / 10) * (0-(-6.53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.06012-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.66383-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (12.58338-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 11.06012 + (((tickAnim - 13) / 30) * (11.06012-(11.06012)));
            yy = 3.66383 + (((tickAnim - 13) / 30) * (3.66383-(3.66383)));
            zz = 12.58338 + (((tickAnim - 13) / 30) * (12.58338-(12.58338)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 11.06012 + (((tickAnim - 43) / 17) * (0-(11.06012)));
            yy = 3.66383 + (((tickAnim - 43) / 17) * (0-(3.66383)));
            zz = 12.58338 + (((tickAnim - 43) / 17) * (0-(12.58338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = -25 + (((tickAnim - 17) / 30) * (-25-(-25)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -25 + (((tickAnim - 47) / 13) * (0-(-25)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.53159-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (7.03175-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (34.39405-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 2.53159 + (((tickAnim - 20) / 30) * (2.53159-(2.53159)));
            yy = 7.03175 + (((tickAnim - 20) / 30) * (7.03175-(7.03175)));
            zz = 34.39405 + (((tickAnim - 20) / 30) * (34.39405-(34.39405)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 2.53159 + (((tickAnim - 50) / 10) * (0-(2.53159)));
            yy = 7.03175 + (((tickAnim - 50) / 10) * (0-(7.03175)));
            zz = 34.39405 + (((tickAnim - 50) / 10) * (0-(34.39405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-32.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (-3.10431-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (10.55881-(0)));
            zz = -32.5 + (((tickAnim - 8) / 10) * (-43.24969-(-32.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = -3.10431 + (((tickAnim - 18) / 25) * (-1.03444-(-3.10431)));
            yy = 10.55881 + (((tickAnim - 18) / 25) * (4.30826-(10.55881)));
            zz = -43.24969 + (((tickAnim - 18) / 25) * (-42.74077-(-43.24969)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -1.03444 + (((tickAnim - 43) / 17) * (0-(-1.03444)));
            yy = 4.30826 + (((tickAnim - 43) / 17) * (0-(4.30826)));
            zz = -42.74077 + (((tickAnim - 43) / 17) * (0-(-42.74077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 47) {
            xx = -17.5 + (((tickAnim - 12) / 35) * (-30-(-17.5)));
            yy = 0 + (((tickAnim - 12) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 35) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -30 + (((tickAnim - 47) / 13) * (0-(-30)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.01042-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.12758-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-21.40631-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 31.01042 + (((tickAnim - 15) / 35) * (31.01042-(31.01042)));
            yy = -7.12758 + (((tickAnim - 15) / 35) * (-7.12758-(-7.12758)));
            zz = -21.40631 + (((tickAnim - 15) / 35) * (-21.40631-(-21.40631)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 31.01042 + (((tickAnim - 50) / 10) * (0-(31.01042)));
            yy = -7.12758 + (((tickAnim - 50) / 10) * (0-(-7.12758)));
            zz = -21.40631 + (((tickAnim - 50) / 10) * (0-(-21.40631)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.481-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.98093-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.43688-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.481 + (((tickAnim - 10) / 10) * (27.33841-(27.481)));
            yy = -4.98093 + (((tickAnim - 10) / 10) * (-0.31317-(-4.98093)));
            zz = 0.43688 + (((tickAnim - 10) / 10) * (2.49012-(0.43688)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 27.33841 + (((tickAnim - 20) / 7) * (22.69685-(27.33841)));
            yy = -0.31317 + (((tickAnim - 20) / 7) * (5.31698-(-0.31317)));
            zz = 2.49012 + (((tickAnim - 20) / 7) * (0.1839-(2.49012)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 22.69685 + (((tickAnim - 27) / 11) * (28.38-(22.69685)));
            yy = 5.31698 + (((tickAnim - 27) / 11) * (-4.48-(5.31698)));
            zz = 0.1839 + (((tickAnim - 27) / 11) * (-1.84-(0.1839)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 28.38 + (((tickAnim - 38) / 12) * (32.93-(28.38)));
            yy = -4.48 + (((tickAnim - 38) / 12) * (-4.73-(-4.48)));
            zz = -1.84 + (((tickAnim - 38) / 12) * (-0.7-(-1.84)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 32.93 + (((tickAnim - 50) / 10) * (0-(32.93)));
            yy = -4.73 + (((tickAnim - 50) / 10) * (0-(-4.73)));
            zz = -0.7 + (((tickAnim - 50) / 10) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (49.49591-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-14.47751-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.96713-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 49.49591 + (((tickAnim - 10) / 10) * (50.12-(49.49591)));
            yy = -14.47751 + (((tickAnim - 10) / 10) * (-14.48-(-14.47751)));
            zz = 3.96713 + (((tickAnim - 10) / 10) * (3.97-(3.96713)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 50.12 + (((tickAnim - 20) / 7) * (54.5-(50.12)));
            yy = -14.48 + (((tickAnim - 20) / 7) * (-14.48-(-14.48)));
            zz = 3.97 + (((tickAnim - 20) / 7) * (3.97-(3.97)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 54.5 + (((tickAnim - 27) / 11) * (54.32-(54.5)));
            yy = -14.48 + (((tickAnim - 27) / 11) * (-14.48-(-14.48)));
            zz = 3.97 + (((tickAnim - 27) / 11) * (3.97-(3.97)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 54.32 + (((tickAnim - 38) / 12) * (53.16-(54.32)));
            yy = -14.48 + (((tickAnim - 38) / 12) * (-14.48-(-14.48)));
            zz = 3.97 + (((tickAnim - 38) / 12) * (3.97-(3.97)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 53.16 + (((tickAnim - 50) / 10) * (0-(53.16)));
            yy = -14.48 + (((tickAnim - 50) / 10) * (0-(-14.48)));
            zz = 3.97 + (((tickAnim - 50) / 10) * (0-(3.97)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -35 + (((tickAnim - 5) / 7) * (5-(-35)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 12) / 8) * (5.94-(5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 5.94 + (((tickAnim - 20) / 7) * (12.5-(5.94)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 12.5 + (((tickAnim - 27) / 11) * (12.68-(12.5)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 12.68 + (((tickAnim - 38) / 12) * (13.84-(12.68)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 13.84 + (((tickAnim - 50) / 5) * (-32.5-(13.84)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -32.5 + (((tickAnim - 55) / 5) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-11.21912-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5.7004-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.557-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -11.21912 + (((tickAnim - 5) / 8) * (18.06161-(-11.21912)));
            yy = -5.7004 + (((tickAnim - 5) / 8) * (-4.46375-(-5.7004)));
            zz = -3.557 + (((tickAnim - 5) / 8) * (-14.33501-(-3.557)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.06161 + (((tickAnim - 13) / 7) * (18.07-(18.06161)));
            yy = -4.46375 + (((tickAnim - 13) / 7) * (-3.87-(-4.46375)));
            zz = -14.33501 + (((tickAnim - 13) / 7) * (-14.52-(-14.33501)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 18.07 + (((tickAnim - 20) / 7) * (17.97-(18.07)));
            yy = -3.87 + (((tickAnim - 20) / 7) * (-3.02-(-3.87)));
            zz = -14.52 + (((tickAnim - 20) / 7) * (-14.75-(-14.52)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 17.97 + (((tickAnim - 27) / 4) * (17.37509-(17.97)));
            yy = -3.02 + (((tickAnim - 27) / 4) * (-16.40384-(-3.02)));
            zz = -14.75 + (((tickAnim - 27) / 4) * (-10.56602-(-14.75)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 17.37509 + (((tickAnim - 31) / 7) * (17.6-(17.37509)));
            yy = -16.40384 + (((tickAnim - 31) / 7) * (-15.55-(-16.40384)));
            zz = -10.56602 + (((tickAnim - 31) / 7) * (-10.84-(-10.56602)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.6 + (((tickAnim - 38) / 12) * (19.08-(17.6)));
            yy = -15.55 + (((tickAnim - 38) / 12) * (-10.01-(-15.55)));
            zz = -10.84 + (((tickAnim - 38) / 12) * (-12.59-(-10.84)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 19.08 + (((tickAnim - 50) / 5) * (-14.7277-(19.08)));
            yy = -10.01 + (((tickAnim - 50) / 5) * (13.23156-(-10.01)));
            zz = -12.59 + (((tickAnim - 50) / 5) * (5.61536-(-12.59)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -14.7277 + (((tickAnim - 55) / 5) * (0-(-14.7277)));
            yy = 13.23156 + (((tickAnim - 55) / 5) * (0-(13.23156)));
            zz = 5.61536 + (((tickAnim - 55) / 5) * (0-(5.61536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*1), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.04292 + (((tickAnim - 0) / 8) * (-8.7679-(15.04292)));
            yy = 7.4713 + (((tickAnim - 0) / 8) * (9.1645-(7.4713)));
            zz = 0.6574 + (((tickAnim - 0) / 8) * (-1.22035-(0.6574)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.7679 + (((tickAnim - 8) / 7) * (-27.5-(-8.7679)));
            yy = 9.1645 + (((tickAnim - 8) / 7) * (0-(9.1645)));
            zz = -1.22035 + (((tickAnim - 8) / 7) * (0-(-1.22035)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -27.5 + (((tickAnim - 15) / 4) * (-15.57952-(-27.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (3.15693-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (2.43893-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -15.57952 + (((tickAnim - 19) / 11) * (15.04292-(-15.57952)));
            yy = 3.15693 + (((tickAnim - 19) / 11) * (7.4713-(3.15693)));
            zz = 2.43893 + (((tickAnim - 19) / 11) * (0.6574-(2.43893)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.72-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.72 + (((tickAnim - 8) / 7) * (-1.825-(0.72)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = -1.825 + (((tickAnim - 15) / 4) * (0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55-(-1.825)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55 + (((tickAnim - 19) / 4) * (0.055-(0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.055 + (((tickAnim - 23) / 7) * (0-(0.055)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 0) / 4) * (40.7-(20)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 40.7 + (((tickAnim - 4) / 4) * (46.39-(40.7)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 46.39 + (((tickAnim - 8) / 7) * (-7.5-(46.39)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -7.5 + (((tickAnim - 15) / 4) * (9.03-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.03 + (((tickAnim - 19) / 4) * (15.56-(9.03)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 15.56 + (((tickAnim - 23) / 7) * (20-(15.56)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3 + (((tickAnim - 19) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegright.rotationPointX = this.lowerlegright.rotationPointX + (float)(xx);
        this.lowerlegright.rotationPointY = this.lowerlegright.rotationPointY - (float)(yy);
        this.lowerlegright.rotationPointZ = this.lowerlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (-13.61-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -13.61 + (((tickAnim - 4) / 4) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -47.22 + (((tickAnim - 8) / 5) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25.71 + (((tickAnim - 13) / 2) * (12.5-(-25.71)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 12.5 + (((tickAnim - 15) / 4) * (4.03-(12.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 4.03 + (((tickAnim - 19) / 11) * (10-(4.03)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.95-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0.95 + (((tickAnim - 8) / 11) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footright.rotationPointX = this.footright.rotationPointX + (float)(xx);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(yy);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.7495 + (((tickAnim - 0) / 4) * (57.22-(4.7495)));
            yy = -6.63927 + (((tickAnim - 0) / 4) * (0-(-6.63927)));
            zz = 2.43531 + (((tickAnim - 0) / 4) * (0-(2.43531)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 57.22 + (((tickAnim - 4) / 4) * (84.44-(57.22)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 84.44 + (((tickAnim - 8) / 4) * (53.47-(84.44)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 53.47 + (((tickAnim - 12) / 3) * (22.5-(53.47)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 22.5 + (((tickAnim - 15) / 4) * (3.51-(22.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 3.51 + (((tickAnim - 19) / 4) * (-16.85-(3.51)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -16.85 + (((tickAnim - 23) / 3) * (-14.4359-(-16.85)));
            yy = 0 + (((tickAnim - 23) / 3) * (-5.95073-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (2.18275-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -14.4359 + (((tickAnim - 26) / 4) * (4.7495-(-14.4359)));
            yy = -5.95073 + (((tickAnim - 26) / 4) * (-6.63927-(-5.95073)));
            zz = 2.18275 + (((tickAnim - 26) / 4) * (2.43531-(2.18275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toeright, toeright.rotateAngleX + (float) Math.toRadians(xx), toeright.rotateAngleY + (float) Math.toRadians(yy), toeright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.975-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = -0.975 + (((tickAnim - 8) / 11) * (0-(-0.975)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (0.24-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0.24 + (((tickAnim - 21) / 2) * (0.495-(0.24)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0.495 + (((tickAnim - 23) / 0) * (0.3-(0.495)));
            zz = 0 + (((tickAnim - 23) / 0) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 23) / 7) * (0-(0.3)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toeright.rotationPointX = this.toeright.rotationPointX + (float)(xx);
        this.toeright.rotationPointY = this.toeright.rotationPointY - (float)(yy);
        this.toeright.rotationPointZ = this.toeright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -24.75 + (((tickAnim - 0) / 4) * (-15.57952-(-24.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.15693-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.43893-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = -15.57952 + (((tickAnim - 4) / 11) * (15.04292-(-15.57952)));
            yy = -3.15693 + (((tickAnim - 4) / 11) * (-7.4713-(-3.15693)));
            zz = -2.43893 + (((tickAnim - 4) / 11) * (-0.6574-(-2.43893)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 15.04292 + (((tickAnim - 15) / 8) * (-8.7679-(15.04292)));
            yy = -7.4713 + (((tickAnim - 15) / 8) * (-9.1645-(-7.4713)));
            zz = -0.6574 + (((tickAnim - 15) / 8) * (1.22035-(-0.6574)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -8.7679 + (((tickAnim - 23) / 7) * (-24.75-(-8.7679)));
            yy = -9.1645 + (((tickAnim - 23) / 7) * (0-(-9.1645)));
            zz = 1.22035 + (((tickAnim - 23) / 7) * (0-(1.22035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 4) * (0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55 + (((tickAnim - 4) / 4) * (-0.145-(0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.145 + (((tickAnim - 8) / 7) * (-0.475-(-0.145)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.475 + (((tickAnim - 15) / 8) * (0.87-(-0.475)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.87 + (((tickAnim - 23) / 7) * (-0.85-(0.87)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.5 + (((tickAnim - 0) / 4) * (9.03-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.03 + (((tickAnim - 4) / 4) * (15.56-(9.03)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.56 + (((tickAnim - 8) / 7) * (20-(15.56)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 15) / 4) * (40.7-(20)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 40.7 + (((tickAnim - 19) / 4) * (46.39-(40.7)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 46.39 + (((tickAnim - 23) / 7) * (-7.5-(46.39)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegleft.rotationPointX = this.lowerlegleft.rotationPointX + (float)(xx);
        this.lowerlegleft.rotationPointY = this.lowerlegleft.rotationPointY - (float)(yy);
        this.lowerlegleft.rotationPointZ = this.lowerlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12.5 + (((tickAnim - 0) / 4) * (4.03-(12.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 4.03 + (((tickAnim - 4) / 11) * (0-(4.03)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-13.61-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -13.61 + (((tickAnim - 19) / 4) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -47.22 + (((tickAnim - 23) / 5) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -25.71 + (((tickAnim - 28) / 2) * (12.5-(-25.71)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (1-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 1 + (((tickAnim - 23) / 7) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footleft.rotationPointX = this.footleft.rotationPointX + (float)(xx);
        this.footleft.rotationPointY = this.footleft.rotationPointY - (float)(yy);
        this.footleft.rotationPointZ = this.footleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.75 + (((tickAnim - 0) / 3) * (6.5-(18.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 6.5 + (((tickAnim - 3) / 5) * (-14.83043-(6.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (4.97976-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.44995-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14.83043 + (((tickAnim - 8) / 7) * (4.7495-(-14.83043)));
            yy = 4.97976 + (((tickAnim - 8) / 7) * (6.63927-(4.97976)));
            zz = 0.44995 + (((tickAnim - 8) / 7) * (-2.43531-(0.44995)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 4.7495 + (((tickAnim - 15) / 4) * (57.22-(4.7495)));
            yy = 6.63927 + (((tickAnim - 15) / 4) * (0-(6.63927)));
            zz = -2.43531 + (((tickAnim - 15) / 4) * (0-(-2.43531)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 57.22 + (((tickAnim - 19) / 4) * (81.94-(57.22)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 81.94 + (((tickAnim - 23) / 4) * (55.97-(81.94)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 55.97 + (((tickAnim - 27) / 3) * (18.75-(55.97)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toeleft, toeleft.rotateAngleX + (float) Math.toRadians(xx), toeleft.rotateAngleY + (float) Math.toRadians(yy), toeleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 4) * (0.26-(0.125)));
            zz = -0.15 + (((tickAnim - 3) / 4) * (-0.13-(-0.15)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.26 + (((tickAnim - 7) / 8) * (0-(0.26)));
            zz = -0.13 + (((tickAnim - 7) / 8) * (0-(-0.13)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.07-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-0.715-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.07 + (((tickAnim - 23) / 7) * (0-(0.07)));
            zz = -0.715 + (((tickAnim - 23) / 7) * (0-(-0.715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toeleft.rotationPointX = this.toeleft.rotationPointX + (float)(xx);
        this.toeleft.rotationPointY = this.toeleft.rotationPointY - (float)(yy);
        this.toeleft.rotationPointZ = this.toeleft.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-3));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-50))*-1), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-4), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-70))*-3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-70))*-4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-70))*-3));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*3), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), upperarmright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3-10), upperarmright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), lowerarmright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-100))*1), lowerarmright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-4)), handright.rotateAngleY + (float) Math.toRadians(0), handright.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*-4)));
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), upperarmleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-3+10), upperarmleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), lowerarmleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-100))*-1), lowerarmleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(fingerleft2, fingerleft2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-4)), fingerleft2.rotateAngleY + (float) Math.toRadians(0), fingerleft2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*4)));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*4), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*-5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-1), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*3), throatPouch.rotateAngleY + (float) Math.toRadians(0), throatPouch.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOrnitholestes entity = (EntityPrehistoricFloraOrnitholestes) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 15.07673 + (((tickAnim - 0) / 5) * (-7.67448-(15.07673)));
            yy = 9.96156 + (((tickAnim - 0) / 5) * (13.97038-(9.96156)));
            zz = 0.88045 + (((tickAnim - 0) / 5) * (-2.63984-(0.88045)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.67448 + (((tickAnim - 5) / 3) * (-16.33724-(-7.67448)));
            yy = 13.97038 + (((tickAnim - 5) / 3) * (6.98519-(13.97038)));
            zz = -2.63984 + (((tickAnim - 5) / 3) * (-1.31992-(-2.63984)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.33724 + (((tickAnim - 8) / 2) * (-25-(-16.33724)));
            yy = 6.98519 + (((tickAnim - 8) / 2) * (0-(6.98519)));
            zz = -1.31992 + (((tickAnim - 8) / 2) * (0-(-1.31992)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -25 + (((tickAnim - 10) / 2) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 10) / 2) * (3.94898-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.05397-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -15.99476 + (((tickAnim - 12) / 2) * (6.05131-(-15.99476)));
            yy = 3.94898 + (((tickAnim - 12) / 2) * (9.97674-(3.94898)));
            zz = 2.05397 + (((tickAnim - 12) / 2) * (-0.68516-(2.05397)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 6.05131 + (((tickAnim - 14) / 1) * (15.07673-(6.05131)));
            yy = 9.97674 + (((tickAnim - 14) / 1) * (9.96156-(9.97674)));
            zz = -0.68516 + (((tickAnim - 14) / 1) * (0.88045-(-0.68516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 0) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 5) * (0-(1)));
            zz = -0.11 + (((tickAnim - 5) / 5) * (-1-(-0.11)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-1-(0)));
            zz = -1 + (((tickAnim - 10) / 2) * (-0.56-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 12) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 12) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 13) / 1) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 13) / 1) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 14) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 14) / 1) * (1-(0.56)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 56.94 + (((tickAnim - 3) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 55.16 + (((tickAnim - 5) / 3) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.08 + (((tickAnim - 8) / 2) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -35 + (((tickAnim - 10) / 2) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -33.72 + (((tickAnim - 12) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.94 + (((tickAnim - 13) / 1) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 34.72 + (((tickAnim - 14) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegright.rotationPointX = this.lowerlegright.rotationPointX + (float)(xx);
        this.lowerlegright.rotationPointY = this.lowerlegright.rotationPointY - (float)(yy);
        this.lowerlegright.rotationPointZ = this.lowerlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40 + (((tickAnim - 0) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -54.44 + (((tickAnim - 4) / 3) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -50.23 + (((tickAnim - 7) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -52.16 + (((tickAnim - 8) / 1) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -24.89 + (((tickAnim - 9) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 10) / 2) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 19.72 + (((tickAnim - 12) / 1) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.56 + (((tickAnim - 13) / 1) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -2.22 + (((tickAnim - 14) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 0) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 75.83 + (((tickAnim - 4) / 4) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 58.21 + (((tickAnim - 8) / 2) * (45-(58.21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 45 + (((tickAnim - 10) / 2) * (30.83-(45)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30.83 + (((tickAnim - 12) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -9.17 + (((tickAnim - 13) / 1) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 50.41 + (((tickAnim - 14) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toeright, toeright.rotateAngleX + (float) Math.toRadians(xx), toeright.rotateAngleY + (float) Math.toRadians(yy), toeright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.33724 + (((tickAnim - 0) / 3) * (-25-(-16.33724)));
            yy = -6.98519 + (((tickAnim - 0) / 3) * (0-(-6.98519)));
            zz = 1.31992 + (((tickAnim - 0) / 3) * (0-(1.31992)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -25 + (((tickAnim - 3) / 1) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 3) / 1) * (-3.94898-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-2.05397-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -15.99476 + (((tickAnim - 4) / 3) * (6.05131-(-15.99476)));
            yy = -3.94898 + (((tickAnim - 4) / 3) * (-9.97674-(-3.94898)));
            zz = -2.05397 + (((tickAnim - 4) / 3) * (0.68516-(-2.05397)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 6.05131 + (((tickAnim - 7) / 1) * (15.07673-(6.05131)));
            yy = -9.97674 + (((tickAnim - 7) / 1) * (-9.96156-(-9.97674)));
            zz = 0.68516 + (((tickAnim - 7) / 1) * (-0.88045-(0.68516)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.07673 + (((tickAnim - 8) / 5) * (-7.67448-(15.07673)));
            yy = -9.96156 + (((tickAnim - 8) / 5) * (-13.97038-(-9.96156)));
            zz = -0.88045 + (((tickAnim - 8) / 5) * (2.63984-(-0.88045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.67448 + (((tickAnim - 13) / 2) * (-16.33724-(-7.67448)));
            yy = -13.97038 + (((tickAnim - 13) / 2) * (-6.98519-(-13.97038)));
            zz = 2.63984 + (((tickAnim - 13) / 2) * (1.31992-(2.63984)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-1-(0)));
            zz = -1 + (((tickAnim - 3) / 1) * (-0.56-(-1)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 4) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 4) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 5) / 2) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 5) / 2) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 7) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 7) / 1) * (1-(0.56)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 8) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (0-(1)));
            zz = -0.11 + (((tickAnim - 13) / 2) * (-1-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.08 + (((tickAnim - 0) / 3) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35 + (((tickAnim - 3) / 1) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -33.72 + (((tickAnim - 4) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 11.94 + (((tickAnim - 5) / 2) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 34.72 + (((tickAnim - 7) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22.5 + (((tickAnim - 8) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 56.94 + (((tickAnim - 11) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 55.16 + (((tickAnim - 13) / 1) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegleft.rotationPointX = this.lowerlegleft.rotationPointX + (float)(xx);
        this.lowerlegleft.rotationPointY = this.lowerlegleft.rotationPointY - (float)(yy);
        this.lowerlegleft.rotationPointZ = this.lowerlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -52.16 + (((tickAnim - 0) / 2) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -24.89 + (((tickAnim - 2) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 19.72 + (((tickAnim - 4) / 1) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0.56 + (((tickAnim - 5) / 2) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.22 + (((tickAnim - 7) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 40 + (((tickAnim - 8) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -54.44 + (((tickAnim - 12) / 2) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -50.23 + (((tickAnim - 14) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58.21 + (((tickAnim - 0) / 3) * (45-(58.21)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 45 + (((tickAnim - 3) / 1) * (30.83-(45)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 30.83 + (((tickAnim - 4) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -9.17 + (((tickAnim - 5) / 2) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 50.41 + (((tickAnim - 7) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 60 + (((tickAnim - 8) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 75.83 + (((tickAnim - 12) / 3) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toeleft, toeleft.rotateAngleX + (float) Math.toRadians(xx), toeleft.rotateAngleY + (float) Math.toRadians(yy), toeleft.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*-2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-12), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*-8), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-9), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-3));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*3), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(-4.5452+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), upperarmright.rotateAngleY + (float) Math.toRadians(-10.91441), upperarmright.rotateAngleZ + (float) Math.toRadians(-2.0228+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));
        this.upperarmright.rotationPointX = this.upperarmright.rotationPointX + (float)(0);
        this.upperarmright.rotationPointY = this.upperarmright.rotationPointY - (float)(1.5);
        this.upperarmright.rotationPointZ = this.upperarmright.rotationPointZ + (float)(0);
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(-4.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), upperarmleft.rotateAngleY + (float) Math.toRadians(2.43438), upperarmleft.rotateAngleZ + (float) Math.toRadians(1.2318+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));
        this.upperarmleft.rotationPointX = this.upperarmleft.rotationPointX + (float)(0);
        this.upperarmleft.rotationPointY = this.upperarmleft.rotationPointY - (float)(1.4);
        this.upperarmleft.rotationPointZ = this.upperarmleft.rotationPointZ + (float)(0);
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-11), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*-1), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*5), throatPouch.rotateAngleY + (float) Math.toRadians(0), throatPouch.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-4));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOrnitholestes e = (EntityPrehistoricFloraOrnitholestes) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck1, (float) Math.toRadians(10),0,0);
        animator.move(this.neck2, (float) Math.toRadians(10),0,0);
        animator.move(this.neck3, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}
