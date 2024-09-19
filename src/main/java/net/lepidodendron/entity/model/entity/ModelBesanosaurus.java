package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelBesanosaurus extends ModelBasePalaeopedia {


    private ModelAnimator animator;
    private final AdvancedModelRenderer Besanosaurus;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ArmR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    public ModelBesanosaurus() {

        this.textureWidth = 256;
        this.textureHeight = 256;

        this.Besanosaurus = new AdvancedModelRenderer(this);
        this.Besanosaurus.setRotationPoint(0.0F, 46.0F, -28.0F);


        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -34.0F, 16.0F);
        this.Besanosaurus.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 119, 84, -4.0F, -4.0F, -0.3F, 8, 9, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.1F, -0.3F);
        this.Neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4887F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 125, 125, -3.5F, -2.0F, 0.1F, 7, 4, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.4F, -0.3F);
        this.Neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 95, 18, -3.5F, 0.0F, 0.0F, 7, 2, 6, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 1.1F, 5.7F);
        this.Neck.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 47, 81, -7.0F, -5.0F, -0.1F, 14, 11, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 8.1F, -0.7F);
        this.Body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2531F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 85, 92, -5.0F, -5.0959F, -0.1389F, 10, 5, 11, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.0F, -0.1F);
        this.Body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.096F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 100, 38, -4.0F, -0.1F, -0.6F, 8, 4, 11, -0.001F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(6.3F, 3.9F, 4.0F);
        this.Body1.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.0F, 0.0F, 0.3927F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 100, 54, 0.3536F, -0.6464F, -2.6F, 5, 1, 5, 0.0F, false));
        this.ArmL.cubeList.add(new ModelBox(ArmL, 67, 28, 0.3536F, -0.0464F, -2.6F, 27, 0, 9, 0.0F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-6.3F, 3.9F, 4.0F);
        this.Body1.addChild(ArmR);
        this.setRotateAngle(ArmR, 0.0F, 0.0F, -0.3927F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 100, 54, -5.3536F, -0.6464F, -2.6F, 5, 1, 5, 0.0F, true));
        this.ArmR.cubeList.add(new ModelBox(ArmR, 67, 28, -27.3536F, -0.0464F, -2.6F, 27, 0, 9, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.6F, 9.2F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 86, 109, 0.0F, -17.0F, 8.0F, 0, 10, 11, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 48, 43, -8.0F, -7.7F, -0.1F, 16, 18, 19, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 1.3F, 17.8F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 78, 131, 0.0F, -18.2F, 1.1F, 0, 12, 8, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 34, 0, -7.5F, -7.9F, -0.1F, 15, 12, 15, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 8.9F, 0.1F);
        this.Body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2269F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 65, -6.0F, -5.0586F, -0.3752F, 12, 5, 16, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -9.0F, 0.1F);
        this.Body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 87, -4.0F, 0.0F, 0.0F, 8, 2, 15, 0.0F, false));

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -3.4F, 15.0F);
        this.Body3.addChild(Hips);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 105, -6.0F, -4.0F, -0.7F, 12, 9, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 8.5F, -0.4F);
        this.Hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 122, 69, -4.0F, -3.8844F, -0.5444F, 8, 4, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.8F, -0.9F);
        this.Hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 127, 103, -3.0F, -0.073F, 0.2401F, 6, 4, 6, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(5.6F, 4.8F, 2.3F);
        this.Hips.addChild(LegL);
        this.setRotateAngle(LegL, 0.0F, 0.0F, 0.6109F);
        this.LegL.cubeList.add(new ModelBox(LegL, 0, 6, -0.3F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));
        this.LegL.cubeList.add(new ModelBox(LegL, 86, 84, -1.0F, -0.5F, -2.0F, 14, 0, 5, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-5.6F, 4.8F, 2.3F);
        this.Hips.addChild(LegR);
        this.setRotateAngle(LegR, 0.0F, 0.0F, -0.6109F);
        this.LegR.cubeList.add(new ModelBox(LegR, 0, 6, -2.7F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));
        this.LegR.cubeList.add(new ModelBox(LegR, 86, 84, -13.0F, -0.5F, -2.0F, 14, 0, 5, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.7F, 4.5F);
        this.Hips.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 37, 103, -4.0F, -3.0F, 0.0F, 8, 6, 10, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.3F, 0.2F);
        this.Tail1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2531F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 18, -2.5F, -3.8802F, -0.2914F, 5, 4, 10, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.6F, -0.2F);
        this.Tail1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 121, 7, -1.5F, -0.0814F, -0.2819F, 3, 3, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0475F, 0.0F, -0.0093F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 95, 0, -3.0F, -3.0F, -1.0F, 6, 5, 12, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.9F, -0.5F);
        this.Tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 98, 125, -1.0F, -1.9435F, -0.1768F, 2, 2, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 10.2F);
        this.Tail2.addChild(Tail3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 122, 54, -2.5F, -2.5F, 0.0F, 5, 5, 9, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -1.0F, 8.7F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 63, 109, 0.0F, -16.0F, -1.0F, 0, 15, 11, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 120, -2.0F, -1.8F, -0.1F, 4, 4, 10, -0.001F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.1F, 9.8F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 0, 0.0F, -16.1F, 0.0F, 0, 28, 33, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 7.7F, 20.1F);
        this.Tail5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3316F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 106, 68, -0.5F, -2.902F, 0.1866F, 1, 2, 13, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.0F, 8.8F);
        this.Tail5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5411F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -1.0F, 0.3F, 2.2F, 2, 3, 14, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0698F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 109, 109, -1.5F, -2.8F, -0.2F, 3, 4, 11, -0.002F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -35.0F, 16.0F);
        this.Besanosaurus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 128, 38, -2.5F, -1.5F, -7.0F, 5, 3, 7, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 80, 0, -2.5F, -1.1F, -7.0F, 5, 3, 7, -0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 62, -1.5F, 0.5F, -11.0F, 3, 1, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 21, 23, -1.0F, 0.5F, -14.0F, 2, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 98, 109, -0.5F, 0.5F, -22.0F, 1, 1, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 25.0F, -5.6F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1833F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 11, -2.5F, -24.6384F, -4.2996F, 5, 1, 1, 0.04F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 28, -2.5F, -25.1384F, -4.7996F, 5, 2, 2, 0.03F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.5F, -11.7F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3142F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 18, -1.0F, 0.5427F, 1.9973F, 2, 1, 3, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.2F, -11.7F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0698F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 0, -0.5F, 0.0109F, -3.9911F, 1, 1, 4, -0.002F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.2F, -11.8F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3316F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 121, -1.0F, 0.0367F, 0.0055F, 2, 1, 6, -0.002F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.7F, -3.1F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2269F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 0, -2.0F, -0.023F, -0.0967F, 4, 2, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.4F, -7.0F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3142F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 120, 0, -2.0F, -0.0542F, 0.0141F, 4, 2, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.5F, -21.6F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.0349F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 121, -0.1F, -0.6F, 0.0F, 0, 1, 13, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.5F, -21.6F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0349F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 121, 0.1F, -0.6F, 0.0F, 0, 1, 13, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.5F, -0.3F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 19, 6, -1.0F, 0.0F, -13.7F, 2, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 75, 109, -0.5F, 0.0F, -21.7F, 1, 1, 8, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 34, 6, -1.5F, 0.0F, -10.7F, 3, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 131, 22, -2.5F, 0.0F, -6.7F, 5, 2, 7, -0.002F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 64, 103, -2.0F, -1.0F, -6.6F, 4, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 18, -1.5F, -1.0F, -7.6F, 3, 1, 1, -0.002F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.0F, -10.3F);
        this.Jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2443F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -1.0F, -1.01F, 0.0103F, 2, 1, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.1F, 0.0F, -21.3F);
        this.Jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.0349F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 43, 123, 0.0F, -0.4F, 0.0F, 0, 1, 13, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.1F, 0.0F, -21.3F);
        this.Jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0349F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 123, 0.0F, -0.4F, 0.0F, 0, 1, 13, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 2.0F, -6.6F);
        this.Jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5498F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 20, 135, -2.0F, -4.1F, -0.1F, 4, 4, 7, -0.003F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Besanosaurus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.Head.offsetY = 0.33F;
        this.Jaw.rotateAngleX = (float) Math.toRadians(8);
        this.Head.rotateAngleX = (float) Math.toRadians(0);
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Besanosaurus.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(cube_r1, -0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.0795F, 0.0447F, 0.3082F);
        this.setRotateAngle(ArmR, -0.0504F, -0.0651F, -0.2716F);
        this.setRotateAngle(Body2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r5, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, 0.6376F, -0.4731F, 0.7534F);
        this.setRotateAngle(LegR, 0.1551F, 0.0803F, -1.0846F);
        this.setRotateAngle(Tail1, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0498F, 0.3051F, 0.0056F);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Tail5, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r14, -0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(Jaw, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r27, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(cube_r28, -0.5498F, 0.0F, 0.0F);
        this.Besanosaurus.offsetY = -0.35F;
        this.Besanosaurus.offsetX = -0.55F;
        this.Besanosaurus.offsetZ = 0.3F;
        this.Besanosaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.Besanosaurus.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(cube_r1, -0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.0795F, 0.0447F, 0.3082F);
        this.setRotateAngle(ArmR, -0.0504F, -0.0651F, -0.2716F);
        this.setRotateAngle(Body2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r5, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, 0.6376F, -0.4731F, 0.7534F);
        this.setRotateAngle(LegR, 0.1551F, 0.0803F, -1.0846F);
        this.setRotateAngle(Tail1, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0498F, 0.3051F, 0.0056F);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Tail5, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r14, -0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(Jaw, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r27, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(cube_r28, -0.5498F, 0.0F, 0.0F);
        this.Besanosaurus.offsetX = -0.55F;
        this.Besanosaurus.offsetZ = 0.3F;
        this.Besanosaurus.offsetY = 0.1F;
        this.Besanosaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


       AdvancedModelRenderer[] fishTail = {this.Body3, this.Hips, this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] upperBody = {this.Head};

        float speed = 0.15F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.8F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.18F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {

            this.setRotateAngle(ArmL, (float) Math.toRadians(0), (float) Math.toRadians(0), -(float) Math.toRadians(-45));
            this.setRotateAngle(ArmR, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-45));
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(upperBody, speed * still, 0.15F, 0, f2, 0.5F *still);
        }
        else {
            //Dont swing if on land - it loooks dumb
            //this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(ArmL, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(ArmL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
        this.walk(ArmL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(ArmR, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(ArmR, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
        this.walk(ArmR, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(LegL, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
        this.swing(LegL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        this.walk(LegL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        this.flap(LegR, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
        this.swing(LegR, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
        this.walk(LegR, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.Besanosaurus.offsetY = 0.15F;
            this.bob(Besanosaurus, -speed * 1.8F, 0.02F, false, f2, 1);
            this.walk(Jaw, (float) (speed * 1.8F), 0.15F, false, 1, 0, f2, 0);
            this.chainWave(fishTail, speed * 1.5F, 0.0025F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.01F, -0.25, f2, 0.2F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, -(float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

