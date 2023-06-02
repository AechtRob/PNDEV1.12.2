package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnomalocaris;
import net.lepidodendron.entity.EntityPrehistoricFloraCaryosyntrips;
import net.lepidodendron.entity.EntityPrehistoricFloraSilesaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelCaryosyntrips extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer finL1;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer finL10to11;
    private final AdvancedModelRenderer finR10to11;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer finL11;
    private final AdvancedModelRenderer finR11;
    private final AdvancedModelRenderer tailL1;
    private final AdvancedModelRenderer tailL4;
    private final AdvancedModelRenderer tailL2;
    private final AdvancedModelRenderer tailL5;
    private final AdvancedModelRenderer tailL3;
    private final AdvancedModelRenderer tailL6;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer finL7to8;
    private final AdvancedModelRenderer finR7to8;
    private final AdvancedModelRenderer frontfinL1;
    private final AdvancedModelRenderer frontfinR1;
    private final AdvancedModelRenderer frontfinL3;
    private final AdvancedModelRenderer frontfinR3;
    private final AdvancedModelRenderer frontfinL2;
    private final AdvancedModelRenderer frontfinR2;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer appendageL3;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer appendageL4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer appendageR4;
    private final AdvancedModelRenderer cube_r35;

    private ModelAnimator animator;

    public ModelCaryosyntrips() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 28, 47, -0.5F, -0.74F, -7.1F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 14, -1.0F, -0.75F, -7.6F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 23, -2.5F, -2.0F, -8.0F, 5, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 43, -3.0F, -1.25F, -8.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 43, 2.0F, -1.25F, -8.0F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 0, -2.75F, -0.76F, -2.75F, 3, 1, 5, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 32, 29, -2.5F, -1.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.7F, 1.25F, 6.0F);
        this.body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.5236F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 14, -3.75F, -1.0F, -4.0F, 2, 0, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 9, -3.55F, -1.0F, -5.0F, 2, 0, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 7, -3.15F, -1.0F, -6.0F, 2, 0, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.7F, 1.25F, 4.0F);
        this.body1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.5236F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 7, 1.15F, -1.0F, -4.0F, 2, 0, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 14, 1.75F, -1.0F, -2.0F, 2, 0, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 9, 1.55F, -1.0F, -3.0F, 2, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.5F, -1.0F, 0.0F, 7, 2, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.45F, 2.15F, 1.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 37, -5.95F, -1.5F, -1.0F, 2, 0, 2, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 41, -6.25F, -1.5F, 1.0F, 2, 0, 2, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 42, -6.15F, -1.5F, 3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.95F, 2.15F, 7.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 36, -6.35F, -1.4F, -1.0F, 3, 0, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.45F, 2.15F, 9.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 0, -6.65F, -1.2F, -1.0F, 3, 0, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.45F, 2.15F, 3.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.3491F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 41, 4.25F, -1.5F, -1.0F, 2, 0, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 37, 3.95F, -1.5F, -3.0F, 2, 0, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 42, 4.15F, -1.5F, 1.0F, 2, 0, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.45F, 2.15F, 9.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 0, 3.65F, -1.2F, -1.0F, 3, 0, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.95F, 2.15F, 7.0F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 36, 3.35F, -1.4F, -1.0F, 3, 0, 2, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(3.5F, 0.75F, 1.0F);
        this.body2.addChild(finL1);
        this.finL1.cubeList.add(new ModelBox(finL1, 19, 26, -0.7F, 0.0F, -1.0F, 8, 0, 2, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-3.5F, 0.75F, 1.0F);
        this.body2.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 19, 26, -7.3F, 0.0F, -1.0F, 8, 0, 2, 0.0F, true));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(3.5F, 0.75F, 5.0F);
        this.body2.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 33, 11, -0.5F, 0.0F, -1.0F, 7, 0, 2, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-3.5F, 0.75F, 5.0F);
        this.body2.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 33, 11, -6.5F, 0.0F, -1.0F, 7, 0, 2, 0.0F, true));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(3.5F, 0.75F, 7.0F);
        this.body2.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 0, 30, -1.2F, 0.0F, -1.0F, 7, 0, 2, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-3.5F, 0.75F, 7.0F);
        this.body2.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 30, -5.8F, 0.0F, -1.0F, 7, 0, 2, 0.0F, true));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(3.5F, 0.75F, 9.0F);
        this.body2.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 0, 34, -1.1F, 0.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-3.5F, 0.75F, 9.0F);
        this.body2.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 0, 34, -4.9F, 0.0F, -1.0F, 6, 0, 2, 0.0F, true));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(3.5F, 0.75F, 3.0F);
        this.body2.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 25, 7, -0.9F, 0.0F, -1.0F, 8, 0, 2, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-3.5F, 0.75F, 3.0F);
        this.body2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 25, 7, -7.1F, 0.0F, -1.0F, 8, 0, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 19, 19, -2.5F, -1.0F, -1.0F, 5, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.4F, 2.55F, 0.0F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 37, -6.9F, -1.5F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.9F, 2.55F, 1.25F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3491F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 45, -6.8F, -1.4F, -0.25F, 2, 0, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.3F, 2.55F, 2.25F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 46, 0, -7.1F, -1.2F, -0.25F, 2, 0, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.4F, 2.55F, 0.0F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 37, 4.9F, -1.5F, -1.0F, 2, 0, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.9F, 2.55F, 1.25F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.3491F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 43, 45, 4.8F, -1.4F, -0.25F, 2, 0, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.3F, 2.55F, 2.25F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.3491F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 0, 5.1F, -1.2F, -0.25F, 2, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 15, 29, -2.0F, -1.0F, -1.0F, 4, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.9F, 2.75F, -0.75F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.3491F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 46, 17, -6.35F, -1.7F, -0.25F, 2, 0, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.65F, 2.75F, -0.25F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.3491F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 25, 3, -7.0F, -1.4F, 0.25F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(4.4F, 2.75F, 2.0F);
        this.body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.3491F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 46, -7.75F, -1.1F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.65F, 2.75F, 3.0F);
        this.body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 29, -7.8F, -1.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.9F, 2.75F, -0.75F);
        this.body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 17, 4.35F, -1.7F, -0.25F, 2, 0, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-4.65F, 2.75F, 3.0F);
        this.body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.3491F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 29, 5.8F, -1.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.4F, 2.75F, 2.0F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 46, 5.75F, -1.1F, -1.0F, 2, 0, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-3.65F, 2.75F, -0.25F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.3491F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 3, 6.0F, -1.4F, 0.25F, 1, 0, 1, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(2.0F, 0.75F, -0.5F);
        this.body4.addChild(finL8);
        this.finL8.cubeList.add(new ModelBox(finL8, 40, 27, -0.85F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-2.0F, 0.75F, -0.5F);
        this.body4.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 40, 27, -3.15F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(2.0F, 0.75F, 0.5F);
        this.body4.addChild(finL9);
        this.finL9.cubeList.add(new ModelBox(finL9, 41, 43, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-2.0F, 0.75F, 0.5F);
        this.body4.addChild(finR9);
        this.finR9.cubeList.add(new ModelBox(finR9, 41, 43, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(2.0F, 0.75F, 1.5F);
        this.body4.addChild(finL10);
        this.finL10.cubeList.add(new ModelBox(finL10, 42, 5, -1.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-2.0F, 0.75F, 1.5F);
        this.body4.addChild(finR10);
        this.finR10.cubeList.add(new ModelBox(finR10, 42, 5, -1.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.finL10to11 = new AdvancedModelRenderer(this);
        this.finL10to11.setRotationPoint(2.0F, 0.75F, 2.5F);
        this.body4.addChild(finL10to11);
        this.finL10to11.cubeList.add(new ModelBox(finL10to11, 46, 40, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR10to11 = new AdvancedModelRenderer(this);
        this.finR10to11.setRotationPoint(-2.0F, 0.75F, 2.5F);
        this.body4.addChild(finR10to11);
        this.finR10to11.cubeList.add(new ModelBox(finR10to11, 46, 40, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 7, 45, -1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 6, -1.0F, -0.5F, 1.0F, 2, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 28, 29, -0.5F, -0.5F, 3.0F, 1, 0, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(6.0F, 0.65F, 1.0F);
        this.body5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.3491F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 46, 35, -7.8F, 1.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-6.0F, 0.65F, 1.0F);
        this.body5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.3491F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 46, 35, 5.7F, 1.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(1.0F, 0.75F, 0.5F);
        this.body5.addChild(finL11);
        this.finL11.cubeList.add(new ModelBox(finL11, 14, 47, -0.3F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-1.0F, 0.75F, 0.5F);
        this.body5.addChild(finR11);
        this.finR11.cubeList.add(new ModelBox(finR11, 14, 47, -1.7F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.tailL1 = new AdvancedModelRenderer(this);
        this.tailL1.setRotationPoint(1.0F, -0.25F, 0.75F);
        this.body5.addChild(tailL1);
        this.setRotateAngle(tailL1, 0.0F, -0.2618F, -0.1745F);
        this.tailL1.cubeList.add(new ModelBox(tailL1, 19, 14, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailL4 = new AdvancedModelRenderer(this);
        this.tailL4.setRotationPoint(-1.0F, -0.25F, 0.75F);
        this.body5.addChild(tailL4);
        this.setRotateAngle(tailL4, 0.0F, 0.2618F, 0.1745F);
        this.tailL4.cubeList.add(new ModelBox(tailL4, 19, 14, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, true));

        this.tailL2 = new AdvancedModelRenderer(this);
        this.tailL2.setRotationPoint(1.0F, -0.35F, 1.5F);
        this.body5.addChild(tailL2);
        this.setRotateAngle(tailL2, 0.0F, -0.5672F, -0.2618F);
        this.tailL2.cubeList.add(new ModelBox(tailL2, 0, 18, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailL5 = new AdvancedModelRenderer(this);
        this.tailL5.setRotationPoint(-1.0F, -0.35F, 1.5F);
        this.body5.addChild(tailL5);
        this.setRotateAngle(tailL5, 0.0F, 0.5672F, 0.2618F);
        this.tailL5.cubeList.add(new ModelBox(tailL5, 0, 18, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, true));

        this.tailL3 = new AdvancedModelRenderer(this);
        this.tailL3.setRotationPoint(1.0F, -0.35F, 2.5F);
        this.body5.addChild(tailL3);
        this.setRotateAngle(tailL3, 0.1645F, -0.9169F, -0.3366F);
        this.tailL3.cubeList.add(new ModelBox(tailL3, 0, 13, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailL6 = new AdvancedModelRenderer(this);
        this.tailL6.setRotationPoint(-1.0F, -0.35F, 2.5F);
        this.body5.addChild(tailL6);
        this.setRotateAngle(tailL6, 0.1645F, 0.9169F, 0.3366F);
        this.tailL6.cubeList.add(new ModelBox(tailL6, 0, 13, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, true));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(2.5F, 0.75F, 0.0F);
        this.body3.addChild(finL6);
        this.finL6.cubeList.add(new ModelBox(finL6, 34, 19, -0.2F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-2.5F, 0.75F, 0.0F);
        this.body3.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 34, 19, -4.8F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(2.5F, 0.75F, 1.5F);
        this.body3.addChild(finL7);
        this.finL7.cubeList.add(new ModelBox(finL7, 37, 3, -0.7F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-2.5F, 0.75F, 1.5F);
        this.body3.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 37, 3, -3.3F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.finL7to8 = new AdvancedModelRenderer(this);
        this.finL7to8.setRotationPoint(2.5F, 0.75F, 2.5F);
        this.body3.addChild(finL7to8);
        this.finL7to8.cubeList.add(new ModelBox(finL7to8, 35, 35, -1.1F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR7to8 = new AdvancedModelRenderer(this);
        this.finR7to8.setRotationPoint(-2.5F, 0.75F, 2.5F);
        this.body3.addChild(finR7to8);
        this.finR7to8.cubeList.add(new ModelBox(finR7to8, 35, 35, -2.9F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.frontfinL1 = new AdvancedModelRenderer(this);
        this.frontfinL1.setRotationPoint(2.5F, 0.75F, 0.5F);
        this.body1.addChild(frontfinL1);
        this.frontfinL1.cubeList.add(new ModelBox(frontfinL1, 47, 19, -0.85F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR1 = new AdvancedModelRenderer(this);
        this.frontfinR1.setRotationPoint(-2.5F, 0.75F, 0.5F);
        this.body1.addChild(frontfinR1);
        this.frontfinR1.cubeList.add(new ModelBox(frontfinR1, 47, 19, -1.15F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.frontfinL3 = new AdvancedModelRenderer(this);
        this.frontfinL3.setRotationPoint(2.5F, 0.75F, 2.5F);
        this.body1.addChild(frontfinL3);
        this.frontfinL3.cubeList.add(new ModelBox(frontfinL3, 0, 47, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR3 = new AdvancedModelRenderer(this);
        this.frontfinR3.setRotationPoint(-2.5F, 0.75F, 2.5F);
        this.body1.addChild(frontfinR3);
        this.frontfinR3.cubeList.add(new ModelBox(frontfinR3, 0, 47, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.frontfinL2 = new AdvancedModelRenderer(this);
        this.frontfinL2.setRotationPoint(2.5F, 0.75F, 1.5F);
        this.body1.addChild(frontfinL2);
        this.frontfinL2.cubeList.add(new ModelBox(frontfinL2, 47, 2, -0.45F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR2 = new AdvancedModelRenderer(this);
        this.frontfinR2.setRotationPoint(-2.5F, 0.75F, 1.5F);
        this.body1.addChild(frontfinR2);
        this.frontfinR2.cubeList.add(new ModelBox(frontfinR2, 47, 2, -1.55F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(2.0F, -1.5F, -6.0F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, -0.2618F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 29, 42, 2.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 44, 22, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-2.0F, -1.5F, -6.0F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.1745F, 0.2618F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 29, 42, -3.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 44, 22, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.5F, -1.05F, -7.5F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, -0.2618F, 0.0F, 1.5708F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 38, 22, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 7, 6, -0.5F, 0.5F, -2.4F, 1, 1, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, -0.1F, 0.0F);
        this.appendageL.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2618F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.51F, -1.6973F, -2.9209F, 1, 2, 3, -0.001F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(-0.25F, 0.0F, -2.75F);
        this.appendageL.addChild(appendageL2);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 35, 37, -0.24F, -0.01F, -4.0F, 1, 1, 4, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 15, 23, -0.25F, 0.5F, -0.5F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 23, -0.25F, 0.0F, -1.25F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 13, -0.25F, 0.25F, -2.0F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 6, 0, -0.25F, 0.25F, -2.75F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 0, -0.25F, 0.25F, -3.5F, 1, 2, 0, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.25F, -1.05F, -0.3F);
        this.appendageL2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2269F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 13, 36, -0.48F, 0.0128F, -3.8161F, 1, 1, 4, -0.002F, false));

        this.appendageL3 = new AdvancedModelRenderer(this);
        this.appendageL3.setRotationPoint(0.25F, 0.0F, -3.75F);
        this.appendageL2.addChild(appendageL3);
        this.setRotateAngle(appendageL3, 0.0873F, 0.0F, 0.0F);
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 37, -0.51F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 19, 19, -0.5F, 0.25F, -0.85F, 1, 2, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 19, 13, -0.5F, 0.0F, -1.6F, 1, 2, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 18, -0.5F, 0.0F, -2.25F, 1, 2, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 35, 37, -0.5F, 0.75F, -2.85F, 1, 1, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 14, 37, -0.5F, 0.75F, -3.5F, 1, 1, 0, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, 1.0F, 14.5F);
        this.appendageL3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0698F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 35, 0.5F, -2.25F, -18.49F, 1, 1, 4, -0.003F, false));

        this.appendageL4 = new AdvancedModelRenderer(this);
        this.appendageL4.setRotationPoint(0.0F, 0.0F, -4.05F);
        this.appendageL3.addChild(appendageL4);
        this.setRotateAngle(appendageL4, 0.7418F, 0.0F, 0.0F);
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 0, 37, -0.5F, 0.5F, -0.95F, 1, 1, 0, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 29, 36, -0.5F, 0.25F, -1.55F, 1, 1, 0, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 0, 43, -0.48F, 0.01F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.1F, 1.0F, -1.95F);
        this.appendageL4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 1.5708F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 25, 0, -0.6F, -1.05F, 0.0F, 2, 2, 0, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.5F, -1.05F, -7.5F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, -0.2618F, 0.0F, -1.5708F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 38, 22, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 7, 6, -0.5F, 0.5F, -2.4F, 1, 1, 0, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.0F, -0.1F, 0.0F);
        this.appendageR.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2618F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -1.51F, -1.6973F, -2.9209F, 1, 2, 3, -0.001F, true));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(0.25F, 0.0F, -2.75F);
        this.appendageR.addChild(appendageR2);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 35, 37, -0.76F, -0.01F, -4.0F, 1, 1, 4, 0.0F, true));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 15, 23, -0.75F, 0.5F, -0.5F, 1, 2, 0, 0.0F, true));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 23, -0.75F, 0.0F, -1.25F, 1, 2, 0, 0.0F, true));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 13, -0.75F, 0.25F, -2.0F, 1, 2, 0, 0.0F, true));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 6, 0, -0.75F, 0.25F, -2.75F, 1, 2, 0, 0.0F, true));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 0, -0.75F, 0.25F, -3.5F, 1, 2, 0, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.25F, -1.05F, -0.3F);
        this.appendageR2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2269F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 13, 36, -0.52F, 0.0128F, -3.8161F, 1, 1, 4, -0.002F, true));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(-0.25F, 0.0F, -3.75F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 0.0873F, 0.0F, 0.0F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 37, -0.49F, 0.0F, -4.0F, 1, 1, 4, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 19, 19, -0.5F, 0.25F, -0.85F, 1, 2, 0, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 19, 13, -0.5F, 0.0F, -1.6F, 1, 2, 0, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 18, -0.5F, 0.0F, -2.25F, 1, 2, 0, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 35, 37, -0.5F, 0.75F, -2.85F, 1, 1, 0, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 14, 37, -0.5F, 0.75F, -3.5F, 1, 1, 0, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0F, 1.0F, 14.5F);
        this.appendageR3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0698F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 35, -1.5F, -2.25F, -18.49F, 1, 1, 4, -0.003F, true));

        this.appendageR4 = new AdvancedModelRenderer(this);
        this.appendageR4.setRotationPoint(0.0F, 0.0F, -4.05F);
        this.appendageR3.addChild(appendageR4);
        this.setRotateAngle(appendageR4, 0.7418F, 0.0F, 0.0F);
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 0, 37, -0.5F, 0.5F, -0.95F, 1, 1, 0, 0.0F, true));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 29, 36, -0.5F, 0.25F, -1.55F, 1, 1, 0, 0.0F, true));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 0, 43, -0.52F, 0.01F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.1F, 1.0F, -1.95F);
        this.appendageR4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -1.5708F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 25, 0, -1.4F, -1.05F, 0.0F, 2, 2, 0, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.1F;
        this.body.offsetY = 0.12F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(appendageL, -0.4363F, 0.0F, 1.5708F);
        this.setRotateAngle(appendageL3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(appendageL4, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR, -0.4363F, 0.0F, -1.5708F);
        this.setRotateAngle(appendageR3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR4, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0873F, -0.0873F, 0.0873F);
        this.setRotateAngle(body1, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r28, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.0F, 1.5708F, 0.0F);
        this.setRotateAngle(cube_r32, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, -1.5708F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, -0.2618F);
        this.setRotateAngle(eyeR, 0.0F, 0.1745F, 0.2618F);
        this.setRotateAngle(head, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(tailL1, 0.0F, -0.2618F, -0.1745F);
        this.setRotateAngle(tailL2, 0.0F, -0.5672F, -0.2618F);
        this.setRotateAngle(tailL3, 0.1645F, -0.9169F, -0.3366F);
        this.setRotateAngle(tailL4, 0.0F, 0.2618F, 0.1745F);
        this.setRotateAngle(tailL5, 0.0F, 0.5672F, 0.2618F);
        this.setRotateAngle(tailL6, 0.1645F, 0.9169F, 0.3366F);
        this.body.offsetX = -0.F;
        this.body.offsetZ = -0.03F;
        this.body.offsetY = -0.5F;
        this.body.render(0.01f);
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
        //this.resetToDefaultPose();
        this.body.offsetY = -0.1F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }

        EntityPrehistoricFloraCaryosyntrips ee = (EntityPrehistoricFloraCaryosyntrips) e;

        AdvancedModelRenderer[] bodyF = {this.body2, this.body3, this.body4, this.body5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if(ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.walk(appendageL, 0.1F, -0.1F, false, 0f, 0f, f2, 1F);
                this.walk(appendageR, 0.1F, -0.1F, false, 0f, 0f, f2, 1F);
            }

            this.flap(tailL1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(tailL4, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(tailL2, 1F, -0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.flap(tailL5, 1F, 0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.flap(tailL3, 1F, -0.16F, false, -3.0F, 0F, f2, 0.7F);
            this.flap(tailL6, 1F, 0.16F, false, -3.0F, 0F, f2, 0.7F);

            this.swing(tailL1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.swing(tailL4, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);
            this.swing(tailL2, 1F, -0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.swing(tailL5, 1F, 0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.swing(tailL3, 1F, -0.16F, false, -3.0F, 0F, f2, 0.7F);
            this.swing(tailL6, 1F, 0.16F, false, -3.0F, 0F, f2, 0.7F);

            float degreeFin = 0.155F;
            this.flap(finL11, 0.5F, -degreeFin, false, -1.0f, -0, f2, 0.7F);
            this.flap(finR11, 0.5F, degreeFin, false, -1.0f, 0, f2, 0.7F);
            this.flap(finL10, 0.5F, -degreeFin, false, -0.5f, -0, f2, 0.7F);
            this.flap(finR10, 0.5F, degreeFin, false, -0.5f, 0, f2, 0.7F);
            this.flap(finL9, 0.5F, -degreeFin, false, 0, -0, f2, 0.7F);
            this.flap(finR9, 0.5F, degreeFin, false, 0, 0, f2, 0.7F);
            this.flap(finL8, 0.5F, -degreeFin, false, 0.5F, -0, f2, 0.7F);
            this.flap(finR8, 0.5F, degreeFin, false, 0.5F, 0, f2, 0.7F);
            this.flap(finL7, 0.5F, -degreeFin, false, 1.0F, -0, f2, 0.7F);
            this.flap(finR7, 0.5F, degreeFin, false, 1.0F, 0, f2, 0.7F);
            this.flap(finL6, 0.5F, -degreeFin, false, 1.5F, -0, f2, 0.7F);
            this.flap(finR6, 0.5F, degreeFin, false, 1.5F, 0, f2, 0.7F);
            this.flap(finL5, 0.5F, -degreeFin, false, 2.0F, -0, f2, 0.7F);
            this.flap(finR5, 0.5F, degreeFin, false, 2.0F, 0, f2, 0.7F);
            this.flap(finL4, 0.5F, -degreeFin, false, 2.5F, -0, f2, 0.7F);
            this.flap(finR4, 0.5F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(finL3, 0.5F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(finR3, 0.5F, degreeFin, false, 3.0F, 0, f2, 0.7F);
            this.flap(finL2, 0.5F, -degreeFin, false, 3.5F, -0, f2, 0.7F);
            this.flap(finR2, 0.5F, degreeFin, false, 3.5F, 0, f2, 0.7F);
            this.flap(finL1, 0.5F, -degreeFin, false, 4.0F, -0, f2, 0.7F);
            this.flap(finR1, 0.5F, degreeFin, false, 4.0F, 0, f2, 0.7F);

            this.walk(finL11, 0.5F, -degreeFin * 0.5F, true, -1.0F, -0.5F, f2, 0.7F);
            this.walk(finR11, 0.5F, degreeFin * 0.5F, false, -1.0F, 0.5F, f2, 0.7F);
            this.walk(finL10, 0.5F, -degreeFin * 0.5F, true, -0.5F, -0.5F, f2, 0.7F);
            this.walk(finR10, 0.5F, degreeFin * 0.5F, false, -0.5F, 0.5F, f2, 0.7F);
            this.walk(finL9, 0.5F, -degreeFin * 0.5F, true, 0, -0.5F, f2, 0.7F);
            this.walk(finR9, 0.5F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);
            this.walk(finL8, 0.5F, -degreeFin * 0.5F, true, 0.5F, -0.5F, f2, 0.7F);
            this.walk(finR8, 0.5F, degreeFin * 0.5F, false, 0.5F, 0.5F, f2, 0.7F);
            this.walk(finL7, 0.5F, -degreeFin * 0.5F, true, 1.0F, -0.5F, f2, 0.7F);
            this.walk(finR7, 0.5F, degreeFin * 0.5F, false, 1.0F, 0.5F, f2, 0.7F);
            this.walk(finL6, 0.5F, -degreeFin * 0.5F, true, 1.5F, -0.5F, f2, 0.7F);
            this.walk(finR6, 0.5F, degreeFin * 0.5F, false, 1.5F, 0.5F, f2, 0.7F);
            this.walk(finL5, 0.5F, -degreeFin * 0.5F, true, 2.0F, -0.5F, f2, 0.7F);
            this.walk(finR5, 0.5F, degreeFin * 0.5F, false, 2.0F, 0.5F, f2, 0.7F);
            this.walk(finL4, 0.5F, -degreeFin * 0.5F, true, 2.5F, -0.5F, f2, 0.7F);
            this.walk(finR4, 0.5F, degreeFin * 0.5F, false, 2.5F, 0.5F, f2, 0.7F);
            this.walk(finL3, 0.5F, -degreeFin * 0.5F, true, 3.0F, -0.5F, f2, 0.7F);
            this.walk(finR3, 0.5F, degreeFin * 0.5F, false, 3.0F, 0.5F, f2, 0.7F);
            this.walk(finL2, 0.5F, -degreeFin * 0.5F, true, 3.5F, -0.5F, f2, 0.7F);
            this.walk(finR2, 0.5F, degreeFin * 0.5F, false, 3.5F, 0.5F, f2, 0.7F);
            this.walk(finL1, 0.5F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
            this.walk(finR1, 0.5F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);

            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.28F, 0.18f, -3, f2, 0.6F);

            if (!e.isInWater()) {
                //this.body.offsetY = 0F;
                this.bob(body, -speed * 1.5F, 2.5F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.25F, false, f2, 2);
                } else {
                    this.bob(body, -speed, 0.5F, false, f2, 2);
                }
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCaryosyntrips ee = (EntityPrehistoricFloraCaryosyntrips) entitylivingbaseIn;


        //Swimming pose:
        if (!ee.getIsMoving()) { //static in water
            //
        } else {
            //moving in water
            //
        }

       if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaryosyntrips entity = (EntityPrehistoricFloraCaryosyntrips) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-27.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27.5D + (((tickAnim - 6D) / 2D) * (-27.5D-(-27.5D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -27.5D + (((tickAnim - 8D) / 4D) * (12.5D-(-27.5D)));
            yy = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 12.5D + (((tickAnim - 12D) / 6D) * (12.5D-(12.5D)));
            yy = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.5D + (((tickAnim - 18D) / 2D) * (0D-(12.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(appendageL, appendageL.rotateAngleX + (float) Math.toRadians(xx), appendageL.rotateAngleY + (float) Math.toRadians(yy), appendageL.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-25D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -25D + (((tickAnim - 6D) / 2D) * (-25D-(-25D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -25D + (((tickAnim - 8D) / 4D) * (0D-(-25D)));
            yy = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(appendageL4, appendageL4.rotateAngleX + (float) Math.toRadians(xx), appendageL4.rotateAngleY + (float) Math.toRadians(yy), appendageL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-27.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27.5D + (((tickAnim - 6D) / 2D) * (-27.5D-(-27.5D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -27.5D + (((tickAnim - 8D) / 4D) * (12.5D-(-27.5D)));
            yy = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 12.5D + (((tickAnim - 12D) / 6D) * (12.5D-(12.5D)));
            yy = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.5D + (((tickAnim - 18D) / 2D) * (0D-(12.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(appendageR, appendageR.rotateAngleX + (float) Math.toRadians(xx), appendageR.rotateAngleY + (float) Math.toRadians(yy), appendageR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-25D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -25D + (((tickAnim - 6D) / 2D) * (-25D-(-25D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -25D + (((tickAnim - 8D) / 4D) * (0D-(-25D)));
            yy = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(appendageR4, appendageR4.rotateAngleX + (float) Math.toRadians(xx), appendageR4.rotateAngleY + (float) Math.toRadians(yy), appendageR4.rotateAngleZ + (float) Math.toRadians(zz));



    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCaryosyntrips e = (EntityPrehistoricFloraCaryosyntrips) entity;
        animator.update(entity);
    }


}
