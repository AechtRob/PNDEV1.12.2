package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCobelodus extends AdvancedModelBase {
    private final AdvancedModelRenderer Cobelodus;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer BarbL1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer BarbL2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer BarbL3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer BarbL4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer BarbR;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer BarbR2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer BarbR3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer BarbR4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer AnalR;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;

    private ModelAnimator animator;

    public ModelCobelodus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Cobelodus = new AdvancedModelRenderer(this);
        this.Cobelodus.setRotationPoint(0.0F, 16.6F, 1.5F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.6F, -0.3F);
        this.Cobelodus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 60, 58, -2.5F, -2.56F, -8.07F, 5, 4, 7, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 84, 62, -2.0F, 1.04F, -8.07F, 4, 1, 5, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.16F, -1.734F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 21, -2.5F, -0.5544F, 0.0664F, 5, 2, 2, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.728F, -2.31F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2443F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 71, -3.0F, 0.168F, -0.72F, 6, 3, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.456F, -6.63F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 76, 34, -2.0F, 0.0598F, 1.2191F, 4, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.476F, -8.03F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5585F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 87, -2.0F, -1.9677F, -2.851F, 4, 2, 3, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.876F, -10.93F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3665F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 2, 81, -2.0F, -2.6134F, 0.7693F, 4, 2, 2, -0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.224F, -5.43F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 79, -2.0F, -0.0672F, -3.9559F, 4, 2, 4, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.44F, -8.142F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3316F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.0F, -3.0F, 0.072F, 4, 3, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.7F, -9.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1833F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 83, 70, -2.5F, -7.4578F, 1.0484F, 5, 1, 1, 0.08F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 83, 73, -2.5F, -7.9578F, 0.5484F, 5, 2, 2, 0.07F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.36F, -0.1F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 45, 46, -2.5F, -0.2021F, -7.9359F, 5, 2, 9, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 96, 66, -2.0F, -1.2021F, -6.9359F, 4, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 0, -2.5F, -1.6393F, -2.7467F, 5, 2, 3, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.0139F, -4.5079F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1571F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 55, -1.5F, -2.2342F, -0.0568F, 3, 2, 5, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.2F, -0.5F);
        this.Cobelodus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 35, 58, -3.0F, -1.9998F, -0.0002F, 6, 6, 6, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 75, -1.5F, -2.52F, -0.24F, 3, 2, 6, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.36F, 0.0F);
        this.Body1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.192F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 70, -2.498F, -0.0428F, 0.0133F, 5, 2, 5, -0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 29, 0, -3.5F, -3.2F, 0.02F, 7, 8, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.4F, 8.42F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 43, -2.5F, -0.467F, -8.7794F, 5, 2, 9, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.6F, 2.24F, 1.06F);
        this.Body2.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.1745F, 0.6981F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 1.52F);
        this.PectoralL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.0698F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 87, -0.2F, 0.0F, -2.4F, 15, 0, 10, 0.0F, false));

        this.BarbL1 = new AdvancedModelRenderer(this);
        this.BarbL1.setRotationPoint(0.0F, 0.0F, 1.52F);
        this.PectoralL.addChild(BarbL1);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BarbL1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0524F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 79, -0.84F, -0.36F, -1.84F, 1, 1, 6, 0.0F, false));

        this.BarbL2 = new AdvancedModelRenderer(this);
        this.BarbL2.setRotationPoint(-0.08F, 0.24F, 3.44F);
        this.BarbL1.addChild(BarbL2);
        this.setRotateAngle(BarbL2, 0.0F, -0.0873F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.24F, -5.28F);
        this.BarbL2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0524F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 1, 7, -0.838F, -0.358F, 5.358F, 1, 1, 3, -0.01F, false));

        this.BarbL3 = new AdvancedModelRenderer(this);
        this.BarbL3.setRotationPoint(0.16F, 0.0F, 2.92F);
        this.BarbL2.addChild(BarbL3);
        this.setRotateAngle(BarbL3, 0.0F, -0.1047F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.16F, -0.24F, -8.16F);
        this.BarbL3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0524F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 9, -0.836F, -0.356F, 8.156F, 1, 1, 2, -0.02F, false));

        this.BarbL4 = new AdvancedModelRenderer(this);
        this.BarbL4.setRotationPoint(0.08F, -0.08F, 1.82F);
        this.BarbL3.addChild(BarbL4);
        this.setRotateAngle(BarbL4, 0.0F, -0.0524F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.24F, -0.16F, -10.48F);
        this.BarbL4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0524F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 13, -0.834F, -0.354F, 10.394F, 1, 1, 2, -0.03F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.6F, 2.24F, 1.06F);
        this.Body2.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, -0.1745F, -0.6981F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 1.52F);
        this.PectoralR.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0698F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 87, -14.8F, 0.0F, -2.4F, 15, 0, 10, 0.0F, true));

        this.BarbR = new AdvancedModelRenderer(this);
        this.BarbR.setRotationPoint(0.0F, 0.0F, 1.52F);
        this.PectoralR.addChild(BarbR);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BarbR.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.0524F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 79, -0.16F, -0.36F, -1.84F, 1, 1, 6, 0.0F, true));

        this.BarbR2 = new AdvancedModelRenderer(this);
        this.BarbR2.setRotationPoint(0.08F, 0.24F, 3.44F);
        this.BarbR.addChild(BarbR2);
        this.setRotateAngle(BarbR2, 0.0F, 0.0873F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.24F, -5.28F);
        this.BarbR2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.0524F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 1, 7, -0.162F, -0.358F, 5.358F, 1, 1, 3, -0.01F, true));

        this.BarbR3 = new AdvancedModelRenderer(this);
        this.BarbR3.setRotationPoint(-0.16F, 0.0F, 2.92F);
        this.BarbR2.addChild(BarbR3);
        this.setRotateAngle(BarbR3, 0.0F, 0.1047F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.16F, -0.24F, -8.16F);
        this.BarbR3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.0524F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 9, -0.164F, -0.356F, 8.156F, 1, 1, 2, -0.02F, true));

        this.BarbR4 = new AdvancedModelRenderer(this);
        this.BarbR4.setRotationPoint(-0.08F, -0.08F, 1.82F);
        this.BarbR3.addChild(BarbR4);
        this.setRotateAngle(BarbR4, 0.0F, 0.0524F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.24F, -0.16F, -10.48F);
        this.BarbR4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.0524F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 13, -0.166F, -0.354F, 10.394F, 1, 1, 2, -0.03F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 8.02F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 29, 18, -3.0F, -4.198F, -0.002F, 6, 9, 7, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -7.7F, 6.9F);
        this.Body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3491F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 27, -2.5F, 0.2082F, -8.1549F, 5, 3, 8, 0.01F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.2F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 40, -3.0F, -6.0F, 0.0F, 6, 10, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.Body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1222F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 56, -2.5F, -1.0F, 0.1F, 5, 1, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -5.6F, 5.6F);
        this.Body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 55, 0.0F, -10.08F, -5.28F, 0, 10, 9, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 0, -2.5F, -0.48F, -5.28F, 5, 2, 6, 0.0F, false));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(2.8F, 3.2F, 0.96F);
        this.Body4.addChild(AnalL);
        this.setRotateAngle(AnalL, 0.0F, 0.0F, 0.7418F);
        this.AnalL.cubeList.add(new ModelBox(AnalL, 51, 39, -0.2F, 0.0F, -0.8F, 9, 0, 6, 0.0F, false));

        this.AnalR = new AdvancedModelRenderer(this);
        this.AnalR.setRotationPoint(-2.8F, 3.2F, 0.96F);
        this.Body4.addChild(AnalR);
        this.setRotateAngle(AnalR, 0.0F, 0.0F, -0.7418F);
        this.AnalR.cubeList.add(new ModelBox(AnalR, 51, 39, -8.8F, 0.0F, -0.8F, 9, 0, 6, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.8F, 5.6F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 67, 0, -2.5F, -3.1F, 0.0F, 5, 6, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.Body5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2793F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 65, 46, -2.0F, -1.9872F, -0.0568F, 4, 2, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -4.8F, 0.0F);
        this.Body5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2269F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 1, 69, -2.0F, -0.48F, 0.3F, 4, 3, 6, -0.01F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 6.1F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 69, 21, -2.0F, -2.92F, -0.7F, 4, 5, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -3.36F, -0.78F);
        this.Body6.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1658F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 77, 13, -1.5F, -0.4614F, 0.0781F, 3, 2, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 3.28F, -0.86F);
        this.Body6.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2269F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 70, 72, -1.5F, -2.0219F, -0.0792F, 3, 2, 6, -0.01F, false));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 4.1F);
        this.Body6.addChild(Body7);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body7.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0524F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 78, -1.5F, -3.0F, -0.32F, 3, 5, 4, 0.0F, false));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, -2.32F, 3.6F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 2, 0.0F, -7.58F, -1.1F, 0, 24, 14, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.0F, 3.04F);
        this.Body8.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.6632F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 52, 8, -1.0F, 0.2356F, -0.8479F, 2, 2, 10, -0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body8.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.384F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 26, 55, -1.0F, -0.52F, -1.28F, 2, 3, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Cobelodus.render(f5 * 0.5F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Cobelodus.rotateAngleY = (float) Math.toRadians(90);
        this.Head.rotateAngleY = (float) Math.toRadians(-20);
        this.Jaw.rotateAngleX = (float) Math.toRadians(27);
        this.Body2.rotateAngleY = (float) Math.toRadians(7.5);
        this.Body3.rotateAngleY = (float) Math.toRadians(12.5);
        this.Body4.rotateAngleY = (float) Math.toRadians(10);
        this.Body5.rotateAngleY = (float) Math.toRadians(-15);
        this.Body6.rotateAngleY = (float) Math.toRadians(-22.5);
        this.Body7.rotateAngleY = (float) Math.toRadians(-12.5);
        this.Body8.rotateAngleY = (float) Math.toRadians(-15);
        this.Cobelodus.offsetX = -0.2F;
        this.Cobelodus.offsetY = -0.15F;
        this.Cobelodus.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.Cobelodus.offsetY = 0.7F;

        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5, this.Body6, this.Body7, this.Body8};

        float speed = 0.18F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.28F * still, -0.85, f2, 0.6F * still);
            this.swing(Cobelodus, speed, 0.12F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Cobelodus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralL, (float) (speed), 0.35F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralL, (float) (speed * 0.85), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(PectoralR, (float) (speed), -0.35F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralR, (float) (speed * 0.85), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(AnalL, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(AnalL, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(AnalR, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(AnalR, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.Cobelodus.rotateAngleZ = (float) Math.toRadians(90);
            this.Cobelodus.offsetY = 0.9F;
            this.bob(Cobelodus, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

