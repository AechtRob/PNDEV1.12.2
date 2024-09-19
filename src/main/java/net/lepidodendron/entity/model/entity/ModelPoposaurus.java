package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPoposaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelPoposaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Poposaurus;
    private final AdvancedModelRendererExtended Basin;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended LArm;
    private final AdvancedModelRendererExtended LArm2;
    private final AdvancedModelRendererExtended LHand;
    private final AdvancedModelRendererExtended RArm;
    private final AdvancedModelRendererExtended RArm2;
    private final AdvancedModelRendererExtended RHand;
    private final AdvancedModelRendererExtended LLeg;
    private final AdvancedModelRendererExtended LLeg2;
    private final AdvancedModelRendererExtended LFoot;
    private final AdvancedModelRendererExtended LFoot2;
    private final AdvancedModelRendererExtended RLeg;
    private final AdvancedModelRendererExtended RLeg2;
    private final AdvancedModelRendererExtended RFoot;
    private final AdvancedModelRendererExtended RFoot2;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended tail5;

    private ModelAnimator animator;

    public ModelPoposaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Poposaurus = new AdvancedModelRendererExtended(this);
        this.Poposaurus.setRotationPoint(0.0F, 5.5F, -12.0F);
        this.setRotateAngle(Poposaurus, -0.0436F, 0.0F, 0.0F);


        this.Basin = new AdvancedModelRendererExtended(this);
        this.Basin.setRotationPoint(0.0F, 1.0F, 11.0F);
        this.Poposaurus.addChild(Basin);
        this.Basin.cubeList.add(new ModelBox(Basin, 0, 37, -2.5F, -3.5F, 0.0F, 5, 9, 7, 0.0F, false));
        this.Basin.cubeList.add(new ModelBox(Basin, 63, 9, -0.5F, -4.3F, 0.9F, 1, 1, 6, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, -0.5F, 1.0F);
        this.Basin.addChild(Body);
        this.setRotateAngle(Body, 0.1047F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -3.0F, -10.0F, 6, 8, 10, 0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -3.6F, -5.9F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2094F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 2, -0.5F, 0.0511F, -2.6972F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0349F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 22, -0.5F, -3.8F, -5.6F, 1, 1, 6, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(0.0F, -1.1F, -9.9F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1047F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 20, 49, -2.5F, -1.8F, -4.1F, 5, 7, 5, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 1.2F, -3.1F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.1047F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 58, 56, -2.0F, -3.0F, -4.0F, 4, 5, 4, -0.01F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2356F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 57, 45, -1.5F, -2.5F, -5.0F, 3, 5, 5, -0.02F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -2.4F, -4.8F);
        this.Neck2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 41, -1.5F, -0.1F, -1.1F, 3, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 2.5F, -4.0F);
        this.Neck2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 28, -1.0F, -0.7F, -0.8F, 2, 1, 4, -0.05F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, 0.288F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 38, 69, -2.0F, -2.5F, -2.0F, 4, 3, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 53, 0, -1.0F, -2.0F, -9.0F, 2, 2, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 64, 30, -1.5F, -2.5F, -6.0F, 3, 3, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 64, 0, -1.0F, 0.0F, -5.0F, 2, 1, 4, -0.03F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -2.2F, -7.7F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 27, -1.0F, -0.13F, -1.28F, 2, 1, 1, -0.02F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -2.7F, -5.1F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 59, -1.0F, 0.0866F, -0.003F, 2, 1, 6, -0.01F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -2.2F, -6.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 5, -1.0F, -0.3F, -2.0488F, 2, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, -8.5F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 41, 0.7F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 49, -0.7F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, -6.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2059F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 22, -1.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 37, 14, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 23, 0, -2.0F, 0.6F, -3.0F, 4, 1, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 41, 0.69F, -1.5F, -6.5F, 0, 1, 6, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 68, 67, -0.69F, -1.5F, -6.4F, 0, 1, 6, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 36, -1.0F, -1.0F, -6.8F, 2, 1, 7, -0.02F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2094F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 61, -1.0F, -0.8973F, -5.8523F, 2, 1, 6, -0.03F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 1.1F, -5.7F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 66, -1.0F, -1.0059F, -0.2613F, 2, 1, 5, -0.04F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 22, -1.5F, -1.69F, -2.2F, 3, 2, 2, -0.01F, false));

        this.LArm = new AdvancedModelRendererExtended(this);
        this.LArm.setRotationPoint(1.5F, 4.4F, -2.6F);
        this.Chest.addChild(LArm);
        this.setRotateAngle(LArm, 0.9599F, 0.0F, 0.0F);
        this.LArm.cubeList.add(new ModelBox(LArm, 0, 19, 0.0F, -0.5F, -1.0F, 2, 5, 2, 0.0F, false));

        this.LArm2 = new AdvancedModelRendererExtended(this);
        this.LArm2.setRotationPoint(1.0F, 3.5F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -1.1345F, 0.0F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.01F, false));

        this.LHand = new AdvancedModelRendererExtended(this);
        this.LHand.setRotationPoint(1.0F, 4.0F, 0.0F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.0F, 0.0F, 0.4363F);
        this.LHand.cubeList.add(new ModelBox(LHand, 0, 37, -1.0F, 1.0F, -1.0F, 1, 3, 2, -0.02F, false));

        this.RArm = new AdvancedModelRendererExtended(this);
        this.RArm.setRotationPoint(-1.5F, 4.4F, -2.6F);
        this.Chest.addChild(RArm);
        this.setRotateAngle(RArm, 0.9599F, 0.0F, 0.0F);
        this.RArm.cubeList.add(new ModelBox(RArm, 0, 19, -2.0F, -0.5F, -1.0F, 2, 5, 2, 0.0F, true));

        this.RArm2 = new AdvancedModelRendererExtended(this);
        this.RArm2.setRotationPoint(-1.0F, 3.5F, 0.5F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, -1.1345F, 0.0F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.01F, true));

        this.RHand = new AdvancedModelRendererExtended(this);
        this.RHand.setRotationPoint(-1.0F, 4.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, 0.0F, -0.4363F);
        this.RHand.cubeList.add(new ModelBox(RHand, 0, 37, 0.0F, 1.0F, -1.0F, 1, 3, 2, -0.02F, true));

        this.LLeg = new AdvancedModelRendererExtended(this);
        this.LLeg.setRotationPoint(1.5F, -1.0F, 4.0F);
        this.Basin.addChild(LLeg);
        this.setRotateAngle(LLeg, -0.5672F, 0.0F, 0.0F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 51, 14, -0.5F, -1.0F, -2.5F, 3, 8, 5, 0.0F, false));

        this.LLeg2 = new AdvancedModelRendererExtended(this);
        this.LLeg2.setRotationPoint(1.0F, 6.0F, -1.8F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.9163F, 0.0F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 0, 54, -1.0F, -0.0303F, -0.6373F, 2, 11, 4, -0.01F, false));

        this.LFoot = new AdvancedModelRendererExtended(this);
        this.LFoot.setRotationPoint(0.0F, 10.4697F, 1.4627F);
        this.LLeg2.addChild(LFoot);
        this.setRotateAngle(LFoot, 0.829F, 0.0F, 0.0F);
        this.LFoot.cubeList.add(new ModelBox(LFoot, 41, 49, -1.5F, -1.0F, -5.0F, 3, 2, 7, 0.0F, false));

        this.LFoot2 = new AdvancedModelRendererExtended(this);
        this.LFoot2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.LFoot.addChild(LFoot2);
        this.setRotateAngle(LFoot2, -1.1345F, 0.0F, 0.0F);
        this.LFoot2.cubeList.add(new ModelBox(LFoot2, 59, 66, -1.5F, -1.0F, -4.0F, 3, 2, 4, -0.01F, false));

        this.RLeg = new AdvancedModelRendererExtended(this);
        this.RLeg.setRotationPoint(-1.5F, -1.0F, 4.0F);
        this.Basin.addChild(RLeg);
        this.setRotateAngle(RLeg, -0.5672F, 0.0F, 0.0F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 51, 14, -2.5F, -1.0F, -2.5F, 3, 8, 5, 0.0F, true));

        this.RLeg2 = new AdvancedModelRendererExtended(this);
        this.RLeg2.setRotationPoint(-1.0F, 6.0F, -1.8F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.9163F, 0.0F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 0, 54, -1.0F, -0.0303F, -0.6373F, 2, 11, 4, -0.01F, true));

        this.RFoot = new AdvancedModelRendererExtended(this);
        this.RFoot.setRotationPoint(0.0F, 10.4697F, 1.4627F);
        this.RLeg2.addChild(RFoot);
        this.setRotateAngle(RFoot, 0.829F, 0.0F, 0.0F);
        this.RFoot.cubeList.add(new ModelBox(RFoot, 41, 49, -1.5F, -1.0F, -5.0F, 3, 2, 7, 0.0F, true));

        this.RFoot2 = new AdvancedModelRendererExtended(this);
        this.RFoot2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.RFoot.addChild(RFoot2);
        this.setRotateAngle(RFoot2, -1.1345F, 0.0F, 0.0F);
        this.RFoot2.cubeList.add(new ModelBox(RFoot2, 59, 66, -1.5F, -1.0F, -4.0F, 3, 2, 4, -0.01F, true));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Basin.addChild(Tail);
        this.setRotateAngle(Tail, -0.0436F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 19, -2.0F, -3.0F, 0.0F, 4, 6, 11, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 39, 36, -0.5F, -4.3127F, 0.5043F, 1, 2, 10, -0.01F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 37, 0, -1.5F, -2.0F, 0.0F, 3, 4, 9, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.5F, -3.9F, 3.5F);
        this.Tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4538F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 62, -1.0F, 0.3108F, 0.2266F, 1, 2, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.5F, -3.6F, 0.9F);
        this.Tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0698F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 27, -1.0F, -0.1F, -0.3F, 1, 2, 3, -0.001F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, -0.9F, 8.6F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0611F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 18, 24, -1.0F, -0.8657F, -0.8041F, 2, 3, 13, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -0.0657F, 11.8959F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1745F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 20, 5, -0.5F, -0.3839F, -0.3548F, 1, 2, 14, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.1161F, 13.5452F);
        this.Tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3054F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 36, 22, -0.5F, -0.2235F, -0.6497F, 1, 1, 12, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Poposaurus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.Neck.offsetY = -0.001F;
        this.Jaw.rotateAngleX = (float) Math.toRadians(35);
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Poposaurus, -0.0436F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Basin, 0.0F, 0.0F, -0.2182F);
        this.setRotateAngle(Body, 0.1056F, 0.1302F, 0.0138F);
        this.setRotateAngle(cube_r1, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, 0.1072F, 0.217F, 0.0232F);
        this.setRotateAngle(Neck, -0.1056F, 0.1302F, -0.0138F);
        this.setRotateAngle(Neck2, -0.1318F, 0.1108F, 0.1607F);
        this.setRotateAngle(cube_r3, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0082F, 0.2531F, -0.1886F);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.2059F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LArm, 1.3526F, 0.0F, 0.0F);
        this.setRotateAngle(LArm2, -1.7453F, 0.0F, 0.0F);
        this.setRotateAngle(LHand, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(RArm, 1.2654F, 0.0F, 0.0F);
        this.setRotateAngle(RArm2, -1.789F, 0.0F, 0.0F);
        this.setRotateAngle(RHand, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(LLeg, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(LLeg2, 1.309F, 0.0F, 0.0F);
        this.setRotateAngle(LFoot, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LFoot2, 1.0908F, 0.0F, 0.0F);
        this.setRotateAngle(RLeg, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(RLeg2, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(RFoot, 1.1781F, 0.0F, 0.0F);
        this.setRotateAngle(RFoot2, -1.7453F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, -0.0438F, 0.0872F, -0.0038F);
        this.setRotateAngle(Tail2, 0.0682F, 0.2031F, -0.0795F);
        this.setRotateAngle(cube_r14, -0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.0616F, 0.1307F, 0.008F);
        this.setRotateAngle(Tail4, -0.1752F, -0.0859F, 0.0152F);
        this.setRotateAngle(tail5, -0.3099F, -0.1664F, 0.053F);
        this.Poposaurus.offsetY = -0.13F;
        this.Poposaurus.offsetX = -0.12F;
        this.Poposaurus.offsetZ = 0.13F;
        this.Poposaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Poposaurus.offsetY = 0.1F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraPoposaurus PoposaurusEntity = (EntityPrehistoricFloraPoposaurus) e;
        float masterSpeed = PoposaurusEntity.getTravelSpeed();

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] TailFull = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] NeckFull = {this.Neck, this.Neck2, this.Head};
        PoposaurusEntity.tailBuffer.applyChainSwingBuffer(TailFull);

        AdvancedModelRenderer[] LArm = {this.LArm, this.LArm2};
        AdvancedModelRenderer[] RArm = {this.RArm, this.RArm2};

        //AdvancedModelRenderer[] Whole = {this.Neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (PoposaurusEntity.getAnimation() == PoposaurusEntity.LAY_ANIMATION) {
            this.chainSwing(NeckFull, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(NeckFull, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!PoposaurusEntity.isReallyInWater()) {

            if (f3 == 0.0F || !PoposaurusEntity.getIsMoving()) {
                this.chainSwing(NeckFull, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(NeckFull, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(TailFull, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(TailFull, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.setRotateAngle(LLeg, -(float)Math.toRadians(17.5), 0, 0);
                this.setRotateAngle(RLeg, -(float)Math.toRadians(17.5), 0, 0);
                this.setRotateAngle(LLeg2, (float)Math.toRadians(27.5), 0, 0);
                this.setRotateAngle(RLeg2, (float)Math.toRadians(27.5), 0, 0);
                this.setRotateAngle(LFoot, -(float)Math.toRadians(7.5), 0, 0);
                this.setRotateAngle(RFoot, -(float)Math.toRadians(7.5), 0, 0);
                this.setRotateAngle(LFoot2, 0, 0, 0);
                this.setRotateAngle(RFoot2, 0, 0, 0);

                //this.Poposaurus.offsetY = 0.40F;

                return;
           }

            if (PoposaurusEntity.getIsFast()) { //Running
                float speed = masterSpeed / 1.2F;

                //this.Poposaurus.offsetY = 0.40F;
                this.LLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.RLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(LArm, speed, -(float)Math.toRadians(20), 0.5, 8, f2, 1F);
                this.chainWaveExtended(RArm, speed, -(float)Math.toRadians(20), 0.5, 5, f2, 1F);


                //---
                this.walk(LLeg, speed, (float)Math.toRadians(40), true, 8.0F, -(float)Math.toRadians(8), f2, 1.0F);
                this.walk(RLeg, speed, (float)Math.toRadians(40), true, 5.0F, -(float)Math.toRadians(8), f2, 1.0F);

                this.walk(LLeg2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(RLeg2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(LFoot, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(RFoot, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(LFoot2, speed, 0.6F, true, 4.5F, 0.535F, f2, 1F);
                this.walk(RFoot2, speed, 0.6F, true, 1.5F, 0.535F, f2, 1F);

                this.bobExtended(Poposaurus, speed * 2F, 1.53F, false, 3.5F, f2, 1F);

                this.bobExtended(LLeg, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(RLeg, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(Basin, speed, 0.08F, false, 6.0F, 0.04F, f2, 1.0F);
                this.flap(Body, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(Chest, speed, -0.06F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(Neck, speed, 0.06F, false, 6.0F, 0.03F, f2, 1.0F);

                this.flap(LLeg, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(RLeg, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(Body, speed * 2, -0.2F, false, 2.5F, -0.1F, f2, 0.8F);
                this.walk(Chest, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.Poposaurus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

                //---


                this.walk(Neck, speed * 4, -0.1F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(Neck2, speed * 4, -0.04F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(Head, speed * 4, 0.1F, false, 2.5F, 0F, f2, 0.5F);

                this.chainWave(TailFull, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(TailFull, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 1.50F;

                //this.Poposaurus.offsetY = 0.40F;

                this.LLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 3, f2, 1.5F);
                this.RLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 0, f2, 1.5F);

                this.chainWaveExtended(LArm, speed, -(float)Math.toRadians(10), 0.5, 8, f2, 1F);
                this.chainWaveExtended(RArm, speed, -(float)Math.toRadians(10), 0.5, 5, f2, 1F);

                this.walk(LLeg, speed, (float)Math.toRadians(35), true, 8.0F, -(float)Math.toRadians(0), f2, 1.0F);
                this.walk(RLeg, speed, (float)Math.toRadians(35), true, 5.0F, -(float)Math.toRadians(0), f2, 1.0F);

                this.walk(LLeg2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(RLeg2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(LFoot, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(RFoot, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(LFoot2, speed, 0.6F, true, 4.5F, 0.535F, f2, 0.8F);
                this.walk(RFoot2, speed, 0.6F, true, 1.5F, 0.535F, f2, 0.8F);

                this.bobExtended(Poposaurus, speed * 2F, 1.23F, false, 3.5F, f2, 1F);

                this.bobExtended(LLeg, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(RLeg, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(Basin, speed, 0.08F, false, 6.0F, 0.04F, f2, 1.0F);
                this.flap(Body, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(Chest, speed, -0.06F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(Neck, speed, 0.06F, false, 6.0F, 0.03F, f2, 1.0F);

                this.flap(LLeg, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(RLeg, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(Body, speed * 2, -0.2F, false, 2.5F, -0.1F, f2, 0.8F);
                this.walk(Chest, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(Neck, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(Neck2, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(Head, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(TailFull, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(TailFull, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.Poposaurus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPoposaurus e = (EntityPrehistoricFloraPoposaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
         animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
