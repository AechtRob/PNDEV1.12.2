package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMelosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelMelosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Melosaurus;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer LLeg;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer LFoot;
    private final AdvancedModelRenderer RLeg;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer RFoot;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer LArm;
    private final AdvancedModelRenderer LArm2;
    private final AdvancedModelRenderer LHand;
    private final AdvancedModelRenderer RArm;
    private final AdvancedModelRenderer RArm2;
    private final AdvancedModelRenderer RHand;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    private ModelAnimator animator;

    public ModelMelosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Melosaurus = new AdvancedModelRenderer(this);
        this.Melosaurus.setRotationPoint(0.0F, 21.0F, -6.0F);
        this.setRotateAngle(Melosaurus, 0.0262F, 0.0F, 0.0F);
        this.Melosaurus.cubeList.add(new ModelBox(Melosaurus, 0, 15, -4.0F, -2.0F, -4.0F, 8, 5, 8, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.3F, 4.0F);
        this.Melosaurus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0122F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 35, -3.0F, 0.0F, -7.99F, 6, 1, 8, 0.01F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.Melosaurus.addChild(Body);
        this.setRotateAngle(Body, -0.0175F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.5F, -2.5F, 0.0F, 7, 5, 9, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 25, 6, -2.5F, -2.8F, 0.0F, 5, 1, 9, -0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0262F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 45, 0, -2.0F, -2.8F, -0.01F, 4, 1, 9, -0.01F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 24, 20, -3.0F, -2.5F, 0.0F, 6, 5, 9, -0.01F, false));

        this.LLeg = new AdvancedModelRenderer(this);
        this.LLeg.setRotationPoint(2.0F, 0.5F, 6.5F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.0352F, 0.3442F, 0.2319F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 38, 62, 0.0F, -1.0F, -1.0F, 3, 2, 2, 0.01F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, -1.0472F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 43, 0, 0.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.LFoot = new AdvancedModelRenderer(this);
        this.LFoot.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.LLeg2.addChild(LFoot);
        this.setRotateAngle(LFoot, -0.1507F, 0.3428F, -0.1868F);
        this.LFoot.cubeList.add(new ModelBox(LFoot, 0, 36, 0.0F, 0.0F, -1.0F, 3, 1, 2, -0.01F, false));

        this.RLeg = new AdvancedModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0F, 0.5F, 6.5F);
        this.Body2.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.0352F, -0.3442F, -0.2319F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 38, 62, -3.0F, -1.0F, -1.0F, 3, 2, 2, 0.01F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, 1.0472F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 43, 0, -3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.RFoot = new AdvancedModelRenderer(this);
        this.RFoot.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.RLeg2.addChild(RFoot);
        this.setRotateAngle(RFoot, -0.1507F, -0.3428F, 0.1868F);
        this.RFoot.cubeList.add(new ModelBox(RFoot, 0, 36, -3.0F, 0.0F, -1.0F, 3, 1, 2, -0.01F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, -0.0611F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 44, 37, -2.0F, -2.5F, 0.0F, 4, 5, 8, -0.02F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 56, 21, 0.0F, -4.8F, 1.0F, 0, 8, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.5F, 8.0F);
        this.Tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0384F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 51, -1.5F, 0.0F, -8.0F, 3, 2, 8, -0.02F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 15, 45, -1.5F, -2.0F, 0.0F, 3, 4, 8, -0.03F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 50, -0.01F, -4.8F, 0.0F, 0, 8, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 53, 51, -1.0F, -1.5F, 0.0F, 2, 3, 8, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 46, 11, 0.0F, -4.8F, 0.0F, 0, 8, 8, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0436F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 29, -0.01F, -4.8F, -0.5F, 0, 8, 11, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 12, 29, -0.5F, -1.0F, 0.0F, 1, 2, 7, -0.01F, false));

        this.LArm = new AdvancedModelRenderer(this);
        this.LArm.setRotationPoint(3.0F, 1.0F, -2.0F);
        this.Melosaurus.addChild(LArm);
        this.setRotateAngle(LArm, -0.0555F, -0.5648F, 0.2343F);
        this.LArm.cubeList.add(new ModelBox(LArm, 66, 72, 0.0F, -1.0F, -1.0F, 3, 2, 2, 0.01F, false));

        this.LArm2 = new AdvancedModelRenderer(this);
        this.LArm2.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, 0.0F, 1.1781F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 71, 32, 0.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.LHand = new AdvancedModelRenderer(this);
        this.LHand.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.1924F, 0.3342F, -0.0841F);
        this.LHand.cubeList.add(new ModelBox(LHand, 75, 60, 0.0F, 0.0F, -1.0F, 3, 1, 2, -0.01F, false));

        this.RArm = new AdvancedModelRenderer(this);
        this.RArm.setRotationPoint(-3.0F, 1.0F, -2.0F);
        this.Melosaurus.addChild(RArm);
        this.setRotateAngle(RArm, -0.0555F, 0.5648F, -0.2343F);
        this.RArm.cubeList.add(new ModelBox(RArm, 66, 72, -3.0F, -1.0F, -1.0F, 3, 2, 2, 0.01F, true));

        this.RArm2 = new AdvancedModelRenderer(this);
        this.RArm2.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, 0.0F, -1.1781F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 71, 32, -3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.RHand = new AdvancedModelRenderer(this);
        this.RHand.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.1924F, -0.3342F, 0.0841F);
        this.RHand.cubeList.add(new ModelBox(RHand, 75, 60, -3.0F, 0.0F, -1.0F, 3, 1, 2, -0.01F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Melosaurus.addChild(Neck);
        this.setRotateAngle(Neck, 0.1309F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 55, 11, -3.5F, -1.98F, -4.0F, 7, 3, 4, -0.01F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 66, 47, -3.0F, -2.25F, -4.0F, 6, 3, 4, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5114F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 69, -3.0F, -2.0F, 0.0F, 6, 2, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.0873F, 0.0F, 0.0F);


        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 64, 19, -3.0F, -1.0F, -5.0F, 6, 1, 5, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 61, 63, -1.5F, -1.0F, -12.0F, 3, 1, 7, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 10, 60, -1.5F, -1.0F, -12.0F, 3, 1, 7, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 31, 74, -1.0F, -0.5F, -11.5F, 2, 1, 3, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 0, 19, 0.5F, -0.3F, -11.0F, 0, 1, 2, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 0, 19, -0.5F, -0.3F, -11.0F, 0, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -1.4F);
        this.Upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4625F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 0, -3.5F, -0.6F, -1.0F, 7, 2, 2, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.5F, -1.0F, -2.0F);
        this.Upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0757F, -0.2048F, 0.3568F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 15, 0.0F, -0.7F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.5F, -1.0F, -2.0F);
        this.Upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0757F, 0.2048F, -0.3568F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 15, -1.0F, -0.7F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.Upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0401F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 49, -2.0F, 0.0F, -7.0F, 4, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.Upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 63, -3.0F, 0.0F, -5.0F, 6, 1, 5, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3054F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 71, 26, -0.44F, -1.0F, 4.95F, 2, 1, 4, -0.02F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3054F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 71, 26, -1.56F, -1.0F, 4.95F, 2, 1, 4, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 1.0F, -0.3F, 0.5F, 0, 1, 4, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 70, 0.5F, -0.5F, 1.0F, 0, 1, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3491F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.0F, -0.3F, 0.5F, 0, 1, 4, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 70, -0.5F, -0.5F, 1.0F, 0, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 70, 0.0F, -1.0F, 0.0F, 2, 1, 5, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3927F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 70, -2.0F, -1.0F, 0.0F, 2, 1, 5, -0.01F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.0175F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 63, 0, -3.0F, -0.04F, -5.0F, 6, 1, 5, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 24, 62, -1.5F, -0.04F, -12.0F, 3, 1, 7, -0.01F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 74, 7, -1.0F, -0.5F, -11.5F, 2, 1, 3, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 1.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3054F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 71, -0.43F, -1.04F, 4.94F, 2, 1, 4, -0.03F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5F, 1.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3054F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 71, -1.57F, -1.04F, 4.94F, 2, 1, 4, -0.03F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, 1.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 51, 0.0F, -1.04F, 0.02F, 2, 1, 5, -0.02F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.5F, 1.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 51, -2.0F, -1.04F, 0.02F, 2, 1, 5, -0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3491F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 29, 0.51F, -0.5F, 0.5F, 0, 1, 5, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3491F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 29, -0.51F, -0.5F, 0.5F, 0, 1, 5, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Lowerjaw.addChild(bone);
        this.setRotateAngle(bone, -0.1379F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 61, 37, -3.0F, -0.07F, -5.0F, 6, 1, 5, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 75, 64, -1.5F, -0.07F, -7.0F, 3, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 1.0F, -9.0F);
        this.bone.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.3054F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 45, -0.43F, -1.05F, 4.93F, 2, 1, 4, -0.04F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5F, 1.0F, -9.0F);
        this.bone.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.3054F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 45, -1.57F, -1.05F, 4.93F, 2, 1, 4, -0.04F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, 1.0F, -9.0F);
        this.bone.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.3927F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 74, 55, 0.02F, -1.05F, 2.02F, 2, 1, 3, -0.03F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 1.0F, -9.0F);
        this.bone.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.3927F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 74, 55, -2.02F, -1.05F, 2.02F, 2, 1, 3, -0.03F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Melosaurus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Lowerjaw.rotateAngleX = (float) Math.toRadians(25);
        this.Neck.offsetY = -0.025F;
        this.Neck.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Melosaurus, -0.2F, 0.0F, 0.1F);
        this.setRotateAngle(Body, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(RArm, 1.5F, 0.8F, 0.3F);
        this.setRotateAngle(RArm2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(RHand, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(LArm, 1.5F, -0.8F, 0.3F);
        this.setRotateAngle(LArm2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(LHand, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(Neck, -0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Head, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Upperjaw, -0.4F, -0.1F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.2F, -0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.1F, -0.2F, -0.05F);
        this.setRotateAngle(RLeg, 1.5F, 0.5F, 0.0F);
        this.setRotateAngle(RLeg2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(RFoot, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(LLeg, 1.5F, -0.9F, 0.0F);
        this.setRotateAngle(LLeg2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(LFoot, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(Tail, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Tail3, -0.1F, -0.2F, 0.0F);
        this.setRotateAngle(Tail4, -0.1F, -0.2F, 0.0F);
        this.Melosaurus.offsetY = -0.17F;
        this.Melosaurus.render(0.01F);
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
        this.resetToDefaultPose();
        this.Melosaurus.offsetY = -0.05F; //72

        EntityPrehistoricFloraMelosaurus MelosaurusEntity = (EntityPrehistoricFloraMelosaurus) e;

        this.faceTarget(f3, f4, 4, Neck);
        this.faceTarget(f3, f4, 4, Head);

        float speed = 0.225F;
        if (MelosaurusEntity.getIsFast()) {
            speed = speed * 1.52F;
        }

        AdvancedModelRenderer[] Tail = {this.Body2, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Torso = {this.Neck, this.Body};
        MelosaurusEntity.tailBuffer.applyChainSwingBuffer(Tail);

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifierTail = 1F;
        boolean atBottom = false;
        if (MelosaurusEntity.isReallyInWater() && isAtBottom && !MelosaurusEntity.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.12F;
            bottomModifierTail = 0.3F;
            atBottom = true;
        }


        if (!MelosaurusEntity.isReallyInWater()) {

            if (f3 == 0.0F || !MelosaurusEntity.getIsMoving()) { //Not moving
                return;
            }

            //this.Melosaurus.offsetY = 0.52F; //72

            this.flap(RLeg, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(RLeg, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(RLeg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(RFoot, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(LLeg, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(LLeg, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(LLeg2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(LFoot, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(RArm, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(RArm, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(RArm2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(RHand, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(LArm, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(LArm, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(LArm2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(LHand, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            //this.bob(Melosaurus, speed*2, 0.3F, false, f2, 1F);

            this.Melosaurus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

        }
        else { //is in water
            speed = speed * 2F;

            if (!atBottom) {

                this.setRotateAngle(RArm, 0, (float) Math.toRadians(50), (float) Math.toRadians(10));
                this.setRotateAngle(LArm, 0, (float) Math.toRadians(-50), (float) Math.toRadians(-10));
                this.setRotateAngle(RArm2, 0, (float) Math.toRadians(20), 0);
                this.setRotateAngle(LArm2, 0, (float) Math.toRadians(-20), 0);
                this.setRotateAngle(RHand, 0.1414F, (float) Math.toRadians(-3), -0.0542F);
                this.setRotateAngle(LHand, 0.1414F, (float) Math.toRadians(3), 0.0542F);

                this.setRotateAngle(RLeg, (float) Math.toRadians(2.2535), (float) Math.toRadians(-30.3117), (float) Math.toRadians(18.8722));
                this.setRotateAngle(LLeg, (float) Math.toRadians(2.2535), (float) Math.toRadians(30.3117), (float) Math.toRadians(-18.8722));
                this.setRotateAngle(RLeg2, (float) Math.toRadians(0), (float) Math.toRadians(-72.5), (float) Math.toRadians(0));
                this.setRotateAngle(LLeg2, (float) Math.toRadians(0), (float) Math.toRadians(72.5), (float) Math.toRadians(0));
                this.setRotateAngle(RFoot, (float) Math.toRadians(-9.5576), (float) Math.toRadians(20.0197), (float) Math.toRadians(-22.5273));
                this.setRotateAngle(LFoot, (float) Math.toRadians(-9.5576), (float) Math.toRadians(-20.0197), (float) Math.toRadians(22.5273));

                AdvancedModelRenderer[] BackL = {this.RLeg2, this.RFoot};
                AdvancedModelRenderer[] BackR = {this.LLeg2, this.LFoot};
                AdvancedModelRenderer[] FrontL = {this.RArm, this.RArm2};
                AdvancedModelRenderer[] FrontR = {this.LArm, this.LArm2};

                this.chainWaveExtended(FrontL, speed * 0.85F, -0.2F, -2, 1F, f2, 1);
                this.chainWaveExtended(FrontR, speed * 0.85F, -0.2F, -2, 4F, f2, 1);
                this.chainWaveExtended(BackL, speed * 0.85F, -0.2F, -2, 1F, f2, 1);
                this.chainWaveExtended(BackR, speed * 0.85F, -0.2F, -2, 4F, f2, 1);

            }
            else if (f3 != 0 && MelosaurusEntity.getIsMoving()) {
                this.flap(RLeg, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
                this.swing(RLeg, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(RLeg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
                this.walk(RFoot, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.flap(LLeg, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
                this.swing(LLeg, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(LLeg2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
                this.walk(LFoot, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(RArm, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
                this.swing(RArm, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(RArm2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
                this.walk(RHand, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(LArm, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
                this.swing(LArm, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(LArm2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
                this.walk(LHand, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                this.chainSwing(Torso, speed, 0.07F, -0.3, f2, 0.7F);
                //this.bob(Melosaurus, speed*2, 0.3F, false, f2, 1F);

                this.Melosaurus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

            }

            this.chainSwing(Tail, speed * bottomModifierTail, 0.6F * bottomModifierTail, -0.5, f2, 0.5F * bottomModifierTail);
            if (!atBottom) {
                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                this.chainSwing(Torso, speed, 0.15F, -0.2, f2, 0.7F);
            }
            else {
                this.swing(Neck, speed * bottomModifierTail * 0.33F, 0.1F, false, 0, -0.05F, f2, 0.5F);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.3F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Head, 0,0,-0.3F);
        animator.rotate(this.Head, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
