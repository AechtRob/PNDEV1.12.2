package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSibyrhynchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Sibyrhynchus;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer PectoralL2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer AnalL2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;

    public ModelSibyrhynchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Sibyrhynchus = new AdvancedModelRenderer(this);
        this.Sibyrhynchus.setRotationPoint(0.0F, 17.0F, 2.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.2F, -1.7F);
        this.Sibyrhynchus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 13, 46, -2.0F, -2.1F, -4.2F, 4, 5, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 26, -2.4F, -2.1F, -2.2F, 5, 6, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.2F, -6.9F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6136F, 0.2892F, -0.1982F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -0.5F, -0.6892F, 1.445F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 3, 3, -0.2F, -0.6892F, 0.545F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, 0.1F, -0.6892F, 0.045F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.2F, -6.9F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6136F, -0.2892F, 0.1982F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 3, 0.5F, -0.6892F, 1.445F, 0, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 3, 0.2F, -0.6892F, 0.545F, 0, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, -0.1F, -0.6892F, 0.045F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.9F, 0.0F, -6.2F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.9617F, -0.8326F, 0.8146F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.2543F, -0.4361F, -0.5205F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.9F, 0.0F, -6.2F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.9617F, 0.8326F, -0.8146F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.7457F, -0.4361F, -0.5205F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.0F, -4.2F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5847F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 39, -1.0F, -1.0F, -3.3F, 2, 1, 2, 0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 39, -1.5F, -1.0F, -1.3F, 3, 1, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.0F, -6.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3142F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 29, -1.5F, -0.0454F, 0.0394F, 2, 1, 1, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.1F, -4.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 53, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.9F, -5.8F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.925F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 57, -1.5F, -0.2653F, -1.0011F, 2, 3, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.1F, -4.2F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 0, -1.5F, 0.0F, -2.0F, 3, 3, 2, 0.013F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.1F, -2.2F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 39, -2.0F, 0.0F, 0.1F, 4, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.9F, -2.2F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 39, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.4F, -6.3F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3229F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 53, -2.0F, 3.4993F, 3.4185F, 4, 2, 2, 0.03F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 57, -2.0F, 3.9993F, 3.9185F, 4, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.1F, -4.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.5411F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 35, 54, -1.5F, -0.1F, -1.5F, 3, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 22, -1.0F, -0.1F, -4.2F, 2, 1, 3, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -3.4F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 57, 17, -0.5F, -0.1F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.4363F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 26, 0.1F, -0.4F, 0.6F, 0, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 14, -0.2F, -0.4F, 0.9F, 0, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 17, -0.5F, -0.4F, 1.3F, 0, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 3, 14, -0.9F, -0.4F, 2.1F, 0, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 3, 17, -1.3F, -0.4F, 2.3F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.4363F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 17, 0.5F, -0.4F, 1.3F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 3, 14, 0.9F, -0.4F, 2.1F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 3, 17, 1.3F, -0.4F, 2.3F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 14, 0.2F, -0.4F, 0.9F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 26, -0.1F, -0.4F, 0.6F, 0, 1, 1, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.Sibyrhynchus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.5F, -3.0F, 0.0F, 7, 7, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.Body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1571F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 20, -2.5F, -2.0F, 0.2F, 6, 2, 6, -0.001F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.2F, -0.3F, 0.8F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.8225F, -0.65F, -0.7319F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 53, 31, -0.4333F, -0.7506F, -0.6915F, 3, 1, 2, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 42, 12, 2.5667F, -0.7506F, -0.6915F, 8, 1, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 41, 45, 2.5667F, 0.1494F, -1.2415F, 8, 0, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 44, 4, 2.5667F, -0.6506F, -1.2415F, 8, 0, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 42, 15, 2.5667F, -0.2506F, -1.2415F, 8, 0, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 19, 14, 1.0667F, -0.0506F, -0.6915F, 9, 0, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.5667F, 0.1494F, -0.6915F);
        this.PectoralL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.5708F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 9, 0.0F, 0.8F, -0.55F, 8, 0, 2, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 19, 0.0F, 0.3F, -0.55F, 8, 0, 2, 0.0F, false));

        this.PectoralL2 = new AdvancedModelRenderer(this);
        this.PectoralL2.setRotationPoint(-3.2F, -0.3F, 0.8F);
        this.Body1.addChild(PectoralL2);
        this.setRotateAngle(PectoralL2, -0.8225F, 0.65F, 0.7319F);
        this.PectoralL2.cubeList.add(new ModelBox(PectoralL2, 53, 31, -2.5667F, -0.7506F, -0.6915F, 3, 1, 2, 0.0F, true));
        this.PectoralL2.cubeList.add(new ModelBox(PectoralL2, 42, 12, -10.5667F, -0.7506F, -0.6915F, 8, 1, 1, 0.0F, true));
        this.PectoralL2.cubeList.add(new ModelBox(PectoralL2, 41, 45, -10.5667F, 0.1494F, -1.2415F, 8, 0, 1, 0.0F, true));
        this.PectoralL2.cubeList.add(new ModelBox(PectoralL2, 44, 4, -10.5667F, -0.6506F, -1.2415F, 8, 0, 1, 0.0F, true));
        this.PectoralL2.cubeList.add(new ModelBox(PectoralL2, 42, 15, -10.5667F, -0.2506F, -1.2415F, 8, 0, 1, 0.0F, true));
        this.PectoralL2.cubeList.add(new ModelBox(PectoralL2, 19, 14, -10.0667F, -0.0506F, -0.6915F, 9, 0, 4, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.5667F, 0.1494F, -0.6915F);
        this.PectoralL2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.5708F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 27, 9, -8.0F, 0.8F, -0.55F, 8, 0, 2, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 19, -8.0F, 0.3F, -0.55F, 8, 0, 2, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.8F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 14, -3.0F, -2.0F, 0.0F, 6, 5, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 5.0F, 0.3F);
        this.Body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2094F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 27, 0, -2.5F, -2.0798F, -0.0093F, 5, 2, 6, -0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 23, -2.0F, 0.0F, 0.2F, 4, 1, 6, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 26, 42, -1.5F, -1.0F, 3.0F, 3, 2, 4, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 38, 31, -2.5F, -1.0F, -1.0F, 5, 3, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.Body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 48, 6, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 22, 50, -1.0F, -2.0F, 3.0F, 2, 2, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.Body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 43, 55, 0.0F, -2.1F, 1.1F, 0, 2, 3, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 47, -1.5F, -0.1F, 0.1F, 3, 2, 3, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 47, -1.0F, -0.1F, 3.1F, 2, 2, 4, 0.0F, false));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(1.2F, 2.1F, 0.7F);
        this.Body3.addChild(AnalL);
        this.setRotateAngle(AnalL, 0.0335F, 0.0806F, 0.8304F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.1778F, -0.0619F, 0.1037F);
        this.AnalL.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.0873F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 12, 29, 0.0F, -0.01F, 0.0F, 1, 0, 9, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1778F, -0.0619F, 0.1037F);
        this.AnalL.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.6109F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 0, 0.0F, 0.0F, -1.0F, 5, 0, 3, 0.0F, false));

        this.AnalL2 = new AdvancedModelRenderer(this);
        this.AnalL2.setRotationPoint(-1.2F, 2.1F, 0.7F);
        this.Body3.addChild(AnalL2);
        this.setRotateAngle(AnalL2, 0.0335F, -0.0806F, -0.8304F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.1778F, -0.0619F, 0.1037F);
        this.AnalL2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0873F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 12, 29, -1.0F, -0.01F, 0.0F, 1, 0, 9, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.1778F, -0.0619F, 0.1037F);
        this.AnalL2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.6109F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 44, 0, -5.0F, 0.0F, -1.0F, 5, 0, 3, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 26, 32, -1.0F, -1.0F, -1.0F, 2, 2, 7, -0.002F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.1F, 5.9F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 24, 29, -0.5F, -1.6F, 0.0F, 1, 3, 3, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 38, 0.0F, -4.0F, 0.3F, 0, 8, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Sibyrhynchus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Sibyrhynchus.offsetY = -0.18F;
        this.Sibyrhynchus.offsetZ = -0.05F;
        this.Sibyrhynchus.offsetX = -0.1F;
        this.Sibyrhynchus.rotateAngleY = (float) Math.toRadians(90);
        this.Sibyrhynchus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Sibyrhynchus, 0.0436F, 0.0F, -0.0873F);
        this.setRotateAngle(PectoralL2, -0.8225F, 0.65F, 0.7319F);
        this.setRotateAngle(PectoralL, -0.8225F, -0.65F, -0.7319F);
        this.setRotateAngle(Jaw, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.925F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.9617F, 0.8326F, -0.8146F);
        this.setRotateAngle(cube_r3, -0.9617F, -0.8326F, 0.8146F);
        this.setRotateAngle(cube_r26, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(cube_r25, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.6136F, -0.2892F, 0.1982F);
        this.setRotateAngle(cube_r19, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 1.5708F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 1.5708F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.6136F, 0.2892F, -0.1982F);
        this.setRotateAngle(Body5, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(Body3, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Body2, 0.0436F, -0.0436F, 0.0F);
        this.setRotateAngle(Body1, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(AnalL2, 0.0335F, -0.0806F, -0.8304F);
        this.setRotateAngle(AnalL, 0.0335F, 0.0806F, 0.8304F);
        this.Sibyrhynchus.offsetZ = -0.1F;
        this.Sibyrhynchus.offsetY = -0.6F;
        this.Sibyrhynchus.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        //this.root.offsetY = 1.1F;

        AdvancedModelRenderer[] finLeft = {this.PectoralL};
        AdvancedModelRenderer[] finRight = {this.PectoralL2};
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            if (f3 != 0 || !(e.isInWater())) {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
                this.swing(Sibyrhynchus, speed, 0.3F, true, 0, 0, f2, 1);
            }

            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finLeft, speed, -0.30F, -0.8, f2, 1);

            this.walk(PectoralL2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finRight, speed, 0.30F, 0.8, f2, 1);

            this.walk(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(AnalL2, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(AnalL2, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
            this.flap(AnalL2, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

            if (!e.isInWater()) {
                this.Sibyrhynchus.rotateAngleZ = (float) Math.toRadians(90);
                //this.root.offsetY = 1.25F;
                this.bob(Sibyrhynchus, -speed, 5F, false, f2, 1);
            }
        }
    }
}
