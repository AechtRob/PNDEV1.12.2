package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTamisiocaris;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelTamisiocaris extends AdvancedModelBase {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer AppendageR;
    private final AdvancedModelRenderer AppendageR2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer AppendageR3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer AppendageR4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer AppendageL;
    private final AdvancedModelRenderer AppendageL2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer AppendageL3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer AppendageL4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer FinR1;
    private final AdvancedModelRenderer FinL1;
    private final AdvancedModelRenderer FinR2;
    private final AdvancedModelRenderer FinL2;
    private final AdvancedModelRenderer FinR3;
    private final AdvancedModelRenderer FinL3;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer TailR1;
    private final AdvancedModelRenderer TailL1;
    private final AdvancedModelRenderer TailR2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer TailL2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer TailR3;
    private final AdvancedModelRenderer TailL3;
    private final AdvancedModelRenderer FinR11;
    private final AdvancedModelRenderer FinL11;
    private final AdvancedModelRenderer FinR12;
    private final AdvancedModelRenderer FinL12;
    private final AdvancedModelRenderer FinR13;
    private final AdvancedModelRenderer FinL13;
    private final AdvancedModelRenderer FinR14;
    private final AdvancedModelRenderer FinL14;
    private final AdvancedModelRenderer FinR9;
    private final AdvancedModelRenderer FinL9;
    private final AdvancedModelRenderer FinR10;
    private final AdvancedModelRenderer FinL10;
    private final AdvancedModelRenderer FinR4;
    private final AdvancedModelRenderer FinL4;
    private final AdvancedModelRenderer FinR5;
    private final AdvancedModelRenderer FinL5;
    private final AdvancedModelRenderer FinR6;
    private final AdvancedModelRenderer FinL6;
    private final AdvancedModelRenderer FinR7;
    private final AdvancedModelRenderer FinL7;
    private final AdvancedModelRenderer FinR8;
    private final AdvancedModelRenderer FinL8;

    private ModelAnimator animator;

    public ModelTamisiocaris() {
        this.textureWidth = 36;
        this.textureHeight = 31;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 23.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 12, -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 16, 27, -1.0F, 0.25F, -3.5F, 2, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 12, -0.5F, 0.26F, -3.0F, 1, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 27, -2.75F, -1.5F, -2.5F, 1, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 27, 1.75F, -1.5F, -2.5F, 1, 2, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -1.5F, 0.0F, -1.0F, 3, 1, 4, 0.0F, false));

        this.AppendageR = new AdvancedModelRenderer(this);
        this.AppendageR.setRotationPoint(-1.0F, 0.0F, -3.5F);
        this.Head.addChild(AppendageR);
        this.setRotateAngle(AppendageR, 0.2182F, 0.0F, 0.0F);
        this.AppendageR.cubeList.add(new ModelBox(AppendageR, 10, 25, -0.5F, -0.25F, -3.0F, 1, 1, 3, 0.02F, false));
        this.AppendageR.cubeList.add(new ModelBox(AppendageR, 0, 4, -0.5F, -0.75F, -3.0F, 1, 1, 3, 0.01F, false));

        this.AppendageR2 = new AdvancedModelRenderer(this);
        this.AppendageR2.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.AppendageR.addChild(AppendageR2);
        this.setRotateAngle(AppendageR2, 0.0873F, 0.0F, 0.0F);
        this.AppendageR2.cubeList.add(new ModelBox(AppendageR2, 22, 24, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.4F, -2.0F);
        this.AppendageR2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.059F, -0.0643F, 1.438F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 28, -0.7F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.4F, -2.0F);
        this.AppendageR2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.059F, 0.0643F, -1.438F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 28, -2.3F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.4F, -1.0F);
        this.AppendageR2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.059F, -0.0643F, 1.438F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 29, -0.6F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.4F, -1.0F);
        this.AppendageR2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.059F, 0.0643F, -1.438F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 29, -2.4F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.4F, 0.0F);
        this.AppendageR2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.059F, -0.0643F, 1.438F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 29, -0.5F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.4F, 0.0F);
        this.AppendageR2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.059F, 0.0643F, -1.438F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 29, -2.5F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.AppendageR3 = new AdvancedModelRenderer(this);
        this.AppendageR3.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.AppendageR2.addChild(AppendageR3);
        this.setRotateAngle(AppendageR3, 0.1745F, 0.0F, 0.0F);
        this.AppendageR3.cubeList.add(new ModelBox(AppendageR3, 5, 24, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.4F, -2.25F);
        this.AppendageR3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.059F, -0.0643F, 1.438F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.4F, -2.25F);
        this.AppendageR3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.059F, 0.0643F, -1.438F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.4F, -1.25F);
        this.AppendageR3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.059F, -0.0643F, 1.438F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 3, 28, -0.9F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.4F, -1.25F);
        this.AppendageR3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.059F, 0.0643F, -1.438F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 3, 28, -2.1F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.4F, -0.25F);
        this.AppendageR3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.059F, -0.0643F, 1.438F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 28, -0.8F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.4F, -0.25F);
        this.AppendageR3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.059F, 0.0643F, -1.438F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 28, -2.2F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.AppendageR4 = new AdvancedModelRenderer(this);
        this.AppendageR4.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.AppendageR3.addChild(AppendageR4);
        this.setRotateAngle(AppendageR4, 0.2618F, 0.0F, 0.0F);
        this.AppendageR4.cubeList.add(new ModelBox(AppendageR4, 0, 23, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.4F, -1.5F);
        this.AppendageR4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0593F, 0.1099F, 1.4483F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.4F, -1.5F);
        this.AppendageR4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0593F, -0.1099F, -1.4483F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.4F, -0.5F);
        this.AppendageR4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0589F, 0.0228F, 1.4431F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.4F, -0.5F);
        this.AppendageR4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0589F, -0.0228F, -1.4431F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.AppendageL = new AdvancedModelRenderer(this);
        this.AppendageL.setRotationPoint(1.0F, 0.0F, -3.5F);
        this.Head.addChild(AppendageL);
        this.setRotateAngle(AppendageL, 0.2182F, 0.0F, 0.0F);
        this.AppendageL.cubeList.add(new ModelBox(AppendageL, 10, 25, -0.5F, -0.25F, -3.0F, 1, 1, 3, 0.02F, true));
        this.AppendageL.cubeList.add(new ModelBox(AppendageL, 0, 4, -0.5F, -0.75F, -3.0F, 1, 1, 3, 0.01F, true));

        this.AppendageL2 = new AdvancedModelRenderer(this);
        this.AppendageL2.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.AppendageL.addChild(AppendageL2);
        this.setRotateAngle(AppendageL2, 0.0873F, 0.0F, 0.0F);
        this.AppendageL2.cubeList.add(new ModelBox(AppendageL2, 22, 24, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.4F, -2.0F);
        this.AppendageL2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.059F, 0.0643F, -1.438F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 28, -2.3F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.4F, -2.0F);
        this.AppendageL2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.059F, -0.0643F, 1.438F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 28, -0.7F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.4F, -1.0F);
        this.AppendageL2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.059F, 0.0643F, -1.438F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 5, 29, -2.4F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.4F, -1.0F);
        this.AppendageL2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.059F, -0.0643F, 1.438F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 29, -0.6F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.4F, 0.0F);
        this.AppendageL2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.059F, 0.0643F, -1.438F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 23, 29, -2.5F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.4F, 0.0F);
        this.AppendageL2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.059F, -0.0643F, 1.438F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 23, 29, -0.5F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.AppendageL3 = new AdvancedModelRenderer(this);
        this.AppendageL3.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.AppendageL2.addChild(AppendageL3);
        this.setRotateAngle(AppendageL3, 0.1745F, 0.0F, 0.0F);
        this.AppendageL3.cubeList.add(new ModelBox(AppendageL3, 5, 24, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.4F, -2.25F);
        this.AppendageL3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.059F, 0.0643F, -1.438F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.4F, -2.25F);
        this.AppendageL3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.059F, -0.0643F, 1.438F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 11, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.4F, -1.25F);
        this.AppendageL3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.059F, 0.0643F, -1.438F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 3, 28, -2.1F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.4F, -1.25F);
        this.AppendageL3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.059F, -0.0643F, 1.438F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 3, 28, -0.9F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.4F, -0.25F);
        this.AppendageL3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.059F, 0.0643F, -1.438F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 28, -2.2F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.4F, -0.25F);
        this.AppendageL3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.059F, -0.0643F, 1.438F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 27, 28, -0.8F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.AppendageL4 = new AdvancedModelRenderer(this);
        this.AppendageL4.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.AppendageL3.addChild(AppendageL4);
        this.setRotateAngle(AppendageL4, 0.2618F, 0.0F, 0.0F);
        this.AppendageL4.cubeList.add(new ModelBox(AppendageL4, 0, 23, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.02F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.4F, -1.5F);
        this.AppendageL4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0593F, -0.1099F, -1.4483F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.4F, -1.5F);
        this.AppendageL4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0593F, 0.1099F, 1.4483F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 11, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 0.4F, -0.5F);
        this.AppendageL4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0589F, -0.0228F, -1.4431F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.4F, -0.5F);
        this.AppendageL4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0589F, 0.0228F, 1.4431F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 11, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 22, 0, -2.0F, -0.99F, 0.0F, 4, 2, 3, 0.0F, false));

        this.FinR1 = new AdvancedModelRenderer(this);
        this.FinR1.setRotationPoint(-2.0F, 0.75F, 0.5F);
        this.Body.addChild(FinR1);
        this.FinR1.cubeList.add(new ModelBox(FinR1, 4, 4, -1.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.FinL1 = new AdvancedModelRenderer(this);
        this.FinL1.setRotationPoint(2.0F, 0.75F, 0.5F);
        this.Body.addChild(FinL1);
        this.FinL1.cubeList.add(new ModelBox(FinL1, 4, 4, -1.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.FinR2 = new AdvancedModelRenderer(this);
        this.FinR2.setRotationPoint(-2.0F, 0.75F, 1.5F);
        this.Body.addChild(FinR2);
        this.FinR2.cubeList.add(new ModelBox(FinR2, 27, 9, -1.3F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.FinL2 = new AdvancedModelRenderer(this);
        this.FinL2.setRotationPoint(2.0F, 0.75F, 1.5F);
        this.Body.addChild(FinL2);
        this.FinL2.cubeList.add(new ModelBox(FinL2, 27, 9, -1.7F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.FinR3 = new AdvancedModelRenderer(this);
        this.FinR3.setRotationPoint(-2.0F, 0.75F, 2.5F);
        this.Body.addChild(FinR3);
        this.FinR3.cubeList.add(new ModelBox(FinR3, 14, 26, -1.6F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.FinL3 = new AdvancedModelRenderer(this);
        this.FinL3.setRotationPoint(2.0F, 0.75F, 2.5F);
        this.Body.addChild(FinL3);
        this.FinL3.cubeList.add(new ModelBox(FinL3, 14, 26, -1.4F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -3.0F, -1.0F, 0.0F, 6, 2, 10, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 11, 20, -2.0F, -0.99F, 0.0F, 4, 2, 3, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 12, 14, -1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 27, 24, -0.5F, -0.5F, 3.0F, 1, 1, 2, 0.0F, false));

        this.TailR1 = new AdvancedModelRenderer(this);
        this.TailR1.setRotationPoint(-1.0F, -0.15F, 0.0F);
        this.Body5.addChild(TailR1);
        this.setRotateAngle(TailR1, 0.0F, 0.7418F, 0.1309F);
        this.TailR1.cubeList.add(new ModelBox(TailR1, 20, 7, -6.0F, 0.0F, 0.0F, 6, 0, 2, 0.0F, false));

        this.TailL1 = new AdvancedModelRenderer(this);
        this.TailL1.setRotationPoint(1.0F, -0.15F, 0.0F);
        this.Body5.addChild(TailL1);
        this.setRotateAngle(TailL1, 0.0F, -0.7418F, -0.1309F);
        this.TailL1.cubeList.add(new ModelBox(TailL1, 20, 7, 0.0F, 0.0F, 0.0F, 6, 0, 2, 0.0F, true));

        this.TailR2 = new AdvancedModelRenderer(this);
        this.TailR2.setRotationPoint(-1.0F, -0.25F, 1.0F);
        this.Body5.addChild(TailR2);
        this.setRotateAngle(TailR2, 0.0F, 0.8727F, 0.1309F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.TailR2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0436F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 20, 5, -6.0F, 0.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.TailL2 = new AdvancedModelRenderer(this);
        this.TailL2.setRotationPoint(1.0F, -0.25F, 1.0F);
        this.Body5.addChild(TailL2);
        this.setRotateAngle(TailL2, 0.0F, -0.8727F, -0.1309F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.TailL2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.0436F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 5, 0.0F, 0.0F, -1.0F, 6, 0, 2, 0.0F, true));

        this.TailR3 = new AdvancedModelRenderer(this);
        this.TailR3.setRotationPoint(-1.0F, -0.35F, 2.0F);
        this.Body5.addChild(TailR3);
        this.setRotateAngle(TailR3, 0.0F, 1.2217F, 0.1309F);
        this.TailR3.cubeList.add(new ModelBox(TailR3, 10, 12, -6.0F, 0.0F, 0.0F, 6, 0, 2, 0.0F, false));

        this.TailL3 = new AdvancedModelRenderer(this);
        this.TailL3.setRotationPoint(1.0F, -0.35F, 2.0F);
        this.Body5.addChild(TailL3);
        this.setRotateAngle(TailL3, 0.0F, -1.2217F, -0.1309F);
        this.TailL3.cubeList.add(new ModelBox(TailL3, 10, 12, 0.0F, 0.0F, 0.0F, 6, 0, 2, 0.0F, true));

        this.FinR11 = new AdvancedModelRenderer(this);
        this.FinR11.setRotationPoint(-1.5F, 0.75F, 0.5F);
        this.Body4.addChild(FinR11);
        this.FinR11.cubeList.add(new ModelBox(FinR11, 0, 8, -3.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.FinL11 = new AdvancedModelRenderer(this);
        this.FinL11.setRotationPoint(1.5F, 0.75F, 0.5F);
        this.Body4.addChild(FinL11);
        this.FinL11.cubeList.add(new ModelBox(FinL11, 0, 8, -0.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.FinR12 = new AdvancedModelRenderer(this);
        this.FinR12.setRotationPoint(-1.5F, 0.75F, 1.5F);
        this.Body4.addChild(FinR12);
        this.FinR12.cubeList.add(new ModelBox(FinR12, 14, 25, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.FinL12 = new AdvancedModelRenderer(this);
        this.FinL12.setRotationPoint(1.5F, 0.75F, 1.5F);
        this.Body4.addChild(FinL12);
        this.FinL12.cubeList.add(new ModelBox(FinL12, 14, 25, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.FinR13 = new AdvancedModelRenderer(this);
        this.FinR13.setRotationPoint(-1.5F, 0.75F, 2.5F);
        this.Body4.addChild(FinR13);
        this.FinR13.cubeList.add(new ModelBox(FinR13, 4, 23, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.FinL13 = new AdvancedModelRenderer(this);
        this.FinL13.setRotationPoint(1.5F, 0.75F, 2.5F);
        this.Body4.addChild(FinL13);
        this.FinL13.cubeList.add(new ModelBox(FinL13, 4, 23, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.FinR14 = new AdvancedModelRenderer(this);
        this.FinR14.setRotationPoint(-1.5F, 0.75F, 3.5F);
        this.Body4.addChild(FinR14);
        this.FinR14.cubeList.add(new ModelBox(FinR14, 21, 9, -2.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.FinL14 = new AdvancedModelRenderer(this);
        this.FinL14.setRotationPoint(1.5F, 0.75F, 3.5F);
        this.Body4.addChild(FinL14);
        this.FinL14.cubeList.add(new ModelBox(FinL14, 21, 9, -0.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.FinR9 = new AdvancedModelRenderer(this);
        this.FinR9.setRotationPoint(-2.0F, 0.75F, 1.0F);
        this.Body3.addChild(FinR9);
        this.FinR9.cubeList.add(new ModelBox(FinR9, 22, 12, -4.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.FinL9 = new AdvancedModelRenderer(this);
        this.FinL9.setRotationPoint(2.0F, 0.75F, 1.0F);
        this.Body3.addChild(FinL9);
        this.FinL9.cubeList.add(new ModelBox(FinL9, 22, 12, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.FinR10 = new AdvancedModelRenderer(this);
        this.FinR10.setRotationPoint(-2.0F, 0.75F, 2.5F);
        this.Body3.addChild(FinR10);
        this.FinR10.cubeList.add(new ModelBox(FinR10, 0, 9, -3.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.FinL10 = new AdvancedModelRenderer(this);
        this.FinL10.setRotationPoint(2.0F, 0.75F, 2.5F);
        this.Body3.addChild(FinL10);
        this.FinL10.cubeList.add(new ModelBox(FinL10, 0, 9, -0.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.FinR4 = new AdvancedModelRenderer(this);
        this.FinR4.setRotationPoint(-3.0F, 0.75F, 1.0F);
        this.Body2.addChild(FinR4);
        this.FinR4.cubeList.add(new ModelBox(FinR4, 24, 18, -4.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.FinL4 = new AdvancedModelRenderer(this);
        this.FinL4.setRotationPoint(3.0F, 0.75F, 1.0F);
        this.Body2.addChild(FinL4);
        this.FinL4.cubeList.add(new ModelBox(FinL4, 24, 18, -0.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.FinR5 = new AdvancedModelRenderer(this);
        this.FinR5.setRotationPoint(-3.0F, 0.75F, 3.0F);
        this.Body2.addChild(FinR5);
        this.FinR5.cubeList.add(new ModelBox(FinR5, 20, 20, -5.25F, 0.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.FinL5 = new AdvancedModelRenderer(this);
        this.FinL5.setRotationPoint(3.0F, 0.75F, 3.0F);
        this.Body2.addChild(FinL5);
        this.FinL5.cubeList.add(new ModelBox(FinL5, 20, 20, -0.75F, 0.0F, -1.0F, 6, 0, 2, 0.0F, true));

        this.FinR6 = new AdvancedModelRenderer(this);
        this.FinR6.setRotationPoint(-3.0F, 0.75F, 5.0F);
        this.Body2.addChild(FinR6);
        this.FinR6.cubeList.add(new ModelBox(FinR6, 20, 16, -5.75F, 0.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.FinL6 = new AdvancedModelRenderer(this);
        this.FinL6.setRotationPoint(3.0F, 0.75F, 5.0F);
        this.Body2.addChild(FinL6);
        this.FinL6.cubeList.add(new ModelBox(FinL6, 20, 16, -0.25F, 0.0F, -1.0F, 6, 0, 2, 0.0F, true));

        this.FinR7 = new AdvancedModelRenderer(this);
        this.FinR7.setRotationPoint(-3.0F, 0.75F, 7.0F);
        this.Body2.addChild(FinR7);
        this.FinR7.cubeList.add(new ModelBox(FinR7, 20, 14, -5.25F, 0.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.FinL7 = new AdvancedModelRenderer(this);
        this.FinL7.setRotationPoint(3.0F, 0.75F, 7.0F);
        this.Body2.addChild(FinL7);
        this.FinL7.cubeList.add(new ModelBox(FinL7, 20, 14, -0.75F, 0.0F, -1.0F, 6, 0, 2, 0.0F, true));

        this.FinR8 = new AdvancedModelRenderer(this);
        this.FinR8.setRotationPoint(-3.0F, 0.75F, 9.0F);
        this.Body2.addChild(FinR8);
        this.FinR8.cubeList.add(new ModelBox(FinR8, 23, 22, -4.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.FinL8 = new AdvancedModelRenderer(this);
        this.FinL8.setRotationPoint(3.0F, 0.75F, 9.0F);
        this.Body2.addChild(FinL8);
        this.FinL8.cubeList.add(new ModelBox(FinL8, 23, 22, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.Root.offsetZ = -0.15F;
        this.Root.offsetY = -0.13F;
        this.Root.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(TailR3, 0.0F, 1.2217F, 0.1309F);
        this.setRotateAngle(TailR2, 0.0F, 0.8727F, 0.1309F);
        this.setRotateAngle(TailR1, 0.0F, 0.7418F, 0.1309F);
        this.setRotateAngle(TailL3, 0.0F, -1.2217F, -0.1309F);
        this.setRotateAngle(TailL2, 0.0F, -0.8727F, -0.1309F);
        this.setRotateAngle(TailL1, 0.0F, -0.7418F, -0.1309F);
        this.setRotateAngle(Root, -0.0436F, 0.0436F, -0.1745F);
        this.setRotateAngle(Head, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r8, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r7, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r6, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r5, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r4, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r35, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r34, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r33, 0.0589F, 0.0228F, 1.4431F);
        this.setRotateAngle(cube_r32, 0.0589F, -0.0228F, -1.4431F);
        this.setRotateAngle(cube_r31, 0.0593F, 0.1099F, 1.4483F);
        this.setRotateAngle(cube_r30, 0.0593F, -0.1099F, -1.4483F);
        this.setRotateAngle(cube_r3, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r29, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r28, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r27, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r26, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r25, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r24, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r23, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r22, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r21, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r20, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r2, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r19, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r18, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r17, 0.0589F, -0.0228F, -1.4431F);
        this.setRotateAngle(cube_r16, 0.0589F, 0.0228F, 1.4431F);
        this.setRotateAngle(cube_r15, 0.0593F, -0.1099F, -1.4483F);
        this.setRotateAngle(cube_r14, 0.0593F, 0.1099F, 1.4483F);
        this.setRotateAngle(cube_r13, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r12, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r11, 0.059F, 0.0643F, -1.438F);
        this.setRotateAngle(cube_r10, 0.059F, -0.0643F, 1.438F);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(AppendageR4, 0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(AppendageR3, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(AppendageR2, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(AppendageR, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(AppendageL4, 0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(AppendageL3, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(AppendageL2, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(AppendageL, 0.4363F, 0.0F, 0.0F);
        this.Root.offsetY = -0.7F;
        this.Root.render(0.01f);
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
        this.Root.offsetY = -0.1F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }

        EntityPrehistoricFloraTamisiocaris ee = (EntityPrehistoricFloraTamisiocaris) e;

        AdvancedModelRenderer[] bodyF = {this.Body2, this.Body3, this.Body4, this.Body5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {


            this.flap(TailL1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(TailR1, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(TailL2, 1F, -0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.flap(TailR2, 1F, 0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.flap(TailL3, 1F, -0.16F, false, -3.0F, 0F, f2, 0.7F);
            this.flap(TailR3, 1F, 0.16F, false, -3.0F, 0F, f2, 0.7F);

            this.swing(TailL1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.swing(TailR1, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);
            this.swing(TailL2, 1F, -0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.swing(TailR2, 1F, 0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.swing(TailL3, 1F, -0.16F, false, -3.0F, 0F, f2, 0.7F);
            this.swing(TailR3, 1F, 0.16F, false, -3.0F, 0F, f2, 0.7F);

            float degreeFin = 0.185F;
            this.flap(FinL1, 0.5F, -degreeFin, false, -1.0f, -0, f2, 0.7F);
            this.flap(FinR1, 0.5F, degreeFin, false, -1.0f, 0, f2, 0.7F);
            this.flap(FinL2, 0.5F, -degreeFin, false, -0.5f, -0, f2, 0.7F);
            this.flap(FinR2, 0.5F, degreeFin, false, -0.5f, 0, f2, 0.7F);
            this.flap(FinL3, 0.5F, -degreeFin, false, 0, -0, f2, 0.7F);
            this.flap(FinR3, 0.5F, degreeFin, false, 0, 0, f2, 0.7F);
            this.flap(FinL4, 0.5F, -degreeFin, false, 0.5F, -0, f2, 0.7F);
            this.flap(FinR4, 0.5F, degreeFin, false, 0.5F, 0, f2, 0.7F);
            this.flap(FinL5, 0.5F, -degreeFin, false, 1.0F, -0, f2, 0.7F);
            this.flap(FinR5, 0.5F, degreeFin, false, 1.0F, 0, f2, 0.7F);
            this.flap(FinL6, 0.5F, -degreeFin, false, 1.5F, -0, f2, 0.7F);
            this.flap(FinR6, 0.5F, degreeFin, false, 1.5F, 0, f2, 0.7F);
            this.flap(FinL7, 0.5F, -degreeFin, false, 2.0F, -0, f2, 0.7F);
            this.flap(FinR7, 0.5F, degreeFin, false, 2.0F, 0, f2, 0.7F);
            this.flap(FinL8, 0.5F, -degreeFin, false, 2.5F, -0, f2, 0.7F);
            this.flap(FinR8, 0.5F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(FinL9, 0.5F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(FinR9, 0.5F, degreeFin, false, 3.0F, 0, f2, 0.7F);
            this.flap(FinL10, 0.5F, -degreeFin, false, 3.5F, -0, f2, 0.7F);
            this.flap(FinR10, 0.5F, degreeFin, false, 3.5F, 0, f2, 0.7F);
            this.flap(FinL11, 0.5F, -degreeFin, false, 4.0F, -0, f2, 0.7F);
            this.flap(FinR11, 0.5F, degreeFin, false, 4.0F, 0, f2, 0.7F);
            this.flap(FinL12, 0.5F, -degreeFin, false, 4.5F, -0, f2, 0.7F);
            this.flap(FinR12, 0.5F, degreeFin, false, 4.5F, 0, f2, 0.7F);
            this.flap(FinL13, 0.5F, -degreeFin, false, 5.0F, -0, f2, 0.7F);
            this.flap(FinR13, 0.5F, degreeFin, false, 5.0F, 0, f2, 0.7F);
            this.flap(FinL14, 0.5F, -degreeFin, false, 5.5F, -0, f2, 0.7F);
            this.flap(FinR14, 0.5F, degreeFin, false, 5.5F, 0, f2, 0.7F);

//            this.walk(finL11, 0.5F, -degreeFin * 0.5F, true, -1.0F, -0.5F, f2, 0.7F);
//            this.walk(finR11, 0.5F, degreeFin * 0.5F, false, -1.0F, 0.5F, f2, 0.7F);
//            this.walk(finL10, 0.5F, -degreeFin * 0.5F, true, -0.5F, -0.5F, f2, 0.7F);
//            this.walk(finR10, 0.5F, degreeFin * 0.5F, false, -0.5F, 0.5F, f2, 0.7F);
//            this.walk(finL9, 0.5F, -degreeFin * 0.5F, true, 0, -0.5F, f2, 0.7F);
//            this.walk(finR9, 0.5F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);
//            this.walk(finL8, 0.5F, -degreeFin * 0.5F, true, 0.5F, -0.5F, f2, 0.7F);
//            this.walk(finR8, 0.5F, degreeFin * 0.5F, false, 0.5F, 0.5F, f2, 0.7F);
//            this.walk(finL7, 0.5F, -degreeFin * 0.5F, true, 1.0F, -0.5F, f2, 0.7F);
//            this.walk(finR7, 0.5F, degreeFin * 0.5F, false, 1.0F, 0.5F, f2, 0.7F);
//            this.walk(finL6, 0.5F, -degreeFin * 0.5F, true, 1.5F, -0.5F, f2, 0.7F);
//            this.walk(finR6, 0.5F, degreeFin * 0.5F, false, 1.5F, 0.5F, f2, 0.7F);
//            this.walk(finL5, 0.5F, -degreeFin * 0.5F, true, 2.0F, -0.5F, f2, 0.7F);
//            this.walk(finR5, 0.5F, degreeFin * 0.5F, false, 2.0F, 0.5F, f2, 0.7F);
//            this.walk(finL4, 0.5F, -degreeFin * 0.5F, true, 2.5F, -0.5F, f2, 0.7F);
//            this.walk(finR4, 0.5F, degreeFin * 0.5F, false, 2.5F, 0.5F, f2, 0.7F);
//            this.walk(finL3, 0.5F, -degreeFin * 0.5F, true, 3.0F, -0.5F, f2, 0.7F);
//            this.walk(finR3, 0.5F, degreeFin * 0.5F, false, 3.0F, 0.5F, f2, 0.7F);
//            this.walk(finL2, 0.5F, -degreeFin * 0.5F, true, 3.5F, -0.5F, f2, 0.7F);
//            this.walk(finR2, 0.5F, degreeFin * 0.5F, false, 3.5F, 0.5F, f2, 0.7F);
//            this.walk(finL1, 0.5F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
//            this.walk(finR1, 0.5F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);
//            this.walk(finL1, 0.5F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
//            this.walk(finR1, 0.5F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);
//            this.walk(finL1, 0.5F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
//            this.walk(finR1, 0.5F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);
//            this.walk(finL1, 0.5F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
//            this.walk(finR1, 0.5F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);


            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.28F, 0.18f, -3, f2, 0.6F);

            if (!e.isInWater()) {
                //this.body.offsetY = 0F;
                this.bob(Root, -speed * 1.5F, 2.5F, false, f2, 1);
                this.walk(AppendageL, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
                this.walk(AppendageR, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            } else {
                if (f3 == 0.0F) {
                    this.bob(Root, -speed, 0.25F, false, f2, 2);
                } else {
                    this.bob(Root, -speed, 0.5F, false, f2, 2);
                }
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTamisiocaris ee = (EntityPrehistoricFloraTamisiocaris) entitylivingbaseIn;

        if (ee.isReallyInWater()) {
            //if (ee.getIsMoving()) {//swimming
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            //}
        }

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTamisiocaris entity = (EntityPrehistoricFloraTamisiocaris) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(AppendageR, AppendageR.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2))*-30), AppendageR.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2))*10), AppendageR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(AppendageR2, AppendageR2.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2-20))*-30), AppendageR2.rotateAngleY + (float) Math.toRadians(0), AppendageR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(AppendageR4, AppendageR4.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2-60))*-30), AppendageR4.rotateAngleY + (float) Math.toRadians(0), AppendageR4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(AppendageL, AppendageL.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2))*30), AppendageL.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2))*-10), AppendageL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(AppendageL2, AppendageL2.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2-20))*30), AppendageL2.rotateAngleY + (float) Math.toRadians(0), AppendageL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(AppendageL3, AppendageL3.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2-40))*30), AppendageL3.rotateAngleY + (float) Math.toRadians(0), AppendageL3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(AppendageL4, AppendageL4.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2-60))*30), AppendageL4.rotateAngleY + (float) Math.toRadians(0), AppendageL4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(AppendageR3, AppendageR3.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360/2-40))*-30), AppendageR3.rotateAngleY + (float) Math.toRadians(0), AppendageR3.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
    }
}
