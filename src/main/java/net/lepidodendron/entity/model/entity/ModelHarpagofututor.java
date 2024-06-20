package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHarpagofututor extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer immobile;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer immobile2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer immobile3;
    private final AdvancedModelRenderer immobile4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer immobile5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer immobile6;
    private final AdvancedModelRenderer immobile7;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer immobile8;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftPelvic;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightPelvic;
    private final AdvancedModelRenderer cube_r27;

    private ModelAnimator animator;

    public ModelHarpagofututor() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 22.0F, -6.0F);
        this.head.cubeList.add(new ModelBox(head, 13, 40, -2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2225F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 11, -1.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.immobile = new AdvancedModelRenderer(this);
        this.immobile.setRotationPoint(0.0F, -0.325F, -1.1F);
        this.head.addChild(immobile);
        this.immobile.cubeList.add(new ModelBox(immobile, 45, 39, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.001F, false));
        this.immobile.cubeList.add(new ModelBox(immobile, 49, 5, -1.5F, -0.35F, -2.8F, 3, 1, 1, 0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.immobile.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4102F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -1.0F, 0.0F, -4.25F, 2, 1, 1, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 0, -1.5F, 0.0F, -1.4F, 3, 1, 3, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 0, -1.0F, 0.0F, -4.0F, 2, 1, 3, -0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.975F, -0.95F);
        this.immobile.addChild(jaw);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 44, -1.0F, -0.65F, -2.8F, 2, 2, 3, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 42, -1.0F, 0.35F, -4.3F, 2, 1, 2, -0.003F, false));

        this.immobile2 = new AdvancedModelRenderer(this);
        this.immobile2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.immobile.addChild(immobile2);
        this.setRotateAngle(immobile2, 0.3054F, 0.0F, 0.0F);
        this.immobile2.cubeList.add(new ModelBox(immobile2, 48, 25, -1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.immobile2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2487F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 17, -1.0F, -1.0F, -2.5F, 2, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 18, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.001F, false));

        this.immobile3 = new AdvancedModelRenderer(this);
        this.immobile3.setRotationPoint(-1.0F, 0.1F, -4.5F);
        this.immobile.addChild(immobile3);
        this.setRotateAngle(immobile3, -0.3228F, 0.3327F, -0.9187F);
        this.immobile3.cubeList.add(new ModelBox(immobile3, 0, 35, 0.0F, -4.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.immobile4 = new AdvancedModelRenderer(this);
        this.immobile4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.immobile3.addChild(immobile4);
        this.setRotateAngle(immobile4, -1.3454F, -0.0659F, -0.1043F);
        this.immobile4.cubeList.add(new ModelBox(immobile4, 14, 24, 0.0F, -4.0F, 0.0F, 0, 4, 1, 0.0F, false));
        this.immobile4.cubeList.add(new ModelBox(immobile4, 14, 24, -0.05F, -4.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.025F, -3.15F, 0.25F);
        this.immobile4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.025F, -2.25F, 0.25F);
        this.immobile4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.immobile5 = new AdvancedModelRenderer(this);
        this.immobile5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.immobile3.addChild(immobile5);
        this.setRotateAngle(immobile5, -0.3755F, -0.0418F, -0.2725F);
        this.immobile5.cubeList.add(new ModelBox(immobile5, 11, 48, 0.0F, -6.0F, 0.0F, 0, 6, 1, 0.0F, false));
        this.immobile5.cubeList.add(new ModelBox(immobile5, 11, 48, -0.05F, -6.0F, 0.0F, 0, 6, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.025F, -5.2F, 0.75F);
        this.immobile5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.025F, -4.3F, 0.75F);
        this.immobile5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 28, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.025F, -3.35F, 0.75F);
        this.immobile5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 28, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.025F, -2.425F, 0.75F);
        this.immobile5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.025F, -1.5F, 0.75F);
        this.immobile5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 11, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.immobile6 = new AdvancedModelRenderer(this);
        this.immobile6.setRotationPoint(1.0F, 0.1F, -4.5F);
        this.immobile.addChild(immobile6);
        this.setRotateAngle(immobile6, -0.3228F, -0.3327F, 0.9187F);
        this.immobile6.cubeList.add(new ModelBox(immobile6, 0, 35, 0.0F, -4.0F, 0.0F, 0, 4, 1, 0.0F, true));

        this.immobile7 = new AdvancedModelRenderer(this);
        this.immobile7.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.immobile6.addChild(immobile7);
        this.setRotateAngle(immobile7, -1.3454F, 0.0659F, 0.1043F);
        this.immobile7.cubeList.add(new ModelBox(immobile7, 14, 24, 0.0F, -4.0F, 0.0F, 0, 4, 1, 0.0F, true));
        this.immobile7.cubeList.add(new ModelBox(immobile7, 14, 24, 0.05F, -4.0F, 0.0F, 0, 4, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.025F, -3.15F, 0.25F);
        this.immobile7.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.025F, -2.25F, 0.25F);
        this.immobile7.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.immobile8 = new AdvancedModelRenderer(this);
        this.immobile8.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.immobile6.addChild(immobile8);
        this.setRotateAngle(immobile8, -0.3755F, 0.0418F, 0.2725F);
        this.immobile8.cubeList.add(new ModelBox(immobile8, 11, 48, 0.0F, -6.0F, 0.0F, 0, 6, 1, 0.0F, true));
        this.immobile8.cubeList.add(new ModelBox(immobile8, 11, 48, 0.05F, -6.0F, 0.0F, 0, 6, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.025F, -5.2F, 0.75F);
        this.immobile8.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.025F, -4.3F, 0.75F);
        this.immobile8.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 28, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.025F, -3.35F, 0.75F);
        this.immobile8.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 28, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.025F, -2.425F, 0.75F);
        this.immobile8.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.025F, -1.5F, 0.75F);
        this.immobile8.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 11, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(1.75F, 0.3F, 1.5F);
        this.head.addChild(leftPectoral);
        this.setRotateAngle(leftPectoral, 0.0F, 0.7418F, 0.0F);
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 0, 14, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 0, 0, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, false));
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 4, 27, 0.0F, -1.0F, 3.0F, 0, 2, 1, 0.0F, false));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(-1.75F, 0.3F, 1.5F);
        this.head.addChild(rightPectoral);
        this.setRotateAngle(rightPectoral, 0.0F, -0.7418F, 0.0F);
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 0, 14, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, true));
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 0, 0, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, true));
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 4, 27, 0.0F, -1.0F, 3.0F, 0, 2, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 30, 0, -2.0F, -3.0F, 0.0F, 4, 5, 5, 0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -3.0F, 0.0F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1265F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 32, -1.5F, 0.0F, 0.0F, 4, 1, 5, -0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.1F, 4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -2.0F, 0.0F, 4, 5, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 27, 32, 0.0F, -3.0F, 0.0F, 0, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -2.5F, 0.0F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 14, -1.5F, 0.0F, 0.0F, 4, 1, 8, -0.002F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.1F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, -1.5F, 0.0F, 0.0F, 3, 3, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.0F, 7.0F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1527F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 39, 0.0F, -0.9F, -7.0F, 0, 2, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2269F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 28, -1.5F, 0.0F, -6.875F, 3, 2, 7, -0.001F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.9F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 17, 17, -1.0F, 0.0F, -1.0F, 2, 2, 8, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 0.0F, 7.0F);
        this.body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2574F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 11, -1.0F, -0.9F, -7.85F, 0, 2, 8, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.0F, 7.0F);
        this.body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1876F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 6, -2.0F, 0.0F, -8.0F, 2, 2, 8, -0.001F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.9F, 7.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 39, 22, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 30, 22, 0.0F, 0.25F, 0.0F, 0, 1, 8, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 24, 0.0F, -0.75F, 6.0F, 0, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, 0.0F, -0.05F, 8.0F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0F, 6.0F);
        this.body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 43, -0.5F, -0.75F, -6.0F, 0, 1, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.0F, 6.0F);
        this.body5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1484F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 35, -1.0F, 0.0F, -7.0F, 1, 1, 7, -0.001F, false));

        this.leftPelvic = new AdvancedModelRenderer(this);
        this.leftPelvic.setRotationPoint(2.0F, 3.0F, 6.0F);
        this.body2.addChild(leftPelvic);
        this.setRotateAngle(leftPelvic, 0.0F, 0.0F, 0.8727F);
        this.leftPelvic.cubeList.add(new ModelBox(leftPelvic, 17, 5, -0.75F, 0.025F, 2.0F, 1, 0, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftPelvic.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.7854F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 48, 22, -2.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.rightPelvic = new AdvancedModelRenderer(this);
        this.rightPelvic.setRotationPoint(-2.0F, 3.0F, 6.0F);
        this.body2.addChild(rightPelvic);
        this.setRotateAngle(rightPelvic, 0.0F, 0.0F, -0.8727F);
        this.rightPelvic.cubeList.add(new ModelBox(rightPelvic, 17, 5, -0.25F, 0.025F, 2.0F, 1, 0, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightPelvic.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.7854F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 48, 22, 0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    public void renderStaticWall(float f) {
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
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
        //this.root.offsetY = 1.4F;
        //this.root.offsetZ = -0.65F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        float speed = 0.4F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0.2f, f2, 1);

            this.swing(head, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(leftPectoral, (float) (speed ), 0.2F, true, 0, 0, f2, 0.5F);
            this.swing(leftPectoral, (float) (speed), 0.5F, true, 0, 0, f2, 0.5F);
            this.flap(rightPectoral, (float) (speed), 0.2F, true, -3, 0, f2, 0.5F);
            this.swing(rightPectoral, (float) (speed), 0.5F, true, -3, 0, f2, 0.5F);
            this.flap(leftPelvic, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);
            this.flap(rightPelvic, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);

                //this.root.offsetY = 1.25F;
                //this.root.offsetZ = -0.2F;
                this.bob(head, -speed, 2F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }


}