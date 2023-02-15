package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProburnetia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelProburnetia extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended proburnetia;
    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended RBackLeg2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended LowerRBackLeg2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended RBackFoot2;
    private final AdvancedModelRendererExtended RBackLeg3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended LowerRBackLeg3;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended RBackFoot3;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Tail5;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended Neck1;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended Head;
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
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended RFrontLeg;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended LowerRFrontLeg;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended RFrontFoot;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended RFrontLeg2;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended LowerRFrontLeg2;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended RFrontFoot2;
    private final AdvancedModelRendererExtended cube_r28;

    private ModelAnimator animator;

    public ModelProburnetia() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.proburnetia = new AdvancedModelRendererExtended(this);
        this.proburnetia.setRotationPoint(0.5F, 11.9F, 3.0F);


        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.proburnetia.addChild(main);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-34.0F, 3.3F, -14.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 29.5F, -6.5F, 11.0F, 8, 8, 13, 0.0F, false));

        this.RBackLeg2 = new AdvancedModelRendererExtended(this);
        this.RBackLeg2.setRotationPoint(2.9495F, 3.2065F, 8.866F);
        this.main.addChild(RBackLeg2);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.6229F, 0.5167F, 0.6384F);
        this.RBackLeg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2681F, -0.1015F, -0.307F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 25, -2.5F, -3.5F, -3.25F, 4, 6, 5, 0.0F, true));

        this.LowerRBackLeg2 = new AdvancedModelRendererExtended(this);
        this.LowerRBackLeg2.setRotationPoint(1.5505F, 1.5435F, -1.616F);
        this.RBackLeg2.addChild(LowerRBackLeg2);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-0.2265F, 0.7018F, 1.2537F);
        this.LowerRBackLeg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.073F, -0.0824F, -0.0257F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 9, -2.0448F, -0.7512F, -2.2976F, 3, 6, 4, 0.0F, true));

        this.RBackFoot2 = new AdvancedModelRendererExtended(this);
        this.RBackFoot2.setRotationPoint(-0.0576F, 5.25F, 1.7487F);
        this.LowerRBackLeg2.addChild(RBackFoot2);
        this.RBackFoot2.cubeList.add(new ModelBox(RBackFoot2, 45, 0, -2.75F, 0.0F, -4.0F, 4, 2, 5, 0.0F, true));

        this.RBackLeg3 = new AdvancedModelRendererExtended(this);
        this.RBackLeg3.setRotationPoint(-3.9495F, 3.2065F, 8.866F);
        this.main.addChild(RBackLeg3);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-0.6229F, 0.5167F, 0.6384F);
        this.RBackLeg3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2681F, 0.1015F, 0.307F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 25, -1.5F, -3.5F, -3.25F, 4, 6, 5, 0.0F, false));

        this.LowerRBackLeg3 = new AdvancedModelRendererExtended(this);
        this.LowerRBackLeg3.setRotationPoint(-1.5505F, 1.5435F, -1.616F);
        this.RBackLeg3.addChild(LowerRBackLeg3);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.2265F, 0.7018F, 1.2537F);
        this.LowerRBackLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.073F, 0.0824F, 0.0257F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 9, -0.9552F, -0.7512F, -2.2976F, 3, 6, 4, 0.0F, false));

        this.RBackFoot3 = new AdvancedModelRendererExtended(this);
        this.RBackFoot3.setRotationPoint(0.0576F, 5.25F, 1.7487F);
        this.LowerRBackLeg3.addChild(RBackFoot3);
        this.RBackFoot3.cubeList.add(new ModelBox(RBackFoot3, 45, 0, -1.25F, 0.0F, -4.0F, 4, 2, 5, 0.0F, false));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(-0.5F, -1.3F, 10.3F);
        this.main.addChild(Tail);
        this.setRotateAngle(Tail, -0.2182F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 23, 29, -3.0F, -0.5F, -1.0F, 6, 7, 9, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.5F, 0.05F, 7.7F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1745F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 29, 0, -2.5F, -0.2609F, -0.2647F, 4, 5, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(-0.5F, 0.1701F, 7.7383F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1745F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 13, 45, -1.0F, -0.25F, -1.0F, 2, 3, 7, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.7776F, 5.9804F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.2618F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, -1.0F, -0.25F, 1, 2, 5, 0.0F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, -0.75F, 4.75F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.1745F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 53, 54, -0.5F, 0.0F, -0.5F, 1, 1, 6, -0.01F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.main.addChild(chest);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 2.0F, -12.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, -4.0F, -5.0F, 3.0F, 7, 8, 9, 0.0F, false));

        this.Neck1 = new AdvancedModelRendererExtended(this);
        this.Neck1.setRotationPoint(-0.5F, -1.75F, -7.0F);
        this.chest.addChild(Neck1);


        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.Neck1.addChild(Neck2);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 3.6642F, -2.233F);
        this.Neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 38, -1.5F, -2.0F, -3.5F, 3, 3, 7, -0.02F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 14, -2.0F, 1.0F, -0.5F, 4, 4, 7, 0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, -0.75F, -2.5F);
        this.Neck2.addChild(Head);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 1.6564F, -8.9098F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 3, 0.5F, 1.0036F, -1.0F, 1, 1, 1, -0.02F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 3, -1.5F, 1.0036F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 1.6564F, -8.9098F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 21, -1.5F, -0.9564F, -2.0F, 3, 2, 5, -0.02F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -0.8889F, -7.7223F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 54, -1.0F, -0.1794F, -3.6446F, 2, 2, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(1.25F, -2.0671F, -6.1656F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6195F, -0.007F, 0.3733F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 7, -0.25F, 0.3671F, -0.5F, 1, 2, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-1.25F, -2.0671F, -6.1656F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6195F, 0.007F, -0.3733F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 7, -0.75F, 0.3671F, -0.5F, 1, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -0.0628F, -10.5649F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5672F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 7, -0.5F, -0.25F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, -2.4344F, -7.7035F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 9, -0.5F, 0.75F, -1.25F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -3.25F, -1.25F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 45, -2.0F, 1.25F, -5.5F, 4, 4, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(2.0F, -1.4697F, -0.1768F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7734F, 0.1536F, 0.1555F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 0, -0.5F, -1.25F, -1.0F, 1, 2, 2, -0.01F, true));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(-2.0F, -1.4697F, -0.1768F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.7734F, -0.1536F, -0.1555F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 0, -0.5F, -1.25F, -1.0F, 1, 2, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5236F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 45, -2.5F, 0.75F, -2.0F, 5, 5, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 2.25F, -2.375F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 10, 57, -1.5F, 0.0F, -3.875F, 3, 2, 4, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 45, 53, -1.5F, -2.75F, -3.375F, 3, 3, 4, -0.03F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 36, -1.0F, 0.0F, -8.125F, 2, 2, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.0F, 2.0F, -6.625F);
        this.Jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5672F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 21, -1.0F, -1.5F, -1.25F, 2, 2, 2, -0.01F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(1.25F, 1.0F, -1.375F);
        this.Jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.5672F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -0.75F, -0.5F, 0.25F, 1, 2, 1, -0.01F, true));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(-1.25F, 1.0F, -1.375F);
        this.Jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.5672F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -0.25F, -0.5F, 0.25F, 1, 2, 1, -0.01F, false));

        this.RFrontLeg = new AdvancedModelRendererExtended(this);
        this.RFrontLeg.setRotationPoint(-3.5F, 2.0F, -6.5F);
        this.proburnetia.addChild(RFrontLeg);
        this.setRotateAngle(RFrontLeg, 0.0F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(-2.0591F, 0.1227F, -0.0048F);
        this.RFrontLeg.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.48F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 51, 0.25F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));

        this.LowerRFrontLeg = new AdvancedModelRendererExtended(this);
        this.LowerRFrontLeg.setRotationPoint(-2.0F, 4.0F, -0.25F);
        this.RFrontLeg.addChild(LowerRFrontLeg);


        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(-0.1181F, 2.8662F, -0.2862F);
        this.LowerRFrontLeg.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2182F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 37, 58, -1.0F, -3.25F, -1.5F, 2, 5, 3, 0.0F, false));

        this.RFrontFoot = new AdvancedModelRendererExtended(this);
        this.RFrontFoot.setRotationPoint(-0.25F, 4.0F, -0.25F);
        this.LowerRFrontLeg.addChild(RFrontFoot);


        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(-1.4905F, 1.0F, -1.7699F);
        this.RFrontFoot.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 57, 19, 0.1905F, -1.0F, -1.25F, 3, 2, 4, 0.0F, false));

        this.RFrontLeg2 = new AdvancedModelRendererExtended(this);
        this.RFrontLeg2.setRotationPoint(2.5F, 2.0F, -6.5F);
        this.proburnetia.addChild(RFrontLeg2);
        this.setRotateAngle(RFrontLeg2, 0.0F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(2.0591F, 0.1227F, -0.0048F);
        this.RFrontLeg2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.48F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 51, -3.25F, -2.0F, -2.0F, 3, 6, 4, 0.0F, true));

        this.LowerRFrontLeg2 = new AdvancedModelRendererExtended(this);
        this.LowerRFrontLeg2.setRotationPoint(2.0F, 4.0F, -0.25F);
        this.RFrontLeg2.addChild(LowerRFrontLeg2);


        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.1181F, 2.8662F, -0.2862F);
        this.LowerRFrontLeg2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 37, 58, -1.0F, -3.25F, -1.5F, 2, 5, 3, 0.0F, true));

        this.RFrontFoot2 = new AdvancedModelRendererExtended(this);
        this.RFrontFoot2.setRotationPoint(0.25F, 4.0F, -0.25F);
        this.LowerRFrontLeg2.addChild(RFrontFoot2);


        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(1.4905F, 1.0F, -1.7699F);
        this.RFrontFoot2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 57, 19, -3.1905F, -1.0F, -1.25F, 3, 2, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.proburnetia.render(f5 * 0.390f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.proburnetia.offsetZ = -0.3F;
        this.Neck2.rotateAngleX = (float) Math.toRadians(-7.5);
        this.Neck2.rotateAngleY = (float) Math.toRadians(-27.5);
        this.Tail.rotateAngleY = (float) Math.toRadians(14.63);
        this.Tail2.rotateAngleY = (float) Math.toRadians(12.3);
        this.Tail3.rotateAngleY = (float) Math.toRadians(14.7);
        this.Tail4.rotateAngleY = (float) Math.toRadians(24);
        this.Tail5.rotateAngleY = (float) Math.toRadians(22.3);
        this.chest.rotateAngleY = (float) Math.toRadians(-10);
        this.Head.rotateAngleX = (float) Math.toRadians(-11.25);
        this.Head.rotateAngleY = (float) Math.toRadians(-27);
        this.Jaw.rotateAngleX = (float) Math.toRadians(35);
        this.proburnetia.render(0.1F);
        //GlStateManager.enableCull();
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
        this.proburnetia.offsetY = 0.93F;

        EntityPrehistoricFloraProburnetia Proburnetia = (EntityPrehistoricFloraProburnetia) e;
        float masterSpeed = Proburnetia.getTravelSpeed();

        this.faceTarget(f3, f4, 4, Neck1);
        this.faceTarget(f3, f4, 4, Neck2);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        Proburnetia.tailBuffer.applyChainSwingBuffer(Tail);

        if (Proburnetia.getAnimation() == Proburnetia.LAY_ANIMATION) {
            this.swing(Neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Proburnetia.getIsMoving()) { //Not moving
            this.swing(Neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.105F;
        if (Proburnetia.getIsFast()) {
            speed = speed * 1.9F;
        }

        this.RFrontLeg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.5), false, 1, f2, 1.5F);;
        this.RFrontLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.5), false, 4, f2, 1.5F);;
        this.RBackLeg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.6), false, 4, f2, 1.5F);;
        this.RBackLeg3.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.6), false, 1, f2, 1.5F);;

        this.flap(RFrontLeg2, speed, -0.1F, true, 4, -0.1F, f2, 1F);
        this.flap(RFrontLeg, speed, 0.1F, true, 7, 0.1F, f2, 1F);
        this.flap(RBackLeg2, speed, -0.05F, false, 7, -0.05F, f2, 1F);
        this.flap(RBackLeg3, speed, 0.05F, false, 4, 0.05F, f2, 1F);

        this.walk(RFrontLeg2, speed, 0.30F, true, 5, 0F, f2, 1F);
        this.walk(RFrontLeg, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(RBackLeg2, speed, 0.20F, true, 8, 0F, f2, 1F);
        this.walk(RBackLeg3, speed, 0.20F, true, 5, 0F, f2, 1F);

        this.walk(LowerRFrontLeg2, speed, 0.25F, true, 6, 0.125F, f2, 1F);
        this.walk(LowerRFrontLeg, speed, 0.25F, true, 9, 0.125F, f2, 1F);
        this.walk(LowerRBackLeg2, speed, 0.20F, true, 9, 0.10F, f2, 1F);
        this.walk(LowerRBackLeg3, speed, 0.20F, true, 6, 0.10F, f2, 1F);

        //this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        //this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        //this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        //this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(RFrontFoot2, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(RFrontFoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(RBackFoot2, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(RBackFoot3, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(proburnetia, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        //this.swing(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(main, speed, -0.08F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(chest, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);

        this.swing(RBackLeg2, speed, 0.08F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(RBackLeg3, speed, 0.08F, false, 5.0F,0.06F, f2, 1.0F);

        this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        //this.chainWave(Tail, (speed*0.6F), -0.085F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.proburnetia.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.4), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProburnetia e = (EntityPrehistoricFloraProburnetia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Neck1, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck1, (float) Math.toRadians(4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        //animator.setAnimation(e.NOISE_ANIMATION);
        //animator.startKeyframe(10);
        //animator.rotate(this.Neck1, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Neck2, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.endKeyframe();
        //animator.setStaticKeyframe(10);
        //animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neck1, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(5);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
