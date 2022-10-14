package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTetraceratops;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelTetraceratops extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Tetraceratops;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Neck1;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended Mandible;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended RBackLeg;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended LowerRBackLeg;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended RBackFoot;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended LBackLeg;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended LowerLBackLeg;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended LBackFoot;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended RFrontLeg;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended LowerRFrontLeg;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended RFrontFoot;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended LFrontLeg;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended LowerLFrontLeg;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended LFrontFoot;
    private final AdvancedModelRendererExtended cube_r33;

    private ModelAnimator animator;

    public ModelTetraceratops() {
        this.textureWidth = 92;
        this.textureHeight = 92;

        this.Tetraceratops = new AdvancedModelRendererExtended(this);
        this.Tetraceratops.setRotationPoint(0.0F, 9.9F, 3.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 3.3F, -14.0F);
        this.Tetraceratops.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.5F, -6.5F, 12.0F, 9, 11, 12, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tetraceratops.addChild(chest);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 3.0F, -14.0F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 23, -4.0F, -5.0F, 3.0F, 8, 11, 11, 0.0F, false));

        this.Neck1 = new AdvancedModelRendererExtended(this);
        this.Neck1.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.chest.addChild(Neck1);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Neck1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 0, -3.0F, -5.3F, 1.0F, 6, 9, 5, 0.0F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Neck1.addChild(Neck2);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Neck2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 45, -2.5F, 0.0F, 0.0F, 5, 8, 6, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Neck2.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 65, 22, -1.5F, 1.5F, -12.4F, 3, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 48, 31, -3.0F, -2.0F, -6.0F, 6, 6, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 27, 64, -1.5F, 3.0F, -12.4F, 3, 2, 4, -0.001F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 1.5F, -8.4F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, -0.2618F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 23, -1.0F, -3.25F, -3.4F, 1, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-1.0F, -1.0F, -9.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, -0.3054F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 0, -0.9F, -1.05F, -0.7F, 1, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.0F, -1.0F, -9.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.3054F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 50, -0.1F, -1.05F, -0.7F, 1, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5F, -8.4F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5236F, 0.0F, 0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 45, 0.0F, -3.25F, -3.4F, 1, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(11.0F, 1.5F, -8.4F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 50, -12.0F, -2.1F, -3.4F, 2, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-12.0F, -2.0F, -6.0F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 28, 10.5F, 4.75F, -4.0F, 3, 1, 3, -0.001F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 60, 10.0F, 0.25F, -4.0F, 4, 5, 4, 0.0F, false));

        this.Mandible = new AdvancedModelRendererExtended(this);
        this.Mandible.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Head.addChild(Mandible);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -3.65F, 1.75F);
        this.Mandible.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 52, -2.5F, 1.9508F, -7.2633F, 5, 3, 5, 0.002F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -3.65F, 1.75F);
        this.Mandible.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 23, -1.0F, 2.15F, -10.25F, 2, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 64, 7, -1.5F, 2.65F, -10.25F, 3, 2, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -3.65F, 1.75F);
        this.Mandible.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 64, 0, -1.0F, 6.35F, -11.75F, 2, 2, 5, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 27, -1.0F, 5.35F, -11.75F, 2, 1, 1, -0.002F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 27, -1.0F, 5.85F, -11.25F, 2, 1, 3, -0.002F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -3.65F, 1.75F);
        this.Mandible.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 45, -1.5F, 4.15F, -10.25F, 3, 1, 4, -0.001F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, -3.65F, 1.75F);
        this.Mandible.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0928F, 0.0924F, -0.7811F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 29, -5.9652F, 0.75F, -5.25F, 2, 1, 2, 0.001F, true));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -3.65F, 1.75F);
        this.Mandible.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0928F, -0.0924F, 0.7811F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 29, 3.9652F, 0.75F, -5.25F, 2, 1, 2, 0.001F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -3.65F, 1.75F);
        this.Mandible.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 31, -2.5F, 2.45F, -4.25F, 5, 3, 3, 0.001F, false));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.Tetraceratops.addChild(Tail);


        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 5.8F, -23.0F);
        this.Tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 33, 14, -3.5F, -15.35F, 19.3F, 7, 8, 9, 0.0F, false));

        this.RBackLeg = new AdvancedModelRendererExtended(this);
        this.RBackLeg.setRotationPoint(-3.0F, 2.75F, 3.75F);
        this.Tail.addChild(RBackLeg);


        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(-14.5F, -0.95F, -22.75F);
        this.RBackLeg.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2827F, 0.747F, 0.5393F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 50, -7.5F, -15.1F, 19.3F, 3, 8, 6, 0.0F, true));

        this.LowerRBackLeg = new AdvancedModelRendererExtended(this);
        this.LowerRBackLeg.setRotationPoint(-3.5F, 4.0F, -2.0F);
        this.RBackLeg.addChild(LowerRBackLeg);


        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(-11.0F, -4.95F, -20.75F);
        this.LowerRBackLeg.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3892F, 0.747F, 0.5393F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 0, -7.0F, 6.65F, 19.8F, 2, 7, 4, 0.0F, true));

        this.RBackFoot = new AdvancedModelRendererExtended(this);
        this.RBackFoot.setRotationPoint(-1.5F, 4.25F, 2.0F);
        this.LowerRBackLeg.addChild(RBackFoot);


        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(8.5F, -9.0F, -27.75F);
        this.RBackFoot.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.7854F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 49, 43, -28.25F, 9.0F, 9.0F, 5, 2, 7, 0.0F, true));

        this.LBackLeg = new AdvancedModelRendererExtended(this);
        this.LBackLeg.setRotationPoint(3.0F, 2.75F, 3.75F);
        this.Tail.addChild(LBackLeg);


        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(14.5F, -0.95F, -22.75F);
        this.LBackLeg.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2827F, -0.747F, -0.5393F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 22, 50, 4.5F, -15.1F, 19.3F, 3, 8, 6, 0.0F, false));

        this.LowerLBackLeg = new AdvancedModelRendererExtended(this);
        this.LowerLBackLeg.setRotationPoint(3.5F, 4.0F, -2.0F);
        this.LBackLeg.addChild(LowerLBackLeg);


        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(11.0F, -4.95F, -20.75F);
        this.LowerLBackLeg.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3892F, -0.747F, -0.5393F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 0, 5.0F, 6.65F, 19.8F, 2, 7, 4, 0.0F, false));

        this.LBackFoot = new AdvancedModelRendererExtended(this);
        this.LBackFoot.setRotationPoint(1.5F, 4.25F, 2.0F);
        this.LowerLBackLeg.addChild(LBackFoot);


        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(-8.5F, -9.0F, -27.75F);
        this.LBackFoot.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.7854F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 49, 43, 23.25F, 9.0F, 9.0F, 5, 2, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 3.0F, 7.0F);
        this.Tail.addChild(Tail2);


        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.0F, 5.8F, -29.5F);
        this.Tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.5672F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 37, -2.5F, -23.1F, 19.55F, 5, 5, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 2.5F, 4.0F);
        this.Tail2.addChild(Tail3);


        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(0.0F, 3.05F, -34.75F);
        this.Tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 59, -1.5F, -11.35F, 32.05F, 3, 3, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 1.25F, 4.0F);
        this.Tail3.addChild(Tail4);


        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.0F, 1.8F, -38.75F);
        this.Tail4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 63, -1.0F, 6.15F, 37.25F, 2, 2, 5, 0.0F, false));

        this.RFrontLeg = new AdvancedModelRendererExtended(this);
        this.RFrontLeg.setRotationPoint(-4.0F, 5.0F, -8.0F);
        this.Tetraceratops.addChild(RFrontLeg);
        this.setRotateAngle(RFrontLeg, 0.0F, 0.0F, 0.0F);


        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(4.0F, -5.0F, -6.0F);
        this.RFrontLeg.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.7121F, -0.85F, 0.569F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 52, 2.8F, 6.7F, -4.2F, 3, 8, 6, 0.0F, true));

        this.LowerRFrontLeg = new AdvancedModelRendererExtended(this);
        this.LowerRFrontLeg.setRotationPoint(-5.75F, 1.0F, 4.25F);
        this.RFrontLeg.addChild(LowerRFrontLeg);


        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(9.75F, -6.0F, -9.75F);
        this.LowerRFrontLeg.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3665F, -0.8378F, 0.5585F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, 2.8F, 5.5F, 9.65F, 2, 8, 4, 0.0F, true));

        this.RFrontFoot = new AdvancedModelRendererExtended(this);
        this.RFrontFoot.setRotationPoint(-0.25F, 6.0F, -2.25F);
        this.LowerRFrontLeg.addChild(RFrontFoot);


        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(10.0F, -11.5F, -7.25F);
        this.RFrontFoot.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.7854F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 56, 14, -14.0F, 11.5F, -7.25F, 4, 2, 6, 0.0F, true));

        this.LFrontLeg = new AdvancedModelRendererExtended(this);
        this.LFrontLeg.setRotationPoint(4.0F, 5.0F, -8.0F);
        this.Tetraceratops.addChild(LFrontLeg);
        this.setRotateAngle(LFrontLeg, 0.0F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(-4.0F, -5.0F, -6.0F);
        this.LFrontLeg.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.7121F, 0.85F, -0.569F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 40, 52, -5.8F, 6.7F, -4.2F, 3, 8, 6, 0.0F, false));

        this.LowerLFrontLeg = new AdvancedModelRendererExtended(this);
        this.LowerLFrontLeg.setRotationPoint(5.75F, 1.0F, 4.25F);
        this.LFrontLeg.addChild(LowerLFrontLeg);


        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(-9.75F, -6.0F, -9.75F);
        this.LowerLFrontLeg.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3665F, 0.8378F, -0.5585F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -4.8F, 5.5F, 9.65F, 2, 8, 4, 0.0F, false));

        this.LFrontFoot = new AdvancedModelRendererExtended(this);
        this.LFrontFoot.setRotationPoint(0.25F, 6.0F, -2.25F);
        this.LowerLFrontLeg.addChild(LFrontFoot);


        this.cube_r33 = new AdvancedModelRendererExtended(this);
        this.cube_r33.setRotationPoint(-10.0F, -11.5F, -7.25F);
        this.LFrontFoot.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.7854F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 56, 14, 10.0F, 11.5F, -7.25F, 4, 2, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Tetraceratops.render(f5 * 0.30F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Tetraceratops.offsetZ = -0.3F;
        this.Tetraceratops.render(0.1F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.Tetraceratops.offsetY = 1.03F;

        EntityPrehistoricFloraTetraceratops EntitiyTetraceratops = (EntityPrehistoricFloraTetraceratops) e;
        float masterSpeed = EntitiyTetraceratops.getTravelSpeed();

        this.faceTarget(f3, f4, 4, Neck1);
        this.faceTarget(f3, f4, 6, Neck2);
        this.faceTarget(f3, f4, 6, Head);

        AdvancedModelRendererExtended[] TailSet = {this.Tail, this.Tail2, this.Tail3, this.Tail4};

        // || (Tetraceratops.moveStrafing == 0 && Tetraceratops.moveVertical == 0 && Tetraceratops.moveForward == 0)

        if (EntitiyTetraceratops.getAnimation() == EntitiyTetraceratops.LAY_ANIMATION) {
            this.swing(Neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(TailSet, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            this.chainSwing(TailSet, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !EntitiyTetraceratops.getIsMoving()) { //Not moving
            this.swing(Neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck2, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(TailSet, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(TailSet, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.225F;
        if (EntitiyTetraceratops.getIsFast()) {
            speed = speed * 2;
        }

        this.LFrontLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.85), false, 1, f2, 1.5F);;
        this.RFrontLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.85), false, 4, f2, 1.5F);;
        this.LBackLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.65), false, 4, f2, 1.5F);;
        this.RBackLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.65), false, 1, f2, 1.5F);;

        this.flap(LFrontLeg, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(RFrontLeg, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(LBackLeg, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(RBackLeg, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(LFrontLeg, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(RFrontLeg, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(LBackLeg, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(RBackLeg, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(LowerLFrontLeg, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(LowerRFrontLeg, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(LowerLBackLeg, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(LowerRBackLeg, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(LowerLFrontLeg, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(LowerRFrontLeg, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(LowerLBackLeg, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(LowerRBackLeg, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(LFrontFoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(RFrontFoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(LBackFoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(RBackFoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Tetraceratops, speed * 2F, 0.185F, false, 2.5F,  f2, 1F);

        this.flap(Tail, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(Tetraceratops, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(chest, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(TailSet, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(TailSet, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Tetraceratops.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.85), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTetraceratops e = (EntityPrehistoricFloraTetraceratops) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Mandible, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Mandible, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(-7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Mandible, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.Tail, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail2, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail3, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail4, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
